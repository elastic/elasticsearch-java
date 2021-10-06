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

import co.elastic.clients.json.DelegatingDeserializer;
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

// typedef: _types.analysis.ShingleTokenFilter
@JsonpDeserializable
public final class ShingleTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final String fillerToken;

	private final int maxShingleSize;

	private final int minShingleSize;

	private final boolean outputUnigrams;

	private final boolean outputUnigramsIfNoShingles;

	private final String tokenSeparator;

	// ---------------------------------------------------------------------------------------------

	public ShingleTokenFilter(Builder builder) {
		super(builder);

		this.fillerToken = Objects.requireNonNull(builder.fillerToken, "filler_token");
		this.maxShingleSize = Objects.requireNonNull(builder.maxShingleSize, "max_shingle_size");
		this.minShingleSize = Objects.requireNonNull(builder.minShingleSize, "min_shingle_size");
		this.outputUnigrams = Objects.requireNonNull(builder.outputUnigrams, "output_unigrams");
		this.outputUnigramsIfNoShingles = Objects.requireNonNull(builder.outputUnigramsIfNoShingles,
				"output_unigrams_if_no_shingles");
		this.tokenSeparator = Objects.requireNonNull(builder.tokenSeparator, "token_separator");

	}

	public ShingleTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "shingle";
	}

	/**
	 * Required - API name: {@code filler_token}
	 */
	public String fillerToken() {
		return this.fillerToken;
	}

	/**
	 * Required - API name: {@code max_shingle_size}
	 */
	public int maxShingleSize() {
		return this.maxShingleSize;
	}

	/**
	 * Required - API name: {@code min_shingle_size}
	 */
	public int minShingleSize() {
		return this.minShingleSize;
	}

	/**
	 * Required - API name: {@code output_unigrams}
	 */
	public boolean outputUnigrams() {
		return this.outputUnigrams;
	}

	/**
	 * Required - API name: {@code output_unigrams_if_no_shingles}
	 */
	public boolean outputUnigramsIfNoShingles() {
		return this.outputUnigramsIfNoShingles;
	}

	/**
	 * Required - API name: {@code token_separator}
	 */
	public String tokenSeparator() {
		return this.tokenSeparator;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "shingle");
		super.serializeInternal(generator, mapper);

		generator.writeKey("filler_token");
		generator.write(this.fillerToken);

		generator.writeKey("max_shingle_size");
		generator.write(this.maxShingleSize);

		generator.writeKey("min_shingle_size");
		generator.write(this.minShingleSize);

		generator.writeKey("output_unigrams");
		generator.write(this.outputUnigrams);

		generator.writeKey("output_unigrams_if_no_shingles");
		generator.write(this.outputUnigramsIfNoShingles);

		generator.writeKey("token_separator");
		generator.write(this.tokenSeparator);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShingleTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ShingleTokenFilter> {
		private String fillerToken;

		private Integer maxShingleSize;

		private Integer minShingleSize;

		private Boolean outputUnigrams;

		private Boolean outputUnigramsIfNoShingles;

		private String tokenSeparator;

		/**
		 * Required - API name: {@code filler_token}
		 */
		public Builder fillerToken(String value) {
			this.fillerToken = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_shingle_size}
		 */
		public Builder maxShingleSize(int value) {
			this.maxShingleSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code min_shingle_size}
		 */
		public Builder minShingleSize(int value) {
			this.minShingleSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code output_unigrams}
		 */
		public Builder outputUnigrams(boolean value) {
			this.outputUnigrams = value;
			return this;
		}

		/**
		 * Required - API name: {@code output_unigrams_if_no_shingles}
		 */
		public Builder outputUnigramsIfNoShingles(boolean value) {
			this.outputUnigramsIfNoShingles = value;
			return this;
		}

		/**
		 * Required - API name: {@code token_separator}
		 */
		public Builder tokenSeparator(String value) {
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

			return new ShingleTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShingleTokenFilter}
	 */
	public static final JsonpDeserializer<ShingleTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShingleTokenFilter::setupShingleTokenFilterDeserializer, Builder::build);

	protected static void setupShingleTokenFilterDeserializer(DelegatingDeserializer<ShingleTokenFilter.Builder> op) {
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
