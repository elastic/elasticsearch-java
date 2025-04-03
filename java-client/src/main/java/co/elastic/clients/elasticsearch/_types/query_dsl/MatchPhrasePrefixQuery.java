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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.query_dsl.MatchPhrasePrefixQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.MatchPhrasePrefixQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatchPhrasePrefixQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Integer maxExpansions;

	private final String query;

	@Nullable
	private final Integer slop;

	@Nullable
	private final ZeroTermsQuery zeroTermsQuery;

	// ---------------------------------------------------------------------------------------------

	private MatchPhrasePrefixQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.analyzer = builder.analyzer;
		this.maxExpansions = builder.maxExpansions;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.slop = builder.slop;
		this.zeroTermsQuery = builder.zeroTermsQuery;

	}

	public static MatchPhrasePrefixQuery of(Function<Builder, ObjectBuilder<MatchPhrasePrefixQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.MatchPhrasePrefix;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Analyzer used to convert text in the query value into tokens.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Maximum number of terms to which the last provided term of the query value
	 * will expand.
	 * <p>
	 * API name: {@code max_expansions}
	 */
	@Nullable
	public final Integer maxExpansions() {
		return this.maxExpansions;
	}

	/**
	 * Required - Text you wish to find in the provided field.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * Maximum number of positions allowed between matching tokens.
	 * <p>
	 * API name: {@code slop}
	 */
	@Nullable
	public final Integer slop() {
		return this.slop;
	}

	/**
	 * Indicates whether no documents are returned if the analyzer removes all
	 * tokens, such as when using a <code>stop</code> filter.
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
		if (this.maxExpansions != null) {
			generator.writeKey("max_expansions");
			generator.write(this.maxExpansions);

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (this.slop != null) {
			generator.writeKey("slop");
			generator.write(this.slop);

		}
		if (this.zeroTermsQuery != null) {
			generator.writeKey("zero_terms_query");
			this.zeroTermsQuery.serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchPhrasePrefixQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MatchPhrasePrefixQuery> {
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
		private Integer maxExpansions;

		private String query;

		@Nullable
		private Integer slop;

		@Nullable
		private ZeroTermsQuery zeroTermsQuery;

		/**
		 * Analyzer used to convert text in the query value into tokens.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Maximum number of terms to which the last provided term of the query value
		 * will expand.
		 * <p>
		 * API name: {@code max_expansions}
		 */
		public final Builder maxExpansions(@Nullable Integer value) {
			this.maxExpansions = value;
			return this;
		}

		/**
		 * Required - Text you wish to find in the provided field.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * Maximum number of positions allowed between matching tokens.
		 * <p>
		 * API name: {@code slop}
		 */
		public final Builder slop(@Nullable Integer value) {
			this.slop = value;
			return this;
		}

		/**
		 * Indicates whether no documents are returned if the analyzer removes all
		 * tokens, such as when using a <code>stop</code> filter.
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
		 * Builds a {@link MatchPhrasePrefixQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchPhrasePrefixQuery build() {
			_checkSingleUse();

			return new MatchPhrasePrefixQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchPhrasePrefixQuery}
	 */
	public static final JsonpDeserializer<MatchPhrasePrefixQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MatchPhrasePrefixQuery::setupMatchPhrasePrefixQueryDeserializer);

	protected static void setupMatchPhrasePrefixQueryDeserializer(
			ObjectDeserializer<MatchPhrasePrefixQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::maxExpansions, JsonpDeserializer.integerDeserializer(), "max_expansions");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::slop, JsonpDeserializer.integerDeserializer(), "slop");
		op.add(Builder::zeroTermsQuery, ZeroTermsQuery._DESERIALIZER, "zero_terms_query");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("query");

	}

}
