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

package co.elastic.clients.elasticsearch._helpers.vector;

import java.nio.ByteBuffer;
import java.util.Base64;

/**
 * Utility class that can be extended to be used as vector type document,
 * which will translate float array vectors in a base64 format accepted by Elasticsearch version 9.3+,
 * with increased ingestion performance
 * <p>
 * Check {@link Base64VectorTest} for example usage
 */
public class AbstractBase64VectorDocument {
    private String vector;

    public void setVector(float[] vec) {
        ByteBuffer buff = ByteBuffer.allocate(Float.BYTES * vec.length);
        for (int i = 0; i < vec.length; i++) {
            buff.putFloat(vec[i]);
        }
        this.vector = Base64.getEncoder().encodeToString(buff.array());
    }

    public void setVector(String vec) {
        this.vector = vec;
    }

    public String getVector() {
        return vector;
    }
}
