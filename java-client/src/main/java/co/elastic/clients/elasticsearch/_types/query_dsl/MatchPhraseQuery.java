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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MatchPhraseQuery
@JsonpDeserializable
public class MatchPhraseQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final String analyzer;

	private final String query;

	@Nullable
	private final Integer slop;

	@Nullable
	private final ZeroTermsQuery zeroTermsQuery;

	// ---------------------------------------------------------------------------------------------

	private MatchPhraseQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");

		this.analyzer = builder.analyzer;
		this.query = ModelTypeHelper.requireNonNull(builder.query, this, "query");
		this.slop = builder.slop;
		this.zeroTermsQuery = builder.zeroTermsQuery;

	}

	public static MatchPhraseQuery of(Function<Builder, ObjectBuilder<MatchPhraseQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "match_phrase";
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * API name: {@code slop}
	 */
	@Nullable
	public final Integer slop() {
		return this.slop;
	}

	/**
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
	 * Builder for {@link MatchPhraseQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MatchPhraseQuery> {
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

		private String query;

		@Nullable
		private Integer slop;

		@Nullable
		private ZeroTermsQuery zeroTermsQuery;

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code slop}
		 */
		public final Builder slop(@Nullable Integer value) {
			this.slop = value;
			return this;
		}

		/**
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
		 * Builds a {@link MatchPhraseQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchPhraseQuery build() {
			_checkSingleUse();

			return new MatchPhraseQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchPhraseQuery}
	 */
	public static final JsonpDeserializer<MatchPhraseQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchPhraseQuery::setupMatchPhraseQueryDeserializer, Builder::build);

	protected static void setupMatchPhraseQueryDeserializer(DelegatingDeserializer<MatchPhraseQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::slop, JsonpDeserializer.integerDeserializer(), "slop");
		op.add(Builder::zeroTermsQuery, ZeroTermsQuery._DESERIALIZER, "zero_terms_query");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("query");

	}

}
