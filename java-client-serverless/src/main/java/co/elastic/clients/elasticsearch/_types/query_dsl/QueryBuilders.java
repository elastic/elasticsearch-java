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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Query} variants.
 */
public class QueryBuilders {
	private QueryBuilders() {
	}

	/**
	 * Creates a builder for the {@link BoolQuery bool} {@code Query} variant.
	 */
	public static BoolQuery.Builder bool() {
		return new BoolQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link BoolQuery bool} {@code Query} variant.
	 */
	public static Query bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.bool(fn.apply(new BoolQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BoostingQuery boosting} {@code Query}
	 * variant.
	 */
	public static BoostingQuery.Builder boosting() {
		return new BoostingQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link BoostingQuery boosting} {@code Query} variant.
	 */
	public static Query boosting(Function<BoostingQuery.Builder, ObjectBuilder<BoostingQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.boosting(fn.apply(new BoostingQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CommonTermsQuery common} {@code Query}
	 * variant.
	 */
	public static CommonTermsQuery.Builder common() {
		return new CommonTermsQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link CommonTermsQuery common} {@code Query} variant.
	 */
	public static Query common(Function<CommonTermsQuery.Builder, ObjectBuilder<CommonTermsQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.common(fn.apply(new CommonTermsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CombinedFieldsQuery combined_fields}
	 * {@code Query} variant.
	 */
	public static CombinedFieldsQuery.Builder combinedFields() {
		return new CombinedFieldsQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link CombinedFieldsQuery combined_fields}
	 * {@code Query} variant.
	 */
	public static Query combinedFields(Function<CombinedFieldsQuery.Builder, ObjectBuilder<CombinedFieldsQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.combinedFields(fn.apply(new CombinedFieldsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ConstantScoreQuery constant_score}
	 * {@code Query} variant.
	 */
	public static ConstantScoreQuery.Builder constantScore() {
		return new ConstantScoreQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link ConstantScoreQuery constant_score}
	 * {@code Query} variant.
	 */
	public static Query constantScore(Function<ConstantScoreQuery.Builder, ObjectBuilder<ConstantScoreQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.constantScore(fn.apply(new ConstantScoreQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DisMaxQuery dis_max} {@code Query} variant.
	 */
	public static DisMaxQuery.Builder disMax() {
		return new DisMaxQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link DisMaxQuery dis_max} {@code Query} variant.
	 */
	public static Query disMax(Function<DisMaxQuery.Builder, ObjectBuilder<DisMaxQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.disMax(fn.apply(new DisMaxQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DistanceFeatureQuery distance_feature}
	 * {@code Query} variant.
	 */
	public static DistanceFeatureQuery.Builder distanceFeature() {
		return new DistanceFeatureQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link DistanceFeatureQuery distance_feature}
	 * {@code Query} variant.
	 */
	public static Query distanceFeature(
			Function<DistanceFeatureQuery.Builder, ObjectBuilder<DistanceFeatureQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.distanceFeature(fn.apply(new DistanceFeatureQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExistsQuery exists} {@code Query} variant.
	 */
	public static ExistsQuery.Builder exists() {
		return new ExistsQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link ExistsQuery exists} {@code Query} variant.
	 */
	public static Query exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.exists(fn.apply(new ExistsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FunctionScoreQuery function_score}
	 * {@code Query} variant.
	 */
	public static FunctionScoreQuery.Builder functionScore() {
		return new FunctionScoreQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link FunctionScoreQuery function_score}
	 * {@code Query} variant.
	 */
	public static Query functionScore(Function<FunctionScoreQuery.Builder, ObjectBuilder<FunctionScoreQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.functionScore(fn.apply(new FunctionScoreQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FuzzyQuery fuzzy} {@code Query} variant.
	 */
	public static FuzzyQuery.Builder fuzzy() {
		return new FuzzyQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link FuzzyQuery fuzzy} {@code Query} variant.
	 */
	public static Query fuzzy(Function<FuzzyQuery.Builder, ObjectBuilder<FuzzyQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.fuzzy(fn.apply(new FuzzyQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoBoundingBoxQuery geo_bounding_box}
	 * {@code Query} variant.
	 */
	public static GeoBoundingBoxQuery.Builder geoBoundingBox() {
		return new GeoBoundingBoxQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link GeoBoundingBoxQuery geo_bounding_box}
	 * {@code Query} variant.
	 */
	public static Query geoBoundingBox(Function<GeoBoundingBoxQuery.Builder, ObjectBuilder<GeoBoundingBoxQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.geoBoundingBox(fn.apply(new GeoBoundingBoxQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoDistanceQuery geo_distance} {@code Query}
	 * variant.
	 */
	public static GeoDistanceQuery.Builder geoDistance() {
		return new GeoDistanceQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link GeoDistanceQuery geo_distance} {@code Query}
	 * variant.
	 */
	public static Query geoDistance(Function<GeoDistanceQuery.Builder, ObjectBuilder<GeoDistanceQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.geoDistance(fn.apply(new GeoDistanceQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoPolygonQuery geo_polygon} {@code Query}
	 * variant.
	 */
	public static GeoPolygonQuery.Builder geoPolygon() {
		return new GeoPolygonQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link GeoPolygonQuery geo_polygon} {@code Query}
	 * variant.
	 */
	public static Query geoPolygon(Function<GeoPolygonQuery.Builder, ObjectBuilder<GeoPolygonQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.geoPolygon(fn.apply(new GeoPolygonQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoShapeQuery geo_shape} {@code Query}
	 * variant.
	 */
	public static GeoShapeQuery.Builder geoShape() {
		return new GeoShapeQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link GeoShapeQuery geo_shape} {@code Query} variant.
	 */
	public static Query geoShape(Function<GeoShapeQuery.Builder, ObjectBuilder<GeoShapeQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.geoShape(fn.apply(new GeoShapeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HasChildQuery has_child} {@code Query}
	 * variant.
	 */
	public static HasChildQuery.Builder hasChild() {
		return new HasChildQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link HasChildQuery has_child} {@code Query} variant.
	 */
	public static Query hasChild(Function<HasChildQuery.Builder, ObjectBuilder<HasChildQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.hasChild(fn.apply(new HasChildQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HasParentQuery has_parent} {@code Query}
	 * variant.
	 */
	public static HasParentQuery.Builder hasParent() {
		return new HasParentQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link HasParentQuery has_parent} {@code Query}
	 * variant.
	 */
	public static Query hasParent(Function<HasParentQuery.Builder, ObjectBuilder<HasParentQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.hasParent(fn.apply(new HasParentQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IdsQuery ids} {@code Query} variant.
	 */
	public static IdsQuery.Builder ids() {
		return new IdsQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link IdsQuery ids} {@code Query} variant.
	 */
	public static Query ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.ids(fn.apply(new IdsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsQuery intervals} {@code Query}
	 * variant.
	 */
	public static IntervalsQuery.Builder intervals() {
		return new IntervalsQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link IntervalsQuery intervals} {@code Query}
	 * variant.
	 */
	public static Query intervals(Function<IntervalsQuery.Builder, ObjectBuilder<IntervalsQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.intervals(fn.apply(new IntervalsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchQuery match} {@code Query} variant.
	 */
	public static MatchQuery.Builder match() {
		return new MatchQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MatchQuery match} {@code Query} variant.
	 */
	public static Query match(Function<MatchQuery.Builder, ObjectBuilder<MatchQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.match(fn.apply(new MatchQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchAllQuery match_all} {@code Query}
	 * variant.
	 */
	public static MatchAllQuery.Builder matchAll() {
		return new MatchAllQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MatchAllQuery match_all} {@code Query} variant.
	 */
	public static Query matchAll(Function<MatchAllQuery.Builder, ObjectBuilder<MatchAllQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.matchAll(fn.apply(new MatchAllQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchBoolPrefixQuery match_bool_prefix}
	 * {@code Query} variant.
	 */
	public static MatchBoolPrefixQuery.Builder matchBoolPrefix() {
		return new MatchBoolPrefixQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MatchBoolPrefixQuery match_bool_prefix}
	 * {@code Query} variant.
	 */
	public static Query matchBoolPrefix(
			Function<MatchBoolPrefixQuery.Builder, ObjectBuilder<MatchBoolPrefixQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.matchBoolPrefix(fn.apply(new MatchBoolPrefixQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchNoneQuery match_none} {@code Query}
	 * variant.
	 */
	public static MatchNoneQuery.Builder matchNone() {
		return new MatchNoneQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MatchNoneQuery match_none} {@code Query}
	 * variant.
	 */
	public static Query matchNone(Function<MatchNoneQuery.Builder, ObjectBuilder<MatchNoneQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.matchNone(fn.apply(new MatchNoneQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchPhraseQuery match_phrase} {@code Query}
	 * variant.
	 */
	public static MatchPhraseQuery.Builder matchPhrase() {
		return new MatchPhraseQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MatchPhraseQuery match_phrase} {@code Query}
	 * variant.
	 */
	public static Query matchPhrase(Function<MatchPhraseQuery.Builder, ObjectBuilder<MatchPhraseQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.matchPhrase(fn.apply(new MatchPhraseQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchPhrasePrefixQuery match_phrase_prefix}
	 * {@code Query} variant.
	 */
	public static MatchPhrasePrefixQuery.Builder matchPhrasePrefix() {
		return new MatchPhrasePrefixQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MatchPhrasePrefixQuery match_phrase_prefix}
	 * {@code Query} variant.
	 */
	public static Query matchPhrasePrefix(
			Function<MatchPhrasePrefixQuery.Builder, ObjectBuilder<MatchPhrasePrefixQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.matchPhrasePrefix(fn.apply(new MatchPhrasePrefixQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MoreLikeThisQuery more_like_this}
	 * {@code Query} variant.
	 */
	public static MoreLikeThisQuery.Builder moreLikeThis() {
		return new MoreLikeThisQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MoreLikeThisQuery more_like_this} {@code Query}
	 * variant.
	 */
	public static Query moreLikeThis(Function<MoreLikeThisQuery.Builder, ObjectBuilder<MoreLikeThisQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.moreLikeThis(fn.apply(new MoreLikeThisQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MultiMatchQuery multi_match} {@code Query}
	 * variant.
	 */
	public static MultiMatchQuery.Builder multiMatch() {
		return new MultiMatchQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link MultiMatchQuery multi_match} {@code Query}
	 * variant.
	 */
	public static Query multiMatch(Function<MultiMatchQuery.Builder, ObjectBuilder<MultiMatchQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.multiMatch(fn.apply(new MultiMatchQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NestedQuery nested} {@code Query} variant.
	 */
	public static NestedQuery.Builder nested() {
		return new NestedQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link NestedQuery nested} {@code Query} variant.
	 */
	public static Query nested(Function<NestedQuery.Builder, ObjectBuilder<NestedQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.nested(fn.apply(new NestedQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ParentIdQuery parent_id} {@code Query}
	 * variant.
	 */
	public static ParentIdQuery.Builder parentId() {
		return new ParentIdQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link ParentIdQuery parent_id} {@code Query} variant.
	 */
	public static Query parentId(Function<ParentIdQuery.Builder, ObjectBuilder<ParentIdQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.parentId(fn.apply(new ParentIdQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PercolateQuery percolate} {@code Query}
	 * variant.
	 */
	public static PercolateQuery.Builder percolate() {
		return new PercolateQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link PercolateQuery percolate} {@code Query}
	 * variant.
	 */
	public static Query percolate(Function<PercolateQuery.Builder, ObjectBuilder<PercolateQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.percolate(fn.apply(new PercolateQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PinnedQuery pinned} {@code Query} variant.
	 */
	public static PinnedQuery.Builder pinned() {
		return new PinnedQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link PinnedQuery pinned} {@code Query} variant.
	 */
	public static Query pinned(Function<PinnedQuery.Builder, ObjectBuilder<PinnedQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.pinned(fn.apply(new PinnedQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PrefixQuery prefix} {@code Query} variant.
	 */
	public static PrefixQuery.Builder prefix() {
		return new PrefixQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link PrefixQuery prefix} {@code Query} variant.
	 */
	public static Query prefix(Function<PrefixQuery.Builder, ObjectBuilder<PrefixQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.prefix(fn.apply(new PrefixQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link QueryStringQuery query_string} {@code Query}
	 * variant.
	 */
	public static QueryStringQuery.Builder queryString() {
		return new QueryStringQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link QueryStringQuery query_string} {@code Query}
	 * variant.
	 */
	public static Query queryString(Function<QueryStringQuery.Builder, ObjectBuilder<QueryStringQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.queryString(fn.apply(new QueryStringQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeQuery range} {@code Query} variant.
	 */
	public static RangeQuery.Builder range() {
		return new RangeQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link RangeQuery range} {@code Query} variant.
	 */
	public static Query range(Function<RangeQuery.Builder, ObjectBuilder<RangeQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.range(fn.apply(new RangeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RankFeatureQuery rank_feature} {@code Query}
	 * variant.
	 */
	public static RankFeatureQuery.Builder rankFeature() {
		return new RankFeatureQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link RankFeatureQuery rank_feature} {@code Query}
	 * variant.
	 */
	public static Query rankFeature(Function<RankFeatureQuery.Builder, ObjectBuilder<RankFeatureQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.rankFeature(fn.apply(new RankFeatureQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RegexpQuery regexp} {@code Query} variant.
	 */
	public static RegexpQuery.Builder regexp() {
		return new RegexpQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link RegexpQuery regexp} {@code Query} variant.
	 */
	public static Query regexp(Function<RegexpQuery.Builder, ObjectBuilder<RegexpQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.regexp(fn.apply(new RegexpQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RuleQuery rule_query} {@code Query} variant.
	 */
	public static RuleQuery.Builder ruleQuery() {
		return new RuleQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link RuleQuery rule_query} {@code Query} variant.
	 */
	public static Query ruleQuery(Function<RuleQuery.Builder, ObjectBuilder<RuleQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.ruleQuery(fn.apply(new RuleQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptQuery script} {@code Query} variant.
	 */
	public static ScriptQuery.Builder script() {
		return new ScriptQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link ScriptQuery script} {@code Query} variant.
	 */
	public static Query script(Function<ScriptQuery.Builder, ObjectBuilder<ScriptQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.script(fn.apply(new ScriptQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptScoreQuery script_score} {@code Query}
	 * variant.
	 */
	public static ScriptScoreQuery.Builder scriptScore() {
		return new ScriptScoreQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link ScriptScoreQuery script_score} {@code Query}
	 * variant.
	 */
	public static Query scriptScore(Function<ScriptScoreQuery.Builder, ObjectBuilder<ScriptScoreQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.scriptScore(fn.apply(new ScriptScoreQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ShapeQuery shape} {@code Query} variant.
	 */
	public static ShapeQuery.Builder shape() {
		return new ShapeQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link ShapeQuery shape} {@code Query} variant.
	 */
	public static Query shape(Function<ShapeQuery.Builder, ObjectBuilder<ShapeQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.shape(fn.apply(new ShapeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SimpleQueryStringQuery simple_query_string}
	 * {@code Query} variant.
	 */
	public static SimpleQueryStringQuery.Builder simpleQueryString() {
		return new SimpleQueryStringQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SimpleQueryStringQuery simple_query_string}
	 * {@code Query} variant.
	 */
	public static Query simpleQueryString(
			Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.simpleQueryString(fn.apply(new SimpleQueryStringQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanContainingQuery span_containing}
	 * {@code Query} variant.
	 */
	public static SpanContainingQuery.Builder spanContaining() {
		return new SpanContainingQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanContainingQuery span_containing}
	 * {@code Query} variant.
	 */
	public static Query spanContaining(Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanContaining(fn.apply(new SpanContainingQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanFieldMaskingQuery field_masking_span}
	 * {@code Query} variant.
	 */
	public static SpanFieldMaskingQuery.Builder fieldMaskingSpan() {
		return new SpanFieldMaskingQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanFieldMaskingQuery field_masking_span}
	 * {@code Query} variant.
	 */
	public static Query fieldMaskingSpan(
			Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.fieldMaskingSpan(fn.apply(new SpanFieldMaskingQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanFirstQuery span_first} {@code Query}
	 * variant.
	 */
	public static SpanFirstQuery.Builder spanFirst() {
		return new SpanFirstQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanFirstQuery span_first} {@code Query}
	 * variant.
	 */
	public static Query spanFirst(Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanFirst(fn.apply(new SpanFirstQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanMultiTermQuery span_multi} {@code Query}
	 * variant.
	 */
	public static SpanMultiTermQuery.Builder spanMulti() {
		return new SpanMultiTermQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanMultiTermQuery span_multi} {@code Query}
	 * variant.
	 */
	public static Query spanMulti(Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanMulti(fn.apply(new SpanMultiTermQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanNearQuery span_near} {@code Query}
	 * variant.
	 */
	public static SpanNearQuery.Builder spanNear() {
		return new SpanNearQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanNearQuery span_near} {@code Query} variant.
	 */
	public static Query spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanNear(fn.apply(new SpanNearQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanNotQuery span_not} {@code Query}
	 * variant.
	 */
	public static SpanNotQuery.Builder spanNot() {
		return new SpanNotQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanNotQuery span_not} {@code Query} variant.
	 */
	public static Query spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanNot(fn.apply(new SpanNotQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanOrQuery span_or} {@code Query} variant.
	 */
	public static SpanOrQuery.Builder spanOr() {
		return new SpanOrQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanOrQuery span_or} {@code Query} variant.
	 */
	public static Query spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanOr(fn.apply(new SpanOrQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanTermQuery span_term} {@code Query}
	 * variant.
	 */
	public static SpanTermQuery.Builder spanTerm() {
		return new SpanTermQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanTermQuery span_term} {@code Query} variant.
	 */
	public static Query spanTerm(Function<SpanTermQuery.Builder, ObjectBuilder<SpanTermQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanTerm(fn.apply(new SpanTermQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanWithinQuery span_within} {@code Query}
	 * variant.
	 */
	public static SpanWithinQuery.Builder spanWithin() {
		return new SpanWithinQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link SpanWithinQuery span_within} {@code Query}
	 * variant.
	 */
	public static Query spanWithin(Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.spanWithin(fn.apply(new SpanWithinQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermQuery term} {@code Query} variant.
	 */
	public static TermQuery.Builder term() {
		return new TermQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link TermQuery term} {@code Query} variant.
	 */
	public static Query term(Function<TermQuery.Builder, ObjectBuilder<TermQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.term(fn.apply(new TermQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsQuery terms} {@code Query} variant.
	 */
	public static TermsQuery.Builder terms() {
		return new TermsQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link TermsQuery terms} {@code Query} variant.
	 */
	public static Query terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.terms(fn.apply(new TermsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsSetQuery terms_set} {@code Query}
	 * variant.
	 */
	public static TermsSetQuery.Builder termsSet() {
		return new TermsSetQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link TermsSetQuery terms_set} {@code Query} variant.
	 */
	public static Query termsSet(Function<TermsSetQuery.Builder, ObjectBuilder<TermsSetQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.termsSet(fn.apply(new TermsSetQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextExpansionQuery text_expansion}
	 * {@code Query} variant.
	 */
	public static TextExpansionQuery.Builder textExpansion() {
		return new TextExpansionQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link TextExpansionQuery text_expansion}
	 * {@code Query} variant.
	 */
	public static Query textExpansion(Function<TextExpansionQuery.Builder, ObjectBuilder<TextExpansionQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.textExpansion(fn.apply(new TextExpansionQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WildcardQuery wildcard} {@code Query}
	 * variant.
	 */
	public static WildcardQuery.Builder wildcard() {
		return new WildcardQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link WildcardQuery wildcard} {@code Query} variant.
	 */
	public static Query wildcard(Function<WildcardQuery.Builder, ObjectBuilder<WildcardQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.wildcard(fn.apply(new WildcardQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WrapperQuery wrapper} {@code Query} variant.
	 */
	public static WrapperQuery.Builder wrapper() {
		return new WrapperQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link WrapperQuery wrapper} {@code Query} variant.
	 */
	public static Query wrapper(Function<WrapperQuery.Builder, ObjectBuilder<WrapperQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.wrapper(fn.apply(new WrapperQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TypeQuery type} {@code Query} variant.
	 */
	public static TypeQuery.Builder type() {
		return new TypeQuery.Builder();
	}

	/**
	 * Creates a Query of the {@link TypeQuery type} {@code Query} variant.
	 */
	public static Query type(Function<TypeQuery.Builder, ObjectBuilder<TypeQuery>> fn) {
		Query.Builder builder = new Query.Builder();
		builder.type(fn.apply(new TypeQuery.Builder()).build());
		return builder.build();
	}

}
