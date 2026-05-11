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

// typedef: _types.analysis.WordDelimiterGraphTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.WordDelimiterGraphTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class WordDelimiterGraphTokenFilter extends WordDelimiterTokenFilterBase
		implements
			TokenFilterDefinitionVariant {
	@Nullable
	private final Boolean adjustOffsets;

	@Nullable
	private final Boolean ignoreKeywords;

	// ---------------------------------------------------------------------------------------------

	private WordDelimiterGraphTokenFilter(Builder builder) {
		super(builder);

		this.adjustOffsets = builder.adjustOffsets;
		this.ignoreKeywords = builder.ignoreKeywords;

	}

	public static WordDelimiterGraphTokenFilter of(Function<Builder, ObjectBuilder<WordDelimiterGraphTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.WordDelimiterGraph;
	}

	/**
	 * If <code>true</code>, the filter adjusts the offsets of split or catenated
	 * tokens to better reflect their actual position in the token stream. Defaults
	 * to <code>true</code>.
	 * <p>
	 * API name: {@code adjust_offsets}
	 */
	@Nullable
	public final Boolean adjustOffsets() {
		return this.adjustOffsets;
	}

	/**
	 * If <code>true</code>, the filter skips tokens with a keyword attribute of
	 * true. Defaults to <code>false</code>.
	 * <p>
	 * API name: {@code ignore_keywords}
	 */
	@Nullable
	public final Boolean ignoreKeywords() {
		return this.ignoreKeywords;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "word_delimiter_graph");
		super.serializeInternal(generator, mapper);
		if (this.adjustOffsets != null) {
			generator.writeKey("adjust_offsets");
			generator.write(this.adjustOffsets);

		}
		if (this.ignoreKeywords != null) {
			generator.writeKey("ignore_keywords");
			generator.write(this.ignoreKeywords);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WordDelimiterGraphTokenFilter}.
	 */

	public static class Builder extends WordDelimiterTokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WordDelimiterGraphTokenFilter> {
		@Nullable
		private Boolean adjustOffsets;

		@Nullable
		private Boolean ignoreKeywords;

		public Builder() {
		}
		private Builder(WordDelimiterGraphTokenFilter instance) {
			this.adjustOffsets = instance.adjustOffsets;
			this.ignoreKeywords = instance.ignoreKeywords;

		}
		/**
		 * If <code>true</code>, the filter adjusts the offsets of split or catenated
		 * tokens to better reflect their actual position in the token stream. Defaults
		 * to <code>true</code>.
		 * <p>
		 * API name: {@code adjust_offsets}
		 */
		public final Builder adjustOffsets(@Nullable Boolean value) {
			this.adjustOffsets = value;
			return this;
		}

		/**
		 * If <code>true</code>, the filter skips tokens with a keyword attribute of
		 * true. Defaults to <code>false</code>.
		 * <p>
		 * API name: {@code ignore_keywords}
		 */
		public final Builder ignoreKeywords(@Nullable Boolean value) {
			this.ignoreKeywords = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WordDelimiterGraphTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WordDelimiterGraphTokenFilter build() {
			_checkSingleUse();

			return new WordDelimiterGraphTokenFilter(this);
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
	 * Json deserializer for {@link WordDelimiterGraphTokenFilter}
	 */
	public static final JsonpDeserializer<WordDelimiterGraphTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WordDelimiterGraphTokenFilter::setupWordDelimiterGraphTokenFilterDeserializer);

	protected static void setupWordDelimiterGraphTokenFilterDeserializer(
			ObjectDeserializer<WordDelimiterGraphTokenFilter.Builder> op) {
		WordDelimiterTokenFilterBase.setupWordDelimiterTokenFilterBaseDeserializer(op);
		op.add(Builder::adjustOffsets, JsonpDeserializer.booleanDeserializer(), "adjust_offsets");
		op.add(Builder::ignoreKeywords, JsonpDeserializer.booleanDeserializer(), "ignore_keywords");

		op.ignore("type");
	}

}
