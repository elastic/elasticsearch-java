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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Double;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml._types.ExponentialAverageCalculationContext

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.ExponentialAverageCalculationContext">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExponentialAverageCalculationContext implements JsonpSerializable {
	private final double incrementalMetricValueMs;

	@Nullable
	private final Long latestTimestamp;

	@Nullable
	private final Double previousExponentialAverageMs;

	// ---------------------------------------------------------------------------------------------

	private ExponentialAverageCalculationContext(Builder builder) {

		this.incrementalMetricValueMs = ApiTypeHelper.requireNonNull(builder.incrementalMetricValueMs, this,
				"incrementalMetricValueMs", 0);
		this.latestTimestamp = builder.latestTimestamp;
		this.previousExponentialAverageMs = builder.previousExponentialAverageMs;

	}

	public static ExponentialAverageCalculationContext of(
			Function<Builder, ObjectBuilder<ExponentialAverageCalculationContext>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code incremental_metric_value_ms}
	 */
	public final double incrementalMetricValueMs() {
		return this.incrementalMetricValueMs;
	}

	/**
	 * API name: {@code latest_timestamp}
	 */
	@Nullable
	public final Long latestTimestamp() {
		return this.latestTimestamp;
	}

	/**
	 * API name: {@code previous_exponential_average_ms}
	 */
	@Nullable
	public final Double previousExponentialAverageMs() {
		return this.previousExponentialAverageMs;
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

		generator.writeKey("incremental_metric_value_ms");
		generator.write(this.incrementalMetricValueMs);

		if (this.latestTimestamp != null) {
			generator.writeKey("latest_timestamp");
			generator.write(this.latestTimestamp);

		}
		if (this.previousExponentialAverageMs != null) {
			generator.writeKey("previous_exponential_average_ms");
			generator.write(this.previousExponentialAverageMs);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExponentialAverageCalculationContext}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExponentialAverageCalculationContext> {
		private Double incrementalMetricValueMs;

		@Nullable
		private Long latestTimestamp;

		@Nullable
		private Double previousExponentialAverageMs;

		/**
		 * Required - API name: {@code incremental_metric_value_ms}
		 */
		public final Builder incrementalMetricValueMs(double value) {
			this.incrementalMetricValueMs = value;
			return this;
		}

		/**
		 * API name: {@code latest_timestamp}
		 */
		public final Builder latestTimestamp(@Nullable Long value) {
			this.latestTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code previous_exponential_average_ms}
		 */
		public final Builder previousExponentialAverageMs(@Nullable Double value) {
			this.previousExponentialAverageMs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExponentialAverageCalculationContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExponentialAverageCalculationContext build() {
			_checkSingleUse();

			return new ExponentialAverageCalculationContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExponentialAverageCalculationContext}
	 */
	public static final JsonpDeserializer<ExponentialAverageCalculationContext> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					ExponentialAverageCalculationContext::setupExponentialAverageCalculationContextDeserializer);

	protected static void setupExponentialAverageCalculationContextDeserializer(
			ObjectDeserializer<ExponentialAverageCalculationContext.Builder> op) {

		op.add(Builder::incrementalMetricValueMs, JsonpDeserializer.doubleDeserializer(),
				"incremental_metric_value_ms");
		op.add(Builder::latestTimestamp, JsonpDeserializer.longDeserializer(), "latest_timestamp");
		op.add(Builder::previousExponentialAverageMs, JsonpDeserializer.doubleDeserializer(),
				"previous_exponential_average_ms");

	}

}
