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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm.get_stats.Response
@JsonpDeserializable
public final class GetStatsResponse implements JsonpSerializable {
	private final String retentionDeletionTime;

	private final String retentionDeletionTimeMillis;

	private final long retentionFailed;

	private final long retentionRuns;

	private final long retentionTimedOut;

	private final long totalSnapshotsDeleted;

	private final long totalSnapshotDeletionFailures;

	private final long totalSnapshotsFailed;

	private final long totalSnapshotsTaken;

	private final List<String> policyStats;

	// ---------------------------------------------------------------------------------------------

	public GetStatsResponse(Builder builder) {

		this.retentionDeletionTime = Objects.requireNonNull(builder.retentionDeletionTime, "retention_deletion_time");
		this.retentionDeletionTimeMillis = Objects.requireNonNull(builder.retentionDeletionTimeMillis,
				"retention_deletion_time_millis");
		this.retentionFailed = Objects.requireNonNull(builder.retentionFailed, "retention_failed");
		this.retentionRuns = Objects.requireNonNull(builder.retentionRuns, "retention_runs");
		this.retentionTimedOut = Objects.requireNonNull(builder.retentionTimedOut, "retention_timed_out");
		this.totalSnapshotsDeleted = Objects.requireNonNull(builder.totalSnapshotsDeleted, "total_snapshots_deleted");
		this.totalSnapshotDeletionFailures = Objects.requireNonNull(builder.totalSnapshotDeletionFailures,
				"total_snapshot_deletion_failures");
		this.totalSnapshotsFailed = Objects.requireNonNull(builder.totalSnapshotsFailed, "total_snapshots_failed");
		this.totalSnapshotsTaken = Objects.requireNonNull(builder.totalSnapshotsTaken, "total_snapshots_taken");
		this.policyStats = ModelTypeHelper.unmodifiableNonNull(builder.policyStats, "policy_stats");

	}

	public GetStatsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code retention_deletion_time}
	 */
	public String retentionDeletionTime() {
		return this.retentionDeletionTime;
	}

	/**
	 * Required - API name: {@code retention_deletion_time_millis}
	 */
	public String retentionDeletionTimeMillis() {
		return this.retentionDeletionTimeMillis;
	}

	/**
	 * Required - API name: {@code retention_failed}
	 */
	public long retentionFailed() {
		return this.retentionFailed;
	}

	/**
	 * Required - API name: {@code retention_runs}
	 */
	public long retentionRuns() {
		return this.retentionRuns;
	}

	/**
	 * Required - API name: {@code retention_timed_out}
	 */
	public long retentionTimedOut() {
		return this.retentionTimedOut;
	}

	/**
	 * Required - API name: {@code total_snapshots_deleted}
	 */
	public long totalSnapshotsDeleted() {
		return this.totalSnapshotsDeleted;
	}

	/**
	 * Required - API name: {@code total_snapshot_deletion_failures}
	 */
	public long totalSnapshotDeletionFailures() {
		return this.totalSnapshotDeletionFailures;
	}

	/**
	 * Required - API name: {@code total_snapshots_failed}
	 */
	public long totalSnapshotsFailed() {
		return this.totalSnapshotsFailed;
	}

	/**
	 * Required - API name: {@code total_snapshots_taken}
	 */
	public long totalSnapshotsTaken() {
		return this.totalSnapshotsTaken;
	}

	/**
	 * Required - API name: {@code policy_stats}
	 */
	public List<String> policyStats() {
		return this.policyStats;
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

		generator.writeKey("retention_deletion_time");
		generator.write(this.retentionDeletionTime);

		generator.writeKey("retention_deletion_time_millis");
		generator.write(this.retentionDeletionTimeMillis);

		generator.writeKey("retention_failed");
		generator.write(this.retentionFailed);

		generator.writeKey("retention_runs");
		generator.write(this.retentionRuns);

		generator.writeKey("retention_timed_out");
		generator.write(this.retentionTimedOut);

		generator.writeKey("total_snapshots_deleted");
		generator.write(this.totalSnapshotsDeleted);

		generator.writeKey("total_snapshot_deletion_failures");
		generator.write(this.totalSnapshotDeletionFailures);

		generator.writeKey("total_snapshots_failed");
		generator.write(this.totalSnapshotsFailed);

		generator.writeKey("total_snapshots_taken");
		generator.write(this.totalSnapshotsTaken);

		generator.writeKey("policy_stats");
		generator.writeStartArray();
		for (String item0 : this.policyStats) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetStatsResponse> {
		private String retentionDeletionTime;

		private String retentionDeletionTimeMillis;

		private Long retentionFailed;

		private Long retentionRuns;

		private Long retentionTimedOut;

		private Long totalSnapshotsDeleted;

		private Long totalSnapshotDeletionFailures;

		private Long totalSnapshotsFailed;

		private Long totalSnapshotsTaken;

		private List<String> policyStats;

		/**
		 * Required - API name: {@code retention_deletion_time}
		 */
		public Builder retentionDeletionTime(String value) {
			this.retentionDeletionTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_deletion_time_millis}
		 */
		public Builder retentionDeletionTimeMillis(String value) {
			this.retentionDeletionTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_failed}
		 */
		public Builder retentionFailed(long value) {
			this.retentionFailed = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_runs}
		 */
		public Builder retentionRuns(long value) {
			this.retentionRuns = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_timed_out}
		 */
		public Builder retentionTimedOut(long value) {
			this.retentionTimedOut = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshots_deleted}
		 */
		public Builder totalSnapshotsDeleted(long value) {
			this.totalSnapshotsDeleted = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshot_deletion_failures}
		 */
		public Builder totalSnapshotDeletionFailures(long value) {
			this.totalSnapshotDeletionFailures = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshots_failed}
		 */
		public Builder totalSnapshotsFailed(long value) {
			this.totalSnapshotsFailed = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshots_taken}
		 */
		public Builder totalSnapshotsTaken(long value) {
			this.totalSnapshotsTaken = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 */
		public Builder policyStats(List<String> value) {
			this.policyStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 */
		public Builder policyStats(String... value) {
			this.policyStats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #policyStats(List)}, creating the list if needed.
		 */
		public Builder addPolicyStats(String value) {
			if (this.policyStats == null) {
				this.policyStats = new ArrayList<>();
			}
			this.policyStats.add(value);
			return this;
		}

		/**
		 * Builds a {@link GetStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetStatsResponse build() {

			return new GetStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetStatsResponse}
	 */
	public static final JsonpDeserializer<GetStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetStatsResponse::setupGetStatsResponseDeserializer, Builder::build);

	protected static void setupGetStatsResponseDeserializer(DelegatingDeserializer<GetStatsResponse.Builder> op) {

		op.add(Builder::retentionDeletionTime, JsonpDeserializer.stringDeserializer(), "retention_deletion_time");
		op.add(Builder::retentionDeletionTimeMillis, JsonpDeserializer.stringDeserializer(),
				"retention_deletion_time_millis");
		op.add(Builder::retentionFailed, JsonpDeserializer.longDeserializer(), "retention_failed");
		op.add(Builder::retentionRuns, JsonpDeserializer.longDeserializer(), "retention_runs");
		op.add(Builder::retentionTimedOut, JsonpDeserializer.longDeserializer(), "retention_timed_out");
		op.add(Builder::totalSnapshotsDeleted, JsonpDeserializer.longDeserializer(), "total_snapshots_deleted");
		op.add(Builder::totalSnapshotDeletionFailures, JsonpDeserializer.longDeserializer(),
				"total_snapshot_deletion_failures");
		op.add(Builder::totalSnapshotsFailed, JsonpDeserializer.longDeserializer(), "total_snapshots_failed");
		op.add(Builder::totalSnapshotsTaken, JsonpDeserializer.longDeserializer(), "total_snapshots_taken");
		op.add(Builder::policyStats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"policy_stats");

	}

}
