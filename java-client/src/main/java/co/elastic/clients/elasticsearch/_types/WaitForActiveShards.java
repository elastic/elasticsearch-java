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
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.WaitForActiveShards
// union type: Union[]
@JsonpDeserializable
public class WaitForActiveShards implements TaggedUnion<Object>, JsonpSerializable {

	public static final String OPTION = "option";
	public static final String COUNT = "count";

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

	public WaitForActiveShards(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "option" :
				return this.option().jsonValue();
			case "count" :
				return String.valueOf(this.count());

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private WaitForActiveShards(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static WaitForActiveShards of(Function<Builder, ObjectBuilder<WaitForActiveShards>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code option} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code option} kind.
	 */
	public WaitForActiveShardOptions option() {
		return TaggedUnionUtils.get(this, OPTION);
	}

	/**
	 * Get the {@code count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code count} kind.
	 */
	public Integer count() {
		return TaggedUnionUtils.get(this, COUNT);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case COUNT :
					generator.write(((Integer) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WaitForActiveShards> {
		private String _type;
		private Object _value;

		public Builder option(WaitForActiveShardOptions v) {
			this._type = OPTION;
			this._value = v;
			return this;
		}

		public Builder count(Integer v) {
			this._type = COUNT;
			this._value = v;
			return this;
		}

		public WaitForActiveShards build() {
			_checkSingleUse();
			return new WaitForActiveShards(this);
		}

	}

	private static JsonpDeserializer<WaitForActiveShards> buildWaitForActiveShardsDeserializer() {
		return new UnionDeserializer.Builder<>(WaitForActiveShards::new, false)
				.addMember("option", WaitForActiveShardOptions._DESERIALIZER)
				.addMember("count", JsonpDeserializer.integerDeserializer()).build();
	}

	public static final JsonpDeserializer<WaitForActiveShards> _DESERIALIZER = JsonpDeserializer
			.lazy(WaitForActiveShards::buildWaitForActiveShardsDeserializer);
}
