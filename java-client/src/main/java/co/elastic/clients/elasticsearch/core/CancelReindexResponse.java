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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch._types.ReindexStatus;
import co.elastic.clients.elasticsearch._types.ReindexTaskResult;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
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

// typedef: _global.cancel_reindex.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.cancel_reindex.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CancelReindexResponse implements JsonpSerializable {
	@Nullable
	private final Boolean acknowledged;

	@Nullable
	private final Boolean completed;

	@Nullable
	private final String id;

	@Nullable
	private final String description;

	@Nullable
	private final Long startTimeInMillis;

	@Nullable
	private final String startTime;

	@Nullable
	private final Time runningTime;

	@Nullable
	private final Long runningTimeInNanos;

	@Nullable
	private final Boolean cancelled;

	@Nullable
	private final ReindexStatus status;

	@Nullable
	private final ErrorCause error;

	@Nullable
	private final ReindexTaskResult response;

	// ---------------------------------------------------------------------------------------------

	private CancelReindexResponse(Builder builder) {

		this.acknowledged = builder.acknowledged;
		this.completed = builder.completed;
		this.id = builder.id;
		this.description = builder.description;
		this.startTimeInMillis = builder.startTimeInMillis;
		this.startTime = builder.startTime;
		this.runningTime = builder.runningTime;
		this.runningTimeInNanos = builder.runningTimeInNanos;
		this.cancelled = builder.cancelled;
		this.status = builder.status;
		this.error = builder.error;
		this.response = builder.response;

	}

	public static CancelReindexResponse of(Function<Builder, ObjectBuilder<CancelReindexResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Present and <code>true</code> when <code>wait_for_completion=false</code>.
	 * <p>
	 * API name: {@code acknowledged}
	 */
	@Nullable
	public final Boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Whether the reindex task has completed. Present when
	 * <code>wait_for_completion=true</code>.
	 * <p>
	 * API name: {@code completed}
	 */
	@Nullable
	public final Boolean completed() {
		return this.completed;
	}

	/**
	 * The ID of the reindex task, in <code>nodeId:taskNum</code> format. Present
	 * when <code>wait_for_completion=true</code>.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * A sanitized description of the reindex operation.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The time at which the reindex task started, in milliseconds since the Unix
	 * epoch.
	 * <p>
	 * API name: {@code start_time_in_millis}
	 */
	@Nullable
	public final Long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * The time at which the reindex task started, as an ISO 8601 formatted string.
	 * <p>
	 * API name: {@code start_time}
	 */
	@Nullable
	public final String startTime() {
		return this.startTime;
	}

	/**
	 * The elapsed running time of the reindex task, in a human-readable format.
	 * Only present when the request includes the <code>?human=true</code> query
	 * parameter.
	 * <p>
	 * API name: {@code running_time}
	 */
	@Nullable
	public final Time runningTime() {
		return this.runningTime;
	}

	/**
	 * The elapsed running time of the reindex task, in nanoseconds.
	 * <p>
	 * API name: {@code running_time_in_nanos}
	 */
	@Nullable
	public final Long runningTimeInNanos() {
		return this.runningTimeInNanos;
	}

	/**
	 * Whether the reindex task has been cancelled.
	 * <p>
	 * API name: {@code cancelled}
	 */
	@Nullable
	public final Boolean cancelled() {
		return this.cancelled;
	}

	/**
	 * The status of the reindex operation at the time of cancellation.
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public final ReindexStatus status() {
		return this.status;
	}

	/**
	 * The error that caused the reindex task to fail, if any.
	 * <p>
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
	}

	/**
	 * The final result of the reindex operation, if it completed before being
	 * cancelled.
	 * <p>
	 * API name: {@code response}
	 */
	@Nullable
	public final ReindexTaskResult response() {
		return this.response;
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

		if (this.acknowledged != null) {
			generator.writeKey("acknowledged");
			generator.write(this.acknowledged);

		}
		if (this.completed != null) {
			generator.writeKey("completed");
			generator.write(this.completed);

		}
		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.startTimeInMillis != null) {
			generator.writeKey("start_time_in_millis");
			generator.write(this.startTimeInMillis);

		}
		if (this.startTime != null) {
			generator.writeKey("start_time");
			generator.write(this.startTime);

		}
		if (this.runningTime != null) {
			generator.writeKey("running_time");
			this.runningTime.serialize(generator, mapper);

		}
		if (this.runningTimeInNanos != null) {
			generator.writeKey("running_time_in_nanos");
			generator.write(this.runningTimeInNanos);

		}
		if (this.cancelled != null) {
			generator.writeKey("cancelled");
			generator.write(this.cancelled);

		}
		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}
		if (this.response != null) {
			generator.writeKey("response");
			this.response.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CancelReindexResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CancelReindexResponse> {
		@Nullable
		private Boolean acknowledged;

		@Nullable
		private Boolean completed;

		@Nullable
		private String id;

		@Nullable
		private String description;

		@Nullable
		private Long startTimeInMillis;

		@Nullable
		private String startTime;

		@Nullable
		private Time runningTime;

		@Nullable
		private Long runningTimeInNanos;

		@Nullable
		private Boolean cancelled;

		@Nullable
		private ReindexStatus status;

		@Nullable
		private ErrorCause error;

		@Nullable
		private ReindexTaskResult response;

		/**
		 * Present and <code>true</code> when <code>wait_for_completion=false</code>.
		 * <p>
		 * API name: {@code acknowledged}
		 */
		public final Builder acknowledged(@Nullable Boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Whether the reindex task has completed. Present when
		 * <code>wait_for_completion=true</code>.
		 * <p>
		 * API name: {@code completed}
		 */
		public final Builder completed(@Nullable Boolean value) {
			this.completed = value;
			return this;
		}

		/**
		 * The ID of the reindex task, in <code>nodeId:taskNum</code> format. Present
		 * when <code>wait_for_completion=true</code>.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * A sanitized description of the reindex operation.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The time at which the reindex task started, in milliseconds since the Unix
		 * epoch.
		 * <p>
		 * API name: {@code start_time_in_millis}
		 */
		public final Builder startTimeInMillis(@Nullable Long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * The time at which the reindex task started, as an ISO 8601 formatted string.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable String value) {
			this.startTime = value;
			return this;
		}

		/**
		 * The elapsed running time of the reindex task, in a human-readable format.
		 * Only present when the request includes the <code>?human=true</code> query
		 * parameter.
		 * <p>
		 * API name: {@code running_time}
		 */
		public final Builder runningTime(@Nullable Time value) {
			this.runningTime = value;
			return this;
		}

		/**
		 * The elapsed running time of the reindex task, in a human-readable format.
		 * Only present when the request includes the <code>?human=true</code> query
		 * parameter.
		 * <p>
		 * API name: {@code running_time}
		 */
		public final Builder runningTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.runningTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The elapsed running time of the reindex task, in nanoseconds.
		 * <p>
		 * API name: {@code running_time_in_nanos}
		 */
		public final Builder runningTimeInNanos(@Nullable Long value) {
			this.runningTimeInNanos = value;
			return this;
		}

		/**
		 * Whether the reindex task has been cancelled.
		 * <p>
		 * API name: {@code cancelled}
		 */
		public final Builder cancelled(@Nullable Boolean value) {
			this.cancelled = value;
			return this;
		}

		/**
		 * The status of the reindex operation at the time of cancellation.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable ReindexStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * The status of the reindex operation at the time of cancellation.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(Function<ReindexStatus.Builder, ObjectBuilder<ReindexStatus>> fn) {
			return this.status(fn.apply(new ReindexStatus.Builder()).build());
		}

		/**
		 * The error that caused the reindex task to fail, if any.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * The error that caused the reindex task to fail, if any.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * The final result of the reindex operation, if it completed before being
		 * cancelled.
		 * <p>
		 * API name: {@code response}
		 */
		public final Builder response(@Nullable ReindexTaskResult value) {
			this.response = value;
			return this;
		}

		/**
		 * The final result of the reindex operation, if it completed before being
		 * cancelled.
		 * <p>
		 * API name: {@code response}
		 */
		public final Builder response(Function<ReindexTaskResult.Builder, ObjectBuilder<ReindexTaskResult>> fn) {
			return this.response(fn.apply(new ReindexTaskResult.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CancelReindexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CancelReindexResponse build() {
			_checkSingleUse();

			return new CancelReindexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CancelReindexResponse}
	 */
	public static final JsonpDeserializer<CancelReindexResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CancelReindexResponse::setupCancelReindexResponseDeserializer);

	protected static void setupCancelReindexResponseDeserializer(ObjectDeserializer<CancelReindexResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::completed, JsonpDeserializer.booleanDeserializer(), "completed");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time");
		op.add(Builder::runningTime, Time._DESERIALIZER, "running_time");
		op.add(Builder::runningTimeInNanos, JsonpDeserializer.longDeserializer(), "running_time_in_nanos");
		op.add(Builder::cancelled, JsonpDeserializer.booleanDeserializer(), "cancelled");
		op.add(Builder::status, ReindexStatus._DESERIALIZER, "status");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::response, ReindexTaskResult._DESERIALIZER, "response");

	}

}
