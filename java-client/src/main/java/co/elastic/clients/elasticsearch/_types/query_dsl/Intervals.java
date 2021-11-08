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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsContainer
@JsonpDeserializable
public class Intervals implements TaggedUnion<Object>, JsonpSerializable {

	public static final String ALL_OF = "all_of";
	public static final String ANY_OF = "any_of";
	public static final String FUZZY = "fuzzy";
	public static final String MATCH = "match";
	public static final String PREFIX = "prefix";
	public static final String WILDCARD = "wildcard";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public Intervals(IntervalsVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Intervals(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Intervals of(Function<Builder, ObjectBuilder<Intervals>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code all_of} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code all_of} kind.
	 */
	public IntervalsAllOf allOf() {
		return TaggedUnionUtils.get(this, ALL_OF);
	}

	/**
	 * Get the {@code any_of} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code any_of} kind.
	 */
	public IntervalsAnyOf anyOf() {
		return TaggedUnionUtils.get(this, ANY_OF);
	}

	/**
	 * Get the {@code fuzzy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fuzzy} kind.
	 */
	public IntervalsFuzzy fuzzy() {
		return TaggedUnionUtils.get(this, FUZZY);
	}

	/**
	 * Get the {@code match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match} kind.
	 */
	public IntervalsMatch match() {
		return TaggedUnionUtils.get(this, MATCH);
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public IntervalsPrefix prefix() {
		return TaggedUnionUtils.get(this, PREFIX);
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public IntervalsWildcard wildcard() {
		return TaggedUnionUtils.get(this, WILDCARD);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Intervals> {
		private String _type;
		private Object _value;

		public Builder allOf(IntervalsAllOf v) {
			this._type = ALL_OF;
			this._value = v;
			return this;
		}

		public Builder allOf(Function<IntervalsAllOf.Builder, ObjectBuilder<IntervalsAllOf>> f) {
			return this.allOf(f.apply(new IntervalsAllOf.Builder()).build());
		}

		public Builder anyOf(IntervalsAnyOf v) {
			this._type = ANY_OF;
			this._value = v;
			return this;
		}

		public Builder anyOf(Function<IntervalsAnyOf.Builder, ObjectBuilder<IntervalsAnyOf>> f) {
			return this.anyOf(f.apply(new IntervalsAnyOf.Builder()).build());
		}

		public Builder fuzzy(IntervalsFuzzy v) {
			this._type = FUZZY;
			this._value = v;
			return this;
		}

		public Builder fuzzy(Function<IntervalsFuzzy.Builder, ObjectBuilder<IntervalsFuzzy>> f) {
			return this.fuzzy(f.apply(new IntervalsFuzzy.Builder()).build());
		}

		public Builder match(IntervalsMatch v) {
			this._type = MATCH;
			this._value = v;
			return this;
		}

		public Builder match(Function<IntervalsMatch.Builder, ObjectBuilder<IntervalsMatch>> f) {
			return this.match(f.apply(new IntervalsMatch.Builder()).build());
		}

		public Builder prefix(IntervalsPrefix v) {
			this._type = PREFIX;
			this._value = v;
			return this;
		}

		public Builder prefix(Function<IntervalsPrefix.Builder, ObjectBuilder<IntervalsPrefix>> f) {
			return this.prefix(f.apply(new IntervalsPrefix.Builder()).build());
		}

		public Builder wildcard(IntervalsWildcard v) {
			this._type = WILDCARD;
			this._value = v;
			return this;
		}

		public Builder wildcard(Function<IntervalsWildcard.Builder, ObjectBuilder<IntervalsWildcard>> f) {
			return this.wildcard(f.apply(new IntervalsWildcard.Builder()).build());
		}

		public Intervals build() {
			_checkSingleUse();
			return new Intervals(this);
		}

	}

	protected static void setupIntervalsDeserializer(DelegatingDeserializer<Builder> op) {

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
