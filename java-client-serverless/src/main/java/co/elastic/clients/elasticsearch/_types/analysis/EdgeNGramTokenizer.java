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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.EdgeNGramTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.EdgeNGramTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class EdgeNGramTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	@Nullable
	private final String customTokenChars;

	private final int maxGram;

	private final int minGram;

	private final List<TokenChar> tokenChars;

	// ---------------------------------------------------------------------------------------------

	private EdgeNGramTokenizer(Builder builder) {
		super(builder);

		this.customTokenChars = builder.customTokenChars;
		this.maxGram = ApiTypeHelper.requireNonNull(builder.maxGram, this, "maxGram");
		this.minGram = ApiTypeHelper.requireNonNull(builder.minGram, this, "minGram");
		this.tokenChars = ApiTypeHelper.unmodifiableRequired(builder.tokenChars, this, "tokenChars");

	}

	public static EdgeNGramTokenizer of(Function<Builder, ObjectBuilder<EdgeNGramTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizerDefinition variant kind.
	 */
	@Override
	public TokenizerDefinition.Kind _tokenizerDefinitionKind() {
		return TokenizerDefinition.Kind.EdgeNgram;
	}

	/**
	 * API name: {@code custom_token_chars}
	 */
	@Nullable
	public final String customTokenChars() {
		return this.customTokenChars;
	}

	/**
	 * Required - API name: {@code max_gram}
	 */
	public final int maxGram() {
		return this.maxGram;
	}

	/**
	 * Required - API name: {@code min_gram}
	 */
	public final int minGram() {
		return this.minGram;
	}

	/**
	 * Required - API name: {@code token_chars}
	 */
	public final List<TokenChar> tokenChars() {
		return this.tokenChars;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "edge_ngram");
		super.serializeInternal(generator, mapper);
		if (this.customTokenChars != null) {
			generator.writeKey("custom_token_chars");
			generator.write(this.customTokenChars);

		}
		generator.writeKey("max_gram");
		generator.write(this.maxGram);

		generator.writeKey("min_gram");
		generator.write(this.minGram);

		if (ApiTypeHelper.isDefined(this.tokenChars)) {
			generator.writeKey("token_chars");
			generator.writeStartArray();
			for (TokenChar item0 : this.tokenChars) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EdgeNGramTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<EdgeNGramTokenizer> {
		@Nullable
		private String customTokenChars;

		private Integer maxGram;

		private Integer minGram;

		private List<TokenChar> tokenChars;

		/**
		 * API name: {@code custom_token_chars}
		 */
		public final Builder customTokenChars(@Nullable String value) {
			this.customTokenChars = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_gram}
		 */
		public final Builder maxGram(int value) {
			this.maxGram = value;
			return this;
		}

		/**
		 * Required - API name: {@code min_gram}
		 */
		public final Builder minGram(int value) {
			this.minGram = value;
			return this;
		}

		/**
		 * Required - API name: {@code token_chars}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tokenChars</code>.
		 */
		public final Builder tokenChars(List<TokenChar> list) {
			this.tokenChars = _listAddAll(this.tokenChars, list);
			return this;
		}

		/**
		 * Required - API name: {@code token_chars}
		 * <p>
		 * Adds one or more values to <code>tokenChars</code>.
		 */
		public final Builder tokenChars(TokenChar value, TokenChar... values) {
			this.tokenChars = _listAdd(this.tokenChars, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EdgeNGramTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EdgeNGramTokenizer build() {
			_checkSingleUse();

			return new EdgeNGramTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EdgeNGramTokenizer}
	 */
	public static final JsonpDeserializer<EdgeNGramTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EdgeNGramTokenizer::setupEdgeNGramTokenizerDeserializer);

	protected static void setupEdgeNGramTokenizerDeserializer(ObjectDeserializer<EdgeNGramTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::customTokenChars, JsonpDeserializer.stringDeserializer(), "custom_token_chars");
		op.add(Builder::maxGram, JsonpDeserializer.integerDeserializer(), "max_gram");
		op.add(Builder::minGram, JsonpDeserializer.integerDeserializer(), "min_gram");
		op.add(Builder::tokenChars, JsonpDeserializer.arrayDeserializer(TokenChar._DESERIALIZER), "token_chars");

		op.ignore("type");
	}

}
