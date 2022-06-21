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
import java.lang.Number;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.GeoHashPrecision

/**
 * A precision that can be expressed as a geohash length between 1 and 12, or a
 * distance measure like &quot;1km&quot;, &quot;10m&quot;.
 * 
 * @see <a href="../doc-files/api-spec.html#_types.GeoHashPrecision">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoHashPrecision implements TaggedUnion<GeoHashPrecision.Kind, Object>, JsonpSerializable {

	public enum Kind {
		GeohashLength, Distance

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

	private GeoHashPrecision(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case GeohashLength :
				return this.geohashLength().toString();
			case Distance :
				return this.distance();

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private GeoHashPrecision(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static GeoHashPrecision of(Function<Builder, ObjectBuilder<GeoHashPrecision>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code geohash_length}?
	 */
	public boolean isGeohashLength() {
		return _kind == Kind.GeohashLength;
	}

	/**
	 * Get the {@code geohash_length} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geohash_length} kind.
	 */
	public Number geohashLength() {
		return TaggedUnionUtils.get(this, Kind.GeohashLength);
	}

	/**
	 * Is this variant instance of kind {@code distance}?
	 */
	public boolean isDistance() {
		return _kind == Kind.Distance;
	}

	/**
	 * Get the {@code distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code distance} kind.
	 */
	public String distance() {
		return TaggedUnionUtils.get(this, Kind.Distance);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case GeohashLength :
					generator.write(((Number) this._value).doubleValue());

					break;
				case Distance :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoHashPrecision> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<GeoHashPrecision> geohashLength(Number v) {
			this._kind = Kind.GeohashLength;
			this._value = v;
			return this;
		}

		public ObjectBuilder<GeoHashPrecision> distance(String v) {
			this._kind = Kind.Distance;
			this._value = v;
			return this;
		}

		public GeoHashPrecision build() {
			_checkSingleUse();
			return new GeoHashPrecision(this);
		}

	}

	private static JsonpDeserializer<GeoHashPrecision> buildGeoHashPrecisionDeserializer() {
		return new UnionDeserializer.Builder<GeoHashPrecision, Kind, Object>(GeoHashPrecision::new, false)
				.addMember(Kind.GeohashLength, JsonpDeserializer.numberDeserializer())
				.addMember(Kind.Distance, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<GeoHashPrecision> _DESERIALIZER = JsonpDeserializer
			.lazy(GeoHashPrecision::buildGeoHashPrecisionDeserializer);
}
