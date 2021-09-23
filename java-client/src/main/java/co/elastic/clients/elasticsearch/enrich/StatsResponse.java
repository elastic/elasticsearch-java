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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.elasticsearch.enrich.stats.CoordinatorStats;
import co.elastic.clients.elasticsearch.enrich.stats.ExecutingPolicy;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.stats.Response
public final class StatsResponse implements JsonpSerializable {
	private final List<CoordinatorStats> coordinatorStats;

	private final List<ExecutingPolicy> executingPolicies;

	// ---------------------------------------------------------------------------------------------

	public StatsResponse(Builder builder) {

		this.coordinatorStats = Objects.requireNonNull(builder.coordinatorStats, "coordinator_stats");
		this.executingPolicies = Objects.requireNonNull(builder.executingPolicies, "executing_policies");

	}

	/**
	 * API name: {@code coordinator_stats}
	 */
	public List<CoordinatorStats> coordinatorStats() {
		return this.coordinatorStats;
	}

	/**
	 * API name: {@code executing_policies}
	 */
	public List<ExecutingPolicy> executingPolicies() {
		return this.executingPolicies;
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

		generator.writeKey("coordinator_stats");
		generator.writeStartArray();
		for (CoordinatorStats item0 : this.coordinatorStats) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("executing_policies");
		generator.writeStartArray();
		for (ExecutingPolicy item0 : this.executingPolicies) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<StatsResponse> {
		private List<CoordinatorStats> coordinatorStats;

		private List<ExecutingPolicy> executingPolicies;

		/**
		 * API name: {@code coordinator_stats}
		 */
		public Builder coordinatorStats(List<CoordinatorStats> value) {
			this.coordinatorStats = value;
			return this;
		}

		/**
		 * API name: {@code coordinator_stats}
		 */
		public Builder coordinatorStats(CoordinatorStats... value) {
			this.coordinatorStats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #coordinatorStats(List)}, creating the list if needed.
		 */
		public Builder addCoordinatorStats(CoordinatorStats value) {
			if (this.coordinatorStats == null) {
				this.coordinatorStats = new ArrayList<>();
			}
			this.coordinatorStats.add(value);
			return this;
		}

		/**
		 * Set {@link #coordinatorStats(List)} to a singleton list.
		 */
		public Builder coordinatorStats(Function<CoordinatorStats.Builder, ObjectBuilder<CoordinatorStats>> fn) {
			return this.coordinatorStats(fn.apply(new CoordinatorStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #coordinatorStats(List)}, creating the list if needed.
		 */
		public Builder addCoordinatorStats(Function<CoordinatorStats.Builder, ObjectBuilder<CoordinatorStats>> fn) {
			return this.addCoordinatorStats(fn.apply(new CoordinatorStats.Builder()).build());
		}

		/**
		 * API name: {@code executing_policies}
		 */
		public Builder executingPolicies(List<ExecutingPolicy> value) {
			this.executingPolicies = value;
			return this;
		}

		/**
		 * API name: {@code executing_policies}
		 */
		public Builder executingPolicies(ExecutingPolicy... value) {
			this.executingPolicies = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #executingPolicies(List)}, creating the list if needed.
		 */
		public Builder addExecutingPolicies(ExecutingPolicy value) {
			if (this.executingPolicies == null) {
				this.executingPolicies = new ArrayList<>();
			}
			this.executingPolicies.add(value);
			return this;
		}

		/**
		 * Set {@link #executingPolicies(List)} to a singleton list.
		 */
		public Builder executingPolicies(Function<ExecutingPolicy.Builder, ObjectBuilder<ExecutingPolicy>> fn) {
			return this.executingPolicies(fn.apply(new ExecutingPolicy.Builder()).build());
		}

		/**
		 * Add a value to {@link #executingPolicies(List)}, creating the list if needed.
		 */
		public Builder addExecutingPolicies(Function<ExecutingPolicy.Builder, ObjectBuilder<ExecutingPolicy>> fn) {
			return this.addExecutingPolicies(fn.apply(new ExecutingPolicy.Builder()).build());
		}

		/**
		 * Builds a {@link StatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsResponse build() {

			return new StatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StatsResponse}
	 */
	public static final JsonpDeserializer<StatsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StatsResponse::setupStatsResponseDeserializer);

	protected static void setupStatsResponseDeserializer(DelegatingDeserializer<StatsResponse.Builder> op) {

		op.add(Builder::coordinatorStats, JsonpDeserializer.arrayDeserializer(CoordinatorStats.DESERIALIZER),
				"coordinator_stats");
		op.add(Builder::executingPolicies, JsonpDeserializer.arrayDeserializer(ExecutingPolicy.DESERIALIZER),
				"executing_policies");

	}

}
