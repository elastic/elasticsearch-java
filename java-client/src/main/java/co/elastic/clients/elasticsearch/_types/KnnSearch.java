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
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
import co.elastic.clients.elasticsearch.core.search.InnerHits;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: _types.KnnSearch

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.KnnSearch">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnSearch implements JsonpSerializable {
	private final String field;

	private final List<Float> queryVector;

	@Nullable
	private final QueryVectorBuilder queryVectorBuilder;

	@Nullable
	private final Integer k;

	@Nullable
	private final Integer numCandidates;

	@Nullable
	private final Float boost;

	private final List<Query> filter;

	@Nullable
	private final Float similarity;

	@Nullable
	private final InnerHits innerHits;

	@Nullable
	private final RescoreVector rescoreVector;

	// ---------------------------------------------------------------------------------------------

	private KnnSearch(Builder builder) {

		this.field = ApiTypeHelper.requireNonNullWithDefault(builder.field, this, "field", this.field());
		this.queryVector = ApiTypeHelper.unmodifiable(builder.queryVector);
		this.queryVectorBuilder = builder.queryVectorBuilder;
		this.k = builder.k;
		this.numCandidates = builder.numCandidates;
		this.boost = builder.boost;
		this.filter = ApiTypeHelper.unmodifiable(builder.filter);
		this.similarity = builder.similarity;
		this.innerHits = builder.innerHits;
		this.rescoreVector = builder.rescoreVector;

	}

	public static KnnSearch of(Function<Builder, ObjectBuilder<KnnSearch>> fn) {
		return fn.apply(new Builder()).build();
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
	 * The final number of nearest neighbors to return as top hits
	 * <p>
	 * API name: {@code k}
	 */
	@Nullable
	public final Integer k() {
		return this.k;
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
	 * Boost value to apply to kNN scores
	 * <p>
	 * API name: {@code boost}
	 */
	@Nullable
	public final Float boost() {
		return this.boost;
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

	/**
	 * If defined, each search hit will contain inner hits.
	 * <p>
	 * API name: {@code inner_hits}
	 */
	@Nullable
	public final InnerHits innerHits() {
		return this.innerHits;
	}

	/**
	 * Apply oversampling and rescoring to quantized vectors *
	 * <p>
	 * API name: {@code rescore_vector}
	 */
	@Nullable
	public final RescoreVector rescoreVector() {
		return this.rescoreVector;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

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
		if (this.k != null) {
			generator.writeKey("k");
			generator.write(this.k);

		}
		if (this.numCandidates != null) {
			generator.writeKey("num_candidates");
			generator.write(this.numCandidates);

		}
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

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
		if (this.innerHits != null) {
			generator.writeKey("inner_hits");
			this.innerHits.serialize(generator, mapper);

		}
		if (this.rescoreVector != null) {
			generator.writeKey("rescore_vector");
			this.rescoreVector.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnSearch}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<KnnSearch> {
		private String field;

		@Nullable
		private List<Float> queryVector;

		@Nullable
		private QueryVectorBuilder queryVectorBuilder;

		@Nullable
		private Integer k;

		@Nullable
		private Integer numCandidates;

		@Nullable
		private Float boost;

		@Nullable
		private List<Query> filter;

		@Nullable
		private Float similarity;

		@Nullable
		private InnerHits innerHits;

		@Nullable
		private RescoreVector rescoreVector;

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
		 * The query vector builder. You must provide a query_vector_builder or
		 * query_vector, but not both.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(QueryVectorBuilderVariant value) {
			this.queryVectorBuilder = value._toQueryVectorBuilder();
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
		 * The number of nearest neighbor candidates to consider per shard
		 * <p>
		 * API name: {@code num_candidates}
		 */
		public final Builder numCandidates(@Nullable Integer value) {
			this.numCandidates = value;
			return this;
		}

		/**
		 * Boost value to apply to kNN scores
		 * <p>
		 * API name: {@code boost}
		 */
		public final Builder boost(@Nullable Float value) {
			this.boost = value;
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
		 * Adds one or more values to <code>filter</code>.
		 */
		public final Builder filter(QueryVariant value, QueryVariant... values) {
			this.filter = _listAdd(this.filter, value._toQuery());
			for (QueryVariant v : values) {
				_listAdd(this.filter, v._toQuery());
			}
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

		/**
		 * If defined, each search hit will contain inner hits.
		 * <p>
		 * API name: {@code inner_hits}
		 */
		public final Builder innerHits(@Nullable InnerHits value) {
			this.innerHits = value;
			return this;
		}

		/**
		 * If defined, each search hit will contain inner hits.
		 * <p>
		 * API name: {@code inner_hits}
		 */
		public final Builder innerHits(Function<InnerHits.Builder, ObjectBuilder<InnerHits>> fn) {
			return this.innerHits(fn.apply(new InnerHits.Builder()).build());
		}

		/**
		 * Apply oversampling and rescoring to quantized vectors *
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final Builder rescoreVector(@Nullable RescoreVector value) {
			this.rescoreVector = value;
			return this;
		}

		/**
		 * Apply oversampling and rescoring to quantized vectors *
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final Builder rescoreVector(Function<RescoreVector.Builder, ObjectBuilder<RescoreVector>> fn) {
			return this.rescoreVector(fn.apply(new RescoreVector.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnSearch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnSearch build() {
			_checkSingleUse();

			return new KnnSearch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnSearch}
	 */
	public static final JsonpDeserializer<KnnSearch> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnSearch::setupKnnSearchDeserializer);

	protected static void setupKnnSearchDeserializer(ObjectDeserializer<KnnSearch.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.floatDeserializer()),
				"query_vector");
		op.add(Builder::queryVectorBuilder, QueryVectorBuilder._DESERIALIZER, "query_vector_builder");
		op.add(Builder::k, JsonpDeserializer.integerDeserializer(), "k");
		op.add(Builder::numCandidates, JsonpDeserializer.integerDeserializer(), "num_candidates");
		op.add(Builder::boost, JsonpDeserializer.floatDeserializer(), "boost");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "filter");
		op.add(Builder::similarity, JsonpDeserializer.floatDeserializer(), "similarity");
		op.add(Builder::innerHits, InnerHits._DESERIALIZER, "inner_hits");
		op.add(Builder::rescoreVector, RescoreVector._DESERIALIZER, "rescore_vector");

	}

}
