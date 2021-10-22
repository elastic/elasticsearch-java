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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.follow.Request
@JsonpDeserializable
public final class FollowRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String leaderIndex;

	@Nullable
	private final Long maxOutstandingReadRequests;

	@Nullable
	private final Long maxOutstandingWriteRequests;

	@Nullable
	private final Long maxReadRequestOperationCount;

	@Nullable
	private final String maxReadRequestSize;

	@Nullable
	private final String maxRetryDelay;

	@Nullable
	private final Long maxWriteBufferCount;

	@Nullable
	private final String maxWriteBufferSize;

	@Nullable
	private final Long maxWriteRequestOperationCount;

	@Nullable
	private final String maxWriteRequestSize;

	@Nullable
	private final String readPollTimeout;

	@Nullable
	private final String remoteCluster;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	public FollowRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.leaderIndex = builder.leaderIndex;
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
		this.remoteCluster = builder.remoteCluster;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public FollowRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The name of the follower index
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code leader_index}
	 */
	@Nullable
	public String leaderIndex() {
		return this.leaderIndex;
	}

	/**
	 * API name: {@code max_outstanding_read_requests}
	 */
	@Nullable
	public Long maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * API name: {@code max_outstanding_write_requests}
	 */
	@Nullable
	public Long maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
	}

	/**
	 * API name: {@code max_read_request_operation_count}
	 */
	@Nullable
	public Long maxReadRequestOperationCount() {
		return this.maxReadRequestOperationCount;
	}

	/**
	 * API name: {@code max_read_request_size}
	 */
	@Nullable
	public String maxReadRequestSize() {
		return this.maxReadRequestSize;
	}

	/**
	 * API name: {@code max_retry_delay}
	 */
	@Nullable
	public String maxRetryDelay() {
		return this.maxRetryDelay;
	}

	/**
	 * API name: {@code max_write_buffer_count}
	 */
	@Nullable
	public Long maxWriteBufferCount() {
		return this.maxWriteBufferCount;
	}

	/**
	 * API name: {@code max_write_buffer_size}
	 */
	@Nullable
	public String maxWriteBufferSize() {
		return this.maxWriteBufferSize;
	}

	/**
	 * API name: {@code max_write_request_operation_count}
	 */
	@Nullable
	public Long maxWriteRequestOperationCount() {
		return this.maxWriteRequestOperationCount;
	}

	/**
	 * API name: {@code max_write_request_size}
	 */
	@Nullable
	public String maxWriteRequestSize() {
		return this.maxWriteRequestSize;
	}

	/**
	 * API name: {@code read_poll_timeout}
	 */
	@Nullable
	public String readPollTimeout() {
		return this.readPollTimeout;
	}

	/**
	 * API name: {@code remote_cluster}
	 */
	@Nullable
	public String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Sets the number of shard copies that must be active before returning.
	 * Defaults to 0. Set to <code>all</code> for all shard copies, otherwise set to
	 * any non-negative value less than or equal to the total number of copies for
	 * the shard (number of replicas + 1)
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
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

		if (this.leaderIndex != null) {

			generator.writeKey("leader_index");
			generator.write(this.leaderIndex);

		}
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
			generator.write(this.maxRetryDelay);

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
			generator.write(this.readPollTimeout);

		}
		if (this.remoteCluster != null) {

			generator.writeKey("remote_cluster");
			generator.write(this.remoteCluster);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowRequest}.
	 */
	public static class Builder implements ObjectBuilder<FollowRequest> {
		private String index;

		@Nullable
		private String leaderIndex;

		@Nullable
		private Long maxOutstandingReadRequests;

		@Nullable
		private Long maxOutstandingWriteRequests;

		@Nullable
		private Long maxReadRequestOperationCount;

		@Nullable
		private String maxReadRequestSize;

		@Nullable
		private String maxRetryDelay;

		@Nullable
		private Long maxWriteBufferCount;

		@Nullable
		private String maxWriteBufferSize;

		@Nullable
		private Long maxWriteRequestOperationCount;

		@Nullable
		private String maxWriteRequestSize;

		@Nullable
		private String readPollTimeout;

		@Nullable
		private String remoteCluster;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		/**
		 * Required - The name of the follower index
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code leader_index}
		 */
		public Builder leaderIndex(@Nullable String value) {
			this.leaderIndex = value;
			return this;
		}

		/**
		 * API name: {@code max_outstanding_read_requests}
		 */
		public Builder maxOutstandingReadRequests(@Nullable Long value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_outstanding_write_requests}
		 */
		public Builder maxOutstandingWriteRequests(@Nullable Long value) {
			this.maxOutstandingWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_read_request_operation_count}
		 */
		public Builder maxReadRequestOperationCount(@Nullable Long value) {
			this.maxReadRequestOperationCount = value;
			return this;
		}

		/**
		 * API name: {@code max_read_request_size}
		 */
		public Builder maxReadRequestSize(@Nullable String value) {
			this.maxReadRequestSize = value;
			return this;
		}

		/**
		 * API name: {@code max_retry_delay}
		 */
		public Builder maxRetryDelay(@Nullable String value) {
			this.maxRetryDelay = value;
			return this;
		}

		/**
		 * API name: {@code max_write_buffer_count}
		 */
		public Builder maxWriteBufferCount(@Nullable Long value) {
			this.maxWriteBufferCount = value;
			return this;
		}

		/**
		 * API name: {@code max_write_buffer_size}
		 */
		public Builder maxWriteBufferSize(@Nullable String value) {
			this.maxWriteBufferSize = value;
			return this;
		}

		/**
		 * API name: {@code max_write_request_operation_count}
		 */
		public Builder maxWriteRequestOperationCount(@Nullable Long value) {
			this.maxWriteRequestOperationCount = value;
			return this;
		}

		/**
		 * API name: {@code max_write_request_size}
		 */
		public Builder maxWriteRequestSize(@Nullable String value) {
			this.maxWriteRequestSize = value;
			return this;
		}

		/**
		 * API name: {@code read_poll_timeout}
		 */
		public Builder readPollTimeout(@Nullable String value) {
			this.readPollTimeout = value;
			return this;
		}

		/**
		 * API name: {@code remote_cluster}
		 */
		public Builder remoteCluster(@Nullable String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * Sets the number of shard copies that must be active before returning.
		 * Defaults to 0. Set to <code>all</code> for all shard copies, otherwise set to
		 * any non-negative value less than or equal to the total number of copies for
		 * the shard (number of replicas + 1)
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Builds a {@link FollowRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowRequest build() {

			return new FollowRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowRequest}
	 */
	public static final JsonpDeserializer<FollowRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FollowRequest::setupFollowRequestDeserializer, Builder::build);

	protected static void setupFollowRequestDeserializer(DelegatingDeserializer<FollowRequest.Builder> op) {

		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::maxOutstandingReadRequests, JsonpDeserializer.longDeserializer(),
				"max_outstanding_read_requests");
		op.add(Builder::maxOutstandingWriteRequests, JsonpDeserializer.longDeserializer(),
				"max_outstanding_write_requests");
		op.add(Builder::maxReadRequestOperationCount, JsonpDeserializer.longDeserializer(),
				"max_read_request_operation_count");
		op.add(Builder::maxReadRequestSize, JsonpDeserializer.stringDeserializer(), "max_read_request_size");
		op.add(Builder::maxRetryDelay, JsonpDeserializer.stringDeserializer(), "max_retry_delay");
		op.add(Builder::maxWriteBufferCount, JsonpDeserializer.longDeserializer(), "max_write_buffer_count");
		op.add(Builder::maxWriteBufferSize, JsonpDeserializer.stringDeserializer(), "max_write_buffer_size");
		op.add(Builder::maxWriteRequestOperationCount, JsonpDeserializer.longDeserializer(),
				"max_write_request_operation_count");
		op.add(Builder::maxWriteRequestSize, JsonpDeserializer.stringDeserializer(), "max_write_request_size");
		op.add(Builder::readPollTimeout, JsonpDeserializer.stringDeserializer(), "read_poll_timeout");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.follow}".
	 */
	public static final Endpoint<FollowRequest, FollowResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, FollowResponse._DESERIALIZER);
}
