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

import com.fasterxml.jackson.core.JsonToken;

import jakarta.json.stream.JsonLocation;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.NoSuchElementException;

public class JsonpJacksonParser implements JsonParser {

    private com.fasterxml.jackson.core.JsonParser parser;

    private JsonToken nextToken;
    private boolean hadFirstToken = false;

    private static final EnumMap<JsonToken, Event> tokenToEvent;

    static {
        tokenToEvent = new EnumMap<>(JsonToken.class);
        tokenToEvent.put(JsonToken.END_ARRAY, Event.END_ARRAY);
        tokenToEvent.put(JsonToken.END_OBJECT, Event.END_OBJECT);
        tokenToEvent.put(JsonToken.FIELD_NAME, Event.KEY_NAME);
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

    private static class JsonPJacksonLocation implements JsonLocation {

        private final com.fasterxml.jackson.core.JsonLocation location;

        JsonPJacksonLocation(com.fasterxml.jackson.core.JsonLocation location) {
            this.location = location;
        }

        @Override
        public long getLineNumber() {
            return location.getLineNr();
        }

        @Override
        public long getColumnNumber() {
            return location.getColumnNr();
        }

        @Override
        public long getStreamOffset() {
            long charOffset = location.getCharOffset();
            return charOffset == -1 ? location.getByteOffset() : charOffset;
        }
    }


    private JsonParsingException convertException(IOException ioe) {
        return new JsonParsingException("Jackson exception", ioe, getLocation());
    }

    private void fetchNextToken() {
        try {
            nextToken = parser.nextToken();
        } catch(IOException e) {
            throw convertException(e);
        }
    }

    @Override
    public boolean hasNext() {
        if (!hadFirstToken) {
            hadFirstToken = true;
            fetchNextToken();
        }
        return nextToken != null;
    }

    @Override
    public Event next() {
        if (nextToken == null) {
            throw new NoSuchElementException();
        }

        Event result = tokenToEvent.get(nextToken);
        if (result == null) {
            throw new JsonParsingException("Unsupported Jackson event type "+ nextToken.toString(), getLocation());
        }

        fetchNextToken();
        return result;
    }

    @Override
    public String getString() {
        try {
            return parser.getValueAsString();
        } catch (IOException e) {
            throw convertException(e);
        }
    }

    @Override
    public boolean isIntegralNumber() {
        return parser.isExpectedNumberIntToken();
    }

    @Override
    public int getInt() {
        try {
            return parser.getIntValue();
        } catch (IOException e) {
            throw convertException(e);
        }
    }

    @Override
    public long getLong() {
        try {
            return parser.getLongValue();
        } catch (IOException e) {
            throw convertException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal() {
        try {
            return parser.getDecimalValue();
        } catch (IOException e) {
            throw convertException(e);
        }
    }

    @Override
    public JsonLocation getLocation() {
        return new JsonPJacksonLocation(parser.getCurrentLocation());
    }

    @Override
    public void close() {
        try {
            parser.close();
        } catch (IOException e) {
            throw convertException(e);
        }
    }
}
