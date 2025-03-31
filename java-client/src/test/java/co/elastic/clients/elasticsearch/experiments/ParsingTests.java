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

package co.elastic.clients.elasticsearch.experiments;

import co.elastic.clients.elasticsearch.experiments.api.FooRequest;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class ParsingTests extends Assertions {

  @Test
  public void testFoo() throws Exception {

    try {

      ByteArrayOutputStream baos = new ByteArrayOutputStream();

      FooRequest foo = FooRequest.builder()
          .name("z")
          .value(1)
          .indices("a", "b", "c")
          .bar(b -> b
              .name("Raise the bar")
          )
          .build();

      JsonProvider provider = JsonpUtils.provider();
      JsonGenerator generator = provider.createGenerator(baos);
      foo.serialize(generator, new JsonbJsonpMapper());

      generator.close();
      String str = baos.toString();

      assertEquals("{\"name\":\"z\",\"value\":1,\"indices\":[\"a\",\"b\",\"c\"],\"bar\":{\"name\":\"Raise the bar\"}}", str);

      JsonParser parser = provider.createParser(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));

      FooRequest foo2 = FooRequest.parser().deserialize(parser, new JsonbJsonpMapper());

      assertEquals(foo.name(), foo2.name());
      assertEquals(foo.value(), foo2.value());
      assertNull(foo2.size());
      assertEquals(foo.indices(), foo2.indices());
      assertEquals("Raise the bar", foo.bar().name());
    } catch (JsonParsingException je) {
      throw new JsonParsingException(je.getMessage() + " at " + je.getLocation(), je, je.getLocation());
    }
  }
}
