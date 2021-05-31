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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: slm.get_stats.Response
public final class GetStatsResponse implements ToJsonp {
	private final String retentionDeletionTime;

	private final JsonValue retentionDeletionTimeMillis;

	private final Number retentionFailed;

	private final Number retentionRuns;

	private final Number retentionTimedOut;

	private final Number totalSnapshotsDeleted;

	private final Number totalSnapshotDeletionFailures;

	private final Number totalSnapshotsFailed;

	private final Number totalSnapshotsTaken;

	private final List<String> policyStats;

	// ---------------------------------------------------------------------------------------------

	protected GetStatsResponse(Builder builder) {

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
		this.policyStats = Objects.requireNonNull(builder.policyStats, "policy_stats");

	}

	/**
	 * API name: {@code retention_deletion_time}
	 */
	public String retentionDeletionTime() {
		return this.retentionDeletionTime;
	}

	/**
	 * API name: {@code retention_deletion_time_millis}
	 */
	public JsonValue retentionDeletionTimeMillis() {
		return this.retentionDeletionTimeMillis;
	}

	/**
	 * API name: {@code retention_failed}
	 */
	public Number retentionFailed() {
		return this.retentionFailed;
	}

	/**
	 * API name: {@code retention_runs}
	 */
	public Number retentionRuns() {
		return this.retentionRuns;
	}

	/**
	 * API name: {@code retention_timed_out}
	 */
	public Number retentionTimedOut() {
		return this.retentionTimedOut;
	}

	/**
	 * API name: {@code total_snapshots_deleted}
	 */
	public Number totalSnapshotsDeleted() {
		return this.totalSnapshotsDeleted;
	}

	/**
	 * API name: {@code total_snapshot_deletion_failures}
	 */
	public Number totalSnapshotDeletionFailures() {
		return this.totalSnapshotDeletionFailures;
	}

	/**
	 * API name: {@code total_snapshots_failed}
	 */
	public Number totalSnapshotsFailed() {
		return this.totalSnapshotsFailed;
	}

	/**
	 * API name: {@code total_snapshots_taken}
	 */
	public Number totalSnapshotsTaken() {
		return this.totalSnapshotsTaken;
	}

	/**
	 * API name: {@code policy_stats}
	 */
	public List<String> policyStats() {
		return this.policyStats;
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

		generator.writeKey("retention_deletion_time");
		generator.write(this.retentionDeletionTime);

		generator.writeKey("retention_deletion_time_millis");
		generator.write(this.retentionDeletionTimeMillis);

		generator.writeKey("retention_failed");
		generator.write(this.retentionFailed.doubleValue());

		generator.writeKey("retention_runs");
		generator.write(this.retentionRuns.doubleValue());

		generator.writeKey("retention_timed_out");
		generator.write(this.retentionTimedOut.doubleValue());

		generator.writeKey("total_snapshots_deleted");
		generator.write(this.totalSnapshotsDeleted.doubleValue());

		generator.writeKey("total_snapshot_deletion_failures");
		generator.write(this.totalSnapshotDeletionFailures.doubleValue());

		generator.writeKey("total_snapshots_failed");
		generator.write(this.totalSnapshotsFailed.doubleValue());

		generator.writeKey("total_snapshots_taken");
		generator.write(this.totalSnapshotsTaken.doubleValue());

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

		private JsonValue retentionDeletionTimeMillis;

		private Number retentionFailed;

		private Number retentionRuns;

		private Number retentionTimedOut;

		private Number totalSnapshotsDeleted;

		private Number totalSnapshotDeletionFailures;

		private Number totalSnapshotsFailed;

		private Number totalSnapshotsTaken;

		private List<String> policyStats;

		/**
		 * API name: {@code retention_deletion_time}
		 */
		public Builder retentionDeletionTime(String value) {
			this.retentionDeletionTime = value;
			return this;
		}

		/**
		 * API name: {@code retention_deletion_time_millis}
		 */
		public Builder retentionDeletionTimeMillis(JsonValue value) {
			this.retentionDeletionTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code retention_failed}
		 */
		public Builder retentionFailed(Number value) {
			this.retentionFailed = value;
			return this;
		}

		/**
		 * API name: {@code retention_runs}
		 */
		public Builder retentionRuns(Number value) {
			this.retentionRuns = value;
			return this;
		}

		/**
		 * API name: {@code retention_timed_out}
		 */
		public Builder retentionTimedOut(Number value) {
			this.retentionTimedOut = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_deleted}
		 */
		public Builder totalSnapshotsDeleted(Number value) {
			this.totalSnapshotsDeleted = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshot_deletion_failures}
		 */
		public Builder totalSnapshotDeletionFailures(Number value) {
			this.totalSnapshotDeletionFailures = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_failed}
		 */
		public Builder totalSnapshotsFailed(Number value) {
			this.totalSnapshotsFailed = value;
			return this;
		}

		/**
		 * API name: {@code total_snapshots_taken}
		 */
		public Builder totalSnapshotsTaken(Number value) {
			this.totalSnapshotsTaken = value;
			return this;
		}

		/**
		 * API name: {@code policy_stats}
		 */
		public Builder policyStats(List<String> value) {
			this.policyStats = value;
			return this;
		}

		/**
		 * API name: {@code policy_stats}
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
	 * Json parser for GetStatsResponse
	 */
	public static final JsonpValueParser<GetStatsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetStatsResponse::setupGetStatsResponseParser);

	protected static void setupGetStatsResponseParser(DelegatingJsonpValueParser<GetStatsResponse.Builder> op) {

		op.add(Builder::retentionDeletionTime, JsonpValueParser.stringParser(), "retention_deletion_time");
		op.add(Builder::retentionDeletionTimeMillis, JsonpValueParser.jsonValueParser(),
				"retention_deletion_time_millis");
		op.add(Builder::retentionFailed, JsonpValueParser.numberParser(), "retention_failed");
		op.add(Builder::retentionRuns, JsonpValueParser.numberParser(), "retention_runs");
		op.add(Builder::retentionTimedOut, JsonpValueParser.numberParser(), "retention_timed_out");
		op.add(Builder::totalSnapshotsDeleted, JsonpValueParser.numberParser(), "total_snapshots_deleted");
		op.add(Builder::totalSnapshotDeletionFailures, JsonpValueParser.numberParser(),
				"total_snapshot_deletion_failures");
		op.add(Builder::totalSnapshotsFailed, JsonpValueParser.numberParser(), "total_snapshots_failed");
		op.add(Builder::totalSnapshotsTaken, JsonpValueParser.numberParser(), "total_snapshots_taken");
		op.add(Builder::policyStats, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "policy_stats");

	}

}
