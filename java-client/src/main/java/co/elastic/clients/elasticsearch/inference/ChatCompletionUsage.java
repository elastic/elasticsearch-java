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
import java.lang.Integer;
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

// typedef: inference._types.ChatCompletionUsage

/**
 * Token usage statistics for the request.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ChatCompletionUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChatCompletionUsage implements JsonpSerializable {
	private final int completionTokens;

	private final int promptTokens;

	private final int totalTokens;

	@Nullable
	private final ChatCompletionPromptTokensDetails promptTokensDetails;

	@Nullable
	private final ChatCompletionCompletionTokensDetails completionTokensDetails;

	// ---------------------------------------------------------------------------------------------

	private ChatCompletionUsage(Builder builder) {

		this.completionTokens = ApiTypeHelper.requireNonNull(builder.completionTokens, this, "completionTokens", 0);
		this.promptTokens = ApiTypeHelper.requireNonNull(builder.promptTokens, this, "promptTokens", 0);
		this.totalTokens = ApiTypeHelper.requireNonNull(builder.totalTokens, this, "totalTokens", 0);
		this.promptTokensDetails = builder.promptTokensDetails;
		this.completionTokensDetails = builder.completionTokensDetails;

	}

	public static ChatCompletionUsage of(Function<Builder, ObjectBuilder<ChatCompletionUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of tokens in the generated completion.
	 * <p>
	 * API name: {@code completion_tokens}
	 */
	public final int completionTokens() {
		return this.completionTokens;
	}

	/**
	 * Required - The number of tokens in the prompt.
	 * <p>
	 * API name: {@code prompt_tokens}
	 */
	public final int promptTokens() {
		return this.promptTokens;
	}

	/**
	 * Required - The total number of tokens used (prompt + completion).
	 * <p>
	 * API name: {@code total_tokens}
	 */
	public final int totalTokens() {
		return this.totalTokens;
	}

	/**
	 * Breakdown of the tokens used in the prompt. Omitted when no details are
	 * available.
	 * <p>
	 * API name: {@code prompt_tokens_details}
	 */
	@Nullable
	public final ChatCompletionPromptTokensDetails promptTokensDetails() {
		return this.promptTokensDetails;
	}

	/**
	 * Breakdown of the tokens used in the completion. Omitted when no details are
	 * available.
	 * <p>
	 * API name: {@code completion_tokens_details}
	 */
	@Nullable
	public final ChatCompletionCompletionTokensDetails completionTokensDetails() {
		return this.completionTokensDetails;
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

		generator.writeKey("completion_tokens");
		generator.write(this.completionTokens);

		generator.writeKey("prompt_tokens");
		generator.write(this.promptTokens);

		generator.writeKey("total_tokens");
		generator.write(this.totalTokens);

		if (this.promptTokensDetails != null) {
			generator.writeKey("prompt_tokens_details");
			this.promptTokensDetails.serialize(generator, mapper);

		}
		if (this.completionTokensDetails != null) {
			generator.writeKey("completion_tokens_details");
			this.completionTokensDetails.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChatCompletionUsage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ChatCompletionUsage> {
		private Integer completionTokens;

		private Integer promptTokens;

		private Integer totalTokens;

		@Nullable
		private ChatCompletionPromptTokensDetails promptTokensDetails;

		@Nullable
		private ChatCompletionCompletionTokensDetails completionTokensDetails;

		public Builder() {
		}
		private Builder(ChatCompletionUsage instance) {
			this.completionTokens = instance.completionTokens;
			this.promptTokens = instance.promptTokens;
			this.totalTokens = instance.totalTokens;
			this.promptTokensDetails = instance.promptTokensDetails;
			this.completionTokensDetails = instance.completionTokensDetails;

		}
		/**
		 * Required - The number of tokens in the generated completion.
		 * <p>
		 * API name: {@code completion_tokens}
		 */
		public final Builder completionTokens(int value) {
			this.completionTokens = value;
			return this;
		}

		/**
		 * Required - The number of tokens in the prompt.
		 * <p>
		 * API name: {@code prompt_tokens}
		 */
		public final Builder promptTokens(int value) {
			this.promptTokens = value;
			return this;
		}

		/**
		 * Required - The total number of tokens used (prompt + completion).
		 * <p>
		 * API name: {@code total_tokens}
		 */
		public final Builder totalTokens(int value) {
			this.totalTokens = value;
			return this;
		}

		/**
		 * Breakdown of the tokens used in the prompt. Omitted when no details are
		 * available.
		 * <p>
		 * API name: {@code prompt_tokens_details}
		 */
		public final Builder promptTokensDetails(@Nullable ChatCompletionPromptTokensDetails value) {
			this.promptTokensDetails = value;
			return this;
		}

		/**
		 * Breakdown of the tokens used in the prompt. Omitted when no details are
		 * available.
		 * <p>
		 * API name: {@code prompt_tokens_details}
		 */
		public final Builder promptTokensDetails(
				Function<ChatCompletionPromptTokensDetails.Builder, ObjectBuilder<ChatCompletionPromptTokensDetails>> fn) {
			return this.promptTokensDetails(fn.apply(new ChatCompletionPromptTokensDetails.Builder()).build());
		}

		/**
		 * Breakdown of the tokens used in the completion. Omitted when no details are
		 * available.
		 * <p>
		 * API name: {@code completion_tokens_details}
		 */
		public final Builder completionTokensDetails(@Nullable ChatCompletionCompletionTokensDetails value) {
			this.completionTokensDetails = value;
			return this;
		}

		/**
		 * Breakdown of the tokens used in the completion. Omitted when no details are
		 * available.
		 * <p>
		 * API name: {@code completion_tokens_details}
		 */
		public final Builder completionTokensDetails(
				Function<ChatCompletionCompletionTokensDetails.Builder, ObjectBuilder<ChatCompletionCompletionTokensDetails>> fn) {
			return this.completionTokensDetails(fn.apply(new ChatCompletionCompletionTokensDetails.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChatCompletionUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChatCompletionUsage build() {
			_checkSingleUse();

			return new ChatCompletionUsage(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChatCompletionUsage}
	 */
	public static final JsonpDeserializer<ChatCompletionUsage> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChatCompletionUsage::setupChatCompletionUsageDeserializer);

	protected static void setupChatCompletionUsageDeserializer(ObjectDeserializer<ChatCompletionUsage.Builder> op) {

		op.add(Builder::completionTokens, JsonpDeserializer.integerDeserializer(), "completion_tokens");
		op.add(Builder::promptTokens, JsonpDeserializer.integerDeserializer(), "prompt_tokens");
		op.add(Builder::totalTokens, JsonpDeserializer.integerDeserializer(), "total_tokens");
		op.add(Builder::promptTokensDetails, ChatCompletionPromptTokensDetails._DESERIALIZER, "prompt_tokens_details");
		op.add(Builder::completionTokensDetails, ChatCompletionCompletionTokensDetails._DESERIALIZER,
				"completion_tokens_details");

	}

}
