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
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.GeoBounds
// union type: Union[]
@JsonpDeserializable
public class GeoBounds implements TaggedUnion<GeoBounds.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Coords, Tlbr, Trbl, Wkt

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

	public GeoBounds(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private GeoBounds(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static GeoBounds of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
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
	public CoordsGeoBounds coords() {
		return TaggedUnionUtils.get(this, Kind.Coords);
	}

	/**
	 * Is this variant instance of kind {@code tlbr}?
	 */
	public boolean isTlbr() {
		return _kind == Kind.Tlbr;
	}

	/**
	 * Get the {@code tlbr} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code tlbr} kind.
	 */
	public TopLeftBottomRightGeoBounds tlbr() {
		return TaggedUnionUtils.get(this, Kind.Tlbr);
	}

	/**
	 * Is this variant instance of kind {@code trbl}?
	 */
	public boolean isTrbl() {
		return _kind == Kind.Trbl;
	}

	/**
	 * Get the {@code trbl} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trbl} kind.
	 */
	public TopRightBottomLeftGeoBounds trbl() {
		return TaggedUnionUtils.get(this, Kind.Trbl);
	}

	/**
	 * Is this variant instance of kind {@code wkt}?
	 */
	public boolean isWkt() {
		return _kind == Kind.Wkt;
	}

	/**
	 * Get the {@code wkt} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wkt} kind.
	 */
	public WktGeoBounds wkt() {
		return TaggedUnionUtils.get(this, Kind.Wkt);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoBounds> {
		private Kind _kind;
		private Object _value;

		public Builder coords(CoordsGeoBounds v) {
			this._kind = Kind.Coords;
			this._value = v;
			return this;
		}

		public Builder coords(Consumer<CoordsGeoBounds.Builder> fn) {
			CoordsGeoBounds.Builder builder = new CoordsGeoBounds.Builder();
			fn.accept(builder);
			return this.coords(builder.build());
		}

		public Builder tlbr(TopLeftBottomRightGeoBounds v) {
			this._kind = Kind.Tlbr;
			this._value = v;
			return this;
		}

		public Builder tlbr(Consumer<TopLeftBottomRightGeoBounds.Builder> fn) {
			TopLeftBottomRightGeoBounds.Builder builder = new TopLeftBottomRightGeoBounds.Builder();
			fn.accept(builder);
			return this.tlbr(builder.build());
		}

		public Builder trbl(TopRightBottomLeftGeoBounds v) {
			this._kind = Kind.Trbl;
			this._value = v;
			return this;
		}

		public Builder trbl(Consumer<TopRightBottomLeftGeoBounds.Builder> fn) {
			TopRightBottomLeftGeoBounds.Builder builder = new TopRightBottomLeftGeoBounds.Builder();
			fn.accept(builder);
			return this.trbl(builder.build());
		}

		public Builder wkt(WktGeoBounds v) {
			this._kind = Kind.Wkt;
			this._value = v;
			return this;
		}

		public Builder wkt(Consumer<WktGeoBounds.Builder> fn) {
			WktGeoBounds.Builder builder = new WktGeoBounds.Builder();
			fn.accept(builder);
			return this.wkt(builder.build());
		}

		public GeoBounds build() {
			_checkSingleUse();
			return new GeoBounds(this);
		}

	}

	private static JsonpDeserializer<GeoBounds> buildGeoBoundsDeserializer() {
		return new UnionDeserializer.Builder<GeoBounds, Kind, Object>(GeoBounds::new, false)
				.addMember(Kind.Coords, CoordsGeoBounds._DESERIALIZER)
				.addMember(Kind.Tlbr, TopLeftBottomRightGeoBounds._DESERIALIZER)
				.addMember(Kind.Trbl, TopRightBottomLeftGeoBounds._DESERIALIZER)
				.addMember(Kind.Wkt, WktGeoBounds._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<GeoBounds> _DESERIALIZER = JsonpDeserializer
			.lazy(GeoBounds::buildGeoBoundsDeserializer);
}
