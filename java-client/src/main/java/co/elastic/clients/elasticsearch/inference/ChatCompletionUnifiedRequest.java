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
import co.elastic.clients.elasticsearch.inference.chat_completion_unified.CompletionTool;
import co.elastic.clients.elasticsearch.inference.chat_completion_unified.CompletionToolType;
import co.elastic.clients.elasticsearch.inference.chat_completion_unified.Message;
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
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
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
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.chat_completion_unified.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChatCompletionUnifiedRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	@Nullable
	private final Long maxCompletionTokens;

	private final List<Message> messages;

	@Nullable
	private final String model;

	private final List<String> stop;

	@Nullable
	private final Float temperature;

	@Nullable
	private final Time timeout;

	@Nullable
	private final CompletionToolType toolChoice;

	private final List<CompletionTool> tools;

	@Nullable
	private final Float topP;

	// ---------------------------------------------------------------------------------------------

	private ChatCompletionUnifiedRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.maxCompletionTokens = builder.maxCompletionTokens;
		this.messages = ApiTypeHelper.unmodifiableRequired(builder.messages, this, "messages");
		this.model = builder.model;
		this.stop = ApiTypeHelper.unmodifiable(builder.stop);
		this.temperature = builder.temperature;
		this.timeout = builder.timeout;
		this.toolChoice = builder.toolChoice;
		this.tools = ApiTypeHelper.unmodifiable(builder.tools);
		this.topP = builder.topP;

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
	 * The upper bound limit for the number of tokens that can be generated for a
	 * completion request.
	 * <p>
	 * API name: {@code max_completion_tokens}
	 */
	@Nullable
	public final Long maxCompletionTokens() {
		return this.maxCompletionTokens;
	}

	/**
	 * Required - A list of objects representing the conversation.
	 * <p>
	 * API name: {@code messages}
	 */
	public final List<Message> messages() {
		return this.messages;
	}

	/**
	 * The ID of the model to use.
	 * <p>
	 * API name: {@code model}
	 */
	@Nullable
	public final String model() {
		return this.model;
	}

	/**
	 * A sequence of strings to control when the model should stop generating
	 * additional tokens.
	 * <p>
	 * API name: {@code stop}
	 */
	public final List<String> stop() {
		return this.stop;
	}

	/**
	 * The sampling temperature to use.
	 * <p>
	 * API name: {@code temperature}
	 */
	@Nullable
	public final Float temperature() {
		return this.temperature;
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
	 * Controls which tool is called by the model.
	 * <p>
	 * API name: {@code tool_choice}
	 */
	@Nullable
	public final CompletionToolType toolChoice() {
		return this.toolChoice;
	}

	/**
	 * A list of tools that the model can call.
	 * <p>
	 * API name: {@code tools}
	 */
	public final List<CompletionTool> tools() {
		return this.tools;
	}

	/**
	 * Nucleus sampling, an alternative to sampling with temperature.
	 * <p>
	 * API name: {@code top_p}
	 */
	@Nullable
	public final Float topP() {
		return this.topP;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.maxCompletionTokens != null) {
			generator.writeKey("max_completion_tokens");
			generator.write(this.maxCompletionTokens);

		}
		if (ApiTypeHelper.isDefined(this.messages)) {
			generator.writeKey("messages");
			generator.writeStartArray();
			for (Message item0 : this.messages) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.model != null) {
			generator.writeKey("model");
			generator.write(this.model);

		}
		if (ApiTypeHelper.isDefined(this.stop)) {
			generator.writeKey("stop");
			generator.writeStartArray();
			for (String item0 : this.stop) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.temperature != null) {
			generator.writeKey("temperature");
			generator.write(this.temperature);

		}
		if (this.toolChoice != null) {
			generator.writeKey("tool_choice");
			this.toolChoice.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.tools)) {
			generator.writeKey("tools");
			generator.writeStartArray();
			for (CompletionTool item0 : this.tools) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.topP != null) {
			generator.writeKey("top_p");
			generator.write(this.topP);

		}

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
		private Long maxCompletionTokens;

		private List<Message> messages;

		@Nullable
		private String model;

		@Nullable
		private List<String> stop;

		@Nullable
		private Float temperature;

		@Nullable
		private Time timeout;

		@Nullable
		private CompletionToolType toolChoice;

		@Nullable
		private List<CompletionTool> tools;

		@Nullable
		private Float topP;

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
		 * The upper bound limit for the number of tokens that can be generated for a
		 * completion request.
		 * <p>
		 * API name: {@code max_completion_tokens}
		 */
		public final Builder maxCompletionTokens(@Nullable Long value) {
			this.maxCompletionTokens = value;
			return this;
		}

		/**
		 * Required - A list of objects representing the conversation.
		 * <p>
		 * API name: {@code messages}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>messages</code>.
		 */
		public final Builder messages(List<Message> list) {
			this.messages = _listAddAll(this.messages, list);
			return this;
		}

		/**
		 * Required - A list of objects representing the conversation.
		 * <p>
		 * API name: {@code messages}
		 * <p>
		 * Adds one or more values to <code>messages</code>.
		 */
		public final Builder messages(Message value, Message... values) {
			this.messages = _listAdd(this.messages, value, values);
			return this;
		}

		/**
		 * Required - A list of objects representing the conversation.
		 * <p>
		 * API name: {@code messages}
		 * <p>
		 * Adds a value to <code>messages</code> using a builder lambda.
		 */
		public final Builder messages(Function<Message.Builder, ObjectBuilder<Message>> fn) {
			return messages(fn.apply(new Message.Builder()).build());
		}

		/**
		 * The ID of the model to use.
		 * <p>
		 * API name: {@code model}
		 */
		public final Builder model(@Nullable String value) {
			this.model = value;
			return this;
		}

		/**
		 * A sequence of strings to control when the model should stop generating
		 * additional tokens.
		 * <p>
		 * API name: {@code stop}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stop</code>.
		 */
		public final Builder stop(List<String> list) {
			this.stop = _listAddAll(this.stop, list);
			return this;
		}

		/**
		 * A sequence of strings to control when the model should stop generating
		 * additional tokens.
		 * <p>
		 * API name: {@code stop}
		 * <p>
		 * Adds one or more values to <code>stop</code>.
		 */
		public final Builder stop(String value, String... values) {
			this.stop = _listAdd(this.stop, value, values);
			return this;
		}

		/**
		 * The sampling temperature to use.
		 * <p>
		 * API name: {@code temperature}
		 */
		public final Builder temperature(@Nullable Float value) {
			this.temperature = value;
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
		 * Controls which tool is called by the model.
		 * <p>
		 * API name: {@code tool_choice}
		 */
		public final Builder toolChoice(@Nullable CompletionToolType value) {
			this.toolChoice = value;
			return this;
		}

		/**
		 * Controls which tool is called by the model.
		 * <p>
		 * API name: {@code tool_choice}
		 */
		public final Builder toolChoice(Function<CompletionToolType.Builder, ObjectBuilder<CompletionToolType>> fn) {
			return this.toolChoice(fn.apply(new CompletionToolType.Builder()).build());
		}

		/**
		 * A list of tools that the model can call.
		 * <p>
		 * API name: {@code tools}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tools</code>.
		 */
		public final Builder tools(List<CompletionTool> list) {
			this.tools = _listAddAll(this.tools, list);
			return this;
		}

		/**
		 * A list of tools that the model can call.
		 * <p>
		 * API name: {@code tools}
		 * <p>
		 * Adds one or more values to <code>tools</code>.
		 */
		public final Builder tools(CompletionTool value, CompletionTool... values) {
			this.tools = _listAdd(this.tools, value, values);
			return this;
		}

		/**
		 * A list of tools that the model can call.
		 * <p>
		 * API name: {@code tools}
		 * <p>
		 * Adds a value to <code>tools</code> using a builder lambda.
		 */
		public final Builder tools(Function<CompletionTool.Builder, ObjectBuilder<CompletionTool>> fn) {
			return tools(fn.apply(new CompletionTool.Builder()).build());
		}

		/**
		 * Nucleus sampling, an alternative to sampling with temperature.
		 * <p>
		 * API name: {@code top_p}
		 */
		public final Builder topP(@Nullable Float value) {
			this.topP = value;
			return this;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChatCompletionUnifiedRequest}
	 */
	public static final JsonpDeserializer<ChatCompletionUnifiedRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChatCompletionUnifiedRequest::setupChatCompletionUnifiedRequestDeserializer);

	protected static void setupChatCompletionUnifiedRequestDeserializer(
			ObjectDeserializer<ChatCompletionUnifiedRequest.Builder> op) {

		op.add(Builder::maxCompletionTokens, JsonpDeserializer.longDeserializer(), "max_completion_tokens");
		op.add(Builder::messages, JsonpDeserializer.arrayDeserializer(Message._DESERIALIZER), "messages");
		op.add(Builder::model, JsonpDeserializer.stringDeserializer(), "model");
		op.add(Builder::stop, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "stop");
		op.add(Builder::temperature, JsonpDeserializer.floatDeserializer(), "temperature");
		op.add(Builder::toolChoice, CompletionToolType._DESERIALIZER, "tool_choice");
		op.add(Builder::tools, JsonpDeserializer.arrayDeserializer(CompletionTool._DESERIALIZER), "tools");
		op.add(Builder::topP, JsonpDeserializer.floatDeserializer(), "top_p");

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
