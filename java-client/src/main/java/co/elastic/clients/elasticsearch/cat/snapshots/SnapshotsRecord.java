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

package co.elastic.clients.elasticsearch.cat.snapshots;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.watcher.ScheduleTimeOfDay;
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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.snapshots.SnapshotsRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.snapshots.SnapshotsRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotsRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String repository;

	@Nullable
	private final String status;

	@Nullable
	private final Long startEpoch;

	@Nullable
	private final ScheduleTimeOfDay startTime;

	@Nullable
	private final Long endEpoch;

	@Nullable
	private final String endTime;

	@Nullable
	private final Time duration;

	@Nullable
	private final String indices;

	@Nullable
	private final String successfulShards;

	@Nullable
	private final String failedShards;

	@Nullable
	private final String totalShards;

	@Nullable
	private final String reason;

	// ---------------------------------------------------------------------------------------------

	private SnapshotsRecord(Builder builder) {

		this.id = builder.id;
		this.repository = builder.repository;
		this.status = builder.status;
		this.startEpoch = builder.startEpoch;
		this.startTime = builder.startTime;
		this.endEpoch = builder.endEpoch;
		this.endTime = builder.endTime;
		this.duration = builder.duration;
		this.indices = builder.indices;
		this.successfulShards = builder.successfulShards;
		this.failedShards = builder.failedShards;
		this.totalShards = builder.totalShards;
		this.reason = builder.reason;

	}

	public static SnapshotsRecord of(Function<Builder, ObjectBuilder<SnapshotsRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The unique identifier for the snapshot.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The repository name.
	 * <p>
	 * API name: {@code repository}
	 */
	@Nullable
	public final String repository() {
		return this.repository;
	}

	/**
	 * The state of the snapshot process. Returned values include:
	 * <code>FAILED</code>: The snapshot process failed. <code>INCOMPATIBLE</code>:
	 * The snapshot process is incompatible with the current cluster version.
	 * <code>IN_PROGRESS</code>: The snapshot process started but has not completed.
	 * <code>PARTIAL</code>: The snapshot process completed with a partial success.
	 * <code>SUCCESS</code>: The snapshot process completed with a full success.
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public final String status() {
		return this.status;
	}

	/**
	 * The Unix epoch time (seconds since 1970-01-01 00:00:00) at which the snapshot
	 * process started.
	 * <p>
	 * API name: {@code start_epoch}
	 */
	@Nullable
	public final Long startEpoch() {
		return this.startEpoch;
	}

	/**
	 * The time (HH:MM:SS) at which the snapshot process started.
	 * <p>
	 * API name: {@code start_time}
	 */
	@Nullable
	public final ScheduleTimeOfDay startTime() {
		return this.startTime;
	}

	/**
	 * The Unix epoch time (seconds since 1970-01-01 00:00:00) at which the snapshot
	 * process ended.
	 * <p>
	 * API name: {@code end_epoch}
	 */
	@Nullable
	public final Long endEpoch() {
		return this.endEpoch;
	}

	/**
	 * The time (HH:MM:SS) at which the snapshot process ended.
	 * <p>
	 * API name: {@code end_time}
	 */
	@Nullable
	public final String endTime() {
		return this.endTime;
	}

	/**
	 * The time it took the snapshot process to complete, in time units.
	 * <p>
	 * API name: {@code duration}
	 */
	@Nullable
	public final Time duration() {
		return this.duration;
	}

	/**
	 * The number of indices in the snapshot.
	 * <p>
	 * API name: {@code indices}
	 */
	@Nullable
	public final String indices() {
		return this.indices;
	}

	/**
	 * The number of successful shards in the snapshot.
	 * <p>
	 * API name: {@code successful_shards}
	 */
	@Nullable
	public final String successfulShards() {
		return this.successfulShards;
	}

	/**
	 * The number of failed shards in the snapshot.
	 * <p>
	 * API name: {@code failed_shards}
	 */
	@Nullable
	public final String failedShards() {
		return this.failedShards;
	}

	/**
	 * The total number of shards in the snapshot.
	 * <p>
	 * API name: {@code total_shards}
	 */
	@Nullable
	public final String totalShards() {
		return this.totalShards;
	}

	/**
	 * The reason for any snapshot failures.
	 * <p>
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.repository != null) {
			generator.writeKey("repository");
			generator.write(this.repository);

		}
		if (this.status != null) {
			generator.writeKey("status");
			generator.write(this.status);

		}
		if (this.startEpoch != null) {
			generator.writeKey("start_epoch");
			generator.write(this.startEpoch);

		}
		if (this.startTime != null) {
			generator.writeKey("start_time");
			this.startTime.serialize(generator, mapper);

		}
		if (this.endEpoch != null) {
			generator.writeKey("end_epoch");
			generator.write(this.endEpoch);

		}
		if (this.endTime != null) {
			generator.writeKey("end_time");
			generator.write(this.endTime);

		}
		if (this.duration != null) {
			generator.writeKey("duration");
			this.duration.serialize(generator, mapper);

		}
		if (this.indices != null) {
			generator.writeKey("indices");
			generator.write(this.indices);

		}
		if (this.successfulShards != null) {
			generator.writeKey("successful_shards");
			generator.write(this.successfulShards);

		}
		if (this.failedShards != null) {
			generator.writeKey("failed_shards");
			generator.write(this.failedShards);

		}
		if (this.totalShards != null) {
			generator.writeKey("total_shards");
			generator.write(this.totalShards);

		}
		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotsRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SnapshotsRecord> {
		@Nullable
		private String id;

		@Nullable
		private String repository;

		@Nullable
		private String status;

		@Nullable
		private Long startEpoch;

		@Nullable
		private ScheduleTimeOfDay startTime;

		@Nullable
		private Long endEpoch;

		@Nullable
		private String endTime;

		@Nullable
		private Time duration;

		@Nullable
		private String indices;

		@Nullable
		private String successfulShards;

		@Nullable
		private String failedShards;

		@Nullable
		private String totalShards;

		@Nullable
		private String reason;

		/**
		 * The unique identifier for the snapshot.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The repository name.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * The state of the snapshot process. Returned values include:
		 * <code>FAILED</code>: The snapshot process failed. <code>INCOMPATIBLE</code>:
		 * The snapshot process is incompatible with the current cluster version.
		 * <code>IN_PROGRESS</code>: The snapshot process started but has not completed.
		 * <code>PARTIAL</code>: The snapshot process completed with a partial success.
		 * <code>SUCCESS</code>: The snapshot process completed with a full success.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable String value) {
			this.status = value;
			return this;
		}

		/**
		 * The Unix epoch time (seconds since 1970-01-01 00:00:00) at which the snapshot
		 * process started.
		 * <p>
		 * API name: {@code start_epoch}
		 */
		public final Builder startEpoch(@Nullable Long value) {
			this.startEpoch = value;
			return this;
		}

		/**
		 * The time (HH:MM:SS) at which the snapshot process started.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable ScheduleTimeOfDay value) {
			this.startTime = value;
			return this;
		}

		/**
		 * The time (HH:MM:SS) at which the snapshot process started.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(Function<ScheduleTimeOfDay.Builder, ObjectBuilder<ScheduleTimeOfDay>> fn) {
			return this.startTime(fn.apply(new ScheduleTimeOfDay.Builder()).build());
		}

		/**
		 * The Unix epoch time (seconds since 1970-01-01 00:00:00) at which the snapshot
		 * process ended.
		 * <p>
		 * API name: {@code end_epoch}
		 */
		public final Builder endEpoch(@Nullable Long value) {
			this.endEpoch = value;
			return this;
		}

		/**
		 * The time (HH:MM:SS) at which the snapshot process ended.
		 * <p>
		 * API name: {@code end_time}
		 */
		public final Builder endTime(@Nullable String value) {
			this.endTime = value;
			return this;
		}

		/**
		 * The time it took the snapshot process to complete, in time units.
		 * <p>
		 * API name: {@code duration}
		 */
		public final Builder duration(@Nullable Time value) {
			this.duration = value;
			return this;
		}

		/**
		 * The time it took the snapshot process to complete, in time units.
		 * <p>
		 * API name: {@code duration}
		 */
		public final Builder duration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.duration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The number of indices in the snapshot.
		 * <p>
		 * API name: {@code indices}
		 */
		public final Builder indices(@Nullable String value) {
			this.indices = value;
			return this;
		}

		/**
		 * The number of successful shards in the snapshot.
		 * <p>
		 * API name: {@code successful_shards}
		 */
		public final Builder successfulShards(@Nullable String value) {
			this.successfulShards = value;
			return this;
		}

		/**
		 * The number of failed shards in the snapshot.
		 * <p>
		 * API name: {@code failed_shards}
		 */
		public final Builder failedShards(@Nullable String value) {
			this.failedShards = value;
			return this;
		}

		/**
		 * The total number of shards in the snapshot.
		 * <p>
		 * API name: {@code total_shards}
		 */
		public final Builder totalShards(@Nullable String value) {
			this.totalShards = value;
			return this;
		}

		/**
		 * The reason for any snapshot failures.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotsRecord build() {
			_checkSingleUse();

			return new SnapshotsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotsRecord}
	 */
	public static final JsonpDeserializer<SnapshotsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SnapshotsRecord::setupSnapshotsRecordDeserializer);

	protected static void setupSnapshotsRecordDeserializer(ObjectDeserializer<SnapshotsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id", "snapshot");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository", "re", "repo");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status", "s");
		op.add(Builder::startEpoch, JsonpDeserializer.longDeserializer(), "start_epoch", "ste", "startEpoch");
		op.add(Builder::startTime, ScheduleTimeOfDay._DESERIALIZER, "start_time", "sti", "startTime");
		op.add(Builder::endEpoch, JsonpDeserializer.longDeserializer(), "end_epoch", "ete", "endEpoch");
		op.add(Builder::endTime, JsonpDeserializer.stringDeserializer(), "end_time", "eti", "endTime");
		op.add(Builder::duration, Time._DESERIALIZER, "duration", "dur");
		op.add(Builder::indices, JsonpDeserializer.stringDeserializer(), "indices", "i");
		op.add(Builder::successfulShards, JsonpDeserializer.stringDeserializer(), "successful_shards", "ss");
		op.add(Builder::failedShards, JsonpDeserializer.stringDeserializer(), "failed_shards", "fs");
		op.add(Builder::totalShards, JsonpDeserializer.stringDeserializer(), "total_shards", "ts");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason", "r");

	}

}
