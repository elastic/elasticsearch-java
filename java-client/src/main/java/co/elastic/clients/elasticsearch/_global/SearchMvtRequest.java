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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.search_mvt.Request
public final class SearchMvtRequest extends RequestBase implements ToJsonp {
	private final List<String> index;

	private final String field;

	private final Number zoom;

	private final Number x;

	private final Number y;

	@Nullable
	private final Map<String, AggregationContainer> aggs;

	@Nullable
	private final Boolean exactBounds;

	@Nullable
	private final Number extent;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Number gridPrecision;

	@Nullable
	private final JsonValue gridType;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Number size;

	@Nullable
	private final List<JsonValue> sort;

	// ---------------------------------------------------------------------------------------------

	protected SearchMvtRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.field = Objects.requireNonNull(builder.field, "field");
		this.zoom = Objects.requireNonNull(builder.zoom, "zoom");
		this.x = Objects.requireNonNull(builder.x, "x");
		this.y = Objects.requireNonNull(builder.y, "y");
		this.aggs = builder.aggs;
		this.exactBounds = builder.exactBounds;
		this.extent = builder.extent;
		this.fields = builder.fields;
		this.gridPrecision = builder.gridPrecision;
		this.gridType = builder.gridType;
		this.query = builder.query;
		this.runtimeMappings = builder.runtimeMappings;
		this.size = builder.size;
		this.sort = builder.sort;

	}

	/**
	 * Comma-separated list of data streams, indices, or aliases to search
	 * <p>
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * Field containing geospatial data to return
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Zoom level for the vector tile to search
	 * <p>
	 * API name: {@code zoom}
	 */
	public Number zoom() {
		return this.zoom;
	}

	/**
	 * X coordinate for the vector tile to search
	 * <p>
	 * API name: {@code x}
	 */
	public Number x() {
		return this.x;
	}

	/**
	 * Y coordinate for the vector tile to search
	 * <p>
	 * API name: {@code y}
	 */
	public Number y() {
		return this.y;
	}

	/**
	 * Sub-aggregations for the geotile_grid. Supports the following aggregation
	 * types: - avg - cardinality - max - min - sum
	 * <p>
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, AggregationContainer> aggs() {
		return this.aggs;
	}

	/**
	 * If false, the meta layer’s feature is the bounding box of the tile. If true,
	 * the meta layer’s feature is a bounding box resulting from a geo_bounds
	 * aggregation. The aggregation runs on <field> values that intersect the
	 * <zoom>/<x>/<y> tile with wrap_longitude set to false. The resulting bounding
	 * box may be larger than the vector tile.
	 * <p>
	 * API name: {@code exact_bounds}
	 */
	@Nullable
	public Boolean exactBounds() {
		return this.exactBounds;
	}

	/**
	 * Size, in pixels, of a side of the tile. Vector tiles are square with equal
	 * sides.
	 * <p>
	 * API name: {@code extent}
	 */
	@Nullable
	public Number extent() {
		return this.extent;
	}

	/**
	 * Fields to return in the <code>hits</code> layer. Supports wildcards
	 * (<code>*</code>). This parameter does not support fields with array values.
	 * Fields with array values may return inconsistent results.
	 * <p>
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * Additional zoom levels available through the aggs layer. For example, if
	 * <zoom> is 7 and grid_precision is 8, you can zoom in up to level 15. Accepts
	 * 0-8. If 0, results don’t include the aggs layer.
	 * <p>
	 * API name: {@code grid_precision}
	 */
	@Nullable
	public Number gridPrecision() {
		return this.gridPrecision;
	}

	/**
	 * Determines the geometry type for features in the aggs layer. In the aggs
	 * layer, each feature represents a geotile_grid cell. If 'grid' each feature is
	 * a Polygon of the cells bounding box. If 'point' each feature is a Point that
	 * is the centroid of the cell.
	 * <p>
	 * API name: {@code grid_type}
	 */
	@Nullable
	public JsonValue gridType() {
		return this.gridType;
	}

	/**
	 * Query DSL used to filter documents for the search.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	@Nullable
	public Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Maximum number of features to return in the hits layer. Accepts 0-10000. If
	 * 0, results don’t include the hits layer.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * Sorts features in the hits layer. By default, the API calculates a bounding
	 * box for each feature. It sorts features based on this box’s diagonal length,
	 * from longest to shortest.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue> sort() {
		return this.sort;
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

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, AggregationContainer> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.exactBounds != null) {

			generator.writeKey("exact_bounds");
			generator.write(this.exactBounds);

		}
		if (this.extent != null) {

			generator.writeKey("extent");
			generator.write(this.extent.doubleValue());

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.gridPrecision != null) {

			generator.writeKey("grid_precision");
			generator.write(this.gridPrecision.doubleValue());

		}
		if (this.gridType != null) {

			generator.writeKey("grid_type");
			generator.write(this.gridType);

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.runtimeMappings != null) {

			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchMvtRequest}.
	 */
	public static class Builder implements ObjectBuilder<SearchMvtRequest> {
		private List<String> index;

		private String field;

		private Number zoom;

		private Number x;

		private Number y;

		@Nullable
		private Map<String, AggregationContainer> aggs;

		@Nullable
		private Boolean exactBounds;

		@Nullable
		private Number extent;

		@Nullable
		private List<String> fields;

		@Nullable
		private Number gridPrecision;

		@Nullable
		private JsonValue gridType;

		@Nullable
		private QueryContainer query;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Number size;

		@Nullable
		private List<JsonValue> sort;

		/**
		 * Comma-separated list of data streams, indices, or aliases to search
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, or aliases to search
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Field containing geospatial data to return
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Zoom level for the vector tile to search
		 * <p>
		 * API name: {@code zoom}
		 */
		public Builder zoom(Number value) {
			this.zoom = value;
			return this;
		}

		/**
		 * X coordinate for the vector tile to search
		 * <p>
		 * API name: {@code x}
		 */
		public Builder x(Number value) {
			this.x = value;
			return this;
		}

		/**
		 * Y coordinate for the vector tile to search
		 * <p>
		 * API name: {@code y}
		 */
		public Builder y(Number value) {
			this.y = value;
			return this;
		}

		/**
		 * Sub-aggregations for the geotile_grid. Supports the following aggregation
		 * types: - avg - cardinality - max - min - sum
		 * <p>
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, AggregationContainer> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, AggregationContainer value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new AggregationContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.putAggs(key, fn.apply(new AggregationContainer.Builder()).build());
		}

		/**
		 * If false, the meta layer’s feature is the bounding box of the tile. If true,
		 * the meta layer’s feature is a bounding box resulting from a geo_bounds
		 * aggregation. The aggregation runs on <field> values that intersect the
		 * <zoom>/<x>/<y> tile with wrap_longitude set to false. The resulting bounding
		 * box may be larger than the vector tile.
		 * <p>
		 * API name: {@code exact_bounds}
		 */
		public Builder exactBounds(@Nullable Boolean value) {
			this.exactBounds = value;
			return this;
		}

		/**
		 * Size, in pixels, of a side of the tile. Vector tiles are square with equal
		 * sides.
		 * <p>
		 * API name: {@code extent}
		 */
		public Builder extent(@Nullable Number value) {
			this.extent = value;
			return this;
		}

		/**
		 * Fields to return in the <code>hits</code> layer. Supports wildcards
		 * (<code>*</code>). This parameter does not support fields with array values.
		 * Fields with array values may return inconsistent results.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Fields to return in the <code>hits</code> layer. Supports wildcards
		 * (<code>*</code>). This parameter does not support fields with array values.
		 * Fields with array values may return inconsistent results.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Additional zoom levels available through the aggs layer. For example, if
		 * <zoom> is 7 and grid_precision is 8, you can zoom in up to level 15. Accepts
		 * 0-8. If 0, results don’t include the aggs layer.
		 * <p>
		 * API name: {@code grid_precision}
		 */
		public Builder gridPrecision(@Nullable Number value) {
			this.gridPrecision = value;
			return this;
		}

		/**
		 * Determines the geometry type for features in the aggs layer. In the aggs
		 * layer, each feature represents a geotile_grid cell. If 'grid' each feature is
		 * a Polygon of the cells bounding box. If 'point' each feature is a Point that
		 * is the centroid of the cell.
		 * <p>
		 * API name: {@code grid_type}
		 */
		public Builder gridType(@Nullable JsonValue value) {
			this.gridType = value;
			return this;
		}

		/**
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 */
		public Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, RuntimeField value) {
			if (this.runtimeMappings == null) {
				this.runtimeMappings = new HashMap<>();
			}
			this.runtimeMappings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.putRuntimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Maximum number of features to return in the hits layer. Accepts 0-10000. If
		 * 0, results don’t include the hits layer.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Sorts features in the hits layer. By default, the API calculates a bounding
		 * box for each feature. It sorts features based on this box’s diagonal length,
		 * from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue> value) {
			this.sort = value;
			return this;
		}

		/**
		 * Sorts features in the hits layer. By default, the API calculates a bounding
		 * box for each feature. It sorts features based on this box’s diagonal length,
		 * from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * Builds a {@link SearchMvtRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchMvtRequest build() {

			return new SearchMvtRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SearchMvtRequest
	 */
	public static final JsonpDeserializer<SearchMvtRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SearchMvtRequest::setupSearchMvtRequestDeserializer);

	protected static void setupSearchMvtRequestDeserializer(DelegatingDeserializer<SearchMvtRequest.Builder> op) {

		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(AggregationContainer.DESERIALIZER), "aggs");
		op.add(Builder::exactBounds, JsonpDeserializer.booleanDeserializer(), "exact_bounds");
		op.add(Builder::extent, JsonpDeserializer.numberDeserializer(), "extent");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::gridPrecision, JsonpDeserializer.numberDeserializer(), "grid_precision");
		op.add(Builder::gridType, JsonpDeserializer.jsonValueDeserializer(), "grid_type");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField.DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_mvt}".
	 */
	public static final Endpoint<SearchMvtRequest, SearchMvtResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _field = 1 << 1;
				final int _zoom = 1 << 2;
				final int _x = 1 << 3;
				final int _y = 1 << 4;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;
				if (request.field() != null)
					propsSet |= _field;
				if (request.zoom() != null)
					propsSet |= _zoom;
				if (request.x() != null)
					propsSet |= _x;
				if (request.y() != null)
					propsSet |= _y;

				if (propsSet == (_index | _field | _zoom | _x | _y)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_mvt");
					buf.append("/");
					buf.append(request.field);
					buf.append("/");
					buf.append(request.zoom.toString());
					buf.append("/");
					buf.append(request.x.toString());
					buf.append("/");
					buf.append(request.y.toString());
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				return params;

			}, Endpoint.Simple.emptyMap(), true, SearchMvtResponse.DESERIALIZER);
}
