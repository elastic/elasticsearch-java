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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.elasticsearch.ml.JobStatistics;
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

// typedef: xpack.usage.MlInferenceDeployments

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlInferenceDeployments">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlInferenceDeployments implements JsonpSerializable {
	private final int count;

	private final JobStatistics inferenceCounts;

	private final JobStatistics modelSizesBytes;

	private final MlInferenceDeploymentsTimeMs timeMs;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceDeployments(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.inferenceCounts = ApiTypeHelper.requireNonNull(builder.inferenceCounts, this, "inferenceCounts");
		this.modelSizesBytes = ApiTypeHelper.requireNonNull(builder.modelSizesBytes, this, "modelSizesBytes");
		this.timeMs = ApiTypeHelper.requireNonNull(builder.timeMs, this, "timeMs");

	}

	public static MlInferenceDeployments of(Function<Builder, ObjectBuilder<MlInferenceDeployments>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code inference_counts}
	 */
	public final JobStatistics inferenceCounts() {
		return this.inferenceCounts;
	}

	/**
	 * Required - API name: {@code model_sizes_bytes}
	 */
	public final JobStatistics modelSizesBytes() {
		return this.modelSizesBytes;
	}

	/**
	 * Required - API name: {@code time_ms}
	 */
	public final MlInferenceDeploymentsTimeMs timeMs() {
		return this.timeMs;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("inference_counts");
		this.inferenceCounts.serialize(generator, mapper);

		generator.writeKey("model_sizes_bytes");
		this.modelSizesBytes.serialize(generator, mapper);

		generator.writeKey("time_ms");
		this.timeMs.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceDeployments}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlInferenceDeployments> {
		private Integer count;

		private JobStatistics inferenceCounts;

		private JobStatistics modelSizesBytes;

		private MlInferenceDeploymentsTimeMs timeMs;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code inference_counts}
		 */
		public final Builder inferenceCounts(JobStatistics value) {
			this.inferenceCounts = value;
			return this;
		}

		/**
		 * Required - API name: {@code inference_counts}
		 */
		public final Builder inferenceCounts(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.inferenceCounts(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code model_sizes_bytes}
		 */
		public final Builder modelSizesBytes(JobStatistics value) {
			this.modelSizesBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_sizes_bytes}
		 */
		public final Builder modelSizesBytes(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.modelSizesBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code time_ms}
		 */
		public final Builder timeMs(MlInferenceDeploymentsTimeMs value) {
			this.timeMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_ms}
		 */
		public final Builder timeMs(
				Function<MlInferenceDeploymentsTimeMs.Builder, ObjectBuilder<MlInferenceDeploymentsTimeMs>> fn) {
			return this.timeMs(fn.apply(new MlInferenceDeploymentsTimeMs.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlInferenceDeployments}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceDeployments build() {
			_checkSingleUse();

			return new MlInferenceDeployments(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceDeployments}
	 */
	public static final JsonpDeserializer<MlInferenceDeployments> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlInferenceDeployments::setupMlInferenceDeploymentsDeserializer);

	protected static void setupMlInferenceDeploymentsDeserializer(
			ObjectDeserializer<MlInferenceDeployments.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::inferenceCounts, JobStatistics._DESERIALIZER, "inference_counts");
		op.add(Builder::modelSizesBytes, JobStatistics._DESERIALIZER, "model_sizes_bytes");
		op.add(Builder::timeMs, MlInferenceDeploymentsTimeMs._DESERIALIZER, "time_ms");

	}

}
