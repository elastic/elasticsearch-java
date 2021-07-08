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
import java.util.function.Function;
import javax.annotation.Nullable;

public class ConditionContainer extends TaggedUnion<ConditionContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		always("always"),

		arrayCompare("array_compare"),

		compare("compare"),

		never("never"),

		script("script"),

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

	private ConditionContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link ConditionContainer} of a {@code always} kind?
	 */
	public boolean isAlways() {
		return is(Tag.always);
	}

	/**
	 * Get the {@code always} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code always} kind.
	 */
	public JsonValue always() {
		return get(Tag.always);
	}

	/**
	 * Is this {@link ConditionContainer} of a {@code array_compare} kind?
	 */
	public boolean isArrayCompare() {
		return is(Tag.arrayCompare);
	}

	/**
	 * Get the {@code array_compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code array_compare} kind.
	 */
	public ArrayCompareCondition arrayCompare() {
		return get(Tag.arrayCompare);
	}

	/**
	 * Is this {@link ConditionContainer} of a {@code compare} kind?
	 */
	public boolean isCompare() {
		return is(Tag.compare);
	}

	/**
	 * Get the {@code compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code compare} kind.
	 */
	public CompareCondition compare() {
		return get(Tag.compare);
	}

	/**
	 * Is this {@link ConditionContainer} of a {@code never} kind?
	 */
	public boolean isNever() {
		return is(Tag.never);
	}

	/**
	 * Get the {@code never} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code never} kind.
	 */
	public JsonValue never() {
		return get(Tag.never);
	}

	/**
	 * Is this {@link ConditionContainer} of a {@code script} kind?
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
	public ScriptCondition script() {
		return get(Tag.script);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case always :
					generator.write(this.<JsonValue>get(Tag.always));

					break;
				case never :
					generator.write(this.<JsonValue>get(Tag.never));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<ConditionContainer> always(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.always;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ConditionContainer> arrayCompare(ArrayCompareCondition v) {
			this.$variant = v;
			this.$tag = Tag.arrayCompare;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ConditionContainer> arrayCompare(
				Function<ArrayCompareCondition.Builder, ObjectBuilder<ArrayCompareCondition>> f) {
			return this.arrayCompare(f.apply(new ArrayCompareCondition.Builder()).build());
		}

		public ObjectBuilder<ConditionContainer> compare(CompareCondition v) {
			this.$variant = v;
			this.$tag = Tag.compare;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ConditionContainer> compare(
				Function<CompareCondition.Builder, ObjectBuilder<CompareCondition>> f) {
			return this.compare(f.apply(new CompareCondition.Builder()).build());
		}

		public ObjectBuilder<ConditionContainer> never(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.never;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ConditionContainer> script(ScriptCondition v) {
			this.$variant = v;
			this.$tag = Tag.script;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ConditionContainer> script(
				Function<ScriptCondition.Builder, ObjectBuilder<ScriptCondition>> f) {
			return this.script(f.apply(new ScriptCondition.Builder()).build());
		}

		protected ConditionContainer build() {
			return new ConditionContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<ConditionContainer> DESERIALIZER = JsonpDeserializer
			.lazy(ConditionContainer::buildDeserializer);

	private static JsonpDeserializer<ConditionContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::always, JsonpDeserializer.jsonValueDeserializer(), "always");
		op.add(Builder::arrayCompare, ArrayCompareCondition.DESERIALIZER, "array_compare");
		op.add(Builder::compare, CompareCondition.DESERIALIZER, "compare");
		op.add(Builder::never, JsonpDeserializer.jsonValueDeserializer(), "never");
		op.add(Builder::script, ScriptCondition.DESERIALIZER, "script");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
