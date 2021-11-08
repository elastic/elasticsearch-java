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

package co.elastic.clients.elasticsearch.searchable_snapshots.mount;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.mount.MountedSnapshot
@JsonpDeserializable
public class MountedSnapshot implements JsonpSerializable {
	private final String snapshot;

	private final List<String> indices;

	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	private MountedSnapshot(Builder builder) {

		this.snapshot = ModelTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static MountedSnapshot of(Function<Builder, ObjectBuilder<MountedSnapshot>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final ShardStatistics shards() {
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

		generator.writeKey("snapshot");
		generator.write(this.snapshot);

		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("shards");
		this.shards.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MountedSnapshot}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MountedSnapshot> {
		private String snapshot;

		private List<String> indices;

		private ShardStatistics shards;

		/**
		 * Required - API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Builds a {@link MountedSnapshot}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MountedSnapshot build() {
			_checkSingleUse();

			return new MountedSnapshot(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MountedSnapshot}
	 */
	public static final JsonpDeserializer<MountedSnapshot> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MountedSnapshot::setupMountedSnapshotDeserializer, Builder::build);

	protected static void setupMountedSnapshotDeserializer(DelegatingDeserializer<MountedSnapshot.Builder> op) {

		op.add(Builder::snapshot, JsonpDeserializer.stringDeserializer(), "snapshot");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "shards");

	}

}
