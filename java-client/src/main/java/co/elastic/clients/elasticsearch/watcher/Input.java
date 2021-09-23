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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.InputContainer
public class Input extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String CHAIN = "chain";
	public static final String HTTP = "http";
	public static final String SEARCH = "search";
	public static final String SIMPLE = "simple";

	private Input(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code chain} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code chain} kind.
	 */
	public ChainInput chain() {
		return _get(CHAIN);
	}

	/**
	 * Get the {@code http} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code http} kind.
	 */
	public HttpInput http() {
		return _get(HTTP);
	}

	/**
	 * Get the {@code search} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code search} kind.
	 */
	public SearchInput search() {
		return _get(SEARCH);
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public Map<String, JsonData> simple() {
		return _get(SIMPLE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case SIMPLE :
					generator.writeStartObject();
					for (Map.Entry<String, JsonData> item0 : this.<Map<String, JsonData>>_get(SIMPLE).entrySet()) {
						generator.writeKey(item0.getKey());
						item0.getValue().serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<Input> chain(ChainInput v) {
			this.$variant = v;
			this.$tag = CHAIN;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Input> chain(Function<ChainInput.Builder, ObjectBuilder<ChainInput>> f) {
			return this.chain(f.apply(new ChainInput.Builder()).build());
		}

		public ObjectBuilder<Input> http(HttpInput v) {
			this.$variant = v;
			this.$tag = HTTP;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Input> http(Function<HttpInput.Builder, ObjectBuilder<HttpInput>> f) {
			return this.http(f.apply(new HttpInput.Builder()).build());
		}

		public ObjectBuilder<Input> search(SearchInput v) {
			this.$variant = v;
			this.$tag = SEARCH;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Input> search(Function<SearchInput.Builder, ObjectBuilder<SearchInput>> f) {
			return this.search(f.apply(new SearchInput.Builder()).build());
		}

		public ObjectBuilder<Input> simple(Map<String, JsonData> v) {
			this.$variant = v;
			this.$tag = SIMPLE;
			return ObjectBuilder.constant(this.build());
		}

		protected Input build() {
			return new Input(this);
		}

	}

	protected static void setupInputDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::chain, ChainInput.DESERIALIZER, "chain");
		op.add(Builder::http, HttpInput.DESERIALIZER, "http");
		op.add(Builder::search, SearchInput.DESERIALIZER, "search");
		op.add(Builder::simple, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "simple");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<Input> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Input::setupInputDeserializer, Builder::build);
}
