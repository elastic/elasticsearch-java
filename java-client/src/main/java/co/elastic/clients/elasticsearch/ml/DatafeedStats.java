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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DatafeedStats
@JsonpDeserializable
public class DatafeedStats implements JsonpSerializable {
	private final String assignmentExplanation;

	private final String datafeedId;

	private final DiscoveryNode node;

	private final DatafeedState state;

	private final DatafeedTimingStats timingStats;

	// ---------------------------------------------------------------------------------------------

	private DatafeedStats(Builder builder) {

		this.assignmentExplanation = ModelTypeHelper.requireNonNull(builder.assignmentExplanation, this,
				"assignmentExplanation");
		this.datafeedId = ModelTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.node = ModelTypeHelper.requireNonNull(builder.node, this, "node");
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");
		this.timingStats = ModelTypeHelper.requireNonNull(builder.timingStats, this, "timingStats");

	}

	public static DatafeedStats of(Function<Builder, ObjectBuilder<DatafeedStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code assignment_explanation}
	 */
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
	 * Required - API name: {@code node}
	 */
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

		generator.writeKey("datafeed_id");
		generator.write(this.datafeedId);

		generator.writeKey("node");
		this.node.serialize(generator, mapper);

		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("timing_stats");
		this.timingStats.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DatafeedStats> {
		private String assignmentExplanation;

		private String datafeedId;

		private DiscoveryNode node;

		private DatafeedState state;

		private DatafeedTimingStats timingStats;

		/**
		 * Required - API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(String value) {
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
			DatafeedStats::setupDatafeedStatsDeserializer, Builder::build);

	protected static void setupDatafeedStatsDeserializer(DelegatingDeserializer<DatafeedStats.Builder> op) {

		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::node, DiscoveryNode._DESERIALIZER, "node");
		op.add(Builder::state, DatafeedState._DESERIALIZER, "state");
		op.add(Builder::timingStats, DatafeedTimingStats._DESERIALIZER, "timing_stats");

	}

}
