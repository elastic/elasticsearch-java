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

/**
 * Thrown by {@link ObjectBuilder#build()} when a required property is missing.
 * <p>
 * If you think this is an error and that the reported property is actually optional, a workaround is
 * available in {@link ApiTypeHelper} to disable checks. Use with caution.
 */
public class MissingRequiredPropertyException extends RuntimeException {
    private final Class<?> clazz;
    private final String property;

    public MissingRequiredPropertyException(Object obj, String property) {
        super("Missing required property '" + obj.getClass().getSimpleName() + "." + property + "'");
        this.clazz = obj.getClass();
        this.property = property;
    }

    /**
     * The class where the missing property was found
     */
    public Class<?> getObjectClass() {
        return clazz;
    }

    public String getPropertyName() {
        return property;
    }
}
