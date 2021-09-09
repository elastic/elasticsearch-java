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
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MatchPhraseQuery
public final class MatchPhraseQuery extends QueryBase {
	@Nullable
	private final String analyzer;

	private final String query;

	@Nullable
	private final Number slop;

	@Nullable
	private final JsonValue zeroTermsQuery;

	// ---------------------------------------------------------------------------------------------

	protected MatchPhraseQuery(Builder builder) {
		super(builder);
		this.analyzer = builder.analyzer;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.slop = builder.slop;
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
	 * API name: {@code query}
	 */
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

		generator.writeKey("query");
		generator.write(this.query);

		if (this.slop != null) {

			generator.writeKey("slop");
			generator.write(this.slop.doubleValue());

		}
		if (this.zeroTermsQuery != null) {

			generator.writeKey("zero_terms_query");
			generator.write(this.zeroTermsQuery);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchPhraseQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MatchPhraseQuery> {
		@Nullable
		private String analyzer;

		private String query;

		@Nullable
		private Number slop;

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
		 * API name: {@code query}
		 */
		public Builder query(String value) {
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
		 * Builds a {@link MatchPhraseQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchPhraseQuery build() {

			return new MatchPhraseQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MatchPhraseQuery
	 */
	public static final JsonpDeserializer<MatchPhraseQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MatchPhraseQuery::setupMatchPhraseQueryDeserializer);

	protected static void setupMatchPhraseQueryDeserializer(DelegatingDeserializer<MatchPhraseQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::slop, JsonpDeserializer.numberDeserializer(), "slop");
		op.add(Builder::zeroTermsQuery, JsonpDeserializer.jsonValueDeserializer(), "zero_terms_query");

	}

}
