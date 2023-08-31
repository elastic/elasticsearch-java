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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Context

/**
 * Text or location that we want similar documents for or a lookup to a
 * document's field for the text.
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/query-dsl-mlt-query.html#_document_input_parameters">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.Context">API
 *      specification</a>
 */
@JsonpDeserializable
public class Context implements TaggedUnion<Context.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Location, Category

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

	private Context(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private Context(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Context of(Function<Builder, ObjectBuilder<Context>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code location}?
	 */
	public boolean isLocation() {
		return _kind == Kind.Location;
	}

	/**
	 * Get the {@code location} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code location} kind.
	 */
	public GeoLocation location() {
		return TaggedUnionUtils.get(this, Kind.Location);
	}

	/**
	 * Is this variant instance of kind {@code category}?
	 */
	public boolean isCategory() {
		return _kind == Kind.Category;
	}

	/**
	 * Get the {@code category} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code category} kind.
	 */
	public String category() {
		return TaggedUnionUtils.get(this, Kind.Category);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Category :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Context> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<Context> location(GeoLocation v) {
			this._kind = Kind.Location;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Context> location(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.location(fn.apply(new GeoLocation.Builder()).build());
		}

		public ObjectBuilder<Context> category(String v) {
			this._kind = Kind.Category;
			this._value = v;
			return this;
		}

		public Context build() {
			_checkSingleUse();
			return new Context(this);
		}

	}

	private static JsonpDeserializer<Context> buildContextDeserializer() {
		return new UnionDeserializer.Builder<Context, Kind, Object>(Context::new, true)
				.addMember(Kind.Location, GeoLocation._DESERIALIZER)
				.addMember(Kind.Category, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<Context> _DESERIALIZER = JsonpDeserializer
			.lazy(Context::buildContextDeserializer);
}
