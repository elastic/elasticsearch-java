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
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class IntervalsQuery extends TaggedUnion<IntervalsQuery.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		allOf("all_of"),

		anyOf("any_of"),

		fuzzy("fuzzy"),

		match("match"),

		prefix("prefix"),

		wildcard("wildcard"),

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

	private IntervalsQuery(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link IntervalsQuery} of a {@code all_of} kind?
	 */
	public boolean isAllOf() {
		return is(Tag.allOf);
	}

	/**
	 * Get the {@code all_of} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code all_of} kind.
	 */
	public IntervalsAllOf allOf() {
		return get(Tag.allOf);
	}

	/**
	 * Is this {@link IntervalsQuery} of a {@code any_of} kind?
	 */
	public boolean isAnyOf() {
		return is(Tag.anyOf);
	}

	/**
	 * Get the {@code any_of} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code any_of} kind.
	 */
	public IntervalsAnyOf anyOf() {
		return get(Tag.anyOf);
	}

	/**
	 * Is this {@link IntervalsQuery} of a {@code fuzzy} kind?
	 */
	public boolean isFuzzy() {
		return is(Tag.fuzzy);
	}

	/**
	 * Get the {@code fuzzy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fuzzy} kind.
	 */
	public IntervalsFuzzy fuzzy() {
		return get(Tag.fuzzy);
	}

	/**
	 * Is this {@link IntervalsQuery} of a {@code match} kind?
	 */
	public boolean isMatch() {
		return is(Tag.match);
	}

	/**
	 * Get the {@code match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match} kind.
	 */
	public IntervalsMatch match() {
		return get(Tag.match);
	}

	/**
	 * Is this {@link IntervalsQuery} of a {@code prefix} kind?
	 */
	public boolean isPrefix() {
		return is(Tag.prefix);
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public IntervalsPrefix prefix() {
		return get(Tag.prefix);
	}

	/**
	 * Is this {@link IntervalsQuery} of a {@code wildcard} kind?
	 */
	public boolean isWildcard() {
		return is(Tag.wildcard);
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public IntervalsWildcard wildcard() {
		return get(Tag.wildcard);
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

		public ObjectBuilder<IntervalsQuery> allOf(IntervalsAllOf v) {
			this.$variant = v;
			this.$tag = Tag.allOf;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsQuery> allOf(Function<IntervalsAllOf.Builder, ObjectBuilder<IntervalsAllOf>> f) {
			return this.allOf(f.apply(new IntervalsAllOf.Builder()).build());
		}

		public ObjectBuilder<IntervalsQuery> anyOf(IntervalsAnyOf v) {
			this.$variant = v;
			this.$tag = Tag.anyOf;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsQuery> anyOf(Function<IntervalsAnyOf.Builder, ObjectBuilder<IntervalsAnyOf>> f) {
			return this.anyOf(f.apply(new IntervalsAnyOf.Builder()).build());
		}

		public ObjectBuilder<IntervalsQuery> fuzzy(IntervalsFuzzy v) {
			this.$variant = v;
			this.$tag = Tag.fuzzy;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsQuery> fuzzy(Function<IntervalsFuzzy.Builder, ObjectBuilder<IntervalsFuzzy>> f) {
			return this.fuzzy(f.apply(new IntervalsFuzzy.Builder()).build());
		}

		public ObjectBuilder<IntervalsQuery> match(IntervalsMatch v) {
			this.$variant = v;
			this.$tag = Tag.match;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsQuery> match(Function<IntervalsMatch.Builder, ObjectBuilder<IntervalsMatch>> f) {
			return this.match(f.apply(new IntervalsMatch.Builder()).build());
		}

		public ObjectBuilder<IntervalsQuery> prefix(IntervalsPrefix v) {
			this.$variant = v;
			this.$tag = Tag.prefix;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsQuery> prefix(
				Function<IntervalsPrefix.Builder, ObjectBuilder<IntervalsPrefix>> f) {
			return this.prefix(f.apply(new IntervalsPrefix.Builder()).build());
		}

		public ObjectBuilder<IntervalsQuery> wildcard(IntervalsWildcard v) {
			this.$variant = v;
			this.$tag = Tag.wildcard;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<IntervalsQuery> wildcard(
				Function<IntervalsWildcard.Builder, ObjectBuilder<IntervalsWildcard>> f) {
			return this.wildcard(f.apply(new IntervalsWildcard.Builder()).build());
		}

		protected IntervalsQuery build() {
			return new IntervalsQuery(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<IntervalsQuery> DESERIALIZER = JsonpDeserializer
			.lazy(IntervalsQuery::buildDeserializer);

	private static JsonpDeserializer<IntervalsQuery> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::allOf, IntervalsAllOf.DESERIALIZER, "all_of");
		op.add(Builder::anyOf, IntervalsAnyOf.DESERIALIZER, "any_of");
		op.add(Builder::fuzzy, IntervalsFuzzy.DESERIALIZER, "fuzzy");
		op.add(Builder::match, IntervalsMatch.DESERIALIZER, "match");
		op.add(Builder::prefix, IntervalsPrefix.DESERIALIZER, "prefix");
		op.add(Builder::wildcard, IntervalsWildcard.DESERIALIZER, "wildcard");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
