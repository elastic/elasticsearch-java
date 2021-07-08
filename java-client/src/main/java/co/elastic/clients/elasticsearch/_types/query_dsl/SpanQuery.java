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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanQuery
public final class SpanQuery extends QueryBase {
	@Nullable
	private final NamedQuery<JsonValue> spanContaining;

	@Nullable
	private final NamedQuery<JsonValue> fieldMaskingSpan;

	@Nullable
	private final NamedQuery<JsonValue> spanFirst;

	@Nullable
	private final NamedQuery<JsonValue> spanGap;

	@Nullable
	private final SpanMultiTermQuery spanMulti;

	@Nullable
	private final NamedQuery<JsonValue> spanNear;

	@Nullable
	private final NamedQuery<JsonValue> spanNot;

	@Nullable
	private final NamedQuery<JsonValue> spanOr;

	@Nullable
	private final NamedQuery<JsonValue> spanTerm;

	@Nullable
	private final NamedQuery<JsonValue> spanWithin;

	// ---------------------------------------------------------------------------------------------

	protected SpanQuery(Builder builder) {
		super(builder);
		this.spanContaining = builder.spanContaining;
		this.fieldMaskingSpan = builder.fieldMaskingSpan;
		this.spanFirst = builder.spanFirst;
		this.spanGap = builder.spanGap;
		this.spanMulti = builder.spanMulti;
		this.spanNear = builder.spanNear;
		this.spanNot = builder.spanNot;
		this.spanOr = builder.spanOr;
		this.spanTerm = builder.spanTerm;
		this.spanWithin = builder.spanWithin;

	}

	/**
	 * API name: {@code span_containing}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanContaining() {
		return this.spanContaining;
	}

	/**
	 * API name: {@code field_masking_span}
	 */
	@Nullable
	public NamedQuery<JsonValue> fieldMaskingSpan() {
		return this.fieldMaskingSpan;
	}

	/**
	 * API name: {@code span_first}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanFirst() {
		return this.spanFirst;
	}

	/**
	 * API name: {@code span_gap}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanGap() {
		return this.spanGap;
	}

	/**
	 * API name: {@code span_multi}
	 */
	@Nullable
	public SpanMultiTermQuery spanMulti() {
		return this.spanMulti;
	}

	/**
	 * API name: {@code span_near}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanNear() {
		return this.spanNear;
	}

	/**
	 * API name: {@code span_not}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanNot() {
		return this.spanNot;
	}

	/**
	 * API name: {@code span_or}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanOr() {
		return this.spanOr;
	}

	/**
	 * API name: {@code span_term}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanTerm() {
		return this.spanTerm;
	}

	/**
	 * API name: {@code span_within}
	 */
	@Nullable
	public NamedQuery<JsonValue> spanWithin() {
		return this.spanWithin;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.spanContaining != null) {

			generator.writeKey("span_containing");
			this.spanContaining.toJsonp(generator, mapper);

		}
		if (this.fieldMaskingSpan != null) {

			generator.writeKey("field_masking_span");
			this.fieldMaskingSpan.toJsonp(generator, mapper);

		}
		if (this.spanFirst != null) {

			generator.writeKey("span_first");
			this.spanFirst.toJsonp(generator, mapper);

		}
		if (this.spanGap != null) {

			generator.writeKey("span_gap");
			this.spanGap.toJsonp(generator, mapper);

		}
		if (this.spanMulti != null) {

			generator.writeKey("span_multi");
			this.spanMulti.toJsonp(generator, mapper);

		}
		if (this.spanNear != null) {

			generator.writeKey("span_near");
			this.spanNear.toJsonp(generator, mapper);

		}
		if (this.spanNot != null) {

			generator.writeKey("span_not");
			this.spanNot.toJsonp(generator, mapper);

		}
		if (this.spanOr != null) {

			generator.writeKey("span_or");
			this.spanOr.toJsonp(generator, mapper);

		}
		if (this.spanTerm != null) {

			generator.writeKey("span_term");
			this.spanTerm.toJsonp(generator, mapper);

		}
		if (this.spanWithin != null) {

			generator.writeKey("span_within");
			this.spanWithin.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanQuery> {
		@Nullable
		private NamedQuery<JsonValue> spanContaining;

		@Nullable
		private NamedQuery<JsonValue> fieldMaskingSpan;

		@Nullable
		private NamedQuery<JsonValue> spanFirst;

		@Nullable
		private NamedQuery<JsonValue> spanGap;

		@Nullable
		private SpanMultiTermQuery spanMulti;

		@Nullable
		private NamedQuery<JsonValue> spanNear;

		@Nullable
		private NamedQuery<JsonValue> spanNot;

		@Nullable
		private NamedQuery<JsonValue> spanOr;

		@Nullable
		private NamedQuery<JsonValue> spanTerm;

		@Nullable
		private NamedQuery<JsonValue> spanWithin;

		/**
		 * API name: {@code span_containing}
		 */
		public Builder spanContaining(@Nullable NamedQuery<JsonValue> value) {
			this.spanContaining = value;
			return this;
		}

		/**
		 * API name: {@code span_containing}
		 */
		public Builder spanContaining(
				Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanContaining(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code field_masking_span}
		 */
		public Builder fieldMaskingSpan(@Nullable NamedQuery<JsonValue> value) {
			this.fieldMaskingSpan = value;
			return this;
		}

		/**
		 * API name: {@code field_masking_span}
		 */
		public Builder fieldMaskingSpan(
				Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.fieldMaskingSpan(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code span_first}
		 */
		public Builder spanFirst(@Nullable NamedQuery<JsonValue> value) {
			this.spanFirst = value;
			return this;
		}

		/**
		 * API name: {@code span_first}
		 */
		public Builder spanFirst(Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanFirst(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code span_gap}
		 */
		public Builder spanGap(@Nullable NamedQuery<JsonValue> value) {
			this.spanGap = value;
			return this;
		}

		/**
		 * API name: {@code span_gap}
		 */
		public Builder spanGap(Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanGap(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code span_multi}
		 */
		public Builder spanMulti(@Nullable SpanMultiTermQuery value) {
			this.spanMulti = value;
			return this;
		}

		/**
		 * API name: {@code span_multi}
		 */
		public Builder spanMulti(Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> fn) {
			return this.spanMulti(fn.apply(new SpanMultiTermQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_near}
		 */
		public Builder spanNear(@Nullable NamedQuery<JsonValue> value) {
			this.spanNear = value;
			return this;
		}

		/**
		 * API name: {@code span_near}
		 */
		public Builder spanNear(Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanNear(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code span_not}
		 */
		public Builder spanNot(@Nullable NamedQuery<JsonValue> value) {
			this.spanNot = value;
			return this;
		}

		/**
		 * API name: {@code span_not}
		 */
		public Builder spanNot(Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanNot(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code span_or}
		 */
		public Builder spanOr(@Nullable NamedQuery<JsonValue> value) {
			this.spanOr = value;
			return this;
		}

		/**
		 * API name: {@code span_or}
		 */
		public Builder spanOr(Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanOr(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code span_term}
		 */
		public Builder spanTerm(@Nullable NamedQuery<JsonValue> value) {
			this.spanTerm = value;
			return this;
		}

		/**
		 * API name: {@code span_term}
		 */
		public Builder spanTerm(Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanTerm(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		/**
		 * API name: {@code span_within}
		 */
		public Builder spanWithin(@Nullable NamedQuery<JsonValue> value) {
			this.spanWithin = value;
			return this;
		}

		/**
		 * API name: {@code span_within}
		 */
		public Builder spanWithin(Function<NamedQuery.Builder<JsonValue>, ObjectBuilder<NamedQuery<JsonValue>>> fn) {
			return this.spanWithin(fn.apply(new NamedQuery.Builder<JsonValue>()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanQuery build() {

			return new SpanQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SpanQuery
	 */
	public static final JsonpDeserializer<SpanQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SpanQuery::setupSpanQueryDeserializer);

	protected static void setupSpanQueryDeserializer(DelegatingDeserializer<SpanQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::spanContaining,
				NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()), "span_containing");
		op.add(Builder::fieldMaskingSpan,
				NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"field_masking_span");
		op.add(Builder::spanFirst, NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"span_first");
		op.add(Builder::spanGap, NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"span_gap");
		op.add(Builder::spanMulti, SpanMultiTermQuery.DESERIALIZER, "span_multi");
		op.add(Builder::spanNear, NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"span_near");
		op.add(Builder::spanNot, NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"span_not");
		op.add(Builder::spanOr, NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"span_or");
		op.add(Builder::spanTerm, NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"span_term");
		op.add(Builder::spanWithin, NamedQuery.createNamedQueryDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"span_within");

	}

}
