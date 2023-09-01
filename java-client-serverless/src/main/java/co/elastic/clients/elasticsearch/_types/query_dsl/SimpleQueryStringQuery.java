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

import co.elastic.clients.json.JsonEnums;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SimpleQueryStringQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SimpleQueryStringQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimpleQueryStringQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final Boolean autoGenerateSynonymsPhraseQuery;

	@Nullable
	private final Operator defaultOperator;

	private final List<String> fields;

	private final List<SimpleQueryStringFlag> flags;

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

	private SimpleQueryStringQuery(Builder builder) {
		super(builder);

		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.autoGenerateSynonymsPhraseQuery = builder.autoGenerateSynonymsPhraseQuery;
		this.defaultOperator = builder.defaultOperator;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.flags = ApiTypeHelper.unmodifiable(builder.flags);
		this.fuzzyMaxExpansions = builder.fuzzyMaxExpansions;
		this.fuzzyPrefixLength = builder.fuzzyPrefixLength;
		this.fuzzyTranspositions = builder.fuzzyTranspositions;
		this.lenient = builder.lenient;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.quoteFieldSuffix = builder.quoteFieldSuffix;

	}

	public static SimpleQueryStringQuery of(Function<Builder, ObjectBuilder<SimpleQueryStringQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SimpleQueryString;
	}

	/**
	 * Analyzer used to convert text in the query string into tokens.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * If <code>true</code>, the query attempts to analyze wildcard terms in the
	 * query string.
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public final Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * If <code>true</code>, the parser creates a match_phrase query for each
	 * multi-position token.
	 * <p>
	 * API name: {@code auto_generate_synonyms_phrase_query}
	 */
	@Nullable
	public final Boolean autoGenerateSynonymsPhraseQuery() {
		return this.autoGenerateSynonymsPhraseQuery;
	}

	/**
	 * Default boolean logic used to interpret text in the query string if no
	 * operators are specified.
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public final Operator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * Array of fields you wish to search. Accepts wildcard expressions. You also
	 * can boost relevance scores for matches to particular fields using a caret
	 * (<code>^</code>) notation. Defaults to the
	 * <code>index.query.default_field index</code> setting, which has a default
	 * value of <code>*</code>.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * List of enabled operators for the simple query string syntax.
	 * <p>
	 * API name: {@code flags}
	 */
	public final List<SimpleQueryStringFlag> flags() {
		return this.flags;
	}

	/**
	 * Maximum number of terms to which the query expands for fuzzy matching.
	 * <p>
	 * API name: {@code fuzzy_max_expansions}
	 */
	@Nullable
	public final Integer fuzzyMaxExpansions() {
		return this.fuzzyMaxExpansions;
	}

	/**
	 * Number of beginning characters left unchanged for fuzzy matching.
	 * <p>
	 * API name: {@code fuzzy_prefix_length}
	 */
	@Nullable
	public final Integer fuzzyPrefixLength() {
		return this.fuzzyPrefixLength;
	}

	/**
	 * If <code>true</code>, edits for fuzzy matching include transpositions of two
	 * adjacent characters (for example, <code>ab</code> to <code>ba</code>).
	 * <p>
	 * API name: {@code fuzzy_transpositions}
	 */
	@Nullable
	public final Boolean fuzzyTranspositions() {
		return this.fuzzyTranspositions;
	}

	/**
	 * If <code>true</code>, format-based errors, such as providing a text value for
	 * a numeric field, are ignored.
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public final Boolean lenient() {
		return this.lenient;
	}

	/**
	 * Minimum number of clauses that must match for a document to be returned.
	 * <p>
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public final String minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * Required - Query string in the simple query string syntax you wish to parse
	 * and use for search.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * Suffix appended to quoted text in the query string.
	 * <p>
	 * API name: {@code quote_field_suffix}
	 */
	@Nullable
	public final String quoteFieldSuffix() {
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
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.flags)) {
			generator.writeKey("flags");
			JsonEnums.serializePipeSeparated(this.flags, generator);
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
		private List<SimpleQueryStringFlag> flags;

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
		 * Analyzer used to convert text in the query string into tokens.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * If <code>true</code>, the query attempts to analyze wildcard terms in the
		 * query string.
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public final Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * If <code>true</code>, the parser creates a match_phrase query for each
		 * multi-position token.
		 * <p>
		 * API name: {@code auto_generate_synonyms_phrase_query}
		 */
		public final Builder autoGenerateSynonymsPhraseQuery(@Nullable Boolean value) {
			this.autoGenerateSynonymsPhraseQuery = value;
			return this;
		}

		/**
		 * Default boolean logic used to interpret text in the query string if no
		 * operators are specified.
		 * <p>
		 * API name: {@code default_operator}
		 */
		public final Builder defaultOperator(@Nullable Operator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * Array of fields you wish to search. Accepts wildcard expressions. You also
		 * can boost relevance scores for matches to particular fields using a caret
		 * (<code>^</code>) notation. Defaults to the
		 * <code>index.query.default_field index</code> setting, which has a default
		 * value of <code>*</code>.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Array of fields you wish to search. Accepts wildcard expressions. You also
		 * can boost relevance scores for matches to particular fields using a caret
		 * (<code>^</code>) notation. Defaults to the
		 * <code>index.query.default_field index</code> setting, which has a default
		 * value of <code>*</code>.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * List of enabled operators for the simple query string syntax.
		 * <p>
		 * API name: {@code flags}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>flags</code>.
		 */
		public final Builder flags(List<SimpleQueryStringFlag> list) {
			this.flags = _listAddAll(this.flags, list);
			return this;
		}

		/**
		 * List of enabled operators for the simple query string syntax.
		 * <p>
		 * API name: {@code flags}
		 * <p>
		 * Adds one or more values to <code>flags</code>.
		 */
		public final Builder flags(SimpleQueryStringFlag value, SimpleQueryStringFlag... values) {
			this.flags = _listAdd(this.flags, value, values);
			return this;
		}

		/**
		 * Maximum number of terms to which the query expands for fuzzy matching.
		 * <p>
		 * API name: {@code fuzzy_max_expansions}
		 */
		public final Builder fuzzyMaxExpansions(@Nullable Integer value) {
			this.fuzzyMaxExpansions = value;
			return this;
		}

		/**
		 * Number of beginning characters left unchanged for fuzzy matching.
		 * <p>
		 * API name: {@code fuzzy_prefix_length}
		 */
		public final Builder fuzzyPrefixLength(@Nullable Integer value) {
			this.fuzzyPrefixLength = value;
			return this;
		}

		/**
		 * If <code>true</code>, edits for fuzzy matching include transpositions of two
		 * adjacent characters (for example, <code>ab</code> to <code>ba</code>).
		 * <p>
		 * API name: {@code fuzzy_transpositions}
		 */
		public final Builder fuzzyTranspositions(@Nullable Boolean value) {
			this.fuzzyTranspositions = value;
			return this;
		}

		/**
		 * If <code>true</code>, format-based errors, such as providing a text value for
		 * a numeric field, are ignored.
		 * <p>
		 * API name: {@code lenient}
		 */
		public final Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * Minimum number of clauses that must match for a document to be returned.
		 * <p>
		 * API name: {@code minimum_should_match}
		 */
		public final Builder minimumShouldMatch(@Nullable String value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * Required - Query string in the simple query string syntax you wish to parse
		 * and use for search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * Suffix appended to quoted text in the query string.
		 * <p>
		 * API name: {@code quote_field_suffix}
		 */
		public final Builder quoteFieldSuffix(@Nullable String value) {
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
			_checkSingleUse();

			return new SimpleQueryStringQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimpleQueryStringQuery}
	 */
	public static final JsonpDeserializer<SimpleQueryStringQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimpleQueryStringQuery::setupSimpleQueryStringQueryDeserializer);

	protected static void setupSimpleQueryStringQueryDeserializer(
			ObjectDeserializer<SimpleQueryStringQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::analyzeWildcard, JsonpDeserializer.booleanDeserializer(), "analyze_wildcard");
		op.add(Builder::autoGenerateSynonymsPhraseQuery, JsonpDeserializer.booleanDeserializer(),
				"auto_generate_synonyms_phrase_query");
		op.add(Builder::defaultOperator, Operator._DESERIALIZER, "default_operator");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::flags, JsonpDeserializer.pipeSeparatedDeserializer(SimpleQueryStringFlag._DESERIALIZER),
				"flags");
		op.add(Builder::fuzzyMaxExpansions, JsonpDeserializer.integerDeserializer(), "fuzzy_max_expansions");
		op.add(Builder::fuzzyPrefixLength, JsonpDeserializer.integerDeserializer(), "fuzzy_prefix_length");
		op.add(Builder::fuzzyTranspositions, JsonpDeserializer.booleanDeserializer(), "fuzzy_transpositions");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.stringDeserializer(), "minimum_should_match");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::quoteFieldSuffix, JsonpDeserializer.stringDeserializer(), "quote_field_suffix");

	}

}
