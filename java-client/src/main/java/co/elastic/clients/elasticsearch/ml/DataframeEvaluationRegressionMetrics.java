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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationRegressionMetrics
public final class DataframeEvaluationRegressionMetrics implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> mse;

	@Nullable
	private final DataframeEvaluationRegressionMetricsMsle msle;

	@Nullable
	private final DataframeEvaluationRegressionMetricsHuber huber;

	@Nullable
	private final Map<String, JsonValue> rSquared;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationRegressionMetrics(Builder builder) {

		this.mse = builder.mse;
		this.msle = builder.msle;
		this.huber = builder.huber;
		this.rSquared = builder.rSquared;

	}

	/**
	 * Average squared difference between the predicted values and the actual
	 * (ground truth) value. For more information, read this wiki article.
	 * <p>
	 * API name: {@code mse}
	 */
	@Nullable
	public Map<String, JsonValue> mse() {
		return this.mse;
	}

	/**
	 * Average squared difference between the logarithm of the predicted values and
	 * the logarithm of the actual (ground truth) value.
	 * <p>
	 * API name: {@code msle}
	 */
	@Nullable
	public DataframeEvaluationRegressionMetricsMsle msle() {
		return this.msle;
	}

	/**
	 * Pseudo Huber loss function.
	 * <p>
	 * API name: {@code huber}
	 */
	@Nullable
	public DataframeEvaluationRegressionMetricsHuber huber() {
		return this.huber;
	}

	/**
	 * Proportion of the variance in the dependent variable that is predictable from
	 * the independent variables.
	 * <p>
	 * API name: {@code r_squared}
	 */
	@Nullable
	public Map<String, JsonValue> rSquared() {
		return this.rSquared;
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

		if (this.mse != null) {

			generator.writeKey("mse");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.mse.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.msle != null) {

			generator.writeKey("msle");
			this.msle.toJsonp(generator, mapper);

		}
		if (this.huber != null) {

			generator.writeKey("huber");
			this.huber.toJsonp(generator, mapper);

		}
		if (this.rSquared != null) {

			generator.writeKey("r_squared");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.rSquared.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationRegressionMetrics}.
	 */
	public static class Builder implements ObjectBuilder<DataframeEvaluationRegressionMetrics> {
		@Nullable
		private Map<String, JsonValue> mse;

		@Nullable
		private DataframeEvaluationRegressionMetricsMsle msle;

		@Nullable
		private DataframeEvaluationRegressionMetricsHuber huber;

		@Nullable
		private Map<String, JsonValue> rSquared;

		/**
		 * Average squared difference between the predicted values and the actual
		 * (ground truth) value. For more information, read this wiki article.
		 * <p>
		 * API name: {@code mse}
		 */
		public Builder mse(@Nullable Map<String, JsonValue> value) {
			this.mse = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #mse(Map)}, creating the map if needed.
		 */
		public Builder putMse(String key, JsonValue value) {
			if (this.mse == null) {
				this.mse = new HashMap<>();
			}
			this.mse.put(key, value);
			return this;
		}

		/**
		 * Average squared difference between the logarithm of the predicted values and
		 * the logarithm of the actual (ground truth) value.
		 * <p>
		 * API name: {@code msle}
		 */
		public Builder msle(@Nullable DataframeEvaluationRegressionMetricsMsle value) {
			this.msle = value;
			return this;
		}

		/**
		 * Average squared difference between the logarithm of the predicted values and
		 * the logarithm of the actual (ground truth) value.
		 * <p>
		 * API name: {@code msle}
		 */
		public Builder msle(
				Function<DataframeEvaluationRegressionMetricsMsle.Builder, ObjectBuilder<DataframeEvaluationRegressionMetricsMsle>> fn) {
			return this.msle(fn.apply(new DataframeEvaluationRegressionMetricsMsle.Builder()).build());
		}

		/**
		 * Pseudo Huber loss function.
		 * <p>
		 * API name: {@code huber}
		 */
		public Builder huber(@Nullable DataframeEvaluationRegressionMetricsHuber value) {
			this.huber = value;
			return this;
		}

		/**
		 * Pseudo Huber loss function.
		 * <p>
		 * API name: {@code huber}
		 */
		public Builder huber(
				Function<DataframeEvaluationRegressionMetricsHuber.Builder, ObjectBuilder<DataframeEvaluationRegressionMetricsHuber>> fn) {
			return this.huber(fn.apply(new DataframeEvaluationRegressionMetricsHuber.Builder()).build());
		}

		/**
		 * Proportion of the variance in the dependent variable that is predictable from
		 * the independent variables.
		 * <p>
		 * API name: {@code r_squared}
		 */
		public Builder rSquared(@Nullable Map<String, JsonValue> value) {
			this.rSquared = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #rSquared(Map)}, creating the map if needed.
		 */
		public Builder putRSquared(String key, JsonValue value) {
			if (this.rSquared == null) {
				this.rSquared = new HashMap<>();
			}
			this.rSquared.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationRegressionMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationRegressionMetrics build() {

			return new DataframeEvaluationRegressionMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeEvaluationRegressionMetrics
	 */
	public static final JsonpDeserializer<DataframeEvaluationRegressionMetrics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeEvaluationRegressionMetrics::setupDataframeEvaluationRegressionMetricsDeserializer);

	protected static void setupDataframeEvaluationRegressionMetricsDeserializer(
			DelegatingDeserializer<DataframeEvaluationRegressionMetrics.Builder> op) {

		op.add(Builder::mse, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "mse");
		op.add(Builder::msle, DataframeEvaluationRegressionMetricsMsle.DESERIALIZER, "msle");
		op.add(Builder::huber, DataframeEvaluationRegressionMetricsHuber.DESERIALIZER, "huber");
		op.add(Builder::rSquared, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"r_squared");

	}

}
