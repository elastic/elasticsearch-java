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
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanQuery
@JsonpDeserializable
public class SpanQuery implements TaggedUnion<Object>, JsonpSerializable {

	public static final String SPAN_CONTAINING = "span_containing";
	public static final String FIELD_MASKING_SPAN = "field_masking_span";
	public static final String SPAN_FIRST = "span_first";
	public static final String SPAN_GAP = "span_gap";
	public static final String SPAN_MULTI = "span_multi";
	public static final String SPAN_NEAR = "span_near";
	public static final String SPAN_NOT = "span_not";
	public static final String SPAN_OR = "span_or";
	public static final String SPAN_TERM = "span_term";
	public static final String SPAN_WITHIN = "span_within";

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

	public SpanQuery(SpanQueryVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private SpanQuery(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	/**
	 * Get the {@code span_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_containing}
	 *             kind.
	 */
	public SpanContainingQuery spanContaining() {
		return TaggedUnionUtils.get(this, SPAN_CONTAINING);
	}

	/**
	 * Get the {@code field_masking_span} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_masking_span}
	 *             kind.
	 */
	public SpanFieldMaskingQuery fieldMaskingSpan() {
		return TaggedUnionUtils.get(this, FIELD_MASKING_SPAN);
	}

	/**
	 * Get the {@code span_first} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_first} kind.
	 */
	public SpanFirstQuery spanFirst() {
		return TaggedUnionUtils.get(this, SPAN_FIRST);
	}

	/**
	 * Get the {@code span_gap} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_gap} kind.
	 */
	public SpanGapQuery spanGap() {
		return TaggedUnionUtils.get(this, SPAN_GAP);
	}

	/**
	 * Get the {@code span_multi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_multi} kind.
	 */
	public SpanMultiTermQuery spanMulti() {
		return TaggedUnionUtils.get(this, SPAN_MULTI);
	}

	/**
	 * Get the {@code span_near} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_near} kind.
	 */
	public SpanNearQuery spanNear() {
		return TaggedUnionUtils.get(this, SPAN_NEAR);
	}

	/**
	 * Get the {@code span_not} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_not} kind.
	 */
	public SpanNotQuery spanNot() {
		return TaggedUnionUtils.get(this, SPAN_NOT);
	}

	/**
	 * Get the {@code span_or} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_or} kind.
	 */
	public SpanOrQuery spanOr() {
		return TaggedUnionUtils.get(this, SPAN_OR);
	}

	/**
	 * Get the {@code span_term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_term} kind.
	 */
	public SpanTermQuery spanTerm() {
		return TaggedUnionUtils.get(this, SPAN_TERM);
	}

	/**
	 * Get the {@code span_within} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_within} kind.
	 */
	public SpanWithinQuery spanWithin() {
		return TaggedUnionUtils.get(this, SPAN_WITHIN);
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

	public static class Builder {
		private String _type;
		private Object _value;

		public ObjectBuilder<SpanQuery> spanContaining(SpanContainingQuery v) {
			this._type = SPAN_CONTAINING;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanContaining(
				Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> f) {
			return this.spanContaining(f.apply(new SpanContainingQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> fieldMaskingSpan(SpanFieldMaskingQuery v) {
			this._type = FIELD_MASKING_SPAN;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> fieldMaskingSpan(
				Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> f) {
			return this.fieldMaskingSpan(f.apply(new SpanFieldMaskingQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanFirst(SpanFirstQuery v) {
			this._type = SPAN_FIRST;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanFirst(Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> f) {
			return this.spanFirst(f.apply(new SpanFirstQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanGap(SpanGapQuery v) {
			this._type = SPAN_GAP;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanGap(Function<SpanGapQuery.Builder, ObjectBuilder<SpanGapQuery>> f) {
			return this.spanGap(f.apply(new SpanGapQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanMulti(SpanMultiTermQuery v) {
			this._type = SPAN_MULTI;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanMulti(
				Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> f) {
			return this.spanMulti(f.apply(new SpanMultiTermQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanNear(SpanNearQuery v) {
			this._type = SPAN_NEAR;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> f) {
			return this.spanNear(f.apply(new SpanNearQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanNot(SpanNotQuery v) {
			this._type = SPAN_NOT;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> f) {
			return this.spanNot(f.apply(new SpanNotQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanOr(SpanOrQuery v) {
			this._type = SPAN_OR;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> f) {
			return this.spanOr(f.apply(new SpanOrQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanTerm(SpanTermQuery v) {
			this._type = SPAN_TERM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanTerm(Function<SpanTermQuery.Builder, ObjectBuilder<SpanTermQuery>> f) {
			return this.spanTerm(f.apply(new SpanTermQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanWithin(SpanWithinQuery v) {
			this._type = SPAN_WITHIN;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<SpanQuery> spanWithin(
				Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> f) {
			return this.spanWithin(f.apply(new SpanWithinQuery.Builder()).build());
		}

		protected SpanQuery build() {
			return new SpanQuery(this);
		}

	}

	protected static void setupSpanQueryDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::spanContaining, SpanContainingQuery._DESERIALIZER, "span_containing");
		op.add(Builder::fieldMaskingSpan, SpanFieldMaskingQuery._DESERIALIZER, "field_masking_span");
		op.add(Builder::spanFirst, SpanFirstQuery._DESERIALIZER, "span_first");
		op.add(Builder::spanGap, SpanGapQuery._DESERIALIZER, "span_gap");
		op.add(Builder::spanMulti, SpanMultiTermQuery._DESERIALIZER, "span_multi");
		op.add(Builder::spanNear, SpanNearQuery._DESERIALIZER, "span_near");
		op.add(Builder::spanNot, SpanNotQuery._DESERIALIZER, "span_not");
		op.add(Builder::spanOr, SpanOrQuery._DESERIALIZER, "span_or");
		op.add(Builder::spanTerm, SpanTermQuery._DESERIALIZER, "span_term");
		op.add(Builder::spanWithin, SpanWithinQuery._DESERIALIZER, "span_within");

	}

	public static final JsonpDeserializer<SpanQuery> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			SpanQuery::setupSpanQueryDeserializer, Builder::build);
}
