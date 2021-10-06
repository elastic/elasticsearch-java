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

import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationVariant;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.QueryContainer
@JsonpDeserializable
public class Query implements TaggedUnion<Object>, AggregationVariant, JsonpSerializable {

	public static final String BOOL = "bool";
	public static final String BOOSTING = "boosting";
	public static final String COMMON = "common";
	public static final String COMBINED_FIELDS = "combined_fields";
	public static final String CONSTANT_SCORE = "constant_score";
	public static final String DIS_MAX = "dis_max";
	public static final String DISTANCE_FEATURE = "distance_feature";
	public static final String EXISTS = "exists";
	public static final String FUNCTION_SCORE = "function_score";
	public static final String FUZZY = "fuzzy";
	public static final String GEO_BOUNDING_BOX = "geo_bounding_box";
	public static final String GEO_DISTANCE = "geo_distance";
	public static final String GEO_POLYGON = "geo_polygon";
	public static final String GEO_SHAPE = "geo_shape";
	public static final String HAS_CHILD = "has_child";
	public static final String HAS_PARENT = "has_parent";
	public static final String IDS = "ids";
	public static final String INTERVALS = "intervals";
	public static final String MATCH = "match";
	public static final String MATCH_ALL = "match_all";
	public static final String MATCH_BOOL_PREFIX = "match_bool_prefix";
	public static final String MATCH_NONE = "match_none";
	public static final String MATCH_PHRASE = "match_phrase";
	public static final String MATCH_PHRASE_PREFIX = "match_phrase_prefix";
	public static final String MORE_LIKE_THIS = "more_like_this";
	public static final String MULTI_MATCH = "multi_match";
	public static final String NESTED = "nested";
	public static final String PARENT_ID = "parent_id";
	public static final String PERCOLATE = "percolate";
	public static final String PINNED = "pinned";
	public static final String PREFIX = "prefix";
	public static final String QUERY_STRING = "query_string";
	public static final String RANGE = "range";
	public static final String RANK_FEATURE = "rank_feature";
	public static final String REGEXP = "regexp";
	public static final String SCRIPT = "script";
	public static final String SCRIPT_SCORE = "script_score";
	public static final String SHAPE = "shape";
	public static final String SIMPLE_QUERY_STRING = "simple_query_string";
	public static final String SPAN_CONTAINING = "span_containing";
	public static final String FIELD_MASKING_SPAN = "field_masking_span";
	public static final String SPAN_FIRST = "span_first";
	public static final String SPAN_MULTI = "span_multi";
	public static final String SPAN_NEAR = "span_near";
	public static final String SPAN_NOT = "span_not";
	public static final String SPAN_OR = "span_or";
	public static final String SPAN_TERM = "span_term";
	public static final String SPAN_WITHIN = "span_within";
	public static final String TERM = "term";
	public static final String TERMS = "terms";
	public static final String TERMS_SET = "terms_set";
	public static final String WILDCARD = "wildcard";
	public static final String TYPE = "type";

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "filter";
	}

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public Query(QueryVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends QueryVariant> Query(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private Query(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public Query(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code bool} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bool} kind.
	 */
	public BoolQuery bool() {
		return TaggedUnionUtils.get(this, BOOL);
	}

	/**
	 * Get the {@code boosting} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boosting} kind.
	 */
	public BoostingQuery boosting() {
		return TaggedUnionUtils.get(this, BOOSTING);
	}

	/**
	 * Get the {@code common} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code common} kind.
	 */
	public CommonTermsQuery common() {
		return TaggedUnionUtils.get(this, COMMON);
	}

	/**
	 * Get the {@code combined_fields} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code combined_fields}
	 *             kind.
	 */
	public CombinedFieldsQuery combinedFields() {
		return TaggedUnionUtils.get(this, COMBINED_FIELDS);
	}

	/**
	 * Get the {@code constant_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code constant_score} kind.
	 */
	public ConstantScoreQuery constantScore() {
		return TaggedUnionUtils.get(this, CONSTANT_SCORE);
	}

	/**
	 * Get the {@code dis_max} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dis_max} kind.
	 */
	public DisMaxQuery disMax() {
		return TaggedUnionUtils.get(this, DIS_MAX);
	}

	/**
	 * Get the {@code distance_feature} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code distance_feature}
	 *             kind.
	 */
	public JsonValue /* _types.query_dsl.DistanceFeatureQuery */ distanceFeature() {
		return TaggedUnionUtils.get(this, DISTANCE_FEATURE);
	}

	/**
	 * Get the {@code exists} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exists} kind.
	 */
	public ExistsQuery exists() {
		return TaggedUnionUtils.get(this, EXISTS);
	}

	/**
	 * Get the {@code function_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code function_score} kind.
	 */
	public FunctionScoreQuery functionScore() {
		return TaggedUnionUtils.get(this, FUNCTION_SCORE);
	}

	/**
	 * Get the {@code fuzzy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fuzzy} kind.
	 */
	public FuzzyQuery fuzzy() {
		return TaggedUnionUtils.get(this, FUZZY);
	}

	/**
	 * Get the {@code geo_bounding_box} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_bounding_box}
	 *             kind.
	 */
	public GeoBoundingBoxQuery geoBoundingBox() {
		return TaggedUnionUtils.get(this, GEO_BOUNDING_BOX);
	}

	/**
	 * Get the {@code geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_distance} kind.
	 */
	public GeoDistanceQuery geoDistance() {
		return TaggedUnionUtils.get(this, GEO_DISTANCE);
	}

	/**
	 * Get the {@code geo_polygon} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_polygon} kind.
	 */
	public GeoPolygonQuery geoPolygon() {
		return TaggedUnionUtils.get(this, GEO_POLYGON);
	}

	/**
	 * Get the {@code geo_shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_shape} kind.
	 */
	public GeoShapeQuery geoShape() {
		return TaggedUnionUtils.get(this, GEO_SHAPE);
	}

	/**
	 * Get the {@code has_child} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code has_child} kind.
	 */
	public HasChildQuery hasChild() {
		return TaggedUnionUtils.get(this, HAS_CHILD);
	}

	/**
	 * Get the {@code has_parent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code has_parent} kind.
	 */
	public HasParentQuery hasParent() {
		return TaggedUnionUtils.get(this, HAS_PARENT);
	}

	/**
	 * Get the {@code ids} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ids} kind.
	 */
	public IdsQuery ids() {
		return TaggedUnionUtils.get(this, IDS);
	}

	/**
	 * Get the {@code intervals} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code intervals} kind.
	 */
	public IntervalsQuery intervals() {
		return TaggedUnionUtils.get(this, INTERVALS);
	}

	/**
	 * Get the {@code match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match} kind.
	 */
	public MatchQuery match() {
		return TaggedUnionUtils.get(this, MATCH);
	}

	/**
	 * Get the {@code match_all} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_all} kind.
	 */
	public MatchAllQuery matchAll() {
		return TaggedUnionUtils.get(this, MATCH_ALL);
	}

	/**
	 * Get the {@code match_bool_prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_bool_prefix}
	 *             kind.
	 */
	public MatchBoolPrefixQuery matchBoolPrefix() {
		return TaggedUnionUtils.get(this, MATCH_BOOL_PREFIX);
	}

	/**
	 * Get the {@code match_none} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_none} kind.
	 */
	public MatchNoneQuery matchNone() {
		return TaggedUnionUtils.get(this, MATCH_NONE);
	}

	/**
	 * Get the {@code match_phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_phrase} kind.
	 */
	public MatchPhraseQuery matchPhrase() {
		return TaggedUnionUtils.get(this, MATCH_PHRASE);
	}

	/**
	 * Get the {@code match_phrase_prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_phrase_prefix}
	 *             kind.
	 */
	public MatchPhrasePrefixQuery matchPhrasePrefix() {
		return TaggedUnionUtils.get(this, MATCH_PHRASE_PREFIX);
	}

	/**
	 * Get the {@code more_like_this} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code more_like_this} kind.
	 */
	public MoreLikeThisQuery moreLikeThis() {
		return TaggedUnionUtils.get(this, MORE_LIKE_THIS);
	}

	/**
	 * Get the {@code multi_match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_match} kind.
	 */
	public MultiMatchQuery multiMatch() {
		return TaggedUnionUtils.get(this, MULTI_MATCH);
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedQuery nested() {
		return TaggedUnionUtils.get(this, NESTED);
	}

	/**
	 * Get the {@code parent_id} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code parent_id} kind.
	 */
	public ParentIdQuery parentId() {
		return TaggedUnionUtils.get(this, PARENT_ID);
	}

	/**
	 * Get the {@code percolate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percolate} kind.
	 */
	public PercolateQuery percolate() {
		return TaggedUnionUtils.get(this, PERCOLATE);
	}

	/**
	 * Get the {@code pinned} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pinned} kind.
	 */
	public PinnedQuery pinned() {
		return TaggedUnionUtils.get(this, PINNED);
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public PrefixQuery prefix() {
		return TaggedUnionUtils.get(this, PREFIX);
	}

	/**
	 * Get the {@code query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query_string} kind.
	 */
	public QueryStringQuery queryString() {
		return TaggedUnionUtils.get(this, QUERY_STRING);
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public JsonValue /* _types.query_dsl.RangeQuery */ range() {
		return TaggedUnionUtils.get(this, RANGE);
	}

	/**
	 * Get the {@code rank_feature} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rank_feature} kind.
	 */
	public RankFeatureQuery rankFeature() {
		return TaggedUnionUtils.get(this, RANK_FEATURE);
	}

	/**
	 * Get the {@code regexp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regexp} kind.
	 */
	public RegexpQuery regexp() {
		return TaggedUnionUtils.get(this, REGEXP);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptQuery script() {
		return TaggedUnionUtils.get(this, SCRIPT);
	}

	/**
	 * Get the {@code script_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_score} kind.
	 */
	public ScriptScoreQuery scriptScore() {
		return TaggedUnionUtils.get(this, SCRIPT_SCORE);
	}

	/**
	 * Get the {@code shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code shape} kind.
	 */
	public ShapeQuery shape() {
		return TaggedUnionUtils.get(this, SHAPE);
	}

	/**
	 * Get the {@code simple_query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_query_string}
	 *             kind.
	 */
	public SimpleQueryStringQuery simpleQueryString() {
		return TaggedUnionUtils.get(this, SIMPLE_QUERY_STRING);
	}

	/**
	 * Get the {@code span_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_containing}
	 *             kind.
	 */
	public SpanContainingQuery spanContaining() {
		return TaggedUnionUtils.get(this, SPAN_CONTAINING);
	}

	/**
	 * Get the {@code field_masking_span} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_masking_span}
	 *             kind.
	 */
	public SpanFieldMaskingQuery fieldMaskingSpan() {
		return TaggedUnionUtils.get(this, FIELD_MASKING_SPAN);
	}

	/**
	 * Get the {@code span_first} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_first} kind.
	 */
	public SpanFirstQuery spanFirst() {
		return TaggedUnionUtils.get(this, SPAN_FIRST);
	}

	/**
	 * Get the {@code span_multi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_multi} kind.
	 */
	public SpanMultiTermQuery spanMulti() {
		return TaggedUnionUtils.get(this, SPAN_MULTI);
	}

	/**
	 * Get the {@code span_near} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_near} kind.
	 */
	public SpanNearQuery spanNear() {
		return TaggedUnionUtils.get(this, SPAN_NEAR);
	}

	/**
	 * Get the {@code span_not} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_not} kind.
	 */
	public SpanNotQuery spanNot() {
		return TaggedUnionUtils.get(this, SPAN_NOT);
	}

	/**
	 * Get the {@code span_or} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_or} kind.
	 */
	public SpanOrQuery spanOr() {
		return TaggedUnionUtils.get(this, SPAN_OR);
	}

	/**
	 * Get the {@code span_term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_term} kind.
	 */
	public SpanTermQuery spanTerm() {
		return TaggedUnionUtils.get(this, SPAN_TERM);
	}

	/**
	 * Get the {@code span_within} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_within} kind.
	 */
	public SpanWithinQuery spanWithin() {
		return TaggedUnionUtils.get(this, SPAN_WITHIN);
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermQuery term() {
		return TaggedUnionUtils.get(this, TERM);
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsQuery terms() {
		return TaggedUnionUtils.get(this, TERMS);
	}

	/**
	 * Get the {@code terms_set} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms_set} kind.
	 */
	public TermsSetQuery termsSet() {
		return TaggedUnionUtils.get(this, TERMS_SET);
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public WildcardQuery wildcard() {
		return TaggedUnionUtils.get(this, WILDCARD);
	}

	/**
	 * Get the {@code type} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code type} kind.
	 */
	public TypeQuery type() {
		return TaggedUnionUtils.get(this, TYPE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case DISTANCE_FEATURE :
					generator.write(((JsonValue /* _types.query_dsl.DistanceFeatureQuery */) this._value));

					break;
				case RANGE :
					generator.write(((JsonValue /* _types.query_dsl.RangeQuery */) this._value));

					break;
			}
		}

		generator.writeEnd();
	}

	public static class Builder implements ObjectBuilder<Query> {
		private String _type;
		private Object _value;

		public Builder bool(BoolQuery v) {
			this._type = BOOL;
			this._value = v;
			return this;
		}

		public Builder bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> f) {
			return this.bool(f.apply(new BoolQuery.Builder()).build());
		}

		public Builder boosting(BoostingQuery v) {
			this._type = BOOSTING;
			this._value = v;
			return this;
		}

		public Builder boosting(Function<BoostingQuery.Builder, ObjectBuilder<BoostingQuery>> f) {
			return this.boosting(f.apply(new BoostingQuery.Builder()).build());
		}

		public Builder common(CommonTermsQuery v) {
			this._type = COMMON;
			this._value = v;
			return this;
		}

		public Builder common(Function<CommonTermsQuery.Builder, ObjectBuilder<CommonTermsQuery>> f) {
			return this.common(f.apply(new CommonTermsQuery.Builder()).build());
		}

		public Builder combinedFields(CombinedFieldsQuery v) {
			this._type = COMBINED_FIELDS;
			this._value = v;
			return this;
		}

		public Builder combinedFields(Function<CombinedFieldsQuery.Builder, ObjectBuilder<CombinedFieldsQuery>> f) {
			return this.combinedFields(f.apply(new CombinedFieldsQuery.Builder()).build());
		}

		public Builder constantScore(ConstantScoreQuery v) {
			this._type = CONSTANT_SCORE;
			this._value = v;
			return this;
		}

		public Builder constantScore(Function<ConstantScoreQuery.Builder, ObjectBuilder<ConstantScoreQuery>> f) {
			return this.constantScore(f.apply(new ConstantScoreQuery.Builder()).build());
		}

		public Builder disMax(DisMaxQuery v) {
			this._type = DIS_MAX;
			this._value = v;
			return this;
		}

		public Builder disMax(Function<DisMaxQuery.Builder, ObjectBuilder<DisMaxQuery>> f) {
			return this.disMax(f.apply(new DisMaxQuery.Builder()).build());
		}

		public Builder distanceFeature(JsonValue /* _types.query_dsl.DistanceFeatureQuery */ v) {
			this._type = DISTANCE_FEATURE;
			this._value = v;
			return this;
		}

		public Builder exists(ExistsQuery v) {
			this._type = EXISTS;
			this._value = v;
			return this;
		}

		public Builder exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> f) {
			return this.exists(f.apply(new ExistsQuery.Builder()).build());
		}

		public Builder functionScore(FunctionScoreQuery v) {
			this._type = FUNCTION_SCORE;
			this._value = v;
			return this;
		}

		public Builder functionScore(Function<FunctionScoreQuery.Builder, ObjectBuilder<FunctionScoreQuery>> f) {
			return this.functionScore(f.apply(new FunctionScoreQuery.Builder()).build());
		}

		public Builder fuzzy(FuzzyQuery v) {
			this._type = FUZZY;
			this._value = v;
			return this;
		}

		public Builder fuzzy(Function<FuzzyQuery.Builder, ObjectBuilder<FuzzyQuery>> f) {
			return this.fuzzy(f.apply(new FuzzyQuery.Builder()).build());
		}

		public Builder geoBoundingBox(GeoBoundingBoxQuery v) {
			this._type = GEO_BOUNDING_BOX;
			this._value = v;
			return this;
		}

		public Builder geoBoundingBox(Function<GeoBoundingBoxQuery.Builder, ObjectBuilder<GeoBoundingBoxQuery>> f) {
			return this.geoBoundingBox(f.apply(new GeoBoundingBoxQuery.Builder()).build());
		}

		public Builder geoDistance(GeoDistanceQuery v) {
			this._type = GEO_DISTANCE;
			this._value = v;
			return this;
		}

		public Builder geoDistance(Function<GeoDistanceQuery.Builder, ObjectBuilder<GeoDistanceQuery>> f) {
			return this.geoDistance(f.apply(new GeoDistanceQuery.Builder()).build());
		}

		public Builder geoPolygon(GeoPolygonQuery v) {
			this._type = GEO_POLYGON;
			this._value = v;
			return this;
		}

		public Builder geoPolygon(Function<GeoPolygonQuery.Builder, ObjectBuilder<GeoPolygonQuery>> f) {
			return this.geoPolygon(f.apply(new GeoPolygonQuery.Builder()).build());
		}

		public Builder geoShape(GeoShapeQuery v) {
			this._type = GEO_SHAPE;
			this._value = v;
			return this;
		}

		public Builder geoShape(Function<GeoShapeQuery.Builder, ObjectBuilder<GeoShapeQuery>> f) {
			return this.geoShape(f.apply(new GeoShapeQuery.Builder()).build());
		}

		public Builder hasChild(HasChildQuery v) {
			this._type = HAS_CHILD;
			this._value = v;
			return this;
		}

		public Builder hasChild(Function<HasChildQuery.Builder, ObjectBuilder<HasChildQuery>> f) {
			return this.hasChild(f.apply(new HasChildQuery.Builder()).build());
		}

		public Builder hasParent(HasParentQuery v) {
			this._type = HAS_PARENT;
			this._value = v;
			return this;
		}

		public Builder hasParent(Function<HasParentQuery.Builder, ObjectBuilder<HasParentQuery>> f) {
			return this.hasParent(f.apply(new HasParentQuery.Builder()).build());
		}

		public Builder ids(IdsQuery v) {
			this._type = IDS;
			this._value = v;
			return this;
		}

		public Builder ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> f) {
			return this.ids(f.apply(new IdsQuery.Builder()).build());
		}

		public Builder intervals(IntervalsQuery v) {
			this._type = INTERVALS;
			this._value = v;
			return this;
		}

		public Builder intervals(Function<IntervalsQuery.Builder, ObjectBuilder<IntervalsQuery>> f) {
			return this.intervals(f.apply(new IntervalsQuery.Builder()).build());
		}

		public Builder match(MatchQuery v) {
			this._type = MATCH;
			this._value = v;
			return this;
		}

		public Builder match(Function<MatchQuery.Builder, ObjectBuilder<MatchQuery>> f) {
			return this.match(f.apply(new MatchQuery.Builder()).build());
		}

		public Builder matchAll(MatchAllQuery v) {
			this._type = MATCH_ALL;
			this._value = v;
			return this;
		}

		public Builder matchAll(Function<MatchAllQuery.Builder, ObjectBuilder<MatchAllQuery>> f) {
			return this.matchAll(f.apply(new MatchAllQuery.Builder()).build());
		}

		public Builder matchBoolPrefix(MatchBoolPrefixQuery v) {
			this._type = MATCH_BOOL_PREFIX;
			this._value = v;
			return this;
		}

		public Builder matchBoolPrefix(Function<MatchBoolPrefixQuery.Builder, ObjectBuilder<MatchBoolPrefixQuery>> f) {
			return this.matchBoolPrefix(f.apply(new MatchBoolPrefixQuery.Builder()).build());
		}

		public Builder matchNone(MatchNoneQuery v) {
			this._type = MATCH_NONE;
			this._value = v;
			return this;
		}

		public Builder matchNone(Function<MatchNoneQuery.Builder, ObjectBuilder<MatchNoneQuery>> f) {
			return this.matchNone(f.apply(new MatchNoneQuery.Builder()).build());
		}

		public Builder matchPhrase(MatchPhraseQuery v) {
			this._type = MATCH_PHRASE;
			this._value = v;
			return this;
		}

		public Builder matchPhrase(Function<MatchPhraseQuery.Builder, ObjectBuilder<MatchPhraseQuery>> f) {
			return this.matchPhrase(f.apply(new MatchPhraseQuery.Builder()).build());
		}

		public Builder matchPhrasePrefix(MatchPhrasePrefixQuery v) {
			this._type = MATCH_PHRASE_PREFIX;
			this._value = v;
			return this;
		}

		public Builder matchPhrasePrefix(
				Function<MatchPhrasePrefixQuery.Builder, ObjectBuilder<MatchPhrasePrefixQuery>> f) {
			return this.matchPhrasePrefix(f.apply(new MatchPhrasePrefixQuery.Builder()).build());
		}

		public Builder moreLikeThis(MoreLikeThisQuery v) {
			this._type = MORE_LIKE_THIS;
			this._value = v;
			return this;
		}

		public Builder moreLikeThis(Function<MoreLikeThisQuery.Builder, ObjectBuilder<MoreLikeThisQuery>> f) {
			return this.moreLikeThis(f.apply(new MoreLikeThisQuery.Builder()).build());
		}

		public Builder multiMatch(MultiMatchQuery v) {
			this._type = MULTI_MATCH;
			this._value = v;
			return this;
		}

		public Builder multiMatch(Function<MultiMatchQuery.Builder, ObjectBuilder<MultiMatchQuery>> f) {
			return this.multiMatch(f.apply(new MultiMatchQuery.Builder()).build());
		}

		public Builder nested(NestedQuery v) {
			this._type = NESTED;
			this._value = v;
			return this;
		}

		public Builder nested(Function<NestedQuery.Builder, ObjectBuilder<NestedQuery>> f) {
			return this.nested(f.apply(new NestedQuery.Builder()).build());
		}

		public Builder parentId(ParentIdQuery v) {
			this._type = PARENT_ID;
			this._value = v;
			return this;
		}

		public Builder parentId(Function<ParentIdQuery.Builder, ObjectBuilder<ParentIdQuery>> f) {
			return this.parentId(f.apply(new ParentIdQuery.Builder()).build());
		}

		public Builder percolate(PercolateQuery v) {
			this._type = PERCOLATE;
			this._value = v;
			return this;
		}

		public Builder percolate(Function<PercolateQuery.Builder, ObjectBuilder<PercolateQuery>> f) {
			return this.percolate(f.apply(new PercolateQuery.Builder()).build());
		}

		public Builder pinned(PinnedQuery v) {
			this._type = PINNED;
			this._value = v;
			return this;
		}

		public Builder pinned(Function<PinnedQuery.Builder, ObjectBuilder<PinnedQuery>> f) {
			return this.pinned(f.apply(new PinnedQuery.Builder()).build());
		}

		public Builder prefix(PrefixQuery v) {
			this._type = PREFIX;
			this._value = v;
			return this;
		}

		public Builder prefix(Function<PrefixQuery.Builder, ObjectBuilder<PrefixQuery>> f) {
			return this.prefix(f.apply(new PrefixQuery.Builder()).build());
		}

		public Builder queryString(QueryStringQuery v) {
			this._type = QUERY_STRING;
			this._value = v;
			return this;
		}

		public Builder queryString(Function<QueryStringQuery.Builder, ObjectBuilder<QueryStringQuery>> f) {
			return this.queryString(f.apply(new QueryStringQuery.Builder()).build());
		}

		public Builder range(JsonValue /* _types.query_dsl.RangeQuery */ v) {
			this._type = RANGE;
			this._value = v;
			return this;
		}

		public Builder rankFeature(RankFeatureQuery v) {
			this._type = RANK_FEATURE;
			this._value = v;
			return this;
		}

		public Builder rankFeature(Function<RankFeatureQuery.Builder, ObjectBuilder<RankFeatureQuery>> f) {
			return this.rankFeature(f.apply(new RankFeatureQuery.Builder()).build());
		}

		public Builder regexp(RegexpQuery v) {
			this._type = REGEXP;
			this._value = v;
			return this;
		}

		public Builder regexp(Function<RegexpQuery.Builder, ObjectBuilder<RegexpQuery>> f) {
			return this.regexp(f.apply(new RegexpQuery.Builder()).build());
		}

		public Builder script(ScriptQuery v) {
			this._type = SCRIPT;
			this._value = v;
			return this;
		}

		public Builder script(Function<ScriptQuery.Builder, ObjectBuilder<ScriptQuery>> f) {
			return this.script(f.apply(new ScriptQuery.Builder()).build());
		}

		public Builder scriptScore(ScriptScoreQuery v) {
			this._type = SCRIPT_SCORE;
			this._value = v;
			return this;
		}

		public Builder scriptScore(Function<ScriptScoreQuery.Builder, ObjectBuilder<ScriptScoreQuery>> f) {
			return this.scriptScore(f.apply(new ScriptScoreQuery.Builder()).build());
		}

		public Builder shape(ShapeQuery v) {
			this._type = SHAPE;
			this._value = v;
			return this;
		}

		public Builder shape(Function<ShapeQuery.Builder, ObjectBuilder<ShapeQuery>> f) {
			return this.shape(f.apply(new ShapeQuery.Builder()).build());
		}

		public Builder simpleQueryString(SimpleQueryStringQuery v) {
			this._type = SIMPLE_QUERY_STRING;
			this._value = v;
			return this;
		}

		public Builder simpleQueryString(
				Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> f) {
			return this.simpleQueryString(f.apply(new SimpleQueryStringQuery.Builder()).build());
		}

		public Builder spanContaining(SpanContainingQuery v) {
			this._type = SPAN_CONTAINING;
			this._value = v;
			return this;
		}

		public Builder spanContaining(Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> f) {
			return this.spanContaining(f.apply(new SpanContainingQuery.Builder()).build());
		}

		public Builder fieldMaskingSpan(SpanFieldMaskingQuery v) {
			this._type = FIELD_MASKING_SPAN;
			this._value = v;
			return this;
		}

		public Builder fieldMaskingSpan(
				Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> f) {
			return this.fieldMaskingSpan(f.apply(new SpanFieldMaskingQuery.Builder()).build());
		}

		public Builder spanFirst(SpanFirstQuery v) {
			this._type = SPAN_FIRST;
			this._value = v;
			return this;
		}

		public Builder spanFirst(Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> f) {
			return this.spanFirst(f.apply(new SpanFirstQuery.Builder()).build());
		}

		public Builder spanMulti(SpanMultiTermQuery v) {
			this._type = SPAN_MULTI;
			this._value = v;
			return this;
		}

		public Builder spanMulti(Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> f) {
			return this.spanMulti(f.apply(new SpanMultiTermQuery.Builder()).build());
		}

		public Builder spanNear(SpanNearQuery v) {
			this._type = SPAN_NEAR;
			this._value = v;
			return this;
		}

		public Builder spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> f) {
			return this.spanNear(f.apply(new SpanNearQuery.Builder()).build());
		}

		public Builder spanNot(SpanNotQuery v) {
			this._type = SPAN_NOT;
			this._value = v;
			return this;
		}

		public Builder spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> f) {
			return this.spanNot(f.apply(new SpanNotQuery.Builder()).build());
		}

		public Builder spanOr(SpanOrQuery v) {
			this._type = SPAN_OR;
			this._value = v;
			return this;
		}

		public Builder spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> f) {
			return this.spanOr(f.apply(new SpanOrQuery.Builder()).build());
		}

		public Builder spanTerm(SpanTermQuery v) {
			this._type = SPAN_TERM;
			this._value = v;
			return this;
		}

		public Builder spanTerm(Function<SpanTermQuery.Builder, ObjectBuilder<SpanTermQuery>> f) {
			return this.spanTerm(f.apply(new SpanTermQuery.Builder()).build());
		}

		public Builder spanWithin(SpanWithinQuery v) {
			this._type = SPAN_WITHIN;
			this._value = v;
			return this;
		}

		public Builder spanWithin(Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> f) {
			return this.spanWithin(f.apply(new SpanWithinQuery.Builder()).build());
		}

		public Builder term(TermQuery v) {
			this._type = TERM;
			this._value = v;
			return this;
		}

		public Builder term(Function<TermQuery.Builder, ObjectBuilder<TermQuery>> f) {
			return this.term(f.apply(new TermQuery.Builder()).build());
		}

		public Builder terms(TermsQuery v) {
			this._type = TERMS;
			this._value = v;
			return this;
		}

		public Builder terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> f) {
			return this.terms(f.apply(new TermsQuery.Builder()).build());
		}

		public Builder termsSet(TermsSetQuery v) {
			this._type = TERMS_SET;
			this._value = v;
			return this;
		}

		public Builder termsSet(Function<TermsSetQuery.Builder, ObjectBuilder<TermsSetQuery>> f) {
			return this.termsSet(f.apply(new TermsSetQuery.Builder()).build());
		}

		public Builder wildcard(WildcardQuery v) {
			this._type = WILDCARD;
			this._value = v;
			return this;
		}

		public Builder wildcard(Function<WildcardQuery.Builder, ObjectBuilder<WildcardQuery>> f) {
			return this.wildcard(f.apply(new WildcardQuery.Builder()).build());
		}

		public Builder type(TypeQuery v) {
			this._type = TYPE;
			this._value = v;
			return this;
		}

		public Builder type(Function<TypeQuery.Builder, ObjectBuilder<TypeQuery>> f) {
			return this.type(f.apply(new TypeQuery.Builder()).build());
		}

		public Query build() {
			return new Query(this);
		}

	}

	protected static void setupQueryDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::bool, BoolQuery._DESERIALIZER, "bool");
		op.add(Builder::boosting, BoostingQuery._DESERIALIZER, "boosting");
		op.add(Builder::common, CommonTermsQuery._DESERIALIZER, "common");
		op.add(Builder::combinedFields, CombinedFieldsQuery._DESERIALIZER, "combined_fields");
		op.add(Builder::constantScore, ConstantScoreQuery._DESERIALIZER, "constant_score");
		op.add(Builder::disMax, DisMaxQuery._DESERIALIZER, "dis_max");
		op.add(Builder::distanceFeature, JsonpDeserializer.jsonValueDeserializer(), "distance_feature");
		op.add(Builder::exists, ExistsQuery._DESERIALIZER, "exists");
		op.add(Builder::functionScore, FunctionScoreQuery._DESERIALIZER, "function_score");
		op.add(Builder::fuzzy, FuzzyQuery._DESERIALIZER, "fuzzy");
		op.add(Builder::geoBoundingBox, GeoBoundingBoxQuery._DESERIALIZER, "geo_bounding_box");
		op.add(Builder::geoDistance, GeoDistanceQuery._DESERIALIZER, "geo_distance");
		op.add(Builder::geoPolygon, GeoPolygonQuery._DESERIALIZER, "geo_polygon");
		op.add(Builder::geoShape, GeoShapeQuery._DESERIALIZER, "geo_shape");
		op.add(Builder::hasChild, HasChildQuery._DESERIALIZER, "has_child");
		op.add(Builder::hasParent, HasParentQuery._DESERIALIZER, "has_parent");
		op.add(Builder::ids, IdsQuery._DESERIALIZER, "ids");
		op.add(Builder::intervals, IntervalsQuery._DESERIALIZER, "intervals");
		op.add(Builder::match, MatchQuery._DESERIALIZER, "match");
		op.add(Builder::matchAll, MatchAllQuery._DESERIALIZER, "match_all");
		op.add(Builder::matchBoolPrefix, MatchBoolPrefixQuery._DESERIALIZER, "match_bool_prefix");
		op.add(Builder::matchNone, MatchNoneQuery._DESERIALIZER, "match_none");
		op.add(Builder::matchPhrase, MatchPhraseQuery._DESERIALIZER, "match_phrase");
		op.add(Builder::matchPhrasePrefix, MatchPhrasePrefixQuery._DESERIALIZER, "match_phrase_prefix");
		op.add(Builder::moreLikeThis, MoreLikeThisQuery._DESERIALIZER, "more_like_this");
		op.add(Builder::multiMatch, MultiMatchQuery._DESERIALIZER, "multi_match");
		op.add(Builder::nested, NestedQuery._DESERIALIZER, "nested");
		op.add(Builder::parentId, ParentIdQuery._DESERIALIZER, "parent_id");
		op.add(Builder::percolate, PercolateQuery._DESERIALIZER, "percolate");
		op.add(Builder::pinned, PinnedQuery._DESERIALIZER, "pinned");
		op.add(Builder::prefix, PrefixQuery._DESERIALIZER, "prefix");
		op.add(Builder::queryString, QueryStringQuery._DESERIALIZER, "query_string");
		op.add(Builder::range, JsonpDeserializer.jsonValueDeserializer(), "range");
		op.add(Builder::rankFeature, RankFeatureQuery._DESERIALIZER, "rank_feature");
		op.add(Builder::regexp, RegexpQuery._DESERIALIZER, "regexp");
		op.add(Builder::script, ScriptQuery._DESERIALIZER, "script");
		op.add(Builder::scriptScore, ScriptScoreQuery._DESERIALIZER, "script_score");
		op.add(Builder::shape, ShapeQuery._DESERIALIZER, "shape");
		op.add(Builder::simpleQueryString, SimpleQueryStringQuery._DESERIALIZER, "simple_query_string");
		op.add(Builder::spanContaining, SpanContainingQuery._DESERIALIZER, "span_containing");
		op.add(Builder::fieldMaskingSpan, SpanFieldMaskingQuery._DESERIALIZER, "field_masking_span");
		op.add(Builder::spanFirst, SpanFirstQuery._DESERIALIZER, "span_first");
		op.add(Builder::spanMulti, SpanMultiTermQuery._DESERIALIZER, "span_multi");
		op.add(Builder::spanNear, SpanNearQuery._DESERIALIZER, "span_near");
		op.add(Builder::spanNot, SpanNotQuery._DESERIALIZER, "span_not");
		op.add(Builder::spanOr, SpanOrQuery._DESERIALIZER, "span_or");
		op.add(Builder::spanTerm, SpanTermQuery._DESERIALIZER, "span_term");
		op.add(Builder::spanWithin, SpanWithinQuery._DESERIALIZER, "span_within");
		op.add(Builder::term, TermQuery._DESERIALIZER, "term");
		op.add(Builder::terms, TermsQuery._DESERIALIZER, "terms");
		op.add(Builder::termsSet, TermsSetQuery._DESERIALIZER, "terms_set");
		op.add(Builder::wildcard, WildcardQuery._DESERIALIZER, "wildcard");
		op.add(Builder::type, TypeQuery._DESERIALIZER, "type");

	}

	public static final JsonpDeserializer<Query> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Query::setupQueryDeserializer, Builder::build);
}
