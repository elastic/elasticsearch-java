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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml._types.TotalFeatureImportanceStatistics
@JsonpDeserializable
public final class TotalFeatureImportanceStatistics implements JsonpSerializable {
	private final double meanMagnitude;

	private final int max;

	private final int min;

	// ---------------------------------------------------------------------------------------------

	public TotalFeatureImportanceStatistics(Builder builder) {

		this.meanMagnitude = Objects.requireNonNull(builder.meanMagnitude, "mean_magnitude");
		this.max = Objects.requireNonNull(builder.max, "max");
		this.min = Objects.requireNonNull(builder.min, "min");

	}

	public TotalFeatureImportanceStatistics(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The average magnitude of this feature across all the training data. This
	 * value is the average of the absolute values of the importance for this
	 * feature.
	 * <p>
	 * API name: {@code mean_magnitude}
	 */
	public double meanMagnitude() {
		return this.meanMagnitude;
	}

	/**
	 * The maximum importance value across all the training data for this feature.
	 * <p>
	 * API name: {@code max}
	 */
	public int max() {
		return this.max;
	}

	/**
	 * The minimum importance value across all the training data for this feature.
	 * <p>
	 * API name: {@code min}
	 */
	public int min() {
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
		generator.write(this.meanMagnitude);

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("min");
		generator.write(this.min);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TotalFeatureImportanceStatistics}.
	 */
	public static class Builder implements ObjectBuilder<TotalFeatureImportanceStatistics> {
		private Double meanMagnitude;

		private Integer max;

		private Integer min;

		/**
		 * The average magnitude of this feature across all the training data. This
		 * value is the average of the absolute values of the importance for this
		 * feature.
		 * <p>
		 * API name: {@code mean_magnitude}
		 */
		public Builder meanMagnitude(double value) {
			this.meanMagnitude = value;
			return this;
		}

		/**
		 * The maximum importance value across all the training data for this feature.
		 * <p>
		 * API name: {@code max}
		 */
		public Builder max(int value) {
			this.max = value;
			return this;
		}

		/**
		 * The minimum importance value across all the training data for this feature.
		 * <p>
		 * API name: {@code min}
		 */
		public Builder min(int value) {
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
	public static final JsonpDeserializer<TotalFeatureImportanceStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TotalFeatureImportanceStatistics::setupTotalFeatureImportanceStatisticsDeserializer,
					Builder::build);

	protected static void setupTotalFeatureImportanceStatisticsDeserializer(
			DelegatingDeserializer<TotalFeatureImportanceStatistics.Builder> op) {

		op.add(Builder::meanMagnitude, JsonpDeserializer.doubleDeserializer(), "mean_magnitude");
		op.add(Builder::max, JsonpDeserializer.integerDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.integerDeserializer(), "min");

	}

}
