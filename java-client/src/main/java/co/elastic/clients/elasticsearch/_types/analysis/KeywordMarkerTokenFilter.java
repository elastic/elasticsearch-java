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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.KeywordMarkerTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.KeywordMarkerTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class KeywordMarkerTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Boolean ignoreCase;

	private final List<String> keywords;

	@Nullable
	private final String keywordsPath;

	@Nullable
	private final String keywordsPattern;

	// ---------------------------------------------------------------------------------------------

	private KeywordMarkerTokenFilter(Builder builder) {
		super(builder);

		this.ignoreCase = builder.ignoreCase;
		this.keywords = ApiTypeHelper.unmodifiable(builder.keywords);
		this.keywordsPath = builder.keywordsPath;
		this.keywordsPattern = builder.keywordsPattern;

	}

	public static KeywordMarkerTokenFilter of(Function<Builder, ObjectBuilder<KeywordMarkerTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.KeywordMarker;
	}

	/**
	 * API name: {@code ignore_case}
	 */
	@Nullable
	public final Boolean ignoreCase() {
		return this.ignoreCase;
	}

	/**
	 * API name: {@code keywords}
	 */
	public final List<String> keywords() {
		return this.keywords;
	}

	/**
	 * API name: {@code keywords_path}
	 */
	@Nullable
	public final String keywordsPath() {
		return this.keywordsPath;
	}

	/**
	 * API name: {@code keywords_pattern}
	 */
	@Nullable
	public final String keywordsPattern() {
		return this.keywordsPattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "keyword_marker");
		super.serializeInternal(generator, mapper);
		if (this.ignoreCase != null) {
			generator.writeKey("ignore_case");
			generator.write(this.ignoreCase);

		}
		if (ApiTypeHelper.isDefined(this.keywords)) {
			generator.writeKey("keywords");
			generator.writeStartArray();
			for (String item0 : this.keywords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.keywordsPath != null) {
			generator.writeKey("keywords_path");
			generator.write(this.keywordsPath);

		}
		if (this.keywordsPattern != null) {
			generator.writeKey("keywords_pattern");
			generator.write(this.keywordsPattern);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeywordMarkerTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeywordMarkerTokenFilter> {
		@Nullable
		private Boolean ignoreCase;

		@Nullable
		private List<String> keywords;

		@Nullable
		private String keywordsPath;

		@Nullable
		private String keywordsPattern;

		/**
		 * API name: {@code ignore_case}
		 */
		public final Builder ignoreCase(@Nullable Boolean value) {
			this.ignoreCase = value;
			return this;
		}

		/**
		 * API name: {@code keywords}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>keywords</code>.
		 */
		public final Builder keywords(List<String> list) {
			this.keywords = _listAddAll(this.keywords, list);
			return this;
		}

		/**
		 * API name: {@code keywords}
		 * <p>
		 * Adds one or more values to <code>keywords</code>.
		 */
		public final Builder keywords(String value, String... values) {
			this.keywords = _listAdd(this.keywords, value, values);
			return this;
		}

		/**
		 * API name: {@code keywords_path}
		 */
		public final Builder keywordsPath(@Nullable String value) {
			this.keywordsPath = value;
			return this;
		}

		/**
		 * API name: {@code keywords_pattern}
		 */
		public final Builder keywordsPattern(@Nullable String value) {
			this.keywordsPattern = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KeywordMarkerTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeywordMarkerTokenFilter build() {
			_checkSingleUse();

			return new KeywordMarkerTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeywordMarkerTokenFilter}
	 */
	public static final JsonpDeserializer<KeywordMarkerTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KeywordMarkerTokenFilter::setupKeywordMarkerTokenFilterDeserializer);

	protected static void setupKeywordMarkerTokenFilterDeserializer(
			ObjectDeserializer<KeywordMarkerTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::ignoreCase, JsonpDeserializer.booleanDeserializer(), "ignore_case");
		op.add(Builder::keywords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"keywords");
		op.add(Builder::keywordsPath, JsonpDeserializer.stringDeserializer(), "keywords_path");
		op.add(Builder::keywordsPattern, JsonpDeserializer.stringDeserializer(), "keywords_pattern");

		op.ignore("type");
	}

}
