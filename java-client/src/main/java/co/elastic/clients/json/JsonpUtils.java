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

import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import javax.json.stream.JsonParsingException;

public class JsonpUtils {

    /**
     * Advances the parser to the next event and checks that this even is the expected one.
     *
     * @return the expected event
     *
     * @throws javax.json.JsonException if an i/o error occurs (IOException would be cause of JsonException)
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

    public static void consumeValue(JsonParser parser) {
        consumeValue(parser, parser.next());
    }

    public static void consumeValue(JsonParser parser, Event event) {
        switch(event) {
            case VALUE_NULL:
            case VALUE_TRUE:
            case VALUE_FALSE:
            case VALUE_NUMBER:
            case VALUE_STRING:
                break;

            case START_ARRAY: {
                Event next;
                while ((next = parser.next()) != Event.END_ARRAY) {
                    consumeValue(parser, next);
                }
                break;
            }

            case START_OBJECT: {
                Event next;
                while ((next = parser.next()) != Event.END_OBJECT) {
                    expectEvent(parser, Event.KEY_NAME, event);
                    consumeValue(parser, parser.next());
                }
                break;
            }

            default:
                throw new UnexpectedJsonEventException(parser, event);
        }
    }
}
