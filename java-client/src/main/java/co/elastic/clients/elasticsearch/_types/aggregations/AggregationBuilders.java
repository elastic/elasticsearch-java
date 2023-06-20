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
import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Aggregation} variants.
 */
public class AggregationBuilders {
	private AggregationBuilders() {
	}

	/**
	 * Creates a builder for the {@link AdjacencyMatrixAggregation adjacency_matrix}
	 * {@code Aggregation} variant.
	 */
	public static AdjacencyMatrixAggregation.Builder adjacencyMatrix() {
		return new AdjacencyMatrixAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link AdjacencyMatrixAggregation
	 * adjacency_matrix} {@code Aggregation} variant.
	 */
	public static Aggregation adjacencyMatrix(
			Function<AdjacencyMatrixAggregation.Builder, ObjectBuilder<AdjacencyMatrixAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.adjacencyMatrix(fn.apply(new AdjacencyMatrixAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link AutoDateHistogramAggregation
	 * auto_date_histogram} {@code Aggregation} variant.
	 */
	public static AutoDateHistogramAggregation.Builder autoDateHistogram() {
		return new AutoDateHistogramAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link AutoDateHistogramAggregation
	 * auto_date_histogram} {@code Aggregation} variant.
	 */
	public static Aggregation autoDateHistogram(
			Function<AutoDateHistogramAggregation.Builder, ObjectBuilder<AutoDateHistogramAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.autoDateHistogram(fn.apply(new AutoDateHistogramAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link AverageAggregation avg} {@code Aggregation}
	 * variant.
	 */
	public static AverageAggregation.Builder avg() {
		return new AverageAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link AverageAggregation avg}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation avg(Function<AverageAggregation.Builder, ObjectBuilder<AverageAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.avg(fn.apply(new AverageAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link AverageBucketAggregation avg_bucket}
	 * {@code Aggregation} variant.
	 */
	public static AverageBucketAggregation.Builder avgBucket() {
		return new AverageBucketAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link AverageBucketAggregation avg_bucket}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation avgBucket(
			Function<AverageBucketAggregation.Builder, ObjectBuilder<AverageBucketAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.avgBucket(fn.apply(new AverageBucketAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BoxplotAggregation boxplot}
	 * {@code Aggregation} variant.
	 */
	public static BoxplotAggregation.Builder boxplot() {
		return new BoxplotAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link BoxplotAggregation boxplot}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation boxplot(Function<BoxplotAggregation.Builder, ObjectBuilder<BoxplotAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.boxplot(fn.apply(new BoxplotAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BucketScriptAggregation bucket_script}
	 * {@code Aggregation} variant.
	 */
	public static BucketScriptAggregation.Builder bucketScript() {
		return new BucketScriptAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link BucketScriptAggregation bucket_script}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation bucketScript(
			Function<BucketScriptAggregation.Builder, ObjectBuilder<BucketScriptAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.bucketScript(fn.apply(new BucketScriptAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BucketSelectorAggregation bucket_selector}
	 * {@code Aggregation} variant.
	 */
	public static BucketSelectorAggregation.Builder bucketSelector() {
		return new BucketSelectorAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link BucketSelectorAggregation
	 * bucket_selector} {@code Aggregation} variant.
	 */
	public static Aggregation bucketSelector(
			Function<BucketSelectorAggregation.Builder, ObjectBuilder<BucketSelectorAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.bucketSelector(fn.apply(new BucketSelectorAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BucketSortAggregation bucket_sort}
	 * {@code Aggregation} variant.
	 */
	public static BucketSortAggregation.Builder bucketSort() {
		return new BucketSortAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link BucketSortAggregation bucket_sort}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation bucketSort(
			Function<BucketSortAggregation.Builder, ObjectBuilder<BucketSortAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.bucketSort(fn.apply(new BucketSortAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BucketKsAggregation bucket_count_ks_test}
	 * {@code Aggregation} variant.
	 */
	public static BucketKsAggregation.Builder bucketCountKsTest() {
		return new BucketKsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link BucketKsAggregation bucket_count_ks_test}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation bucketCountKsTest(
			Function<BucketKsAggregation.Builder, ObjectBuilder<BucketKsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.bucketCountKsTest(fn.apply(new BucketKsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BucketCorrelationAggregation
	 * bucket_correlation} {@code Aggregation} variant.
	 */
	public static BucketCorrelationAggregation.Builder bucketCorrelation() {
		return new BucketCorrelationAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link BucketCorrelationAggregation
	 * bucket_correlation} {@code Aggregation} variant.
	 */
	public static Aggregation bucketCorrelation(
			Function<BucketCorrelationAggregation.Builder, ObjectBuilder<BucketCorrelationAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.bucketCorrelation(fn.apply(new BucketCorrelationAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CardinalityAggregation cardinality}
	 * {@code Aggregation} variant.
	 */
	public static CardinalityAggregation.Builder cardinality() {
		return new CardinalityAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link CardinalityAggregation cardinality}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation cardinality(
			Function<CardinalityAggregation.Builder, ObjectBuilder<CardinalityAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.cardinality(fn.apply(new CardinalityAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CategorizeTextAggregation categorize_text}
	 * {@code Aggregation} variant.
	 */
	public static CategorizeTextAggregation.Builder categorizeText() {
		return new CategorizeTextAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link CategorizeTextAggregation
	 * categorize_text} {@code Aggregation} variant.
	 */
	public static Aggregation categorizeText(
			Function<CategorizeTextAggregation.Builder, ObjectBuilder<CategorizeTextAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.categorizeText(fn.apply(new CategorizeTextAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ChildrenAggregation children}
	 * {@code Aggregation} variant.
	 */
	public static ChildrenAggregation.Builder children() {
		return new ChildrenAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link ChildrenAggregation children}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation children(Function<ChildrenAggregation.Builder, ObjectBuilder<ChildrenAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.children(fn.apply(new ChildrenAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompositeAggregation composite}
	 * {@code Aggregation} variant.
	 */
	public static CompositeAggregation.Builder composite() {
		return new CompositeAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link CompositeAggregation composite}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation composite(
			Function<CompositeAggregation.Builder, ObjectBuilder<CompositeAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.composite(fn.apply(new CompositeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CumulativeCardinalityAggregation
	 * cumulative_cardinality} {@code Aggregation} variant.
	 */
	public static CumulativeCardinalityAggregation.Builder cumulativeCardinality() {
		return new CumulativeCardinalityAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link CumulativeCardinalityAggregation
	 * cumulative_cardinality} {@code Aggregation} variant.
	 */
	public static Aggregation cumulativeCardinality(
			Function<CumulativeCardinalityAggregation.Builder, ObjectBuilder<CumulativeCardinalityAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.cumulativeCardinality(fn.apply(new CumulativeCardinalityAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CumulativeSumAggregation cumulative_sum}
	 * {@code Aggregation} variant.
	 */
	public static CumulativeSumAggregation.Builder cumulativeSum() {
		return new CumulativeSumAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link CumulativeSumAggregation cumulative_sum}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation cumulativeSum(
			Function<CumulativeSumAggregation.Builder, ObjectBuilder<CumulativeSumAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.cumulativeSum(fn.apply(new CumulativeSumAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateHistogramAggregation date_histogram}
	 * {@code Aggregation} variant.
	 */
	public static DateHistogramAggregation.Builder dateHistogram() {
		return new DateHistogramAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link DateHistogramAggregation date_histogram}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation dateHistogram(
			Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.dateHistogram(fn.apply(new DateHistogramAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateRangeAggregation date_range}
	 * {@code Aggregation} variant.
	 */
	public static DateRangeAggregation.Builder dateRange() {
		return new DateRangeAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link DateRangeAggregation date_range}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation dateRange(
			Function<DateRangeAggregation.Builder, ObjectBuilder<DateRangeAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.dateRange(fn.apply(new DateRangeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DerivativeAggregation derivative}
	 * {@code Aggregation} variant.
	 */
	public static DerivativeAggregation.Builder derivative() {
		return new DerivativeAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link DerivativeAggregation derivative}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation derivative(
			Function<DerivativeAggregation.Builder, ObjectBuilder<DerivativeAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.derivative(fn.apply(new DerivativeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DiversifiedSamplerAggregation
	 * diversified_sampler} {@code Aggregation} variant.
	 */
	public static DiversifiedSamplerAggregation.Builder diversifiedSampler() {
		return new DiversifiedSamplerAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link DiversifiedSamplerAggregation
	 * diversified_sampler} {@code Aggregation} variant.
	 */
	public static Aggregation diversifiedSampler(
			Function<DiversifiedSamplerAggregation.Builder, ObjectBuilder<DiversifiedSamplerAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.diversifiedSampler(fn.apply(new DiversifiedSamplerAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExtendedStatsAggregation extended_stats}
	 * {@code Aggregation} variant.
	 */
	public static ExtendedStatsAggregation.Builder extendedStats() {
		return new ExtendedStatsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link ExtendedStatsAggregation extended_stats}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation extendedStats(
			Function<ExtendedStatsAggregation.Builder, ObjectBuilder<ExtendedStatsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.extendedStats(fn.apply(new ExtendedStatsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExtendedStatsBucketAggregation
	 * extended_stats_bucket} {@code Aggregation} variant.
	 */
	public static ExtendedStatsBucketAggregation.Builder extendedStatsBucket() {
		return new ExtendedStatsBucketAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link ExtendedStatsBucketAggregation
	 * extended_stats_bucket} {@code Aggregation} variant.
	 */
	public static Aggregation extendedStatsBucket(
			Function<ExtendedStatsBucketAggregation.Builder, ObjectBuilder<ExtendedStatsBucketAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.extendedStatsBucket(fn.apply(new ExtendedStatsBucketAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FrequentItemSetsAggregation
	 * frequent_item_sets} {@code Aggregation} variant.
	 */
	public static FrequentItemSetsAggregation.Builder frequentItemSets() {
		return new FrequentItemSetsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link FrequentItemSetsAggregation
	 * frequent_item_sets} {@code Aggregation} variant.
	 */
	public static Aggregation frequentItemSets(
			Function<FrequentItemSetsAggregation.Builder, ObjectBuilder<FrequentItemSetsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.frequentItemSets(fn.apply(new FrequentItemSetsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Query filter} {@code Aggregation} variant.
	 */
	public static Query.Builder filter() {
		return new Query.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link Query filter} {@code Aggregation}
	 * variant.
	 */
	public static Aggregation filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.filter(fn.apply(new Query.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FiltersAggregation filters}
	 * {@code Aggregation} variant.
	 */
	public static FiltersAggregation.Builder filters() {
		return new FiltersAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link FiltersAggregation filters}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation filters(Function<FiltersAggregation.Builder, ObjectBuilder<FiltersAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.filters(fn.apply(new FiltersAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoBoundsAggregation geo_bounds}
	 * {@code Aggregation} variant.
	 */
	public static GeoBoundsAggregation.Builder geoBounds() {
		return new GeoBoundsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GeoBoundsAggregation geo_bounds}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation geoBounds(
			Function<GeoBoundsAggregation.Builder, ObjectBuilder<GeoBoundsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.geoBounds(fn.apply(new GeoBoundsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoCentroidAggregation geo_centroid}
	 * {@code Aggregation} variant.
	 */
	public static GeoCentroidAggregation.Builder geoCentroid() {
		return new GeoCentroidAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GeoCentroidAggregation geo_centroid}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation geoCentroid(
			Function<GeoCentroidAggregation.Builder, ObjectBuilder<GeoCentroidAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.geoCentroid(fn.apply(new GeoCentroidAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoDistanceAggregation geo_distance}
	 * {@code Aggregation} variant.
	 */
	public static GeoDistanceAggregation.Builder geoDistance() {
		return new GeoDistanceAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GeoDistanceAggregation geo_distance}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation geoDistance(
			Function<GeoDistanceAggregation.Builder, ObjectBuilder<GeoDistanceAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.geoDistance(fn.apply(new GeoDistanceAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoHashGridAggregation geohash_grid}
	 * {@code Aggregation} variant.
	 */
	public static GeoHashGridAggregation.Builder geohashGrid() {
		return new GeoHashGridAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GeoHashGridAggregation geohash_grid}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation geohashGrid(
			Function<GeoHashGridAggregation.Builder, ObjectBuilder<GeoHashGridAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.geohashGrid(fn.apply(new GeoHashGridAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoLineAggregation geo_line}
	 * {@code Aggregation} variant.
	 */
	public static GeoLineAggregation.Builder geoLine() {
		return new GeoLineAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GeoLineAggregation geo_line}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation geoLine(Function<GeoLineAggregation.Builder, ObjectBuilder<GeoLineAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.geoLine(fn.apply(new GeoLineAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoTileGridAggregation geotile_grid}
	 * {@code Aggregation} variant.
	 */
	public static GeoTileGridAggregation.Builder geotileGrid() {
		return new GeoTileGridAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GeoTileGridAggregation geotile_grid}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation geotileGrid(
			Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.geotileGrid(fn.apply(new GeoTileGridAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeohexGridAggregation geohex_grid}
	 * {@code Aggregation} variant.
	 */
	public static GeohexGridAggregation.Builder geohexGrid() {
		return new GeohexGridAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GeohexGridAggregation geohex_grid}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation geohexGrid(
			Function<GeohexGridAggregation.Builder, ObjectBuilder<GeohexGridAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.geohexGrid(fn.apply(new GeohexGridAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GlobalAggregation global}
	 * {@code Aggregation} variant.
	 */
	public static GlobalAggregation.Builder global() {
		return new GlobalAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link GlobalAggregation global}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation global(Function<GlobalAggregation.Builder, ObjectBuilder<GlobalAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.global(fn.apply(new GlobalAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HistogramAggregation histogram}
	 * {@code Aggregation} variant.
	 */
	public static HistogramAggregation.Builder histogram() {
		return new HistogramAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link HistogramAggregation histogram}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation histogram(
			Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.histogram(fn.apply(new HistogramAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IpRangeAggregation ip_range}
	 * {@code Aggregation} variant.
	 */
	public static IpRangeAggregation.Builder ipRange() {
		return new IpRangeAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link IpRangeAggregation ip_range}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation ipRange(Function<IpRangeAggregation.Builder, ObjectBuilder<IpRangeAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.ipRange(fn.apply(new IpRangeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IpPrefixAggregation ip_prefix}
	 * {@code Aggregation} variant.
	 */
	public static IpPrefixAggregation.Builder ipPrefix() {
		return new IpPrefixAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link IpPrefixAggregation ip_prefix}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation ipPrefix(Function<IpPrefixAggregation.Builder, ObjectBuilder<IpPrefixAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.ipPrefix(fn.apply(new IpPrefixAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link InferenceAggregation inference}
	 * {@code Aggregation} variant.
	 */
	public static InferenceAggregation.Builder inference() {
		return new InferenceAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link InferenceAggregation inference}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation inference(
			Function<InferenceAggregation.Builder, ObjectBuilder<InferenceAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.inference(fn.apply(new InferenceAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatrixStatsAggregation matrix_stats}
	 * {@code Aggregation} variant.
	 */
	public static MatrixStatsAggregation.Builder matrixStats() {
		return new MatrixStatsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MatrixStatsAggregation matrix_stats}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation matrixStats(
			Function<MatrixStatsAggregation.Builder, ObjectBuilder<MatrixStatsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.matrixStats(fn.apply(new MatrixStatsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MaxAggregation max} {@code Aggregation}
	 * variant.
	 */
	public static MaxAggregation.Builder max() {
		return new MaxAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MaxAggregation max} {@code Aggregation}
	 * variant.
	 */
	public static Aggregation max(Function<MaxAggregation.Builder, ObjectBuilder<MaxAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.max(fn.apply(new MaxAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MaxBucketAggregation max_bucket}
	 * {@code Aggregation} variant.
	 */
	public static MaxBucketAggregation.Builder maxBucket() {
		return new MaxBucketAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MaxBucketAggregation max_bucket}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation maxBucket(
			Function<MaxBucketAggregation.Builder, ObjectBuilder<MaxBucketAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.maxBucket(fn.apply(new MaxBucketAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MedianAbsoluteDeviationAggregation
	 * median_absolute_deviation} {@code Aggregation} variant.
	 */
	public static MedianAbsoluteDeviationAggregation.Builder medianAbsoluteDeviation() {
		return new MedianAbsoluteDeviationAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MedianAbsoluteDeviationAggregation
	 * median_absolute_deviation} {@code Aggregation} variant.
	 */
	public static Aggregation medianAbsoluteDeviation(
			Function<MedianAbsoluteDeviationAggregation.Builder, ObjectBuilder<MedianAbsoluteDeviationAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.medianAbsoluteDeviation(fn.apply(new MedianAbsoluteDeviationAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MinAggregation min} {@code Aggregation}
	 * variant.
	 */
	public static MinAggregation.Builder min() {
		return new MinAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MinAggregation min} {@code Aggregation}
	 * variant.
	 */
	public static Aggregation min(Function<MinAggregation.Builder, ObjectBuilder<MinAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.min(fn.apply(new MinAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MinBucketAggregation min_bucket}
	 * {@code Aggregation} variant.
	 */
	public static MinBucketAggregation.Builder minBucket() {
		return new MinBucketAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MinBucketAggregation min_bucket}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation minBucket(
			Function<MinBucketAggregation.Builder, ObjectBuilder<MinBucketAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.minBucket(fn.apply(new MinBucketAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MissingAggregation missing}
	 * {@code Aggregation} variant.
	 */
	public static MissingAggregation.Builder missing() {
		return new MissingAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MissingAggregation missing}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation missing(Function<MissingAggregation.Builder, ObjectBuilder<MissingAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.missing(fn.apply(new MissingAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MovingAverageAggregation moving_avg}
	 * {@code Aggregation} variant.
	 */
	public static MovingAverageAggregation.Builder movingAvg() {
		return new MovingAverageAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MovingAverageAggregation moving_avg}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation movingAvg(
			Function<MovingAverageAggregation.Builder, ObjectBuilder<MovingAverageAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.movingAvg(fn.apply(new MovingAverageAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MovingPercentilesAggregation
	 * moving_percentiles} {@code Aggregation} variant.
	 */
	public static MovingPercentilesAggregation.Builder movingPercentiles() {
		return new MovingPercentilesAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MovingPercentilesAggregation
	 * moving_percentiles} {@code Aggregation} variant.
	 */
	public static Aggregation movingPercentiles(
			Function<MovingPercentilesAggregation.Builder, ObjectBuilder<MovingPercentilesAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.movingPercentiles(fn.apply(new MovingPercentilesAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MovingFunctionAggregation moving_fn}
	 * {@code Aggregation} variant.
	 */
	public static MovingFunctionAggregation.Builder movingFn() {
		return new MovingFunctionAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MovingFunctionAggregation moving_fn}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation movingFn(
			Function<MovingFunctionAggregation.Builder, ObjectBuilder<MovingFunctionAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.movingFn(fn.apply(new MovingFunctionAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MultiTermsAggregation multi_terms}
	 * {@code Aggregation} variant.
	 */
	public static MultiTermsAggregation.Builder multiTerms() {
		return new MultiTermsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link MultiTermsAggregation multi_terms}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation multiTerms(
			Function<MultiTermsAggregation.Builder, ObjectBuilder<MultiTermsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.multiTerms(fn.apply(new MultiTermsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NestedAggregation nested}
	 * {@code Aggregation} variant.
	 */
	public static NestedAggregation.Builder nested() {
		return new NestedAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link NestedAggregation nested}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation nested(Function<NestedAggregation.Builder, ObjectBuilder<NestedAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.nested(fn.apply(new NestedAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NormalizeAggregation normalize}
	 * {@code Aggregation} variant.
	 */
	public static NormalizeAggregation.Builder normalize() {
		return new NormalizeAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link NormalizeAggregation normalize}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation normalize(
			Function<NormalizeAggregation.Builder, ObjectBuilder<NormalizeAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.normalize(fn.apply(new NormalizeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ParentAggregation parent}
	 * {@code Aggregation} variant.
	 */
	public static ParentAggregation.Builder parent() {
		return new ParentAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link ParentAggregation parent}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation parent(Function<ParentAggregation.Builder, ObjectBuilder<ParentAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.parent(fn.apply(new ParentAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PercentileRanksAggregation percentile_ranks}
	 * {@code Aggregation} variant.
	 */
	public static PercentileRanksAggregation.Builder percentileRanks() {
		return new PercentileRanksAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link PercentileRanksAggregation
	 * percentile_ranks} {@code Aggregation} variant.
	 */
	public static Aggregation percentileRanks(
			Function<PercentileRanksAggregation.Builder, ObjectBuilder<PercentileRanksAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.percentileRanks(fn.apply(new PercentileRanksAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PercentilesAggregation percentiles}
	 * {@code Aggregation} variant.
	 */
	public static PercentilesAggregation.Builder percentiles() {
		return new PercentilesAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link PercentilesAggregation percentiles}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation percentiles(
			Function<PercentilesAggregation.Builder, ObjectBuilder<PercentilesAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.percentiles(fn.apply(new PercentilesAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PercentilesBucketAggregation
	 * percentiles_bucket} {@code Aggregation} variant.
	 */
	public static PercentilesBucketAggregation.Builder percentilesBucket() {
		return new PercentilesBucketAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link PercentilesBucketAggregation
	 * percentiles_bucket} {@code Aggregation} variant.
	 */
	public static Aggregation percentilesBucket(
			Function<PercentilesBucketAggregation.Builder, ObjectBuilder<PercentilesBucketAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.percentilesBucket(fn.apply(new PercentilesBucketAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeAggregation range} {@code Aggregation}
	 * variant.
	 */
	public static RangeAggregation.Builder range() {
		return new RangeAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link RangeAggregation range}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation range(Function<RangeAggregation.Builder, ObjectBuilder<RangeAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.range(fn.apply(new RangeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RareTermsAggregation rare_terms}
	 * {@code Aggregation} variant.
	 */
	public static RareTermsAggregation.Builder rareTerms() {
		return new RareTermsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link RareTermsAggregation rare_terms}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation rareTerms(
			Function<RareTermsAggregation.Builder, ObjectBuilder<RareTermsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.rareTerms(fn.apply(new RareTermsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RateAggregation rate} {@code Aggregation}
	 * variant.
	 */
	public static RateAggregation.Builder rate() {
		return new RateAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link RateAggregation rate} {@code Aggregation}
	 * variant.
	 */
	public static Aggregation rate(Function<RateAggregation.Builder, ObjectBuilder<RateAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.rate(fn.apply(new RateAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ReverseNestedAggregation reverse_nested}
	 * {@code Aggregation} variant.
	 */
	public static ReverseNestedAggregation.Builder reverseNested() {
		return new ReverseNestedAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link ReverseNestedAggregation reverse_nested}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation reverseNested(
			Function<ReverseNestedAggregation.Builder, ObjectBuilder<ReverseNestedAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.reverseNested(fn.apply(new ReverseNestedAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SamplerAggregation sampler}
	 * {@code Aggregation} variant.
	 */
	public static SamplerAggregation.Builder sampler() {
		return new SamplerAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link SamplerAggregation sampler}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation sampler(Function<SamplerAggregation.Builder, ObjectBuilder<SamplerAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.sampler(fn.apply(new SamplerAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptedMetricAggregation scripted_metric}
	 * {@code Aggregation} variant.
	 */
	public static ScriptedMetricAggregation.Builder scriptedMetric() {
		return new ScriptedMetricAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link ScriptedMetricAggregation
	 * scripted_metric} {@code Aggregation} variant.
	 */
	public static Aggregation scriptedMetric(
			Function<ScriptedMetricAggregation.Builder, ObjectBuilder<ScriptedMetricAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.scriptedMetric(fn.apply(new ScriptedMetricAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SerialDifferencingAggregation serial_diff}
	 * {@code Aggregation} variant.
	 */
	public static SerialDifferencingAggregation.Builder serialDiff() {
		return new SerialDifferencingAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link SerialDifferencingAggregation
	 * serial_diff} {@code Aggregation} variant.
	 */
	public static Aggregation serialDiff(
			Function<SerialDifferencingAggregation.Builder, ObjectBuilder<SerialDifferencingAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.serialDiff(fn.apply(new SerialDifferencingAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SignificantTermsAggregation
	 * significant_terms} {@code Aggregation} variant.
	 */
	public static SignificantTermsAggregation.Builder significantTerms() {
		return new SignificantTermsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link SignificantTermsAggregation
	 * significant_terms} {@code Aggregation} variant.
	 */
	public static Aggregation significantTerms(
			Function<SignificantTermsAggregation.Builder, ObjectBuilder<SignificantTermsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.significantTerms(fn.apply(new SignificantTermsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SignificantTextAggregation significant_text}
	 * {@code Aggregation} variant.
	 */
	public static SignificantTextAggregation.Builder significantText() {
		return new SignificantTextAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link SignificantTextAggregation
	 * significant_text} {@code Aggregation} variant.
	 */
	public static Aggregation significantText(
			Function<SignificantTextAggregation.Builder, ObjectBuilder<SignificantTextAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.significantText(fn.apply(new SignificantTextAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StatsAggregation stats} {@code Aggregation}
	 * variant.
	 */
	public static StatsAggregation.Builder stats() {
		return new StatsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link StatsAggregation stats}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation stats(Function<StatsAggregation.Builder, ObjectBuilder<StatsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.stats(fn.apply(new StatsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StatsBucketAggregation stats_bucket}
	 * {@code Aggregation} variant.
	 */
	public static StatsBucketAggregation.Builder statsBucket() {
		return new StatsBucketAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link StatsBucketAggregation stats_bucket}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation statsBucket(
			Function<StatsBucketAggregation.Builder, ObjectBuilder<StatsBucketAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.statsBucket(fn.apply(new StatsBucketAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StringStatsAggregation string_stats}
	 * {@code Aggregation} variant.
	 */
	public static StringStatsAggregation.Builder stringStats() {
		return new StringStatsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link StringStatsAggregation string_stats}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation stringStats(
			Function<StringStatsAggregation.Builder, ObjectBuilder<StringStatsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.stringStats(fn.apply(new StringStatsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SumAggregation sum} {@code Aggregation}
	 * variant.
	 */
	public static SumAggregation.Builder sum() {
		return new SumAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link SumAggregation sum} {@code Aggregation}
	 * variant.
	 */
	public static Aggregation sum(Function<SumAggregation.Builder, ObjectBuilder<SumAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.sum(fn.apply(new SumAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SumBucketAggregation sum_bucket}
	 * {@code Aggregation} variant.
	 */
	public static SumBucketAggregation.Builder sumBucket() {
		return new SumBucketAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link SumBucketAggregation sum_bucket}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation sumBucket(
			Function<SumBucketAggregation.Builder, ObjectBuilder<SumBucketAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.sumBucket(fn.apply(new SumBucketAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsAggregation terms} {@code Aggregation}
	 * variant.
	 */
	public static TermsAggregation.Builder terms() {
		return new TermsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link TermsAggregation terms}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.terms(fn.apply(new TermsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TopHitsAggregation top_hits}
	 * {@code Aggregation} variant.
	 */
	public static TopHitsAggregation.Builder topHits() {
		return new TopHitsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link TopHitsAggregation top_hits}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation topHits(Function<TopHitsAggregation.Builder, ObjectBuilder<TopHitsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.topHits(fn.apply(new TopHitsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TTestAggregation t_test} {@code Aggregation}
	 * variant.
	 */
	public static TTestAggregation.Builder tTest() {
		return new TTestAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link TTestAggregation t_test}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation tTest(Function<TTestAggregation.Builder, ObjectBuilder<TTestAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.tTest(fn.apply(new TTestAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TopMetricsAggregation top_metrics}
	 * {@code Aggregation} variant.
	 */
	public static TopMetricsAggregation.Builder topMetrics() {
		return new TopMetricsAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link TopMetricsAggregation top_metrics}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation topMetrics(
			Function<TopMetricsAggregation.Builder, ObjectBuilder<TopMetricsAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.topMetrics(fn.apply(new TopMetricsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ValueCountAggregation value_count}
	 * {@code Aggregation} variant.
	 */
	public static ValueCountAggregation.Builder valueCount() {
		return new ValueCountAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link ValueCountAggregation value_count}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation valueCount(
			Function<ValueCountAggregation.Builder, ObjectBuilder<ValueCountAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.valueCount(fn.apply(new ValueCountAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WeightedAverageAggregation weighted_avg}
	 * {@code Aggregation} variant.
	 */
	public static WeightedAverageAggregation.Builder weightedAvg() {
		return new WeightedAverageAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link WeightedAverageAggregation weighted_avg}
	 * {@code Aggregation} variant.
	 */
	public static Aggregation weightedAvg(
			Function<WeightedAverageAggregation.Builder, ObjectBuilder<WeightedAverageAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.weightedAvg(fn.apply(new WeightedAverageAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link VariableWidthHistogramAggregation
	 * variable_width_histogram} {@code Aggregation} variant.
	 */
	public static VariableWidthHistogramAggregation.Builder variableWidthHistogram() {
		return new VariableWidthHistogramAggregation.Builder();
	}

	/**
	 * Creates a Aggregation of the {@link VariableWidthHistogramAggregation
	 * variable_width_histogram} {@code Aggregation} variant.
	 */
	public static Aggregation variableWidthHistogram(
			Function<VariableWidthHistogramAggregation.Builder, ObjectBuilder<VariableWidthHistogramAggregation>> fn) {
		Aggregation.Builder builder = new Aggregation.Builder();
		builder.variableWidthHistogram(fn.apply(new VariableWidthHistogramAggregation.Builder()).build());
		return builder.build();
	}

}
