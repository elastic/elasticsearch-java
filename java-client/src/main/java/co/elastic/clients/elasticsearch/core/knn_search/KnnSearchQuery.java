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

package co.elastic.clients.elasticsearch.core.knn_search;

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
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.knn_search._types.Query

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_search._types.Query">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnSearchQuery implements JsonpSerializable {
	private final String field;

	private final List<Double> queryVector;

	private final long k;

	private final long numCandidates;

	// ---------------------------------------------------------------------------------------------

	private KnnSearchQuery(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.queryVector = ApiTypeHelper.unmodifiableRequired(builder.queryVector, this, "queryVector");
		this.k = ApiTypeHelper.requireNonNull(builder.k, this, "k");
		this.numCandidates = ApiTypeHelper.requireNonNull(builder.numCandidates, this, "numCandidates");

	}

	public static KnnSearchQuery of(Function<Builder, ObjectBuilder<KnnSearchQuery>> fn) {
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
	 * Required - The query vector
	 * <p>
	 * API name: {@code query_vector}
	 */
	public final List<Double> queryVector() {
		return this.queryVector;
	}

	/**
	 * Required - The final number of nearest neighbors to return as top hits
	 * <p>
	 * API name: {@code k}
	 */
	public final long k() {
		return this.k;
	}

	/**
	 * Required - The number of nearest neighbor candidates to consider per shard
	 * <p>
	 * API name: {@code num_candidates}
	 */
	public final long numCandidates() {
		return this.numCandidates;
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
			for (Double item0 : this.queryVector) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("k");
		generator.write(this.k);

		generator.writeKey("num_candidates");
		generator.write(this.numCandidates);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnSearchQuery}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<KnnSearchQuery> {
		private String field;

		private List<Double> queryVector;

		private Long k;

		private Long numCandidates;

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
		 * Required - The query vector
		 * <p>
		 * API name: {@code query_vector}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>queryVector</code>.
		 */
		public final Builder queryVector(List<Double> list) {
			this.queryVector = _listAddAll(this.queryVector, list);
			return this;
		}

		/**
		 * Required - The query vector
		 * <p>
		 * API name: {@code query_vector}
		 * <p>
		 * Adds one or more values to <code>queryVector</code>.
		 */
		public final Builder queryVector(Double value, Double... values) {
			this.queryVector = _listAdd(this.queryVector, value, values);
			return this;
		}

		/**
		 * Required - The final number of nearest neighbors to return as top hits
		 * <p>
		 * API name: {@code k}
		 */
		public final Builder k(long value) {
			this.k = value;
			return this;
		}

		/**
		 * Required - The number of nearest neighbor candidates to consider per shard
		 * <p>
		 * API name: {@code num_candidates}
		 */
		public final Builder numCandidates(long value) {
			this.numCandidates = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnSearchQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnSearchQuery build() {
			_checkSingleUse();

			return new KnnSearchQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnSearchQuery}
	 */
	public static final JsonpDeserializer<KnnSearchQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnSearchQuery::setupKnnSearchQueryDeserializer);

	protected static void setupKnnSearchQueryDeserializer(ObjectDeserializer<KnnSearchQuery.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"query_vector");
		op.add(Builder::k, JsonpDeserializer.longDeserializer(), "k");
		op.add(Builder::numCandidates, JsonpDeserializer.longDeserializer(), "num_candidates");

	}

}
