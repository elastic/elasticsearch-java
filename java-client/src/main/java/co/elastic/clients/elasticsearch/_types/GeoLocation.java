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
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
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
// union type: Union[]
@JsonpDeserializable
public class GeoLocation implements TaggedUnion<Object>, JsonpSerializable {

	public static final String COORDS = "coords";
	public static final String GEOHASH = "geohash";
	public static final String LATLON = "latlon";
	public static final String TEXT = "text";

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public GeoLocation(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private GeoLocation(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static GeoLocation of(Function<Builder, ObjectBuilder<GeoLocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code coords} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code coords} kind.
	 */
	public List<Double> coords() {
		return TaggedUnionUtils.get(this, COORDS);
	}

	/**
	 * Get the {@code geohash} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash} kind.
	 */
	public GeoHashLocation geohash() {
		return TaggedUnionUtils.get(this, GEOHASH);
	}

	/**
	 * Get the {@code latlon} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code latlon} kind.
	 */
	public LatLonGeoLocation latlon() {
		return TaggedUnionUtils.get(this, LATLON);
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, TEXT);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case COORDS :
					generator.writeStartArray();
					for (Double item0 : ((List<Double>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case TEXT :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoLocation> {
		private String _type;
		private Object _value;

		public Builder coords(List<Double> v) {
			this._type = COORDS;
			this._value = v;
			return this;
		}

		public Builder geohash(GeoHashLocation v) {
			this._type = GEOHASH;
			this._value = v;
			return this;
		}

		public Builder geohash(Function<GeoHashLocation.Builder, ObjectBuilder<GeoHashLocation>> f) {
			return this.geohash(f.apply(new GeoHashLocation.Builder()).build());
		}

		public Builder latlon(LatLonGeoLocation v) {
			this._type = LATLON;
			this._value = v;
			return this;
		}

		public Builder latlon(Function<LatLonGeoLocation.Builder, ObjectBuilder<LatLonGeoLocation>> f) {
			return this.latlon(f.apply(new LatLonGeoLocation.Builder()).build());
		}

		public Builder text(String v) {
			this._type = TEXT;
			this._value = v;
			return this;
		}

		public GeoLocation build() {
			_checkSingleUse();
			return new GeoLocation(this);
		}

	}

	private static JsonpDeserializer<GeoLocation> buildGeoLocationDeserializer() {
		return new UnionDeserializer.Builder<>(GeoLocation::new, false)
				.addMember("coords", JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()))
				.addMember("geohash", GeoHashLocation._DESERIALIZER)
				.addMember("latlon", LatLonGeoLocation._DESERIALIZER)
				.addMember("text", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<GeoLocation> _DESERIALIZER = JsonpDeserializer
			.lazy(GeoLocation::buildGeoLocationDeserializer);
}
