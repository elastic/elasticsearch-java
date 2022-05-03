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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

	@Nullable
	private final DiscoveryNode node;

	private final DatafeedState state;

	private final DatafeedTimingStats timingStats;

	@Nullable
	private final DatafeedRunningState runningState;

	// ---------------------------------------------------------------------------------------------

	private DatafeedStats(Builder builder) {

		this.assignmentExplanation = builder.assignmentExplanation;
		this.datafeedId = ApiTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.node = builder.node;
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.timingStats = ApiTypeHelper.requireNonNull(builder.timingStats, this, "timingStats");
		this.runningState = builder.runningState;

	}

	public static DatafeedStats of(Function<Builder, ObjectBuilder<DatafeedStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * Required - API name: {@code datafeed_id}
	 */
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code node}
	 */
	@Nullable
	public final DiscoveryNode node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final DatafeedState state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code timing_stats}
	 */
	public final DatafeedTimingStats timingStats() {
		return this.timingStats;
	}

	/**
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

		if (this.node != null) {
			generator.writeKey("node");
			this.node.serialize(generator, mapper);

		}
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

		@Nullable
		private DiscoveryNode node;

		private DatafeedState state;

		private DatafeedTimingStats timingStats;

		@Nullable
		private DatafeedRunningState runningState;

		/**
		 * API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * Required - API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable DiscoveryNode value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public final Builder node(Function<DiscoveryNode.Builder, ObjectBuilder<DiscoveryNode>> fn) {
			return this.node(fn.apply(new DiscoveryNode.Builder()).build());
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(DatafeedState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(DatafeedTimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(Function<DatafeedTimingStats.Builder, ObjectBuilder<DatafeedTimingStats>> fn) {
			return this.timingStats(fn.apply(new DatafeedTimingStats.Builder()).build());
		}

		/**
		 * API name: {@code running_state}
		 */
		public final Builder runningState(@Nullable DatafeedRunningState value) {
			this.runningState = value;
			return this;
		}

		/**
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
		op.add(Builder::node, DiscoveryNode._DESERIALIZER, "node");
		op.add(Builder::state, DatafeedState._DESERIALIZER, "state");
		op.add(Builder::timingStats, DatafeedTimingStats._DESERIALIZER, "timing_stats");
		op.add(Builder::runningState, DatafeedRunningState._DESERIALIZER, "running_state");

	}

}
