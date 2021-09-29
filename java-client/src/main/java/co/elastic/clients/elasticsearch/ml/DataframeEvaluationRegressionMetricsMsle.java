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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationRegressionMetricsMsle
@JsonpDeserializable
public final class DataframeEvaluationRegressionMetricsMsle implements JsonpSerializable {
	@Nullable
	private final Double offset;

	// ---------------------------------------------------------------------------------------------

	public DataframeEvaluationRegressionMetricsMsle(Builder builder) {

		this.offset = builder.offset;

	}

	public DataframeEvaluationRegressionMetricsMsle(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Defines the transition point at which you switch from minimizing quadratic
	 * error to minimizing quadratic log error. Defaults to 1.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public Double offset() {
		return this.offset;
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

		if (this.offset != null) {

			generator.writeKey("offset");
			generator.write(this.offset);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationRegressionMetricsMsle}.
	 */
	public static class Builder implements ObjectBuilder<DataframeEvaluationRegressionMetricsMsle> {
		@Nullable
		private Double offset;

		/**
		 * Defines the transition point at which you switch from minimizing quadratic
		 * error to minimizing quadratic log error. Defaults to 1.
		 * <p>
		 * API name: {@code offset}
		 */
		public Builder offset(@Nullable Double value) {
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
	 * Json deserializer for {@link DataframeEvaluationRegressionMetricsMsle}
	 */
	public static final JsonpDeserializer<DataframeEvaluationRegressionMetricsMsle> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationRegressionMetricsMsle::setupDataframeEvaluationRegressionMetricsMsleDeserializer,
					Builder::build);

	protected static void setupDataframeEvaluationRegressionMetricsMsleDeserializer(
			DelegatingDeserializer<DataframeEvaluationRegressionMetricsMsle.Builder> op) {

		op.add(Builder::offset, JsonpDeserializer.doubleDeserializer(), "offset");

	}

}
