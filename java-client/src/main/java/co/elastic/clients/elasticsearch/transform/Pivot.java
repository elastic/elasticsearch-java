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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.Pivot
public final class Pivot implements ToJsonp {
	@Nullable
	private final Map<String, AggregationContainer> aggregations;

	private final Map<String, PivotGroupByContainer> groupBy;

	@Nullable
	private final Number maxPageSearchSize;

	// ---------------------------------------------------------------------------------------------

	protected Pivot(Builder builder) {

		this.aggregations = builder.aggregations;
		this.groupBy = Objects.requireNonNull(builder.groupBy, "group_by");
		this.maxPageSearchSize = builder.maxPageSearchSize;

	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, AggregationContainer> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code group_by}
	 */
	public Map<String, PivotGroupByContainer> groupBy() {
		return this.groupBy;
	}

	/**
	 * API name: {@code max_page_search_size}
	 */
	@Nullable
	public Number maxPageSearchSize() {
		return this.maxPageSearchSize;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, AggregationContainer> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("group_by");
		generator.writeStartObject();
		for (Map.Entry<String, PivotGroupByContainer> item0 : this.groupBy.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.maxPageSearchSize != null) {

			generator.writeKey("max_page_search_size");
			generator.write(this.maxPageSearchSize.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Pivot}.
	 */
	public static class Builder implements ObjectBuilder<Pivot> {
		@Nullable
		private Map<String, AggregationContainer> aggregations;

		private Map<String, PivotGroupByContainer> groupBy;

		@Nullable
		private Number maxPageSearchSize;

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(@Nullable Map<String, AggregationContainer> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, AggregationContainer value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this
					.aggregations(Collections.singletonMap(key, fn.apply(new AggregationContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.putAggregations(key, fn.apply(new AggregationContainer.Builder()).build());
		}

		/**
		 * API name: {@code group_by}
		 */
		public Builder groupBy(Map<String, PivotGroupByContainer> value) {
			this.groupBy = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #groupBy(Map)}, creating the map if needed.
		 */
		public Builder putGroupBy(String key, PivotGroupByContainer value) {
			if (this.groupBy == null) {
				this.groupBy = new HashMap<>();
			}
			this.groupBy.put(key, value);
			return this;
		}

		/**
		 * Set {@link #groupBy(Map)} to a singleton map.
		 */
		public Builder groupBy(String key,
				Function<PivotGroupByContainer.Builder, ObjectBuilder<PivotGroupByContainer>> fn) {
			return this.groupBy(Collections.singletonMap(key, fn.apply(new PivotGroupByContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #groupBy(Map)}, creating the map if needed.
		 */
		public Builder putGroupBy(String key,
				Function<PivotGroupByContainer.Builder, ObjectBuilder<PivotGroupByContainer>> fn) {
			return this.putGroupBy(key, fn.apply(new PivotGroupByContainer.Builder()).build());
		}

		/**
		 * API name: {@code max_page_search_size}
		 */
		public Builder maxPageSearchSize(@Nullable Number value) {
			this.maxPageSearchSize = value;
			return this;
		}

		/**
		 * Builds a {@link Pivot}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pivot build() {

			return new Pivot(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Pivot
	 */
	public static final JsonpDeserializer<Pivot> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Pivot::setupPivotDeserializer);

	protected static void setupPivotDeserializer(DelegatingDeserializer<Pivot.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(AggregationContainer.DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::groupBy, JsonpDeserializer.stringMapDeserializer(PivotGroupByContainer.DESERIALIZER),
				"group_by");
		op.add(Builder::maxPageSearchSize, JsonpDeserializer.numberDeserializer(), "max_page_search_size");

	}

}
