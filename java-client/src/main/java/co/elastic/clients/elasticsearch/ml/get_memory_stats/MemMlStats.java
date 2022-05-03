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

package co.elastic.clients.elasticsearch.ml.get_memory_stats;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_memory_stats.MemMlStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.get_memory_stats.MemMlStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class MemMlStats implements JsonpSerializable {
	@Nullable
	private final String anomalyDetectors;

	private final int anomalyDetectorsInBytes;

	@Nullable
	private final String dataFrameAnalytics;

	private final int dataFrameAnalyticsInBytes;

	@Nullable
	private final String max;

	private final int maxInBytes;

	@Nullable
	private final String nativeCodeOverhead;

	private final int nativeCodeOverheadInBytes;

	@Nullable
	private final String nativeInference;

	private final int nativeInferenceInBytes;

	// ---------------------------------------------------------------------------------------------

	private MemMlStats(Builder builder) {

		this.anomalyDetectors = builder.anomalyDetectors;
		this.anomalyDetectorsInBytes = ApiTypeHelper.requireNonNull(builder.anomalyDetectorsInBytes, this,
				"anomalyDetectorsInBytes");
		this.dataFrameAnalytics = builder.dataFrameAnalytics;
		this.dataFrameAnalyticsInBytes = ApiTypeHelper.requireNonNull(builder.dataFrameAnalyticsInBytes, this,
				"dataFrameAnalyticsInBytes");
		this.max = builder.max;
		this.maxInBytes = ApiTypeHelper.requireNonNull(builder.maxInBytes, this, "maxInBytes");
		this.nativeCodeOverhead = builder.nativeCodeOverhead;
		this.nativeCodeOverheadInBytes = ApiTypeHelper.requireNonNull(builder.nativeCodeOverheadInBytes, this,
				"nativeCodeOverheadInBytes");
		this.nativeInference = builder.nativeInference;
		this.nativeInferenceInBytes = ApiTypeHelper.requireNonNull(builder.nativeInferenceInBytes, this,
				"nativeInferenceInBytes");

	}

	public static MemMlStats of(Function<Builder, ObjectBuilder<MemMlStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Amount of native memory set aside for anomaly detection jobs.
	 * <p>
	 * API name: {@code anomaly_detectors}
	 */
	@Nullable
	public final String anomalyDetectors() {
		return this.anomalyDetectors;
	}

	/**
	 * Required - Amount of native memory, in bytes, set aside for anomaly detection
	 * jobs.
	 * <p>
	 * API name: {@code anomaly_detectors_in_bytes}
	 */
	public final int anomalyDetectorsInBytes() {
		return this.anomalyDetectorsInBytes;
	}

	/**
	 * Amount of native memory set aside for data frame analytics jobs.
	 * <p>
	 * API name: {@code data_frame_analytics}
	 */
	@Nullable
	public final String dataFrameAnalytics() {
		return this.dataFrameAnalytics;
	}

	/**
	 * Required - Amount of native memory, in bytes, set aside for data frame
	 * analytics jobs.
	 * <p>
	 * API name: {@code data_frame_analytics_in_bytes}
	 */
	public final int dataFrameAnalyticsInBytes() {
		return this.dataFrameAnalyticsInBytes;
	}

	/**
	 * Maximum amount of native memory (separate to the JVM heap) that may be used
	 * by machine learning native processes.
	 * <p>
	 * API name: {@code max}
	 */
	@Nullable
	public final String max() {
		return this.max;
	}

	/**
	 * Required - Maximum amount of native memory (separate to the JVM heap), in
	 * bytes, that may be used by machine learning native processes.
	 * <p>
	 * API name: {@code max_in_bytes}
	 */
	public final int maxInBytes() {
		return this.maxInBytes;
	}

	/**
	 * Amount of native memory set aside for loading machine learning native code
	 * shared libraries.
	 * <p>
	 * API name: {@code native_code_overhead}
	 */
	@Nullable
	public final String nativeCodeOverhead() {
		return this.nativeCodeOverhead;
	}

	/**
	 * Required - Amount of native memory, in bytes, set aside for loading machine
	 * learning native code shared libraries.
	 * <p>
	 * API name: {@code native_code_overhead_in_bytes}
	 */
	public final int nativeCodeOverheadInBytes() {
		return this.nativeCodeOverheadInBytes;
	}

	/**
	 * Amount of native memory set aside for trained models that have a PyTorch
	 * model_type.
	 * <p>
	 * API name: {@code native_inference}
	 */
	@Nullable
	public final String nativeInference() {
		return this.nativeInference;
	}

	/**
	 * Required - Amount of native memory, in bytes, set aside for trained models
	 * that have a PyTorch model_type.
	 * <p>
	 * API name: {@code native_inference_in_bytes}
	 */
	public final int nativeInferenceInBytes() {
		return this.nativeInferenceInBytes;
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

		if (this.anomalyDetectors != null) {
			generator.writeKey("anomaly_detectors");
			generator.write(this.anomalyDetectors);

		}
		generator.writeKey("anomaly_detectors_in_bytes");
		generator.write(this.anomalyDetectorsInBytes);

		if (this.dataFrameAnalytics != null) {
			generator.writeKey("data_frame_analytics");
			generator.write(this.dataFrameAnalytics);

		}
		generator.writeKey("data_frame_analytics_in_bytes");
		generator.write(this.dataFrameAnalyticsInBytes);

		if (this.max != null) {
			generator.writeKey("max");
			generator.write(this.max);

		}
		generator.writeKey("max_in_bytes");
		generator.write(this.maxInBytes);

		if (this.nativeCodeOverhead != null) {
			generator.writeKey("native_code_overhead");
			generator.write(this.nativeCodeOverhead);

		}
		generator.writeKey("native_code_overhead_in_bytes");
		generator.write(this.nativeCodeOverheadInBytes);

		if (this.nativeInference != null) {
			generator.writeKey("native_inference");
			generator.write(this.nativeInference);

		}
		generator.writeKey("native_inference_in_bytes");
		generator.write(this.nativeInferenceInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MemMlStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MemMlStats> {
		@Nullable
		private String anomalyDetectors;

		private Integer anomalyDetectorsInBytes;

		@Nullable
		private String dataFrameAnalytics;

		private Integer dataFrameAnalyticsInBytes;

		@Nullable
		private String max;

		private Integer maxInBytes;

		@Nullable
		private String nativeCodeOverhead;

		private Integer nativeCodeOverheadInBytes;

		@Nullable
		private String nativeInference;

		private Integer nativeInferenceInBytes;

		/**
		 * Amount of native memory set aside for anomaly detection jobs.
		 * <p>
		 * API name: {@code anomaly_detectors}
		 */
		public final Builder anomalyDetectors(@Nullable String value) {
			this.anomalyDetectors = value;
			return this;
		}

		/**
		 * Required - Amount of native memory, in bytes, set aside for anomaly detection
		 * jobs.
		 * <p>
		 * API name: {@code anomaly_detectors_in_bytes}
		 */
		public final Builder anomalyDetectorsInBytes(int value) {
			this.anomalyDetectorsInBytes = value;
			return this;
		}

		/**
		 * Amount of native memory set aside for data frame analytics jobs.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 */
		public final Builder dataFrameAnalytics(@Nullable String value) {
			this.dataFrameAnalytics = value;
			return this;
		}

		/**
		 * Required - Amount of native memory, in bytes, set aside for data frame
		 * analytics jobs.
		 * <p>
		 * API name: {@code data_frame_analytics_in_bytes}
		 */
		public final Builder dataFrameAnalyticsInBytes(int value) {
			this.dataFrameAnalyticsInBytes = value;
			return this;
		}

		/**
		 * Maximum amount of native memory (separate to the JVM heap) that may be used
		 * by machine learning native processes.
		 * <p>
		 * API name: {@code max}
		 */
		public final Builder max(@Nullable String value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - Maximum amount of native memory (separate to the JVM heap), in
		 * bytes, that may be used by machine learning native processes.
		 * <p>
		 * API name: {@code max_in_bytes}
		 */
		public final Builder maxInBytes(int value) {
			this.maxInBytes = value;
			return this;
		}

		/**
		 * Amount of native memory set aside for loading machine learning native code
		 * shared libraries.
		 * <p>
		 * API name: {@code native_code_overhead}
		 */
		public final Builder nativeCodeOverhead(@Nullable String value) {
			this.nativeCodeOverhead = value;
			return this;
		}

		/**
		 * Required - Amount of native memory, in bytes, set aside for loading machine
		 * learning native code shared libraries.
		 * <p>
		 * API name: {@code native_code_overhead_in_bytes}
		 */
		public final Builder nativeCodeOverheadInBytes(int value) {
			this.nativeCodeOverheadInBytes = value;
			return this;
		}

		/**
		 * Amount of native memory set aside for trained models that have a PyTorch
		 * model_type.
		 * <p>
		 * API name: {@code native_inference}
		 */
		public final Builder nativeInference(@Nullable String value) {
			this.nativeInference = value;
			return this;
		}

		/**
		 * Required - Amount of native memory, in bytes, set aside for trained models
		 * that have a PyTorch model_type.
		 * <p>
		 * API name: {@code native_inference_in_bytes}
		 */
		public final Builder nativeInferenceInBytes(int value) {
			this.nativeInferenceInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MemMlStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MemMlStats build() {
			_checkSingleUse();

			return new MemMlStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MemMlStats}
	 */
	public static final JsonpDeserializer<MemMlStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MemMlStats::setupMemMlStatsDeserializer);

	protected static void setupMemMlStatsDeserializer(ObjectDeserializer<MemMlStats.Builder> op) {

		op.add(Builder::anomalyDetectors, JsonpDeserializer.stringDeserializer(), "anomaly_detectors");
		op.add(Builder::anomalyDetectorsInBytes, JsonpDeserializer.integerDeserializer(), "anomaly_detectors_in_bytes");
		op.add(Builder::dataFrameAnalytics, JsonpDeserializer.stringDeserializer(), "data_frame_analytics");
		op.add(Builder::dataFrameAnalyticsInBytes, JsonpDeserializer.integerDeserializer(),
				"data_frame_analytics_in_bytes");
		op.add(Builder::max, JsonpDeserializer.stringDeserializer(), "max");
		op.add(Builder::maxInBytes, JsonpDeserializer.integerDeserializer(), "max_in_bytes");
		op.add(Builder::nativeCodeOverhead, JsonpDeserializer.stringDeserializer(), "native_code_overhead");
		op.add(Builder::nativeCodeOverheadInBytes, JsonpDeserializer.integerDeserializer(),
				"native_code_overhead_in_bytes");
		op.add(Builder::nativeInference, JsonpDeserializer.stringDeserializer(), "native_inference");
		op.add(Builder::nativeInferenceInBytes, JsonpDeserializer.integerDeserializer(), "native_inference_in_bytes");

	}

}
