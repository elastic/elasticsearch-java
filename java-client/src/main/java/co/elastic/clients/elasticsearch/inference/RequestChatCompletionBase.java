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

import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.inference.chat_completion_unified.CompletionTool;
import co.elastic.clients.elasticsearch.inference.chat_completion_unified.CompletionToolType;
import co.elastic.clients.elasticsearch.inference.chat_completion_unified.Message;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: inference._types.RequestChatCompletionBase

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.RequestChatCompletionBase">API
 *      specification</a>
 */

public abstract class RequestChatCompletionBase extends RequestBase implements JsonpSerializable {
	private final List<Message> messages;

	@Nullable
	private final String model;

	@Nullable
	private final Long maxCompletionTokens;

	private final List<String> stop;

	@Nullable
	private final Float temperature;

	@Nullable
	private final CompletionToolType toolChoice;

	private final List<CompletionTool> tools;

	@Nullable
	private final Float topP;

	// ---------------------------------------------------------------------------------------------

	protected RequestChatCompletionBase(AbstractBuilder<?> builder) {

		this.messages = ApiTypeHelper.unmodifiableRequired(builder.messages, this, "messages");
		this.model = builder.model;
		this.maxCompletionTokens = builder.maxCompletionTokens;
		this.stop = ApiTypeHelper.unmodifiable(builder.stop);
		this.temperature = builder.temperature;
		this.toolChoice = builder.toolChoice;
		this.tools = ApiTypeHelper.unmodifiable(builder.tools);
		this.topP = builder.topP;

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
		if (this.maxCompletionTokens != null) {
			generator.writeKey("max_completion_tokens");
			generator.write(this.maxCompletionTokens);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				RequestBase.AbstractBuilder<BuilderT> {
		private List<Message> messages;

		@Nullable
		private String model;

		@Nullable
		private Long maxCompletionTokens;

		@Nullable
		private List<String> stop;

		@Nullable
		private Float temperature;

		@Nullable
		private CompletionToolType toolChoice;

		@Nullable
		private List<CompletionTool> tools;

		@Nullable
		private Float topP;

		/**
		 * Required - A list of objects representing the conversation.
		 * <p>
		 * API name: {@code messages}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>messages</code>.
		 */
		public final BuilderT messages(List<Message> list) {
			this.messages = _listAddAll(this.messages, list);
			return self();
		}

		/**
		 * Required - A list of objects representing the conversation.
		 * <p>
		 * API name: {@code messages}
		 * <p>
		 * Adds one or more values to <code>messages</code>.
		 */
		public final BuilderT messages(Message value, Message... values) {
			this.messages = _listAdd(this.messages, value, values);
			return self();
		}

		/**
		 * Required - A list of objects representing the conversation.
		 * <p>
		 * API name: {@code messages}
		 * <p>
		 * Adds a value to <code>messages</code> using a builder lambda.
		 */
		public final BuilderT messages(Function<Message.Builder, ObjectBuilder<Message>> fn) {
			return messages(fn.apply(new Message.Builder()).build());
		}

		/**
		 * The ID of the model to use.
		 * <p>
		 * API name: {@code model}
		 */
		public final BuilderT model(@Nullable String value) {
			this.model = value;
			return self();
		}

		/**
		 * The upper bound limit for the number of tokens that can be generated for a
		 * completion request.
		 * <p>
		 * API name: {@code max_completion_tokens}
		 */
		public final BuilderT maxCompletionTokens(@Nullable Long value) {
			this.maxCompletionTokens = value;
			return self();
		}

		/**
		 * A sequence of strings to control when the model should stop generating
		 * additional tokens.
		 * <p>
		 * API name: {@code stop}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stop</code>.
		 */
		public final BuilderT stop(List<String> list) {
			this.stop = _listAddAll(this.stop, list);
			return self();
		}

		/**
		 * A sequence of strings to control when the model should stop generating
		 * additional tokens.
		 * <p>
		 * API name: {@code stop}
		 * <p>
		 * Adds one or more values to <code>stop</code>.
		 */
		public final BuilderT stop(String value, String... values) {
			this.stop = _listAdd(this.stop, value, values);
			return self();
		}

		/**
		 * The sampling temperature to use.
		 * <p>
		 * API name: {@code temperature}
		 */
		public final BuilderT temperature(@Nullable Float value) {
			this.temperature = value;
			return self();
		}

		/**
		 * Controls which tool is called by the model.
		 * <p>
		 * API name: {@code tool_choice}
		 */
		public final BuilderT toolChoice(@Nullable CompletionToolType value) {
			this.toolChoice = value;
			return self();
		}

		/**
		 * Controls which tool is called by the model.
		 * <p>
		 * API name: {@code tool_choice}
		 */
		public final BuilderT toolChoice(Function<CompletionToolType.Builder, ObjectBuilder<CompletionToolType>> fn) {
			return this.toolChoice(fn.apply(new CompletionToolType.Builder()).build());
		}

		/**
		 * A list of tools that the model can call.
		 * <p>
		 * API name: {@code tools}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tools</code>.
		 */
		public final BuilderT tools(List<CompletionTool> list) {
			this.tools = _listAddAll(this.tools, list);
			return self();
		}

		/**
		 * A list of tools that the model can call.
		 * <p>
		 * API name: {@code tools}
		 * <p>
		 * Adds one or more values to <code>tools</code>.
		 */
		public final BuilderT tools(CompletionTool value, CompletionTool... values) {
			this.tools = _listAdd(this.tools, value, values);
			return self();
		}

		/**
		 * A list of tools that the model can call.
		 * <p>
		 * API name: {@code tools}
		 * <p>
		 * Adds a value to <code>tools</code> using a builder lambda.
		 */
		public final BuilderT tools(Function<CompletionTool.Builder, ObjectBuilder<CompletionTool>> fn) {
			return tools(fn.apply(new CompletionTool.Builder()).build());
		}

		/**
		 * Nucleus sampling, an alternative to sampling with temperature.
		 * <p>
		 * API name: {@code top_p}
		 */
		public final BuilderT topP(@Nullable Float value) {
			this.topP = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRequestChatCompletionBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::messages, JsonpDeserializer.arrayDeserializer(Message._DESERIALIZER), "messages");
		op.add(AbstractBuilder::model, JsonpDeserializer.stringDeserializer(), "model");
		op.add(AbstractBuilder::maxCompletionTokens, JsonpDeserializer.longDeserializer(), "max_completion_tokens");
		op.add(AbstractBuilder::stop, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stop");
		op.add(AbstractBuilder::temperature, JsonpDeserializer.floatDeserializer(), "temperature");
		op.add(AbstractBuilder::toolChoice, CompletionToolType._DESERIALIZER, "tool_choice");
		op.add(AbstractBuilder::tools, JsonpDeserializer.arrayDeserializer(CompletionTool._DESERIALIZER), "tools");
		op.add(AbstractBuilder::topP, JsonpDeserializer.floatDeserializer(), "top_p");

	}

}
