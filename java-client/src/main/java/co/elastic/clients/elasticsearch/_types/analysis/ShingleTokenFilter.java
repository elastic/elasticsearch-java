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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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

// typedef: _types.analysis.ShingleTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.ShingleTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShingleTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final String fillerToken;

	@Nullable
	private final Integer maxShingleSize;

	@Nullable
	private final Integer minShingleSize;

	@Nullable
	private final Boolean outputUnigrams;

	@Nullable
	private final Boolean outputUnigramsIfNoShingles;

	@Nullable
	private final String tokenSeparator;

	// ---------------------------------------------------------------------------------------------

	private ShingleTokenFilter(Builder builder) {
		super(builder);

		this.fillerToken = builder.fillerToken;
		this.maxShingleSize = builder.maxShingleSize;
		this.minShingleSize = builder.minShingleSize;
		this.outputUnigrams = builder.outputUnigrams;
		this.outputUnigramsIfNoShingles = builder.outputUnigramsIfNoShingles;
		this.tokenSeparator = builder.tokenSeparator;

	}

	public static ShingleTokenFilter of(Function<Builder, ObjectBuilder<ShingleTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Shingle;
	}

	/**
	 * String used in shingles as a replacement for empty positions that do not
	 * contain a token. This filler token is only used in shingles, not original
	 * unigrams. Defaults to an underscore (<code>_</code>).
	 * <p>
	 * API name: {@code filler_token}
	 */
	@Nullable
	public final String fillerToken() {
		return this.fillerToken;
	}

	/**
	 * Maximum number of tokens to concatenate when creating shingles. Defaults to
	 * <code>2</code>.
	 * <p>
	 * API name: {@code max_shingle_size}
	 */
	@Nullable
	public final Integer maxShingleSize() {
		return this.maxShingleSize;
	}

	/**
	 * Minimum number of tokens to concatenate when creating shingles. Defaults to
	 * <code>2</code>.
	 * <p>
	 * API name: {@code min_shingle_size}
	 */
	@Nullable
	public final Integer minShingleSize() {
		return this.minShingleSize;
	}

	/**
	 * If <code>true</code>, the output includes the original input tokens. If
	 * <code>false</code>, the output only includes shingles; the original input
	 * tokens are removed. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code output_unigrams}
	 */
	@Nullable
	public final Boolean outputUnigrams() {
		return this.outputUnigrams;
	}

	/**
	 * If <code>true</code>, the output includes the original input tokens only if
	 * no shingles are produced; if shingles are produced, the output only includes
	 * shingles. Defaults to <code>false</code>.
	 * <p>
	 * API name: {@code output_unigrams_if_no_shingles}
	 */
	@Nullable
	public final Boolean outputUnigramsIfNoShingles() {
		return this.outputUnigramsIfNoShingles;
	}

	/**
	 * Separator used to concatenate adjacent tokens to form a shingle. Defaults to
	 * a space (<code>&quot; &quot;</code>).
	 * <p>
	 * API name: {@code token_separator}
	 */
	@Nullable
	public final String tokenSeparator() {
		return this.tokenSeparator;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "shingle");
		super.serializeInternal(generator, mapper);
		if (this.fillerToken != null) {
			generator.writeKey("filler_token");
			generator.write(this.fillerToken);

		}
		if (this.maxShingleSize != null) {
			generator.writeKey("max_shingle_size");
			generator.write(this.maxShingleSize);

		}
		if (this.minShingleSize != null) {
			generator.writeKey("min_shingle_size");
			generator.write(this.minShingleSize);

		}
		if (this.outputUnigrams != null) {
			generator.writeKey("output_unigrams");
			generator.write(this.outputUnigrams);

		}
		if (this.outputUnigramsIfNoShingles != null) {
			generator.writeKey("output_unigrams_if_no_shingles");
			generator.write(this.outputUnigramsIfNoShingles);

		}
		if (this.tokenSeparator != null) {
			generator.writeKey("token_separator");
			generator.write(this.tokenSeparator);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShingleTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ShingleTokenFilter> {
		@Nullable
		private String fillerToken;

		@Nullable
		private Integer maxShingleSize;

		@Nullable
		private Integer minShingleSize;

		@Nullable
		private Boolean outputUnigrams;

		@Nullable
		private Boolean outputUnigramsIfNoShingles;

		@Nullable
		private String tokenSeparator;

		public Builder() {
		}
		private Builder(ShingleTokenFilter instance) {
			this.fillerToken = instance.fillerToken;
			this.maxShingleSize = instance.maxShingleSize;
			this.minShingleSize = instance.minShingleSize;
			this.outputUnigrams = instance.outputUnigrams;
			this.outputUnigramsIfNoShingles = instance.outputUnigramsIfNoShingles;
			this.tokenSeparator = instance.tokenSeparator;

		}
		/**
		 * String used in shingles as a replacement for empty positions that do not
		 * contain a token. This filler token is only used in shingles, not original
		 * unigrams. Defaults to an underscore (<code>_</code>).
		 * <p>
		 * API name: {@code filler_token}
		 */
		public final Builder fillerToken(@Nullable String value) {
			this.fillerToken = value;
			return this;
		}

		/**
		 * Maximum number of tokens to concatenate when creating shingles. Defaults to
		 * <code>2</code>.
		 * <p>
		 * API name: {@code max_shingle_size}
		 */
		public final Builder maxShingleSize(@Nullable Integer value) {
			this.maxShingleSize = value;
			return this;
		}

		/**
		 * Minimum number of tokens to concatenate when creating shingles. Defaults to
		 * <code>2</code>.
		 * <p>
		 * API name: {@code min_shingle_size}
		 */
		public final Builder minShingleSize(@Nullable Integer value) {
			this.minShingleSize = value;
			return this;
		}

		/**
		 * If <code>true</code>, the output includes the original input tokens. If
		 * <code>false</code>, the output only includes shingles; the original input
		 * tokens are removed. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code output_unigrams}
		 */
		public final Builder outputUnigrams(@Nullable Boolean value) {
			this.outputUnigrams = value;
			return this;
		}

		/**
		 * If <code>true</code>, the output includes the original input tokens only if
		 * no shingles are produced; if shingles are produced, the output only includes
		 * shingles. Defaults to <code>false</code>.
		 * <p>
		 * API name: {@code output_unigrams_if_no_shingles}
		 */
		public final Builder outputUnigramsIfNoShingles(@Nullable Boolean value) {
			this.outputUnigramsIfNoShingles = value;
			return this;
		}

		/**
		 * Separator used to concatenate adjacent tokens to form a shingle. Defaults to
		 * a space (<code>&quot; &quot;</code>).
		 * <p>
		 * API name: {@code token_separator}
		 */
		public final Builder tokenSeparator(@Nullable String value) {
			this.tokenSeparator = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShingleTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShingleTokenFilter build() {
			_checkSingleUse();

			return new ShingleTokenFilter(this);
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
	 * Json deserializer for {@link ShingleTokenFilter}
	 */
	public static final JsonpDeserializer<ShingleTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShingleTokenFilter::setupShingleTokenFilterDeserializer);

	protected static void setupShingleTokenFilterDeserializer(ObjectDeserializer<ShingleTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::fillerToken, JsonpDeserializer.stringDeserializer(), "filler_token");
		op.add(Builder::maxShingleSize, JsonpDeserializer.integerDeserializer(), "max_shingle_size");
		op.add(Builder::minShingleSize, JsonpDeserializer.integerDeserializer(), "min_shingle_size");
		op.add(Builder::outputUnigrams, JsonpDeserializer.booleanDeserializer(), "output_unigrams");
		op.add(Builder::outputUnigramsIfNoShingles, JsonpDeserializer.booleanDeserializer(),
				"output_unigrams_if_no_shingles");
		op.add(Builder::tokenSeparator, JsonpDeserializer.stringDeserializer(), "token_separator");

		op.ignore("type");
	}

}
