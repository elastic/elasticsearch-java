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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelAssignmentRoutingTable

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelAssignmentRoutingTable">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelAssignmentRoutingTable implements JsonpSerializable {
	private final String reason;

	private final RoutingState routingState;

	private final int currentAllocations;

	private final int targetAllocations;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelAssignmentRoutingTable(Builder builder) {

		this.reason = ApiTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.routingState = ApiTypeHelper.requireNonNull(builder.routingState, this, "routingState");
		this.currentAllocations = ApiTypeHelper.requireNonNull(builder.currentAllocations, this, "currentAllocations");
		this.targetAllocations = ApiTypeHelper.requireNonNull(builder.targetAllocations, this, "targetAllocations");

	}

	public static TrainedModelAssignmentRoutingTable of(
			Function<Builder, ObjectBuilder<TrainedModelAssignmentRoutingTable>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The reason for the current state. It is usually populated only
	 * when the <code>routing_state</code> is <code>failed</code>.
	 * <p>
	 * API name: {@code reason}
	 */
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
	 * Required - Current number of allocations.
	 * <p>
	 * API name: {@code current_allocations}
	 */
	public final int currentAllocations() {
		return this.currentAllocations;
	}

	/**
	 * Required - Target number of allocations.
	 * <p>
	 * API name: {@code target_allocations}
	 */
	public final int targetAllocations() {
		return this.targetAllocations;
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

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("routing_state");
		this.routingState.serialize(generator, mapper);
		generator.writeKey("current_allocations");
		generator.write(this.currentAllocations);

		generator.writeKey("target_allocations");
		generator.write(this.targetAllocations);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelAssignmentRoutingTable}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelAssignmentRoutingTable> {
		private String reason;

		private RoutingState routingState;

		private Integer currentAllocations;

		private Integer targetAllocations;

		/**
		 * Required - The reason for the current state. It is usually populated only
		 * when the <code>routing_state</code> is <code>failed</code>.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(String value) {
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

		/**
		 * Required - Current number of allocations.
		 * <p>
		 * API name: {@code current_allocations}
		 */
		public final Builder currentAllocations(int value) {
			this.currentAllocations = value;
			return this;
		}

		/**
		 * Required - Target number of allocations.
		 * <p>
		 * API name: {@code target_allocations}
		 */
		public final Builder targetAllocations(int value) {
			this.targetAllocations = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelAssignmentRoutingTable}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelAssignmentRoutingTable build() {
			_checkSingleUse();

			return new TrainedModelAssignmentRoutingTable(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelAssignmentRoutingTable}
	 */
	public static final JsonpDeserializer<TrainedModelAssignmentRoutingTable> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					TrainedModelAssignmentRoutingTable::setupTrainedModelAssignmentRoutingTableDeserializer);

	protected static void setupTrainedModelAssignmentRoutingTableDeserializer(
			ObjectDeserializer<TrainedModelAssignmentRoutingTable.Builder> op) {

		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::routingState, RoutingState._DESERIALIZER, "routing_state");
		op.add(Builder::currentAllocations, JsonpDeserializer.integerDeserializer(), "current_allocations");
		op.add(Builder::targetAllocations, JsonpDeserializer.integerDeserializer(), "target_allocations");

	}

}
