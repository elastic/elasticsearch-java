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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.HunspellTokenFilter
@JsonpDeserializable
public class HunspellTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final boolean dedup;

	private final String dictionary;

	private final String locale;

	private final boolean longestOnly;

	// ---------------------------------------------------------------------------------------------

	private HunspellTokenFilter(Builder builder) {
		super(builder);

		this.dedup = ModelTypeHelper.requireNonNull(builder.dedup, this, "dedup");
		this.dictionary = ModelTypeHelper.requireNonNull(builder.dictionary, this, "dictionary");
		this.locale = ModelTypeHelper.requireNonNull(builder.locale, this, "locale");
		this.longestOnly = ModelTypeHelper.requireNonNull(builder.longestOnly, this, "longestOnly");

	}

	public static HunspellTokenFilter of(Function<Builder, ObjectBuilder<HunspellTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "hunspell";
	}

	/**
	 * Required - API name: {@code dedup}
	 */
	public final boolean dedup() {
		return this.dedup;
	}

	/**
	 * Required - API name: {@code dictionary}
	 */
	public final String dictionary() {
		return this.dictionary;
	}

	/**
	 * Required - API name: {@code locale}
	 */
	public final String locale() {
		return this.locale;
	}

	/**
	 * Required - API name: {@code longest_only}
	 */
	public final boolean longestOnly() {
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
		 * Required - API name: {@code dedup}
		 */
		public final Builder dedup(boolean value) {
			this.dedup = value;
			return this;
		}

		/**
		 * Required - API name: {@code dictionary}
		 */
		public final Builder dictionary(String value) {
			this.dictionary = value;
			return this;
		}

		/**
		 * Required - API name: {@code locale}
		 */
		public final Builder locale(String value) {
			this.locale = value;
			return this;
		}

		/**
		 * Required - API name: {@code longest_only}
		 */
		public final Builder longestOnly(boolean value) {
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
			_checkSingleUse();

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
