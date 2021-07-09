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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_job.Request
public final class PutJobRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final Boolean allowLazyOpen;

	private final AnalysisConfig analysisConfig;

	@Nullable
	private final AnalysisLimits analysisLimits;

	private final JsonValue backgroundPersistInterval;

	@Nullable
	private final CustomSettings customSettings;

	@Nullable
	private final DataDescription dataDescription;

	@Nullable
	private final Number dailyModelSnapshotRetentionAfterDays;

	@Nullable
	private final List<String> groups;

	@Nullable
	private final String description;

	@Nullable
	private final ModelPlotConfig modelPlotConfig;

	@Nullable
	private final Number modelSnapshotRetentionDays;

	@Nullable
	private final String resultsIndexName;

	@Nullable
	private final Number resultsRetentionDays;

	// ---------------------------------------------------------------------------------------------

	protected PutJobRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.allowLazyOpen = builder.allowLazyOpen;
		this.analysisConfig = Objects.requireNonNull(builder.analysisConfig, "analysis_config");
		this.analysisLimits = builder.analysisLimits;
		this.backgroundPersistInterval = Objects.requireNonNull(builder.backgroundPersistInterval,
				"background_persist_interval");
		this.customSettings = builder.customSettings;
		this.dataDescription = builder.dataDescription;
		this.dailyModelSnapshotRetentionAfterDays = builder.dailyModelSnapshotRetentionAfterDays;
		this.groups = builder.groups;
		this.description = builder.description;
		this.modelPlotConfig = builder.modelPlotConfig;
		this.modelSnapshotRetentionDays = builder.modelSnapshotRetentionDays;
		this.resultsIndexName = builder.resultsIndexName;
		this.resultsRetentionDays = builder.resultsRetentionDays;

	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
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
	public JsonValue backgroundPersistInterval() {
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
	 * API name: {@code data_description}
	 */
	@Nullable
	public DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	@Nullable
	public Number dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public List<String> groups() {
		return this.groups;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
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
	public Number modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
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

		generator.writeKey("analysis_config");
		this.analysisConfig.toJsonp(generator, mapper);

		if (this.analysisLimits != null) {

			generator.writeKey("analysis_limits");
			this.analysisLimits.toJsonp(generator, mapper);

		}

		generator.writeKey("background_persist_interval");
		generator.write(this.backgroundPersistInterval);

		if (this.customSettings != null) {

			generator.writeKey("custom_settings");
			this.customSettings.toJsonp(generator, mapper);

		}
		if (this.dataDescription != null) {

			generator.writeKey("data_description");
			this.dataDescription.toJsonp(generator, mapper);

		}
		if (this.dailyModelSnapshotRetentionAfterDays != null) {

			generator.writeKey("daily_model_snapshot_retention_after_days");
			generator.write(this.dailyModelSnapshotRetentionAfterDays.doubleValue());

		}
		if (this.groups != null) {

			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.modelPlotConfig != null) {

			generator.writeKey("model_plot_config");
			this.modelPlotConfig.toJsonp(generator, mapper);

		}
		if (this.modelSnapshotRetentionDays != null) {

			generator.writeKey("model_snapshot_retention_days");
			generator.write(this.modelSnapshotRetentionDays.doubleValue());

		}
		if (this.resultsIndexName != null) {

			generator.writeKey("results_index_name");
			generator.write(this.resultsIndexName);

		}
		if (this.resultsRetentionDays != null) {

			generator.writeKey("results_retention_days");
			generator.write(this.resultsRetentionDays.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutJobRequest> {
		private String jobId;

		@Nullable
		private Boolean allowLazyOpen;

		private AnalysisConfig analysisConfig;

		@Nullable
		private AnalysisLimits analysisLimits;

		private JsonValue backgroundPersistInterval;

		@Nullable
		private CustomSettings customSettings;

		@Nullable
		private DataDescription dataDescription;

		@Nullable
		private Number dailyModelSnapshotRetentionAfterDays;

		@Nullable
		private List<String> groups;

		@Nullable
		private String description;

		@Nullable
		private ModelPlotConfig modelPlotConfig;

		@Nullable
		private Number modelSnapshotRetentionDays;

		@Nullable
		private String resultsIndexName;

		@Nullable
		private Number resultsRetentionDays;

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

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
		public Builder backgroundPersistInterval(JsonValue value) {
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
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public Builder dailyModelSnapshotRetentionAfterDays(@Nullable Number value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
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
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
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
		public Builder modelSnapshotRetentionDays(@Nullable Number value) {
			this.modelSnapshotRetentionDays = value;
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
		 * Builds a {@link PutJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutJobRequest build() {

			return new PutJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutJobRequest
	 */
	public static final JsonpDeserializer<PutJobRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutJobRequest::setupPutJobRequestDeserializer);

	protected static void setupPutJobRequestDeserializer(DelegatingDeserializer<PutJobRequest.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfig.DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits.DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, JsonpDeserializer.jsonValueDeserializer(),
				"background_persist_interval");
		op.add(Builder::customSettings, CustomSettings.DESERIALIZER, "custom_settings");
		op.add(Builder::dataDescription, DataDescription.DESERIALIZER, "data_description");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.numberDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::modelPlotConfig, ModelPlotConfig.DESERIALIZER, "model_plot_config");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.numberDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.numberDeserializer(), "results_retention_days");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_job}".
	 */
	public static final Endpoint<PutJobRequest, PutJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutJobResponse.DESERIALIZER);
}
