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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
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

// typedef: _types.query_dsl.GeoGridQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.GeoGridQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoGridQuery extends QueryBase
		implements
			TaggedUnion<GeoGridQuery.Kind, Object>,
			QueryVariant,
			JsonpSerializable {

	/**
	 * {@link GeoGridQuery} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.query_dsl.GeoGridQuery">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Geogrid("geogrid"),

		Geohash("geohash"),

		Geohex("geohex"),

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
		return Query.Kind.GeoGrid;
	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	// Single key dictionary
	private final String field;

	private GeoGridQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static GeoGridQuery of(Function<Builder, ObjectBuilder<GeoGridQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Is this variant instance of kind {@code geogrid}?
	 */
	public boolean isGeogrid() {
		return _kind == Kind.Geogrid;
	}

	/**
	 * Get the {@code geogrid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geogrid} kind.
	 */
	public String geogrid() {
		return TaggedUnionUtils.get(this, Kind.Geogrid);
	}

	/**
	 * Is this variant instance of kind {@code geohash}?
	 */
	public boolean isGeohash() {
		return _kind == Kind.Geohash;
	}

	/**
	 * Get the {@code geohash} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash} kind.
	 */
	public String geohash() {
		return TaggedUnionUtils.get(this, Kind.Geohash);
	}

	/**
	 * Is this variant instance of kind {@code geohex}?
	 */
	public boolean isGeohex() {
		return _kind == Kind.Geohex;
	}

	/**
	 * Get the {@code geohex} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohex} kind.
	 */
	public String geohex() {
		return TaggedUnionUtils.get(this, Kind.Geohex);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Geogrid :
					generator.write(((String) this._value));

					break;
				case Geohash :
					generator.write(((String) this._value));

					break;
				case Geohex :
					generator.write(((String) this._value));

					break;
			}
		}

		generator.writeEnd();

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<GeoGridQuery> {
		private Kind _kind;
		private Object _value;

		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<GeoGridQuery> geogrid(String v) {
			this._kind = Kind.Geogrid;
			this._value = v;
			return this;
		}

		public ObjectBuilder<GeoGridQuery> geohash(String v) {
			this._kind = Kind.Geohash;
			this._value = v;
			return this;
		}

		public ObjectBuilder<GeoGridQuery> geohex(String v) {
			this._kind = Kind.Geohex;
			this._value = v;
			return this;
		}

		public GeoGridQuery build() {
			_checkSingleUse();
			return new GeoGridQuery(this);
		}

	}

	protected static void setupGeoGridQueryDeserializer(ObjectDeserializer<Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::geogrid, JsonpDeserializer.stringDeserializer(), "geogrid");
		op.add(Builder::geohash, JsonpDeserializer.stringDeserializer(), "geohash");
		op.add(Builder::geohex, JsonpDeserializer.stringDeserializer(), "geohex");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

	public static final JsonpDeserializer<GeoGridQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoGridQuery::setupGeoGridQueryDeserializer, Builder::build);
}
