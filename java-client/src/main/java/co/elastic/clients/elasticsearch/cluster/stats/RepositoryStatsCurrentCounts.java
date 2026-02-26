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

// typedef: cluster.stats.RepositoryStatsCurrentCounts

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.RepositoryStatsCurrentCounts">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositoryStatsCurrentCounts implements JsonpSerializable {
	private final int snapshots;

	private final int clones;

	private final int finalizations;

	private final int deletions;

	private final int snapshotDeletions;

	private final int activeDeletions;

	private final RepositoryStatsShards shards;

	// ---------------------------------------------------------------------------------------------

	private RepositoryStatsCurrentCounts(Builder builder) {

		this.snapshots = ApiTypeHelper.requireNonNull(builder.snapshots, this, "snapshots", 0);
		this.clones = ApiTypeHelper.requireNonNull(builder.clones, this, "clones", 0);
		this.finalizations = ApiTypeHelper.requireNonNull(builder.finalizations, this, "finalizations", 0);
		this.deletions = ApiTypeHelper.requireNonNull(builder.deletions, this, "deletions", 0);
		this.snapshotDeletions = ApiTypeHelper.requireNonNull(builder.snapshotDeletions, this, "snapshotDeletions", 0);
		this.activeDeletions = ApiTypeHelper.requireNonNull(builder.activeDeletions, this, "activeDeletions", 0);
		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static RepositoryStatsCurrentCounts of(Function<Builder, ObjectBuilder<RepositoryStatsCurrentCounts>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code snapshots}
	 */
	public final int snapshots() {
		return this.snapshots;
	}

	/**
	 * Required - API name: {@code clones}
	 */
	public final int clones() {
		return this.clones;
	}

	/**
	 * Required - API name: {@code finalizations}
	 */
	public final int finalizations() {
		return this.finalizations;
	}

	/**
	 * Required - API name: {@code deletions}
	 */
	public final int deletions() {
		return this.deletions;
	}

	/**
	 * Required - API name: {@code snapshot_deletions}
	 */
	public final int snapshotDeletions() {
		return this.snapshotDeletions;
	}

	/**
	 * Required - API name: {@code active_deletions}
	 */
	public final int activeDeletions() {
		return this.activeDeletions;
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final RepositoryStatsShards shards() {
		return this.shards;
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

		generator.writeKey("clones");
		generator.write(this.clones);

		generator.writeKey("finalizations");
		generator.write(this.finalizations);

		generator.writeKey("deletions");
		generator.write(this.deletions);

		generator.writeKey("snapshot_deletions");
		generator.write(this.snapshotDeletions);

		generator.writeKey("active_deletions");
		generator.write(this.activeDeletions);

		generator.writeKey("shards");
		this.shards.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoryStatsCurrentCounts}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositoryStatsCurrentCounts> {
		private Integer snapshots;

		private Integer clones;

		private Integer finalizations;

		private Integer deletions;

		private Integer snapshotDeletions;

		private Integer activeDeletions;

		private RepositoryStatsShards shards;

		public Builder() {
		}
		private Builder(RepositoryStatsCurrentCounts instance) {
			this.snapshots = instance.snapshots;
			this.clones = instance.clones;
			this.finalizations = instance.finalizations;
			this.deletions = instance.deletions;
			this.snapshotDeletions = instance.snapshotDeletions;
			this.activeDeletions = instance.activeDeletions;
			this.shards = instance.shards;

		}
		/**
		 * Required - API name: {@code snapshots}
		 */
		public final Builder snapshots(int value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * Required - API name: {@code clones}
		 */
		public final Builder clones(int value) {
			this.clones = value;
			return this;
		}

		/**
		 * Required - API name: {@code finalizations}
		 */
		public final Builder finalizations(int value) {
			this.finalizations = value;
			return this;
		}

		/**
		 * Required - API name: {@code deletions}
		 */
		public final Builder deletions(int value) {
			this.deletions = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshot_deletions}
		 */
		public final Builder snapshotDeletions(int value) {
			this.snapshotDeletions = value;
			return this;
		}

		/**
		 * Required - API name: {@code active_deletions}
		 */
		public final Builder activeDeletions(int value) {
			this.activeDeletions = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(RepositoryStatsShards value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(Function<RepositoryStatsShards.Builder, ObjectBuilder<RepositoryStatsShards>> fn) {
			return this.shards(fn.apply(new RepositoryStatsShards.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryStatsCurrentCounts}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryStatsCurrentCounts build() {
			_checkSingleUse();

			return new RepositoryStatsCurrentCounts(this);
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
	 * Json deserializer for {@link RepositoryStatsCurrentCounts}
	 */
	public static final JsonpDeserializer<RepositoryStatsCurrentCounts> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositoryStatsCurrentCounts::setupRepositoryStatsCurrentCountsDeserializer);

	protected static void setupRepositoryStatsCurrentCountsDeserializer(
			ObjectDeserializer<RepositoryStatsCurrentCounts.Builder> op) {

		op.add(Builder::snapshots, JsonpDeserializer.integerDeserializer(), "snapshots");
		op.add(Builder::clones, JsonpDeserializer.integerDeserializer(), "clones");
		op.add(Builder::finalizations, JsonpDeserializer.integerDeserializer(), "finalizations");
		op.add(Builder::deletions, JsonpDeserializer.integerDeserializer(), "deletions");
		op.add(Builder::snapshotDeletions, JsonpDeserializer.integerDeserializer(), "snapshot_deletions");
		op.add(Builder::activeDeletions, JsonpDeserializer.integerDeserializer(), "active_deletions");
		op.add(Builder::shards, RepositoryStatsShards._DESERIALIZER, "shards");

	}

}
