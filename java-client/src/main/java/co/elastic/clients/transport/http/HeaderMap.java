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

package co.elastic.clients.transport.http;

import javax.annotation.Nullable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * A (string, string) map with case-insensitive keys.
 */
public class HeaderMap extends AbstractMap<String, String> {

    public static final String ACCEPT = "Accept";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String USER_AGENT = "User-Agent";
    public static final String CLIENT_META = "X-Elastic-Client-Meta";

    @Nullable
    protected Map<String, String> map;

    public static HeaderMap EMPTY = new HeaderMap(null).locked();

    public HeaderMap() {
        this.map = null;
    }

    /**
     * Copy constructor
     */
    public HeaderMap(@Nullable Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            this.map = null;
        } else if (map instanceof HeaderMap) {
            Map<String, String> hmap = ((HeaderMap) map).map;
            this.map = hmap == null ? null : new HashMap<>(hmap);
        } else {
            this.map = new HashMap<>(map);
        }
    }

    @Override
    public int size() {
        return map == null ? 0 : map.size();
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    @Override
    public String get(Object object) {
        String key = (String)object; // throwing ClassCastException is allowed
        if (map == null) {
            return null;
        }
        for (Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public String put(String key, String value) {
        String result;
        if (map == null) {
            map = new HashMap<>();
            result = null;
        } else {
            result = remove(key);
        }
        map.put(key, value);
        return result;
    }

    public String add(String key, String value) {
        if (map == null) {
            map = new HashMap<>();
        } else {
            for (Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(key)) {
                    String current = entry.getValue();
                    entry.setValue(current + "; " + value);
                    return current;
                }
            }
        }
        return map.put(key, value);
    }

    @Override
    public String remove(Object object) {
        String key = (String)object; // throwing ClassCastException is allowed
        if (map == null) {
            return null;
        } else {
            Iterator<Entry<String, String>> entries = map.entrySet().iterator();
            while(entries.hasNext()) {
                Map.Entry<String, String> entry = entries.next();
                if (entry.getKey().equalsIgnoreCase(key)) {
                    entries.remove();
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    /**
     * Return a locked copy of this header map that cannot be modified
     */
    public HeaderMap locked() {
        return new Locked(map);
    }

    private static class Locked extends HeaderMap {
        Locked(Map<String, String> map) {
            super(map);
        }

        private String isLocked() {
            throw new UnsupportedOperationException("HeaderMap is write locked");
        }

        @Override
        public String put(String key, String value) {
            return isLocked();
        }

        @Override
        public String add(String key, String value) {
            return isLocked();
        }

        @Override
        public String remove(Object object) {
            return isLocked();
        }

        @Override
        public Set<Entry<String, String>> entrySet() {
            if (map == null) {
                return Collections.emptySet();
            } else {
                return Collections.unmodifiableSet(super.entrySet());
            }
        }
    }
}
