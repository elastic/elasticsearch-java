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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.GeoLocation

/**
 * A latitude/longitude as a 2 dimensional point. It can be represented in
 * various ways:
 * <ul>
 * <li>as a <code>{lat, long}</code> object</li>
 * <li>as a geo hash value</li>
 * <li>as a <code>[lon, lat]</code> array</li>
 * <li>as a string in <code>&quot;&lt;lat&gt;, &lt;lon&gt;&quot;</code> or WKT
 * point formats</li>
 * </ul>
 *
 * @see <a href="../doc-files/api-spec.html#_types.GeoLocation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoLocation implements TaggedUnion<GeoLocation.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Coords, Geohash, Latlon, Text

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

	private GeoLocation(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private GeoLocation(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static GeoLocation of(Function<Builder, ObjectBuilder<GeoLocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code coords}?
	 */
	public boolean isCoords() {
		return _kind == Kind.Coords;
	}

	/**
	 * Get the {@code coords} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code coords} kind.
	 */
	public List<Double> coords() {
		return TaggedUnionUtils.get(this, Kind.Coords);
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
	public GeoHashLocation geohash() {
		return TaggedUnionUtils.get(this, Kind.Geohash);
	}

	/**
	 * Is this variant instance of kind {@code latlon}?
	 */
	public boolean isLatlon() {
		return _kind == Kind.Latlon;
	}

	/**
	 * Get the {@code latlon} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code latlon} kind.
	 */
	public LatLonGeoLocation latlon() {
		return TaggedUnionUtils.get(this, Kind.Latlon);
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean isText() {
		return _kind == Kind.Text;
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, Kind.Text);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Coords :
					generator.writeStartArray();
					for (Double item0 : ((List<Double>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case Text :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoLocation> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<GeoLocation> coords(List<Double> v) {
			this._kind = Kind.Coords;
			this._value = v;
			return this;
		}

		public ObjectBuilder<GeoLocation> geohash(GeoHashLocation v) {
			this._kind = Kind.Geohash;
			this._value = v;
			return this;
		}

		public ObjectBuilder<GeoLocation> geohash(
				Function<GeoHashLocation.Builder, ObjectBuilder<GeoHashLocation>> fn) {
			return this.geohash(fn.apply(new GeoHashLocation.Builder()).build());
		}

		public ObjectBuilder<GeoLocation> latlon(LatLonGeoLocation v) {
			this._kind = Kind.Latlon;
			this._value = v;
			return this;
		}

		public ObjectBuilder<GeoLocation> latlon(
				Function<LatLonGeoLocation.Builder, ObjectBuilder<LatLonGeoLocation>> fn) {
			return this.latlon(fn.apply(new LatLonGeoLocation.Builder()).build());
		}

		public ObjectBuilder<GeoLocation> text(String v) {
			this._kind = Kind.Text;
			this._value = v;
			return this;
		}

		public GeoLocation build() {
			_checkSingleUse();
			return new GeoLocation(this);
		}

	}

	private static JsonpDeserializer<GeoLocation> buildGeoLocationDeserializer() {
		return new UnionDeserializer.Builder<GeoLocation, Kind, Object>(GeoLocation::new, false)
				.addMember(Kind.Coords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()))
				.addMember(Kind.Geohash, GeoHashLocation._DESERIALIZER)
				.addMember(Kind.Latlon, LatLonGeoLocation._DESERIALIZER)
				.addMember(Kind.Text, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<GeoLocation> _DESERIALIZER = JsonpDeserializer
			.lazy(GeoLocation::buildGeoLocationDeserializer);
}
