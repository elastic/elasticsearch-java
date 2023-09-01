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
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.Slices

/**
 * Slices configuration used to parallelize a process.
 * 
 * @see <a href="../doc-files/api-spec.html#_types.Slices">API specification</a>
 */
@JsonpDeserializable
public class Slices implements TaggedUnion<Slices.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Computed, Value

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

	private Slices(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Computed :
				return this.computed().jsonValue();
			case Value :
				return String.valueOf(this.value());

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private Slices(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Slices of(Function<Builder, ObjectBuilder<Slices>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code computed}?
	 */
	public boolean isComputed() {
		return _kind == Kind.Computed;
	}

	/**
	 * Get the {@code computed} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code computed} kind.
	 */
	public SlicesCalculation computed() {
		return TaggedUnionUtils.get(this, Kind.Computed);
	}

	/**
	 * Is this variant instance of kind {@code value}?
	 */
	public boolean isValue() {
		return _kind == Kind.Value;
	}

	/**
	 * Get the {@code value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value} kind.
	 */
	public Integer value() {
		return TaggedUnionUtils.get(this, Kind.Value);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Value :
					generator.write(((Integer) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Slices> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<Slices> computed(SlicesCalculation v) {
			this._kind = Kind.Computed;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Slices> value(Integer v) {
			this._kind = Kind.Value;
			this._value = v;
			return this;
		}

		public Slices build() {
			_checkSingleUse();
			return new Slices(this);
		}

	}

	private static JsonpDeserializer<Slices> buildSlicesDeserializer() {
		return new UnionDeserializer.Builder<Slices, Kind, Object>(Slices::new, false)
				.addMember(Kind.Computed, SlicesCalculation._DESERIALIZER)
				.addMember(Kind.Value, JsonpDeserializer.integerDeserializer()).build();
	}

	public static final JsonpDeserializer<Slices> _DESERIALIZER = JsonpDeserializer
			.lazy(Slices::buildSlicesDeserializer);
}
