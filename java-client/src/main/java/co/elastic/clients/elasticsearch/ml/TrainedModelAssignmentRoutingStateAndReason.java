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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml._types.TrainedModelAssignmentRoutingStateAndReason

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelAssignmentRoutingStateAndReason">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelAssignmentRoutingStateAndReason implements JsonpSerializable {
	@Nullable
	private final String reason;

	private final RoutingState routingState;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelAssignmentRoutingStateAndReason(Builder builder) {

		this.reason = builder.reason;
		this.routingState = ApiTypeHelper.requireNonNull(builder.routingState, this, "routingState");

	}

	public static TrainedModelAssignmentRoutingStateAndReason of(
			Function<Builder, ObjectBuilder<TrainedModelAssignmentRoutingStateAndReason>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The reason for the current state. It is usually populated only when the
	 * <code>routing_state</code> is <code>failed</code>.
	 * <p>
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - The current routing state.
	 * <p>
	 * API name: {@code routing_state}
	 */
	public final RoutingState routingState() {
		return this.routingState;
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

		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}
		generator.writeKey("routing_state");
		this.routingState.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelAssignmentRoutingStateAndReason}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelAssignmentRoutingStateAndReason> {
		@Nullable
		private String reason;

		private RoutingState routingState;

		/**
		 * The reason for the current state. It is usually populated only when the
		 * <code>routing_state</code> is <code>failed</code>.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - The current routing state.
		 * <p>
		 * API name: {@code routing_state}
		 */
		public final Builder routingState(RoutingState value) {
			this.routingState = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelAssignmentRoutingStateAndReason}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelAssignmentRoutingStateAndReason build() {
			_checkSingleUse();

			return new TrainedModelAssignmentRoutingStateAndReason(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelAssignmentRoutingStateAndReason}
	 */
	public static final JsonpDeserializer<TrainedModelAssignmentRoutingStateAndReason> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					TrainedModelAssignmentRoutingStateAndReason::setupTrainedModelAssignmentRoutingStateAndReasonDeserializer);

	protected static void setupTrainedModelAssignmentRoutingStateAndReasonDeserializer(
			ObjectDeserializer<TrainedModelAssignmentRoutingStateAndReason.Builder> op) {

		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::routingState, RoutingState._DESERIALIZER, "routing_state");

	}

}
