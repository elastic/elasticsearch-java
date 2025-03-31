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

package co.elastic.clients.transport5.low_level_client;

import com.carrotsearch.randomizedtesting.generators.RandomNumbers;
import com.carrotsearch.randomizedtesting.generators.RandomPicks;
import com.carrotsearch.randomizedtesting.generators.RandomStrings;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpRequest;
import org.apache.hc.core5.http.message.BasicHeader;
import org.elasticsearch.client.HttpDeleteWithEntity;
import org.elasticsearch.client.HttpGetWithEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

final class RestClientTestUtil {

    private static final String[] HTTP_METHODS = new String[]{"DELETE", "HEAD", "GET", "OPTIONS", "PATCH",
        "POST", "PUT", "TRACE"};
    private static final List<Integer> ALL_STATUS_CODES;
    private static final List<Integer> OK_STATUS_CODES = Arrays.asList(200, 201);
    private static final List<Integer> ALL_ERROR_STATUS_CODES;
    private static List<Integer> ERROR_NO_RETRY_STATUS_CODES = Arrays.asList(500,501);
    private static List<Integer> ERROR_RETRY_STATUS_CODES = Arrays.asList(502, 503, 504);

    static {
        ALL_ERROR_STATUS_CODES = new ArrayList<>(ERROR_RETRY_STATUS_CODES);
        ALL_ERROR_STATUS_CODES.addAll(ERROR_NO_RETRY_STATUS_CODES);
        ALL_STATUS_CODES = new ArrayList<>(ALL_ERROR_STATUS_CODES);
        ALL_STATUS_CODES.addAll(OK_STATUS_CODES);
    }

    private RestClientTestUtil() {

    }

    static boolean canHaveBody(HttpRequest httpRequest) {
        return httpRequest.getMethod().contains("PUT") || httpRequest.getMethod().contains("POST") ||
            httpRequest.getMethod().contains("PATCH") ||
            httpRequest instanceof HttpDeleteWithEntity || httpRequest instanceof HttpGetWithEntity;
    }

    static String[] getHttpMethods() {
        return HTTP_METHODS;
    }

    static String randomHttpMethod(Random random) {
        return RandomPicks.randomFrom(random, HTTP_METHODS);
    }

    static int randomStatusCode(Random random) {
        return RandomPicks.randomFrom(random, ALL_STATUS_CODES);
    }

    static int randomOkStatusCode(Random random) {
        return RandomPicks.randomFrom(random, OK_STATUS_CODES);
    }

    static int randomErrorNoRetryStatusCode(Random random) {
        return RandomPicks.randomFrom(random, List.of(500,501));
    }

    static int randomErrorRetryStatusCode(Random random) {
        return RandomPicks.randomFrom(random, ERROR_RETRY_STATUS_CODES);
    }

    static List<Integer> getOkStatusCodes() {
        return OK_STATUS_CODES;
    }

    static List<Integer> getAllErrorStatusCodes() {
        return ALL_ERROR_STATUS_CODES;
    }

    static List<Integer> getAllStatusCodes() {
        return ALL_STATUS_CODES;
    }

    /**
     * Create a random number of {@link Header}s.
     * Generated header names will either be the {@code baseName} plus its index, or exactly the provided
     * {@code baseName} so that the
     * we test also support for multiple headers with same key and different values.
     */
    static Header[] randomHeaders(Random random, final String baseName) {
        int numHeaders = RandomNumbers.randomIntBetween(random, 0, 5);
        final Header[] headers = new Header[numHeaders];
        for (int i = 0; i < numHeaders; i++) {
            String headerName = baseName;
            // randomly exercise the code path that supports multiple headers with same key
            if (random.nextBoolean()) {
                headerName = headerName + i;
            }
            headers[i] = new BasicHeader(headerName, RandomStrings.randomAsciiLettersOfLengthBetween(random
                , 3, 10));
        }
        return headers;
    }
}
