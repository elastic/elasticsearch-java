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

// typedef: _types.DiversifyRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.DiversifyRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class DiversifyRetriever extends RetrieverBase implements RetrieverVariant {
	private final DiversifyRetrieverTypes type;

	private final String field;

	private final Retriever retriever;

	@Nullable
	private final Integer size;

	@Nullable
	private final Integer rankWindowSize;

	private final List<Float> queryVector;

	@Nullable
	private final QueryVectorBuilder queryVectorBuilder;

	@Nullable
	private final Float lambda;

	// ---------------------------------------------------------------------------------------------

	private DiversifyRetriever(Builder builder) {
		super(builder);

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.retriever = ApiTypeHelper.requireNonNull(builder.retriever, this, "retriever");
		this.size = builder.size;
		this.rankWindowSize = builder.rankWindowSize;
		this.queryVector = ApiTypeHelper.unmodifiable(builder.queryVector);
		this.queryVectorBuilder = builder.queryVectorBuilder;
		this.lambda = builder.lambda;

	}

	public static DiversifyRetriever of(Function<Builder, ObjectBuilder<DiversifyRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Diversify;
	}

	/**
	 * Required - The diversification strategy to apply.
	 * <p>
	 * API name: {@code type}
	 */
	public final DiversifyRetrieverTypes type() {
		return this.type;
	}

	/**
	 * Required - The document field on which to diversify results on.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - The nested retriever whose results will be diversified.
	 * <p>
	 * API name: {@code retriever}
	 */
	public final Retriever retriever() {
		return this.retriever;
	}

	/**
	 * The number of top documents to return after diversification.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * The number of top documents from the nested retriever to consider for
	 * diversification.
	 * <p>
	 * API name: {@code rank_window_size}
	 */
	@Nullable
	public final Integer rankWindowSize() {
		return this.rankWindowSize;
	}

	/**
	 * The query vector used for diversification.
	 * <p>
	 * API name: {@code query_vector}
	 */
	public final List<Float> queryVector() {
		return this.queryVector;
	}

	/**
	 * a dense vector query vector builder to use instead of a static query_vector
	 * <p>
	 * API name: {@code query_vector_builder}
	 */
	@Nullable
	public final QueryVectorBuilder queryVectorBuilder() {
		return this.queryVectorBuilder;
	}

	/**
	 * Controls the trade-off between relevance and diversity for MMR. A value of
	 * 0.0 focuses solely on diversity, while a value of 1.0 focuses solely on
	 * relevance. Required for MMR
	 * <p>
	 * API name: {@code lambda}
	 */
	@Nullable
	public final Float lambda() {
		return this.lambda;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("retriever");
		this.retriever.serialize(generator, mapper);

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.rankWindowSize != null) {
			generator.writeKey("rank_window_size");
			generator.write(this.rankWindowSize);

		}
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
		if (this.lambda != null) {
			generator.writeKey("lambda");
			generator.write(this.lambda);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DiversifyRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DiversifyRetriever> {
		private DiversifyRetrieverTypes type;

		private String field;

		private Retriever retriever;

		@Nullable
		private Integer size;

		@Nullable
		private Integer rankWindowSize;

		@Nullable
		private List<Float> queryVector;

		@Nullable
		private QueryVectorBuilder queryVectorBuilder;

		@Nullable
		private Float lambda;

		public Builder() {
		}
		private Builder(DiversifyRetriever instance) {
			this.type = instance.type;
			this.field = instance.field;
			this.retriever = instance.retriever;
			this.size = instance.size;
			this.rankWindowSize = instance.rankWindowSize;
			this.queryVector = instance.queryVector;
			this.queryVectorBuilder = instance.queryVectorBuilder;
			this.lambda = instance.lambda;

		}
		/**
		 * Required - The diversification strategy to apply.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(DiversifyRetrieverTypes value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - The document field on which to diversify results on.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - The nested retriever whose results will be diversified.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Retriever value) {
			this.retriever = value;
			return this;
		}

		/**
		 * Required - The nested retriever whose results will be diversified.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * Required - The nested retriever whose results will be diversified.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(RetrieverVariant value) {
			this.retriever = value._toRetriever();
			return this;
		}

		/**
		 * The number of top documents to return after diversification.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * The number of top documents from the nested retriever to consider for
		 * diversification.
		 * <p>
		 * API name: {@code rank_window_size}
		 */
		public final Builder rankWindowSize(@Nullable Integer value) {
			this.rankWindowSize = value;
			return this;
		}

		/**
		 * The query vector used for diversification.
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
		 * The query vector used for diversification.
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
		 * a dense vector query vector builder to use instead of a static query_vector
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(@Nullable QueryVectorBuilder value) {
			this.queryVectorBuilder = value;
			return this;
		}

		/**
		 * a dense vector query vector builder to use instead of a static query_vector
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(
				Function<QueryVectorBuilder.Builder, ObjectBuilder<QueryVectorBuilder>> fn) {
			return this.queryVectorBuilder(fn.apply(new QueryVectorBuilder.Builder()).build());
		}

		/**
		 * a dense vector query vector builder to use instead of a static query_vector
		 * <p>
		 * API name: {@code query_vector_builder}
		 */
		public final Builder queryVectorBuilder(QueryVectorBuilderVariant value) {
			this.queryVectorBuilder = value._toQueryVectorBuilder();
			return this;
		}

		/**
		 * Controls the trade-off between relevance and diversity for MMR. A value of
		 * 0.0 focuses solely on diversity, while a value of 1.0 focuses solely on
		 * relevance. Required for MMR
		 * <p>
		 * API name: {@code lambda}
		 */
		public final Builder lambda(@Nullable Float value) {
			this.lambda = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DiversifyRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DiversifyRetriever build() {
			_checkSingleUse();

			return new DiversifyRetriever(this);
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
	 * Json deserializer for {@link DiversifyRetriever}
	 */
	public static final JsonpDeserializer<DiversifyRetriever> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DiversifyRetriever::setupDiversifyRetrieverDeserializer);

	protected static void setupDiversifyRetrieverDeserializer(ObjectDeserializer<DiversifyRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::type, DiversifyRetrieverTypes._DESERIALIZER, "type");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::rankWindowSize, JsonpDeserializer.integerDeserializer(), "rank_window_size");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.floatDeserializer()),
				"query_vector");
		op.add(Builder::queryVectorBuilder, QueryVectorBuilder._DESERIALIZER, "query_vector_builder");
		op.add(Builder::lambda, JsonpDeserializer.floatDeserializer(), "lambda");

	}

}
