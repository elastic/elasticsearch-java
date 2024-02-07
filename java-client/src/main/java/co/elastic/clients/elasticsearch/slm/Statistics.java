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

package co.elastic.clients.elasticsearch.slm;

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

// typedef: slm._types.Statistics

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm._types.Statistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class Statistics implements JsonpSerializable {
	@Nullable
	private final Time retentionDeletionTime;

	@Nullable
	private final Long retentionDeletionTimeMillis;

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

	private Statistics(Builder builder) {

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

	public static Statistics of(Function<Builder, ObjectBuilder<Statistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code retention_deletion_time}
	 */
	@Nullable
	public final Time retentionDeletionTime() {
		return this.retentionDeletionTime;
	}

	/**
	 * API name: {@code retention_deletion_time_millis}
	 */
	@Nullable
	public final Long retentionDeletionTimeMillis() {
		return this.retentionDeletionTimeMillis;
	}

	/**
	 * API name: {@code retention_failed}
	 */
	@Nullable
	public final Long retentionFailed() {
		return this.retentionFailed;
	}

	/**
	 * API name: {@code retention_runs}
	 */
	@Nullable
	public final Long retentionRuns() {
		return this.retentionRuns;
	}

	/**
	 * API name: {@code retention_timed_out}
	 */
	@Nullable
	public final Long retentionTimedOut() {
		return this.retentionTimedOut;
	}

	/**
	 * API name: {@code policy}
	 */
	@Nullable
	public final String policy() {
		return this.policy;
	}

	/**
	 * API name: {@code total_snapshots_deleted}
	 */
	@Nullable
	public final Long totalSnapshotsDeleted() {
		return this.totalSnapshotsDeleted;
	}

	/**
	 * API name: {@code total_snapshot_deletion_failures}
	 */
	@Nullable
	public final Long totalSnapshotDeletionFailures() {
		return this.totalSnapshotDeletionFailures;
	}

	/**
	 * API name: {@code total_snapshots_failed}
	 */
	@Nullable
	public final Long totalSnapshotsFailed() {
		return this.totalSnapshotsFailed;
	}

	/**
	 * API name: {@code total_snapshots_taken}
	 */
	@Nullable
	public final Long totalSnapshotsTaken() {
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
			this.retentionDeletionTime.serialize(generator, mapper);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Statistics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Statistics> {
		@Nullable
		private Time retentionDeletionTime;

		@Nullable
		private Long retentionDeletionTimeMillis;

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
		public final Builder retentionDeletionTime(@Nullable Time value) {
			this.retentionDeletionTime = value;
			return this;
		}

		/**
		 * API name: {@code retention_deletion_time}
		 */
		public final Builder retentionDeletionTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.retentionDeletionTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code retention_deletion_time_millis}
		 */
		public final Builder retentionDeletionTimeMillis(@Nullable Long value) {
			this.retentionDeletionTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code retention_failed}
		 */
		public final Builder retentionFailed(@Nullable Long value) {
			this.retentionFailed = value;
			return this;
		}

		/**
		 * API name: {@code retention_runs}
		 */
		public final Builder retentionRuns(@Nullable Long value) {
			this.retentionRuns = value;
			return this;
		}

		/**
		 * API name: {@code retention_timed_out}
		 */
		public final Builder retentionTimedOut(@Nullable Long value) {
			this.retentionTimedOut = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public final Builder policy(@Nullable String value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_deleted}
		 */
		public final Builder totalSnapshotsDeleted(@Nullable Long value) {
			this.totalSnapshotsDeleted = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshot_deletion_failures}
		 */
		public final Builder totalSnapshotDeletionFailures(@Nullable Long value) {
			this.totalSnapshotDeletionFailures = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_failed}
		 */
		public final Builder totalSnapshotsFailed(@Nullable Long value) {
			this.totalSnapshotsFailed = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_taken}
		 */
		public final Builder totalSnapshotsTaken(@Nullable Long value) {
			this.totalSnapshotsTaken = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Statistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Statistics build() {
			_checkSingleUse();

			return new Statistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Statistics}
	 */
	public static final JsonpDeserializer<Statistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Statistics::setupStatisticsDeserializer);

	protected static void setupStatisticsDeserializer(ObjectDeserializer<Statistics.Builder> op) {

		op.add(Builder::retentionDeletionTime, Time._DESERIALIZER, "retention_deletion_time");
		op.add(Builder::retentionDeletionTimeMillis, JsonpDeserializer.longDeserializer(),
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
