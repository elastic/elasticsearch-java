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

package co.elastic.clients.elasticsearch.ccr.follow_info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.follow_info.FollowerIndexParameters
@JsonpDeserializable
public final class FollowerIndexParameters implements JsonpSerializable {
	private final int maxOutstandingReadRequests;

	private final int maxOutstandingWriteRequests;

	private final int maxReadRequestOperationCount;

	private final String maxReadRequestSize;

	private final String maxRetryDelay;

	private final int maxWriteBufferCount;

	private final String maxWriteBufferSize;

	private final int maxWriteRequestOperationCount;

	private final String maxWriteRequestSize;

	private final String readPollTimeout;

	// ---------------------------------------------------------------------------------------------

	public FollowerIndexParameters(Builder builder) {

		this.maxOutstandingReadRequests = Objects.requireNonNull(builder.maxOutstandingReadRequests,
				"max_outstanding_read_requests");
		this.maxOutstandingWriteRequests = Objects.requireNonNull(builder.maxOutstandingWriteRequests,
				"max_outstanding_write_requests");
		this.maxReadRequestOperationCount = Objects.requireNonNull(builder.maxReadRequestOperationCount,
				"max_read_request_operation_count");
		this.maxReadRequestSize = Objects.requireNonNull(builder.maxReadRequestSize, "max_read_request_size");
		this.maxRetryDelay = Objects.requireNonNull(builder.maxRetryDelay, "max_retry_delay");
		this.maxWriteBufferCount = Objects.requireNonNull(builder.maxWriteBufferCount, "max_write_buffer_count");
		this.maxWriteBufferSize = Objects.requireNonNull(builder.maxWriteBufferSize, "max_write_buffer_size");
		this.maxWriteRequestOperationCount = Objects.requireNonNull(builder.maxWriteRequestOperationCount,
				"max_write_request_operation_count");
		this.maxWriteRequestSize = Objects.requireNonNull(builder.maxWriteRequestSize, "max_write_request_size");
		this.readPollTimeout = Objects.requireNonNull(builder.readPollTimeout, "read_poll_timeout");

	}

	public FollowerIndexParameters(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code max_outstanding_read_requests}
	 */
	public int maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * API name: {@code max_outstanding_write_requests}
	 */
	public int maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
	}

	/**
	 * API name: {@code max_read_request_operation_count}
	 */
	public int maxReadRequestOperationCount() {
		return this.maxReadRequestOperationCount;
	}

	/**
	 * API name: {@code max_read_request_size}
	 */
	public String maxReadRequestSize() {
		return this.maxReadRequestSize;
	}

	/**
	 * API name: {@code max_retry_delay}
	 */
	public String maxRetryDelay() {
		return this.maxRetryDelay;
	}

	/**
	 * API name: {@code max_write_buffer_count}
	 */
	public int maxWriteBufferCount() {
		return this.maxWriteBufferCount;
	}

	/**
	 * API name: {@code max_write_buffer_size}
	 */
	public String maxWriteBufferSize() {
		return this.maxWriteBufferSize;
	}

	/**
	 * API name: {@code max_write_request_operation_count}
	 */
	public int maxWriteRequestOperationCount() {
		return this.maxWriteRequestOperationCount;
	}

	/**
	 * API name: {@code max_write_request_size}
	 */
	public String maxWriteRequestSize() {
		return this.maxWriteRequestSize;
	}

	/**
	 * API name: {@code read_poll_timeout}
	 */
	public String readPollTimeout() {
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

		generator.writeKey("max_outstanding_read_requests");
		generator.write(this.maxOutstandingReadRequests);

		generator.writeKey("max_outstanding_write_requests");
		generator.write(this.maxOutstandingWriteRequests);

		generator.writeKey("max_read_request_operation_count");
		generator.write(this.maxReadRequestOperationCount);

		generator.writeKey("max_read_request_size");
		generator.write(this.maxReadRequestSize);

		generator.writeKey("max_retry_delay");
		generator.write(this.maxRetryDelay);

		generator.writeKey("max_write_buffer_count");
		generator.write(this.maxWriteBufferCount);

		generator.writeKey("max_write_buffer_size");
		generator.write(this.maxWriteBufferSize);

		generator.writeKey("max_write_request_operation_count");
		generator.write(this.maxWriteRequestOperationCount);

		generator.writeKey("max_write_request_size");
		generator.write(this.maxWriteRequestSize);

		generator.writeKey("read_poll_timeout");
		generator.write(this.readPollTimeout);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowerIndexParameters}.
	 */
	public static class Builder implements ObjectBuilder<FollowerIndexParameters> {
		private Integer maxOutstandingReadRequests;

		private Integer maxOutstandingWriteRequests;

		private Integer maxReadRequestOperationCount;

		private String maxReadRequestSize;

		private String maxRetryDelay;

		private Integer maxWriteBufferCount;

		private String maxWriteBufferSize;

		private Integer maxWriteRequestOperationCount;

		private String maxWriteRequestSize;

		private String readPollTimeout;

		/**
		 * API name: {@code max_outstanding_read_requests}
		 */
		public Builder maxOutstandingReadRequests(int value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_outstanding_write_requests}
		 */
		public Builder maxOutstandingWriteRequests(int value) {
			this.maxOutstandingWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code max_read_request_operation_count}
		 */
		public Builder maxReadRequestOperationCount(int value) {
			this.maxReadRequestOperationCount = value;
			return this;
		}

		/**
		 * API name: {@code max_read_request_size}
		 */
		public Builder maxReadRequestSize(String value) {
			this.maxReadRequestSize = value;
			return this;
		}

		/**
		 * API name: {@code max_retry_delay}
		 */
		public Builder maxRetryDelay(String value) {
			this.maxRetryDelay = value;
			return this;
		}

		/**
		 * API name: {@code max_write_buffer_count}
		 */
		public Builder maxWriteBufferCount(int value) {
			this.maxWriteBufferCount = value;
			return this;
		}

		/**
		 * API name: {@code max_write_buffer_size}
		 */
		public Builder maxWriteBufferSize(String value) {
			this.maxWriteBufferSize = value;
			return this;
		}

		/**
		 * API name: {@code max_write_request_operation_count}
		 */
		public Builder maxWriteRequestOperationCount(int value) {
			this.maxWriteRequestOperationCount = value;
			return this;
		}

		/**
		 * API name: {@code max_write_request_size}
		 */
		public Builder maxWriteRequestSize(String value) {
			this.maxWriteRequestSize = value;
			return this;
		}

		/**
		 * API name: {@code read_poll_timeout}
		 */
		public Builder readPollTimeout(String value) {
			this.readPollTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link FollowerIndexParameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowerIndexParameters build() {

			return new FollowerIndexParameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowerIndexParameters}
	 */
	public static final JsonpDeserializer<FollowerIndexParameters> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FollowerIndexParameters::setupFollowerIndexParametersDeserializer, Builder::build);

	protected static void setupFollowerIndexParametersDeserializer(
			DelegatingDeserializer<FollowerIndexParameters.Builder> op) {

		op.add(Builder::maxOutstandingReadRequests, JsonpDeserializer.integerDeserializer(),
				"max_outstanding_read_requests");
		op.add(Builder::maxOutstandingWriteRequests, JsonpDeserializer.integerDeserializer(),
				"max_outstanding_write_requests");
		op.add(Builder::maxReadRequestOperationCount, JsonpDeserializer.integerDeserializer(),
				"max_read_request_operation_count");
		op.add(Builder::maxReadRequestSize, JsonpDeserializer.stringDeserializer(), "max_read_request_size");
		op.add(Builder::maxRetryDelay, JsonpDeserializer.stringDeserializer(), "max_retry_delay");
		op.add(Builder::maxWriteBufferCount, JsonpDeserializer.integerDeserializer(), "max_write_buffer_count");
		op.add(Builder::maxWriteBufferSize, JsonpDeserializer.stringDeserializer(), "max_write_buffer_size");
		op.add(Builder::maxWriteRequestOperationCount, JsonpDeserializer.integerDeserializer(),
				"max_write_request_operation_count");
		op.add(Builder::maxWriteRequestSize, JsonpDeserializer.stringDeserializer(), "max_write_request_size");
		op.add(Builder::readPollTimeout, JsonpDeserializer.stringDeserializer(), "read_poll_timeout");

	}

}
