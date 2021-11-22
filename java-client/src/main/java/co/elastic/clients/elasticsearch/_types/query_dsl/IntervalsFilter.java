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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonEnum;
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
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsFilter
// union type: Container[]
@JsonpDeserializable
public class IntervalsFilter implements TaggedUnion<IntervalsFilter.Kind, Object>, JsonpSerializable {

	/**
	 * {@link IntervalsFilter} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		After("after"),

		Before("before"),

		ContainedBy("contained_by"),

		Containing("containing"),

		NotContainedBy("not_contained_by"),

		NotContaining("not_containing"),

		NotOverlapping("not_overlapping"),

		Overlapping("overlapping"),

		Script("script"),

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

	public IntervalsFilter(IntervalsFilterVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._intervalsFilterKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private IntervalsFilter(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static IntervalsFilter of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code after}?
	 */
	public boolean isAfter() {
		return _kind == Kind.After;
	}

	/**
	 * Get the {@code after} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code after} kind.
	 */
	public Intervals after() {
		return TaggedUnionUtils.get(this, Kind.After);
	}

	/**
	 * Is this variant instance of kind {@code before}?
	 */
	public boolean isBefore() {
		return _kind == Kind.Before;
	}

	/**
	 * Get the {@code before} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code before} kind.
	 */
	public Intervals before() {
		return TaggedUnionUtils.get(this, Kind.Before);
	}

	/**
	 * Is this variant instance of kind {@code contained_by}?
	 */
	public boolean isContainedBy() {
		return _kind == Kind.ContainedBy;
	}

	/**
	 * Get the {@code contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code contained_by} kind.
	 */
	public Intervals containedBy() {
		return TaggedUnionUtils.get(this, Kind.ContainedBy);
	}

	/**
	 * Is this variant instance of kind {@code containing}?
	 */
	public boolean isContaining() {
		return _kind == Kind.Containing;
	}

	/**
	 * Get the {@code containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code containing} kind.
	 */
	public Intervals containing() {
		return TaggedUnionUtils.get(this, Kind.Containing);
	}

	/**
	 * Is this variant instance of kind {@code not_contained_by}?
	 */
	public boolean isNotContainedBy() {
		return _kind == Kind.NotContainedBy;
	}

	/**
	 * Get the {@code not_contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_contained_by}
	 *             kind.
	 */
	public Intervals notContainedBy() {
		return TaggedUnionUtils.get(this, Kind.NotContainedBy);
	}

	/**
	 * Is this variant instance of kind {@code not_containing}?
	 */
	public boolean isNotContaining() {
		return _kind == Kind.NotContaining;
	}

	/**
	 * Get the {@code not_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_containing} kind.
	 */
	public Intervals notContaining() {
		return TaggedUnionUtils.get(this, Kind.NotContaining);
	}

	/**
	 * Is this variant instance of kind {@code not_overlapping}?
	 */
	public boolean isNotOverlapping() {
		return _kind == Kind.NotOverlapping;
	}

	/**
	 * Get the {@code not_overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_overlapping}
	 *             kind.
	 */
	public Intervals notOverlapping() {
		return TaggedUnionUtils.get(this, Kind.NotOverlapping);
	}

	/**
	 * Is this variant instance of kind {@code overlapping}?
	 */
	public boolean isOverlapping() {
		return _kind == Kind.Overlapping;
	}

	/**
	 * Get the {@code overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code overlapping} kind.
	 */
	public Intervals overlapping() {
		return TaggedUnionUtils.get(this, Kind.Overlapping);
	}

	/**
	 * Is this variant instance of kind {@code script}?
	 */
	public boolean isScript() {
		return _kind == Kind.Script;
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public Script script() {
		return TaggedUnionUtils.get(this, Kind.Script);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IntervalsFilter> {
		private Kind _kind;
		private Object _value;

		public Builder after(Intervals v) {
			this._kind = Kind.After;
			this._value = v;
			return this;
		}

		public Builder after(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.after(builder.build());
		}

		public Builder before(Intervals v) {
			this._kind = Kind.Before;
			this._value = v;
			return this;
		}

		public Builder before(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.before(builder.build());
		}

		public Builder containedBy(Intervals v) {
			this._kind = Kind.ContainedBy;
			this._value = v;
			return this;
		}

		public Builder containedBy(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.containedBy(builder.build());
		}

		public Builder containing(Intervals v) {
			this._kind = Kind.Containing;
			this._value = v;
			return this;
		}

		public Builder containing(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.containing(builder.build());
		}

		public Builder notContainedBy(Intervals v) {
			this._kind = Kind.NotContainedBy;
			this._value = v;
			return this;
		}

		public Builder notContainedBy(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.notContainedBy(builder.build());
		}

		public Builder notContaining(Intervals v) {
			this._kind = Kind.NotContaining;
			this._value = v;
			return this;
		}

		public Builder notContaining(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.notContaining(builder.build());
		}

		public Builder notOverlapping(Intervals v) {
			this._kind = Kind.NotOverlapping;
			this._value = v;
			return this;
		}

		public Builder notOverlapping(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.notOverlapping(builder.build());
		}

		public Builder overlapping(Intervals v) {
			this._kind = Kind.Overlapping;
			this._value = v;
			return this;
		}

		public Builder overlapping(Consumer<Intervals.Builder> fn) {
			Intervals.Builder builder = new Intervals.Builder();
			fn.accept(builder);
			return this.overlapping(builder.build());
		}

		public Builder script(Script v) {
			this._kind = Kind.Script;
			this._value = v;
			return this;
		}

		public Builder script(Consumer<Script.Builder> fn) {
			Script.Builder builder = new Script.Builder();
			fn.accept(builder);
			return this.script(builder.build());
		}

		public IntervalsFilter build() {
			_checkSingleUse();
			return new IntervalsFilter(this);
		}

	}

	protected static void setupIntervalsFilterDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::after, Intervals._DESERIALIZER, "after");
		op.add(Builder::before, Intervals._DESERIALIZER, "before");
		op.add(Builder::containedBy, Intervals._DESERIALIZER, "contained_by");
		op.add(Builder::containing, Intervals._DESERIALIZER, "containing");
		op.add(Builder::notContainedBy, Intervals._DESERIALIZER, "not_contained_by");
		op.add(Builder::notContaining, Intervals._DESERIALIZER, "not_containing");
		op.add(Builder::notOverlapping, Intervals._DESERIALIZER, "not_overlapping");
		op.add(Builder::overlapping, Intervals._DESERIALIZER, "overlapping");
		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

	public static final JsonpDeserializer<IntervalsFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsFilter::setupIntervalsFilterDeserializer, Builder::build);
}
