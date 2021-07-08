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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RateAggregation
public final class RateAggregation extends FormatMetricAggregationBase {
	@Nullable
	private final JsonValue unit;

	@Nullable
	private final JsonValue mode;

	// ---------------------------------------------------------------------------------------------

	protected RateAggregation(Builder builder) {
		super(builder);
		this.unit = builder.unit;
		this.mode = builder.mode;

	}

	/**
	 * API name: {@code unit}
	 */
	@Nullable
	public JsonValue unit() {
		return this.unit;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public JsonValue mode() {
		return this.mode;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.unit != null) {

			generator.writeKey("unit");
			generator.write(this.unit);

		}
		if (this.mode != null) {

			generator.writeKey("mode");
			generator.write(this.mode);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RateAggregation}.
	 */
	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RateAggregation> {
		@Nullable
		private JsonValue unit;

		@Nullable
		private JsonValue mode;

		/**
		 * API name: {@code unit}
		 */
		public Builder unit(@Nullable JsonValue value) {
			this.unit = value;
			return this;
		}

		/**
		 * API name: {@code mode}
		 */
		public Builder mode(@Nullable JsonValue value) {
			this.mode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RateAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RateAggregation build() {

			return new RateAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RateAggregation
	 */
	public static final JsonpDeserializer<RateAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RateAggregation::setupRateAggregationDeserializer);

	protected static void setupRateAggregationDeserializer(DelegatingDeserializer<RateAggregation.Builder> op) {
		FormatMetricAggregationBase.setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::unit, JsonpDeserializer.jsonValueDeserializer(), "unit");
		op.add(Builder::mode, JsonpDeserializer.jsonValueDeserializer(), "mode");

	}

}
