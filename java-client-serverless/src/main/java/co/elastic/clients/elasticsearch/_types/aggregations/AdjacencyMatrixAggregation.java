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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AdjacencyMatrixAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.AdjacencyMatrixAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class AdjacencyMatrixAggregation extends BucketAggregationBase implements AggregationVariant {
	private final Map<String, Query> filters;

	// ---------------------------------------------------------------------------------------------

	private AdjacencyMatrixAggregation(Builder builder) {
		super(builder);

		this.filters = ApiTypeHelper.unmodifiable(builder.filters);

	}

	public static AdjacencyMatrixAggregation of(Function<Builder, ObjectBuilder<AdjacencyMatrixAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.AdjacencyMatrix;
	}

	/**
	 * Filters used to create buckets. At least one filter is required.
	 * <p>
	 * API name: {@code filters}
	 */
	public final Map<String, Query> filters() {
		return this.filters;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.filters)) {
			generator.writeKey("filters");
			generator.writeStartObject();
			for (Map.Entry<String, Query> item0 : this.filters.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AdjacencyMatrixAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AdjacencyMatrixAggregation> {
		@Nullable
		private Map<String, Query> filters;

		/**
		 * Filters used to create buckets. At least one filter is required.
		 * <p>
		 * API name: {@code filters}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>filters</code>.
		 */
		public final Builder filters(Map<String, Query> map) {
			this.filters = _mapPutAll(this.filters, map);
			return this;
		}

		/**
		 * Filters used to create buckets. At least one filter is required.
		 * <p>
		 * API name: {@code filters}
		 * <p>
		 * Adds an entry to <code>filters</code>.
		 */
		public final Builder filters(String key, Query value) {
			this.filters = _mapPut(this.filters, key, value);
			return this;
		}

		/**
		 * Filters used to create buckets. At least one filter is required.
		 * <p>
		 * API name: {@code filters}
		 * <p>
		 * Adds an entry to <code>filters</code> using a builder lambda.
		 */
		public final Builder filters(String key, Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return filters(key, fn.apply(new Query.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AdjacencyMatrixAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AdjacencyMatrixAggregation build() {
			_checkSingleUse();

			return new AdjacencyMatrixAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AdjacencyMatrixAggregation}
	 */
	public static final JsonpDeserializer<AdjacencyMatrixAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AdjacencyMatrixAggregation::setupAdjacencyMatrixAggregationDeserializer);

	protected static void setupAdjacencyMatrixAggregationDeserializer(
			ObjectDeserializer<AdjacencyMatrixAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::filters, JsonpDeserializer.stringMapDeserializer(Query._DESERIALIZER), "filters");

	}

}
