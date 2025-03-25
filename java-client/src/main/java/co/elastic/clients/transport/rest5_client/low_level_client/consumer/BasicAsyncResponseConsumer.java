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

package co.elastic.clients.transport.rest5_client.low_level_client.consumer;


import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.apache.hc.core5.http.nio.entity.AbstractBinAsyncEntityConsumer;
import org.apache.hc.core5.http.nio.support.AbstractAsyncResponseConsumer;
import org.apache.hc.core5.http.protocol.HttpContext;

public class BasicAsyncResponseConsumer extends AbstractAsyncResponseConsumer<ClassicHttpResponse,
    ByteArrayEntity> {

    private volatile BasicClassicHttpResponse finalResponse;
    private volatile HttpResponse response;
    private volatile HttpContext context;

    /**
     * Creates a new instance of this consumer with the provided buffer limit
     */
    public BasicAsyncResponseConsumer(AbstractBinAsyncEntityConsumer consumer) {
        super(consumer);
    }

    @Override
    public void informationResponse(HttpResponse response, HttpContext context) {
        this.response = response;
        this.context = context;
    }

    @Override
    protected BasicClassicHttpResponse buildResult(HttpResponse response, ByteArrayEntity entity,
                                                   ContentType contentType) {
        finalResponse = new BasicClassicHttpResponse(response.getCode(), response.getReasonPhrase());
        finalResponse.setEntity(entity);
        finalResponse.setHeaders(response.getHeaders());
        return finalResponse;
    }
}
