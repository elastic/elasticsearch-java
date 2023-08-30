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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CardinalityAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CardinalityAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class CardinalityAggregation extends MetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Integer precisionThreshold;

	@Nullable
	private final Boolean rehash;

	@Nullable
	private final CardinalityExecutionMode executionHint;

	// ---------------------------------------------------------------------------------------------

	private CardinalityAggregation(Builder builder) {
		super(builder);

		this.precisionThreshold = builder.precisionThreshold;
		this.rehash = builder.rehash;
		this.executionHint = builder.executionHint;

	}

	public static CardinalityAggregation of(Function<Builder, ObjectBuilder<CardinalityAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Cardinality;
	}

	/**
	 * A unique count below which counts are expected to be close to accurate. This
	 * allows to trade memory for accuracy.
	 * <p>
	 * API name: {@code precision_threshold}
	 */
	@Nullable
	public final Integer precisionThreshold() {
		return this.precisionThreshold;
	}

	/**
	 * API name: {@code rehash}
	 */
	@Nullable
	public final Boolean rehash() {
		return this.rehash;
	}

	/**
	 * Mechanism by which cardinality aggregations is run.
	 * <p>
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public final CardinalityExecutionMode executionHint() {
		return this.executionHint;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.precisionThreshold != null) {
			generator.writeKey("precision_threshold");
			generator.write(this.precisionThreshold);

		}
		if (this.rehash != null) {
			generator.writeKey("rehash");
			generator.write(this.rehash);

		}
		if (this.executionHint != null) {
			generator.writeKey("execution_hint");
			this.executionHint.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CardinalityAggregation}.
	 */

	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CardinalityAggregation> {
		@Nullable
		private Integer precisionThreshold;

		@Nullable
		private Boolean rehash;

		@Nullable
		private CardinalityExecutionMode executionHint;

		/**
		 * A unique count below which counts are expected to be close to accurate. This
		 * allows to trade memory for accuracy.
		 * <p>
		 * API name: {@code precision_threshold}
		 */
		public final Builder precisionThreshold(@Nullable Integer value) {
			this.precisionThreshold = value;
			return this;
		}

		/**
		 * API name: {@code rehash}
		 */
		public final Builder rehash(@Nullable Boolean value) {
			this.rehash = value;
			return this;
		}

		/**
		 * Mechanism by which cardinality aggregations is run.
		 * <p>
		 * API name: {@code execution_hint}
		 */
		public final Builder executionHint(@Nullable CardinalityExecutionMode value) {
			this.executionHint = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CardinalityAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CardinalityAggregation build() {
			_checkSingleUse();

			return new CardinalityAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CardinalityAggregation}
	 */
	public static final JsonpDeserializer<CardinalityAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CardinalityAggregation::setupCardinalityAggregationDeserializer);

	protected static void setupCardinalityAggregationDeserializer(
			ObjectDeserializer<CardinalityAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::precisionThreshold, JsonpDeserializer.integerDeserializer(), "precision_threshold");
		op.add(Builder::rehash, JsonpDeserializer.booleanDeserializer(), "rehash");
		op.add(Builder::executionHint, CardinalityExecutionMode._DESERIALIZER, "execution_hint");

	}

}
