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

import co.elastic.clients.elasticsearch.xpack.usage.CustomSettings;
import co.elastic.clients.elasticsearch.xpack.usage.MlJobForecasts;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Job
public final class Job implements ToJsonp {
	@Nullable
	private final Boolean allowLazyOpen;

	@Nullable
	private final AnalysisConfig analysisConfig;

	@Nullable
	private final AnalysisLimits analysisLimits;

	@Nullable
	private final JsonValue backgroundPersistInterval;

	@Nullable
	private final Number count;

	@Nullable
	private final JsonValue createdBy;

	@Nullable
	private final Number createTime;

	@Nullable
	private final JobStatistics detectors;

	@Nullable
	private final DataDescription dataDescription;

	@Nullable
	private final String description;

	@Nullable
	private final Number finishedTime;

	@Nullable
	private final MlJobForecasts forecasts;

	@Nullable
	private final String jobId;

	@Nullable
	private final String jobType;

	@Nullable
	private final ModelPlotConfig modelPlot;

	@Nullable
	private final JobStatistics modelSize;

	@Nullable
	private final String modelSnapshotId;

	@Nullable
	private final Number modelSnapshotRetentionDays;

	@Nullable
	private final Number renormalizationWindowDays;

	@Nullable
	private final String resultsIndexName;

	@Nullable
	private final Number resultsRetentionDays;

	@Nullable
	private final List<String> groups;

	@Nullable
	private final ModelPlotConfig modelPlotConfig;

	@Nullable
	private final CustomSettings customSettings;

	@Nullable
	private final String jobVersion;

	@Nullable
	private final Boolean deleting;

	@Nullable
	private final Number dailyModelSnapshotRetentionAfterDays;

	// ---------------------------------------------------------------------------------------------

	protected Job(Builder builder) {

		this.allowLazyOpen = builder.allowLazyOpen;
		this.analysisConfig = builder.analysisConfig;
		this.analysisLimits = builder.analysisLimits;
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.count = builder.count;
		this.createdBy = builder.createdBy;
		this.createTime = builder.createTime;
		this.detectors = builder.detectors;
		this.dataDescription = builder.dataDescription;
		this.description = builder.description;
		this.finishedTime = builder.finishedTime;
		this.forecasts = builder.forecasts;
		this.jobId = builder.jobId;
		this.jobType = builder.jobType;
		this.modelPlot = builder.modelPlot;
		this.modelSize = builder.modelSize;
		this.modelSnapshotId = builder.modelSnapshotId;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsIndexName = builder.resultsIndexName;
		this.resultsRetentionDays = builder.resultsRetentionDays;
		this.groups = builder.groups;
		this.modelPlotConfig = builder.modelPlotConfig;
		this.customSettings = builder.customSettings;
		this.jobVersion = builder.jobVersion;
		this.deleting = builder.deleting;
		this.dailyModelSnapshotRetentionAfterDays = builder.dailyModelSnapshotRetentionAfterDays;

	}

	/**
	 * API name: {@code allow_lazy_open}
	 */
	@Nullable
	public Boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * API name: {@code analysis_config}
	 */
	@Nullable
	public AnalysisConfig analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * API name: {@code analysis_limits}
	 */
	@Nullable
	public AnalysisLimits analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * API name: {@code background_persist_interval}
	 */
	@Nullable
	public JsonValue backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code created_by}
	 */
	@Nullable
	public JsonValue createdBy() {
		return this.createdBy;
	}

	/**
	 * API name: {@code create_time}
	 */
	@Nullable
	public Number createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code detectors}
	 */
	@Nullable
	public JobStatistics detectors() {
		return this.detectors;
	}

	/**
	 * API name: {@code data_description}
	 */
	@Nullable
	public DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code finished_time}
	 */
	@Nullable
	public Number finishedTime() {
		return this.finishedTime;
	}

	/**
	 * API name: {@code forecasts}
	 */
	@Nullable
	public MlJobForecasts forecasts() {
		return this.forecasts;
	}

	/**
	 * API name: {@code job_id}
	 */
	@Nullable
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code job_type}
	 */
	@Nullable
	public String jobType() {
		return this.jobType;
	}

	/**
	 * API name: {@code model_plot}
	 */
	@Nullable
	public ModelPlotConfig modelPlot() {
		return this.modelPlot;
	}

	/**
	 * API name: {@code model_size}
	 */
	@Nullable
	public JobStatistics modelSize() {
		return this.modelSize;
	}

	/**
	 * API name: {@code model_snapshot_id}
	 */
	@Nullable
	public String modelSnapshotId() {
		return this.modelSnapshotId;
	}

	/**
	 * API name: {@code model_snapshot_retention_days}
	 */
	@Nullable
	public Number modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public Number renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * API name: {@code results_index_name}
	 */
	@Nullable
	public String resultsIndexName() {
		return this.resultsIndexName;
	}

	/**
	 * API name: {@code results_retention_days}
	 */
	@Nullable
	public Number resultsRetentionDays() {
		return this.resultsRetentionDays;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public List<String> groups() {
		return this.groups;
	}

	/**
	 * API name: {@code model_plot_config}
	 */
	@Nullable
	public ModelPlotConfig modelPlotConfig() {
		return this.modelPlotConfig;
	}

	/**
	 * API name: {@code custom_settings}
	 */
	@Nullable
	public CustomSettings customSettings() {
		return this.customSettings;
	}

	/**
	 * API name: {@code job_version}
	 */
	@Nullable
	public String jobVersion() {
		return this.jobVersion;
	}

	/**
	 * API name: {@code deleting}
	 */
	@Nullable
	public Boolean deleting() {
		return this.deleting;
	}

	/**
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	@Nullable
	public Number dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
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

		if (this.allowLazyOpen != null) {

			generator.writeKey("allow_lazy_open");
			generator.write(this.allowLazyOpen);

		}
		if (this.analysisConfig != null) {

			generator.writeKey("analysis_config");
			this.analysisConfig.toJsonp(generator, mapper);

		}
		if (this.analysisLimits != null) {

			generator.writeKey("analysis_limits");
			this.analysisLimits.toJsonp(generator, mapper);

		}
		if (this.backgroundPersistInterval != null) {

			generator.writeKey("background_persist_interval");
			generator.write(this.backgroundPersistInterval);

		}
		if (this.count != null) {

			generator.writeKey("count");
			generator.write(this.count.doubleValue());

		}
		if (this.createdBy != null) {

			generator.writeKey("created_by");
			generator.write(this.createdBy);

		}
		if (this.createTime != null) {

			generator.writeKey("create_time");
			generator.write(this.createTime.doubleValue());

		}
		if (this.detectors != null) {

			generator.writeKey("detectors");
			this.detectors.toJsonp(generator, mapper);

		}
		if (this.dataDescription != null) {

			generator.writeKey("data_description");
			this.dataDescription.toJsonp(generator, mapper);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.finishedTime != null) {

			generator.writeKey("finished_time");
			generator.write(this.finishedTime.doubleValue());

		}
		if (this.forecasts != null) {

			generator.writeKey("forecasts");
			this.forecasts.toJsonp(generator, mapper);

		}
		if (this.jobId != null) {

			generator.writeKey("job_id");
			generator.write(this.jobId);

		}
		if (this.jobType != null) {

			generator.writeKey("job_type");
			generator.write(this.jobType);

		}
		if (this.modelPlot != null) {

			generator.writeKey("model_plot");
			this.modelPlot.toJsonp(generator, mapper);

		}
		if (this.modelSize != null) {

			generator.writeKey("model_size");
			this.modelSize.toJsonp(generator, mapper);

		}
		if (this.modelSnapshotId != null) {

			generator.writeKey("model_snapshot_id");
			generator.write(this.modelSnapshotId);

		}
		if (this.modelSnapshotRetentionDays != null) {

			generator.writeKey("model_snapshot_retention_days");
			generator.write(this.modelSnapshotRetentionDays.doubleValue());

		}
		if (this.renormalizationWindowDays != null) {

			generator.writeKey("renormalization_window_days");
			generator.write(this.renormalizationWindowDays.doubleValue());

		}
		if (this.resultsIndexName != null) {

			generator.writeKey("results_index_name");
			generator.write(this.resultsIndexName);

		}
		if (this.resultsRetentionDays != null) {

			generator.writeKey("results_retention_days");
			generator.write(this.resultsRetentionDays.doubleValue());

		}
		if (this.groups != null) {

			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.modelPlotConfig != null) {

			generator.writeKey("model_plot_config");
			this.modelPlotConfig.toJsonp(generator, mapper);

		}
		if (this.customSettings != null) {

			generator.writeKey("custom_settings");
			this.customSettings.toJsonp(generator, mapper);

		}
		if (this.jobVersion != null) {

			generator.writeKey("job_version");
			generator.write(this.jobVersion);

		}
		if (this.deleting != null) {

			generator.writeKey("deleting");
			generator.write(this.deleting);

		}
		if (this.dailyModelSnapshotRetentionAfterDays != null) {

			generator.writeKey("daily_model_snapshot_retention_after_days");
			generator.write(this.dailyModelSnapshotRetentionAfterDays.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Job}.
	 */
	public static class Builder implements ObjectBuilder<Job> {
		@Nullable
		private Boolean allowLazyOpen;

		@Nullable
		private AnalysisConfig analysisConfig;

		@Nullable
		private AnalysisLimits analysisLimits;

		@Nullable
		private JsonValue backgroundPersistInterval;

		@Nullable
		private Number count;

		@Nullable
		private JsonValue createdBy;

		@Nullable
		private Number createTime;

		@Nullable
		private JobStatistics detectors;

		@Nullable
		private DataDescription dataDescription;

		@Nullable
		private String description;

		@Nullable
		private Number finishedTime;

		@Nullable
		private MlJobForecasts forecasts;

		@Nullable
		private String jobId;

		@Nullable
		private String jobType;

		@Nullable
		private ModelPlotConfig modelPlot;

		@Nullable
		private JobStatistics modelSize;

		@Nullable
		private String modelSnapshotId;

		@Nullable
		private Number modelSnapshotRetentionDays;

		@Nullable
		private Number renormalizationWindowDays;

		@Nullable
		private String resultsIndexName;

		@Nullable
		private Number resultsRetentionDays;

		@Nullable
		private List<String> groups;

		@Nullable
		private ModelPlotConfig modelPlotConfig;

		@Nullable
		private CustomSettings customSettings;

		@Nullable
		private String jobVersion;

		@Nullable
		private Boolean deleting;

		@Nullable
		private Number dailyModelSnapshotRetentionAfterDays;

		/**
		 * API name: {@code allow_lazy_open}
		 */
		public Builder allowLazyOpen(@Nullable Boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(@Nullable AnalysisConfig value) {
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
		public Builder analysisLimits(@Nullable AnalysisLimits value) {
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
		public Builder backgroundPersistInterval(@Nullable JsonValue value) {
			this.backgroundPersistInterval = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(@Nullable Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code created_by}
		 */
		public Builder createdBy(@Nullable JsonValue value) {
			this.createdBy = value;
			return this;
		}

		/**
		 * API name: {@code create_time}
		 */
		public Builder createTime(@Nullable Number value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code detectors}
		 */
		public Builder detectors(@Nullable JobStatistics value) {
			this.detectors = value;
			return this;
		}

		/**
		 * API name: {@code detectors}
		 */
		public Builder detectors(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.detectors(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code data_description}
		 */
		public Builder dataDescription(@Nullable DataDescription value) {
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
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code finished_time}
		 */
		public Builder finishedTime(@Nullable Number value) {
			this.finishedTime = value;
			return this;
		}

		/**
		 * API name: {@code forecasts}
		 */
		public Builder forecasts(@Nullable MlJobForecasts value) {
			this.forecasts = value;
			return this;
		}

		/**
		 * API name: {@code forecasts}
		 */
		public Builder forecasts(Function<MlJobForecasts.Builder, ObjectBuilder<MlJobForecasts>> fn) {
			return this.forecasts(fn.apply(new MlJobForecasts.Builder()).build());
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code job_type}
		 */
		public Builder jobType(@Nullable String value) {
			this.jobType = value;
			return this;
		}

		/**
		 * API name: {@code model_plot}
		 */
		public Builder modelPlot(@Nullable ModelPlotConfig value) {
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
		 * API name: {@code model_size}
		 */
		public Builder modelSize(@Nullable JobStatistics value) {
			this.modelSize = value;
			return this;
		}

		/**
		 * API name: {@code model_size}
		 */
		public Builder modelSize(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.modelSize(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code model_snapshot_id}
		 */
		public Builder modelSnapshotId(@Nullable String value) {
			this.modelSnapshotId = value;
			return this;
		}

		/**
		 * API name: {@code model_snapshot_retention_days}
		 */
		public Builder modelSnapshotRetentionDays(@Nullable Number value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code renormalization_window_days}
		 */
		public Builder renormalizationWindowDays(@Nullable Number value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * API name: {@code results_index_name}
		 */
		public Builder resultsIndexName(@Nullable String value) {
			this.resultsIndexName = value;
			return this;
		}

		/**
		 * API name: {@code results_retention_days}
		 */
		public Builder resultsRetentionDays(@Nullable Number value) {
			this.resultsRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable List<String> value) {
			this.groups = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(String... value) {
			this.groups = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #groups(List)}, creating the list if needed.
		 */
		public Builder addGroups(String value) {
			if (this.groups == null) {
				this.groups = new ArrayList<>();
			}
			this.groups.add(value);
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public Builder modelPlotConfig(@Nullable ModelPlotConfig value) {
			this.modelPlotConfig = value;
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public Builder modelPlotConfig(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlotConfig(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * API name: {@code custom_settings}
		 */
		public Builder customSettings(@Nullable CustomSettings value) {
			this.customSettings = value;
			return this;
		}

		/**
		 * API name: {@code custom_settings}
		 */
		public Builder customSettings(Function<CustomSettings.Builder, ObjectBuilder<CustomSettings>> fn) {
			return this.customSettings(fn.apply(new CustomSettings.Builder()).build());
		}

		/**
		 * API name: {@code job_version}
		 */
		public Builder jobVersion(@Nullable String value) {
			this.jobVersion = value;
			return this;
		}

		/**
		 * API name: {@code deleting}
		 */
		public Builder deleting(@Nullable Boolean value) {
			this.deleting = value;
			return this;
		}

		/**
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public Builder dailyModelSnapshotRetentionAfterDays(@Nullable Number value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		/**
		 * Builds a {@link Job}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Job build() {

			return new Job(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Job
	 */
	public static final JsonpDeserializer<Job> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Job::setupJobDeserializer);

	protected static void setupJobDeserializer(DelegatingDeserializer<Job.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfig.DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits.DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, JsonpDeserializer.jsonValueDeserializer(),
				"background_persist_interval");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::createdBy, JsonpDeserializer.jsonValueDeserializer(), "created_by");
		op.add(Builder::createTime, JsonpDeserializer.numberDeserializer(), "create_time");
		op.add(Builder::detectors, JobStatistics.DESERIALIZER, "detectors");
		op.add(Builder::dataDescription, DataDescription.DESERIALIZER, "data_description");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::finishedTime, JsonpDeserializer.numberDeserializer(), "finished_time");
		op.add(Builder::forecasts, MlJobForecasts.DESERIALIZER, "forecasts");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::jobType, JsonpDeserializer.stringDeserializer(), "job_type");
		op.add(Builder::modelPlot, ModelPlotConfig.DESERIALIZER, "model_plot");
		op.add(Builder::modelSize, JobStatistics.DESERIALIZER, "model_size");
		op.add(Builder::modelSnapshotId, JsonpDeserializer.stringDeserializer(), "model_snapshot_id");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.numberDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.numberDeserializer(),
				"renormalization_window_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.numberDeserializer(), "results_retention_days");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::modelPlotConfig, ModelPlotConfig.DESERIALIZER, "model_plot_config");
		op.add(Builder::customSettings, CustomSettings.DESERIALIZER, "custom_settings");
		op.add(Builder::jobVersion, JsonpDeserializer.stringDeserializer(), "job_version");
		op.add(Builder::deleting, JsonpDeserializer.booleanDeserializer(), "deleting");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.numberDeserializer(),
				"daily_model_snapshot_retention_after_days");

	}

}
