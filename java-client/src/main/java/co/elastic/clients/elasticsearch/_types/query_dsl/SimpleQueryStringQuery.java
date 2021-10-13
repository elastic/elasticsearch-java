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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SimpleQueryStringQuery
@JsonpDeserializable
public final class SimpleQueryStringQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final Boolean autoGenerateSynonymsPhraseQuery;

	@Nullable
	private final Operator defaultOperator;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final SimpleQueryStringFlags flags;

	@Nullable
	private final Integer fuzzyMaxExpansions;

	@Nullable
	private final Integer fuzzyPrefixLength;

	@Nullable
	private final Boolean fuzzyTranspositions;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final String minimumShouldMatch;

	private final String query;

	@Nullable
	private final String quoteFieldSuffix;

	// ---------------------------------------------------------------------------------------------

	public SimpleQueryStringQuery(Builder builder) {
		super(builder);

		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.autoGenerateSynonymsPhraseQuery = builder.autoGenerateSynonymsPhraseQuery;
		this.defaultOperator = builder.defaultOperator;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.flags = builder.flags;
		this.fuzzyMaxExpansions = builder.fuzzyMaxExpansions;
		this.fuzzyPrefixLength = builder.fuzzyPrefixLength;
		this.fuzzyTranspositions = builder.fuzzyTranspositions;
		this.lenient = builder.lenient;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.quoteFieldSuffix = builder.quoteFieldSuffix;

	}

	public SimpleQueryStringQuery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "simple_query_string";
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
	public Operator defaultOperator() {
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
	public SimpleQueryStringFlags flags() {
		return this.flags;
	}

	/**
	 * API name: {@code fuzzy_max_expansions}
	 */
	@Nullable
	public Integer fuzzyMaxExpansions() {
		return this.fuzzyMaxExpansions;
	}

	/**
	 * API name: {@code fuzzy_prefix_length}
	 */
	@Nullable
	public Integer fuzzyPrefixLength() {
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
	public String minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * Required - API name: {@code query}
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

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
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
			this.defaultOperator.serialize(generator, mapper);
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
			this.flags.serialize(generator, mapper);
		}
		if (this.fuzzyMaxExpansions != null) {

			generator.writeKey("fuzzy_max_expansions");
			generator.write(this.fuzzyMaxExpansions);

		}
		if (this.fuzzyPrefixLength != null) {

			generator.writeKey("fuzzy_prefix_length");
			generator.write(this.fuzzyPrefixLength);

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
		private Operator defaultOperator;

		@Nullable
		private List<String> fields;

		@Nullable
		private SimpleQueryStringFlags flags;

		@Nullable
		private Integer fuzzyMaxExpansions;

		@Nullable
		private Integer fuzzyPrefixLength;

		@Nullable
		private Boolean fuzzyTranspositions;

		@Nullable
		private Boolean lenient;

		@Nullable
		private String minimumShouldMatch;

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
		public Builder defaultOperator(@Nullable Operator value) {
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
		public Builder flags(@Nullable SimpleQueryStringFlags value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_max_expansions}
		 */
		public Builder fuzzyMaxExpansions(@Nullable Integer value) {
			this.fuzzyMaxExpansions = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_prefix_length}
		 */
		public Builder fuzzyPrefixLength(@Nullable Integer value) {
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
		public Builder minimumShouldMatch(@Nullable String value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
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
	 * Json deserializer for {@link SimpleQueryStringQuery}
	 */
	public static final JsonpDeserializer<SimpleQueryStringQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimpleQueryStringQuery::setupSimpleQueryStringQueryDeserializer, Builder::build);

	protected static void setupSimpleQueryStringQueryDeserializer(
			DelegatingDeserializer<SimpleQueryStringQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::analyzeWildcard, JsonpDeserializer.booleanDeserializer(), "analyze_wildcard");
		op.add(Builder::autoGenerateSynonymsPhraseQuery, JsonpDeserializer.booleanDeserializer(),
				"auto_generate_synonyms_phrase_query");
		op.add(Builder::defaultOperator, Operator._DESERIALIZER, "default_operator");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::flags, SimpleQueryStringFlags._DESERIALIZER, "flags");
		op.add(Builder::fuzzyMaxExpansions, JsonpDeserializer.integerDeserializer(), "fuzzy_max_expansions");
		op.add(Builder::fuzzyPrefixLength, JsonpDeserializer.integerDeserializer(), "fuzzy_prefix_length");
		op.add(Builder::fuzzyTranspositions, JsonpDeserializer.booleanDeserializer(), "fuzzy_transpositions");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.stringDeserializer(), "minimum_should_match");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::quoteFieldSuffix, JsonpDeserializer.stringDeserializer(), "quote_field_suffix");

	}

}
