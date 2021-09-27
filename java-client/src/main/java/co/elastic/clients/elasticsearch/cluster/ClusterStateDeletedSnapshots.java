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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateDeletedSnapshots
@JsonpDeserializable
public final class ClusterStateDeletedSnapshots implements JsonpSerializable {
	private final List<String> snapshotDeletions;

	// ---------------------------------------------------------------------------------------------

	public ClusterStateDeletedSnapshots(Builder builder) {

		this.snapshotDeletions = Objects.requireNonNull(builder.snapshotDeletions, "snapshot_deletions");

	}

	/**
	 * API name: {@code snapshot_deletions}
	 */
	public List<String> snapshotDeletions() {
		return this.snapshotDeletions;
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

		generator.writeKey("snapshot_deletions");
		generator.writeStartArray();
		for (String item0 : this.snapshotDeletions) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateDeletedSnapshots}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateDeletedSnapshots> {
		private List<String> snapshotDeletions;

		/**
		 * API name: {@code snapshot_deletions}
		 */
		public Builder snapshotDeletions(List<String> value) {
			this.snapshotDeletions = value;
			return this;
		}

		/**
		 * API name: {@code snapshot_deletions}
		 */
		public Builder snapshotDeletions(String... value) {
			this.snapshotDeletions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #snapshotDeletions(List)}, creating the list if needed.
		 */
		public Builder addSnapshotDeletions(String value) {
			if (this.snapshotDeletions == null) {
				this.snapshotDeletions = new ArrayList<>();
			}
			this.snapshotDeletions.add(value);
			return this;
		}

		/**
		 * Builds a {@link ClusterStateDeletedSnapshots}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateDeletedSnapshots build() {

			return new ClusterStateDeletedSnapshots(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateDeletedSnapshots}
	 */
	public static final JsonpDeserializer<ClusterStateDeletedSnapshots> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, ClusterStateDeletedSnapshots::setupClusterStateDeletedSnapshotsDeserializer, Builder::build);

	protected static void setupClusterStateDeletedSnapshotsDeserializer(
			DelegatingDeserializer<ClusterStateDeletedSnapshots.Builder> op) {

		op.add(Builder::snapshotDeletions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"snapshot_deletions");

	}

}
