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

import co.elastic.clients.elasticsearch.core.search.InnerHits;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _types.query_dsl.HasParentQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.HasParentQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class HasParentQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final InnerHits innerHits;

	private final String parentType;

	private final Query query;

	@Nullable
	private final Boolean score;

	// ---------------------------------------------------------------------------------------------

	private HasParentQuery(Builder builder) {
		super(builder);

		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.innerHits = builder.innerHits;
		this.parentType = ApiTypeHelper.requireNonNull(builder.parentType, this, "parentType");
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.score = builder.score;

	}

	public static HasParentQuery of(Function<Builder, ObjectBuilder<HasParentQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.HasParent;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * API name: {@code inner_hits}
	 */
	@Nullable
	public final InnerHits innerHits() {
		return this.innerHits;
	}

	/**
	 * Required - API name: {@code parent_type}
	 */
	public final String parentType() {
		return this.parentType;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final Query query() {
		return this.query;
	}

	/**
	 * API name: {@code score}
	 */
	@Nullable
	public final Boolean score() {
		return this.score;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.innerHits != null) {
			generator.writeKey("inner_hits");
			this.innerHits.serialize(generator, mapper);

		}
		generator.writeKey("parent_type");
		generator.write(this.parentType);

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.score != null) {
			generator.writeKey("score");
			generator.write(this.score);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasParentQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<HasParentQuery> {
		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private InnerHits innerHits;

		private String parentType;

		private Query query;

		@Nullable
		private Boolean score;

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 */
		public final Builder innerHits(@Nullable InnerHits value) {
			this.innerHits = value;
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 */
		public final Builder innerHits(Function<InnerHits.Builder, ObjectBuilder<InnerHits>> fn) {
			return this.innerHits(fn.apply(new InnerHits.Builder()).build());
		}

		/**
		 * Required - API name: {@code parent_type}
		 */
		public final Builder parentType(String value) {
			this.parentType = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code score}
		 */
		public final Builder score(@Nullable Boolean value) {
			this.score = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HasParentQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasParentQuery build() {
			_checkSingleUse();

			return new HasParentQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HasParentQuery}
	 */
	public static final JsonpDeserializer<HasParentQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HasParentQuery::setupHasParentQueryDeserializer);

	protected static void setupHasParentQueryDeserializer(ObjectDeserializer<HasParentQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::innerHits, InnerHits._DESERIALIZER, "inner_hits");
		op.add(Builder::parentType, JsonpDeserializer.stringDeserializer(), "parent_type");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::score, JsonpDeserializer.booleanDeserializer(), "score");

	}

}
