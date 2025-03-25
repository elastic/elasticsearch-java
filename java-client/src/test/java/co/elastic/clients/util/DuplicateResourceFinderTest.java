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

import com.fasterxml.jackson.databind.ext.CoreXMLSerializers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuplicateResourceFinderTest extends Assertions {

    @Test
    public void testDuplicateCheck() {

        Exception e = assertThrows(RuntimeException.class, () -> {
            DuplicateResourceFinder.ensureClassUniqueness(CoreXMLSerializers.class);
        });
        assertTrue(e.getMessage().contains("Several versions of"));

        // Disabling the test should not throw an exception
        DuplicateResourceFinder.enableCheck(false);
        DuplicateResourceFinder.ensureClassUniqueness(CoreXMLSerializers.class);
    }
}
