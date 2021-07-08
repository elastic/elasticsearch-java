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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class InputContainer extends TaggedUnion<InputContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		chain("chain"),

		http("http"),

		search("search"),

		simple("simple"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private InputContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link InputContainer} of a {@code chain} kind?
	 */
	public boolean isChain() {
		return is(Tag.chain);
	}

	/**
	 * Get the {@code chain} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code chain} kind.
	 */
	public ChainInput chain() {
		return get(Tag.chain);
	}

	/**
	 * Is this {@link InputContainer} of a {@code http} kind?
	 */
	public boolean isHttp() {
		return is(Tag.http);
	}

	/**
	 * Get the {@code http} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code http} kind.
	 */
	public HttpInput http() {
		return get(Tag.http);
	}

	/**
	 * Is this {@link InputContainer} of a {@code search} kind?
	 */
	public boolean isSearch() {
		return is(Tag.search);
	}

	/**
	 * Get the {@code search} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code search} kind.
	 */
	public SearchInput search() {
		return get(Tag.search);
	}

	/**
	 * Is this {@link InputContainer} of a {@code simple} kind?
	 */
	public boolean isSimple() {
		return is(Tag.simple);
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public Map<String, JsonValue> simple() {
		return get(Tag.simple);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case simple :
					generator.writeStartObject();
					for (Map.Entry<String, JsonValue> item0 : this.<Map<String, JsonValue>>get(Tag.simple).entrySet()) {
						generator.writeKey(item0.getKey());
						generator.write(item0.getValue());

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<InputContainer> chain(ChainInput v) {
			this.$variant = v;
			this.$tag = Tag.chain;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<InputContainer> chain(Function<ChainInput.Builder, ObjectBuilder<ChainInput>> f) {
			return this.chain(f.apply(new ChainInput.Builder()).build());
		}

		public ObjectBuilder<InputContainer> http(HttpInput v) {
			this.$variant = v;
			this.$tag = Tag.http;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<InputContainer> http(Function<HttpInput.Builder, ObjectBuilder<HttpInput>> f) {
			return this.http(f.apply(new HttpInput.Builder()).build());
		}

		public ObjectBuilder<InputContainer> search(SearchInput v) {
			this.$variant = v;
			this.$tag = Tag.search;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<InputContainer> search(Function<SearchInput.Builder, ObjectBuilder<SearchInput>> f) {
			return this.search(f.apply(new SearchInput.Builder()).build());
		}

		public ObjectBuilder<InputContainer> simple(Map<String, JsonValue> v) {
			this.$variant = v;
			this.$tag = Tag.simple;
			return new ObjectBuilder.Constant<>(this.build());
		}

		protected InputContainer build() {
			return new InputContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<InputContainer> DESERIALIZER = JsonpDeserializer
			.lazy(InputContainer::buildDeserializer);

	private static JsonpDeserializer<InputContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::chain, ChainInput.DESERIALIZER, "chain");
		op.add(Builder::http, HttpInput.DESERIALIZER, "http");
		op.add(Builder::search, SearchInput.DESERIALIZER, "search");
		op.add(Builder::simple, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"simple");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
