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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search.TrackHits;
import co.elastic.clients.elasticsearch.core.search_mvt.GridAggregationType;
import co.elastic.clients.elasticsearch.core.search_mvt.GridType;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _global.search_mvt.Request

/**
 * Search a vector tile. Searches a vector tile for geospatial values.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.search_mvt.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchMvtRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Aggregation> aggs;

	@Nullable
	private final Integer buffer;

	@Nullable
	private final Boolean exactBounds;

	@Nullable
	private final Integer extent;

	private final String field;

	private final List<String> fields;

	@Nullable
	private final GridAggregationType gridAgg;

	@Nullable
	private final Integer gridPrecision;

	@Nullable
	private final GridType gridType;

	private final List<String> index;

	@Nullable
	private final Query query;

	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	@Nullable
	private final TrackHits trackTotalHits;

	@Nullable
	private final Boolean withLabels;

	private final int x;

	private final int y;

	private final int zoom;

	// ---------------------------------------------------------------------------------------------

	private SearchMvtRequest(Builder builder) {

		this.aggs = ApiTypeHelper.unmodifiable(builder.aggs);
		this.buffer = builder.buffer;
		this.exactBounds = builder.exactBounds;
		this.extent = builder.extent;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.gridAgg = builder.gridAgg;
		this.gridPrecision = builder.gridPrecision;
		this.gridType = builder.gridType;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.trackTotalHits = builder.trackTotalHits;
		this.withLabels = builder.withLabels;
		this.x = ApiTypeHelper.requireNonNull(builder.x, this, "x");
		this.y = ApiTypeHelper.requireNonNull(builder.y, this, "y");
		this.zoom = ApiTypeHelper.requireNonNull(builder.zoom, this, "zoom");

	}

	public static SearchMvtRequest of(Function<Builder, ObjectBuilder<SearchMvtRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	public final Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * Size, in pixels, of a clipping buffer outside the tile. This allows renderers
	 * to avoid outline artifacts from geometries that extend past the extent of the
	 * tile.
	 * <p>
	 * API name: {@code buffer}
	 */
	@Nullable
	public final Integer buffer() {
		return this.buffer;
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
	public final Boolean exactBounds() {
		return this.exactBounds;
	}

	/**
	 * Size, in pixels, of a side of the tile. Vector tiles are square with equal
	 * sides.
	 * <p>
	 * API name: {@code extent}
	 */
	@Nullable
	public final Integer extent() {
		return this.extent;
	}

	/**
	 * Required - Field containing geospatial data to return
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Fields to return in the <code>hits</code> layer. Supports wildcards
	 * (<code>*</code>). This parameter does not support fields with array values.
	 * Fields with array values may return inconsistent results.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Aggregation used to create a grid for the <code>field</code>.
	 * <p>
	 * API name: {@code grid_agg}
	 */
	@Nullable
	public final GridAggregationType gridAgg() {
		return this.gridAgg;
	}

	/**
	 * Additional zoom levels available through the aggs layer. For example, if
	 * &lt;zoom&gt; is 7 and grid_precision is 8, you can zoom in up to level 15.
	 * Accepts 0-8. If 0, results don’t include the aggs layer.
	 * <p>
	 * API name: {@code grid_precision}
	 */
	@Nullable
	public final Integer gridPrecision() {
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
	public final GridType gridType() {
		return this.gridType;
	}

	/**
	 * Required - Comma-separated list of data streams, indices, or aliases to
	 * search
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Query DSL used to filter documents for the search.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Maximum number of features to return in the hits layer. Accepts 0-10000. If
	 * 0, results don’t include the hits layer.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Sorts features in the hits layer. By default, the API calculates a bounding
	 * box for each feature. It sorts features based on this box’s diagonal length,
	 * from longest to shortest.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * Number of hits matching the query to count accurately. If <code>true</code>,
	 * the exact number of hits is returned at the cost of some performance. If
	 * <code>false</code>, the response does not include the total number of hits
	 * matching the query.
	 * <p>
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public final TrackHits trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * If <code>true</code>, the hits and aggs layers will contain additional point
	 * features representing suggested label positions for the original features.
	 * <p>
	 * API name: {@code with_labels}
	 */
	@Nullable
	public final Boolean withLabels() {
		return this.withLabels;
	}

	/**
	 * Required - X coordinate for the vector tile to search
	 * <p>
	 * API name: {@code x}
	 */
	public final int x() {
		return this.x;
	}

	/**
	 * Required - Y coordinate for the vector tile to search
	 * <p>
	 * API name: {@code y}
	 */
	public final int y() {
		return this.y;
	}

	/**
	 * Required - Zoom level for the vector tile to search
	 * <p>
	 * API name: {@code zoom}
	 */
	public final int zoom() {
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

		if (ApiTypeHelper.isDefined(this.aggs)) {
			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.buffer != null) {
			generator.writeKey("buffer");
			generator.write(this.buffer);

		}
		if (this.exactBounds != null) {
			generator.writeKey("exact_bounds");
			generator.write(this.exactBounds);

		}
		if (this.extent != null) {
			generator.writeKey("extent");
			generator.write(this.extent);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.gridAgg != null) {
			generator.writeKey("grid_agg");
			this.gridAgg.serialize(generator, mapper);
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
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
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
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.trackTotalHits != null) {
			generator.writeKey("track_total_hits");
			this.trackTotalHits.serialize(generator, mapper);

		}
		if (this.withLabels != null) {
			generator.writeKey("with_labels");
			generator.write(this.withLabels);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchMvtRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SearchMvtRequest> {
		@Nullable
		private Map<String, Aggregation> aggs;

		@Nullable
		private Integer buffer;

		@Nullable
		private Boolean exactBounds;

		@Nullable
		private Integer extent;

		private String field;

		@Nullable
		private List<String> fields;

		@Nullable
		private GridAggregationType gridAgg;

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
		private List<SortOptions> sort;

		@Nullable
		private TrackHits trackTotalHits;

		@Nullable
		private Boolean withLabels;

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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggs</code>.
		 */
		public final Builder aggs(Map<String, Aggregation> map) {
			this.aggs = _mapPutAll(this.aggs, map);
			return this;
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
		 * <p>
		 * Adds an entry to <code>aggs</code>.
		 */
		public final Builder aggs(String key, Aggregation value) {
			this.aggs = _mapPut(this.aggs, key, value);
			return this;
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
		 * <p>
		 * Adds an entry to <code>aggs</code> using a builder lambda.
		 */
		public final Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggs(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * Size, in pixels, of a clipping buffer outside the tile. This allows renderers
		 * to avoid outline artifacts from geometries that extend past the extent of the
		 * tile.
		 * <p>
		 * API name: {@code buffer}
		 */
		public final Builder buffer(@Nullable Integer value) {
			this.buffer = value;
			return this;
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
		public final Builder exactBounds(@Nullable Boolean value) {
			this.exactBounds = value;
			return this;
		}

		/**
		 * Size, in pixels, of a side of the tile. Vector tiles are square with equal
		 * sides.
		 * <p>
		 * API name: {@code extent}
		 */
		public final Builder extent(@Nullable Integer value) {
			this.extent = value;
			return this;
		}

		/**
		 * Required - Field containing geospatial data to return
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Fields to return in the <code>hits</code> layer. Supports wildcards
		 * (<code>*</code>). This parameter does not support fields with array values.
		 * Fields with array values may return inconsistent results.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Fields to return in the <code>hits</code> layer. Supports wildcards
		 * (<code>*</code>). This parameter does not support fields with array values.
		 * Fields with array values may return inconsistent results.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Aggregation used to create a grid for the <code>field</code>.
		 * <p>
		 * API name: {@code grid_agg}
		 */
		public final Builder gridAgg(@Nullable GridAggregationType value) {
			this.gridAgg = value;
			return this;
		}

		/**
		 * Additional zoom levels available through the aggs layer. For example, if
		 * &lt;zoom&gt; is 7 and grid_precision is 8, you can zoom in up to level 15.
		 * Accepts 0-8. If 0, results don’t include the aggs layer.
		 * <p>
		 * API name: {@code grid_precision}
		 */
		public final Builder gridPrecision(@Nullable Integer value) {
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
		public final Builder gridType(@Nullable GridType value) {
			this.gridType = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, or aliases to
		 * search
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, or aliases to
		 * search
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Maximum number of features to return in the hits layer. Accepts 0-10000. If
		 * 0, results don’t include the hits layer.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Sorts features in the hits layer. By default, the API calculates a bounding
		 * box for each feature. It sorts features based on this box’s diagonal length,
		 * from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * Sorts features in the hits layer. By default, the API calculates a bounding
		 * box for each feature. It sorts features based on this box’s diagonal length,
		 * from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * Sorts features in the hits layer. By default, the API calculates a bounding
		 * box for each feature. It sorts features based on this box’s diagonal length,
		 * from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * Number of hits matching the query to count accurately. If <code>true</code>,
		 * the exact number of hits is returned at the cost of some performance. If
		 * <code>false</code>, the response does not include the total number of hits
		 * matching the query.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(@Nullable TrackHits value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * Number of hits matching the query to count accurately. If <code>true</code>,
		 * the exact number of hits is returned at the cost of some performance. If
		 * <code>false</code>, the response does not include the total number of hits
		 * matching the query.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(Function<TrackHits.Builder, ObjectBuilder<TrackHits>> fn) {
			return this.trackTotalHits(fn.apply(new TrackHits.Builder()).build());
		}

		/**
		 * If <code>true</code>, the hits and aggs layers will contain additional point
		 * features representing suggested label positions for the original features.
		 * <p>
		 * API name: {@code with_labels}
		 */
		public final Builder withLabels(@Nullable Boolean value) {
			this.withLabels = value;
			return this;
		}

		/**
		 * Required - X coordinate for the vector tile to search
		 * <p>
		 * API name: {@code x}
		 */
		public final Builder x(int value) {
			this.x = value;
			return this;
		}

		/**
		 * Required - Y coordinate for the vector tile to search
		 * <p>
		 * API name: {@code y}
		 */
		public final Builder y(int value) {
			this.y = value;
			return this;
		}

		/**
		 * Required - Zoom level for the vector tile to search
		 * <p>
		 * API name: {@code zoom}
		 */
		public final Builder zoom(int value) {
			this.zoom = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchMvtRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchMvtRequest build() {
			_checkSingleUse();

			return new SearchMvtRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchMvtRequest}
	 */
	public static final JsonpDeserializer<SearchMvtRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchMvtRequest::setupSearchMvtRequestDeserializer);

	protected static void setupSearchMvtRequestDeserializer(ObjectDeserializer<SearchMvtRequest.Builder> op) {

		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER), "aggs");
		op.add(Builder::buffer, JsonpDeserializer.integerDeserializer(), "buffer");
		op.add(Builder::exactBounds, JsonpDeserializer.booleanDeserializer(), "exact_bounds");
		op.add(Builder::extent, JsonpDeserializer.integerDeserializer(), "extent");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::gridAgg, GridAggregationType._DESERIALIZER, "grid_agg");
		op.add(Builder::gridPrecision, JsonpDeserializer.integerDeserializer(), "grid_precision");
		op.add(Builder::gridType, GridType._DESERIALIZER, "grid_type");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::trackTotalHits, TrackHits._DESERIALIZER, "track_total_hits");
		op.add(Builder::withLabels, JsonpDeserializer.booleanDeserializer(), "with_labels");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_mvt}".
	 */
	public static final Endpoint<SearchMvtRequest, BinaryResponse, ErrorResponse> _ENDPOINT = new BinaryEndpoint<>(
			"es/search_mvt",

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
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
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					params.put("field", request.field);
					params.put("zoom", String.valueOf(request.zoom));
					params.put("x", String.valueOf(request.x));
					params.put("y", String.valueOf(request.y));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, null);
}
