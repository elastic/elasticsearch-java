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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.validate.Request

/**
 * Validates an anomaly detection job.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.validate.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ValidateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final AnalysisConfig analysisConfig;

	@Nullable
	private final AnalysisLimits analysisLimits;

	@Nullable
	private final DataDescription dataDescription;

	@Nullable
	private final String description;

	@Nullable
	private final String jobId;

	@Nullable
	private final ModelPlotConfig modelPlot;

	@Nullable
	private final String modelSnapshotId;

	@Nullable
	private final Long modelSnapshotRetentionDays;

	@Nullable
	private final String resultsIndexName;

	// ---------------------------------------------------------------------------------------------

	private ValidateRequest(Builder builder) {

		this.analysisConfig = builder.analysisConfig;
		this.analysisLimits = builder.analysisLimits;
		this.dataDescription = builder.dataDescription;
		this.description = builder.description;
		this.jobId = builder.jobId;
		this.modelPlot = builder.modelPlot;
		this.modelSnapshotId = builder.modelSnapshotId;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.resultsIndexName = builder.resultsIndexName;

	}

	public static ValidateRequest of(Function<Builder, ObjectBuilder<ValidateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code analysis_config}
	 */
	@Nullable
	public final AnalysisConfig analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * API name: {@code analysis_limits}
	 */
	@Nullable
	public final AnalysisLimits analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * API name: {@code data_description}
	 */
	@Nullable
	public final DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code job_id}
	 */
	@Nullable
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code model_plot}
	 */
	@Nullable
	public final ModelPlotConfig modelPlot() {
		return this.modelPlot;
	}

	/**
	 * API name: {@code model_snapshot_id}
	 */
	@Nullable
	public final String modelSnapshotId() {
		return this.modelSnapshotId;
	}

	/**
	 * API name: {@code model_snapshot_retention_days}
	 */
	@Nullable
	public final Long modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code results_index_name}
	 */
	@Nullable
	public final String resultsIndexName() {
		return this.resultsIndexName;
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

		if (this.analysisConfig != null) {
			generator.writeKey("analysis_config");
			this.analysisConfig.serialize(generator, mapper);

		}
		if (this.analysisLimits != null) {
			generator.writeKey("analysis_limits");
			this.analysisLimits.serialize(generator, mapper);

		}
		if (this.dataDescription != null) {
			generator.writeKey("data_description");
			this.dataDescription.serialize(generator, mapper);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.jobId != null) {
			generator.writeKey("job_id");
			generator.write(this.jobId);

		}
		if (this.modelPlot != null) {
			generator.writeKey("model_plot");
			this.modelPlot.serialize(generator, mapper);

		}
		if (this.modelSnapshotId != null) {
			generator.writeKey("model_snapshot_id");
			generator.write(this.modelSnapshotId);

		}
		if (this.modelSnapshotRetentionDays != null) {
			generator.writeKey("model_snapshot_retention_days");
			generator.write(this.modelSnapshotRetentionDays);

		}
		if (this.resultsIndexName != null) {
			generator.writeKey("results_index_name");
			generator.write(this.resultsIndexName);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ValidateRequest> {
		@Nullable
		private AnalysisConfig analysisConfig;

		@Nullable
		private AnalysisLimits analysisLimits;

		@Nullable
		private DataDescription dataDescription;

		@Nullable
		private String description;

		@Nullable
		private String jobId;

		@Nullable
		private ModelPlotConfig modelPlot;

		@Nullable
		private String modelSnapshotId;

		@Nullable
		private Long modelSnapshotRetentionDays;

		@Nullable
		private String resultsIndexName;

		/**
		 * API name: {@code analysis_config}
		 */
		public final Builder analysisConfig(@Nullable AnalysisConfig value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public final Builder analysisConfig(Function<AnalysisConfig.Builder, ObjectBuilder<AnalysisConfig>> fn) {
			return this.analysisConfig(fn.apply(new AnalysisConfig.Builder()).build());
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(@Nullable AnalysisLimits value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(Function<AnalysisLimits.Builder, ObjectBuilder<AnalysisLimits>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisLimits.Builder()).build());
		}

		/**
		 * API name: {@code data_description}
		 */
		public final Builder dataDescription(@Nullable DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * API name: {@code data_description}
		 */
		public final Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public final Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code model_plot}
		 */
		public final Builder modelPlot(@Nullable ModelPlotConfig value) {
			this.modelPlot = value;
			return this;
		}

		/**
		 * API name: {@code model_plot}
		 */
		public final Builder modelPlot(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlot(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * API name: {@code model_snapshot_id}
		 */
		public final Builder modelSnapshotId(@Nullable String value) {
			this.modelSnapshotId = value;
			return this;
		}

		/**
		 * API name: {@code model_snapshot_retention_days}
		 */
		public final Builder modelSnapshotRetentionDays(@Nullable Long value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code results_index_name}
		 */
		public final Builder resultsIndexName(@Nullable String value) {
			this.resultsIndexName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ValidateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateRequest build() {
			_checkSingleUse();

			return new ValidateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ValidateRequest}
	 */
	public static final JsonpDeserializer<ValidateRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ValidateRequest::setupValidateRequestDeserializer);

	protected static void setupValidateRequestDeserializer(ObjectDeserializer<ValidateRequest.Builder> op) {

		op.add(Builder::analysisConfig, AnalysisConfig._DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits._DESERIALIZER, "analysis_limits");
		op.add(Builder::dataDescription, DataDescription._DESERIALIZER, "data_description");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::modelPlot, ModelPlotConfig._DESERIALIZER, "model_plot");
		op.add(Builder::modelSnapshotId, JsonpDeserializer.stringDeserializer(), "model_snapshot_id");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.longDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.validate}".
	 */
	public static final Endpoint<ValidateRequest, ValidateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.validate",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/anomaly_detectors/_validate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ValidateResponse._DESERIALIZER);
}
