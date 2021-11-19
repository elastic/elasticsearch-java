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
import java.lang.Number;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.GeoHashPrecision
// union type: Union[]
@JsonpDeserializable
public class GeoHashPrecision implements TaggedUnion<Object>, JsonpSerializable {

	public static final String GEOHASH_LENGTH = "geohash_length";
	public static final String DISTANCE = "distance";

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

	public GeoHashPrecision(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "geohash_length" :
				return this.geohashLength().toString();
			case "distance" :
				return this.distance();

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private GeoHashPrecision(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static GeoHashPrecision of(Function<Builder, ObjectBuilder<GeoHashPrecision>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code geohash_length}?
	 */
	public boolean _isGeohashLength() {
		return GEOHASH_LENGTH.equals(_type());
	}

	/**
	 * Get the {@code geohash_length} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash_length} kind.
	 */
	public Number geohashLength() {
		return TaggedUnionUtils.get(this, GEOHASH_LENGTH);
	}

	/**
	 * Is this variant instance of kind {@code distance}?
	 */
	public boolean _isDistance() {
		return DISTANCE.equals(_type());
	}

	/**
	 * Get the {@code distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code distance} kind.
	 */
	public String distance() {
		return TaggedUnionUtils.get(this, DISTANCE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case GEOHASH_LENGTH :
					generator.write(((Number) this._value).doubleValue());

					break;
				case DISTANCE :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoHashPrecision> {
		private String _type;
		private Object _value;

		public Builder geohashLength(Number v) {
			this._type = GEOHASH_LENGTH;
			this._value = v;
			return this;
		}

		public Builder distance(String v) {
			this._type = DISTANCE;
			this._value = v;
			return this;
		}

		public GeoHashPrecision build() {
			_checkSingleUse();
			return new GeoHashPrecision(this);
		}

	}

	private static JsonpDeserializer<GeoHashPrecision> buildGeoHashPrecisionDeserializer() {
		return new UnionDeserializer.Builder<>(GeoHashPrecision::new, true)
				.addMember("geohash_length", JsonpDeserializer.numberDeserializer())
				.addMember("distance", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<GeoHashPrecision> _DESERIALIZER = JsonpDeserializer
			.lazy(GeoHashPrecision::buildGeoHashPrecisionDeserializer);
}
