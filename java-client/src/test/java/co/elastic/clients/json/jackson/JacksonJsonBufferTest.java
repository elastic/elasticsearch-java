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

package co.elastic.clients.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JacksonJsonBufferTest {

  private JacksonJsonpMapper mapper() {
    return new JacksonJsonpMapper(new ObjectMapper());
  }

  @Test
  public void testToString_rendersJson() throws Exception {
    ObjectMapper om = new ObjectMapper();
    TokenBuffer buffer = new TokenBuffer(om, false);
    buffer.writeStartObject();
    buffer.writeStringField("foo", "bar");
    buffer.writeNumberField("baz", 42);
    buffer.writeEndObject();

    JacksonJsonBuffer jsonBuffer = new JacksonJsonBuffer(buffer, mapper());
    String json = jsonBuffer.toString();
    assertTrue(json.contains("\"foo\":\"bar\""));
    assertTrue(json.contains("\"baz\":42"));
    assertTrue(json.startsWith("{") && json.endsWith("}"));
  }

  @Test
  public void testToString_emptyBuffer() throws Exception {
    ObjectMapper om = new ObjectMapper();
    TokenBuffer buffer = new TokenBuffer(om, false);
    JacksonJsonBuffer jsonBuffer = new JacksonJsonBuffer(buffer, mapper());
    String json = jsonBuffer.toString();
    assertEquals(StringUtils.EMPTY, json.trim());
  }

  @Test
  public void testToString_invalidBuffer() throws Exception {
    ObjectMapper om = new ObjectMapper();
    TokenBuffer buffer = new TokenBuffer(om, false);
    // Write some invalid JSON (start object but don't close)
    buffer.writeStartObject();
    JacksonJsonBuffer jsonBuffer = new JacksonJsonBuffer(buffer, mapper());
    String json = jsonBuffer.toString();
    // Should not throw, but may contain error or partial output
    assertTrue(json.startsWith("{"));
  }
}
