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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.KnnQuery

/**
 * A k-nearest neighbor (kNN) search finds the k nearest vectors to a query
 * vector, as measured by a similarity metric.
 * 
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.KnnQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final int numCandidates;

	private final List<Double> queryVector;

	// ---------------------------------------------------------------------------------------------

	private KnnQuery(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.numCandidates = ApiTypeHelper.requireNonNull(builder.numCandidates, this, "numCandidates");
		this.queryVector = ApiTypeHelper.unmodifiableRequired(builder.queryVector, this, "queryVector");

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
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code num_candidates}
	 */
	public final int numCandidates() {
		return this.numCandidates;
	}

	/**
	 * Required - API name: {@code query_vector}
	 */
	public final List<Double> queryVector() {
		return this.queryVector;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("num_candidates");
		generator.write(this.numCandidates);

		if (ApiTypeHelper.isDefined(this.queryVector)) {
			generator.writeKey("query_vector");
			generator.writeStartArray();
			for (Double item0 : this.queryVector) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<KnnQuery> {
		private String field;

		private Integer numCandidates;

		private List<Double> queryVector;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_candidates}
		 */
		public final Builder numCandidates(int value) {
			this.numCandidates = value;
			return this;
		}

		/**
		 * Required - API name: {@code query_vector}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>queryVector</code>.
		 */
		public final Builder queryVector(List<Double> list) {
			this.queryVector = _listAddAll(this.queryVector, list);
			return this;
		}

		/**
		 * Required - API name: {@code query_vector}
		 * <p>
		 * Adds one or more values to <code>queryVector</code>.
		 */
		public final Builder queryVector(Double value, Double... values) {
			this.queryVector = _listAdd(this.queryVector, value, values);
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
		op.add(Builder::numCandidates, JsonpDeserializer.integerDeserializer(), "num_candidates");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"query_vector");

	}

}
