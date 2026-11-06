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

import co.elastic.clients.elasticsearch._types.QueryVectorBuilder;
import co.elastic.clients.elasticsearch._types.QueryVectorBuilderVariant;
import co.elastic.clients.elasticsearch._types.mapping.DenseVectorSimilarity;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Float;
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

// typedef: _types.query_dsl.DenseVectorQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DenseVectorQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final List<Float> queryVector;

	@Nullable
	private final QueryVectorBuilder queryVectorBuilder;

	@Nullable
	private final DenseVectorSimilarity similarityFunction;

	@Nullable
	private final Boolean quantized;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorQuery(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.queryVector = ApiTypeHelper.unmodifiable(builder.queryVector);
		this.queryVectorBuilder = builder.queryVectorBuilder;
		this.similarityFunction = builder.similarityFunction;
		this.quantized = builder.quantized;

	}

	public static DenseVectorQuery of(Function<Builder, ObjectBuilder<DenseVectorQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.DenseVector;
	}

	/**
	 * Required - The name of the <code>dense_vector</code> field to search against.
	 * The field can be indexed, or not indexed (<code>index: false</code>).
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The query vector. It must have the same number of dimensions as the field.
	 * You must provide either <code>query_vector</code> or
	 * <code>query_vector_builder</code>, but not both.
	 * <p>
	 * API name: {@code query_vector}
	 */
	public final List<Float> queryVector() {
		return this.queryVector;
	}

	/**
	 * The configuration to build the query vector, for example by running a text
	 * embedding model. You must provide either <code>query_vector</code> or
	 * <code>query_vector_builder</code>, but not both.
	 * <p>
	 * API name: {@code query_vector_builder}
	 */
	@Nullable
	public final QueryVectorBuilder queryVectorBuilder() {
		return this.queryVectorBuilder;
	}

	/**
	 * The similarity used for scoring, which overrides the similarity of the field
	 * for this query. It defaults to the similarity of the field, or to
	 * <code>cosine</code> for a field that is not indexed. For <code>bit</code>
	 * fields, only <code>l2_norm</code> is supported. It can't be combined with
	 * <code>quantized: true</code>.
	 * <p>
	 * API name: {@code similarity_function}
	 */
	@Nullable
	public final DenseVectorSimilarity similarityFunction() {
		return this.similarityFunction;
	}

	/**
	 * If <code>false</code>, the documents are scored with the full-precision
	 * vectors, regardless of the index options of the field. If <code>true</code>,
	 * the documents are scored with the quantized vectors of a quantized field,
	 * which is faster but less accurate. For a field that is not quantized,
	 * <code>true</code> has no effect.
	 * <p>
	 * API name: {@code quantized}
	 */
	@Nullable
	public final Boolean quantized() {
		return this.quantized;
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
		if (this.similarityFunction != null) {
			generator.writeKey("similarity_function");
			this.similarityFunction.serialize(generator, mapper);
		}
		if (this.quantized != null) {
			generator.writeKey("quantized");
			generator.write(this.quantized);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<DenseVectorQuery> {
		private String field;

		@Nullable
		private List<Float> queryVector;

		@Nullable
		private QueryVectorBuilder queryVectorBuilder;

		@Nullable
		private DenseVectorSimilarity similarityFunction;

		@Nullable
		private Boolean quantized;

		public Builder() {
		}
		private Builder(DenseVectorQuery instance) {
			super(instance);
			this.field = instance.field;
			this.queryVector = instance.queryVector;
			this.queryVectorBuilder = instance.queryVectorBuilder;
			this.similarityFunction = instance.similarityFunction;
			this.quantized = instance.quantized;

		}
		/**
		 * Required - The name of the <code>dense_vector</code> field to search against.
		 * The field can be indexed, or not indexed (<code>index: false</code>).
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The query vector. It must have the same number of dimensions as the field.
		 * You must provide either <code>query_vector</code> or
		 * <code>query_vector_builder</code>, but not both.
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
		 * The query vector. It must have the same number of dimensions as the field.
		 * You must provide either <code>query_vector</code> or
		 * <code>query_vector_builder</code>, but not both.
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
		 * The configuration to build the query vector, for example by running a text
		 * embedding model. You must provide either <code>query_vector</code> or
		 * <code>query_vector_builder</code>, but not both.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(@Nullable QueryVectorBuilder value) {
			this.queryVectorBuilder = value;
			return this;
		}

		/**
		 * The configuration to build the query vector, for example by running a text
		 * embedding model. You must provide either <code>query_vector</code> or
		 * <code>query_vector_builder</code>, but not both.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(
				Function<QueryVectorBuilder.Builder, ObjectBuilder<QueryVectorBuilder>> fn) {
			return this.queryVectorBuilder(fn.apply(new QueryVectorBuilder.Builder()).build());
		}

		/**
		 * The configuration to build the query vector, for example by running a text
		 * embedding model. You must provide either <code>query_vector</code> or
		 * <code>query_vector_builder</code>, but not both.
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(QueryVectorBuilderVariant value) {
			this.queryVectorBuilder = value._toQueryVectorBuilder();
			return this;
		}

		/**
		 * The similarity used for scoring, which overrides the similarity of the field
		 * for this query. It defaults to the similarity of the field, or to
		 * <code>cosine</code> for a field that is not indexed. For <code>bit</code>
		 * fields, only <code>l2_norm</code> is supported. It can't be combined with
		 * <code>quantized: true</code>.
		 * <p>
		 * API name: {@code similarity_function}
		 */
		public final Builder similarityFunction(@Nullable DenseVectorSimilarity value) {
			this.similarityFunction = value;
			return this;
		}

		/**
		 * If <code>false</code>, the documents are scored with the full-precision
		 * vectors, regardless of the index options of the field. If <code>true</code>,
		 * the documents are scored with the quantized vectors of a quantized field,
		 * which is faster but less accurate. For a field that is not quantized,
		 * <code>true</code> has no effect.
		 * <p>
		 * API name: {@code quantized}
		 */
		public final Builder quantized(@Nullable Boolean value) {
			this.quantized = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorQuery build() {
			_checkSingleUse();

			return new DenseVectorQuery(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorQuery}
	 */
	public static final JsonpDeserializer<DenseVectorQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DenseVectorQuery::setupDenseVectorQueryDeserializer);

	protected static void setupDenseVectorQueryDeserializer(ObjectDeserializer<DenseVectorQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.floatDeserializer()),
				"query_vector");
		op.add(Builder::queryVectorBuilder, QueryVectorBuilder._DESERIALIZER, "query_vector_builder");
		op.add(Builder::similarityFunction, DenseVectorSimilarity._DESERIALIZER, "similarity_function");
		op.add(Builder::quantized, JsonpDeserializer.booleanDeserializer(), "quantized");

	}

}
