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

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class DuplicateResourceFinder {

    private static volatile boolean ENABLED = true;

    /**
     * Disables the resource uniqueness checks. Use with caution, as it will mask problems that may hit later.
     */
    public static void enableCheck(boolean enabled) {
        ENABLED = enabled;
    }

    /**
     * Ensure a class is only defined once in this class' classpath
     */
    public static void ensureClassUniqueness(Class<?> clazz) {
        String name = clazz.getName();
        String resource = clazz.getName().replace('.', '/') + ".class";
        ensureResourceUniqueness(resource, name, DuplicateResourceFinder.class.getClassLoader());
    }

    public static void ensureResourceUniqueness(String path) {
        ensureResourceUniqueness(path, path, DuplicateResourceFinder.class.getClassLoader());
    }

    private static void ensureResourceUniqueness(String path, String name, ClassLoader classLoader) {
        if (!ENABLED) {
            return;
        }

        // With Java9 modules, will work only with exported classes/resources. This is actually
        // what we want, as non-exported classes/resources will not conflict.
        List<URL> list = new ArrayList<>();
        try {
            Enumeration<URL> resources = classLoader.getResources(path);
            while (resources.hasMoreElements()) {
                list.add(resources.nextElement());
            }
        } catch (IOException ioe) {
            // Ignore
        }

        if (list.size() > 1) {
            StringBuilder sb = new StringBuilder("Several versions of ")
                .append(name)
                .append(" were found. This can cause conflicts, please fix the classpath:\n");
            for (URL url: list) {
                sb.append("    ").append(url.toString()).append("\n");
            }
            sb.append("    See the Java API client's troubleshooting documentation for more information.\n");
            throw new RuntimeException(sb.toString());
        }
    }
}
