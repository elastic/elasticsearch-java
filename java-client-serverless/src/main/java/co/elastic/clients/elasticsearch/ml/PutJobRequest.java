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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_job.Request

/**
 * Instantiates an anomaly detection job. If you include a
 * <code>datafeed_config</code>, you must have read index privileges on the
 * source index.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.put_job.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutJobRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowLazyOpen;

	private final AnalysisConfig analysisConfig;

	@Nullable
	private final AnalysisLimits analysisLimits;

	@Nullable
	private final Time backgroundPersistInterval;

	@Nullable
	private final JsonData customSettings;

	@Nullable
	private final Long dailyModelSnapshotRetentionAfterDays;

	private final DataDescription dataDescription;

	@Nullable
	private final DatafeedConfig datafeedConfig;

	@Nullable
	private final String description;

	private final List<String> groups;

	private final String jobId;

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

	private PutJobRequest(Builder builder) {

		this.allowLazyOpen = builder.allowLazyOpen;
		this.analysisConfig = ApiTypeHelper.requireNonNull(builder.analysisConfig, this, "analysisConfig");
		this.analysisLimits = builder.analysisLimits;
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.customSettings = builder.customSettings;
		this.dailyModelSnapshotRetentionAfterDays = builder.dailyModelSnapshotRetentionAfterDays;
		this.dataDescription = ApiTypeHelper.requireNonNull(builder.dataDescription, this, "dataDescription");
		this.datafeedConfig = builder.datafeedConfig;
		this.description = builder.description;
		this.groups = ApiTypeHelper.unmodifiable(builder.groups);
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.modelPlotConfig = builder.modelPlotConfig;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsIndexName = builder.resultsIndexName;
		this.resultsRetentionDays = builder.resultsRetentionDays;

	}

	public static PutJobRequest of(Function<Builder, ObjectBuilder<PutJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Advanced configuration option. Specifies whether this job can open when there
	 * is insufficient machine learning node capacity for it to be immediately
	 * assigned to a node. By default, if a machine learning node with capacity to
	 * run the job cannot immediately be found, the open anomaly detection jobs API
	 * returns an error. However, this is also subject to the cluster-wide
	 * <code>xpack.ml.max_lazy_ml_nodes</code> setting. If this option is set to
	 * true, the open anomaly detection jobs API does not return an error and the
	 * job waits in the opening state until sufficient machine learning node
	 * capacity is available.
	 * <p>
	 * API name: {@code allow_lazy_open}
	 */
	@Nullable
	public final Boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * Required - Specifies how to analyze the data. After you create a job, you
	 * cannot change the analysis configuration; all the properties are
	 * informational.
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
	 * allowed value is 1 hour. For very large models (several GB), persistence
	 * could take 10-20 minutes, so do not set the
	 * <code>background_persist_interval</code> value too low.
	 * <p>
	 * API name: {@code background_persist_interval}
	 */
	@Nullable
	public final Time backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * Advanced configuration option. Contains custom meta data about the job.
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
	 * Required - Defines the format of the input data when you send data to the job
	 * by using the post data API. Note that when configure a datafeed, these
	 * properties are automatically set. When data is received via the post data
	 * API, it is not stored in Elasticsearch. Only the results for anomaly
	 * detection are retained.
	 * <p>
	 * API name: {@code data_description}
	 */
	public final DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * Defines a datafeed for the anomaly detection job. If Elasticsearch security
	 * features are enabled, your datafeed remembers which roles the user who
	 * created it had at the time of creation and runs the query using those same
	 * roles. If you provide secondary authorization headers, those credentials are
	 * used instead.
	 * <p>
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public final DatafeedConfig datafeedConfig() {
		return this.datafeedConfig;
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
	 * A list of job groups. A job can belong to no groups or many.
	 * <p>
	 * API name: {@code groups}
	 */
	public final List<String> groups() {
		return this.groups;
	}

	/**
	 * Required - The identifier for the anomaly detection job. This identifier can
	 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
	 * underscores. It must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * This advanced configuration option stores model information along with the
	 * results. It provides a more detailed view into anomaly detection. If you
	 * enable model plot it can add considerable overhead to the performance of the
	 * system; it is not feasible for jobs with many entities. Model plot provides a
	 * simplified and indicative view of the model and its bounds. It does not
	 * display complex features such as multivariate correlations or multimodal
	 * data. As such, anomalies may occasionally be reported which cannot be seen in
	 * the model plot. Model plot config can be configured when the job is created
	 * or updated later. It must be disabled if performance issues are experienced.
	 * <p>
	 * API name: {@code model_plot_config}
	 */
	@Nullable
	public final ModelPlotConfig modelPlotConfig() {
		return this.modelPlotConfig;
	}

	/**
	 * Advanced configuration option, which affects the automatic removal of old
	 * model snapshots for this job. It specifies the maximum period of time (in
	 * days) that snapshots are retained. This period is relative to the timestamp
	 * of the most recent snapshot for this job. By default, snapshots ten days
	 * older than the newest snapshot are deleted.
	 * <p>
	 * API name: {@code model_snapshot_retention_days}
	 */
	@Nullable
	public final Long modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * Advanced configuration option. The period over which adjustments to the score
	 * are applied, as new data is seen. The default value is the longer of 30 days
	 * or 100 bucket spans.
	 * <p>
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public final Long renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * A text string that affects the name of the machine learning results index. By
	 * default, the job generates an index named <code>.ml-anomalies-shared</code>.
	 * <p>
	 * API name: {@code results_index_name}
	 */
	@Nullable
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
			this.backgroundPersistInterval.serialize(generator, mapper);

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
		if (ApiTypeHelper.isDefined(this.groups)) {
			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

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
	 * Builder for {@link PutJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutJobRequest> {
		@Nullable
		private Boolean allowLazyOpen;

		private AnalysisConfig analysisConfig;

		@Nullable
		private AnalysisLimits analysisLimits;

		@Nullable
		private Time backgroundPersistInterval;

		@Nullable
		private JsonData customSettings;

		@Nullable
		private Long dailyModelSnapshotRetentionAfterDays;

		private DataDescription dataDescription;

		@Nullable
		private DatafeedConfig datafeedConfig;

		@Nullable
		private String description;

		@Nullable
		private List<String> groups;

		private String jobId;

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
		 * Advanced configuration option. Specifies whether this job can open when there
		 * is insufficient machine learning node capacity for it to be immediately
		 * assigned to a node. By default, if a machine learning node with capacity to
		 * run the job cannot immediately be found, the open anomaly detection jobs API
		 * returns an error. However, this is also subject to the cluster-wide
		 * <code>xpack.ml.max_lazy_ml_nodes</code> setting. If this option is set to
		 * true, the open anomaly detection jobs API does not return an error and the
		 * job waits in the opening state until sufficient machine learning node
		 * capacity is available.
		 * <p>
		 * API name: {@code allow_lazy_open}
		 */
		public final Builder allowLazyOpen(@Nullable Boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * Required - Specifies how to analyze the data. After you create a job, you
		 * cannot change the analysis configuration; all the properties are
		 * informational.
		 * <p>
		 * API name: {@code analysis_config}
		 */
		public final Builder analysisConfig(AnalysisConfig value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * Required - Specifies how to analyze the data. After you create a job, you
		 * cannot change the analysis configuration; all the properties are
		 * informational.
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
		 * allowed value is 1 hour. For very large models (several GB), persistence
		 * could take 10-20 minutes, so do not set the
		 * <code>background_persist_interval</code> value too low.
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
		 * allowed value is 1 hour. For very large models (several GB), persistence
		 * could take 10-20 minutes, so do not set the
		 * <code>background_persist_interval</code> value too low.
		 * <p>
		 * API name: {@code background_persist_interval}
		 */
		public final Builder backgroundPersistInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.backgroundPersistInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Advanced configuration option. Contains custom meta data about the job.
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
		 * Required - Defines the format of the input data when you send data to the job
		 * by using the post data API. Note that when configure a datafeed, these
		 * properties are automatically set. When data is received via the post data
		 * API, it is not stored in Elasticsearch. Only the results for anomaly
		 * detection are retained.
		 * <p>
		 * API name: {@code data_description}
		 */
		public final Builder dataDescription(DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * Required - Defines the format of the input data when you send data to the job
		 * by using the post data API. Note that when configure a datafeed, these
		 * properties are automatically set. When data is received via the post data
		 * API, it is not stored in Elasticsearch. Only the results for anomaly
		 * detection are retained.
		 * <p>
		 * API name: {@code data_description}
		 */
		public final Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * Defines a datafeed for the anomaly detection job. If Elasticsearch security
		 * features are enabled, your datafeed remembers which roles the user who
		 * created it had at the time of creation and runs the query using those same
		 * roles. If you provide secondary authorization headers, those credentials are
		 * used instead.
		 * <p>
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(@Nullable DatafeedConfig value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * Defines a datafeed for the anomaly detection job. If Elasticsearch security
		 * features are enabled, your datafeed remembers which roles the user who
		 * created it had at the time of creation and runs the query using those same
		 * roles. If you provide secondary authorization headers, those credentials are
		 * used instead.
		 * <p>
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(Function<DatafeedConfig.Builder, ObjectBuilder<DatafeedConfig>> fn) {
			return this.datafeedConfig(fn.apply(new DatafeedConfig.Builder()).build());
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
		 * Required - The identifier for the anomaly detection job. This identifier can
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
		 * This advanced configuration option stores model information along with the
		 * results. It provides a more detailed view into anomaly detection. If you
		 * enable model plot it can add considerable overhead to the performance of the
		 * system; it is not feasible for jobs with many entities. Model plot provides a
		 * simplified and indicative view of the model and its bounds. It does not
		 * display complex features such as multivariate correlations or multimodal
		 * data. As such, anomalies may occasionally be reported which cannot be seen in
		 * the model plot. Model plot config can be configured when the job is created
		 * or updated later. It must be disabled if performance issues are experienced.
		 * <p>
		 * API name: {@code model_plot_config}
		 */
		public final Builder modelPlotConfig(@Nullable ModelPlotConfig value) {
			this.modelPlotConfig = value;
			return this;
		}

		/**
		 * This advanced configuration option stores model information along with the
		 * results. It provides a more detailed view into anomaly detection. If you
		 * enable model plot it can add considerable overhead to the performance of the
		 * system; it is not feasible for jobs with many entities. Model plot provides a
		 * simplified and indicative view of the model and its bounds. It does not
		 * display complex features such as multivariate correlations or multimodal
		 * data. As such, anomalies may occasionally be reported which cannot be seen in
		 * the model plot. Model plot config can be configured when the job is created
		 * or updated later. It must be disabled if performance issues are experienced.
		 * <p>
		 * API name: {@code model_plot_config}
		 */
		public final Builder modelPlotConfig(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlotConfig(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * Advanced configuration option, which affects the automatic removal of old
		 * model snapshots for this job. It specifies the maximum period of time (in
		 * days) that snapshots are retained. This period is relative to the timestamp
		 * of the most recent snapshot for this job. By default, snapshots ten days
		 * older than the newest snapshot are deleted.
		 * <p>
		 * API name: {@code model_snapshot_retention_days}
		 */
		public final Builder modelSnapshotRetentionDays(@Nullable Long value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * Advanced configuration option. The period over which adjustments to the score
		 * are applied, as new data is seen. The default value is the longer of 30 days
		 * or 100 bucket spans.
		 * <p>
		 * API name: {@code renormalization_window_days}
		 */
		public final Builder renormalizationWindowDays(@Nullable Long value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * A text string that affects the name of the machine learning results index. By
		 * default, the job generates an index named <code>.ml-anomalies-shared</code>.
		 * <p>
		 * API name: {@code results_index_name}
		 */
		public final Builder resultsIndexName(@Nullable String value) {
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
		 * Builds a {@link PutJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutJobRequest build() {
			_checkSingleUse();

			return new PutJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutJobRequest}
	 */
	public static final JsonpDeserializer<PutJobRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutJobRequest::setupPutJobRequestDeserializer);

	protected static void setupPutJobRequestDeserializer(ObjectDeserializer<PutJobRequest.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfig._DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits._DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, Time._DESERIALIZER, "background_persist_interval");
		op.add(Builder::customSettings, JsonData._DESERIALIZER, "custom_settings");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.longDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::dataDescription, DataDescription._DESERIALIZER, "data_description");
		op.add(Builder::datafeedConfig, DatafeedConfig._DESERIALIZER, "datafeed_config");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::modelPlotConfig, ModelPlotConfig._DESERIALIZER, "model_plot_config");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.longDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.longDeserializer(), "renormalization_window_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.longDeserializer(), "results_retention_days");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_job}".
	 */
	public static final Endpoint<PutJobRequest, PutJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_job",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _jobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					params.put("jobId", request.jobId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutJobResponse._DESERIALIZER);
}
