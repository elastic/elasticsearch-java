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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
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

// typedef: _types.ReindexTaskInfo

/**
 * Information about a single reindex task, as returned by the reindex
 * management APIs.
 * 
 * @see <a href="../doc-files/api-spec.html#_types.ReindexTaskInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReindexTaskInfo implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String description;

	private final long startTimeInMillis;

	@Nullable
	private final String startTime;

	@Nullable
	private final Time runningTime;

	private final long runningTimeInNanos;

	private final boolean cancelled;

	@Nullable
	private final ReindexStatus status;

	// ---------------------------------------------------------------------------------------------

	private ReindexTaskInfo(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.description = builder.description;
		this.startTimeInMillis = ApiTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis", 0);
		this.startTime = builder.startTime;
		this.runningTime = builder.runningTime;
		this.runningTimeInNanos = ApiTypeHelper.requireNonNull(builder.runningTimeInNanos, this, "runningTimeInNanos",
				0);
		this.cancelled = ApiTypeHelper.requireNonNull(builder.cancelled, this, "cancelled", false);
		this.status = builder.status;

	}

	public static ReindexTaskInfo of(Function<Builder, ObjectBuilder<ReindexTaskInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the reindex task, in <code>nodeId:taskNum</code> format.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * A sanitized description of the reindex operation (source and destination
	 * indices, and optionally remote host info).
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - The time at which the reindex task started, in milliseconds since
	 * the Unix epoch.
	 * <p>
	 * API name: {@code start_time_in_millis}
	 */
	public final long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * The time at which the reindex task started, as an ISO 8601 formatted string.
	 * Only present when the request includes the <code>?human=true</code> query
	 * parameter.
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
	 * Required - The elapsed running time of the reindex task, in nanoseconds.
	 * <p>
	 * API name: {@code running_time_in_nanos}
	 */
	public final long runningTimeInNanos() {
		return this.runningTimeInNanos;
	}

	/**
	 * Required - Whether the reindex task has been cancelled.
	 * <p>
	 * API name: {@code cancelled}
	 */
	public final boolean cancelled() {
		return this.cancelled;
	}

	/**
	 * The current progress of the reindex operation.
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public final ReindexStatus status() {
		return this.status;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		if (this.startTime != null) {
			generator.writeKey("start_time");
			generator.write(this.startTime);

		}
		if (this.runningTime != null) {
			generator.writeKey("running_time");
			this.runningTime.serialize(generator, mapper);

		}
		generator.writeKey("running_time_in_nanos");
		generator.write(this.runningTimeInNanos);

		generator.writeKey("cancelled");
		generator.write(this.cancelled);

		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexTaskInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ReindexTaskInfo> {
		private String id;

		@Nullable
		private String description;

		private Long startTimeInMillis;

		@Nullable
		private String startTime;

		@Nullable
		private Time runningTime;

		private Long runningTimeInNanos;

		private Boolean cancelled;

		@Nullable
		private ReindexStatus status;

		public Builder() {
		}
		private Builder(ReindexTaskInfo instance) {
			this.id = instance.id;
			this.description = instance.description;
			this.startTimeInMillis = instance.startTimeInMillis;
			this.startTime = instance.startTime;
			this.runningTime = instance.runningTime;
			this.runningTimeInNanos = instance.runningTimeInNanos;
			this.cancelled = instance.cancelled;
			this.status = instance.status;

		}
		/**
		 * Required - The ID of the reindex task, in <code>nodeId:taskNum</code> format.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * A sanitized description of the reindex operation (source and destination
		 * indices, and optionally remote host info).
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - The time at which the reindex task started, in milliseconds since
		 * the Unix epoch.
		 * <p>
		 * API name: {@code start_time_in_millis}
		 */
		public final Builder startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * The time at which the reindex task started, as an ISO 8601 formatted string.
		 * Only present when the request includes the <code>?human=true</code> query
		 * parameter.
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
		 * Required - The elapsed running time of the reindex task, in nanoseconds.
		 * <p>
		 * API name: {@code running_time_in_nanos}
		 */
		public final Builder runningTimeInNanos(long value) {
			this.runningTimeInNanos = value;
			return this;
		}

		/**
		 * Required - Whether the reindex task has been cancelled.
		 * <p>
		 * API name: {@code cancelled}
		 */
		public final Builder cancelled(boolean value) {
			this.cancelled = value;
			return this;
		}

		/**
		 * The current progress of the reindex operation.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable ReindexStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * The current progress of the reindex operation.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(Function<ReindexStatus.Builder, ObjectBuilder<ReindexStatus>> fn) {
			return this.status(fn.apply(new ReindexStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReindexTaskInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexTaskInfo build() {
			_checkSingleUse();

			return new ReindexTaskInfo(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReindexTaskInfo}
	 */
	public static final JsonpDeserializer<ReindexTaskInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReindexTaskInfo::setupReindexTaskInfoDeserializer);

	protected static void setupReindexTaskInfoDeserializer(ObjectDeserializer<ReindexTaskInfo.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time");
		op.add(Builder::runningTime, Time._DESERIALIZER, "running_time");
		op.add(Builder::runningTimeInNanos, JsonpDeserializer.longDeserializer(), "running_time_in_nanos");
		op.add(Builder::cancelled, JsonpDeserializer.booleanDeserializer(), "cancelled");
		op.add(Builder::status, ReindexStatus._DESERIALIZER, "status");

	}

}
