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

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.util.TokenBuffer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Jackson3JsonBufferTest {

  private Jackson3JsonpMapper mapper() {
    return new Jackson3JsonpMapper(new JsonMapper());
  }

  @Test
  public void testToString_rendersJson() {
    TokenBuffer buffer = TokenBuffer.forGeneration();
    buffer.writeStartObject();
    buffer.writeStringProperty("foo", "bar");
    buffer.writeNumberProperty("baz", 42);
    buffer.writeEndObject();

    Jackson3JsonBuffer jsonBuffer = new Jackson3JsonBuffer(buffer, mapper());
    String json = jsonBuffer.toString();
    assertTrue(json.contains("\"foo\":\"bar\""));
    assertTrue(json.contains("\"baz\":42"));
    assertTrue(json.startsWith("{") && json.endsWith("}"));
  }

  @Test
  public void testToString_emptyBuffer() {
    TokenBuffer buffer = TokenBuffer.forGeneration();
    Jackson3JsonBuffer jsonBuffer = new Jackson3JsonBuffer(buffer, mapper());
    String json = jsonBuffer.toString();
    assertEquals(StringUtils.EMPTY, json.trim());
  }

  @Test
  public void testToString_invalidBuffer() {
    TokenBuffer buffer = TokenBuffer.forGeneration();

    // Write some invalid JSON (start object but don't close)
    buffer.writeStartObject();
    Jackson3JsonBuffer jsonBuffer = new Jackson3JsonBuffer(buffer, mapper());
    String json = jsonBuffer.toString();
    // Should not throw, but may contain error or partial output
    assertTrue(json.startsWith("{"));
  }
}
