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
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.stats.AutoFollowStats
@JsonpDeserializable
public class AutoFollowStats implements JsonpSerializable {
	private final List<AutoFollowedCluster> autoFollowedClusters;

	private final long numberOfFailedFollowIndices;

	private final long numberOfFailedRemoteClusterStateRequests;

	private final long numberOfSuccessfulFollowIndices;

	private final List<ErrorCause> recentAutoFollowErrors;

	// ---------------------------------------------------------------------------------------------

	private AutoFollowStats(Builder builder) {

		this.autoFollowedClusters = ModelTypeHelper.unmodifiableRequired(builder.autoFollowedClusters, this,
				"autoFollowedClusters");
		this.numberOfFailedFollowIndices = ModelTypeHelper.requireNonNull(builder.numberOfFailedFollowIndices, this,
				"numberOfFailedFollowIndices");
		this.numberOfFailedRemoteClusterStateRequests = ModelTypeHelper.requireNonNull(
				builder.numberOfFailedRemoteClusterStateRequests, this, "numberOfFailedRemoteClusterStateRequests");
		this.numberOfSuccessfulFollowIndices = ModelTypeHelper.requireNonNull(builder.numberOfSuccessfulFollowIndices,
				this, "numberOfSuccessfulFollowIndices");
		this.recentAutoFollowErrors = ModelTypeHelper.unmodifiableRequired(builder.recentAutoFollowErrors, this,
				"recentAutoFollowErrors");

	}

	public static AutoFollowStats of(Function<Builder, ObjectBuilder<AutoFollowStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code auto_followed_clusters}
	 */
	public final List<AutoFollowedCluster> autoFollowedClusters() {
		return this.autoFollowedClusters;
	}

	/**
	 * Required - API name: {@code number_of_failed_follow_indices}
	 */
	public final long numberOfFailedFollowIndices() {
		return this.numberOfFailedFollowIndices;
	}

	/**
	 * Required - API name: {@code number_of_failed_remote_cluster_state_requests}
	 */
	public final long numberOfFailedRemoteClusterStateRequests() {
		return this.numberOfFailedRemoteClusterStateRequests;
	}

	/**
	 * Required - API name: {@code number_of_successful_follow_indices}
	 */
	public final long numberOfSuccessfulFollowIndices() {
		return this.numberOfSuccessfulFollowIndices;
	}

	/**
	 * Required - API name: {@code recent_auto_follow_errors}
	 */
	public final List<ErrorCause> recentAutoFollowErrors() {
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

		if (ModelTypeHelper.isDefined(this.autoFollowedClusters)) {
			generator.writeKey("auto_followed_clusters");
			generator.writeStartArray();
			for (AutoFollowedCluster item0 : this.autoFollowedClusters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("number_of_failed_follow_indices");
		generator.write(this.numberOfFailedFollowIndices);

		generator.writeKey("number_of_failed_remote_cluster_state_requests");
		generator.write(this.numberOfFailedRemoteClusterStateRequests);

		generator.writeKey("number_of_successful_follow_indices");
		generator.write(this.numberOfSuccessfulFollowIndices);

		if (ModelTypeHelper.isDefined(this.recentAutoFollowErrors)) {
			generator.writeKey("recent_auto_follow_errors");
			generator.writeStartArray();
			for (ErrorCause item0 : this.recentAutoFollowErrors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AutoFollowStats> {
		private List<AutoFollowedCluster> autoFollowedClusters;

		private Long numberOfFailedFollowIndices;

		private Long numberOfFailedRemoteClusterStateRequests;

		private Long numberOfSuccessfulFollowIndices;

		private List<ErrorCause> recentAutoFollowErrors;

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 */
		public final Builder autoFollowedClusters(List<AutoFollowedCluster> value) {
			this.autoFollowedClusters = value;
			return this;
		}

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 */
		public final Builder autoFollowedClusters(AutoFollowedCluster... value) {
			this.autoFollowedClusters = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 */
		@SafeVarargs
		public final Builder autoFollowedClusters(
				Function<AutoFollowedCluster.Builder, ObjectBuilder<AutoFollowedCluster>>... fns) {
			this.autoFollowedClusters = new ArrayList<>(fns.length);
			for (Function<AutoFollowedCluster.Builder, ObjectBuilder<AutoFollowedCluster>> fn : fns) {
				this.autoFollowedClusters.add(fn.apply(new AutoFollowedCluster.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code number_of_failed_follow_indices}
		 */
		public final Builder numberOfFailedFollowIndices(long value) {
			this.numberOfFailedFollowIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code number_of_failed_remote_cluster_state_requests}
		 */
		public final Builder numberOfFailedRemoteClusterStateRequests(long value) {
			this.numberOfFailedRemoteClusterStateRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code number_of_successful_follow_indices}
		 */
		public final Builder numberOfSuccessfulFollowIndices(long value) {
			this.numberOfSuccessfulFollowIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code recent_auto_follow_errors}
		 */
		public final Builder recentAutoFollowErrors(List<ErrorCause> value) {
			this.recentAutoFollowErrors = value;
			return this;
		}

		/**
		 * Required - API name: {@code recent_auto_follow_errors}
		 */
		public final Builder recentAutoFollowErrors(ErrorCause... value) {
			this.recentAutoFollowErrors = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code recent_auto_follow_errors}
		 */
		@SafeVarargs
		public final Builder recentAutoFollowErrors(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>>... fns) {
			this.recentAutoFollowErrors = new ArrayList<>(fns.length);
			for (Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn : fns) {
				this.recentAutoFollowErrors.add(fn.apply(new ErrorCause.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link AutoFollowStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowStats build() {
			_checkSingleUse();

			return new AutoFollowStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoFollowStats}
	 */
	public static final JsonpDeserializer<AutoFollowStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AutoFollowStats::setupAutoFollowStatsDeserializer, Builder::build);

	protected static void setupAutoFollowStatsDeserializer(DelegatingDeserializer<AutoFollowStats.Builder> op) {

		op.add(Builder::autoFollowedClusters, JsonpDeserializer.arrayDeserializer(AutoFollowedCluster._DESERIALIZER),
				"auto_followed_clusters");
		op.add(Builder::numberOfFailedFollowIndices, JsonpDeserializer.longDeserializer(),
				"number_of_failed_follow_indices");
		op.add(Builder::numberOfFailedRemoteClusterStateRequests, JsonpDeserializer.longDeserializer(),
				"number_of_failed_remote_cluster_state_requests");
		op.add(Builder::numberOfSuccessfulFollowIndices, JsonpDeserializer.longDeserializer(),
				"number_of_successful_follow_indices");
		op.add(Builder::recentAutoFollowErrors, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER),
				"recent_auto_follow_errors");

	}

}
