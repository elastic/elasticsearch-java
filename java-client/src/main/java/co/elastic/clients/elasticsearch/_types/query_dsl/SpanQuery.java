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

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanQuery
public interface SpanQuery extends JsonpSerializable {

	String SPAN_CONTAINING = "span_containing";
	String FIELD_MASKING_SPAN = "field_masking_span";
	String SPAN_FIRST = "span_first";
	String SPAN_GAP = "span_gap";
	String SPAN_MULTI = "span_multi";
	String SPAN_NEAR = "span_near";
	String SPAN_NOT = "span_not";
	String SPAN_OR = "span_or";
	String SPAN_TERM = "span_term";
	String SPAN_WITHIN = "span_within";

	/**
	 * The type of this {@code SpanQuery}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code span_containing}
		 */
		public ObjectBuilder<SpanQuery> spanContaining(SpanContainingQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_containing}
		 */
		public ObjectBuilder<SpanQuery> spanContaining(
				Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> fn) {
			return this.spanContaining(fn.apply(new SpanContainingQuery.Builder()).build());
		}

		/**
		 * API name: {@code field_masking_span}
		 */
		public ObjectBuilder<SpanQuery> fieldMaskingSpan(SpanFieldMaskingQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code field_masking_span}
		 */
		public ObjectBuilder<SpanQuery> fieldMaskingSpan(
				Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> fn) {
			return this.fieldMaskingSpan(fn.apply(new SpanFieldMaskingQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_first}
		 */
		public ObjectBuilder<SpanQuery> spanFirst(SpanFirstQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_first}
		 */
		public ObjectBuilder<SpanQuery> spanFirst(Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> fn) {
			return this.spanFirst(fn.apply(new SpanFirstQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_gap}
		 */
		public ObjectBuilder<SpanQuery> spanGap(SpanGapQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_gap}
		 */
		public ObjectBuilder<SpanQuery> spanGap(Function<SpanGapQuery.Builder, ObjectBuilder<SpanGapQuery>> fn) {
			return this.spanGap(fn.apply(new SpanGapQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_multi}
		 */
		public ObjectBuilder<SpanQuery> spanMulti(SpanMultiTermQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_multi}
		 */
		public ObjectBuilder<SpanQuery> spanMulti(
				Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> fn) {
			return this.spanMulti(fn.apply(new SpanMultiTermQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_near}
		 */
		public ObjectBuilder<SpanQuery> spanNear(SpanNearQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_near}
		 */
		public ObjectBuilder<SpanQuery> spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> fn) {
			return this.spanNear(fn.apply(new SpanNearQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_not}
		 */
		public ObjectBuilder<SpanQuery> spanNot(SpanNotQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_not}
		 */
		public ObjectBuilder<SpanQuery> spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> fn) {
			return this.spanNot(fn.apply(new SpanNotQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_or}
		 */
		public ObjectBuilder<SpanQuery> spanOr(SpanOrQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_or}
		 */
		public ObjectBuilder<SpanQuery> spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> fn) {
			return this.spanOr(fn.apply(new SpanOrQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_term}
		 */
		public ObjectBuilder<SpanQuery> spanTerm(SpanTermQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_term}
		 */
		public ObjectBuilder<SpanQuery> spanTerm(Function<SpanTermQuery.Builder, ObjectBuilder<SpanTermQuery>> fn) {
			return this.spanTerm(fn.apply(new SpanTermQuery.Builder()).build());
		}

		/**
		 * API name: {@code span_within}
		 */
		public ObjectBuilder<SpanQuery> spanWithin(SpanWithinQuery value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code span_within}
		 */
		public ObjectBuilder<SpanQuery> spanWithin(
				Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> fn) {
			return this.spanWithin(fn.apply(new SpanWithinQuery.Builder()).build());
		}

	}

	class $Helper {
		private static SpanQuery deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends SpanQuery> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case SPAN_CONTAINING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanContainingQuery.$BUILDER_DESERIALIZER
								.deserialize(new SpanContainingQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case FIELD_MASKING_SPAN : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanFieldMaskingQuery.$BUILDER_DESERIALIZER
								.deserialize(new SpanFieldMaskingQuery.Builder(), parser, mapper, parser.next());
						break;
					}
					case SPAN_FIRST : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanFirstQuery.$BUILDER_DESERIALIZER.deserialize(new SpanFirstQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_GAP : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanGapQuery.$BUILDER_DESERIALIZER.deserialize(new SpanGapQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_MULTI : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanMultiTermQuery.$BUILDER_DESERIALIZER.deserialize(new SpanMultiTermQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case SPAN_NEAR : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanNearQuery.$BUILDER_DESERIALIZER.deserialize(new SpanNearQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_NOT : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanNotQuery.$BUILDER_DESERIALIZER.deserialize(new SpanNotQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_OR : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanOrQuery.$BUILDER_DESERIALIZER.deserialize(new SpanOrQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_TERM : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanTermQuery.$BUILDER_DESERIALIZER.deserialize(new SpanTermQuery.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SPAN_WITHIN : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SpanWithinQuery.$BUILDER_DESERIALIZER.deserialize(new SpanWithinQuery.Builder(),
								parser, mapper, parser.next());
						break;
					}
					default : {
						JsonpUtils.unknownKey(parser, fieldName);
					}
				}
			}

			return JsonpUtils.buildVariant(parser, builder);
		}
	}

	JsonpDeserializer<SpanQuery> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
