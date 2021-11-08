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
import co.elastic.clients.json.JsonData;
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
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AggregationContainer
@JsonpDeserializable
public class Aggregation implements TaggedUnion<Object>, JsonpSerializable {

	public static final String ADJACENCY_MATRIX = "adjacency_matrix";
	public static final String AUTO_DATE_HISTOGRAM = "auto_date_histogram";
	public static final String AVG = "avg";
	public static final String AVG_BUCKET = "avg_bucket";
	public static final String BOXPLOT = "boxplot";
	public static final String BUCKET_SCRIPT = "bucket_script";
	public static final String BUCKET_SELECTOR = "bucket_selector";
	public static final String BUCKET_SORT = "bucket_sort";
	public static final String CARDINALITY = "cardinality";
	public static final String CHILDREN = "children";
	public static final String COMPOSITE = "composite";
	public static final String CUMULATIVE_CARDINALITY = "cumulative_cardinality";
	public static final String CUMULATIVE_SUM = "cumulative_sum";
	public static final String DATE_HISTOGRAM = "date_histogram";
	public static final String DATE_RANGE = "date_range";
	public static final String DERIVATIVE = "derivative";
	public static final String DIVERSIFIED_SAMPLER = "diversified_sampler";
	public static final String EXTENDED_STATS = "extended_stats";
	public static final String EXTENDED_STATS_BUCKET = "extended_stats_bucket";
	public static final String FILTER = "filter";
	public static final String FILTERS = "filters";
	public static final String GEO_BOUNDS = "geo_bounds";
	public static final String GEO_CENTROID = "geo_centroid";
	public static final String GEO_DISTANCE = "geo_distance";
	public static final String GEOHASH_GRID = "geohash_grid";
	public static final String GEO_LINE = "geo_line";
	public static final String GEOTILE_GRID = "geotile_grid";
	public static final String GLOBAL = "global";
	public static final String HISTOGRAM = "histogram";
	public static final String IP_RANGE = "ip_range";
	public static final String INFERENCE = "inference";
	public static final String MATRIX_STATS = "matrix_stats";
	public static final String MAX = "max";
	public static final String MAX_BUCKET = "max_bucket";
	public static final String MEDIAN_ABSOLUTE_DEVIATION = "median_absolute_deviation";
	public static final String MIN = "min";
	public static final String MIN_BUCKET = "min_bucket";
	public static final String MISSING = "missing";
	public static final String MOVING_AVG = "moving_avg";
	public static final String MOVING_PERCENTILES = "moving_percentiles";
	public static final String MOVING_FN = "moving_fn";
	public static final String MULTI_TERMS = "multi_terms";
	public static final String NESTED = "nested";
	public static final String NORMALIZE = "normalize";
	public static final String PARENT = "parent";
	public static final String PERCENTILE_RANKS = "percentile_ranks";
	public static final String PERCENTILES = "percentiles";
	public static final String PERCENTILES_BUCKET = "percentiles_bucket";
	public static final String RANGE = "range";
	public static final String RARE_TERMS = "rare_terms";
	public static final String RATE = "rate";
	public static final String REVERSE_NESTED = "reverse_nested";
	public static final String SAMPLER = "sampler";
	public static final String SCRIPTED_METRIC = "scripted_metric";
	public static final String SERIAL_DIFF = "serial_diff";
	public static final String SIGNIFICANT_TERMS = "significant_terms";
	public static final String SIGNIFICANT_TEXT = "significant_text";
	public static final String STATS = "stats";
	public static final String STATS_BUCKET = "stats_bucket";
	public static final String STRING_STATS = "string_stats";
	public static final String SUM = "sum";
	public static final String SUM_BUCKET = "sum_bucket";
	public static final String TERMS = "terms";
	public static final String TOP_HITS = "top_hits";
	public static final String T_TEST = "t_test";
	public static final String TOP_METRICS = "top_metrics";
	public static final String VALUE_COUNT = "value_count";
	public static final String WEIGHTED_AVG = "weighted_avg";
	public static final String VARIABLE_WIDTH_HISTOGRAM = "variable_width_histogram";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private final Map<String, Aggregation> aggregations;

	private final Map<String, JsonData> meta;

	public Aggregation(AggregationVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

		this.aggregations = null;
		this.meta = null;

	}

	private Aggregation(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);

	}

	public static Aggregation of(Function<Builder, ObjectBuilder<Aggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
	 * <p>
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Get the {@code adjacency_matrix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code adjacency_matrix}
	 *             kind.
	 */
	public AdjacencyMatrixAggregation adjacencyMatrix() {
		return TaggedUnionUtils.get(this, ADJACENCY_MATRIX);
	}

	/**
	 * Get the {@code auto_date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code auto_date_histogram}
	 *             kind.
	 */
	public AutoDateHistogramAggregation autoDateHistogram() {
		return TaggedUnionUtils.get(this, AUTO_DATE_HISTOGRAM);
	}

	/**
	 * Get the {@code avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg} kind.
	 */
	public AverageAggregation avg() {
		return TaggedUnionUtils.get(this, AVG);
	}

	/**
	 * Get the {@code avg_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg_bucket} kind.
	 */
	public AverageBucketAggregation avgBucket() {
		return TaggedUnionUtils.get(this, AVG_BUCKET);
	}

	/**
	 * Get the {@code boxplot} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boxplot} kind.
	 */
	public BoxplotAggregation boxplot() {
		return TaggedUnionUtils.get(this, BOXPLOT);
	}

	/**
	 * Get the {@code bucket_script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_script} kind.
	 */
	public BucketScriptAggregation bucketScript() {
		return TaggedUnionUtils.get(this, BUCKET_SCRIPT);
	}

	/**
	 * Get the {@code bucket_selector} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_selector}
	 *             kind.
	 */
	public BucketSelectorAggregation bucketSelector() {
		return TaggedUnionUtils.get(this, BUCKET_SELECTOR);
	}

	/**
	 * Get the {@code bucket_sort} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_sort} kind.
	 */
	public BucketSortAggregation bucketSort() {
		return TaggedUnionUtils.get(this, BUCKET_SORT);
	}

	/**
	 * Get the {@code cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cardinality} kind.
	 */
	public CardinalityAggregation cardinality() {
		return TaggedUnionUtils.get(this, CARDINALITY);
	}

	/**
	 * Get the {@code children} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code children} kind.
	 */
	public ChildrenAggregation children() {
		return TaggedUnionUtils.get(this, CHILDREN);
	}

	/**
	 * Get the {@code composite} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code composite} kind.
	 */
	public CompositeAggregation composite() {
		return TaggedUnionUtils.get(this, COMPOSITE);
	}

	/**
	 * Get the {@code cumulative_cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code cumulative_cardinality} kind.
	 */
	public CumulativeCardinalityAggregation cumulativeCardinality() {
		return TaggedUnionUtils.get(this, CUMULATIVE_CARDINALITY);
	}

	/**
	 * Get the {@code cumulative_sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cumulative_sum} kind.
	 */
	public CumulativeSumAggregation cumulativeSum() {
		return TaggedUnionUtils.get(this, CUMULATIVE_SUM);
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public DateHistogramAggregation dateHistogram() {
		return TaggedUnionUtils.get(this, DATE_HISTOGRAM);
	}

	/**
	 * Get the {@code date_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_range} kind.
	 */
	public DateRangeAggregation dateRange() {
		return TaggedUnionUtils.get(this, DATE_RANGE);
	}

	/**
	 * Get the {@code derivative} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code derivative} kind.
	 */
	public DerivativeAggregation derivative() {
		return TaggedUnionUtils.get(this, DERIVATIVE);
	}

	/**
	 * Get the {@code diversified_sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code diversified_sampler}
	 *             kind.
	 */
	public DiversifiedSamplerAggregation diversifiedSampler() {
		return TaggedUnionUtils.get(this, DIVERSIFIED_SAMPLER);
	}

	/**
	 * Get the {@code extended_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code extended_stats} kind.
	 */
	public ExtendedStatsAggregation extendedStats() {
		return TaggedUnionUtils.get(this, EXTENDED_STATS);
	}

	/**
	 * Get the {@code extended_stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code extended_stats_bucket} kind.
	 */
	public ExtendedStatsBucketAggregation extendedStatsBucket() {
		return TaggedUnionUtils.get(this, EXTENDED_STATS_BUCKET);
	}

	/**
	 * Get the {@code filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filter} kind.
	 */
	public Query filter() {
		return TaggedUnionUtils.get(this, FILTER);
	}

	/**
	 * Get the {@code filters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filters} kind.
	 */
	public FiltersAggregation filters() {
		return TaggedUnionUtils.get(this, FILTERS);
	}

	/**
	 * Get the {@code geo_bounds} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounds} kind.
	 */
	public GeoBoundsAggregation geoBounds() {
		return TaggedUnionUtils.get(this, GEO_BOUNDS);
	}

	/**
	 * Get the {@code geo_centroid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_centroid} kind.
	 */
	public GeoCentroidAggregation geoCentroid() {
		return TaggedUnionUtils.get(this, GEO_CENTROID);
	}

	/**
	 * Get the {@code geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_distance} kind.
	 */
	public GeoDistanceAggregation geoDistance() {
		return TaggedUnionUtils.get(this, GEO_DISTANCE);
	}

	/**
	 * Get the {@code geohash_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash_grid} kind.
	 */
	public GeoHashGridAggregation geohashGrid() {
		return TaggedUnionUtils.get(this, GEOHASH_GRID);
	}

	/**
	 * Get the {@code geo_line} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_line} kind.
	 */
	public GeoLineAggregation geoLine() {
		return TaggedUnionUtils.get(this, GEO_LINE);
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public GeoTileGridAggregation geotileGrid() {
		return TaggedUnionUtils.get(this, GEOTILE_GRID);
	}

	/**
	 * Get the {@code global} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code global} kind.
	 */
	public GlobalAggregation global() {
		return TaggedUnionUtils.get(this, GLOBAL);
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramAggregation histogram() {
		return TaggedUnionUtils.get(this, HISTOGRAM);
	}

	/**
	 * Get the {@code ip_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ip_range} kind.
	 */
	public IpRangeAggregation ipRange() {
		return TaggedUnionUtils.get(this, IP_RANGE);
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceAggregation inference() {
		return TaggedUnionUtils.get(this, INFERENCE);
	}

	/**
	 * Get the {@code matrix_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code matrix_stats} kind.
	 */
	public MatrixStatsAggregation matrixStats() {
		return TaggedUnionUtils.get(this, MATRIX_STATS);
	}

	/**
	 * Get the {@code max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max} kind.
	 */
	public MaxAggregation max() {
		return TaggedUnionUtils.get(this, MAX);
	}

	/**
	 * Get the {@code max_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max_bucket} kind.
	 */
	public MaxBucketAggregation maxBucket() {
		return TaggedUnionUtils.get(this, MAX_BUCKET);
	}

	/**
	 * Get the {@code median_absolute_deviation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code median_absolute_deviation} kind.
	 */
	public MedianAbsoluteDeviationAggregation medianAbsoluteDeviation() {
		return TaggedUnionUtils.get(this, MEDIAN_ABSOLUTE_DEVIATION);
	}

	/**
	 * Get the {@code min} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min} kind.
	 */
	public MinAggregation min() {
		return TaggedUnionUtils.get(this, MIN);
	}

	/**
	 * Get the {@code min_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min_bucket} kind.
	 */
	public MinBucketAggregation minBucket() {
		return TaggedUnionUtils.get(this, MIN_BUCKET);
	}

	/**
	 * Get the {@code missing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code missing} kind.
	 */
	public MissingAggregation missing() {
		return TaggedUnionUtils.get(this, MISSING);
	}

	/**
	 * Get the {@code moving_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_avg} kind.
	 */
	public MovingAverageAggregation movingAvg() {
		return TaggedUnionUtils.get(this, MOVING_AVG);
	}

	/**
	 * Get the {@code moving_percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_percentiles}
	 *             kind.
	 */
	public MovingPercentilesAggregation movingPercentiles() {
		return TaggedUnionUtils.get(this, MOVING_PERCENTILES);
	}

	/**
	 * Get the {@code moving_fn} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_fn} kind.
	 */
	public MovingFunctionAggregation movingFn() {
		return TaggedUnionUtils.get(this, MOVING_FN);
	}

	/**
	 * Get the {@code multi_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_terms} kind.
	 */
	public MultiTermsAggregation multiTerms() {
		return TaggedUnionUtils.get(this, MULTI_TERMS);
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedAggregation nested() {
		return TaggedUnionUtils.get(this, NESTED);
	}

	/**
	 * Get the {@code normalize} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code normalize} kind.
	 */
	public NormalizeAggregation normalize() {
		return TaggedUnionUtils.get(this, NORMALIZE);
	}

	/**
	 * Get the {@code parent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code parent} kind.
	 */
	public ParentAggregation parent() {
		return TaggedUnionUtils.get(this, PARENT);
	}

	/**
	 * Get the {@code percentile_ranks} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentile_ranks}
	 *             kind.
	 */
	public PercentileRanksAggregation percentileRanks() {
		return TaggedUnionUtils.get(this, PERCENTILE_RANKS);
	}

	/**
	 * Get the {@code percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles} kind.
	 */
	public PercentilesAggregation percentiles() {
		return TaggedUnionUtils.get(this, PERCENTILES);
	}

	/**
	 * Get the {@code percentiles_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles_bucket}
	 *             kind.
	 */
	public PercentilesBucketAggregation percentilesBucket() {
		return TaggedUnionUtils.get(this, PERCENTILES_BUCKET);
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeAggregation range() {
		return TaggedUnionUtils.get(this, RANGE);
	}

	/**
	 * Get the {@code rare_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rare_terms} kind.
	 */
	public RareTermsAggregation rareTerms() {
		return TaggedUnionUtils.get(this, RARE_TERMS);
	}

	/**
	 * Get the {@code rate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rate} kind.
	 */
	public RateAggregation rate() {
		return TaggedUnionUtils.get(this, RATE);
	}

	/**
	 * Get the {@code reverse_nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse_nested} kind.
	 */
	public ReverseNestedAggregation reverseNested() {
		return TaggedUnionUtils.get(this, REVERSE_NESTED);
	}

	/**
	 * Get the {@code sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sampler} kind.
	 */
	public SamplerAggregation sampler() {
		return TaggedUnionUtils.get(this, SAMPLER);
	}

	/**
	 * Get the {@code scripted_metric} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scripted_metric}
	 *             kind.
	 */
	public ScriptedMetricAggregation scriptedMetric() {
		return TaggedUnionUtils.get(this, SCRIPTED_METRIC);
	}

	/**
	 * Get the {@code serial_diff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code serial_diff} kind.
	 */
	public SerialDifferencingAggregation serialDiff() {
		return TaggedUnionUtils.get(this, SERIAL_DIFF);
	}

	/**
	 * Get the {@code significant_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code significant_terms}
	 *             kind.
	 */
	public SignificantTermsAggregation significantTerms() {
		return TaggedUnionUtils.get(this, SIGNIFICANT_TERMS);
	}

	/**
	 * Get the {@code significant_text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code significant_text}
	 *             kind.
	 */
	public SignificantTextAggregation significantText() {
		return TaggedUnionUtils.get(this, SIGNIFICANT_TEXT);
	}

	/**
	 * Get the {@code stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats} kind.
	 */
	public StatsAggregation stats() {
		return TaggedUnionUtils.get(this, STATS);
	}

	/**
	 * Get the {@code stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats_bucket} kind.
	 */
	public StatsBucketAggregation statsBucket() {
		return TaggedUnionUtils.get(this, STATS_BUCKET);
	}

	/**
	 * Get the {@code string_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string_stats} kind.
	 */
	public StringStatsAggregation stringStats() {
		return TaggedUnionUtils.get(this, STRING_STATS);
	}

	/**
	 * Get the {@code sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum} kind.
	 */
	public SumAggregation sum() {
		return TaggedUnionUtils.get(this, SUM);
	}

	/**
	 * Get the {@code sum_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum_bucket} kind.
	 */
	public SumBucketAggregation sumBucket() {
		return TaggedUnionUtils.get(this, SUM_BUCKET);
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsAggregation terms() {
		return TaggedUnionUtils.get(this, TERMS);
	}

	/**
	 * Get the {@code top_hits} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_hits} kind.
	 */
	public TopHitsAggregation topHits() {
		return TaggedUnionUtils.get(this, TOP_HITS);
	}

	/**
	 * Get the {@code t_test} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code t_test} kind.
	 */
	public TTestAggregation tTest() {
		return TaggedUnionUtils.get(this, T_TEST);
	}

	/**
	 * Get the {@code top_metrics} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_metrics} kind.
	 */
	public TopMetricsAggregation topMetrics() {
		return TaggedUnionUtils.get(this, TOP_METRICS);
	}

	/**
	 * Get the {@code value_count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value_count} kind.
	 */
	public ValueCountAggregation valueCount() {
		return TaggedUnionUtils.get(this, VALUE_COUNT);
	}

	/**
	 * Get the {@code weighted_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weighted_avg} kind.
	 */
	public WeightedAverageAggregation weightedAvg() {
		return TaggedUnionUtils.get(this, WEIGHTED_AVG);
	}

	/**
	 * Get the {@code variable_width_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code variable_width_histogram} kind.
	 */
	public VariableWidthHistogramAggregation variableWidthHistogram() {
		return TaggedUnionUtils.get(this, VARIABLE_WIDTH_HISTOGRAM);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase {
		private String _type;
		private Object _value;

		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
		 * <p>
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
		 * API name: {@code meta}
		 */
		public final Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		public ContainerBuilder adjacencyMatrix(AdjacencyMatrixAggregation v) {
			this._type = ADJACENCY_MATRIX;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder adjacencyMatrix(
				Function<AdjacencyMatrixAggregation.Builder, ObjectBuilder<AdjacencyMatrixAggregation>> f) {
			return this.adjacencyMatrix(f.apply(new AdjacencyMatrixAggregation.Builder()).build());
		}

		public ContainerBuilder autoDateHistogram(AutoDateHistogramAggregation v) {
			this._type = AUTO_DATE_HISTOGRAM;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder autoDateHistogram(
				Function<AutoDateHistogramAggregation.Builder, ObjectBuilder<AutoDateHistogramAggregation>> f) {
			return this.autoDateHistogram(f.apply(new AutoDateHistogramAggregation.Builder()).build());
		}

		public ContainerBuilder avg(AverageAggregation v) {
			this._type = AVG;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder avg(Function<AverageAggregation.Builder, ObjectBuilder<AverageAggregation>> f) {
			return this.avg(f.apply(new AverageAggregation.Builder()).build());
		}

		public ContainerBuilder avgBucket(AverageBucketAggregation v) {
			this._type = AVG_BUCKET;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder avgBucket(
				Function<AverageBucketAggregation.Builder, ObjectBuilder<AverageBucketAggregation>> f) {
			return this.avgBucket(f.apply(new AverageBucketAggregation.Builder()).build());
		}

		public ContainerBuilder boxplot(BoxplotAggregation v) {
			this._type = BOXPLOT;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder boxplot(Function<BoxplotAggregation.Builder, ObjectBuilder<BoxplotAggregation>> f) {
			return this.boxplot(f.apply(new BoxplotAggregation.Builder()).build());
		}

		public ContainerBuilder bucketScript(BucketScriptAggregation v) {
			this._type = BUCKET_SCRIPT;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketScript(
				Function<BucketScriptAggregation.Builder, ObjectBuilder<BucketScriptAggregation>> f) {
			return this.bucketScript(f.apply(new BucketScriptAggregation.Builder()).build());
		}

		public ContainerBuilder bucketSelector(BucketSelectorAggregation v) {
			this._type = BUCKET_SELECTOR;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketSelector(
				Function<BucketSelectorAggregation.Builder, ObjectBuilder<BucketSelectorAggregation>> f) {
			return this.bucketSelector(f.apply(new BucketSelectorAggregation.Builder()).build());
		}

		public ContainerBuilder bucketSort(BucketSortAggregation v) {
			this._type = BUCKET_SORT;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketSort(
				Function<BucketSortAggregation.Builder, ObjectBuilder<BucketSortAggregation>> f) {
			return this.bucketSort(f.apply(new BucketSortAggregation.Builder()).build());
		}

		public ContainerBuilder cardinality(CardinalityAggregation v) {
			this._type = CARDINALITY;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder cardinality(
				Function<CardinalityAggregation.Builder, ObjectBuilder<CardinalityAggregation>> f) {
			return this.cardinality(f.apply(new CardinalityAggregation.Builder()).build());
		}

		public ContainerBuilder children(ChildrenAggregation v) {
			this._type = CHILDREN;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder children(Function<ChildrenAggregation.Builder, ObjectBuilder<ChildrenAggregation>> f) {
			return this.children(f.apply(new ChildrenAggregation.Builder()).build());
		}

		public ContainerBuilder composite(CompositeAggregation v) {
			this._type = COMPOSITE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder composite(
				Function<CompositeAggregation.Builder, ObjectBuilder<CompositeAggregation>> f) {
			return this.composite(f.apply(new CompositeAggregation.Builder()).build());
		}

		public ContainerBuilder cumulativeCardinality(CumulativeCardinalityAggregation v) {
			this._type = CUMULATIVE_CARDINALITY;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder cumulativeCardinality(
				Function<CumulativeCardinalityAggregation.Builder, ObjectBuilder<CumulativeCardinalityAggregation>> f) {
			return this.cumulativeCardinality(f.apply(new CumulativeCardinalityAggregation.Builder()).build());
		}

		public ContainerBuilder cumulativeSum(CumulativeSumAggregation v) {
			this._type = CUMULATIVE_SUM;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder cumulativeSum(
				Function<CumulativeSumAggregation.Builder, ObjectBuilder<CumulativeSumAggregation>> f) {
			return this.cumulativeSum(f.apply(new CumulativeSumAggregation.Builder()).build());
		}

		public ContainerBuilder dateHistogram(DateHistogramAggregation v) {
			this._type = DATE_HISTOGRAM;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder dateHistogram(
				Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> f) {
			return this.dateHistogram(f.apply(new DateHistogramAggregation.Builder()).build());
		}

		public ContainerBuilder dateRange(DateRangeAggregation v) {
			this._type = DATE_RANGE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder dateRange(
				Function<DateRangeAggregation.Builder, ObjectBuilder<DateRangeAggregation>> f) {
			return this.dateRange(f.apply(new DateRangeAggregation.Builder()).build());
		}

		public ContainerBuilder derivative(DerivativeAggregation v) {
			this._type = DERIVATIVE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder derivative(
				Function<DerivativeAggregation.Builder, ObjectBuilder<DerivativeAggregation>> f) {
			return this.derivative(f.apply(new DerivativeAggregation.Builder()).build());
		}

		public ContainerBuilder diversifiedSampler(DiversifiedSamplerAggregation v) {
			this._type = DIVERSIFIED_SAMPLER;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder diversifiedSampler(
				Function<DiversifiedSamplerAggregation.Builder, ObjectBuilder<DiversifiedSamplerAggregation>> f) {
			return this.diversifiedSampler(f.apply(new DiversifiedSamplerAggregation.Builder()).build());
		}

		public ContainerBuilder extendedStats(ExtendedStatsAggregation v) {
			this._type = EXTENDED_STATS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder extendedStats(
				Function<ExtendedStatsAggregation.Builder, ObjectBuilder<ExtendedStatsAggregation>> f) {
			return this.extendedStats(f.apply(new ExtendedStatsAggregation.Builder()).build());
		}

		public ContainerBuilder extendedStatsBucket(ExtendedStatsBucketAggregation v) {
			this._type = EXTENDED_STATS_BUCKET;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder extendedStatsBucket(
				Function<ExtendedStatsBucketAggregation.Builder, ObjectBuilder<ExtendedStatsBucketAggregation>> f) {
			return this.extendedStatsBucket(f.apply(new ExtendedStatsBucketAggregation.Builder()).build());
		}

		public ContainerBuilder filter(Query v) {
			this._type = FILTER;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder filter(Function<Query.Builder, ObjectBuilder<Query>> f) {
			return this.filter(f.apply(new Query.Builder()).build());
		}

		public ContainerBuilder filters(FiltersAggregation v) {
			this._type = FILTERS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder filters(Function<FiltersAggregation.Builder, ObjectBuilder<FiltersAggregation>> f) {
			return this.filters(f.apply(new FiltersAggregation.Builder()).build());
		}

		public ContainerBuilder geoBounds(GeoBoundsAggregation v) {
			this._type = GEO_BOUNDS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoBounds(
				Function<GeoBoundsAggregation.Builder, ObjectBuilder<GeoBoundsAggregation>> f) {
			return this.geoBounds(f.apply(new GeoBoundsAggregation.Builder()).build());
		}

		public ContainerBuilder geoCentroid(GeoCentroidAggregation v) {
			this._type = GEO_CENTROID;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoCentroid(
				Function<GeoCentroidAggregation.Builder, ObjectBuilder<GeoCentroidAggregation>> f) {
			return this.geoCentroid(f.apply(new GeoCentroidAggregation.Builder()).build());
		}

		public ContainerBuilder geoDistance(GeoDistanceAggregation v) {
			this._type = GEO_DISTANCE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoDistance(
				Function<GeoDistanceAggregation.Builder, ObjectBuilder<GeoDistanceAggregation>> f) {
			return this.geoDistance(f.apply(new GeoDistanceAggregation.Builder()).build());
		}

		public ContainerBuilder geohashGrid(GeoHashGridAggregation v) {
			this._type = GEOHASH_GRID;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder geohashGrid(
				Function<GeoHashGridAggregation.Builder, ObjectBuilder<GeoHashGridAggregation>> f) {
			return this.geohashGrid(f.apply(new GeoHashGridAggregation.Builder()).build());
		}

		public ContainerBuilder geoLine(GeoLineAggregation v) {
			this._type = GEO_LINE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoLine(Function<GeoLineAggregation.Builder, ObjectBuilder<GeoLineAggregation>> f) {
			return this.geoLine(f.apply(new GeoLineAggregation.Builder()).build());
		}

		public ContainerBuilder geotileGrid(GeoTileGridAggregation v) {
			this._type = GEOTILE_GRID;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder geotileGrid(
				Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> f) {
			return this.geotileGrid(f.apply(new GeoTileGridAggregation.Builder()).build());
		}

		public ContainerBuilder global(GlobalAggregation v) {
			this._type = GLOBAL;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder global(Function<GlobalAggregation.Builder, ObjectBuilder<GlobalAggregation>> f) {
			return this.global(f.apply(new GlobalAggregation.Builder()).build());
		}

		public ContainerBuilder histogram(HistogramAggregation v) {
			this._type = HISTOGRAM;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder histogram(
				Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> f) {
			return this.histogram(f.apply(new HistogramAggregation.Builder()).build());
		}

		public ContainerBuilder ipRange(IpRangeAggregation v) {
			this._type = IP_RANGE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder ipRange(Function<IpRangeAggregation.Builder, ObjectBuilder<IpRangeAggregation>> f) {
			return this.ipRange(f.apply(new IpRangeAggregation.Builder()).build());
		}

		public ContainerBuilder inference(InferenceAggregation v) {
			this._type = INFERENCE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder inference(
				Function<InferenceAggregation.Builder, ObjectBuilder<InferenceAggregation>> f) {
			return this.inference(f.apply(new InferenceAggregation.Builder()).build());
		}

		public ContainerBuilder matrixStats(MatrixStatsAggregation v) {
			this._type = MATRIX_STATS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder matrixStats(
				Function<MatrixStatsAggregation.Builder, ObjectBuilder<MatrixStatsAggregation>> f) {
			return this.matrixStats(f.apply(new MatrixStatsAggregation.Builder()).build());
		}

		public ContainerBuilder max(MaxAggregation v) {
			this._type = MAX;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder max(Function<MaxAggregation.Builder, ObjectBuilder<MaxAggregation>> f) {
			return this.max(f.apply(new MaxAggregation.Builder()).build());
		}

		public ContainerBuilder maxBucket(MaxBucketAggregation v) {
			this._type = MAX_BUCKET;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder maxBucket(
				Function<MaxBucketAggregation.Builder, ObjectBuilder<MaxBucketAggregation>> f) {
			return this.maxBucket(f.apply(new MaxBucketAggregation.Builder()).build());
		}

		public ContainerBuilder medianAbsoluteDeviation(MedianAbsoluteDeviationAggregation v) {
			this._type = MEDIAN_ABSOLUTE_DEVIATION;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder medianAbsoluteDeviation(
				Function<MedianAbsoluteDeviationAggregation.Builder, ObjectBuilder<MedianAbsoluteDeviationAggregation>> f) {
			return this.medianAbsoluteDeviation(f.apply(new MedianAbsoluteDeviationAggregation.Builder()).build());
		}

		public ContainerBuilder min(MinAggregation v) {
			this._type = MIN;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder min(Function<MinAggregation.Builder, ObjectBuilder<MinAggregation>> f) {
			return this.min(f.apply(new MinAggregation.Builder()).build());
		}

		public ContainerBuilder minBucket(MinBucketAggregation v) {
			this._type = MIN_BUCKET;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder minBucket(
				Function<MinBucketAggregation.Builder, ObjectBuilder<MinBucketAggregation>> f) {
			return this.minBucket(f.apply(new MinBucketAggregation.Builder()).build());
		}

		public ContainerBuilder missing(MissingAggregation v) {
			this._type = MISSING;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder missing(Function<MissingAggregation.Builder, ObjectBuilder<MissingAggregation>> f) {
			return this.missing(f.apply(new MissingAggregation.Builder()).build());
		}

		public ContainerBuilder movingAvg(MovingAverageAggregation v) {
			this._type = MOVING_AVG;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingAvg(
				Function<MovingAverageAggregation.Builder, ObjectBuilder<MovingAverageAggregation>> f) {
			return this.movingAvg(f.apply(new MovingAverageAggregation.Builder()).build());
		}

		public ContainerBuilder movingPercentiles(MovingPercentilesAggregation v) {
			this._type = MOVING_PERCENTILES;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingPercentiles(
				Function<MovingPercentilesAggregation.Builder, ObjectBuilder<MovingPercentilesAggregation>> f) {
			return this.movingPercentiles(f.apply(new MovingPercentilesAggregation.Builder()).build());
		}

		public ContainerBuilder movingFn(MovingFunctionAggregation v) {
			this._type = MOVING_FN;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingFn(
				Function<MovingFunctionAggregation.Builder, ObjectBuilder<MovingFunctionAggregation>> f) {
			return this.movingFn(f.apply(new MovingFunctionAggregation.Builder()).build());
		}

		public ContainerBuilder multiTerms(MultiTermsAggregation v) {
			this._type = MULTI_TERMS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder multiTerms(
				Function<MultiTermsAggregation.Builder, ObjectBuilder<MultiTermsAggregation>> f) {
			return this.multiTerms(f.apply(new MultiTermsAggregation.Builder()).build());
		}

		public ContainerBuilder nested(NestedAggregation v) {
			this._type = NESTED;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder nested(Function<NestedAggregation.Builder, ObjectBuilder<NestedAggregation>> f) {
			return this.nested(f.apply(new NestedAggregation.Builder()).build());
		}

		public ContainerBuilder normalize(NormalizeAggregation v) {
			this._type = NORMALIZE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder normalize(
				Function<NormalizeAggregation.Builder, ObjectBuilder<NormalizeAggregation>> f) {
			return this.normalize(f.apply(new NormalizeAggregation.Builder()).build());
		}

		public ContainerBuilder parent(ParentAggregation v) {
			this._type = PARENT;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder parent(Function<ParentAggregation.Builder, ObjectBuilder<ParentAggregation>> f) {
			return this.parent(f.apply(new ParentAggregation.Builder()).build());
		}

		public ContainerBuilder percentileRanks(PercentileRanksAggregation v) {
			this._type = PERCENTILE_RANKS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentileRanks(
				Function<PercentileRanksAggregation.Builder, ObjectBuilder<PercentileRanksAggregation>> f) {
			return this.percentileRanks(f.apply(new PercentileRanksAggregation.Builder()).build());
		}

		public ContainerBuilder percentiles(PercentilesAggregation v) {
			this._type = PERCENTILES;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentiles(
				Function<PercentilesAggregation.Builder, ObjectBuilder<PercentilesAggregation>> f) {
			return this.percentiles(f.apply(new PercentilesAggregation.Builder()).build());
		}

		public ContainerBuilder percentilesBucket(PercentilesBucketAggregation v) {
			this._type = PERCENTILES_BUCKET;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentilesBucket(
				Function<PercentilesBucketAggregation.Builder, ObjectBuilder<PercentilesBucketAggregation>> f) {
			return this.percentilesBucket(f.apply(new PercentilesBucketAggregation.Builder()).build());
		}

		public ContainerBuilder range(RangeAggregation v) {
			this._type = RANGE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder range(Function<RangeAggregation.Builder, ObjectBuilder<RangeAggregation>> f) {
			return this.range(f.apply(new RangeAggregation.Builder()).build());
		}

		public ContainerBuilder rareTerms(RareTermsAggregation v) {
			this._type = RARE_TERMS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder rareTerms(
				Function<RareTermsAggregation.Builder, ObjectBuilder<RareTermsAggregation>> f) {
			return this.rareTerms(f.apply(new RareTermsAggregation.Builder()).build());
		}

		public ContainerBuilder rate(RateAggregation v) {
			this._type = RATE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder rate(Function<RateAggregation.Builder, ObjectBuilder<RateAggregation>> f) {
			return this.rate(f.apply(new RateAggregation.Builder()).build());
		}

		public ContainerBuilder reverseNested(ReverseNestedAggregation v) {
			this._type = REVERSE_NESTED;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder reverseNested(
				Function<ReverseNestedAggregation.Builder, ObjectBuilder<ReverseNestedAggregation>> f) {
			return this.reverseNested(f.apply(new ReverseNestedAggregation.Builder()).build());
		}

		public ContainerBuilder sampler(SamplerAggregation v) {
			this._type = SAMPLER;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder sampler(Function<SamplerAggregation.Builder, ObjectBuilder<SamplerAggregation>> f) {
			return this.sampler(f.apply(new SamplerAggregation.Builder()).build());
		}

		public ContainerBuilder scriptedMetric(ScriptedMetricAggregation v) {
			this._type = SCRIPTED_METRIC;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder scriptedMetric(
				Function<ScriptedMetricAggregation.Builder, ObjectBuilder<ScriptedMetricAggregation>> f) {
			return this.scriptedMetric(f.apply(new ScriptedMetricAggregation.Builder()).build());
		}

		public ContainerBuilder serialDiff(SerialDifferencingAggregation v) {
			this._type = SERIAL_DIFF;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder serialDiff(
				Function<SerialDifferencingAggregation.Builder, ObjectBuilder<SerialDifferencingAggregation>> f) {
			return this.serialDiff(f.apply(new SerialDifferencingAggregation.Builder()).build());
		}

		public ContainerBuilder significantTerms(SignificantTermsAggregation v) {
			this._type = SIGNIFICANT_TERMS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder significantTerms(
				Function<SignificantTermsAggregation.Builder, ObjectBuilder<SignificantTermsAggregation>> f) {
			return this.significantTerms(f.apply(new SignificantTermsAggregation.Builder()).build());
		}

		public ContainerBuilder significantText(SignificantTextAggregation v) {
			this._type = SIGNIFICANT_TEXT;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder significantText(
				Function<SignificantTextAggregation.Builder, ObjectBuilder<SignificantTextAggregation>> f) {
			return this.significantText(f.apply(new SignificantTextAggregation.Builder()).build());
		}

		public ContainerBuilder stats(StatsAggregation v) {
			this._type = STATS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder stats(Function<StatsAggregation.Builder, ObjectBuilder<StatsAggregation>> f) {
			return this.stats(f.apply(new StatsAggregation.Builder()).build());
		}

		public ContainerBuilder statsBucket(StatsBucketAggregation v) {
			this._type = STATS_BUCKET;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder statsBucket(
				Function<StatsBucketAggregation.Builder, ObjectBuilder<StatsBucketAggregation>> f) {
			return this.statsBucket(f.apply(new StatsBucketAggregation.Builder()).build());
		}

		public ContainerBuilder stringStats(StringStatsAggregation v) {
			this._type = STRING_STATS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder stringStats(
				Function<StringStatsAggregation.Builder, ObjectBuilder<StringStatsAggregation>> f) {
			return this.stringStats(f.apply(new StringStatsAggregation.Builder()).build());
		}

		public ContainerBuilder sum(SumAggregation v) {
			this._type = SUM;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder sum(Function<SumAggregation.Builder, ObjectBuilder<SumAggregation>> f) {
			return this.sum(f.apply(new SumAggregation.Builder()).build());
		}

		public ContainerBuilder sumBucket(SumBucketAggregation v) {
			this._type = SUM_BUCKET;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder sumBucket(
				Function<SumBucketAggregation.Builder, ObjectBuilder<SumBucketAggregation>> f) {
			return this.sumBucket(f.apply(new SumBucketAggregation.Builder()).build());
		}

		public ContainerBuilder terms(TermsAggregation v) {
			this._type = TERMS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> f) {
			return this.terms(f.apply(new TermsAggregation.Builder()).build());
		}

		public ContainerBuilder topHits(TopHitsAggregation v) {
			this._type = TOP_HITS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder topHits(Function<TopHitsAggregation.Builder, ObjectBuilder<TopHitsAggregation>> f) {
			return this.topHits(f.apply(new TopHitsAggregation.Builder()).build());
		}

		public ContainerBuilder tTest(TTestAggregation v) {
			this._type = T_TEST;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder tTest(Function<TTestAggregation.Builder, ObjectBuilder<TTestAggregation>> f) {
			return this.tTest(f.apply(new TTestAggregation.Builder()).build());
		}

		public ContainerBuilder topMetrics(TopMetricsAggregation v) {
			this._type = TOP_METRICS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder topMetrics(
				Function<TopMetricsAggregation.Builder, ObjectBuilder<TopMetricsAggregation>> f) {
			return this.topMetrics(f.apply(new TopMetricsAggregation.Builder()).build());
		}

		public ContainerBuilder valueCount(ValueCountAggregation v) {
			this._type = VALUE_COUNT;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder valueCount(
				Function<ValueCountAggregation.Builder, ObjectBuilder<ValueCountAggregation>> f) {
			return this.valueCount(f.apply(new ValueCountAggregation.Builder()).build());
		}

		public ContainerBuilder weightedAvg(WeightedAverageAggregation v) {
			this._type = WEIGHTED_AVG;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder weightedAvg(
				Function<WeightedAverageAggregation.Builder, ObjectBuilder<WeightedAverageAggregation>> f) {
			return this.weightedAvg(f.apply(new WeightedAverageAggregation.Builder()).build());
		}

		public ContainerBuilder variableWidthHistogram(VariableWidthHistogramAggregation v) {
			this._type = VARIABLE_WIDTH_HISTOGRAM;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder variableWidthHistogram(
				Function<VariableWidthHistogramAggregation.Builder, ObjectBuilder<VariableWidthHistogramAggregation>> f) {
			return this.variableWidthHistogram(f.apply(new VariableWidthHistogramAggregation.Builder()).build());
		}

		protected Aggregation build() {
			_checkSingleUse();
			return new Aggregation(this);
		}

		public class ContainerBuilder implements ObjectBuilder<Aggregation> {

			/**
			 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
			 * <p>
			 * API name: {@code aggregations}
			 */
			public final ContainerBuilder aggregations(@Nullable Map<String, Aggregation> value) {
				Builder.this.aggregations = value;
				return this;
			}

			/**
			 * Set {@link #aggregations(Map)} to a singleton map.
			 */
			public ContainerBuilder aggregations(String key,
					Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
				return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
			}

			public final ContainerBuilder aggregations(
					Function<MapBuilder<String, Aggregation, Aggregation.Builder>, ObjectBuilder<Map<String, Aggregation>>> fn) {
				return aggregations(fn.apply(new MapBuilder<>(Aggregation.Builder::new)).build());
			}

			/**
			 * API name: {@code meta}
			 */
			public final ContainerBuilder meta(@Nullable Map<String, JsonData> value) {
				Builder.this.meta = value;
				return this;
			}

			public Aggregation build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupAggregationDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "meta");
		op.add(Builder::adjacencyMatrix, AdjacencyMatrixAggregation._DESERIALIZER, "adjacency_matrix");
		op.add(Builder::autoDateHistogram, AutoDateHistogramAggregation._DESERIALIZER, "auto_date_histogram");
		op.add(Builder::avg, AverageAggregation._DESERIALIZER, "avg");
		op.add(Builder::avgBucket, AverageBucketAggregation._DESERIALIZER, "avg_bucket");
		op.add(Builder::boxplot, BoxplotAggregation._DESERIALIZER, "boxplot");
		op.add(Builder::bucketScript, BucketScriptAggregation._DESERIALIZER, "bucket_script");
		op.add(Builder::bucketSelector, BucketSelectorAggregation._DESERIALIZER, "bucket_selector");
		op.add(Builder::bucketSort, BucketSortAggregation._DESERIALIZER, "bucket_sort");
		op.add(Builder::cardinality, CardinalityAggregation._DESERIALIZER, "cardinality");
		op.add(Builder::children, ChildrenAggregation._DESERIALIZER, "children");
		op.add(Builder::composite, CompositeAggregation._DESERIALIZER, "composite");
		op.add(Builder::cumulativeCardinality, CumulativeCardinalityAggregation._DESERIALIZER,
				"cumulative_cardinality");
		op.add(Builder::cumulativeSum, CumulativeSumAggregation._DESERIALIZER, "cumulative_sum");
		op.add(Builder::dateHistogram, DateHistogramAggregation._DESERIALIZER, "date_histogram");
		op.add(Builder::dateRange, DateRangeAggregation._DESERIALIZER, "date_range");
		op.add(Builder::derivative, DerivativeAggregation._DESERIALIZER, "derivative");
		op.add(Builder::diversifiedSampler, DiversifiedSamplerAggregation._DESERIALIZER, "diversified_sampler");
		op.add(Builder::extendedStats, ExtendedStatsAggregation._DESERIALIZER, "extended_stats");
		op.add(Builder::extendedStatsBucket, ExtendedStatsBucketAggregation._DESERIALIZER, "extended_stats_bucket");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::filters, FiltersAggregation._DESERIALIZER, "filters");
		op.add(Builder::geoBounds, GeoBoundsAggregation._DESERIALIZER, "geo_bounds");
		op.add(Builder::geoCentroid, GeoCentroidAggregation._DESERIALIZER, "geo_centroid");
		op.add(Builder::geoDistance, GeoDistanceAggregation._DESERIALIZER, "geo_distance");
		op.add(Builder::geohashGrid, GeoHashGridAggregation._DESERIALIZER, "geohash_grid");
		op.add(Builder::geoLine, GeoLineAggregation._DESERIALIZER, "geo_line");
		op.add(Builder::geotileGrid, GeoTileGridAggregation._DESERIALIZER, "geotile_grid");
		op.add(Builder::global, GlobalAggregation._DESERIALIZER, "global");
		op.add(Builder::histogram, HistogramAggregation._DESERIALIZER, "histogram");
		op.add(Builder::ipRange, IpRangeAggregation._DESERIALIZER, "ip_range");
		op.add(Builder::inference, InferenceAggregation._DESERIALIZER, "inference");
		op.add(Builder::matrixStats, MatrixStatsAggregation._DESERIALIZER, "matrix_stats");
		op.add(Builder::max, MaxAggregation._DESERIALIZER, "max");
		op.add(Builder::maxBucket, MaxBucketAggregation._DESERIALIZER, "max_bucket");
		op.add(Builder::medianAbsoluteDeviation, MedianAbsoluteDeviationAggregation._DESERIALIZER,
				"median_absolute_deviation");
		op.add(Builder::min, MinAggregation._DESERIALIZER, "min");
		op.add(Builder::minBucket, MinBucketAggregation._DESERIALIZER, "min_bucket");
		op.add(Builder::missing, MissingAggregation._DESERIALIZER, "missing");
		op.add(Builder::movingAvg, MovingAverageAggregation._DESERIALIZER, "moving_avg");
		op.add(Builder::movingPercentiles, MovingPercentilesAggregation._DESERIALIZER, "moving_percentiles");
		op.add(Builder::movingFn, MovingFunctionAggregation._DESERIALIZER, "moving_fn");
		op.add(Builder::multiTerms, MultiTermsAggregation._DESERIALIZER, "multi_terms");
		op.add(Builder::nested, NestedAggregation._DESERIALIZER, "nested");
		op.add(Builder::normalize, NormalizeAggregation._DESERIALIZER, "normalize");
		op.add(Builder::parent, ParentAggregation._DESERIALIZER, "parent");
		op.add(Builder::percentileRanks, PercentileRanksAggregation._DESERIALIZER, "percentile_ranks");
		op.add(Builder::percentiles, PercentilesAggregation._DESERIALIZER, "percentiles");
		op.add(Builder::percentilesBucket, PercentilesBucketAggregation._DESERIALIZER, "percentiles_bucket");
		op.add(Builder::range, RangeAggregation._DESERIALIZER, "range");
		op.add(Builder::rareTerms, RareTermsAggregation._DESERIALIZER, "rare_terms");
		op.add(Builder::rate, RateAggregation._DESERIALIZER, "rate");
		op.add(Builder::reverseNested, ReverseNestedAggregation._DESERIALIZER, "reverse_nested");
		op.add(Builder::sampler, SamplerAggregation._DESERIALIZER, "sampler");
		op.add(Builder::scriptedMetric, ScriptedMetricAggregation._DESERIALIZER, "scripted_metric");
		op.add(Builder::serialDiff, SerialDifferencingAggregation._DESERIALIZER, "serial_diff");
		op.add(Builder::significantTerms, SignificantTermsAggregation._DESERIALIZER, "significant_terms");
		op.add(Builder::significantText, SignificantTextAggregation._DESERIALIZER, "significant_text");
		op.add(Builder::stats, StatsAggregation._DESERIALIZER, "stats");
		op.add(Builder::statsBucket, StatsBucketAggregation._DESERIALIZER, "stats_bucket");
		op.add(Builder::stringStats, StringStatsAggregation._DESERIALIZER, "string_stats");
		op.add(Builder::sum, SumAggregation._DESERIALIZER, "sum");
		op.add(Builder::sumBucket, SumBucketAggregation._DESERIALIZER, "sum_bucket");
		op.add(Builder::terms, TermsAggregation._DESERIALIZER, "terms");
		op.add(Builder::topHits, TopHitsAggregation._DESERIALIZER, "top_hits");
		op.add(Builder::tTest, TTestAggregation._DESERIALIZER, "t_test");
		op.add(Builder::topMetrics, TopMetricsAggregation._DESERIALIZER, "top_metrics");
		op.add(Builder::valueCount, ValueCountAggregation._DESERIALIZER, "value_count");
		op.add(Builder::weightedAvg, WeightedAverageAggregation._DESERIALIZER, "weighted_avg");
		op.add(Builder::variableWidthHistogram, VariableWidthHistogramAggregation._DESERIALIZER,
				"variable_width_histogram");

	}

	public static final JsonpDeserializer<Aggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Aggregation::setupAggregationDeserializer, Builder::build);
}
