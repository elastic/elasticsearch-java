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
import co.elastic.clients.json.JsonData;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.put_auto_follow_pattern.Request
public final class PutAutoFollowPatternRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	private final String remoteCluster;

	@Nullable
	private final String followIndexPattern;

	@Nullable
	private final List<String> leaderIndexPatterns;

	@Nullable
	private final List<String> leaderIndexExclusionPatterns;

	@Nullable
	private final Number maxOutstandingReadRequests;

	@Nullable
	private final Map<String, JsonData> settings;

	@Nullable
	private final Number maxOutstandingWriteRequests;

	@Nullable
	private final JsonValue readPollTimeout;

	@Nullable
	private final Number maxReadRequestOperationCount;

	@Nullable
	private final JsonValue maxReadRequestSize;

	@Nullable
	private final JsonValue maxRetryDelay;

	@Nullable
	private final Number maxWriteBufferCount;

	@Nullable
	private final JsonValue maxWriteBufferSize;

	@Nullable
	private final Number maxWriteRequestOperationCount;

	@Nullable
	private final JsonValue maxWriteRequestSize;

	// ---------------------------------------------------------------------------------------------

	public PutAutoFollowPatternRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.remoteCluster = Objects.requireNonNull(builder.remoteCluster, "remote_cluster");
		this.followIndexPattern = builder.followIndexPattern;
		this.leaderIndexPatterns = builder.leaderIndexPatterns;
		this.leaderIndexExclusionPatterns = builder.leaderIndexExclusionPatterns;
		this.maxOutstandingReadRequests = builder.maxOutstandingReadRequests;
		this.settings = builder.settings;
		this.maxOutstandingWriteRequests = builder.maxOutstandingWriteRequests;
		this.readPollTimeout = builder.readPollTimeout;
		this.maxReadRequestOperationCount = builder.maxReadRequestOperationCount;
		this.maxReadRequestSize = builder.maxReadRequestSize;
		this.maxRetryDelay = builder.maxRetryDelay;
		this.maxWriteBufferCount = builder.maxWriteBufferCount;
		this.maxWriteBufferSize = builder.maxWriteBufferSize;
		this.maxWriteRequestOperationCount = builder.maxWriteRequestOperationCount;
		this.maxWriteRequestSize = builder.maxWriteRequestSize;

	}

	/**
	 * The name of the collection of auto-follow patterns.
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * The remote cluster containing the leader indices to match against.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * The name of follower index. The template {{leader_index}} can be used to
	 * derive the name of the follower index from the name of the leader index. When
	 * following a data stream, use {{leader_index}}; CCR does not support changes
	 * to the names of a follower data stream’s backing indices.
	 * <p>
	 * API name: {@code follow_index_pattern}
	 */
	@Nullable
	public String followIndexPattern() {
		return this.followIndexPattern;
	}

	/**
	 * An array of simple index patterns to match against indices in the remote
	 * cluster specified by the remote_cluster field.
	 * <p>
	 * API name: {@code leader_index_patterns}
	 */
	@Nullable
	public List<String> leaderIndexPatterns() {
		return this.leaderIndexPatterns;
	}

	/**
	 * An array of simple index patterns that can be used to exclude indices from
	 * being auto-followed. Indices in the remote cluster whose names are matching
	 * one or more leader_index_patterns and one or more
	 * leader_index_exclusion_patterns won’t be followed.
	 * <p>
	 * API name: {@code leader_index_exclusion_patterns}
	 */
	@Nullable
	public List<String> leaderIndexExclusionPatterns() {
		return this.leaderIndexExclusionPatterns;
	}

	/**
	 * The maximum number of outstanding reads requests from the remote cluster.
	 * <p>
	 * API name: {@code max_outstanding_read_requests}
	 */
	@Nullable
	public Number maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * Settings to override from the leader index. Note that certain settings can
	 * not be overrode (e.g., index.number_of_shards).
	 * <p>
	 * API name: {@code settings}
	 */
	@Nullable
	public Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * The maximum number of outstanding reads requests from the remote cluster.
	 * <p>
	 * API name: {@code max_outstanding_write_requests}
	 */
	@Nullable
	public Number maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
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
	public JsonValue readPollTimeout() {
		return this.readPollTimeout;
	}

	/**
	 * The maximum number of operations to pull per read from the remote cluster.
	 * <p>
	 * API name: {@code max_read_request_operation_count}
	 */
	@Nullable
	public Number maxReadRequestOperationCount() {
		return this.maxReadRequestOperationCount;
	}

	/**
	 * The maximum size in bytes of per read of a batch of operations pulled from
	 * the remote cluster.
	 * <p>
	 * API name: {@code max_read_request_size}
	 */
	@Nullable
	public JsonValue maxReadRequestSize() {
		return this.maxReadRequestSize;
	}

	/**
	 * The maximum time to wait before retrying an operation that failed
	 * exceptionally. An exponential backoff strategy is employed when retrying.
	 * <p>
	 * API name: {@code max_retry_delay}
	 */
	@Nullable
	public JsonValue maxRetryDelay() {
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
	public Number maxWriteBufferCount() {
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
	public JsonValue maxWriteBufferSize() {
		return this.maxWriteBufferSize;
	}

	/**
	 * The maximum number of operations per bulk write request executed on the
	 * follower.
	 * <p>
	 * API name: {@code max_write_request_operation_count}
	 */
	@Nullable
	public Number maxWriteRequestOperationCount() {
		return this.maxWriteRequestOperationCount;
	}

	/**
	 * The maximum total bytes of operations per bulk write request executed on the
	 * follower.
	 * <p>
	 * API name: {@code max_write_request_size}
	 */
	@Nullable
	public JsonValue maxWriteRequestSize() {
		return this.maxWriteRequestSize;
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

		generator.writeKey("remote_cluster");
		generator.write(this.remoteCluster);

		if (this.followIndexPattern != null) {

			generator.writeKey("follow_index_pattern");
			generator.write(this.followIndexPattern);

		}
		if (this.leaderIndexPatterns != null) {

			generator.writeKey("leader_index_patterns");
			generator.writeStartArray();
			for (String item0 : this.leaderIndexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.leaderIndexExclusionPatterns != null) {

			generator.writeKey("leader_index_exclusion_patterns");
			generator.writeStartArray();
			for (String item0 : this.leaderIndexExclusionPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.maxOutstandingReadRequests != null) {

			generator.writeKey("max_outstanding_read_requests");
			generator.write(this.maxOutstandingReadRequests.doubleValue());

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxOutstandingWriteRequests != null) {

			generator.writeKey("max_outstanding_write_requests");
			generator.write(this.maxOutstandingWriteRequests.doubleValue());

		}
		if (this.readPollTimeout != null) {

			generator.writeKey("read_poll_timeout");
			generator.write(this.readPollTimeout);

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAutoFollowPatternRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutAutoFollowPatternRequest> {
		private String name;

		private String remoteCluster;

		@Nullable
		private String followIndexPattern;

		@Nullable
		private List<String> leaderIndexPatterns;

		@Nullable
		private List<String> leaderIndexExclusionPatterns;

		@Nullable
		private Number maxOutstandingReadRequests;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private Number maxOutstandingWriteRequests;

		@Nullable
		private JsonValue readPollTimeout;

		@Nullable
		private Number maxReadRequestOperationCount;

		@Nullable
		private JsonValue maxReadRequestSize;

		@Nullable
		private JsonValue maxRetryDelay;

		@Nullable
		private Number maxWriteBufferCount;

		@Nullable
		private JsonValue maxWriteBufferSize;

		@Nullable
		private Number maxWriteRequestOperationCount;

		@Nullable
		private JsonValue maxWriteRequestSize;

		/**
		 * The name of the collection of auto-follow patterns.
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * The remote cluster containing the leader indices to match against.
		 * <p>
		 * API name: {@code remote_cluster}
		 */
		public Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * The name of follower index. The template {{leader_index}} can be used to
		 * derive the name of the follower index from the name of the leader index. When
		 * following a data stream, use {{leader_index}}; CCR does not support changes
		 * to the names of a follower data stream’s backing indices.
		 * <p>
		 * API name: {@code follow_index_pattern}
		 */
		public Builder followIndexPattern(@Nullable String value) {
			this.followIndexPattern = value;
			return this;
		}

		/**
		 * An array of simple index patterns to match against indices in the remote
		 * cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 */
		public Builder leaderIndexPatterns(@Nullable List<String> value) {
			this.leaderIndexPatterns = value;
			return this;
		}

		/**
		 * An array of simple index patterns to match against indices in the remote
		 * cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 */
		public Builder leaderIndexPatterns(String... value) {
			this.leaderIndexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #leaderIndexPatterns(List)}, creating the list if
		 * needed.
		 */
		public Builder addLeaderIndexPatterns(String value) {
			if (this.leaderIndexPatterns == null) {
				this.leaderIndexPatterns = new ArrayList<>();
			}
			this.leaderIndexPatterns.add(value);
			return this;
		}

		/**
		 * An array of simple index patterns that can be used to exclude indices from
		 * being auto-followed. Indices in the remote cluster whose names are matching
		 * one or more leader_index_patterns and one or more
		 * leader_index_exclusion_patterns won’t be followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 */
		public Builder leaderIndexExclusionPatterns(@Nullable List<String> value) {
			this.leaderIndexExclusionPatterns = value;
			return this;
		}

		/**
		 * An array of simple index patterns that can be used to exclude indices from
		 * being auto-followed. Indices in the remote cluster whose names are matching
		 * one or more leader_index_patterns and one or more
		 * leader_index_exclusion_patterns won’t be followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 */
		public Builder leaderIndexExclusionPatterns(String... value) {
			this.leaderIndexExclusionPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #leaderIndexExclusionPatterns(List)}, creating the list
		 * if needed.
		 */
		public Builder addLeaderIndexExclusionPatterns(String value) {
			if (this.leaderIndexExclusionPatterns == null) {
				this.leaderIndexExclusionPatterns = new ArrayList<>();
			}
			this.leaderIndexExclusionPatterns.add(value);
			return this;
		}

		/**
		 * The maximum number of outstanding reads requests from the remote cluster.
		 * <p>
		 * API name: {@code max_outstanding_read_requests}
		 */
		public Builder maxOutstandingReadRequests(@Nullable Number value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * Settings to override from the leader index. Note that certain settings can
		 * not be overrode (e.g., index.number_of_shards).
		 * <p>
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, JsonData value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
			return this;
		}

		/**
		 * The maximum number of outstanding reads requests from the remote cluster.
		 * <p>
		 * API name: {@code max_outstanding_write_requests}
		 */
		public Builder maxOutstandingWriteRequests(@Nullable Number value) {
			this.maxOutstandingWriteRequests = value;
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
		public Builder readPollTimeout(@Nullable JsonValue value) {
			this.readPollTimeout = value;
			return this;
		}

		/**
		 * The maximum number of operations to pull per read from the remote cluster.
		 * <p>
		 * API name: {@code max_read_request_operation_count}
		 */
		public Builder maxReadRequestOperationCount(@Nullable Number value) {
			this.maxReadRequestOperationCount = value;
			return this;
		}

		/**
		 * The maximum size in bytes of per read of a batch of operations pulled from
		 * the remote cluster.
		 * <p>
		 * API name: {@code max_read_request_size}
		 */
		public Builder maxReadRequestSize(@Nullable JsonValue value) {
			this.maxReadRequestSize = value;
			return this;
		}

		/**
		 * The maximum time to wait before retrying an operation that failed
		 * exceptionally. An exponential backoff strategy is employed when retrying.
		 * <p>
		 * API name: {@code max_retry_delay}
		 */
		public Builder maxRetryDelay(@Nullable JsonValue value) {
			this.maxRetryDelay = value;
			return this;
		}

		/**
		 * The maximum number of operations that can be queued for writing. When this
		 * limit is reached, reads from the remote cluster will be deferred until the
		 * number of queued operations goes below the limit.
		 * <p>
		 * API name: {@code max_write_buffer_count}
		 */
		public Builder maxWriteBufferCount(@Nullable Number value) {
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
		public Builder maxWriteBufferSize(@Nullable JsonValue value) {
			this.maxWriteBufferSize = value;
			return this;
		}

		/**
		 * The maximum number of operations per bulk write request executed on the
		 * follower.
		 * <p>
		 * API name: {@code max_write_request_operation_count}
		 */
		public Builder maxWriteRequestOperationCount(@Nullable Number value) {
			this.maxWriteRequestOperationCount = value;
			return this;
		}

		/**
		 * The maximum total bytes of operations per bulk write request executed on the
		 * follower.
		 * <p>
		 * API name: {@code max_write_request_size}
		 */
		public Builder maxWriteRequestSize(@Nullable JsonValue value) {
			this.maxWriteRequestSize = value;
			return this;
		}

		/**
		 * Builds a {@link PutAutoFollowPatternRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAutoFollowPatternRequest build() {

			return new PutAutoFollowPatternRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAutoFollowPatternRequest}
	 */
	public static final JsonpDeserializer<PutAutoFollowPatternRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutAutoFollowPatternRequest::setupPutAutoFollowPatternRequestDeserializer);

	protected static void setupPutAutoFollowPatternRequestDeserializer(
			DelegatingDeserializer<PutAutoFollowPatternRequest.Builder> op) {

		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");
		op.add(Builder::followIndexPattern, JsonpDeserializer.stringDeserializer(), "follow_index_pattern");
		op.add(Builder::leaderIndexPatterns,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "leader_index_patterns");
		op.add(Builder::leaderIndexExclusionPatterns,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"leader_index_exclusion_patterns");
		op.add(Builder::maxOutstandingReadRequests, JsonpDeserializer.numberDeserializer(),
				"max_outstanding_read_requests");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "settings");
		op.add(Builder::maxOutstandingWriteRequests, JsonpDeserializer.numberDeserializer(),
				"max_outstanding_write_requests");
		op.add(Builder::readPollTimeout, JsonpDeserializer.jsonValueDeserializer(), "read_poll_timeout");
		op.add(Builder::maxReadRequestOperationCount, JsonpDeserializer.numberDeserializer(),
				"max_read_request_operation_count");
		op.add(Builder::maxReadRequestSize, JsonpDeserializer.jsonValueDeserializer(), "max_read_request_size");
		op.add(Builder::maxRetryDelay, JsonpDeserializer.jsonValueDeserializer(), "max_retry_delay");
		op.add(Builder::maxWriteBufferCount, JsonpDeserializer.numberDeserializer(), "max_write_buffer_count");
		op.add(Builder::maxWriteBufferSize, JsonpDeserializer.jsonValueDeserializer(), "max_write_buffer_size");
		op.add(Builder::maxWriteRequestOperationCount, JsonpDeserializer.numberDeserializer(),
				"max_write_request_operation_count");
		op.add(Builder::maxWriteRequestSize, JsonpDeserializer.jsonValueDeserializer(), "max_write_request_size");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.put_auto_follow_pattern}".
	 */
	public static final Endpoint<PutAutoFollowPatternRequest, PutAutoFollowPatternResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ccr");
					buf.append("/auto_follow");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutAutoFollowPatternResponse.DESERIALIZER);
}
