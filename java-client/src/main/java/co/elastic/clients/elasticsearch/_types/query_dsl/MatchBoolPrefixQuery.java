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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MatchBoolPrefixQuery
public final class MatchBoolPrefixQuery extends QueryBase {
	@Nullable
	private final String analyzer;

	@Nullable
	private final JsonValue fuzziness;

	@Nullable
	private final String fuzzyRewrite;

	@Nullable
	private final Boolean fuzzyTranspositions;

	@Nullable
	private final Number maxExpansions;

	@Nullable
	private final JsonValue minimumShouldMatch;

	@Nullable
	private final JsonValue operator;

	@Nullable
	private final Number prefixLength;

	private final String query;

	// ---------------------------------------------------------------------------------------------

	protected MatchBoolPrefixQuery(Builder builder) {
		super(builder);
		this.analyzer = builder.analyzer;
		this.fuzziness = builder.fuzziness;
		this.fuzzyRewrite = builder.fuzzyRewrite;
		this.fuzzyTranspositions = builder.fuzzyTranspositions;
		this.maxExpansions = builder.maxExpansions;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.operator = builder.operator;
		this.prefixLength = builder.prefixLength;
		this.query = Objects.requireNonNull(builder.query, "query");

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
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
	public String query() {
		return this.query;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

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

		generator.writeKey("query");
		generator.write(this.query);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchBoolPrefixQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MatchBoolPrefixQuery> {
		@Nullable
		private String analyzer;

		@Nullable
		private JsonValue fuzziness;

		@Nullable
		private String fuzzyRewrite;

		@Nullable
		private Boolean fuzzyTranspositions;

		@Nullable
		private Number maxExpansions;

		@Nullable
		private JsonValue minimumShouldMatch;

		@Nullable
		private JsonValue operator;

		@Nullable
		private Number prefixLength;

		private String query;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
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
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchBoolPrefixQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchBoolPrefixQuery build() {

			return new MatchBoolPrefixQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MatchBoolPrefixQuery
	 */
	public static final JsonpDeserializer<MatchBoolPrefixQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MatchBoolPrefixQuery::setupMatchBoolPrefixQueryDeserializer);

	protected static void setupMatchBoolPrefixQueryDeserializer(
			DelegatingDeserializer<MatchBoolPrefixQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::fuzziness, JsonpDeserializer.jsonValueDeserializer(), "fuzziness");
		op.add(Builder::fuzzyRewrite, JsonpDeserializer.stringDeserializer(), "fuzzy_rewrite");
		op.add(Builder::fuzzyTranspositions, JsonpDeserializer.booleanDeserializer(), "fuzzy_transpositions");
		op.add(Builder::maxExpansions, JsonpDeserializer.numberDeserializer(), "max_expansions");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.jsonValueDeserializer(), "minimum_should_match");
		op.add(Builder::operator, JsonpDeserializer.jsonValueDeserializer(), "operator");
		op.add(Builder::prefixLength, JsonpDeserializer.numberDeserializer(), "prefix_length");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");

	}

}
