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

package co.elastic.clients.transport;

import co.elastic.clients.ApiClient;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * An endpoint links requests and responses to HTTP protocol encoding. It also defines the error response
 * when the server cannot perform the request.
 * <p>
 * Requests are serialized as JSON by default, unless they implement specific marker interfaces that indicate
 * otherwise and must be handled by the transport processing the request (e.g. {@link co.elastic.clients.json.NdJsonpSerializable}).
 * <p>
 * Response body decoding, when applicable, is defined by child interfaces like {@link JsonEndpoint}.
 *
 * @param <RequestT> the endpoint's request
 * @param <ResponseT> the endpoint's response. Use {@code Void} when there's no response body.
 * @param <ErrorT> the endpoint's error type. Use {@code Void} when error responses have no body.
 */
public interface Endpoint<RequestT, ResponseT, ErrorT> {

  /**
   * The endpoint's identifier.
   */
  String id();

  /**
   * Get the endpoint's HTTP method for a request.
   */
  String method(RequestT request);

  /**
   * Get the URL path for a request.
   */
  String requestUrl(RequestT request);

  /**
   * Get the path parameters for a request.
   */
  default Map<String, String> pathParameters(RequestT request)  {
    return Collections.emptyMap();
  }

  /**
   * Get the query parameters for a request.
   */
  default Map<String, String> queryParameters(RequestT request) {
    return Collections.emptyMap();
  }

  /**
   * Get the HTTP headers for a request.
   */
  default Map<String, String> headers(RequestT request) {
    return Collections.emptyMap();
  }

  /**
   * Get the body for a request. The caller must handle several cases depending on the interface implemented by the result:
   * <li>
   *     {@code null} means the request has no body.
   * </li>
   * <li>
   *     {@link co.elastic.clients.json.NdJsonpSerializable} must be serialized as nd-json.
   * </li>
   * <li>
   *     {@link co.elastic.clients.util.BinaryData} must be serialized as is.
   * </li>
   * <li>
   *     All other objects must be serialized as JSON using a {@link co.elastic.clients.json.JsonpMapper}
   * </li>
   */
  @Nullable
  Object body(RequestT request);

  /**
   * Is this status code to be considered as an error?
   */
  boolean isError(int statusCode);

  /**
   * The entity parser for the error response body. Can be {@code null} to indicate that there's no error body.
   */
  @Nullable
  JsonpDeserializer<ErrorT> errorDeserializer(int statusCode);

  default BinaryEndpoint<RequestT> withBinaryResponse() {
      return new BinaryEndpoint<>(
          this.id(),
          this::method,
          this::requestUrl,
          this::pathParameters,
          this::queryParameters,
          this::headers,
          this::body,
          null
      );
  }

  default ResponseT call(RequestT request, Transport transport) throws IOException {
      return transport.performRequest(request, this, null);
  }

  default ResponseT call(RequestT request, ApiClient<?, ?> client) throws IOException {
    return client._transport().performRequest(request, this, null);
  }

  default CompletableFuture<ResponseT> callAsync(RequestT request, Transport transport) throws IOException {
    return transport.performRequestAsync(request, this, null);
  }

  default CompletableFuture<ResponseT> callAsync(RequestT request, ApiClient<?, ?> client) throws IOException {
    return client._transport().performRequestAsync(request, this, null);
  }
}
