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

// typedef: _types.analysis.KuromojiStemmerTokenFilter
@JsonpDeserializable
public final class KuromojiStemmerTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int minimumLength;

	// ---------------------------------------------------------------------------------------------

	public KuromojiStemmerTokenFilter(Builder builder) {
		super(builder);

		this.minimumLength = Objects.requireNonNull(builder.minimumLength, "minimum_length");

	}

	public KuromojiStemmerTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "kuromoji_stemmer";
	}

	/**
	 * API name: {@code minimum_length}
	 */
	public int minimumLength() {
		return this.minimumLength;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "kuromoji_stemmer");
		super.serializeInternal(generator, mapper);

		generator.writeKey("minimum_length");
		generator.write(this.minimumLength);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KuromojiStemmerTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KuromojiStemmerTokenFilter> {
		private Integer minimumLength;

		/**
		 * API name: {@code minimum_length}
		 */
		public Builder minimumLength(int value) {
			this.minimumLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KuromojiStemmerTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KuromojiStemmerTokenFilter build() {

			return new KuromojiStemmerTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KuromojiStemmerTokenFilter}
	 */
	public static final JsonpDeserializer<KuromojiStemmerTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, KuromojiStemmerTokenFilter::setupKuromojiStemmerTokenFilterDeserializer, Builder::build);

	protected static void setupKuromojiStemmerTokenFilterDeserializer(
			DelegatingDeserializer<KuromojiStemmerTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::minimumLength, JsonpDeserializer.integerDeserializer(), "minimum_length");

		op.ignore("type");
	}

}
