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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.resume_follow.Request
@JsonpDeserializable
public class ResumeFollowRequest extends RequestBase implements JsonpSerializable {
	private final String index;

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

	// ---------------------------------------------------------------------------------------------

	private ResumeFollowRequest(Builder builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
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

	public static ResumeFollowRequest of(Function<Builder, ObjectBuilder<ResumeFollowRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the follow index to resume following.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code max_outstanding_read_requests}
	 */
	@Nullable
	public final Long maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * API name: {@code max_outstanding_write_requests}
	 */
	@Nullable
	public final Long maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
	}

	/**
	 * API name: {@code max_read_request_operation_count}
	 */
	@Nullable
	public final Long maxReadRequestOperationCount() {
		return this.maxReadRequestOperationCount;
	}

	/**
	 * API name: {@code max_read_request_size}
	 */
	@Nullable
	public final String maxReadRequestSize() {
		return this.maxReadRequestSize;
	}

	/**
	 * API name: {@code max_retry_delay}
	 */
	@Nullable
	public final String maxRetryDelay() {
		return this.maxRetryDelay;
	}

	/**
	 * API name: {@code max_write_buffer_count}
	 */
	@Nullable
	public final Long maxWriteBufferCount() {
		return this.maxWriteBufferCount;
	}

	/**
	 * API name: {@code max_write_buffer_size}
	 */
	@Nullable
	public final String maxWriteBufferSize() {
		return this.maxWriteBufferSize;
	}

	/**
	 * API name: {@code max_write_request_operation_count}
	 */
	@Nullable
	public final Long maxWriteRequestOperationCount() {
		return this.maxWriteRequestOperationCount;
	}

	/**
	 * API name: {@code max_write_request_size}
	 */
	@Nullable
	public final String maxWriteRequestSize() {
		return this.maxWriteRequestSize;
	}

	/**
	 * API name: {@code read_poll_timeout}
	 */
	@Nullable
	public final String readPollTimeout() {
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResumeFollowRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ResumeFollowRequest> {
		private String index;

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

		/**
		 * Required - The name of the follow index to resume following.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code max_outstanding_read_requests}
		 */
		public final Builder maxOutstandingReadRequests(@Nullable Long value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_outstanding_write_requests}
		 */
		public final Builder maxOutstandingWriteRequests(@Nullable Long value) {
			this.maxOutstandingWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_read_request_operation_count}
		 */
		public final Builder maxReadRequestOperationCount(@Nullable Long value) {
			this.maxReadRequestOperationCount = value;
			return this;
		}

		/**
		 * API name: {@code max_read_request_size}
		 */
		public final Builder maxReadRequestSize(@Nullable String value) {
			this.maxReadRequestSize = value;
			return this;
		}

		/**
		 * API name: {@code max_retry_delay}
		 */
		public final Builder maxRetryDelay(@Nullable String value) {
			this.maxRetryDelay = value;
			return this;
		}

		/**
		 * API name: {@code max_write_buffer_count}
		 */
		public final Builder maxWriteBufferCount(@Nullable Long value) {
			this.maxWriteBufferCount = value;
			return this;
		}

		/**
		 * API name: {@code max_write_buffer_size}
		 */
		public final Builder maxWriteBufferSize(@Nullable String value) {
			this.maxWriteBufferSize = value;
			return this;
		}

		/**
		 * API name: {@code max_write_request_operation_count}
		 */
		public final Builder maxWriteRequestOperationCount(@Nullable Long value) {
			this.maxWriteRequestOperationCount = value;
			return this;
		}

		/**
		 * API name: {@code max_write_request_size}
		 */
		public final Builder maxWriteRequestSize(@Nullable String value) {
			this.maxWriteRequestSize = value;
			return this;
		}

		/**
		 * API name: {@code read_poll_timeout}
		 */
		public final Builder readPollTimeout(@Nullable String value) {
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
			_checkSingleUse();

			return new ResumeFollowRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResumeFollowRequest}
	 */
	public static final JsonpDeserializer<ResumeFollowRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResumeFollowRequest::setupResumeFollowRequestDeserializer, Builder::build);

	protected static void setupResumeFollowRequestDeserializer(DelegatingDeserializer<ResumeFollowRequest.Builder> op) {

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.resume_follow}".
	 */
	public static final Endpoint<ResumeFollowRequest, ResumeFollowResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

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
					buf.append("/resume_follow");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ResumeFollowResponse._DESERIALIZER);
}
