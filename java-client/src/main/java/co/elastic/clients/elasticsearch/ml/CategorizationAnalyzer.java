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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.analysis.CharFilter;
import co.elastic.clients.elasticsearch._types.analysis.TokenFilter;
import co.elastic.clients.elasticsearch._types.analysis.Tokenizer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.CategorizationAnalyzer
@JsonpDeserializable
public final class CategorizationAnalyzer implements JsonpSerializable {
	@Nullable
	private final List<CharFilter> charFilter;

	@Nullable
	private final List<TokenFilter> filter;

	@Nullable
	private final Tokenizer tokenizer;

	// ---------------------------------------------------------------------------------------------

	public CategorizationAnalyzer(Builder builder) {

		this.charFilter = builder.charFilter;
		this.filter = builder.filter;
		this.tokenizer = builder.tokenizer;

	}

	/**
	 * API name: {@code char_filter}
	 */
	@Nullable
	public List<CharFilter> charFilter() {
		return this.charFilter;
	}

	/**
	 * One or more character filters. In addition to the built-in character filters,
	 * other plugins can provide more character filters. If this property is not
	 * specified, no character filters are applied prior to categorization. If you
	 * are customizing some other aspect of the analyzer and you need to achieve the
	 * equivalent of <code>categorization_filters</code> (which are not permitted
	 * when some other aspect of the analyzer is customized), add them here as
	 * pattern replace character filters.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public List<TokenFilter> filter() {
		return this.filter;
	}

	/**
	 * One or more token filters. In addition to the built-in token filters, other
	 * plugins can provide more token filters. If this property is not specified, no
	 * token filters are applied prior to categorization.
	 * <p>
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public Tokenizer tokenizer() {
		return this.tokenizer;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.charFilter != null) {

			generator.writeKey("char_filter");
			generator.writeStartArray();
			for (CharFilter item0 : this.charFilter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.writeStartArray();
			for (TokenFilter item0 : this.filter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tokenizer != null) {

			generator.writeKey("tokenizer");
			this.tokenizer.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CategorizationAnalyzer}.
	 */
	public static class Builder implements ObjectBuilder<CategorizationAnalyzer> {
		@Nullable
		private List<CharFilter> charFilter;

		@Nullable
		private List<TokenFilter> filter;

		@Nullable
		private Tokenizer tokenizer;

		/**
		 * API name: {@code char_filter}
		 */
		public Builder charFilter(@Nullable List<CharFilter> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 */
		public Builder charFilter(CharFilter... value) {
			this.charFilter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #charFilter(List)}, creating the list if needed.
		 */
		public Builder addCharFilter(CharFilter value) {
			if (this.charFilter == null) {
				this.charFilter = new ArrayList<>();
			}
			this.charFilter.add(value);
			return this;
		}

		/**
		 * Set {@link #charFilter(List)} to a singleton list.
		 */
		public Builder charFilter(Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn) {
			return this.charFilter(fn.apply(new CharFilter.Builder()).build());
		}

		/**
		 * Add a value to {@link #charFilter(List)}, creating the list if needed.
		 */
		public Builder addCharFilter(Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn) {
			return this.addCharFilter(fn.apply(new CharFilter.Builder()).build());
		}

		/**
		 * One or more character filters. In addition to the built-in character filters,
		 * other plugins can provide more character filters. If this property is not
		 * specified, no character filters are applied prior to categorization. If you
		 * are customizing some other aspect of the analyzer and you need to achieve the
		 * equivalent of <code>categorization_filters</code> (which are not permitted
		 * when some other aspect of the analyzer is customized), add them here as
		 * pattern replace character filters.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable List<TokenFilter> value) {
			this.filter = value;
			return this;
		}

		/**
		 * One or more character filters. In addition to the built-in character filters,
		 * other plugins can provide more character filters. If this property is not
		 * specified, no character filters are applied prior to categorization. If you
		 * are customizing some other aspect of the analyzer and you need to achieve the
		 * equivalent of <code>categorization_filters</code> (which are not permitted
		 * when some other aspect of the analyzer is customized), add them here as
		 * pattern replace character filters.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(TokenFilter... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(TokenFilter value) {
			if (this.filter == null) {
				this.filter = new ArrayList<>();
			}
			this.filter.add(value);
			return this;
		}

		/**
		 * Set {@link #filter(List)} to a singleton list.
		 */
		public Builder filter(Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn) {
			return this.filter(fn.apply(new TokenFilter.Builder()).build());
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn) {
			return this.addFilter(fn.apply(new TokenFilter.Builder()).build());
		}

		/**
		 * One or more token filters. In addition to the built-in token filters, other
		 * plugins can provide more token filters. If this property is not specified, no
		 * token filters are applied prior to categorization.
		 * <p>
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(@Nullable Tokenizer value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * One or more token filters. In addition to the built-in token filters, other
		 * plugins can provide more token filters. If this property is not specified, no
		 * token filters are applied prior to categorization.
		 * <p>
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(Function<Tokenizer.Builder, ObjectBuilder<Tokenizer>> fn) {
			return this.tokenizer(fn.apply(new Tokenizer.Builder()).build());
		}

		/**
		 * Builds a {@link CategorizationAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CategorizationAnalyzer build() {

			return new CategorizationAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CategorizationAnalyzer}
	 */
	public static final JsonpDeserializer<CategorizationAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CategorizationAnalyzer::setupCategorizationAnalyzerDeserializer, Builder::build);

	protected static void setupCategorizationAnalyzerDeserializer(
			DelegatingDeserializer<CategorizationAnalyzer.Builder> op) {

		op.add(Builder::charFilter, JsonpDeserializer.arrayDeserializer(CharFilter._DESERIALIZER), "char_filter");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(TokenFilter._DESERIALIZER), "filter");
		op.add(Builder::tokenizer, Tokenizer._DESERIALIZER, "tokenizer");

	}

}
