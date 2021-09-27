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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.KeywordMarkerTokenFilter
@JsonpDeserializable
public final class KeywordMarkerTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final Boolean ignoreCase;

	private final List<String> keywords;

	private final String keywordsPath;

	private final String keywordsPattern;

	// ---------------------------------------------------------------------------------------------

	public KeywordMarkerTokenFilter(Builder builder) {
		super(builder);

		this.ignoreCase = Objects.requireNonNull(builder.ignoreCase, "ignore_case");
		this.keywords = Objects.requireNonNull(builder.keywords, "keywords");
		this.keywordsPath = Objects.requireNonNull(builder.keywordsPath, "keywords_path");
		this.keywordsPattern = Objects.requireNonNull(builder.keywordsPattern, "keywords_pattern");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "keyword_marker";
	}

	/**
	 * API name: {@code ignore_case}
	 */
	public Boolean ignoreCase() {
		return this.ignoreCase;
	}

	/**
	 * API name: {@code keywords}
	 */
	public List<String> keywords() {
		return this.keywords;
	}

	/**
	 * API name: {@code keywords_path}
	 */
	public String keywordsPath() {
		return this.keywordsPath;
	}

	/**
	 * API name: {@code keywords_pattern}
	 */
	public String keywordsPattern() {
		return this.keywordsPattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "keyword_marker");
		super.serializeInternal(generator, mapper);

		generator.writeKey("ignore_case");
		generator.write(this.ignoreCase);

		generator.writeKey("keywords");
		generator.writeStartArray();
		for (String item0 : this.keywords) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("keywords_path");
		generator.write(this.keywordsPath);

		generator.writeKey("keywords_pattern");
		generator.write(this.keywordsPattern);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeywordMarkerTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeywordMarkerTokenFilter> {
		private Boolean ignoreCase;

		private List<String> keywords;

		private String keywordsPath;

		private String keywordsPattern;

		/**
		 * API name: {@code ignore_case}
		 */
		public Builder ignoreCase(Boolean value) {
			this.ignoreCase = value;
			return this;
		}

		/**
		 * API name: {@code keywords}
		 */
		public Builder keywords(List<String> value) {
			this.keywords = value;
			return this;
		}

		/**
		 * API name: {@code keywords}
		 */
		public Builder keywords(String... value) {
			this.keywords = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #keywords(List)}, creating the list if needed.
		 */
		public Builder addKeywords(String value) {
			if (this.keywords == null) {
				this.keywords = new ArrayList<>();
			}
			this.keywords.add(value);
			return this;
		}

		/**
		 * API name: {@code keywords_path}
		 */
		public Builder keywordsPath(String value) {
			this.keywordsPath = value;
			return this;
		}

		/**
		 * API name: {@code keywords_pattern}
		 */
		public Builder keywordsPattern(String value) {
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

			return new KeywordMarkerTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeywordMarkerTokenFilter}
	 */
	public static final JsonpDeserializer<KeywordMarkerTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KeywordMarkerTokenFilter::setupKeywordMarkerTokenFilterDeserializer, Builder::build);

	protected static void setupKeywordMarkerTokenFilterDeserializer(
			DelegatingDeserializer<KeywordMarkerTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::ignoreCase, JsonpDeserializer.booleanDeserializer(), "ignore_case");
		op.add(Builder::keywords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"keywords");
		op.add(Builder::keywordsPath, JsonpDeserializer.stringDeserializer(), "keywords_path");
		op.add(Builder::keywordsPattern, JsonpDeserializer.stringDeserializer(), "keywords_pattern");

		op.ignore("type");
	}

}
