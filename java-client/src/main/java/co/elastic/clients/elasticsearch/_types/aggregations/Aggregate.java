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

import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.aggregations.Aggregate
// union type: ExternalTag[]

public class Aggregate implements TaggedUnion<Aggregate.Kind, AggregateVariant>, JsonpSerializable {

	/**
	 * {@link Aggregate} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		AdjacencyMatrix("adjacency_matrix"),

		AutoDateHistogram("auto_date_histogram"),

		Avg("avg"),

		BoxPlot("box_plot"),

		BucketMetricValue("bucket_metric_value"),

		Cardinality("cardinality"),

		Children("children"),

		Composite("composite"),

		SimpleLongValue("simple_long_value"),

		DateHistogram("date_histogram"),

		DateRange("date_range"),

		Derivative("derivative"),

		Dterms("dterms"),

		ExtendedStats("extended_stats"),

		ExtendedStatsBucket("extended_stats_bucket"),

		Filter("filter"),

		Filters("filters"),

		GeoBounds("geo_bounds"),

		GeoCentroid("geo_centroid"),

		GeoDistance("geo_distance"),

		GeohashGrid("geohash_grid"),

		GeoLine("geo_line"),

		GeotileGrid("geotile_grid"),

		Global("global"),

		HdrPercentileRanks("hdr_percentile_ranks"),

		HdrPercentiles("hdr_percentiles"),

		Histogram("histogram"),

		Inference("inference"),

		IpRange("ip_range"),

		Lrareterms("lrareterms"),

		Lterms("lterms"),

		MatrixStats("matrix_stats"),

		Max("max"),

		MedianAbsoluteDeviation("median_absolute_deviation"),

		Min("min"),

		Missing("missing"),

		MultiTerms("multi_terms"),

		Nested("nested"),

		PercentilesBucket("percentiles_bucket"),

		Range("range"),

		Rate("rate"),

		ReverseNested("reverse_nested"),

		Sampler("sampler"),

		ScriptedMetric("scripted_metric"),

		Siglterms("siglterms"),

		Sigsterms("sigsterms"),

		SimpleValue("simple_value"),

		Stats("stats"),

		StatsBucket("stats_bucket"),

		Srareterms("srareterms"),

		StringStats("string_stats"),

		Sterms("sterms"),

		Sum("sum"),

		TdigestPercentileRanks("tdigest_percentile_ranks"),

		TdigestPercentiles("tdigest_percentiles"),

		TTest("t_test"),

		TopHits("top_hits"),

		TopMetrics("top_metrics"),

		Umrareterms("umrareterms"),

		Umsigterms("umsigterms"),

		Umterms("umterms"),

		ValueCount("value_count"),

		VariableWidthHistogram("variable_width_histogram"),

		WeightedAvg("weighted_avg"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final AggregateVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final AggregateVariant _get() {
		return _value;
	}

	public Aggregate(AggregateVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._aggregateKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Aggregate(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Aggregate of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code adjacency_matrix}?
	 */
	public boolean isAdjacencyMatrix() {
		return _kind == Kind.AdjacencyMatrix;
	}

	/**
	 * Get the {@code adjacency_matrix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code adjacency_matrix}
	 *             kind.
	 */
	public AdjacencyMatrixAggregate adjacencyMatrix() {
		return TaggedUnionUtils.get(this, Kind.AdjacencyMatrix);
	}

	/**
	 * Is this variant instance of kind {@code auto_date_histogram}?
	 */
	public boolean isAutoDateHistogram() {
		return _kind == Kind.AutoDateHistogram;
	}

	/**
	 * Get the {@code auto_date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code auto_date_histogram}
	 *             kind.
	 */
	public AutoDateHistogramAggregate autoDateHistogram() {
		return TaggedUnionUtils.get(this, Kind.AutoDateHistogram);
	}

	/**
	 * Is this variant instance of kind {@code avg}?
	 */
	public boolean isAvg() {
		return _kind == Kind.Avg;
	}

	/**
	 * Get the {@code avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg} kind.
	 */
	public AvgAggregate avg() {
		return TaggedUnionUtils.get(this, Kind.Avg);
	}

	/**
	 * Is this variant instance of kind {@code box_plot}?
	 */
	public boolean isBoxPlot() {
		return _kind == Kind.BoxPlot;
	}

	/**
	 * Get the {@code box_plot} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code box_plot} kind.
	 */
	public BoxPlotAggregate boxPlot() {
		return TaggedUnionUtils.get(this, Kind.BoxPlot);
	}

	/**
	 * Is this variant instance of kind {@code bucket_metric_value}?
	 */
	public boolean isBucketMetricValue() {
		return _kind == Kind.BucketMetricValue;
	}

	/**
	 * Get the {@code bucket_metric_value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_metric_value}
	 *             kind.
	 */
	public BucketMetricValueAggregate bucketMetricValue() {
		return TaggedUnionUtils.get(this, Kind.BucketMetricValue);
	}

	/**
	 * Is this variant instance of kind {@code cardinality}?
	 */
	public boolean isCardinality() {
		return _kind == Kind.Cardinality;
	}

	/**
	 * Get the {@code cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cardinality} kind.
	 */
	public CardinalityAggregate cardinality() {
		return TaggedUnionUtils.get(this, Kind.Cardinality);
	}

	/**
	 * Is this variant instance of kind {@code children}?
	 */
	public boolean isChildren() {
		return _kind == Kind.Children;
	}

	/**
	 * Get the {@code children} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code children} kind.
	 */
	public ChildrenAggregate children() {
		return TaggedUnionUtils.get(this, Kind.Children);
	}

	/**
	 * Is this variant instance of kind {@code composite}?
	 */
	public boolean isComposite() {
		return _kind == Kind.Composite;
	}

	/**
	 * Get the {@code composite} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code composite} kind.
	 */
	public CompositeAggregate composite() {
		return TaggedUnionUtils.get(this, Kind.Composite);
	}

	/**
	 * Is this variant instance of kind {@code simple_long_value}?
	 */
	public boolean isSimpleLongValue() {
		return _kind == Kind.SimpleLongValue;
	}

	/**
	 * Get the {@code simple_long_value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_long_value}
	 *             kind.
	 */
	public CumulativeCardinalityAggregate simpleLongValue() {
		return TaggedUnionUtils.get(this, Kind.SimpleLongValue);
	}

	/**
	 * Is this variant instance of kind {@code date_histogram}?
	 */
	public boolean isDateHistogram() {
		return _kind == Kind.DateHistogram;
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public DateHistogramAggregate dateHistogram() {
		return TaggedUnionUtils.get(this, Kind.DateHistogram);
	}

	/**
	 * Is this variant instance of kind {@code date_range}?
	 */
	public boolean isDateRange() {
		return _kind == Kind.DateRange;
	}

	/**
	 * Get the {@code date_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_range} kind.
	 */
	public DateRangeAggregate dateRange() {
		return TaggedUnionUtils.get(this, Kind.DateRange);
	}

	/**
	 * Is this variant instance of kind {@code derivative}?
	 */
	public boolean isDerivative() {
		return _kind == Kind.Derivative;
	}

	/**
	 * Get the {@code derivative} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code derivative} kind.
	 */
	public DerivativeAggregate derivative() {
		return TaggedUnionUtils.get(this, Kind.Derivative);
	}

	/**
	 * Is this variant instance of kind {@code dterms}?
	 */
	public boolean isDterms() {
		return _kind == Kind.Dterms;
	}

	/**
	 * Get the {@code dterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dterms} kind.
	 */
	public DoubleTermsAggregate dterms() {
		return TaggedUnionUtils.get(this, Kind.Dterms);
	}

	/**
	 * Is this variant instance of kind {@code extended_stats}?
	 */
	public boolean isExtendedStats() {
		return _kind == Kind.ExtendedStats;
	}

	/**
	 * Get the {@code extended_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code extended_stats} kind.
	 */
	public ExtendedStatsAggregate extendedStats() {
		return TaggedUnionUtils.get(this, Kind.ExtendedStats);
	}

	/**
	 * Is this variant instance of kind {@code extended_stats_bucket}?
	 */
	public boolean isExtendedStatsBucket() {
		return _kind == Kind.ExtendedStatsBucket;
	}

	/**
	 * Get the {@code extended_stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code extended_stats_bucket} kind.
	 */
	public ExtendedStatsBucketAggregate extendedStatsBucket() {
		return TaggedUnionUtils.get(this, Kind.ExtendedStatsBucket);
	}

	/**
	 * Is this variant instance of kind {@code filter}?
	 */
	public boolean isFilter() {
		return _kind == Kind.Filter;
	}

	/**
	 * Get the {@code filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filter} kind.
	 */
	public FilterAggregate filter() {
		return TaggedUnionUtils.get(this, Kind.Filter);
	}

	/**
	 * Is this variant instance of kind {@code filters}?
	 */
	public boolean isFilters() {
		return _kind == Kind.Filters;
	}

	/**
	 * Get the {@code filters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filters} kind.
	 */
	public FiltersAggregate filters() {
		return TaggedUnionUtils.get(this, Kind.Filters);
	}

	/**
	 * Is this variant instance of kind {@code geo_bounds}?
	 */
	public boolean isGeoBounds() {
		return _kind == Kind.GeoBounds;
	}

	/**
	 * Get the {@code geo_bounds} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounds} kind.
	 */
	public GeoBoundsAggregate geoBounds() {
		return TaggedUnionUtils.get(this, Kind.GeoBounds);
	}

	/**
	 * Is this variant instance of kind {@code geo_centroid}?
	 */
	public boolean isGeoCentroid() {
		return _kind == Kind.GeoCentroid;
	}

	/**
	 * Get the {@code geo_centroid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_centroid} kind.
	 */
	public GeoCentroidAggregate geoCentroid() {
		return TaggedUnionUtils.get(this, Kind.GeoCentroid);
	}

	/**
	 * Is this variant instance of kind {@code geo_distance}?
	 */
	public boolean isGeoDistance() {
		return _kind == Kind.GeoDistance;
	}

	/**
	 * Get the {@code geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_distance} kind.
	 */
	public GeoDistanceAggregate geoDistance() {
		return TaggedUnionUtils.get(this, Kind.GeoDistance);
	}

	/**
	 * Is this variant instance of kind {@code geohash_grid}?
	 */
	public boolean isGeohashGrid() {
		return _kind == Kind.GeohashGrid;
	}

	/**
	 * Get the {@code geohash_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash_grid} kind.
	 */
	public GeoHashGridAggregate geohashGrid() {
		return TaggedUnionUtils.get(this, Kind.GeohashGrid);
	}

	/**
	 * Is this variant instance of kind {@code geo_line}?
	 */
	public boolean isGeoLine() {
		return _kind == Kind.GeoLine;
	}

	/**
	 * Get the {@code geo_line} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_line} kind.
	 */
	public GeoLineAggregate geoLine() {
		return TaggedUnionUtils.get(this, Kind.GeoLine);
	}

	/**
	 * Is this variant instance of kind {@code geotile_grid}?
	 */
	public boolean isGeotileGrid() {
		return _kind == Kind.GeotileGrid;
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public GeoTileGridAggregate geotileGrid() {
		return TaggedUnionUtils.get(this, Kind.GeotileGrid);
	}

	/**
	 * Is this variant instance of kind {@code global}?
	 */
	public boolean isGlobal() {
		return _kind == Kind.Global;
	}

	/**
	 * Get the {@code global} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code global} kind.
	 */
	public GlobalAggregate global() {
		return TaggedUnionUtils.get(this, Kind.Global);
	}

	/**
	 * Is this variant instance of kind {@code hdr_percentile_ranks}?
	 */
	public boolean isHdrPercentileRanks() {
		return _kind == Kind.HdrPercentileRanks;
	}

	/**
	 * Get the {@code hdr_percentile_ranks} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hdr_percentile_ranks}
	 *             kind.
	 */
	public HdrPercentileRanksAggregate hdrPercentileRanks() {
		return TaggedUnionUtils.get(this, Kind.HdrPercentileRanks);
	}

	/**
	 * Is this variant instance of kind {@code hdr_percentiles}?
	 */
	public boolean isHdrPercentiles() {
		return _kind == Kind.HdrPercentiles;
	}

	/**
	 * Get the {@code hdr_percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hdr_percentiles}
	 *             kind.
	 */
	public HdrPercentilesAggregate hdrPercentiles() {
		return TaggedUnionUtils.get(this, Kind.HdrPercentiles);
	}

	/**
	 * Is this variant instance of kind {@code histogram}?
	 */
	public boolean isHistogram() {
		return _kind == Kind.Histogram;
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramAggregate histogram() {
		return TaggedUnionUtils.get(this, Kind.Histogram);
	}

	/**
	 * Is this variant instance of kind {@code inference}?
	 */
	public boolean isInference() {
		return _kind == Kind.Inference;
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceAggregate inference() {
		return TaggedUnionUtils.get(this, Kind.Inference);
	}

	/**
	 * Is this variant instance of kind {@code ip_range}?
	 */
	public boolean isIpRange() {
		return _kind == Kind.IpRange;
	}

	/**
	 * Get the {@code ip_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ip_range} kind.
	 */
	public IpRangeAggregate ipRange() {
		return TaggedUnionUtils.get(this, Kind.IpRange);
	}

	/**
	 * Is this variant instance of kind {@code lrareterms}?
	 */
	public boolean isLrareterms() {
		return _kind == Kind.Lrareterms;
	}

	/**
	 * Get the {@code lrareterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lrareterms} kind.
	 */
	public LongRareTermsAggregate lrareterms() {
		return TaggedUnionUtils.get(this, Kind.Lrareterms);
	}

	/**
	 * Is this variant instance of kind {@code lterms}?
	 */
	public boolean isLterms() {
		return _kind == Kind.Lterms;
	}

	/**
	 * Get the {@code lterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lterms} kind.
	 */
	public LongTermsAggregate lterms() {
		return TaggedUnionUtils.get(this, Kind.Lterms);
	}

	/**
	 * Is this variant instance of kind {@code matrix_stats}?
	 */
	public boolean isMatrixStats() {
		return _kind == Kind.MatrixStats;
	}

	/**
	 * Get the {@code matrix_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code matrix_stats} kind.
	 */
	public MatrixStatsAggregate matrixStats() {
		return TaggedUnionUtils.get(this, Kind.MatrixStats);
	}

	/**
	 * Is this variant instance of kind {@code max}?
	 */
	public boolean isMax() {
		return _kind == Kind.Max;
	}

	/**
	 * Get the {@code max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max} kind.
	 */
	public MaxAggregate max() {
		return TaggedUnionUtils.get(this, Kind.Max);
	}

	/**
	 * Is this variant instance of kind {@code median_absolute_deviation}?
	 */
	public boolean isMedianAbsoluteDeviation() {
		return _kind == Kind.MedianAbsoluteDeviation;
	}

	/**
	 * Get the {@code median_absolute_deviation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code median_absolute_deviation} kind.
	 */
	public MedianAbsoluteDeviationAggregate medianAbsoluteDeviation() {
		return TaggedUnionUtils.get(this, Kind.MedianAbsoluteDeviation);
	}

	/**
	 * Is this variant instance of kind {@code min}?
	 */
	public boolean isMin() {
		return _kind == Kind.Min;
	}

	/**
	 * Get the {@code min} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min} kind.
	 */
	public MinAggregate min() {
		return TaggedUnionUtils.get(this, Kind.Min);
	}

	/**
	 * Is this variant instance of kind {@code missing}?
	 */
	public boolean isMissing() {
		return _kind == Kind.Missing;
	}

	/**
	 * Get the {@code missing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code missing} kind.
	 */
	public MissingAggregate missing() {
		return TaggedUnionUtils.get(this, Kind.Missing);
	}

	/**
	 * Is this variant instance of kind {@code multi_terms}?
	 */
	public boolean isMultiTerms() {
		return _kind == Kind.MultiTerms;
	}

	/**
	 * Get the {@code multi_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_terms} kind.
	 */
	public MultiTermsAggregate multiTerms() {
		return TaggedUnionUtils.get(this, Kind.MultiTerms);
	}

	/**
	 * Is this variant instance of kind {@code nested}?
	 */
	public boolean isNested() {
		return _kind == Kind.Nested;
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedAggregate nested() {
		return TaggedUnionUtils.get(this, Kind.Nested);
	}

	/**
	 * Is this variant instance of kind {@code percentiles_bucket}?
	 */
	public boolean isPercentilesBucket() {
		return _kind == Kind.PercentilesBucket;
	}

	/**
	 * Get the {@code percentiles_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles_bucket}
	 *             kind.
	 */
	public PercentilesBucketAggregate percentilesBucket() {
		return TaggedUnionUtils.get(this, Kind.PercentilesBucket);
	}

	/**
	 * Is this variant instance of kind {@code range}?
	 */
	public boolean isRange() {
		return _kind == Kind.Range;
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeAggregate range() {
		return TaggedUnionUtils.get(this, Kind.Range);
	}

	/**
	 * Is this variant instance of kind {@code rate}?
	 */
	public boolean isRate() {
		return _kind == Kind.Rate;
	}

	/**
	 * Get the {@code rate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rate} kind.
	 */
	public RateAggregate rate() {
		return TaggedUnionUtils.get(this, Kind.Rate);
	}

	/**
	 * Is this variant instance of kind {@code reverse_nested}?
	 */
	public boolean isReverseNested() {
		return _kind == Kind.ReverseNested;
	}

	/**
	 * Get the {@code reverse_nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse_nested} kind.
	 */
	public ReverseNestedAggregate reverseNested() {
		return TaggedUnionUtils.get(this, Kind.ReverseNested);
	}

	/**
	 * Is this variant instance of kind {@code sampler}?
	 */
	public boolean isSampler() {
		return _kind == Kind.Sampler;
	}

	/**
	 * Get the {@code sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sampler} kind.
	 */
	public SamplerAggregate sampler() {
		return TaggedUnionUtils.get(this, Kind.Sampler);
	}

	/**
	 * Is this variant instance of kind {@code scripted_metric}?
	 */
	public boolean isScriptedMetric() {
		return _kind == Kind.ScriptedMetric;
	}

	/**
	 * Get the {@code scripted_metric} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scripted_metric}
	 *             kind.
	 */
	public ScriptedMetricAggregate scriptedMetric() {
		return TaggedUnionUtils.get(this, Kind.ScriptedMetric);
	}

	/**
	 * Is this variant instance of kind {@code siglterms}?
	 */
	public boolean isSiglterms() {
		return _kind == Kind.Siglterms;
	}

	/**
	 * Get the {@code siglterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code siglterms} kind.
	 */
	public SignificantLongTermsAggregate siglterms() {
		return TaggedUnionUtils.get(this, Kind.Siglterms);
	}

	/**
	 * Is this variant instance of kind {@code sigsterms}?
	 */
	public boolean isSigsterms() {
		return _kind == Kind.Sigsterms;
	}

	/**
	 * Get the {@code sigsterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sigsterms} kind.
	 */
	public SignificantStringTermsAggregate sigsterms() {
		return TaggedUnionUtils.get(this, Kind.Sigsterms);
	}

	/**
	 * Is this variant instance of kind {@code simple_value}?
	 */
	public boolean isSimpleValue() {
		return _kind == Kind.SimpleValue;
	}

	/**
	 * Get the {@code simple_value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_value} kind.
	 */
	public SimpleValueAggregate simpleValue() {
		return TaggedUnionUtils.get(this, Kind.SimpleValue);
	}

	/**
	 * Is this variant instance of kind {@code stats}?
	 */
	public boolean isStats() {
		return _kind == Kind.Stats;
	}

	/**
	 * Get the {@code stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats} kind.
	 */
	public StatsAggregate stats() {
		return TaggedUnionUtils.get(this, Kind.Stats);
	}

	/**
	 * Is this variant instance of kind {@code stats_bucket}?
	 */
	public boolean isStatsBucket() {
		return _kind == Kind.StatsBucket;
	}

	/**
	 * Get the {@code stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats_bucket} kind.
	 */
	public StatsBucketAggregate statsBucket() {
		return TaggedUnionUtils.get(this, Kind.StatsBucket);
	}

	/**
	 * Is this variant instance of kind {@code srareterms}?
	 */
	public boolean isSrareterms() {
		return _kind == Kind.Srareterms;
	}

	/**
	 * Get the {@code srareterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code srareterms} kind.
	 */
	public StringRareTermsAggregate srareterms() {
		return TaggedUnionUtils.get(this, Kind.Srareterms);
	}

	/**
	 * Is this variant instance of kind {@code string_stats}?
	 */
	public boolean isStringStats() {
		return _kind == Kind.StringStats;
	}

	/**
	 * Get the {@code string_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string_stats} kind.
	 */
	public StringStatsAggregate stringStats() {
		return TaggedUnionUtils.get(this, Kind.StringStats);
	}

	/**
	 * Is this variant instance of kind {@code sterms}?
	 */
	public boolean isSterms() {
		return _kind == Kind.Sterms;
	}

	/**
	 * Get the {@code sterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sterms} kind.
	 */
	public StringTermsAggregate sterms() {
		return TaggedUnionUtils.get(this, Kind.Sterms);
	}

	/**
	 * Is this variant instance of kind {@code sum}?
	 */
	public boolean isSum() {
		return _kind == Kind.Sum;
	}

	/**
	 * Get the {@code sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum} kind.
	 */
	public SumAggregate sum() {
		return TaggedUnionUtils.get(this, Kind.Sum);
	}

	/**
	 * Is this variant instance of kind {@code tdigest_percentile_ranks}?
	 */
	public boolean isTdigestPercentileRanks() {
		return _kind == Kind.TdigestPercentileRanks;
	}

	/**
	 * Get the {@code tdigest_percentile_ranks} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code tdigest_percentile_ranks} kind.
	 */
	public TDigestPercentileRanksAggregate tdigestPercentileRanks() {
		return TaggedUnionUtils.get(this, Kind.TdigestPercentileRanks);
	}

	/**
	 * Is this variant instance of kind {@code tdigest_percentiles}?
	 */
	public boolean isTdigestPercentiles() {
		return _kind == Kind.TdigestPercentiles;
	}

	/**
	 * Get the {@code tdigest_percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code tdigest_percentiles}
	 *             kind.
	 */
	public TDigestPercentilesAggregate tdigestPercentiles() {
		return TaggedUnionUtils.get(this, Kind.TdigestPercentiles);
	}

	/**
	 * Is this variant instance of kind {@code t_test}?
	 */
	public boolean isTTest() {
		return _kind == Kind.TTest;
	}

	/**
	 * Get the {@code t_test} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code t_test} kind.
	 */
	public TTestAggregate tTest() {
		return TaggedUnionUtils.get(this, Kind.TTest);
	}

	/**
	 * Is this variant instance of kind {@code top_hits}?
	 */
	public boolean isTopHits() {
		return _kind == Kind.TopHits;
	}

	/**
	 * Get the {@code top_hits} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_hits} kind.
	 */
	public TopHitsAggregate topHits() {
		return TaggedUnionUtils.get(this, Kind.TopHits);
	}

	/**
	 * Is this variant instance of kind {@code top_metrics}?
	 */
	public boolean isTopMetrics() {
		return _kind == Kind.TopMetrics;
	}

	/**
	 * Get the {@code top_metrics} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_metrics} kind.
	 */
	public TopMetricsAggregate topMetrics() {
		return TaggedUnionUtils.get(this, Kind.TopMetrics);
	}

	/**
	 * Is this variant instance of kind {@code umrareterms}?
	 */
	public boolean isUmrareterms() {
		return _kind == Kind.Umrareterms;
	}

	/**
	 * Get the {@code umrareterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code umrareterms} kind.
	 */
	public UnmappedRareTermsAggregate umrareterms() {
		return TaggedUnionUtils.get(this, Kind.Umrareterms);
	}

	/**
	 * Is this variant instance of kind {@code umsigterms}?
	 */
	public boolean isUmsigterms() {
		return _kind == Kind.Umsigterms;
	}

	/**
	 * Get the {@code umsigterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code umsigterms} kind.
	 */
	public UnmappedSignificantTermsAggregate umsigterms() {
		return TaggedUnionUtils.get(this, Kind.Umsigterms);
	}

	/**
	 * Is this variant instance of kind {@code umterms}?
	 */
	public boolean isUmterms() {
		return _kind == Kind.Umterms;
	}

	/**
	 * Get the {@code umterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code umterms} kind.
	 */
	public UnmappedTermsAggregate umterms() {
		return TaggedUnionUtils.get(this, Kind.Umterms);
	}

	/**
	 * Is this variant instance of kind {@code value_count}?
	 */
	public boolean isValueCount() {
		return _kind == Kind.ValueCount;
	}

	/**
	 * Get the {@code value_count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value_count} kind.
	 */
	public ValueCountAggregate valueCount() {
		return TaggedUnionUtils.get(this, Kind.ValueCount);
	}

	/**
	 * Is this variant instance of kind {@code variable_width_histogram}?
	 */
	public boolean isVariableWidthHistogram() {
		return _kind == Kind.VariableWidthHistogram;
	}

	/**
	 * Get the {@code variable_width_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code variable_width_histogram} kind.
	 */
	public VariableWidthHistogramAggregate variableWidthHistogram() {
		return TaggedUnionUtils.get(this, Kind.VariableWidthHistogram);
	}

	/**
	 * Is this variant instance of kind {@code weighted_avg}?
	 */
	public boolean isWeightedAvg() {
		return _kind == Kind.WeightedAvg;
	}

	/**
	 * Get the {@code weighted_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weighted_avg} kind.
	 */
	public WeightedAvgAggregate weightedAvg() {
		return TaggedUnionUtils.get(this, Kind.WeightedAvg);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Aggregate> {
		private Kind _kind;
		private AggregateVariant _value;

		public ObjectBuilder<Aggregate> adjacencyMatrix(AdjacencyMatrixAggregate v) {
			this._kind = Kind.AdjacencyMatrix;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> adjacencyMatrix(Consumer<AdjacencyMatrixAggregate.Builder> fn) {
			AdjacencyMatrixAggregate.Builder builder = new AdjacencyMatrixAggregate.Builder();
			fn.accept(builder);
			return this.adjacencyMatrix(builder.build());
		}

		public ObjectBuilder<Aggregate> autoDateHistogram(AutoDateHistogramAggregate v) {
			this._kind = Kind.AutoDateHistogram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> autoDateHistogram(Consumer<AutoDateHistogramAggregate.Builder> fn) {
			AutoDateHistogramAggregate.Builder builder = new AutoDateHistogramAggregate.Builder();
			fn.accept(builder);
			return this.autoDateHistogram(builder.build());
		}

		public ObjectBuilder<Aggregate> avg(AvgAggregate v) {
			this._kind = Kind.Avg;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> avg(Consumer<AvgAggregate.Builder> fn) {
			AvgAggregate.Builder builder = new AvgAggregate.Builder();
			fn.accept(builder);
			return this.avg(builder.build());
		}

		public ObjectBuilder<Aggregate> boxPlot(BoxPlotAggregate v) {
			this._kind = Kind.BoxPlot;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> boxPlot(Consumer<BoxPlotAggregate.Builder> fn) {
			BoxPlotAggregate.Builder builder = new BoxPlotAggregate.Builder();
			fn.accept(builder);
			return this.boxPlot(builder.build());
		}

		public ObjectBuilder<Aggregate> bucketMetricValue(BucketMetricValueAggregate v) {
			this._kind = Kind.BucketMetricValue;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> bucketMetricValue(Consumer<BucketMetricValueAggregate.Builder> fn) {
			BucketMetricValueAggregate.Builder builder = new BucketMetricValueAggregate.Builder();
			fn.accept(builder);
			return this.bucketMetricValue(builder.build());
		}

		public ObjectBuilder<Aggregate> cardinality(CardinalityAggregate v) {
			this._kind = Kind.Cardinality;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> cardinality(Consumer<CardinalityAggregate.Builder> fn) {
			CardinalityAggregate.Builder builder = new CardinalityAggregate.Builder();
			fn.accept(builder);
			return this.cardinality(builder.build());
		}

		public ObjectBuilder<Aggregate> children(ChildrenAggregate v) {
			this._kind = Kind.Children;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> children(Consumer<ChildrenAggregate.Builder> fn) {
			ChildrenAggregate.Builder builder = new ChildrenAggregate.Builder();
			fn.accept(builder);
			return this.children(builder.build());
		}

		public ObjectBuilder<Aggregate> composite(CompositeAggregate v) {
			this._kind = Kind.Composite;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> composite(Consumer<CompositeAggregate.Builder> fn) {
			CompositeAggregate.Builder builder = new CompositeAggregate.Builder();
			fn.accept(builder);
			return this.composite(builder.build());
		}

		public ObjectBuilder<Aggregate> simpleLongValue(CumulativeCardinalityAggregate v) {
			this._kind = Kind.SimpleLongValue;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> simpleLongValue(Consumer<CumulativeCardinalityAggregate.Builder> fn) {
			CumulativeCardinalityAggregate.Builder builder = new CumulativeCardinalityAggregate.Builder();
			fn.accept(builder);
			return this.simpleLongValue(builder.build());
		}

		public ObjectBuilder<Aggregate> dateHistogram(DateHistogramAggregate v) {
			this._kind = Kind.DateHistogram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> dateHistogram(Consumer<DateHistogramAggregate.Builder> fn) {
			DateHistogramAggregate.Builder builder = new DateHistogramAggregate.Builder();
			fn.accept(builder);
			return this.dateHistogram(builder.build());
		}

		public ObjectBuilder<Aggregate> dateRange(DateRangeAggregate v) {
			this._kind = Kind.DateRange;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> dateRange(Consumer<DateRangeAggregate.Builder> fn) {
			DateRangeAggregate.Builder builder = new DateRangeAggregate.Builder();
			fn.accept(builder);
			return this.dateRange(builder.build());
		}

		public ObjectBuilder<Aggregate> derivative(DerivativeAggregate v) {
			this._kind = Kind.Derivative;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> derivative(Consumer<DerivativeAggregate.Builder> fn) {
			DerivativeAggregate.Builder builder = new DerivativeAggregate.Builder();
			fn.accept(builder);
			return this.derivative(builder.build());
		}

		public ObjectBuilder<Aggregate> dterms(DoubleTermsAggregate v) {
			this._kind = Kind.Dterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> dterms(Consumer<DoubleTermsAggregate.Builder> fn) {
			DoubleTermsAggregate.Builder builder = new DoubleTermsAggregate.Builder();
			fn.accept(builder);
			return this.dterms(builder.build());
		}

		public ObjectBuilder<Aggregate> extendedStats(ExtendedStatsAggregate v) {
			this._kind = Kind.ExtendedStats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> extendedStats(Consumer<ExtendedStatsAggregate.Builder> fn) {
			ExtendedStatsAggregate.Builder builder = new ExtendedStatsAggregate.Builder();
			fn.accept(builder);
			return this.extendedStats(builder.build());
		}

		public ObjectBuilder<Aggregate> extendedStatsBucket(ExtendedStatsBucketAggregate v) {
			this._kind = Kind.ExtendedStatsBucket;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> extendedStatsBucket(Consumer<ExtendedStatsBucketAggregate.Builder> fn) {
			ExtendedStatsBucketAggregate.Builder builder = new ExtendedStatsBucketAggregate.Builder();
			fn.accept(builder);
			return this.extendedStatsBucket(builder.build());
		}

		public ObjectBuilder<Aggregate> filter(FilterAggregate v) {
			this._kind = Kind.Filter;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> filter(Consumer<FilterAggregate.Builder> fn) {
			FilterAggregate.Builder builder = new FilterAggregate.Builder();
			fn.accept(builder);
			return this.filter(builder.build());
		}

		public ObjectBuilder<Aggregate> filters(FiltersAggregate v) {
			this._kind = Kind.Filters;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> filters(Consumer<FiltersAggregate.Builder> fn) {
			FiltersAggregate.Builder builder = new FiltersAggregate.Builder();
			fn.accept(builder);
			return this.filters(builder.build());
		}

		public ObjectBuilder<Aggregate> geoBounds(GeoBoundsAggregate v) {
			this._kind = Kind.GeoBounds;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> geoBounds(Consumer<GeoBoundsAggregate.Builder> fn) {
			GeoBoundsAggregate.Builder builder = new GeoBoundsAggregate.Builder();
			fn.accept(builder);
			return this.geoBounds(builder.build());
		}

		public ObjectBuilder<Aggregate> geoCentroid(GeoCentroidAggregate v) {
			this._kind = Kind.GeoCentroid;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> geoCentroid(Consumer<GeoCentroidAggregate.Builder> fn) {
			GeoCentroidAggregate.Builder builder = new GeoCentroidAggregate.Builder();
			fn.accept(builder);
			return this.geoCentroid(builder.build());
		}

		public ObjectBuilder<Aggregate> geoDistance(GeoDistanceAggregate v) {
			this._kind = Kind.GeoDistance;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> geoDistance(Consumer<GeoDistanceAggregate.Builder> fn) {
			GeoDistanceAggregate.Builder builder = new GeoDistanceAggregate.Builder();
			fn.accept(builder);
			return this.geoDistance(builder.build());
		}

		public ObjectBuilder<Aggregate> geohashGrid(GeoHashGridAggregate v) {
			this._kind = Kind.GeohashGrid;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> geohashGrid(Consumer<GeoHashGridAggregate.Builder> fn) {
			GeoHashGridAggregate.Builder builder = new GeoHashGridAggregate.Builder();
			fn.accept(builder);
			return this.geohashGrid(builder.build());
		}

		public ObjectBuilder<Aggregate> geoLine(GeoLineAggregate v) {
			this._kind = Kind.GeoLine;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> geoLine(Consumer<GeoLineAggregate.Builder> fn) {
			GeoLineAggregate.Builder builder = new GeoLineAggregate.Builder();
			fn.accept(builder);
			return this.geoLine(builder.build());
		}

		public ObjectBuilder<Aggregate> geotileGrid(GeoTileGridAggregate v) {
			this._kind = Kind.GeotileGrid;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> geotileGrid(Consumer<GeoTileGridAggregate.Builder> fn) {
			GeoTileGridAggregate.Builder builder = new GeoTileGridAggregate.Builder();
			fn.accept(builder);
			return this.geotileGrid(builder.build());
		}

		public ObjectBuilder<Aggregate> global(GlobalAggregate v) {
			this._kind = Kind.Global;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> global(Consumer<GlobalAggregate.Builder> fn) {
			GlobalAggregate.Builder builder = new GlobalAggregate.Builder();
			fn.accept(builder);
			return this.global(builder.build());
		}

		public ObjectBuilder<Aggregate> hdrPercentileRanks(HdrPercentileRanksAggregate v) {
			this._kind = Kind.HdrPercentileRanks;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> hdrPercentileRanks(Consumer<HdrPercentileRanksAggregate.Builder> fn) {
			HdrPercentileRanksAggregate.Builder builder = new HdrPercentileRanksAggregate.Builder();
			fn.accept(builder);
			return this.hdrPercentileRanks(builder.build());
		}

		public ObjectBuilder<Aggregate> hdrPercentiles(HdrPercentilesAggregate v) {
			this._kind = Kind.HdrPercentiles;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> hdrPercentiles(Consumer<HdrPercentilesAggregate.Builder> fn) {
			HdrPercentilesAggregate.Builder builder = new HdrPercentilesAggregate.Builder();
			fn.accept(builder);
			return this.hdrPercentiles(builder.build());
		}

		public ObjectBuilder<Aggregate> histogram(HistogramAggregate v) {
			this._kind = Kind.Histogram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> histogram(Consumer<HistogramAggregate.Builder> fn) {
			HistogramAggregate.Builder builder = new HistogramAggregate.Builder();
			fn.accept(builder);
			return this.histogram(builder.build());
		}

		public ObjectBuilder<Aggregate> inference(InferenceAggregate v) {
			this._kind = Kind.Inference;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> inference(Consumer<InferenceAggregate.Builder> fn) {
			InferenceAggregate.Builder builder = new InferenceAggregate.Builder();
			fn.accept(builder);
			return this.inference(builder.build());
		}

		public ObjectBuilder<Aggregate> ipRange(IpRangeAggregate v) {
			this._kind = Kind.IpRange;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> ipRange(Consumer<IpRangeAggregate.Builder> fn) {
			IpRangeAggregate.Builder builder = new IpRangeAggregate.Builder();
			fn.accept(builder);
			return this.ipRange(builder.build());
		}

		public ObjectBuilder<Aggregate> lrareterms(LongRareTermsAggregate v) {
			this._kind = Kind.Lrareterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> lrareterms(Consumer<LongRareTermsAggregate.Builder> fn) {
			LongRareTermsAggregate.Builder builder = new LongRareTermsAggregate.Builder();
			fn.accept(builder);
			return this.lrareterms(builder.build());
		}

		public ObjectBuilder<Aggregate> lterms(LongTermsAggregate v) {
			this._kind = Kind.Lterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> lterms(Consumer<LongTermsAggregate.Builder> fn) {
			LongTermsAggregate.Builder builder = new LongTermsAggregate.Builder();
			fn.accept(builder);
			return this.lterms(builder.build());
		}

		public ObjectBuilder<Aggregate> matrixStats(MatrixStatsAggregate v) {
			this._kind = Kind.MatrixStats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> matrixStats(Consumer<MatrixStatsAggregate.Builder> fn) {
			MatrixStatsAggregate.Builder builder = new MatrixStatsAggregate.Builder();
			fn.accept(builder);
			return this.matrixStats(builder.build());
		}

		public ObjectBuilder<Aggregate> max(MaxAggregate v) {
			this._kind = Kind.Max;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> max(Consumer<MaxAggregate.Builder> fn) {
			MaxAggregate.Builder builder = new MaxAggregate.Builder();
			fn.accept(builder);
			return this.max(builder.build());
		}

		public ObjectBuilder<Aggregate> medianAbsoluteDeviation(MedianAbsoluteDeviationAggregate v) {
			this._kind = Kind.MedianAbsoluteDeviation;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> medianAbsoluteDeviation(Consumer<MedianAbsoluteDeviationAggregate.Builder> fn) {
			MedianAbsoluteDeviationAggregate.Builder builder = new MedianAbsoluteDeviationAggregate.Builder();
			fn.accept(builder);
			return this.medianAbsoluteDeviation(builder.build());
		}

		public ObjectBuilder<Aggregate> min(MinAggregate v) {
			this._kind = Kind.Min;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> min(Consumer<MinAggregate.Builder> fn) {
			MinAggregate.Builder builder = new MinAggregate.Builder();
			fn.accept(builder);
			return this.min(builder.build());
		}

		public ObjectBuilder<Aggregate> missing(MissingAggregate v) {
			this._kind = Kind.Missing;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> missing(Consumer<MissingAggregate.Builder> fn) {
			MissingAggregate.Builder builder = new MissingAggregate.Builder();
			fn.accept(builder);
			return this.missing(builder.build());
		}

		public ObjectBuilder<Aggregate> multiTerms(MultiTermsAggregate v) {
			this._kind = Kind.MultiTerms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> multiTerms(Consumer<MultiTermsAggregate.Builder> fn) {
			MultiTermsAggregate.Builder builder = new MultiTermsAggregate.Builder();
			fn.accept(builder);
			return this.multiTerms(builder.build());
		}

		public ObjectBuilder<Aggregate> nested(NestedAggregate v) {
			this._kind = Kind.Nested;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> nested(Consumer<NestedAggregate.Builder> fn) {
			NestedAggregate.Builder builder = new NestedAggregate.Builder();
			fn.accept(builder);
			return this.nested(builder.build());
		}

		public ObjectBuilder<Aggregate> percentilesBucket(PercentilesBucketAggregate v) {
			this._kind = Kind.PercentilesBucket;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> percentilesBucket(Consumer<PercentilesBucketAggregate.Builder> fn) {
			PercentilesBucketAggregate.Builder builder = new PercentilesBucketAggregate.Builder();
			fn.accept(builder);
			return this.percentilesBucket(builder.build());
		}

		public ObjectBuilder<Aggregate> range(RangeAggregate v) {
			this._kind = Kind.Range;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> range(Consumer<RangeAggregate.Builder> fn) {
			RangeAggregate.Builder builder = new RangeAggregate.Builder();
			fn.accept(builder);
			return this.range(builder.build());
		}

		public ObjectBuilder<Aggregate> rate(RateAggregate v) {
			this._kind = Kind.Rate;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> rate(Consumer<RateAggregate.Builder> fn) {
			RateAggregate.Builder builder = new RateAggregate.Builder();
			fn.accept(builder);
			return this.rate(builder.build());
		}

		public ObjectBuilder<Aggregate> reverseNested(ReverseNestedAggregate v) {
			this._kind = Kind.ReverseNested;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> reverseNested(Consumer<ReverseNestedAggregate.Builder> fn) {
			ReverseNestedAggregate.Builder builder = new ReverseNestedAggregate.Builder();
			fn.accept(builder);
			return this.reverseNested(builder.build());
		}

		public ObjectBuilder<Aggregate> sampler(SamplerAggregate v) {
			this._kind = Kind.Sampler;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> sampler(Consumer<SamplerAggregate.Builder> fn) {
			SamplerAggregate.Builder builder = new SamplerAggregate.Builder();
			fn.accept(builder);
			return this.sampler(builder.build());
		}

		public ObjectBuilder<Aggregate> scriptedMetric(ScriptedMetricAggregate v) {
			this._kind = Kind.ScriptedMetric;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> scriptedMetric(Consumer<ScriptedMetricAggregate.Builder> fn) {
			ScriptedMetricAggregate.Builder builder = new ScriptedMetricAggregate.Builder();
			fn.accept(builder);
			return this.scriptedMetric(builder.build());
		}

		public ObjectBuilder<Aggregate> siglterms(SignificantLongTermsAggregate v) {
			this._kind = Kind.Siglterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> siglterms(Consumer<SignificantLongTermsAggregate.Builder> fn) {
			SignificantLongTermsAggregate.Builder builder = new SignificantLongTermsAggregate.Builder();
			fn.accept(builder);
			return this.siglterms(builder.build());
		}

		public ObjectBuilder<Aggregate> sigsterms(SignificantStringTermsAggregate v) {
			this._kind = Kind.Sigsterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> sigsterms(Consumer<SignificantStringTermsAggregate.Builder> fn) {
			SignificantStringTermsAggregate.Builder builder = new SignificantStringTermsAggregate.Builder();
			fn.accept(builder);
			return this.sigsterms(builder.build());
		}

		public ObjectBuilder<Aggregate> simpleValue(SimpleValueAggregate v) {
			this._kind = Kind.SimpleValue;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> simpleValue(Consumer<SimpleValueAggregate.Builder> fn) {
			SimpleValueAggregate.Builder builder = new SimpleValueAggregate.Builder();
			fn.accept(builder);
			return this.simpleValue(builder.build());
		}

		public ObjectBuilder<Aggregate> stats(StatsAggregate v) {
			this._kind = Kind.Stats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> stats(Consumer<StatsAggregate.Builder> fn) {
			StatsAggregate.Builder builder = new StatsAggregate.Builder();
			fn.accept(builder);
			return this.stats(builder.build());
		}

		public ObjectBuilder<Aggregate> statsBucket(StatsBucketAggregate v) {
			this._kind = Kind.StatsBucket;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> statsBucket(Consumer<StatsBucketAggregate.Builder> fn) {
			StatsBucketAggregate.Builder builder = new StatsBucketAggregate.Builder();
			fn.accept(builder);
			return this.statsBucket(builder.build());
		}

		public ObjectBuilder<Aggregate> srareterms(StringRareTermsAggregate v) {
			this._kind = Kind.Srareterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> srareterms(Consumer<StringRareTermsAggregate.Builder> fn) {
			StringRareTermsAggregate.Builder builder = new StringRareTermsAggregate.Builder();
			fn.accept(builder);
			return this.srareterms(builder.build());
		}

		public ObjectBuilder<Aggregate> stringStats(StringStatsAggregate v) {
			this._kind = Kind.StringStats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> stringStats(Consumer<StringStatsAggregate.Builder> fn) {
			StringStatsAggregate.Builder builder = new StringStatsAggregate.Builder();
			fn.accept(builder);
			return this.stringStats(builder.build());
		}

		public ObjectBuilder<Aggregate> sterms(StringTermsAggregate v) {
			this._kind = Kind.Sterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> sterms(Consumer<StringTermsAggregate.Builder> fn) {
			StringTermsAggregate.Builder builder = new StringTermsAggregate.Builder();
			fn.accept(builder);
			return this.sterms(builder.build());
		}

		public ObjectBuilder<Aggregate> sum(SumAggregate v) {
			this._kind = Kind.Sum;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> sum(Consumer<SumAggregate.Builder> fn) {
			SumAggregate.Builder builder = new SumAggregate.Builder();
			fn.accept(builder);
			return this.sum(builder.build());
		}

		public ObjectBuilder<Aggregate> tdigestPercentileRanks(TDigestPercentileRanksAggregate v) {
			this._kind = Kind.TdigestPercentileRanks;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> tdigestPercentileRanks(Consumer<TDigestPercentileRanksAggregate.Builder> fn) {
			TDigestPercentileRanksAggregate.Builder builder = new TDigestPercentileRanksAggregate.Builder();
			fn.accept(builder);
			return this.tdigestPercentileRanks(builder.build());
		}

		public ObjectBuilder<Aggregate> tdigestPercentiles(TDigestPercentilesAggregate v) {
			this._kind = Kind.TdigestPercentiles;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> tdigestPercentiles(Consumer<TDigestPercentilesAggregate.Builder> fn) {
			TDigestPercentilesAggregate.Builder builder = new TDigestPercentilesAggregate.Builder();
			fn.accept(builder);
			return this.tdigestPercentiles(builder.build());
		}

		public ObjectBuilder<Aggregate> tTest(TTestAggregate v) {
			this._kind = Kind.TTest;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> tTest(Consumer<TTestAggregate.Builder> fn) {
			TTestAggregate.Builder builder = new TTestAggregate.Builder();
			fn.accept(builder);
			return this.tTest(builder.build());
		}

		public ObjectBuilder<Aggregate> topHits(TopHitsAggregate v) {
			this._kind = Kind.TopHits;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> topHits(Consumer<TopHitsAggregate.Builder> fn) {
			TopHitsAggregate.Builder builder = new TopHitsAggregate.Builder();
			fn.accept(builder);
			return this.topHits(builder.build());
		}

		public ObjectBuilder<Aggregate> topMetrics(TopMetricsAggregate v) {
			this._kind = Kind.TopMetrics;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> topMetrics(Consumer<TopMetricsAggregate.Builder> fn) {
			TopMetricsAggregate.Builder builder = new TopMetricsAggregate.Builder();
			fn.accept(builder);
			return this.topMetrics(builder.build());
		}

		public ObjectBuilder<Aggregate> umrareterms(UnmappedRareTermsAggregate v) {
			this._kind = Kind.Umrareterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> umrareterms(Consumer<UnmappedRareTermsAggregate.Builder> fn) {
			UnmappedRareTermsAggregate.Builder builder = new UnmappedRareTermsAggregate.Builder();
			fn.accept(builder);
			return this.umrareterms(builder.build());
		}

		public ObjectBuilder<Aggregate> umsigterms(UnmappedSignificantTermsAggregate v) {
			this._kind = Kind.Umsigterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> umsigterms(Consumer<UnmappedSignificantTermsAggregate.Builder> fn) {
			UnmappedSignificantTermsAggregate.Builder builder = new UnmappedSignificantTermsAggregate.Builder();
			fn.accept(builder);
			return this.umsigterms(builder.build());
		}

		public ObjectBuilder<Aggregate> umterms(UnmappedTermsAggregate v) {
			this._kind = Kind.Umterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> umterms(Consumer<UnmappedTermsAggregate.Builder> fn) {
			UnmappedTermsAggregate.Builder builder = new UnmappedTermsAggregate.Builder();
			fn.accept(builder);
			return this.umterms(builder.build());
		}

		public ObjectBuilder<Aggregate> valueCount(ValueCountAggregate v) {
			this._kind = Kind.ValueCount;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> valueCount(Consumer<ValueCountAggregate.Builder> fn) {
			ValueCountAggregate.Builder builder = new ValueCountAggregate.Builder();
			fn.accept(builder);
			return this.valueCount(builder.build());
		}

		public ObjectBuilder<Aggregate> variableWidthHistogram(VariableWidthHistogramAggregate v) {
			this._kind = Kind.VariableWidthHistogram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> variableWidthHistogram(Consumer<VariableWidthHistogramAggregate.Builder> fn) {
			VariableWidthHistogramAggregate.Builder builder = new VariableWidthHistogramAggregate.Builder();
			fn.accept(builder);
			return this.variableWidthHistogram(builder.build());
		}

		public ObjectBuilder<Aggregate> weightedAvg(WeightedAvgAggregate v) {
			this._kind = Kind.WeightedAvg;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Aggregate> weightedAvg(Consumer<WeightedAvgAggregate.Builder> fn) {
			WeightedAvgAggregate.Builder builder = new WeightedAvgAggregate.Builder();
			fn.accept(builder);
			return this.weightedAvg(builder.build());
		}

		public Aggregate build() {
			_checkSingleUse();
			return new Aggregate(this);
		}

	}

	public static final ExternallyTaggedUnion.TypedKeysDeserializer<Aggregate> _TYPED_KEYS_DESERIALIZER;

	static {
		Map<String, JsonpDeserializer<? extends AggregateVariant>> deserializers = new HashMap<>();
		deserializers.put("adjacency_matrix", AdjacencyMatrixAggregate._DESERIALIZER);
		deserializers.put("auto_date_histogram", AutoDateHistogramAggregate._DESERIALIZER);
		deserializers.put("avg", AvgAggregate._DESERIALIZER);
		deserializers.put("box_plot", BoxPlotAggregate._DESERIALIZER);
		deserializers.put("bucket_metric_value", BucketMetricValueAggregate._DESERIALIZER);
		deserializers.put("cardinality", CardinalityAggregate._DESERIALIZER);
		deserializers.put("children", ChildrenAggregate._DESERIALIZER);
		deserializers.put("composite", CompositeAggregate._DESERIALIZER);
		deserializers.put("simple_long_value", CumulativeCardinalityAggregate._DESERIALIZER);
		deserializers.put("date_histogram", DateHistogramAggregate._DESERIALIZER);
		deserializers.put("date_range", DateRangeAggregate._DESERIALIZER);
		deserializers.put("derivative", DerivativeAggregate._DESERIALIZER);
		deserializers.put("dterms", DoubleTermsAggregate._DESERIALIZER);
		deserializers.put("extended_stats", ExtendedStatsAggregate._DESERIALIZER);
		deserializers.put("extended_stats_bucket", ExtendedStatsBucketAggregate._DESERIALIZER);
		deserializers.put("filter", FilterAggregate._DESERIALIZER);
		deserializers.put("filters", FiltersAggregate._DESERIALIZER);
		deserializers.put("geo_bounds", GeoBoundsAggregate._DESERIALIZER);
		deserializers.put("geo_centroid", GeoCentroidAggregate._DESERIALIZER);
		deserializers.put("geo_distance", GeoDistanceAggregate._DESERIALIZER);
		deserializers.put("geohash_grid", GeoHashGridAggregate._DESERIALIZER);
		deserializers.put("geo_line", GeoLineAggregate._DESERIALIZER);
		deserializers.put("geotile_grid", GeoTileGridAggregate._DESERIALIZER);
		deserializers.put("global", GlobalAggregate._DESERIALIZER);
		deserializers.put("hdr_percentile_ranks", HdrPercentileRanksAggregate._DESERIALIZER);
		deserializers.put("hdr_percentiles", HdrPercentilesAggregate._DESERIALIZER);
		deserializers.put("histogram", HistogramAggregate._DESERIALIZER);
		deserializers.put("inference", InferenceAggregate._DESERIALIZER);
		deserializers.put("ip_range", IpRangeAggregate._DESERIALIZER);
		deserializers.put("lrareterms", LongRareTermsAggregate._DESERIALIZER);
		deserializers.put("lterms", LongTermsAggregate._DESERIALIZER);
		deserializers.put("matrix_stats", MatrixStatsAggregate._DESERIALIZER);
		deserializers.put("max", MaxAggregate._DESERIALIZER);
		deserializers.put("median_absolute_deviation", MedianAbsoluteDeviationAggregate._DESERIALIZER);
		deserializers.put("min", MinAggregate._DESERIALIZER);
		deserializers.put("missing", MissingAggregate._DESERIALIZER);
		deserializers.put("multi_terms", MultiTermsAggregate._DESERIALIZER);
		deserializers.put("nested", NestedAggregate._DESERIALIZER);
		deserializers.put("percentiles_bucket", PercentilesBucketAggregate._DESERIALIZER);
		deserializers.put("range", RangeAggregate._DESERIALIZER);
		deserializers.put("rate", RateAggregate._DESERIALIZER);
		deserializers.put("reverse_nested", ReverseNestedAggregate._DESERIALIZER);
		deserializers.put("sampler", SamplerAggregate._DESERIALIZER);
		deserializers.put("scripted_metric", ScriptedMetricAggregate._DESERIALIZER);
		deserializers.put("siglterms", SignificantLongTermsAggregate._DESERIALIZER);
		deserializers.put("sigsterms", SignificantStringTermsAggregate._DESERIALIZER);
		deserializers.put("simple_value", SimpleValueAggregate._DESERIALIZER);
		deserializers.put("stats", StatsAggregate._DESERIALIZER);
		deserializers.put("stats_bucket", StatsBucketAggregate._DESERIALIZER);
		deserializers.put("srareterms", StringRareTermsAggregate._DESERIALIZER);
		deserializers.put("string_stats", StringStatsAggregate._DESERIALIZER);
		deserializers.put("sterms", StringTermsAggregate._DESERIALIZER);
		deserializers.put("sum", SumAggregate._DESERIALIZER);
		deserializers.put("tdigest_percentile_ranks", TDigestPercentileRanksAggregate._DESERIALIZER);
		deserializers.put("tdigest_percentiles", TDigestPercentilesAggregate._DESERIALIZER);
		deserializers.put("t_test", TTestAggregate._DESERIALIZER);
		deserializers.put("top_hits", TopHitsAggregate._DESERIALIZER);
		deserializers.put("top_metrics", TopMetricsAggregate._DESERIALIZER);
		deserializers.put("umrareterms", UnmappedRareTermsAggregate._DESERIALIZER);
		deserializers.put("umsigterms", UnmappedSignificantTermsAggregate._DESERIALIZER);
		deserializers.put("umterms", UnmappedTermsAggregate._DESERIALIZER);
		deserializers.put("value_count", ValueCountAggregate._DESERIALIZER);
		deserializers.put("variable_width_histogram", VariableWidthHistogramAggregate._DESERIALIZER);
		deserializers.put("weighted_avg", WeightedAvgAggregate._DESERIALIZER);

		_TYPED_KEYS_DESERIALIZER = new ExternallyTaggedUnion.Deserializer<>(deserializers,
				(name, value) -> new Aggregate(value)).typedKeys();
	}
}
