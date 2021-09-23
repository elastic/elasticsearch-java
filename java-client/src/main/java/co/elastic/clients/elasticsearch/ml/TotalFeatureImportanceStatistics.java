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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.TotalFeatureImportanceStatistics
public final class TotalFeatureImportanceStatistics implements JsonpSerializable {
	private final Number meanMagnitude;

	private final Number max;

	private final Number min;

	// ---------------------------------------------------------------------------------------------

	public TotalFeatureImportanceStatistics(Builder builder) {

		this.meanMagnitude = Objects.requireNonNull(builder.meanMagnitude, "mean_magnitude");
		this.max = Objects.requireNonNull(builder.max, "max");
		this.min = Objects.requireNonNull(builder.min, "min");

	}

	/**
	 * The average magnitude of this feature across all the training data. This
	 * value is the average of the absolute values of the importance for this
	 * feature.
	 * <p>
	 * API name: {@code mean_magnitude}
	 */
	public Number meanMagnitude() {
		return this.meanMagnitude;
	}

	/**
	 * The maximum importance value across all the training data for this feature.
	 * <p>
	 * API name: {@code max}
	 */
	public Number max() {
		return this.max;
	}

	/**
	 * The minimum importance value across all the training data for this feature.
	 * <p>
	 * API name: {@code min}
	 */
	public Number min() {
		return this.min;
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

		generator.writeKey("mean_magnitude");
		generator.write(this.meanMagnitude.doubleValue());

		generator.writeKey("max");
		generator.write(this.max.doubleValue());

		generator.writeKey("min");
		generator.write(this.min.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TotalFeatureImportanceStatistics}.
	 */
	public static class Builder implements ObjectBuilder<TotalFeatureImportanceStatistics> {
		private Number meanMagnitude;

		private Number max;

		private Number min;

		/**
		 * The average magnitude of this feature across all the training data. This
		 * value is the average of the absolute values of the importance for this
		 * feature.
		 * <p>
		 * API name: {@code mean_magnitude}
		 */
		public Builder meanMagnitude(Number value) {
			this.meanMagnitude = value;
			return this;
		}

		/**
		 * The maximum importance value across all the training data for this feature.
		 * <p>
		 * API name: {@code max}
		 */
		public Builder max(Number value) {
			this.max = value;
			return this;
		}

		/**
		 * The minimum importance value across all the training data for this feature.
		 * <p>
		 * API name: {@code min}
		 */
		public Builder min(Number value) {
			this.min = value;
			return this;
		}

		/**
		 * Builds a {@link TotalFeatureImportanceStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TotalFeatureImportanceStatistics build() {

			return new TotalFeatureImportanceStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TotalFeatureImportanceStatistics}
	 */
	public static final JsonpDeserializer<TotalFeatureImportanceStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					TotalFeatureImportanceStatistics::setupTotalFeatureImportanceStatisticsDeserializer);

	protected static void setupTotalFeatureImportanceStatisticsDeserializer(
			DelegatingDeserializer<TotalFeatureImportanceStatistics.Builder> op) {

		op.add(Builder::meanMagnitude, JsonpDeserializer.numberDeserializer(), "mean_magnitude");
		op.add(Builder::max, JsonpDeserializer.numberDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.numberDeserializer(), "min");

	}

}
