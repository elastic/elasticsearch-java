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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.InputContainer
@JsonpDeserializable
public class Input implements TaggedUnion<Object>, JsonpSerializable {

	public static final String CHAIN = "chain";
	public static final String HTTP = "http";
	public static final String SEARCH = "search";
	public static final String SIMPLE = "simple";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public Input(InputVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends InputVariant> Input(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private Input(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public Input(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code chain} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code chain} kind.
	 */
	public ChainInput chain() {
		return TaggedUnionUtils.get(this, CHAIN);
	}

	/**
	 * Get the {@code http} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code http} kind.
	 */
	public HttpInput http() {
		return TaggedUnionUtils.get(this, HTTP);
	}

	/**
	 * Get the {@code search} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code search} kind.
	 */
	public SearchInput search() {
		return TaggedUnionUtils.get(this, SEARCH);
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public Map<String, JsonData> simple() {
		return TaggedUnionUtils.get(this, SIMPLE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case SIMPLE :
					generator.writeStartObject();
					for (Map.Entry<String, JsonData> item0 : ((Map<String, JsonData>) this._value).entrySet()) {
						generator.writeKey(item0.getKey());
						item0.getValue().serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}

	public static class Builder implements ObjectBuilder<Input> {
		private String _type;
		private Object _value;

		public Builder chain(ChainInput v) {
			this._type = CHAIN;
			this._value = v;
			return this;
		}

		public Builder chain(Function<ChainInput.Builder, ObjectBuilder<ChainInput>> f) {
			return this.chain(f.apply(new ChainInput.Builder()).build());
		}

		public Builder http(HttpInput v) {
			this._type = HTTP;
			this._value = v;
			return this;
		}

		public Builder http(Function<HttpInput.Builder, ObjectBuilder<HttpInput>> f) {
			return this.http(f.apply(new HttpInput.Builder()).build());
		}

		public Builder search(SearchInput v) {
			this._type = SEARCH;
			this._value = v;
			return this;
		}

		public Builder search(Function<SearchInput.Builder, ObjectBuilder<SearchInput>> f) {
			return this.search(f.apply(new SearchInput.Builder()).build());
		}

		public Builder simple(Map<String, JsonData> v) {
			this._type = SIMPLE;
			this._value = v;
			return this;
		}

		public Input build() {
			return new Input(this);
		}

	}

	protected static void setupInputDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::chain, ChainInput._DESERIALIZER, "chain");
		op.add(Builder::http, HttpInput._DESERIALIZER, "http");
		op.add(Builder::search, SearchInput._DESERIALIZER, "search");
		op.add(Builder::simple, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "simple");

	}

	public static final JsonpDeserializer<Input> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Input::setupInputDeserializer, Builder::build);
}
