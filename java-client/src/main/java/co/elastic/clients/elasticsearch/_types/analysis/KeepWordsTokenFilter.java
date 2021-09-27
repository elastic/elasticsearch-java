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

// typedef: _types.analysis.KeepWordsTokenFilter
@JsonpDeserializable
public final class KeepWordsTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> keepWords;

	private final boolean keepWordsCase;

	private final String keepWordsPath;

	// ---------------------------------------------------------------------------------------------

	public KeepWordsTokenFilter(Builder builder) {
		super(builder);

		this.keepWords = Objects.requireNonNull(builder.keepWords, "keep_words");
		this.keepWordsCase = Objects.requireNonNull(builder.keepWordsCase, "keep_words_case");
		this.keepWordsPath = Objects.requireNonNull(builder.keepWordsPath, "keep_words_path");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "keep";
	}

	/**
	 * API name: {@code keep_words}
	 */
	public List<String> keepWords() {
		return this.keepWords;
	}

	/**
	 * API name: {@code keep_words_case}
	 */
	public boolean keepWordsCase() {
		return this.keepWordsCase;
	}

	/**
	 * API name: {@code keep_words_path}
	 */
	public String keepWordsPath() {
		return this.keepWordsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "keep");
		super.serializeInternal(generator, mapper);

		generator.writeKey("keep_words");
		generator.writeStartArray();
		for (String item0 : this.keepWords) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("keep_words_case");
		generator.write(this.keepWordsCase);

		generator.writeKey("keep_words_path");
		generator.write(this.keepWordsPath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeepWordsTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeepWordsTokenFilter> {
		private List<String> keepWords;

		private Boolean keepWordsCase;

		private String keepWordsPath;

		/**
		 * API name: {@code keep_words}
		 */
		public Builder keepWords(List<String> value) {
			this.keepWords = value;
			return this;
		}

		/**
		 * API name: {@code keep_words}
		 */
		public Builder keepWords(String... value) {
			this.keepWords = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #keepWords(List)}, creating the list if needed.
		 */
		public Builder addKeepWords(String value) {
			if (this.keepWords == null) {
				this.keepWords = new ArrayList<>();
			}
			this.keepWords.add(value);
			return this;
		}

		/**
		 * API name: {@code keep_words_case}
		 */
		public Builder keepWordsCase(boolean value) {
			this.keepWordsCase = value;
			return this;
		}

		/**
		 * API name: {@code keep_words_path}
		 */
		public Builder keepWordsPath(String value) {
			this.keepWordsPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KeepWordsTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeepWordsTokenFilter build() {

			return new KeepWordsTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeepWordsTokenFilter}
	 */
	public static final JsonpDeserializer<KeepWordsTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KeepWordsTokenFilter::setupKeepWordsTokenFilterDeserializer, Builder::build);

	protected static void setupKeepWordsTokenFilterDeserializer(
			DelegatingDeserializer<KeepWordsTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::keepWords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"keep_words");
		op.add(Builder::keepWordsCase, JsonpDeserializer.booleanDeserializer(), "keep_words_case");
		op.add(Builder::keepWordsPath, JsonpDeserializer.stringDeserializer(), "keep_words_path");

		op.ignore("type");
	}

}
