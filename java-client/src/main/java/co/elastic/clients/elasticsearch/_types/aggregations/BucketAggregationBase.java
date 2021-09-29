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

// typedef: _types.aggregations.BucketAggregationBase

public abstract class BucketAggregationBase extends AggregationBase {
	@Nullable
	private final Map<String, Aggregation> aggregations;

	// ---------------------------------------------------------------------------------------------

	public BucketAggregationBase(AbstractBuilder<?> builder) {
		super(builder);

		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);

	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		/**
		 * API name: {@code aggregations}
		 */
		public BuilderT aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public BuilderT putAggregations(String key, Aggregation value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return self();
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public BuilderT aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public BuilderT putAggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBucketAggregationBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);
		op.add(AbstractBuilder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations");

	}

}
