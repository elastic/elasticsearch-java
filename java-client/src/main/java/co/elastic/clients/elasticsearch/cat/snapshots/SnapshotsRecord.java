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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.snapshots.SnapshotsRecord
public final class SnapshotsRecord implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final String repository;

	@Nullable
	private final String status;

	@Nullable
	private final JsonValue startEpoch;

	@Nullable
	private final String startTime;

	@Nullable
	private final JsonValue endEpoch;

	@Nullable
	private final String endTime;

	@Nullable
	private final JsonValue duration;

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

	protected SnapshotsRecord(Builder builder) {

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

	/**
	 * unique snapshot
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * repository name
	 *
	 * API name: {@code repository}
	 */
	@Nullable
	public String repository() {
		return this.repository;
	}

	/**
	 * snapshot name
	 *
	 * API name: {@code status}
	 */
	@Nullable
	public String status() {
		return this.status;
	}

	/**
	 * start time in seconds since 1970-01-01 00:00:00
	 *
	 * API name: {@code start_epoch}
	 */
	@Nullable
	public JsonValue startEpoch() {
		return this.startEpoch;
	}

	/**
	 * start time in HH:MM:SS
	 *
	 * API name: {@code start_time}
	 */
	@Nullable
	public String startTime() {
		return this.startTime;
	}

	/**
	 * end time in seconds since 1970-01-01 00:00:00
	 *
	 * API name: {@code end_epoch}
	 */
	@Nullable
	public JsonValue endEpoch() {
		return this.endEpoch;
	}

	/**
	 * end time in HH:MM:SS
	 *
	 * API name: {@code end_time}
	 */
	@Nullable
	public String endTime() {
		return this.endTime;
	}

	/**
	 * duration
	 *
	 * API name: {@code duration}
	 */
	@Nullable
	public JsonValue duration() {
		return this.duration;
	}

	/**
	 * number of indices
	 *
	 * API name: {@code indices}
	 */
	@Nullable
	public String indices() {
		return this.indices;
	}

	/**
	 * number of successful shards
	 *
	 * API name: {@code successful_shards}
	 */
	@Nullable
	public String successfulShards() {
		return this.successfulShards;
	}

	/**
	 * number of failed shards
	 *
	 * API name: {@code failed_shards}
	 */
	@Nullable
	public String failedShards() {
		return this.failedShards;
	}

	/**
	 * number of total shards
	 *
	 * API name: {@code total_shards}
	 */
	@Nullable
	public String totalShards() {
		return this.totalShards;
	}

	/**
	 * reason for failures
	 *
	 * API name: {@code reason}
	 */
	@Nullable
	public String reason() {
		return this.reason;
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
			generator.write(this.startTime);

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
			generator.write(this.duration);

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotsRecord}.
	 */
	public static class Builder implements ObjectBuilder<SnapshotsRecord> {
		@Nullable
		private String id;

		@Nullable
		private String repository;

		@Nullable
		private String status;

		@Nullable
		private JsonValue startEpoch;

		@Nullable
		private String startTime;

		@Nullable
		private JsonValue endEpoch;

		@Nullable
		private String endTime;

		@Nullable
		private JsonValue duration;

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
		 * unique snapshot
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * repository name
		 *
		 * API name: {@code repository}
		 */
		public Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * snapshot name
		 *
		 * API name: {@code status}
		 */
		public Builder status(@Nullable String value) {
			this.status = value;
			return this;
		}

		/**
		 * start time in seconds since 1970-01-01 00:00:00
		 *
		 * API name: {@code start_epoch}
		 */
		public Builder startEpoch(@Nullable JsonValue value) {
			this.startEpoch = value;
			return this;
		}

		/**
		 * start time in HH:MM:SS
		 *
		 * API name: {@code start_time}
		 */
		public Builder startTime(@Nullable String value) {
			this.startTime = value;
			return this;
		}

		/**
		 * end time in seconds since 1970-01-01 00:00:00
		 *
		 * API name: {@code end_epoch}
		 */
		public Builder endEpoch(@Nullable JsonValue value) {
			this.endEpoch = value;
			return this;
		}

		/**
		 * end time in HH:MM:SS
		 *
		 * API name: {@code end_time}
		 */
		public Builder endTime(@Nullable String value) {
			this.endTime = value;
			return this;
		}

		/**
		 * duration
		 *
		 * API name: {@code duration}
		 */
		public Builder duration(@Nullable JsonValue value) {
			this.duration = value;
			return this;
		}

		/**
		 * number of indices
		 *
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable String value) {
			this.indices = value;
			return this;
		}

		/**
		 * number of successful shards
		 *
		 * API name: {@code successful_shards}
		 */
		public Builder successfulShards(@Nullable String value) {
			this.successfulShards = value;
			return this;
		}

		/**
		 * number of failed shards
		 *
		 * API name: {@code failed_shards}
		 */
		public Builder failedShards(@Nullable String value) {
			this.failedShards = value;
			return this;
		}

		/**
		 * number of total shards
		 *
		 * API name: {@code total_shards}
		 */
		public Builder totalShards(@Nullable String value) {
			this.totalShards = value;
			return this;
		}

		/**
		 * reason for failures
		 *
		 * API name: {@code reason}
		 */
		public Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Builds a {@link SnapshotsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotsRecord build() {

			return new SnapshotsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SnapshotsRecord
	 */
	public static final JsonpDeserializer<SnapshotsRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SnapshotsRecord::setupSnapshotsRecordDeserializer);

	protected static void setupSnapshotsRecordDeserializer(DelegatingDeserializer<SnapshotsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id", "snapshot");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository", "re", "repo");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status", "s");
		op.add(Builder::startEpoch, JsonpDeserializer.jsonValueDeserializer(), "start_epoch", "ste", "startEpoch");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time", "sti", "startTime");
		op.add(Builder::endEpoch, JsonpDeserializer.jsonValueDeserializer(), "end_epoch", "ete", "endEpoch");
		op.add(Builder::endTime, JsonpDeserializer.stringDeserializer(), "end_time", "eti", "endTime");
		op.add(Builder::duration, JsonpDeserializer.jsonValueDeserializer(), "duration", "dur");
		op.add(Builder::indices, JsonpDeserializer.stringDeserializer(), "indices", "i");
		op.add(Builder::successfulShards, JsonpDeserializer.stringDeserializer(), "successful_shards", "ss");
		op.add(Builder::failedShards, JsonpDeserializer.stringDeserializer(), "failed_shards", "fs");
		op.add(Builder::totalShards, JsonpDeserializer.stringDeserializer(), "total_shards", "ts");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason", "r");

	}

}
