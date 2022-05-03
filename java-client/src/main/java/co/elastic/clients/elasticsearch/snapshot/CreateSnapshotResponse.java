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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.create.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#snapshot.create.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateSnapshotResponse implements JsonpSerializable {
	@Nullable
	private final Boolean accepted;

	@Nullable
	private final SnapshotInfo snapshot;

	// ---------------------------------------------------------------------------------------------

	private CreateSnapshotResponse(Builder builder) {

		this.accepted = builder.accepted;
		this.snapshot = builder.snapshot;

	}

	public static CreateSnapshotResponse of(Function<Builder, ObjectBuilder<CreateSnapshotResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Equals <code>true</code> if the snapshot was accepted. Present when the
	 * request had <code>wait_for_completion</code> set to <code>false</code>
	 * <p>
	 * API name: {@code accepted}
	 */
	@Nullable
	public final Boolean accepted() {
		return this.accepted;
	}

	/**
	 * Snapshot information. Present when the request had
	 * <code>wait_for_completion</code> set to <code>true</code>
	 * <p>
	 * API name: {@code snapshot}
	 */
	@Nullable
	public final SnapshotInfo snapshot() {
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

		if (this.accepted != null) {
			generator.writeKey("accepted");
			generator.write(this.accepted);

		}
		if (this.snapshot != null) {
			generator.writeKey("snapshot");
			this.snapshot.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateSnapshotResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CreateSnapshotResponse> {
		@Nullable
		private Boolean accepted;

		@Nullable
		private SnapshotInfo snapshot;

		/**
		 * Equals <code>true</code> if the snapshot was accepted. Present when the
		 * request had <code>wait_for_completion</code> set to <code>false</code>
		 * <p>
		 * API name: {@code accepted}
		 */
		public final Builder accepted(@Nullable Boolean value) {
			this.accepted = value;
			return this;
		}

		/**
		 * Snapshot information. Present when the request had
		 * <code>wait_for_completion</code> set to <code>true</code>
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(@Nullable SnapshotInfo value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Snapshot information. Present when the request had
		 * <code>wait_for_completion</code> set to <code>true</code>
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn) {
			return this.snapshot(fn.apply(new SnapshotInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateSnapshotResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateSnapshotResponse build() {
			_checkSingleUse();

			return new CreateSnapshotResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateSnapshotResponse}
	 */
	public static final JsonpDeserializer<CreateSnapshotResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateSnapshotResponse::setupCreateSnapshotResponseDeserializer);

	protected static void setupCreateSnapshotResponseDeserializer(
			ObjectDeserializer<CreateSnapshotResponse.Builder> op) {

		op.add(Builder::accepted, JsonpDeserializer.booleanDeserializer(), "accepted");
		op.add(Builder::snapshot, SnapshotInfo._DESERIALIZER, "snapshot");

	}

}
