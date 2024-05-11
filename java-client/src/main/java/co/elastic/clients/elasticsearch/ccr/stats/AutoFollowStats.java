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

package co.elastic.clients.elasticsearch.ccr.stats;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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
import java.lang.Long;
import java.util.List;
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

// typedef: ccr.stats.AutoFollowStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ccr.stats.AutoFollowStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class AutoFollowStats implements JsonpSerializable {
	private final List<AutoFollowedCluster> autoFollowedClusters;

	private final long numberOfFailedFollowIndices;

	private final long numberOfFailedRemoteClusterStateRequests;

	private final long numberOfSuccessfulFollowIndices;

	private final List<ErrorCause> recentAutoFollowErrors;

	// ---------------------------------------------------------------------------------------------

	private AutoFollowStats(Builder builder) {

		this.autoFollowedClusters = ApiTypeHelper.unmodifiableRequired(builder.autoFollowedClusters, this,
				"autoFollowedClusters");
		this.numberOfFailedFollowIndices = ApiTypeHelper.requireNonNull(builder.numberOfFailedFollowIndices, this,
				"numberOfFailedFollowIndices");
		this.numberOfFailedRemoteClusterStateRequests = ApiTypeHelper.requireNonNull(
				builder.numberOfFailedRemoteClusterStateRequests, this, "numberOfFailedRemoteClusterStateRequests");
		this.numberOfSuccessfulFollowIndices = ApiTypeHelper.requireNonNull(builder.numberOfSuccessfulFollowIndices,
				this, "numberOfSuccessfulFollowIndices");
		this.recentAutoFollowErrors = ApiTypeHelper.unmodifiableRequired(builder.recentAutoFollowErrors, this,
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

		if (ApiTypeHelper.isDefined(this.autoFollowedClusters)) {
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

		if (ApiTypeHelper.isDefined(this.recentAutoFollowErrors)) {
			generator.writeKey("recent_auto_follow_errors");
			generator.writeStartArray();
			for (ErrorCause item0 : this.recentAutoFollowErrors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AutoFollowStats> {
		private List<AutoFollowedCluster> autoFollowedClusters;

		private Long numberOfFailedFollowIndices;

		private Long numberOfFailedRemoteClusterStateRequests;

		private Long numberOfSuccessfulFollowIndices;

		private List<ErrorCause> recentAutoFollowErrors;

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>autoFollowedClusters</code>.
		 */
		public final Builder autoFollowedClusters(List<AutoFollowedCluster> list) {
			this.autoFollowedClusters = _listAddAll(this.autoFollowedClusters, list);
			return this;
		}

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 * <p>
		 * Adds one or more values to <code>autoFollowedClusters</code>.
		 */
		public final Builder autoFollowedClusters(AutoFollowedCluster value, AutoFollowedCluster... values) {
			this.autoFollowedClusters = _listAdd(this.autoFollowedClusters, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 * <p>
		 * Adds a value to <code>autoFollowedClusters</code> using a builder lambda.
		 */
		public final Builder autoFollowedClusters(
				Function<AutoFollowedCluster.Builder, ObjectBuilder<AutoFollowedCluster>> fn) {
			return autoFollowedClusters(fn.apply(new AutoFollowedCluster.Builder()).build());
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
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>recentAutoFollowErrors</code>.
		 */
		public final Builder recentAutoFollowErrors(List<ErrorCause> list) {
			this.recentAutoFollowErrors = _listAddAll(this.recentAutoFollowErrors, list);
			return this;
		}

		/**
		 * Required - API name: {@code recent_auto_follow_errors}
		 * <p>
		 * Adds one or more values to <code>recentAutoFollowErrors</code>.
		 */
		public final Builder recentAutoFollowErrors(ErrorCause value, ErrorCause... values) {
			this.recentAutoFollowErrors = _listAdd(this.recentAutoFollowErrors, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code recent_auto_follow_errors}
		 * <p>
		 * Adds a value to <code>recentAutoFollowErrors</code> using a builder lambda.
		 */
		public final Builder recentAutoFollowErrors(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return recentAutoFollowErrors(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
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
			AutoFollowStats::setupAutoFollowStatsDeserializer);

	protected static void setupAutoFollowStatsDeserializer(ObjectDeserializer<AutoFollowStats.Builder> op) {

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
