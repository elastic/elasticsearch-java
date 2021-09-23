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
import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AggregationContainer
public class Aggregation extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String ADJACENCY_MATRIX = "adjacency_matrix";
	public static final String AGGREGATIONS = "aggregations";
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
	public static final String GLOBAL = "global";
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
	public static final String TOP_HITS = "top_hits";
	public static final String T_TEST = "t_test";
	public static final String TOP_METRICS = "top_metrics";
	public static final String VALUE_COUNT = "value_count";
	public static final String WEIGHTED_AVG = "weighted_avg";
	public static final String VARIABLE_WIDTH_HISTOGRAM = "variable_width_histogram";

	@Nullable
	private final Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> aggs;

	@Nullable
	private final Map<String, JsonData> meta;

	private Aggregation(Builder builder) {
		super(builder.$tag, builder.$variant);
		this.aggs = builder.aggs;
		this.meta = builder.meta;

	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * API name: {@code meta}
	 */
	@Nullable
	public Map<String, JsonData> meta() {
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
		return _get(ADJACENCY_MATRIX);
	}

	/**
	 * Get the {@code aggregations} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code aggregations} kind.
	 */
	public Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> aggregations() {
		return _get(AGGREGATIONS);
	}

	/**
	 * Get the {@code auto_date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code auto_date_histogram}
	 *             kind.
	 */
	public AutoDateHistogramAggregation autoDateHistogram() {
		return _get(AUTO_DATE_HISTOGRAM);
	}

	/**
	 * Get the {@code avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg} kind.
	 */
	public AverageAggregation avg() {
		return _get(AVG);
	}

	/**
	 * Get the {@code avg_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg_bucket} kind.
	 */
	public AverageBucketAggregation avgBucket() {
		return _get(AVG_BUCKET);
	}

	/**
	 * Get the {@code boxplot} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boxplot} kind.
	 */
	public BoxplotAggregation boxplot() {
		return _get(BOXPLOT);
	}

	/**
	 * Get the {@code bucket_script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_script} kind.
	 */
	public BucketScriptAggregation bucketScript() {
		return _get(BUCKET_SCRIPT);
	}

	/**
	 * Get the {@code bucket_selector} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_selector}
	 *             kind.
	 */
	public BucketSelectorAggregation bucketSelector() {
		return _get(BUCKET_SELECTOR);
	}

	/**
	 * Get the {@code bucket_sort} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_sort} kind.
	 */
	public BucketSortAggregation bucketSort() {
		return _get(BUCKET_SORT);
	}

	/**
	 * Get the {@code cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cardinality} kind.
	 */
	public CardinalityAggregation cardinality() {
		return _get(CARDINALITY);
	}

	/**
	 * Get the {@code children} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code children} kind.
	 */
	public ChildrenAggregation children() {
		return _get(CHILDREN);
	}

	/**
	 * Get the {@code composite} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code composite} kind.
	 */
	public CompositeAggregation composite() {
		return _get(COMPOSITE);
	}

	/**
	 * Get the {@code cumulative_cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code cumulative_cardinality} kind.
	 */
	public CumulativeCardinalityAggregation cumulativeCardinality() {
		return _get(CUMULATIVE_CARDINALITY);
	}

	/**
	 * Get the {@code cumulative_sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cumulative_sum} kind.
	 */
	public CumulativeSumAggregation cumulativeSum() {
		return _get(CUMULATIVE_SUM);
	}

	/**
	 * Get the {@code date_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_range} kind.
	 */
	public DateRangeAggregation dateRange() {
		return _get(DATE_RANGE);
	}

	/**
	 * Get the {@code derivative} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code derivative} kind.
	 */
	public DerivativeAggregation derivative() {
		return _get(DERIVATIVE);
	}

	/**
	 * Get the {@code diversified_sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code diversified_sampler}
	 *             kind.
	 */
	public DiversifiedSamplerAggregation diversifiedSampler() {
		return _get(DIVERSIFIED_SAMPLER);
	}

	/**
	 * Get the {@code extended_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code extended_stats} kind.
	 */
	public ExtendedStatsAggregation extendedStats() {
		return _get(EXTENDED_STATS);
	}

	/**
	 * Get the {@code extended_stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code extended_stats_bucket} kind.
	 */
	public ExtendedStatsBucketAggregation extendedStatsBucket() {
		return _get(EXTENDED_STATS_BUCKET);
	}

	/**
	 * Get the {@code filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filter} kind.
	 */
	public Query filter() {
		return _get(FILTER);
	}

	/**
	 * Get the {@code filters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filters} kind.
	 */
	public FiltersAggregation filters() {
		return _get(FILTERS);
	}

	/**
	 * Get the {@code geo_bounds} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounds} kind.
	 */
	public GeoBoundsAggregation geoBounds() {
		return _get(GEO_BOUNDS);
	}

	/**
	 * Get the {@code geo_centroid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_centroid} kind.
	 */
	public GeoCentroidAggregation geoCentroid() {
		return _get(GEO_CENTROID);
	}

	/**
	 * Get the {@code geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_distance} kind.
	 */
	public GeoDistanceAggregation geoDistance() {
		return _get(GEO_DISTANCE);
	}

	/**
	 * Get the {@code geohash_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash_grid} kind.
	 */
	public GeoHashGridAggregation geohashGrid() {
		return _get(GEOHASH_GRID);
	}

	/**
	 * Get the {@code geo_line} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_line} kind.
	 */
	public GeoLineAggregation geoLine() {
		return _get(GEO_LINE);
	}

	/**
	 * Get the {@code global} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code global} kind.
	 */
	public GlobalAggregation global() {
		return _get(GLOBAL);
	}

	/**
	 * Get the {@code ip_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ip_range} kind.
	 */
	public IpRangeAggregation ipRange() {
		return _get(IP_RANGE);
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceAggregation inference() {
		return _get(INFERENCE);
	}

	/**
	 * Get the {@code matrix_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code matrix_stats} kind.
	 */
	public MatrixStatsAggregation matrixStats() {
		return _get(MATRIX_STATS);
	}

	/**
	 * Get the {@code max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max} kind.
	 */
	public MaxAggregation max() {
		return _get(MAX);
	}

	/**
	 * Get the {@code max_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max_bucket} kind.
	 */
	public MaxBucketAggregation maxBucket() {
		return _get(MAX_BUCKET);
	}

	/**
	 * Get the {@code median_absolute_deviation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code median_absolute_deviation} kind.
	 */
	public MedianAbsoluteDeviationAggregation medianAbsoluteDeviation() {
		return _get(MEDIAN_ABSOLUTE_DEVIATION);
	}

	/**
	 * Get the {@code min} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min} kind.
	 */
	public MinAggregation min() {
		return _get(MIN);
	}

	/**
	 * Get the {@code min_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min_bucket} kind.
	 */
	public MinBucketAggregation minBucket() {
		return _get(MIN_BUCKET);
	}

	/**
	 * Get the {@code missing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code missing} kind.
	 */
	public MissingAggregation missing() {
		return _get(MISSING);
	}

	/**
	 * Get the {@code moving_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_avg} kind.
	 */
	public MovingAverageAggregation movingAvg() {
		return _get(MOVING_AVG);
	}

	/**
	 * Get the {@code moving_percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_percentiles}
	 *             kind.
	 */
	public MovingPercentilesAggregation movingPercentiles() {
		return _get(MOVING_PERCENTILES);
	}

	/**
	 * Get the {@code moving_fn} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_fn} kind.
	 */
	public MovingFunctionAggregation movingFn() {
		return _get(MOVING_FN);
	}

	/**
	 * Get the {@code multi_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_terms} kind.
	 */
	public MultiTermsAggregation multiTerms() {
		return _get(MULTI_TERMS);
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedAggregation nested() {
		return _get(NESTED);
	}

	/**
	 * Get the {@code normalize} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code normalize} kind.
	 */
	public NormalizeAggregation normalize() {
		return _get(NORMALIZE);
	}

	/**
	 * Get the {@code parent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code parent} kind.
	 */
	public ParentAggregation parent() {
		return _get(PARENT);
	}

	/**
	 * Get the {@code percentile_ranks} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentile_ranks}
	 *             kind.
	 */
	public PercentileRanksAggregation percentileRanks() {
		return _get(PERCENTILE_RANKS);
	}

	/**
	 * Get the {@code percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles} kind.
	 */
	public PercentilesAggregation percentiles() {
		return _get(PERCENTILES);
	}

	/**
	 * Get the {@code percentiles_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles_bucket}
	 *             kind.
	 */
	public PercentilesBucketAggregation percentilesBucket() {
		return _get(PERCENTILES_BUCKET);
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeAggregation range() {
		return _get(RANGE);
	}

	/**
	 * Get the {@code rare_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rare_terms} kind.
	 */
	public RareTermsAggregation rareTerms() {
		return _get(RARE_TERMS);
	}

	/**
	 * Get the {@code rate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rate} kind.
	 */
	public RateAggregation rate() {
		return _get(RATE);
	}

	/**
	 * Get the {@code reverse_nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse_nested} kind.
	 */
	public ReverseNestedAggregation reverseNested() {
		return _get(REVERSE_NESTED);
	}

	/**
	 * Get the {@code sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sampler} kind.
	 */
	public SamplerAggregation sampler() {
		return _get(SAMPLER);
	}

	/**
	 * Get the {@code scripted_metric} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scripted_metric}
	 *             kind.
	 */
	public ScriptedMetricAggregation scriptedMetric() {
		return _get(SCRIPTED_METRIC);
	}

	/**
	 * Get the {@code serial_diff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code serial_diff} kind.
	 */
	public SerialDifferencingAggregation serialDiff() {
		return _get(SERIAL_DIFF);
	}

	/**
	 * Get the {@code significant_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code significant_terms}
	 *             kind.
	 */
	public SignificantTermsAggregation significantTerms() {
		return _get(SIGNIFICANT_TERMS);
	}

	/**
	 * Get the {@code significant_text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code significant_text}
	 *             kind.
	 */
	public SignificantTextAggregation significantText() {
		return _get(SIGNIFICANT_TEXT);
	}

	/**
	 * Get the {@code stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats} kind.
	 */
	public StatsAggregation stats() {
		return _get(STATS);
	}

	/**
	 * Get the {@code stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats_bucket} kind.
	 */
	public StatsBucketAggregation statsBucket() {
		return _get(STATS_BUCKET);
	}

	/**
	 * Get the {@code string_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string_stats} kind.
	 */
	public StringStatsAggregation stringStats() {
		return _get(STRING_STATS);
	}

	/**
	 * Get the {@code sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum} kind.
	 */
	public SumAggregation sum() {
		return _get(SUM);
	}

	/**
	 * Get the {@code sum_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum_bucket} kind.
	 */
	public SumBucketAggregation sumBucket() {
		return _get(SUM_BUCKET);
	}

	/**
	 * Get the {@code top_hits} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_hits} kind.
	 */
	public TopHitsAggregation topHits() {
		return _get(TOP_HITS);
	}

	/**
	 * Get the {@code t_test} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code t_test} kind.
	 */
	public TTestAggregation tTest() {
		return _get(T_TEST);
	}

	/**
	 * Get the {@code top_metrics} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_metrics} kind.
	 */
	public TopMetricsAggregation topMetrics() {
		return _get(TOP_METRICS);
	}

	/**
	 * Get the {@code value_count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value_count} kind.
	 */
	public ValueCountAggregation valueCount() {
		return _get(VALUE_COUNT);
	}

	/**
	 * Get the {@code weighted_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weighted_avg} kind.
	 */
	public WeightedAverageAggregation weightedAvg() {
		return _get(WEIGHTED_AVG);
	}

	/**
	 * Get the {@code variable_width_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code variable_width_histogram} kind.
	 */
	public VariableWidthHistogramAggregation variableWidthHistogram() {
		return _get(VARIABLE_WIDTH_HISTOGRAM);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case AGGREGATIONS :
					generator.writeStartObject();
					for (Map.Entry<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> item0 : this.<Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation>>_get(
							AGGREGATIONS).entrySet()) {
						generator.writeKey(item0.getKey());
						item0.getValue().serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> item0 : this.aggs
					.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.meta != null) {

			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		@Nullable
		private Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> aggs;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(
				@Nullable Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, co.elastic.clients.elasticsearch._types.aggregations.Aggregation value) {
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
				Function<co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.Aggregation>> fn) {
			return this.aggs(Collections.singletonMap(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key,
				Function<co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.Aggregation>> fn) {
			return this.putAggs(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code meta}
		 */
		public Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonData value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		public ContainerBuilder adjacencyMatrix(AdjacencyMatrixAggregation v) {
			this.$variant = v;
			this.$tag = ADJACENCY_MATRIX;
			return new ContainerBuilder();
		}

		public ContainerBuilder adjacencyMatrix(
				Function<AdjacencyMatrixAggregation.Builder, ObjectBuilder<AdjacencyMatrixAggregation>> f) {
			return this.adjacencyMatrix(f.apply(new AdjacencyMatrixAggregation.Builder()).build());
		}

		public ContainerBuilder aggregations(
				Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> v) {
			this.$variant = v;
			this.$tag = AGGREGATIONS;
			return new ContainerBuilder();
		}

		public ContainerBuilder autoDateHistogram(AutoDateHistogramAggregation v) {
			this.$variant = v;
			this.$tag = AUTO_DATE_HISTOGRAM;
			return new ContainerBuilder();
		}

		public ContainerBuilder autoDateHistogram(
				Function<AutoDateHistogramAggregation.Builder, ObjectBuilder<AutoDateHistogramAggregation>> f) {
			return this.autoDateHistogram(f.apply(new AutoDateHistogramAggregation.Builder()).build());
		}

		public ContainerBuilder avg(AverageAggregation v) {
			this.$variant = v;
			this.$tag = AVG;
			return new ContainerBuilder();
		}

		public ContainerBuilder avg(Function<AverageAggregation.Builder, ObjectBuilder<AverageAggregation>> f) {
			return this.avg(f.apply(new AverageAggregation.Builder()).build());
		}

		public ContainerBuilder avgBucket(AverageBucketAggregation v) {
			this.$variant = v;
			this.$tag = AVG_BUCKET;
			return new ContainerBuilder();
		}

		public ContainerBuilder avgBucket(
				Function<AverageBucketAggregation.Builder, ObjectBuilder<AverageBucketAggregation>> f) {
			return this.avgBucket(f.apply(new AverageBucketAggregation.Builder()).build());
		}

		public ContainerBuilder boxplot(BoxplotAggregation v) {
			this.$variant = v;
			this.$tag = BOXPLOT;
			return new ContainerBuilder();
		}

		public ContainerBuilder boxplot(Function<BoxplotAggregation.Builder, ObjectBuilder<BoxplotAggregation>> f) {
			return this.boxplot(f.apply(new BoxplotAggregation.Builder()).build());
		}

		public ContainerBuilder bucketScript(BucketScriptAggregation v) {
			this.$variant = v;
			this.$tag = BUCKET_SCRIPT;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketScript(
				Function<BucketScriptAggregation.Builder, ObjectBuilder<BucketScriptAggregation>> f) {
			return this.bucketScript(f.apply(new BucketScriptAggregation.Builder()).build());
		}

		public ContainerBuilder bucketSelector(BucketSelectorAggregation v) {
			this.$variant = v;
			this.$tag = BUCKET_SELECTOR;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketSelector(
				Function<BucketSelectorAggregation.Builder, ObjectBuilder<BucketSelectorAggregation>> f) {
			return this.bucketSelector(f.apply(new BucketSelectorAggregation.Builder()).build());
		}

		public ContainerBuilder bucketSort(BucketSortAggregation v) {
			this.$variant = v;
			this.$tag = BUCKET_SORT;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketSort(
				Function<BucketSortAggregation.Builder, ObjectBuilder<BucketSortAggregation>> f) {
			return this.bucketSort(f.apply(new BucketSortAggregation.Builder()).build());
		}

		public ContainerBuilder cardinality(CardinalityAggregation v) {
			this.$variant = v;
			this.$tag = CARDINALITY;
			return new ContainerBuilder();
		}

		public ContainerBuilder cardinality(
				Function<CardinalityAggregation.Builder, ObjectBuilder<CardinalityAggregation>> f) {
			return this.cardinality(f.apply(new CardinalityAggregation.Builder()).build());
		}

		public ContainerBuilder children(ChildrenAggregation v) {
			this.$variant = v;
			this.$tag = CHILDREN;
			return new ContainerBuilder();
		}

		public ContainerBuilder children(Function<ChildrenAggregation.Builder, ObjectBuilder<ChildrenAggregation>> f) {
			return this.children(f.apply(new ChildrenAggregation.Builder()).build());
		}

		public ContainerBuilder composite(CompositeAggregation v) {
			this.$variant = v;
			this.$tag = COMPOSITE;
			return new ContainerBuilder();
		}

		public ContainerBuilder composite(
				Function<CompositeAggregation.Builder, ObjectBuilder<CompositeAggregation>> f) {
			return this.composite(f.apply(new CompositeAggregation.Builder()).build());
		}

		public ContainerBuilder cumulativeCardinality(CumulativeCardinalityAggregation v) {
			this.$variant = v;
			this.$tag = CUMULATIVE_CARDINALITY;
			return new ContainerBuilder();
		}

		public ContainerBuilder cumulativeCardinality(
				Function<CumulativeCardinalityAggregation.Builder, ObjectBuilder<CumulativeCardinalityAggregation>> f) {
			return this.cumulativeCardinality(f.apply(new CumulativeCardinalityAggregation.Builder()).build());
		}

		public ContainerBuilder cumulativeSum(CumulativeSumAggregation v) {
			this.$variant = v;
			this.$tag = CUMULATIVE_SUM;
			return new ContainerBuilder();
		}

		public ContainerBuilder cumulativeSum(
				Function<CumulativeSumAggregation.Builder, ObjectBuilder<CumulativeSumAggregation>> f) {
			return this.cumulativeSum(f.apply(new CumulativeSumAggregation.Builder()).build());
		}

		public ContainerBuilder dateRange(DateRangeAggregation v) {
			this.$variant = v;
			this.$tag = DATE_RANGE;
			return new ContainerBuilder();
		}

		public ContainerBuilder dateRange(
				Function<DateRangeAggregation.Builder, ObjectBuilder<DateRangeAggregation>> f) {
			return this.dateRange(f.apply(new DateRangeAggregation.Builder()).build());
		}

		public ContainerBuilder derivative(DerivativeAggregation v) {
			this.$variant = v;
			this.$tag = DERIVATIVE;
			return new ContainerBuilder();
		}

		public ContainerBuilder derivative(
				Function<DerivativeAggregation.Builder, ObjectBuilder<DerivativeAggregation>> f) {
			return this.derivative(f.apply(new DerivativeAggregation.Builder()).build());
		}

		public ContainerBuilder diversifiedSampler(DiversifiedSamplerAggregation v) {
			this.$variant = v;
			this.$tag = DIVERSIFIED_SAMPLER;
			return new ContainerBuilder();
		}

		public ContainerBuilder diversifiedSampler(
				Function<DiversifiedSamplerAggregation.Builder, ObjectBuilder<DiversifiedSamplerAggregation>> f) {
			return this.diversifiedSampler(f.apply(new DiversifiedSamplerAggregation.Builder()).build());
		}

		public ContainerBuilder extendedStats(ExtendedStatsAggregation v) {
			this.$variant = v;
			this.$tag = EXTENDED_STATS;
			return new ContainerBuilder();
		}

		public ContainerBuilder extendedStats(
				Function<ExtendedStatsAggregation.Builder, ObjectBuilder<ExtendedStatsAggregation>> f) {
			return this.extendedStats(f.apply(new ExtendedStatsAggregation.Builder()).build());
		}

		public ContainerBuilder extendedStatsBucket(ExtendedStatsBucketAggregation v) {
			this.$variant = v;
			this.$tag = EXTENDED_STATS_BUCKET;
			return new ContainerBuilder();
		}

		public ContainerBuilder extendedStatsBucket(
				Function<ExtendedStatsBucketAggregation.Builder, ObjectBuilder<ExtendedStatsBucketAggregation>> f) {
			return this.extendedStatsBucket(f.apply(new ExtendedStatsBucketAggregation.Builder()).build());
		}

		public ContainerBuilder filter(Query v) {
			this.$variant = v;
			this.$tag = FILTER;
			return new ContainerBuilder();
		}

		public ContainerBuilder filter(Function<Query.Builder, ObjectBuilder<Query>> f) {
			return this.filter(f.apply(new Query.Builder()).build());
		}

		public ContainerBuilder filters(FiltersAggregation v) {
			this.$variant = v;
			this.$tag = FILTERS;
			return new ContainerBuilder();
		}

		public ContainerBuilder filters(Function<FiltersAggregation.Builder, ObjectBuilder<FiltersAggregation>> f) {
			return this.filters(f.apply(new FiltersAggregation.Builder()).build());
		}

		public ContainerBuilder geoBounds(GeoBoundsAggregation v) {
			this.$variant = v;
			this.$tag = GEO_BOUNDS;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoBounds(
				Function<GeoBoundsAggregation.Builder, ObjectBuilder<GeoBoundsAggregation>> f) {
			return this.geoBounds(f.apply(new GeoBoundsAggregation.Builder()).build());
		}

		public ContainerBuilder geoCentroid(GeoCentroidAggregation v) {
			this.$variant = v;
			this.$tag = GEO_CENTROID;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoCentroid(
				Function<GeoCentroidAggregation.Builder, ObjectBuilder<GeoCentroidAggregation>> f) {
			return this.geoCentroid(f.apply(new GeoCentroidAggregation.Builder()).build());
		}

		public ContainerBuilder geoDistance(GeoDistanceAggregation v) {
			this.$variant = v;
			this.$tag = GEO_DISTANCE;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoDistance(
				Function<GeoDistanceAggregation.Builder, ObjectBuilder<GeoDistanceAggregation>> f) {
			return this.geoDistance(f.apply(new GeoDistanceAggregation.Builder()).build());
		}

		public ContainerBuilder geohashGrid(GeoHashGridAggregation v) {
			this.$variant = v;
			this.$tag = GEOHASH_GRID;
			return new ContainerBuilder();
		}

		public ContainerBuilder geohashGrid(
				Function<GeoHashGridAggregation.Builder, ObjectBuilder<GeoHashGridAggregation>> f) {
			return this.geohashGrid(f.apply(new GeoHashGridAggregation.Builder()).build());
		}

		public ContainerBuilder geoLine(GeoLineAggregation v) {
			this.$variant = v;
			this.$tag = GEO_LINE;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoLine(Function<GeoLineAggregation.Builder, ObjectBuilder<GeoLineAggregation>> f) {
			return this.geoLine(f.apply(new GeoLineAggregation.Builder()).build());
		}

		public ContainerBuilder global(GlobalAggregation v) {
			this.$variant = v;
			this.$tag = GLOBAL;
			return new ContainerBuilder();
		}

		public ContainerBuilder global(Function<GlobalAggregation.Builder, ObjectBuilder<GlobalAggregation>> f) {
			return this.global(f.apply(new GlobalAggregation.Builder()).build());
		}

		public ContainerBuilder ipRange(IpRangeAggregation v) {
			this.$variant = v;
			this.$tag = IP_RANGE;
			return new ContainerBuilder();
		}

		public ContainerBuilder ipRange(Function<IpRangeAggregation.Builder, ObjectBuilder<IpRangeAggregation>> f) {
			return this.ipRange(f.apply(new IpRangeAggregation.Builder()).build());
		}

		public ContainerBuilder inference(InferenceAggregation v) {
			this.$variant = v;
			this.$tag = INFERENCE;
			return new ContainerBuilder();
		}

		public ContainerBuilder inference(
				Function<InferenceAggregation.Builder, ObjectBuilder<InferenceAggregation>> f) {
			return this.inference(f.apply(new InferenceAggregation.Builder()).build());
		}

		public ContainerBuilder matrixStats(MatrixStatsAggregation v) {
			this.$variant = v;
			this.$tag = MATRIX_STATS;
			return new ContainerBuilder();
		}

		public ContainerBuilder matrixStats(
				Function<MatrixStatsAggregation.Builder, ObjectBuilder<MatrixStatsAggregation>> f) {
			return this.matrixStats(f.apply(new MatrixStatsAggregation.Builder()).build());
		}

		public ContainerBuilder max(MaxAggregation v) {
			this.$variant = v;
			this.$tag = MAX;
			return new ContainerBuilder();
		}

		public ContainerBuilder max(Function<MaxAggregation.Builder, ObjectBuilder<MaxAggregation>> f) {
			return this.max(f.apply(new MaxAggregation.Builder()).build());
		}

		public ContainerBuilder maxBucket(MaxBucketAggregation v) {
			this.$variant = v;
			this.$tag = MAX_BUCKET;
			return new ContainerBuilder();
		}

		public ContainerBuilder maxBucket(
				Function<MaxBucketAggregation.Builder, ObjectBuilder<MaxBucketAggregation>> f) {
			return this.maxBucket(f.apply(new MaxBucketAggregation.Builder()).build());
		}

		public ContainerBuilder medianAbsoluteDeviation(MedianAbsoluteDeviationAggregation v) {
			this.$variant = v;
			this.$tag = MEDIAN_ABSOLUTE_DEVIATION;
			return new ContainerBuilder();
		}

		public ContainerBuilder medianAbsoluteDeviation(
				Function<MedianAbsoluteDeviationAggregation.Builder, ObjectBuilder<MedianAbsoluteDeviationAggregation>> f) {
			return this.medianAbsoluteDeviation(f.apply(new MedianAbsoluteDeviationAggregation.Builder()).build());
		}

		public ContainerBuilder min(MinAggregation v) {
			this.$variant = v;
			this.$tag = MIN;
			return new ContainerBuilder();
		}

		public ContainerBuilder min(Function<MinAggregation.Builder, ObjectBuilder<MinAggregation>> f) {
			return this.min(f.apply(new MinAggregation.Builder()).build());
		}

		public ContainerBuilder minBucket(MinBucketAggregation v) {
			this.$variant = v;
			this.$tag = MIN_BUCKET;
			return new ContainerBuilder();
		}

		public ContainerBuilder minBucket(
				Function<MinBucketAggregation.Builder, ObjectBuilder<MinBucketAggregation>> f) {
			return this.minBucket(f.apply(new MinBucketAggregation.Builder()).build());
		}

		public ContainerBuilder missing(MissingAggregation v) {
			this.$variant = v;
			this.$tag = MISSING;
			return new ContainerBuilder();
		}

		public ContainerBuilder missing(Function<MissingAggregation.Builder, ObjectBuilder<MissingAggregation>> f) {
			return this.missing(f.apply(new MissingAggregation.Builder()).build());
		}

		public ContainerBuilder movingAvg(MovingAverageAggregation v) {
			this.$variant = v;
			this.$tag = MOVING_AVG;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingAvg(
				Function<MovingAverageAggregation.Builder, ObjectBuilder<MovingAverageAggregation>> f) {
			return this.movingAvg(f.apply(new MovingAverageAggregation.Builder()).build());
		}

		public ContainerBuilder movingPercentiles(MovingPercentilesAggregation v) {
			this.$variant = v;
			this.$tag = MOVING_PERCENTILES;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingPercentiles(
				Function<MovingPercentilesAggregation.Builder, ObjectBuilder<MovingPercentilesAggregation>> f) {
			return this.movingPercentiles(f.apply(new MovingPercentilesAggregation.Builder()).build());
		}

		public ContainerBuilder movingFn(MovingFunctionAggregation v) {
			this.$variant = v;
			this.$tag = MOVING_FN;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingFn(
				Function<MovingFunctionAggregation.Builder, ObjectBuilder<MovingFunctionAggregation>> f) {
			return this.movingFn(f.apply(new MovingFunctionAggregation.Builder()).build());
		}

		public ContainerBuilder multiTerms(MultiTermsAggregation v) {
			this.$variant = v;
			this.$tag = MULTI_TERMS;
			return new ContainerBuilder();
		}

		public ContainerBuilder multiTerms(
				Function<MultiTermsAggregation.Builder, ObjectBuilder<MultiTermsAggregation>> f) {
			return this.multiTerms(f.apply(new MultiTermsAggregation.Builder()).build());
		}

		public ContainerBuilder nested(NestedAggregation v) {
			this.$variant = v;
			this.$tag = NESTED;
			return new ContainerBuilder();
		}

		public ContainerBuilder nested(Function<NestedAggregation.Builder, ObjectBuilder<NestedAggregation>> f) {
			return this.nested(f.apply(new NestedAggregation.Builder()).build());
		}

		public ContainerBuilder normalize(NormalizeAggregation v) {
			this.$variant = v;
			this.$tag = NORMALIZE;
			return new ContainerBuilder();
		}

		public ContainerBuilder normalize(
				Function<NormalizeAggregation.Builder, ObjectBuilder<NormalizeAggregation>> f) {
			return this.normalize(f.apply(new NormalizeAggregation.Builder()).build());
		}

		public ContainerBuilder parent(ParentAggregation v) {
			this.$variant = v;
			this.$tag = PARENT;
			return new ContainerBuilder();
		}

		public ContainerBuilder parent(Function<ParentAggregation.Builder, ObjectBuilder<ParentAggregation>> f) {
			return this.parent(f.apply(new ParentAggregation.Builder()).build());
		}

		public ContainerBuilder percentileRanks(PercentileRanksAggregation v) {
			this.$variant = v;
			this.$tag = PERCENTILE_RANKS;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentileRanks(
				Function<PercentileRanksAggregation.Builder, ObjectBuilder<PercentileRanksAggregation>> f) {
			return this.percentileRanks(f.apply(new PercentileRanksAggregation.Builder()).build());
		}

		public ContainerBuilder percentiles(PercentilesAggregation v) {
			this.$variant = v;
			this.$tag = PERCENTILES;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentiles(
				Function<PercentilesAggregation.Builder, ObjectBuilder<PercentilesAggregation>> f) {
			return this.percentiles(f.apply(new PercentilesAggregation.Builder()).build());
		}

		public ContainerBuilder percentilesBucket(PercentilesBucketAggregation v) {
			this.$variant = v;
			this.$tag = PERCENTILES_BUCKET;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentilesBucket(
				Function<PercentilesBucketAggregation.Builder, ObjectBuilder<PercentilesBucketAggregation>> f) {
			return this.percentilesBucket(f.apply(new PercentilesBucketAggregation.Builder()).build());
		}

		public ContainerBuilder range(RangeAggregation v) {
			this.$variant = v;
			this.$tag = RANGE;
			return new ContainerBuilder();
		}

		public ContainerBuilder range(Function<RangeAggregation.Builder, ObjectBuilder<RangeAggregation>> f) {
			return this.range(f.apply(new RangeAggregation.Builder()).build());
		}

		public ContainerBuilder rareTerms(RareTermsAggregation v) {
			this.$variant = v;
			this.$tag = RARE_TERMS;
			return new ContainerBuilder();
		}

		public ContainerBuilder rareTerms(
				Function<RareTermsAggregation.Builder, ObjectBuilder<RareTermsAggregation>> f) {
			return this.rareTerms(f.apply(new RareTermsAggregation.Builder()).build());
		}

		public ContainerBuilder rate(RateAggregation v) {
			this.$variant = v;
			this.$tag = RATE;
			return new ContainerBuilder();
		}

		public ContainerBuilder rate(Function<RateAggregation.Builder, ObjectBuilder<RateAggregation>> f) {
			return this.rate(f.apply(new RateAggregation.Builder()).build());
		}

		public ContainerBuilder reverseNested(ReverseNestedAggregation v) {
			this.$variant = v;
			this.$tag = REVERSE_NESTED;
			return new ContainerBuilder();
		}

		public ContainerBuilder reverseNested(
				Function<ReverseNestedAggregation.Builder, ObjectBuilder<ReverseNestedAggregation>> f) {
			return this.reverseNested(f.apply(new ReverseNestedAggregation.Builder()).build());
		}

		public ContainerBuilder sampler(SamplerAggregation v) {
			this.$variant = v;
			this.$tag = SAMPLER;
			return new ContainerBuilder();
		}

		public ContainerBuilder sampler(Function<SamplerAggregation.Builder, ObjectBuilder<SamplerAggregation>> f) {
			return this.sampler(f.apply(new SamplerAggregation.Builder()).build());
		}

		public ContainerBuilder scriptedMetric(ScriptedMetricAggregation v) {
			this.$variant = v;
			this.$tag = SCRIPTED_METRIC;
			return new ContainerBuilder();
		}

		public ContainerBuilder scriptedMetric(
				Function<ScriptedMetricAggregation.Builder, ObjectBuilder<ScriptedMetricAggregation>> f) {
			return this.scriptedMetric(f.apply(new ScriptedMetricAggregation.Builder()).build());
		}

		public ContainerBuilder serialDiff(SerialDifferencingAggregation v) {
			this.$variant = v;
			this.$tag = SERIAL_DIFF;
			return new ContainerBuilder();
		}

		public ContainerBuilder serialDiff(
				Function<SerialDifferencingAggregation.Builder, ObjectBuilder<SerialDifferencingAggregation>> f) {
			return this.serialDiff(f.apply(new SerialDifferencingAggregation.Builder()).build());
		}

		public ContainerBuilder significantTerms(SignificantTermsAggregation v) {
			this.$variant = v;
			this.$tag = SIGNIFICANT_TERMS;
			return new ContainerBuilder();
		}

		public ContainerBuilder significantTerms(
				Function<SignificantTermsAggregation.Builder, ObjectBuilder<SignificantTermsAggregation>> f) {
			return this.significantTerms(f.apply(new SignificantTermsAggregation.Builder()).build());
		}

		public ContainerBuilder significantText(SignificantTextAggregation v) {
			this.$variant = v;
			this.$tag = SIGNIFICANT_TEXT;
			return new ContainerBuilder();
		}

		public ContainerBuilder significantText(
				Function<SignificantTextAggregation.Builder, ObjectBuilder<SignificantTextAggregation>> f) {
			return this.significantText(f.apply(new SignificantTextAggregation.Builder()).build());
		}

		public ContainerBuilder stats(StatsAggregation v) {
			this.$variant = v;
			this.$tag = STATS;
			return new ContainerBuilder();
		}

		public ContainerBuilder stats(Function<StatsAggregation.Builder, ObjectBuilder<StatsAggregation>> f) {
			return this.stats(f.apply(new StatsAggregation.Builder()).build());
		}

		public ContainerBuilder statsBucket(StatsBucketAggregation v) {
			this.$variant = v;
			this.$tag = STATS_BUCKET;
			return new ContainerBuilder();
		}

		public ContainerBuilder statsBucket(
				Function<StatsBucketAggregation.Builder, ObjectBuilder<StatsBucketAggregation>> f) {
			return this.statsBucket(f.apply(new StatsBucketAggregation.Builder()).build());
		}

		public ContainerBuilder stringStats(StringStatsAggregation v) {
			this.$variant = v;
			this.$tag = STRING_STATS;
			return new ContainerBuilder();
		}

		public ContainerBuilder stringStats(
				Function<StringStatsAggregation.Builder, ObjectBuilder<StringStatsAggregation>> f) {
			return this.stringStats(f.apply(new StringStatsAggregation.Builder()).build());
		}

		public ContainerBuilder sum(SumAggregation v) {
			this.$variant = v;
			this.$tag = SUM;
			return new ContainerBuilder();
		}

		public ContainerBuilder sum(Function<SumAggregation.Builder, ObjectBuilder<SumAggregation>> f) {
			return this.sum(f.apply(new SumAggregation.Builder()).build());
		}

		public ContainerBuilder sumBucket(SumBucketAggregation v) {
			this.$variant = v;
			this.$tag = SUM_BUCKET;
			return new ContainerBuilder();
		}

		public ContainerBuilder sumBucket(
				Function<SumBucketAggregation.Builder, ObjectBuilder<SumBucketAggregation>> f) {
			return this.sumBucket(f.apply(new SumBucketAggregation.Builder()).build());
		}

		public ContainerBuilder topHits(TopHitsAggregation v) {
			this.$variant = v;
			this.$tag = TOP_HITS;
			return new ContainerBuilder();
		}

		public ContainerBuilder topHits(Function<TopHitsAggregation.Builder, ObjectBuilder<TopHitsAggregation>> f) {
			return this.topHits(f.apply(new TopHitsAggregation.Builder()).build());
		}

		public ContainerBuilder tTest(TTestAggregation v) {
			this.$variant = v;
			this.$tag = T_TEST;
			return new ContainerBuilder();
		}

		public ContainerBuilder tTest(Function<TTestAggregation.Builder, ObjectBuilder<TTestAggregation>> f) {
			return this.tTest(f.apply(new TTestAggregation.Builder()).build());
		}

		public ContainerBuilder topMetrics(TopMetricsAggregation v) {
			this.$variant = v;
			this.$tag = TOP_METRICS;
			return new ContainerBuilder();
		}

		public ContainerBuilder topMetrics(
				Function<TopMetricsAggregation.Builder, ObjectBuilder<TopMetricsAggregation>> f) {
			return this.topMetrics(f.apply(new TopMetricsAggregation.Builder()).build());
		}

		public ContainerBuilder valueCount(ValueCountAggregation v) {
			this.$variant = v;
			this.$tag = VALUE_COUNT;
			return new ContainerBuilder();
		}

		public ContainerBuilder valueCount(
				Function<ValueCountAggregation.Builder, ObjectBuilder<ValueCountAggregation>> f) {
			return this.valueCount(f.apply(new ValueCountAggregation.Builder()).build());
		}

		public ContainerBuilder weightedAvg(WeightedAverageAggregation v) {
			this.$variant = v;
			this.$tag = WEIGHTED_AVG;
			return new ContainerBuilder();
		}

		public ContainerBuilder weightedAvg(
				Function<WeightedAverageAggregation.Builder, ObjectBuilder<WeightedAverageAggregation>> f) {
			return this.weightedAvg(f.apply(new WeightedAverageAggregation.Builder()).build());
		}

		public ContainerBuilder variableWidthHistogram(VariableWidthHistogramAggregation v) {
			this.$variant = v;
			this.$tag = VARIABLE_WIDTH_HISTOGRAM;
			return new ContainerBuilder();
		}

		public ContainerBuilder variableWidthHistogram(
				Function<VariableWidthHistogramAggregation.Builder, ObjectBuilder<VariableWidthHistogramAggregation>> f) {
			return this.variableWidthHistogram(f.apply(new VariableWidthHistogramAggregation.Builder()).build());
		}

		protected Aggregation build() {
			return new Aggregation(this);
		}

		public class ContainerBuilder implements ObjectBuilder<Aggregation> {

			/**
			 * API name: {@code aggs}
			 */
			public ContainerBuilder aggs(
					@Nullable Map<String, co.elastic.clients.elasticsearch._types.aggregations.Aggregation> value) {
				Builder.this.aggs = value;
				return this;
			}

			/**
			 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
			 */
			public ContainerBuilder putAggs(String key,
					co.elastic.clients.elasticsearch._types.aggregations.Aggregation value) {
				if (Builder.this.aggs == null) {
					Builder.this.aggs = new HashMap<>();
				}
				Builder.this.aggs.put(key, value);
				return this;
			}

			/**
			 * Set {@link #aggs(Map)} to a singleton map.
			 */
			public ContainerBuilder aggs(String key,
					Function<co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.Aggregation>> fn) {
				return this.aggs(Collections.singletonMap(key,
						fn.apply(new co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder())
								.build()));
			}

			/**
			 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
			 */
			public ContainerBuilder putAggs(String key,
					Function<co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.Aggregation>> fn) {
				return this.putAggs(key, fn
						.apply(new co.elastic.clients.elasticsearch._types.aggregations.Aggregation.Builder()).build());
			}

			/**
			 * API name: {@code meta}
			 */
			public ContainerBuilder meta(@Nullable Map<String, JsonData> value) {
				Builder.this.meta = value;
				return this;
			}

			/**
			 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
			 */
			public ContainerBuilder putMeta(String key, JsonData value) {
				if (Builder.this.meta == null) {
					Builder.this.meta = new HashMap<>();
				}
				Builder.this.meta.put(key, value);
				return this;
			}

			public Aggregation build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupAggregationDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(
				co.elastic.clients.elasticsearch._types.aggregations.Aggregation.DESERIALIZER), "aggs");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "meta");
		op.add(Builder::adjacencyMatrix, AdjacencyMatrixAggregation.DESERIALIZER, "adjacency_matrix");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(
				co.elastic.clients.elasticsearch._types.aggregations.Aggregation.DESERIALIZER), "aggregations");
		op.add(Builder::autoDateHistogram, AutoDateHistogramAggregation.DESERIALIZER, "auto_date_histogram");
		op.add(Builder::avg, AverageAggregation.DESERIALIZER, "avg");
		op.add(Builder::avgBucket, AverageBucketAggregation.DESERIALIZER, "avg_bucket");
		op.add(Builder::boxplot, BoxplotAggregation.DESERIALIZER, "boxplot");
		op.add(Builder::bucketScript, BucketScriptAggregation.DESERIALIZER, "bucket_script");
		op.add(Builder::bucketSelector, BucketSelectorAggregation.DESERIALIZER, "bucket_selector");
		op.add(Builder::bucketSort, BucketSortAggregation.DESERIALIZER, "bucket_sort");
		op.add(Builder::cardinality, CardinalityAggregation.DESERIALIZER, "cardinality");
		op.add(Builder::children, ChildrenAggregation.DESERIALIZER, "children");
		op.add(Builder::composite, CompositeAggregation.DESERIALIZER, "composite");
		op.add(Builder::cumulativeCardinality, CumulativeCardinalityAggregation.DESERIALIZER, "cumulative_cardinality");
		op.add(Builder::cumulativeSum, CumulativeSumAggregation.DESERIALIZER, "cumulative_sum");
		op.add(Builder::dateRange, DateRangeAggregation.DESERIALIZER, "date_range");
		op.add(Builder::derivative, DerivativeAggregation.DESERIALIZER, "derivative");
		op.add(Builder::diversifiedSampler, DiversifiedSamplerAggregation.DESERIALIZER, "diversified_sampler");
		op.add(Builder::extendedStats, ExtendedStatsAggregation.DESERIALIZER, "extended_stats");
		op.add(Builder::extendedStatsBucket, ExtendedStatsBucketAggregation.DESERIALIZER, "extended_stats_bucket");
		op.add(Builder::filter, Query.DESERIALIZER, "filter");
		op.add(Builder::filters, FiltersAggregation.DESERIALIZER, "filters");
		op.add(Builder::geoBounds, GeoBoundsAggregation.DESERIALIZER, "geo_bounds");
		op.add(Builder::geoCentroid, GeoCentroidAggregation.DESERIALIZER, "geo_centroid");
		op.add(Builder::geoDistance, GeoDistanceAggregation.DESERIALIZER, "geo_distance");
		op.add(Builder::geohashGrid, GeoHashGridAggregation.DESERIALIZER, "geohash_grid");
		op.add(Builder::geoLine, GeoLineAggregation.DESERIALIZER, "geo_line");
		op.add(Builder::global, GlobalAggregation.DESERIALIZER, "global");
		op.add(Builder::ipRange, IpRangeAggregation.DESERIALIZER, "ip_range");
		op.add(Builder::inference, InferenceAggregation.DESERIALIZER, "inference");
		op.add(Builder::matrixStats, MatrixStatsAggregation.DESERIALIZER, "matrix_stats");
		op.add(Builder::max, MaxAggregation.DESERIALIZER, "max");
		op.add(Builder::maxBucket, MaxBucketAggregation.DESERIALIZER, "max_bucket");
		op.add(Builder::medianAbsoluteDeviation, MedianAbsoluteDeviationAggregation.DESERIALIZER,
				"median_absolute_deviation");
		op.add(Builder::min, MinAggregation.DESERIALIZER, "min");
		op.add(Builder::minBucket, MinBucketAggregation.DESERIALIZER, "min_bucket");
		op.add(Builder::missing, MissingAggregation.DESERIALIZER, "missing");
		op.add(Builder::movingAvg, MovingAverageAggregation.DESERIALIZER, "moving_avg");
		op.add(Builder::movingPercentiles, MovingPercentilesAggregation.DESERIALIZER, "moving_percentiles");
		op.add(Builder::movingFn, MovingFunctionAggregation.DESERIALIZER, "moving_fn");
		op.add(Builder::multiTerms, MultiTermsAggregation.DESERIALIZER, "multi_terms");
		op.add(Builder::nested, NestedAggregation.DESERIALIZER, "nested");
		op.add(Builder::normalize, NormalizeAggregation.DESERIALIZER, "normalize");
		op.add(Builder::parent, ParentAggregation.DESERIALIZER, "parent");
		op.add(Builder::percentileRanks, PercentileRanksAggregation.DESERIALIZER, "percentile_ranks");
		op.add(Builder::percentiles, PercentilesAggregation.DESERIALIZER, "percentiles");
		op.add(Builder::percentilesBucket, PercentilesBucketAggregation.DESERIALIZER, "percentiles_bucket");
		op.add(Builder::range, RangeAggregation.DESERIALIZER, "range");
		op.add(Builder::rareTerms, RareTermsAggregation.DESERIALIZER, "rare_terms");
		op.add(Builder::rate, RateAggregation.DESERIALIZER, "rate");
		op.add(Builder::reverseNested, ReverseNestedAggregation.DESERIALIZER, "reverse_nested");
		op.add(Builder::sampler, SamplerAggregation.DESERIALIZER, "sampler");
		op.add(Builder::scriptedMetric, ScriptedMetricAggregation.DESERIALIZER, "scripted_metric");
		op.add(Builder::serialDiff, SerialDifferencingAggregation.DESERIALIZER, "serial_diff");
		op.add(Builder::significantTerms, SignificantTermsAggregation.DESERIALIZER, "significant_terms");
		op.add(Builder::significantText, SignificantTextAggregation.DESERIALIZER, "significant_text");
		op.add(Builder::stats, StatsAggregation.DESERIALIZER, "stats");
		op.add(Builder::statsBucket, StatsBucketAggregation.DESERIALIZER, "stats_bucket");
		op.add(Builder::stringStats, StringStatsAggregation.DESERIALIZER, "string_stats");
		op.add(Builder::sum, SumAggregation.DESERIALIZER, "sum");
		op.add(Builder::sumBucket, SumBucketAggregation.DESERIALIZER, "sum_bucket");
		op.add(Builder::topHits, TopHitsAggregation.DESERIALIZER, "top_hits");
		op.add(Builder::tTest, TTestAggregation.DESERIALIZER, "t_test");
		op.add(Builder::topMetrics, TopMetricsAggregation.DESERIALIZER, "top_metrics");
		op.add(Builder::valueCount, ValueCountAggregation.DESERIALIZER, "value_count");
		op.add(Builder::weightedAvg, WeightedAverageAggregation.DESERIALIZER, "weighted_avg");
		op.add(Builder::variableWidthHistogram, VariableWidthHistogramAggregation.DESERIALIZER,
				"variable_width_histogram");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<Aggregation> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Aggregation::setupAggregationDeserializer, Builder::build);
}
