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
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.WeightedAverageAggregation
public final class WeightedAverageAggregation extends Aggregation {
	@Nullable
	private final String format;

	@Nullable
	private final WeightedAverageValue value;

	@Nullable
	private final JsonValue valueType;

	@Nullable
	private final WeightedAverageValue weight;

	// ---------------------------------------------------------------------------------------------

	protected WeightedAverageAggregation(Builder builder) {
		super(builder);
		this.format = builder.format;
		this.value = builder.value;
		this.valueType = builder.valueType;
		this.weight = builder.weight;

	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	/**
	 * API name: {@code value}
	 */
	@Nullable
	public WeightedAverageValue value() {
		return this.value;
	}

	/**
	 * API name: {@code value_type}
	 */
	@Nullable
	public JsonValue valueType() {
		return this.valueType;
	}

	/**
	 * API name: {@code weight}
	 */
	@Nullable
	public WeightedAverageValue weight() {
		return this.weight;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.format != null) {

			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.value != null) {

			generator.writeKey("value");
			this.value.toJsonp(generator, mapper);

		}
		if (this.valueType != null) {

			generator.writeKey("value_type");
			generator.write(this.valueType);

		}
		if (this.weight != null) {

			generator.writeKey("weight");
			this.weight.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WeightedAverageAggregation}.
	 */
	public static class Builder extends Aggregation.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WeightedAverageAggregation> {
		@Nullable
		private String format;

		@Nullable
		private WeightedAverageValue value;

		@Nullable
		private JsonValue valueType;

		@Nullable
		private WeightedAverageValue weight;

		/**
		 * API name: {@code format}
		 */
		public Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(@Nullable WeightedAverageValue value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(Function<WeightedAverageValue.Builder, ObjectBuilder<WeightedAverageValue>> fn) {
			return this.value(fn.apply(new WeightedAverageValue.Builder()).build());
		}

		/**
		 * API name: {@code value_type}
		 */
		public Builder valueType(@Nullable JsonValue value) {
			this.valueType = value;
			return this;
		}

		/**
		 * API name: {@code weight}
		 */
		public Builder weight(@Nullable WeightedAverageValue value) {
			this.weight = value;
			return this;
		}

		/**
		 * API name: {@code weight}
		 */
		public Builder weight(Function<WeightedAverageValue.Builder, ObjectBuilder<WeightedAverageValue>> fn) {
			return this.weight(fn.apply(new WeightedAverageValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WeightedAverageAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WeightedAverageAggregation build() {

			return new WeightedAverageAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for WeightedAverageAggregation
	 */
	public static final JsonpDeserializer<WeightedAverageAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WeightedAverageAggregation::setupWeightedAverageAggregationDeserializer);

	protected static void setupWeightedAverageAggregationDeserializer(
			DelegatingDeserializer<WeightedAverageAggregation.Builder> op) {
		Aggregation.setupAggregationDeserializer(op);
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::value, WeightedAverageValue.DESERIALIZER, "value");
		op.add(Builder::valueType, JsonpDeserializer.jsonValueDeserializer(), "value_type");
		op.add(Builder::weight, WeightedAverageValue.DESERIALIZER, "weight");

	}

}
