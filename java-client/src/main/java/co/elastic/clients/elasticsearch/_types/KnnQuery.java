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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: _types.KnnQuery

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.KnnQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final List<Float> queryVector;

	@Nullable
	private final QueryVectorBuilder queryVectorBuilder;

	@Nullable
	private final Integer numCandidates;

	@Nullable
	private final Integer k;

	private final List<Query> filter;

	@Nullable
	private final Float similarity;

	// ---------------------------------------------------------------------------------------------

	private KnnQuery(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.queryVector = ApiTypeHelper.unmodifiable(builder.queryVector);
		this.queryVectorBuilder = builder.queryVectorBuilder;
		this.numCandidates = builder.numCandidates;
		this.k = builder.k;
		this.filter = ApiTypeHelper.unmodifiable(builder.filter);
		this.similarity = builder.similarity;

	}

	public static KnnQuery of(Function<Builder, ObjectBuilder<KnnQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Knn;
	}

	/**
	 * Required - The name of the vector field to search against
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The query vector
	 * <p>
	 * API name: {@code query_vector}
	 */
	public final List<Float> queryVector() {
		return this.queryVector;
	}

	/**
	 * The query vector builder. You must provide a query_vector_builder or
	 * query_vector, but not both.
	 * <p>
	 * API name: {@code query_vector_builder}
	 */
	@Nullable
	public final QueryVectorBuilder queryVectorBuilder() {
		return this.queryVectorBuilder;
	}

	/**
	 * The number of nearest neighbor candidates to consider per shard
	 * <p>
	 * API name: {@code num_candidates}
	 */
	@Nullable
	public final Integer numCandidates() {
		return this.numCandidates;
	}

	/**
	 * The final number of nearest neighbors to return as top hits
	 * <p>
	 * API name: {@code k}
	 */
	@Nullable
	public final Integer k() {
		return this.k;
	}

	/**
	 * Filters for the kNN search query
	 * <p>
	 * API name: {@code filter}
	 */
	public final List<Query> filter() {
		return this.filter;
	}

	/**
	 * The minimum similarity for a vector to be considered a match
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final Float similarity() {
		return this.similarity;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.queryVector)) {
			generator.writeKey("query_vector");
			generator.writeStartArray();
			for (Float item0 : this.queryVector) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.queryVectorBuilder != null) {
			generator.writeKey("query_vector_builder");
			this.queryVectorBuilder.serialize(generator, mapper);

		}
		if (this.numCandidates != null) {
			generator.writeKey("num_candidates");
			generator.write(this.numCandidates);

		}
		if (this.k != null) {
			generator.writeKey("k");
			generator.write(this.k);

		}
		if (ApiTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (Query item0 : this.filter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.similarity != null) {
			generator.writeKey("similarity");
			generator.write(this.similarity);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<KnnQuery> {
		private String field;

		@Nullable
		private List<Float> queryVector;

		@Nullable
		private QueryVectorBuilder queryVectorBuilder;

		@Nullable
		private Integer numCandidates;

		@Nullable
		private Integer k;

		@Nullable
		private List<Query> filter;

		@Nullable
		private Float similarity;

		/**
		 * Required - The name of the vector field to search against
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The query vector
		 * <p>
		 * API name: {@code query_vector}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>queryVector</code>.
		 */
		public final Builder queryVector(List<Float> list) {
			this.queryVector = _listAddAll(this.queryVector, list);
			return this;
		}

		/**
		 * The query vector
		 * <p>
		 * API name: {@code query_vector}
		 * <p>
		 * Adds one or more values to <code>queryVector</code>.
		 */
		public final Builder queryVector(Float value, Float... values) {
			this.queryVector = _listAdd(this.queryVector, value, values);
			return this;
		}

		/**
		 * The query vector builder. You must provide a query_vector_builder or
		 * query_vector, but not both.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(@Nullable QueryVectorBuilder value) {
			this.queryVectorBuilder = value;
			return this;
		}

		/**
		 * The query vector builder. You must provide a query_vector_builder or
		 * query_vector, but not both.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(
				Function<QueryVectorBuilder.Builder, ObjectBuilder<QueryVectorBuilder>> fn) {
			return this.queryVectorBuilder(fn.apply(new QueryVectorBuilder.Builder()).build());
		}

		/**
		 * The number of nearest neighbor candidates to consider per shard
		 * <p>
		 * API name: {@code num_candidates}
		 */
		public final Builder numCandidates(@Nullable Integer value) {
			this.numCandidates = value;
			return this;
		}

		/**
		 * The final number of nearest neighbors to return as top hits
		 * <p>
		 * API name: {@code k}
		 */
		public final Builder k(@Nullable Integer value) {
			this.k = value;
			return this;
		}

		/**
		 * Filters for the kNN search query
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filter</code>.
		 */
		public final Builder filter(List<Query> list) {
			this.filter = _listAddAll(this.filter, list);
			return this;
		}

		/**
		 * Filters for the kNN search query
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds one or more values to <code>filter</code>.
		 */
		public final Builder filter(Query value, Query... values) {
			this.filter = _listAdd(this.filter, value, values);
			return this;
		}

		/**
		 * Filters for the kNN search query
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds a value to <code>filter</code> using a builder lambda.
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * The minimum similarity for a vector to be considered a match
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable Float value) {
			this.similarity = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnQuery build() {
			_checkSingleUse();

			return new KnnQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnQuery}
	 */
	public static final JsonpDeserializer<KnnQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnQuery::setupKnnQueryDeserializer);

	protected static void setupKnnQueryDeserializer(ObjectDeserializer<KnnQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.floatDeserializer()),
				"query_vector");
		op.add(Builder::queryVectorBuilder, QueryVectorBuilder._DESERIALIZER, "query_vector_builder");
		op.add(Builder::numCandidates, JsonpDeserializer.integerDeserializer(), "num_candidates");
		op.add(Builder::k, JsonpDeserializer.integerDeserializer(), "k");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "filter");
		op.add(Builder::similarity, JsonpDeserializer.floatDeserializer(), "similarity");

	}

}
