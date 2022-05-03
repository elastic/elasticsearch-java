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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelAllocation

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelAllocation">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelAllocation implements JsonpSerializable {
	private final DeploymentAllocationState allocationState;

	private final Map<String, TrainedModelAllocationRoutingTable> routingTable;

	private final DateTime startTime;

	private final TrainedModelAllocationTaskParameters taskParameters;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelAllocation(Builder builder) {

		this.allocationState = ApiTypeHelper.requireNonNull(builder.allocationState, this, "allocationState");
		this.routingTable = ApiTypeHelper.unmodifiableRequired(builder.routingTable, this, "routingTable");
		this.startTime = ApiTypeHelper.requireNonNull(builder.startTime, this, "startTime");
		this.taskParameters = ApiTypeHelper.requireNonNull(builder.taskParameters, this, "taskParameters");

	}

	public static TrainedModelAllocation of(Function<Builder, ObjectBuilder<TrainedModelAllocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The overall allocation state.
	 * <p>
	 * API name: {@code allocation_state}
	 */
	public final DeploymentAllocationState allocationState() {
		return this.allocationState;
	}

	/**
	 * Required - The allocation state for each node.
	 * <p>
	 * API name: {@code routing_table}
	 */
	public final Map<String, TrainedModelAllocationRoutingTable> routingTable() {
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
	public final TrainedModelAllocationTaskParameters taskParameters() {
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

		generator.writeKey("allocation_state");
		this.allocationState.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.routingTable)) {
			generator.writeKey("routing_table");
			generator.writeStartObject();
			for (Map.Entry<String, TrainedModelAllocationRoutingTable> item0 : this.routingTable.entrySet()) {
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
	 * Builder for {@link TrainedModelAllocation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelAllocation> {
		private DeploymentAllocationState allocationState;

		private Map<String, TrainedModelAllocationRoutingTable> routingTable;

		private DateTime startTime;

		private TrainedModelAllocationTaskParameters taskParameters;

		/**
		 * Required - The overall allocation state.
		 * <p>
		 * API name: {@code allocation_state}
		 */
		public final Builder allocationState(DeploymentAllocationState value) {
			this.allocationState = value;
			return this;
		}

		/**
		 * Required - The allocation state for each node.
		 * <p>
		 * API name: {@code routing_table}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>routingTable</code>.
		 */
		public final Builder routingTable(Map<String, TrainedModelAllocationRoutingTable> map) {
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
		public final Builder routingTable(String key, TrainedModelAllocationRoutingTable value) {
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
				Function<TrainedModelAllocationRoutingTable.Builder, ObjectBuilder<TrainedModelAllocationRoutingTable>> fn) {
			return routingTable(key, fn.apply(new TrainedModelAllocationRoutingTable.Builder()).build());
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
		public final Builder taskParameters(TrainedModelAllocationTaskParameters value) {
			this.taskParameters = value;
			return this;
		}

		/**
		 * Required - API name: {@code task_parameters}
		 */
		public final Builder taskParameters(
				Function<TrainedModelAllocationTaskParameters.Builder, ObjectBuilder<TrainedModelAllocationTaskParameters>> fn) {
			return this.taskParameters(fn.apply(new TrainedModelAllocationTaskParameters.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelAllocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelAllocation build() {
			_checkSingleUse();

			return new TrainedModelAllocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelAllocation}
	 */
	public static final JsonpDeserializer<TrainedModelAllocation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelAllocation::setupTrainedModelAllocationDeserializer);

	protected static void setupTrainedModelAllocationDeserializer(
			ObjectDeserializer<TrainedModelAllocation.Builder> op) {

		op.add(Builder::allocationState, DeploymentAllocationState._DESERIALIZER, "allocation_state");
		op.add(Builder::routingTable,
				JsonpDeserializer.stringMapDeserializer(TrainedModelAllocationRoutingTable._DESERIALIZER),
				"routing_table");
		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time");
		op.add(Builder::taskParameters, TrainedModelAllocationTaskParameters._DESERIALIZER, "task_parameters");

	}

}
