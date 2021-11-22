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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsQuery
// union type: Container[]
@JsonpDeserializable
public class IntervalsQuery extends QueryBase
		implements
			TaggedUnion<IntervalsQuery.Kind, Object>,
			QueryVariant,
			JsonpSerializable {

	/**
	 * {@link IntervalsQuery} variant kinds.
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
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Intervals;
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

	// Single key dictionary
	private final String field;

	private IntervalsQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static IntervalsQuery of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
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
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

		generator.writeEnd();

	}

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<IntervalsQuery> {
		private Kind _kind;
		private Object _value;

		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public Builder allOf(IntervalsAllOf v) {
			this._kind = Kind.AllOf;
			this._value = v;
			return this;
		}

		public Builder allOf(Consumer<IntervalsAllOf.Builder> fn) {
			IntervalsAllOf.Builder builder = new IntervalsAllOf.Builder();
			fn.accept(builder);
			return this.allOf(builder.build());
		}

		public Builder anyOf(IntervalsAnyOf v) {
			this._kind = Kind.AnyOf;
			this._value = v;
			return this;
		}

		public Builder anyOf(Consumer<IntervalsAnyOf.Builder> fn) {
			IntervalsAnyOf.Builder builder = new IntervalsAnyOf.Builder();
			fn.accept(builder);
			return this.anyOf(builder.build());
		}

		public Builder fuzzy(IntervalsFuzzy v) {
			this._kind = Kind.Fuzzy;
			this._value = v;
			return this;
		}

		public Builder fuzzy(Consumer<IntervalsFuzzy.Builder> fn) {
			IntervalsFuzzy.Builder builder = new IntervalsFuzzy.Builder();
			fn.accept(builder);
			return this.fuzzy(builder.build());
		}

		public Builder match(IntervalsMatch v) {
			this._kind = Kind.Match;
			this._value = v;
			return this;
		}

		public Builder match(Consumer<IntervalsMatch.Builder> fn) {
			IntervalsMatch.Builder builder = new IntervalsMatch.Builder();
			fn.accept(builder);
			return this.match(builder.build());
		}

		public Builder prefix(IntervalsPrefix v) {
			this._kind = Kind.Prefix;
			this._value = v;
			return this;
		}

		public Builder prefix(Consumer<IntervalsPrefix.Builder> fn) {
			IntervalsPrefix.Builder builder = new IntervalsPrefix.Builder();
			fn.accept(builder);
			return this.prefix(builder.build());
		}

		public Builder wildcard(IntervalsWildcard v) {
			this._kind = Kind.Wildcard;
			this._value = v;
			return this;
		}

		public Builder wildcard(Consumer<IntervalsWildcard.Builder> fn) {
			IntervalsWildcard.Builder builder = new IntervalsWildcard.Builder();
			fn.accept(builder);
			return this.wildcard(builder.build());
		}

		public IntervalsQuery build() {
			_checkSingleUse();
			return new IntervalsQuery(this);
		}

	}

	protected static void setupIntervalsQueryDeserializer(ObjectDeserializer<Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::allOf, IntervalsAllOf._DESERIALIZER, "all_of");
		op.add(Builder::anyOf, IntervalsAnyOf._DESERIALIZER, "any_of");
		op.add(Builder::fuzzy, IntervalsFuzzy._DESERIALIZER, "fuzzy");
		op.add(Builder::match, IntervalsMatch._DESERIALIZER, "match");
		op.add(Builder::prefix, IntervalsPrefix._DESERIALIZER, "prefix");
		op.add(Builder::wildcard, IntervalsWildcard._DESERIALIZER, "wildcard");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

	public static final JsonpDeserializer<IntervalsQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsQuery::setupIntervalsQueryDeserializer, Builder::build);
}
