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

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Utility functions for API model types
 */

public class ModelTypeHelper {

    private ModelTypeHelper() {}

    public static <T> List<T> unmodifiable(List<T> list) {
        return list == null ? list : Collections.unmodifiableList(list);
    }

    public static <K, V> Map<K, V> unmodifiable(Map<K, V> map) {
        return map == null ? map : Collections.unmodifiableMap(map);
    }

    public static <T> List<T> unmodifiableNonNull(List<T> list, String message) {
        return Collections.unmodifiableList(Objects.requireNonNull(list, message));
    }

    public static <K, V> Map<K, V> unmodifiableNonNull(Map<K, V> map, String message) {
        return Collections.unmodifiableMap(Objects.requireNonNull(map, message));
    }

}
