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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsOutlierDetection
@JsonpDeserializable
public final class DataframeAnalyticsStatsOutlierDetection
		implements
			DataframeAnalyticsStatsVariant,
			JsonpSerializable {
	private final OutlierDetectionParameters parameters;

	private final String timestamp;

	private final TimingStats timingStats;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalyticsStatsOutlierDetection(Builder builder) {

		this.parameters = Objects.requireNonNull(builder.parameters, "parameters");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.timingStats = Objects.requireNonNull(builder.timingStats, "timing_stats");

	}

	/**
	 * {@link DataframeAnalyticsStats} variant type
	 */
	@Override
	public String _variantType() {
		return "outlier_detection_stats";
	}

	/**
	 * API name: {@code parameters}
	 */
	public OutlierDetectionParameters parameters() {
		return this.parameters;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code timing_stats}
	 */
	public TimingStats timingStats() {
		return this.timingStats;
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

		generator.writeKey("parameters");
		this.parameters.serialize(generator, mapper);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("timing_stats");
		this.timingStats.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsOutlierDetection}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsStatsOutlierDetection> {
		private OutlierDetectionParameters parameters;

		private String timestamp;

		private TimingStats timingStats;

		/**
		 * API name: {@code parameters}
		 */
		public Builder parameters(OutlierDetectionParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * API name: {@code parameters}
		 */
		public Builder parameters(
				Function<OutlierDetectionParameters.Builder, ObjectBuilder<OutlierDetectionParameters>> fn) {
			return this.parameters(fn.apply(new OutlierDetectionParameters.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code timing_stats}
		 */
		public Builder timingStats(TimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * API name: {@code timing_stats}
		 */
		public Builder timingStats(Function<TimingStats.Builder, ObjectBuilder<TimingStats>> fn) {
			return this.timingStats(fn.apply(new TimingStats.Builder()).build());
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsOutlierDetection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsOutlierDetection build() {

			return new DataframeAnalyticsStatsOutlierDetection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsOutlierDetection}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsOutlierDetection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalyticsStatsOutlierDetection::setupDataframeAnalyticsStatsOutlierDetectionDeserializer,
					Builder::build);

	protected static void setupDataframeAnalyticsStatsOutlierDetectionDeserializer(
			DelegatingDeserializer<DataframeAnalyticsStatsOutlierDetection.Builder> op) {

		op.add(Builder::parameters, OutlierDetectionParameters._DESERIALIZER, "parameters");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");
		op.add(Builder::timingStats, TimingStats._DESERIALIZER, "timing_stats");

	}

}
