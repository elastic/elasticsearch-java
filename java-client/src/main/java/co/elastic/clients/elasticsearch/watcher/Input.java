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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: watcher._types.InputContainer

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.InputContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Input implements TaggedUnion<Input.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Input} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#watcher._types.InputContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Chain("chain"),

		Http("http"),

		Search("search"),

		Simple("simple"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

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

	public Input(InputVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._inputKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Input(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Input of(Function<Builder, ObjectBuilder<Input>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code chain}?
	 */
	public boolean isChain() {
		return _kind == Kind.Chain;
	}

	/**
	 * Get the {@code chain} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code chain} kind.
	 */
	public ChainInput chain() {
		return TaggedUnionUtils.get(this, Kind.Chain);
	}

	/**
	 * Is this variant instance of kind {@code http}?
	 */
	public boolean isHttp() {
		return _kind == Kind.Http;
	}

	/**
	 * Get the {@code http} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code http} kind.
	 */
	public HttpInput http() {
		return TaggedUnionUtils.get(this, Kind.Http);
	}

	/**
	 * Is this variant instance of kind {@code search}?
	 */
	public boolean isSearch() {
		return _kind == Kind.Search;
	}

	/**
	 * Get the {@code search} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code search} kind.
	 */
	public SearchInput search() {
		return TaggedUnionUtils.get(this, Kind.Search);
	}

	/**
	 * Is this variant instance of kind {@code simple}?
	 */
	public boolean isSimple() {
		return _kind == Kind.Simple;
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public Map<String, JsonData> simple() {
		return TaggedUnionUtils.get(this, Kind.Simple);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Simple :
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Input> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Input> chain(ChainInput v) {
			this._kind = Kind.Chain;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Input> chain(Function<ChainInput.Builder, ObjectBuilder<ChainInput>> fn) {
			return this.chain(fn.apply(new ChainInput.Builder()).build());
		}

		public ObjectBuilder<Input> http(HttpInput v) {
			this._kind = Kind.Http;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Input> http(Function<HttpInput.Builder, ObjectBuilder<HttpInput>> fn) {
			return this.http(fn.apply(new HttpInput.Builder()).build());
		}

		public ObjectBuilder<Input> search(SearchInput v) {
			this._kind = Kind.Search;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Input> search(Function<SearchInput.Builder, ObjectBuilder<SearchInput>> fn) {
			return this.search(fn.apply(new SearchInput.Builder()).build());
		}

		public ObjectBuilder<Input> simple(Map<String, JsonData> v) {
			this._kind = Kind.Simple;
			this._value = v;
			return this;
		}

		public Input build() {
			_checkSingleUse();
			return new Input(this);
		}

	}

	protected static void setupInputDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::chain, ChainInput._DESERIALIZER, "chain");
		op.add(Builder::http, HttpInput._DESERIALIZER, "http");
		op.add(Builder::search, SearchInput._DESERIALIZER, "search");
		op.add(Builder::simple, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "simple");

	}

	public static final JsonpDeserializer<Input> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Input::setupInputDeserializer, Builder::build);
}
