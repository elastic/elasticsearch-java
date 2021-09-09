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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SimpleQueryStringQuery
public final class SimpleQueryStringQuery extends QueryBase {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final Boolean autoGenerateSynonymsPhraseQuery;

	@Nullable
	private final JsonValue defaultOperator;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final JsonValue flags;

	@Nullable
	private final Number fuzzyMaxExpansions;

	@Nullable
	private final Number fuzzyPrefixLength;

	@Nullable
	private final Boolean fuzzyTranspositions;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final JsonValue minimumShouldMatch;

	private final String query;

	@Nullable
	private final String quoteFieldSuffix;

	// ---------------------------------------------------------------------------------------------

	protected SimpleQueryStringQuery(Builder builder) {
		super(builder);
		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.autoGenerateSynonymsPhraseQuery = builder.autoGenerateSynonymsPhraseQuery;
		this.defaultOperator = builder.defaultOperator;
		this.fields = builder.fields;
		this.flags = builder.flags;
		this.fuzzyMaxExpansions = builder.fuzzyMaxExpansions;
		this.fuzzyPrefixLength = builder.fuzzyPrefixLength;
		this.fuzzyTranspositions = builder.fuzzyTranspositions;
		this.lenient = builder.lenient;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.quoteFieldSuffix = builder.quoteFieldSuffix;

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * API name: {@code auto_generate_synonyms_phrase_query}
	 */
	@Nullable
	public Boolean autoGenerateSynonymsPhraseQuery() {
		return this.autoGenerateSynonymsPhraseQuery;
	}

	/**
	 * API name: {@code default_operator}
	 */
	@Nullable
	public JsonValue defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code flags}
	 */
	@Nullable
	public JsonValue flags() {
		return this.flags;
	}

	/**
	 * API name: {@code fuzzy_max_expansions}
	 */
	@Nullable
	public Number fuzzyMaxExpansions() {
		return this.fuzzyMaxExpansions;
	}

	/**
	 * API name: {@code fuzzy_prefix_length}
	 */
	@Nullable
	public Number fuzzyPrefixLength() {
		return this.fuzzyPrefixLength;
	}

	/**
	 * API name: {@code fuzzy_transpositions}
	 */
	@Nullable
	public Boolean fuzzyTranspositions() {
		return this.fuzzyTranspositions;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public JsonValue minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code query}
	 */
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code quote_field_suffix}
	 */
	@Nullable
	public String quoteFieldSuffix() {
		return this.quoteFieldSuffix;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.analyzeWildcard != null) {

			generator.writeKey("analyze_wildcard");
			generator.write(this.analyzeWildcard);

		}
		if (this.autoGenerateSynonymsPhraseQuery != null) {

			generator.writeKey("auto_generate_synonyms_phrase_query");
			generator.write(this.autoGenerateSynonymsPhraseQuery);

		}
		if (this.defaultOperator != null) {

			generator.writeKey("default_operator");
			generator.write(this.defaultOperator);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.flags != null) {

			generator.writeKey("flags");
			generator.write(this.flags);

		}
		if (this.fuzzyMaxExpansions != null) {

			generator.writeKey("fuzzy_max_expansions");
			generator.write(this.fuzzyMaxExpansions.doubleValue());

		}
		if (this.fuzzyPrefixLength != null) {

			generator.writeKey("fuzzy_prefix_length");
			generator.write(this.fuzzyPrefixLength.doubleValue());

		}
		if (this.fuzzyTranspositions != null) {

			generator.writeKey("fuzzy_transpositions");
			generator.write(this.fuzzyTranspositions);

		}
		if (this.lenient != null) {

			generator.writeKey("lenient");
			generator.write(this.lenient);

		}
		if (this.minimumShouldMatch != null) {

			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}

		generator.writeKey("query");
		generator.write(this.query);

		if (this.quoteFieldSuffix != null) {

			generator.writeKey("quote_field_suffix");
			generator.write(this.quoteFieldSuffix);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimpleQueryStringQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SimpleQueryStringQuery> {
		@Nullable
		private String analyzer;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private Boolean autoGenerateSynonymsPhraseQuery;

		@Nullable
		private JsonValue defaultOperator;

		@Nullable
		private List<String> fields;

		@Nullable
		private JsonValue flags;

		@Nullable
		private Number fuzzyMaxExpansions;

		@Nullable
		private Number fuzzyPrefixLength;

		@Nullable
		private Boolean fuzzyTranspositions;

		@Nullable
		private Boolean lenient;

		@Nullable
		private JsonValue minimumShouldMatch;

		private String query;

		@Nullable
		private String quoteFieldSuffix;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * API name: {@code auto_generate_synonyms_phrase_query}
		 */
		public Builder autoGenerateSynonymsPhraseQuery(@Nullable Boolean value) {
			this.autoGenerateSynonymsPhraseQuery = value;
			return this;
		}

		/**
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable JsonValue value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code flags}
		 */
		public Builder flags(@Nullable JsonValue value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_max_expansions}
		 */
		public Builder fuzzyMaxExpansions(@Nullable Number value) {
			this.fuzzyMaxExpansions = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_prefix_length}
		 */
		public Builder fuzzyPrefixLength(@Nullable Number value) {
			this.fuzzyPrefixLength = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_transpositions}
		 */
		public Builder fuzzyTranspositions(@Nullable Boolean value) {
			this.fuzzyTranspositions = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code minimum_should_match}
		 */
		public Builder minimumShouldMatch(@Nullable JsonValue value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code quote_field_suffix}
		 */
		public Builder quoteFieldSuffix(@Nullable String value) {
			this.quoteFieldSuffix = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimpleQueryStringQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimpleQueryStringQuery build() {

			return new SimpleQueryStringQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SimpleQueryStringQuery
	 */
	public static final JsonpDeserializer<SimpleQueryStringQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SimpleQueryStringQuery::setupSimpleQueryStringQueryDeserializer);

	protected static void setupSimpleQueryStringQueryDeserializer(
			DelegatingDeserializer<SimpleQueryStringQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::analyzeWildcard, JsonpDeserializer.booleanDeserializer(), "analyze_wildcard");
		op.add(Builder::autoGenerateSynonymsPhraseQuery, JsonpDeserializer.booleanDeserializer(),
				"auto_generate_synonyms_phrase_query");
		op.add(Builder::defaultOperator, JsonpDeserializer.jsonValueDeserializer(), "default_operator");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::flags, JsonpDeserializer.jsonValueDeserializer(), "flags");
		op.add(Builder::fuzzyMaxExpansions, JsonpDeserializer.numberDeserializer(), "fuzzy_max_expansions");
		op.add(Builder::fuzzyPrefixLength, JsonpDeserializer.numberDeserializer(), "fuzzy_prefix_length");
		op.add(Builder::fuzzyTranspositions, JsonpDeserializer.booleanDeserializer(), "fuzzy_transpositions");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.jsonValueDeserializer(), "minimum_should_match");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::quoteFieldSuffix, JsonpDeserializer.stringDeserializer(), "quote_field_suffix");

	}

}
