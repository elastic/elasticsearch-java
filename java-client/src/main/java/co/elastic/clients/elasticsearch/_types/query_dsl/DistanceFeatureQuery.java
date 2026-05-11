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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.query_dsl.DistanceFeatureQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DistanceFeatureQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class DistanceFeatureQuery
		implements
			TaggedUnion<DistanceFeatureQuery.Kind, DistanceFeatureQueryVariant>,
			QueryVariant,
			JsonpSerializable {

	/**
	 * {@link DistanceFeatureQuery} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.query_dsl.DistanceFeatureQuery">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Date("date"),

		Geo("geo"),

		Untyped("untyped"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.DistanceFeature;
	}

	private final Kind _kind;
	private final DistanceFeatureQueryVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final DistanceFeatureQueryVariant _get() {
		return _value;
	}

	public DistanceFeatureQuery(DistanceFeatureQueryVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._distanceFeatureQueryKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DistanceFeatureQuery(Kind kind, DistanceFeatureQueryVariant value) {
		this._kind = kind;
		this._value = value;
	}

	private DistanceFeatureQuery(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DistanceFeatureQuery of(Function<Builder, ObjectBuilder<DistanceFeatureQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code date}?
	 */
	public boolean isDate() {
		return _kind == Kind.Date;
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public DateDistanceFeatureQuery date() {
		return TaggedUnionUtils.get(this, Kind.Date);
	}

	/**
	 * Is this variant instance of kind {@code geo}?
	 */
	public boolean isGeo() {
		return _kind == Kind.Geo;
	}

	/**
	 * Get the {@code geo} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo} kind.
	 */
	public GeoDistanceFeatureQuery geo() {
		return TaggedUnionUtils.get(this, Kind.Geo);
	}

	/**
	 * Is this variant instance of kind {@code untyped}?
	 */
	public boolean isUntyped() {
		return _kind == Kind.Untyped;
	}

	/**
	 * Get the {@code untyped} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code untyped} kind.
	 */
	public UntypedDistanceFeatureQuery untyped() {
		return TaggedUnionUtils.get(this, Kind.Untyped);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DistanceFeatureQuery> {
		private Kind _kind;
		private DistanceFeatureQueryVariant _value;

		public ObjectBuilder<DistanceFeatureQuery> date(DateDistanceFeatureQuery v) {
			this._kind = Kind.Date;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DistanceFeatureQuery> date(
				Function<DateDistanceFeatureQuery.Builder, ObjectBuilder<DateDistanceFeatureQuery>> fn) {
			return this.date(fn.apply(new DateDistanceFeatureQuery.Builder()).build());
		}

		public ObjectBuilder<DistanceFeatureQuery> geo(GeoDistanceFeatureQuery v) {
			this._kind = Kind.Geo;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DistanceFeatureQuery> geo(
				Function<GeoDistanceFeatureQuery.Builder, ObjectBuilder<GeoDistanceFeatureQuery>> fn) {
			return this.geo(fn.apply(new GeoDistanceFeatureQuery.Builder()).build());
		}

		public ObjectBuilder<DistanceFeatureQuery> untyped(UntypedDistanceFeatureQuery v) {
			this._kind = Kind.Untyped;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DistanceFeatureQuery> untyped(
				Function<UntypedDistanceFeatureQuery.Builder, ObjectBuilder<UntypedDistanceFeatureQuery>> fn) {
			return this.untyped(fn.apply(new UntypedDistanceFeatureQuery.Builder()).build());
		}

		public DistanceFeatureQuery build() {
			_checkSingleUse();
			return new DistanceFeatureQuery(this);
		}

	}

	private static JsonpDeserializer<DistanceFeatureQuery> buildDistanceFeatureQueryDeserializer() {
		return new UnionDeserializer.Builder<DistanceFeatureQuery, Kind, DistanceFeatureQueryVariant>(
				DistanceFeatureQuery::new, false).addMember(Kind.Untyped, UntypedDistanceFeatureQuery._DESERIALIZER)
						.build();
	}

	public static final JsonpDeserializer<DistanceFeatureQuery> _DESERIALIZER = JsonpDeserializer
			.lazy(DistanceFeatureQuery::buildDistanceFeatureQueryDeserializer);
}
