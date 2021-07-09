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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DatafeedStats
public final class DatafeedStats implements ToJsonp {
	private final String assignmentExplanation;

	private final String datafeedId;

	private final DiscoveryNode node;

	private final JsonValue state;

	private final DatafeedTimingStats timingStats;

	// ---------------------------------------------------------------------------------------------

	protected DatafeedStats(Builder builder) {

		this.assignmentExplanation = Objects.requireNonNull(builder.assignmentExplanation, "assignment_explanation");
		this.datafeedId = Objects.requireNonNull(builder.datafeedId, "datafeed_id");
		this.node = Objects.requireNonNull(builder.node, "node");
		this.state = Objects.requireNonNull(builder.state, "state");
		this.timingStats = Objects.requireNonNull(builder.timingStats, "timing_stats");

	}

	/**
	 * API name: {@code assignment_explanation}
	 */
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * API name: {@code datafeed_id}
	 */
	public String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code node}
	 */
	public DiscoveryNode node() {
		return this.node;
	}

	/**
	 * API name: {@code state}
	 */
	public JsonValue state() {
		return this.state;
	}

	/**
	 * API name: {@code timing_stats}
	 */
	public DatafeedTimingStats timingStats() {
		return this.timingStats;
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

		generator.writeKey("assignment_explanation");
		generator.write(this.assignmentExplanation);

		generator.writeKey("datafeed_id");
		generator.write(this.datafeedId);

		generator.writeKey("node");
		this.node.toJsonp(generator, mapper);

		generator.writeKey("state");
		generator.write(this.state);

		generator.writeKey("timing_stats");
		this.timingStats.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedStats}.
	 */
	public static class Builder implements ObjectBuilder<DatafeedStats> {
		private String assignmentExplanation;

		private String datafeedId;

		private DiscoveryNode node;

		private JsonValue state;

		private DatafeedTimingStats timingStats;

		/**
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(DiscoveryNode value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(Function<DiscoveryNode.Builder, ObjectBuilder<DiscoveryNode>> fn) {
			return this.node(fn.apply(new DiscoveryNode.Builder()).build());
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(JsonValue value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code timing_stats}
		 */
		public Builder timingStats(DatafeedTimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * API name: {@code timing_stats}
		 */
		public Builder timingStats(Function<DatafeedTimingStats.Builder, ObjectBuilder<DatafeedTimingStats>> fn) {
			return this.timingStats(fn.apply(new DatafeedTimingStats.Builder()).build());
		}

		/**
		 * Builds a {@link DatafeedStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedStats build() {

			return new DatafeedStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DatafeedStats
	 */
	public static final JsonpDeserializer<DatafeedStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DatafeedStats::setupDatafeedStatsDeserializer);

	protected static void setupDatafeedStatsDeserializer(DelegatingDeserializer<DatafeedStats.Builder> op) {

		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::node, DiscoveryNode.DESERIALIZER, "node");
		op.add(Builder::state, JsonpDeserializer.jsonValueDeserializer(), "state");
		op.add(Builder::timingStats, DatafeedTimingStats.DESERIALIZER, "timing_stats");

	}

}
