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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: ml._types.Job

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Job">API specification</a>
 */
@JsonpDeserializable
public class Job implements JsonpSerializable {
	private final boolean allowLazyOpen;

	private final AnalysisConfig analysisConfig;

	@Nullable
	private final AnalysisLimits analysisLimits;

	@Nullable
	private final Time backgroundPersistInterval;

	@Nullable
	private final JobBlocked blocked;

	@Nullable
	private final DateTime createTime;

	@Nullable
	private final JsonData customSettings;

	@Nullable
	private final Long dailyModelSnapshotRetentionAfterDays;

	private final DataDescription dataDescription;

	@Nullable
	private final Datafeed datafeedConfig;

	@Nullable
	private final Boolean deleting;

	@Nullable
	private final String description;

	@Nullable
	private final DateTime finishedTime;

	private final List<String> groups;

	private final String jobId;

	@Nullable
	private final String jobType;

	@Nullable
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

	private Job(Builder builder) {

		this.allowLazyOpen = ApiTypeHelper.requireNonNull(builder.allowLazyOpen, this, "allowLazyOpen");
		this.analysisConfig = ApiTypeHelper.requireNonNull(builder.analysisConfig, this, "analysisConfig");
		this.analysisLimits = builder.analysisLimits;
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.blocked = builder.blocked;
		this.createTime = builder.createTime;
		this.customSettings = builder.customSettings;
		this.dailyModelSnapshotRetentionAfterDays = builder.dailyModelSnapshotRetentionAfterDays;
		this.dataDescription = ApiTypeHelper.requireNonNull(builder.dataDescription, this, "dataDescription");
		this.datafeedConfig = builder.datafeedConfig;
		this.deleting = builder.deleting;
		this.description = builder.description;
		this.finishedTime = builder.finishedTime;
		this.groups = ApiTypeHelper.unmodifiable(builder.groups);
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.jobType = builder.jobType;
		this.jobVersion = builder.jobVersion;
		this.modelPlotConfig = builder.modelPlotConfig;
		this.modelSnapshotId = builder.modelSnapshotId;
		this.modelSnapshotRetentionDays = ApiTypeHelper.requireNonNull(builder.modelSnapshotRetentionDays, this,
				"modelSnapshotRetentionDays");
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsIndexName = ApiTypeHelper.requireNonNull(builder.resultsIndexName, this, "resultsIndexName");
		this.resultsRetentionDays = builder.resultsRetentionDays;

	}

	public static Job of(Function<Builder, ObjectBuilder<Job>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Advanced configuration option. Specifies whether this job can open
	 * when there is insufficient machine learning node capacity for it to be
	 * immediately assigned to a node.
	 * <p>
	 * API name: {@code allow_lazy_open}
	 */
	public final boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * Required - The analysis configuration, which specifies how to analyze the
	 * data. After you create a job, you cannot change the analysis configuration;
	 * all the properties are informational.
	 * <p>
	 * API name: {@code analysis_config}
	 */
	public final AnalysisConfig analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * Limits can be applied for the resources required to hold the mathematical
	 * models in memory. These limits are approximate and can be set per job. They
	 * do not control the memory used by other processes, for example the
	 * Elasticsearch Java processes.
	 * <p>
	 * API name: {@code analysis_limits}
	 */
	@Nullable
	public final AnalysisLimits analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * Advanced configuration option. The time between each periodic persistence of
	 * the model. The default value is a randomized value between 3 to 4 hours,
	 * which avoids all jobs persisting at exactly the same time. The smallest
	 * allowed value is 1 hour.
	 * <p>
	 * API name: {@code background_persist_interval}
	 */
	@Nullable
	public final Time backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * API name: {@code blocked}
	 */
	@Nullable
	public final JobBlocked blocked() {
		return this.blocked;
	}

	/**
	 * API name: {@code create_time}
	 */
	@Nullable
	public final DateTime createTime() {
		return this.createTime;
	}

	/**
	 * Advanced configuration option. Contains custom metadata about the job.
	 * <p>
	 * API name: {@code custom_settings}
	 */
	@Nullable
	public final JsonData customSettings() {
		return this.customSettings;
	}

	/**
	 * Advanced configuration option, which affects the automatic removal of old
	 * model snapshots for this job. It specifies a period of time (in days) after
	 * which only the first snapshot per day is retained. This period is relative to
	 * the timestamp of the most recent snapshot for this job. Valid values range
	 * from 0 to <code>model_snapshot_retention_days</code>.
	 * <p>
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	@Nullable
	public final Long dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
	}

	/**
	 * Required - The data description defines the format of the input data when you
	 * send data to the job by using the post data API. Note that when configuring a
	 * datafeed, these properties are automatically set. When data is received via
	 * the post data API, it is not stored in Elasticsearch. Only the results for
	 * anomaly detection are retained.
	 * <p>
	 * API name: {@code data_description}
	 */
	public final DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * The datafeed, which retrieves data from Elasticsearch for analysis by the
	 * job. You can associate only one datafeed with each anomaly detection job.
	 * <p>
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public final Datafeed datafeedConfig() {
		return this.datafeedConfig;
	}

	/**
	 * Indicates that the process of deleting the job is in progress but not yet
	 * completed. It is only reported when <code>true</code>.
	 * <p>
	 * API name: {@code deleting}
	 */
	@Nullable
	public final Boolean deleting() {
		return this.deleting;
	}

	/**
	 * A description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * If the job closed or failed, this is the time the job finished, otherwise it
	 * is <code>null</code>. This property is informational; you cannot change its
	 * value.
	 * <p>
	 * API name: {@code finished_time}
	 */
	@Nullable
	public final DateTime finishedTime() {
		return this.finishedTime;
	}

	/**
	 * A list of job groups. A job can belong to no groups or many.
	 * <p>
	 * API name: {@code groups}
	 */
	public final List<String> groups() {
		return this.groups;
	}

	/**
	 * Required - Identifier for the anomaly detection job. This identifier can
	 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
	 * underscores. It must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Reserved for future use, currently set to <code>anomaly_detector</code>.
	 * <p>
	 * API name: {@code job_type}
	 */
	@Nullable
	public final String jobType() {
		return this.jobType;
	}

	/**
	 * The machine learning configuration version number at which the the job was
	 * created.
	 * <p>
	 * API name: {@code job_version}
	 */
	@Nullable
	public final String jobVersion() {
		return this.jobVersion;
	}

	/**
	 * This advanced configuration option stores model information along with the
	 * results. It provides a more detailed view into anomaly detection. Model plot
	 * provides a simplified and indicative view of the model and its bounds.
	 * <p>
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
	 * Required - Advanced configuration option, which affects the automatic removal
	 * of old model snapshots for this job. It specifies the maximum period of time
	 * (in days) that snapshots are retained. This period is relative to the
	 * timestamp of the most recent snapshot for this job. By default, snapshots ten
	 * days older than the newest snapshot are deleted.
	 * <p>
	 * API name: {@code model_snapshot_retention_days}
	 */
	public final long modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * Advanced configuration option. The period over which adjustments to the score
	 * are applied, as new data is seen. The default value is the longer of 30 days
	 * or 100 <code>bucket_spans</code>.
	 * <p>
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public final Long renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * Required - A text string that affects the name of the machine learning
	 * results index. The default value is <code>shared</code>, which generates an
	 * index named <code>.ml-anomalies-shared</code>.
	 * <p>
	 * API name: {@code results_index_name}
	 */
	public final String resultsIndexName() {
		return this.resultsIndexName;
	}

	/**
	 * Advanced configuration option. The period of time (in days) that results are
	 * retained. Age is calculated relative to the timestamp of the latest bucket
	 * result. If this property has a non-null value, once per day at 00:30 (server
	 * time), results that are the specified number of days older than the latest
	 * bucket result are deleted from Elasticsearch. The default value is null,
	 * which means all results are retained. Annotations generated by the system
	 * also count as results for retention purposes; they are deleted after the same
	 * number of days as results. Annotations added by users are retained forever.
	 * <p>
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

		if (this.analysisLimits != null) {
			generator.writeKey("analysis_limits");
			this.analysisLimits.serialize(generator, mapper);

		}
		if (this.backgroundPersistInterval != null) {
			generator.writeKey("background_persist_interval");
			this.backgroundPersistInterval.serialize(generator, mapper);

		}
		if (this.blocked != null) {
			generator.writeKey("blocked");
			this.blocked.serialize(generator, mapper);

		}
		if (this.createTime != null) {
			generator.writeKey("create_time");
			this.createTime.serialize(generator, mapper);
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
		if (this.deleting != null) {
			generator.writeKey("deleting");
			generator.write(this.deleting);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.finishedTime != null) {
			generator.writeKey("finished_time");
			this.finishedTime.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.groups)) {
			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("job_id");
		generator.write(this.jobId);

		if (this.jobType != null) {
			generator.writeKey("job_type");
			generator.write(this.jobType);

		}
		if (this.jobVersion != null) {
			generator.writeKey("job_version");
			generator.write(this.jobVersion);

		}
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Job}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Job> {
		private Boolean allowLazyOpen;

		private AnalysisConfig analysisConfig;

		@Nullable
		private AnalysisLimits analysisLimits;

		@Nullable
		private Time backgroundPersistInterval;

		@Nullable
		private JobBlocked blocked;

		@Nullable
		private DateTime createTime;

		@Nullable
		private JsonData customSettings;

		@Nullable
		private Long dailyModelSnapshotRetentionAfterDays;

		private DataDescription dataDescription;

		@Nullable
		private Datafeed datafeedConfig;

		@Nullable
		private Boolean deleting;

		@Nullable
		private String description;

		@Nullable
		private DateTime finishedTime;

		@Nullable
		private List<String> groups;

		private String jobId;

		@Nullable
		private String jobType;

		@Nullable
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
		 * Required - Advanced configuration option. Specifies whether this job can open
		 * when there is insufficient machine learning node capacity for it to be
		 * immediately assigned to a node.
		 * <p>
		 * API name: {@code allow_lazy_open}
		 */
		public final Builder allowLazyOpen(boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * Required - The analysis configuration, which specifies how to analyze the
		 * data. After you create a job, you cannot change the analysis configuration;
		 * all the properties are informational.
		 * <p>
		 * API name: {@code analysis_config}
		 */
		public final Builder analysisConfig(AnalysisConfig value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * Required - The analysis configuration, which specifies how to analyze the
		 * data. After you create a job, you cannot change the analysis configuration;
		 * all the properties are informational.
		 * <p>
		 * API name: {@code analysis_config}
		 */
		public final Builder analysisConfig(Function<AnalysisConfig.Builder, ObjectBuilder<AnalysisConfig>> fn) {
			return this.analysisConfig(fn.apply(new AnalysisConfig.Builder()).build());
		}

		/**
		 * Limits can be applied for the resources required to hold the mathematical
		 * models in memory. These limits are approximate and can be set per job. They
		 * do not control the memory used by other processes, for example the
		 * Elasticsearch Java processes.
		 * <p>
		 * API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(@Nullable AnalysisLimits value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * Limits can be applied for the resources required to hold the mathematical
		 * models in memory. These limits are approximate and can be set per job. They
		 * do not control the memory used by other processes, for example the
		 * Elasticsearch Java processes.
		 * <p>
		 * API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(Function<AnalysisLimits.Builder, ObjectBuilder<AnalysisLimits>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisLimits.Builder()).build());
		}

		/**
		 * Advanced configuration option. The time between each periodic persistence of
		 * the model. The default value is a randomized value between 3 to 4 hours,
		 * which avoids all jobs persisting at exactly the same time. The smallest
		 * allowed value is 1 hour.
		 * <p>
		 * API name: {@code background_persist_interval}
		 */
		public final Builder backgroundPersistInterval(@Nullable Time value) {
			this.backgroundPersistInterval = value;
			return this;
		}

		/**
		 * Advanced configuration option. The time between each periodic persistence of
		 * the model. The default value is a randomized value between 3 to 4 hours,
		 * which avoids all jobs persisting at exactly the same time. The smallest
		 * allowed value is 1 hour.
		 * <p>
		 * API name: {@code background_persist_interval}
		 */
		public final Builder backgroundPersistInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.backgroundPersistInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code blocked}
		 */
		public final Builder blocked(@Nullable JobBlocked value) {
			this.blocked = value;
			return this;
		}

		/**
		 * API name: {@code blocked}
		 */
		public final Builder blocked(Function<JobBlocked.Builder, ObjectBuilder<JobBlocked>> fn) {
			return this.blocked(fn.apply(new JobBlocked.Builder()).build());
		}

		/**
		 * API name: {@code create_time}
		 */
		public final Builder createTime(@Nullable DateTime value) {
			this.createTime = value;
			return this;
		}

		/**
		 * Advanced configuration option. Contains custom metadata about the job.
		 * <p>
		 * API name: {@code custom_settings}
		 */
		public final Builder customSettings(@Nullable JsonData value) {
			this.customSettings = value;
			return this;
		}

		/**
		 * Advanced configuration option, which affects the automatic removal of old
		 * model snapshots for this job. It specifies a period of time (in days) after
		 * which only the first snapshot per day is retained. This period is relative to
		 * the timestamp of the most recent snapshot for this job. Valid values range
		 * from 0 to <code>model_snapshot_retention_days</code>.
		 * <p>
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public final Builder dailyModelSnapshotRetentionAfterDays(@Nullable Long value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		/**
		 * Required - The data description defines the format of the input data when you
		 * send data to the job by using the post data API. Note that when configuring a
		 * datafeed, these properties are automatically set. When data is received via
		 * the post data API, it is not stored in Elasticsearch. Only the results for
		 * anomaly detection are retained.
		 * <p>
		 * API name: {@code data_description}
		 */
		public final Builder dataDescription(DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * Required - The data description defines the format of the input data when you
		 * send data to the job by using the post data API. Note that when configuring a
		 * datafeed, these properties are automatically set. When data is received via
		 * the post data API, it is not stored in Elasticsearch. Only the results for
		 * anomaly detection are retained.
		 * <p>
		 * API name: {@code data_description}
		 */
		public final Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * The datafeed, which retrieves data from Elasticsearch for analysis by the
		 * job. You can associate only one datafeed with each anomaly detection job.
		 * <p>
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(@Nullable Datafeed value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * The datafeed, which retrieves data from Elasticsearch for analysis by the
		 * job. You can associate only one datafeed with each anomaly detection job.
		 * <p>
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return this.datafeedConfig(fn.apply(new Datafeed.Builder()).build());
		}

		/**
		 * Indicates that the process of deleting the job is in progress but not yet
		 * completed. It is only reported when <code>true</code>.
		 * <p>
		 * API name: {@code deleting}
		 */
		public final Builder deleting(@Nullable Boolean value) {
			this.deleting = value;
			return this;
		}

		/**
		 * A description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * If the job closed or failed, this is the time the job finished, otherwise it
		 * is <code>null</code>. This property is informational; you cannot change its
		 * value.
		 * <p>
		 * API name: {@code finished_time}
		 */
		public final Builder finishedTime(@Nullable DateTime value) {
			this.finishedTime = value;
			return this;
		}

		/**
		 * A list of job groups. A job can belong to no groups or many.
		 * <p>
		 * API name: {@code groups}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>groups</code>.
		 */
		public final Builder groups(List<String> list) {
			this.groups = _listAddAll(this.groups, list);
			return this;
		}

		/**
		 * A list of job groups. A job can belong to no groups or many.
		 * <p>
		 * API name: {@code groups}
		 * <p>
		 * Adds one or more values to <code>groups</code>.
		 */
		public final Builder groups(String value, String... values) {
			this.groups = _listAdd(this.groups, value, values);
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job. This identifier can
		 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
		 * underscores. It must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Reserved for future use, currently set to <code>anomaly_detector</code>.
		 * <p>
		 * API name: {@code job_type}
		 */
		public final Builder jobType(@Nullable String value) {
			this.jobType = value;
			return this;
		}

		/**
		 * The machine learning configuration version number at which the the job was
		 * created.
		 * <p>
		 * API name: {@code job_version}
		 */
		public final Builder jobVersion(@Nullable String value) {
			this.jobVersion = value;
			return this;
		}

		/**
		 * This advanced configuration option stores model information along with the
		 * results. It provides a more detailed view into anomaly detection. Model plot
		 * provides a simplified and indicative view of the model and its bounds.
		 * <p>
		 * API name: {@code model_plot_config}
		 */
		public final Builder modelPlotConfig(@Nullable ModelPlotConfig value) {
			this.modelPlotConfig = value;
			return this;
		}

		/**
		 * This advanced configuration option stores model information along with the
		 * results. It provides a more detailed view into anomaly detection. Model plot
		 * provides a simplified and indicative view of the model and its bounds.
		 * <p>
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
		 * Required - Advanced configuration option, which affects the automatic removal
		 * of old model snapshots for this job. It specifies the maximum period of time
		 * (in days) that snapshots are retained. This period is relative to the
		 * timestamp of the most recent snapshot for this job. By default, snapshots ten
		 * days older than the newest snapshot are deleted.
		 * <p>
		 * API name: {@code model_snapshot_retention_days}
		 */
		public final Builder modelSnapshotRetentionDays(long value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * Advanced configuration option. The period over which adjustments to the score
		 * are applied, as new data is seen. The default value is the longer of 30 days
		 * or 100 <code>bucket_spans</code>.
		 * <p>
		 * API name: {@code renormalization_window_days}
		 */
		public final Builder renormalizationWindowDays(@Nullable Long value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * Required - A text string that affects the name of the machine learning
		 * results index. The default value is <code>shared</code>, which generates an
		 * index named <code>.ml-anomalies-shared</code>.
		 * <p>
		 * API name: {@code results_index_name}
		 */
		public final Builder resultsIndexName(String value) {
			this.resultsIndexName = value;
			return this;
		}

		/**
		 * Advanced configuration option. The period of time (in days) that results are
		 * retained. Age is calculated relative to the timestamp of the latest bucket
		 * result. If this property has a non-null value, once per day at 00:30 (server
		 * time), results that are the specified number of days older than the latest
		 * bucket result are deleted from Elasticsearch. The default value is null,
		 * which means all results are retained. Annotations generated by the system
		 * also count as results for retention purposes; they are deleted after the same
		 * number of days as results. Annotations added by users are retained forever.
		 * <p>
		 * API name: {@code results_retention_days}
		 */
		public final Builder resultsRetentionDays(@Nullable Long value) {
			this.resultsRetentionDays = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Job}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Job build() {
			_checkSingleUse();

			return new Job(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Job}
	 */
	public static final JsonpDeserializer<Job> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Job::setupJobDeserializer);

	protected static void setupJobDeserializer(ObjectDeserializer<Job.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfig._DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits._DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, Time._DESERIALIZER, "background_persist_interval");
		op.add(Builder::blocked, JobBlocked._DESERIALIZER, "blocked");
		op.add(Builder::createTime, DateTime._DESERIALIZER, "create_time");
		op.add(Builder::customSettings, JsonData._DESERIALIZER, "custom_settings");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.longDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::dataDescription, DataDescription._DESERIALIZER, "data_description");
		op.add(Builder::datafeedConfig, Datafeed._DESERIALIZER, "datafeed_config");
		op.add(Builder::deleting, JsonpDeserializer.booleanDeserializer(), "deleting");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::finishedTime, DateTime._DESERIALIZER, "finished_time");
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
