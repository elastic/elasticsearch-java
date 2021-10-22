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

package co.elastic.clients.transport;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A media type as defined for use in <em>Content-Type</em> and
 * <em>Accept</em> headers. Also historically known as a MIME type.
 *
 * Note that this class only has very limited support for the
 * media types used by the Elasticsearch client. It is not usable
 * as a general purpose utility class.
 *
 * @see <a href="https://www.iana.org/assignments/media-types/media-types.xhtml">Media Types</a> at IANA
 */
public class MediaType {

    /**
     * Construct an Elasticsearch vendor-specific media type.
     * If the {@code ELASTIC_CLIENT_APIVERSIONING} environment
     * variable is set to 1, this also appends a
     * {@code compatible-with} parameter that points to the
     * major client version.
     *
     * The transport type is {@code application/vnd.elasticsearch+json}.
     *
     * @return new {@link MediaType} for ES-specific JSON
     */
    public static MediaType vendorElasticsearchJSON() {
        Map<String, Object> parameters = new HashMap<>();
        if (Objects.equals(System.getenv("ELASTIC_CLIENT_APIVERSIONING"), "1")) {
            Version clientVersion = ClientMetadata.getClientVersion();
            if (clientVersion != null) {
                parameters.put("compatible-with", clientVersion.major());
            }
        }
        return new MediaType("application", "vnd.elasticsearch+json", parameters);
    }

    private final String type;
    private final String subtype;
    private final Map<String, Object> parameters;

    public MediaType(String type, String subtype, Map<String, Object> parameters) {
        this.type = type;
        this.subtype = subtype;
        this.parameters = parameters;
    }

    /**
     * The top-level type, such as "text" or "application".
     *
     * @return type string
     */
    public String type() {
        return type;
    }

    /**
     * The subtype, such as "plain" or "json".
     *
     * @return subtype string
     */
    public String subtype() {
        return subtype;
    }

    /**
     * Map of parameters to append to the media type string,
     * such as "charset=utf-8".
     *
     * @return map of parameter keys and values
     */
    public Map<String, Object> parameters() {
        return parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MediaType)) return false;
        MediaType mediaType = (MediaType) o;
        return (Objects.equals(type, mediaType.type) &&
                Objects.equals(subtype, mediaType.subtype) &&
                Objects.equals(parameters, mediaType.parameters));
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, subtype, parameters);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(type);
        s.append('/');
        s.append(subtype);
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            s.append("; ");
            s.append(entry.getKey());
            s.append('=');
            s.append(entry.getValue());
        }
        return s.toString();
    }

}
