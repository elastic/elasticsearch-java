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

import co.elastic.clients.json.JsonpMapper;
import jakarta.json.stream.JsonGenerator;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * Binary data representing a serialized value.
 */
public interface BinaryData {

    /**
     * Write this data to an output stream.
     */
    void writeTo(OutputStream out) throws IOException;

    /**
     * Return this data as a {@code ByteBuffer}
     */
    ByteBuffer asByteBuffer();

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

        return new ByteArrayBinaryData(out.array(), 0, out.size());
    }

    static BinaryData of(byte[] bytes) {
        return new ByteArrayBinaryData(bytes, 0, bytes.length);
    }

    static BinaryData of(byte[] value, int offset, int length) {
        return new ByteArrayBinaryData(value, offset, length);
    }

    class ByteArrayBinaryData implements BinaryData {

        private final byte[] bytes;
        private final int offset;
        private final int length;

        ByteArrayBinaryData(byte[] bytes, int offset, int length) {
            this.bytes = bytes;
            this.offset = offset;
            this.length = length;
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
    }
}
