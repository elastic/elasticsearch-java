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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.Pivot
@JsonpDeserializable
public class Pivot implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	private final Map<String, PivotGroupBy> groupBy;

	@Nullable
	private final Integer maxPageSearchSize;

	// ---------------------------------------------------------------------------------------------

	private Pivot(Builder builder) {

		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.groupBy = ModelTypeHelper.unmodifiable(builder.groupBy);
		this.maxPageSearchSize = builder.maxPageSearchSize;

	}

	public static Pivot of(Function<Builder, ObjectBuilder<Pivot>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code group_by}
	 */
	public final Map<String, PivotGroupBy> groupBy() {
		return this.groupBy;
	}

	/**
	 * API name: {@code max_page_search_size}
	 */
	@Nullable
	public final Integer maxPageSearchSize() {
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

		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.groupBy)) {
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
			generator.write(this.maxPageSearchSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Pivot}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Pivot> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Map<String, PivotGroupBy> groupBy;

		@Nullable
		private Integer maxPageSearchSize;

		/**
		 * API name: {@code aggregations}
		 */
		public final Builder aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		public final Builder aggregations(
				Function<MapBuilder<String, Aggregation, Aggregation.Builder>, ObjectBuilder<Map<String, Aggregation>>> fn) {
			return aggregations(fn.apply(new MapBuilder<>(Aggregation.Builder::new)).build());
		}

		/**
		 * API name: {@code group_by}
		 */
		public final Builder groupBy(@Nullable Map<String, PivotGroupBy> value) {
			this.groupBy = value;
			return this;
		}

		/**
		 * Set {@link #groupBy(Map)} to a singleton map.
		 */
		public Builder groupBy(String key, Function<PivotGroupBy.Builder, ObjectBuilder<PivotGroupBy>> fn) {
			return this.groupBy(Collections.singletonMap(key, fn.apply(new PivotGroupBy.Builder()).build()));
		}

		public final Builder groupBy(
				Function<MapBuilder<String, PivotGroupBy, PivotGroupBy.Builder>, ObjectBuilder<Map<String, PivotGroupBy>>> fn) {
			return groupBy(fn.apply(new MapBuilder<>(PivotGroupBy.Builder::new)).build());
		}

		/**
		 * API name: {@code max_page_search_size}
		 */
		public final Builder maxPageSearchSize(@Nullable Integer value) {
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
			_checkSingleUse();

			return new Pivot(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Pivot}
	 */
	public static final JsonpDeserializer<Pivot> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Pivot::setupPivotDeserializer, Builder::build);

	protected static void setupPivotDeserializer(DelegatingDeserializer<Pivot.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::groupBy, JsonpDeserializer.stringMapDeserializer(PivotGroupBy._DESERIALIZER), "group_by");
		op.add(Builder::maxPageSearchSize, JsonpDeserializer.integerDeserializer(), "max_page_search_size");

	}

}
