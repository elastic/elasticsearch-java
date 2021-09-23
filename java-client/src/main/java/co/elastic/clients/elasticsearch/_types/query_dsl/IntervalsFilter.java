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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsFilter
public class IntervalsFilter extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String AFTER = "after";
	public static final String BEFORE = "before";
	public static final String CONTAINED_BY = "contained_by";
	public static final String CONTAINING = "containing";
	public static final String NOT_CONTAINED_BY = "not_contained_by";
	public static final String NOT_CONTAINING = "not_containing";
	public static final String NOT_OVERLAPPING = "not_overlapping";
	public static final String OVERLAPPING = "overlapping";
	public static final String SCRIPT = "script";

	private IntervalsFilter(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code after} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code after} kind.
	 */
	public Intervals after() {
		return _get(AFTER);
	}

	/**
	 * Get the {@code before} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code before} kind.
	 */
	public Intervals before() {
		return _get(BEFORE);
	}

	/**
	 * Get the {@code contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code contained_by} kind.
	 */
	public Intervals containedBy() {
		return _get(CONTAINED_BY);
	}

	/**
	 * Get the {@code containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code containing} kind.
	 */
	public Intervals containing() {
		return _get(CONTAINING);
	}

	/**
	 * Get the {@code not_contained_by} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_contained_by}
	 *             kind.
	 */
	public Intervals notContainedBy() {
		return _get(NOT_CONTAINED_BY);
	}

	/**
	 * Get the {@code not_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_containing} kind.
	 */
	public Intervals notContaining() {
		return _get(NOT_CONTAINING);
	}

	/**
	 * Get the {@code not_overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code not_overlapping}
	 *             kind.
	 */
	public Intervals notOverlapping() {
		return _get(NOT_OVERLAPPING);
	}

	/**
	 * Get the {@code overlapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code overlapping} kind.
	 */
	public Intervals overlapping() {
		return _get(OVERLAPPING);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public JsonValue script() {
		return _get(SCRIPT);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case SCRIPT :
					generator.write(this.<JsonValue>_get(SCRIPT));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<IntervalsFilter> after(Intervals v) {
			this.$variant = v;
			this.$tag = AFTER;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> after(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.after(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> before(Intervals v) {
			this.$variant = v;
			this.$tag = BEFORE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> before(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.before(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> containedBy(Intervals v) {
			this.$variant = v;
			this.$tag = CONTAINED_BY;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> containedBy(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.containedBy(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> containing(Intervals v) {
			this.$variant = v;
			this.$tag = CONTAINING;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> containing(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.containing(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> notContainedBy(Intervals v) {
			this.$variant = v;
			this.$tag = NOT_CONTAINED_BY;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> notContainedBy(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.notContainedBy(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> notContaining(Intervals v) {
			this.$variant = v;
			this.$tag = NOT_CONTAINING;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> notContaining(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.notContaining(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> notOverlapping(Intervals v) {
			this.$variant = v;
			this.$tag = NOT_OVERLAPPING;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> notOverlapping(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.notOverlapping(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> overlapping(Intervals v) {
			this.$variant = v;
			this.$tag = OVERLAPPING;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<IntervalsFilter> overlapping(Function<Intervals.Builder, ObjectBuilder<Intervals>> f) {
			return this.overlapping(f.apply(new Intervals.Builder()).build());
		}

		public ObjectBuilder<IntervalsFilter> script(JsonValue v) {
			this.$variant = v;
			this.$tag = SCRIPT;
			return ObjectBuilder.constant(this.build());
		}

		protected IntervalsFilter build() {
			return new IntervalsFilter(this);
		}

	}

	protected static void setupIntervalsFilterDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::after, Intervals.DESERIALIZER, "after");
		op.add(Builder::before, Intervals.DESERIALIZER, "before");
		op.add(Builder::containedBy, Intervals.DESERIALIZER, "contained_by");
		op.add(Builder::containing, Intervals.DESERIALIZER, "containing");
		op.add(Builder::notContainedBy, Intervals.DESERIALIZER, "not_contained_by");
		op.add(Builder::notContaining, Intervals.DESERIALIZER, "not_containing");
		op.add(Builder::notOverlapping, Intervals.DESERIALIZER, "not_overlapping");
		op.add(Builder::overlapping, Intervals.DESERIALIZER, "overlapping");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<IntervalsFilter> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			IntervalsFilter::setupIntervalsFilterDeserializer, Builder::build);
}
