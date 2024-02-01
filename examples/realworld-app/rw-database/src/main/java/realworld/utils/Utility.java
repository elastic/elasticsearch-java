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

package realworld.utils;

import co.elastic.clients.elasticsearch.core.SearchResponse;

import java.util.Objects;

public class Utility {

    public static boolean isNullOrBlank(String s) {
        return Objects.isNull(s) || s.isBlank();
    }

    /**
     * Utility method to be used for single result queries.
     *
     * @return The document id.
     */
    public static <TDocument> String extractId(SearchResponse<TDocument> searchResponse) {
        return searchResponse.hits().hits().getFirst().id();
    }

    /**
     * Utility method to be used for single result queries.
     *
     * @return An object of the class that was specified in the query definition.
     */
    public static <TDocument> TDocument extractSource(SearchResponse<TDocument> searchResponse) {
        return searchResponse.hits().hits().getFirst().source();
    }
}
