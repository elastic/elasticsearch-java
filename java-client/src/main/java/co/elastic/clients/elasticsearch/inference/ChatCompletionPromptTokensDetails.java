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

// typedef: inference._types.ChatCompletionPromptTokensDetails

/**
 * Breakdown of tokens used in the prompt.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ChatCompletionPromptTokensDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChatCompletionPromptTokensDetails implements JsonpSerializable {
	@Nullable
	private final Integer cachedTokens;

	@Nullable
	private final Integer cacheWriteTokens;

	// ---------------------------------------------------------------------------------------------

	private ChatCompletionPromptTokensDetails(Builder builder) {

		this.cachedTokens = builder.cachedTokens;
		this.cacheWriteTokens = builder.cacheWriteTokens;

	}

	public static ChatCompletionPromptTokensDetails of(
			Function<Builder, ObjectBuilder<ChatCompletionPromptTokensDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of tokens that were cached from a previous request.
	 * <p>
	 * API name: {@code cached_tokens}
	 */
	@Nullable
	public final Integer cachedTokens() {
		return this.cachedTokens;
	}

	/**
	 * The number of tokens written to the cache.
	 * <p>
	 * API name: {@code cache_write_tokens}
	 */
	@Nullable
	public final Integer cacheWriteTokens() {
		return this.cacheWriteTokens;
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

		if (this.cachedTokens != null) {
			generator.writeKey("cached_tokens");
			generator.write(this.cachedTokens);

		}
		if (this.cacheWriteTokens != null) {
			generator.writeKey("cache_write_tokens");
			generator.write(this.cacheWriteTokens);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChatCompletionPromptTokensDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ChatCompletionPromptTokensDetails> {
		@Nullable
		private Integer cachedTokens;

		@Nullable
		private Integer cacheWriteTokens;

		public Builder() {
		}
		private Builder(ChatCompletionPromptTokensDetails instance) {
			this.cachedTokens = instance.cachedTokens;
			this.cacheWriteTokens = instance.cacheWriteTokens;

		}
		/**
		 * The number of tokens that were cached from a previous request.
		 * <p>
		 * API name: {@code cached_tokens}
		 */
		public final Builder cachedTokens(@Nullable Integer value) {
			this.cachedTokens = value;
			return this;
		}

		/**
		 * The number of tokens written to the cache.
		 * <p>
		 * API name: {@code cache_write_tokens}
		 */
		public final Builder cacheWriteTokens(@Nullable Integer value) {
			this.cacheWriteTokens = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChatCompletionPromptTokensDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChatCompletionPromptTokensDetails build() {
			_checkSingleUse();

			return new ChatCompletionPromptTokensDetails(this);
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
	 * Json deserializer for {@link ChatCompletionPromptTokensDetails}
	 */
	public static final JsonpDeserializer<ChatCompletionPromptTokensDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChatCompletionPromptTokensDetails::setupChatCompletionPromptTokensDetailsDeserializer);

	protected static void setupChatCompletionPromptTokensDetailsDeserializer(
			ObjectDeserializer<ChatCompletionPromptTokensDetails.Builder> op) {

		op.add(Builder::cachedTokens, JsonpDeserializer.integerDeserializer(), "cached_tokens");
		op.add(Builder::cacheWriteTokens, JsonpDeserializer.integerDeserializer(), "cache_write_tokens");

	}

}
