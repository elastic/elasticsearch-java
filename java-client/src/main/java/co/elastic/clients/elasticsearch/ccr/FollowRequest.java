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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.follow.Request
public final class FollowRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final String leaderIndex;

	@Nullable
	private final Number maxOutstandingReadRequests;

	@Nullable
	private final Number maxOutstandingWriteRequests;

	@Nullable
	private final Number maxReadRequestOperationCount;

	@Nullable
	private final String maxReadRequestSize;

	@Nullable
	private final JsonValue maxRetryDelay;

	@Nullable
	private final Number maxWriteBufferCount;

	@Nullable
	private final String maxWriteBufferSize;

	@Nullable
	private final Number maxWriteRequestOperationCount;

	@Nullable
	private final String maxWriteRequestSize;

	@Nullable
	private final JsonValue readPollTimeout;

	@Nullable
	private final String remoteCluster;

	// ---------------------------------------------------------------------------------------------

	public FollowRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.waitForActiveShards = builder.waitForActiveShards;
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

	}

	/**
	 * The name of the follower index
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
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
	public JsonValue waitForActiveShards() {
		return this.waitForActiveShards;
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
	public Number maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * API name: {@code max_outstanding_write_requests}
	 */
	@Nullable
	public Number maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
	}

	/**
	 * API name: {@code max_read_request_operation_count}
	 */
	@Nullable
	public Number maxReadRequestOperationCount() {
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
	public JsonValue maxRetryDelay() {
		return this.maxRetryDelay;
	}

	/**
	 * API name: {@code max_write_buffer_count}
	 */
	@Nullable
	public Number maxWriteBufferCount() {
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
	public Number maxWriteRequestOperationCount() {
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
	public JsonValue readPollTimeout() {
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
			generator.write(this.maxOutstandingReadRequests.doubleValue());

		}
		if (this.maxOutstandingWriteRequests != null) {

			generator.writeKey("max_outstanding_write_requests");
			generator.write(this.maxOutstandingWriteRequests.doubleValue());

		}
		if (this.maxReadRequestOperationCount != null) {

			generator.writeKey("max_read_request_operation_count");
			generator.write(this.maxReadRequestOperationCount.doubleValue());

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
			generator.write(this.maxWriteBufferCount.doubleValue());

		}
		if (this.maxWriteBufferSize != null) {

			generator.writeKey("max_write_buffer_size");
			generator.write(this.maxWriteBufferSize);

		}
		if (this.maxWriteRequestOperationCount != null) {

			generator.writeKey("max_write_request_operation_count");
			generator.write(this.maxWriteRequestOperationCount.doubleValue());

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
		private JsonValue waitForActiveShards;

		@Nullable
		private String leaderIndex;

		@Nullable
		private Number maxOutstandingReadRequests;

		@Nullable
		private Number maxOutstandingWriteRequests;

		@Nullable
		private Number maxReadRequestOperationCount;

		@Nullable
		private String maxReadRequestSize;

		@Nullable
		private JsonValue maxRetryDelay;

		@Nullable
		private Number maxWriteBufferCount;

		@Nullable
		private String maxWriteBufferSize;

		@Nullable
		private Number maxWriteRequestOperationCount;

		@Nullable
		private String maxWriteRequestSize;

		@Nullable
		private JsonValue readPollTimeout;

		@Nullable
		private String remoteCluster;

		/**
		 * The name of the follower index
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
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
		public Builder waitForActiveShards(@Nullable JsonValue value) {
			this.waitForActiveShards = value;
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
		public Builder maxOutstandingReadRequests(@Nullable Number value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_outstanding_write_requests}
		 */
		public Builder maxOutstandingWriteRequests(@Nullable Number value) {
			this.maxOutstandingWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_read_request_operation_count}
		 */
		public Builder maxReadRequestOperationCount(@Nullable Number value) {
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
		public Builder maxRetryDelay(@Nullable JsonValue value) {
			this.maxRetryDelay = value;
			return this;
		}

		/**
		 * API name: {@code max_write_buffer_count}
		 */
		public Builder maxWriteBufferCount(@Nullable Number value) {
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
		public Builder maxWriteRequestOperationCount(@Nullable Number value) {
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
		public Builder readPollTimeout(@Nullable JsonValue value) {
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
	public static final JsonpDeserializer<FollowRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FollowRequest::setupFollowRequestDeserializer);

	protected static void setupFollowRequestDeserializer(DelegatingDeserializer<FollowRequest.Builder> op) {

		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::maxOutstandingReadRequests, JsonpDeserializer.numberDeserializer(),
				"max_outstanding_read_requests");
		op.add(Builder::maxOutstandingWriteRequests, JsonpDeserializer.numberDeserializer(),
				"max_outstanding_write_requests");
		op.add(Builder::maxReadRequestOperationCount, JsonpDeserializer.numberDeserializer(),
				"max_read_request_operation_count");
		op.add(Builder::maxReadRequestSize, JsonpDeserializer.stringDeserializer(), "max_read_request_size");
		op.add(Builder::maxRetryDelay, JsonpDeserializer.jsonValueDeserializer(), "max_retry_delay");
		op.add(Builder::maxWriteBufferCount, JsonpDeserializer.numberDeserializer(), "max_write_buffer_count");
		op.add(Builder::maxWriteBufferSize, JsonpDeserializer.stringDeserializer(), "max_write_buffer_size");
		op.add(Builder::maxWriteRequestOperationCount, JsonpDeserializer.numberDeserializer(),
				"max_write_request_operation_count");
		op.add(Builder::maxWriteRequestSize, JsonpDeserializer.stringDeserializer(), "max_write_request_size");
		op.add(Builder::readPollTimeout, JsonpDeserializer.jsonValueDeserializer(), "read_poll_timeout");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.follow}".
	 */
	public static final Endpoint<FollowRequest, FollowResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_ccr");
					buf.append("/follow");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, FollowResponse.DESERIALIZER);
}
