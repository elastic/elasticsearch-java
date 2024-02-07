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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: slm.get_stats.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm.get_stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetStatsResponse implements JsonpSerializable {
	private final Time retentionDeletionTime;

	private final long retentionDeletionTimeMillis;

	private final long retentionFailed;

	private final long retentionRuns;

	private final long retentionTimedOut;

	private final long totalSnapshotsDeleted;

	private final long totalSnapshotDeletionFailures;

	private final long totalSnapshotsFailed;

	private final long totalSnapshotsTaken;

	private final List<String> policyStats;

	// ---------------------------------------------------------------------------------------------

	private GetStatsResponse(Builder builder) {

		this.retentionDeletionTime = ApiTypeHelper.requireNonNull(builder.retentionDeletionTime, this,
				"retentionDeletionTime");
		this.retentionDeletionTimeMillis = ApiTypeHelper.requireNonNull(builder.retentionDeletionTimeMillis, this,
				"retentionDeletionTimeMillis");
		this.retentionFailed = ApiTypeHelper.requireNonNull(builder.retentionFailed, this, "retentionFailed");
		this.retentionRuns = ApiTypeHelper.requireNonNull(builder.retentionRuns, this, "retentionRuns");
		this.retentionTimedOut = ApiTypeHelper.requireNonNull(builder.retentionTimedOut, this, "retentionTimedOut");
		this.totalSnapshotsDeleted = ApiTypeHelper.requireNonNull(builder.totalSnapshotsDeleted, this,
				"totalSnapshotsDeleted");
		this.totalSnapshotDeletionFailures = ApiTypeHelper.requireNonNull(builder.totalSnapshotDeletionFailures, this,
				"totalSnapshotDeletionFailures");
		this.totalSnapshotsFailed = ApiTypeHelper.requireNonNull(builder.totalSnapshotsFailed, this,
				"totalSnapshotsFailed");
		this.totalSnapshotsTaken = ApiTypeHelper.requireNonNull(builder.totalSnapshotsTaken, this,
				"totalSnapshotsTaken");
		this.policyStats = ApiTypeHelper.unmodifiableRequired(builder.policyStats, this, "policyStats");

	}

	public static GetStatsResponse of(Function<Builder, ObjectBuilder<GetStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code retention_deletion_time}
	 */
	public final Time retentionDeletionTime() {
		return this.retentionDeletionTime;
	}

	/**
	 * Required - API name: {@code retention_deletion_time_millis}
	 */
	public final long retentionDeletionTimeMillis() {
		return this.retentionDeletionTimeMillis;
	}

	/**
	 * Required - API name: {@code retention_failed}
	 */
	public final long retentionFailed() {
		return this.retentionFailed;
	}

	/**
	 * Required - API name: {@code retention_runs}
	 */
	public final long retentionRuns() {
		return this.retentionRuns;
	}

	/**
	 * Required - API name: {@code retention_timed_out}
	 */
	public final long retentionTimedOut() {
		return this.retentionTimedOut;
	}

	/**
	 * Required - API name: {@code total_snapshots_deleted}
	 */
	public final long totalSnapshotsDeleted() {
		return this.totalSnapshotsDeleted;
	}

	/**
	 * Required - API name: {@code total_snapshot_deletion_failures}
	 */
	public final long totalSnapshotDeletionFailures() {
		return this.totalSnapshotDeletionFailures;
	}

	/**
	 * Required - API name: {@code total_snapshots_failed}
	 */
	public final long totalSnapshotsFailed() {
		return this.totalSnapshotsFailed;
	}

	/**
	 * Required - API name: {@code total_snapshots_taken}
	 */
	public final long totalSnapshotsTaken() {
		return this.totalSnapshotsTaken;
	}

	/**
	 * Required - API name: {@code policy_stats}
	 */
	public final List<String> policyStats() {
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
		this.retentionDeletionTime.serialize(generator, mapper);

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

		if (ApiTypeHelper.isDefined(this.policyStats)) {
			generator.writeKey("policy_stats");
			generator.writeStartArray();
			for (String item0 : this.policyStats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetStatsResponse> {
		private Time retentionDeletionTime;

		private Long retentionDeletionTimeMillis;

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
		public final Builder retentionDeletionTime(Time value) {
			this.retentionDeletionTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_deletion_time}
		 */
		public final Builder retentionDeletionTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.retentionDeletionTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code retention_deletion_time_millis}
		 */
		public final Builder retentionDeletionTimeMillis(long value) {
			this.retentionDeletionTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_failed}
		 */
		public final Builder retentionFailed(long value) {
			this.retentionFailed = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_runs}
		 */
		public final Builder retentionRuns(long value) {
			this.retentionRuns = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_timed_out}
		 */
		public final Builder retentionTimedOut(long value) {
			this.retentionTimedOut = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshots_deleted}
		 */
		public final Builder totalSnapshotsDeleted(long value) {
			this.totalSnapshotsDeleted = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshot_deletion_failures}
		 */
		public final Builder totalSnapshotDeletionFailures(long value) {
			this.totalSnapshotDeletionFailures = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshots_failed}
		 */
		public final Builder totalSnapshotsFailed(long value) {
			this.totalSnapshotsFailed = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_snapshots_taken}
		 */
		public final Builder totalSnapshotsTaken(long value) {
			this.totalSnapshotsTaken = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>policyStats</code>.
		 */
		public final Builder policyStats(List<String> list) {
			this.policyStats = _listAddAll(this.policyStats, list);
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 * <p>
		 * Adds one or more values to <code>policyStats</code>.
		 */
		public final Builder policyStats(String value, String... values) {
			this.policyStats = _listAdd(this.policyStats, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetStatsResponse build() {
			_checkSingleUse();

			return new GetStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetStatsResponse}
	 */
	public static final JsonpDeserializer<GetStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetStatsResponse::setupGetStatsResponseDeserializer);

	protected static void setupGetStatsResponseDeserializer(ObjectDeserializer<GetStatsResponse.Builder> op) {

		op.add(Builder::retentionDeletionTime, Time._DESERIALIZER, "retention_deletion_time");
		op.add(Builder::retentionDeletionTimeMillis, JsonpDeserializer.longDeserializer(),
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
