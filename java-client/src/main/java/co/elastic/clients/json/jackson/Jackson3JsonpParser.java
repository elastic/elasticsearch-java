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

package co.elastic.clients.json.jackson;

import co.elastic.clients.json.BufferingJsonParser;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.LookAheadJsonParser;
import co.elastic.clients.json.UnexpectedJsonEventException;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonLocation;
import jakarta.json.stream.JsonParsingException;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.core.JsonToken;
import tools.jackson.core.exc.StreamReadException;
import tools.jackson.core.util.JsonParserSequence;
import tools.jackson.databind.util.TokenBuffer;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

/**
 * A JSONP parser implementation on top of Jackson.
 * <p>
 * <b>Warning:</b> this implementation isn't fully compliant with the JSONP specification: calling
 * {@link #hasNext()}
 * moves forward the underlying Jackson parser as Jackson doesn't provide an equivalent method. This means
 * no value
 * getter method (e.g. {@link #getInt()} or {@link #getString()} should be called until the next call to
 * {@link #next()}.
 * Such calls will throw an {@code IllegalStateException}.
 */
public class Jackson3JsonpParser implements LookAheadJsonParser, BufferingJsonParser {

    private final JsonParser parser;
    private final Jackson3JsonpMapper mapper;

    private boolean hasNextWasCalled = false;

    private static final EnumMap<JsonToken, Event> tokenToEvent;

    static {
        tokenToEvent = new EnumMap<>(JsonToken.class);
        tokenToEvent.put(JsonToken.END_ARRAY, Event.END_ARRAY);
        tokenToEvent.put(JsonToken.END_OBJECT, Event.END_OBJECT);
        tokenToEvent.put(JsonToken.PROPERTY_NAME, Event.KEY_NAME);
        tokenToEvent.put(JsonToken.START_ARRAY, Event.START_ARRAY);
        tokenToEvent.put(JsonToken.START_OBJECT, Event.START_OBJECT);
        tokenToEvent.put(JsonToken.VALUE_FALSE, Event.VALUE_FALSE);
        tokenToEvent.put(JsonToken.VALUE_NULL, Event.VALUE_NULL);
        tokenToEvent.put(JsonToken.VALUE_NUMBER_FLOAT, Event.VALUE_NUMBER);
        tokenToEvent.put(JsonToken.VALUE_NUMBER_INT, Event.VALUE_NUMBER);
        tokenToEvent.put(JsonToken.VALUE_STRING, Event.VALUE_STRING);
        tokenToEvent.put(JsonToken.VALUE_TRUE, Event.VALUE_TRUE);

        // No equivalent for
        // - VALUE_EMBEDDED_OBJECT
        // - NOT_AVAILABLE
    }

    public Jackson3JsonpParser(JsonParser parser, Jackson3JsonpMapper mapper) {
        this.parser = parser;
        this.mapper = mapper;
    }

    /**
     * Returns the underlying Jackson parser.
     */
    public JsonParser jacksonParser() {
        return this.parser;
    }

    private JsonParsingException convertException(StreamReadException ex) {
        return new JsonParsingException("Jackson exception: " + ex.getMessage(), ex, getLocation());
    }

    private JsonToken fetchNextToken() {
        try {
            return parser.nextToken();
        } catch (StreamReadException e) {
            throw convertException(e);
        }
    }

    private void ensureTokenIsCurrent() {
        if (hasNextWasCalled) {
            throw new IllegalStateException("Cannot get event data as parser as already been moved to the " +
                                            "next event");
        }
    }

    @Override
    public boolean hasNext() {
        if (hasNextWasCalled) {
            return parser.currentToken() != null;
        } else {
            hasNextWasCalled = true;
            return fetchNextToken() != null;
        }
    }

    @Override
    public Event next() {
        JsonToken token;
        if (hasNextWasCalled) {
            token = parser.currentToken();
            hasNextWasCalled = false;
        } else token = fetchNextToken();

        if (token == null) {
            throw new NoSuchElementException();
        }

        Event result = tokenToEvent.get(token);
        if (result == null) {
            throw new JsonParsingException("Unsupported Jackson event type '" + token + "'", getLocation());
        }

        return result;
    }

    @Override
    public String getString() {
        ensureTokenIsCurrent();
        return parser.getValueAsString();
    }

    @Override
    public boolean isIntegralNumber() {
        ensureTokenIsCurrent();
        return parser.isExpectedNumberIntToken();
    }

    @Override
    public int getInt() {
        ensureTokenIsCurrent();
        return parser.getIntValue();
    }

    @Override
    public long getLong() {
        ensureTokenIsCurrent();
        return parser.getLongValue();
    }

    @Override
    public BigDecimal getBigDecimal() {
        ensureTokenIsCurrent();
        return parser.getDecimalValue();
    }

    @Override
    public JsonLocation getLocation() {
        return new Jackson3JsonpLocation(parser.currentLocation());
    }

    @Override
    public void close() {
        parser.close();
    }

    private Jackson3JsonValueParser valueParser;

    @Override
    public JsonObject getObject() {
        ensureTokenIsCurrent();
        if (parser.currentToken() != JsonToken.START_OBJECT) {
            throw new IllegalStateException("Unexpected event '" + parser.currentToken() +
                                            "' at " + parser.currentTokenLocation());
        }
        if (valueParser == null) {
            valueParser = new Jackson3JsonValueParser();
        }
        return valueParser.parseObject(parser);
    }

    @Override
    public JsonArray getArray() {
        ensureTokenIsCurrent();
        if (valueParser == null) {
            valueParser = new Jackson3JsonValueParser();
        }
        if (parser.currentToken() != JsonToken.START_ARRAY) {
            throw new IllegalStateException("Unexpected event '" + parser.currentToken() +
                                            "' at " + parser.currentTokenLocation());
        }
        return valueParser.parseArray(parser);
    }

    @Override
    public JsonValue getValue() {
        ensureTokenIsCurrent();
        if (valueParser == null) {
            valueParser = new Jackson3JsonValueParser();
        }
        return valueParser.parseValue(parser);
    }

    @Override
    public void skipObject() {
        ensureTokenIsCurrent();
        if (parser.currentToken() != JsonToken.START_OBJECT) {
            return;
        }

        int depth = 1;
        JsonToken token;
        do {
            token = parser.nextToken();
            switch (token) {
                case START_OBJECT:
                    depth++;
                    break;
                case END_OBJECT:
                    depth--;
                    break;
            }
        } while (!(token == JsonToken.END_OBJECT && depth == 0));
    }

    @Override
    public void skipArray() {
        ensureTokenIsCurrent();
        if (parser.currentToken() != JsonToken.START_ARRAY) {
            return;
        }

        int depth = 1;
        JsonToken token;
        do {
            token = parser.nextToken();
            switch (token) {
                case START_ARRAY:
                    depth++;
                    break;
                case END_ARRAY:
                    depth--;
                    break;
            }
        } while (!(token == JsonToken.END_ARRAY && depth == 0));
    }

    @Override
    public Stream<Map.Entry<String, JsonValue>> getObjectStream() {
        return getObject().entrySet().stream();
    }

    @Override
    public Stream<JsonValue> getArrayStream() {
        return getArray().stream();
    }

    /**
     * Not implemented.
     */
    @Override
    public Stream<JsonValue> getValueStream() {
        return LookAheadJsonParser.super.getValueStream();
    }

    //----- Look ahead methods

    public Map.Entry<String, jakarta.json.stream.JsonParser> lookAheadFieldValue(String name,
                                                                                 String defaultValue) {

        TokenBuffer tb = TokenBuffer.forBuffering(this.parser, this.parser.objectReadContext());

        try {
            // The resulting parser must contain the full object, including START_EVENT
            tb.copyCurrentEvent(parser);
            while (parser.nextToken() != JsonToken.END_OBJECT) {

                expectEvent(JsonToken.PROPERTY_NAME);
                // Do not copy current event here, each branch will take care of it

                String fieldName = parser.currentName();
                if (fieldName.equals(name)) {
                    // Found
                    tb.copyCurrentEvent(parser);

                    String result = null;
                    switch (parser.nextToken()) {
                        case VALUE_STRING:
                            result = parser.getText();
                            break;
                        // Handle booleans promoted to enums
                        case VALUE_TRUE:
                            result = "true";
                            break;
                        case VALUE_FALSE:
                            result = "false";
                            break;
                        default:
                            expectEvent(JsonToken.VALUE_STRING);
                    }

                    tb.copyCurrentEvent(parser);

                    return new AbstractMap.SimpleImmutableEntry<>(
                        result,
                        new Jackson3JsonpParser(
                            JsonParserSequence.createFlattened(false, tb.asParser(), parser),
                            mapper
                        )
                    );
                } else {
                    tb.copyCurrentStructure(parser);
                }
            }
            // Copy ending END_OBJECT
            tb.copyCurrentEvent(parser);
        } catch (JacksonException e) {
            throw Jackson3Utils.convertException(e);
        }

        // Field not found
        return new AbstractMap.SimpleImmutableEntry<>(
            defaultValue,
            new Jackson3JsonpParser(
                JsonParserSequence.createFlattened(false, tb.asParser(), parser),
                mapper
            )
        );
    }

    @Override
    public <Variant> Map.Entry<Variant, jakarta.json.stream.JsonParser> findVariant(Map<String, Variant> variants) {
        // We're on a START_OBJECT event
        TokenBuffer tb = TokenBuffer.forBuffering(parser, parser.objectReadContext());

        try {
            if (parser.currentToken() != JsonToken.START_OBJECT) {
                // Primitive value or array
                tb.copyCurrentStructure(parser);
            } else {
                // The resulting parser must contain the full object, including START_EVENT
                tb.copyCurrentEvent(parser);
                while (parser.nextToken() != JsonToken.END_OBJECT) {

                    expectEvent(JsonToken.PROPERTY_NAME);
                    String fieldName = parser.currentName();

                    Variant variant = variants.get(fieldName);
                    if (variant != null) {
                        tb.copyCurrentEvent(parser);
                        return new AbstractMap.SimpleImmutableEntry<>(
                            variant,
                            new Jackson3JsonpParser(
                                JsonParserSequence.createFlattened(false, tb.asParser(), parser),
                                mapper
                            )
                        );
                    } else {
                        tb.copyCurrentStructure(parser);
                    }
                }
                // Copy ending END_OBJECT
                tb.copyCurrentEvent(parser);
            }
        } catch (JacksonException e) {
            throw Jackson3Utils.convertException(e);
        }

        // No variant found: return the buffered parser and let the caller decide what to do.
        return new AbstractMap.SimpleImmutableEntry<>(
            null,
            new Jackson3JsonpParser(
                JsonParserSequence.createFlattened(false, tb.asParser(), parser),
                mapper
            )
        );
    }

    private void expectNextEvent(JsonToken expected) throws IOException {
        JsonToken event = parser.nextToken();
        if (event != expected) {
            throw new UnexpectedJsonEventException(this, tokenToEvent.get(event), tokenToEvent.get(expected));
        }
    }

    private void expectEvent(JsonToken expected) {
        JsonToken event = parser.currentToken();
        if (event != expected) {
            throw new UnexpectedJsonEventException(this, tokenToEvent.get(event), tokenToEvent.get(expected));
        }
    }

    //----- Buffering methods

    @Override
    public JsonData getJsonData() {
        try {
            TokenBuffer buffer = TokenBuffer.forBuffering(this.parser, this.parser.objectReadContext());
            buffer.copyCurrentStructure(parser);
            return new Jackson3JsonBuffer(buffer, mapper);
        } catch (JacksonException e) {
            throw Jackson3Utils.convertException(e);
        }
    }
}

