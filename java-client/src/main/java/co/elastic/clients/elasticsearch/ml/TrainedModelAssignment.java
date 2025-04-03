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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
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

// typedef: ml._types.TrainedModelAssignment

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelAssignment">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelAssignment implements JsonpSerializable {
	@Nullable
	private final AdaptiveAllocationsSettings adaptiveAllocations;

	private final DeploymentAssignmentState assignmentState;

	@Nullable
	private final Integer maxAssignedAllocations;

	@Nullable
	private final String reason;

	private final Map<String, TrainedModelAssignmentRoutingTable> routingTable;

	private final DateTime startTime;

	private final TrainedModelAssignmentTaskParameters taskParameters;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelAssignment(Builder builder) {

		this.adaptiveAllocations = builder.adaptiveAllocations;
		this.assignmentState = ApiTypeHelper.requireNonNull(builder.assignmentState, this, "assignmentState");
		this.maxAssignedAllocations = builder.maxAssignedAllocations;
		this.reason = builder.reason;
		this.routingTable = ApiTypeHelper.unmodifiableRequired(builder.routingTable, this, "routingTable");
		this.startTime = ApiTypeHelper.requireNonNull(builder.startTime, this, "startTime");
		this.taskParameters = ApiTypeHelper.requireNonNull(builder.taskParameters, this, "taskParameters");

	}

	public static TrainedModelAssignment of(Function<Builder, ObjectBuilder<TrainedModelAssignment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code adaptive_allocations}
	 */
	@Nullable
	public final AdaptiveAllocationsSettings adaptiveAllocations() {
		return this.adaptiveAllocations;
	}

	/**
	 * Required - The overall assignment state.
	 * <p>
	 * API name: {@code assignment_state}
	 */
	public final DeploymentAssignmentState assignmentState() {
		return this.assignmentState;
	}

	/**
	 * API name: {@code max_assigned_allocations}
	 */
	@Nullable
	public final Integer maxAssignedAllocations() {
		return this.maxAssignedAllocations;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - The allocation state for each node.
	 * <p>
	 * API name: {@code routing_table}
	 */
	public final Map<String, TrainedModelAssignmentRoutingTable> routingTable() {
		return this.routingTable;
	}

	/**
	 * Required - The timestamp when the deployment started.
	 * <p>
	 * API name: {@code start_time}
	 */
	public final DateTime startTime() {
		return this.startTime;
	}

	/**
	 * Required - API name: {@code task_parameters}
	 */
	public final TrainedModelAssignmentTaskParameters taskParameters() {
		return this.taskParameters;
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

		if (this.adaptiveAllocations != null) {
			generator.writeKey("adaptive_allocations");
			this.adaptiveAllocations.serialize(generator, mapper);

		}
		generator.writeKey("assignment_state");
		this.assignmentState.serialize(generator, mapper);
		if (this.maxAssignedAllocations != null) {
			generator.writeKey("max_assigned_allocations");
			generator.write(this.maxAssignedAllocations);

		}
		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}
		if (ApiTypeHelper.isDefined(this.routingTable)) {
			generator.writeKey("routing_table");
			generator.writeStartObject();
			for (Map.Entry<String, TrainedModelAssignmentRoutingTable> item0 : this.routingTable.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("start_time");
		this.startTime.serialize(generator, mapper);
		generator.writeKey("task_parameters");
		this.taskParameters.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelAssignment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelAssignment> {
		@Nullable
		private AdaptiveAllocationsSettings adaptiveAllocations;

		private DeploymentAssignmentState assignmentState;

		@Nullable
		private Integer maxAssignedAllocations;

		@Nullable
		private String reason;

		private Map<String, TrainedModelAssignmentRoutingTable> routingTable;

		private DateTime startTime;

		private TrainedModelAssignmentTaskParameters taskParameters;

		/**
		 * API name: {@code adaptive_allocations}
		 */
		public final Builder adaptiveAllocations(@Nullable AdaptiveAllocationsSettings value) {
			this.adaptiveAllocations = value;
			return this;
		}

		/**
		 * API name: {@code adaptive_allocations}
		 */
		public final Builder adaptiveAllocations(
				Function<AdaptiveAllocationsSettings.Builder, ObjectBuilder<AdaptiveAllocationsSettings>> fn) {
			return this.adaptiveAllocations(fn.apply(new AdaptiveAllocationsSettings.Builder()).build());
		}

		/**
		 * Required - The overall assignment state.
		 * <p>
		 * API name: {@code assignment_state}
		 */
		public final Builder assignmentState(DeploymentAssignmentState value) {
			this.assignmentState = value;
			return this;
		}

		/**
		 * API name: {@code max_assigned_allocations}
		 */
		public final Builder maxAssignedAllocations(@Nullable Integer value) {
			this.maxAssignedAllocations = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - The allocation state for each node.
		 * <p>
		 * API name: {@code routing_table}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>routingTable</code>.
		 */
		public final Builder routingTable(Map<String, TrainedModelAssignmentRoutingTable> map) {
			this.routingTable = _mapPutAll(this.routingTable, map);
			return this;
		}

		/**
		 * Required - The allocation state for each node.
		 * <p>
		 * API name: {@code routing_table}
		 * <p>
		 * Adds an entry to <code>routingTable</code>.
		 */
		public final Builder routingTable(String key, TrainedModelAssignmentRoutingTable value) {
			this.routingTable = _mapPut(this.routingTable, key, value);
			return this;
		}

		/**
		 * Required - The allocation state for each node.
		 * <p>
		 * API name: {@code routing_table}
		 * <p>
		 * Adds an entry to <code>routingTable</code> using a builder lambda.
		 */
		public final Builder routingTable(String key,
				Function<TrainedModelAssignmentRoutingTable.Builder, ObjectBuilder<TrainedModelAssignmentRoutingTable>> fn) {
			return routingTable(key, fn.apply(new TrainedModelAssignmentRoutingTable.Builder()).build());
		}

		/**
		 * Required - The timestamp when the deployment started.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(DateTime value) {
			this.startTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code task_parameters}
		 */
		public final Builder taskParameters(TrainedModelAssignmentTaskParameters value) {
			this.taskParameters = value;
			return this;
		}

		/**
		 * Required - API name: {@code task_parameters}
		 */
		public final Builder taskParameters(
				Function<TrainedModelAssignmentTaskParameters.Builder, ObjectBuilder<TrainedModelAssignmentTaskParameters>> fn) {
			return this.taskParameters(fn.apply(new TrainedModelAssignmentTaskParameters.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelAssignment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelAssignment build() {
			_checkSingleUse();

			return new TrainedModelAssignment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelAssignment}
	 */
	public static final JsonpDeserializer<TrainedModelAssignment> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelAssignment::setupTrainedModelAssignmentDeserializer);

	protected static void setupTrainedModelAssignmentDeserializer(
			ObjectDeserializer<TrainedModelAssignment.Builder> op) {

		op.add(Builder::adaptiveAllocations, AdaptiveAllocationsSettings._DESERIALIZER, "adaptive_allocations");
		op.add(Builder::assignmentState, DeploymentAssignmentState._DESERIALIZER, "assignment_state");
		op.add(Builder::maxAssignedAllocations, JsonpDeserializer.integerDeserializer(), "max_assigned_allocations");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::routingTable,
				JsonpDeserializer.stringMapDeserializer(TrainedModelAssignmentRoutingTable._DESERIALIZER),
				"routing_table");
		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time");
		op.add(Builder::taskParameters, TrainedModelAssignmentTaskParameters._DESERIALIZER, "task_parameters");

	}

}
