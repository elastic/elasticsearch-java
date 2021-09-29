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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AdjacencyMatrixAggregation
@JsonpDeserializable
public final class AdjacencyMatrixAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final Map<String, Query> filters;

	// ---------------------------------------------------------------------------------------------

	public AdjacencyMatrixAggregation(Builder builder) {
		super(builder);

		this.filters = ModelTypeHelper.unmodifiable(builder.filters);

	}

	public AdjacencyMatrixAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "adjacency_matrix";
	}

	/**
	 * API name: {@code filters}
	 */
	@Nullable
	public Map<String, Query> filters() {
		return this.filters;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.filters != null) {

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
		 * API name: {@code filters}
		 */
		public Builder filters(@Nullable Map<String, Query> value) {
			this.filters = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #filters(Map)}, creating the map if needed.
		 */
		public Builder putFilters(String key, Query value) {
			if (this.filters == null) {
				this.filters = new HashMap<>();
			}
			this.filters.put(key, value);
			return this;
		}

		/**
		 * Set {@link #filters(Map)} to a singleton map.
		 */
		public Builder filters(String key, Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filters(Collections.singletonMap(key, fn.apply(new Query.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #filters(Map)}, creating the map if needed.
		 */
		public Builder putFilters(String key, Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.putFilters(key, fn.apply(new Query.Builder()).build());
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

			return new AdjacencyMatrixAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AdjacencyMatrixAggregation}
	 */
	public static final JsonpDeserializer<AdjacencyMatrixAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, AdjacencyMatrixAggregation::setupAdjacencyMatrixAggregationDeserializer, Builder::build);

	protected static void setupAdjacencyMatrixAggregationDeserializer(
			DelegatingDeserializer<AdjacencyMatrixAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::filters, JsonpDeserializer.stringMapDeserializer(Query._DESERIALIZER), "filters");

	}

}
