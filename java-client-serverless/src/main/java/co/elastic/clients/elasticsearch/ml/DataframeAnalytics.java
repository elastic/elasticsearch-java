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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalytics

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.DataframeAnalytics">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalytics implements JsonpSerializable {
	@Nullable
	private final DataframeAnalyticsStats analysisStats;

	@Nullable
	private final String assignmentExplanation;

	private final DataframeAnalyticsStatsDataCounts dataCounts;

	private final String id;

	private final DataframeAnalyticsStatsMemoryUsage memoryUsage;

	private final List<DataframeAnalyticsStatsProgress> progress;

	private final DataframeState state;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalytics(Builder builder) {

		this.analysisStats = builder.analysisStats;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.dataCounts = ApiTypeHelper.requireNonNull(builder.dataCounts, this, "dataCounts");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.memoryUsage = ApiTypeHelper.requireNonNull(builder.memoryUsage, this, "memoryUsage");
		this.progress = ApiTypeHelper.unmodifiableRequired(builder.progress, this, "progress");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");

	}

	public static DataframeAnalytics of(Function<Builder, ObjectBuilder<DataframeAnalytics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * An object containing information about the analysis job.
	 * <p>
	 * API name: {@code analysis_stats}
	 */
	@Nullable
	public final DataframeAnalyticsStats analysisStats() {
		return this.analysisStats;
	}

	/**
	 * For running jobs only, contains messages relating to the selection of a node
	 * to run the job.
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * Required - An object that provides counts for the quantity of documents
	 * skipped, used in training, or available for testing.
	 * <p>
	 * API name: {@code data_counts}
	 */
	public final DataframeAnalyticsStatsDataCounts dataCounts() {
		return this.dataCounts;
	}

	/**
	 * Required - The unique identifier of the data frame analytics job.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - An object describing memory usage of the analytics. It is present
	 * only after the job is started and memory usage is reported.
	 * <p>
	 * API name: {@code memory_usage}
	 */
	public final DataframeAnalyticsStatsMemoryUsage memoryUsage() {
		return this.memoryUsage;
	}

	/**
	 * Required - The progress report of the data frame analytics job by phase.
	 * <p>
	 * API name: {@code progress}
	 */
	public final List<DataframeAnalyticsStatsProgress> progress() {
		return this.progress;
	}

	/**
	 * Required - The status of the data frame analytics job, which can be one of
	 * the following values: failed, started, starting, stopping, stopped.
	 * <p>
	 * API name: {@code state}
	 */
	public final DataframeState state() {
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

		if (ApiTypeHelper.isDefined(this.progress)) {
			generator.writeKey("progress");
			generator.writeStartArray();
			for (DataframeAnalyticsStatsProgress item0 : this.progress) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalytics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalytics> {
		@Nullable
		private DataframeAnalyticsStats analysisStats;

		@Nullable
		private String assignmentExplanation;

		private DataframeAnalyticsStatsDataCounts dataCounts;

		private String id;

		private DataframeAnalyticsStatsMemoryUsage memoryUsage;

		private List<DataframeAnalyticsStatsProgress> progress;

		private DataframeState state;

		/**
		 * An object containing information about the analysis job.
		 * <p>
		 * API name: {@code analysis_stats}
		 */
		public final Builder analysisStats(@Nullable DataframeAnalyticsStats value) {
			this.analysisStats = value;
			return this;
		}

		/**
		 * An object containing information about the analysis job.
		 * <p>
		 * API name: {@code analysis_stats}
		 */
		public final Builder analysisStats(
				Function<DataframeAnalyticsStats.Builder, ObjectBuilder<DataframeAnalyticsStats>> fn) {
			return this.analysisStats(fn.apply(new DataframeAnalyticsStats.Builder()).build());
		}

		/**
		 * For running jobs only, contains messages relating to the selection of a node
		 * to run the job.
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * Required - An object that provides counts for the quantity of documents
		 * skipped, used in training, or available for testing.
		 * <p>
		 * API name: {@code data_counts}
		 */
		public final Builder dataCounts(DataframeAnalyticsStatsDataCounts value) {
			this.dataCounts = value;
			return this;
		}

		/**
		 * Required - An object that provides counts for the quantity of documents
		 * skipped, used in training, or available for testing.
		 * <p>
		 * API name: {@code data_counts}
		 */
		public final Builder dataCounts(
				Function<DataframeAnalyticsStatsDataCounts.Builder, ObjectBuilder<DataframeAnalyticsStatsDataCounts>> fn) {
			return this.dataCounts(fn.apply(new DataframeAnalyticsStatsDataCounts.Builder()).build());
		}

		/**
		 * Required - The unique identifier of the data frame analytics job.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - An object describing memory usage of the analytics. It is present
		 * only after the job is started and memory usage is reported.
		 * <p>
		 * API name: {@code memory_usage}
		 */
		public final Builder memoryUsage(DataframeAnalyticsStatsMemoryUsage value) {
			this.memoryUsage = value;
			return this;
		}

		/**
		 * Required - An object describing memory usage of the analytics. It is present
		 * only after the job is started and memory usage is reported.
		 * <p>
		 * API name: {@code memory_usage}
		 */
		public final Builder memoryUsage(
				Function<DataframeAnalyticsStatsMemoryUsage.Builder, ObjectBuilder<DataframeAnalyticsStatsMemoryUsage>> fn) {
			return this.memoryUsage(fn.apply(new DataframeAnalyticsStatsMemoryUsage.Builder()).build());
		}

		/**
		 * Required - The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>progress</code>.
		 */
		public final Builder progress(List<DataframeAnalyticsStatsProgress> list) {
			this.progress = _listAddAll(this.progress, list);
			return this;
		}

		/**
		 * Required - The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 * <p>
		 * Adds one or more values to <code>progress</code>.
		 */
		public final Builder progress(DataframeAnalyticsStatsProgress value,
				DataframeAnalyticsStatsProgress... values) {
			this.progress = _listAdd(this.progress, value, values);
			return this;
		}

		/**
		 * Required - The progress report of the data frame analytics job by phase.
		 * <p>
		 * API name: {@code progress}
		 * <p>
		 * Adds a value to <code>progress</code> using a builder lambda.
		 */
		public final Builder progress(
				Function<DataframeAnalyticsStatsProgress.Builder, ObjectBuilder<DataframeAnalyticsStatsProgress>> fn) {
			return progress(fn.apply(new DataframeAnalyticsStatsProgress.Builder()).build());
		}

		/**
		 * Required - The status of the data frame analytics job, which can be one of
		 * the following values: failed, started, starting, stopping, stopped.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(DataframeState value) {
			this.state = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalytics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalytics build() {
			_checkSingleUse();

			return new DataframeAnalytics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalytics}
	 */
	public static final JsonpDeserializer<DataframeAnalytics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalytics::setupDataframeAnalyticsDeserializer);

	protected static void setupDataframeAnalyticsDeserializer(ObjectDeserializer<DataframeAnalytics.Builder> op) {

		op.add(Builder::analysisStats, DataframeAnalyticsStats._DESERIALIZER, "analysis_stats");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::dataCounts, DataframeAnalyticsStatsDataCounts._DESERIALIZER, "data_counts");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::memoryUsage, DataframeAnalyticsStatsMemoryUsage._DESERIALIZER, "memory_usage");
		op.add(Builder::progress, JsonpDeserializer.arrayDeserializer(DataframeAnalyticsStatsProgress._DESERIALIZER),
				"progress");
		op.add(Builder::state, DataframeState._DESERIALIZER, "state");

	}

}
