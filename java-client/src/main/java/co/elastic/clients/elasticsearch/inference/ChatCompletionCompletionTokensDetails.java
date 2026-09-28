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

// typedef: inference._types.ChatCompletionCompletionTokensDetails

/**
 * Breakdown of tokens used in the request.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ChatCompletionCompletionTokensDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChatCompletionCompletionTokensDetails implements JsonpSerializable {
	@Nullable
	private final Integer reasoningTokens;

	// ---------------------------------------------------------------------------------------------

	private ChatCompletionCompletionTokensDetails(Builder builder) {

		this.reasoningTokens = builder.reasoningTokens;

	}

	public static ChatCompletionCompletionTokensDetails of(
			Function<Builder, ObjectBuilder<ChatCompletionCompletionTokensDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of tokens used for reasoning by the model.
	 * <p>
	 * API name: {@code reasoning_tokens}
	 */
	@Nullable
	public final Integer reasoningTokens() {
		return this.reasoningTokens;
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

		if (this.reasoningTokens != null) {
			generator.writeKey("reasoning_tokens");
			generator.write(this.reasoningTokens);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChatCompletionCompletionTokensDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ChatCompletionCompletionTokensDetails> {
		@Nullable
		private Integer reasoningTokens;

		public Builder() {
		}
		private Builder(ChatCompletionCompletionTokensDetails instance) {
			this.reasoningTokens = instance.reasoningTokens;

		}
		/**
		 * The number of tokens used for reasoning by the model.
		 * <p>
		 * API name: {@code reasoning_tokens}
		 */
		public final Builder reasoningTokens(@Nullable Integer value) {
			this.reasoningTokens = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChatCompletionCompletionTokensDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChatCompletionCompletionTokensDetails build() {
			_checkSingleUse();

			return new ChatCompletionCompletionTokensDetails(this);
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
	 * Json deserializer for {@link ChatCompletionCompletionTokensDetails}
	 */
	public static final JsonpDeserializer<ChatCompletionCompletionTokensDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					ChatCompletionCompletionTokensDetails::setupChatCompletionCompletionTokensDetailsDeserializer);

	protected static void setupChatCompletionCompletionTokensDetailsDeserializer(
			ObjectDeserializer<ChatCompletionCompletionTokensDetails.Builder> op) {

		op.add(Builder::reasoningTokens, JsonpDeserializer.integerDeserializer(), "reasoning_tokens");

	}

}
