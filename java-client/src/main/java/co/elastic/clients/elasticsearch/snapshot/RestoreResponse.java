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

import co.elastic.clients.elasticsearch.snapshot.restore.SnapshotRestore;
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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: snapshot.restore.Response
@JsonpDeserializable
public class RestoreResponse implements JsonpSerializable {
	private final SnapshotRestore snapshot;

	// ---------------------------------------------------------------------------------------------

	private RestoreResponse(Builder builder) {

		this.snapshot = ModelTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");

	}

	public static RestoreResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code snapshot}
	 */
	public final SnapshotRestore snapshot() {
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
	 * Builder for {@link RestoreResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RestoreResponse> {
		private SnapshotRestore snapshot;

		/**
		 * Required - API name: {@code snapshot}
		 */
		public final Builder snapshot(SnapshotRestore value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshot}
		 */
		public final Builder snapshot(Consumer<SnapshotRestore.Builder> fn) {
			SnapshotRestore.Builder builder = new SnapshotRestore.Builder();
			fn.accept(builder);
			return this.snapshot(builder.build());
		}

		/**
		 * Builds a {@link RestoreResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RestoreResponse build() {
			_checkSingleUse();

			return new RestoreResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RestoreResponse}
	 */
	public static final JsonpDeserializer<RestoreResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RestoreResponse::setupRestoreResponseDeserializer);

	protected static void setupRestoreResponseDeserializer(ObjectDeserializer<RestoreResponse.Builder> op) {

		op.add(Builder::snapshot, SnapshotRestore._DESERIALIZER, "snapshot");

	}

}
