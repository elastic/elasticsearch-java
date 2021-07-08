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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class TransformContainer extends TaggedUnion<TransformContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		chain("chain"),

		script("script"),

		search("search"),

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

	private TransformContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link TransformContainer} of a {@code chain} kind?
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
	public ChainTransform chain() {
		return get(Tag.chain);
	}

	/**
	 * Is this {@link TransformContainer} of a {@code script} kind?
	 */
	public boolean isScript() {
		return is(Tag.script);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptTransform script() {
		return get(Tag.script);
	}

	/**
	 * Is this {@link TransformContainer} of a {@code search} kind?
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
	public SearchTransform search() {
		return get(Tag.search);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<TransformContainer> chain(ChainTransform v) {
			this.$variant = v;
			this.$tag = Tag.chain;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<TransformContainer> chain(
				Function<ChainTransform.Builder, ObjectBuilder<ChainTransform>> f) {
			return this.chain(f.apply(new ChainTransform.Builder()).build());
		}

		public ObjectBuilder<TransformContainer> script(ScriptTransform v) {
			this.$variant = v;
			this.$tag = Tag.script;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<TransformContainer> script(
				Function<ScriptTransform.Builder, ObjectBuilder<ScriptTransform>> f) {
			return this.script(f.apply(new ScriptTransform.Builder()).build());
		}

		public ObjectBuilder<TransformContainer> search(SearchTransform v) {
			this.$variant = v;
			this.$tag = Tag.search;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<TransformContainer> search(
				Function<SearchTransform.Builder, ObjectBuilder<SearchTransform>> f) {
			return this.search(f.apply(new SearchTransform.Builder()).build());
		}

		protected TransformContainer build() {
			return new TransformContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<TransformContainer> DESERIALIZER = JsonpDeserializer
			.lazy(TransformContainer::buildDeserializer);

	private static JsonpDeserializer<TransformContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::chain, ChainTransform.DESERIALIZER, "chain");
		op.add(Builder::script, ScriptTransform.DESERIALIZER, "script");
		op.add(Builder::search, SearchTransform.DESERIALIZER, "search");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
