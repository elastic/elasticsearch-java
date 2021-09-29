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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelInferenceStats
@JsonpDeserializable
public final class TrainedModelInferenceStats implements JsonpSerializable {
	private final long failureCount;

	private final long inferenceCount;

	private final long cacheMissCount;

	private final long missingAllFieldsCount;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	public TrainedModelInferenceStats(Builder builder) {

		this.failureCount = Objects.requireNonNull(builder.failureCount, "failure_count");
		this.inferenceCount = Objects.requireNonNull(builder.inferenceCount, "inference_count");
		this.cacheMissCount = Objects.requireNonNull(builder.cacheMissCount, "cache_miss_count");
		this.missingAllFieldsCount = Objects.requireNonNull(builder.missingAllFieldsCount, "missing_all_fields_count");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	public TrainedModelInferenceStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The number of failures when using the model for inference.
	 * <p>
	 * API name: {@code failure_count}
	 */
	public long failureCount() {
		return this.failureCount;
	}

	/**
	 * The total number of times the model has been called for inference. This is
	 * across all inference contexts, including all pipelines.
	 * <p>
	 * API name: {@code inference_count}
	 */
	public long inferenceCount() {
		return this.inferenceCount;
	}

	/**
	 * The number of times the model was loaded for inference and was not retrieved
	 * from the cache. If this number is close to the inference_count, then the
	 * cache is not being appropriately used. This can be solved by increasing the
	 * cache size or its time-to-live (TTL). See General machine learning settings
	 * for the appropriate settings.
	 * <p>
	 * API name: {@code cache_miss_count}
	 */
	public long cacheMissCount() {
		return this.cacheMissCount;
	}

	/**
	 * The number of inference calls where all the training features for the model
	 * were missing.
	 * <p>
	 * API name: {@code missing_all_fields_count}
	 */
	public long missingAllFieldsCount() {
		return this.missingAllFieldsCount;
	}

	/**
	 * The time when the statistics were last updated.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
		return this.timestamp;
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

		generator.writeKey("failure_count");
		generator.write(this.failureCount);

		generator.writeKey("inference_count");
		generator.write(this.inferenceCount);

		generator.writeKey("cache_miss_count");
		generator.write(this.cacheMissCount);

		generator.writeKey("missing_all_fields_count");
		generator.write(this.missingAllFieldsCount);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelInferenceStats}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelInferenceStats> {
		private Long failureCount;

		private Long inferenceCount;

		private Long cacheMissCount;

		private Long missingAllFieldsCount;

		private String timestamp;

		/**
		 * The number of failures when using the model for inference.
		 * <p>
		 * API name: {@code failure_count}
		 */
		public Builder failureCount(long value) {
			this.failureCount = value;
			return this;
		}

		/**
		 * The total number of times the model has been called for inference. This is
		 * across all inference contexts, including all pipelines.
		 * <p>
		 * API name: {@code inference_count}
		 */
		public Builder inferenceCount(long value) {
			this.inferenceCount = value;
			return this;
		}

		/**
		 * The number of times the model was loaded for inference and was not retrieved
		 * from the cache. If this number is close to the inference_count, then the
		 * cache is not being appropriately used. This can be solved by increasing the
		 * cache size or its time-to-live (TTL). See General machine learning settings
		 * for the appropriate settings.
		 * <p>
		 * API name: {@code cache_miss_count}
		 */
		public Builder cacheMissCount(long value) {
			this.cacheMissCount = value;
			return this;
		}

		/**
		 * The number of inference calls where all the training features for the model
		 * were missing.
		 * <p>
		 * API name: {@code missing_all_fields_count}
		 */
		public Builder missingAllFieldsCount(long value) {
			this.missingAllFieldsCount = value;
			return this;
		}

		/**
		 * The time when the statistics were last updated.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link TrainedModelInferenceStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelInferenceStats build() {

			return new TrainedModelInferenceStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelInferenceStats}
	 */
	public static final JsonpDeserializer<TrainedModelInferenceStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, TrainedModelInferenceStats::setupTrainedModelInferenceStatsDeserializer, Builder::build);

	protected static void setupTrainedModelInferenceStatsDeserializer(
			DelegatingDeserializer<TrainedModelInferenceStats.Builder> op) {

		op.add(Builder::failureCount, JsonpDeserializer.longDeserializer(), "failure_count");
		op.add(Builder::inferenceCount, JsonpDeserializer.longDeserializer(), "inference_count");
		op.add(Builder::cacheMissCount, JsonpDeserializer.longDeserializer(), "cache_miss_count");
		op.add(Builder::missingAllFieldsCount, JsonpDeserializer.longDeserializer(), "missing_all_fields_count");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
