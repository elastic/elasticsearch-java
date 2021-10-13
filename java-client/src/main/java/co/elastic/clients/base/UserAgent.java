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

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;

/**
 * Models a user agent, consisting of a name, version,
 * and optional key-value metadata.
 */
public class UserAgent {

    static final String DEFAULT_NAME = "elasticsearch-java";

    // The client version is loaded from the 'version.properties' file
    static final String DEFAULT_VERSION;
    static {
        InputStream in = UserAgent.class.getResourceAsStream("/co.elastic.clients.elasticsearch/version.properties");
        if (in != null) {
            Properties prop = new Properties();
            String version;
            try {
                prop.load(in);
                version = prop.getProperty("version", "?");
            } catch (IOException e) {
                // Unable to read properties file
                version = "?";
            }
            DEFAULT_VERSION = version;
        }
        else {
            // Unable to locate properties file
            DEFAULT_VERSION = "?";
        }
        // TODO: log error if DEFAULT_VERSION now equals "?"
    }

    // Default user agent, constructed from default repo name and version
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

    @Override
    public String toString() {
        if (metadata.isEmpty()) {
            return String.format("%s/%s", name, version);
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
            return String.format("%s/%s (%s)", name, version, metadataString);
        }
    }

}
