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

package co.elastic.clients.util;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpDeserializerBase;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.EnumSet;

@JsonpDeserializable
public class ByteArrayBinaryData implements BinaryData {

    private final byte[] bytes;
    private final int offset;
    private final int length;
    private final String contentType;

    ByteArrayBinaryData(byte[] bytes, int offset, int length, String contentType) {
        this.contentType = contentType;
        this.bytes = bytes;
        this.offset = offset;
        this.length = length;
    }

    ByteArrayBinaryData(byte[] bytes, String contentType) {
        this.contentType = contentType;
        this.bytes = bytes;
        this.offset = 0;
        this.length = bytes.length;
    }

    /**
     * Copy another {@link BinaryData}. Typically used to make a replayable {@link BinaryData}
     * from a non-replayable one.
     */
    public ByteArrayBinaryData(BinaryData data) throws IOException {
        NoCopyByteArrayOutputStream out = new NoCopyByteArrayOutputStream();
        data.writeTo(out);
        this.contentType = data.contentType();
        this.bytes = out.array();
        this.offset = 0;
        this.length = out.size();
    }

    @Override
    public String contentType() {
        return this.contentType;
    }

    @Override
    public void writeTo(OutputStream out) throws IOException {
        out.write(bytes, offset, length);
    }

    @Override
    public long size() {
        return length;
    }

    @Override
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(bytes, offset, length);
    }

    @Override
    public InputStream asInputStream() {
        return new ByteArrayInputStream(bytes, offset, length);
    }

    @Override
    public boolean isRepeatable() {
        return true;
    }

    private static class Deserializer extends JsonpDeserializerBase<ByteArrayBinaryData> {

        Deserializer() {
            super(EnumSet.allOf(JsonParser.Event.class));
        }

        @Override
        public ByteArrayBinaryData deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
            JsonpUtils.copy(parser, generator, event);
            generator.close();
            return new ByteArrayBinaryData(baos.toByteArray(), ContentType.APPLICATION_JSON);
        }
    }

    public static final JsonpDeserializer<ByteArrayBinaryData> _DESERIALIZER = new Deserializer();
}
