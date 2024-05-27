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

// typedef: _types.KnnRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.KnnRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnRetriever extends RetrieverBase implements RetrieverVariant {
	private final String field;

	private final List<Float> queryVector;

	@Nullable
	private final QueryVectorBuilder queryVectorBuilder;

	private final int k;

	private final int numCandidates;

	@Nullable
	private final Float similarity;

	// ---------------------------------------------------------------------------------------------

	private KnnRetriever(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.queryVector = ApiTypeHelper.unmodifiable(builder.queryVector);
		this.queryVectorBuilder = builder.queryVectorBuilder;
		this.k = ApiTypeHelper.requireNonNull(builder.k, this, "k");
		this.numCandidates = ApiTypeHelper.requireNonNull(builder.numCandidates, this, "numCandidates");
		this.similarity = builder.similarity;

	}

	public static KnnRetriever of(Function<Builder, ObjectBuilder<KnnRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Knn;
	}

	/**
	 * Required - The name of the vector field to search against.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Query vector. Must have the same number of dimensions as the vector field you
	 * are searching against. You must provide a query_vector_builder or
	 * query_vector, but not both.
	 * <p>
	 * API name: {@code query_vector}
	 */
	public final List<Float> queryVector() {
		return this.queryVector;
	}

	/**
	 * Defines a model to build a query vector.
	 * <p>
	 * API name: {@code query_vector_builder}
	 */
	@Nullable
	public final QueryVectorBuilder queryVectorBuilder() {
		return this.queryVectorBuilder;
	}

	/**
	 * Required - Number of nearest neighbors to return as top hits.
	 * <p>
	 * API name: {@code k}
	 */
	public final int k() {
		return this.k;
	}

	/**
	 * Required - Number of nearest neighbor candidates to consider per shard.
	 * <p>
	 * API name: {@code num_candidates}
	 */
	public final int numCandidates() {
		return this.numCandidates;
	}

	/**
	 * The minimum similarity required for a document to be considered a match.
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
		generator.writeKey("k");
		generator.write(this.k);

		generator.writeKey("num_candidates");
		generator.write(this.numCandidates);

		if (this.similarity != null) {
			generator.writeKey("similarity");
			generator.write(this.similarity);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder> implements ObjectBuilder<KnnRetriever> {
		private String field;

		@Nullable
		private List<Float> queryVector;

		@Nullable
		private QueryVectorBuilder queryVectorBuilder;

		private Integer k;

		private Integer numCandidates;

		@Nullable
		private Float similarity;

		/**
		 * Required - The name of the vector field to search against.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Query vector. Must have the same number of dimensions as the vector field you
		 * are searching against. You must provide a query_vector_builder or
		 * query_vector, but not both.
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
		 * Query vector. Must have the same number of dimensions as the vector field you
		 * are searching against. You must provide a query_vector_builder or
		 * query_vector, but not both.
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
		 * Defines a model to build a query vector.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(@Nullable QueryVectorBuilder value) {
			this.queryVectorBuilder = value;
			return this;
		}

		/**
		 * Defines a model to build a query vector.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(
				Function<QueryVectorBuilder.Builder, ObjectBuilder<QueryVectorBuilder>> fn) {
			return this.queryVectorBuilder(fn.apply(new QueryVectorBuilder.Builder()).build());
		}

		/**
		 * Required - Number of nearest neighbors to return as top hits.
		 * <p>
		 * API name: {@code k}
		 */
		public final Builder k(int value) {
			this.k = value;
			return this;
		}

		/**
		 * Required - Number of nearest neighbor candidates to consider per shard.
		 * <p>
		 * API name: {@code num_candidates}
		 */
		public final Builder numCandidates(int value) {
			this.numCandidates = value;
			return this;
		}

		/**
		 * The minimum similarity required for a document to be considered a match.
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
		 * Builds a {@link KnnRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnRetriever build() {
			_checkSingleUse();

			return new KnnRetriever(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnRetriever}
	 */
	public static final JsonpDeserializer<KnnRetriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnRetriever::setupKnnRetrieverDeserializer);

	protected static void setupKnnRetrieverDeserializer(ObjectDeserializer<KnnRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.floatDeserializer()),
				"query_vector");
		op.add(Builder::queryVectorBuilder, QueryVectorBuilder._DESERIALIZER, "query_vector_builder");
		op.add(Builder::k, JsonpDeserializer.integerDeserializer(), "k");
		op.add(Builder::numCandidates, JsonpDeserializer.integerDeserializer(), "num_candidates");
		op.add(Builder::similarity, JsonpDeserializer.floatDeserializer(), "similarity");

	}

}
