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
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.GeoBounds
// union type: Union[]
@JsonpDeserializable
public class GeoBounds implements TaggedUnion<Object>, JsonpSerializable {

	public static final String COORDS = "coords";
	public static final String TLBR = "tlbr";
	public static final String TRBL = "trbl";
	public static final String WKT = "wkt";

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

	public GeoBounds(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private GeoBounds(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static GeoBounds of(Function<Builder, ObjectBuilder<GeoBounds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code coords}?
	 */
	public boolean _isCoords() {
		return COORDS.equals(_type());
	}

	/**
	 * Get the {@code coords} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code coords} kind.
	 */
	public CoordsGeoBounds coords() {
		return TaggedUnionUtils.get(this, COORDS);
	}

	/**
	 * Is this variant instance of kind {@code tlbr}?
	 */
	public boolean _isTlbr() {
		return TLBR.equals(_type());
	}

	/**
	 * Get the {@code tlbr} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code tlbr} kind.
	 */
	public TopLeftBottomRightGeoBounds tlbr() {
		return TaggedUnionUtils.get(this, TLBR);
	}

	/**
	 * Is this variant instance of kind {@code trbl}?
	 */
	public boolean _isTrbl() {
		return TRBL.equals(_type());
	}

	/**
	 * Get the {@code trbl} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trbl} kind.
	 */
	public TopRightBottomLeftGeoBounds trbl() {
		return TaggedUnionUtils.get(this, TRBL);
	}

	/**
	 * Is this variant instance of kind {@code wkt}?
	 */
	public boolean _isWkt() {
		return WKT.equals(_type());
	}

	/**
	 * Get the {@code wkt} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wkt} kind.
	 */
	public WktGeoBounds wkt() {
		return TaggedUnionUtils.get(this, WKT);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoBounds> {
		private String _type;
		private Object _value;

		public Builder coords(CoordsGeoBounds v) {
			this._type = COORDS;
			this._value = v;
			return this;
		}

		public Builder coords(Function<CoordsGeoBounds.Builder, ObjectBuilder<CoordsGeoBounds>> f) {
			return this.coords(f.apply(new CoordsGeoBounds.Builder()).build());
		}

		public Builder tlbr(TopLeftBottomRightGeoBounds v) {
			this._type = TLBR;
			this._value = v;
			return this;
		}

		public Builder tlbr(
				Function<TopLeftBottomRightGeoBounds.Builder, ObjectBuilder<TopLeftBottomRightGeoBounds>> f) {
			return this.tlbr(f.apply(new TopLeftBottomRightGeoBounds.Builder()).build());
		}

		public Builder trbl(TopRightBottomLeftGeoBounds v) {
			this._type = TRBL;
			this._value = v;
			return this;
		}

		public Builder trbl(
				Function<TopRightBottomLeftGeoBounds.Builder, ObjectBuilder<TopRightBottomLeftGeoBounds>> f) {
			return this.trbl(f.apply(new TopRightBottomLeftGeoBounds.Builder()).build());
		}

		public Builder wkt(WktGeoBounds v) {
			this._type = WKT;
			this._value = v;
			return this;
		}

		public Builder wkt(Function<WktGeoBounds.Builder, ObjectBuilder<WktGeoBounds>> f) {
			return this.wkt(f.apply(new WktGeoBounds.Builder()).build());
		}

		public GeoBounds build() {
			_checkSingleUse();
			return new GeoBounds(this);
		}

	}

	private static JsonpDeserializer<GeoBounds> buildGeoBoundsDeserializer() {
		return new UnionDeserializer.Builder<>(GeoBounds::new, false).addMember("coords", CoordsGeoBounds._DESERIALIZER)
				.addMember("tlbr", TopLeftBottomRightGeoBounds._DESERIALIZER)
				.addMember("trbl", TopRightBottomLeftGeoBounds._DESERIALIZER)
				.addMember("wkt", WktGeoBounds._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<GeoBounds> _DESERIALIZER = JsonpDeserializer
			.lazy(GeoBounds::buildGeoBoundsDeserializer);
}
