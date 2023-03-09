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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Property} variants.
 */
public class PropertyBuilders {
	private PropertyBuilders() {
	}

	/**
	 * Creates a builder for the {@link AggregateMetricDoubleProperty
	 * aggregate_metric_double} {@code Property} variant.
	 */
	public static AggregateMetricDoubleProperty.Builder aggregateMetricDouble() {
		return new AggregateMetricDoubleProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link AggregateMetricDoubleProperty
	 * aggregate_metric_double} {@code Property} variant.
	 */
	public static Property aggregateMetricDouble(
			Function<AggregateMetricDoubleProperty.Builder, ObjectBuilder<AggregateMetricDoubleProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.aggregateMetricDouble(fn.apply(new AggregateMetricDoubleProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BinaryProperty binary} {@code Property}
	 * variant.
	 */
	public static BinaryProperty.Builder binary() {
		return new BinaryProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link BinaryProperty binary} {@code Property}
	 * variant.
	 */
	public static Property binary(Function<BinaryProperty.Builder, ObjectBuilder<BinaryProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.binary(fn.apply(new BinaryProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BooleanProperty boolean} {@code Property}
	 * variant.
	 */
	public static BooleanProperty.Builder boolean_() {
		return new BooleanProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link BooleanProperty boolean} {@code Property}
	 * variant.
	 */
	public static Property boolean_(Function<BooleanProperty.Builder, ObjectBuilder<BooleanProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.boolean_(fn.apply(new BooleanProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ByteNumberProperty byte} {@code Property}
	 * variant.
	 */
	public static ByteNumberProperty.Builder byte_() {
		return new ByteNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link ByteNumberProperty byte} {@code Property}
	 * variant.
	 */
	public static Property byte_(Function<ByteNumberProperty.Builder, ObjectBuilder<ByteNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.byte_(fn.apply(new ByteNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompletionProperty completion}
	 * {@code Property} variant.
	 */
	public static CompletionProperty.Builder completion() {
		return new CompletionProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link CompletionProperty completion}
	 * {@code Property} variant.
	 */
	public static Property completion(Function<CompletionProperty.Builder, ObjectBuilder<CompletionProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.completion(fn.apply(new CompletionProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ConstantKeywordProperty constant_keyword}
	 * {@code Property} variant.
	 */
	public static ConstantKeywordProperty.Builder constantKeyword() {
		return new ConstantKeywordProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link ConstantKeywordProperty constant_keyword}
	 * {@code Property} variant.
	 */
	public static Property constantKeyword(
			Function<ConstantKeywordProperty.Builder, ObjectBuilder<ConstantKeywordProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.constantKeyword(fn.apply(new ConstantKeywordProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateNanosProperty date_nanos}
	 * {@code Property} variant.
	 */
	public static DateNanosProperty.Builder dateNanos() {
		return new DateNanosProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link DateNanosProperty date_nanos}
	 * {@code Property} variant.
	 */
	public static Property dateNanos(Function<DateNanosProperty.Builder, ObjectBuilder<DateNanosProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.dateNanos(fn.apply(new DateNanosProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateProperty date} {@code Property} variant.
	 */
	public static DateProperty.Builder date() {
		return new DateProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link DateProperty date} {@code Property} variant.
	 */
	public static Property date(Function<DateProperty.Builder, ObjectBuilder<DateProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.date(fn.apply(new DateProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateRangeProperty date_range}
	 * {@code Property} variant.
	 */
	public static DateRangeProperty.Builder dateRange() {
		return new DateRangeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link DateRangeProperty date_range}
	 * {@code Property} variant.
	 */
	public static Property dateRange(Function<DateRangeProperty.Builder, ObjectBuilder<DateRangeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.dateRange(fn.apply(new DateRangeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DenseVectorProperty dense_vector}
	 * {@code Property} variant.
	 */
	public static DenseVectorProperty.Builder denseVector() {
		return new DenseVectorProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link DenseVectorProperty dense_vector}
	 * {@code Property} variant.
	 */
	public static Property denseVector(Function<DenseVectorProperty.Builder, ObjectBuilder<DenseVectorProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.denseVector(fn.apply(new DenseVectorProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DoubleNumberProperty double}
	 * {@code Property} variant.
	 */
	public static DoubleNumberProperty.Builder double_() {
		return new DoubleNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link DoubleNumberProperty double}
	 * {@code Property} variant.
	 */
	public static Property double_(Function<DoubleNumberProperty.Builder, ObjectBuilder<DoubleNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.double_(fn.apply(new DoubleNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DoubleRangeProperty double_range}
	 * {@code Property} variant.
	 */
	public static DoubleRangeProperty.Builder doubleRange() {
		return new DoubleRangeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link DoubleRangeProperty double_range}
	 * {@code Property} variant.
	 */
	public static Property doubleRange(Function<DoubleRangeProperty.Builder, ObjectBuilder<DoubleRangeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.doubleRange(fn.apply(new DoubleRangeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DynamicProperty {dynamic_property}}
	 * {@code Property} variant.
	 */
	public static DynamicProperty.Builder dynamicProperty() {
		return new DynamicProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link DynamicProperty {dynamic_property}}
	 * {@code Property} variant.
	 */
	public static Property dynamicProperty(Function<DynamicProperty.Builder, ObjectBuilder<DynamicProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.dynamicProperty(fn.apply(new DynamicProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FieldAliasProperty alias} {@code Property}
	 * variant.
	 */
	public static FieldAliasProperty.Builder alias() {
		return new FieldAliasProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link FieldAliasProperty alias} {@code Property}
	 * variant.
	 */
	public static Property alias(Function<FieldAliasProperty.Builder, ObjectBuilder<FieldAliasProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.alias(fn.apply(new FieldAliasProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FlattenedProperty flattened}
	 * {@code Property} variant.
	 */
	public static FlattenedProperty.Builder flattened() {
		return new FlattenedProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link FlattenedProperty flattened}
	 * {@code Property} variant.
	 */
	public static Property flattened(Function<FlattenedProperty.Builder, ObjectBuilder<FlattenedProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.flattened(fn.apply(new FlattenedProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FloatNumberProperty float} {@code Property}
	 * variant.
	 */
	public static FloatNumberProperty.Builder float_() {
		return new FloatNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link FloatNumberProperty float} {@code Property}
	 * variant.
	 */
	public static Property float_(Function<FloatNumberProperty.Builder, ObjectBuilder<FloatNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.float_(fn.apply(new FloatNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FloatRangeProperty float_range}
	 * {@code Property} variant.
	 */
	public static FloatRangeProperty.Builder floatRange() {
		return new FloatRangeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link FloatRangeProperty float_range}
	 * {@code Property} variant.
	 */
	public static Property floatRange(Function<FloatRangeProperty.Builder, ObjectBuilder<FloatRangeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.floatRange(fn.apply(new FloatRangeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoPointProperty geo_point} {@code Property}
	 * variant.
	 */
	public static GeoPointProperty.Builder geoPoint() {
		return new GeoPointProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link GeoPointProperty geo_point} {@code Property}
	 * variant.
	 */
	public static Property geoPoint(Function<GeoPointProperty.Builder, ObjectBuilder<GeoPointProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.geoPoint(fn.apply(new GeoPointProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoShapeProperty geo_shape} {@code Property}
	 * variant.
	 */
	public static GeoShapeProperty.Builder geoShape() {
		return new GeoShapeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link GeoShapeProperty geo_shape} {@code Property}
	 * variant.
	 */
	public static Property geoShape(Function<GeoShapeProperty.Builder, ObjectBuilder<GeoShapeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.geoShape(fn.apply(new GeoShapeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HalfFloatNumberProperty half_float}
	 * {@code Property} variant.
	 */
	public static HalfFloatNumberProperty.Builder halfFloat() {
		return new HalfFloatNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link HalfFloatNumberProperty half_float}
	 * {@code Property} variant.
	 */
	public static Property halfFloat(
			Function<HalfFloatNumberProperty.Builder, ObjectBuilder<HalfFloatNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.halfFloat(fn.apply(new HalfFloatNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HistogramProperty histogram}
	 * {@code Property} variant.
	 */
	public static HistogramProperty.Builder histogram() {
		return new HistogramProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link HistogramProperty histogram}
	 * {@code Property} variant.
	 */
	public static Property histogram(Function<HistogramProperty.Builder, ObjectBuilder<HistogramProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.histogram(fn.apply(new HistogramProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntegerNumberProperty integer}
	 * {@code Property} variant.
	 */
	public static IntegerNumberProperty.Builder integer() {
		return new IntegerNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link IntegerNumberProperty integer}
	 * {@code Property} variant.
	 */
	public static Property integer(Function<IntegerNumberProperty.Builder, ObjectBuilder<IntegerNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.integer(fn.apply(new IntegerNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntegerRangeProperty integer_range}
	 * {@code Property} variant.
	 */
	public static IntegerRangeProperty.Builder integerRange() {
		return new IntegerRangeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link IntegerRangeProperty integer_range}
	 * {@code Property} variant.
	 */
	public static Property integerRange(
			Function<IntegerRangeProperty.Builder, ObjectBuilder<IntegerRangeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.integerRange(fn.apply(new IntegerRangeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IpProperty ip} {@code Property} variant.
	 */
	public static IpProperty.Builder ip() {
		return new IpProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link IpProperty ip} {@code Property} variant.
	 */
	public static Property ip(Function<IpProperty.Builder, ObjectBuilder<IpProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.ip(fn.apply(new IpProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IpRangeProperty ip_range} {@code Property}
	 * variant.
	 */
	public static IpRangeProperty.Builder ipRange() {
		return new IpRangeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link IpRangeProperty ip_range} {@code Property}
	 * variant.
	 */
	public static Property ipRange(Function<IpRangeProperty.Builder, ObjectBuilder<IpRangeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.ipRange(fn.apply(new IpRangeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link JoinProperty join} {@code Property} variant.
	 */
	public static JoinProperty.Builder join() {
		return new JoinProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link JoinProperty join} {@code Property} variant.
	 */
	public static Property join(Function<JoinProperty.Builder, ObjectBuilder<JoinProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.join(fn.apply(new JoinProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KeywordProperty keyword} {@code Property}
	 * variant.
	 */
	public static KeywordProperty.Builder keyword() {
		return new KeywordProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link KeywordProperty keyword} {@code Property}
	 * variant.
	 */
	public static Property keyword(Function<KeywordProperty.Builder, ObjectBuilder<KeywordProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.keyword(fn.apply(new KeywordProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LongNumberProperty long} {@code Property}
	 * variant.
	 */
	public static LongNumberProperty.Builder long_() {
		return new LongNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link LongNumberProperty long} {@code Property}
	 * variant.
	 */
	public static Property long_(Function<LongNumberProperty.Builder, ObjectBuilder<LongNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.long_(fn.apply(new LongNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LongRangeProperty long_range}
	 * {@code Property} variant.
	 */
	public static LongRangeProperty.Builder longRange() {
		return new LongRangeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link LongRangeProperty long_range}
	 * {@code Property} variant.
	 */
	public static Property longRange(Function<LongRangeProperty.Builder, ObjectBuilder<LongRangeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.longRange(fn.apply(new LongRangeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchOnlyTextProperty match_only_text}
	 * {@code Property} variant.
	 */
	public static MatchOnlyTextProperty.Builder matchOnlyText() {
		return new MatchOnlyTextProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link MatchOnlyTextProperty match_only_text}
	 * {@code Property} variant.
	 */
	public static Property matchOnlyText(
			Function<MatchOnlyTextProperty.Builder, ObjectBuilder<MatchOnlyTextProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.matchOnlyText(fn.apply(new MatchOnlyTextProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Murmur3HashProperty murmur3}
	 * {@code Property} variant.
	 */
	public static Murmur3HashProperty.Builder murmur3() {
		return new Murmur3HashProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link Murmur3HashProperty murmur3}
	 * {@code Property} variant.
	 */
	public static Property murmur3(Function<Murmur3HashProperty.Builder, ObjectBuilder<Murmur3HashProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.murmur3(fn.apply(new Murmur3HashProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NestedProperty nested} {@code Property}
	 * variant.
	 */
	public static NestedProperty.Builder nested() {
		return new NestedProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link NestedProperty nested} {@code Property}
	 * variant.
	 */
	public static Property nested(Function<NestedProperty.Builder, ObjectBuilder<NestedProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.nested(fn.apply(new NestedProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ObjectProperty object} {@code Property}
	 * variant.
	 */
	public static ObjectProperty.Builder object() {
		return new ObjectProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link ObjectProperty object} {@code Property}
	 * variant.
	 */
	public static Property object(Function<ObjectProperty.Builder, ObjectBuilder<ObjectProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.object(fn.apply(new ObjectProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PercolatorProperty percolator}
	 * {@code Property} variant.
	 */
	public static PercolatorProperty.Builder percolator() {
		return new PercolatorProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link PercolatorProperty percolator}
	 * {@code Property} variant.
	 */
	public static Property percolator(Function<PercolatorProperty.Builder, ObjectBuilder<PercolatorProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.percolator(fn.apply(new PercolatorProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PointProperty point} {@code Property}
	 * variant.
	 */
	public static PointProperty.Builder point() {
		return new PointProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link PointProperty point} {@code Property}
	 * variant.
	 */
	public static Property point(Function<PointProperty.Builder, ObjectBuilder<PointProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.point(fn.apply(new PointProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RankFeatureProperty rank_feature}
	 * {@code Property} variant.
	 */
	public static RankFeatureProperty.Builder rankFeature() {
		return new RankFeatureProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link RankFeatureProperty rank_feature}
	 * {@code Property} variant.
	 */
	public static Property rankFeature(Function<RankFeatureProperty.Builder, ObjectBuilder<RankFeatureProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.rankFeature(fn.apply(new RankFeatureProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RankFeaturesProperty rank_features}
	 * {@code Property} variant.
	 */
	public static RankFeaturesProperty.Builder rankFeatures() {
		return new RankFeaturesProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link RankFeaturesProperty rank_features}
	 * {@code Property} variant.
	 */
	public static Property rankFeatures(
			Function<RankFeaturesProperty.Builder, ObjectBuilder<RankFeaturesProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.rankFeatures(fn.apply(new RankFeaturesProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScaledFloatNumberProperty scaled_float}
	 * {@code Property} variant.
	 */
	public static ScaledFloatNumberProperty.Builder scaledFloat() {
		return new ScaledFloatNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link ScaledFloatNumberProperty scaled_float}
	 * {@code Property} variant.
	 */
	public static Property scaledFloat(
			Function<ScaledFloatNumberProperty.Builder, ObjectBuilder<ScaledFloatNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.scaledFloat(fn.apply(new ScaledFloatNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SearchAsYouTypeProperty search_as_you_type}
	 * {@code Property} variant.
	 */
	public static SearchAsYouTypeProperty.Builder searchAsYouType() {
		return new SearchAsYouTypeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link SearchAsYouTypeProperty search_as_you_type}
	 * {@code Property} variant.
	 */
	public static Property searchAsYouType(
			Function<SearchAsYouTypeProperty.Builder, ObjectBuilder<SearchAsYouTypeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.searchAsYouType(fn.apply(new SearchAsYouTypeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ShapeProperty shape} {@code Property}
	 * variant.
	 */
	public static ShapeProperty.Builder shape() {
		return new ShapeProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link ShapeProperty shape} {@code Property}
	 * variant.
	 */
	public static Property shape(Function<ShapeProperty.Builder, ObjectBuilder<ShapeProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.shape(fn.apply(new ShapeProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ShortNumberProperty short} {@code Property}
	 * variant.
	 */
	public static ShortNumberProperty.Builder short_() {
		return new ShortNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link ShortNumberProperty short} {@code Property}
	 * variant.
	 */
	public static Property short_(Function<ShortNumberProperty.Builder, ObjectBuilder<ShortNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.short_(fn.apply(new ShortNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextProperty text} {@code Property} variant.
	 */
	public static TextProperty.Builder text() {
		return new TextProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link TextProperty text} {@code Property} variant.
	 */
	public static Property text(Function<TextProperty.Builder, ObjectBuilder<TextProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.text(fn.apply(new TextProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TokenCountProperty token_count}
	 * {@code Property} variant.
	 */
	public static TokenCountProperty.Builder tokenCount() {
		return new TokenCountProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link TokenCountProperty token_count}
	 * {@code Property} variant.
	 */
	public static Property tokenCount(Function<TokenCountProperty.Builder, ObjectBuilder<TokenCountProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.tokenCount(fn.apply(new TokenCountProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UnsignedLongNumberProperty unsigned_long}
	 * {@code Property} variant.
	 */
	public static UnsignedLongNumberProperty.Builder unsignedLong() {
		return new UnsignedLongNumberProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link UnsignedLongNumberProperty unsigned_long}
	 * {@code Property} variant.
	 */
	public static Property unsignedLong(
			Function<UnsignedLongNumberProperty.Builder, ObjectBuilder<UnsignedLongNumberProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.unsignedLong(fn.apply(new UnsignedLongNumberProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link VersionProperty version} {@code Property}
	 * variant.
	 */
	public static VersionProperty.Builder version() {
		return new VersionProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link VersionProperty version} {@code Property}
	 * variant.
	 */
	public static Property version(Function<VersionProperty.Builder, ObjectBuilder<VersionProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.version(fn.apply(new VersionProperty.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WildcardProperty wildcard} {@code Property}
	 * variant.
	 */
	public static WildcardProperty.Builder wildcard() {
		return new WildcardProperty.Builder();
	}

	/**
	 * Creates a Property of the {@link WildcardProperty wildcard} {@code Property}
	 * variant.
	 */
	public static Property wildcard(Function<WildcardProperty.Builder, ObjectBuilder<WildcardProperty>> fn) {
		Property.Builder builder = new Property.Builder();
		builder.wildcard(fn.apply(new WildcardProperty.Builder()).build());
		return builder.build();
	}

}
