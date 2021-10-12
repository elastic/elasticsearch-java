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
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * This class models a set of client metadata, including Elasticsearch
 * version, Java platform version and {@link Transport} version. This
 * information is typically compiled into a header field called
 * {@code X-Elastic-Client-Meta} and sent to the server with each request.
 *
 * TODO: optional fields beyond "es", "jv" and "t"
 *
 * @see <a href="https://github.com/elastic/clients-team/blob/master/knowledgebase/specifications/client-meta-header.md">
 *     Structured HTTP Header for Client Metadata</a>
 */
public class ClientMetadata implements ConvertibleToHeader {

    /**
     * Location of the properties file containing project
     * version metadata.
     */
    private static final String VERSION_PROPERTIES = "/co.elastic.clients.elasticsearch/version.properties";

    /**
     * Empty static instance of {@link ClientMetadata} used to
     * disable sending the X-Elastic-Client-Meta header.
     */
    public static final ClientMetadata EMPTY = new ClientMetadata();

    /**
     * Construct an instance of {@link ClientMetadata} containing
     * versions of components currently in use. This will be the
     * method generally used in a production context for
     * obtaining an instance of this class.
     *
     * @return {@link ClientMetadata} instance
     */
    public static ClientMetadata forLocalSystem() {
        Version esVersion = getElasticsearchVersion();
        return new Builder()
                .withElasticsearchVersion(esVersion)
                .withJavaVersion(getJavaVersion())
                .withTransportVersion(esVersion)
                .build();
    }

    /**
     * Builder for constructing {@link ClientMetadata} instances.
     * This exists mainly for use in a non-production context.
     */
    public static class Builder {

        private Version elasticsearchVersion;
        private Version javaVersion;
        private Version transportVersion;

        public Builder() {
            elasticsearchVersion = null;
            javaVersion = null;
            transportVersion = null;
        }

        public Builder withElasticsearchVersion(Version version) {
            elasticsearchVersion = version;
            return this;
        }

        public Builder withJavaVersion(Version version) {
            javaVersion = version;
            return this;
        }

        public Builder withTransportVersion(Version version) {
            transportVersion = version;
            return this;
        }

        public ClientMetadata build() {
            return new ClientMetadata(
                    elasticsearchVersion,
                    javaVersion,
                    transportVersion);
        }

    }

    private final Version elasticsearchVersion;
    private final Version javaVersion;
    private final Version transportVersion;

    /**
     * The class constructor is private, as it is intended for
     * instances to be constructed via the {@link Builder} or
     * the {@link #forLocalSystem()} method.
     *
     * @param elasticsearchVersion {@link Version} of Elasticsearch
     * @param javaVersion {@link Version} of the Java platform
     * @param transportVersion {@link Version} of {@link Transport}
     */
    private ClientMetadata(Version elasticsearchVersion, Version javaVersion, Version transportVersion) {
        if (elasticsearchVersion == null) {
            throw new IllegalArgumentException("Elasticsearch version may not be omitted from client metadata");
        }
        else {
            this.elasticsearchVersion = elasticsearchVersion;
        }
        if (javaVersion == null) {
            throw new IllegalArgumentException("Java version may not be omitted from client metadata");
        }
        else {
            this.javaVersion = javaVersion;
        }
        if (transportVersion == null) {
            throw new IllegalArgumentException("Transport version may not be omitted from client metadata");
        }
        else {
            this.transportVersion = transportVersion;
        }
    }

    /**
     * Separate constructor used for the {@link #EMPTY} instance.
     */
    private ClientMetadata() {
        this.elasticsearchVersion = null;
        this.javaVersion = null;
        this.transportVersion = null;
    }

    /**
     * {@link Version} of Elasticsearch represented by this metadata.
     *
     * @return Elasticsearch {@link Version}
     */
    public Version elasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * {@link Version} of the Java platform represented by this metadata.
     *
     * @return Java platform {@link Version}
     */
    public Version javaVersion() {
        return javaVersion;
    }

    /**
     * {@link Version} of {@link Transport} represented by this metadata.
     *
     * @return {@link Transport} {@link Version}
     */
    public Version transportVersion() {
        return transportVersion;
    }

    @Override
    public String toString() {
        return String.join(",", pairStrings());
    }

    /**
     * Construct a list of "key=value" strings for all
     * non-null values.
     *
     * @return list of strings
     */
    private List<String> pairStrings() {
        List<String> bits = new ArrayList<>();
        if (elasticsearchVersion != null) {
            bits.add("es=" + elasticsearchVersion);
        }
        if (javaVersion != null) {
            bits.add("jv=" + javaVersion);
        }
        if (transportVersion != null) {
            bits.add("t=" + transportVersion);
        }
        return bits;
    }

    /**
     * Convert this client metadata instance into a {@link Header}
     * for inclusion in an HTTP request.
     *
     * The resulting {@link Header#value()} may be null, which denotes
     * that metadata tracking should be disabled.
     *
     * @return {@code X-Elastic-Client-Meta} {@link Header}
     */
    @Override
    public Header toHeader() {
        // According to the spec, "There must be at least one key-value
        // pair if the header is added to a request. An empty header
        // is not valid."
        //
        // To that end, if no key-value pairs have been populated, we
        // return a null-valued header which will be excluded from the
        // headers, disabling client metadata.
        if (this.pairStrings().size() == 0) {
            return Header.raw("X-Elastic-Client-Meta", null);
        }
        else {
            return Header.raw("X-Elastic-Client-Meta", this);
        }
    }

    /**
     * Fetch and return Java version information as a
     * {@link Version} object.
     *
     * @return Java {@link Version}
     */
    public static Version getJavaVersion() {
        return Version.parse(System.getProperty("java.version"));
    }

    /**
     * Fetch and return Elasticsearch version information
     * in raw string form.
     *
     * @return Elasticsearch version string
     */
    public static String getElasticsearchVersionString() {
        InputStream in = ApiClient.class.getResourceAsStream(VERSION_PROPERTIES);
        if (in == null) {
            // Failed to locate version.properties file
            return null;
        }
        Properties properties = new Properties();
        try {
            properties.load(in);
            // This will return null if no version information is
            // found in the version.properties file
            return properties.getProperty("version");
        } catch (IOException e) {
            // Failed to read version.properties file
            return null;
        }
    }

    /**
     * Fetch and return Elasticsearch version information
     * as a {@link Version} object.
     *
     * @return Elasticsearch {@link Version}
     */
    public static Version getElasticsearchVersion() {
        String versionString = getElasticsearchVersionString();
        return versionString == null ? null : Version.parse(versionString);
    }

}
