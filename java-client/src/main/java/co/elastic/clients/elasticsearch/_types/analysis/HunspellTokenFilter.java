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
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.HunspellTokenFilter
@JsonpDeserializable
public final class HunspellTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final Boolean dedup;

	private final String dictionary;

	private final String locale;

	private final Boolean longestOnly;

	// ---------------------------------------------------------------------------------------------

	public HunspellTokenFilter(Builder builder) {
		super(builder);

		this.dedup = Objects.requireNonNull(builder.dedup, "dedup");
		this.dictionary = Objects.requireNonNull(builder.dictionary, "dictionary");
		this.locale = Objects.requireNonNull(builder.locale, "locale");
		this.longestOnly = Objects.requireNonNull(builder.longestOnly, "longest_only");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "hunspell";
	}

	/**
	 * API name: {@code dedup}
	 */
	public Boolean dedup() {
		return this.dedup;
	}

	/**
	 * API name: {@code dictionary}
	 */
	public String dictionary() {
		return this.dictionary;
	}

	/**
	 * API name: {@code locale}
	 */
	public String locale() {
		return this.locale;
	}

	/**
	 * API name: {@code longest_only}
	 */
	public Boolean longestOnly() {
		return this.longestOnly;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "hunspell");
		super.serializeInternal(generator, mapper);

		generator.writeKey("dedup");
		generator.write(this.dedup);

		generator.writeKey("dictionary");
		generator.write(this.dictionary);

		generator.writeKey("locale");
		generator.write(this.locale);

		generator.writeKey("longest_only");
		generator.write(this.longestOnly);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HunspellTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HunspellTokenFilter> {
		private Boolean dedup;

		private String dictionary;

		private String locale;

		private Boolean longestOnly;

		/**
		 * API name: {@code dedup}
		 */
		public Builder dedup(Boolean value) {
			this.dedup = value;
			return this;
		}

		/**
		 * API name: {@code dictionary}
		 */
		public Builder dictionary(String value) {
			this.dictionary = value;
			return this;
		}

		/**
		 * API name: {@code locale}
		 */
		public Builder locale(String value) {
			this.locale = value;
			return this;
		}

		/**
		 * API name: {@code longest_only}
		 */
		public Builder longestOnly(Boolean value) {
			this.longestOnly = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HunspellTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HunspellTokenFilter build() {

			return new HunspellTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HunspellTokenFilter}
	 */
	public static final JsonpDeserializer<HunspellTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HunspellTokenFilter::setupHunspellTokenFilterDeserializer, Builder::build);

	protected static void setupHunspellTokenFilterDeserializer(DelegatingDeserializer<HunspellTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::dedup, JsonpDeserializer.booleanDeserializer(), "dedup");
		op.add(Builder::dictionary, JsonpDeserializer.stringDeserializer(), "dictionary");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::longestOnly, JsonpDeserializer.booleanDeserializer(), "longest_only");

		op.ignore("type");
	}

}
