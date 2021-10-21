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

import java.util.Collections;
import java.util.Map;

/**
 * Models a user agent, consisting of a name, version,
 * and optional key-value metadata.
 */
public class UserAgent implements ConvertibleToHeader {

    static final String DEFAULT_NAME = "elasticsearch-java";

    static final String DEFAULT_VERSION = ClientMetadata.getClientVersionString();

    public static final UserAgent DEFAULT = new UserAgent(DEFAULT_NAME, DEFAULT_VERSION);

    private final String name;
    private final String version;
    private final Map<String, String> metadata;

    public UserAgent(String name, String version, Map<String, String> metadata) {
        this.name = name;
        this.version = version;
        this.metadata = metadata;
    }

    public UserAgent(String repoName, String version) {
        this(repoName, version, Collections.emptyMap());
    }

    public String name() {
        return name;
    }

    public String version() {
        return version;
    }

    public Map<String, String> metadata() {
        return metadata;
    }

    public String toString() {
        if (metadata.isEmpty()) {
            return String.format("%s/%s", name, version == null ? '?' : version);
        }
        else {
            StringBuilder metadataString = new StringBuilder();
            for (Map.Entry<String, String> entry : metadata.entrySet()) {
                if (metadataString.length() > 0) {
                    metadataString.append("; ");
                }
                metadataString.append(entry.getKey());
                metadataString.append(' ');
                metadataString.append(entry.getValue());
            }
            return String.format("%s/%s (%s)", name, version == null ? '?' : version, metadataString);
        }
    }

    @Override
    public Header toHeader() {
        return Header.raw("User-Agent", this);
    }

}
