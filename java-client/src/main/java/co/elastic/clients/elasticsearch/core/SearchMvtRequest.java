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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search_mvt.GridType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
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
@JsonpDeserializable
public final class SearchMvtRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Map<String, Aggregation> aggs;

	@Nullable
	private final Boolean exactBounds;

	@Nullable
	private final Integer extent;

	private final String field;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Integer gridPrecision;

	@Nullable
	private final GridType gridType;

	private final List<String> index;

	@Nullable
	private final Query query;

	@Nullable
	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Integer size;

	@Nullable
	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	private final int x;

	private final int y;

	private final int zoom;

	// ---------------------------------------------------------------------------------------------

	public SearchMvtRequest(Builder builder) {

		this.aggs = ModelTypeHelper.unmodifiable(builder.aggs);
		this.exactBounds = builder.exactBounds;
		this.extent = builder.extent;
		this.field = Objects.requireNonNull(builder.field, "field");
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.gridPrecision = builder.gridPrecision;
		this.gridType = builder.gridType;
		this.index = ModelTypeHelper.unmodifiableNonNull(builder.index, "index");
		this.query = builder.query;
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);
		this.size = builder.size;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.x = Objects.requireNonNull(builder.x, "x");
		this.y = Objects.requireNonNull(builder.y, "y");
		this.zoom = Objects.requireNonNull(builder.zoom, "zoom");

	}

	public SearchMvtRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Sub-aggregations for the geotile_grid.
	 * <p>
	 * Supports the following aggregation types:
	 * <ul>
	 * <li>avg</li>
	 * <li>cardinality</li>
	 * <li>max</li>
	 * <li>min</li>
	 * <li>sum</li>
	 * </ul>
	 * <p>
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * If false, the meta layer’s feature is the bounding box of the tile. If true,
	 * the meta layer’s feature is a bounding box resulting from a geo_bounds
	 * aggregation. The aggregation runs on &lt;field&gt; values that intersect the
	 * &lt;zoom&gt;/&lt;x&gt;/&lt;y&gt; tile with wrap_longitude set to false. The
	 * resulting bounding box may be larger than the vector tile.
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
	public Integer extent() {
		return this.extent;
	}

	/**
	 * Required - Field containing geospatial data to return
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
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
	 * &lt;zoom&gt; is 7 and grid_precision is 8, you can zoom in up to level 15.
	 * Accepts 0-8. If 0, results don’t include the aggs layer.
	 * <p>
	 * API name: {@code grid_precision}
	 */
	@Nullable
	public Integer gridPrecision() {
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
	public GridType gridType() {
		return this.gridType;
	}

	/**
	 * Required - Comma-separated list of data streams, indices, or aliases to
	 * search
	 * <p>
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * Query DSL used to filter documents for the search.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public Query query() {
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
	public Integer size() {
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
	public List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	/**
	 * Required - X coordinate for the vector tile to search
	 * <p>
	 * API name: {@code x}
	 */
	public int x() {
		return this.x;
	}

	/**
	 * Required - Y coordinate for the vector tile to search
	 * <p>
	 * API name: {@code y}
	 */
	public int y() {
		return this.y;
	}

	/**
	 * Required - Zoom level for the vector tile to search
	 * <p>
	 * API name: {@code zoom}
	 */
	public int zoom() {
		return this.zoom;
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

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.exactBounds != null) {

			generator.writeKey("exact_bounds");
			generator.write(this.exactBounds);

		}
		if (this.extent != null) {

			generator.writeKey("extent");
			generator.write(this.extent);

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
			generator.write(this.gridPrecision);

		}
		if (this.gridType != null) {

			generator.writeKey("grid_type");
			this.gridType.serialize(generator, mapper);
		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.runtimeMappings != null) {

			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
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
		@Nullable
		private Map<String, Aggregation> aggs;

		@Nullable
		private Boolean exactBounds;

		@Nullable
		private Integer extent;

		private String field;

		@Nullable
		private List<String> fields;

		@Nullable
		private Integer gridPrecision;

		@Nullable
		private GridType gridType;

		private List<String> index;

		@Nullable
		private Query query;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Integer size;

		@Nullable
		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		private Integer x;

		private Integer y;

		private Integer zoom;

		/**
		 * Sub-aggregations for the geotile_grid.
		 * <p>
		 * Supports the following aggregation types:
		 * <ul>
		 * <li>avg</li>
		 * <li>cardinality</li>
		 * <li>max</li>
		 * <li>min</li>
		 * <li>sum</li>
		 * </ul>
		 * <p>
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, Aggregation> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Aggregation value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggs(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * If false, the meta layer’s feature is the bounding box of the tile. If true,
		 * the meta layer’s feature is a bounding box resulting from a geo_bounds
		 * aggregation. The aggregation runs on &lt;field&gt; values that intersect the
		 * &lt;zoom&gt;/&lt;x&gt;/&lt;y&gt; tile with wrap_longitude set to false. The
		 * resulting bounding box may be larger than the vector tile.
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
		public Builder extent(@Nullable Integer value) {
			this.extent = value;
			return this;
		}

		/**
		 * Required - Field containing geospatial data to return
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
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
		 * &lt;zoom&gt; is 7 and grid_precision is 8, you can zoom in up to level 15.
		 * Accepts 0-8. If 0, results don’t include the aggs layer.
		 * <p>
		 * API name: {@code grid_precision}
		 */
		public Builder gridPrecision(@Nullable Integer value) {
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
		public Builder gridType(@Nullable GridType value) {
			this.gridType = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, or aliases to
		 * search
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, or aliases to
		 * search
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
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
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
		public Builder size(@Nullable Integer value) {
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
		public Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
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
		public Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue /* _global.search._types.SortCombinations */ value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * Required - X coordinate for the vector tile to search
		 * <p>
		 * API name: {@code x}
		 */
		public Builder x(int value) {
			this.x = value;
			return this;
		}

		/**
		 * Required - Y coordinate for the vector tile to search
		 * <p>
		 * API name: {@code y}
		 */
		public Builder y(int value) {
			this.y = value;
			return this;
		}

		/**
		 * Required - Zoom level for the vector tile to search
		 * <p>
		 * API name: {@code zoom}
		 */
		public Builder zoom(int value) {
			this.zoom = value;
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
	 * Json deserializer for {@link SearchMvtRequest}
	 */
	public static final JsonpDeserializer<SearchMvtRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchMvtRequest::setupSearchMvtRequestDeserializer, Builder::build);

	protected static void setupSearchMvtRequestDeserializer(DelegatingDeserializer<SearchMvtRequest.Builder> op) {

		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER), "aggs");
		op.add(Builder::exactBounds, JsonpDeserializer.booleanDeserializer(), "exact_bounds");
		op.add(Builder::extent, JsonpDeserializer.integerDeserializer(), "extent");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::gridPrecision, JsonpDeserializer.integerDeserializer(), "grid_precision");
		op.add(Builder::gridType, GridType._DESERIALIZER, "grid_type");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_mvt}".
	 */
	public static final Endpoint<SearchMvtRequest, SearchMvtResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _field = 1 << 0;
				final int _x = 1 << 1;
				final int _index = 1 << 2;
				final int _y = 1 << 3;
				final int _zoom = 1 << 4;

				int propsSet = 0;

				propsSet |= _field;
				propsSet |= _x;
				propsSet |= _index;
				propsSet |= _y;
				propsSet |= _zoom;

				if (propsSet == (_index | _field | _zoom | _x | _y)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_mvt");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.field, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.zoom), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.x), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.y), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SearchMvtResponse._DESERIALIZER);
}
