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

// typedef: ml._types.DatafeedStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.DatafeedStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatafeedStats implements JsonpSerializable {
	@Nullable
	private final String assignmentExplanation;

	private final String datafeedId;

	private final DatafeedState state;

	private final DatafeedTimingStats timingStats;

	@Nullable
	private final DatafeedRunningState runningState;

	// ---------------------------------------------------------------------------------------------

	private DatafeedStats(Builder builder) {

		this.assignmentExplanation = builder.assignmentExplanation;
		this.datafeedId = ApiTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.timingStats = ApiTypeHelper.requireNonNull(builder.timingStats, this, "timingStats");
		this.runningState = builder.runningState;

	}

	public static DatafeedStats of(Function<Builder, ObjectBuilder<DatafeedStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For started datafeeds only, contains messages relating to the selection of a
	 * node.
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * Required - A numerical character string that uniquely identifies the
	 * datafeed. This identifier can contain lowercase alphanumeric characters (a-z
	 * and 0-9), hyphens, and underscores. It must start and end with alphanumeric
	 * characters.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Required - The status of the datafeed, which can be one of the following
	 * values: <code>starting</code>, <code>started</code>, <code>stopping</code>,
	 * <code>stopped</code>.
	 * <p>
	 * API name: {@code state}
	 */
	public final DatafeedState state() {
		return this.state;
	}

	/**
	 * Required - An object that provides statistical information about timing
	 * aspect of this datafeed.
	 * <p>
	 * API name: {@code timing_stats}
	 */
	public final DatafeedTimingStats timingStats() {
		return this.timingStats;
	}

	/**
	 * An object containing the running state for this datafeed. It is only provided
	 * if the datafeed is started.
	 * <p>
	 * API name: {@code running_state}
	 */
	@Nullable
	public final DatafeedRunningState runningState() {
		return this.runningState;
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

		if (this.assignmentExplanation != null) {
			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}
		generator.writeKey("datafeed_id");
		generator.write(this.datafeedId);

		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("timing_stats");
		this.timingStats.serialize(generator, mapper);

		if (this.runningState != null) {
			generator.writeKey("running_state");
			this.runningState.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DatafeedStats> {
		@Nullable
		private String assignmentExplanation;

		private String datafeedId;

		private DatafeedState state;

		private DatafeedTimingStats timingStats;

		@Nullable
		private DatafeedRunningState runningState;

		/**
		 * For started datafeeds only, contains messages relating to the selection of a
		 * node.
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * Required - A numerical character string that uniquely identifies the
		 * datafeed. This identifier can contain lowercase alphanumeric characters (a-z
		 * and 0-9), hyphens, and underscores. It must start and end with alphanumeric
		 * characters.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Required - The status of the datafeed, which can be one of the following
		 * values: <code>starting</code>, <code>started</code>, <code>stopping</code>,
		 * <code>stopped</code>.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(DatafeedState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - An object that provides statistical information about timing
		 * aspect of this datafeed.
		 * <p>
		 * API name: {@code timing_stats}
		 */
		public final Builder timingStats(DatafeedTimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * Required - An object that provides statistical information about timing
		 * aspect of this datafeed.
		 * <p>
		 * API name: {@code timing_stats}
		 */
		public final Builder timingStats(Function<DatafeedTimingStats.Builder, ObjectBuilder<DatafeedTimingStats>> fn) {
			return this.timingStats(fn.apply(new DatafeedTimingStats.Builder()).build());
		}

		/**
		 * An object containing the running state for this datafeed. It is only provided
		 * if the datafeed is started.
		 * <p>
		 * API name: {@code running_state}
		 */
		public final Builder runningState(@Nullable DatafeedRunningState value) {
			this.runningState = value;
			return this;
		}

		/**
		 * An object containing the running state for this datafeed. It is only provided
		 * if the datafeed is started.
		 * <p>
		 * API name: {@code running_state}
		 */
		public final Builder runningState(
				Function<DatafeedRunningState.Builder, ObjectBuilder<DatafeedRunningState>> fn) {
			return this.runningState(fn.apply(new DatafeedRunningState.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatafeedStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedStats build() {
			_checkSingleUse();

			return new DatafeedStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedStats}
	 */
	public static final JsonpDeserializer<DatafeedStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DatafeedStats::setupDatafeedStatsDeserializer);

	protected static void setupDatafeedStatsDeserializer(ObjectDeserializer<DatafeedStats.Builder> op) {

		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::state, DatafeedState._DESERIALIZER, "state");
		op.add(Builder::timingStats, DatafeedTimingStats._DESERIALIZER, "timing_stats");
		op.add(Builder::runningState, DatafeedRunningState._DESERIALIZER, "running_state");

	}

}
