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

// typedef: inference._types.ChatCompletionInferenceResult

/**
 * The response format for the non-streaming unified chat completion request.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ChatCompletionInferenceResult">API
 *      specification</a>
 */

public abstract class ChatCompletionInferenceResult implements JsonpSerializable {
	private final String id;

	private final List<ChatCompletionChoice> choices;

	private final String model;

	private final String object;

	@Nullable
	private final ChatCompletionUsage usage;

	// ---------------------------------------------------------------------------------------------

	protected ChatCompletionInferenceResult(AbstractBuilder<?> builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.choices = ApiTypeHelper.unmodifiable(builder.choices);
		this.model = ApiTypeHelper.requireNonNull(builder.model, this, "model");
		this.object = ApiTypeHelper.requireNonNull(builder.object, this, "object");
		this.usage = builder.usage;

	}

	/**
	 * Required - The unique identifier for the completion.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * The list of completion choices the model generated for the input message.
	 * <p>
	 * API name: {@code choices}
	 */
	public final List<ChatCompletionChoice> choices() {
		return this.choices;
	}

	/**
	 * Required - The model used to generate the completion.
	 * <p>
	 * API name: {@code model}
	 */
	public final String model() {
		return this.model;
	}

	/**
	 * Required - The object type.
	 * <p>
	 * API name: {@code object}
	 */
	public final String object() {
		return this.object;
	}

	/**
	 * The token usage statistics for the completion request. Omitted when usage
	 * information is not available.
	 * <p>
	 * API name: {@code usage}
	 */
	@Nullable
	public final ChatCompletionUsage usage() {
		return this.usage;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (ApiTypeHelper.isDefined(this.choices)) {
			generator.writeKey("choices");
			generator.writeStartArray();
			for (ChatCompletionChoice item0 : this.choices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("model");
		generator.write(this.model);

		generator.writeKey("object");
		generator.write(this.object);

		if (this.usage != null) {
			generator.writeKey("usage");
			this.usage.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String id;

		@Nullable
		private List<ChatCompletionChoice> choices;

		private String model;

		private String object;

		@Nullable
		private ChatCompletionUsage usage;

		/**
		 * Required - The unique identifier for the completion.
		 * <p>
		 * API name: {@code id}
		 */
		public final BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * The list of completion choices the model generated for the input message.
		 * <p>
		 * API name: {@code choices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>choices</code>.
		 */
		public final BuilderT choices(List<ChatCompletionChoice> list) {
			this.choices = _listAddAll(this.choices, list);
			return self();
		}

		/**
		 * The list of completion choices the model generated for the input message.
		 * <p>
		 * API name: {@code choices}
		 * <p>
		 * Adds one or more values to <code>choices</code>.
		 */
		public final BuilderT choices(ChatCompletionChoice value, ChatCompletionChoice... values) {
			this.choices = _listAdd(this.choices, value, values);
			return self();
		}

		/**
		 * The list of completion choices the model generated for the input message.
		 * <p>
		 * API name: {@code choices}
		 * <p>
		 * Adds a value to <code>choices</code> using a builder lambda.
		 */
		public final BuilderT choices(Function<ChatCompletionChoice.Builder, ObjectBuilder<ChatCompletionChoice>> fn) {
			return choices(fn.apply(new ChatCompletionChoice.Builder()).build());
		}

		/**
		 * Required - The model used to generate the completion.
		 * <p>
		 * API name: {@code model}
		 */
		public final BuilderT model(String value) {
			this.model = value;
			return self();
		}

		/**
		 * Required - The object type.
		 * <p>
		 * API name: {@code object}
		 */
		public final BuilderT object(String value) {
			this.object = value;
			return self();
		}

		/**
		 * The token usage statistics for the completion request. Omitted when usage
		 * information is not available.
		 * <p>
		 * API name: {@code usage}
		 */
		public final BuilderT usage(@Nullable ChatCompletionUsage value) {
			this.usage = value;
			return self();
		}

		/**
		 * The token usage statistics for the completion request. Omitted when usage
		 * information is not available.
		 * <p>
		 * API name: {@code usage}
		 */
		public final BuilderT usage(Function<ChatCompletionUsage.Builder, ObjectBuilder<ChatCompletionUsage>> fn) {
			return this.usage(fn.apply(new ChatCompletionUsage.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupChatCompletionInferenceResultDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::choices, JsonpDeserializer.arrayDeserializer(ChatCompletionChoice._DESERIALIZER),
				"choices");
		op.add(AbstractBuilder::model, JsonpDeserializer.stringDeserializer(), "model");
		op.add(AbstractBuilder::object, JsonpDeserializer.stringDeserializer(), "object");
		op.add(AbstractBuilder::usage, ChatCompletionUsage._DESERIALIZER, "usage");

	}

}
