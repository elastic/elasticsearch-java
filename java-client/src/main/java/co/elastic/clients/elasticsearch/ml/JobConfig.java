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
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.JobConfig
@JsonpDeserializable
public final class JobConfig implements JsonpSerializable {
	@Nullable
	private final Boolean allowLazyOpen;

	private final AnalysisConfig analysisConfig;

	@Nullable
	private final AnalysisLimits analysisLimits;

	@Nullable
	private final String backgroundPersistInterval;

	@Nullable
	private final CustomSettings customSettings;

	@Nullable
	private final Long dailyModelSnapshotRetentionAfterDays;

	private final DataDescription dataDescription;

	@Nullable
	private final DatafeedConfig datafeedConfig;

	@Nullable
	private final String description;

	@Nullable
	private final List<String> groups;

	@Nullable
	private final String jobId;

	@Nullable
	private final String jobType;

	@Nullable
	private final ModelPlotConfig modelPlotConfig;

	@Nullable
	private final Long modelSnapshotRetentionDays;

	@Nullable
	private final Long renormalizationWindowDays;

	@Nullable
	private final String resultsIndexName;

	@Nullable
	private final Long resultsRetentionDays;

	// ---------------------------------------------------------------------------------------------

	public JobConfig(Builder builder) {

		this.allowLazyOpen = builder.allowLazyOpen;
		this.analysisConfig = Objects.requireNonNull(builder.analysisConfig, "analysis_config");
		this.analysisLimits = builder.analysisLimits;
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.customSettings = builder.customSettings;
		this.dailyModelSnapshotRetentionAfterDays = builder.dailyModelSnapshotRetentionAfterDays;
		this.dataDescription = Objects.requireNonNull(builder.dataDescription, "data_description");
		this.datafeedConfig = builder.datafeedConfig;
		this.description = builder.description;
		this.groups = ModelTypeHelper.unmodifiable(builder.groups);
		this.jobId = builder.jobId;
		this.jobType = builder.jobType;
		this.modelPlotConfig = builder.modelPlotConfig;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsIndexName = builder.resultsIndexName;
		this.resultsRetentionDays = builder.resultsRetentionDays;

	}

	public JobConfig(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code allow_lazy_open}
	 */
	@Nullable
	public Boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * Required - API name: {@code analysis_config}
	 */
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
	public String backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * API name: {@code custom_settings}
	 */
	@Nullable
	public CustomSettings customSettings() {
		return this.customSettings;
	}

	/**
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	@Nullable
	public Long dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
	}

	/**
	 * Required - API name: {@code data_description}
	 */
	public DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public DatafeedConfig datafeedConfig() {
		return this.datafeedConfig;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public List<String> groups() {
		return this.groups;
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
	 * API name: {@code model_plot_config}
	 */
	@Nullable
	public ModelPlotConfig modelPlotConfig() {
		return this.modelPlotConfig;
	}

	/**
	 * API name: {@code model_snapshot_retention_days}
	 */
	@Nullable
	public Long modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public Long renormalizationWindowDays() {
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
	public Long resultsRetentionDays() {
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

		if (this.allowLazyOpen != null) {

			generator.writeKey("allow_lazy_open");
			generator.write(this.allowLazyOpen);

		}

		generator.writeKey("analysis_config");
		this.analysisConfig.serialize(generator, mapper);

		if (this.analysisLimits != null) {

			generator.writeKey("analysis_limits");
			this.analysisLimits.serialize(generator, mapper);

		}
		if (this.backgroundPersistInterval != null) {

			generator.writeKey("background_persist_interval");
			generator.write(this.backgroundPersistInterval);

		}
		if (this.customSettings != null) {

			generator.writeKey("custom_settings");
			this.customSettings.serialize(generator, mapper);

		}
		if (this.dailyModelSnapshotRetentionAfterDays != null) {

			generator.writeKey("daily_model_snapshot_retention_after_days");
			generator.write(this.dailyModelSnapshotRetentionAfterDays);

		}

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
		if (this.groups != null) {

			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.jobId != null) {

			generator.writeKey("job_id");
			generator.write(this.jobId);

		}
		if (this.jobType != null) {

			generator.writeKey("job_type");
			generator.write(this.jobType);

		}
		if (this.modelPlotConfig != null) {

			generator.writeKey("model_plot_config");
			this.modelPlotConfig.serialize(generator, mapper);

		}
		if (this.modelSnapshotRetentionDays != null) {

			generator.writeKey("model_snapshot_retention_days");
			generator.write(this.modelSnapshotRetentionDays);

		}
		if (this.renormalizationWindowDays != null) {

			generator.writeKey("renormalization_window_days");
			generator.write(this.renormalizationWindowDays);

		}
		if (this.resultsIndexName != null) {

			generator.writeKey("results_index_name");
			generator.write(this.resultsIndexName);

		}
		if (this.resultsRetentionDays != null) {

			generator.writeKey("results_retention_days");
			generator.write(this.resultsRetentionDays);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobConfig}.
	 */
	public static class Builder implements ObjectBuilder<JobConfig> {
		@Nullable
		private Boolean allowLazyOpen;

		private AnalysisConfig analysisConfig;

		@Nullable
		private AnalysisLimits analysisLimits;

		@Nullable
		private String backgroundPersistInterval;

		@Nullable
		private CustomSettings customSettings;

		@Nullable
		private Long dailyModelSnapshotRetentionAfterDays;

		private DataDescription dataDescription;

		@Nullable
		private DatafeedConfig datafeedConfig;

		@Nullable
		private String description;

		@Nullable
		private List<String> groups;

		@Nullable
		private String jobId;

		@Nullable
		private String jobType;

		@Nullable
		private ModelPlotConfig modelPlotConfig;

		@Nullable
		private Long modelSnapshotRetentionDays;

		@Nullable
		private Long renormalizationWindowDays;

		@Nullable
		private String resultsIndexName;

		@Nullable
		private Long resultsRetentionDays;

		/**
		 * API name: {@code allow_lazy_open}
		 */
		public Builder allowLazyOpen(@Nullable Boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis_config}
		 */
		public Builder analysisConfig(AnalysisConfig value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis_config}
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
		public Builder backgroundPersistInterval(@Nullable String value) {
			this.backgroundPersistInterval = value;
			return this;
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
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public Builder dailyModelSnapshotRetentionAfterDays(@Nullable Long value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_description}
		 */
		public Builder dataDescription(DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_description}
		 */
		public Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public Builder datafeedConfig(@Nullable DatafeedConfig value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public Builder datafeedConfig(Function<DatafeedConfig.Builder, ObjectBuilder<DatafeedConfig>> fn) {
			return this.datafeedConfig(fn.apply(new DatafeedConfig.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
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
		 * API name: {@code model_snapshot_retention_days}
		 */
		public Builder modelSnapshotRetentionDays(@Nullable Long value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code renormalization_window_days}
		 */
		public Builder renormalizationWindowDays(@Nullable Long value) {
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
		public Builder resultsRetentionDays(@Nullable Long value) {
			this.resultsRetentionDays = value;
			return this;
		}

		/**
		 * Builds a {@link JobConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobConfig build() {

			return new JobConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobConfig}
	 */
	public static final JsonpDeserializer<JobConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobConfig::setupJobConfigDeserializer, Builder::build);

	protected static void setupJobConfigDeserializer(DelegatingDeserializer<JobConfig.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfig._DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits._DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, JsonpDeserializer.stringDeserializer(),
				"background_persist_interval");
		op.add(Builder::customSettings, CustomSettings._DESERIALIZER, "custom_settings");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.longDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::dataDescription, DataDescription._DESERIALIZER, "data_description");
		op.add(Builder::datafeedConfig, DatafeedConfig._DESERIALIZER, "datafeed_config");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::jobType, JsonpDeserializer.stringDeserializer(), "job_type");
		op.add(Builder::modelPlotConfig, ModelPlotConfig._DESERIALIZER, "model_plot_config");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.longDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.longDeserializer(), "renormalization_window_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.longDeserializer(), "results_retention_days");

	}

}
