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

import co.elastic.clients.util.AllowForbiddenApis;
import jakarta.json.JsonException;
import jakarta.json.JsonObject;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonLocation;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import jakarta.json.stream.JsonParsingException;

import javax.annotation.Nullable;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.AbstractMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class JsonpUtils {

    private static JsonProvider systemJsonProvider = null;

    /**
     * Get a <code>JsonProvider</code> instance. This method first calls the standard `JsonProvider.provider()` that is based on
     * the current thread's context classloader, and in case of failure tries to find a provider in other classloaders. The
     * value is cached for subsequent calls.
     */
    public static JsonProvider provider() {
        JsonProvider result = systemJsonProvider;
        if (result == null) {
            result = findProvider();
            systemJsonProvider = result;
        }
        return result;
    }

    @AllowForbiddenApis("Implementation of the JsonProvider lookup")
    static JsonProvider findProvider() {
        RuntimeException exception;
        try {
            return JsonProvider.provider();
        } catch(RuntimeException re) {
            exception = re;
        }

        // Not found from the thread's context classloader. Try from our own classloader which should be a descendant of an app-server
        // classloader if any, and if it still fails try from the SPI class which hopefully will be close to the implementation.

        try {
            return ServiceLoader.load(JsonProvider.class, JsonpUtils.class.getClassLoader()).iterator().next();
        } catch(Exception e) {
            // ignore
        }

        try {
            return ServiceLoader.load(JsonProvider.class, JsonProvider.class.getClassLoader()).iterator().next();
        } catch(Exception e) {
            // ignore
        }

        throw new JsonException("Unable to get a JsonProvider. Check your classpath or thread context classloader.", exception);
    }

    /**
     * Advances the parser to the next event and checks that this even is the expected one.
     *
     * @return the expected event
     *
     * @throws jakarta.json.JsonException if an i/o error occurs (IOException would be cause of JsonException)
     * @throws JsonParsingException if the event is not the expected one, or if the parser encounters invalid
     *         JSON when advancing to next state.
     * @throws java.util.NoSuchElementException if there are no more parsing states.
     */
    public static JsonParser.Event expectNextEvent(JsonParser parser, JsonParser.Event expected) {
        JsonParser.Event event = parser.next();
        expectEvent(parser, expected, event);
        return event;
    }

    public static void expectEvent(JsonParser parser, JsonParser.Event expected, JsonParser.Event event) {
        if (event != expected) {
            throw new UnexpectedJsonEventException(parser, event, expected);
        }
    }

    public static String expectKeyName(JsonParser parser, JsonParser.Event event) {
        JsonpUtils.expectEvent(parser, JsonParser.Event.KEY_NAME, event);
        return parser.getString();
    }

    public static void ensureAccepts(JsonpDeserializer<?> deserializer, JsonParser parser, JsonParser.Event event) {
        if (!deserializer.acceptedEvents().contains(event)) {
            throw new UnexpectedJsonEventException(parser, event, deserializer.acceptedEvents());
        }
    }

    public static void ensureCustomVariantsAllowed(JsonParser parser, JsonpMapper mapper) {
        if (mapper.attribute(JsonpMapperFeatures.FORBID_CUSTOM_VARIANTS, false)) {
            throw new JsonpMappingException("Json mapper configuration forbids custom variants", parser.getLocation());
        }
    }

    /**
     * Skip the value at the next position of the parser.
     */
    public static void skipValue(JsonParser parser) {
        skipValue(parser, parser.next());
    }

    /**
     * Skip the value at the current position of the parser.
     */
    public static void skipValue(JsonParser parser, Event event) {
        switch(event) {
            case START_OBJECT:
                parser.skipObject();
                break;

            case START_ARRAY:
                parser.skipArray();
                break;

            default:
                // Not a structure, no additional skipping needed
                break;
        }
    }

    /**
     * Copy the JSON value at the current parser location to a JSON generator.
     */
    public static void copy(JsonParser parser, JsonGenerator generator) {
        copy(parser, generator, parser.next());
    }

    /**
     * Copy the JSON value at the current parser location to a JSON generator.
     */
    public static void copy(JsonParser parser, JsonGenerator generator, JsonParser.Event event) {

        switch (event) {
            case START_OBJECT:
                generator.writeStartObject();
                while ((event = parser.next()) != Event.END_OBJECT) {
                    expectEvent(parser, Event.KEY_NAME, event);
                    generator.writeKey(parser.getString());
                    copy(parser, generator, parser.next());
                }
                generator.writeEnd();
                break;

            case START_ARRAY:
                generator.writeStartArray();
                while ((event = parser.next()) != Event.END_ARRAY) {
                    copy(parser, generator, event);
                }
                generator.writeEnd();
                break;

            case VALUE_STRING:
                generator.write(parser.getString());
                break;

            case VALUE_FALSE:
                generator.write(false);
                break;

            case VALUE_TRUE:
                generator.write(true);
                break;

            case VALUE_NULL:
                generator.writeNull();
                break;

            case VALUE_NUMBER:
                if (parser.isIntegralNumber()) {
                    generator.write(parser.getLong());
                } else {
                    generator.write(parser.getBigDecimal());
                }
                break;

            default:
                throw new UnexpectedJsonEventException(parser, event);
        }
    }

    public static <T> void serialize(T value, JsonGenerator generator, @Nullable JsonpSerializer<T> serializer, JsonpMapper mapper) {
        if (serializer != null) {
            serializer.serialize(value, generator, mapper);
        } else if (value instanceof JsonpSerializable) {
            ((JsonpSerializable) value).serialize(generator, mapper);
        } else {
            mapper.serialize(value, generator);
        }
    }

    /**
     * Looks ahead a field value in the Json object from the upcoming object in a parser, which should be on the
     * START_OBJECT event.
     * <p>
     * Returns a pair containing that value and a parser that should be used to actually parse the object
     * (the object has been consumed from the original one).
     */
    public static Map.Entry<String, JsonParser> lookAheadFieldValue(
        String name, String defaultValue, JsonParser parser, JsonpMapper mapper
    ) {
        JsonLocation location = parser.getLocation();

        if (parser instanceof LookAheadJsonParser) {
            // Fast buffered path
            Map.Entry<String, JsonParser> result = ((LookAheadJsonParser) parser).lookAheadFieldValue(name, defaultValue);
            if (result.getKey() == null) {
                throw new JsonpMappingException("Property '" + name + "' not found", location);
            }
            return result;

        } else {
            // Unbuffered path: parse the object into a JsonObject, then extract the value and parse it again
            JsonObject object = parser.getObject();
            String result = object.getString(name, null);

            if (result == null) {
                result = defaultValue;
            }

            if (result == null) {
                throw new JsonpMappingException("Property '" + name + "' not found", location);
            }

            JsonParser newParser = objectParser(object, mapper);

            // Pin location to the start of the look ahead, as the new parser will return locations in its own buffer
            newParser = new DelegatingJsonParser(newParser) {
                @Override
                public JsonLocation getLocation() {
                    return new JsonLocationImpl(location.getLineNumber(), location.getColumnNumber(), location.getStreamOffset()) {
                        @Override
                        public String toString() {
                            return "(in object at " + super.toString().substring(1);
                        }
                    };
                }
            };

            return new AbstractMap.SimpleImmutableEntry<>(result, newParser);
        }
    }

    /**
     * Create a parser that traverses a JSON object
     */
    public static JsonParser objectParser(JsonObject object, JsonpMapper mapper) {
        // FIXME: we should have used createParser(object), but this doesn't work as it creates a
        // org.glassfish.json.JsonStructureParser that doesn't implement the JsonP 1.0.1 features, in particular
        // parser.getObject(). So deserializing recursive internally-tagged union would fail with UnsupportedOperationException
        // While glassfish has this issue or until we write our own, we roundtrip through a string.

        String strObject = object.toString();
        return mapper.jsonProvider().createParser(new StringReader(strObject));
    }

    public static String toString(JsonValue value) {
        switch(value.getValueType()) {
            case OBJECT:
                throw new IllegalArgumentException("Json objects cannot be used as string");

            case ARRAY:
                return value.asJsonArray().stream()
                    .map(JsonpUtils::toString)
                    .collect(Collectors.joining(","));

            case STRING:
                return ((JsonString)value).getString();

            case TRUE:
                return "true";

            case FALSE:
                return "false";

            case NULL:
                return "null";

            case NUMBER:
                return value.toString();

            default:
                throw new IllegalArgumentException("Unknown JSON value type: '" + value + "'");
        }
    }

    public static void serializeDoubleOrNull(JsonGenerator generator, double value, double defaultValue) {
        if (!Double.isFinite(value)) {
            generator.writeNull();
        } else {
            generator.write(value);
        }
    }

    public static void serializeIntOrNull(JsonGenerator generator, int value, int defaultValue) {
        if (value == defaultValue && (defaultValue == Integer.MAX_VALUE || defaultValue == Integer.MIN_VALUE)) {
            generator.writeNull();
        } else {
            generator.write(value);
        }
    }

    /**
     * Renders a <code>JsonpSerializable</code> as a string by serializing it to JSON, prefixed by the class name. Any object of an
     * application-specific class in the object graph is rendered using that object's <code>toString()</code> representation as a JSON
     * string value.
     * <p>
     * The size of the string is limited to {@link #maxToStringLength()}.
     *
     * @see #maxToStringLength()
     */
    public static String toString(JsonpSerializable value) {
        StringBuilder sb = new StringBuilder(value.getClass().getSimpleName()).append(": ");
        return toString(value, ToStringMapper.INSTANCE, sb).toString();
    }

    /**
     * Set the maximum length of the JSON representation of a <code>JsonpSerializable</code> in the result of its <code>toString()</code>
     * method. The default is 10k characters.
     */
    public static void maxToStringLength(int length) {
        MAX_TO_STRING_LENGTH = length;
    }

    /**
     * Get the maximum length of the JSON representation of a <code>JsonpSerializable</code> in the result of its <code>toString()</code>
     * method. The default is 10k characters.
     */
    public static int maxToStringLength() {
        return MAX_TO_STRING_LENGTH;
    }

    /**
     * @deprecated use {@link #maxToStringLength(int)}
     */
    @Deprecated
    public static int MAX_TO_STRING_LENGTH = 10000;

    private static class ToStringTooLongException extends RuntimeException {
    }

    /**
     * Renders a <code>JsonpSerializable</code> as a string in a destination <code>StringBuilder</code>by serializing it to JSON.
     * <p>
     * The size of the string is limited to {@link #maxToStringLength()}.
     *
     * @return the <code>dest</code> parameter, for chaining.
     * @see #toString(JsonpSerializable)
     * @see #maxToStringLength()
     */
    public static StringBuilder toString(JsonpSerializable value, JsonpMapper mapper, StringBuilder dest) {
        Writer writer = new Writer() {
            int length = 0;
            @Override
            public void write(char[] cbuf, int off, int len) {
                int max = maxToStringLength();
                length += len;
                if (length > max) {
                    dest.append(cbuf, off, len - (length - max));
                    dest.append("...");
                    throw new ToStringTooLongException();
                } else {
                    dest.append(cbuf, off, len);
                }
            }

            @Override
            public void flush() {
            }

            @Override
            public void close() {
            }
        };

        try(JsonGenerator generator = mapper.jsonProvider().createGenerator(writer)) {
            value.serialize(generator, mapper);
        } catch (ToStringTooLongException e) {
            // Ignore
        }
        return dest;
    }

    public static String toJsonString(JsonpSerializable value, JsonpMapper mapper) {
        StringWriter writer = new StringWriter();
        JsonGenerator generator = mapper.jsonProvider().createGenerator(writer);
        value.serialize(generator, mapper);
        generator.close();
        return writer.toString();
    }

    /**
     * Renders a <code>JsonpSerializable</code> as a string in a destination <code>StringBuilder</code>by serializing it to JSON.
     * Any object of an application-specific class in the object graph is rendered using that object's <code>toString()</code>
     * representation as a JSON string value.
     * <p>
     * The size of the string is limited to {@link #maxToStringLength()}.
     *
     * @return the <code>dest</code> parameter, for chaining.
     * @see #toString(JsonpSerializable)
     * @see #maxToStringLength()
     */
    public static StringBuilder toString(JsonpSerializable value, StringBuilder dest) {
        return toString(value, ToStringMapper.INSTANCE, dest);
    }
}
