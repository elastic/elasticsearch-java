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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsContainer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Intervals implements TaggedUnion<Intervals.Kind, Object>, IntervalsFilterVariant, JsonpSerializable {

	/**
	 * {@link Intervals} variant kinds.
	 */
	/**
	 * {@link Intervals} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		AllOf("all_of"),

		AnyOf("any_of"),

		Fuzzy("fuzzy"),

		Match("match"),

		Prefix("prefix"),

		Wildcard("wildcard"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	/**
	 * IntervalsFilter variant kind.
	 */
	@Override
	public IntervalsFilter.Kind _intervalsFilterKind() {
		return IntervalsFilter.Kind.Overlapping;
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

	public Intervals(IntervalsVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._intervalsKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Intervals(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Intervals of(Function<Builder, ObjectBuilder<Intervals>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code all_of}?
	 */
	public boolean isAllOf() {
		return _kind == Kind.AllOf;
	}

	/**
	 * Get the {@code all_of} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code all_of} kind.
	 */
	public IntervalsAllOf allOf() {
		return TaggedUnionUtils.get(this, Kind.AllOf);
	}

	/**
	 * Is this variant instance of kind {@code any_of}?
	 */
	public boolean isAnyOf() {
		return _kind == Kind.AnyOf;
	}

	/**
	 * Get the {@code any_of} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code any_of} kind.
	 */
	public IntervalsAnyOf anyOf() {
		return TaggedUnionUtils.get(this, Kind.AnyOf);
	}

	/**
	 * Is this variant instance of kind {@code fuzzy}?
	 */
	public boolean isFuzzy() {
		return _kind == Kind.Fuzzy;
	}

	/**
	 * Get the {@code fuzzy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fuzzy} kind.
	 */
	public IntervalsFuzzy fuzzy() {
		return TaggedUnionUtils.get(this, Kind.Fuzzy);
	}

	/**
	 * Is this variant instance of kind {@code match}?
	 */
	public boolean isMatch() {
		return _kind == Kind.Match;
	}

	/**
	 * Get the {@code match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match} kind.
	 */
	public IntervalsMatch match() {
		return TaggedUnionUtils.get(this, Kind.Match);
	}

	/**
	 * Is this variant instance of kind {@code prefix}?
	 */
	public boolean isPrefix() {
		return _kind == Kind.Prefix;
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public IntervalsPrefix prefix() {
		return TaggedUnionUtils.get(this, Kind.Prefix);
	}

	/**
	 * Is this variant instance of kind {@code wildcard}?
	 */
	public boolean isWildcard() {
		return _kind == Kind.Wildcard;
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public IntervalsWildcard wildcard() {
		return TaggedUnionUtils.get(this, Kind.Wildcard);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Intervals> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Intervals> allOf(IntervalsAllOf v) {
			this._kind = Kind.AllOf;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Intervals> allOf(Function<IntervalsAllOf.Builder, ObjectBuilder<IntervalsAllOf>> fn) {
			return this.allOf(fn.apply(new IntervalsAllOf.Builder()).build());
		}

		public ObjectBuilder<Intervals> anyOf(IntervalsAnyOf v) {
			this._kind = Kind.AnyOf;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Intervals> anyOf(Function<IntervalsAnyOf.Builder, ObjectBuilder<IntervalsAnyOf>> fn) {
			return this.anyOf(fn.apply(new IntervalsAnyOf.Builder()).build());
		}

		public ObjectBuilder<Intervals> fuzzy(IntervalsFuzzy v) {
			this._kind = Kind.Fuzzy;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Intervals> fuzzy(Function<IntervalsFuzzy.Builder, ObjectBuilder<IntervalsFuzzy>> fn) {
			return this.fuzzy(fn.apply(new IntervalsFuzzy.Builder()).build());
		}

		public ObjectBuilder<Intervals> match(IntervalsMatch v) {
			this._kind = Kind.Match;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Intervals> match(Function<IntervalsMatch.Builder, ObjectBuilder<IntervalsMatch>> fn) {
			return this.match(fn.apply(new IntervalsMatch.Builder()).build());
		}

		public ObjectBuilder<Intervals> prefix(IntervalsPrefix v) {
			this._kind = Kind.Prefix;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Intervals> prefix(Function<IntervalsPrefix.Builder, ObjectBuilder<IntervalsPrefix>> fn) {
			return this.prefix(fn.apply(new IntervalsPrefix.Builder()).build());
		}

		public ObjectBuilder<Intervals> wildcard(IntervalsWildcard v) {
			this._kind = Kind.Wildcard;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Intervals> wildcard(
				Function<IntervalsWildcard.Builder, ObjectBuilder<IntervalsWildcard>> fn) {
			return this.wildcard(fn.apply(new IntervalsWildcard.Builder()).build());
		}

		public Intervals build() {
			_checkSingleUse();
			return new Intervals(this);
		}

	}

	protected static void setupIntervalsDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::allOf, IntervalsAllOf._DESERIALIZER, "all_of");
		op.add(Builder::anyOf, IntervalsAnyOf._DESERIALIZER, "any_of");
		op.add(Builder::fuzzy, IntervalsFuzzy._DESERIALIZER, "fuzzy");
		op.add(Builder::match, IntervalsMatch._DESERIALIZER, "match");
		op.add(Builder::prefix, IntervalsPrefix._DESERIALIZER, "prefix");
		op.add(Builder::wildcard, IntervalsWildcard._DESERIALIZER, "wildcard");

	}

	public static final JsonpDeserializer<Intervals> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Intervals::setupIntervalsDeserializer, Builder::build);
}
