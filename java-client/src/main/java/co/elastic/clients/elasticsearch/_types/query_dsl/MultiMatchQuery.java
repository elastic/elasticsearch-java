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
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MultiMatchQuery
public final class MultiMatchQuery extends QueryBase {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean autoGenerateSynonymsPhraseQuery;

	@Nullable
	private final Number cutoffFrequency;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final JsonValue fuzziness;

	@Nullable
	private final String fuzzyRewrite;

	@Nullable
	private final Boolean fuzzyTranspositions;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Number maxExpansions;

	@Nullable
	private final JsonValue minimumShouldMatch;

	@Nullable
	private final JsonValue operator;

	@Nullable
	private final Number prefixLength;

	@Nullable
	private final String query;

	@Nullable
	private final Number slop;

	@Nullable
	private final Number tieBreaker;

	@Nullable
	private final JsonValue type;

	@Nullable
	private final Boolean useDisMax;

	@Nullable
	private final JsonValue zeroTermsQuery;

	// ---------------------------------------------------------------------------------------------

	protected MultiMatchQuery(Builder builder) {
		super(builder);
		this.analyzer = builder.analyzer;
		this.autoGenerateSynonymsPhraseQuery = builder.autoGenerateSynonymsPhraseQuery;
		this.cutoffFrequency = builder.cutoffFrequency;
		this.fields = builder.fields;
		this.fuzziness = builder.fuzziness;
		this.fuzzyRewrite = builder.fuzzyRewrite;
		this.fuzzyTranspositions = builder.fuzzyTranspositions;
		this.lenient = builder.lenient;
		this.maxExpansions = builder.maxExpansions;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.operator = builder.operator;
		this.prefixLength = builder.prefixLength;
		this.query = builder.query;
		this.slop = builder.slop;
		this.tieBreaker = builder.tieBreaker;
		this.type = builder.type;
		this.useDisMax = builder.useDisMax;
		this.zeroTermsQuery = builder.zeroTermsQuery;

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code auto_generate_synonyms_phrase_query}
	 */
	@Nullable
	public Boolean autoGenerateSynonymsPhraseQuery() {
		return this.autoGenerateSynonymsPhraseQuery;
	}

	/**
	 * API name: {@code cutoff_frequency}
	 */
	@Nullable
	public Number cutoffFrequency() {
		return this.cutoffFrequency;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code fuzziness}
	 */
	@Nullable
	public JsonValue fuzziness() {
		return this.fuzziness;
	}

	/**
	 * API name: {@code fuzzy_rewrite}
	 */
	@Nullable
	public String fuzzyRewrite() {
		return this.fuzzyRewrite;
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
	 * API name: {@code max_expansions}
	 */
	@Nullable
	public Number maxExpansions() {
		return this.maxExpansions;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public JsonValue minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code operator}
	 */
	@Nullable
	public JsonValue operator() {
		return this.operator;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public Number prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code slop}
	 */
	@Nullable
	public Number slop() {
		return this.slop;
	}

	/**
	 * API name: {@code tie_breaker}
	 */
	@Nullable
	public Number tieBreaker() {
		return this.tieBreaker;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public JsonValue type() {
		return this.type;
	}

	/**
	 * API name: {@code use_dis_max}
	 */
	@Nullable
	public Boolean useDisMax() {
		return this.useDisMax;
	}

	/**
	 * API name: {@code zero_terms_query}
	 */
	@Nullable
	public JsonValue zeroTermsQuery() {
		return this.zeroTermsQuery;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
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
			generator.write(this.cutoffFrequency.doubleValue());

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

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
			generator.write(this.maxExpansions.doubleValue());

		}
		if (this.minimumShouldMatch != null) {

			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}
		if (this.operator != null) {

			generator.writeKey("operator");
			generator.write(this.operator);

		}
		if (this.prefixLength != null) {

			generator.writeKey("prefix_length");
			generator.write(this.prefixLength.doubleValue());

		}
		if (this.query != null) {

			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.slop != null) {

			generator.writeKey("slop");
			generator.write(this.slop.doubleValue());

		}
		if (this.tieBreaker != null) {

			generator.writeKey("tie_breaker");
			generator.write(this.tieBreaker.doubleValue());

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.useDisMax != null) {

			generator.writeKey("use_dis_max");
			generator.write(this.useDisMax);

		}
		if (this.zeroTermsQuery != null) {

			generator.writeKey("zero_terms_query");
			generator.write(this.zeroTermsQuery);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiMatchQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MultiMatchQuery> {
		@Nullable
		private String analyzer;

		@Nullable
		private Boolean autoGenerateSynonymsPhraseQuery;

		@Nullable
		private Number cutoffFrequency;

		@Nullable
		private List<String> fields;

		@Nullable
		private JsonValue fuzziness;

		@Nullable
		private String fuzzyRewrite;

		@Nullable
		private Boolean fuzzyTranspositions;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Number maxExpansions;

		@Nullable
		private JsonValue minimumShouldMatch;

		@Nullable
		private JsonValue operator;

		@Nullable
		private Number prefixLength;

		@Nullable
		private String query;

		@Nullable
		private Number slop;

		@Nullable
		private Number tieBreaker;

		@Nullable
		private JsonValue type;

		@Nullable
		private Boolean useDisMax;

		@Nullable
		private JsonValue zeroTermsQuery;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
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
		 * API name: {@code cutoff_frequency}
		 */
		public Builder cutoffFrequency(@Nullable Number value) {
			this.cutoffFrequency = value;
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
		 * API name: {@code fuzziness}
		 */
		public Builder fuzziness(@Nullable JsonValue value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_rewrite}
		 */
		public Builder fuzzyRewrite(@Nullable String value) {
			this.fuzzyRewrite = value;
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
		 * API name: {@code max_expansions}
		 */
		public Builder maxExpansions(@Nullable Number value) {
			this.maxExpansions = value;
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
		 * API name: {@code operator}
		 */
		public Builder operator(@Nullable JsonValue value) {
			this.operator = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public Builder prefixLength(@Nullable Number value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code slop}
		 */
		public Builder slop(@Nullable Number value) {
			this.slop = value;
			return this;
		}

		/**
		 * API name: {@code tie_breaker}
		 */
		public Builder tieBreaker(@Nullable Number value) {
			this.tieBreaker = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code use_dis_max}
		 */
		public Builder useDisMax(@Nullable Boolean value) {
			this.useDisMax = value;
			return this;
		}

		/**
		 * API name: {@code zero_terms_query}
		 */
		public Builder zeroTermsQuery(@Nullable JsonValue value) {
			this.zeroTermsQuery = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiMatchQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiMatchQuery build() {

			return new MultiMatchQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MultiMatchQuery
	 */
	public static final JsonpDeserializer<MultiMatchQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MultiMatchQuery::setupMultiMatchQueryDeserializer);

	protected static void setupMultiMatchQueryDeserializer(DelegatingDeserializer<MultiMatchQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::autoGenerateSynonymsPhraseQuery, JsonpDeserializer.booleanDeserializer(),
				"auto_generate_synonyms_phrase_query");
		op.add(Builder::cutoffFrequency, JsonpDeserializer.numberDeserializer(), "cutoff_frequency");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::fuzziness, JsonpDeserializer.jsonValueDeserializer(), "fuzziness");
		op.add(Builder::fuzzyRewrite, JsonpDeserializer.stringDeserializer(), "fuzzy_rewrite");
		op.add(Builder::fuzzyTranspositions, JsonpDeserializer.booleanDeserializer(), "fuzzy_transpositions");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::maxExpansions, JsonpDeserializer.numberDeserializer(), "max_expansions");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.jsonValueDeserializer(), "minimum_should_match");
		op.add(Builder::operator, JsonpDeserializer.jsonValueDeserializer(), "operator");
		op.add(Builder::prefixLength, JsonpDeserializer.numberDeserializer(), "prefix_length");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::slop, JsonpDeserializer.numberDeserializer(), "slop");
		op.add(Builder::tieBreaker, JsonpDeserializer.numberDeserializer(), "tie_breaker");
		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");
		op.add(Builder::useDisMax, JsonpDeserializer.booleanDeserializer(), "use_dis_max");
		op.add(Builder::zeroTermsQuery, JsonpDeserializer.jsonValueDeserializer(), "zero_terms_query");

	}

}
