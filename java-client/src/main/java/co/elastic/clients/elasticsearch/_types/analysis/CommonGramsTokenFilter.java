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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.CommonGramsTokenFilter
@JsonpDeserializable
public final class CommonGramsTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> commonWords;

	private final String commonWordsPath;

	private final boolean ignoreCase;

	private final boolean queryMode;

	// ---------------------------------------------------------------------------------------------

	public CommonGramsTokenFilter(Builder builder) {
		super(builder);

		this.commonWords = ModelTypeHelper.unmodifiableNonNull(builder.commonWords, "common_words");
		this.commonWordsPath = Objects.requireNonNull(builder.commonWordsPath, "common_words_path");
		this.ignoreCase = Objects.requireNonNull(builder.ignoreCase, "ignore_case");
		this.queryMode = Objects.requireNonNull(builder.queryMode, "query_mode");

	}

	public CommonGramsTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "common_grams";
	}

	/**
	 * Required - API name: {@code common_words}
	 */
	public List<String> commonWords() {
		return this.commonWords;
	}

	/**
	 * Required - API name: {@code common_words_path}
	 */
	public String commonWordsPath() {
		return this.commonWordsPath;
	}

	/**
	 * Required - API name: {@code ignore_case}
	 */
	public boolean ignoreCase() {
		return this.ignoreCase;
	}

	/**
	 * Required - API name: {@code query_mode}
	 */
	public boolean queryMode() {
		return this.queryMode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "common_grams");
		super.serializeInternal(generator, mapper);

		generator.writeKey("common_words");
		generator.writeStartArray();
		for (String item0 : this.commonWords) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("common_words_path");
		generator.write(this.commonWordsPath);

		generator.writeKey("ignore_case");
		generator.write(this.ignoreCase);

		generator.writeKey("query_mode");
		generator.write(this.queryMode);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommonGramsTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CommonGramsTokenFilter> {
		private List<String> commonWords;

		private String commonWordsPath;

		private Boolean ignoreCase;

		private Boolean queryMode;

		/**
		 * Required - API name: {@code common_words}
		 */
		public Builder commonWords(List<String> value) {
			this.commonWords = value;
			return this;
		}

		/**
		 * Required - API name: {@code common_words}
		 */
		public Builder commonWords(String... value) {
			this.commonWords = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #commonWords(List)}, creating the list if needed.
		 */
		public Builder addCommonWords(String value) {
			if (this.commonWords == null) {
				this.commonWords = new ArrayList<>();
			}
			this.commonWords.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code common_words_path}
		 */
		public Builder commonWordsPath(String value) {
			this.commonWordsPath = value;
			return this;
		}

		/**
		 * Required - API name: {@code ignore_case}
		 */
		public Builder ignoreCase(boolean value) {
			this.ignoreCase = value;
			return this;
		}

		/**
		 * Required - API name: {@code query_mode}
		 */
		public Builder queryMode(boolean value) {
			this.queryMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CommonGramsTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommonGramsTokenFilter build() {

			return new CommonGramsTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CommonGramsTokenFilter}
	 */
	public static final JsonpDeserializer<CommonGramsTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CommonGramsTokenFilter::setupCommonGramsTokenFilterDeserializer, Builder::build);

	protected static void setupCommonGramsTokenFilterDeserializer(
			DelegatingDeserializer<CommonGramsTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::commonWords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"common_words");
		op.add(Builder::commonWordsPath, JsonpDeserializer.stringDeserializer(), "common_words_path");
		op.add(Builder::ignoreCase, JsonpDeserializer.booleanDeserializer(), "ignore_case");
		op.add(Builder::queryMode, JsonpDeserializer.booleanDeserializer(), "query_mode");

		op.ignore("type");
	}

}
