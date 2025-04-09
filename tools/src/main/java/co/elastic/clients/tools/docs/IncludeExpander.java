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

package co.elastic.clients.tools.docs;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Processes the {@code .md} files in a directory expanding code blocks following a custom directive
 * (expressed as MyST comment):
 * <pre>
 *     % :::{include-code} src={{doc-tests-src}}/path/to/SomeCode.java tag=some-marker
 *     ```java
 *       this is replaced by the section of SomeCode.java delimited
 *       with `tag::some-marker` and `end::some-marker`
 *     ```
 * </pre>
 *
 * Note: the MyST format has the {@code {literalinclude}} directive, which is currently only partially supported
 * by docs-builder (the whole file is included, ignoring {@code start-after} and {@code end-before} parameters).
 * <p>
 * See <a href="https://mystmd.org/guide/code#docs-literalinclude">MyST docs</a>
 */
public class IncludeExpander {

    public static void main(String[] args) throws IOException {

        File dir = new File(args.length == 0 ? "docs/reference" : args[0]);

        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir.getAbsolutePath() + " is not a directory");
        }

        // FIXME: we should read this from `docset.yml` in the `dir` directory.
        processDirectory(dir, Map.of("doc-tests-src", "java-client/src/test/java/co/elastic/clients/documentation"));
    }

    public static void processDirectory(File dir, Map<String, String> subst) throws IOException {
        //System.out.println("Processing directory " + dir);
        // Traverse all files
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                processDirectory(file, subst);

            } else if (file.getName().endsWith(".md")) {
                processFile(file, subst);
            }
        }
    }

    public static void processFile(File file, Map<String, String> subst) throws IOException {
        Path path = file.toPath();
        String text = Files.readString(path);

        String result = expandText(text, subst, path.toString());
        if (result == null) {
            // No include directives
            return;
        }

        if (result.equals(text)) {
            System.out.println("No change in " + path);
            return;
        }

        // File changed, write it.
        System.out.println("Expanded " + path);
        Files.writeString(path, result);
    }

    enum State {
        NORMAL_TEXT,
        INCLUDE_CODE_DIRECTIVE,
        REPLACED_CODE_BLOCK,
    }

    public static void fail(String message, String path, LineNumberReader reader, Throwable e) {
        throw new RuntimeException(message + " at " + path + ":" + reader.getLineNumber(), e);
    }

    public static String expandText(String input, Map<String, String> subst, String path) throws IOException {
        if (!input.contains("% :::{include-code}")) {
            // Nothing to do
            return null;
        }

        LineNumberReader reader = new LineNumberReader(new StringReader(input));
        StringBuilder output = new StringBuilder();
        State state = State.NORMAL_TEXT;

        String includeCodeLine = null;

        String line;
        while ((line = reader.readLine()) != null) {

            switch (state) {
                case NORMAL_TEXT -> {
                    if (line.startsWith("% :::{include-code}")) {
                        output.append(line).append("\n");
                        includeCodeLine = line;
                        state = State.INCLUDE_CODE_DIRECTIVE;

                    } else {
                        // Regular text line
                        output.append(line).append("\n");
                    }
                }

                case INCLUDE_CODE_DIRECTIVE -> {
                    if (!line.startsWith("```")) {
                        fail("The '% :::{include-code}' should be followed by a code block", path, reader, null);
                    }
                    output.append(line).append("\n");
                    state = State.REPLACED_CODE_BLOCK;
                    try {
                        expandIncludeCodeDirective(includeCodeLine, subst, output);
                    } catch (Exception e) {
                        fail("Failed to expand include directive", path, reader, e);
                    }
                }

                case REPLACED_CODE_BLOCK -> {
                    // Skip existing code until we reach the end
                    if (line.startsWith("```")) {
                        output.append(line).append("\n");
                        state = State.NORMAL_TEXT;
                    }
                }
            }
        }

        if (state != State.NORMAL_TEXT) {
            throw new RuntimeException("Premature end of file in " + state);
        }

        return output.toString();
    }

    public static void expandIncludeCodeDirective(String command, Map<String, String> subst, StringBuilder output) throws IOException {
        String[] s = command.split(" ");
        Map<String, String> args = new HashMap<>();
        for (int i = 2; i < s.length; i++) {
            var kv = s[i].split("=");
            args.put(kv[0], kv[1]);
        }

        var src = Objects.requireNonNull(args.get("src"), "Missing 'src' attribute");
        var tag = Objects.requireNonNull(args.get("tag"), "Missing 'tag' attribute");

        // Brute force replacement of placeholders. We can do better.
        for (var kv: subst.entrySet()) {
            src = src.replace("{{" + kv.getKey() + "}}", kv.getValue());
        }

        expandTaggedFile(src, tag, output);
    }

    public static void expandTaggedFile(String path, String tag, StringBuilder output) throws IOException {
        File file = new File(path);
        String content = Files.readString(file.toPath());
        var reader = new BufferedReader(new StringReader(content));

        String startTag = "tag::" + tag;
        String endTag = "end::" + tag;

        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (line.contains(startTag)) {
                // Find indentation level
                int start = 0;
                while (Character.isWhitespace(line.charAt(start))) {
                    start++;
                }

                found = true;
                while((line = reader.readLine()) != null) {
                    if (line.contains(endTag)) {
                        return;
                    }
                    // If the line has more characters than the tag's initial position,
                    // assume it's whitespace and truncate it to remove indentation.
                    if (line.length() > start) {
                        line = line.substring(start);
                    }
                    output.append(line).append("\n");
                }
            }
        }

        if (found) {
            throw new RuntimeException("Missing end tag '" + tag + "' in " + path);
        } else {
            throw new RuntimeException("Missing start tag '" + tag + "' in " + path);
        }
    }
}
