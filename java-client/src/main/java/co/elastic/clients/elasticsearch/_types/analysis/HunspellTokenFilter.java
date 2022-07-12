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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.HunspellTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.HunspellTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class HunspellTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Boolean dedup;

	@Nullable
	private final String dictionary;

	private final String locale;

	@Nullable
	private final Boolean longestOnly;

	// ---------------------------------------------------------------------------------------------

	private HunspellTokenFilter(Builder builder) {
		super(builder);

		this.dedup = builder.dedup;
		this.dictionary = builder.dictionary;
		this.locale = ApiTypeHelper.requireNonNull(builder.locale, this, "locale");
		this.longestOnly = builder.longestOnly;

	}

	public static HunspellTokenFilter of(Function<Builder, ObjectBuilder<HunspellTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Hunspell;
	}

	/**
	 * API name: {@code dedup}
	 */
	@Nullable
	public final Boolean dedup() {
		return this.dedup;
	}

	/**
	 * API name: {@code dictionary}
	 */
	@Nullable
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
	 * API name: {@code longest_only}
	 */
	@Nullable
	public final Boolean longestOnly() {
		return this.longestOnly;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "hunspell");
		super.serializeInternal(generator, mapper);
		if (this.dedup != null) {
			generator.writeKey("dedup");
			generator.write(this.dedup);

		}
		if (this.dictionary != null) {
			generator.writeKey("dictionary");
			generator.write(this.dictionary);

		}
		generator.writeKey("locale");
		generator.write(this.locale);

		if (this.longestOnly != null) {
			generator.writeKey("longest_only");
			generator.write(this.longestOnly);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HunspellTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HunspellTokenFilter> {
		@Nullable
		private Boolean dedup;

		@Nullable
		private String dictionary;

		private String locale;

		@Nullable
		private Boolean longestOnly;

		/**
		 * API name: {@code dedup}
		 */
		public final Builder dedup(@Nullable Boolean value) {
			this.dedup = value;
			return this;
		}

		/**
		 * API name: {@code dictionary}
		 */
		public final Builder dictionary(@Nullable String value) {
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
		 * API name: {@code longest_only}
		 */
		public final Builder longestOnly(@Nullable Boolean value) {
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
			.lazy(Builder::new, HunspellTokenFilter::setupHunspellTokenFilterDeserializer);

	protected static void setupHunspellTokenFilterDeserializer(ObjectDeserializer<HunspellTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::dedup, JsonpDeserializer.booleanDeserializer(), "dedup");
		op.add(Builder::dictionary, JsonpDeserializer.stringDeserializer(), "dictionary");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::longestOnly, JsonpDeserializer.booleanDeserializer(), "longest_only");

		op.ignore("type");
	}

}
