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

package co.elastic.clients.elasticsearch.ccr.stats;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.stats.AutoFollowStats
public final class AutoFollowStats implements JsonpSerializable {
	private final List<AutoFollowedCluster> autoFollowedClusters;

	private final Number numberOfFailedFollowIndices;

	private final Number numberOfFailedRemoteClusterStateRequests;

	private final Number numberOfSuccessfulFollowIndices;

	private final List<ErrorCause> recentAutoFollowErrors;

	// ---------------------------------------------------------------------------------------------

	public AutoFollowStats(Builder builder) {

		this.autoFollowedClusters = Objects.requireNonNull(builder.autoFollowedClusters, "auto_followed_clusters");
		this.numberOfFailedFollowIndices = Objects.requireNonNull(builder.numberOfFailedFollowIndices,
				"number_of_failed_follow_indices");
		this.numberOfFailedRemoteClusterStateRequests = Objects.requireNonNull(
				builder.numberOfFailedRemoteClusterStateRequests, "number_of_failed_remote_cluster_state_requests");
		this.numberOfSuccessfulFollowIndices = Objects.requireNonNull(builder.numberOfSuccessfulFollowIndices,
				"number_of_successful_follow_indices");
		this.recentAutoFollowErrors = Objects.requireNonNull(builder.recentAutoFollowErrors,
				"recent_auto_follow_errors");

	}

	/**
	 * API name: {@code auto_followed_clusters}
	 */
	public List<AutoFollowedCluster> autoFollowedClusters() {
		return this.autoFollowedClusters;
	}

	/**
	 * API name: {@code number_of_failed_follow_indices}
	 */
	public Number numberOfFailedFollowIndices() {
		return this.numberOfFailedFollowIndices;
	}

	/**
	 * API name: {@code number_of_failed_remote_cluster_state_requests}
	 */
	public Number numberOfFailedRemoteClusterStateRequests() {
		return this.numberOfFailedRemoteClusterStateRequests;
	}

	/**
	 * API name: {@code number_of_successful_follow_indices}
	 */
	public Number numberOfSuccessfulFollowIndices() {
		return this.numberOfSuccessfulFollowIndices;
	}

	/**
	 * API name: {@code recent_auto_follow_errors}
	 */
	public List<ErrorCause> recentAutoFollowErrors() {
		return this.recentAutoFollowErrors;
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

		generator.writeKey("auto_followed_clusters");
		generator.writeStartArray();
		for (AutoFollowedCluster item0 : this.autoFollowedClusters) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("number_of_failed_follow_indices");
		generator.write(this.numberOfFailedFollowIndices.doubleValue());

		generator.writeKey("number_of_failed_remote_cluster_state_requests");
		generator.write(this.numberOfFailedRemoteClusterStateRequests.doubleValue());

		generator.writeKey("number_of_successful_follow_indices");
		generator.write(this.numberOfSuccessfulFollowIndices.doubleValue());

		generator.writeKey("recent_auto_follow_errors");
		generator.writeStartArray();
		for (ErrorCause item0 : this.recentAutoFollowErrors) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowStats}.
	 */
	public static class Builder implements ObjectBuilder<AutoFollowStats> {
		private List<AutoFollowedCluster> autoFollowedClusters;

		private Number numberOfFailedFollowIndices;

		private Number numberOfFailedRemoteClusterStateRequests;

		private Number numberOfSuccessfulFollowIndices;

		private List<ErrorCause> recentAutoFollowErrors;

		/**
		 * API name: {@code auto_followed_clusters}
		 */
		public Builder autoFollowedClusters(List<AutoFollowedCluster> value) {
			this.autoFollowedClusters = value;
			return this;
		}

		/**
		 * API name: {@code auto_followed_clusters}
		 */
		public Builder autoFollowedClusters(AutoFollowedCluster... value) {
			this.autoFollowedClusters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #autoFollowedClusters(List)}, creating the list if
		 * needed.
		 */
		public Builder addAutoFollowedClusters(AutoFollowedCluster value) {
			if (this.autoFollowedClusters == null) {
				this.autoFollowedClusters = new ArrayList<>();
			}
			this.autoFollowedClusters.add(value);
			return this;
		}

		/**
		 * Set {@link #autoFollowedClusters(List)} to a singleton list.
		 */
		public Builder autoFollowedClusters(
				Function<AutoFollowedCluster.Builder, ObjectBuilder<AutoFollowedCluster>> fn) {
			return this.autoFollowedClusters(fn.apply(new AutoFollowedCluster.Builder()).build());
		}

		/**
		 * Add a value to {@link #autoFollowedClusters(List)}, creating the list if
		 * needed.
		 */
		public Builder addAutoFollowedClusters(
				Function<AutoFollowedCluster.Builder, ObjectBuilder<AutoFollowedCluster>> fn) {
			return this.addAutoFollowedClusters(fn.apply(new AutoFollowedCluster.Builder()).build());
		}

		/**
		 * API name: {@code number_of_failed_follow_indices}
		 */
		public Builder numberOfFailedFollowIndices(Number value) {
			this.numberOfFailedFollowIndices = value;
			return this;
		}

		/**
		 * API name: {@code number_of_failed_remote_cluster_state_requests}
		 */
		public Builder numberOfFailedRemoteClusterStateRequests(Number value) {
			this.numberOfFailedRemoteClusterStateRequests = value;
			return this;
		}

		/**
		 * API name: {@code number_of_successful_follow_indices}
		 */
		public Builder numberOfSuccessfulFollowIndices(Number value) {
			this.numberOfSuccessfulFollowIndices = value;
			return this;
		}

		/**
		 * API name: {@code recent_auto_follow_errors}
		 */
		public Builder recentAutoFollowErrors(List<ErrorCause> value) {
			this.recentAutoFollowErrors = value;
			return this;
		}

		/**
		 * API name: {@code recent_auto_follow_errors}
		 */
		public Builder recentAutoFollowErrors(ErrorCause... value) {
			this.recentAutoFollowErrors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #recentAutoFollowErrors(List)}, creating the list if
		 * needed.
		 */
		public Builder addRecentAutoFollowErrors(ErrorCause value) {
			if (this.recentAutoFollowErrors == null) {
				this.recentAutoFollowErrors = new ArrayList<>();
			}
			this.recentAutoFollowErrors.add(value);
			return this;
		}

		/**
		 * Set {@link #recentAutoFollowErrors(List)} to a singleton list.
		 */
		public Builder recentAutoFollowErrors(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.recentAutoFollowErrors(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #recentAutoFollowErrors(List)}, creating the list if
		 * needed.
		 */
		public Builder addRecentAutoFollowErrors(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addRecentAutoFollowErrors(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Builds a {@link AutoFollowStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowStats build() {

			return new AutoFollowStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoFollowStats}
	 */
	public static final JsonpDeserializer<AutoFollowStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AutoFollowStats::setupAutoFollowStatsDeserializer);

	protected static void setupAutoFollowStatsDeserializer(DelegatingDeserializer<AutoFollowStats.Builder> op) {

		op.add(Builder::autoFollowedClusters, JsonpDeserializer.arrayDeserializer(AutoFollowedCluster.DESERIALIZER),
				"auto_followed_clusters");
		op.add(Builder::numberOfFailedFollowIndices, JsonpDeserializer.numberDeserializer(),
				"number_of_failed_follow_indices");
		op.add(Builder::numberOfFailedRemoteClusterStateRequests, JsonpDeserializer.numberDeserializer(),
				"number_of_failed_remote_cluster_state_requests");
		op.add(Builder::numberOfSuccessfulFollowIndices, JsonpDeserializer.numberDeserializer(),
				"number_of_successful_follow_indices");
		op.add(Builder::recentAutoFollowErrors, JsonpDeserializer.arrayDeserializer(ErrorCause.DESERIALIZER),
				"recent_auto_follow_errors");

	}

}
