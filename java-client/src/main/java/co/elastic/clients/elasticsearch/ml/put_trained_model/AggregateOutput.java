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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.AggregateOutput
public final class AggregateOutput implements ToJsonp {
	@Nullable
	private final Weights logisticRegression;

	@Nullable
	private final Weights weightedSum;

	@Nullable
	private final Weights weightedMode;

	@Nullable
	private final Weights exponent;

	// ---------------------------------------------------------------------------------------------

	protected AggregateOutput(Builder builder) {

		this.logisticRegression = builder.logisticRegression;
		this.weightedSum = builder.weightedSum;
		this.weightedMode = builder.weightedMode;
		this.exponent = builder.exponent;

	}

	/**
	 * API name: {@code logistic_regression}
	 */
	@Nullable
	public Weights logisticRegression() {
		return this.logisticRegression;
	}

	/**
	 * API name: {@code weighted_sum}
	 */
	@Nullable
	public Weights weightedSum() {
		return this.weightedSum;
	}

	/**
	 * API name: {@code weighted_mode}
	 */
	@Nullable
	public Weights weightedMode() {
		return this.weightedMode;
	}

	/**
	 * API name: {@code exponent}
	 */
	@Nullable
	public Weights exponent() {
		return this.exponent;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.logisticRegression != null) {

			generator.writeKey("logistic_regression");
			this.logisticRegression.toJsonp(generator, mapper);

		}
		if (this.weightedSum != null) {

			generator.writeKey("weighted_sum");
			this.weightedSum.toJsonp(generator, mapper);

		}
		if (this.weightedMode != null) {

			generator.writeKey("weighted_mode");
			this.weightedMode.toJsonp(generator, mapper);

		}
		if (this.exponent != null) {

			generator.writeKey("exponent");
			this.exponent.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregateOutput}.
	 */
	public static class Builder implements ObjectBuilder<AggregateOutput> {
		@Nullable
		private Weights logisticRegression;

		@Nullable
		private Weights weightedSum;

		@Nullable
		private Weights weightedMode;

		@Nullable
		private Weights exponent;

		/**
		 * API name: {@code logistic_regression}
		 */
		public Builder logisticRegression(@Nullable Weights value) {
			this.logisticRegression = value;
			return this;
		}

		/**
		 * API name: {@code logistic_regression}
		 */
		public Builder logisticRegression(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.logisticRegression(fn.apply(new Weights.Builder()).build());
		}

		/**
		 * API name: {@code weighted_sum}
		 */
		public Builder weightedSum(@Nullable Weights value) {
			this.weightedSum = value;
			return this;
		}

		/**
		 * API name: {@code weighted_sum}
		 */
		public Builder weightedSum(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.weightedSum(fn.apply(new Weights.Builder()).build());
		}

		/**
		 * API name: {@code weighted_mode}
		 */
		public Builder weightedMode(@Nullable Weights value) {
			this.weightedMode = value;
			return this;
		}

		/**
		 * API name: {@code weighted_mode}
		 */
		public Builder weightedMode(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.weightedMode(fn.apply(new Weights.Builder()).build());
		}

		/**
		 * API name: {@code exponent}
		 */
		public Builder exponent(@Nullable Weights value) {
			this.exponent = value;
			return this;
		}

		/**
		 * API name: {@code exponent}
		 */
		public Builder exponent(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.exponent(fn.apply(new Weights.Builder()).build());
		}

		/**
		 * Builds a {@link AggregateOutput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregateOutput build() {

			return new AggregateOutput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AggregateOutput
	 */
	public static final JsonpDeserializer<AggregateOutput> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AggregateOutput::setupAggregateOutputDeserializer);

	protected static void setupAggregateOutputDeserializer(DelegatingDeserializer<AggregateOutput.Builder> op) {

		op.add(Builder::logisticRegression, Weights.DESERIALIZER, "logistic_regression");
		op.add(Builder::weightedSum, Weights.DESERIALIZER, "weighted_sum");
		op.add(Builder::weightedMode, Weights.DESERIALIZER, "weighted_mode");
		op.add(Builder::exponent, Weights.DESERIALIZER, "exponent");

	}

}
