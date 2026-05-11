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

// typedef: slm._types.SnapshotPolicyStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm._types.SnapshotPolicyStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotPolicyStats implements JsonpSerializable {
	private final String policy;

	private final long snapshotsTaken;

	private final long snapshotsFailed;

	private final long snapshotsDeleted;

	private final long snapshotDeletionFailures;

	// ---------------------------------------------------------------------------------------------

	private SnapshotPolicyStats(Builder builder) {

		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.snapshotsTaken = ApiTypeHelper.requireNonNull(builder.snapshotsTaken, this, "snapshotsTaken", 0);
		this.snapshotsFailed = ApiTypeHelper.requireNonNull(builder.snapshotsFailed, this, "snapshotsFailed", 0);
		this.snapshotsDeleted = ApiTypeHelper.requireNonNull(builder.snapshotsDeleted, this, "snapshotsDeleted", 0);
		this.snapshotDeletionFailures = ApiTypeHelper.requireNonNull(builder.snapshotDeletionFailures, this,
				"snapshotDeletionFailures", 0);

	}

	public static SnapshotPolicyStats of(Function<Builder, ObjectBuilder<SnapshotPolicyStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final String policy() {
		return this.policy;
	}

	/**
	 * Required - API name: {@code snapshots_taken}
	 */
	public final long snapshotsTaken() {
		return this.snapshotsTaken;
	}

	/**
	 * Required - API name: {@code snapshots_failed}
	 */
	public final long snapshotsFailed() {
		return this.snapshotsFailed;
	}

	/**
	 * Required - API name: {@code snapshots_deleted}
	 */
	public final long snapshotsDeleted() {
		return this.snapshotsDeleted;
	}

	/**
	 * Required - API name: {@code snapshot_deletion_failures}
	 */
	public final long snapshotDeletionFailures() {
		return this.snapshotDeletionFailures;
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

		generator.writeKey("policy");
		generator.write(this.policy);

		generator.writeKey("snapshots_taken");
		generator.write(this.snapshotsTaken);

		generator.writeKey("snapshots_failed");
		generator.write(this.snapshotsFailed);

		generator.writeKey("snapshots_deleted");
		generator.write(this.snapshotsDeleted);

		generator.writeKey("snapshot_deletion_failures");
		generator.write(this.snapshotDeletionFailures);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotPolicyStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SnapshotPolicyStats> {
		private String policy;

		private Long snapshotsTaken;

		private Long snapshotsFailed;

		private Long snapshotsDeleted;

		private Long snapshotDeletionFailures;

		public Builder() {
		}
		private Builder(SnapshotPolicyStats instance) {
			this.policy = instance.policy;
			this.snapshotsTaken = instance.snapshotsTaken;
			this.snapshotsFailed = instance.snapshotsFailed;
			this.snapshotsDeleted = instance.snapshotsDeleted;
			this.snapshotDeletionFailures = instance.snapshotDeletionFailures;

		}
		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(String value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshots_taken}
		 */
		public final Builder snapshotsTaken(long value) {
			this.snapshotsTaken = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshots_failed}
		 */
		public final Builder snapshotsFailed(long value) {
			this.snapshotsFailed = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshots_deleted}
		 */
		public final Builder snapshotsDeleted(long value) {
			this.snapshotsDeleted = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshot_deletion_failures}
		 */
		public final Builder snapshotDeletionFailures(long value) {
			this.snapshotDeletionFailures = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotPolicyStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotPolicyStats build() {
			_checkSingleUse();

			return new SnapshotPolicyStats(this);
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
	 * Json deserializer for {@link SnapshotPolicyStats}
	 */
	public static final JsonpDeserializer<SnapshotPolicyStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotPolicyStats::setupSnapshotPolicyStatsDeserializer);

	protected static void setupSnapshotPolicyStatsDeserializer(ObjectDeserializer<SnapshotPolicyStats.Builder> op) {

		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");
		op.add(Builder::snapshotsTaken, JsonpDeserializer.longDeserializer(), "snapshots_taken");
		op.add(Builder::snapshotsFailed, JsonpDeserializer.longDeserializer(), "snapshots_failed");
		op.add(Builder::snapshotsDeleted, JsonpDeserializer.longDeserializer(), "snapshots_deleted");
		op.add(Builder::snapshotDeletionFailures, JsonpDeserializer.longDeserializer(), "snapshot_deletion_failures");

	}

}
