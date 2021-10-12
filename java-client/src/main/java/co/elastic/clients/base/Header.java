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

package co.elastic.clients.base;

import co.elastic.clients.util.NamedValue;

/**
 * Raw HTTP header field, consisting of a string name and value.
 */
public class Header extends NamedValue<String> implements ConvertibleToHeader {

    /**
     * Construct a raw header field.
     *
     * The {@link Object#toString()} method of the value passed is
     * used to obtain the field value sent over the wire.
     *
     * By convention, a null value denotes that the header with that
     * name is disabled, and will not be sent.
     *
     * @param name header field name
     * @param value header field value
     * @return new {@link Header} object
     */
    public static Header raw(String name, Object value) {
        return new Header(name, value == null ? null : value.toString());
    }

    private Header(String name, String value) {
        super(name, value);
    }

    @Override
    public Header toHeader() {
        return this;
    }

}
