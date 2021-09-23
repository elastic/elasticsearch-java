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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.Status
public final class Status implements JsonpSerializable {
	private final Boolean includeGlobalState;

	private final Map<String, SnapshotIndexStats> indices;

	private final String repository;

	private final ShardsStats shardsStats;

	private final String snapshot;

	private final String state;

	private final SnapshotStats stats;

	private final String uuid;

	// ---------------------------------------------------------------------------------------------

	public Status(Builder builder) {

		this.includeGlobalState = Objects.requireNonNull(builder.includeGlobalState, "include_global_state");
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.shardsStats = Objects.requireNonNull(builder.shardsStats, "shards_stats");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.state = Objects.requireNonNull(builder.state, "state");
		this.stats = Objects.requireNonNull(builder.stats, "stats");
		this.uuid = Objects.requireNonNull(builder.uuid, "uuid");

	}

	/**
	 * API name: {@code include_global_state}
	 */
	public Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * API name: {@code indices}
	 */
	public Map<String, SnapshotIndexStats> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code shards_stats}
	 */
	public ShardsStats shardsStats() {
		return this.shardsStats;
	}

	/**
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code state}
	 */
	public String state() {
		return this.state;
	}

	/**
	 * API name: {@code stats}
	 */
	public SnapshotStats stats() {
		return this.stats;
	}

	/**
	 * API name: {@code uuid}
	 */
	public String uuid() {
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

		generator.writeKey("indices");
		generator.writeStartObject();
		for (Map.Entry<String, SnapshotIndexStats> item0 : this.indices.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

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
	public static class Builder implements ObjectBuilder<Status> {
		private Boolean includeGlobalState;

		private Map<String, SnapshotIndexStats> indices;

		private String repository;

		private ShardsStats shardsStats;

		private String snapshot;

		private String state;

		private SnapshotStats stats;

		private String uuid;

		/**
		 * API name: {@code include_global_state}
		 */
		public Builder includeGlobalState(Boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(Map<String, SnapshotIndexStats> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, SnapshotIndexStats value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<SnapshotIndexStats.Builder, ObjectBuilder<SnapshotIndexStats>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new SnapshotIndexStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key,
				Function<SnapshotIndexStats.Builder, ObjectBuilder<SnapshotIndexStats>> fn) {
			return this.putIndices(key, fn.apply(new SnapshotIndexStats.Builder()).build());
		}

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code shards_stats}
		 */
		public Builder shardsStats(ShardsStats value) {
			this.shardsStats = value;
			return this;
		}

		/**
		 * API name: {@code shards_stats}
		 */
		public Builder shardsStats(Function<ShardsStats.Builder, ObjectBuilder<ShardsStats>> fn) {
			return this.shardsStats(fn.apply(new ShardsStats.Builder()).build());
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(String value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(SnapshotStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(Function<SnapshotStats.Builder, ObjectBuilder<SnapshotStats>> fn) {
			return this.stats(fn.apply(new SnapshotStats.Builder()).build());
		}

		/**
		 * API name: {@code uuid}
		 */
		public Builder uuid(String value) {
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

			return new Status(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Status}
	 */
	public static final JsonpDeserializer<Status> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Status::setupStatusDeserializer);

	protected static void setupStatusDeserializer(DelegatingDeserializer<Status.Builder> op) {

		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(SnapshotIndexStats.DESERIALIZER), "indices");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::shardsStats, ShardsStats.DESERIALIZER, "shards_stats");
		op.add(Builder::snapshot, JsonpDeserializer.stringDeserializer(), "snapshot");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::stats, SnapshotStats.DESERIALIZER, "stats");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");

	}

}
