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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.restore.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#snapshot.restore.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class RestoreResponse implements JsonpSerializable {
	private final SnapshotRestore snapshot;

	// ---------------------------------------------------------------------------------------------

	private RestoreResponse(Builder builder) {

		this.snapshot = ApiTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");

	}

	public static RestoreResponse of(Function<Builder, ObjectBuilder<RestoreResponse>> fn) {
		return fn.apply(new Builder()).build();
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RestoreResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RestoreResponse> {
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
		public final Builder snapshot(Function<SnapshotRestore.Builder, ObjectBuilder<SnapshotRestore>> fn) {
			return this.snapshot(fn.apply(new SnapshotRestore.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
