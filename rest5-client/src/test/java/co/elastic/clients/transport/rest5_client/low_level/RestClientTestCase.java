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

package co.elastic.clients.transport.rest5_client.low_level;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.hc.core5.http.Header;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public abstract class RestClientTestCase {

    /**
     * Assert that the actual headers are the expected ones given the original default and request headers.
     * Some headers can be ignored,
     * for instance in case the http client is adding its own automatically.
     *
     * @param defaultHeaders the default headers set to the REST client instance
     * @param requestHeaders the request headers sent with a particular request
     * @param actualHeaders  the actual headers as a result of the provided default and request headers
     * @param ignoreHeaders  header keys to be ignored as they are not part of default nor request headers,
     *                       yet they
     *                       will be part of the actual ones
     */
    protected static void assertHeaders(
        final Header[] defaultHeaders,
        final Header[] requestHeaders,
        final Header[] actualHeaders,
        final Set<String> ignoreHeaders
    ) {
        final Map<String, List<String>> expectedHeaders = new HashMap<>();
        final Set<String> requestHeaderKeys = new HashSet<>();
        for (final Header header : requestHeaders) {
            final String name = header.getName();
            addValueToListEntry(expectedHeaders, name, header.getValue());
            requestHeaderKeys.add(name);
        }
        for (final Header defaultHeader : defaultHeaders) {
            final String name = defaultHeader.getName();
            if (requestHeaderKeys.contains(name) == false) {
                addValueToListEntry(expectedHeaders, name, defaultHeader.getValue());
            }
        }
        Set<String> actualIgnoredHeaders = new HashSet<>();
        for (Header responseHeader : actualHeaders) {
            final String name = responseHeader.getName();
            if (ignoreHeaders.contains(name)) {
                expectedHeaders.remove(name);
                actualIgnoredHeaders.add(name);
                continue;
            }
            final String value = responseHeader.getValue();
            final List<String> values = expectedHeaders.get(name);
            assertNotNull("found response header [" + name + "] that wasn't originally sent: " + value,
                values);
            assertTrue("found incorrect response header [" + name + "]: " + value, values.remove(value));
            if (values.isEmpty()) {
                expectedHeaders.remove(name);
            }
        }
        assertEquals("some headers meant to be ignored were not part of the actual headers", ignoreHeaders,
            actualIgnoredHeaders);
        assertTrue("some headers that were sent weren't returned " + expectedHeaders,
            expectedHeaders.isEmpty());
    }

    private static void addValueToListEntry(final Map<String, List<String>> map, final String name,
                                            final String value) {
        List<String> values = map.get(name);
        if (values == null) {
            values = new ArrayList<>();
            map.put(name, values);
        }
        values.add(value);
    }

    public static boolean inFipsJvm() {
        return Boolean.parseBoolean(System.getProperty("tests.fips.enabled"));
    }

    public static Random getRandom() {
        return ThreadLocalRandom.current();
    }

    public static int randomIntBetween(int min, int max) {
        return getRandom().ints(min, max)
            .findFirst()
            .getAsInt();
    }

    public static long randomLongBetween(long min, long max) {
        return getRandom().longs(min, max)
            .findFirst()
            .getAsLong();
    }

    public static boolean randomBoolean() {
        return randomIntBetween(0, 1) == 0;
    }

    public static String randomAsciiAlphanumOfLength(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public static String randomAsciiAlphanumOfLengthBetween(int min, int max) {
        return RandomStringUtils.randomAlphanumeric(min, max);
    }

    public static String randomAsciiLettersOfLength(int lentgh) {
        return RandomStringUtils.randomAlphabetic(lentgh);
    }

    public static String randomAsciiLettersOfLengthBetween(int min, int max) {
        return RandomStringUtils.randomAlphabetic(min, max);
    }

    public static <T> T randomFrom(T[] array) {
        checkZeroLength(array.length);
        int index = randomIntBetween(0, array.length);
        return array[index];
    }

    public static <T> T randomFrom(List<T> list) {
        int index = randomIntBetween(0, list.size());
        return list.get(index);
    }

    public static byte[] randomBytesOfLength(int length) {
        byte[] b = new byte[length];
        new Random().nextBytes(b);
        return b;
    }

    public static boolean rarely() {
        return randomIntBetween(0, 100) >= 90;
    }

    public static boolean frequently() {
        return !rarely();
    }

    private static void checkZeroLength(int length) {
        if (length == 0) {
            throw new IllegalArgumentException("Can't pick a random object from an empty array.");
        }
    }
}
