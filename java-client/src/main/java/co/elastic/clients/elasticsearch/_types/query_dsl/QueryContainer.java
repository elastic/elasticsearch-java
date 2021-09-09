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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class QueryContainer extends TaggedUnion<QueryContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		bool("bool"),

		boosting("boosting"),

		common("common"),

		combinedFields("combined_fields"),

		constantScore("constant_score"),

		disMax("dis_max"),

		distanceFeature("distance_feature"),

		exists("exists"),

		functionScore("function_score"),

		fuzzy("fuzzy"),

		geoBoundingBox("geo_bounding_box"),

		geoDistance("geo_distance"),

		geoPolygon("geo_polygon"),

		geoShape("geo_shape"),

		hasChild("has_child"),

		hasParent("has_parent"),

		ids("ids"),

		intervals("intervals"),

		match("match"),

		matchAll("match_all"),

		matchBoolPrefix("match_bool_prefix"),

		matchNone("match_none"),

		matchPhrase("match_phrase"),

		matchPhrasePrefix("match_phrase_prefix"),

		moreLikeThis("more_like_this"),

		multiMatch("multi_match"),

		nested("nested"),

		parentId("parent_id"),

		percolate("percolate"),

		pinned("pinned"),

		prefix("prefix"),

		queryString("query_string"),

		range("range"),

		rankFeature("rank_feature"),

		regexp("regexp"),

		script("script"),

		scriptScore("script_score"),

		shape("shape"),

		simpleQueryString("simple_query_string"),

		spanContaining("span_containing"),

		fieldMaskingSpan("field_masking_span"),

		spanFirst("span_first"),

		spanMulti("span_multi"),

		spanNear("span_near"),

		spanNot("span_not"),

		spanOr("span_or"),

		spanTerm("span_term"),

		spanWithin("span_within"),

		term("term"),

		terms("terms"),

		termsSet("terms_set"),

		wildcard("wildcard"),

		type("type"),

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

	private QueryContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link QueryContainer} of a {@code bool} kind?
	 */
	public boolean isBool() {
		return is(Tag.bool);
	}

	/**
	 * Get the {@code bool} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bool} kind.
	 */
	public BoolQuery bool() {
		return get(Tag.bool);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code boosting} kind?
	 */
	public boolean isBoosting() {
		return is(Tag.boosting);
	}

	/**
	 * Get the {@code boosting} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boosting} kind.
	 */
	public BoostingQuery boosting() {
		return get(Tag.boosting);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code common} kind?
	 */
	public boolean isCommon() {
		return is(Tag.common);
	}

	/**
	 * Get the {@code common} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code common} kind.
	 */
	public NamedValue<CommonTermsQuery> common() {
		return get(Tag.common);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code combined_fields} kind?
	 */
	public boolean isCombinedFields() {
		return is(Tag.combinedFields);
	}

	/**
	 * Get the {@code combined_fields} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code combined_fields}
	 *             kind.
	 */
	public CombinedFieldsQuery combinedFields() {
		return get(Tag.combinedFields);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code constant_score} kind?
	 */
	public boolean isConstantScore() {
		return is(Tag.constantScore);
	}

	/**
	 * Get the {@code constant_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code constant_score} kind.
	 */
	public ConstantScoreQuery constantScore() {
		return get(Tag.constantScore);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code dis_max} kind?
	 */
	public boolean isDisMax() {
		return is(Tag.disMax);
	}

	/**
	 * Get the {@code dis_max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dis_max} kind.
	 */
	public DisMaxQuery disMax() {
		return get(Tag.disMax);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code distance_feature} kind?
	 */
	public boolean isDistanceFeature() {
		return is(Tag.distanceFeature);
	}

	/**
	 * Get the {@code distance_feature} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code distance_feature}
	 *             kind.
	 */
	public JsonValue distanceFeature() {
		return get(Tag.distanceFeature);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code exists} kind?
	 */
	public boolean isExists() {
		return is(Tag.exists);
	}

	/**
	 * Get the {@code exists} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exists} kind.
	 */
	public ExistsQuery exists() {
		return get(Tag.exists);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code function_score} kind?
	 */
	public boolean isFunctionScore() {
		return is(Tag.functionScore);
	}

	/**
	 * Get the {@code function_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code function_score} kind.
	 */
	public FunctionScoreQuery functionScore() {
		return get(Tag.functionScore);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code fuzzy} kind?
	 */
	public boolean isFuzzy() {
		return is(Tag.fuzzy);
	}

	/**
	 * Get the {@code fuzzy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fuzzy} kind.
	 */
	public NamedValue<FuzzyQuery> fuzzy() {
		return get(Tag.fuzzy);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code geo_bounding_box} kind?
	 */
	public boolean isGeoBoundingBox() {
		return is(Tag.geoBoundingBox);
	}

	/**
	 * Get the {@code geo_bounding_box} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounding_box}
	 *             kind.
	 */
	public GeoBoundingBoxQuery geoBoundingBox() {
		return get(Tag.geoBoundingBox);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code geo_distance} kind?
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
	public GeoDistanceQuery geoDistance() {
		return get(Tag.geoDistance);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code geo_polygon} kind?
	 */
	public boolean isGeoPolygon() {
		return is(Tag.geoPolygon);
	}

	/**
	 * Get the {@code geo_polygon} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_polygon} kind.
	 */
	public GeoPolygonQuery geoPolygon() {
		return get(Tag.geoPolygon);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code geo_shape} kind?
	 */
	public boolean isGeoShape() {
		return is(Tag.geoShape);
	}

	/**
	 * Get the {@code geo_shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_shape} kind.
	 */
	public GeoShapeQuery geoShape() {
		return get(Tag.geoShape);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code has_child} kind?
	 */
	public boolean isHasChild() {
		return is(Tag.hasChild);
	}

	/**
	 * Get the {@code has_child} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code has_child} kind.
	 */
	public HasChildQuery hasChild() {
		return get(Tag.hasChild);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code has_parent} kind?
	 */
	public boolean isHasParent() {
		return is(Tag.hasParent);
	}

	/**
	 * Get the {@code has_parent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code has_parent} kind.
	 */
	public HasParentQuery hasParent() {
		return get(Tag.hasParent);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code ids} kind?
	 */
	public boolean isIds() {
		return is(Tag.ids);
	}

	/**
	 * Get the {@code ids} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ids} kind.
	 */
	public IdsQuery ids() {
		return get(Tag.ids);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code intervals} kind?
	 */
	public boolean isIntervals() {
		return is(Tag.intervals);
	}

	/**
	 * Get the {@code intervals} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code intervals} kind.
	 */
	public NamedValue<IntervalsQuery> intervals() {
		return get(Tag.intervals);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code match} kind?
	 */
	public boolean isMatch() {
		return is(Tag.match);
	}

	/**
	 * Get the {@code match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match} kind.
	 */
	public NamedValue<MatchQuery> match() {
		return get(Tag.match);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code match_all} kind?
	 */
	public boolean isMatchAll() {
		return is(Tag.matchAll);
	}

	/**
	 * Get the {@code match_all} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_all} kind.
	 */
	public JsonValue matchAll() {
		return get(Tag.matchAll);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code match_bool_prefix} kind?
	 */
	public boolean isMatchBoolPrefix() {
		return is(Tag.matchBoolPrefix);
	}

	/**
	 * Get the {@code match_bool_prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_bool_prefix}
	 *             kind.
	 */
	public NamedValue<MatchBoolPrefixQuery> matchBoolPrefix() {
		return get(Tag.matchBoolPrefix);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code match_none} kind?
	 */
	public boolean isMatchNone() {
		return is(Tag.matchNone);
	}

	/**
	 * Get the {@code match_none} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_none} kind.
	 */
	public JsonValue matchNone() {
		return get(Tag.matchNone);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code match_phrase} kind?
	 */
	public boolean isMatchPhrase() {
		return is(Tag.matchPhrase);
	}

	/**
	 * Get the {@code match_phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_phrase} kind.
	 */
	public NamedValue<MatchPhraseQuery> matchPhrase() {
		return get(Tag.matchPhrase);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code match_phrase_prefix} kind?
	 */
	public boolean isMatchPhrasePrefix() {
		return is(Tag.matchPhrasePrefix);
	}

	/**
	 * Get the {@code match_phrase_prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_phrase_prefix}
	 *             kind.
	 */
	public NamedValue<MatchPhrasePrefixQuery> matchPhrasePrefix() {
		return get(Tag.matchPhrasePrefix);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code more_like_this} kind?
	 */
	public boolean isMoreLikeThis() {
		return is(Tag.moreLikeThis);
	}

	/**
	 * Get the {@code more_like_this} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code more_like_this} kind.
	 */
	public MoreLikeThisQuery moreLikeThis() {
		return get(Tag.moreLikeThis);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code multi_match} kind?
	 */
	public boolean isMultiMatch() {
		return is(Tag.multiMatch);
	}

	/**
	 * Get the {@code multi_match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_match} kind.
	 */
	public MultiMatchQuery multiMatch() {
		return get(Tag.multiMatch);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code nested} kind?
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
	public NestedQuery nested() {
		return get(Tag.nested);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code parent_id} kind?
	 */
	public boolean isParentId() {
		return is(Tag.parentId);
	}

	/**
	 * Get the {@code parent_id} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code parent_id} kind.
	 */
	public ParentIdQuery parentId() {
		return get(Tag.parentId);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code percolate} kind?
	 */
	public boolean isPercolate() {
		return is(Tag.percolate);
	}

	/**
	 * Get the {@code percolate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percolate} kind.
	 */
	public PercolateQuery percolate() {
		return get(Tag.percolate);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code pinned} kind?
	 */
	public boolean isPinned() {
		return is(Tag.pinned);
	}

	/**
	 * Get the {@code pinned} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pinned} kind.
	 */
	public PinnedQuery pinned() {
		return get(Tag.pinned);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code prefix} kind?
	 */
	public boolean isPrefix() {
		return is(Tag.prefix);
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public NamedValue<PrefixQuery> prefix() {
		return get(Tag.prefix);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code query_string} kind?
	 */
	public boolean isQueryString() {
		return is(Tag.queryString);
	}

	/**
	 * Get the {@code query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query_string} kind.
	 */
	public QueryStringQuery queryString() {
		return get(Tag.queryString);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code range} kind?
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
	public NamedValue<JsonValue> range() {
		return get(Tag.range);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code rank_feature} kind?
	 */
	public boolean isRankFeature() {
		return is(Tag.rankFeature);
	}

	/**
	 * Get the {@code rank_feature} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rank_feature} kind.
	 */
	public RankFeatureQuery rankFeature() {
		return get(Tag.rankFeature);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code regexp} kind?
	 */
	public boolean isRegexp() {
		return is(Tag.regexp);
	}

	/**
	 * Get the {@code regexp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regexp} kind.
	 */
	public NamedValue<RegexpQuery> regexp() {
		return get(Tag.regexp);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code script} kind?
	 */
	public boolean isScript() {
		return is(Tag.script);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptQuery script() {
		return get(Tag.script);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code script_score} kind?
	 */
	public boolean isScriptScore() {
		return is(Tag.scriptScore);
	}

	/**
	 * Get the {@code script_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_score} kind.
	 */
	public ScriptScoreQuery scriptScore() {
		return get(Tag.scriptScore);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code shape} kind?
	 */
	public boolean isShape() {
		return is(Tag.shape);
	}

	/**
	 * Get the {@code shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code shape} kind.
	 */
	public JsonValue shape() {
		return get(Tag.shape);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code simple_query_string} kind?
	 */
	public boolean isSimpleQueryString() {
		return is(Tag.simpleQueryString);
	}

	/**
	 * Get the {@code simple_query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_query_string}
	 *             kind.
	 */
	public SimpleQueryStringQuery simpleQueryString() {
		return get(Tag.simpleQueryString);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_containing} kind?
	 */
	public boolean isSpanContaining() {
		return is(Tag.spanContaining);
	}

	/**
	 * Get the {@code span_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_containing}
	 *             kind.
	 */
	public SpanContainingQuery spanContaining() {
		return get(Tag.spanContaining);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code field_masking_span} kind?
	 */
	public boolean isFieldMaskingSpan() {
		return is(Tag.fieldMaskingSpan);
	}

	/**
	 * Get the {@code field_masking_span} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_masking_span}
	 *             kind.
	 */
	public SpanFieldMaskingQuery fieldMaskingSpan() {
		return get(Tag.fieldMaskingSpan);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_first} kind?
	 */
	public boolean isSpanFirst() {
		return is(Tag.spanFirst);
	}

	/**
	 * Get the {@code span_first} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_first} kind.
	 */
	public SpanFirstQuery spanFirst() {
		return get(Tag.spanFirst);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_multi} kind?
	 */
	public boolean isSpanMulti() {
		return is(Tag.spanMulti);
	}

	/**
	 * Get the {@code span_multi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_multi} kind.
	 */
	public SpanMultiTermQuery spanMulti() {
		return get(Tag.spanMulti);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_near} kind?
	 */
	public boolean isSpanNear() {
		return is(Tag.spanNear);
	}

	/**
	 * Get the {@code span_near} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_near} kind.
	 */
	public SpanNearQuery spanNear() {
		return get(Tag.spanNear);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_not} kind?
	 */
	public boolean isSpanNot() {
		return is(Tag.spanNot);
	}

	/**
	 * Get the {@code span_not} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_not} kind.
	 */
	public SpanNotQuery spanNot() {
		return get(Tag.spanNot);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_or} kind?
	 */
	public boolean isSpanOr() {
		return is(Tag.spanOr);
	}

	/**
	 * Get the {@code span_or} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_or} kind.
	 */
	public SpanOrQuery spanOr() {
		return get(Tag.spanOr);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_term} kind?
	 */
	public boolean isSpanTerm() {
		return is(Tag.spanTerm);
	}

	/**
	 * Get the {@code span_term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_term} kind.
	 */
	public NamedValue<SpanTermQuery> spanTerm() {
		return get(Tag.spanTerm);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code span_within} kind?
	 */
	public boolean isSpanWithin() {
		return is(Tag.spanWithin);
	}

	/**
	 * Get the {@code span_within} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_within} kind.
	 */
	public SpanWithinQuery spanWithin() {
		return get(Tag.spanWithin);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code term} kind?
	 */
	public boolean isTerm() {
		return is(Tag.term);
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public NamedValue<TermQuery> term() {
		return get(Tag.term);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code terms} kind?
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
	public JsonValue terms() {
		return get(Tag.terms);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code terms_set} kind?
	 */
	public boolean isTermsSet() {
		return is(Tag.termsSet);
	}

	/**
	 * Get the {@code terms_set} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms_set} kind.
	 */
	public NamedValue<JsonValue> termsSet() {
		return get(Tag.termsSet);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code wildcard} kind?
	 */
	public boolean isWildcard() {
		return is(Tag.wildcard);
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public NamedValue<WildcardQuery> wildcard() {
		return get(Tag.wildcard);
	}

	/**
	 * Is this {@link QueryContainer} of a {@code type} kind?
	 */
	public boolean isType() {
		return is(Tag.type);
	}

	/**
	 * Get the {@code type} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code type} kind.
	 */
	public TypeQuery type() {
		return get(Tag.type);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case common :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<CommonTermsQuery>>get(Tag.common).name());
					this.<NamedValue<CommonTermsQuery>>get(Tag.common).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case distanceFeature :
					generator.write(this.<JsonValue>get(Tag.distanceFeature));

					break;
				case fuzzy :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<FuzzyQuery>>get(Tag.fuzzy).name());
					this.<NamedValue<FuzzyQuery>>get(Tag.fuzzy).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case intervals :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<IntervalsQuery>>get(Tag.intervals).name());
					this.<NamedValue<IntervalsQuery>>get(Tag.intervals).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case match :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<MatchQuery>>get(Tag.match).name());
					this.<NamedValue<MatchQuery>>get(Tag.match).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case matchAll :
					generator.write(this.<JsonValue>get(Tag.matchAll));

					break;
				case matchBoolPrefix :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<MatchBoolPrefixQuery>>get(Tag.matchBoolPrefix).name());
					this.<NamedValue<MatchBoolPrefixQuery>>get(Tag.matchBoolPrefix).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case matchNone :
					generator.write(this.<JsonValue>get(Tag.matchNone));

					break;
				case matchPhrase :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<MatchPhraseQuery>>get(Tag.matchPhrase).name());
					this.<NamedValue<MatchPhraseQuery>>get(Tag.matchPhrase).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case matchPhrasePrefix :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<MatchPhrasePrefixQuery>>get(Tag.matchPhrasePrefix).name());
					this.<NamedValue<MatchPhrasePrefixQuery>>get(Tag.matchPhrasePrefix).value().toJsonp(generator,
							mapper);

					generator.writeEnd();

					break;
				case prefix :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<PrefixQuery>>get(Tag.prefix).name());
					this.<NamedValue<PrefixQuery>>get(Tag.prefix).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case range :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<JsonValue>>get(Tag.range).name());
					generator.write(this.<NamedValue<JsonValue>>get(Tag.range).value());

					generator.writeEnd();

					break;
				case regexp :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<RegexpQuery>>get(Tag.regexp).name());
					this.<NamedValue<RegexpQuery>>get(Tag.regexp).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case shape :
					generator.write(this.<JsonValue>get(Tag.shape));

					break;
				case spanTerm :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<SpanTermQuery>>get(Tag.spanTerm).name());
					this.<NamedValue<SpanTermQuery>>get(Tag.spanTerm).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case term :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<TermQuery>>get(Tag.term).name());
					this.<NamedValue<TermQuery>>get(Tag.term).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
				case terms :
					generator.write(this.<JsonValue>get(Tag.terms));

					break;
				case termsSet :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<JsonValue>>get(Tag.termsSet).name());
					generator.write(this.<NamedValue<JsonValue>>get(Tag.termsSet).value());

					generator.writeEnd();

					break;
				case wildcard :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<WildcardQuery>>get(Tag.wildcard).name());
					this.<NamedValue<WildcardQuery>>get(Tag.wildcard).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<QueryContainer> bool(BoolQuery v) {
			this.$variant = v;
			this.$tag = Tag.bool;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> f) {
			return this.bool(f.apply(new BoolQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> boosting(BoostingQuery v) {
			this.$variant = v;
			this.$tag = Tag.boosting;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> boosting(Function<BoostingQuery.Builder, ObjectBuilder<BoostingQuery>> f) {
			return this.boosting(f.apply(new BoostingQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> common(NamedValue<CommonTermsQuery> v) {
			this.$variant = v;
			this.$tag = Tag.common;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> combinedFields(CombinedFieldsQuery v) {
			this.$variant = v;
			this.$tag = Tag.combinedFields;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> combinedFields(
				Function<CombinedFieldsQuery.Builder, ObjectBuilder<CombinedFieldsQuery>> f) {
			return this.combinedFields(f.apply(new CombinedFieldsQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> constantScore(ConstantScoreQuery v) {
			this.$variant = v;
			this.$tag = Tag.constantScore;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> constantScore(
				Function<ConstantScoreQuery.Builder, ObjectBuilder<ConstantScoreQuery>> f) {
			return this.constantScore(f.apply(new ConstantScoreQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> disMax(DisMaxQuery v) {
			this.$variant = v;
			this.$tag = Tag.disMax;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> disMax(Function<DisMaxQuery.Builder, ObjectBuilder<DisMaxQuery>> f) {
			return this.disMax(f.apply(new DisMaxQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> distanceFeature(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.distanceFeature;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> exists(ExistsQuery v) {
			this.$variant = v;
			this.$tag = Tag.exists;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> f) {
			return this.exists(f.apply(new ExistsQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> functionScore(FunctionScoreQuery v) {
			this.$variant = v;
			this.$tag = Tag.functionScore;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> functionScore(
				Function<FunctionScoreQuery.Builder, ObjectBuilder<FunctionScoreQuery>> f) {
			return this.functionScore(f.apply(new FunctionScoreQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> fuzzy(NamedValue<FuzzyQuery> v) {
			this.$variant = v;
			this.$tag = Tag.fuzzy;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> geoBoundingBox(GeoBoundingBoxQuery v) {
			this.$variant = v;
			this.$tag = Tag.geoBoundingBox;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> geoBoundingBox(
				Function<GeoBoundingBoxQuery.Builder, ObjectBuilder<GeoBoundingBoxQuery>> f) {
			return this.geoBoundingBox(f.apply(new GeoBoundingBoxQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> geoDistance(GeoDistanceQuery v) {
			this.$variant = v;
			this.$tag = Tag.geoDistance;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> geoDistance(
				Function<GeoDistanceQuery.Builder, ObjectBuilder<GeoDistanceQuery>> f) {
			return this.geoDistance(f.apply(new GeoDistanceQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> geoPolygon(GeoPolygonQuery v) {
			this.$variant = v;
			this.$tag = Tag.geoPolygon;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> geoPolygon(
				Function<GeoPolygonQuery.Builder, ObjectBuilder<GeoPolygonQuery>> f) {
			return this.geoPolygon(f.apply(new GeoPolygonQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> geoShape(GeoShapeQuery v) {
			this.$variant = v;
			this.$tag = Tag.geoShape;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> geoShape(Function<GeoShapeQuery.Builder, ObjectBuilder<GeoShapeQuery>> f) {
			return this.geoShape(f.apply(new GeoShapeQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> hasChild(HasChildQuery v) {
			this.$variant = v;
			this.$tag = Tag.hasChild;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> hasChild(Function<HasChildQuery.Builder, ObjectBuilder<HasChildQuery>> f) {
			return this.hasChild(f.apply(new HasChildQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> hasParent(HasParentQuery v) {
			this.$variant = v;
			this.$tag = Tag.hasParent;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> hasParent(
				Function<HasParentQuery.Builder, ObjectBuilder<HasParentQuery>> f) {
			return this.hasParent(f.apply(new HasParentQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> ids(IdsQuery v) {
			this.$variant = v;
			this.$tag = Tag.ids;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> f) {
			return this.ids(f.apply(new IdsQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> intervals(NamedValue<IntervalsQuery> v) {
			this.$variant = v;
			this.$tag = Tag.intervals;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> match(NamedValue<MatchQuery> v) {
			this.$variant = v;
			this.$tag = Tag.match;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> matchAll(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.matchAll;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> matchBoolPrefix(NamedValue<MatchBoolPrefixQuery> v) {
			this.$variant = v;
			this.$tag = Tag.matchBoolPrefix;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> matchNone(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.matchNone;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> matchPhrase(NamedValue<MatchPhraseQuery> v) {
			this.$variant = v;
			this.$tag = Tag.matchPhrase;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> matchPhrasePrefix(NamedValue<MatchPhrasePrefixQuery> v) {
			this.$variant = v;
			this.$tag = Tag.matchPhrasePrefix;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> moreLikeThis(MoreLikeThisQuery v) {
			this.$variant = v;
			this.$tag = Tag.moreLikeThis;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> moreLikeThis(
				Function<MoreLikeThisQuery.Builder, ObjectBuilder<MoreLikeThisQuery>> f) {
			return this.moreLikeThis(f.apply(new MoreLikeThisQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> multiMatch(MultiMatchQuery v) {
			this.$variant = v;
			this.$tag = Tag.multiMatch;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> multiMatch(
				Function<MultiMatchQuery.Builder, ObjectBuilder<MultiMatchQuery>> f) {
			return this.multiMatch(f.apply(new MultiMatchQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> nested(NestedQuery v) {
			this.$variant = v;
			this.$tag = Tag.nested;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> nested(Function<NestedQuery.Builder, ObjectBuilder<NestedQuery>> f) {
			return this.nested(f.apply(new NestedQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> parentId(ParentIdQuery v) {
			this.$variant = v;
			this.$tag = Tag.parentId;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> parentId(Function<ParentIdQuery.Builder, ObjectBuilder<ParentIdQuery>> f) {
			return this.parentId(f.apply(new ParentIdQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> percolate(PercolateQuery v) {
			this.$variant = v;
			this.$tag = Tag.percolate;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> percolate(
				Function<PercolateQuery.Builder, ObjectBuilder<PercolateQuery>> f) {
			return this.percolate(f.apply(new PercolateQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> pinned(PinnedQuery v) {
			this.$variant = v;
			this.$tag = Tag.pinned;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> pinned(Function<PinnedQuery.Builder, ObjectBuilder<PinnedQuery>> f) {
			return this.pinned(f.apply(new PinnedQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> prefix(NamedValue<PrefixQuery> v) {
			this.$variant = v;
			this.$tag = Tag.prefix;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> queryString(QueryStringQuery v) {
			this.$variant = v;
			this.$tag = Tag.queryString;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> queryString(
				Function<QueryStringQuery.Builder, ObjectBuilder<QueryStringQuery>> f) {
			return this.queryString(f.apply(new QueryStringQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> range(NamedValue<JsonValue> v) {
			this.$variant = v;
			this.$tag = Tag.range;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> rankFeature(RankFeatureQuery v) {
			this.$variant = v;
			this.$tag = Tag.rankFeature;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> rankFeature(
				Function<RankFeatureQuery.Builder, ObjectBuilder<RankFeatureQuery>> f) {
			return this.rankFeature(f.apply(new RankFeatureQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> regexp(NamedValue<RegexpQuery> v) {
			this.$variant = v;
			this.$tag = Tag.regexp;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> script(ScriptQuery v) {
			this.$variant = v;
			this.$tag = Tag.script;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> script(Function<ScriptQuery.Builder, ObjectBuilder<ScriptQuery>> f) {
			return this.script(f.apply(new ScriptQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> scriptScore(ScriptScoreQuery v) {
			this.$variant = v;
			this.$tag = Tag.scriptScore;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> scriptScore(
				Function<ScriptScoreQuery.Builder, ObjectBuilder<ScriptScoreQuery>> f) {
			return this.scriptScore(f.apply(new ScriptScoreQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> shape(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.shape;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> simpleQueryString(SimpleQueryStringQuery v) {
			this.$variant = v;
			this.$tag = Tag.simpleQueryString;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> simpleQueryString(
				Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> f) {
			return this.simpleQueryString(f.apply(new SimpleQueryStringQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> spanContaining(SpanContainingQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanContaining;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanContaining(
				Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> f) {
			return this.spanContaining(f.apply(new SpanContainingQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> fieldMaskingSpan(SpanFieldMaskingQuery v) {
			this.$variant = v;
			this.$tag = Tag.fieldMaskingSpan;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> fieldMaskingSpan(
				Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> f) {
			return this.fieldMaskingSpan(f.apply(new SpanFieldMaskingQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> spanFirst(SpanFirstQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanFirst;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanFirst(
				Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> f) {
			return this.spanFirst(f.apply(new SpanFirstQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> spanMulti(SpanMultiTermQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanMulti;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanMulti(
				Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> f) {
			return this.spanMulti(f.apply(new SpanMultiTermQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> spanNear(SpanNearQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanNear;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> f) {
			return this.spanNear(f.apply(new SpanNearQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> spanNot(SpanNotQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanNot;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> f) {
			return this.spanNot(f.apply(new SpanNotQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> spanOr(SpanOrQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanOr;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> f) {
			return this.spanOr(f.apply(new SpanOrQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> spanTerm(NamedValue<SpanTermQuery> v) {
			this.$variant = v;
			this.$tag = Tag.spanTerm;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanWithin(SpanWithinQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanWithin;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> spanWithin(
				Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> f) {
			return this.spanWithin(f.apply(new SpanWithinQuery.Builder()).build());
		}

		public ObjectBuilder<QueryContainer> term(NamedValue<TermQuery> v) {
			this.$variant = v;
			this.$tag = Tag.term;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> terms(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.terms;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> termsSet(NamedValue<JsonValue> v) {
			this.$variant = v;
			this.$tag = Tag.termsSet;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> wildcard(NamedValue<WildcardQuery> v) {
			this.$variant = v;
			this.$tag = Tag.wildcard;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> type(TypeQuery v) {
			this.$variant = v;
			this.$tag = Tag.type;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<QueryContainer> type(Function<TypeQuery.Builder, ObjectBuilder<TypeQuery>> f) {
			return this.type(f.apply(new TypeQuery.Builder()).build());
		}

		protected QueryContainer build() {
			return new QueryContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<QueryContainer> DESERIALIZER = JsonpDeserializer
			.lazy(QueryContainer::buildDeserializer);

	private static JsonpDeserializer<QueryContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::bool, BoolQuery.DESERIALIZER, "bool");
		op.add(Builder::boosting, BoostingQuery.DESERIALIZER, "boosting");
		op.add(Builder::common, NamedValue.deserializer(() -> CommonTermsQuery.DESERIALIZER), "common");
		op.add(Builder::combinedFields, CombinedFieldsQuery.DESERIALIZER, "combined_fields");
		op.add(Builder::constantScore, ConstantScoreQuery.DESERIALIZER, "constant_score");
		op.add(Builder::disMax, DisMaxQuery.DESERIALIZER, "dis_max");
		op.add(Builder::distanceFeature, JsonpDeserializer.jsonValueDeserializer(), "distance_feature");
		op.add(Builder::exists, ExistsQuery.DESERIALIZER, "exists");
		op.add(Builder::functionScore, FunctionScoreQuery.DESERIALIZER, "function_score");
		op.add(Builder::fuzzy, NamedValue.deserializer(() -> FuzzyQuery.DESERIALIZER), "fuzzy");
		op.add(Builder::geoBoundingBox, GeoBoundingBoxQuery.DESERIALIZER, "geo_bounding_box");
		op.add(Builder::geoDistance, GeoDistanceQuery.DESERIALIZER, "geo_distance");
		op.add(Builder::geoPolygon, GeoPolygonQuery.DESERIALIZER, "geo_polygon");
		op.add(Builder::geoShape, GeoShapeQuery.DESERIALIZER, "geo_shape");
		op.add(Builder::hasChild, HasChildQuery.DESERIALIZER, "has_child");
		op.add(Builder::hasParent, HasParentQuery.DESERIALIZER, "has_parent");
		op.add(Builder::ids, IdsQuery.DESERIALIZER, "ids");
		op.add(Builder::intervals, NamedValue.deserializer(() -> IntervalsQuery.DESERIALIZER), "intervals");
		op.add(Builder::match, NamedValue.deserializer(() -> MatchQuery.DESERIALIZER), "match");
		op.add(Builder::matchAll, JsonpDeserializer.jsonValueDeserializer(), "match_all");
		op.add(Builder::matchBoolPrefix, NamedValue.deserializer(() -> MatchBoolPrefixQuery.DESERIALIZER),
				"match_bool_prefix");
		op.add(Builder::matchNone, JsonpDeserializer.jsonValueDeserializer(), "match_none");
		op.add(Builder::matchPhrase, NamedValue.deserializer(() -> MatchPhraseQuery.DESERIALIZER), "match_phrase");
		op.add(Builder::matchPhrasePrefix, NamedValue.deserializer(() -> MatchPhrasePrefixQuery.DESERIALIZER),
				"match_phrase_prefix");
		op.add(Builder::moreLikeThis, MoreLikeThisQuery.DESERIALIZER, "more_like_this");
		op.add(Builder::multiMatch, MultiMatchQuery.DESERIALIZER, "multi_match");
		op.add(Builder::nested, NestedQuery.DESERIALIZER, "nested");
		op.add(Builder::parentId, ParentIdQuery.DESERIALIZER, "parent_id");
		op.add(Builder::percolate, PercolateQuery.DESERIALIZER, "percolate");
		op.add(Builder::pinned, PinnedQuery.DESERIALIZER, "pinned");
		op.add(Builder::prefix, NamedValue.deserializer(() -> PrefixQuery.DESERIALIZER), "prefix");
		op.add(Builder::queryString, QueryStringQuery.DESERIALIZER, "query_string");
		op.add(Builder::range, NamedValue.deserializer(() -> JsonpDeserializer.jsonValueDeserializer()), "range");
		op.add(Builder::rankFeature, RankFeatureQuery.DESERIALIZER, "rank_feature");
		op.add(Builder::regexp, NamedValue.deserializer(() -> RegexpQuery.DESERIALIZER), "regexp");
		op.add(Builder::script, ScriptQuery.DESERIALIZER, "script");
		op.add(Builder::scriptScore, ScriptScoreQuery.DESERIALIZER, "script_score");
		op.add(Builder::shape, JsonpDeserializer.jsonValueDeserializer(), "shape");
		op.add(Builder::simpleQueryString, SimpleQueryStringQuery.DESERIALIZER, "simple_query_string");
		op.add(Builder::spanContaining, SpanContainingQuery.DESERIALIZER, "span_containing");
		op.add(Builder::fieldMaskingSpan, SpanFieldMaskingQuery.DESERIALIZER, "field_masking_span");
		op.add(Builder::spanFirst, SpanFirstQuery.DESERIALIZER, "span_first");
		op.add(Builder::spanMulti, SpanMultiTermQuery.DESERIALIZER, "span_multi");
		op.add(Builder::spanNear, SpanNearQuery.DESERIALIZER, "span_near");
		op.add(Builder::spanNot, SpanNotQuery.DESERIALIZER, "span_not");
		op.add(Builder::spanOr, SpanOrQuery.DESERIALIZER, "span_or");
		op.add(Builder::spanTerm, NamedValue.deserializer(() -> SpanTermQuery.DESERIALIZER), "span_term");
		op.add(Builder::spanWithin, SpanWithinQuery.DESERIALIZER, "span_within");
		op.add(Builder::term, NamedValue.deserializer(() -> TermQuery.DESERIALIZER), "term");
		op.add(Builder::terms, JsonpDeserializer.jsonValueDeserializer(), "terms");
		op.add(Builder::termsSet, NamedValue.deserializer(() -> JsonpDeserializer.jsonValueDeserializer()),
				"terms_set");
		op.add(Builder::wildcard, NamedValue.deserializer(() -> WildcardQuery.DESERIALIZER), "wildcard");
		op.add(Builder::type, TypeQuery.DESERIALIZER, "type");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
