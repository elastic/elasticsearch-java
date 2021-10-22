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

package co.elastic.clients.transport;

import java.util.Objects;

/**
 * A user-specified Opaque ID as used in the X-Opaque-ID header.
 */
public class OpaqueID implements ConvertibleToHeader {

    private final Object value;

    public OpaqueID(Object value) {
        this.value = value;
    }

    public Object value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OpaqueID)) return false;
        OpaqueID opaqueID = (OpaqueID) o;
        return Objects.equals(value, opaqueID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Header toHeader() {
        return Header.raw("X-Opaque-ID", value);
    }

}
