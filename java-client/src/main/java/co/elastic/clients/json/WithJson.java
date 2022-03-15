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

import jakarta.json.stream.JsonParser;

import java.io.InputStream;
import java.io.Reader;

/**
 * An object that can read its state, in whole or part, from JSON.
 */
public interface WithJson<T> {

    /**
     * Sets additional properties values on this object by reading from a JSON input.
     * <p>
     * This is a "partial deserialization": properties that were already set keep their value if they're not present in the JSON input,
     * and properties can also be set after having called this method, including overriding those read from the JSON input.
     *
     * @param input the stream to read from
     * @return this object
     */
    default T withJson(InputStream input) {
        JsonpMapper mapper = SimpleJsonpMapper.INSTANCE_REJECT_UNKNOWN_FIELDS;
        return withJson(mapper.jsonProvider().createParser(input), mapper);
    }

    /**
     * Sets additional properties values on this object by reading from a JSON input.
     * <p>
     * This is a "partial deserialization": properties that were already set keep their value if they're not present in the JSON input,
     * and properties can also be set after having called this method, including overriding those read from the JSON input.
     *
     * @param input the reader to read from
     * @return this object
     */
    default T withJson(Reader input) {
        JsonpMapper mapper = SimpleJsonpMapper.INSTANCE_REJECT_UNKNOWN_FIELDS;
        return withJson(mapper.jsonProvider().createParser(input), mapper);
    }

    /**
     * Sets additional properties values on this object by reading from a JSON input.
     * <p>
     * This is a "partial deserialization": properties that were already set keep their value if they're not present in the JSON input,
     * and properties can also be set after having called this method, including overriding those read from the JSON input.
     * <p>
     * This low level variant of <code>withJson</code> gives full control on the json parser and object mapper. Most of the time
     * using {@link #withJson(Reader)} and {@link #withJson(InputStream)} will be more convenient.
     *
     * @param parser the JSONP parser
     * @param mapper the JSONP mapper used to deserialize values and nested objects
     * @return this object
     */
    T withJson(JsonParser parser, JsonpMapper mapper);
}
