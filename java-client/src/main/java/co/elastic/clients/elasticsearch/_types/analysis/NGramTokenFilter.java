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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.NGramTokenFilter
@JsonpDeserializable
public final class NGramTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int maxGram;

	private final int minGram;

	// ---------------------------------------------------------------------------------------------

	public NGramTokenFilter(Builder builder) {
		super(builder);

		this.maxGram = Objects.requireNonNull(builder.maxGram, "max_gram");
		this.minGram = Objects.requireNonNull(builder.minGram, "min_gram");

	}

	public NGramTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "ngram";
	}

	/**
	 * API name: {@code max_gram}
	 */
	public int maxGram() {
		return this.maxGram;
	}

	/**
	 * API name: {@code min_gram}
	 */
	public int minGram() {
		return this.minGram;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "ngram");
		super.serializeInternal(generator, mapper);

		generator.writeKey("max_gram");
		generator.write(this.maxGram);

		generator.writeKey("min_gram");
		generator.write(this.minGram);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NGramTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NGramTokenFilter> {
		private Integer maxGram;

		private Integer minGram;

		/**
		 * API name: {@code max_gram}
		 */
		public Builder maxGram(int value) {
			this.maxGram = value;
			return this;
		}

		/**
		 * API name: {@code min_gram}
		 */
		public Builder minGram(int value) {
			this.minGram = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NGramTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NGramTokenFilter build() {

			return new NGramTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NGramTokenFilter}
	 */
	public static final JsonpDeserializer<NGramTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NGramTokenFilter::setupNGramTokenFilterDeserializer, Builder::build);

	protected static void setupNGramTokenFilterDeserializer(DelegatingDeserializer<NGramTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::maxGram, JsonpDeserializer.integerDeserializer(), "max_gram");
		op.add(Builder::minGram, JsonpDeserializer.integerDeserializer(), "min_gram");

		op.ignore("type");
	}

}
