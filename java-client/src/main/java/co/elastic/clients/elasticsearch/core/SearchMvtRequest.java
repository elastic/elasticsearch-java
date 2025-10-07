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
import co.elastic.clients.elasticsearch._types.aggregations.AggregationVariant;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
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
 * Search a vector tile.
 * <p>
 * Search a vector tile for geospatial values. Before using this API, you should
 * be familiar with the Mapbox vector tile specification. The API returns
 * results as a binary mapbox vector tile.
 * <p>
 * Internally, Elasticsearch translates a vector tile search API request into a
 * search containing:
 * <ul>
 * <li>A <code>geo_bounding_box</code> query on the <code>&lt;field&gt;</code>.
 * The query uses the <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile as a
 * bounding box.</li>
 * <li>A <code>geotile_grid</code> or <code>geohex_grid</code> aggregation on
 * the <code>&lt;field&gt;</code>. The <code>grid_agg</code> parameter
 * determines the aggregation type. The aggregation uses the
 * <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile as a bounding box.</li>
 * <li>Optionally, a <code>geo_bounds</code> aggregation on the
 * <code>&lt;field&gt;</code>. The search only includes this aggregation if the
 * <code>exact_bounds</code> parameter is <code>true</code>.</li>
 * <li>If the optional parameter <code>with_labels</code> is <code>true</code>,
 * the internal search will include a dynamic runtime field that calls the
 * <code>getLabelPosition</code> function of the geometry doc value. This
 * enables the generation of new point features containing suggested geometry
 * labels, so that, for example, multi-polygons will have only one label.</li>
 * </ul>
 * <p>
 * The API returns results as a binary Mapbox vector tile. Mapbox vector tiles
 * are encoded as Google Protobufs (PBF). By default, the tile contains three
 * layers:
 * <ul>
 * <li>A <code>hits</code> layer containing a feature for each
 * <code>&lt;field&gt;</code> value matching the <code>geo_bounding_box</code>
 * query.</li>
 * <li>An <code>aggs</code> layer containing a feature for each cell of the
 * <code>geotile_grid</code> or <code>geohex_grid</code>. The layer only
 * contains features for cells with matching data.</li>
 * <li>A meta layer containing:
 * <ul>
 * <li>A feature containing a bounding box. By default, this is the bounding box
 * of the tile.</li>
 * <li>Value ranges for any sub-aggregations on the <code>geotile_grid</code> or
 * <code>geohex_grid</code>.</li>
 * <li>Metadata for the search.</li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * The API only returns features that can display at its zoom level. For
 * example, if a polygon feature has no area at its zoom level, the API omits
 * it. The API returns errors as UTF-8 encoded JSON.
 * <p>
 * IMPORTANT: You can specify several options for this API as either a query
 * parameter or request body parameter. If you specify both parameters, the
 * query parameter takes precedence.
 * <p>
 * <strong>Grid precision for geotile</strong>
 * <p>
 * For a <code>grid_agg</code> of <code>geotile</code>, you can use cells in the
 * <code>aggs</code> layer as tiles for lower zoom levels.
 * <code>grid_precision</code> represents the additional zoom levels available
 * through these cells. The final precision is computed by as follows:
 * <code>&lt;zoom&gt; + grid_precision</code>. For example, if
 * <code>&lt;zoom&gt;</code> is 7 and <code>grid_precision</code> is 8, then the
 * <code>geotile_grid</code> aggregation will use a precision of 15. The maximum
 * final precision is 29. The <code>grid_precision</code> also determines the
 * number of cells for the grid as follows:
 * <code>(2^grid_precision) x (2^grid_precision)</code>. For example, a value of
 * 8 divides the tile into a grid of 256 x 256 cells. The <code>aggs</code>
 * layer only contains features for cells with matching data.
 * <p>
 * <strong>Grid precision for geohex</strong>
 * <p>
 * For a <code>grid_agg</code> of <code>geohex</code>, Elasticsearch uses
 * <code>&lt;zoom&gt;</code> and <code>grid_precision</code> to calculate a
 * final precision as follows: <code>&lt;zoom&gt; + grid_precision</code>.
 * <p>
 * This precision determines the H3 resolution of the hexagonal cells produced
 * by the <code>geohex</code> aggregation. The following table maps the H3
 * resolution for each precision. For example, if <code>&lt;zoom&gt;</code> is 3
 * and <code>grid_precision</code> is 3, the precision is 6. At a precision of
 * 6, hexagonal cells have an H3 resolution of 2. If <code>&lt;zoom&gt;</code>
 * is 3 and <code>grid_precision</code> is 4, the precision is 7. At a precision
 * of 7, hexagonal cells have an H3 resolution of 3.
 * <table>
 * <thead>
 * <tr>
 * <th>Precision</th>
 * <th>Unique tile bins</th>
 * <th>H3 resolution</th>
 * <th>Unique hex bins</th>
 * <th>Ratio</th>
 * </tr>
 * </thead> <tbody>
 * <tr>
 * <td>1</td>
 * <td>4</td>
 * <td>0</td>
 * <td>122</td>
 * <td>30.5</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td>16</td>
 * <td>0</td>
 * <td>122</td>
 * <td>7.625</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td>64</td>
 * <td>1</td>
 * <td>842</td>
 * <td>13.15625</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td>256</td>
 * <td>1</td>
 * <td>842</td>
 * <td>3.2890625</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td>1024</td>
 * <td>2</td>
 * <td>5882</td>
 * <td>5.744140625</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td>4096</td>
 * <td>2</td>
 * <td>5882</td>
 * <td>1.436035156</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td>16384</td>
 * <td>3</td>
 * <td>41162</td>
 * <td>2.512329102</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td>65536</td>
 * <td>3</td>
 * <td>41162</td>
 * <td>0.6280822754</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td>262144</td>
 * <td>4</td>
 * <td>288122</td>
 * <td>1.099098206</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td>1048576</td>
 * <td>4</td>
 * <td>288122</td>
 * <td>0.2747745514</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td>4194304</td>
 * <td>5</td>
 * <td>2016842</td>
 * <td>0.4808526039</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td>16777216</td>
 * <td>6</td>
 * <td>14117882</td>
 * <td>0.8414913416</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td>67108864</td>
 * <td>6</td>
 * <td>14117882</td>
 * <td>0.2103728354</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td>268435456</td>
 * <td>7</td>
 * <td>98825162</td>
 * <td>0.3681524172</td>
 * </tr>
 * <tr>
 * <td>15</td>
 * <td>1073741824</td>
 * <td>8</td>
 * <td>691776122</td>
 * <td>0.644266719</td>
 * </tr>
 * <tr>
 * <td>16</td>
 * <td>4294967296</td>
 * <td>8</td>
 * <td>691776122</td>
 * <td>0.1610666797</td>
 * </tr>
 * <tr>
 * <td>17</td>
 * <td>17179869184</td>
 * <td>9</td>
 * <td>4842432842</td>
 * <td>0.2818666889</td>
 * </tr>
 * <tr>
 * <td>18</td>
 * <td>68719476736</td>
 * <td>10</td>
 * <td>33897029882</td>
 * <td>0.4932667053</td>
 * </tr>
 * <tr>
 * <td>19</td>
 * <td>274877906944</td>
 * <td>11</td>
 * <td>237279209162</td>
 * <td>0.8632167343</td>
 * </tr>
 * <tr>
 * <td>20</td>
 * <td>1099511627776</td>
 * <td>11</td>
 * <td>237279209162</td>
 * <td>0.2158041836</td>
 * </tr>
 * <tr>
 * <td>21</td>
 * <td>4398046511104</td>
 * <td>12</td>
 * <td>1660954464122</td>
 * <td>0.3776573213</td>
 * </tr>
 * <tr>
 * <td>22</td>
 * <td>17592186044416</td>
 * <td>13</td>
 * <td>11626681248842</td>
 * <td>0.6609003122</td>
 * </tr>
 * <tr>
 * <td>23</td>
 * <td>70368744177664</td>
 * <td>13</td>
 * <td>11626681248842</td>
 * <td>0.165225078</td>
 * </tr>
 * <tr>
 * <td>24</td>
 * <td>281474976710656</td>
 * <td>14</td>
 * <td>81386768741882</td>
 * <td>0.2891438866</td>
 * </tr>
 * <tr>
 * <td>25</td>
 * <td>1125899906842620</td>
 * <td>15</td>
 * <td>569707381193162</td>
 * <td>0.5060018015</td>
 * </tr>
 * <tr>
 * <td>26</td>
 * <td>4503599627370500</td>
 * <td>15</td>
 * <td>569707381193162</td>
 * <td>0.1265004504</td>
 * </tr>
 * <tr>
 * <td>27</td>
 * <td>18014398509482000</td>
 * <td>15</td>
 * <td>569707381193162</td>
 * <td>0.03162511259</td>
 * </tr>
 * <tr>
 * <td>28</td>
 * <td>72057594037927900</td>
 * <td>15</td>
 * <td>569707381193162</td>
 * <td>0.007906278149</td>
 * </tr>
 * <tr>
 * <td>29</td>
 * <td>288230376151712000</td>
 * <td>15</td>
 * <td>569707381193162</td>
 * <td>0.001976569537</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * Hexagonal cells don't align perfectly on a vector tile. Some cells may
 * intersect more than one vector tile. To compute the H3 resolution for each
 * precision, Elasticsearch compares the average density of hexagonal bins at
 * each resolution with the average density of tile bins at each zoom level.
 * Elasticsearch uses the H3 resolution that is closest to the corresponding
 * geotile density.
 * <p>
 * Learn how to use the vector tile search API with practical examples in the
 * <a href=
 * "https://www.elastic.co/docs/reference/elasticsearch/rest-apis/vector-tile-search">Vector
 * tile search examples</a> guide.
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
	private final String projectRouting;

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
		this.projectRouting = builder.projectRouting;
		this.query = builder.query;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.trackTotalHits = builder.trackTotalHits;
		this.withLabels = builder.withLabels;
		this.x = ApiTypeHelper.requireNonNull(builder.x, this, "x", 0);
		this.y = ApiTypeHelper.requireNonNull(builder.y, this, "y", 0);
		this.zoom = ApiTypeHelper.requireNonNull(builder.zoom, this, "zoom", 0);

	}

	public static SearchMvtRequest of(Function<Builder, ObjectBuilder<SearchMvtRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Sub-aggregations for the geotile_grid.
	 * <p>
	 * It supports the following aggregation types:
	 * <ul>
	 * <li><code>avg</code></li>
	 * <li><code>boxplot</code></li>
	 * <li><code>cardinality</code></li>
	 * <li><code>extended stats</code></li>
	 * <li><code>max</code></li>
	 * <li><code>median absolute deviation</code></li>
	 * <li><code>min</code></li>
	 * <li><code>percentile</code></li>
	 * <li><code>percentile-rank</code></li>
	 * <li><code>stats</code></li>
	 * <li><code>sum</code></li>
	 * <li><code>value count</code></li>
	 * </ul>
	 * <p>
	 * The aggregation names can't start with <code>_mvt_</code>. The
	 * <code>_mvt_</code> prefix is reserved for internal aggregations.
	 * <p>
	 * API name: {@code aggs}
	 */
	public final Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * The size, in pixels, of a clipping buffer outside the tile. This allows
	 * renderers to avoid outline artifacts from geometries that extend past the
	 * extent of the tile.
	 * <p>
	 * API name: {@code buffer}
	 */
	@Nullable
	public final Integer buffer() {
		return this.buffer;
	}

	/**
	 * If <code>false</code>, the meta layer's feature is the bounding box of the
	 * tile. If <code>true</code>, the meta layer's feature is a bounding box
	 * resulting from a <code>geo_bounds</code> aggregation. The aggregation runs on
	 * &lt;field&gt; values that intersect the
	 * <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile with
	 * <code>wrap_longitude</code> set to <code>false</code>. The resulting bounding
	 * box may be larger than the vector tile.
	 * <p>
	 * API name: {@code exact_bounds}
	 */
	@Nullable
	public final Boolean exactBounds() {
		return this.exactBounds;
	}

	/**
	 * The size, in pixels, of a side of the tile. Vector tiles are square with
	 * equal sides.
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
	 * The fields to return in the <code>hits</code> layer. It supports wildcards
	 * (<code>*</code>). This parameter does not support fields with array values.
	 * Fields with array values may return inconsistent results.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * The aggregation used to create a grid for the <code>field</code>.
	 * <p>
	 * API name: {@code grid_agg}
	 */
	@Nullable
	public final GridAggregationType gridAgg() {
		return this.gridAgg;
	}

	/**
	 * Additional zoom levels available through the aggs layer. For example, if
	 * <code>&lt;zoom&gt;</code> is <code>7</code> and <code>grid_precision</code>
	 * is <code>8</code>, you can zoom in up to level 15. Accepts 0-8. If 0, results
	 * don't include the aggs layer.
	 * <p>
	 * API name: {@code grid_precision}
	 */
	@Nullable
	public final Integer gridPrecision() {
		return this.gridPrecision;
	}

	/**
	 * Determines the geometry type for features in the aggs layer. In the aggs
	 * layer, each feature represents a <code>geotile_grid</code> cell. If
	 * <code>grid, each feature is a polygon of the cells bounding box. If </code>point`,
	 * each feature is a Point that is the centroid of the cell.
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
	 * Specifies a subset of projects to target for the search using project
	 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
	 * _alias tag and a single value (possibly wildcarded). Examples:
	 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
	 * only.
	 * <p>
	 * API name: {@code project_routing}
	 */
	@Nullable
	public final String projectRouting() {
		return this.projectRouting;
	}

	/**
	 * The query DSL used to filter documents for the search.
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
	 * The maximum number of features to return in the hits layer. Accepts 0-10000.
	 * If 0, results don't include the hits layer.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Sort the features in the hits layer. By default, the API calculates a
	 * bounding box for each feature. It sorts features based on this box's diagonal
	 * length, from longest to shortest.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * The number of hits matching the query to count accurately. If
	 * <code>true</code>, the exact number of hits is returned at the cost of some
	 * performance. If <code>false</code>, the response does not include the total
	 * number of hits matching the query.
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
	 * <ul>
	 * <li><code>Point</code> and <code>MultiPoint</code> features will have one of
	 * the points selected.</li>
	 * <li><code>Polygon</code> and <code>MultiPolygon</code> features will have a
	 * single point generated, either the centroid, if it is within the polygon, or
	 * another point within the polygon selected from the sorted triangle-tree.</li>
	 * <li><code>LineString</code> features will likewise provide a roughly central
	 * point selected from the triangle-tree.</li>
	 * <li>The aggregation results will provide one central point for each
	 * aggregation bucket.</li>
	 * </ul>
	 * <p>
	 * All attributes from the original features will also be copied to the new
	 * label features. In addition, the new features will be distinguishable using
	 * the tag <code>_mvt_label_position</code>.
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
		private String projectRouting;

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
		 * It supports the following aggregation types:
		 * <ul>
		 * <li><code>avg</code></li>
		 * <li><code>boxplot</code></li>
		 * <li><code>cardinality</code></li>
		 * <li><code>extended stats</code></li>
		 * <li><code>max</code></li>
		 * <li><code>median absolute deviation</code></li>
		 * <li><code>min</code></li>
		 * <li><code>percentile</code></li>
		 * <li><code>percentile-rank</code></li>
		 * <li><code>stats</code></li>
		 * <li><code>sum</code></li>
		 * <li><code>value count</code></li>
		 * </ul>
		 * <p>
		 * The aggregation names can't start with <code>_mvt_</code>. The
		 * <code>_mvt_</code> prefix is reserved for internal aggregations.
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
		 * It supports the following aggregation types:
		 * <ul>
		 * <li><code>avg</code></li>
		 * <li><code>boxplot</code></li>
		 * <li><code>cardinality</code></li>
		 * <li><code>extended stats</code></li>
		 * <li><code>max</code></li>
		 * <li><code>median absolute deviation</code></li>
		 * <li><code>min</code></li>
		 * <li><code>percentile</code></li>
		 * <li><code>percentile-rank</code></li>
		 * <li><code>stats</code></li>
		 * <li><code>sum</code></li>
		 * <li><code>value count</code></li>
		 * </ul>
		 * <p>
		 * The aggregation names can't start with <code>_mvt_</code>. The
		 * <code>_mvt_</code> prefix is reserved for internal aggregations.
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
		 * It supports the following aggregation types:
		 * <ul>
		 * <li><code>avg</code></li>
		 * <li><code>boxplot</code></li>
		 * <li><code>cardinality</code></li>
		 * <li><code>extended stats</code></li>
		 * <li><code>max</code></li>
		 * <li><code>median absolute deviation</code></li>
		 * <li><code>min</code></li>
		 * <li><code>percentile</code></li>
		 * <li><code>percentile-rank</code></li>
		 * <li><code>stats</code></li>
		 * <li><code>sum</code></li>
		 * <li><code>value count</code></li>
		 * </ul>
		 * <p>
		 * The aggregation names can't start with <code>_mvt_</code>. The
		 * <code>_mvt_</code> prefix is reserved for internal aggregations.
		 * <p>
		 * API name: {@code aggs}
		 * <p>
		 * Adds an entry to <code>aggs</code>.
		 */
		public final Builder aggs(String key, AggregationVariant value) {
			this.aggs = _mapPut(this.aggs, key, value._toAggregation());
			return this;
		}

		/**
		 * Sub-aggregations for the geotile_grid.
		 * <p>
		 * It supports the following aggregation types:
		 * <ul>
		 * <li><code>avg</code></li>
		 * <li><code>boxplot</code></li>
		 * <li><code>cardinality</code></li>
		 * <li><code>extended stats</code></li>
		 * <li><code>max</code></li>
		 * <li><code>median absolute deviation</code></li>
		 * <li><code>min</code></li>
		 * <li><code>percentile</code></li>
		 * <li><code>percentile-rank</code></li>
		 * <li><code>stats</code></li>
		 * <li><code>sum</code></li>
		 * <li><code>value count</code></li>
		 * </ul>
		 * <p>
		 * The aggregation names can't start with <code>_mvt_</code>. The
		 * <code>_mvt_</code> prefix is reserved for internal aggregations.
		 * <p>
		 * API name: {@code aggs}
		 * <p>
		 * Adds an entry to <code>aggs</code> using a builder lambda.
		 */
		public final Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggs(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * The size, in pixels, of a clipping buffer outside the tile. This allows
		 * renderers to avoid outline artifacts from geometries that extend past the
		 * extent of the tile.
		 * <p>
		 * API name: {@code buffer}
		 */
		public final Builder buffer(@Nullable Integer value) {
			this.buffer = value;
			return this;
		}

		/**
		 * If <code>false</code>, the meta layer's feature is the bounding box of the
		 * tile. If <code>true</code>, the meta layer's feature is a bounding box
		 * resulting from a <code>geo_bounds</code> aggregation. The aggregation runs on
		 * &lt;field&gt; values that intersect the
		 * <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile with
		 * <code>wrap_longitude</code> set to <code>false</code>. The resulting bounding
		 * box may be larger than the vector tile.
		 * <p>
		 * API name: {@code exact_bounds}
		 */
		public final Builder exactBounds(@Nullable Boolean value) {
			this.exactBounds = value;
			return this;
		}

		/**
		 * The size, in pixels, of a side of the tile. Vector tiles are square with
		 * equal sides.
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
		 * The fields to return in the <code>hits</code> layer. It supports wildcards
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
		 * The fields to return in the <code>hits</code> layer. It supports wildcards
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
		 * The aggregation used to create a grid for the <code>field</code>.
		 * <p>
		 * API name: {@code grid_agg}
		 */
		public final Builder gridAgg(@Nullable GridAggregationType value) {
			this.gridAgg = value;
			return this;
		}

		/**
		 * Additional zoom levels available through the aggs layer. For example, if
		 * <code>&lt;zoom&gt;</code> is <code>7</code> and <code>grid_precision</code>
		 * is <code>8</code>, you can zoom in up to level 15. Accepts 0-8. If 0, results
		 * don't include the aggs layer.
		 * <p>
		 * API name: {@code grid_precision}
		 */
		public final Builder gridPrecision(@Nullable Integer value) {
			this.gridPrecision = value;
			return this;
		}

		/**
		 * Determines the geometry type for features in the aggs layer. In the aggs
		 * layer, each feature represents a <code>geotile_grid</code> cell. If
		 * <code>grid, each feature is a polygon of the cells bounding box. If </code>point`,
		 * each feature is a Point that is the centroid of the cell.
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
		 * Specifies a subset of projects to target for the search using project
		 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
		 * _alias tag and a single value (possibly wildcarded). Examples:
		 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
		 * only.
		 * <p>
		 * API name: {@code project_routing}
		 */
		public final Builder projectRouting(@Nullable String value) {
			this.projectRouting = value;
			return this;
		}

		/**
		 * The query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * The query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * The query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(QueryVariant value) {
			this.query = value._toQuery();
			return this;
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
		 * The maximum number of features to return in the hits layer. Accepts 0-10000.
		 * If 0, results don't include the hits layer.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Sort the features in the hits layer. By default, the API calculates a
		 * bounding box for each feature. It sorts features based on this box's diagonal
		 * length, from longest to shortest.
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
		 * Sort the features in the hits layer. By default, the API calculates a
		 * bounding box for each feature. It sorts features based on this box's diagonal
		 * length, from longest to shortest.
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
		 * Sort the features in the hits layer. By default, the API calculates a
		 * bounding box for each feature. It sorts features based on this box's diagonal
		 * length, from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * The number of hits matching the query to count accurately. If
		 * <code>true</code>, the exact number of hits is returned at the cost of some
		 * performance. If <code>false</code>, the response does not include the total
		 * number of hits matching the query.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(@Nullable TrackHits value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * The number of hits matching the query to count accurately. If
		 * <code>true</code>, the exact number of hits is returned at the cost of some
		 * performance. If <code>false</code>, the response does not include the total
		 * number of hits matching the query.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(Function<TrackHits.Builder, ObjectBuilder<TrackHits>> fn) {
			return this.trackTotalHits(fn.apply(new TrackHits.Builder()).build());
		}

		/**
		 * If <code>true</code>, the hits and aggs layers will contain additional point
		 * features representing suggested label positions for the original features.
		 * <ul>
		 * <li><code>Point</code> and <code>MultiPoint</code> features will have one of
		 * the points selected.</li>
		 * <li><code>Polygon</code> and <code>MultiPolygon</code> features will have a
		 * single point generated, either the centroid, if it is within the polygon, or
		 * another point within the polygon selected from the sorted triangle-tree.</li>
		 * <li><code>LineString</code> features will likewise provide a roughly central
		 * point selected from the triangle-tree.</li>
		 * <li>The aggregation results will provide one central point for each
		 * aggregation bucket.</li>
		 * </ul>
		 * <p>
		 * All attributes from the original features will also be copied to the new
		 * label features. In addition, the new features will be distinguishable using
		 * the tag <code>_mvt_label_position</code>.
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
				Map<String, String> params = new HashMap<>();
				if (request.projectRouting != null) {
					params.put("project_routing", request.projectRouting);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);
}
