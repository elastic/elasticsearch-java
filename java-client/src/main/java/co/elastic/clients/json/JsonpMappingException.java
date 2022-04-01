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

package co.elastic.clients.json;

import jakarta.json.stream.JsonLocation;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;

import java.util.LinkedList;
import java.util.regex.Pattern;

/**
 * A mapping exception. The exception message contains the JSON path and location where the problem happened.
 */
public class JsonpMappingException extends JsonParsingException {
    private final LinkedList<Object> path = new LinkedList<>();
    private Object ref;

    public JsonpMappingException(String message, JsonLocation location) {
        super(message, location);
    }

    public JsonpMappingException(String message, Throwable cause, JsonLocation location) {
        super(message, cause, location);
    }

    public JsonpMappingException(Throwable cause, JsonLocation location) {
        super(cause.toString(), cause, location);
    }

    private static final Pattern identifier = Pattern.compile("[_a-zA-Z][_a-zA-Z0-9]*");

    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder("Error deserializing");
        if (ref != null) {
            sb.append(' ');
            String className = ref.getClass().getName();
            if (className.endsWith("$Builder")) {
                sb.append(className, 0, className.length() - "$Builder".length());
            } else {
                sb.append(className);
            }
        }
        sb.append(": ").append(super.getMessage());

        if (!path.isEmpty()) {
            sb.append(" (JSON path: ");
            path(sb);
            sb.append(") ");
        }

        sb.append(getLocation());
        return sb.toString();
    }

    /**
     * The JSON path where this exception happened.
     */
    public String path() {
        StringBuilder sb = new StringBuilder();
        path(sb);
        return sb.toString();
    }

    // Package-visible for testing
    void path(StringBuilder sb) {
        String sep = "";
        for (Object item : path) {
            if (item instanceof Integer) {
                sb.append("[").append(((Integer) item).intValue()).append("]");
            } else {
                String str = item.toString();
                if (identifier.matcher(str).matches()) {
                    sb.append(sep).append(item);
                } else {
                    sb.append("['").append(str).append("']");
                }
            }
            sep = ".";
        }
    }

    public JsonpMappingException prepend(Object ref, String name) {
        return prepend0(ref, name);
    }

    public JsonpMappingException prepend(Object ref, int idx) {
        return prepend0(ref, idx);
    }

    private JsonpMappingException prepend0 (Object ref, Object pathItem) {
        if (pathItem != null) {
            this.path.addFirst(pathItem);
        }
        // Keep the deepest object reference in the JSON hierarchy
        if (this.ref == null) {
            this.ref = ref;
        }
        return this;
    }

    public static JsonpMappingException from(Throwable cause, Object ref, String name, JsonParser parser) {
        return from0(cause, ref, name, parser);
    }

    public static JsonpMappingException from(Throwable cause, int index, JsonParser parser) {
        return from0(cause, null, index, parser);
    }

    private static JsonpMappingException from0(Throwable cause, Object ref, Object pathItem, JsonParser parser) {
        JsonpMappingException jme;

        if (cause instanceof JsonpMappingException) {
            jme = (JsonpMappingException)cause;
        } else {
            jme = new JsonpMappingException(cause, parser.getLocation());
        }

        return jme.prepend0(ref, pathItem);
    }
}

