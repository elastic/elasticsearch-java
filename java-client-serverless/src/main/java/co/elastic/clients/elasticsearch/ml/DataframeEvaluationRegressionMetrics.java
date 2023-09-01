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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationRegressionMetrics

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationRegressionMetrics">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationRegressionMetrics implements JsonpSerializable {
	private final Map<String, JsonData> mse;

	@Nullable
	private final DataframeEvaluationRegressionMetricsMsle msle;

	@Nullable
	private final DataframeEvaluationRegressionMetricsHuber huber;

	private final Map<String, JsonData> rSquared;

	// ---------------------------------------------------------------------------------------------

	private DataframeEvaluationRegressionMetrics(Builder builder) {

		this.mse = ApiTypeHelper.unmodifiable(builder.mse);
		this.msle = builder.msle;
		this.huber = builder.huber;
		this.rSquared = ApiTypeHelper.unmodifiable(builder.rSquared);

	}

	public static DataframeEvaluationRegressionMetrics of(
			Function<Builder, ObjectBuilder<DataframeEvaluationRegressionMetrics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Average squared difference between the predicted values and the actual
	 * (ground truth) value. For more information, read this wiki article.
	 * <p>
	 * API name: {@code mse}
	 */
	public final Map<String, JsonData> mse() {
		return this.mse;
	}

	/**
	 * Average squared difference between the logarithm of the predicted values and
	 * the logarithm of the actual (ground truth) value.
	 * <p>
	 * API name: {@code msle}
	 */
	@Nullable
	public final DataframeEvaluationRegressionMetricsMsle msle() {
		return this.msle;
	}

	/**
	 * Pseudo Huber loss function.
	 * <p>
	 * API name: {@code huber}
	 */
	@Nullable
	public final DataframeEvaluationRegressionMetricsHuber huber() {
		return this.huber;
	}

	/**
	 * Proportion of the variance in the dependent variable that is predictable from
	 * the independent variables.
	 * <p>
	 * API name: {@code r_squared}
	 */
	public final Map<String, JsonData> rSquared() {
		return this.rSquared;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.mse)) {
			generator.writeKey("mse");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.mse.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.msle != null) {
			generator.writeKey("msle");
			this.msle.serialize(generator, mapper);

		}
		if (this.huber != null) {
			generator.writeKey("huber");
			this.huber.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.rSquared)) {
			generator.writeKey("r_squared");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.rSquared.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationRegressionMetrics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeEvaluationRegressionMetrics> {
		@Nullable
		private Map<String, JsonData> mse;

		@Nullable
		private DataframeEvaluationRegressionMetricsMsle msle;

		@Nullable
		private DataframeEvaluationRegressionMetricsHuber huber;

		@Nullable
		private Map<String, JsonData> rSquared;

		/**
		 * Average squared difference between the predicted values and the actual
		 * (ground truth) value. For more information, read this wiki article.
		 * <p>
		 * API name: {@code mse}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>mse</code>.
		 */
		public final Builder mse(Map<String, JsonData> map) {
			this.mse = _mapPutAll(this.mse, map);
			return this;
		}

		/**
		 * Average squared difference between the predicted values and the actual
		 * (ground truth) value. For more information, read this wiki article.
		 * <p>
		 * API name: {@code mse}
		 * <p>
		 * Adds an entry to <code>mse</code>.
		 */
		public final Builder mse(String key, JsonData value) {
			this.mse = _mapPut(this.mse, key, value);
			return this;
		}

		/**
		 * Average squared difference between the logarithm of the predicted values and
		 * the logarithm of the actual (ground truth) value.
		 * <p>
		 * API name: {@code msle}
		 */
		public final Builder msle(@Nullable DataframeEvaluationRegressionMetricsMsle value) {
			this.msle = value;
			return this;
		}

		/**
		 * Average squared difference between the logarithm of the predicted values and
		 * the logarithm of the actual (ground truth) value.
		 * <p>
		 * API name: {@code msle}
		 */
		public final Builder msle(
				Function<DataframeEvaluationRegressionMetricsMsle.Builder, ObjectBuilder<DataframeEvaluationRegressionMetricsMsle>> fn) {
			return this.msle(fn.apply(new DataframeEvaluationRegressionMetricsMsle.Builder()).build());
		}

		/**
		 * Pseudo Huber loss function.
		 * <p>
		 * API name: {@code huber}
		 */
		public final Builder huber(@Nullable DataframeEvaluationRegressionMetricsHuber value) {
			this.huber = value;
			return this;
		}

		/**
		 * Pseudo Huber loss function.
		 * <p>
		 * API name: {@code huber}
		 */
		public final Builder huber(
				Function<DataframeEvaluationRegressionMetricsHuber.Builder, ObjectBuilder<DataframeEvaluationRegressionMetricsHuber>> fn) {
			return this.huber(fn.apply(new DataframeEvaluationRegressionMetricsHuber.Builder()).build());
		}

		/**
		 * Proportion of the variance in the dependent variable that is predictable from
		 * the independent variables.
		 * <p>
		 * API name: {@code r_squared}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>rSquared</code>.
		 */
		public final Builder rSquared(Map<String, JsonData> map) {
			this.rSquared = _mapPutAll(this.rSquared, map);
			return this;
		}

		/**
		 * Proportion of the variance in the dependent variable that is predictable from
		 * the independent variables.
		 * <p>
		 * API name: {@code r_squared}
		 * <p>
		 * Adds an entry to <code>rSquared</code>.
		 */
		public final Builder rSquared(String key, JsonData value) {
			this.rSquared = _mapPut(this.rSquared, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationRegressionMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationRegressionMetrics build() {
			_checkSingleUse();

			return new DataframeEvaluationRegressionMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationRegressionMetrics}
	 */
	public static final JsonpDeserializer<DataframeEvaluationRegressionMetrics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationRegressionMetrics::setupDataframeEvaluationRegressionMetricsDeserializer);

	protected static void setupDataframeEvaluationRegressionMetricsDeserializer(
			ObjectDeserializer<DataframeEvaluationRegressionMetrics.Builder> op) {

		op.add(Builder::mse, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "mse");
		op.add(Builder::msle, DataframeEvaluationRegressionMetricsMsle._DESERIALIZER, "msle");
		op.add(Builder::huber, DataframeEvaluationRegressionMetricsHuber._DESERIALIZER, "huber");
		op.add(Builder::rSquared, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "r_squared");

	}

}
