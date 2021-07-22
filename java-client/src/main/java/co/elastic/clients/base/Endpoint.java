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

package co.elastic.clients.base;

import co.elastic.clients.json.JsonpDeserializer;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

/**
 * And endpoint links request and responses to protocol encoding. It also defines the error response
 * when the server cannot perform the request.
 *
 * @param <RequestT> the endpoint's request
 * @param <ResponseT> the endpoint's response. Use {@code Void} when there's no response body.
 * @param <ErrorT> the endpoint's error type. Use {@code Void} when error responses have no body.
 */
public interface Endpoint<RequestT, ResponseT, ErrorT> {
  /**
   * The endpoint's http method
   */
  String method(RequestT request);
  /**
   * Build the URL path for a request
   */
  String requestUrl(RequestT request);

  /**
   * Build the query parameters for a request
   */
  default Map<String, String> queryParameters(RequestT request) {
    return Collections.emptyMap();
  }

  /**
   * Build the headers for a request
   */
  default Map<String, String> headers(RequestT request) {
    return Collections.emptyMap();
  }

  boolean hasRequestBody();

  /**
   * The entity parser for the response body. Can be {@code null} to indicate that there's no response body.
   */
  @Nullable
  JsonpDeserializer<ResponseT> responseParser();

  // TODO: combine isError and errorParser in a single method with a tri-state result?
  boolean isError(int statusCode);

  /**
   * The entity parser for the error response body. Can be {@code null} to indicate that there's no error body.
   */
  @Nullable
  JsonpDeserializer<ErrorT> errorParser(int statusCode);

  class Simple<RequestT, ResponseT> implements Endpoint<RequestT, ResponseT, ElasticsearchError> {

    private static final Function<?, Map<String, String>> EMPTY_MAP = x -> Collections.emptyMap();

    /**
     * Returns a function that always returns an empty String to String map. Useful to avoid creating lots of
     * duplicate lambdas in endpoints that don't have headers or parameters.
     */
    @SuppressWarnings("unchecked")
    public static <T> Function<T, Map<String, String>> emptyMap() {
      return (Function<T, Map<String, String>>) EMPTY_MAP;
    }

    private final Function<RequestT, String> method;
    private final Function<RequestT, String> requestUrl;
    private final Function<RequestT, Map<String, String>> queryParameters;
    private final Function<RequestT, Map<String, String>> headers;
    private final boolean hasRequestBody;
    private final JsonpDeserializer<ResponseT> responseParser;

    public Simple(
      Function<RequestT, String> method,
      Function<RequestT, String> requestUrl,
      Function<RequestT, Map<String, String>> queryParameters,
      Function<RequestT, Map<String, String>> headers,
      boolean hasRequestBody,
      JsonpDeserializer<ResponseT> responseParser
    ) {
      this.method = method;
      this.requestUrl = requestUrl;
      this.queryParameters = queryParameters;
      this.headers = headers;
      this.hasRequestBody = hasRequestBody;
      this.responseParser = responseParser;
    }

    @Override
    public String method(RequestT request) {
      return this.method.apply(request);
    }

    @Override
    public String requestUrl(RequestT request) {
      return this.requestUrl.apply(request);
    }

    @Override
    public Map<String, String> queryParameters(RequestT request) {
      return this.queryParameters.apply(request);
    }

    @Override
    public Map<String, String> headers(RequestT request) {
      return this.headers.apply(request);
    }

    @Override
    public boolean hasRequestBody() {
      return this.hasRequestBody;
    }

    @Override
    public JsonpDeserializer<ResponseT> responseParser() {
      return this.responseParser;
    }

    // ES-specific
    @Override
    public boolean isError(int statusCode) {
      return statusCode >= 400;
    }

    @Override
    public JsonpDeserializer<ElasticsearchError> errorParser(int statusCode) {
      return ElasticsearchError.PARSER;
    }

    public <NewResponseT> Simple<RequestT, NewResponseT> withResponseDeserializer(JsonpDeserializer<NewResponseT> newResponseParser) {
      return new Simple<>(
          method,
          requestUrl,
          queryParameters,
          headers,
          hasRequestBody,
          newResponseParser
      );
    }

    public static RuntimeException noPathTemplateFound(String what) {
      return new RuntimeException("Could not find a request " + what + " with this set of properties. " +
          "Please check the API documentation, or raise an issue if this should be a valid request.");
    }
  }

  class Boolean<RequestT> extends Simple<RequestT, BooleanResponse> {

    public Boolean(
        Function<RequestT, String> method,
        Function<RequestT, String> requestUrl,
        Function<RequestT,
        Map<String, String>> queryParameters,
        Function<RequestT, Map<String, String>> headers,
        boolean hasRequestBody, // always true
        JsonpDeserializer<BooleanResponse> responseParser // always null
    ) {
      super(method, requestUrl, queryParameters, headers, hasRequestBody, responseParser);
    }

    @Override
    public boolean isError(int statusCode) {
      return statusCode >= 500;
    }

    public boolean getResult(int statusCode) {
      return statusCode < 400;
    }
  }
}
