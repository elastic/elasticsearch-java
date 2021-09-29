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

import co.elastic.clients.elasticsearch._types.NodeAttributes;
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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalytics
@JsonpDeserializable
public final class DataframeAnalytics implements JsonpSerializable {
	@Nullable
	private final DataframeAnalyticsStats analysisStats;

	@Nullable
	private final String assignmentExplanation;

	private final DataframeAnalyticsStatsDataCounts dataCounts;

	private final String id;

	private final DataframeAnalyticsStatsMemoryUsage memoryUsage;

	@Nullable
	private final NodeAttributes node;

	private final List<DataframeAnalyticsStatsProgress> progress;

	private final DataframeState state;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalytics(Builder builder) {

		this.analysisStats = builder.analysisStats;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.dataCounts = Objects.requireNonNull(builder.dataCounts, "data_counts");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.memoryUsage = Objects.requireNonNull(builder.memoryUsage, "memory_usage");
		this.node = builder.node;
		this.progress = ModelTypeHelper.unmodifiableNonNull(builder.progress, "progress");
		this.state = Objects.requireNonNull(builder.state, "state");

	}

	public DataframeAnalytics(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * An object containing information about the analysis job.
	 * <p>
	 * API name: {@code analysis_stats}
	 */
	@Nullable
	public DataframeAnalyticsStats analysisStats() {
		return this.analysisStats;
	}

	/**
	 * For running jobs only, contains messages relating to the selection of a node
	 * to run the job.
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * An object that provides counts for the quantity of documents skipped, used in
	 * training, or available for testing.
	 * <p>
	 * API name: {@code data_counts}
	 */
	public DataframeAnalyticsStatsDataCounts dataCounts() {
		return this.dataCounts;
	}

	/**
	 * The unique identifier of the data frame analytics job.
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * An object describing memory usage of the analytics. It is present only after
	 * the job is started and memory usage is reported.
	 * <p>
	 * API name: {@code memory_usage}
	 */
	public DataframeAnalyticsStatsMemoryUsage memoryUsage() {
		return this.memoryUsage;
	}

	/**
	 * Contains properties for the node that runs the job. This information is
	 * available only for running jobs.
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public NodeAttributes node() {
		return this.node;
	}

	/**
	 * The progress report of the data frame analytics job by phase.
	 * <p>
	 * API name: {@code progress}
	 */
	public List<DataframeAnalyticsStatsProgress> progress() {
		return this.progress;
	}

	/**
	 * The status of the data frame analytics job, which can be one of the following
	 * values: failed, started, starting, stopping, stopped.
	 * <p>
	 * API name: {@code state}
	 */
	public DataframeState state() {
		return this.state;
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

		if (this.analysisStats != null) {

			generator.writeKey("analysis_stats");
			this.analysisStats.serialize(generator, mapper);

		}
		if (this.assignmentExplanation != null) {

			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}

		generator.writeKey("data_counts");
		this.dataCounts.serialize(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("memory_usage");
		this.memoryUsage.serialize(generator, mapper);

		if (this.node != null) {

			generator.writeKey("node");
			this.node.serialize(generator, mapper);

		}

		generator.writeKey("progress");
		generator.writeStartArray();
		for (DataframeAnalyticsStatsProgress item0 : this.progress) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("state");
		this.state.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalytics}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalytics> {
		@Nullable
		private DataframeAnalyticsStats analysisStats;

		@Nullable
		private String assignmentExplanation;

		private DataframeAnalyticsStatsDataCounts dataCounts;

		private String id;

		private DataframeAnalyticsStatsMemoryUsage memoryUsage;

		@Nullable
		private NodeAttributes node;

		private List<DataframeAnalyticsStatsProgress> progress;

		private DataframeState state;

		/**
		 * An object containing information about the analysis job.
		 * <p>
		 * API name: {@code analysis_stats}
		 */
		public Builder analysisStats(@Nullable DataframeAnalyticsStats value) {
			this.analysisStats = value;
			return this;
		}

		/**
		 * An object containing information about the analysis job.
		 * <p>
		 * API name: {@code analysis_stats}
		 */
		public Builder analysisStats(
				Function<DataframeAnalyticsStats.Builder, ObjectBuilder<DataframeAnalyticsStats>> fn) {
			return this.analysisStats(fn.apply(new DataframeAnalyticsStats.Builder()).build());
		}

		/**
		 * For running jobs only, contains messages relating to the selection of a node
		 * to run the job.
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * An object that provides counts for the quantity of documents skipped, used in
		 * training, or available for testing.
		 * <p>
		 * API name: {@code data_counts}
		 */
		public Builder dataCounts(DataframeAnalyticsStatsDataCounts value) {
			this.dataCounts = value;
			return this;
		}

		/**
		 * An object that provides counts for the quantity of documents skipped, used in
		 * training, or available for testing.
		 * <p>
		 * API name: {@code data_counts}
		 */
		public Builder dataCounts(
				Function<DataframeAnalyticsStatsDataCounts.Builder, ObjectBuilder<DataframeAnalyticsStatsDataCounts>> fn) {
			return this.dataCounts(fn.apply(new DataframeAnalyticsStatsDataCounts.Builder()).build());
		}

		/**
		 * The unique identifier of the data frame analytics job.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * An object describing memory usage of the analytics. It is present only after
		 * the job is started and memory usage is reported.
		 * <p>
		 * API name: {@code memory_usage}
		 */
		public Builder memoryUsage(DataframeAnalyticsStatsMemoryUsage value) {
			this.memoryUsage = value;
			return this;
		}

		/**
		 * An object describing memory usage of the analytics. It is present only after
		 * the job is started and memory usage is reported.
		 * <p>
		 * API name: {@code memory_usage}
		 */
		public Builder memoryUsage(
				Function<DataframeAnalyticsStatsMemoryUsage.Builder, ObjectBuilder<DataframeAnalyticsStatsMemoryUsage>> fn) {
			return this.memoryUsage(fn.apply(new DataframeAnalyticsStatsMemoryUsage.Builder()).build());
		}

		/**
		 * Contains properties for the node that runs the job. This information is
		 * available only for running jobs.
		 * <p>
		 * API name: {@code node}
		 */
		public Builder node(@Nullable NodeAttributes value) {
			this.node = value;
			return this;
		}

		/**
		 * Contains properties for the node that runs the job. This information is
		 * available only for running jobs.
		 * <p>
		 * API name: {@code node}
		 */
		public Builder node(Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.node(fn.apply(new NodeAttributes.Builder()).build());
		}

		/**
		 * The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 */
		public Builder progress(List<DataframeAnalyticsStatsProgress> value) {
			this.progress = value;
			return this;
		}

		/**
		 * The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 */
		public Builder progress(DataframeAnalyticsStatsProgress... value) {
			this.progress = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #progress(List)}, creating the list if needed. 4
		 */
		public Builder addProgress(DataframeAnalyticsStatsProgress value) {
			if (this.progress == null) {
				this.progress = new ArrayList<>();
			}
			this.progress.add(value);
			return this;
		}

		/**
		 * Set {@link #progress(List)} to a singleton list.
		 */
		public Builder progress(
				Function<DataframeAnalyticsStatsProgress.Builder, ObjectBuilder<DataframeAnalyticsStatsProgress>> fn) {
			return this.progress(fn.apply(new DataframeAnalyticsStatsProgress.Builder()).build());
		}

		/**
		 * Add a value to {@link #progress(List)}, creating the list if needed. 5
		 */
		public Builder addProgress(
				Function<DataframeAnalyticsStatsProgress.Builder, ObjectBuilder<DataframeAnalyticsStatsProgress>> fn) {
			return this.addProgress(fn.apply(new DataframeAnalyticsStatsProgress.Builder()).build());
		}

		/**
		 * The status of the data frame analytics job, which can be one of the following
		 * values: failed, started, starting, stopping, stopped.
		 * <p>
		 * API name: {@code state}
		 */
		public Builder state(DataframeState value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalytics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalytics build() {

			return new DataframeAnalytics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalytics}
	 */
	public static final JsonpDeserializer<DataframeAnalytics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalytics::setupDataframeAnalyticsDeserializer, Builder::build);

	protected static void setupDataframeAnalyticsDeserializer(DelegatingDeserializer<DataframeAnalytics.Builder> op) {

		op.add(Builder::analysisStats, DataframeAnalyticsStats._DESERIALIZER, "analysis_stats");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::dataCounts, DataframeAnalyticsStatsDataCounts._DESERIALIZER, "data_counts");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::memoryUsage, DataframeAnalyticsStatsMemoryUsage._DESERIALIZER, "memory_usage");
		op.add(Builder::node, NodeAttributes._DESERIALIZER, "node");
		op.add(Builder::progress, JsonpDeserializer.arrayDeserializer(DataframeAnalyticsStatsProgress._DESERIALIZER),
				"progress");
		op.add(Builder::state, DataframeState._DESERIALIZER, "state");

	}

}
