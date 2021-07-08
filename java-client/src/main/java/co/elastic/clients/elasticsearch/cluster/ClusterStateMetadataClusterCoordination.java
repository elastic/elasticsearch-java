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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateMetadataClusterCoordination
public final class ClusterStateMetadataClusterCoordination implements ToJsonp {
	private final Number term;

	private final List<String> lastCommittedConfig;

	private final List<String> lastAcceptedConfig;

	private final List<VotingConfigExclusionsItem> votingConfigExclusions;

	// ---------------------------------------------------------------------------------------------

	protected ClusterStateMetadataClusterCoordination(Builder builder) {

		this.term = Objects.requireNonNull(builder.term, "term");
		this.lastCommittedConfig = Objects.requireNonNull(builder.lastCommittedConfig, "last_committed_config");
		this.lastAcceptedConfig = Objects.requireNonNull(builder.lastAcceptedConfig, "last_accepted_config");
		this.votingConfigExclusions = Objects.requireNonNull(builder.votingConfigExclusions,
				"voting_config_exclusions");

	}

	/**
	 * API name: {@code term}
	 */
	public Number term() {
		return this.term;
	}

	/**
	 * API name: {@code last_committed_config}
	 */
	public List<String> lastCommittedConfig() {
		return this.lastCommittedConfig;
	}

	/**
	 * API name: {@code last_accepted_config}
	 */
	public List<String> lastAcceptedConfig() {
		return this.lastAcceptedConfig;
	}

	/**
	 * API name: {@code voting_config_exclusions}
	 */
	public List<VotingConfigExclusionsItem> votingConfigExclusions() {
		return this.votingConfigExclusions;
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

		generator.writeKey("term");
		generator.write(this.term.doubleValue());

		generator.writeKey("last_committed_config");
		generator.writeStartArray();
		for (String item0 : this.lastCommittedConfig) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("last_accepted_config");
		generator.writeStartArray();
		for (String item0 : this.lastAcceptedConfig) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("voting_config_exclusions");
		generator.writeStartArray();
		for (VotingConfigExclusionsItem item0 : this.votingConfigExclusions) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateMetadataClusterCoordination}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateMetadataClusterCoordination> {
		private Number term;

		private List<String> lastCommittedConfig;

		private List<String> lastAcceptedConfig;

		private List<VotingConfigExclusionsItem> votingConfigExclusions;

		/**
		 * API name: {@code term}
		 */
		public Builder term(Number value) {
			this.term = value;
			return this;
		}

		/**
		 * API name: {@code last_committed_config}
		 */
		public Builder lastCommittedConfig(List<String> value) {
			this.lastCommittedConfig = value;
			return this;
		}

		/**
		 * API name: {@code last_committed_config}
		 */
		public Builder lastCommittedConfig(String... value) {
			this.lastCommittedConfig = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #lastCommittedConfig(List)}, creating the list if
		 * needed.
		 */
		public Builder addLastCommittedConfig(String value) {
			if (this.lastCommittedConfig == null) {
				this.lastCommittedConfig = new ArrayList<>();
			}
			this.lastCommittedConfig.add(value);
			return this;
		}

		/**
		 * API name: {@code last_accepted_config}
		 */
		public Builder lastAcceptedConfig(List<String> value) {
			this.lastAcceptedConfig = value;
			return this;
		}

		/**
		 * API name: {@code last_accepted_config}
		 */
		public Builder lastAcceptedConfig(String... value) {
			this.lastAcceptedConfig = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #lastAcceptedConfig(List)}, creating the list if
		 * needed.
		 */
		public Builder addLastAcceptedConfig(String value) {
			if (this.lastAcceptedConfig == null) {
				this.lastAcceptedConfig = new ArrayList<>();
			}
			this.lastAcceptedConfig.add(value);
			return this;
		}

		/**
		 * API name: {@code voting_config_exclusions}
		 */
		public Builder votingConfigExclusions(List<VotingConfigExclusionsItem> value) {
			this.votingConfigExclusions = value;
			return this;
		}

		/**
		 * API name: {@code voting_config_exclusions}
		 */
		public Builder votingConfigExclusions(VotingConfigExclusionsItem... value) {
			this.votingConfigExclusions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #votingConfigExclusions(List)}, creating the list if
		 * needed.
		 */
		public Builder addVotingConfigExclusions(VotingConfigExclusionsItem value) {
			if (this.votingConfigExclusions == null) {
				this.votingConfigExclusions = new ArrayList<>();
			}
			this.votingConfigExclusions.add(value);
			return this;
		}

		/**
		 * Set {@link #votingConfigExclusions(List)} to a singleton list.
		 */
		public Builder votingConfigExclusions(
				Function<VotingConfigExclusionsItem.Builder, ObjectBuilder<VotingConfigExclusionsItem>> fn) {
			return this.votingConfigExclusions(fn.apply(new VotingConfigExclusionsItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #votingConfigExclusions(List)}, creating the list if
		 * needed.
		 */
		public Builder addVotingConfigExclusions(
				Function<VotingConfigExclusionsItem.Builder, ObjectBuilder<VotingConfigExclusionsItem>> fn) {
			return this.addVotingConfigExclusions(fn.apply(new VotingConfigExclusionsItem.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterStateMetadataClusterCoordination}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateMetadataClusterCoordination build() {

			return new ClusterStateMetadataClusterCoordination(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterStateMetadataClusterCoordination
	 */
	public static final JsonpDeserializer<ClusterStateMetadataClusterCoordination> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ClusterStateMetadataClusterCoordination::setupClusterStateMetadataClusterCoordinationDeserializer);

	protected static void setupClusterStateMetadataClusterCoordinationDeserializer(
			DelegatingDeserializer<ClusterStateMetadataClusterCoordination.Builder> op) {

		op.add(Builder::term, JsonpDeserializer.numberDeserializer(), "term");
		op.add(Builder::lastCommittedConfig,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "last_committed_config");
		op.add(Builder::lastAcceptedConfig, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"last_accepted_config");
		op.add(Builder::votingConfigExclusions,
				JsonpDeserializer.arrayDeserializer(VotingConfigExclusionsItem.DESERIALIZER),
				"voting_config_exclusions");

	}

}
