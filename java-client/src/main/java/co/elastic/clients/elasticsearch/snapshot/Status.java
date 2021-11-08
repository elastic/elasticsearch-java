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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.Status
@JsonpDeserializable
public class Status implements JsonpSerializable {
	private final boolean includeGlobalState;

	private final Map<String, SnapshotIndexStats> indices;

	private final String repository;

	private final ShardsStats shardsStats;

	private final String snapshot;

	private final String state;

	private final SnapshotStats stats;

	private final String uuid;

	// ---------------------------------------------------------------------------------------------

	private Status(Builder builder) {

		this.includeGlobalState = ModelTypeHelper.requireNonNull(builder.includeGlobalState, this,
				"includeGlobalState");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.repository = ModelTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.shardsStats = ModelTypeHelper.requireNonNull(builder.shardsStats, this, "shardsStats");
		this.snapshot = ModelTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");
		this.stats = ModelTypeHelper.requireNonNull(builder.stats, this, "stats");
		this.uuid = ModelTypeHelper.requireNonNull(builder.uuid, this, "uuid");

	}

	public static Status of(Function<Builder, ObjectBuilder<Status>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code include_global_state}
	 */
	public final boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final Map<String, SnapshotIndexStats> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - API name: {@code shards_stats}
	 */
	public final ShardsStats shardsStats() {
		return this.shardsStats;
	}

	/**
	 * Required - API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final String state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final SnapshotStats stats() {
		return this.stats;
	}

	/**
	 * Required - API name: {@code uuid}
	 */
	public final String uuid() {
		return this.uuid;
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

		generator.writeKey("include_global_state");
		generator.write(this.includeGlobalState);

		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, SnapshotIndexStats> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("repository");
		generator.write(this.repository);

		generator.writeKey("shards_stats");
		this.shardsStats.serialize(generator, mapper);

		generator.writeKey("snapshot");
		generator.write(this.snapshot);

		generator.writeKey("state");
		generator.write(this.state);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

		generator.writeKey("uuid");
		generator.write(this.uuid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Status}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Status> {
		private Boolean includeGlobalState;

		private Map<String, SnapshotIndexStats> indices;

		private String repository;

		private ShardsStats shardsStats;

		private String snapshot;

		private String state;

		private SnapshotStats stats;

		private String uuid;

		/**
		 * Required - API name: {@code include_global_state}
		 */
		public final Builder includeGlobalState(boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(Map<String, SnapshotIndexStats> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<SnapshotIndexStats.Builder, ObjectBuilder<SnapshotIndexStats>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new SnapshotIndexStats.Builder()).build()));
		}

		public final Builder indices(
				Function<MapBuilder<String, SnapshotIndexStats, SnapshotIndexStats.Builder>, ObjectBuilder<Map<String, SnapshotIndexStats>>> fn) {
			return indices(fn.apply(new MapBuilder<>(SnapshotIndexStats.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards_stats}
		 */
		public final Builder shardsStats(ShardsStats value) {
			this.shardsStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards_stats}
		 */
		public final Builder shardsStats(Function<ShardsStats.Builder, ObjectBuilder<ShardsStats>> fn) {
			return this.shardsStats(fn.apply(new ShardsStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(String value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(SnapshotStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<SnapshotStats.Builder, ObjectBuilder<SnapshotStats>> fn) {
			return this.stats(fn.apply(new SnapshotStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code uuid}
		 */
		public final Builder uuid(String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * Builds a {@link Status}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Status build() {
			_checkSingleUse();

			return new Status(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Status}
	 */
	public static final JsonpDeserializer<Status> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Status::setupStatusDeserializer, Builder::build);

	protected static void setupStatusDeserializer(DelegatingDeserializer<Status.Builder> op) {

		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(SnapshotIndexStats._DESERIALIZER), "indices");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::shardsStats, ShardsStats._DESERIALIZER, "shards_stats");
		op.add(Builder::snapshot, JsonpDeserializer.stringDeserializer(), "snapshot");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::stats, SnapshotStats._DESERIALIZER, "stats");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");

	}

}
