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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: cluster.stats.SnapshotCurrentCounts

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.SnapshotCurrentCounts">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotCurrentCounts implements JsonpSerializable {
	private final int snapshots;

	private final int shardSnapshots;

	private final int snapshotDeletions;

	private final int concurrentOperations;

	private final int cleanups;

	// ---------------------------------------------------------------------------------------------

	private SnapshotCurrentCounts(Builder builder) {

		this.snapshots = ApiTypeHelper.requireNonNull(builder.snapshots, this, "snapshots", 0);
		this.shardSnapshots = ApiTypeHelper.requireNonNull(builder.shardSnapshots, this, "shardSnapshots", 0);
		this.snapshotDeletions = ApiTypeHelper.requireNonNull(builder.snapshotDeletions, this, "snapshotDeletions", 0);
		this.concurrentOperations = ApiTypeHelper.requireNonNull(builder.concurrentOperations, this,
				"concurrentOperations", 0);
		this.cleanups = ApiTypeHelper.requireNonNull(builder.cleanups, this, "cleanups", 0);

	}

	public static SnapshotCurrentCounts of(Function<Builder, ObjectBuilder<SnapshotCurrentCounts>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Snapshots currently in progress
	 * <p>
	 * API name: {@code snapshots}
	 */
	public final int snapshots() {
		return this.snapshots;
	}

	/**
	 * Required - Incomplete shard snapshots
	 * <p>
	 * API name: {@code shard_snapshots}
	 */
	public final int shardSnapshots() {
		return this.shardSnapshots;
	}

	/**
	 * Required - Snapshots deletions in progress
	 * <p>
	 * API name: {@code snapshot_deletions}
	 */
	public final int snapshotDeletions() {
		return this.snapshotDeletions;
	}

	/**
	 * Required - Sum of snapshots and snapshot_deletions
	 * <p>
	 * API name: {@code concurrent_operations}
	 */
	public final int concurrentOperations() {
		return this.concurrentOperations;
	}

	/**
	 * Required - Cleanups in progress, not counted in concurrent_operations as they
	 * are not concurrent
	 * <p>
	 * API name: {@code cleanups}
	 */
	public final int cleanups() {
		return this.cleanups;
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

		generator.writeKey("snapshots");
		generator.write(this.snapshots);

		generator.writeKey("shard_snapshots");
		generator.write(this.shardSnapshots);

		generator.writeKey("snapshot_deletions");
		generator.write(this.snapshotDeletions);

		generator.writeKey("concurrent_operations");
		generator.write(this.concurrentOperations);

		generator.writeKey("cleanups");
		generator.write(this.cleanups);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotCurrentCounts}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SnapshotCurrentCounts> {
		private Integer snapshots;

		private Integer shardSnapshots;

		private Integer snapshotDeletions;

		private Integer concurrentOperations;

		private Integer cleanups;

		public Builder() {
		}
		private Builder(SnapshotCurrentCounts instance) {
			this.snapshots = instance.snapshots;
			this.shardSnapshots = instance.shardSnapshots;
			this.snapshotDeletions = instance.snapshotDeletions;
			this.concurrentOperations = instance.concurrentOperations;
			this.cleanups = instance.cleanups;

		}
		/**
		 * Required - Snapshots currently in progress
		 * <p>
		 * API name: {@code snapshots}
		 */
		public final Builder snapshots(int value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * Required - Incomplete shard snapshots
		 * <p>
		 * API name: {@code shard_snapshots}
		 */
		public final Builder shardSnapshots(int value) {
			this.shardSnapshots = value;
			return this;
		}

		/**
		 * Required - Snapshots deletions in progress
		 * <p>
		 * API name: {@code snapshot_deletions}
		 */
		public final Builder snapshotDeletions(int value) {
			this.snapshotDeletions = value;
			return this;
		}

		/**
		 * Required - Sum of snapshots and snapshot_deletions
		 * <p>
		 * API name: {@code concurrent_operations}
		 */
		public final Builder concurrentOperations(int value) {
			this.concurrentOperations = value;
			return this;
		}

		/**
		 * Required - Cleanups in progress, not counted in concurrent_operations as they
		 * are not concurrent
		 * <p>
		 * API name: {@code cleanups}
		 */
		public final Builder cleanups(int value) {
			this.cleanups = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotCurrentCounts}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotCurrentCounts build() {
			_checkSingleUse();

			return new SnapshotCurrentCounts(this);
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
	 * Json deserializer for {@link SnapshotCurrentCounts}
	 */
	public static final JsonpDeserializer<SnapshotCurrentCounts> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotCurrentCounts::setupSnapshotCurrentCountsDeserializer);

	protected static void setupSnapshotCurrentCountsDeserializer(ObjectDeserializer<SnapshotCurrentCounts.Builder> op) {

		op.add(Builder::snapshots, JsonpDeserializer.integerDeserializer(), "snapshots");
		op.add(Builder::shardSnapshots, JsonpDeserializer.integerDeserializer(), "shard_snapshots");
		op.add(Builder::snapshotDeletions, JsonpDeserializer.integerDeserializer(), "snapshot_deletions");
		op.add(Builder::concurrentOperations, JsonpDeserializer.integerDeserializer(), "concurrent_operations");
		op.add(Builder::cleanups, JsonpDeserializer.integerDeserializer(), "cleanups");

	}

}
