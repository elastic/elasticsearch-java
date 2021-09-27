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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.elasticsearch.searchable_snapshots.mount.MountedSnapshot;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.mount.Response
@JsonpDeserializable
public final class MountResponse implements JsonpSerializable {
	private final MountedSnapshot snapshot;

	// ---------------------------------------------------------------------------------------------

	public MountResponse(Builder builder) {

		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");

	}

	/**
	 * API name: {@code snapshot}
	 */
	public MountedSnapshot snapshot() {
		return this.snapshot;
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
		this.snapshot.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MountResponse}.
	 */
	public static class Builder implements ObjectBuilder<MountResponse> {
		private MountedSnapshot snapshot;

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(MountedSnapshot value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(Function<MountedSnapshot.Builder, ObjectBuilder<MountedSnapshot>> fn) {
			return this.snapshot(fn.apply(new MountedSnapshot.Builder()).build());
		}

		/**
		 * Builds a {@link MountResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MountResponse build() {

			return new MountResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MountResponse}
	 */
	public static final JsonpDeserializer<MountResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MountResponse::setupMountResponseDeserializer, Builder::build);

	protected static void setupMountResponseDeserializer(DelegatingDeserializer<MountResponse.Builder> op) {

		op.add(Builder::snapshot, MountedSnapshot._DESERIALIZER, "snapshot");

	}

}
