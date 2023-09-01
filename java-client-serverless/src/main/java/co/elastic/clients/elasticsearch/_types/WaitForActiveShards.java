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

// typedef: _types.WaitForActiveShards

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.WaitForActiveShards">API
 *      specification</a>
 */
@JsonpDeserializable
public class WaitForActiveShards implements TaggedUnion<WaitForActiveShards.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Option, Count

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

	private WaitForActiveShards(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Option :
				return this.option().jsonValue();
			case Count :
				return String.valueOf(this.count());

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private WaitForActiveShards(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static WaitForActiveShards of(Function<Builder, ObjectBuilder<WaitForActiveShards>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code option}?
	 */
	public boolean isOption() {
		return _kind == Kind.Option;
	}

	/**
	 * Get the {@code option} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code option} kind.
	 */
	public WaitForActiveShardOptions option() {
		return TaggedUnionUtils.get(this, Kind.Option);
	}

	/**
	 * Is this variant instance of kind {@code count}?
	 */
	public boolean isCount() {
		return _kind == Kind.Count;
	}

	/**
	 * Get the {@code count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code count} kind.
	 */
	public Integer count() {
		return TaggedUnionUtils.get(this, Kind.Count);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Count :
					generator.write(((Integer) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WaitForActiveShards> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<WaitForActiveShards> option(WaitForActiveShardOptions v) {
			this._kind = Kind.Option;
			this._value = v;
			return this;
		}

		public ObjectBuilder<WaitForActiveShards> count(Integer v) {
			this._kind = Kind.Count;
			this._value = v;
			return this;
		}

		public WaitForActiveShards build() {
			_checkSingleUse();
			return new WaitForActiveShards(this);
		}

	}

	private static JsonpDeserializer<WaitForActiveShards> buildWaitForActiveShardsDeserializer() {
		return new UnionDeserializer.Builder<WaitForActiveShards, Kind, Object>(WaitForActiveShards::new, false)
				.addMember(Kind.Option, WaitForActiveShardOptions._DESERIALIZER)
				.addMember(Kind.Count, JsonpDeserializer.integerDeserializer()).build();
	}

	public static final JsonpDeserializer<WaitForActiveShards> _DESERIALIZER = JsonpDeserializer
			.lazy(WaitForActiveShards::buildWaitForActiveShardsDeserializer);
}
