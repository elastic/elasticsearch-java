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

import co.elastic.clients.json.JsonData;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.TrainedModelStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelStats implements JsonpSerializable {
	@Nullable
	private final TrainedModelDeploymentStats deploymentStats;

	@Nullable
	private final TrainedModelInferenceStats inferenceStats;

	private final Map<String, JsonData> ingest;

	private final String modelId;

	private final TrainedModelSizeStats modelSizeStats;

	private final int pipelineCount;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelStats(Builder builder) {

		this.deploymentStats = builder.deploymentStats;
		this.inferenceStats = builder.inferenceStats;
		this.ingest = ApiTypeHelper.unmodifiable(builder.ingest);
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.modelSizeStats = ApiTypeHelper.requireNonNull(builder.modelSizeStats, this, "modelSizeStats");
		this.pipelineCount = ApiTypeHelper.requireNonNull(builder.pipelineCount, this, "pipelineCount");

	}

	public static TrainedModelStats of(Function<Builder, ObjectBuilder<TrainedModelStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A collection of deployment stats, which is present when the models are
	 * deployed.
	 * <p>
	 * API name: {@code deployment_stats}
	 */
	@Nullable
	public final TrainedModelDeploymentStats deploymentStats() {
		return this.deploymentStats;
	}

	/**
	 * A collection of inference stats fields.
	 * <p>
	 * API name: {@code inference_stats}
	 */
	@Nullable
	public final TrainedModelInferenceStats inferenceStats() {
		return this.inferenceStats;
	}

	/**
	 * A collection of ingest stats for the model across all nodes. The values are
	 * summations of the individual node statistics. The format matches the ingest
	 * section in the nodes stats API.
	 * <p>
	 * API name: {@code ingest}
	 */
	public final Map<String, JsonData> ingest() {
		return this.ingest;
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - A collection of model size stats.
	 * <p>
	 * API name: {@code model_size_stats}
	 */
	public final TrainedModelSizeStats modelSizeStats() {
		return this.modelSizeStats;
	}

	/**
	 * Required - The number of ingest pipelines that currently refer to the model.
	 * <p>
	 * API name: {@code pipeline_count}
	 */
	public final int pipelineCount() {
		return this.pipelineCount;
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

		if (this.deploymentStats != null) {
			generator.writeKey("deployment_stats");
			this.deploymentStats.serialize(generator, mapper);

		}
		if (this.inferenceStats != null) {
			generator.writeKey("inference_stats");
			this.inferenceStats.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.ingest)) {
			generator.writeKey("ingest");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.ingest.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("model_size_stats");
		this.modelSizeStats.serialize(generator, mapper);

		generator.writeKey("pipeline_count");
		generator.write(this.pipelineCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TrainedModelStats> {
		@Nullable
		private TrainedModelDeploymentStats deploymentStats;

		@Nullable
		private TrainedModelInferenceStats inferenceStats;

		@Nullable
		private Map<String, JsonData> ingest;

		private String modelId;

		private TrainedModelSizeStats modelSizeStats;

		private Integer pipelineCount;

		/**
		 * A collection of deployment stats, which is present when the models are
		 * deployed.
		 * <p>
		 * API name: {@code deployment_stats}
		 */
		public final Builder deploymentStats(@Nullable TrainedModelDeploymentStats value) {
			this.deploymentStats = value;
			return this;
		}

		/**
		 * A collection of deployment stats, which is present when the models are
		 * deployed.
		 * <p>
		 * API name: {@code deployment_stats}
		 */
		public final Builder deploymentStats(
				Function<TrainedModelDeploymentStats.Builder, ObjectBuilder<TrainedModelDeploymentStats>> fn) {
			return this.deploymentStats(fn.apply(new TrainedModelDeploymentStats.Builder()).build());
		}

		/**
		 * A collection of inference stats fields.
		 * <p>
		 * API name: {@code inference_stats}
		 */
		public final Builder inferenceStats(@Nullable TrainedModelInferenceStats value) {
			this.inferenceStats = value;
			return this;
		}

		/**
		 * A collection of inference stats fields.
		 * <p>
		 * API name: {@code inference_stats}
		 */
		public final Builder inferenceStats(
				Function<TrainedModelInferenceStats.Builder, ObjectBuilder<TrainedModelInferenceStats>> fn) {
			return this.inferenceStats(fn.apply(new TrainedModelInferenceStats.Builder()).build());
		}

		/**
		 * A collection of ingest stats for the model across all nodes. The values are
		 * summations of the individual node statistics. The format matches the ingest
		 * section in the nodes stats API.
		 * <p>
		 * API name: {@code ingest}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ingest</code>.
		 */
		public final Builder ingest(Map<String, JsonData> map) {
			this.ingest = _mapPutAll(this.ingest, map);
			return this;
		}

		/**
		 * A collection of ingest stats for the model across all nodes. The values are
		 * summations of the individual node statistics. The format matches the ingest
		 * section in the nodes stats API.
		 * <p>
		 * API name: {@code ingest}
		 * <p>
		 * Adds an entry to <code>ingest</code>.
		 */
		public final Builder ingest(String key, JsonData value) {
			this.ingest = _mapPut(this.ingest, key, value);
			return this;
		}

		/**
		 * Required - The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - A collection of model size stats.
		 * <p>
		 * API name: {@code model_size_stats}
		 */
		public final Builder modelSizeStats(TrainedModelSizeStats value) {
			this.modelSizeStats = value;
			return this;
		}

		/**
		 * Required - A collection of model size stats.
		 * <p>
		 * API name: {@code model_size_stats}
		 */
		public final Builder modelSizeStats(
				Function<TrainedModelSizeStats.Builder, ObjectBuilder<TrainedModelSizeStats>> fn) {
			return this.modelSizeStats(fn.apply(new TrainedModelSizeStats.Builder()).build());
		}

		/**
		 * Required - The number of ingest pipelines that currently refer to the model.
		 * <p>
		 * API name: {@code pipeline_count}
		 */
		public final Builder pipelineCount(int value) {
			this.pipelineCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelStats build() {
			_checkSingleUse();

			return new TrainedModelStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelStats}
	 */
	public static final JsonpDeserializer<TrainedModelStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelStats::setupTrainedModelStatsDeserializer);

	protected static void setupTrainedModelStatsDeserializer(ObjectDeserializer<TrainedModelStats.Builder> op) {

		op.add(Builder::deploymentStats, TrainedModelDeploymentStats._DESERIALIZER, "deployment_stats");
		op.add(Builder::inferenceStats, TrainedModelInferenceStats._DESERIALIZER, "inference_stats");
		op.add(Builder::ingest, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "ingest");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::modelSizeStats, TrainedModelSizeStats._DESERIALIZER, "model_size_stats");
		op.add(Builder::pipelineCount, JsonpDeserializer.integerDeserializer(), "pipeline_count");

	}

}
