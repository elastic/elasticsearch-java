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

// typedef: ml._types.DataframeAnalyticsStatsOutlierDetection

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalyticsStatsOutlierDetection">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalyticsStatsOutlierDetection implements DataframeAnalyticsStatsVariant, JsonpSerializable {
	private final OutlierDetectionParameters parameters;

	private final long timestamp;

	private final TimingStats timingStats;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalyticsStatsOutlierDetection(Builder builder) {

		this.parameters = ApiTypeHelper.requireNonNull(builder.parameters, this, "parameters");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.timingStats = ApiTypeHelper.requireNonNull(builder.timingStats, this, "timingStats");

	}

	public static DataframeAnalyticsStatsOutlierDetection of(
			Function<Builder, ObjectBuilder<DataframeAnalyticsStatsOutlierDetection>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeAnalyticsStats variant kind.
	 */
	@Override
	public DataframeAnalyticsStats.Kind _dataframeAnalyticsStatsKind() {
		return DataframeAnalyticsStats.Kind.OutlierDetectionStats;
	}

	/**
	 * Required - The list of job parameters specified by the user or determined by
	 * algorithmic heuristics.
	 * <p>
	 * API name: {@code parameters}
	 */
	public final OutlierDetectionParameters parameters() {
		return this.parameters;
	}

	/**
	 * Required - The timestamp when the statistics were reported in milliseconds
	 * since the epoch.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - An object containing time statistics about the data frame
	 * analytics job.
	 * <p>
	 * API name: {@code timing_stats}
	 */
	public final TimingStats timingStats() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsOutlierDetection}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalyticsStatsOutlierDetection> {
		private OutlierDetectionParameters parameters;

		private Long timestamp;

		private TimingStats timingStats;

		/**
		 * Required - The list of job parameters specified by the user or determined by
		 * algorithmic heuristics.
		 * <p>
		 * API name: {@code parameters}
		 */
		public final Builder parameters(OutlierDetectionParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * Required - The list of job parameters specified by the user or determined by
		 * algorithmic heuristics.
		 * <p>
		 * API name: {@code parameters}
		 */
		public final Builder parameters(
				Function<OutlierDetectionParameters.Builder, ObjectBuilder<OutlierDetectionParameters>> fn) {
			return this.parameters(fn.apply(new OutlierDetectionParameters.Builder()).build());
		}

		/**
		 * Required - The timestamp when the statistics were reported in milliseconds
		 * since the epoch.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - An object containing time statistics about the data frame
		 * analytics job.
		 * <p>
		 * API name: {@code timing_stats}
		 */
		public final Builder timingStats(TimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * Required - An object containing time statistics about the data frame
		 * analytics job.
		 * <p>
		 * API name: {@code timing_stats}
		 */
		public final Builder timingStats(Function<TimingStats.Builder, ObjectBuilder<TimingStats>> fn) {
			return this.timingStats(fn.apply(new TimingStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsOutlierDetection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsOutlierDetection build() {
			_checkSingleUse();

			return new DataframeAnalyticsStatsOutlierDetection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsOutlierDetection}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsOutlierDetection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalyticsStatsOutlierDetection::setupDataframeAnalyticsStatsOutlierDetectionDeserializer);

	protected static void setupDataframeAnalyticsStatsOutlierDetectionDeserializer(
			ObjectDeserializer<DataframeAnalyticsStatsOutlierDetection.Builder> op) {

		op.add(Builder::parameters, OutlierDetectionParameters._DESERIALIZER, "parameters");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::timingStats, TimingStats._DESERIALIZER, "timing_stats");

	}

}
