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
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsFilter
@JsonpDeserializable
public class IntervalsFilter implements TaggedUnion<Object>, JsonpSerializable {

	public static final String AFTER = "after";
	public static final String BEFORE = "before";
	public static final String CONTAINED_BY = "contained_by";
	public static final String CONTAINING = "containing";
	public static final String NOT_CONTAINED_BY = "not_contained_by";
	public static final String NOT_CONTAINING = "not_containing";
	public static final String NOT_OVERLAPPING = "not_overlapping";
	public static final String OVERLAPPING = "overlapping";
	public static final String SCRIPT = "script";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public IntervalsFilter(IntervalsFilterVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private IntervalsFilter(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public IntervalsFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code after} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code after} kind.
	 */
	public Intervals after() {
		return TaggedUnionUtils.get(this, AFTER);
	}

	/**
	 * Get the {@code before} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code before} kind.
	 */
	public Intervals before() {
		return TaggedUnionUtils.get(this, BEFORE);
	}

	/**
	 * Get the {@code contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code contained_by} kind.
	 */
	public Intervals containedBy() {
		return TaggedUnionUtils.get(this, CONTAINED_BY);
	}

	/**
	 * Get the {@code containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code containing} kind.
	 */
	public Intervals containing() {
		return TaggedUnionUtils.get(this, CONTAINING);
	}

	/**
	 * Get the {@code not_contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_contained_by}
	 *             kind.
	 */
	public Intervals notContainedBy() {
		return TaggedUnionUtils.get(this, NOT_CONTAINED_BY);
	}

	/**
	 * Get the {@code not_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_containing} kind.
	 */
	public Intervals notContaining() {
		return TaggedUnionUtils.get(this, NOT_CONTAINING);
	}

	/**
	 * Get the {@code not_overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_overlapping}
	 *             kind.
	 */
	public Intervals notOverlapping() {
		return TaggedUnionUtils.get(this, NOT_OVERLAPPING);
	}

	/**
	 * Get the {@code overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code overlapping} kind.
	 */
	public Intervals overlapping() {
		return TaggedUnionUtils.get(this, OVERLAPPING);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public JsonValue /* _types.Script */ script() {
		return TaggedUnionUtils.get(this, SCRIPT);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case SCRIPT :
					generator.write(((JsonValue /* _types.Script */) this._value));

					break;
			}
		}

		generator.writeEnd();
	}

	public static class Builder implements ObjectBuilder<IntervalsFilter> {
		private String _type;
		private Object _value;

		public Builder after(Intervals v) {
			this._type = AFTER;
			this._value = v;
			return this;
		}

		public Builder after(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.after(f.apply(new Intervals.Builder()).build());
		}

		public Builder before(Intervals v) {
			this._type = BEFORE;
			this._value = v;
			return this;
		}

		public Builder before(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.before(f.apply(new Intervals.Builder()).build());
		}

		public Builder containedBy(Intervals v) {
			this._type = CONTAINED_BY;
			this._value = v;
			return this;
		}

		public Builder containedBy(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.containedBy(f.apply(new Intervals.Builder()).build());
		}

		public Builder containing(Intervals v) {
			this._type = CONTAINING;
			this._value = v;
			return this;
		}

		public Builder containing(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.containing(f.apply(new Intervals.Builder()).build());
		}

		public Builder notContainedBy(Intervals v) {
			this._type = NOT_CONTAINED_BY;
			this._value = v;
			return this;
		}

		public Builder notContainedBy(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.notContainedBy(f.apply(new Intervals.Builder()).build());
		}

		public Builder notContaining(Intervals v) {
			this._type = NOT_CONTAINING;
			this._value = v;
			return this;
		}

		public Builder notContaining(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.notContaining(f.apply(new Intervals.Builder()).build());
		}

		public Builder notOverlapping(Intervals v) {
			this._type = NOT_OVERLAPPING;
			this._value = v;
			return this;
		}

		public Builder notOverlapping(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.notOverlapping(f.apply(new Intervals.Builder()).build());
		}

		public Builder overlapping(Intervals v) {
			this._type = OVERLAPPING;
			this._value = v;
			return this;
		}

		public Builder overlapping(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.overlapping(f.apply(new Intervals.Builder()).build());
		}

		public Builder script(JsonValue /* _types.Script */ v) {
			this._type = SCRIPT;
			this._value = v;
			return this;
		}

		public IntervalsFilter build() {
			return new IntervalsFilter(this);
		}

	}

	protected static void setupIntervalsFilterDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::after, Intervals._DESERIALIZER, "after");
		op.add(Builder::before, Intervals._DESERIALIZER, "before");
		op.add(Builder::containedBy, Intervals._DESERIALIZER, "contained_by");
		op.add(Builder::containing, Intervals._DESERIALIZER, "containing");
		op.add(Builder::notContainedBy, Intervals._DESERIALIZER, "not_contained_by");
		op.add(Builder::notContaining, Intervals._DESERIALIZER, "not_containing");
		op.add(Builder::notOverlapping, Intervals._DESERIALIZER, "not_overlapping");
		op.add(Builder::overlapping, Intervals._DESERIALIZER, "overlapping");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

	}

	public static final JsonpDeserializer<IntervalsFilter> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			IntervalsFilter::setupIntervalsFilterDeserializer, Builder::build);
}
