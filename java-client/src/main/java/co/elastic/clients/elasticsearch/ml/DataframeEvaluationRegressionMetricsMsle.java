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
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationRegressionMetricsMsle
public final class DataframeEvaluationRegressionMetricsMsle implements ToJsonp {
	@Nullable
	private final Number offset;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationRegressionMetricsMsle(Builder builder) {

		this.offset = builder.offset;

	}

	/**
	 * Defines the transition point at which you switch from minimizing quadratic
	 * error to minimizing quadratic log error. Defaults to 1.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public Number offset() {
		return this.offset;
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

		if (this.offset != null) {

			generator.writeKey("offset");
			generator.write(this.offset.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationRegressionMetricsMsle}.
	 */
	public static class Builder implements ObjectBuilder<DataframeEvaluationRegressionMetricsMsle> {
		@Nullable
		private Number offset;

		/**
		 * Defines the transition point at which you switch from minimizing quadratic
		 * error to minimizing quadratic log error. Defaults to 1.
		 * <p>
		 * API name: {@code offset}
		 */
		public Builder offset(@Nullable Number value) {
			this.offset = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationRegressionMetricsMsle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationRegressionMetricsMsle build() {

			return new DataframeEvaluationRegressionMetricsMsle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframeEvaluationRegressionMetricsMsle
	 */
	public static final JsonpDeserializer<DataframeEvaluationRegressionMetricsMsle> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeEvaluationRegressionMetricsMsle::setupDataframeEvaluationRegressionMetricsMsleDeserializer);

	protected static void setupDataframeEvaluationRegressionMetricsMsleDeserializer(
			DelegatingDeserializer<DataframeEvaluationRegressionMetricsMsle.Builder> op) {

		op.add(Builder::offset, JsonpDeserializer.numberDeserializer(), "offset");

	}

}
