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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.JobStats
@JsonpDeserializable
public class JobStats implements JsonpSerializable {
	private final String assignmentExplanation;

	private final DataCounts dataCounts;

	private final JobForecastStatistics forecastsStats;

	private final String jobId;

	private final ModelSizeStats modelSizeStats;

	private final DiscoveryNode node;

	@Nullable
	private final String openTime;

	private final JobState state;

	private final JobTimingStats timingStats;

	@Nullable
	private final Boolean deleting;

	// ---------------------------------------------------------------------------------------------

	private JobStats(Builder builder) {

		this.assignmentExplanation = ModelTypeHelper.requireNonNull(builder.assignmentExplanation, this,
				"assignmentExplanation");
		this.dataCounts = ModelTypeHelper.requireNonNull(builder.dataCounts, this, "dataCounts");
		this.forecastsStats = ModelTypeHelper.requireNonNull(builder.forecastsStats, this, "forecastsStats");
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.modelSizeStats = ModelTypeHelper.requireNonNull(builder.modelSizeStats, this, "modelSizeStats");
		this.node = ModelTypeHelper.requireNonNull(builder.node, this, "node");
		this.openTime = builder.openTime;
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");
		this.timingStats = ModelTypeHelper.requireNonNull(builder.timingStats, this, "timingStats");
		this.deleting = builder.deleting;

	}

	public static JobStats of(Function<Builder, ObjectBuilder<JobStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code assignment_explanation}
	 */
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * Required - API name: {@code data_counts}
	 */
	public final DataCounts dataCounts() {
		return this.dataCounts;
	}

	/**
	 * Required - API name: {@code forecasts_stats}
	 */
	public final JobForecastStatistics forecastsStats() {
		return this.forecastsStats;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code model_size_stats}
	 */
	public final ModelSizeStats modelSizeStats() {
		return this.modelSizeStats;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final DiscoveryNode node() {
		return this.node;
	}

	/**
	 * API name: {@code open_time}
	 */
	@Nullable
	public final String openTime() {
		return this.openTime;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final JobState state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code timing_stats}
	 */
	public final JobTimingStats timingStats() {
		return this.timingStats;
	}

	/**
	 * API name: {@code deleting}
	 */
	@Nullable
	public final Boolean deleting() {
		return this.deleting;
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

		generator.writeKey("assignment_explanation");
		generator.write(this.assignmentExplanation);

		generator.writeKey("data_counts");
		this.dataCounts.serialize(generator, mapper);

		generator.writeKey("forecasts_stats");
		this.forecastsStats.serialize(generator, mapper);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("model_size_stats");
		this.modelSizeStats.serialize(generator, mapper);

		generator.writeKey("node");
		this.node.serialize(generator, mapper);

		if (this.openTime != null) {
			generator.writeKey("open_time");
			generator.write(this.openTime);

		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("timing_stats");
		this.timingStats.serialize(generator, mapper);

		if (this.deleting != null) {
			generator.writeKey("deleting");
			generator.write(this.deleting);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<JobStats> {
		private String assignmentExplanation;

		private DataCounts dataCounts;

		private JobForecastStatistics forecastsStats;

		private String jobId;

		private ModelSizeStats modelSizeStats;

		private DiscoveryNode node;

		@Nullable
		private String openTime;

		private JobState state;

		private JobTimingStats timingStats;

		@Nullable
		private Boolean deleting;

		/**
		 * Required - API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_counts}
		 */
		public final Builder dataCounts(DataCounts value) {
			this.dataCounts = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_counts}
		 */
		public final Builder dataCounts(Function<DataCounts.Builder, ObjectBuilder<DataCounts>> fn) {
			return this.dataCounts(fn.apply(new DataCounts.Builder()).build());
		}

		/**
		 * Required - API name: {@code forecasts_stats}
		 */
		public final Builder forecastsStats(JobForecastStatistics value) {
			this.forecastsStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code forecasts_stats}
		 */
		public final Builder forecastsStats(
				Function<JobForecastStatistics.Builder, ObjectBuilder<JobForecastStatistics>> fn) {
			return this.forecastsStats(fn.apply(new JobForecastStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_size_stats}
		 */
		public final Builder modelSizeStats(ModelSizeStats value) {
			this.modelSizeStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_size_stats}
		 */
		public final Builder modelSizeStats(Function<ModelSizeStats.Builder, ObjectBuilder<ModelSizeStats>> fn) {
			return this.modelSizeStats(fn.apply(new ModelSizeStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(DiscoveryNode value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(Function<DiscoveryNode.Builder, ObjectBuilder<DiscoveryNode>> fn) {
			return this.node(fn.apply(new DiscoveryNode.Builder()).build());
		}

		/**
		 * API name: {@code open_time}
		 */
		public final Builder openTime(@Nullable String value) {
			this.openTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(JobState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(JobTimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(Function<JobTimingStats.Builder, ObjectBuilder<JobTimingStats>> fn) {
			return this.timingStats(fn.apply(new JobTimingStats.Builder()).build());
		}

		/**
		 * API name: {@code deleting}
		 */
		public final Builder deleting(@Nullable Boolean value) {
			this.deleting = value;
			return this;
		}

		/**
		 * Builds a {@link JobStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobStats build() {
			_checkSingleUse();

			return new JobStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobStats}
	 */
	public static final JsonpDeserializer<JobStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobStats::setupJobStatsDeserializer, Builder::build);

	protected static void setupJobStatsDeserializer(DelegatingDeserializer<JobStats.Builder> op) {

		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::dataCounts, DataCounts._DESERIALIZER, "data_counts");
		op.add(Builder::forecastsStats, JobForecastStatistics._DESERIALIZER, "forecasts_stats");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::modelSizeStats, ModelSizeStats._DESERIALIZER, "model_size_stats");
		op.add(Builder::node, DiscoveryNode._DESERIALIZER, "node");
		op.add(Builder::openTime, JsonpDeserializer.stringDeserializer(), "open_time");
		op.add(Builder::state, JobState._DESERIALIZER, "state");
		op.add(Builder::timingStats, JobTimingStats._DESERIALIZER, "timing_stats");
		op.add(Builder::deleting, JsonpDeserializer.booleanDeserializer(), "deleting");

	}

}
