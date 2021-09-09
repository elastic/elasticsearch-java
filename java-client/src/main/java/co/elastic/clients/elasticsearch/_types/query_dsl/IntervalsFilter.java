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

package co.elastic.clients.elasticsearch._types.query_dsl;

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

public class IntervalsFilter extends TaggedUnion<IntervalsFilter.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		after("after"),

		before("before"),

		containedBy("contained_by"),

		containing("containing"),

		notContainedBy("not_contained_by"),

		notContaining("not_containing"),

		notOverlapping("not_overlapping"),

		overlapping("overlapping"),

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

	private IntervalsFilter(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code after} kind?
	 */
	public boolean isAfter() {
		return is(Tag.after);
	}

	/**
	 * Get the {@code after} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code after} kind.
	 */
	public IntervalsContainer after() {
		return get(Tag.after);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code before} kind?
	 */
	public boolean isBefore() {
		return is(Tag.before);
	}

	/**
	 * Get the {@code before} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code before} kind.
	 */
	public IntervalsContainer before() {
		return get(Tag.before);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code contained_by} kind?
	 */
	public boolean isContainedBy() {
		return is(Tag.containedBy);
	}

	/**
	 * Get the {@code contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code contained_by} kind.
	 */
	public IntervalsContainer containedBy() {
		return get(Tag.containedBy);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code containing} kind?
	 */
	public boolean isContaining() {
		return is(Tag.containing);
	}

	/**
	 * Get the {@code containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code containing} kind.
	 */
	public IntervalsContainer containing() {
		return get(Tag.containing);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code not_contained_by} kind?
	 */
	public boolean isNotContainedBy() {
		return is(Tag.notContainedBy);
	}

	/**
	 * Get the {@code not_contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_contained_by}
	 *             kind.
	 */
	public IntervalsContainer notContainedBy() {
		return get(Tag.notContainedBy);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code not_containing} kind?
	 */
	public boolean isNotContaining() {
		return is(Tag.notContaining);
	}

	/**
	 * Get the {@code not_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_containing} kind.
	 */
	public IntervalsContainer notContaining() {
		return get(Tag.notContaining);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code not_overlapping} kind?
	 */
	public boolean isNotOverlapping() {
		return is(Tag.notOverlapping);
	}

	/**
	 * Get the {@code not_overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_overlapping}
	 *             kind.
	 */
	public IntervalsContainer notOverlapping() {
		return get(Tag.notOverlapping);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code overlapping} kind?
	 */
	public boolean isOverlapping() {
		return is(Tag.overlapping);
	}

	/**
	 * Get the {@code overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code overlapping} kind.
	 */
	public IntervalsContainer overlapping() {
		return get(Tag.overlapping);
	}

	/**
	 * Is this {@link IntervalsFilter} of a {@code script} kind?
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
	public JsonValue script() {
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
				case script :
					generator.write(this.<JsonValue>get(Tag.script));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<IntervalsFilter> after(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.after;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> after(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.after(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> before(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.before;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> before(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.before(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> containedBy(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.containedBy;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> containedBy(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.containedBy(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> containing(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.containing;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> containing(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.containing(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> notContainedBy(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.notContainedBy;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> notContainedBy(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.notContainedBy(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> notContaining(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.notContaining;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> notContaining(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.notContaining(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> notOverlapping(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.notOverlapping;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> notOverlapping(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.notOverlapping(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> overlapping(IntervalsContainer v) {
			this.$variant = v;
			this.$tag = Tag.overlapping;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsFilter> overlapping(
				Function<IntervalsContainer.Builder, ObjectBuilder<IntervalsContainer>> f) {
			return this.overlapping(f.apply(new IntervalsContainer.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> script(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.script;
			return new ObjectBuilder.Constant<>(this.build());
		}

		protected IntervalsFilter build() {
			return new IntervalsFilter(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<IntervalsFilter> DESERIALIZER = JsonpDeserializer
			.lazy(IntervalsFilter::buildDeserializer);

	private static JsonpDeserializer<IntervalsFilter> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::after, IntervalsContainer.DESERIALIZER, "after");
		op.add(Builder::before, IntervalsContainer.DESERIALIZER, "before");
		op.add(Builder::containedBy, IntervalsContainer.DESERIALIZER, "contained_by");
		op.add(Builder::containing, IntervalsContainer.DESERIALIZER, "containing");
		op.add(Builder::notContainedBy, IntervalsContainer.DESERIALIZER, "not_contained_by");
		op.add(Builder::notContaining, IntervalsContainer.DESERIALIZER, "not_containing");
		op.add(Builder::notOverlapping, IntervalsContainer.DESERIALIZER, "not_overlapping");
		op.add(Builder::overlapping, IntervalsContainer.DESERIALIZER, "overlapping");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
