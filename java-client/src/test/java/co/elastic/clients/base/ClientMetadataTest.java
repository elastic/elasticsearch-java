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

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ClientMetadataTest {

    @Test
    public void testMetadataForLocalSystem() {
        ClientMetadata metadata = ClientMetadata.forLocalSystem();
        // We can't check the actual content of this system
        // metadata, as this varies... well, by system, so
        // instead we simply check that it contains *some* data.
        assertTrue(metadata.toString().length() > 0);
    }

    @Test
    public void testEmptyMetadata() {
        ClientMetadata metadata = ClientMetadata.EMPTY;
        // The string value of a null-valued header is always
        // the empty string, by definition.
        assertEquals("", metadata.toString());
    }

    @Test
    public void testCustomMetadata() {
        ClientMetadata metadata = new ClientMetadata.Builder()
                .withElasticsearchVersion(Version.parse("12.3.4"))
                .withJavaVersion(Version.parse("1.4.2"))
                .withTransportVersion(Version.parse("6.7"))
                .build();
        assertEquals("es=12.3.4,jv=1.4.2,t=6.7", metadata.toString());
    }

    @Test
    public void testElasticsearchVersionIsMandatory() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ClientMetadata.Builder()
                    .withJavaVersion(Version.parse("1.4.2"))
                    .withTransportVersion(Version.parse("6.7"))
                    .build();
        });
    }

    @Test
    public void testJavaVersionIsMandatory() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ClientMetadata.Builder()
                    .withElasticsearchVersion(Version.parse("12.3.4"))
                    .withTransportVersion(Version.parse("6.7"))
                    .build();
        });
    }

    @Test
    public void testTransportVersionIsMandatory() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ClientMetadata.Builder()
                    .withElasticsearchVersion(Version.parse("12.3.4"))
                    .withJavaVersion(Version.parse("1.4.2"))
                    .build();
        });
    }

}
