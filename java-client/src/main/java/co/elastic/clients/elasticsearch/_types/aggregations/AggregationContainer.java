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

import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class AggregationContainer extends TaggedUnion<AggregationContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		adjacencyMatrix("adjacency_matrix"),

		aggregations("aggregations"),

		autoDateHistogram("auto_date_histogram"),

		avg("avg"),

		avgBucket("avg_bucket"),

		boxplot("boxplot"),

		bucketScript("bucket_script"),

		bucketSelector("bucket_selector"),

		bucketSort("bucket_sort"),

		cardinality("cardinality"),

		children("children"),

		composite("composite"),

		cumulativeCardinality("cumulative_cardinality"),

		cumulativeSum("cumulative_sum"),

		dateHistogram("date_histogram"),

		dateRange("date_range"),

		derivative("derivative"),

		diversifiedSampler("diversified_sampler"),

		extendedStats("extended_stats"),

		extendedStatsBucket("extended_stats_bucket"),

		filter("filter"),

		filters("filters"),

		geoBounds("geo_bounds"),

		geoCentroid("geo_centroid"),

		geoDistance("geo_distance"),

		geohashGrid("geohash_grid"),

		geoLine("geo_line"),

		geotileGrid("geotile_grid"),

		global("global"),

		histogram("histogram"),

		ipRange("ip_range"),

		inference("inference"),

		line("line"),

		matrixStats("matrix_stats"),

		max("max"),

		maxBucket("max_bucket"),

		medianAbsoluteDeviation("median_absolute_deviation"),

		min("min"),

		minBucket("min_bucket"),

		missing("missing"),

		movingAvg("moving_avg"),

		movingPercentiles("moving_percentiles"),

		movingFn("moving_fn"),

		multiTerms("multi_terms"),

		nested("nested"),

		normalize("normalize"),

		parent("parent"),

		percentileRanks("percentile_ranks"),

		percentiles("percentiles"),

		percentilesBucket("percentiles_bucket"),

		range("range"),

		rareTerms("rare_terms"),

		rate("rate"),

		reverseNested("reverse_nested"),

		sampler("sampler"),

		scriptedMetric("scripted_metric"),

		serialDiff("serial_diff"),

		significantTerms("significant_terms"),

		significantText("significant_text"),

		stats("stats"),

		statsBucket("stats_bucket"),

		stringStats("string_stats"),

		sum("sum"),

		sumBucket("sum_bucket"),

		terms("terms"),

		topHits("top_hits"),

		tTest("t_test"),

		topMetrics("top_metrics"),

		valueCount("value_count"),

		weightedAvg("weighted_avg"),

		variableWidthHistogram("variable_width_histogram"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	@Nullable
	private final Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> aggs;

	@Nullable
	private final Map<String, JsonValue> meta;

	private AggregationContainer(Builder builder) {
		super(builder.$tag, builder.$variant);
		this.aggs = builder.aggs;
		this.meta = builder.meta;

	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> aggs() {
		return this.aggs;
	}

	/**
	 * API name: {@code meta}
	 */
	@Nullable
	public Map<String, JsonValue> meta() {
		return this.meta;
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code adjacency_matrix} kind?
	 */
	public boolean isAdjacencyMatrix() {
		return is(Tag.adjacencyMatrix);
	}

	/**
	 * Get the {@code adjacency_matrix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code adjacency_matrix}
	 *             kind.
	 */
	public AdjacencyMatrixAggregation adjacencyMatrix() {
		return get(Tag.adjacencyMatrix);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code aggregations} kind?
	 */
	public boolean isAggregations() {
		return is(Tag.aggregations);
	}

	/**
	 * Get the {@code aggregations} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code aggregations} kind.
	 */
	public Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> aggregations() {
		return get(Tag.aggregations);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code auto_date_histogram} kind?
	 */
	public boolean isAutoDateHistogram() {
		return is(Tag.autoDateHistogram);
	}

	/**
	 * Get the {@code auto_date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code auto_date_histogram}
	 *             kind.
	 */
	public AutoDateHistogramAggregation autoDateHistogram() {
		return get(Tag.autoDateHistogram);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code avg} kind?
	 */
	public boolean isAvg() {
		return is(Tag.avg);
	}

	/**
	 * Get the {@code avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg} kind.
	 */
	public JsonValue avg() {
		return get(Tag.avg);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code avg_bucket} kind?
	 */
	public boolean isAvgBucket() {
		return is(Tag.avgBucket);
	}

	/**
	 * Get the {@code avg_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg_bucket} kind.
	 */
	public JsonValue avgBucket() {
		return get(Tag.avgBucket);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code boxplot} kind?
	 */
	public boolean isBoxplot() {
		return is(Tag.boxplot);
	}

	/**
	 * Get the {@code boxplot} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boxplot} kind.
	 */
	public BoxplotAggregation boxplot() {
		return get(Tag.boxplot);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code bucket_script} kind?
	 */
	public boolean isBucketScript() {
		return is(Tag.bucketScript);
	}

	/**
	 * Get the {@code bucket_script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_script} kind.
	 */
	public BucketScriptAggregation bucketScript() {
		return get(Tag.bucketScript);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code bucket_selector} kind?
	 */
	public boolean isBucketSelector() {
		return is(Tag.bucketSelector);
	}

	/**
	 * Get the {@code bucket_selector} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_selector}
	 *             kind.
	 */
	public BucketSelectorAggregation bucketSelector() {
		return get(Tag.bucketSelector);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code bucket_sort} kind?
	 */
	public boolean isBucketSort() {
		return is(Tag.bucketSort);
	}

	/**
	 * Get the {@code bucket_sort} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_sort} kind.
	 */
	public BucketSortAggregation bucketSort() {
		return get(Tag.bucketSort);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code cardinality} kind?
	 */
	public boolean isCardinality() {
		return is(Tag.cardinality);
	}

	/**
	 * Get the {@code cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cardinality} kind.
	 */
	public CardinalityAggregation cardinality() {
		return get(Tag.cardinality);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code children} kind?
	 */
	public boolean isChildren() {
		return is(Tag.children);
	}

	/**
	 * Get the {@code children} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code children} kind.
	 */
	public ChildrenAggregation children() {
		return get(Tag.children);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code composite} kind?
	 */
	public boolean isComposite() {
		return is(Tag.composite);
	}

	/**
	 * Get the {@code composite} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code composite} kind.
	 */
	public CompositeAggregation composite() {
		return get(Tag.composite);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code cumulative_cardinality}
	 * kind?
	 */
	public boolean isCumulativeCardinality() {
		return is(Tag.cumulativeCardinality);
	}

	/**
	 * Get the {@code cumulative_cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code cumulative_cardinality} kind.
	 */
	public JsonValue cumulativeCardinality() {
		return get(Tag.cumulativeCardinality);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code cumulative_sum} kind?
	 */
	public boolean isCumulativeSum() {
		return is(Tag.cumulativeSum);
	}

	/**
	 * Get the {@code cumulative_sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cumulative_sum} kind.
	 */
	public JsonValue cumulativeSum() {
		return get(Tag.cumulativeSum);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code date_histogram} kind?
	 */
	public boolean isDateHistogram() {
		return is(Tag.dateHistogram);
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public DateHistogramAggregation dateHistogram() {
		return get(Tag.dateHistogram);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code date_range} kind?
	 */
	public boolean isDateRange() {
		return is(Tag.dateRange);
	}

	/**
	 * Get the {@code date_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_range} kind.
	 */
	public DateRangeAggregation dateRange() {
		return get(Tag.dateRange);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code derivative} kind?
	 */
	public boolean isDerivative() {
		return is(Tag.derivative);
	}

	/**
	 * Get the {@code derivative} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code derivative} kind.
	 */
	public JsonValue derivative() {
		return get(Tag.derivative);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code diversified_sampler} kind?
	 */
	public boolean isDiversifiedSampler() {
		return is(Tag.diversifiedSampler);
	}

	/**
	 * Get the {@code diversified_sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code diversified_sampler}
	 *             kind.
	 */
	public DiversifiedSamplerAggregation diversifiedSampler() {
		return get(Tag.diversifiedSampler);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code extended_stats} kind?
	 */
	public boolean isExtendedStats() {
		return is(Tag.extendedStats);
	}

	/**
	 * Get the {@code extended_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code extended_stats} kind.
	 */
	public ExtendedStatsAggregation extendedStats() {
		return get(Tag.extendedStats);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code extended_stats_bucket} kind?
	 */
	public boolean isExtendedStatsBucket() {
		return is(Tag.extendedStatsBucket);
	}

	/**
	 * Get the {@code extended_stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code extended_stats_bucket} kind.
	 */
	public ExtendedStatsBucketAggregation extendedStatsBucket() {
		return get(Tag.extendedStatsBucket);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code filter} kind?
	 */
	public boolean isFilter() {
		return is(Tag.filter);
	}

	/**
	 * Get the {@code filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filter} kind.
	 */
	public QueryContainer filter() {
		return get(Tag.filter);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code filters} kind?
	 */
	public boolean isFilters() {
		return is(Tag.filters);
	}

	/**
	 * Get the {@code filters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filters} kind.
	 */
	public FiltersAggregation filters() {
		return get(Tag.filters);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code geo_bounds} kind?
	 */
	public boolean isGeoBounds() {
		return is(Tag.geoBounds);
	}

	/**
	 * Get the {@code geo_bounds} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounds} kind.
	 */
	public GeoBoundsAggregation geoBounds() {
		return get(Tag.geoBounds);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code geo_centroid} kind?
	 */
	public boolean isGeoCentroid() {
		return is(Tag.geoCentroid);
	}

	/**
	 * Get the {@code geo_centroid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_centroid} kind.
	 */
	public GeoCentroidAggregation geoCentroid() {
		return get(Tag.geoCentroid);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code geo_distance} kind?
	 */
	public boolean isGeoDistance() {
		return is(Tag.geoDistance);
	}

	/**
	 * Get the {@code geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_distance} kind.
	 */
	public GeoDistanceAggregation geoDistance() {
		return get(Tag.geoDistance);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code geohash_grid} kind?
	 */
	public boolean isGeohashGrid() {
		return is(Tag.geohashGrid);
	}

	/**
	 * Get the {@code geohash_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash_grid} kind.
	 */
	public GeoHashGridAggregation geohashGrid() {
		return get(Tag.geohashGrid);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code geo_line} kind?
	 */
	public boolean isGeoLine() {
		return is(Tag.geoLine);
	}

	/**
	 * Get the {@code geo_line} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_line} kind.
	 */
	public GeoLineAggregation geoLine() {
		return get(Tag.geoLine);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code geotile_grid} kind?
	 */
	public boolean isGeotileGrid() {
		return is(Tag.geotileGrid);
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public GeoTileGridAggregation geotileGrid() {
		return get(Tag.geotileGrid);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code global} kind?
	 */
	public boolean isGlobal() {
		return is(Tag.global);
	}

	/**
	 * Get the {@code global} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code global} kind.
	 */
	public JsonValue global() {
		return get(Tag.global);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code histogram} kind?
	 */
	public boolean isHistogram() {
		return is(Tag.histogram);
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramAggregation histogram() {
		return get(Tag.histogram);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code ip_range} kind?
	 */
	public boolean isIpRange() {
		return is(Tag.ipRange);
	}

	/**
	 * Get the {@code ip_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ip_range} kind.
	 */
	public IpRangeAggregation ipRange() {
		return get(Tag.ipRange);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code inference} kind?
	 */
	public boolean isInference() {
		return is(Tag.inference);
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceAggregation inference() {
		return get(Tag.inference);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code line} kind?
	 */
	public boolean isLine() {
		return is(Tag.line);
	}

	/**
	 * Get the {@code line} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code line} kind.
	 */
	public GeoLineAggregation line() {
		return get(Tag.line);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code matrix_stats} kind?
	 */
	public boolean isMatrixStats() {
		return is(Tag.matrixStats);
	}

	/**
	 * Get the {@code matrix_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code matrix_stats} kind.
	 */
	public MatrixStatsAggregation matrixStats() {
		return get(Tag.matrixStats);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code max} kind?
	 */
	public boolean isMax() {
		return is(Tag.max);
	}

	/**
	 * Get the {@code max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max} kind.
	 */
	public JsonValue max() {
		return get(Tag.max);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code max_bucket} kind?
	 */
	public boolean isMaxBucket() {
		return is(Tag.maxBucket);
	}

	/**
	 * Get the {@code max_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max_bucket} kind.
	 */
	public JsonValue maxBucket() {
		return get(Tag.maxBucket);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code median_absolute_deviation}
	 * kind?
	 */
	public boolean isMedianAbsoluteDeviation() {
		return is(Tag.medianAbsoluteDeviation);
	}

	/**
	 * Get the {@code median_absolute_deviation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code median_absolute_deviation} kind.
	 */
	public MedianAbsoluteDeviationAggregation medianAbsoluteDeviation() {
		return get(Tag.medianAbsoluteDeviation);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code min} kind?
	 */
	public boolean isMin() {
		return is(Tag.min);
	}

	/**
	 * Get the {@code min} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min} kind.
	 */
	public JsonValue min() {
		return get(Tag.min);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code min_bucket} kind?
	 */
	public boolean isMinBucket() {
		return is(Tag.minBucket);
	}

	/**
	 * Get the {@code min_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min_bucket} kind.
	 */
	public JsonValue minBucket() {
		return get(Tag.minBucket);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code missing} kind?
	 */
	public boolean isMissing() {
		return is(Tag.missing);
	}

	/**
	 * Get the {@code missing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code missing} kind.
	 */
	public MissingAggregation missing() {
		return get(Tag.missing);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code moving_avg} kind?
	 */
	public boolean isMovingAvg() {
		return is(Tag.movingAvg);
	}

	/**
	 * Get the {@code moving_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_avg} kind.
	 */
	public MovingAverageAggregation movingAvg() {
		return get(Tag.movingAvg);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code moving_percentiles} kind?
	 */
	public boolean isMovingPercentiles() {
		return is(Tag.movingPercentiles);
	}

	/**
	 * Get the {@code moving_percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_percentiles}
	 *             kind.
	 */
	public MovingPercentilesAggregation movingPercentiles() {
		return get(Tag.movingPercentiles);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code moving_fn} kind?
	 */
	public boolean isMovingFn() {
		return is(Tag.movingFn);
	}

	/**
	 * Get the {@code moving_fn} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code moving_fn} kind.
	 */
	public MovingFunctionAggregation movingFn() {
		return get(Tag.movingFn);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code multi_terms} kind?
	 */
	public boolean isMultiTerms() {
		return is(Tag.multiTerms);
	}

	/**
	 * Get the {@code multi_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_terms} kind.
	 */
	public MultiTermsAggregation multiTerms() {
		return get(Tag.multiTerms);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code nested} kind?
	 */
	public boolean isNested() {
		return is(Tag.nested);
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedAggregation nested() {
		return get(Tag.nested);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code normalize} kind?
	 */
	public boolean isNormalize() {
		return is(Tag.normalize);
	}

	/**
	 * Get the {@code normalize} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code normalize} kind.
	 */
	public NormalizeAggregation normalize() {
		return get(Tag.normalize);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code parent} kind?
	 */
	public boolean isParent() {
		return is(Tag.parent);
	}

	/**
	 * Get the {@code parent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code parent} kind.
	 */
	public ParentAggregation parent() {
		return get(Tag.parent);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code percentile_ranks} kind?
	 */
	public boolean isPercentileRanks() {
		return is(Tag.percentileRanks);
	}

	/**
	 * Get the {@code percentile_ranks} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentile_ranks}
	 *             kind.
	 */
	public PercentileRanksAggregation percentileRanks() {
		return get(Tag.percentileRanks);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code percentiles} kind?
	 */
	public boolean isPercentiles() {
		return is(Tag.percentiles);
	}

	/**
	 * Get the {@code percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles} kind.
	 */
	public PercentilesAggregation percentiles() {
		return get(Tag.percentiles);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code percentiles_bucket} kind?
	 */
	public boolean isPercentilesBucket() {
		return is(Tag.percentilesBucket);
	}

	/**
	 * Get the {@code percentiles_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles_bucket}
	 *             kind.
	 */
	public PercentilesBucketAggregation percentilesBucket() {
		return get(Tag.percentilesBucket);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code range} kind?
	 */
	public boolean isRange() {
		return is(Tag.range);
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeAggregation range() {
		return get(Tag.range);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code rare_terms} kind?
	 */
	public boolean isRareTerms() {
		return is(Tag.rareTerms);
	}

	/**
	 * Get the {@code rare_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rare_terms} kind.
	 */
	public RareTermsAggregation rareTerms() {
		return get(Tag.rareTerms);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code rate} kind?
	 */
	public boolean isRate() {
		return is(Tag.rate);
	}

	/**
	 * Get the {@code rate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rate} kind.
	 */
	public RateAggregation rate() {
		return get(Tag.rate);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code reverse_nested} kind?
	 */
	public boolean isReverseNested() {
		return is(Tag.reverseNested);
	}

	/**
	 * Get the {@code reverse_nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse_nested} kind.
	 */
	public ReverseNestedAggregation reverseNested() {
		return get(Tag.reverseNested);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code sampler} kind?
	 */
	public boolean isSampler() {
		return is(Tag.sampler);
	}

	/**
	 * Get the {@code sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sampler} kind.
	 */
	public SamplerAggregation sampler() {
		return get(Tag.sampler);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code scripted_metric} kind?
	 */
	public boolean isScriptedMetric() {
		return is(Tag.scriptedMetric);
	}

	/**
	 * Get the {@code scripted_metric} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scripted_metric}
	 *             kind.
	 */
	public ScriptedMetricAggregation scriptedMetric() {
		return get(Tag.scriptedMetric);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code serial_diff} kind?
	 */
	public boolean isSerialDiff() {
		return is(Tag.serialDiff);
	}

	/**
	 * Get the {@code serial_diff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code serial_diff} kind.
	 */
	public SerialDifferencingAggregation serialDiff() {
		return get(Tag.serialDiff);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code significant_terms} kind?
	 */
	public boolean isSignificantTerms() {
		return is(Tag.significantTerms);
	}

	/**
	 * Get the {@code significant_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code significant_terms}
	 *             kind.
	 */
	public SignificantTermsAggregation significantTerms() {
		return get(Tag.significantTerms);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code significant_text} kind?
	 */
	public boolean isSignificantText() {
		return is(Tag.significantText);
	}

	/**
	 * Get the {@code significant_text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code significant_text}
	 *             kind.
	 */
	public SignificantTextAggregation significantText() {
		return get(Tag.significantText);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code stats} kind?
	 */
	public boolean isStats() {
		return is(Tag.stats);
	}

	/**
	 * Get the {@code stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats} kind.
	 */
	public JsonValue stats() {
		return get(Tag.stats);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code stats_bucket} kind?
	 */
	public boolean isStatsBucket() {
		return is(Tag.statsBucket);
	}

	/**
	 * Get the {@code stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats_bucket} kind.
	 */
	public JsonValue statsBucket() {
		return get(Tag.statsBucket);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code string_stats} kind?
	 */
	public boolean isStringStats() {
		return is(Tag.stringStats);
	}

	/**
	 * Get the {@code string_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string_stats} kind.
	 */
	public StringStatsAggregation stringStats() {
		return get(Tag.stringStats);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code sum} kind?
	 */
	public boolean isSum() {
		return is(Tag.sum);
	}

	/**
	 * Get the {@code sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum} kind.
	 */
	public JsonValue sum() {
		return get(Tag.sum);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code sum_bucket} kind?
	 */
	public boolean isSumBucket() {
		return is(Tag.sumBucket);
	}

	/**
	 * Get the {@code sum_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum_bucket} kind.
	 */
	public JsonValue sumBucket() {
		return get(Tag.sumBucket);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code terms} kind?
	 */
	public boolean isTerms() {
		return is(Tag.terms);
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsAggregation terms() {
		return get(Tag.terms);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code top_hits} kind?
	 */
	public boolean isTopHits() {
		return is(Tag.topHits);
	}

	/**
	 * Get the {@code top_hits} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_hits} kind.
	 */
	public TopHitsAggregation topHits() {
		return get(Tag.topHits);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code t_test} kind?
	 */
	public boolean isTTest() {
		return is(Tag.tTest);
	}

	/**
	 * Get the {@code t_test} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code t_test} kind.
	 */
	public TTestAggregation tTest() {
		return get(Tag.tTest);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code top_metrics} kind?
	 */
	public boolean isTopMetrics() {
		return is(Tag.topMetrics);
	}

	/**
	 * Get the {@code top_metrics} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_metrics} kind.
	 */
	public TopMetricsAggregation topMetrics() {
		return get(Tag.topMetrics);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code value_count} kind?
	 */
	public boolean isValueCount() {
		return is(Tag.valueCount);
	}

	/**
	 * Get the {@code value_count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value_count} kind.
	 */
	public JsonValue valueCount() {
		return get(Tag.valueCount);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code weighted_avg} kind?
	 */
	public boolean isWeightedAvg() {
		return is(Tag.weightedAvg);
	}

	/**
	 * Get the {@code weighted_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weighted_avg} kind.
	 */
	public WeightedAverageAggregation weightedAvg() {
		return get(Tag.weightedAvg);
	}

	/**
	 * Is this {@link AggregationContainer} of a {@code variable_width_histogram}
	 * kind?
	 */
	public boolean isVariableWidthHistogram() {
		return is(Tag.variableWidthHistogram);
	}

	/**
	 * Get the {@code variable_width_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code variable_width_histogram} kind.
	 */
	public VariableWidthHistogramAggregation variableWidthHistogram() {
		return get(Tag.variableWidthHistogram);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case aggregations :
					generator.writeStartObject();
					for (Map.Entry<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> item0 : this.<Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer>>get(
							Tag.aggregations).entrySet()) {
						generator.writeKey(item0.getKey());
						item0.getValue().toJsonp(generator, mapper);

					}
					generator.writeEnd();

					break;
				case avg :
					generator.write(this.<JsonValue>get(Tag.avg));

					break;
				case avgBucket :
					generator.write(this.<JsonValue>get(Tag.avgBucket));

					break;
				case cumulativeCardinality :
					generator.write(this.<JsonValue>get(Tag.cumulativeCardinality));

					break;
				case cumulativeSum :
					generator.write(this.<JsonValue>get(Tag.cumulativeSum));

					break;
				case derivative :
					generator.write(this.<JsonValue>get(Tag.derivative));

					break;
				case global :
					generator.write(this.<JsonValue>get(Tag.global));

					break;
				case max :
					generator.write(this.<JsonValue>get(Tag.max));

					break;
				case maxBucket :
					generator.write(this.<JsonValue>get(Tag.maxBucket));

					break;
				case min :
					generator.write(this.<JsonValue>get(Tag.min));

					break;
				case minBucket :
					generator.write(this.<JsonValue>get(Tag.minBucket));

					break;
				case stats :
					generator.write(this.<JsonValue>get(Tag.stats));

					break;
				case statsBucket :
					generator.write(this.<JsonValue>get(Tag.statsBucket));

					break;
				case sum :
					generator.write(this.<JsonValue>get(Tag.sum));

					break;
				case sumBucket :
					generator.write(this.<JsonValue>get(Tag.sumBucket));

					break;
				case valueCount :
					generator.write(this.<JsonValue>get(Tag.valueCount));

					break;
			}
		}

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> item0 : this.aggs
					.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.meta != null) {

			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		@Nullable
		private Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> aggs;

		@Nullable
		private Map<String, JsonValue> meta;

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(
				@Nullable Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key,
				co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer value) {
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
				Function<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer>> fn) {
			return this.aggs(Collections.singletonMap(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder())
							.build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key,
				Function<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer>> fn) {
			return this.putAggs(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder())
							.build());
		}

		/**
		 * API name: {@code meta}
		 */
		public Builder meta(@Nullable Map<String, JsonValue> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonValue value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		public ContainerBuilder adjacencyMatrix(AdjacencyMatrixAggregation v) {
			this.$variant = v;
			this.$tag = Tag.adjacencyMatrix;
			return new ContainerBuilder();
		}

		public ContainerBuilder adjacencyMatrix(
				Function<AdjacencyMatrixAggregation.Builder, ObjectBuilder<AdjacencyMatrixAggregation>> f) {
			return this.adjacencyMatrix(f.apply(new AdjacencyMatrixAggregation.Builder()).build());
		}

		public ContainerBuilder aggregations(
				Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> v) {
			this.$variant = v;
			this.$tag = Tag.aggregations;
			return new ContainerBuilder();
		}

		public ContainerBuilder autoDateHistogram(AutoDateHistogramAggregation v) {
			this.$variant = v;
			this.$tag = Tag.autoDateHistogram;
			return new ContainerBuilder();
		}

		public ContainerBuilder autoDateHistogram(
				Function<AutoDateHistogramAggregation.Builder, ObjectBuilder<AutoDateHistogramAggregation>> f) {
			return this.autoDateHistogram(f.apply(new AutoDateHistogramAggregation.Builder()).build());
		}

		public ContainerBuilder avg(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.avg;
			return new ContainerBuilder();
		}

		public ContainerBuilder avgBucket(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.avgBucket;
			return new ContainerBuilder();
		}

		public ContainerBuilder boxplot(BoxplotAggregation v) {
			this.$variant = v;
			this.$tag = Tag.boxplot;
			return new ContainerBuilder();
		}

		public ContainerBuilder boxplot(Function<BoxplotAggregation.Builder, ObjectBuilder<BoxplotAggregation>> f) {
			return this.boxplot(f.apply(new BoxplotAggregation.Builder()).build());
		}

		public ContainerBuilder bucketScript(BucketScriptAggregation v) {
			this.$variant = v;
			this.$tag = Tag.bucketScript;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketScript(
				Function<BucketScriptAggregation.Builder, ObjectBuilder<BucketScriptAggregation>> f) {
			return this.bucketScript(f.apply(new BucketScriptAggregation.Builder()).build());
		}

		public ContainerBuilder bucketSelector(BucketSelectorAggregation v) {
			this.$variant = v;
			this.$tag = Tag.bucketSelector;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketSelector(
				Function<BucketSelectorAggregation.Builder, ObjectBuilder<BucketSelectorAggregation>> f) {
			return this.bucketSelector(f.apply(new BucketSelectorAggregation.Builder()).build());
		}

		public ContainerBuilder bucketSort(BucketSortAggregation v) {
			this.$variant = v;
			this.$tag = Tag.bucketSort;
			return new ContainerBuilder();
		}

		public ContainerBuilder bucketSort(
				Function<BucketSortAggregation.Builder, ObjectBuilder<BucketSortAggregation>> f) {
			return this.bucketSort(f.apply(new BucketSortAggregation.Builder()).build());
		}

		public ContainerBuilder cardinality(CardinalityAggregation v) {
			this.$variant = v;
			this.$tag = Tag.cardinality;
			return new ContainerBuilder();
		}

		public ContainerBuilder cardinality(
				Function<CardinalityAggregation.Builder, ObjectBuilder<CardinalityAggregation>> f) {
			return this.cardinality(f.apply(new CardinalityAggregation.Builder()).build());
		}

		public ContainerBuilder children(ChildrenAggregation v) {
			this.$variant = v;
			this.$tag = Tag.children;
			return new ContainerBuilder();
		}

		public ContainerBuilder children(Function<ChildrenAggregation.Builder, ObjectBuilder<ChildrenAggregation>> f) {
			return this.children(f.apply(new ChildrenAggregation.Builder()).build());
		}

		public ContainerBuilder composite(CompositeAggregation v) {
			this.$variant = v;
			this.$tag = Tag.composite;
			return new ContainerBuilder();
		}

		public ContainerBuilder composite(
				Function<CompositeAggregation.Builder, ObjectBuilder<CompositeAggregation>> f) {
			return this.composite(f.apply(new CompositeAggregation.Builder()).build());
		}

		public ContainerBuilder cumulativeCardinality(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.cumulativeCardinality;
			return new ContainerBuilder();
		}

		public ContainerBuilder cumulativeSum(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.cumulativeSum;
			return new ContainerBuilder();
		}

		public ContainerBuilder dateHistogram(DateHistogramAggregation v) {
			this.$variant = v;
			this.$tag = Tag.dateHistogram;
			return new ContainerBuilder();
		}

		public ContainerBuilder dateHistogram(
				Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> f) {
			return this.dateHistogram(f.apply(new DateHistogramAggregation.Builder()).build());
		}

		public ContainerBuilder dateRange(DateRangeAggregation v) {
			this.$variant = v;
			this.$tag = Tag.dateRange;
			return new ContainerBuilder();
		}

		public ContainerBuilder dateRange(
				Function<DateRangeAggregation.Builder, ObjectBuilder<DateRangeAggregation>> f) {
			return this.dateRange(f.apply(new DateRangeAggregation.Builder()).build());
		}

		public ContainerBuilder derivative(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.derivative;
			return new ContainerBuilder();
		}

		public ContainerBuilder diversifiedSampler(DiversifiedSamplerAggregation v) {
			this.$variant = v;
			this.$tag = Tag.diversifiedSampler;
			return new ContainerBuilder();
		}

		public ContainerBuilder diversifiedSampler(
				Function<DiversifiedSamplerAggregation.Builder, ObjectBuilder<DiversifiedSamplerAggregation>> f) {
			return this.diversifiedSampler(f.apply(new DiversifiedSamplerAggregation.Builder()).build());
		}

		public ContainerBuilder extendedStats(ExtendedStatsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.extendedStats;
			return new ContainerBuilder();
		}

		public ContainerBuilder extendedStats(
				Function<ExtendedStatsAggregation.Builder, ObjectBuilder<ExtendedStatsAggregation>> f) {
			return this.extendedStats(f.apply(new ExtendedStatsAggregation.Builder()).build());
		}

		public ContainerBuilder extendedStatsBucket(ExtendedStatsBucketAggregation v) {
			this.$variant = v;
			this.$tag = Tag.extendedStatsBucket;
			return new ContainerBuilder();
		}

		public ContainerBuilder extendedStatsBucket(
				Function<ExtendedStatsBucketAggregation.Builder, ObjectBuilder<ExtendedStatsBucketAggregation>> f) {
			return this.extendedStatsBucket(f.apply(new ExtendedStatsBucketAggregation.Builder()).build());
		}

		public ContainerBuilder filter(QueryContainer v) {
			this.$variant = v;
			this.$tag = Tag.filter;
			return new ContainerBuilder();
		}

		public ContainerBuilder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> f) {
			return this.filter(f.apply(new QueryContainer.Builder()).build());
		}

		public ContainerBuilder filters(FiltersAggregation v) {
			this.$variant = v;
			this.$tag = Tag.filters;
			return new ContainerBuilder();
		}

		public ContainerBuilder filters(Function<FiltersAggregation.Builder, ObjectBuilder<FiltersAggregation>> f) {
			return this.filters(f.apply(new FiltersAggregation.Builder()).build());
		}

		public ContainerBuilder geoBounds(GeoBoundsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.geoBounds;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoBounds(
				Function<GeoBoundsAggregation.Builder, ObjectBuilder<GeoBoundsAggregation>> f) {
			return this.geoBounds(f.apply(new GeoBoundsAggregation.Builder()).build());
		}

		public ContainerBuilder geoCentroid(GeoCentroidAggregation v) {
			this.$variant = v;
			this.$tag = Tag.geoCentroid;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoCentroid(
				Function<GeoCentroidAggregation.Builder, ObjectBuilder<GeoCentroidAggregation>> f) {
			return this.geoCentroid(f.apply(new GeoCentroidAggregation.Builder()).build());
		}

		public ContainerBuilder geoDistance(GeoDistanceAggregation v) {
			this.$variant = v;
			this.$tag = Tag.geoDistance;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoDistance(
				Function<GeoDistanceAggregation.Builder, ObjectBuilder<GeoDistanceAggregation>> f) {
			return this.geoDistance(f.apply(new GeoDistanceAggregation.Builder()).build());
		}

		public ContainerBuilder geohashGrid(GeoHashGridAggregation v) {
			this.$variant = v;
			this.$tag = Tag.geohashGrid;
			return new ContainerBuilder();
		}

		public ContainerBuilder geohashGrid(
				Function<GeoHashGridAggregation.Builder, ObjectBuilder<GeoHashGridAggregation>> f) {
			return this.geohashGrid(f.apply(new GeoHashGridAggregation.Builder()).build());
		}

		public ContainerBuilder geoLine(GeoLineAggregation v) {
			this.$variant = v;
			this.$tag = Tag.geoLine;
			return new ContainerBuilder();
		}

		public ContainerBuilder geoLine(Function<GeoLineAggregation.Builder, ObjectBuilder<GeoLineAggregation>> f) {
			return this.geoLine(f.apply(new GeoLineAggregation.Builder()).build());
		}

		public ContainerBuilder geotileGrid(GeoTileGridAggregation v) {
			this.$variant = v;
			this.$tag = Tag.geotileGrid;
			return new ContainerBuilder();
		}

		public ContainerBuilder geotileGrid(
				Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> f) {
			return this.geotileGrid(f.apply(new GeoTileGridAggregation.Builder()).build());
		}

		public ContainerBuilder global(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.global;
			return new ContainerBuilder();
		}

		public ContainerBuilder histogram(HistogramAggregation v) {
			this.$variant = v;
			this.$tag = Tag.histogram;
			return new ContainerBuilder();
		}

		public ContainerBuilder histogram(
				Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> f) {
			return this.histogram(f.apply(new HistogramAggregation.Builder()).build());
		}

		public ContainerBuilder ipRange(IpRangeAggregation v) {
			this.$variant = v;
			this.$tag = Tag.ipRange;
			return new ContainerBuilder();
		}

		public ContainerBuilder ipRange(Function<IpRangeAggregation.Builder, ObjectBuilder<IpRangeAggregation>> f) {
			return this.ipRange(f.apply(new IpRangeAggregation.Builder()).build());
		}

		public ContainerBuilder inference(InferenceAggregation v) {
			this.$variant = v;
			this.$tag = Tag.inference;
			return new ContainerBuilder();
		}

		public ContainerBuilder inference(
				Function<InferenceAggregation.Builder, ObjectBuilder<InferenceAggregation>> f) {
			return this.inference(f.apply(new InferenceAggregation.Builder()).build());
		}

		public ContainerBuilder line(GeoLineAggregation v) {
			this.$variant = v;
			this.$tag = Tag.line;
			return new ContainerBuilder();
		}

		public ContainerBuilder line(Function<GeoLineAggregation.Builder, ObjectBuilder<GeoLineAggregation>> f) {
			return this.line(f.apply(new GeoLineAggregation.Builder()).build());
		}

		public ContainerBuilder matrixStats(MatrixStatsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.matrixStats;
			return new ContainerBuilder();
		}

		public ContainerBuilder matrixStats(
				Function<MatrixStatsAggregation.Builder, ObjectBuilder<MatrixStatsAggregation>> f) {
			return this.matrixStats(f.apply(new MatrixStatsAggregation.Builder()).build());
		}

		public ContainerBuilder max(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.max;
			return new ContainerBuilder();
		}

		public ContainerBuilder maxBucket(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.maxBucket;
			return new ContainerBuilder();
		}

		public ContainerBuilder medianAbsoluteDeviation(MedianAbsoluteDeviationAggregation v) {
			this.$variant = v;
			this.$tag = Tag.medianAbsoluteDeviation;
			return new ContainerBuilder();
		}

		public ContainerBuilder medianAbsoluteDeviation(
				Function<MedianAbsoluteDeviationAggregation.Builder, ObjectBuilder<MedianAbsoluteDeviationAggregation>> f) {
			return this.medianAbsoluteDeviation(f.apply(new MedianAbsoluteDeviationAggregation.Builder()).build());
		}

		public ContainerBuilder min(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.min;
			return new ContainerBuilder();
		}

		public ContainerBuilder minBucket(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.minBucket;
			return new ContainerBuilder();
		}

		public ContainerBuilder missing(MissingAggregation v) {
			this.$variant = v;
			this.$tag = Tag.missing;
			return new ContainerBuilder();
		}

		public ContainerBuilder missing(Function<MissingAggregation.Builder, ObjectBuilder<MissingAggregation>> f) {
			return this.missing(f.apply(new MissingAggregation.Builder()).build());
		}

		public ContainerBuilder movingAvg(MovingAverageAggregation v) {
			this.$variant = v;
			this.$tag = Tag.movingAvg;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingAvg(
				Function<MovingAverageAggregation.Builder, ObjectBuilder<MovingAverageAggregation>> f) {
			return this.movingAvg(f.apply(new MovingAverageAggregation.Builder()).build());
		}

		public ContainerBuilder movingPercentiles(MovingPercentilesAggregation v) {
			this.$variant = v;
			this.$tag = Tag.movingPercentiles;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingPercentiles(
				Function<MovingPercentilesAggregation.Builder, ObjectBuilder<MovingPercentilesAggregation>> f) {
			return this.movingPercentiles(f.apply(new MovingPercentilesAggregation.Builder()).build());
		}

		public ContainerBuilder movingFn(MovingFunctionAggregation v) {
			this.$variant = v;
			this.$tag = Tag.movingFn;
			return new ContainerBuilder();
		}

		public ContainerBuilder movingFn(
				Function<MovingFunctionAggregation.Builder, ObjectBuilder<MovingFunctionAggregation>> f) {
			return this.movingFn(f.apply(new MovingFunctionAggregation.Builder()).build());
		}

		public ContainerBuilder multiTerms(MultiTermsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.multiTerms;
			return new ContainerBuilder();
		}

		public ContainerBuilder multiTerms(
				Function<MultiTermsAggregation.Builder, ObjectBuilder<MultiTermsAggregation>> f) {
			return this.multiTerms(f.apply(new MultiTermsAggregation.Builder()).build());
		}

		public ContainerBuilder nested(NestedAggregation v) {
			this.$variant = v;
			this.$tag = Tag.nested;
			return new ContainerBuilder();
		}

		public ContainerBuilder nested(Function<NestedAggregation.Builder, ObjectBuilder<NestedAggregation>> f) {
			return this.nested(f.apply(new NestedAggregation.Builder()).build());
		}

		public ContainerBuilder normalize(NormalizeAggregation v) {
			this.$variant = v;
			this.$tag = Tag.normalize;
			return new ContainerBuilder();
		}

		public ContainerBuilder normalize(
				Function<NormalizeAggregation.Builder, ObjectBuilder<NormalizeAggregation>> f) {
			return this.normalize(f.apply(new NormalizeAggregation.Builder()).build());
		}

		public ContainerBuilder parent(ParentAggregation v) {
			this.$variant = v;
			this.$tag = Tag.parent;
			return new ContainerBuilder();
		}

		public ContainerBuilder parent(Function<ParentAggregation.Builder, ObjectBuilder<ParentAggregation>> f) {
			return this.parent(f.apply(new ParentAggregation.Builder()).build());
		}

		public ContainerBuilder percentileRanks(PercentileRanksAggregation v) {
			this.$variant = v;
			this.$tag = Tag.percentileRanks;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentileRanks(
				Function<PercentileRanksAggregation.Builder, ObjectBuilder<PercentileRanksAggregation>> f) {
			return this.percentileRanks(f.apply(new PercentileRanksAggregation.Builder()).build());
		}

		public ContainerBuilder percentiles(PercentilesAggregation v) {
			this.$variant = v;
			this.$tag = Tag.percentiles;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentiles(
				Function<PercentilesAggregation.Builder, ObjectBuilder<PercentilesAggregation>> f) {
			return this.percentiles(f.apply(new PercentilesAggregation.Builder()).build());
		}

		public ContainerBuilder percentilesBucket(PercentilesBucketAggregation v) {
			this.$variant = v;
			this.$tag = Tag.percentilesBucket;
			return new ContainerBuilder();
		}

		public ContainerBuilder percentilesBucket(
				Function<PercentilesBucketAggregation.Builder, ObjectBuilder<PercentilesBucketAggregation>> f) {
			return this.percentilesBucket(f.apply(new PercentilesBucketAggregation.Builder()).build());
		}

		public ContainerBuilder range(RangeAggregation v) {
			this.$variant = v;
			this.$tag = Tag.range;
			return new ContainerBuilder();
		}

		public ContainerBuilder range(Function<RangeAggregation.Builder, ObjectBuilder<RangeAggregation>> f) {
			return this.range(f.apply(new RangeAggregation.Builder()).build());
		}

		public ContainerBuilder rareTerms(RareTermsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.rareTerms;
			return new ContainerBuilder();
		}

		public ContainerBuilder rareTerms(
				Function<RareTermsAggregation.Builder, ObjectBuilder<RareTermsAggregation>> f) {
			return this.rareTerms(f.apply(new RareTermsAggregation.Builder()).build());
		}

		public ContainerBuilder rate(RateAggregation v) {
			this.$variant = v;
			this.$tag = Tag.rate;
			return new ContainerBuilder();
		}

		public ContainerBuilder rate(Function<RateAggregation.Builder, ObjectBuilder<RateAggregation>> f) {
			return this.rate(f.apply(new RateAggregation.Builder()).build());
		}

		public ContainerBuilder reverseNested(ReverseNestedAggregation v) {
			this.$variant = v;
			this.$tag = Tag.reverseNested;
			return new ContainerBuilder();
		}

		public ContainerBuilder reverseNested(
				Function<ReverseNestedAggregation.Builder, ObjectBuilder<ReverseNestedAggregation>> f) {
			return this.reverseNested(f.apply(new ReverseNestedAggregation.Builder()).build());
		}

		public ContainerBuilder sampler(SamplerAggregation v) {
			this.$variant = v;
			this.$tag = Tag.sampler;
			return new ContainerBuilder();
		}

		public ContainerBuilder sampler(Function<SamplerAggregation.Builder, ObjectBuilder<SamplerAggregation>> f) {
			return this.sampler(f.apply(new SamplerAggregation.Builder()).build());
		}

		public ContainerBuilder scriptedMetric(ScriptedMetricAggregation v) {
			this.$variant = v;
			this.$tag = Tag.scriptedMetric;
			return new ContainerBuilder();
		}

		public ContainerBuilder scriptedMetric(
				Function<ScriptedMetricAggregation.Builder, ObjectBuilder<ScriptedMetricAggregation>> f) {
			return this.scriptedMetric(f.apply(new ScriptedMetricAggregation.Builder()).build());
		}

		public ContainerBuilder serialDiff(SerialDifferencingAggregation v) {
			this.$variant = v;
			this.$tag = Tag.serialDiff;
			return new ContainerBuilder();
		}

		public ContainerBuilder serialDiff(
				Function<SerialDifferencingAggregation.Builder, ObjectBuilder<SerialDifferencingAggregation>> f) {
			return this.serialDiff(f.apply(new SerialDifferencingAggregation.Builder()).build());
		}

		public ContainerBuilder significantTerms(SignificantTermsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.significantTerms;
			return new ContainerBuilder();
		}

		public ContainerBuilder significantTerms(
				Function<SignificantTermsAggregation.Builder, ObjectBuilder<SignificantTermsAggregation>> f) {
			return this.significantTerms(f.apply(new SignificantTermsAggregation.Builder()).build());
		}

		public ContainerBuilder significantText(SignificantTextAggregation v) {
			this.$variant = v;
			this.$tag = Tag.significantText;
			return new ContainerBuilder();
		}

		public ContainerBuilder significantText(
				Function<SignificantTextAggregation.Builder, ObjectBuilder<SignificantTextAggregation>> f) {
			return this.significantText(f.apply(new SignificantTextAggregation.Builder()).build());
		}

		public ContainerBuilder stats(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.stats;
			return new ContainerBuilder();
		}

		public ContainerBuilder statsBucket(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.statsBucket;
			return new ContainerBuilder();
		}

		public ContainerBuilder stringStats(StringStatsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.stringStats;
			return new ContainerBuilder();
		}

		public ContainerBuilder stringStats(
				Function<StringStatsAggregation.Builder, ObjectBuilder<StringStatsAggregation>> f) {
			return this.stringStats(f.apply(new StringStatsAggregation.Builder()).build());
		}

		public ContainerBuilder sum(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.sum;
			return new ContainerBuilder();
		}

		public ContainerBuilder sumBucket(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.sumBucket;
			return new ContainerBuilder();
		}

		public ContainerBuilder terms(TermsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.terms;
			return new ContainerBuilder();
		}

		public ContainerBuilder terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> f) {
			return this.terms(f.apply(new TermsAggregation.Builder()).build());
		}

		public ContainerBuilder topHits(TopHitsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.topHits;
			return new ContainerBuilder();
		}

		public ContainerBuilder topHits(Function<TopHitsAggregation.Builder, ObjectBuilder<TopHitsAggregation>> f) {
			return this.topHits(f.apply(new TopHitsAggregation.Builder()).build());
		}

		public ContainerBuilder tTest(TTestAggregation v) {
			this.$variant = v;
			this.$tag = Tag.tTest;
			return new ContainerBuilder();
		}

		public ContainerBuilder tTest(Function<TTestAggregation.Builder, ObjectBuilder<TTestAggregation>> f) {
			return this.tTest(f.apply(new TTestAggregation.Builder()).build());
		}

		public ContainerBuilder topMetrics(TopMetricsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.topMetrics;
			return new ContainerBuilder();
		}

		public ContainerBuilder topMetrics(
				Function<TopMetricsAggregation.Builder, ObjectBuilder<TopMetricsAggregation>> f) {
			return this.topMetrics(f.apply(new TopMetricsAggregation.Builder()).build());
		}

		public ContainerBuilder valueCount(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.valueCount;
			return new ContainerBuilder();
		}

		public ContainerBuilder weightedAvg(WeightedAverageAggregation v) {
			this.$variant = v;
			this.$tag = Tag.weightedAvg;
			return new ContainerBuilder();
		}

		public ContainerBuilder weightedAvg(
				Function<WeightedAverageAggregation.Builder, ObjectBuilder<WeightedAverageAggregation>> f) {
			return this.weightedAvg(f.apply(new WeightedAverageAggregation.Builder()).build());
		}

		public ContainerBuilder variableWidthHistogram(VariableWidthHistogramAggregation v) {
			this.$variant = v;
			this.$tag = Tag.variableWidthHistogram;
			return new ContainerBuilder();
		}

		public ContainerBuilder variableWidthHistogram(
				Function<VariableWidthHistogramAggregation.Builder, ObjectBuilder<VariableWidthHistogramAggregation>> f) {
			return this.variableWidthHistogram(f.apply(new VariableWidthHistogramAggregation.Builder()).build());
		}

		protected AggregationContainer build() {
			return new AggregationContainer(this);
		}

		public class ContainerBuilder implements ObjectBuilder<AggregationContainer> {

			/**
			 * API name: {@code aggs}
			 */
			public ContainerBuilder aggs(
					@Nullable Map<String, co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer> value) {
				Builder.this.aggs = value;
				return this;
			}

			/**
			 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
			 */
			public ContainerBuilder putAggs(String key,
					co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer value) {
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
					Function<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer>> fn) {
				return this.aggs(Collections.singletonMap(key,
						fn.apply(
								new co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder())
								.build()));
			}

			/**
			 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
			 */
			public ContainerBuilder putAggs(String key,
					Function<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer>> fn) {
				return this.putAggs(key,
						fn.apply(
								new co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.Builder())
								.build());
			}

			/**
			 * API name: {@code meta}
			 */
			public ContainerBuilder meta(@Nullable Map<String, JsonValue> value) {
				Builder.this.meta = value;
				return this;
			}

			/**
			 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
			 */
			public ContainerBuilder putMeta(String key, JsonValue value) {
				if (Builder.this.meta == null) {
					Builder.this.meta = new HashMap<>();
				}
				Builder.this.meta.put(key, value);
				return this;
			}

			public AggregationContainer build() {
				return Builder.this.build();
			}
		}
	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<AggregationContainer> DESERIALIZER = JsonpDeserializer
			.lazy(AggregationContainer::buildDeserializer);

	private static JsonpDeserializer<AggregationContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::aggs,
				JsonpDeserializer.stringMapDeserializer(
						co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.DESERIALIZER),
				"aggs");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"meta");
		op.add(Builder::adjacencyMatrix, AdjacencyMatrixAggregation.DESERIALIZER, "adjacency_matrix");
		op.add(Builder::aggregations,
				JsonpDeserializer.stringMapDeserializer(
						co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer.DESERIALIZER),
				"aggregations");
		op.add(Builder::autoDateHistogram, AutoDateHistogramAggregation.DESERIALIZER, "auto_date_histogram");
		op.add(Builder::avg, JsonpDeserializer.jsonValueDeserializer(), "avg");
		op.add(Builder::avgBucket, JsonpDeserializer.jsonValueDeserializer(), "avg_bucket");
		op.add(Builder::boxplot, BoxplotAggregation.DESERIALIZER, "boxplot");
		op.add(Builder::bucketScript, BucketScriptAggregation.DESERIALIZER, "bucket_script");
		op.add(Builder::bucketSelector, BucketSelectorAggregation.DESERIALIZER, "bucket_selector");
		op.add(Builder::bucketSort, BucketSortAggregation.DESERIALIZER, "bucket_sort");
		op.add(Builder::cardinality, CardinalityAggregation.DESERIALIZER, "cardinality");
		op.add(Builder::children, ChildrenAggregation.DESERIALIZER, "children");
		op.add(Builder::composite, CompositeAggregation.DESERIALIZER, "composite");
		op.add(Builder::cumulativeCardinality, JsonpDeserializer.jsonValueDeserializer(), "cumulative_cardinality");
		op.add(Builder::cumulativeSum, JsonpDeserializer.jsonValueDeserializer(), "cumulative_sum");
		op.add(Builder::dateHistogram, DateHistogramAggregation.DESERIALIZER, "date_histogram");
		op.add(Builder::dateRange, DateRangeAggregation.DESERIALIZER, "date_range");
		op.add(Builder::derivative, JsonpDeserializer.jsonValueDeserializer(), "derivative");
		op.add(Builder::diversifiedSampler, DiversifiedSamplerAggregation.DESERIALIZER, "diversified_sampler");
		op.add(Builder::extendedStats, ExtendedStatsAggregation.DESERIALIZER, "extended_stats");
		op.add(Builder::extendedStatsBucket, ExtendedStatsBucketAggregation.DESERIALIZER, "extended_stats_bucket");
		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");
		op.add(Builder::filters, FiltersAggregation.DESERIALIZER, "filters");
		op.add(Builder::geoBounds, GeoBoundsAggregation.DESERIALIZER, "geo_bounds");
		op.add(Builder::geoCentroid, GeoCentroidAggregation.DESERIALIZER, "geo_centroid");
		op.add(Builder::geoDistance, GeoDistanceAggregation.DESERIALIZER, "geo_distance");
		op.add(Builder::geohashGrid, GeoHashGridAggregation.DESERIALIZER, "geohash_grid");
		op.add(Builder::geoLine, GeoLineAggregation.DESERIALIZER, "geo_line");
		op.add(Builder::geotileGrid, GeoTileGridAggregation.DESERIALIZER, "geotile_grid");
		op.add(Builder::global, JsonpDeserializer.jsonValueDeserializer(), "global");
		op.add(Builder::histogram, HistogramAggregation.DESERIALIZER, "histogram");
		op.add(Builder::ipRange, IpRangeAggregation.DESERIALIZER, "ip_range");
		op.add(Builder::inference, InferenceAggregation.DESERIALIZER, "inference");
		op.add(Builder::line, GeoLineAggregation.DESERIALIZER, "line");
		op.add(Builder::matrixStats, MatrixStatsAggregation.DESERIALIZER, "matrix_stats");
		op.add(Builder::max, JsonpDeserializer.jsonValueDeserializer(), "max");
		op.add(Builder::maxBucket, JsonpDeserializer.jsonValueDeserializer(), "max_bucket");
		op.add(Builder::medianAbsoluteDeviation, MedianAbsoluteDeviationAggregation.DESERIALIZER,
				"median_absolute_deviation");
		op.add(Builder::min, JsonpDeserializer.jsonValueDeserializer(), "min");
		op.add(Builder::minBucket, JsonpDeserializer.jsonValueDeserializer(), "min_bucket");
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
		op.add(Builder::stats, JsonpDeserializer.jsonValueDeserializer(), "stats");
		op.add(Builder::statsBucket, JsonpDeserializer.jsonValueDeserializer(), "stats_bucket");
		op.add(Builder::stringStats, StringStatsAggregation.DESERIALIZER, "string_stats");
		op.add(Builder::sum, JsonpDeserializer.jsonValueDeserializer(), "sum");
		op.add(Builder::sumBucket, JsonpDeserializer.jsonValueDeserializer(), "sum_bucket");
		op.add(Builder::terms, TermsAggregation.DESERIALIZER, "terms");
		op.add(Builder::topHits, TopHitsAggregation.DESERIALIZER, "top_hits");
		op.add(Builder::tTest, TTestAggregation.DESERIALIZER, "t_test");
		op.add(Builder::topMetrics, TopMetricsAggregation.DESERIALIZER, "top_metrics");
		op.add(Builder::valueCount, JsonpDeserializer.jsonValueDeserializer(), "value_count");
		op.add(Builder::weightedAvg, WeightedAverageAggregation.DESERIALIZER, "weighted_avg");
		op.add(Builder::variableWidthHistogram, VariableWidthHistogramAggregation.DESERIALIZER,
				"variable_width_histogram");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
