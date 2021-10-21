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

import co.elastic.clients.util.NamedString;

/**
 * Raw URI query parameter, consisting of a string name and value.
 */
public class QueryParameter extends NamedString {

    /**
     * Construct a raw URI query parameter.
     *
     * The {@link Object#toString()} method of the value passed is
     * used to obtain the field value sent over the wire.
     *
     * By convention, a null value denotes that the parameter with that
     * name is disabled, and will not be sent.
     *
     * @param name query parameter name
     * @param value query parameter value
     * @return new {@link QueryParameter} object
     */
    public static QueryParameter raw(String name, Object value) {
        return new QueryParameter(name, value == null ? null : value.toString());
    }

    private QueryParameter(String name, String value) {
        super(name, value);
    }

}
