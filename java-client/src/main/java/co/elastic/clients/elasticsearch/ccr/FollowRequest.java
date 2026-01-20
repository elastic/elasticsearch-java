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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
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

// typedef: ccr.follow.Request

/**
 * Create a follower.
 * <p>
 * Create a cross-cluster replication follower index that follows a specific
 * leader index. When the API returns, the follower index exists and
 * cross-cluster replication starts replicating operations from the leader index
 * to the follower index.
 * 
 * @see <a href="../doc-files/api-spec.html#ccr.follow.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class FollowRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String dataStreamName;

	private final String index;

	private final String leaderIndex;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Long maxOutstandingReadRequests;

	@Nullable
	private final Integer maxOutstandingWriteRequests;

	@Nullable
	private final Integer maxReadRequestOperationCount;

	@Nullable
	private final String maxReadRequestSize;

	@Nullable
	private final Time maxRetryDelay;

	@Nullable
	private final Integer maxWriteBufferCount;

	@Nullable
	private final String maxWriteBufferSize;

	@Nullable
	private final Integer maxWriteRequestOperationCount;

	@Nullable
	private final String maxWriteRequestSize;

	@Nullable
	private final Time readPollTimeout;

	private final String remoteCluster;

	@Nullable
	private final IndexSettings settings;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	private FollowRequest(Builder builder) {

		this.dataStreamName = builder.dataStreamName;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.leaderIndex = ApiTypeHelper.requireNonNull(builder.leaderIndex, this, "leaderIndex");
		this.masterTimeout = builder.masterTimeout;
		this.maxOutstandingReadRequests = builder.maxOutstandingReadRequests;
		this.maxOutstandingWriteRequests = builder.maxOutstandingWriteRequests;
		this.maxReadRequestOperationCount = builder.maxReadRequestOperationCount;
		this.maxReadRequestSize = builder.maxReadRequestSize;
		this.maxRetryDelay = builder.maxRetryDelay;
		this.maxWriteBufferCount = builder.maxWriteBufferCount;
		this.maxWriteBufferSize = builder.maxWriteBufferSize;
		this.maxWriteRequestOperationCount = builder.maxWriteRequestOperationCount;
		this.maxWriteRequestSize = builder.maxWriteRequestSize;
		this.readPollTimeout = builder.readPollTimeout;
		this.remoteCluster = ApiTypeHelper.requireNonNull(builder.remoteCluster, this, "remoteCluster");
		this.settings = builder.settings;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public static FollowRequest of(Function<Builder, ObjectBuilder<FollowRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If the leader index is part of a data stream, the name to which the local
	 * data stream for the followed index should be renamed.
	 * <p>
	 * API name: {@code data_stream_name}
	 */
	@Nullable
	public final String dataStreamName() {
		return this.dataStreamName;
	}

	/**
	 * Required - The name of the follower index.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - The name of the index in the leader cluster to follow.
	 * <p>
	 * API name: {@code leader_index}
	 */
	public final String leaderIndex() {
		return this.leaderIndex;
	}

	/**
	 * Period to wait for a connection to the master node.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The maximum number of outstanding reads requests from the remote cluster.
	 * <p>
	 * API name: {@code max_outstanding_read_requests}
	 */
	@Nullable
	public final Long maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * The maximum number of outstanding write requests on the follower.
	 * <p>
	 * API name: {@code max_outstanding_write_requests}
	 */
	@Nullable
	public final Integer maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
	}

	/**
	 * The maximum number of operations to pull per read from the remote cluster.
	 * <p>
	 * API name: {@code max_read_request_operation_count}
	 */
	@Nullable
	public final Integer maxReadRequestOperationCount() {
		return this.maxReadRequestOperationCount;
	}

	/**
	 * The maximum size in bytes of per read of a batch of operations pulled from
	 * the remote cluster.
	 * <p>
	 * API name: {@code max_read_request_size}
	 */
	@Nullable
	public final String maxReadRequestSize() {
		return this.maxReadRequestSize;
	}

	/**
	 * The maximum time to wait before retrying an operation that failed
	 * exceptionally. An exponential backoff strategy is employed when retrying.
	 * <p>
	 * API name: {@code max_retry_delay}
	 */
	@Nullable
	public final Time maxRetryDelay() {
		return this.maxRetryDelay;
	}

	/**
	 * The maximum number of operations that can be queued for writing. When this
	 * limit is reached, reads from the remote cluster will be deferred until the
	 * number of queued operations goes below the limit.
	 * <p>
	 * API name: {@code max_write_buffer_count}
	 */
	@Nullable
	public final Integer maxWriteBufferCount() {
		return this.maxWriteBufferCount;
	}

	/**
	 * The maximum total bytes of operations that can be queued for writing. When
	 * this limit is reached, reads from the remote cluster will be deferred until
	 * the total bytes of queued operations goes below the limit.
	 * <p>
	 * API name: {@code max_write_buffer_size}
	 */
	@Nullable
	public final String maxWriteBufferSize() {
		return this.maxWriteBufferSize;
	}

	/**
	 * The maximum number of operations per bulk write request executed on the
	 * follower.
	 * <p>
	 * API name: {@code max_write_request_operation_count}
	 */
	@Nullable
	public final Integer maxWriteRequestOperationCount() {
		return this.maxWriteRequestOperationCount;
	}

	/**
	 * The maximum total bytes of operations per bulk write request executed on the
	 * follower.
	 * <p>
	 * API name: {@code max_write_request_size}
	 */
	@Nullable
	public final String maxWriteRequestSize() {
		return this.maxWriteRequestSize;
	}

	/**
	 * The maximum time to wait for new operations on the remote cluster when the
	 * follower index is synchronized with the leader index. When the timeout has
	 * elapsed, the poll for operations will return to the follower so that it can
	 * update some statistics. Then the follower will immediately attempt to read
	 * from the leader again.
	 * <p>
	 * API name: {@code read_poll_timeout}
	 */
	@Nullable
	public final Time readPollTimeout() {
		return this.readPollTimeout;
	}

	/**
	 * Required - The remote cluster containing the leader index.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public final String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Settings to override from the leader index.
	 * <p>
	 * API name: {@code settings}
	 */
	@Nullable
	public final IndexSettings settings() {
		return this.settings;
	}

	/**
	 * Specifies the number of shards to wait on being active before responding.
	 * This defaults to waiting on none of the shards to be active. A shard must be
	 * restored from the leader index before being active. Restoring a follower
	 * shard requires transferring all the remote Lucene segment files to the
	 * follower index.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
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

		if (this.dataStreamName != null) {
			generator.writeKey("data_stream_name");
			generator.write(this.dataStreamName);

		}
		generator.writeKey("leader_index");
		generator.write(this.leaderIndex);

		if (this.maxOutstandingReadRequests != null) {
			generator.writeKey("max_outstanding_read_requests");
			generator.write(this.maxOutstandingReadRequests);

		}
		if (this.maxOutstandingWriteRequests != null) {
			generator.writeKey("max_outstanding_write_requests");
			generator.write(this.maxOutstandingWriteRequests);

		}
		if (this.maxReadRequestOperationCount != null) {
			generator.writeKey("max_read_request_operation_count");
			generator.write(this.maxReadRequestOperationCount);

		}
		if (this.maxReadRequestSize != null) {
			generator.writeKey("max_read_request_size");
			generator.write(this.maxReadRequestSize);

		}
		if (this.maxRetryDelay != null) {
			generator.writeKey("max_retry_delay");
			this.maxRetryDelay.serialize(generator, mapper);

		}
		if (this.maxWriteBufferCount != null) {
			generator.writeKey("max_write_buffer_count");
			generator.write(this.maxWriteBufferCount);

		}
		if (this.maxWriteBufferSize != null) {
			generator.writeKey("max_write_buffer_size");
			generator.write(this.maxWriteBufferSize);

		}
		if (this.maxWriteRequestOperationCount != null) {
			generator.writeKey("max_write_request_operation_count");
			generator.write(this.maxWriteRequestOperationCount);

		}
		if (this.maxWriteRequestSize != null) {
			generator.writeKey("max_write_request_size");
			generator.write(this.maxWriteRequestSize);

		}
		if (this.readPollTimeout != null) {
			generator.writeKey("read_poll_timeout");
			this.readPollTimeout.serialize(generator, mapper);

		}
		generator.writeKey("remote_cluster");
		generator.write(this.remoteCluster);

		if (this.settings != null) {
			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<FollowRequest> {
		@Nullable
		private String dataStreamName;

		private String index;

		private String leaderIndex;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Long maxOutstandingReadRequests;

		@Nullable
		private Integer maxOutstandingWriteRequests;

		@Nullable
		private Integer maxReadRequestOperationCount;

		@Nullable
		private String maxReadRequestSize;

		@Nullable
		private Time maxRetryDelay;

		@Nullable
		private Integer maxWriteBufferCount;

		@Nullable
		private String maxWriteBufferSize;

		@Nullable
		private Integer maxWriteRequestOperationCount;

		@Nullable
		private String maxWriteRequestSize;

		@Nullable
		private Time readPollTimeout;

		private String remoteCluster;

		@Nullable
		private IndexSettings settings;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		public Builder() {
		}
		private Builder(FollowRequest instance) {
			this.dataStreamName = instance.dataStreamName;
			this.index = instance.index;
			this.leaderIndex = instance.leaderIndex;
			this.masterTimeout = instance.masterTimeout;
			this.maxOutstandingReadRequests = instance.maxOutstandingReadRequests;
			this.maxOutstandingWriteRequests = instance.maxOutstandingWriteRequests;
			this.maxReadRequestOperationCount = instance.maxReadRequestOperationCount;
			this.maxReadRequestSize = instance.maxReadRequestSize;
			this.maxRetryDelay = instance.maxRetryDelay;
			this.maxWriteBufferCount = instance.maxWriteBufferCount;
			this.maxWriteBufferSize = instance.maxWriteBufferSize;
			this.maxWriteRequestOperationCount = instance.maxWriteRequestOperationCount;
			this.maxWriteRequestSize = instance.maxWriteRequestSize;
			this.readPollTimeout = instance.readPollTimeout;
			this.remoteCluster = instance.remoteCluster;
			this.settings = instance.settings;
			this.waitForActiveShards = instance.waitForActiveShards;

		}
		/**
		 * If the leader index is part of a data stream, the name to which the local
		 * data stream for the followed index should be renamed.
		 * <p>
		 * API name: {@code data_stream_name}
		 */
		public final Builder dataStreamName(@Nullable String value) {
			this.dataStreamName = value;
			return this;
		}

		/**
		 * Required - The name of the follower index.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - The name of the index in the leader cluster to follow.
		 * <p>
		 * API name: {@code leader_index}
		 */
		public final Builder leaderIndex(String value) {
			this.leaderIndex = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The maximum number of outstanding reads requests from the remote cluster.
		 * <p>
		 * API name: {@code max_outstanding_read_requests}
		 */
		public final Builder maxOutstandingReadRequests(@Nullable Long value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * The maximum number of outstanding write requests on the follower.
		 * <p>
		 * API name: {@code max_outstanding_write_requests}
		 */
		public final Builder maxOutstandingWriteRequests(@Nullable Integer value) {
			this.maxOutstandingWriteRequests = value;
			return this;
		}

		/**
		 * The maximum number of operations to pull per read from the remote cluster.
		 * <p>
		 * API name: {@code max_read_request_operation_count}
		 */
		public final Builder maxReadRequestOperationCount(@Nullable Integer value) {
			this.maxReadRequestOperationCount = value;
			return this;
		}

		/**
		 * The maximum size in bytes of per read of a batch of operations pulled from
		 * the remote cluster.
		 * <p>
		 * API name: {@code max_read_request_size}
		 */
		public final Builder maxReadRequestSize(@Nullable String value) {
			this.maxReadRequestSize = value;
			return this;
		}

		/**
		 * The maximum time to wait before retrying an operation that failed
		 * exceptionally. An exponential backoff strategy is employed when retrying.
		 * <p>
		 * API name: {@code max_retry_delay}
		 */
		public final Builder maxRetryDelay(@Nullable Time value) {
			this.maxRetryDelay = value;
			return this;
		}

		/**
		 * The maximum time to wait before retrying an operation that failed
		 * exceptionally. An exponential backoff strategy is employed when retrying.
		 * <p>
		 * API name: {@code max_retry_delay}
		 */
		public final Builder maxRetryDelay(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.maxRetryDelay(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The maximum number of operations that can be queued for writing. When this
		 * limit is reached, reads from the remote cluster will be deferred until the
		 * number of queued operations goes below the limit.
		 * <p>
		 * API name: {@code max_write_buffer_count}
		 */
		public final Builder maxWriteBufferCount(@Nullable Integer value) {
			this.maxWriteBufferCount = value;
			return this;
		}

		/**
		 * The maximum total bytes of operations that can be queued for writing. When
		 * this limit is reached, reads from the remote cluster will be deferred until
		 * the total bytes of queued operations goes below the limit.
		 * <p>
		 * API name: {@code max_write_buffer_size}
		 */
		public final Builder maxWriteBufferSize(@Nullable String value) {
			this.maxWriteBufferSize = value;
			return this;
		}

		/**
		 * The maximum number of operations per bulk write request executed on the
		 * follower.
		 * <p>
		 * API name: {@code max_write_request_operation_count}
		 */
		public final Builder maxWriteRequestOperationCount(@Nullable Integer value) {
			this.maxWriteRequestOperationCount = value;
			return this;
		}

		/**
		 * The maximum total bytes of operations per bulk write request executed on the
		 * follower.
		 * <p>
		 * API name: {@code max_write_request_size}
		 */
		public final Builder maxWriteRequestSize(@Nullable String value) {
			this.maxWriteRequestSize = value;
			return this;
		}

		/**
		 * The maximum time to wait for new operations on the remote cluster when the
		 * follower index is synchronized with the leader index. When the timeout has
		 * elapsed, the poll for operations will return to the follower so that it can
		 * update some statistics. Then the follower will immediately attempt to read
		 * from the leader again.
		 * <p>
		 * API name: {@code read_poll_timeout}
		 */
		public final Builder readPollTimeout(@Nullable Time value) {
			this.readPollTimeout = value;
			return this;
		}

		/**
		 * The maximum time to wait for new operations on the remote cluster when the
		 * follower index is synchronized with the leader index. When the timeout has
		 * elapsed, the poll for operations will return to the follower so that it can
		 * update some statistics. Then the follower will immediately attempt to read
		 * from the leader again.
		 * <p>
		 * API name: {@code read_poll_timeout}
		 */
		public final Builder readPollTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.readPollTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The remote cluster containing the leader index.
		 * <p>
		 * API name: {@code remote_cluster}
		 */
		public final Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * Settings to override from the leader index.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Settings to override from the leader index.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * Specifies the number of shards to wait on being active before responding.
		 * This defaults to waiting on none of the shards to be active. A shard must be
		 * restored from the leader index before being active. Restoring a follower
		 * shard requires transferring all the remote Lucene segment files to the
		 * follower index.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Specifies the number of shards to wait on being active before responding.
		 * This defaults to waiting on none of the shards to be active. A shard must be
		 * restored from the leader index before being active. Restoring a follower
		 * shard requires transferring all the remote Lucene segment files to the
		 * follower index.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FollowRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowRequest build() {
			_checkSingleUse();

			return new FollowRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowRequest}
	 */
	public static final JsonpDeserializer<FollowRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FollowRequest::setupFollowRequestDeserializer);

	protected static void setupFollowRequestDeserializer(ObjectDeserializer<FollowRequest.Builder> op) {

		op.add(Builder::dataStreamName, JsonpDeserializer.stringDeserializer(), "data_stream_name");
		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::maxOutstandingReadRequests, JsonpDeserializer.longDeserializer(),
				"max_outstanding_read_requests");
		op.add(Builder::maxOutstandingWriteRequests, JsonpDeserializer.integerDeserializer(),
				"max_outstanding_write_requests");
		op.add(Builder::maxReadRequestOperationCount, JsonpDeserializer.integerDeserializer(),
				"max_read_request_operation_count");
		op.add(Builder::maxReadRequestSize, JsonpDeserializer.stringDeserializer(), "max_read_request_size");
		op.add(Builder::maxRetryDelay, Time._DESERIALIZER, "max_retry_delay");
		op.add(Builder::maxWriteBufferCount, JsonpDeserializer.integerDeserializer(), "max_write_buffer_count");
		op.add(Builder::maxWriteBufferSize, JsonpDeserializer.stringDeserializer(), "max_write_buffer_size");
		op.add(Builder::maxWriteRequestOperationCount, JsonpDeserializer.integerDeserializer(),
				"max_write_request_operation_count");
		op.add(Builder::maxWriteRequestSize, JsonpDeserializer.stringDeserializer(), "max_write_request_size");
		op.add(Builder::readPollTimeout, Time._DESERIALIZER, "read_poll_timeout");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.follow}".
	 */
	public static final Endpoint<FollowRequest, FollowResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ccr.follow",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_ccr");
					buf.append("/follow");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, FollowResponse._DESERIALIZER);
}
