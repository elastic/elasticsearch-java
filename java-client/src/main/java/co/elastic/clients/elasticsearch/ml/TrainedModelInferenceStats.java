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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelInferenceStats

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/ml/_types/TrainedModel.ts#L41-L55">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelInferenceStats implements JsonpSerializable {
	private final long failureCount;

	private final long inferenceCount;

	private final long cacheMissCount;

	private final long missingAllFieldsCount;

	private final Time timestamp;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelInferenceStats(Builder builder) {

		this.failureCount = ApiTypeHelper.requireNonNull(builder.failureCount, this, "failureCount");
		this.inferenceCount = ApiTypeHelper.requireNonNull(builder.inferenceCount, this, "inferenceCount");
		this.cacheMissCount = ApiTypeHelper.requireNonNull(builder.cacheMissCount, this, "cacheMissCount");
		this.missingAllFieldsCount = ApiTypeHelper.requireNonNull(builder.missingAllFieldsCount, this,
				"missingAllFieldsCount");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static TrainedModelInferenceStats of(Function<Builder, ObjectBuilder<TrainedModelInferenceStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of failures when using the model for inference.
	 * <p>
	 * API name: {@code failure_count}
	 */
	public final long failureCount() {
		return this.failureCount;
	}

	/**
	 * Required - The total number of times the model has been called for inference.
	 * This is across all inference contexts, including all pipelines.
	 * <p>
	 * API name: {@code inference_count}
	 */
	public final long inferenceCount() {
		return this.inferenceCount;
	}

	/**
	 * Required - The number of times the model was loaded for inference and was not
	 * retrieved from the cache. If this number is close to the inference_count,
	 * then the cache is not being appropriately used. This can be solved by
	 * increasing the cache size or its time-to-live (TTL). See General machine
	 * learning settings for the appropriate settings.
	 * <p>
	 * API name: {@code cache_miss_count}
	 */
	public final long cacheMissCount() {
		return this.cacheMissCount;
	}

	/**
	 * Required - The number of inference calls where all the training features for
	 * the model were missing.
	 * <p>
	 * API name: {@code missing_all_fields_count}
	 */
	public final long missingAllFieldsCount() {
		return this.missingAllFieldsCount;
	}

	/**
	 * Required - The time when the statistics were last updated.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public final Time timestamp() {
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
		this.timestamp.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelInferenceStats}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TrainedModelInferenceStats> {
		private Long failureCount;

		private Long inferenceCount;

		private Long cacheMissCount;

		private Long missingAllFieldsCount;

		private Time timestamp;

		/**
		 * Required - The number of failures when using the model for inference.
		 * <p>
		 * API name: {@code failure_count}
		 */
		public final Builder failureCount(long value) {
			this.failureCount = value;
			return this;
		}

		/**
		 * Required - The total number of times the model has been called for inference.
		 * This is across all inference contexts, including all pipelines.
		 * <p>
		 * API name: {@code inference_count}
		 */
		public final Builder inferenceCount(long value) {
			this.inferenceCount = value;
			return this;
		}

		/**
		 * Required - The number of times the model was loaded for inference and was not
		 * retrieved from the cache. If this number is close to the inference_count,
		 * then the cache is not being appropriately used. This can be solved by
		 * increasing the cache size or its time-to-live (TTL). See General machine
		 * learning settings for the appropriate settings.
		 * <p>
		 * API name: {@code cache_miss_count}
		 */
		public final Builder cacheMissCount(long value) {
			this.cacheMissCount = value;
			return this;
		}

		/**
		 * Required - The number of inference calls where all the training features for
		 * the model were missing.
		 * <p>
		 * API name: {@code missing_all_fields_count}
		 */
		public final Builder missingAllFieldsCount(long value) {
			this.missingAllFieldsCount = value;
			return this;
		}

		/**
		 * Required - The time when the statistics were last updated.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(Time value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - The time when the statistics were last updated.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timestamp(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Builds a {@link TrainedModelInferenceStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelInferenceStats build() {
			_checkSingleUse();

			return new TrainedModelInferenceStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelInferenceStats}
	 */
	public static final JsonpDeserializer<TrainedModelInferenceStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelInferenceStats::setupTrainedModelInferenceStatsDeserializer);

	protected static void setupTrainedModelInferenceStatsDeserializer(
			ObjectDeserializer<TrainedModelInferenceStats.Builder> op) {

		op.add(Builder::failureCount, JsonpDeserializer.longDeserializer(), "failure_count");
		op.add(Builder::inferenceCount, JsonpDeserializer.longDeserializer(), "inference_count");
		op.add(Builder::cacheMissCount, JsonpDeserializer.longDeserializer(), "cache_miss_count");
		op.add(Builder::missingAllFieldsCount, JsonpDeserializer.longDeserializer(), "missing_all_fields_count");
		op.add(Builder::timestamp, Time._DESERIALIZER, "timestamp");

	}

}
