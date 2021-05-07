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

import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonReaderFactory;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.spi.JsonProvider;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParserFactory;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

public class JacksonJsonProvider extends JsonProvider {

    private static class JacksonJsonParserFactory implements JsonParserFactory {
        @Override
        public JsonParser createParser(Reader reader) {
            return null;
        }

        @Override
        public JsonParser createParser(InputStream in) {
            return null;
        }

        @Override
        public JsonParser createParser(InputStream in, Charset charset) {
            return null;
        }

        @Override
        public JsonParser createParser(JsonObject obj) {
            return null;
        }

        @Override
        public JsonParser createParser(JsonArray array) {
            return null;
        }

        @Override
        public Map<String, ?> getConfigInUse() {
            return null;
        }
    }

    private static class JacksonJsonWriterFactory implements JsonWriterFactory {
        @Override
        public JsonWriter createWriter(Writer writer) {
            return null;
        }

        @Override
        public JsonWriter createWriter(OutputStream out) {
            return null;
        }

        @Override
        public JsonWriter createWriter(OutputStream out, Charset charset) {
            return null;
        }

        @Override
        public Map<String, ?> getConfigInUse() {
            return null;
        }
    }

    private final JsonParserFactory parserFactory = createParserFactory(Collections.emptyMap());
    private final JsonGeneratorFactory generatorFactory = createGeneratorFactory(Collections.emptyMap());

    @Override
    public JsonGeneratorFactory createGeneratorFactory(Map<String, ?> config) {
        return null;
    }

    //---------------------------------------------------------------------------------------------
    // Dumb implementations

    @Override
    public JsonParser createParser(Reader reader) {
        return parserFactory.createParser(reader);
    }

    @Override
    public JsonParser createParser(InputStream in) {
        return parserFactory.createParser(in);
    }

    @Override
    public JsonParserFactory createParserFactory(Map<String, ?> config) {
        return parserFactory;
    }

    @Override
    public JsonGenerator createGenerator(Writer writer) {
        return generatorFactory.createGenerator(writer);
    }

    @Override
    public JsonGenerator createGenerator(OutputStream out) {
        return generatorFactory.createGenerator(out);
    }

    //---------------------------------------------------------------------------------------------
    // Unsupported operations (for now)

    @Override
    public JsonReader createReader(Reader reader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonReader createReader(InputStream in) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonWriter createWriter(Writer writer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonWriter createWriter(OutputStream out) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonWriterFactory createWriterFactory(Map<String, ?> config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonReaderFactory createReaderFactory(Map<String, ?> config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonObjectBuilder createObjectBuilder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonArrayBuilder createArrayBuilder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public JsonBuilderFactory createBuilderFactory(Map<String, ?> config) {
        throw new UnsupportedOperationException();
    }
}
