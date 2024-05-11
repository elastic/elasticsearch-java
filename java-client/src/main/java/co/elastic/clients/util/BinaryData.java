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
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * Binary data with an associated content type.
 */
@JsonpDeserializable
public interface BinaryData {

    /**
     * The content type.
     */
    String contentType();

    /**
     * Write this data to an output stream.
     * @throws IllegalStateException if the content has already been consumed and the object
     *         isn't replayable.
     */
    void writeTo(OutputStream out) throws IOException;

    /**
     * Return this data as a {@code ByteBuffer}.
     *
     * @throws IllegalStateException if the content has already been consumed and the object
     *         isn't replayable.
     */
    ByteBuffer asByteBuffer() throws IOException;

    /**
     * Return this data as an {@code InputStream}.
     *
     * @throws IllegalStateException if the content has already been consumed and the object
     *         isn't replayable.
     */
    InputStream asInputStream() throws IOException;

    /**
     * Can this object be consumed several times?
     */
    boolean isRepeatable();

    /**
     * Get the estimated size in bytes of the data.
     *
     * @return the estimated size, or <code>-1</code> if the value cannot be estimated or if the data has already been
     *          consumed.
     */
    long size();

    /**
     * Create a {@code BinaryData} from a value and a JSON mapper. The binary content is the result of serializing
     * {@code value} with {@code mapper}. Returns {@code null} if {@code value} is null.
     * <p>
     * Note that the result's content-type can be different from {@code "application/json"} if the JSON mapper is setup to
     * produce other representations such as CBOR or SMILE.
     */
    static BinaryData of(Object value, JsonpMapper mapper) {
        if (value == null) {
            return null;
        }

        if (value instanceof BinaryData) {
            return (BinaryData)value;
        }

        NoCopyByteArrayOutputStream out = new NoCopyByteArrayOutputStream();
        JsonGenerator generator = mapper.jsonProvider().createGenerator(out);
        mapper.serialize(value, generator);
        generator.close();

        return new ByteArrayBinaryData(out.array(), 0, out.size(), ContentType.APPLICATION_JSON);
    }

    static BinaryData of(byte[] bytes, String contentType) {
        return new ByteArrayBinaryData(bytes, 0, bytes.length, contentType);
    }

    static BinaryData of(byte[] value, int offset, int length, String contentType) {
        return new ByteArrayBinaryData(value, offset, length, contentType);
    }

    JsonpDeserializer<BinaryData> _DESERIALIZER = new JsonpDeserializerBase<BinaryData>(
        ByteArrayBinaryData._DESERIALIZER.acceptedEvents()
    ) {
        @Override
        public BinaryData deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            return ByteArrayBinaryData._DESERIALIZER.deserialize(parser, mapper, event);
        }
    };
}
