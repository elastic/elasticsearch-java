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

public class TaggedUnion2<LowClass, HighClass extends UnionVariant> {

    protected final String _type;
    protected final LowClass _value;

    public TaggedUnion2(HighClass value) {
        this._type = value._type();
        this._value = (LowClass)value;
    }

    protected TaggedUnion2(String tag, LowClass value) {
        this._type = tag;
        this._value = value;
    }

    /**
     * Get the variant type of this union.
     *
     * @return the variant type
     */
    public String _type() {
        return this._type;
    }

    public LowClass get() {
        return this._value;
    }

    /**
     * Checks if this object is of a given variant type.
     */
    public boolean _is(String type) {
        return type.equals(this._type);
    }

    protected <V extends LowClass> V _get(String type) {
        if (type.equals(this._type)) {
            @SuppressWarnings("unchecked")
            V result = (V) this._value;
            return result;
        } else {
            throw new IllegalStateException("Cannot get '" + type + "' variant: current variant is '" + this._type + "'.");
        }
    }

    public LowClass _get() {
        return this._value;
    }
}
