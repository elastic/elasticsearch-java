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

import jakarta.json.stream.JsonLocation;

/**
 * Translate a Jackson location to a JSONP location.
 */
public class JacksonJsonpLocation implements JsonLocation {

    private final com.fasterxml.jackson.core.JsonLocation location;

    JacksonJsonpLocation(com.fasterxml.jackson.core.JsonLocation location) {
        this.location = location;
    }

    JacksonJsonpLocation(com.fasterxml.jackson.core.JsonParser parser) {
        this(parser.getTokenLocation());
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

    @Override
    public String toString() {
        return "(line no="+location.getLineNr()+", column no="+location.getColumnNr()+", offset="+ location.getCharOffset() +")";
    }
}
