/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.json;

import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonObject;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import jakarta.json.stream.JsonParsingException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class UnionDeserializer<T, M> implements JsonpDeserializer<T> {

    public static class AmbiguousUnionException extends RuntimeException {
        public AmbiguousUnionException(String message) {
            super(message);
        }
    }

    private abstract static class EventHandler<T, M> {
        abstract T deserialize(JsonParser parser, JsonpMapper mapper, Event event, BiFunction<String, M, T> buildFn);
        abstract EnumSet<Event> nativeEvents();
    }

    private static class SingleMemberHandler<T, M> extends EventHandler<T, M> {
        private final JsonpDeserializer<? extends M> deserializer;
        private final String tag;
        // ObjectDeserializers provide the list of fields they know about
        private final Set<String> fields;

        SingleMemberHandler(String tag, JsonpDeserializer<? extends M> deserializer) {
            this(tag, deserializer, null);
        }

        SingleMemberHandler(String tag, JsonpDeserializer<? extends M> deserializer, Set<String> fields) {
            this.deserializer = deserializer;
            this.tag = tag;
            this.fields = fields;
        }

        @Override
        EnumSet<Event> nativeEvents() {
            return deserializer.nativeEvents();
        }

        @Override
        T deserialize(JsonParser parser, JsonpMapper mapper, Event event, BiFunction<String, M, T> buildFn) {
            return buildFn.apply(tag, deserializer.deserialize(parser, mapper, event));
        }
    }

    /**
     * An event handler for value events (string, number, etc) that can try multiple handlers, which are ordered
     * from most specific (e.g. enum) to least specific (e.g. string)
     */
    private static class MultiMemberHandler<T, M> extends EventHandler<T, M> {
        private List<SingleMemberHandler<T, M>> handlers;

        @Override
        EnumSet<Event> nativeEvents() {
            EnumSet<Event> result = EnumSet.noneOf(Event.class);
            for (SingleMemberHandler<T, M> smh: handlers) {
                result.addAll(smh.deserializer.nativeEvents());
            }
            return result;
        }

        @Override
        T deserialize(JsonParser parser, JsonpMapper mapper, Event event, BiFunction<String, M, T> buildFn) {
            RuntimeException exception = null;
            for (EventHandler<T, M> d: handlers) {
                try {
                    return d.deserialize(parser, mapper, event, buildFn);
                } catch(RuntimeException ex) {
                    exception = ex;
                }
            }
            throw new JsonParsingException("Couldn't find a suitable union member deserializer", exception, parser.getLocation());
        }
    }

    public static class Builder<T, M> implements ObjectBuilder<JsonpDeserializer<T>> {

        private final BiFunction<String, M, T> buildFn;

        private final List<UnionDeserializer.SingleMemberHandler<T, M>> objectMembers = new ArrayList<>();
        private final Map<Event, EventHandler<T, M>> otherMembers = new HashMap<>();
        private final boolean allowAmbiguousPrimitive;

        public Builder(BiFunction<String, M, T> buildFn, boolean allowAmbiguities) {
            // If we allow ambiguities, multiple handlers for a given json value event will be allowed
            this.allowAmbiguousPrimitive = allowAmbiguities;
            this.buildFn = buildFn;
        }

        private void addAmbiguousDeserializer(Event e, String tag, JsonpDeserializer<? extends M> deserializer) {
            EventHandler<T, M> m = otherMembers.get(e);
            MultiMemberHandler<T, M> mmh;
            if (m instanceof MultiMemberHandler<?, ?>) {
                mmh = (MultiMemberHandler<T, M>) m;
            } else {
                mmh = new MultiMemberHandler<>();
                mmh.handlers = new ArrayList<>(2);
                mmh.handlers.add((SingleMemberHandler<T, M>) m);
                otherMembers.put(e, mmh);
            }
            mmh.handlers.add(new SingleMemberHandler<>(tag, deserializer));
            // Sort handlers by number of accepted events, which gives their specificity
            mmh.handlers.sort(Comparator.comparingInt(a -> a.deserializer.acceptedEvents().size()));
        }

        private void addMember(Event e, String tag, UnionDeserializer.SingleMemberHandler<T, M> member) {
            if (otherMembers.containsKey(e)) {
                if (!allowAmbiguousPrimitive || e == Event.START_OBJECT || e == Event.START_ARRAY) {
                    throw new AmbiguousUnionException("Union member '" + tag + "' conflicts with other members");
                } else {
                    // Allow ambiguities on value event
                    addAmbiguousDeserializer(e, tag, member.deserializer);
                }
            } else {
                // Note: we accept START_OBJECT here. It can be a user-provided type, and will be used
                // as a fallback if no element of objectMembers matches.
                otherMembers.put(e, member);
            }
        }

        public Builder<T, M> addMember(String tag, JsonpDeserializer<? extends M> deserializer) {

            JsonpDeserializer<?> unwrapped = DelegatingDeserializer.unwrap(deserializer);
            if (unwrapped instanceof ObjectDeserializer) {
                ObjectDeserializer<?> od = (ObjectDeserializer<?>) unwrapped;
                Set<String> allFields = od.fieldNames();
                Set<String> fields = new HashSet<>(allFields); // copy to update
                for (UnionDeserializer.SingleMemberHandler<T, M> member: objectMembers) {
                    // Remove respective fields on both sides to keep specific ones
                    fields.removeAll(member.fields);
                    member.fields.removeAll(allFields);
                }
                UnionDeserializer.SingleMemberHandler<T, M> member = new SingleMemberHandler<>(tag, deserializer, fields);
                objectMembers.add(member);
                if (od.shortcutProperty() != null) {
                    // also add it as a string
                    addMember(Event.VALUE_STRING, tag, member);
                }
            } else {
                UnionDeserializer.SingleMemberHandler<T, M> member = new SingleMemberHandler<>(tag, deserializer);
                for (Event e: deserializer.nativeEvents()) {
                    addMember(e, tag, member);
                }
            }

            return this;
        }

        @Override
        public JsonpDeserializer<T> build() {
            // Check that no object member had all its fields removed
            for (UnionDeserializer.SingleMemberHandler<T, M> member: objectMembers) {
                if (member.fields.isEmpty()) {
                    throw new AmbiguousUnionException("All properties of '" + member.tag + "' also exist in other object members");
                }
            }

            if (objectMembers.size() == 1 && !otherMembers.containsKey(Event.START_OBJECT)) {
                // A single deserializer handles objects: promote it to otherMembers as we don't need property-based disambiguation
                otherMembers.put(Event.START_OBJECT, objectMembers.remove(0));
            }

//            if (objectMembers.size() > 1) {
//                System.out.println("multiple objects in " + buildFn);
//            }

            return new UnionDeserializer<>(objectMembers, otherMembers, buildFn);
        }
    }

    private final BiFunction<String, M, T> buildFn;
    private final EnumSet<Event> nativeEvents;
    private final Map<String, EventHandler<T, M>> objectMembers;
    private final Map<Event, EventHandler<T, M>> otherMembers;
    private final EventHandler<T, M> fallbackObjectMember;

    public UnionDeserializer(
        List<SingleMemberHandler<T, M>> objectMembers,
        Map<Event, EventHandler<T, M>> otherMembers,
        BiFunction<String, M, T> buildFn
    ) {
        this.buildFn = buildFn;

        // Build a map of (field name -> member) for all fields to speed up lookup
        if (objectMembers.isEmpty()) {
            this.objectMembers = Collections.emptyMap();
        } else {
            this.objectMembers = new HashMap<>();
            for (SingleMemberHandler<T, M> member: objectMembers) {
                for (String field: member.fields) {
                    this.objectMembers.put(field, member);
                }
            }
        }

        this.otherMembers = otherMembers;

        this.nativeEvents = EnumSet.noneOf(Event.class);
        for (EventHandler<T, M> member: otherMembers.values()) {
            this.nativeEvents.addAll(member.nativeEvents());
        }

        if (objectMembers.isEmpty()) {
            fallbackObjectMember = null;
        } else {
            fallbackObjectMember = this.otherMembers.remove(Event.START_OBJECT);
            this.nativeEvents.add(Event.START_OBJECT);
        }
    }

    @Override
    public EnumSet<Event> nativeEvents() {
        return nativeEvents;
    }

    @Override
    public EnumSet<Event> acceptedEvents() {
        // In a union we want the real thing
        return nativeEvents;
    }

    @Override
    public T deserialize(JsonParser parser, JsonpMapper mapper) {
        Event event = parser.next();
        JsonpUtils.ensureAccepts(this, parser, event);
        return deserialize(parser, mapper, event);
    }

    @Override
    public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
        EventHandler<T, M> member = otherMembers.get(event);

        if (member == null && event == Event.START_OBJECT && !objectMembers.isEmpty()) {
            // Parse as an object to find matching field names
            JsonObject object = parser.getObject();

            for (String field: object.keySet()) {
                member = objectMembers.get(field);
                if (member != null) {
                    break;
                }
            }

            if (member == null) {
                member = fallbackObjectMember;
            }

            if (member != null) {
                // Traverse the object we have inspected
                parser = JsonpUtils.objectParser(object, mapper);
                event = parser.next();
            }
        }

        if (member == null) {
            throw new JsonParsingException("Cannot determine what union member to deserialize", parser.getLocation());
        }

        return member.deserialize(parser, mapper, event, buildFn);
    }
}
