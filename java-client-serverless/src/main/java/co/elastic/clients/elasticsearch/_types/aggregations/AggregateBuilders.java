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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Aggregate} variants.
 */
public class AggregateBuilders {
	private AggregateBuilders() {
	}

	/**
	 * Creates a builder for the {@link AdjacencyMatrixAggregate adjacency_matrix}
	 * {@code Aggregate} variant.
	 */
	public static AdjacencyMatrixAggregate.Builder adjacencyMatrix() {
		return new AdjacencyMatrixAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link AdjacencyMatrixAggregate adjacency_matrix}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate adjacencyMatrix(
			Function<AdjacencyMatrixAggregate.Builder, ObjectBuilder<AdjacencyMatrixAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.adjacencyMatrix(fn.apply(new AdjacencyMatrixAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link AutoDateHistogramAggregate
	 * auto_date_histogram} {@code Aggregate} variant.
	 */
	public static AutoDateHistogramAggregate.Builder autoDateHistogram() {
		return new AutoDateHistogramAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link AutoDateHistogramAggregate
	 * auto_date_histogram} {@code Aggregate} variant.
	 */
	public static Aggregate autoDateHistogram(
			Function<AutoDateHistogramAggregate.Builder, ObjectBuilder<AutoDateHistogramAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.autoDateHistogram(fn.apply(new AutoDateHistogramAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link AvgAggregate avg} {@code Aggregate} variant.
	 */
	public static AvgAggregate.Builder avg() {
		return new AvgAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link AvgAggregate avg} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate avg(Function<AvgAggregate.Builder, ObjectBuilder<AvgAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.avg(fn.apply(new AvgAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BoxPlotAggregate box_plot} {@code Aggregate}
	 * variant.
	 */
	public static BoxPlotAggregate.Builder boxPlot() {
		return new BoxPlotAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link BoxPlotAggregate box_plot}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate boxPlot(Function<BoxPlotAggregate.Builder, ObjectBuilder<BoxPlotAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.boxPlot(fn.apply(new BoxPlotAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BucketMetricValueAggregate
	 * bucket_metric_value} {@code Aggregate} variant.
	 */
	public static BucketMetricValueAggregate.Builder bucketMetricValue() {
		return new BucketMetricValueAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link BucketMetricValueAggregate
	 * bucket_metric_value} {@code Aggregate} variant.
	 */
	public static Aggregate bucketMetricValue(
			Function<BucketMetricValueAggregate.Builder, ObjectBuilder<BucketMetricValueAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.bucketMetricValue(fn.apply(new BucketMetricValueAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CardinalityAggregate cardinality}
	 * {@code Aggregate} variant.
	 */
	public static CardinalityAggregate.Builder cardinality() {
		return new CardinalityAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link CardinalityAggregate cardinality}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate cardinality(
			Function<CardinalityAggregate.Builder, ObjectBuilder<CardinalityAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.cardinality(fn.apply(new CardinalityAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ChildrenAggregate children}
	 * {@code Aggregate} variant.
	 */
	public static ChildrenAggregate.Builder children() {
		return new ChildrenAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link ChildrenAggregate children}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate children(Function<ChildrenAggregate.Builder, ObjectBuilder<ChildrenAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.children(fn.apply(new ChildrenAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompositeAggregate composite}
	 * {@code Aggregate} variant.
	 */
	public static CompositeAggregate.Builder composite() {
		return new CompositeAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link CompositeAggregate composite}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate composite(Function<CompositeAggregate.Builder, ObjectBuilder<CompositeAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.composite(fn.apply(new CompositeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CumulativeCardinalityAggregate
	 * simple_long_value} {@code Aggregate} variant.
	 */
	public static CumulativeCardinalityAggregate.Builder simpleLongValue() {
		return new CumulativeCardinalityAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link CumulativeCardinalityAggregate
	 * simple_long_value} {@code Aggregate} variant.
	 */
	public static Aggregate simpleLongValue(
			Function<CumulativeCardinalityAggregate.Builder, ObjectBuilder<CumulativeCardinalityAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.simpleLongValue(fn.apply(new CumulativeCardinalityAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateHistogramAggregate date_histogram}
	 * {@code Aggregate} variant.
	 */
	public static DateHistogramAggregate.Builder dateHistogram() {
		return new DateHistogramAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link DateHistogramAggregate date_histogram}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate dateHistogram(
			Function<DateHistogramAggregate.Builder, ObjectBuilder<DateHistogramAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.dateHistogram(fn.apply(new DateHistogramAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateRangeAggregate date_range}
	 * {@code Aggregate} variant.
	 */
	public static DateRangeAggregate.Builder dateRange() {
		return new DateRangeAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link DateRangeAggregate date_range}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate dateRange(Function<DateRangeAggregate.Builder, ObjectBuilder<DateRangeAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.dateRange(fn.apply(new DateRangeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DerivativeAggregate derivative}
	 * {@code Aggregate} variant.
	 */
	public static DerivativeAggregate.Builder derivative() {
		return new DerivativeAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link DerivativeAggregate derivative}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate derivative(Function<DerivativeAggregate.Builder, ObjectBuilder<DerivativeAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.derivative(fn.apply(new DerivativeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DoubleTermsAggregate dterms}
	 * {@code Aggregate} variant.
	 */
	public static DoubleTermsAggregate.Builder dterms() {
		return new DoubleTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link DoubleTermsAggregate dterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate dterms(Function<DoubleTermsAggregate.Builder, ObjectBuilder<DoubleTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.dterms(fn.apply(new DoubleTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExtendedStatsAggregate extended_stats}
	 * {@code Aggregate} variant.
	 */
	public static ExtendedStatsAggregate.Builder extendedStats() {
		return new ExtendedStatsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link ExtendedStatsAggregate extended_stats}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate extendedStats(
			Function<ExtendedStatsAggregate.Builder, ObjectBuilder<ExtendedStatsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.extendedStats(fn.apply(new ExtendedStatsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExtendedStatsBucketAggregate
	 * extended_stats_bucket} {@code Aggregate} variant.
	 */
	public static ExtendedStatsBucketAggregate.Builder extendedStatsBucket() {
		return new ExtendedStatsBucketAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link ExtendedStatsBucketAggregate
	 * extended_stats_bucket} {@code Aggregate} variant.
	 */
	public static Aggregate extendedStatsBucket(
			Function<ExtendedStatsBucketAggregate.Builder, ObjectBuilder<ExtendedStatsBucketAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.extendedStatsBucket(fn.apply(new ExtendedStatsBucketAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FilterAggregate filter} {@code Aggregate}
	 * variant.
	 */
	public static FilterAggregate.Builder filter() {
		return new FilterAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link FilterAggregate filter} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate filter(Function<FilterAggregate.Builder, ObjectBuilder<FilterAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.filter(fn.apply(new FilterAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FiltersAggregate filters} {@code Aggregate}
	 * variant.
	 */
	public static FiltersAggregate.Builder filters() {
		return new FiltersAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link FiltersAggregate filters} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate filters(Function<FiltersAggregate.Builder, ObjectBuilder<FiltersAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.filters(fn.apply(new FiltersAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FrequentItemSetsAggregate
	 * frequent_item_sets} {@code Aggregate} variant.
	 */
	public static FrequentItemSetsAggregate.Builder frequentItemSets() {
		return new FrequentItemSetsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link FrequentItemSetsAggregate
	 * frequent_item_sets} {@code Aggregate} variant.
	 */
	public static Aggregate frequentItemSets(
			Function<FrequentItemSetsAggregate.Builder, ObjectBuilder<FrequentItemSetsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.frequentItemSets(fn.apply(new FrequentItemSetsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoBoundsAggregate geo_bounds}
	 * {@code Aggregate} variant.
	 */
	public static GeoBoundsAggregate.Builder geoBounds() {
		return new GeoBoundsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GeoBoundsAggregate geo_bounds}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate geoBounds(Function<GeoBoundsAggregate.Builder, ObjectBuilder<GeoBoundsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.geoBounds(fn.apply(new GeoBoundsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoCentroidAggregate geo_centroid}
	 * {@code Aggregate} variant.
	 */
	public static GeoCentroidAggregate.Builder geoCentroid() {
		return new GeoCentroidAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GeoCentroidAggregate geo_centroid}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate geoCentroid(
			Function<GeoCentroidAggregate.Builder, ObjectBuilder<GeoCentroidAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.geoCentroid(fn.apply(new GeoCentroidAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoDistanceAggregate geo_distance}
	 * {@code Aggregate} variant.
	 */
	public static GeoDistanceAggregate.Builder geoDistance() {
		return new GeoDistanceAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GeoDistanceAggregate geo_distance}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate geoDistance(
			Function<GeoDistanceAggregate.Builder, ObjectBuilder<GeoDistanceAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.geoDistance(fn.apply(new GeoDistanceAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoHashGridAggregate geohash_grid}
	 * {@code Aggregate} variant.
	 */
	public static GeoHashGridAggregate.Builder geohashGrid() {
		return new GeoHashGridAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GeoHashGridAggregate geohash_grid}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate geohashGrid(
			Function<GeoHashGridAggregate.Builder, ObjectBuilder<GeoHashGridAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.geohashGrid(fn.apply(new GeoHashGridAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoHexGridAggregate geohex_grid}
	 * {@code Aggregate} variant.
	 */
	public static GeoHexGridAggregate.Builder geohexGrid() {
		return new GeoHexGridAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GeoHexGridAggregate geohex_grid}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate geohexGrid(Function<GeoHexGridAggregate.Builder, ObjectBuilder<GeoHexGridAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.geohexGrid(fn.apply(new GeoHexGridAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoLineAggregate geo_line} {@code Aggregate}
	 * variant.
	 */
	public static GeoLineAggregate.Builder geoLine() {
		return new GeoLineAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GeoLineAggregate geo_line}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate geoLine(Function<GeoLineAggregate.Builder, ObjectBuilder<GeoLineAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.geoLine(fn.apply(new GeoLineAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoTileGridAggregate geotile_grid}
	 * {@code Aggregate} variant.
	 */
	public static GeoTileGridAggregate.Builder geotileGrid() {
		return new GeoTileGridAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GeoTileGridAggregate geotile_grid}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate geotileGrid(
			Function<GeoTileGridAggregate.Builder, ObjectBuilder<GeoTileGridAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.geotileGrid(fn.apply(new GeoTileGridAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GlobalAggregate global} {@code Aggregate}
	 * variant.
	 */
	public static GlobalAggregate.Builder global() {
		return new GlobalAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link GlobalAggregate global} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate global(Function<GlobalAggregate.Builder, ObjectBuilder<GlobalAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.global(fn.apply(new GlobalAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HdrPercentileRanksAggregate
	 * hdr_percentile_ranks} {@code Aggregate} variant.
	 */
	public static HdrPercentileRanksAggregate.Builder hdrPercentileRanks() {
		return new HdrPercentileRanksAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link HdrPercentileRanksAggregate
	 * hdr_percentile_ranks} {@code Aggregate} variant.
	 */
	public static Aggregate hdrPercentileRanks(
			Function<HdrPercentileRanksAggregate.Builder, ObjectBuilder<HdrPercentileRanksAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.hdrPercentileRanks(fn.apply(new HdrPercentileRanksAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HdrPercentilesAggregate hdr_percentiles}
	 * {@code Aggregate} variant.
	 */
	public static HdrPercentilesAggregate.Builder hdrPercentiles() {
		return new HdrPercentilesAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link HdrPercentilesAggregate hdr_percentiles}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate hdrPercentiles(
			Function<HdrPercentilesAggregate.Builder, ObjectBuilder<HdrPercentilesAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.hdrPercentiles(fn.apply(new HdrPercentilesAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HistogramAggregate histogram}
	 * {@code Aggregate} variant.
	 */
	public static HistogramAggregate.Builder histogram() {
		return new HistogramAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link HistogramAggregate histogram}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate histogram(Function<HistogramAggregate.Builder, ObjectBuilder<HistogramAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.histogram(fn.apply(new HistogramAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link InferenceAggregate inference}
	 * {@code Aggregate} variant.
	 */
	public static InferenceAggregate.Builder inference() {
		return new InferenceAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link InferenceAggregate inference}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate inference(Function<InferenceAggregate.Builder, ObjectBuilder<InferenceAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.inference(fn.apply(new InferenceAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IpPrefixAggregate ip_prefix}
	 * {@code Aggregate} variant.
	 */
	public static IpPrefixAggregate.Builder ipPrefix() {
		return new IpPrefixAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link IpPrefixAggregate ip_prefix}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate ipPrefix(Function<IpPrefixAggregate.Builder, ObjectBuilder<IpPrefixAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.ipPrefix(fn.apply(new IpPrefixAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IpRangeAggregate ip_range} {@code Aggregate}
	 * variant.
	 */
	public static IpRangeAggregate.Builder ipRange() {
		return new IpRangeAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link IpRangeAggregate ip_range}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate ipRange(Function<IpRangeAggregate.Builder, ObjectBuilder<IpRangeAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.ipRange(fn.apply(new IpRangeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LongRareTermsAggregate lrareterms}
	 * {@code Aggregate} variant.
	 */
	public static LongRareTermsAggregate.Builder lrareterms() {
		return new LongRareTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link LongRareTermsAggregate lrareterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate lrareterms(
			Function<LongRareTermsAggregate.Builder, ObjectBuilder<LongRareTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.lrareterms(fn.apply(new LongRareTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LongTermsAggregate lterms} {@code Aggregate}
	 * variant.
	 */
	public static LongTermsAggregate.Builder lterms() {
		return new LongTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link LongTermsAggregate lterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate lterms(Function<LongTermsAggregate.Builder, ObjectBuilder<LongTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.lterms(fn.apply(new LongTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatrixStatsAggregate matrix_stats}
	 * {@code Aggregate} variant.
	 */
	public static MatrixStatsAggregate.Builder matrixStats() {
		return new MatrixStatsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link MatrixStatsAggregate matrix_stats}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate matrixStats(
			Function<MatrixStatsAggregate.Builder, ObjectBuilder<MatrixStatsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.matrixStats(fn.apply(new MatrixStatsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MaxAggregate max} {@code Aggregate} variant.
	 */
	public static MaxAggregate.Builder max() {
		return new MaxAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link MaxAggregate max} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate max(Function<MaxAggregate.Builder, ObjectBuilder<MaxAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.max(fn.apply(new MaxAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MedianAbsoluteDeviationAggregate
	 * median_absolute_deviation} {@code Aggregate} variant.
	 */
	public static MedianAbsoluteDeviationAggregate.Builder medianAbsoluteDeviation() {
		return new MedianAbsoluteDeviationAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link MedianAbsoluteDeviationAggregate
	 * median_absolute_deviation} {@code Aggregate} variant.
	 */
	public static Aggregate medianAbsoluteDeviation(
			Function<MedianAbsoluteDeviationAggregate.Builder, ObjectBuilder<MedianAbsoluteDeviationAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.medianAbsoluteDeviation(fn.apply(new MedianAbsoluteDeviationAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MinAggregate min} {@code Aggregate} variant.
	 */
	public static MinAggregate.Builder min() {
		return new MinAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link MinAggregate min} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate min(Function<MinAggregate.Builder, ObjectBuilder<MinAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.min(fn.apply(new MinAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MissingAggregate missing} {@code Aggregate}
	 * variant.
	 */
	public static MissingAggregate.Builder missing() {
		return new MissingAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link MissingAggregate missing} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate missing(Function<MissingAggregate.Builder, ObjectBuilder<MissingAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.missing(fn.apply(new MissingAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MultiTermsAggregate multi_terms}
	 * {@code Aggregate} variant.
	 */
	public static MultiTermsAggregate.Builder multiTerms() {
		return new MultiTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link MultiTermsAggregate multi_terms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate multiTerms(Function<MultiTermsAggregate.Builder, ObjectBuilder<MultiTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.multiTerms(fn.apply(new MultiTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NestedAggregate nested} {@code Aggregate}
	 * variant.
	 */
	public static NestedAggregate.Builder nested() {
		return new NestedAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link NestedAggregate nested} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate nested(Function<NestedAggregate.Builder, ObjectBuilder<NestedAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.nested(fn.apply(new NestedAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ParentAggregate parent} {@code Aggregate}
	 * variant.
	 */
	public static ParentAggregate.Builder parent() {
		return new ParentAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link ParentAggregate parent} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate parent(Function<ParentAggregate.Builder, ObjectBuilder<ParentAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.parent(fn.apply(new ParentAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PercentilesBucketAggregate
	 * percentiles_bucket} {@code Aggregate} variant.
	 */
	public static PercentilesBucketAggregate.Builder percentilesBucket() {
		return new PercentilesBucketAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link PercentilesBucketAggregate
	 * percentiles_bucket} {@code Aggregate} variant.
	 */
	public static Aggregate percentilesBucket(
			Function<PercentilesBucketAggregate.Builder, ObjectBuilder<PercentilesBucketAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.percentilesBucket(fn.apply(new PercentilesBucketAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeAggregate range} {@code Aggregate}
	 * variant.
	 */
	public static RangeAggregate.Builder range() {
		return new RangeAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link RangeAggregate range} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate range(Function<RangeAggregate.Builder, ObjectBuilder<RangeAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.range(fn.apply(new RangeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RateAggregate rate} {@code Aggregate}
	 * variant.
	 */
	public static RateAggregate.Builder rate() {
		return new RateAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link RateAggregate rate} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate rate(Function<RateAggregate.Builder, ObjectBuilder<RateAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.rate(fn.apply(new RateAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ReverseNestedAggregate reverse_nested}
	 * {@code Aggregate} variant.
	 */
	public static ReverseNestedAggregate.Builder reverseNested() {
		return new ReverseNestedAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link ReverseNestedAggregate reverse_nested}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate reverseNested(
			Function<ReverseNestedAggregate.Builder, ObjectBuilder<ReverseNestedAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.reverseNested(fn.apply(new ReverseNestedAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SamplerAggregate sampler} {@code Aggregate}
	 * variant.
	 */
	public static SamplerAggregate.Builder sampler() {
		return new SamplerAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link SamplerAggregate sampler} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate sampler(Function<SamplerAggregate.Builder, ObjectBuilder<SamplerAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.sampler(fn.apply(new SamplerAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptedMetricAggregate scripted_metric}
	 * {@code Aggregate} variant.
	 */
	public static ScriptedMetricAggregate.Builder scriptedMetric() {
		return new ScriptedMetricAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link ScriptedMetricAggregate scripted_metric}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate scriptedMetric(
			Function<ScriptedMetricAggregate.Builder, ObjectBuilder<ScriptedMetricAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.scriptedMetric(fn.apply(new ScriptedMetricAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SignificantLongTermsAggregate siglterms}
	 * {@code Aggregate} variant.
	 */
	public static SignificantLongTermsAggregate.Builder siglterms() {
		return new SignificantLongTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link SignificantLongTermsAggregate siglterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate siglterms(
			Function<SignificantLongTermsAggregate.Builder, ObjectBuilder<SignificantLongTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.siglterms(fn.apply(new SignificantLongTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SignificantStringTermsAggregate sigsterms}
	 * {@code Aggregate} variant.
	 */
	public static SignificantStringTermsAggregate.Builder sigsterms() {
		return new SignificantStringTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link SignificantStringTermsAggregate sigsterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate sigsterms(
			Function<SignificantStringTermsAggregate.Builder, ObjectBuilder<SignificantStringTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.sigsterms(fn.apply(new SignificantStringTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SimpleValueAggregate simple_value}
	 * {@code Aggregate} variant.
	 */
	public static SimpleValueAggregate.Builder simpleValue() {
		return new SimpleValueAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link SimpleValueAggregate simple_value}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate simpleValue(
			Function<SimpleValueAggregate.Builder, ObjectBuilder<SimpleValueAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.simpleValue(fn.apply(new SimpleValueAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StatsAggregate stats} {@code Aggregate}
	 * variant.
	 */
	public static StatsAggregate.Builder stats() {
		return new StatsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link StatsAggregate stats} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate stats(Function<StatsAggregate.Builder, ObjectBuilder<StatsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.stats(fn.apply(new StatsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StatsBucketAggregate stats_bucket}
	 * {@code Aggregate} variant.
	 */
	public static StatsBucketAggregate.Builder statsBucket() {
		return new StatsBucketAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link StatsBucketAggregate stats_bucket}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate statsBucket(
			Function<StatsBucketAggregate.Builder, ObjectBuilder<StatsBucketAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.statsBucket(fn.apply(new StatsBucketAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StringRareTermsAggregate srareterms}
	 * {@code Aggregate} variant.
	 */
	public static StringRareTermsAggregate.Builder srareterms() {
		return new StringRareTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link StringRareTermsAggregate srareterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate srareterms(
			Function<StringRareTermsAggregate.Builder, ObjectBuilder<StringRareTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.srareterms(fn.apply(new StringRareTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StringStatsAggregate string_stats}
	 * {@code Aggregate} variant.
	 */
	public static StringStatsAggregate.Builder stringStats() {
		return new StringStatsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link StringStatsAggregate string_stats}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate stringStats(
			Function<StringStatsAggregate.Builder, ObjectBuilder<StringStatsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.stringStats(fn.apply(new StringStatsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StringTermsAggregate sterms}
	 * {@code Aggregate} variant.
	 */
	public static StringTermsAggregate.Builder sterms() {
		return new StringTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link StringTermsAggregate sterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate sterms(Function<StringTermsAggregate.Builder, ObjectBuilder<StringTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.sterms(fn.apply(new StringTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SumAggregate sum} {@code Aggregate} variant.
	 */
	public static SumAggregate.Builder sum() {
		return new SumAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link SumAggregate sum} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate sum(Function<SumAggregate.Builder, ObjectBuilder<SumAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.sum(fn.apply(new SumAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TDigestPercentileRanksAggregate
	 * tdigest_percentile_ranks} {@code Aggregate} variant.
	 */
	public static TDigestPercentileRanksAggregate.Builder tdigestPercentileRanks() {
		return new TDigestPercentileRanksAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link TDigestPercentileRanksAggregate
	 * tdigest_percentile_ranks} {@code Aggregate} variant.
	 */
	public static Aggregate tdigestPercentileRanks(
			Function<TDigestPercentileRanksAggregate.Builder, ObjectBuilder<TDigestPercentileRanksAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.tdigestPercentileRanks(fn.apply(new TDigestPercentileRanksAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TDigestPercentilesAggregate
	 * tdigest_percentiles} {@code Aggregate} variant.
	 */
	public static TDigestPercentilesAggregate.Builder tdigestPercentiles() {
		return new TDigestPercentilesAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link TDigestPercentilesAggregate
	 * tdigest_percentiles} {@code Aggregate} variant.
	 */
	public static Aggregate tdigestPercentiles(
			Function<TDigestPercentilesAggregate.Builder, ObjectBuilder<TDigestPercentilesAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.tdigestPercentiles(fn.apply(new TDigestPercentilesAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TTestAggregate t_test} {@code Aggregate}
	 * variant.
	 */
	public static TTestAggregate.Builder tTest() {
		return new TTestAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link TTestAggregate t_test} {@code Aggregate}
	 * variant.
	 */
	public static Aggregate tTest(Function<TTestAggregate.Builder, ObjectBuilder<TTestAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.tTest(fn.apply(new TTestAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TopHitsAggregate top_hits} {@code Aggregate}
	 * variant.
	 */
	public static TopHitsAggregate.Builder topHits() {
		return new TopHitsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link TopHitsAggregate top_hits}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate topHits(Function<TopHitsAggregate.Builder, ObjectBuilder<TopHitsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.topHits(fn.apply(new TopHitsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TopMetricsAggregate top_metrics}
	 * {@code Aggregate} variant.
	 */
	public static TopMetricsAggregate.Builder topMetrics() {
		return new TopMetricsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link TopMetricsAggregate top_metrics}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate topMetrics(Function<TopMetricsAggregate.Builder, ObjectBuilder<TopMetricsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.topMetrics(fn.apply(new TopMetricsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UnmappedRareTermsAggregate umrareterms}
	 * {@code Aggregate} variant.
	 */
	public static UnmappedRareTermsAggregate.Builder umrareterms() {
		return new UnmappedRareTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link UnmappedRareTermsAggregate umrareterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate umrareterms(
			Function<UnmappedRareTermsAggregate.Builder, ObjectBuilder<UnmappedRareTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.umrareterms(fn.apply(new UnmappedRareTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UnmappedSamplerAggregate unmapped_sampler}
	 * {@code Aggregate} variant.
	 */
	public static UnmappedSamplerAggregate.Builder unmappedSampler() {
		return new UnmappedSamplerAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link UnmappedSamplerAggregate unmapped_sampler}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate unmappedSampler(
			Function<UnmappedSamplerAggregate.Builder, ObjectBuilder<UnmappedSamplerAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.unmappedSampler(fn.apply(new UnmappedSamplerAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UnmappedSignificantTermsAggregate
	 * umsigterms} {@code Aggregate} variant.
	 */
	public static UnmappedSignificantTermsAggregate.Builder umsigterms() {
		return new UnmappedSignificantTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link UnmappedSignificantTermsAggregate
	 * umsigterms} {@code Aggregate} variant.
	 */
	public static Aggregate umsigterms(
			Function<UnmappedSignificantTermsAggregate.Builder, ObjectBuilder<UnmappedSignificantTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.umsigterms(fn.apply(new UnmappedSignificantTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UnmappedTermsAggregate umterms}
	 * {@code Aggregate} variant.
	 */
	public static UnmappedTermsAggregate.Builder umterms() {
		return new UnmappedTermsAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link UnmappedTermsAggregate umterms}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate umterms(
			Function<UnmappedTermsAggregate.Builder, ObjectBuilder<UnmappedTermsAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.umterms(fn.apply(new UnmappedTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ValueCountAggregate value_count}
	 * {@code Aggregate} variant.
	 */
	public static ValueCountAggregate.Builder valueCount() {
		return new ValueCountAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link ValueCountAggregate value_count}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate valueCount(Function<ValueCountAggregate.Builder, ObjectBuilder<ValueCountAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.valueCount(fn.apply(new ValueCountAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link VariableWidthHistogramAggregate
	 * variable_width_histogram} {@code Aggregate} variant.
	 */
	public static VariableWidthHistogramAggregate.Builder variableWidthHistogram() {
		return new VariableWidthHistogramAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link VariableWidthHistogramAggregate
	 * variable_width_histogram} {@code Aggregate} variant.
	 */
	public static Aggregate variableWidthHistogram(
			Function<VariableWidthHistogramAggregate.Builder, ObjectBuilder<VariableWidthHistogramAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.variableWidthHistogram(fn.apply(new VariableWidthHistogramAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WeightedAvgAggregate weighted_avg}
	 * {@code Aggregate} variant.
	 */
	public static WeightedAvgAggregate.Builder weightedAvg() {
		return new WeightedAvgAggregate.Builder();
	}

	/**
	 * Creates a Aggregate of the {@link WeightedAvgAggregate weighted_avg}
	 * {@code Aggregate} variant.
	 */
	public static Aggregate weightedAvg(
			Function<WeightedAvgAggregate.Builder, ObjectBuilder<WeightedAvgAggregate>> fn) {
		Aggregate.Builder builder = new Aggregate.Builder();
		builder.weightedAvg(fn.apply(new WeightedAvgAggregate.Builder()).build());
		return builder.build();
	}

}
