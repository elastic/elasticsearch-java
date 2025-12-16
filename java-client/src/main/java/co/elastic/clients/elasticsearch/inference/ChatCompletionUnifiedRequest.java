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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: inference.chat_completion_unified.Request

/**
 * Perform chat completion inference
 * <p>
 * The chat completion inference API enables real-time responses for chat
 * completion tasks by delivering answers incrementally, reducing response times
 * during computation. It only works with the <code>chat_completion</code> task
 * type.
 * <p>
 * NOTE: The <code>chat_completion</code> task type is only available within the
 * _stream API and only supports streaming. The Chat completion inference API
 * and the Stream inference API differ in their response structure and
 * capabilities. The Chat completion inference API provides more comprehensive
 * customization options through more fields and function calling support. To
 * determine whether a given inference service supports this task type, please
 * see the page for that service.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.chat_completion_unified.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChatCompletionUnifiedRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	@Nullable
	private final Time timeout;

	private final RequestChatCompletion chatCompletionRequest;

	// ---------------------------------------------------------------------------------------------

	private ChatCompletionUnifiedRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.timeout = builder.timeout;
		this.chatCompletionRequest = ApiTypeHelper.requireNonNull(builder.chatCompletionRequest, this,
				"chatCompletionRequest");

	}

	public static ChatCompletionUnifiedRequest of(Function<Builder, ObjectBuilder<ChatCompletionUnifiedRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The inference Id
	 * <p>
	 * API name: {@code inference_id}
	 */
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * Specifies the amount of time to wait for the inference request to complete.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Required - Request body.
	 */
	public final RequestChatCompletion chatCompletionRequest() {
		return this.chatCompletionRequest;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.chatCompletionRequest.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChatCompletionUnifiedRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ChatCompletionUnifiedRequest> {
		private String inferenceId;

		@Nullable
		private Time timeout;

		private RequestChatCompletion chatCompletionRequest;

		/**
		 * Required - The inference Id
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Request body.
		 */
		public final Builder chatCompletionRequest(RequestChatCompletion value) {
			this.chatCompletionRequest = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder chatCompletionRequest(
				Function<RequestChatCompletion.Builder, ObjectBuilder<RequestChatCompletion>> fn) {
			return this.chatCompletionRequest(fn.apply(new RequestChatCompletion.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			RequestChatCompletion value = (RequestChatCompletion) RequestChatCompletion._DESERIALIZER
					.deserialize(parser, mapper);
			return this.chatCompletionRequest(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChatCompletionUnifiedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChatCompletionUnifiedRequest build() {
			_checkSingleUse();

			return new ChatCompletionUnifiedRequest(this);
		}
	}

	public static final JsonpDeserializer<ChatCompletionUnifiedRequest> _DESERIALIZER = createChatCompletionUnifiedRequestDeserializer();
	protected static JsonpDeserializer<ChatCompletionUnifiedRequest> createChatCompletionUnifiedRequestDeserializer() {

		JsonpDeserializer<RequestChatCompletion> valueDeserializer = RequestChatCompletion._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.chatCompletionRequest(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.chat_completion_unified}".
	 */
	public static final Endpoint<ChatCompletionUnifiedRequest, BinaryResponse, ErrorResponse> _ENDPOINT = new BinaryEndpoint<>(
			"es/inference.chat_completion_unified",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _inferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _inferenceId;

				if (propsSet == (_inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/chat_completion");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					buf.append("/_stream");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _inferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _inferenceId;

				if (propsSet == (_inferenceId)) {
					params.put("inferenceId", request.inferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);
}
