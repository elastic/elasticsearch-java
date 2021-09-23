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

import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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
public final class Pivot implements JsonpSerializable {
	@Nullable
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final Map<String, PivotGroupBy> groupBy;

	@Nullable
	private final Number maxPageSearchSize;

	// ---------------------------------------------------------------------------------------------

	public Pivot(Builder builder) {

		this.aggregations = builder.aggregations;
		this.groupBy = builder.groupBy;
		this.maxPageSearchSize = builder.maxPageSearchSize;

	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code group_by}
	 */
	@Nullable
	public Map<String, PivotGroupBy> groupBy() {
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
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.groupBy != null) {

			generator.writeKey("group_by");
			generator.writeStartObject();
			for (Map.Entry<String, PivotGroupBy> item0 : this.groupBy.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
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
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Map<String, PivotGroupBy> groupBy;

		@Nullable
		private Number maxPageSearchSize;

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Aggregation value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code group_by}
		 */
		public Builder groupBy(@Nullable Map<String, PivotGroupBy> value) {
			this.groupBy = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #groupBy(Map)}, creating the map if needed.
		 */
		public Builder putGroupBy(String key, PivotGroupBy value) {
			if (this.groupBy == null) {
				this.groupBy = new HashMap<>();
			}
			this.groupBy.put(key, value);
			return this;
		}

		/**
		 * Set {@link #groupBy(Map)} to a singleton map.
		 */
		public Builder groupBy(String key, Function<PivotGroupBy.Builder, ObjectBuilder<PivotGroupBy>> fn) {
			return this.groupBy(Collections.singletonMap(key, fn.apply(new PivotGroupBy.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #groupBy(Map)}, creating the map if needed.
		 */
		public Builder putGroupBy(String key, Function<PivotGroupBy.Builder, ObjectBuilder<PivotGroupBy>> fn) {
			return this.putGroupBy(key, fn.apply(new PivotGroupBy.Builder()).build());
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
	 * Json deserializer for {@link Pivot}
	 */
	public static final JsonpDeserializer<Pivot> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Pivot::setupPivotDeserializer);

	protected static void setupPivotDeserializer(DelegatingDeserializer<Pivot.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation.DESERIALIZER), "aggregations",
				"aggs");
		op.add(Builder::groupBy, JsonpDeserializer.stringMapDeserializer(PivotGroupBy.DESERIALIZER), "group_by");
		op.add(Builder::maxPageSearchSize, JsonpDeserializer.numberDeserializer(), "max_page_search_size");

	}

}
