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

package co.elastic.clients.transport.endpoints;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.JsonEndpoint;
import jakarta.json.stream.JsonParser;

import javax.annotation.Nullable;

/**
 * An endpoint wrapper that adds attributes to the JSON mapper used to deserialize its response.
 */
public class EndpointWithResponseMapperAttr<Req, Res, Err> extends DelegatingJsonEndpoint<Req, Res, Err> {

    private final String attrName;
    private final Object attrValue;

    public EndpointWithResponseMapperAttr(JsonEndpoint<Req, Res, Err> endpoint, String attrName, Object attrValue) {
        super(endpoint);
        this.attrName = attrName;
        this.attrValue = attrValue;
    }

    @Nullable
    @Override
    public JsonpDeserializer<Res> responseDeserializer() {
        return new DelegatingDeserializer.SameType<Res>() {
            @Override
            protected JsonpDeserializer<Res> unwrap() {
                return endpoint.responseDeserializer();
            }

            @Override
            public Res deserialize(JsonParser parser, JsonpMapper mapper) {
                mapper = mapper.withAttribute(attrName, attrValue);
                return super.deserialize(parser, mapper);
            }

            @Override
            public Res deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                mapper = mapper.withAttribute(attrName, attrValue);
                return super.deserialize(parser, mapper, event);
            }
        };
    }
}
