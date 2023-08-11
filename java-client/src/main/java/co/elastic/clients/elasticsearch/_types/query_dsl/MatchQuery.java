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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MatchQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.MatchQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatchQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean autoGenerateSynonymsPhraseQuery;

	@Nullable
	private final Double cutoffFrequency;

	@Nullable
	private final String fuzziness;

	@Nullable
	private final String fuzzyRewrite;

	@Nullable
	private final Boolean fuzzyTranspositions;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Integer maxExpansions;

	@Nullable
	private final String minimumShouldMatch;

	@Nullable
	private final Operator operator;

	@Nullable
	private final Integer prefixLength;

	private final FieldValue query;

	@Nullable
	private final ZeroTermsQuery zeroTermsQuery;

	// ---------------------------------------------------------------------------------------------

	private MatchQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.analyzer = builder.analyzer;
		this.autoGenerateSynonymsPhraseQuery = builder.autoGenerateSynonymsPhraseQuery;
		this.cutoffFrequency = builder.cutoffFrequency;
		this.fuzziness = builder.fuzziness;
		this.fuzzyRewrite = builder.fuzzyRewrite;
		this.fuzzyTranspositions = builder.fuzzyTranspositions;
		this.lenient = builder.lenient;
		this.maxExpansions = builder.maxExpansions;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.operator = builder.operator;
		this.prefixLength = builder.prefixLength;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.zeroTermsQuery = builder.zeroTermsQuery;

	}

	public static MatchQuery of(Function<Builder, ObjectBuilder<MatchQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Match;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Analyzer used to convert the text in the query value into tokens.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * If <code>true</code>, match phrase queries are automatically created for
	 * multi-term synonyms.
	 * <p>
	 * API name: {@code auto_generate_synonyms_phrase_query}
	 */
	@Nullable
	public final Boolean autoGenerateSynonymsPhraseQuery() {
		return this.autoGenerateSynonymsPhraseQuery;
	}

	/**
	 * API name: {@code cutoff_frequency}
	 * 
	 * @deprecated 7.3.0
	 */
	@Deprecated
	@Nullable
	public final Double cutoffFrequency() {
		return this.cutoffFrequency;
	}

	/**
	 * Maximum edit distance allowed for matching.
	 * <p>
	 * API name: {@code fuzziness}
	 */
	@Nullable
	public final String fuzziness() {
		return this.fuzziness;
	}

	/**
	 * Method used to rewrite the query.
	 * <p>
	 * API name: {@code fuzzy_rewrite}
	 */
	@Nullable
	public final String fuzzyRewrite() {
		return this.fuzzyRewrite;
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
	 * If <code>true</code>, format-based errors, such as providing a text query
	 * value for a numeric field, are ignored.
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public final Boolean lenient() {
		return this.lenient;
	}

	/**
	 * Maximum number of terms to which the query will expand.
	 * <p>
	 * API name: {@code max_expansions}
	 */
	@Nullable
	public final Integer maxExpansions() {
		return this.maxExpansions;
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
	 * Boolean logic used to interpret text in the query value.
	 * <p>
	 * API name: {@code operator}
	 */
	@Nullable
	public final Operator operator() {
		return this.operator;
	}

	/**
	 * Number of beginning characters left unchanged for fuzzy matching.
	 * <p>
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public final Integer prefixLength() {
		return this.prefixLength;
	}

	/**
	 * Required - Text, number, boolean value or date you wish to find in the
	 * provided field.
	 * <p>
	 * API name: {@code query}
	 */
	public final FieldValue query() {
		return this.query;
	}

	/**
	 * Indicates whether no documents are returned if the <code>analyzer</code>
	 * removes all tokens, such as when using a <code>stop</code> filter.
	 * <p>
	 * API name: {@code zero_terms_query}
	 */
	@Nullable
	public final ZeroTermsQuery zeroTermsQuery() {
		return this.zeroTermsQuery;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.autoGenerateSynonymsPhraseQuery != null) {
			generator.writeKey("auto_generate_synonyms_phrase_query");
			generator.write(this.autoGenerateSynonymsPhraseQuery);

		}
		if (this.cutoffFrequency != null) {
			generator.writeKey("cutoff_frequency");
			generator.write(this.cutoffFrequency);

		}
		if (this.fuzziness != null) {
			generator.writeKey("fuzziness");
			generator.write(this.fuzziness);

		}
		if (this.fuzzyRewrite != null) {
			generator.writeKey("fuzzy_rewrite");
			generator.write(this.fuzzyRewrite);

		}
		if (this.fuzzyTranspositions != null) {
			generator.writeKey("fuzzy_transpositions");
			generator.write(this.fuzzyTranspositions);

		}
		if (this.lenient != null) {
			generator.writeKey("lenient");
			generator.write(this.lenient);

		}
		if (this.maxExpansions != null) {
			generator.writeKey("max_expansions");
			generator.write(this.maxExpansions);

		}
		if (this.minimumShouldMatch != null) {
			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}
		if (this.operator != null) {
			generator.writeKey("operator");
			this.operator.serialize(generator, mapper);
		}
		if (this.prefixLength != null) {
			generator.writeKey("prefix_length");
			generator.write(this.prefixLength);

		}
		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.zeroTermsQuery != null) {
			generator.writeKey("zero_terms_query");
			this.zeroTermsQuery.serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MatchQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean autoGenerateSynonymsPhraseQuery;

		@Nullable
		private Double cutoffFrequency;

		@Nullable
		private String fuzziness;

		@Nullable
		private String fuzzyRewrite;

		@Nullable
		private Boolean fuzzyTranspositions;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Integer maxExpansions;

		@Nullable
		private String minimumShouldMatch;

		@Nullable
		private Operator operator;

		@Nullable
		private Integer prefixLength;

		private FieldValue query;

		@Nullable
		private ZeroTermsQuery zeroTermsQuery;

		/**
		 * Analyzer used to convert the text in the query value into tokens.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * If <code>true</code>, match phrase queries are automatically created for
		 * multi-term synonyms.
		 * <p>
		 * API name: {@code auto_generate_synonyms_phrase_query}
		 */
		public final Builder autoGenerateSynonymsPhraseQuery(@Nullable Boolean value) {
			this.autoGenerateSynonymsPhraseQuery = value;
			return this;
		}

		/**
		 * API name: {@code cutoff_frequency}
		 * 
		 * @deprecated 7.3.0
		 */
		@Deprecated
		public final Builder cutoffFrequency(@Nullable Double value) {
			this.cutoffFrequency = value;
			return this;
		}

		/**
		 * Maximum edit distance allowed for matching.
		 * <p>
		 * API name: {@code fuzziness}
		 */
		public final Builder fuzziness(@Nullable String value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * Method used to rewrite the query.
		 * <p>
		 * API name: {@code fuzzy_rewrite}
		 */
		public final Builder fuzzyRewrite(@Nullable String value) {
			this.fuzzyRewrite = value;
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
		 * If <code>true</code>, format-based errors, such as providing a text query
		 * value for a numeric field, are ignored.
		 * <p>
		 * API name: {@code lenient}
		 */
		public final Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * Maximum number of terms to which the query will expand.
		 * <p>
		 * API name: {@code max_expansions}
		 */
		public final Builder maxExpansions(@Nullable Integer value) {
			this.maxExpansions = value;
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
		 * Boolean logic used to interpret text in the query value.
		 * <p>
		 * API name: {@code operator}
		 */
		public final Builder operator(@Nullable Operator value) {
			this.operator = value;
			return this;
		}

		/**
		 * Number of beginning characters left unchanged for fuzzy matching.
		 * <p>
		 * API name: {@code prefix_length}
		 */
		public final Builder prefixLength(@Nullable Integer value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * Required - Text, number, boolean value or date you wish to find in the
		 * provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(FieldValue value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - Text, number, boolean value or date you wish to find in the
		 * provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.query(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Required - Text, number, boolean value or date you wish to find in the
		 * provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - Text, number, boolean value or date you wish to find in the
		 * provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(long value) {
			this.query = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - Text, number, boolean value or date you wish to find in the
		 * provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(double value) {
			this.query = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - Text, number, boolean value or date you wish to find in the
		 * provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(boolean value) {
			this.query = FieldValue.of(value);
			return this;
		}

		/**
		 * Indicates whether no documents are returned if the <code>analyzer</code>
		 * removes all tokens, such as when using a <code>stop</code> filter.
		 * <p>
		 * API name: {@code zero_terms_query}
		 */
		public final Builder zeroTermsQuery(@Nullable ZeroTermsQuery value) {
			this.zeroTermsQuery = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchQuery build() {
			_checkSingleUse();

			return new MatchQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchQuery}
	 */
	public static final JsonpDeserializer<MatchQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchQuery::setupMatchQueryDeserializer);

	protected static void setupMatchQueryDeserializer(ObjectDeserializer<MatchQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::autoGenerateSynonymsPhraseQuery, JsonpDeserializer.booleanDeserializer(),
				"auto_generate_synonyms_phrase_query");
		op.add(Builder::cutoffFrequency, JsonpDeserializer.doubleDeserializer(), "cutoff_frequency");
		op.add(Builder::fuzziness, JsonpDeserializer.stringDeserializer(), "fuzziness");
		op.add(Builder::fuzzyRewrite, JsonpDeserializer.stringDeserializer(), "fuzzy_rewrite");
		op.add(Builder::fuzzyTranspositions, JsonpDeserializer.booleanDeserializer(), "fuzzy_transpositions");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::maxExpansions, JsonpDeserializer.integerDeserializer(), "max_expansions");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.stringDeserializer(), "minimum_should_match");
		op.add(Builder::operator, Operator._DESERIALIZER, "operator");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::query, FieldValue._DESERIALIZER, "query");
		op.add(Builder::zeroTermsQuery, ZeroTermsQuery._DESERIALIZER, "zero_terms_query");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("query");

	}

}
