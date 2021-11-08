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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.Aggregate

public class Aggregate implements TaggedUnion<AggregateVariant>, JsonpSerializable {

	public static final String ADJACENCY_MATRIX = "adjacency_matrix";
	public static final String AUTO_DATE_HISTOGRAM = "auto_date_histogram";
	public static final String AVG = "avg";
	public static final String BOX_PLOT = "box_plot";
	public static final String BUCKET_METRIC_VALUE = "bucket_metric_value";
	public static final String CARDINALITY = "cardinality";
	public static final String CHILDREN = "children";
	public static final String COMPOSITE = "composite";
	public static final String SIMPLE_LONG_VALUE = "simple_long_value";
	public static final String DATE_HISTOGRAM = "date_histogram";
	public static final String DATE_RANGE = "date_range";
	public static final String DERIVATIVE = "derivative";
	public static final String DTERMS = "dterms";
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
	public static final String HDR_PERCENTILE_RANKS = "hdr_percentile_ranks";
	public static final String HDR_PERCENTILES = "hdr_percentiles";
	public static final String HISTOGRAM = "histogram";
	public static final String INFERENCE = "inference";
	public static final String IP_RANGE = "ip_range";
	public static final String LRARETERMS = "lrareterms";
	public static final String LTERMS = "lterms";
	public static final String MATRIX_STATS = "matrix_stats";
	public static final String MAX = "max";
	public static final String MEDIAN_ABSOLUTE_DEVIATION = "median_absolute_deviation";
	public static final String MIN = "min";
	public static final String MISSING = "missing";
	public static final String MULTI_TERMS = "multi_terms";
	public static final String NESTED = "nested";
	public static final String PERCENTILES_BUCKET = "percentiles_bucket";
	public static final String RANGE = "range";
	public static final String RATE = "rate";
	public static final String REVERSE_NESTED = "reverse_nested";
	public static final String SAMPLER = "sampler";
	public static final String SCRIPTED_METRIC = "scripted_metric";
	public static final String SIGLTERMS = "siglterms";
	public static final String SIGSTERMS = "sigsterms";
	public static final String SIMPLE_VALUE = "simple_value";
	public static final String STATS = "stats";
	public static final String STATS_BUCKET = "stats_bucket";
	public static final String SRARETERMS = "srareterms";
	public static final String STRING_STATS = "string_stats";
	public static final String STERMS = "sterms";
	public static final String SUM = "sum";
	public static final String TDIGEST_PERCENTILE_RANKS = "tdigest_percentile_ranks";
	public static final String TDIGEST_PERCENTILES = "tdigest_percentiles";
	public static final String T_TEST = "t_test";
	public static final String TOP_HITS = "top_hits";
	public static final String TOP_METRICS = "top_metrics";
	public static final String UMRARETERMS = "umrareterms";
	public static final String UMSIGTERMS = "umsigterms";
	public static final String UMTERMS = "umterms";
	public static final String VALUE_COUNT = "value_count";
	public static final String VARIABLE_WIDTH_HISTOGRAM = "variable_width_histogram";
	public static final String WEIGHTED_AVG = "weighted_avg";

	// Tagged union implementation

	private final String _type;
	private final AggregateVariant _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final AggregateVariant _get() {
		return _value;
	}

	public Aggregate(AggregateVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Aggregate(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Aggregate of(Function<Builder, ObjectBuilder<Aggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code adjacency_matrix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code adjacency_matrix}
	 *             kind.
	 */
	public AdjacencyMatrixAggregate adjacencyMatrix() {
		return TaggedUnionUtils.get(this, ADJACENCY_MATRIX);
	}

	/**
	 * Get the {@code auto_date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code auto_date_histogram}
	 *             kind.
	 */
	public AutoDateHistogramAggregate autoDateHistogram() {
		return TaggedUnionUtils.get(this, AUTO_DATE_HISTOGRAM);
	}

	/**
	 * Get the {@code avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code avg} kind.
	 */
	public AvgAggregate avg() {
		return TaggedUnionUtils.get(this, AVG);
	}

	/**
	 * Get the {@code box_plot} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code box_plot} kind.
	 */
	public BoxPlotAggregate boxPlot() {
		return TaggedUnionUtils.get(this, BOX_PLOT);
	}

	/**
	 * Get the {@code bucket_metric_value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bucket_metric_value}
	 *             kind.
	 */
	public BucketMetricValueAggregate bucketMetricValue() {
		return TaggedUnionUtils.get(this, BUCKET_METRIC_VALUE);
	}

	/**
	 * Get the {@code cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cardinality} kind.
	 */
	public CardinalityAggregate cardinality() {
		return TaggedUnionUtils.get(this, CARDINALITY);
	}

	/**
	 * Get the {@code children} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code children} kind.
	 */
	public ChildrenAggregate children() {
		return TaggedUnionUtils.get(this, CHILDREN);
	}

	/**
	 * Get the {@code composite} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code composite} kind.
	 */
	public CompositeAggregate composite() {
		return TaggedUnionUtils.get(this, COMPOSITE);
	}

	/**
	 * Get the {@code simple_long_value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_long_value}
	 *             kind.
	 */
	public CumulativeCardinalityAggregate simpleLongValue() {
		return TaggedUnionUtils.get(this, SIMPLE_LONG_VALUE);
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public DateHistogramAggregate dateHistogram() {
		return TaggedUnionUtils.get(this, DATE_HISTOGRAM);
	}

	/**
	 * Get the {@code date_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_range} kind.
	 */
	public DateRangeAggregate dateRange() {
		return TaggedUnionUtils.get(this, DATE_RANGE);
	}

	/**
	 * Get the {@code derivative} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code derivative} kind.
	 */
	public DerivativeAggregate derivative() {
		return TaggedUnionUtils.get(this, DERIVATIVE);
	}

	/**
	 * Get the {@code dterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dterms} kind.
	 */
	public DoubleTermsAggregate dterms() {
		return TaggedUnionUtils.get(this, DTERMS);
	}

	/**
	 * Get the {@code extended_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code extended_stats} kind.
	 */
	public ExtendedStatsAggregate extendedStats() {
		return TaggedUnionUtils.get(this, EXTENDED_STATS);
	}

	/**
	 * Get the {@code extended_stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code extended_stats_bucket} kind.
	 */
	public ExtendedStatsBucketAggregate extendedStatsBucket() {
		return TaggedUnionUtils.get(this, EXTENDED_STATS_BUCKET);
	}

	/**
	 * Get the {@code filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filter} kind.
	 */
	public FilterAggregate filter() {
		return TaggedUnionUtils.get(this, FILTER);
	}

	/**
	 * Get the {@code filters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filters} kind.
	 */
	public FiltersAggregate filters() {
		return TaggedUnionUtils.get(this, FILTERS);
	}

	/**
	 * Get the {@code geo_bounds} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounds} kind.
	 */
	public GeoBoundsAggregate geoBounds() {
		return TaggedUnionUtils.get(this, GEO_BOUNDS);
	}

	/**
	 * Get the {@code geo_centroid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_centroid} kind.
	 */
	public GeoCentroidAggregate geoCentroid() {
		return TaggedUnionUtils.get(this, GEO_CENTROID);
	}

	/**
	 * Get the {@code geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_distance} kind.
	 */
	public GeoDistanceAggregate geoDistance() {
		return TaggedUnionUtils.get(this, GEO_DISTANCE);
	}

	/**
	 * Get the {@code geohash_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash_grid} kind.
	 */
	public GeoHashGridAggregate geohashGrid() {
		return TaggedUnionUtils.get(this, GEOHASH_GRID);
	}

	/**
	 * Get the {@code geo_line} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_line} kind.
	 */
	public GeoLineAggregate geoLine() {
		return TaggedUnionUtils.get(this, GEO_LINE);
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public GeoTileGridAggregate geotileGrid() {
		return TaggedUnionUtils.get(this, GEOTILE_GRID);
	}

	/**
	 * Get the {@code global} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code global} kind.
	 */
	public GlobalAggregate global() {
		return TaggedUnionUtils.get(this, GLOBAL);
	}

	/**
	 * Get the {@code hdr_percentile_ranks} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hdr_percentile_ranks}
	 *             kind.
	 */
	public HdrPercentileRanksAggregate hdrPercentileRanks() {
		return TaggedUnionUtils.get(this, HDR_PERCENTILE_RANKS);
	}

	/**
	 * Get the {@code hdr_percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hdr_percentiles}
	 *             kind.
	 */
	public HdrPercentilesAggregate hdrPercentiles() {
		return TaggedUnionUtils.get(this, HDR_PERCENTILES);
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramAggregate histogram() {
		return TaggedUnionUtils.get(this, HISTOGRAM);
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceAggregate inference() {
		return TaggedUnionUtils.get(this, INFERENCE);
	}

	/**
	 * Get the {@code ip_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ip_range} kind.
	 */
	public IpRangeAggregate ipRange() {
		return TaggedUnionUtils.get(this, IP_RANGE);
	}

	/**
	 * Get the {@code lrareterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lrareterms} kind.
	 */
	public LongRareTermsAggregate lrareterms() {
		return TaggedUnionUtils.get(this, LRARETERMS);
	}

	/**
	 * Get the {@code lterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lterms} kind.
	 */
	public LongTermsAggregate lterms() {
		return TaggedUnionUtils.get(this, LTERMS);
	}

	/**
	 * Get the {@code matrix_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code matrix_stats} kind.
	 */
	public MatrixStatsAggregate matrixStats() {
		return TaggedUnionUtils.get(this, MATRIX_STATS);
	}

	/**
	 * Get the {@code max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code max} kind.
	 */
	public MaxAggregate max() {
		return TaggedUnionUtils.get(this, MAX);
	}

	/**
	 * Get the {@code median_absolute_deviation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code median_absolute_deviation} kind.
	 */
	public MedianAbsoluteDeviationAggregate medianAbsoluteDeviation() {
		return TaggedUnionUtils.get(this, MEDIAN_ABSOLUTE_DEVIATION);
	}

	/**
	 * Get the {@code min} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min} kind.
	 */
	public MinAggregate min() {
		return TaggedUnionUtils.get(this, MIN);
	}

	/**
	 * Get the {@code missing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code missing} kind.
	 */
	public MissingAggregate missing() {
		return TaggedUnionUtils.get(this, MISSING);
	}

	/**
	 * Get the {@code multi_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_terms} kind.
	 */
	public MultiTermsAggregate multiTerms() {
		return TaggedUnionUtils.get(this, MULTI_TERMS);
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedAggregate nested() {
		return TaggedUnionUtils.get(this, NESTED);
	}

	/**
	 * Get the {@code percentiles_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percentiles_bucket}
	 *             kind.
	 */
	public PercentilesBucketAggregate percentilesBucket() {
		return TaggedUnionUtils.get(this, PERCENTILES_BUCKET);
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeAggregate range() {
		return TaggedUnionUtils.get(this, RANGE);
	}

	/**
	 * Get the {@code rate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rate} kind.
	 */
	public RateAggregate rate() {
		return TaggedUnionUtils.get(this, RATE);
	}

	/**
	 * Get the {@code reverse_nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse_nested} kind.
	 */
	public ReverseNestedAggregate reverseNested() {
		return TaggedUnionUtils.get(this, REVERSE_NESTED);
	}

	/**
	 * Get the {@code sampler} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sampler} kind.
	 */
	public SamplerAggregate sampler() {
		return TaggedUnionUtils.get(this, SAMPLER);
	}

	/**
	 * Get the {@code scripted_metric} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scripted_metric}
	 *             kind.
	 */
	public ScriptedMetricAggregate scriptedMetric() {
		return TaggedUnionUtils.get(this, SCRIPTED_METRIC);
	}

	/**
	 * Get the {@code siglterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code siglterms} kind.
	 */
	public SignificantLongTermsAggregate siglterms() {
		return TaggedUnionUtils.get(this, SIGLTERMS);
	}

	/**
	 * Get the {@code sigsterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sigsterms} kind.
	 */
	public SignificantStringTermsAggregate sigsterms() {
		return TaggedUnionUtils.get(this, SIGSTERMS);
	}

	/**
	 * Get the {@code simple_value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_value} kind.
	 */
	public SimpleValueAggregate simpleValue() {
		return TaggedUnionUtils.get(this, SIMPLE_VALUE);
	}

	/**
	 * Get the {@code stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats} kind.
	 */
	public StatsAggregate stats() {
		return TaggedUnionUtils.get(this, STATS);
	}

	/**
	 * Get the {@code stats_bucket} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats_bucket} kind.
	 */
	public StatsBucketAggregate statsBucket() {
		return TaggedUnionUtils.get(this, STATS_BUCKET);
	}

	/**
	 * Get the {@code srareterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code srareterms} kind.
	 */
	public StringRareTermsAggregate srareterms() {
		return TaggedUnionUtils.get(this, SRARETERMS);
	}

	/**
	 * Get the {@code string_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string_stats} kind.
	 */
	public StringStatsAggregate stringStats() {
		return TaggedUnionUtils.get(this, STRING_STATS);
	}

	/**
	 * Get the {@code sterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sterms} kind.
	 */
	public StringTermsAggregate sterms() {
		return TaggedUnionUtils.get(this, STERMS);
	}

	/**
	 * Get the {@code sum} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sum} kind.
	 */
	public SumAggregate sum() {
		return TaggedUnionUtils.get(this, SUM);
	}

	/**
	 * Get the {@code tdigest_percentile_ranks} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code tdigest_percentile_ranks} kind.
	 */
	public TDigestPercentileRanksAggregate tdigestPercentileRanks() {
		return TaggedUnionUtils.get(this, TDIGEST_PERCENTILE_RANKS);
	}

	/**
	 * Get the {@code tdigest_percentiles} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code tdigest_percentiles}
	 *             kind.
	 */
	public TDigestPercentilesAggregate tdigestPercentiles() {
		return TaggedUnionUtils.get(this, TDIGEST_PERCENTILES);
	}

	/**
	 * Get the {@code t_test} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code t_test} kind.
	 */
	public TTestAggregate tTest() {
		return TaggedUnionUtils.get(this, T_TEST);
	}

	/**
	 * Get the {@code top_hits} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_hits} kind.
	 */
	public TopHitsAggregate topHits() {
		return TaggedUnionUtils.get(this, TOP_HITS);
	}

	/**
	 * Get the {@code top_metrics} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code top_metrics} kind.
	 */
	public TopMetricsAggregate topMetrics() {
		return TaggedUnionUtils.get(this, TOP_METRICS);
	}

	/**
	 * Get the {@code umrareterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code umrareterms} kind.
	 */
	public UnmappedRareTermsAggregate umrareterms() {
		return TaggedUnionUtils.get(this, UMRARETERMS);
	}

	/**
	 * Get the {@code umsigterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code umsigterms} kind.
	 */
	public UnmappedSignificantTermsAggregate umsigterms() {
		return TaggedUnionUtils.get(this, UMSIGTERMS);
	}

	/**
	 * Get the {@code umterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code umterms} kind.
	 */
	public UnmappedTermsAggregate umterms() {
		return TaggedUnionUtils.get(this, UMTERMS);
	}

	/**
	 * Get the {@code value_count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value_count} kind.
	 */
	public ValueCountAggregate valueCount() {
		return TaggedUnionUtils.get(this, VALUE_COUNT);
	}

	/**
	 * Get the {@code variable_width_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code variable_width_histogram} kind.
	 */
	public VariableWidthHistogramAggregate variableWidthHistogram() {
		return TaggedUnionUtils.get(this, VARIABLE_WIDTH_HISTOGRAM);
	}

	/**
	 * Get the {@code weighted_avg} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weighted_avg} kind.
	 */
	public WeightedAvgAggregate weightedAvg() {
		return TaggedUnionUtils.get(this, WEIGHTED_AVG);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Aggregate> {
		private String _type;
		private AggregateVariant _value;

		public Builder adjacencyMatrix(AdjacencyMatrixAggregate v) {
			this._type = ADJACENCY_MATRIX;
			this._value = v;
			return this;
		}

		public Builder adjacencyMatrix(
				Function<AdjacencyMatrixAggregate.Builder, ObjectBuilder<AdjacencyMatrixAggregate>> f) {
			return this.adjacencyMatrix(f.apply(new AdjacencyMatrixAggregate.Builder()).build());
		}

		public Builder autoDateHistogram(AutoDateHistogramAggregate v) {
			this._type = AUTO_DATE_HISTOGRAM;
			this._value = v;
			return this;
		}

		public Builder autoDateHistogram(
				Function<AutoDateHistogramAggregate.Builder, ObjectBuilder<AutoDateHistogramAggregate>> f) {
			return this.autoDateHistogram(f.apply(new AutoDateHistogramAggregate.Builder()).build());
		}

		public Builder avg(AvgAggregate v) {
			this._type = AVG;
			this._value = v;
			return this;
		}

		public Builder avg(Function<AvgAggregate.Builder, ObjectBuilder<AvgAggregate>> f) {
			return this.avg(f.apply(new AvgAggregate.Builder()).build());
		}

		public Builder boxPlot(BoxPlotAggregate v) {
			this._type = BOX_PLOT;
			this._value = v;
			return this;
		}

		public Builder boxPlot(Function<BoxPlotAggregate.Builder, ObjectBuilder<BoxPlotAggregate>> f) {
			return this.boxPlot(f.apply(new BoxPlotAggregate.Builder()).build());
		}

		public Builder bucketMetricValue(BucketMetricValueAggregate v) {
			this._type = BUCKET_METRIC_VALUE;
			this._value = v;
			return this;
		}

		public Builder bucketMetricValue(
				Function<BucketMetricValueAggregate.Builder, ObjectBuilder<BucketMetricValueAggregate>> f) {
			return this.bucketMetricValue(f.apply(new BucketMetricValueAggregate.Builder()).build());
		}

		public Builder cardinality(CardinalityAggregate v) {
			this._type = CARDINALITY;
			this._value = v;
			return this;
		}

		public Builder cardinality(Function<CardinalityAggregate.Builder, ObjectBuilder<CardinalityAggregate>> f) {
			return this.cardinality(f.apply(new CardinalityAggregate.Builder()).build());
		}

		public Builder children(ChildrenAggregate v) {
			this._type = CHILDREN;
			this._value = v;
			return this;
		}

		public Builder children(Function<ChildrenAggregate.Builder, ObjectBuilder<ChildrenAggregate>> f) {
			return this.children(f.apply(new ChildrenAggregate.Builder()).build());
		}

		public Builder composite(CompositeAggregate v) {
			this._type = COMPOSITE;
			this._value = v;
			return this;
		}

		public Builder composite(Function<CompositeAggregate.Builder, ObjectBuilder<CompositeAggregate>> f) {
			return this.composite(f.apply(new CompositeAggregate.Builder()).build());
		}

		public Builder simpleLongValue(CumulativeCardinalityAggregate v) {
			this._type = SIMPLE_LONG_VALUE;
			this._value = v;
			return this;
		}

		public Builder simpleLongValue(
				Function<CumulativeCardinalityAggregate.Builder, ObjectBuilder<CumulativeCardinalityAggregate>> f) {
			return this.simpleLongValue(f.apply(new CumulativeCardinalityAggregate.Builder()).build());
		}

		public Builder dateHistogram(DateHistogramAggregate v) {
			this._type = DATE_HISTOGRAM;
			this._value = v;
			return this;
		}

		public Builder dateHistogram(
				Function<DateHistogramAggregate.Builder, ObjectBuilder<DateHistogramAggregate>> f) {
			return this.dateHistogram(f.apply(new DateHistogramAggregate.Builder()).build());
		}

		public Builder dateRange(DateRangeAggregate v) {
			this._type = DATE_RANGE;
			this._value = v;
			return this;
		}

		public Builder dateRange(Function<DateRangeAggregate.Builder, ObjectBuilder<DateRangeAggregate>> f) {
			return this.dateRange(f.apply(new DateRangeAggregate.Builder()).build());
		}

		public Builder derivative(DerivativeAggregate v) {
			this._type = DERIVATIVE;
			this._value = v;
			return this;
		}

		public Builder derivative(Function<DerivativeAggregate.Builder, ObjectBuilder<DerivativeAggregate>> f) {
			return this.derivative(f.apply(new DerivativeAggregate.Builder()).build());
		}

		public Builder dterms(DoubleTermsAggregate v) {
			this._type = DTERMS;
			this._value = v;
			return this;
		}

		public Builder dterms(Function<DoubleTermsAggregate.Builder, ObjectBuilder<DoubleTermsAggregate>> f) {
			return this.dterms(f.apply(new DoubleTermsAggregate.Builder()).build());
		}

		public Builder extendedStats(ExtendedStatsAggregate v) {
			this._type = EXTENDED_STATS;
			this._value = v;
			return this;
		}

		public Builder extendedStats(
				Function<ExtendedStatsAggregate.Builder, ObjectBuilder<ExtendedStatsAggregate>> f) {
			return this.extendedStats(f.apply(new ExtendedStatsAggregate.Builder()).build());
		}

		public Builder extendedStatsBucket(ExtendedStatsBucketAggregate v) {
			this._type = EXTENDED_STATS_BUCKET;
			this._value = v;
			return this;
		}

		public Builder extendedStatsBucket(
				Function<ExtendedStatsBucketAggregate.Builder, ObjectBuilder<ExtendedStatsBucketAggregate>> f) {
			return this.extendedStatsBucket(f.apply(new ExtendedStatsBucketAggregate.Builder()).build());
		}

		public Builder filter(FilterAggregate v) {
			this._type = FILTER;
			this._value = v;
			return this;
		}

		public Builder filter(Function<FilterAggregate.Builder, ObjectBuilder<FilterAggregate>> f) {
			return this.filter(f.apply(new FilterAggregate.Builder()).build());
		}

		public Builder filters(FiltersAggregate v) {
			this._type = FILTERS;
			this._value = v;
			return this;
		}

		public Builder filters(Function<FiltersAggregate.Builder, ObjectBuilder<FiltersAggregate>> f) {
			return this.filters(f.apply(new FiltersAggregate.Builder()).build());
		}

		public Builder geoBounds(GeoBoundsAggregate v) {
			this._type = GEO_BOUNDS;
			this._value = v;
			return this;
		}

		public Builder geoBounds(Function<GeoBoundsAggregate.Builder, ObjectBuilder<GeoBoundsAggregate>> f) {
			return this.geoBounds(f.apply(new GeoBoundsAggregate.Builder()).build());
		}

		public Builder geoCentroid(GeoCentroidAggregate v) {
			this._type = GEO_CENTROID;
			this._value = v;
			return this;
		}

		public Builder geoCentroid(Function<GeoCentroidAggregate.Builder, ObjectBuilder<GeoCentroidAggregate>> f) {
			return this.geoCentroid(f.apply(new GeoCentroidAggregate.Builder()).build());
		}

		public Builder geoDistance(GeoDistanceAggregate v) {
			this._type = GEO_DISTANCE;
			this._value = v;
			return this;
		}

		public Builder geoDistance(Function<GeoDistanceAggregate.Builder, ObjectBuilder<GeoDistanceAggregate>> f) {
			return this.geoDistance(f.apply(new GeoDistanceAggregate.Builder()).build());
		}

		public Builder geohashGrid(GeoHashGridAggregate v) {
			this._type = GEOHASH_GRID;
			this._value = v;
			return this;
		}

		public Builder geohashGrid(Function<GeoHashGridAggregate.Builder, ObjectBuilder<GeoHashGridAggregate>> f) {
			return this.geohashGrid(f.apply(new GeoHashGridAggregate.Builder()).build());
		}

		public Builder geoLine(GeoLineAggregate v) {
			this._type = GEO_LINE;
			this._value = v;
			return this;
		}

		public Builder geoLine(Function<GeoLineAggregate.Builder, ObjectBuilder<GeoLineAggregate>> f) {
			return this.geoLine(f.apply(new GeoLineAggregate.Builder()).build());
		}

		public Builder geotileGrid(GeoTileGridAggregate v) {
			this._type = GEOTILE_GRID;
			this._value = v;
			return this;
		}

		public Builder geotileGrid(Function<GeoTileGridAggregate.Builder, ObjectBuilder<GeoTileGridAggregate>> f) {
			return this.geotileGrid(f.apply(new GeoTileGridAggregate.Builder()).build());
		}

		public Builder global(GlobalAggregate v) {
			this._type = GLOBAL;
			this._value = v;
			return this;
		}

		public Builder global(Function<GlobalAggregate.Builder, ObjectBuilder<GlobalAggregate>> f) {
			return this.global(f.apply(new GlobalAggregate.Builder()).build());
		}

		public Builder hdrPercentileRanks(HdrPercentileRanksAggregate v) {
			this._type = HDR_PERCENTILE_RANKS;
			this._value = v;
			return this;
		}

		public Builder hdrPercentileRanks(
				Function<HdrPercentileRanksAggregate.Builder, ObjectBuilder<HdrPercentileRanksAggregate>> f) {
			return this.hdrPercentileRanks(f.apply(new HdrPercentileRanksAggregate.Builder()).build());
		}

		public Builder hdrPercentiles(HdrPercentilesAggregate v) {
			this._type = HDR_PERCENTILES;
			this._value = v;
			return this;
		}

		public Builder hdrPercentiles(
				Function<HdrPercentilesAggregate.Builder, ObjectBuilder<HdrPercentilesAggregate>> f) {
			return this.hdrPercentiles(f.apply(new HdrPercentilesAggregate.Builder()).build());
		}

		public Builder histogram(HistogramAggregate v) {
			this._type = HISTOGRAM;
			this._value = v;
			return this;
		}

		public Builder histogram(Function<HistogramAggregate.Builder, ObjectBuilder<HistogramAggregate>> f) {
			return this.histogram(f.apply(new HistogramAggregate.Builder()).build());
		}

		public Builder inference(InferenceAggregate v) {
			this._type = INFERENCE;
			this._value = v;
			return this;
		}

		public Builder inference(Function<InferenceAggregate.Builder, ObjectBuilder<InferenceAggregate>> f) {
			return this.inference(f.apply(new InferenceAggregate.Builder()).build());
		}

		public Builder ipRange(IpRangeAggregate v) {
			this._type = IP_RANGE;
			this._value = v;
			return this;
		}

		public Builder ipRange(Function<IpRangeAggregate.Builder, ObjectBuilder<IpRangeAggregate>> f) {
			return this.ipRange(f.apply(new IpRangeAggregate.Builder()).build());
		}

		public Builder lrareterms(LongRareTermsAggregate v) {
			this._type = LRARETERMS;
			this._value = v;
			return this;
		}

		public Builder lrareterms(Function<LongRareTermsAggregate.Builder, ObjectBuilder<LongRareTermsAggregate>> f) {
			return this.lrareterms(f.apply(new LongRareTermsAggregate.Builder()).build());
		}

		public Builder lterms(LongTermsAggregate v) {
			this._type = LTERMS;
			this._value = v;
			return this;
		}

		public Builder lterms(Function<LongTermsAggregate.Builder, ObjectBuilder<LongTermsAggregate>> f) {
			return this.lterms(f.apply(new LongTermsAggregate.Builder()).build());
		}

		public Builder matrixStats(MatrixStatsAggregate v) {
			this._type = MATRIX_STATS;
			this._value = v;
			return this;
		}

		public Builder matrixStats(Function<MatrixStatsAggregate.Builder, ObjectBuilder<MatrixStatsAggregate>> f) {
			return this.matrixStats(f.apply(new MatrixStatsAggregate.Builder()).build());
		}

		public Builder max(MaxAggregate v) {
			this._type = MAX;
			this._value = v;
			return this;
		}

		public Builder max(Function<MaxAggregate.Builder, ObjectBuilder<MaxAggregate>> f) {
			return this.max(f.apply(new MaxAggregate.Builder()).build());
		}

		public Builder medianAbsoluteDeviation(MedianAbsoluteDeviationAggregate v) {
			this._type = MEDIAN_ABSOLUTE_DEVIATION;
			this._value = v;
			return this;
		}

		public Builder medianAbsoluteDeviation(
				Function<MedianAbsoluteDeviationAggregate.Builder, ObjectBuilder<MedianAbsoluteDeviationAggregate>> f) {
			return this.medianAbsoluteDeviation(f.apply(new MedianAbsoluteDeviationAggregate.Builder()).build());
		}

		public Builder min(MinAggregate v) {
			this._type = MIN;
			this._value = v;
			return this;
		}

		public Builder min(Function<MinAggregate.Builder, ObjectBuilder<MinAggregate>> f) {
			return this.min(f.apply(new MinAggregate.Builder()).build());
		}

		public Builder missing(MissingAggregate v) {
			this._type = MISSING;
			this._value = v;
			return this;
		}

		public Builder missing(Function<MissingAggregate.Builder, ObjectBuilder<MissingAggregate>> f) {
			return this.missing(f.apply(new MissingAggregate.Builder()).build());
		}

		public Builder multiTerms(MultiTermsAggregate v) {
			this._type = MULTI_TERMS;
			this._value = v;
			return this;
		}

		public Builder multiTerms(Function<MultiTermsAggregate.Builder, ObjectBuilder<MultiTermsAggregate>> f) {
			return this.multiTerms(f.apply(new MultiTermsAggregate.Builder()).build());
		}

		public Builder nested(NestedAggregate v) {
			this._type = NESTED;
			this._value = v;
			return this;
		}

		public Builder nested(Function<NestedAggregate.Builder, ObjectBuilder<NestedAggregate>> f) {
			return this.nested(f.apply(new NestedAggregate.Builder()).build());
		}

		public Builder percentilesBucket(PercentilesBucketAggregate v) {
			this._type = PERCENTILES_BUCKET;
			this._value = v;
			return this;
		}

		public Builder percentilesBucket(
				Function<PercentilesBucketAggregate.Builder, ObjectBuilder<PercentilesBucketAggregate>> f) {
			return this.percentilesBucket(f.apply(new PercentilesBucketAggregate.Builder()).build());
		}

		public Builder range(RangeAggregate v) {
			this._type = RANGE;
			this._value = v;
			return this;
		}

		public Builder range(Function<RangeAggregate.Builder, ObjectBuilder<RangeAggregate>> f) {
			return this.range(f.apply(new RangeAggregate.Builder()).build());
		}

		public Builder rate(RateAggregate v) {
			this._type = RATE;
			this._value = v;
			return this;
		}

		public Builder rate(Function<RateAggregate.Builder, ObjectBuilder<RateAggregate>> f) {
			return this.rate(f.apply(new RateAggregate.Builder()).build());
		}

		public Builder reverseNested(ReverseNestedAggregate v) {
			this._type = REVERSE_NESTED;
			this._value = v;
			return this;
		}

		public Builder reverseNested(
				Function<ReverseNestedAggregate.Builder, ObjectBuilder<ReverseNestedAggregate>> f) {
			return this.reverseNested(f.apply(new ReverseNestedAggregate.Builder()).build());
		}

		public Builder sampler(SamplerAggregate v) {
			this._type = SAMPLER;
			this._value = v;
			return this;
		}

		public Builder sampler(Function<SamplerAggregate.Builder, ObjectBuilder<SamplerAggregate>> f) {
			return this.sampler(f.apply(new SamplerAggregate.Builder()).build());
		}

		public Builder scriptedMetric(ScriptedMetricAggregate v) {
			this._type = SCRIPTED_METRIC;
			this._value = v;
			return this;
		}

		public Builder scriptedMetric(
				Function<ScriptedMetricAggregate.Builder, ObjectBuilder<ScriptedMetricAggregate>> f) {
			return this.scriptedMetric(f.apply(new ScriptedMetricAggregate.Builder()).build());
		}

		public Builder siglterms(SignificantLongTermsAggregate v) {
			this._type = SIGLTERMS;
			this._value = v;
			return this;
		}

		public Builder siglterms(
				Function<SignificantLongTermsAggregate.Builder, ObjectBuilder<SignificantLongTermsAggregate>> f) {
			return this.siglterms(f.apply(new SignificantLongTermsAggregate.Builder()).build());
		}

		public Builder sigsterms(SignificantStringTermsAggregate v) {
			this._type = SIGSTERMS;
			this._value = v;
			return this;
		}

		public Builder sigsterms(
				Function<SignificantStringTermsAggregate.Builder, ObjectBuilder<SignificantStringTermsAggregate>> f) {
			return this.sigsterms(f.apply(new SignificantStringTermsAggregate.Builder()).build());
		}

		public Builder simpleValue(SimpleValueAggregate v) {
			this._type = SIMPLE_VALUE;
			this._value = v;
			return this;
		}

		public Builder simpleValue(Function<SimpleValueAggregate.Builder, ObjectBuilder<SimpleValueAggregate>> f) {
			return this.simpleValue(f.apply(new SimpleValueAggregate.Builder()).build());
		}

		public Builder stats(StatsAggregate v) {
			this._type = STATS;
			this._value = v;
			return this;
		}

		public Builder stats(Function<StatsAggregate.Builder, ObjectBuilder<StatsAggregate>> f) {
			return this.stats(f.apply(new StatsAggregate.Builder()).build());
		}

		public Builder statsBucket(StatsBucketAggregate v) {
			this._type = STATS_BUCKET;
			this._value = v;
			return this;
		}

		public Builder statsBucket(Function<StatsBucketAggregate.Builder, ObjectBuilder<StatsBucketAggregate>> f) {
			return this.statsBucket(f.apply(new StatsBucketAggregate.Builder()).build());
		}

		public Builder srareterms(StringRareTermsAggregate v) {
			this._type = SRARETERMS;
			this._value = v;
			return this;
		}

		public Builder srareterms(
				Function<StringRareTermsAggregate.Builder, ObjectBuilder<StringRareTermsAggregate>> f) {
			return this.srareterms(f.apply(new StringRareTermsAggregate.Builder()).build());
		}

		public Builder stringStats(StringStatsAggregate v) {
			this._type = STRING_STATS;
			this._value = v;
			return this;
		}

		public Builder stringStats(Function<StringStatsAggregate.Builder, ObjectBuilder<StringStatsAggregate>> f) {
			return this.stringStats(f.apply(new StringStatsAggregate.Builder()).build());
		}

		public Builder sterms(StringTermsAggregate v) {
			this._type = STERMS;
			this._value = v;
			return this;
		}

		public Builder sterms(Function<StringTermsAggregate.Builder, ObjectBuilder<StringTermsAggregate>> f) {
			return this.sterms(f.apply(new StringTermsAggregate.Builder()).build());
		}

		public Builder sum(SumAggregate v) {
			this._type = SUM;
			this._value = v;
			return this;
		}

		public Builder sum(Function<SumAggregate.Builder, ObjectBuilder<SumAggregate>> f) {
			return this.sum(f.apply(new SumAggregate.Builder()).build());
		}

		public Builder tdigestPercentileRanks(TDigestPercentileRanksAggregate v) {
			this._type = TDIGEST_PERCENTILE_RANKS;
			this._value = v;
			return this;
		}

		public Builder tdigestPercentileRanks(
				Function<TDigestPercentileRanksAggregate.Builder, ObjectBuilder<TDigestPercentileRanksAggregate>> f) {
			return this.tdigestPercentileRanks(f.apply(new TDigestPercentileRanksAggregate.Builder()).build());
		}

		public Builder tdigestPercentiles(TDigestPercentilesAggregate v) {
			this._type = TDIGEST_PERCENTILES;
			this._value = v;
			return this;
		}

		public Builder tdigestPercentiles(
				Function<TDigestPercentilesAggregate.Builder, ObjectBuilder<TDigestPercentilesAggregate>> f) {
			return this.tdigestPercentiles(f.apply(new TDigestPercentilesAggregate.Builder()).build());
		}

		public Builder tTest(TTestAggregate v) {
			this._type = T_TEST;
			this._value = v;
			return this;
		}

		public Builder tTest(Function<TTestAggregate.Builder, ObjectBuilder<TTestAggregate>> f) {
			return this.tTest(f.apply(new TTestAggregate.Builder()).build());
		}

		public Builder topHits(TopHitsAggregate v) {
			this._type = TOP_HITS;
			this._value = v;
			return this;
		}

		public Builder topHits(Function<TopHitsAggregate.Builder, ObjectBuilder<TopHitsAggregate>> f) {
			return this.topHits(f.apply(new TopHitsAggregate.Builder()).build());
		}

		public Builder topMetrics(TopMetricsAggregate v) {
			this._type = TOP_METRICS;
			this._value = v;
			return this;
		}

		public Builder topMetrics(Function<TopMetricsAggregate.Builder, ObjectBuilder<TopMetricsAggregate>> f) {
			return this.topMetrics(f.apply(new TopMetricsAggregate.Builder()).build());
		}

		public Builder umrareterms(UnmappedRareTermsAggregate v) {
			this._type = UMRARETERMS;
			this._value = v;
			return this;
		}

		public Builder umrareterms(
				Function<UnmappedRareTermsAggregate.Builder, ObjectBuilder<UnmappedRareTermsAggregate>> f) {
			return this.umrareterms(f.apply(new UnmappedRareTermsAggregate.Builder()).build());
		}

		public Builder umsigterms(UnmappedSignificantTermsAggregate v) {
			this._type = UMSIGTERMS;
			this._value = v;
			return this;
		}

		public Builder umsigterms(
				Function<UnmappedSignificantTermsAggregate.Builder, ObjectBuilder<UnmappedSignificantTermsAggregate>> f) {
			return this.umsigterms(f.apply(new UnmappedSignificantTermsAggregate.Builder()).build());
		}

		public Builder umterms(UnmappedTermsAggregate v) {
			this._type = UMTERMS;
			this._value = v;
			return this;
		}

		public Builder umterms(Function<UnmappedTermsAggregate.Builder, ObjectBuilder<UnmappedTermsAggregate>> f) {
			return this.umterms(f.apply(new UnmappedTermsAggregate.Builder()).build());
		}

		public Builder valueCount(ValueCountAggregate v) {
			this._type = VALUE_COUNT;
			this._value = v;
			return this;
		}

		public Builder valueCount(Function<ValueCountAggregate.Builder, ObjectBuilder<ValueCountAggregate>> f) {
			return this.valueCount(f.apply(new ValueCountAggregate.Builder()).build());
		}

		public Builder variableWidthHistogram(VariableWidthHistogramAggregate v) {
			this._type = VARIABLE_WIDTH_HISTOGRAM;
			this._value = v;
			return this;
		}

		public Builder variableWidthHistogram(
				Function<VariableWidthHistogramAggregate.Builder, ObjectBuilder<VariableWidthHistogramAggregate>> f) {
			return this.variableWidthHistogram(f.apply(new VariableWidthHistogramAggregate.Builder()).build());
		}

		public Builder weightedAvg(WeightedAvgAggregate v) {
			this._type = WEIGHTED_AVG;
			this._value = v;
			return this;
		}

		public Builder weightedAvg(Function<WeightedAvgAggregate.Builder, ObjectBuilder<WeightedAvgAggregate>> f) {
			return this.weightedAvg(f.apply(new WeightedAvgAggregate.Builder()).build());
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
