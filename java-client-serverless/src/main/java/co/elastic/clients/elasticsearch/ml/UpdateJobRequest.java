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

// typedef: ml.update_job.Request

/**
 * Updates certain properties of an anomaly detection job.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.update_job.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateJobRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowLazyOpen;

	@Nullable
	private final AnalysisMemoryLimit analysisLimits;

	@Nullable
	private final Time backgroundPersistInterval;

	private final List<String> categorizationFilters;

	private final Map<String, JsonData> customSettings;

	@Nullable
	private final Long dailyModelSnapshotRetentionAfterDays;

	@Nullable
	private final String description;

	private final List<Detector> detectors;

	private final List<String> groups;

	private final String jobId;

	@Nullable
	private final ModelPlotConfig modelPlotConfig;

	@Nullable
	private final Time modelPruneWindow;

	@Nullable
	private final Long modelSnapshotRetentionDays;

	@Nullable
	private final PerPartitionCategorization perPartitionCategorization;

	@Nullable
	private final Long renormalizationWindowDays;

	@Nullable
	private final Long resultsRetentionDays;

	// ---------------------------------------------------------------------------------------------

	private UpdateJobRequest(Builder builder) {

		this.allowLazyOpen = builder.allowLazyOpen;
		this.analysisLimits = builder.analysisLimits;
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.categorizationFilters = ApiTypeHelper.unmodifiable(builder.categorizationFilters);
		this.customSettings = ApiTypeHelper.unmodifiable(builder.customSettings);
		this.dailyModelSnapshotRetentionAfterDays = builder.dailyModelSnapshotRetentionAfterDays;
		this.description = builder.description;
		this.detectors = ApiTypeHelper.unmodifiable(builder.detectors);
		this.groups = ApiTypeHelper.unmodifiable(builder.groups);
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.modelPlotConfig = builder.modelPlotConfig;
		this.modelPruneWindow = builder.modelPruneWindow;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.perPartitionCategorization = builder.perPartitionCategorization;
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsRetentionDays = builder.resultsRetentionDays;

	}

	public static UpdateJobRequest of(Function<Builder, ObjectBuilder<UpdateJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Advanced configuration option. Specifies whether this job can open when there
	 * is insufficient machine learning node capacity for it to be immediately
	 * assigned to a node. If <code>false</code> and a machine learning node with
	 * capacity to run the job cannot immediately be found, the open anomaly
	 * detection jobs API returns an error. However, this is also subject to the
	 * cluster-wide <code>xpack.ml.max_lazy_ml_nodes</code> setting. If this option
	 * is set to <code>true</code>, the open anomaly detection jobs API does not
	 * return an error and the job waits in the opening state until sufficient
	 * machine learning node capacity is available.
	 * <p>
	 * API name: {@code allow_lazy_open}
	 */
	@Nullable
	public final Boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * API name: {@code analysis_limits}
	 */
	@Nullable
	public final AnalysisMemoryLimit analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * Advanced configuration option. The time between each periodic persistence of
	 * the model. The default value is a randomized value between 3 to 4 hours,
	 * which avoids all jobs persisting at exactly the same time. The smallest
	 * allowed value is 1 hour. For very large models (several GB), persistence
	 * could take 10-20 minutes, so do not set the value too low. If the job is open
	 * when you make the update, you must stop the datafeed, close the job, then
	 * reopen the job and restart the datafeed for the changes to take effect.
	 * <p>
	 * API name: {@code background_persist_interval}
	 */
	@Nullable
	public final Time backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * API name: {@code categorization_filters}
	 */
	public final List<String> categorizationFilters() {
		return this.categorizationFilters;
	}

	/**
	 * Advanced configuration option. Contains custom meta data about the job. For
	 * example, it can contain custom URL information as shown in Adding custom URLs
	 * to machine learning results.
	 * <p>
	 * API name: {@code custom_settings}
	 */
	public final Map<String, JsonData> customSettings() {
		return this.customSettings;
	}

	/**
	 * Advanced configuration option, which affects the automatic removal of old
	 * model snapshots for this job. It specifies a period of time (in days) after
	 * which only the first snapshot per day is retained. This period is relative to
	 * the timestamp of the most recent snapshot for this job. Valid values range
	 * from 0 to <code>model_snapshot_retention_days</code>. For jobs created before
	 * version 7.8.0, the default value matches
	 * <code>model_snapshot_retention_days</code>.
	 * <p>
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	@Nullable
	public final Long dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
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
	 * An array of detector update objects.
	 * <p>
	 * API name: {@code detectors}
	 */
	public final List<Detector> detectors() {
		return this.detectors;
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
	 * Required - Identifier for the job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code model_plot_config}
	 */
	@Nullable
	public final ModelPlotConfig modelPlotConfig() {
		return this.modelPlotConfig;
	}

	/**
	 * API name: {@code model_prune_window}
	 */
	@Nullable
	public final Time modelPruneWindow() {
		return this.modelPruneWindow;
	}

	/**
	 * Advanced configuration option, which affects the automatic removal of old
	 * model snapshots for this job. It specifies the maximum period of time (in
	 * days) that snapshots are retained. This period is relative to the timestamp
	 * of the most recent snapshot for this job.
	 * <p>
	 * API name: {@code model_snapshot_retention_days}
	 */
	@Nullable
	public final Long modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * Settings related to how categorization interacts with partition fields.
	 * <p>
	 * API name: {@code per_partition_categorization}
	 */
	@Nullable
	public final PerPartitionCategorization perPartitionCategorization() {
		return this.perPartitionCategorization;
	}

	/**
	 * Advanced configuration option. The period over which adjustments to the score
	 * are applied, as new data is seen.
	 * <p>
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public final Long renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * Advanced configuration option. The period of time (in days) that results are
	 * retained. Age is calculated relative to the timestamp of the latest bucket
	 * result. If this property has a non-null value, once per day at 00:30 (server
	 * time), results that are the specified number of days older than the latest
	 * bucket result are deleted from Elasticsearch. The default value is null,
	 * which means all results are retained.
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
		if (this.analysisLimits != null) {
			generator.writeKey("analysis_limits");
			this.analysisLimits.serialize(generator, mapper);

		}
		if (this.backgroundPersistInterval != null) {
			generator.writeKey("background_persist_interval");
			this.backgroundPersistInterval.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.categorizationFilters)) {
			generator.writeKey("categorization_filters");
			generator.writeStartArray();
			for (String item0 : this.categorizationFilters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.customSettings)) {
			generator.writeKey("custom_settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.customSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.dailyModelSnapshotRetentionAfterDays != null) {
			generator.writeKey("daily_model_snapshot_retention_after_days");
			generator.write(this.dailyModelSnapshotRetentionAfterDays);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ApiTypeHelper.isDefined(this.detectors)) {
			generator.writeKey("detectors");
			generator.writeStartArray();
			for (Detector item0 : this.detectors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

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
		if (this.modelPruneWindow != null) {
			generator.writeKey("model_prune_window");
			this.modelPruneWindow.serialize(generator, mapper);

		}
		if (this.modelSnapshotRetentionDays != null) {
			generator.writeKey("model_snapshot_retention_days");
			generator.write(this.modelSnapshotRetentionDays);

		}
		if (this.perPartitionCategorization != null) {
			generator.writeKey("per_partition_categorization");
			this.perPartitionCategorization.serialize(generator, mapper);

		}
		if (this.renormalizationWindowDays != null) {
			generator.writeKey("renormalization_window_days");
			generator.write(this.renormalizationWindowDays);

		}
		if (this.resultsRetentionDays != null) {
			generator.writeKey("results_retention_days");
			generator.write(this.resultsRetentionDays);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateJobRequest> {
		@Nullable
		private Boolean allowLazyOpen;

		@Nullable
		private AnalysisMemoryLimit analysisLimits;

		@Nullable
		private Time backgroundPersistInterval;

		@Nullable
		private List<String> categorizationFilters;

		@Nullable
		private Map<String, JsonData> customSettings;

		@Nullable
		private Long dailyModelSnapshotRetentionAfterDays;

		@Nullable
		private String description;

		@Nullable
		private List<Detector> detectors;

		@Nullable
		private List<String> groups;

		private String jobId;

		@Nullable
		private ModelPlotConfig modelPlotConfig;

		@Nullable
		private Time modelPruneWindow;

		@Nullable
		private Long modelSnapshotRetentionDays;

		@Nullable
		private PerPartitionCategorization perPartitionCategorization;

		@Nullable
		private Long renormalizationWindowDays;

		@Nullable
		private Long resultsRetentionDays;

		/**
		 * Advanced configuration option. Specifies whether this job can open when there
		 * is insufficient machine learning node capacity for it to be immediately
		 * assigned to a node. If <code>false</code> and a machine learning node with
		 * capacity to run the job cannot immediately be found, the open anomaly
		 * detection jobs API returns an error. However, this is also subject to the
		 * cluster-wide <code>xpack.ml.max_lazy_ml_nodes</code> setting. If this option
		 * is set to <code>true</code>, the open anomaly detection jobs API does not
		 * return an error and the job waits in the opening state until sufficient
		 * machine learning node capacity is available.
		 * <p>
		 * API name: {@code allow_lazy_open}
		 */
		public final Builder allowLazyOpen(@Nullable Boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(@Nullable AnalysisMemoryLimit value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public final Builder analysisLimits(
				Function<AnalysisMemoryLimit.Builder, ObjectBuilder<AnalysisMemoryLimit>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisMemoryLimit.Builder()).build());
		}

		/**
		 * Advanced configuration option. The time between each periodic persistence of
		 * the model. The default value is a randomized value between 3 to 4 hours,
		 * which avoids all jobs persisting at exactly the same time. The smallest
		 * allowed value is 1 hour. For very large models (several GB), persistence
		 * could take 10-20 minutes, so do not set the value too low. If the job is open
		 * when you make the update, you must stop the datafeed, close the job, then
		 * reopen the job and restart the datafeed for the changes to take effect.
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
		 * could take 10-20 minutes, so do not set the value too low. If the job is open
		 * when you make the update, you must stop the datafeed, close the job, then
		 * reopen the job and restart the datafeed for the changes to take effect.
		 * <p>
		 * API name: {@code background_persist_interval}
		 */
		public final Builder backgroundPersistInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.backgroundPersistInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code categorization_filters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>categorizationFilters</code>.
		 */
		public final Builder categorizationFilters(List<String> list) {
			this.categorizationFilters = _listAddAll(this.categorizationFilters, list);
			return this;
		}

		/**
		 * API name: {@code categorization_filters}
		 * <p>
		 * Adds one or more values to <code>categorizationFilters</code>.
		 */
		public final Builder categorizationFilters(String value, String... values) {
			this.categorizationFilters = _listAdd(this.categorizationFilters, value, values);
			return this;
		}

		/**
		 * Advanced configuration option. Contains custom meta data about the job. For
		 * example, it can contain custom URL information as shown in Adding custom URLs
		 * to machine learning results.
		 * <p>
		 * API name: {@code custom_settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>customSettings</code>.
		 */
		public final Builder customSettings(Map<String, JsonData> map) {
			this.customSettings = _mapPutAll(this.customSettings, map);
			return this;
		}

		/**
		 * Advanced configuration option. Contains custom meta data about the job. For
		 * example, it can contain custom URL information as shown in Adding custom URLs
		 * to machine learning results.
		 * <p>
		 * API name: {@code custom_settings}
		 * <p>
		 * Adds an entry to <code>customSettings</code>.
		 */
		public final Builder customSettings(String key, JsonData value) {
			this.customSettings = _mapPut(this.customSettings, key, value);
			return this;
		}

		/**
		 * Advanced configuration option, which affects the automatic removal of old
		 * model snapshots for this job. It specifies a period of time (in days) after
		 * which only the first snapshot per day is retained. This period is relative to
		 * the timestamp of the most recent snapshot for this job. Valid values range
		 * from 0 to <code>model_snapshot_retention_days</code>. For jobs created before
		 * version 7.8.0, the default value matches
		 * <code>model_snapshot_retention_days</code>.
		 * <p>
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public final Builder dailyModelSnapshotRetentionAfterDays(@Nullable Long value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
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
		 * An array of detector update objects.
		 * <p>
		 * API name: {@code detectors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>detectors</code>.
		 */
		public final Builder detectors(List<Detector> list) {
			this.detectors = _listAddAll(this.detectors, list);
			return this;
		}

		/**
		 * An array of detector update objects.
		 * <p>
		 * API name: {@code detectors}
		 * <p>
		 * Adds one or more values to <code>detectors</code>.
		 */
		public final Builder detectors(Detector value, Detector... values) {
			this.detectors = _listAdd(this.detectors, value, values);
			return this;
		}

		/**
		 * An array of detector update objects.
		 * <p>
		 * API name: {@code detectors}
		 * <p>
		 * Adds a value to <code>detectors</code> using a builder lambda.
		 */
		public final Builder detectors(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return detectors(fn.apply(new Detector.Builder()).build());
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
		 * Required - Identifier for the job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
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
		 * API name: {@code model_prune_window}
		 */
		public final Builder modelPruneWindow(@Nullable Time value) {
			this.modelPruneWindow = value;
			return this;
		}

		/**
		 * API name: {@code model_prune_window}
		 */
		public final Builder modelPruneWindow(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.modelPruneWindow(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Advanced configuration option, which affects the automatic removal of old
		 * model snapshots for this job. It specifies the maximum period of time (in
		 * days) that snapshots are retained. This period is relative to the timestamp
		 * of the most recent snapshot for this job.
		 * <p>
		 * API name: {@code model_snapshot_retention_days}
		 */
		public final Builder modelSnapshotRetentionDays(@Nullable Long value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 * <p>
		 * API name: {@code per_partition_categorization}
		 */
		public final Builder perPartitionCategorization(@Nullable PerPartitionCategorization value) {
			this.perPartitionCategorization = value;
			return this;
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 * <p>
		 * API name: {@code per_partition_categorization}
		 */
		public final Builder perPartitionCategorization(
				Function<PerPartitionCategorization.Builder, ObjectBuilder<PerPartitionCategorization>> fn) {
			return this.perPartitionCategorization(fn.apply(new PerPartitionCategorization.Builder()).build());
		}

		/**
		 * Advanced configuration option. The period over which adjustments to the score
		 * are applied, as new data is seen.
		 * <p>
		 * API name: {@code renormalization_window_days}
		 */
		public final Builder renormalizationWindowDays(@Nullable Long value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * Advanced configuration option. The period of time (in days) that results are
		 * retained. Age is calculated relative to the timestamp of the latest bucket
		 * result. If this property has a non-null value, once per day at 00:30 (server
		 * time), results that are the specified number of days older than the latest
		 * bucket result are deleted from Elasticsearch. The default value is null,
		 * which means all results are retained.
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
		 * Builds a {@link UpdateJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateJobRequest build() {
			_checkSingleUse();

			return new UpdateJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateJobRequest}
	 */
	public static final JsonpDeserializer<UpdateJobRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			UpdateJobRequest::setupUpdateJobRequestDeserializer);

	protected static void setupUpdateJobRequestDeserializer(ObjectDeserializer<UpdateJobRequest.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisLimits, AnalysisMemoryLimit._DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, Time._DESERIALIZER, "background_persist_interval");
		op.add(Builder::categorizationFilters,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "categorization_filters");
		op.add(Builder::customSettings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"custom_settings");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.longDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::detectors, JsonpDeserializer.arrayDeserializer(Detector._DESERIALIZER), "detectors");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::modelPlotConfig, ModelPlotConfig._DESERIALIZER, "model_plot_config");
		op.add(Builder::modelPruneWindow, Time._DESERIALIZER, "model_prune_window");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.longDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::perPartitionCategorization, PerPartitionCategorization._DESERIALIZER,
				"per_partition_categorization");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.longDeserializer(), "renormalization_window_days");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.longDeserializer(), "results_retention_days");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_job}".
	 */
	public static final Endpoint<UpdateJobRequest, UpdateJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.update_job",

			// Request method
			request -> {
				return "POST";

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
					buf.append("/_update");
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

			}, SimpleEndpoint.emptyMap(), true, UpdateJobResponse._DESERIALIZER);
}
