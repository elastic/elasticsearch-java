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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.GeoLocation;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Context
// union type: Union[]
@JsonpDeserializable
public class Context implements TaggedUnion<Object>, JsonpSerializable {

	public static final String LOCATION = "location";
	public static final String CATEGORY = "category";

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

	public Context(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private Context(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Context of(Function<Builder, ObjectBuilder<Context>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code location}?
	 */
	public boolean _isLocation() {
		return LOCATION.equals(_type());
	}

	/**
	 * Get the {@code location} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code location} kind.
	 */
	public GeoLocation location() {
		return TaggedUnionUtils.get(this, LOCATION);
	}

	/**
	 * Is this variant instance of kind {@code category}?
	 */
	public boolean _isCategory() {
		return CATEGORY.equals(_type());
	}

	/**
	 * Get the {@code category} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code category} kind.
	 */
	public String category() {
		return TaggedUnionUtils.get(this, CATEGORY);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case CATEGORY :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Context> {
		private String _type;
		private Object _value;

		public Builder location(GeoLocation v) {
			this._type = LOCATION;
			this._value = v;
			return this;
		}

		public Builder location(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> f) {
			return this.location(f.apply(new GeoLocation.Builder()).build());
		}

		public Builder category(String v) {
			this._type = CATEGORY;
			this._value = v;
			return this;
		}

		public Context build() {
			_checkSingleUse();
			return new Context(this);
		}

	}

	private static JsonpDeserializer<Context> buildContextDeserializer() {
		return new UnionDeserializer.Builder<>(Context::new, true).addMember("location", GeoLocation._DESERIALIZER)
				.addMember("category", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<Context> _DESERIALIZER = JsonpDeserializer
			.lazy(Context::buildContextDeserializer);
}
