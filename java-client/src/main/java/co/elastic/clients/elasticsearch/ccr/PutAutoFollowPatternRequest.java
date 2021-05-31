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
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
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
public final class PutAutoFollowPatternRequest extends RequestBase implements ToJsonp {
	private final String name;

	private final String remoteCluster;

	@Nullable
	private final String followIndexPattern;

	@Nullable
	private final List<String> leaderIndexPatterns;

	@Nullable
	private final Number maxOutstandingReadRequests;

	@Nullable
	private final Map<String, JsonValue> settings;

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

	protected PutAutoFollowPatternRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.remoteCluster = Objects.requireNonNull(builder.remoteCluster, "remote_cluster");
		this.followIndexPattern = builder.followIndexPattern;
		this.leaderIndexPatterns = builder.leaderIndexPatterns;
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
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code remote_cluster}
	 */
	public String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * API name: {@code follow_index_pattern}
	 */
	@Nullable
	public String followIndexPattern() {
		return this.followIndexPattern;
	}

	/**
	 * API name: {@code leader_index_patterns}
	 */
	@Nullable
	public List<String> leaderIndexPatterns() {
		return this.leaderIndexPatterns;
	}

	/**
	 * API name: {@code max_outstanding_read_requests}
	 */
	@Nullable
	public Number maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public Map<String, JsonValue> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code max_outstanding_write_requests}
	 */
	@Nullable
	public Number maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
	}

	/**
	 * API name: {@code read_poll_timeout}
	 */
	@Nullable
	public JsonValue readPollTimeout() {
		return this.readPollTimeout;
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
	public JsonValue maxReadRequestSize() {
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
	public JsonValue maxWriteBufferSize() {
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
	public JsonValue maxWriteRequestSize() {
		return this.maxWriteRequestSize;
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
		if (this.maxOutstandingReadRequests != null) {

			generator.writeKey("max_outstanding_read_requests");
			generator.write(this.maxOutstandingReadRequests.doubleValue());

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
		private Number maxOutstandingReadRequests;

		@Nullable
		private Map<String, JsonValue> settings;

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
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code remote_cluster}
		 */
		public Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * API name: {@code follow_index_pattern}
		 */
		public Builder followIndexPattern(@Nullable String value) {
			this.followIndexPattern = value;
			return this;
		}

		/**
		 * API name: {@code leader_index_patterns}
		 */
		public Builder leaderIndexPatterns(@Nullable List<String> value) {
			this.leaderIndexPatterns = value;
			return this;
		}

		/**
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
		 * API name: {@code max_outstanding_read_requests}
		 */
		public Builder maxOutstandingReadRequests(@Nullable Number value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Map<String, JsonValue> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, JsonValue value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
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
		 * API name: {@code read_poll_timeout}
		 */
		public Builder readPollTimeout(@Nullable JsonValue value) {
			this.readPollTimeout = value;
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
		public Builder maxReadRequestSize(@Nullable JsonValue value) {
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
		public Builder maxWriteBufferSize(@Nullable JsonValue value) {
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
	 * Json parser for PutAutoFollowPatternRequest
	 */
	public static final JsonpValueParser<PutAutoFollowPatternRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutAutoFollowPatternRequest::setupPutAutoFollowPatternRequestParser);

	protected static void setupPutAutoFollowPatternRequestParser(
			DelegatingJsonpValueParser<PutAutoFollowPatternRequest.Builder> op) {

		op.add(Builder::remoteCluster, JsonpValueParser.stringParser(), "remote_cluster");
		op.add(Builder::followIndexPattern, JsonpValueParser.stringParser(), "follow_index_pattern");
		op.add(Builder::leaderIndexPatterns, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()),
				"leader_index_patterns");
		op.add(Builder::maxOutstandingReadRequests, JsonpValueParser.numberParser(), "max_outstanding_read_requests");
		op.add(Builder::settings, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "settings");
		op.add(Builder::maxOutstandingWriteRequests, JsonpValueParser.numberParser(), "max_outstanding_write_requests");
		op.add(Builder::readPollTimeout, JsonpValueParser.jsonValueParser(), "read_poll_timeout");
		op.add(Builder::maxReadRequestOperationCount, JsonpValueParser.numberParser(),
				"max_read_request_operation_count");
		op.add(Builder::maxReadRequestSize, JsonpValueParser.jsonValueParser(), "max_read_request_size");
		op.add(Builder::maxRetryDelay, JsonpValueParser.jsonValueParser(), "max_retry_delay");
		op.add(Builder::maxWriteBufferCount, JsonpValueParser.numberParser(), "max_write_buffer_count");
		op.add(Builder::maxWriteBufferSize, JsonpValueParser.jsonValueParser(), "max_write_buffer_size");
		op.add(Builder::maxWriteRequestOperationCount, JsonpValueParser.numberParser(),
				"max_write_request_operation_count");
		op.add(Builder::maxWriteRequestSize, JsonpValueParser.jsonValueParser(), "max_write_request_size");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.put_auto_follow_pattern}".
	 */
	public static final Endpoint<PutAutoFollowPatternRequest, PutAutoFollowPatternResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "PUT",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_ccr");
				buf.append("/auto_follow");
				buf.append("/");
				buf.append(request.name);
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutAutoFollowPatternResponse.JSONP_PARSER);
}
