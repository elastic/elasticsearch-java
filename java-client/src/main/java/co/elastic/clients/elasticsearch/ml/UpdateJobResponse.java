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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_job.Response
@JsonpDeserializable
public class UpdateJobResponse implements JsonpSerializable {
	private final boolean allowLazyOpen;

	private final AnalysisConfigRead analysisConfig;

	private final AnalysisLimits analysisLimits;

	@Nullable
	private final String backgroundPersistInterval;

	private final String createTime;

	@Nullable
	private final String finishedTime;

	private final Map<String, String> customSettings;

	private final long dailyModelSnapshotRetentionAfterDays;

	private final DataDescription dataDescription;

	@Nullable
	private final Datafeed datafeedConfig;

	@Nullable
	private final String description;

	private final List<String> groups;

	private final String jobId;

	private final String jobType;

	private final String jobVersion;

	@Nullable
	private final ModelPlotConfig modelPlotConfig;

	@Nullable
	private final String modelSnapshotId;

	private final long modelSnapshotRetentionDays;

	@Nullable
	private final Long renormalizationWindowDays;

	private final String resultsIndexName;

	@Nullable
	private final Long resultsRetentionDays;

	// ---------------------------------------------------------------------------------------------

	private UpdateJobResponse(Builder builder) {

		this.allowLazyOpen = ModelTypeHelper.requireNonNull(builder.allowLazyOpen, this, "allowLazyOpen");
		this.analysisConfig = ModelTypeHelper.requireNonNull(builder.analysisConfig, this, "analysisConfig");
		this.analysisLimits = ModelTypeHelper.requireNonNull(builder.analysisLimits, this, "analysisLimits");
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.createTime = ModelTypeHelper.requireNonNull(builder.createTime, this, "createTime");
		this.finishedTime = builder.finishedTime;
		this.customSettings = ModelTypeHelper.unmodifiable(builder.customSettings);
		this.dailyModelSnapshotRetentionAfterDays = ModelTypeHelper.requireNonNull(
				builder.dailyModelSnapshotRetentionAfterDays, this, "dailyModelSnapshotRetentionAfterDays");
		this.dataDescription = ModelTypeHelper.requireNonNull(builder.dataDescription, this, "dataDescription");
		this.datafeedConfig = builder.datafeedConfig;
		this.description = builder.description;
		this.groups = ModelTypeHelper.unmodifiable(builder.groups);
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.jobType = ModelTypeHelper.requireNonNull(builder.jobType, this, "jobType");
		this.jobVersion = ModelTypeHelper.requireNonNull(builder.jobVersion, this, "jobVersion");
		this.modelPlotConfig = builder.modelPlotConfig;
		this.modelSnapshotId = builder.modelSnapshotId;
		this.modelSnapshotRetentionDays = ModelTypeHelper.requireNonNull(builder.modelSnapshotRetentionDays, this,
				"modelSnapshotRetentionDays");
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsIndexName = ModelTypeHelper.requireNonNull(builder.resultsIndexName, this, "resultsIndexName");
		this.resultsRetentionDays = builder.resultsRetentionDays;

	}

	public static UpdateJobResponse of(Function<Builder, ObjectBuilder<UpdateJobResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code allow_lazy_open}
	 */
	public final boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * Required - API name: {@code analysis_config}
	 */
	public final AnalysisConfigRead analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * Required - API name: {@code analysis_limits}
	 */
	public final AnalysisLimits analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * API name: {@code background_persist_interval}
	 */
	@Nullable
	public final String backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * Required - API name: {@code create_time}
	 */
	public final String createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code finished_time}
	 */
	@Nullable
	public final String finishedTime() {
		return this.finishedTime;
	}

	/**
	 * API name: {@code custom_settings}
	 */
	public final Map<String, String> customSettings() {
		return this.customSettings;
	}

	/**
	 * Required - API name: {@code daily_model_snapshot_retention_after_days}
	 */
	public final long dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
	}

	/**
	 * Required - API name: {@code data_description}
	 */
	public final DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public final Datafeed datafeedConfig() {
		return this.datafeedConfig;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code groups}
	 */
	public final List<String> groups() {
		return this.groups;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code job_type}
	 */
	public final String jobType() {
		return this.jobType;
	}

	/**
	 * Required - API name: {@code job_version}
	 */
	public final String jobVersion() {
		return this.jobVersion;
	}

	/**
	 * API name: {@code model_plot_config}
	 */
	@Nullable
	public final ModelPlotConfig modelPlotConfig() {
		return this.modelPlotConfig;
	}

	/**
	 * API name: {@code model_snapshot_id}
	 */
	@Nullable
	public final String modelSnapshotId() {
		return this.modelSnapshotId;
	}

	/**
	 * Required - API name: {@code model_snapshot_retention_days}
	 */
	public final long modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public final Long renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * Required - API name: {@code results_index_name}
	 */
	public final String resultsIndexName() {
		return this.resultsIndexName;
	}

	/**
	 * API name: {@code results_retention_days}
	 */
	@Nullable
	public final Long resultsRetentionDays() {
		return this.resultsRetentionDays;
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

		generator.writeKey("allow_lazy_open");
		generator.write(this.allowLazyOpen);

		generator.writeKey("analysis_config");
		this.analysisConfig.serialize(generator, mapper);

		generator.writeKey("analysis_limits");
		this.analysisLimits.serialize(generator, mapper);

		if (this.backgroundPersistInterval != null) {
			generator.writeKey("background_persist_interval");
			generator.write(this.backgroundPersistInterval);

		}
		generator.writeKey("create_time");
		generator.write(this.createTime);

		if (this.finishedTime != null) {
			generator.writeKey("finished_time");
			generator.write(this.finishedTime);

		}
		if (ModelTypeHelper.isDefined(this.customSettings)) {
			generator.writeKey("custom_settings");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.customSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("daily_model_snapshot_retention_after_days");
		generator.write(this.dailyModelSnapshotRetentionAfterDays);

		generator.writeKey("data_description");
		this.dataDescription.serialize(generator, mapper);

		if (this.datafeedConfig != null) {
			generator.writeKey("datafeed_config");
			this.datafeedConfig.serialize(generator, mapper);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ModelTypeHelper.isDefined(this.groups)) {
			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("job_type");
		generator.write(this.jobType);

		generator.writeKey("job_version");
		generator.write(this.jobVersion);

		if (this.modelPlotConfig != null) {
			generator.writeKey("model_plot_config");
			this.modelPlotConfig.serialize(generator, mapper);

		}
		if (this.modelSnapshotId != null) {
			generator.writeKey("model_snapshot_id");
			generator.write(this.modelSnapshotId);

		}
		generator.writeKey("model_snapshot_retention_days");
		generator.write(this.modelSnapshotRetentionDays);

		if (this.renormalizationWindowDays != null) {
			generator.writeKey("renormalization_window_days");
			generator.write(this.renormalizationWindowDays);

		}
		generator.writeKey("results_index_name");
		generator.write(this.resultsIndexName);

		if (this.resultsRetentionDays != null) {
			generator.writeKey("results_retention_days");
			generator.write(this.resultsRetentionDays);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateJobResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<UpdateJobResponse> {
		private Boolean allowLazyOpen;

		private AnalysisConfigRead analysisConfig;

		private AnalysisLimits analysisLimits;

		@Nullable
		private String backgroundPersistInterval;

		private String createTime;

		@Nullable
		private String finishedTime;

		@Nullable
		private Map<String, String> customSettings;

		private Long dailyModelSnapshotRetentionAfterDays;

		private DataDescription dataDescription;

		@Nullable
		private Datafeed datafeedConfig;

		@Nullable
		private String description;

		@Nullable
		private List<String> groups;

		private String jobId;

		private String jobType;

		private String jobVersion;

		@Nullable
		private ModelPlotConfig modelPlotConfig;

		@Nullable
		private String modelSnapshotId;

		private Long modelSnapshotRetentionDays;

		@Nullable
		private Long renormalizationWindowDays;

		private String resultsIndexName;

		@Nullable
		private Long resultsRetentionDays;

		/**
		 * Required - API name: {@code allow_lazy_open}
		 */
		public final Builder allowLazyOpen(boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis_config}
		 */
		public final Builder analysisConfig(AnalysisConfigRead value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis_config}
		 */
		public final Builder analysisConfig(
				Function<AnalysisConfigRead.Builder, ObjectBuilder<AnalysisConfigRead>> fn) {
			return this.analysisConfig(fn.apply(new AnalysisConfigRead.Builder()).build());
		}

		/**
		 * Required - API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(AnalysisLimits value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(Function<AnalysisLimits.Builder, ObjectBuilder<AnalysisLimits>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisLimits.Builder()).build());
		}

		/**
		 * API name: {@code background_persist_interval}
		 */
		public final Builder backgroundPersistInterval(@Nullable String value) {
			this.backgroundPersistInterval = value;
			return this;
		}

		/**
		 * Required - API name: {@code create_time}
		 */
		public final Builder createTime(String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code finished_time}
		 */
		public final Builder finishedTime(@Nullable String value) {
			this.finishedTime = value;
			return this;
		}

		/**
		 * API name: {@code custom_settings}
		 */
		public final Builder customSettings(@Nullable Map<String, String> value) {
			this.customSettings = value;
			return this;
		}

		/**
		 * Required - API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public final Builder dailyModelSnapshotRetentionAfterDays(long value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_description}
		 */
		public final Builder dataDescription(DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_description}
		 */
		public final Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(@Nullable Datafeed value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return this.datafeedConfig(fn.apply(new Datafeed.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public final Builder groups(@Nullable List<String> value) {
			this.groups = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public final Builder groups(String... value) {
			this.groups = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_type}
		 */
		public final Builder jobType(String value) {
			this.jobType = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_version}
		 */
		public final Builder jobVersion(String value) {
			this.jobVersion = value;
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public final Builder modelPlotConfig(@Nullable ModelPlotConfig value) {
			this.modelPlotConfig = value;
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public final Builder modelPlotConfig(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlotConfig(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * API name: {@code model_snapshot_id}
		 */
		public final Builder modelSnapshotId(@Nullable String value) {
			this.modelSnapshotId = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshot_retention_days}
		 */
		public final Builder modelSnapshotRetentionDays(long value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code renormalization_window_days}
		 */
		public final Builder renormalizationWindowDays(@Nullable Long value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * Required - API name: {@code results_index_name}
		 */
		public final Builder resultsIndexName(String value) {
			this.resultsIndexName = value;
			return this;
		}

		/**
		 * API name: {@code results_retention_days}
		 */
		public final Builder resultsRetentionDays(@Nullable Long value) {
			this.resultsRetentionDays = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateJobResponse build() {
			_checkSingleUse();

			return new UpdateJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateJobResponse}
	 */
	public static final JsonpDeserializer<UpdateJobResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateJobResponse::setupUpdateJobResponseDeserializer, Builder::build);

	protected static void setupUpdateJobResponseDeserializer(DelegatingDeserializer<UpdateJobResponse.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfigRead._DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits._DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, JsonpDeserializer.stringDeserializer(),
				"background_persist_interval");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time");
		op.add(Builder::finishedTime, JsonpDeserializer.stringDeserializer(), "finished_time");
		op.add(Builder::customSettings, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"custom_settings");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.longDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::dataDescription, DataDescription._DESERIALIZER, "data_description");
		op.add(Builder::datafeedConfig, Datafeed._DESERIALIZER, "datafeed_config");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::jobType, JsonpDeserializer.stringDeserializer(), "job_type");
		op.add(Builder::jobVersion, JsonpDeserializer.stringDeserializer(), "job_version");
		op.add(Builder::modelPlotConfig, ModelPlotConfig._DESERIALIZER, "model_plot_config");
		op.add(Builder::modelSnapshotId, JsonpDeserializer.stringDeserializer(), "model_snapshot_id");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.longDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.longDeserializer(), "renormalization_window_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.longDeserializer(), "results_retention_days");

	}

}
