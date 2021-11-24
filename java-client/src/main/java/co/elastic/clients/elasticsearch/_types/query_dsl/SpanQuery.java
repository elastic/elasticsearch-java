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
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanQuery
// union type: Container[]
@JsonpDeserializable
public class SpanQuery implements TaggedUnion<SpanQuery.Kind, Object>, JsonpSerializable {

	/**
	 * {@link SpanQuery} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		SpanContaining("span_containing"),

		FieldMaskingSpan("field_masking_span"),

		SpanFirst("span_first"),

		SpanGap("span_gap"),

		SpanMulti("span_multi"),

		SpanNear("span_near"),

		SpanNot("span_not"),

		SpanOr("span_or"),

		SpanTerm("span_term"),

		SpanWithin("span_within"),

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

	public SpanQuery(SpanQueryVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._spanQueryKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private SpanQuery(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SpanQuery of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code span_containing}?
	 */
	public boolean isSpanContaining() {
		return _kind == Kind.SpanContaining;
	}

	/**
	 * Get the {@code span_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_containing}
	 *             kind.
	 */
	public SpanContainingQuery spanContaining() {
		return TaggedUnionUtils.get(this, Kind.SpanContaining);
	}

	/**
	 * Is this variant instance of kind {@code field_masking_span}?
	 */
	public boolean isFieldMaskingSpan() {
		return _kind == Kind.FieldMaskingSpan;
	}

	/**
	 * Get the {@code field_masking_span} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_masking_span}
	 *             kind.
	 */
	public SpanFieldMaskingQuery fieldMaskingSpan() {
		return TaggedUnionUtils.get(this, Kind.FieldMaskingSpan);
	}

	/**
	 * Is this variant instance of kind {@code span_first}?
	 */
	public boolean isSpanFirst() {
		return _kind == Kind.SpanFirst;
	}

	/**
	 * Get the {@code span_first} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_first} kind.
	 */
	public SpanFirstQuery spanFirst() {
		return TaggedUnionUtils.get(this, Kind.SpanFirst);
	}

	/**
	 * Is this variant instance of kind {@code span_gap}?
	 */
	public boolean isSpanGap() {
		return _kind == Kind.SpanGap;
	}

	/**
	 * Get the {@code span_gap} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_gap} kind.
	 */
	public SpanGapQuery spanGap() {
		return TaggedUnionUtils.get(this, Kind.SpanGap);
	}

	/**
	 * Is this variant instance of kind {@code span_multi}?
	 */
	public boolean isSpanMulti() {
		return _kind == Kind.SpanMulti;
	}

	/**
	 * Get the {@code span_multi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_multi} kind.
	 */
	public SpanMultiTermQuery spanMulti() {
		return TaggedUnionUtils.get(this, Kind.SpanMulti);
	}

	/**
	 * Is this variant instance of kind {@code span_near}?
	 */
	public boolean isSpanNear() {
		return _kind == Kind.SpanNear;
	}

	/**
	 * Get the {@code span_near} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_near} kind.
	 */
	public SpanNearQuery spanNear() {
		return TaggedUnionUtils.get(this, Kind.SpanNear);
	}

	/**
	 * Is this variant instance of kind {@code span_not}?
	 */
	public boolean isSpanNot() {
		return _kind == Kind.SpanNot;
	}

	/**
	 * Get the {@code span_not} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_not} kind.
	 */
	public SpanNotQuery spanNot() {
		return TaggedUnionUtils.get(this, Kind.SpanNot);
	}

	/**
	 * Is this variant instance of kind {@code span_or}?
	 */
	public boolean isSpanOr() {
		return _kind == Kind.SpanOr;
	}

	/**
	 * Get the {@code span_or} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_or} kind.
	 */
	public SpanOrQuery spanOr() {
		return TaggedUnionUtils.get(this, Kind.SpanOr);
	}

	/**
	 * Is this variant instance of kind {@code span_term}?
	 */
	public boolean isSpanTerm() {
		return _kind == Kind.SpanTerm;
	}

	/**
	 * Get the {@code span_term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_term} kind.
	 */
	public SpanTermQuery spanTerm() {
		return TaggedUnionUtils.get(this, Kind.SpanTerm);
	}

	/**
	 * Is this variant instance of kind {@code span_within}?
	 */
	public boolean isSpanWithin() {
		return _kind == Kind.SpanWithin;
	}

	/**
	 * Get the {@code span_within} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_within} kind.
	 */
	public SpanWithinQuery spanWithin() {
		return TaggedUnionUtils.get(this, Kind.SpanWithin);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SpanQuery> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<SpanQuery> spanContaining(SpanContainingQuery v) {
			this._kind = Kind.SpanContaining;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanContaining(Consumer<SpanContainingQuery.Builder> fn) {
			SpanContainingQuery.Builder builder = new SpanContainingQuery.Builder();
			fn.accept(builder);
			return this.spanContaining(builder.build());
		}

		public ObjectBuilder<SpanQuery> fieldMaskingSpan(SpanFieldMaskingQuery v) {
			this._kind = Kind.FieldMaskingSpan;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> fieldMaskingSpan(Consumer<SpanFieldMaskingQuery.Builder> fn) {
			SpanFieldMaskingQuery.Builder builder = new SpanFieldMaskingQuery.Builder();
			fn.accept(builder);
			return this.fieldMaskingSpan(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanFirst(SpanFirstQuery v) {
			this._kind = Kind.SpanFirst;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanFirst(Consumer<SpanFirstQuery.Builder> fn) {
			SpanFirstQuery.Builder builder = new SpanFirstQuery.Builder();
			fn.accept(builder);
			return this.spanFirst(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanGap(SpanGapQuery v) {
			this._kind = Kind.SpanGap;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanGap(Consumer<SpanGapQuery.Builder> fn) {
			SpanGapQuery.Builder builder = new SpanGapQuery.Builder();
			fn.accept(builder);
			return this.spanGap(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanMulti(SpanMultiTermQuery v) {
			this._kind = Kind.SpanMulti;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanMulti(Consumer<SpanMultiTermQuery.Builder> fn) {
			SpanMultiTermQuery.Builder builder = new SpanMultiTermQuery.Builder();
			fn.accept(builder);
			return this.spanMulti(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanNear(SpanNearQuery v) {
			this._kind = Kind.SpanNear;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanNear(Consumer<SpanNearQuery.Builder> fn) {
			SpanNearQuery.Builder builder = new SpanNearQuery.Builder();
			fn.accept(builder);
			return this.spanNear(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanNot(SpanNotQuery v) {
			this._kind = Kind.SpanNot;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanNot(Consumer<SpanNotQuery.Builder> fn) {
			SpanNotQuery.Builder builder = new SpanNotQuery.Builder();
			fn.accept(builder);
			return this.spanNot(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanOr(SpanOrQuery v) {
			this._kind = Kind.SpanOr;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanOr(Consumer<SpanOrQuery.Builder> fn) {
			SpanOrQuery.Builder builder = new SpanOrQuery.Builder();
			fn.accept(builder);
			return this.spanOr(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanTerm(SpanTermQuery v) {
			this._kind = Kind.SpanTerm;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanTerm(Consumer<SpanTermQuery.Builder> fn) {
			SpanTermQuery.Builder builder = new SpanTermQuery.Builder();
			fn.accept(builder);
			return this.spanTerm(builder.build());
		}

		public ObjectBuilder<SpanQuery> spanWithin(SpanWithinQuery v) {
			this._kind = Kind.SpanWithin;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SpanQuery> spanWithin(Consumer<SpanWithinQuery.Builder> fn) {
			SpanWithinQuery.Builder builder = new SpanWithinQuery.Builder();
			fn.accept(builder);
			return this.spanWithin(builder.build());
		}

		public SpanQuery build() {
			_checkSingleUse();
			return new SpanQuery(this);
		}

	}

	protected static void setupSpanQueryDeserializer(ObjectDeserializer<Builder> op) {

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

	public static final JsonpDeserializer<SpanQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanQuery::setupSpanQueryDeserializer, Builder::build);
}
