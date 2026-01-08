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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.String;
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

// typedef: indices.get_sample_stats.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.get_sample_stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSampleStatsResponse implements JsonpSerializable {
	private final long potentialSamples;

	private final long samplesRejectedForMaxSamplesExceeded;

	private final long samplesRejectedForCondition;

	private final long samplesRejectedForRate;

	private final long samplesRejectedForException;

	private final long samplesRejectedForSize;

	private final long samplesAccepted;

	@Nullable
	private final Time timeSampling;

	private final long timeSamplingMillis;

	@Nullable
	private final Time timeEvaluatingCondition;

	private final long timeEvaluatingConditionMillis;

	@Nullable
	private final Time timeCompilingCondition;

	private final long timeCompilingConditionMillis;

	@Nullable
	private final String lastException;

	// ---------------------------------------------------------------------------------------------

	private GetSampleStatsResponse(Builder builder) {

		this.potentialSamples = ApiTypeHelper.requireNonNull(builder.potentialSamples, this, "potentialSamples", 0);
		this.samplesRejectedForMaxSamplesExceeded = ApiTypeHelper.requireNonNull(
				builder.samplesRejectedForMaxSamplesExceeded, this, "samplesRejectedForMaxSamplesExceeded", 0);
		this.samplesRejectedForCondition = ApiTypeHelper.requireNonNull(builder.samplesRejectedForCondition, this,
				"samplesRejectedForCondition", 0);
		this.samplesRejectedForRate = ApiTypeHelper.requireNonNull(builder.samplesRejectedForRate, this,
				"samplesRejectedForRate", 0);
		this.samplesRejectedForException = ApiTypeHelper.requireNonNull(builder.samplesRejectedForException, this,
				"samplesRejectedForException", 0);
		this.samplesRejectedForSize = ApiTypeHelper.requireNonNull(builder.samplesRejectedForSize, this,
				"samplesRejectedForSize", 0);
		this.samplesAccepted = ApiTypeHelper.requireNonNull(builder.samplesAccepted, this, "samplesAccepted", 0);
		this.timeSampling = builder.timeSampling;
		this.timeSamplingMillis = ApiTypeHelper.requireNonNull(builder.timeSamplingMillis, this, "timeSamplingMillis",
				0);
		this.timeEvaluatingCondition = builder.timeEvaluatingCondition;
		this.timeEvaluatingConditionMillis = ApiTypeHelper.requireNonNull(builder.timeEvaluatingConditionMillis, this,
				"timeEvaluatingConditionMillis", 0);
		this.timeCompilingCondition = builder.timeCompilingCondition;
		this.timeCompilingConditionMillis = ApiTypeHelper.requireNonNull(builder.timeCompilingConditionMillis, this,
				"timeCompilingConditionMillis", 0);
		this.lastException = builder.lastException;

	}

	public static GetSampleStatsResponse of(Function<Builder, ObjectBuilder<GetSampleStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code potential_samples}
	 */
	public final long potentialSamples() {
		return this.potentialSamples;
	}

	/**
	 * Required - API name: {@code samples_rejected_for_max_samples_exceeded}
	 */
	public final long samplesRejectedForMaxSamplesExceeded() {
		return this.samplesRejectedForMaxSamplesExceeded;
	}

	/**
	 * Required - API name: {@code samples_rejected_for_condition}
	 */
	public final long samplesRejectedForCondition() {
		return this.samplesRejectedForCondition;
	}

	/**
	 * Required - API name: {@code samples_rejected_for_rate}
	 */
	public final long samplesRejectedForRate() {
		return this.samplesRejectedForRate;
	}

	/**
	 * Required - API name: {@code samples_rejected_for_exception}
	 */
	public final long samplesRejectedForException() {
		return this.samplesRejectedForException;
	}

	/**
	 * Required - API name: {@code samples_rejected_for_size}
	 */
	public final long samplesRejectedForSize() {
		return this.samplesRejectedForSize;
	}

	/**
	 * Required - API name: {@code samples_accepted}
	 */
	public final long samplesAccepted() {
		return this.samplesAccepted;
	}

	/**
	 * API name: {@code time_sampling}
	 */
	@Nullable
	public final Time timeSampling() {
		return this.timeSampling;
	}

	/**
	 * Required - API name: {@code time_sampling_millis}
	 */
	public final long timeSamplingMillis() {
		return this.timeSamplingMillis;
	}

	/**
	 * API name: {@code time_evaluating_condition}
	 */
	@Nullable
	public final Time timeEvaluatingCondition() {
		return this.timeEvaluatingCondition;
	}

	/**
	 * Required - API name: {@code time_evaluating_condition_millis}
	 */
	public final long timeEvaluatingConditionMillis() {
		return this.timeEvaluatingConditionMillis;
	}

	/**
	 * API name: {@code time_compiling_condition}
	 */
	@Nullable
	public final Time timeCompilingCondition() {
		return this.timeCompilingCondition;
	}

	/**
	 * Required - API name: {@code time_compiling_condition_millis}
	 */
	public final long timeCompilingConditionMillis() {
		return this.timeCompilingConditionMillis;
	}

	/**
	 * API name: {@code last_exception}
	 */
	@Nullable
	public final String lastException() {
		return this.lastException;
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

		generator.writeKey("potential_samples");
		generator.write(this.potentialSamples);

		generator.writeKey("samples_rejected_for_max_samples_exceeded");
		generator.write(this.samplesRejectedForMaxSamplesExceeded);

		generator.writeKey("samples_rejected_for_condition");
		generator.write(this.samplesRejectedForCondition);

		generator.writeKey("samples_rejected_for_rate");
		generator.write(this.samplesRejectedForRate);

		generator.writeKey("samples_rejected_for_exception");
		generator.write(this.samplesRejectedForException);

		generator.writeKey("samples_rejected_for_size");
		generator.write(this.samplesRejectedForSize);

		generator.writeKey("samples_accepted");
		generator.write(this.samplesAccepted);

		if (this.timeSampling != null) {
			generator.writeKey("time_sampling");
			this.timeSampling.serialize(generator, mapper);

		}
		generator.writeKey("time_sampling_millis");
		generator.write(this.timeSamplingMillis);

		if (this.timeEvaluatingCondition != null) {
			generator.writeKey("time_evaluating_condition");
			this.timeEvaluatingCondition.serialize(generator, mapper);

		}
		generator.writeKey("time_evaluating_condition_millis");
		generator.write(this.timeEvaluatingConditionMillis);

		if (this.timeCompilingCondition != null) {
			generator.writeKey("time_compiling_condition");
			this.timeCompilingCondition.serialize(generator, mapper);

		}
		generator.writeKey("time_compiling_condition_millis");
		generator.write(this.timeCompilingConditionMillis);

		if (this.lastException != null) {
			generator.writeKey("last_exception");
			generator.write(this.lastException);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSampleStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetSampleStatsResponse> {
		private Long potentialSamples;

		private Long samplesRejectedForMaxSamplesExceeded;

		private Long samplesRejectedForCondition;

		private Long samplesRejectedForRate;

		private Long samplesRejectedForException;

		private Long samplesRejectedForSize;

		private Long samplesAccepted;

		@Nullable
		private Time timeSampling;

		private Long timeSamplingMillis;

		@Nullable
		private Time timeEvaluatingCondition;

		private Long timeEvaluatingConditionMillis;

		@Nullable
		private Time timeCompilingCondition;

		private Long timeCompilingConditionMillis;

		@Nullable
		private String lastException;

		/**
		 * Required - API name: {@code potential_samples}
		 */
		public final Builder potentialSamples(long value) {
			this.potentialSamples = value;
			return this;
		}

		/**
		 * Required - API name: {@code samples_rejected_for_max_samples_exceeded}
		 */
		public final Builder samplesRejectedForMaxSamplesExceeded(long value) {
			this.samplesRejectedForMaxSamplesExceeded = value;
			return this;
		}

		/**
		 * Required - API name: {@code samples_rejected_for_condition}
		 */
		public final Builder samplesRejectedForCondition(long value) {
			this.samplesRejectedForCondition = value;
			return this;
		}

		/**
		 * Required - API name: {@code samples_rejected_for_rate}
		 */
		public final Builder samplesRejectedForRate(long value) {
			this.samplesRejectedForRate = value;
			return this;
		}

		/**
		 * Required - API name: {@code samples_rejected_for_exception}
		 */
		public final Builder samplesRejectedForException(long value) {
			this.samplesRejectedForException = value;
			return this;
		}

		/**
		 * Required - API name: {@code samples_rejected_for_size}
		 */
		public final Builder samplesRejectedForSize(long value) {
			this.samplesRejectedForSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code samples_accepted}
		 */
		public final Builder samplesAccepted(long value) {
			this.samplesAccepted = value;
			return this;
		}

		/**
		 * API name: {@code time_sampling}
		 */
		public final Builder timeSampling(@Nullable Time value) {
			this.timeSampling = value;
			return this;
		}

		/**
		 * API name: {@code time_sampling}
		 */
		public final Builder timeSampling(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeSampling(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code time_sampling_millis}
		 */
		public final Builder timeSamplingMillis(long value) {
			this.timeSamplingMillis = value;
			return this;
		}

		/**
		 * API name: {@code time_evaluating_condition}
		 */
		public final Builder timeEvaluatingCondition(@Nullable Time value) {
			this.timeEvaluatingCondition = value;
			return this;
		}

		/**
		 * API name: {@code time_evaluating_condition}
		 */
		public final Builder timeEvaluatingCondition(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeEvaluatingCondition(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code time_evaluating_condition_millis}
		 */
		public final Builder timeEvaluatingConditionMillis(long value) {
			this.timeEvaluatingConditionMillis = value;
			return this;
		}

		/**
		 * API name: {@code time_compiling_condition}
		 */
		public final Builder timeCompilingCondition(@Nullable Time value) {
			this.timeCompilingCondition = value;
			return this;
		}

		/**
		 * API name: {@code time_compiling_condition}
		 */
		public final Builder timeCompilingCondition(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeCompilingCondition(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code time_compiling_condition_millis}
		 */
		public final Builder timeCompilingConditionMillis(long value) {
			this.timeCompilingConditionMillis = value;
			return this;
		}

		/**
		 * API name: {@code last_exception}
		 */
		public final Builder lastException(@Nullable String value) {
			this.lastException = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSampleStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSampleStatsResponse build() {
			_checkSingleUse();

			return new GetSampleStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSampleStatsResponse}
	 */
	public static final JsonpDeserializer<GetSampleStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSampleStatsResponse::setupGetSampleStatsResponseDeserializer);

	protected static void setupGetSampleStatsResponseDeserializer(
			ObjectDeserializer<GetSampleStatsResponse.Builder> op) {

		op.add(Builder::potentialSamples, JsonpDeserializer.longDeserializer(), "potential_samples");
		op.add(Builder::samplesRejectedForMaxSamplesExceeded, JsonpDeserializer.longDeserializer(),
				"samples_rejected_for_max_samples_exceeded");
		op.add(Builder::samplesRejectedForCondition, JsonpDeserializer.longDeserializer(),
				"samples_rejected_for_condition");
		op.add(Builder::samplesRejectedForRate, JsonpDeserializer.longDeserializer(), "samples_rejected_for_rate");
		op.add(Builder::samplesRejectedForException, JsonpDeserializer.longDeserializer(),
				"samples_rejected_for_exception");
		op.add(Builder::samplesRejectedForSize, JsonpDeserializer.longDeserializer(), "samples_rejected_for_size");
		op.add(Builder::samplesAccepted, JsonpDeserializer.longDeserializer(), "samples_accepted");
		op.add(Builder::timeSampling, Time._DESERIALIZER, "time_sampling");
		op.add(Builder::timeSamplingMillis, JsonpDeserializer.longDeserializer(), "time_sampling_millis");
		op.add(Builder::timeEvaluatingCondition, Time._DESERIALIZER, "time_evaluating_condition");
		op.add(Builder::timeEvaluatingConditionMillis, JsonpDeserializer.longDeserializer(),
				"time_evaluating_condition_millis");
		op.add(Builder::timeCompilingCondition, Time._DESERIALIZER, "time_compiling_condition");
		op.add(Builder::timeCompilingConditionMillis, JsonpDeserializer.longDeserializer(),
				"time_compiling_condition_millis");
		op.add(Builder::lastException, JsonpDeserializer.stringDeserializer(), "last_exception");

	}

}
