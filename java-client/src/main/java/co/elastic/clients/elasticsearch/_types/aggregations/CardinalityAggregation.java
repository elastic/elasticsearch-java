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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CardinalityAggregation
public final class CardinalityAggregation extends MetricAggregationBase {
	@Nullable
	private final Number precisionThreshold;

	@Nullable
	private final Boolean rehash;

	// ---------------------------------------------------------------------------------------------

	protected CardinalityAggregation(Builder builder) {
		super(builder);
		this.precisionThreshold = builder.precisionThreshold;
		this.rehash = builder.rehash;

	}

	/**
	 * API name: {@code precision_threshold}
	 */
	@Nullable
	public Number precisionThreshold() {
		return this.precisionThreshold;
	}

	/**
	 * API name: {@code rehash}
	 */
	@Nullable
	public Boolean rehash() {
		return this.rehash;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.precisionThreshold != null) {

			generator.writeKey("precision_threshold");
			generator.write(this.precisionThreshold.doubleValue());

		}
		if (this.rehash != null) {

			generator.writeKey("rehash");
			generator.write(this.rehash);

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
		private Number precisionThreshold;

		@Nullable
		private Boolean rehash;

		/**
		 * API name: {@code precision_threshold}
		 */
		public Builder precisionThreshold(@Nullable Number value) {
			this.precisionThreshold = value;
			return this;
		}

		/**
		 * API name: {@code rehash}
		 */
		public Builder rehash(@Nullable Boolean value) {
			this.rehash = value;
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

			return new CardinalityAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CardinalityAggregation
	 */
	public static final JsonpDeserializer<CardinalityAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CardinalityAggregation::setupCardinalityAggregationDeserializer);

	protected static void setupCardinalityAggregationDeserializer(
			DelegatingDeserializer<CardinalityAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::precisionThreshold, JsonpDeserializer.numberDeserializer(), "precision_threshold");
		op.add(Builder::rehash, JsonpDeserializer.booleanDeserializer(), "rehash");

	}

}
