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
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncludeExpander {

    public static void main(String[] args) throws IOException {

        File dir = new File(args[0]);

        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir.getAbsolutePath() + " is not a directory");
        }

        processDirectory(dir, Map.of("doc-tests-src", "../java-client/src/test/java/co/elastic/clients/documentation"));
    }

    public static void processDirectory(File dir, Map<String, String> subst) throws IOException {
        System.out.println("Processing directory " + dir);
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
        INCLUDE_DIRECTIVE,
        INCLUDE_EXPANSION,
    }

    public static void fail(String message, String path, LineNumberReader reader, Throwable e) {
        throw new RuntimeException(message + " at " + path + ":" + reader.getLineNumber(), e);
    }

    public static String expandText(String input, Map<String, String> subst, String path) throws IOException {
        int start = input.indexOf("<!-- :::include");
        if (start == -1) {
            // Nothing to do
            return null;
        }

        LineNumberReader reader = new LineNumberReader(new StringReader(input));
        StringBuilder output = new StringBuilder();
        State state = State.NORMAL_TEXT;

        StringBuilder expanded = null;

        String line;
        while ((line = reader.readLine()) != null) {

            switch (state) {
                case NORMAL_TEXT -> {
                    if (line.startsWith("<!-- :::include")) {
                        output.append(line).append("\n");
                        state = State.INCLUDE_DIRECTIVE;
                        // Prepare template expansion
                        expanded = new StringBuilder();

                    } else if (line.startsWith("% :::include::start")) {
                        // Skip line
                        state = State.INCLUDE_EXPANSION;

                    } else {
                        // Regular text line
                        output.append(line).append("\n");
                    }
                }

                case INCLUDE_EXPANSION -> {
                    // Always skip line, it will be replaced by the expansion result.
                    if (line.startsWith("% :::include::end")) {
                        state = State.NORMAL_TEXT;
                    }
                }

                case INCLUDE_DIRECTIVE -> {
                    // Keep template in the doc file
                    output.append(line).append("\n");

                    if (line.startsWith(":::{include}")) {
                        try {
                            expandIncludeDirective(line, subst, expanded);
                        } catch(Exception e) {
                            fail("Failed to expand include directive", path, reader, e);
                        }

                    } else if (line.startsWith("-->")) {
                        // End of template: append expanded output with enclosing markers
                        output.append("% :::include::start -- do not remove").append("\n");
                        output.append(expanded);
                        output.append("% :::include::end -- do not remove").append("\n");
                        state = State.NORMAL_TEXT;

                    } else {
                        // Regular line in the include template
                        expanded.append(line).append("\n");
                    }
                }
            }
        }

        if (state != State.NORMAL_TEXT) {
            throw new RuntimeException("Premature end of file in " + state);
        }

        return output.toString();
    }

    // Extracts path and tag from ":::include some/path/to/Source.java[tag-name]"
    public static Pattern DIRECTIVE = Pattern.compile(":::\\{include}\\s+([^\\[]+)\\[([^]]*).*");

    public static void expandIncludeDirective(String input, Map<String, String> subst, StringBuilder output) throws IOException {

        Matcher matcher = DIRECTIVE.matcher(input);

        if (!matcher.matches()) {
            throw new RuntimeException("Invalid directive: " + input);
        }

        String path = matcher.group(1);
        String tag = matcher.group(2);

        // Brute force replacement of placeholders
        for (var kv: subst.entrySet()) {
            path = path.replace("{" + kv.getKey() + "}", kv.getValue());
        }

        expandTaggedFile(path, tag, output);
    }

    public static void expandTaggedFile(String path, String tag, StringBuilder output) throws IOException {
        File file = new File(path);
        String content = Files.readString(file.toPath());
        var reader = new BufferedReader(new StringReader(content));

        String startTag = "//tag::" + tag;
        String endTag = "//end::" + tag;

        String line;
        int pos;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if ((pos = line.indexOf(startTag)) >= 0) {
                found = true;
                while((line = reader.readLine()) != null) {
                    if (line.contains(endTag)) {
                        return;
                    }
                    // If the line has more characters than the tag's initial position,
                    // assume it's whitespace and truncate it to remove indentation.
                    if (line.length() > pos) {
                        line = line.substring(pos);
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

    // TODO: write proper tests
    public static void main0(String[] args) throws IOException {
        var string = ":::{include} {doc-tests-src}/api_conventions/ApiConventionsTest.java[blocking-and-async]";

        Matcher matcher = DIRECTIVE.matcher(string);
        if (matcher.matches()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println(i + " - " + matcher.group(i));
            }
        } else {
            System.out.println("No match found");
        }

    }


    public static void main1(String[] args) throws IOException {

        System.out.println(expandText("""
            Text before

            <!-- :::include
            ```java
            ElasticsearchTransport transport = ...
            :::{include} {doc-tests-src}/api_conventions/ApiConventionsTest.java[blocking-and-async]
            transport.close();
            ```
            -->
            % :::include::start -- do not remove

            ```java
            ElasticsearchTransport transport = ...

            ```

            % :::include::end -- do not remove

            Text after
            """,
            Map.of("doc-tests-src", "java-client/src/test/java/co/elastic/clients/documentation"),
            "some-path"
        ));

    }
}
