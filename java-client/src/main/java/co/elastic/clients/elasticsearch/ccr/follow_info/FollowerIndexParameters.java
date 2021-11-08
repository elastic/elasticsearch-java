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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.follow_info.FollowerIndexParameters
@JsonpDeserializable
public class FollowerIndexParameters implements JsonpSerializable {
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

	private FollowerIndexParameters(Builder builder) {

		this.maxOutstandingReadRequests = ModelTypeHelper.requireNonNull(builder.maxOutstandingReadRequests, this,
				"maxOutstandingReadRequests");
		this.maxOutstandingWriteRequests = ModelTypeHelper.requireNonNull(builder.maxOutstandingWriteRequests, this,
				"maxOutstandingWriteRequests");
		this.maxReadRequestOperationCount = ModelTypeHelper.requireNonNull(builder.maxReadRequestOperationCount, this,
				"maxReadRequestOperationCount");
		this.maxReadRequestSize = ModelTypeHelper.requireNonNull(builder.maxReadRequestSize, this,
				"maxReadRequestSize");
		this.maxRetryDelay = ModelTypeHelper.requireNonNull(builder.maxRetryDelay, this, "maxRetryDelay");
		this.maxWriteBufferCount = ModelTypeHelper.requireNonNull(builder.maxWriteBufferCount, this,
				"maxWriteBufferCount");
		this.maxWriteBufferSize = ModelTypeHelper.requireNonNull(builder.maxWriteBufferSize, this,
				"maxWriteBufferSize");
		this.maxWriteRequestOperationCount = ModelTypeHelper.requireNonNull(builder.maxWriteRequestOperationCount, this,
				"maxWriteRequestOperationCount");
		this.maxWriteRequestSize = ModelTypeHelper.requireNonNull(builder.maxWriteRequestSize, this,
				"maxWriteRequestSize");
		this.readPollTimeout = ModelTypeHelper.requireNonNull(builder.readPollTimeout, this, "readPollTimeout");

	}

	public static FollowerIndexParameters of(Function<Builder, ObjectBuilder<FollowerIndexParameters>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max_outstanding_read_requests}
	 */
	public final int maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * Required - API name: {@code max_outstanding_write_requests}
	 */
	public final int maxOutstandingWriteRequests() {
		return this.maxOutstandingWriteRequests;
	}

	/**
	 * Required - API name: {@code max_read_request_operation_count}
	 */
	public final int maxReadRequestOperationCount() {
		return this.maxReadRequestOperationCount;
	}

	/**
	 * Required - API name: {@code max_read_request_size}
	 */
	public final String maxReadRequestSize() {
		return this.maxReadRequestSize;
	}

	/**
	 * Required - API name: {@code max_retry_delay}
	 */
	public final String maxRetryDelay() {
		return this.maxRetryDelay;
	}

	/**
	 * Required - API name: {@code max_write_buffer_count}
	 */
	public final int maxWriteBufferCount() {
		return this.maxWriteBufferCount;
	}

	/**
	 * Required - API name: {@code max_write_buffer_size}
	 */
	public final String maxWriteBufferSize() {
		return this.maxWriteBufferSize;
	}

	/**
	 * Required - API name: {@code max_write_request_operation_count}
	 */
	public final int maxWriteRequestOperationCount() {
		return this.maxWriteRequestOperationCount;
	}

	/**
	 * Required - API name: {@code max_write_request_size}
	 */
	public final String maxWriteRequestSize() {
		return this.maxWriteRequestSize;
	}

	/**
	 * Required - API name: {@code read_poll_timeout}
	 */
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FollowerIndexParameters> {
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
		 * Required - API name: {@code max_outstanding_read_requests}
		 */
		public final Builder maxOutstandingReadRequests(int value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_outstanding_write_requests}
		 */
		public final Builder maxOutstandingWriteRequests(int value) {
			this.maxOutstandingWriteRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_read_request_operation_count}
		 */
		public final Builder maxReadRequestOperationCount(int value) {
			this.maxReadRequestOperationCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_read_request_size}
		 */
		public final Builder maxReadRequestSize(String value) {
			this.maxReadRequestSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_retry_delay}
		 */
		public final Builder maxRetryDelay(String value) {
			this.maxRetryDelay = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_write_buffer_count}
		 */
		public final Builder maxWriteBufferCount(int value) {
			this.maxWriteBufferCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_write_buffer_size}
		 */
		public final Builder maxWriteBufferSize(String value) {
			this.maxWriteBufferSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_write_request_operation_count}
		 */
		public final Builder maxWriteRequestOperationCount(int value) {
			this.maxWriteRequestOperationCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_write_request_size}
		 */
		public final Builder maxWriteRequestSize(String value) {
			this.maxWriteRequestSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code read_poll_timeout}
		 */
		public final Builder readPollTimeout(String value) {
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
			_checkSingleUse();

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
