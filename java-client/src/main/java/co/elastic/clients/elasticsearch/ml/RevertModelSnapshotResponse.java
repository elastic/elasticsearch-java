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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml.revert_model_snapshot.Response
@JsonpDeserializable
public final class RevertModelSnapshotResponse implements JsonpSerializable {
	private final ModelSnapshot model;

	// ---------------------------------------------------------------------------------------------

	public RevertModelSnapshotResponse(Builder builder) {

		this.model = Objects.requireNonNull(builder.model, "model");

	}

	public RevertModelSnapshotResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code model}
	 */
	public ModelSnapshot model() {
		return this.model;
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

		generator.writeKey("model");
		this.model.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RevertModelSnapshotResponse}.
	 */
	public static class Builder implements ObjectBuilder<RevertModelSnapshotResponse> {
		private ModelSnapshot model;

		/**
		 * API name: {@code model}
		 */
		public Builder model(ModelSnapshot value) {
			this.model = value;
			return this;
		}

		/**
		 * API name: {@code model}
		 */
		public Builder model(Function<ModelSnapshot.Builder, ObjectBuilder<ModelSnapshot>> fn) {
			return this.model(fn.apply(new ModelSnapshot.Builder()).build());
		}

		/**
		 * Builds a {@link RevertModelSnapshotResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RevertModelSnapshotResponse build() {

			return new RevertModelSnapshotResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RevertModelSnapshotResponse}
	 */
	public static final JsonpDeserializer<RevertModelSnapshotResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, RevertModelSnapshotResponse::setupRevertModelSnapshotResponseDeserializer, Builder::build);

	protected static void setupRevertModelSnapshotResponseDeserializer(
			DelegatingDeserializer<RevertModelSnapshotResponse.Builder> op) {

		op.add(Builder::model, ModelSnapshot._DESERIALIZER, "model");

	}

}
