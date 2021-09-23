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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: slm._types.Statistics
public final class Statistics implements JsonpSerializable {
	@Nullable
	private final String retentionDeletionTime;

	@Nullable
	private final JsonValue retentionDeletionTimeMillis;

	@Nullable
	private final Number retentionFailed;

	@Nullable
	private final Number retentionRuns;

	@Nullable
	private final Number retentionTimedOut;

	@Nullable
	private final String policy;

	@Nullable
	private final Number totalSnapshotsDeleted;

	@Nullable
	private final Number totalSnapshotDeletionFailures;

	@Nullable
	private final Number totalSnapshotsFailed;

	@Nullable
	private final Number totalSnapshotsTaken;

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
	public JsonValue retentionDeletionTimeMillis() {
		return this.retentionDeletionTimeMillis;
	}

	/**
	 * API name: {@code retention_failed}
	 */
	@Nullable
	public Number retentionFailed() {
		return this.retentionFailed;
	}

	/**
	 * API name: {@code retention_runs}
	 */
	@Nullable
	public Number retentionRuns() {
		return this.retentionRuns;
	}

	/**
	 * API name: {@code retention_timed_out}
	 */
	@Nullable
	public Number retentionTimedOut() {
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
	public Number totalSnapshotsDeleted() {
		return this.totalSnapshotsDeleted;
	}

	/**
	 * API name: {@code total_snapshot_deletion_failures}
	 */
	@Nullable
	public Number totalSnapshotDeletionFailures() {
		return this.totalSnapshotDeletionFailures;
	}

	/**
	 * API name: {@code total_snapshots_failed}
	 */
	@Nullable
	public Number totalSnapshotsFailed() {
		return this.totalSnapshotsFailed;
	}

	/**
	 * API name: {@code total_snapshots_taken}
	 */
	@Nullable
	public Number totalSnapshotsTaken() {
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
			generator.write(this.retentionFailed.doubleValue());

		}
		if (this.retentionRuns != null) {

			generator.writeKey("retention_runs");
			generator.write(this.retentionRuns.doubleValue());

		}
		if (this.retentionTimedOut != null) {

			generator.writeKey("retention_timed_out");
			generator.write(this.retentionTimedOut.doubleValue());

		}
		if (this.policy != null) {

			generator.writeKey("policy");
			generator.write(this.policy);

		}
		if (this.totalSnapshotsDeleted != null) {

			generator.writeKey("total_snapshots_deleted");
			generator.write(this.totalSnapshotsDeleted.doubleValue());

		}
		if (this.totalSnapshotDeletionFailures != null) {

			generator.writeKey("total_snapshot_deletion_failures");
			generator.write(this.totalSnapshotDeletionFailures.doubleValue());

		}
		if (this.totalSnapshotsFailed != null) {

			generator.writeKey("total_snapshots_failed");
			generator.write(this.totalSnapshotsFailed.doubleValue());

		}
		if (this.totalSnapshotsTaken != null) {

			generator.writeKey("total_snapshots_taken");
			generator.write(this.totalSnapshotsTaken.doubleValue());

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
		private JsonValue retentionDeletionTimeMillis;

		@Nullable
		private Number retentionFailed;

		@Nullable
		private Number retentionRuns;

		@Nullable
		private Number retentionTimedOut;

		@Nullable
		private String policy;

		@Nullable
		private Number totalSnapshotsDeleted;

		@Nullable
		private Number totalSnapshotDeletionFailures;

		@Nullable
		private Number totalSnapshotsFailed;

		@Nullable
		private Number totalSnapshotsTaken;

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
		public Builder retentionDeletionTimeMillis(@Nullable JsonValue value) {
			this.retentionDeletionTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code retention_failed}
		 */
		public Builder retentionFailed(@Nullable Number value) {
			this.retentionFailed = value;
			return this;
		}

		/**
		 * API name: {@code retention_runs}
		 */
		public Builder retentionRuns(@Nullable Number value) {
			this.retentionRuns = value;
			return this;
		}

		/**
		 * API name: {@code retention_timed_out}
		 */
		public Builder retentionTimedOut(@Nullable Number value) {
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
		public Builder totalSnapshotsDeleted(@Nullable Number value) {
			this.totalSnapshotsDeleted = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshot_deletion_failures}
		 */
		public Builder totalSnapshotDeletionFailures(@Nullable Number value) {
			this.totalSnapshotDeletionFailures = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_failed}
		 */
		public Builder totalSnapshotsFailed(@Nullable Number value) {
			this.totalSnapshotsFailed = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_taken}
		 */
		public Builder totalSnapshotsTaken(@Nullable Number value) {
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
	public static final JsonpDeserializer<Statistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Statistics::setupStatisticsDeserializer);

	protected static void setupStatisticsDeserializer(DelegatingDeserializer<Statistics.Builder> op) {

		op.add(Builder::retentionDeletionTime, JsonpDeserializer.stringDeserializer(), "retention_deletion_time");
		op.add(Builder::retentionDeletionTimeMillis, JsonpDeserializer.jsonValueDeserializer(),
				"retention_deletion_time_millis");
		op.add(Builder::retentionFailed, JsonpDeserializer.numberDeserializer(), "retention_failed");
		op.add(Builder::retentionRuns, JsonpDeserializer.numberDeserializer(), "retention_runs");
		op.add(Builder::retentionTimedOut, JsonpDeserializer.numberDeserializer(), "retention_timed_out");
		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");
		op.add(Builder::totalSnapshotsDeleted, JsonpDeserializer.numberDeserializer(), "total_snapshots_deleted",
				"snapshots_deleted");
		op.add(Builder::totalSnapshotDeletionFailures, JsonpDeserializer.numberDeserializer(),
				"total_snapshot_deletion_failures", "snapshot_deletion_failures");
		op.add(Builder::totalSnapshotsFailed, JsonpDeserializer.numberDeserializer(), "total_snapshots_failed",
				"snapshots_failed");
		op.add(Builder::totalSnapshotsTaken, JsonpDeserializer.numberDeserializer(), "total_snapshots_taken",
				"snapshots_taken");

	}

}
