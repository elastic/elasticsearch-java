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
<<<<<<< HEAD
<<<<<<< HEAD
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
=======
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
>>>>>>> 03828daff (regen from latest spec)
=======
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
>>>>>>> c49af58dc (Revert "temp rebase fix")
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
<<<<<<< HEAD
<<<<<<< HEAD
import jakarta.json.stream.JsonParser;
=======
>>>>>>> 03828daff (regen from latest spec)
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
import java.lang.String;
import java.util.Collections;
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

// typedef: inference.post_eis_chat_completion.Request

/**
 * Perform a chat completion task through the Elastic Inference Service (EIS).
 * <p>
 * Perform a chat completion inference task with the <code>elastic</code>
 * service.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.post_eis_chat_completion.Request">API
 *      specification</a>
 */
@JsonpDeserializable
<<<<<<< HEAD
<<<<<<< HEAD
public class PostEisChatCompletionRequest extends RequestBase implements JsonpSerializable {
	private final String eisInferenceId;

	private final RequestChatCompletion chatCompletionRequest;

	// ---------------------------------------------------------------------------------------------

	private PostEisChatCompletionRequest(Builder builder) {

		this.eisInferenceId = ApiTypeHelper.requireNonNull(builder.eisInferenceId, this, "eisInferenceId");
		this.chatCompletionRequest = ApiTypeHelper.requireNonNull(builder.chatCompletionRequest, this,
				"chatCompletionRequest");
=======
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
public class PostEisChatCompletionRequest extends RequestChatCompletionBase {
	private final String eisInferenceId;

	// ---------------------------------------------------------------------------------------------

	private PostEisChatCompletionRequest(Builder builder) {
		super(builder);

		this.eisInferenceId = ApiTypeHelper.requireNonNull(builder.eisInferenceId, this, "eisInferenceId");
<<<<<<< HEAD
>>>>>>> 03828daff (regen from latest spec)
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")

	}

	public static PostEisChatCompletionRequest of(Function<Builder, ObjectBuilder<PostEisChatCompletionRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code eis_inference_id}
	 */
	public final String eisInferenceId() {
		return this.eisInferenceId;
	}

<<<<<<< HEAD
<<<<<<< HEAD
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

=======
>>>>>>> 03828daff (regen from latest spec)
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostEisChatCompletionRequest}.
	 */

<<<<<<< HEAD
<<<<<<< HEAD
	public static class Builder extends RequestBase.AbstractBuilder<Builder>
=======
	public static class Builder extends RequestChatCompletionBase.AbstractBuilder<Builder>
>>>>>>> 03828daff (regen from latest spec)
=======
	public static class Builder extends RequestChatCompletionBase.AbstractBuilder<Builder>
>>>>>>> c49af58dc (Revert "temp rebase fix")
			implements
				ObjectBuilder<PostEisChatCompletionRequest> {
		private String eisInferenceId;

<<<<<<< HEAD
<<<<<<< HEAD
		private RequestChatCompletion chatCompletionRequest;

=======
>>>>>>> 03828daff (regen from latest spec)
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code eis_inference_id}
		 */
		public final Builder eisInferenceId(String value) {
			this.eisInferenceId = value;
			return this;
		}

<<<<<<< HEAD
<<<<<<< HEAD
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

=======
>>>>>>> 03828daff (regen from latest spec)
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostEisChatCompletionRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostEisChatCompletionRequest build() {
			_checkSingleUse();

			return new PostEisChatCompletionRequest(this);
		}
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public static final JsonpDeserializer<PostEisChatCompletionRequest> _DESERIALIZER = createPostEisChatCompletionRequestDeserializer();
	protected static JsonpDeserializer<PostEisChatCompletionRequest> createPostEisChatCompletionRequestDeserializer() {

		JsonpDeserializer<RequestChatCompletion> valueDeserializer = RequestChatCompletion._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.chatCompletionRequest(valueDeserializer.deserialize(parser, mapper, event)).build());
=======
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostEisChatCompletionRequest}
	 */
	public static final JsonpDeserializer<PostEisChatCompletionRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PostEisChatCompletionRequest::setupPostEisChatCompletionRequestDeserializer);

	protected static void setupPostEisChatCompletionRequestDeserializer(
			ObjectDeserializer<PostEisChatCompletionRequest.Builder> op) {
		RequestChatCompletionBase.setupRequestChatCompletionBaseDeserializer(op);

<<<<<<< HEAD
>>>>>>> 03828daff (regen from latest spec)
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.post_eis_chat_completion}".
	 */
	public static final Endpoint<PostEisChatCompletionRequest, BinaryResponse, ErrorResponse> _ENDPOINT = new BinaryEndpoint<>(
			"es/inference.post_eis_chat_completion",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _eisInferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _eisInferenceId;

				if (propsSet == (_eisInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/chat_completion");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.eisInferenceId, buf);
					buf.append("/_stream");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _eisInferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _eisInferenceId;

				if (propsSet == (_eisInferenceId)) {
					params.put("eisInferenceId", request.eisInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, null);
}
