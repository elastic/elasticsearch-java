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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: slm._types.Statistics
@JsonpDeserializable
public final class Statistics implements JsonpSerializable {
	@Nullable
	private final String retentionDeletionTime;

	@Nullable
	private final String retentionDeletionTimeMillis;

	@Nullable
	private final Long retentionFailed;

	@Nullable
	private final Long retentionRuns;

	@Nullable
	private final Long retentionTimedOut;

	@Nullable
	private final String policy;

	@Nullable
	private final Long totalSnapshotsDeleted;

	@Nullable
	private final Long totalSnapshotDeletionFailures;

	@Nullable
	private final Long totalSnapshotsFailed;

	@Nullable
	private final Long totalSnapshotsTaken;

	// ---------------------------------------------------------------------------------------------

	public Statistics(Builder builder) {

		this.retentionDeletionTime = builder.retentionDeletionTime;
		this.retentionDeletionTimeMillis = builder.retentionDeletionTimeMillis;
		this.retentionFailed = builder.retentionFailed;
		this.retentionRuns = builder.retentionRuns;
		this.retentionTimedOut = builder.retentionTimedOut;
		this.policy = builder.policy;
		this.totalSnapshotsDeleted = builder.totalSnapshotsDeleted;
		this.totalSnapshotDeletionFailures = builder.totalSnapshotDeletionFailures;
		this.totalSnapshotsFailed = builder.totalSnapshotsFailed;
		this.totalSnapshotsTaken = builder.totalSnapshotsTaken;

	}

	/**
	 * API name: {@code retention_deletion_time}
	 */
	@Nullable
	public String retentionDeletionTime() {
		return this.retentionDeletionTime;
	}

	/**
	 * API name: {@code retention_deletion_time_millis}
	 */
	@Nullable
	public String retentionDeletionTimeMillis() {
		return this.retentionDeletionTimeMillis;
	}

	/**
	 * API name: {@code retention_failed}
	 */
	@Nullable
	public Long retentionFailed() {
		return this.retentionFailed;
	}

	/**
	 * API name: {@code retention_runs}
	 */
	@Nullable
	public Long retentionRuns() {
		return this.retentionRuns;
	}

	/**
	 * API name: {@code retention_timed_out}
	 */
	@Nullable
	public Long retentionTimedOut() {
		return this.retentionTimedOut;
	}

	/**
	 * API name: {@code policy}
	 */
	@Nullable
	public String policy() {
		return this.policy;
	}

	/**
	 * API name: {@code total_snapshots_deleted}
	 */
	@Nullable
	public Long totalSnapshotsDeleted() {
		return this.totalSnapshotsDeleted;
	}

	/**
	 * API name: {@code total_snapshot_deletion_failures}
	 */
	@Nullable
	public Long totalSnapshotDeletionFailures() {
		return this.totalSnapshotDeletionFailures;
	}

	/**
	 * API name: {@code total_snapshots_failed}
	 */
	@Nullable
	public Long totalSnapshotsFailed() {
		return this.totalSnapshotsFailed;
	}

	/**
	 * API name: {@code total_snapshots_taken}
	 */
	@Nullable
	public Long totalSnapshotsTaken() {
		return this.totalSnapshotsTaken;
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

		if (this.retentionDeletionTime != null) {

			generator.writeKey("retention_deletion_time");
			generator.write(this.retentionDeletionTime);

		}
		if (this.retentionDeletionTimeMillis != null) {

			generator.writeKey("retention_deletion_time_millis");
			generator.write(this.retentionDeletionTimeMillis);

		}
		if (this.retentionFailed != null) {

			generator.writeKey("retention_failed");
			generator.write(this.retentionFailed);

		}
		if (this.retentionRuns != null) {

			generator.writeKey("retention_runs");
			generator.write(this.retentionRuns);

		}
		if (this.retentionTimedOut != null) {

			generator.writeKey("retention_timed_out");
			generator.write(this.retentionTimedOut);

		}
		if (this.policy != null) {

			generator.writeKey("policy");
			generator.write(this.policy);

		}
		if (this.totalSnapshotsDeleted != null) {

			generator.writeKey("total_snapshots_deleted");
			generator.write(this.totalSnapshotsDeleted);

		}
		if (this.totalSnapshotDeletionFailures != null) {

			generator.writeKey("total_snapshot_deletion_failures");
			generator.write(this.totalSnapshotDeletionFailures);

		}
		if (this.totalSnapshotsFailed != null) {

			generator.writeKey("total_snapshots_failed");
			generator.write(this.totalSnapshotsFailed);

		}
		if (this.totalSnapshotsTaken != null) {

			generator.writeKey("total_snapshots_taken");
			generator.write(this.totalSnapshotsTaken);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Statistics}.
	 */
	public static class Builder implements ObjectBuilder<Statistics> {
		@Nullable
		private String retentionDeletionTime;

		@Nullable
		private String retentionDeletionTimeMillis;

		@Nullable
		private Long retentionFailed;

		@Nullable
		private Long retentionRuns;

		@Nullable
		private Long retentionTimedOut;

		@Nullable
		private String policy;

		@Nullable
		private Long totalSnapshotsDeleted;

		@Nullable
		private Long totalSnapshotDeletionFailures;

		@Nullable
		private Long totalSnapshotsFailed;

		@Nullable
		private Long totalSnapshotsTaken;

		/**
		 * API name: {@code retention_deletion_time}
		 */
		public Builder retentionDeletionTime(@Nullable String value) {
			this.retentionDeletionTime = value;
			return this;
		}

		/**
		 * API name: {@code retention_deletion_time_millis}
		 */
		public Builder retentionDeletionTimeMillis(@Nullable String value) {
			this.retentionDeletionTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code retention_failed}
		 */
		public Builder retentionFailed(@Nullable Long value) {
			this.retentionFailed = value;
			return this;
		}

		/**
		 * API name: {@code retention_runs}
		 */
		public Builder retentionRuns(@Nullable Long value) {
			this.retentionRuns = value;
			return this;
		}

		/**
		 * API name: {@code retention_timed_out}
		 */
		public Builder retentionTimedOut(@Nullable Long value) {
			this.retentionTimedOut = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(@Nullable String value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_deleted}
		 */
		public Builder totalSnapshotsDeleted(@Nullable Long value) {
			this.totalSnapshotsDeleted = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshot_deletion_failures}
		 */
		public Builder totalSnapshotDeletionFailures(@Nullable Long value) {
			this.totalSnapshotDeletionFailures = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_failed}
		 */
		public Builder totalSnapshotsFailed(@Nullable Long value) {
			this.totalSnapshotsFailed = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_taken}
		 */
		public Builder totalSnapshotsTaken(@Nullable Long value) {
			this.totalSnapshotsTaken = value;
			return this;
		}

		/**
		 * Builds a {@link Statistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Statistics build() {

			return new Statistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Statistics}
	 */
	public static final JsonpDeserializer<Statistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Statistics::setupStatisticsDeserializer, Builder::build);

	protected static void setupStatisticsDeserializer(DelegatingDeserializer<Statistics.Builder> op) {

		op.add(Builder::retentionDeletionTime, JsonpDeserializer.stringDeserializer(), "retention_deletion_time");
		op.add(Builder::retentionDeletionTimeMillis, JsonpDeserializer.stringDeserializer(),
				"retention_deletion_time_millis");
		op.add(Builder::retentionFailed, JsonpDeserializer.longDeserializer(), "retention_failed");
		op.add(Builder::retentionRuns, JsonpDeserializer.longDeserializer(), "retention_runs");
		op.add(Builder::retentionTimedOut, JsonpDeserializer.longDeserializer(), "retention_timed_out");
		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");
		op.add(Builder::totalSnapshotsDeleted, JsonpDeserializer.longDeserializer(), "total_snapshots_deleted",
				"snapshots_deleted");
		op.add(Builder::totalSnapshotDeletionFailures, JsonpDeserializer.longDeserializer(),
				"total_snapshot_deletion_failures", "snapshot_deletion_failures");
		op.add(Builder::totalSnapshotsFailed, JsonpDeserializer.longDeserializer(), "total_snapshots_failed",
				"snapshots_failed");
		op.add(Builder::totalSnapshotsTaken, JsonpDeserializer.longDeserializer(), "total_snapshots_taken",
				"snapshots_taken");

	}

}
