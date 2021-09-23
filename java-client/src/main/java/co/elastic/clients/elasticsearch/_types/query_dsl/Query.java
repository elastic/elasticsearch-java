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

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.QueryContainer
public interface Query extends JsonpSerializable {

	String BOOL = "bool";
	String BOOSTING = "boosting";
	String COMMON = "common";
	String COMBINED_FIELDS = "combined_fields";
	String CONSTANT_SCORE = "constant_score";
	String DIS_MAX = "dis_max";
	String EXISTS = "exists";
	String FUNCTION_SCORE = "function_score";
	String FUZZY = "fuzzy";
	String GEO_BOUNDING_BOX = "geo_bounding_box";
	String GEO_DISTANCE = "geo_distance";
	String GEO_POLYGON = "geo_polygon";
	String GEO_SHAPE = "geo_shape";
	String HAS_CHILD = "has_child";
	String HAS_PARENT = "has_parent";
	String IDS = "ids";
	String INTERVALS = "intervals";
	String MATCH = "match";
	String MATCH_ALL = "match_all";
	String MATCH_BOOL_PREFIX = "match_bool_prefix";
	String MATCH_NONE = "match_none";
	String MATCH_PHRASE = "match_phrase";
	String MATCH_PHRASE_PREFIX = "match_phrase_prefix";
	String MORE_LIKE_THIS = "more_like_this";
	String MULTI_MATCH = "multi_match";
	String NESTED = "nested";
	String PARENT_ID = "parent_id";
	String PERCOLATE = "percolate";
	String PINNED = "pinned";
	String PREFIX = "prefix";
	String QUERY_STRING = "query_string";
	String RANK_FEATURE = "rank_feature";
	String REGEXP = "regexp";
	String SCRIPT = "script";
	String SCRIPT_SCORE = "script_score";
	String SHAPE = "shape";
	String SIMPLE_QUERY_STRING = "simple_query_string";
	String SPAN_CONTAINING = "span_containing";
	String FIELD_MASKING_SPAN = "field_masking_span";
	String SPAN_FIRST = "span_first";
	String SPAN_MULTI = "span_multi";
	String SPAN_NEAR = "span_near";
	String SPAN_NOT = "span_not";
	String SPAN_OR = "span_or";
	String SPAN_TERM = "span_term";
	String SPAN_WITHIN = "span_within";
	String TERM = "term";
	String TERMS = "terms";
	String TERMS_SET = "terms_set";
	String WILDCARD = "wildcard";
	String TYPE = "type";

	/**
	 * The type of this {@code QueryContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code bool}
		 */
		public ObjectBuilder<Query> bool(BoolQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code bool}
		 */
		public ObjectBuilder<Query> bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> fn) {
			return this.bool(fn.apply(new BoolQuery.Builder()).build());
		}

		/**
		 * API name: {@code boosting}
		 */
		public ObjectBuilder<Query> boosting(BoostingQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code boosting}
		 */
		public ObjectBuilder<Query> boosting(Function<BoostingQuery.Builder, ObjectBuilder<BoostingQuery>> fn) {
			return this.boosting(fn.apply(new BoostingQuery.Builder()).build());
		}

		/**
		 * API name: {@code common}
		 */
		public ObjectBuilder<Query> common(CommonTermsQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code common}
		 */
		public ObjectBuilder<Query> common(Function<CommonTermsQuery.Builder, ObjectBuilder<CommonTermsQuery>> fn) {
			return this.common(fn.apply(new CommonTermsQuery.Builder()).build());
		}

		/**
		 * API name: {@code combined_fields}
		 */
		public ObjectBuilder<Query> combinedFields(CombinedFieldsQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code combined_fields}
		 */
		public ObjectBuilder<Query> combinedFields(
				Function<CombinedFieldsQuery.Builder, ObjectBuilder<CombinedFieldsQuery>> fn) {
			return this.combinedFields(fn.apply(new CombinedFieldsQuery.Builder()).build());
		}

		/**
		 * API name: {@code constant_score}
		 */
		public ObjectBuilder<Query> constantScore(ConstantScoreQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code constant_score}
		 */
		public ObjectBuilder<Query> constantScore(
				Function<ConstantScoreQuery.Builder, ObjectBuilder<ConstantScoreQuery>> fn) {
			return this.constantScore(fn.apply(new ConstantScoreQuery.Builder()).build());
		}

		/**
		 * API name: {@code dis_max}
		 */
		public ObjectBuilder<Query> disMax(DisMaxQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code dis_max}
		 */
		public ObjectBuilder<Query> disMax(Function<DisMaxQuery.Builder, ObjectBuilder<DisMaxQuery>> fn) {
			return this.disMax(fn.apply(new DisMaxQuery.Builder()).build());
		}

		/**
		 * API name: {@code exists}
		 */
		public ObjectBuilder<Query> exists(ExistsQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code exists}
		 */
		public ObjectBuilder<Query> exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> fn) {
			return this.exists(fn.apply(new ExistsQuery.Builder()).build());
		}

		/**
		 * API name: {@code function_score}
		 */
		public ObjectBuilder<Query> functionScore(FunctionScoreQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code function_score}
		 */
		public ObjectBuilder<Query> functionScore(
				Function<FunctionScoreQuery.Builder, ObjectBuilder<FunctionScoreQuery>> fn) {
			return this.functionScore(fn.apply(new FunctionScoreQuery.Builder()).build());
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public ObjectBuilder<Query> fuzzy(FuzzyQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public ObjectBuilder<Query> fuzzy(Function<FuzzyQuery.Builder, ObjectBuilder<FuzzyQuery>> fn) {
			return this.fuzzy(fn.apply(new FuzzyQuery.Builder()).build());
		}

		/**
		 * API name: {@code geo_bounding_box}
		 */
		public ObjectBuilder<Query> geoBoundingBox(GeoBoundingBoxQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code geo_bounding_box}
		 */
		public ObjectBuilder<Query> geoBoundingBox(
				Function<GeoBoundingBoxQuery.Builder, ObjectBuilder<GeoBoundingBoxQuery>> fn) {
			return this.geoBoundingBox(fn.apply(new GeoBoundingBoxQuery.Builder()).build());
		}

		/**
		 * API name: {@code geo_distance}
		 */
		public ObjectBuilder<Query> geoDistance(GeoDistanceQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code geo_distance}
		 */
		public ObjectBuilder<Query> geoDistance(
				Function<GeoDistanceQuery.Builder, ObjectBuilder<GeoDistanceQuery>> fn) {
			return this.geoDistance(fn.apply(new GeoDistanceQuery.Builder()).build());
		}

		/**
		 * API name: {@code geo_polygon}
		 */
		public ObjectBuilder<Query> geoPolygon(GeoPolygonQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code geo_polygon}
		 */
		public ObjectBuilder<Query> geoPolygon(Function<GeoPolygonQuery.Builder, ObjectBuilder<GeoPolygonQuery>> fn) {
			return this.geoPolygon(fn.apply(new GeoPolygonQuery.Builder()).build());
		}

		/**
		 * API name: {@code geo_shape}
		 */
		public ObjectBuilder<Query> geoShape(GeoShapeQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code geo_shape}
		 */
		public ObjectBuilder<Query> geoShape(Function<GeoShapeQuery.Builder, ObjectBuilder<GeoShapeQuery>> fn) {
			return this.geoShape(fn.apply(new GeoShapeQuery.Builder()).build());
		}

		/**
		 * API name: {@code has_child}
		 */
		public ObjectBuilder<Query> hasChild(HasChildQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code has_child}
		 */
		public ObjectBuilder<Query> hasChild(Function<HasChildQuery.Builder, ObjectBuilder<HasChildQuery>> fn) {
			return this.hasChild(fn.apply(new HasChildQuery.Builder()).build());
		}

		/**
		 * API name: {@code has_parent}
		 */
		public ObjectBuilder<Query> hasParent(HasParentQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code has_parent}
		 */
		public ObjectBuilder<Query> hasParent(Function<HasParentQuery.Builder, ObjectBuilder<HasParentQuery>> fn) {
			return this.hasParent(fn.apply(new HasParentQuery.Builder()).build());
		}

		/**
		 * API name: {@code ids}
		 */
		public ObjectBuilder<Query> ids(IdsQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code ids}
		 */
		public ObjectBuilder<Query> ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> fn) {
			return this.ids(fn.apply(new IdsQuery.Builder()).build());
		}

		/**
		 * API name: {@code intervals}
		 */
		public ObjectBuilder<Query> intervals(IntervalsQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code intervals}
		 */
		public ObjectBuilder<Query> intervals(Function<IntervalsQuery.Builder, ObjectBuilder<IntervalsQuery>> fn) {
			return this.intervals(fn.apply(new IntervalsQuery.Builder()).build());
		}

		/**
		 * API name: {@code match}
		 */
		public ObjectBuilder<Query> match(MatchQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code match}
		 */
		public ObjectBuilder<Query> match(Function<MatchQuery.Builder, ObjectBuilder<MatchQuery>> fn) {
			return this.match(fn.apply(new MatchQuery.Builder()).build());
		}

		/**
		 * API name: {@code match_all}
		 */
		public ObjectBuilder<Query> matchAll(MatchAllQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code match_all}
		 */
		public ObjectBuilder<Query> matchAll(Function<MatchAllQuery.Builder, ObjectBuilder<MatchAllQuery>> fn) {
			return this.matchAll(fn.apply(new MatchAllQuery.Builder()).build());
		}

		/**
		 * API name: {@code match_bool_prefix}
		 */
		public ObjectBuilder<Query> matchBoolPrefix(MatchBoolPrefixQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code match_bool_prefix}
		 */
		public ObjectBuilder<Query> matchBoolPrefix(
				Function<MatchBoolPrefixQuery.Builder, ObjectBuilder<MatchBoolPrefixQuery>> fn) {
			return this.matchBoolPrefix(fn.apply(new MatchBoolPrefixQuery.Builder()).build());
		}

		/**
		 * API name: {@code match_none}
		 */
		public ObjectBuilder<Query> matchNone(MatchNoneQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code match_none}
		 */
		public ObjectBuilder<Query> matchNone(Function<MatchNoneQuery.Builder, ObjectBuilder<MatchNoneQuery>> fn) {
			return this.matchNone(fn.apply(new MatchNoneQuery.Builder()).build());
		}

		/**
		 * API name: {@code match_phrase}
		 */
		public ObjectBuilder<Query> matchPhrase(MatchPhraseQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code match_phrase}
		 */
		public ObjectBuilder<Query> matchPhrase(
				Function<MatchPhraseQuery.Builder, ObjectBuilder<MatchPhraseQuery>> fn) {
			return this.matchPhrase(fn.apply(new MatchPhraseQuery.Builder()).build());
		}

		/**
		 * API name: {@code match_phrase_prefix}
		 */
		public ObjectBuilder<Query> matchPhrasePrefix(MatchPhrasePrefixQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code match_phrase_prefix}
		 */
		public ObjectBuilder<Query> matchPhrasePrefix(
				Function<MatchPhrasePrefixQuery.Builder, ObjectBuilder<MatchPhrasePrefixQuery>> fn) {
			return this.matchPhrasePrefix(fn.apply(new MatchPhrasePrefixQuery.Builder()).build());
		}

		/**
		 * API name: {@code more_like_this}
		 */
		public ObjectBuilder<Query> moreLikeThis(MoreLikeThisQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code more_like_this}
		 */
		public ObjectBuilder<Query> moreLikeThis(
				Function<MoreLikeThisQuery.Builder, ObjectBuilder<MoreLikeThisQuery>> fn) {
			return this.moreLikeThis(fn.apply(new MoreLikeThisQuery.Builder()).build());
		}

		/**
		 * API name: {@code multi_match}
		 */
		public ObjectBuilder<Query> multiMatch(MultiMatchQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code multi_match}
		 */
		public ObjectBuilder<Query> multiMatch(Function<MultiMatchQuery.Builder, ObjectBuilder<MultiMatchQuery>> fn) {
			return this.multiMatch(fn.apply(new MultiMatchQuery.Builder()).build());
		}

		/**
		 * API name: {@code nested}
		 */
		public ObjectBuilder<Query> nested(NestedQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code nested}
		 */
		public ObjectBuilder<Query> nested(Function<NestedQuery.Builder, ObjectBuilder<NestedQuery>> fn) {
			return this.nested(fn.apply(new NestedQuery.Builder()).build());
		}

		/**
		 * API name: {@code parent_id}
		 */
		public ObjectBuilder<Query> parentId(ParentIdQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code parent_id}
		 */
		public ObjectBuilder<Query> parentId(Function<ParentIdQuery.Builder, ObjectBuilder<ParentIdQuery>> fn) {
			return this.parentId(fn.apply(new ParentIdQuery.Builder()).build());
		}

		/**
		 * API name: {@code percolate}
		 */
		public ObjectBuilder<Query> percolate(PercolateQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code percolate}
		 */
		public ObjectBuilder<Query> percolate(Function<PercolateQuery.Builder, ObjectBuilder<PercolateQuery>> fn) {
			return this.percolate(fn.apply(new PercolateQuery.Builder()).build());
		}

		/**
		 * API name: {@code pinned}
		 */
		public ObjectBuilder<Query> pinned(PinnedQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code pinned}
		 */
		public ObjectBuilder<Query> pinned(Function<PinnedQuery.Builder, ObjectBuilder<PinnedQuery>> fn) {
			return this.pinned(fn.apply(new PinnedQuery.Builder()).build());
		}

		/**
		 * API name: {@code prefix}
		 */
		public ObjectBuilder<Query> prefix(PrefixQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code prefix}
		 */
		public ObjectBuilder<Query> prefix(Function<PrefixQuery.Builder, ObjectBuilder<PrefixQuery>> fn) {
			return this.prefix(fn.apply(new PrefixQuery.Builder()).build());
		}

		/**
		 * API name: {@code query_string}
		 */
		public ObjectBuilder<Query> queryString(QueryStringQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code query_string}
		 */
		public ObjectBuilder<Query> queryString(
				Function<QueryStringQuery.Builder, ObjectBuilder<QueryStringQuery>> fn) {
			return this.queryString(fn.apply(new QueryStringQuery.Builder()).build());
		}

		/**
		 * API name: {@code rank_feature}
		 */
		public ObjectBuilder<Query> rankFeature(RankFeatureQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code rank_feature}
		 */
		public ObjectBuilder<Query> rankFeature(
				Function<RankFeatureQuery.Builder, ObjectBuilder<RankFeatureQuery>> fn) {
			return this.rankFeature(fn.apply(new RankFeatureQuery.Builder()).build());
		}

		/**
		 * API name: {@code regexp}
		 */
		public ObjectBuilder<Query> regexp(RegexpQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code regexp}
		 */
		public ObjectBuilder<Query> regexp(Function<RegexpQuery.Builder, ObjectBuilder<RegexpQuery>> fn) {
			return this.regexp(fn.apply(new RegexpQuery.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public ObjectBuilder<Query> script(ScriptQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code script}
		 */
		public ObjectBuilder<Query> script(Function<ScriptQuery.Builder, ObjectBuilder<ScriptQuery>> fn) {
			return this.script(fn.apply(new ScriptQuery.Builder()).build());
		}

		/**
		 * API name: {@code script_score}
		 */
		public ObjectBuilder<Query> scriptScore(ScriptScoreQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code script_score}
		 */
		public ObjectBuilder<Query> scriptScore(
				Function<ScriptScoreQuery.Builder, ObjectBuilder<ScriptScoreQuery>> fn) {
			return this.scriptScore(fn.apply(new ScriptScoreQuery.Builder()).build());
		}

		/**
		 * API name: {@code shape}
		 */
		public ObjectBuilder<Query> shape(ShapeQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code shape}
		 */
		public ObjectBuilder<Query> shape(Function<ShapeQuery.Builder, ObjectBuilder<ShapeQuery>> fn) {
			return this.shape(fn.apply(new ShapeQuery.Builder()).build());
		}

		/**
		 * API name: {@code simple_query_string}
		 */
		public ObjectBuilder<Query> simpleQueryString(SimpleQueryStringQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code simple_query_string}
		 */
		public ObjectBuilder<Query> simpleQueryString(
				Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> fn) {
			return this.simpleQueryString(fn.apply(new SimpleQueryStringQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_containing}
		 */
		public ObjectBuilder<Query> spanContaining(SpanContainingQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_containing}
		 */
		public ObjectBuilder<Query> spanContaining(
				Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> fn) {
			return this.spanContaining(fn.apply(new SpanContainingQuery.Builder()).build());
		}

		/**
		 * API name: {@code field_masking_span}
		 */
		public ObjectBuilder<Query> fieldMaskingSpan(SpanFieldMaskingQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code field_masking_span}
		 */
		public ObjectBuilder<Query> fieldMaskingSpan(
				Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> fn) {
			return this.fieldMaskingSpan(fn.apply(new SpanFieldMaskingQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_first}
		 */
		public ObjectBuilder<Query> spanFirst(SpanFirstQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_first}
		 */
		public ObjectBuilder<Query> spanFirst(Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> fn) {
			return this.spanFirst(fn.apply(new SpanFirstQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_multi}
		 */
		public ObjectBuilder<Query> spanMulti(SpanMultiTermQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_multi}
		 */
		public ObjectBuilder<Query> spanMulti(
				Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> fn) {
			return this.spanMulti(fn.apply(new SpanMultiTermQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_near}
		 */
		public ObjectBuilder<Query> spanNear(SpanNearQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_near}
		 */
		public ObjectBuilder<Query> spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> fn) {
			return this.spanNear(fn.apply(new SpanNearQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_not}
		 */
		public ObjectBuilder<Query> spanNot(SpanNotQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_not}
		 */
		public ObjectBuilder<Query> spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> fn) {
			return this.spanNot(fn.apply(new SpanNotQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_or}
		 */
		public ObjectBuilder<Query> spanOr(SpanOrQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_or}
		 */
		public ObjectBuilder<Query> spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> fn) {
			return this.spanOr(fn.apply(new SpanOrQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_term}
		 */
		public ObjectBuilder<Query> spanTerm(SpanTermQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_term}
		 */
		public ObjectBuilder<Query> spanTerm(Function<SpanTermQuery.Builder, ObjectBuilder<SpanTermQuery>> fn) {
			return this.spanTerm(fn.apply(new SpanTermQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_within}
		 */
		public ObjectBuilder<Query> spanWithin(SpanWithinQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_within}
		 */
		public ObjectBuilder<Query> spanWithin(Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> fn) {
			return this.spanWithin(fn.apply(new SpanWithinQuery.Builder()).build());
		}

		/**
		 * API name: {@code term}
		 */
		public ObjectBuilder<Query> term(TermQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code term}
		 */
		public ObjectBuilder<Query> term(Function<TermQuery.Builder, ObjectBuilder<TermQuery>> fn) {
			return this.term(fn.apply(new TermQuery.Builder()).build());
		}

		/**
		 * API name: {@code terms}
		 */
		public ObjectBuilder<Query> terms(TermsQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code terms}
		 */
		public ObjectBuilder<Query> terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> fn) {
			return this.terms(fn.apply(new TermsQuery.Builder()).build());
		}

		/**
		 * API name: {@code terms_set}
		 */
		public ObjectBuilder<Query> termsSet(TermsSetQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code terms_set}
		 */
		public ObjectBuilder<Query> termsSet(Function<TermsSetQuery.Builder, ObjectBuilder<TermsSetQuery>> fn) {
			return this.termsSet(fn.apply(new TermsSetQuery.Builder()).build());
		}

		/**
		 * API name: {@code wildcard}
		 */
		public ObjectBuilder<Query> wildcard(WildcardQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code wildcard}
		 */
		public ObjectBuilder<Query> wildcard(Function<WildcardQuery.Builder, ObjectBuilder<WildcardQuery>> fn) {
			return this.wildcard(fn.apply(new WildcardQuery.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public ObjectBuilder<Query> type(TypeQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code type}
		 */
		public ObjectBuilder<Query> type(Function<TypeQuery.Builder, ObjectBuilder<TypeQuery>> fn) {
			return this.type(fn.apply(new TypeQuery.Builder()).build());
		}

	}

	class $Helper {
		private static Query deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends Query> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case BOOL : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = BoolQuery.$BUILDER_DESERIALIZER.deserialize(new BoolQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case BOOSTING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = BoostingQuery.$BUILDER_DESERIALIZER.deserialize(new BoostingQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case COMMON : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = CommonTermsQuery.$BUILDER_DESERIALIZER.deserialize(new CommonTermsQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case COMBINED_FIELDS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = CombinedFieldsQuery.$BUILDER_DESERIALIZER
								.deserialize(new CombinedFieldsQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case CONSTANT_SCORE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ConstantScoreQuery.$BUILDER_DESERIALIZER.deserialize(new ConstantScoreQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case DIS_MAX : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DisMaxQuery.$BUILDER_DESERIALIZER.deserialize(new DisMaxQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case EXISTS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ExistsQuery.$BUILDER_DESERIALIZER.deserialize(new ExistsQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case FUNCTION_SCORE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = FunctionScoreQuery.$BUILDER_DESERIALIZER.deserialize(new FunctionScoreQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case FUZZY : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = FuzzyQuery.$BUILDER_DESERIALIZER.deserialize(new FuzzyQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case GEO_BOUNDING_BOX : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = GeoBoundingBoxQuery.$BUILDER_DESERIALIZER
								.deserialize(new GeoBoundingBoxQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case GEO_DISTANCE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = GeoDistanceQuery.$BUILDER_DESERIALIZER.deserialize(new GeoDistanceQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case GEO_POLYGON : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = GeoPolygonQuery.$BUILDER_DESERIALIZER.deserialize(new GeoPolygonQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case GEO_SHAPE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = GeoShapeQuery.$BUILDER_DESERIALIZER.deserialize(new GeoShapeQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case HAS_CHILD : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = HasChildQuery.$BUILDER_DESERIALIZER.deserialize(new HasChildQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case HAS_PARENT : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = HasParentQuery.$BUILDER_DESERIALIZER.deserialize(new HasParentQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case IDS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IdsQuery.$BUILDER_DESERIALIZER.deserialize(new IdsQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case INTERVALS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IntervalsQuery.$BUILDER_DESERIALIZER.deserialize(new IntervalsQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case MATCH : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MatchQuery.$BUILDER_DESERIALIZER.deserialize(new MatchQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case MATCH_ALL : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MatchAllQuery.$BUILDER_DESERIALIZER.deserialize(new MatchAllQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case MATCH_BOOL_PREFIX : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MatchBoolPrefixQuery.$BUILDER_DESERIALIZER
								.deserialize(new MatchBoolPrefixQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case MATCH_NONE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MatchNoneQuery.$BUILDER_DESERIALIZER.deserialize(new MatchNoneQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case MATCH_PHRASE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MatchPhraseQuery.$BUILDER_DESERIALIZER.deserialize(new MatchPhraseQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case MATCH_PHRASE_PREFIX : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MatchPhrasePrefixQuery.$BUILDER_DESERIALIZER
								.deserialize(new MatchPhrasePrefixQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case MORE_LIKE_THIS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MoreLikeThisQuery.$BUILDER_DESERIALIZER.deserialize(new MoreLikeThisQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case MULTI_MATCH : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = MultiMatchQuery.$BUILDER_DESERIALIZER.deserialize(new MultiMatchQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case NESTED : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = NestedQuery.$BUILDER_DESERIALIZER.deserialize(new NestedQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case PARENT_ID : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ParentIdQuery.$BUILDER_DESERIALIZER.deserialize(new ParentIdQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case PERCOLATE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = PercolateQuery.$BUILDER_DESERIALIZER.deserialize(new PercolateQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case PINNED : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = PinnedQuery.$BUILDER_DESERIALIZER.deserialize(new PinnedQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case PREFIX : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = PrefixQuery.$BUILDER_DESERIALIZER.deserialize(new PrefixQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case QUERY_STRING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = QueryStringQuery.$BUILDER_DESERIALIZER.deserialize(new QueryStringQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case RANK_FEATURE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = RankFeatureQuery.$BUILDER_DESERIALIZER.deserialize(new RankFeatureQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case REGEXP : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = RegexpQuery.$BUILDER_DESERIALIZER.deserialize(new RegexpQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SCRIPT : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ScriptQuery.$BUILDER_DESERIALIZER.deserialize(new ScriptQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SCRIPT_SCORE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ScriptScoreQuery.$BUILDER_DESERIALIZER.deserialize(new ScriptScoreQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case SHAPE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ShapeQuery.$BUILDER_DESERIALIZER.deserialize(new ShapeQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case SIMPLE_QUERY_STRING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SimpleQueryStringQuery.$BUILDER_DESERIALIZER
								.deserialize(new SimpleQueryStringQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case SPAN_CONTAINING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanContainingQuery.$BUILDER_DESERIALIZER
								.deserialize(new SpanContainingQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case FIELD_MASKING_SPAN : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanFieldMaskingQuery.$BUILDER_DESERIALIZER
								.deserialize(new SpanFieldMaskingQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case SPAN_FIRST : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanFirstQuery.$BUILDER_DESERIALIZER.deserialize(new SpanFirstQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_MULTI : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanMultiTermQuery.$BUILDER_DESERIALIZER.deserialize(new SpanMultiTermQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case SPAN_NEAR : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanNearQuery.$BUILDER_DESERIALIZER.deserialize(new SpanNearQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_NOT : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanNotQuery.$BUILDER_DESERIALIZER.deserialize(new SpanNotQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_OR : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanOrQuery.$BUILDER_DESERIALIZER.deserialize(new SpanOrQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_TERM : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanTermQuery.$BUILDER_DESERIALIZER.deserialize(new SpanTermQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_WITHIN : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanWithinQuery.$BUILDER_DESERIALIZER.deserialize(new SpanWithinQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case TERM : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TermQuery.$BUILDER_DESERIALIZER.deserialize(new TermQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case TERMS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TermsQuery.$BUILDER_DESERIALIZER.deserialize(new TermsQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case TERMS_SET : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TermsSetQuery.$BUILDER_DESERIALIZER.deserialize(new TermsSetQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case WILDCARD : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = WildcardQuery.$BUILDER_DESERIALIZER.deserialize(new WildcardQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case TYPE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TypeQuery.$BUILDER_DESERIALIZER.deserialize(new TypeQuery.Builder(), parser, mapper,
								parser.next());
						break;
					}
					default : {
						JsonpUtils.unknownKey(parser, fieldName);
					}
				}
			}

			return JsonpUtils.buildVariant(parser, builder);
		}
	}

	JsonpDeserializer<Query> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
