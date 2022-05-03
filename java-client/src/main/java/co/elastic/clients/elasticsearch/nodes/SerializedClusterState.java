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

package co.elastic.clients.elasticsearch.nodes;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.SerializedClusterState

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.SerializedClusterState">API
 *      specification</a>
 */
@JsonpDeserializable
public class SerializedClusterState implements JsonpSerializable {
	@Nullable
	private final SerializedClusterStateDetail fullStates;

	@Nullable
	private final SerializedClusterStateDetail diffs;

	// ---------------------------------------------------------------------------------------------

	private SerializedClusterState(Builder builder) {

		this.fullStates = builder.fullStates;
		this.diffs = builder.diffs;

	}

	public static SerializedClusterState of(Function<Builder, ObjectBuilder<SerializedClusterState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code full_states}
	 */
	@Nullable
	public final SerializedClusterStateDetail fullStates() {
		return this.fullStates;
	}

	/**
	 * API name: {@code diffs}
	 */
	@Nullable
	public final SerializedClusterStateDetail diffs() {
		return this.diffs;
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

		if (this.fullStates != null) {
			generator.writeKey("full_states");
			this.fullStates.serialize(generator, mapper);

		}
		if (this.diffs != null) {
			generator.writeKey("diffs");
			this.diffs.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SerializedClusterState}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SerializedClusterState> {
		@Nullable
		private SerializedClusterStateDetail fullStates;

		@Nullable
		private SerializedClusterStateDetail diffs;

		/**
		 * API name: {@code full_states}
		 */
		public final Builder fullStates(@Nullable SerializedClusterStateDetail value) {
			this.fullStates = value;
			return this;
		}

		/**
		 * API name: {@code full_states}
		 */
		public final Builder fullStates(
				Function<SerializedClusterStateDetail.Builder, ObjectBuilder<SerializedClusterStateDetail>> fn) {
			return this.fullStates(fn.apply(new SerializedClusterStateDetail.Builder()).build());
		}

		/**
		 * API name: {@code diffs}
		 */
		public final Builder diffs(@Nullable SerializedClusterStateDetail value) {
			this.diffs = value;
			return this;
		}

		/**
		 * API name: {@code diffs}
		 */
		public final Builder diffs(
				Function<SerializedClusterStateDetail.Builder, ObjectBuilder<SerializedClusterStateDetail>> fn) {
			return this.diffs(fn.apply(new SerializedClusterStateDetail.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SerializedClusterState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SerializedClusterState build() {
			_checkSingleUse();

			return new SerializedClusterState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SerializedClusterState}
	 */
	public static final JsonpDeserializer<SerializedClusterState> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SerializedClusterState::setupSerializedClusterStateDeserializer);

	protected static void setupSerializedClusterStateDeserializer(
			ObjectDeserializer<SerializedClusterState.Builder> op) {

		op.add(Builder::fullStates, SerializedClusterStateDetail._DESERIALIZER, "full_states");
		op.add(Builder::diffs, SerializedClusterStateDetail._DESERIALIZER, "diffs");

	}

}
