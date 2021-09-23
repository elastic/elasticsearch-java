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
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.resume_follow.Request
public final class ResumeFollowRequest extends RequestBase implements JsonpSerializable {
	private final String index;

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

	// ---------------------------------------------------------------------------------------------

	public ResumeFollowRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
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

	}

	/**
	 * The name of the follow index to resume following.
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResumeFollowRequest}.
	 */
	public static class Builder implements ObjectBuilder<ResumeFollowRequest> {
		private String index;

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

		/**
		 * The name of the follow index to resume following.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
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
		 * Builds a {@link ResumeFollowRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResumeFollowRequest build() {

			return new ResumeFollowRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResumeFollowRequest}
	 */
	public static final JsonpDeserializer<ResumeFollowRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ResumeFollowRequest::setupResumeFollowRequestDeserializer);

	protected static void setupResumeFollowRequestDeserializer(DelegatingDeserializer<ResumeFollowRequest.Builder> op) {

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.resume_follow}".
	 */
	public static final Endpoint<ResumeFollowRequest, ResumeFollowResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

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
					buf.append("/resume_follow");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ResumeFollowResponse.DESERIALIZER);
}
