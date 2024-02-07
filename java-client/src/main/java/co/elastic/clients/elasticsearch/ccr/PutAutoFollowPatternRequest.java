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
import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

// typedef: ccr.put_auto_follow_pattern.Request

/**
 * Creates a new named collection of auto-follow patterns against a specified
 * remote cluster. Newly created indices on the remote cluster matching any of
 * the specified patterns will be automatically configured as follower indices.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ccr.put_auto_follow_pattern.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAutoFollowPatternRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String followIndexPattern;

	private final List<String> leaderIndexExclusionPatterns;

	private final List<String> leaderIndexPatterns;

	@Nullable
	private final Integer maxOutstandingReadRequests;

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

	private final String name;

	@Nullable
	private final Time readPollTimeout;

	private final String remoteCluster;

	private final Map<String, JsonData> settings;

	// ---------------------------------------------------------------------------------------------

	private PutAutoFollowPatternRequest(Builder builder) {

		this.followIndexPattern = builder.followIndexPattern;
		this.leaderIndexExclusionPatterns = ApiTypeHelper.unmodifiable(builder.leaderIndexExclusionPatterns);
		this.leaderIndexPatterns = ApiTypeHelper.unmodifiable(builder.leaderIndexPatterns);
		this.maxOutstandingReadRequests = builder.maxOutstandingReadRequests;
		this.maxOutstandingWriteRequests = builder.maxOutstandingWriteRequests;
		this.maxReadRequestOperationCount = builder.maxReadRequestOperationCount;
		this.maxReadRequestSize = builder.maxReadRequestSize;
		this.maxRetryDelay = builder.maxRetryDelay;
		this.maxWriteBufferCount = builder.maxWriteBufferCount;
		this.maxWriteBufferSize = builder.maxWriteBufferSize;
		this.maxWriteRequestOperationCount = builder.maxWriteRequestOperationCount;
		this.maxWriteRequestSize = builder.maxWriteRequestSize;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.readPollTimeout = builder.readPollTimeout;
		this.remoteCluster = ApiTypeHelper.requireNonNull(builder.remoteCluster, this, "remoteCluster");
		this.settings = ApiTypeHelper.unmodifiable(builder.settings);

	}

	public static PutAutoFollowPatternRequest of(Function<Builder, ObjectBuilder<PutAutoFollowPatternRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	public final String followIndexPattern() {
		return this.followIndexPattern;
	}

	/**
	 * An array of simple index patterns that can be used to exclude indices from
	 * being auto-followed. Indices in the remote cluster whose names are matching
	 * one or more leader_index_patterns and one or more
	 * leader_index_exclusion_patterns won’t be followed.
	 * <p>
	 * API name: {@code leader_index_exclusion_patterns}
	 */
	public final List<String> leaderIndexExclusionPatterns() {
		return this.leaderIndexExclusionPatterns;
	}

	/**
	 * An array of simple index patterns to match against indices in the remote
	 * cluster specified by the remote_cluster field.
	 * <p>
	 * API name: {@code leader_index_patterns}
	 */
	public final List<String> leaderIndexPatterns() {
		return this.leaderIndexPatterns;
	}

	/**
	 * The maximum number of outstanding reads requests from the remote cluster.
	 * <p>
	 * API name: {@code max_outstanding_read_requests}
	 */
	@Nullable
	public final Integer maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * The maximum number of outstanding reads requests from the remote cluster.
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
	 * Required - The name of the collection of auto-follow patterns.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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
	 * Required - The remote cluster containing the leader indices to match against.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public final String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Settings to override from the leader index. Note that certain settings can
	 * not be overrode (e.g., index.number_of_shards).
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
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

		if (this.followIndexPattern != null) {
			generator.writeKey("follow_index_pattern");
			generator.write(this.followIndexPattern);

		}
		if (ApiTypeHelper.isDefined(this.leaderIndexExclusionPatterns)) {
			generator.writeKey("leader_index_exclusion_patterns");
			generator.writeStartArray();
			for (String item0 : this.leaderIndexExclusionPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.leaderIndexPatterns)) {
			generator.writeKey("leader_index_patterns");
			generator.writeStartArray();
			for (String item0 : this.leaderIndexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

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

		if (ApiTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAutoFollowPatternRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAutoFollowPatternRequest> {
		@Nullable
		private String followIndexPattern;

		@Nullable
		private List<String> leaderIndexExclusionPatterns;

		@Nullable
		private List<String> leaderIndexPatterns;

		@Nullable
		private Integer maxOutstandingReadRequests;

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

		private String name;

		@Nullable
		private Time readPollTimeout;

		private String remoteCluster;

		@Nullable
		private Map<String, JsonData> settings;

		/**
		 * The name of follower index. The template {{leader_index}} can be used to
		 * derive the name of the follower index from the name of the leader index. When
		 * following a data stream, use {{leader_index}}; CCR does not support changes
		 * to the names of a follower data stream’s backing indices.
		 * <p>
		 * API name: {@code follow_index_pattern}
		 */
		public final Builder followIndexPattern(@Nullable String value) {
			this.followIndexPattern = value;
			return this;
		}

		/**
		 * An array of simple index patterns that can be used to exclude indices from
		 * being auto-followed. Indices in the remote cluster whose names are matching
		 * one or more leader_index_patterns and one or more
		 * leader_index_exclusion_patterns won’t be followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>leaderIndexExclusionPatterns</code>.
		 */
		public final Builder leaderIndexExclusionPatterns(List<String> list) {
			this.leaderIndexExclusionPatterns = _listAddAll(this.leaderIndexExclusionPatterns, list);
			return this;
		}

		/**
		 * An array of simple index patterns that can be used to exclude indices from
		 * being auto-followed. Indices in the remote cluster whose names are matching
		 * one or more leader_index_patterns and one or more
		 * leader_index_exclusion_patterns won’t be followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 * <p>
		 * Adds one or more values to <code>leaderIndexExclusionPatterns</code>.
		 */
		public final Builder leaderIndexExclusionPatterns(String value, String... values) {
			this.leaderIndexExclusionPatterns = _listAdd(this.leaderIndexExclusionPatterns, value, values);
			return this;
		}

		/**
		 * An array of simple index patterns to match against indices in the remote
		 * cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>leaderIndexPatterns</code>.
		 */
		public final Builder leaderIndexPatterns(List<String> list) {
			this.leaderIndexPatterns = _listAddAll(this.leaderIndexPatterns, list);
			return this;
		}

		/**
		 * An array of simple index patterns to match against indices in the remote
		 * cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 * <p>
		 * Adds one or more values to <code>leaderIndexPatterns</code>.
		 */
		public final Builder leaderIndexPatterns(String value, String... values) {
			this.leaderIndexPatterns = _listAdd(this.leaderIndexPatterns, value, values);
			return this;
		}

		/**
		 * The maximum number of outstanding reads requests from the remote cluster.
		 * <p>
		 * API name: {@code max_outstanding_read_requests}
		 */
		public final Builder maxOutstandingReadRequests(@Nullable Integer value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * The maximum number of outstanding reads requests from the remote cluster.
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
		 * Required - The name of the collection of auto-follow patterns.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
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
		 * Required - The remote cluster containing the leader indices to match against.
		 * <p>
		 * API name: {@code remote_cluster}
		 */
		public final Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * Settings to override from the leader index. Note that certain settings can
		 * not be overrode (e.g., index.number_of_shards).
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, JsonData> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * Settings to override from the leader index. Note that certain settings can
		 * not be overrode (e.g., index.number_of_shards).
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAutoFollowPatternRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAutoFollowPatternRequest build() {
			_checkSingleUse();

			return new PutAutoFollowPatternRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAutoFollowPatternRequest}
	 */
	public static final JsonpDeserializer<PutAutoFollowPatternRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutAutoFollowPatternRequest::setupPutAutoFollowPatternRequestDeserializer);

	protected static void setupPutAutoFollowPatternRequestDeserializer(
			ObjectDeserializer<PutAutoFollowPatternRequest.Builder> op) {

		op.add(Builder::followIndexPattern, JsonpDeserializer.stringDeserializer(), "follow_index_pattern");
		op.add(Builder::leaderIndexExclusionPatterns,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"leader_index_exclusion_patterns");
		op.add(Builder::leaderIndexPatterns,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "leader_index_patterns");
		op.add(Builder::maxOutstandingReadRequests, JsonpDeserializer.integerDeserializer(),
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
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.put_auto_follow_pattern}".
	 */
	public static final Endpoint<PutAutoFollowPatternRequest, PutAutoFollowPatternResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ccr.put_auto_follow_pattern",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ccr");
					buf.append("/auto_follow");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutAutoFollowPatternResponse._DESERIALIZER);
}
