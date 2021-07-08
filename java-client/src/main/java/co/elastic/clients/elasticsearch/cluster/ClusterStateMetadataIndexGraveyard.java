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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateMetadataIndexGraveyard
public final class ClusterStateMetadataIndexGraveyard implements ToJsonp {
	private final List<Tombstone> tombstones;

	// ---------------------------------------------------------------------------------------------

	protected ClusterStateMetadataIndexGraveyard(Builder builder) {

		this.tombstones = Objects.requireNonNull(builder.tombstones, "tombstones");

	}

	/**
	 * API name: {@code tombstones}
	 */
	public List<Tombstone> tombstones() {
		return this.tombstones;
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

		generator.writeKey("tombstones");
		generator.writeStartArray();
		for (Tombstone item0 : this.tombstones) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateMetadataIndexGraveyard}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateMetadataIndexGraveyard> {
		private List<Tombstone> tombstones;

		/**
		 * API name: {@code tombstones}
		 */
		public Builder tombstones(List<Tombstone> value) {
			this.tombstones = value;
			return this;
		}

		/**
		 * API name: {@code tombstones}
		 */
		public Builder tombstones(Tombstone... value) {
			this.tombstones = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tombstones(List)}, creating the list if needed.
		 */
		public Builder addTombstones(Tombstone value) {
			if (this.tombstones == null) {
				this.tombstones = new ArrayList<>();
			}
			this.tombstones.add(value);
			return this;
		}

		/**
		 * Set {@link #tombstones(List)} to a singleton list.
		 */
		public Builder tombstones(Function<Tombstone.Builder, ObjectBuilder<Tombstone>> fn) {
			return this.tombstones(fn.apply(new Tombstone.Builder()).build());
		}

		/**
		 * Add a value to {@link #tombstones(List)}, creating the list if needed.
		 */
		public Builder addTombstones(Function<Tombstone.Builder, ObjectBuilder<Tombstone>> fn) {
			return this.addTombstones(fn.apply(new Tombstone.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterStateMetadataIndexGraveyard}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateMetadataIndexGraveyard build() {

			return new ClusterStateMetadataIndexGraveyard(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterStateMetadataIndexGraveyard
	 */
	public static final JsonpDeserializer<ClusterStateMetadataIndexGraveyard> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ClusterStateMetadataIndexGraveyard::setupClusterStateMetadataIndexGraveyardDeserializer);

	protected static void setupClusterStateMetadataIndexGraveyardDeserializer(
			DelegatingDeserializer<ClusterStateMetadataIndexGraveyard.Builder> op) {

		op.add(Builder::tombstones, JsonpDeserializer.arrayDeserializer(Tombstone.DESERIALIZER), "tombstones");

	}

}
