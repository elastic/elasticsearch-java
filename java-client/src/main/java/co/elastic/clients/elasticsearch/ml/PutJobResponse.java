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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_job.Response
public final class PutJobResponse implements ToJsonp {
	private final Boolean allowLazyOpen;

	private final AnalysisConfig analysisConfig;

	private final AnalysisLimits analysisLimits;

	private final JsonValue backgroundPersistInterval;

	private final String createTime;

	private final DataDescription dataDescription;

	private final String description;

	private final String jobId;

	private final String jobType;

	private final ModelPlotConfig modelPlot;

	private final String modelSnapshotId;

	private final Number modelSnapshotRetentionDays;

	private final Number renormalizationWindowDays;

	private final String resultsIndexName;

	private final Number resultsRetentionDays;

	// ---------------------------------------------------------------------------------------------

	protected PutJobResponse(Builder builder) {

		this.allowLazyOpen = Objects.requireNonNull(builder.allowLazyOpen, "allow_lazy_open");
		this.analysisConfig = Objects.requireNonNull(builder.analysisConfig, "analysis_config");
		this.analysisLimits = Objects.requireNonNull(builder.analysisLimits, "analysis_limits");
		this.backgroundPersistInterval = Objects.requireNonNull(builder.backgroundPersistInterval,
				"background_persist_interval");
		this.createTime = Objects.requireNonNull(builder.createTime, "create_time");
		this.dataDescription = Objects.requireNonNull(builder.dataDescription, "data_description");
		this.description = Objects.requireNonNull(builder.description, "description");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.jobType = Objects.requireNonNull(builder.jobType, "job_type");
		this.modelPlot = Objects.requireNonNull(builder.modelPlot, "model_plot");
		this.modelSnapshotId = Objects.requireNonNull(builder.modelSnapshotId, "model_snapshot_id");
		this.modelSnapshotRetentionDays = Objects.requireNonNull(builder.modelSnapshotRetentionDays,
				"model_snapshot_retention_days");
		this.renormalizationWindowDays = Objects.requireNonNull(builder.renormalizationWindowDays,
				"renormalization_window_days");
		this.resultsIndexName = Objects.requireNonNull(builder.resultsIndexName, "results_index_name");
		this.resultsRetentionDays = Objects.requireNonNull(builder.resultsRetentionDays, "results_retention_days");

	}

	/**
	 * API name: {@code allow_lazy_open}
	 */
	public Boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * API name: {@code analysis_config}
	 */
	public AnalysisConfig analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * API name: {@code analysis_limits}
	 */
	public AnalysisLimits analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * API name: {@code background_persist_interval}
	 */
	public JsonValue backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * API name: {@code create_time}
	 */
	public String createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code data_description}
	 */
	public DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code job_type}
	 */
	public String jobType() {
		return this.jobType;
	}

	/**
	 * API name: {@code model_plot}
	 */
	public ModelPlotConfig modelPlot() {
		return this.modelPlot;
	}

	/**
	 * API name: {@code model_snapshot_id}
	 */
	public String modelSnapshotId() {
		return this.modelSnapshotId;
	}

	/**
	 * API name: {@code model_snapshot_retention_days}
	 */
	public Number modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code renormalization_window_days}
	 */
	public Number renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * API name: {@code results_index_name}
	 */
	public String resultsIndexName() {
		return this.resultsIndexName;
	}

	/**
	 * API name: {@code results_retention_days}
	 */
	public Number resultsRetentionDays() {
		return this.resultsRetentionDays;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("allow_lazy_open");
		generator.write(this.allowLazyOpen);

		generator.writeKey("analysis_config");
		this.analysisConfig.toJsonp(generator, mapper);

		generator.writeKey("analysis_limits");
		this.analysisLimits.toJsonp(generator, mapper);

		generator.writeKey("background_persist_interval");
		generator.write(this.backgroundPersistInterval);

		generator.writeKey("create_time");
		generator.write(this.createTime);

		generator.writeKey("data_description");
		this.dataDescription.toJsonp(generator, mapper);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("job_type");
		generator.write(this.jobType);

		generator.writeKey("model_plot");
		this.modelPlot.toJsonp(generator, mapper);

		generator.writeKey("model_snapshot_id");
		generator.write(this.modelSnapshotId);

		generator.writeKey("model_snapshot_retention_days");
		generator.write(this.modelSnapshotRetentionDays.doubleValue());

		generator.writeKey("renormalization_window_days");
		generator.write(this.renormalizationWindowDays.doubleValue());

		generator.writeKey("results_index_name");
		generator.write(this.resultsIndexName);

		generator.writeKey("results_retention_days");
		generator.write(this.resultsRetentionDays.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutJobResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutJobResponse> {
		private Boolean allowLazyOpen;

		private AnalysisConfig analysisConfig;

		private AnalysisLimits analysisLimits;

		private JsonValue backgroundPersistInterval;

		private String createTime;

		private DataDescription dataDescription;

		private String description;

		private String jobId;

		private String jobType;

		private ModelPlotConfig modelPlot;

		private String modelSnapshotId;

		private Number modelSnapshotRetentionDays;

		private Number renormalizationWindowDays;

		private String resultsIndexName;

		private Number resultsRetentionDays;

		/**
		 * API name: {@code allow_lazy_open}
		 */
		public Builder allowLazyOpen(Boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(AnalysisConfig value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(Function<AnalysisConfig.Builder, ObjectBuilder<AnalysisConfig>> fn) {
			return this.analysisConfig(fn.apply(new AnalysisConfig.Builder()).build());
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(AnalysisLimits value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(Function<AnalysisLimits.Builder, ObjectBuilder<AnalysisLimits>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisLimits.Builder()).build());
		}

		/**
		 * API name: {@code background_persist_interval}
		 */
		public Builder backgroundPersistInterval(JsonValue value) {
			this.backgroundPersistInterval = value;
			return this;
		}

		/**
		 * API name: {@code create_time}
		 */
		public Builder createTime(String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code data_description}
		 */
		public Builder dataDescription(DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * API name: {@code data_description}
		 */
		public Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code job_type}
		 */
		public Builder jobType(String value) {
			this.jobType = value;
			return this;
		}

		/**
		 * API name: {@code model_plot}
		 */
		public Builder modelPlot(ModelPlotConfig value) {
			this.modelPlot = value;
			return this;
		}

		/**
		 * API name: {@code model_plot}
		 */
		public Builder modelPlot(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlot(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * API name: {@code model_snapshot_id}
		 */
		public Builder modelSnapshotId(String value) {
			this.modelSnapshotId = value;
			return this;
		}

		/**
		 * API name: {@code model_snapshot_retention_days}
		 */
		public Builder modelSnapshotRetentionDays(Number value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code renormalization_window_days}
		 */
		public Builder renormalizationWindowDays(Number value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * API name: {@code results_index_name}
		 */
		public Builder resultsIndexName(String value) {
			this.resultsIndexName = value;
			return this;
		}

		/**
		 * API name: {@code results_retention_days}
		 */
		public Builder resultsRetentionDays(Number value) {
			this.resultsRetentionDays = value;
			return this;
		}

		/**
		 * Builds a {@link PutJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutJobResponse build() {

			return new PutJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutJobResponse
	 */
	public static final JsonpDeserializer<PutJobResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutJobResponse::setupPutJobResponseDeserializer);

	protected static void setupPutJobResponseDeserializer(DelegatingDeserializer<PutJobResponse.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfig.DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits.DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, JsonpDeserializer.jsonValueDeserializer(),
				"background_persist_interval");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time");
		op.add(Builder::dataDescription, DataDescription.DESERIALIZER, "data_description");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::jobType, JsonpDeserializer.stringDeserializer(), "job_type");
		op.add(Builder::modelPlot, ModelPlotConfig.DESERIALIZER, "model_plot");
		op.add(Builder::modelSnapshotId, JsonpDeserializer.stringDeserializer(), "model_snapshot_id");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.numberDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.numberDeserializer(),
				"renormalization_window_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.numberDeserializer(), "results_retention_days");

	}

}
