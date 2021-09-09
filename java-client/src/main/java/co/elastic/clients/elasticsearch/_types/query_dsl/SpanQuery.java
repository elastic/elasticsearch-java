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
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class SpanQuery extends TaggedUnion<SpanQuery.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		spanContaining("span_containing"),

		fieldMaskingSpan("field_masking_span"),

		spanFirst("span_first"),

		spanGap("span_gap"),

		spanMulti("span_multi"),

		spanNear("span_near"),

		spanNot("span_not"),

		spanOr("span_or"),

		spanTerm("span_term"),

		spanWithin("span_within"),

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

	private SpanQuery(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_containing} kind?
	 */
	public boolean isSpanContaining() {
		return is(Tag.spanContaining);
	}

	/**
	 * Get the {@code span_containing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_containing}
	 *             kind.
	 */
	public SpanContainingQuery spanContaining() {
		return get(Tag.spanContaining);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code field_masking_span} kind?
	 */
	public boolean isFieldMaskingSpan() {
		return is(Tag.fieldMaskingSpan);
	}

	/**
	 * Get the {@code field_masking_span} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_masking_span}
	 *             kind.
	 */
	public SpanFieldMaskingQuery fieldMaskingSpan() {
		return get(Tag.fieldMaskingSpan);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_first} kind?
	 */
	public boolean isSpanFirst() {
		return is(Tag.spanFirst);
	}

	/**
	 * Get the {@code span_first} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_first} kind.
	 */
	public SpanFirstQuery spanFirst() {
		return get(Tag.spanFirst);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_gap} kind?
	 */
	public boolean isSpanGap() {
		return is(Tag.spanGap);
	}

	/**
	 * Get the {@code span_gap} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_gap} kind.
	 */
	public NamedValue<Number> spanGap() {
		return get(Tag.spanGap);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_multi} kind?
	 */
	public boolean isSpanMulti() {
		return is(Tag.spanMulti);
	}

	/**
	 * Get the {@code span_multi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_multi} kind.
	 */
	public SpanMultiTermQuery spanMulti() {
		return get(Tag.spanMulti);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_near} kind?
	 */
	public boolean isSpanNear() {
		return is(Tag.spanNear);
	}

	/**
	 * Get the {@code span_near} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_near} kind.
	 */
	public SpanNearQuery spanNear() {
		return get(Tag.spanNear);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_not} kind?
	 */
	public boolean isSpanNot() {
		return is(Tag.spanNot);
	}

	/**
	 * Get the {@code span_not} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_not} kind.
	 */
	public SpanNotQuery spanNot() {
		return get(Tag.spanNot);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_or} kind?
	 */
	public boolean isSpanOr() {
		return is(Tag.spanOr);
	}

	/**
	 * Get the {@code span_or} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_or} kind.
	 */
	public SpanOrQuery spanOr() {
		return get(Tag.spanOr);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_term} kind?
	 */
	public boolean isSpanTerm() {
		return is(Tag.spanTerm);
	}

	/**
	 * Get the {@code span_term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_term} kind.
	 */
	public NamedValue<SpanTermQuery> spanTerm() {
		return get(Tag.spanTerm);
	}

	/**
	 * Is this {@link SpanQuery} of a {@code span_within} kind?
	 */
	public boolean isSpanWithin() {
		return is(Tag.spanWithin);
	}

	/**
	 * Get the {@code span_within} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code span_within} kind.
	 */
	public SpanWithinQuery spanWithin() {
		return get(Tag.spanWithin);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case spanGap :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<Number>>get(Tag.spanGap).name());
					generator.write(this.<NamedValue<Number>>get(Tag.spanGap).value().doubleValue());

					generator.writeEnd();

					break;
				case spanTerm :
					generator.writeStartObject();
					generator.writeKey(this.<NamedValue<SpanTermQuery>>get(Tag.spanTerm).name());
					this.<NamedValue<SpanTermQuery>>get(Tag.spanTerm).value().toJsonp(generator, mapper);

					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<SpanQuery> spanContaining(SpanContainingQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanContaining;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanContaining(
				Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> f) {
			return this.spanContaining(f.apply(new SpanContainingQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> fieldMaskingSpan(SpanFieldMaskingQuery v) {
			this.$variant = v;
			this.$tag = Tag.fieldMaskingSpan;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> fieldMaskingSpan(
				Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> f) {
			return this.fieldMaskingSpan(f.apply(new SpanFieldMaskingQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanFirst(SpanFirstQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanFirst;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanFirst(Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> f) {
			return this.spanFirst(f.apply(new SpanFirstQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanGap(NamedValue<Number> v) {
			this.$variant = v;
			this.$tag = Tag.spanGap;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanMulti(SpanMultiTermQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanMulti;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanMulti(
				Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> f) {
			return this.spanMulti(f.apply(new SpanMultiTermQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanNear(SpanNearQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanNear;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> f) {
			return this.spanNear(f.apply(new SpanNearQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanNot(SpanNotQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanNot;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> f) {
			return this.spanNot(f.apply(new SpanNotQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanOr(SpanOrQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanOr;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> f) {
			return this.spanOr(f.apply(new SpanOrQuery.Builder()).build());
		}

		public ObjectBuilder<SpanQuery> spanTerm(NamedValue<SpanTermQuery> v) {
			this.$variant = v;
			this.$tag = Tag.spanTerm;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanWithin(SpanWithinQuery v) {
			this.$variant = v;
			this.$tag = Tag.spanWithin;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SpanQuery> spanWithin(
				Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> f) {
			return this.spanWithin(f.apply(new SpanWithinQuery.Builder()).build());
		}

		protected SpanQuery build() {
			return new SpanQuery(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<SpanQuery> DESERIALIZER = JsonpDeserializer
			.lazy(SpanQuery::buildDeserializer);

	private static JsonpDeserializer<SpanQuery> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::spanContaining, SpanContainingQuery.DESERIALIZER, "span_containing");
		op.add(Builder::fieldMaskingSpan, SpanFieldMaskingQuery.DESERIALIZER, "field_masking_span");
		op.add(Builder::spanFirst, SpanFirstQuery.DESERIALIZER, "span_first");
		op.add(Builder::spanGap, NamedValue.deserializer(() -> JsonpDeserializer.numberDeserializer()), "span_gap");
		op.add(Builder::spanMulti, SpanMultiTermQuery.DESERIALIZER, "span_multi");
		op.add(Builder::spanNear, SpanNearQuery.DESERIALIZER, "span_near");
		op.add(Builder::spanNot, SpanNotQuery.DESERIALIZER, "span_not");
		op.add(Builder::spanOr, SpanOrQuery.DESERIALIZER, "span_or");
		op.add(Builder::spanTerm, NamedValue.deserializer(() -> SpanTermQuery.DESERIALIZER), "span_term");
		op.add(Builder::spanWithin, SpanWithinQuery.DESERIALIZER, "span_within");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
