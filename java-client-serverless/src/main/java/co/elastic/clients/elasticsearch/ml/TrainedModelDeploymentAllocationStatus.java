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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelDeploymentAllocationStatus

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelDeploymentAllocationStatus">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelDeploymentAllocationStatus implements JsonpSerializable {
	private final int allocationCount;

	private final DeploymentAllocationState state;

	private final int targetAllocationCount;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelDeploymentAllocationStatus(Builder builder) {

		this.allocationCount = ApiTypeHelper.requireNonNull(builder.allocationCount, this, "allocationCount");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.targetAllocationCount = ApiTypeHelper.requireNonNull(builder.targetAllocationCount, this,
				"targetAllocationCount");

	}

	public static TrainedModelDeploymentAllocationStatus of(
			Function<Builder, ObjectBuilder<TrainedModelDeploymentAllocationStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The current number of nodes where the model is allocated.
	 * <p>
	 * API name: {@code allocation_count}
	 */
	public final int allocationCount() {
		return this.allocationCount;
	}

	/**
	 * Required - The detailed allocation state related to the nodes.
	 * <p>
	 * API name: {@code state}
	 */
	public final DeploymentAllocationState state() {
		return this.state;
	}

	/**
	 * Required - The desired number of nodes for model allocation.
	 * <p>
	 * API name: {@code target_allocation_count}
	 */
	public final int targetAllocationCount() {
		return this.targetAllocationCount;
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

		generator.writeKey("allocation_count");
		generator.write(this.allocationCount);

		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("target_allocation_count");
		generator.write(this.targetAllocationCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelDeploymentAllocationStatus}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelDeploymentAllocationStatus> {
		private Integer allocationCount;

		private DeploymentAllocationState state;

		private Integer targetAllocationCount;

		/**
		 * Required - The current number of nodes where the model is allocated.
		 * <p>
		 * API name: {@code allocation_count}
		 */
		public final Builder allocationCount(int value) {
			this.allocationCount = value;
			return this;
		}

		/**
		 * Required - The detailed allocation state related to the nodes.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(DeploymentAllocationState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - The desired number of nodes for model allocation.
		 * <p>
		 * API name: {@code target_allocation_count}
		 */
		public final Builder targetAllocationCount(int value) {
			this.targetAllocationCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelDeploymentAllocationStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelDeploymentAllocationStatus build() {
			_checkSingleUse();

			return new TrainedModelDeploymentAllocationStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelDeploymentAllocationStatus}
	 */
	public static final JsonpDeserializer<TrainedModelDeploymentAllocationStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					TrainedModelDeploymentAllocationStatus::setupTrainedModelDeploymentAllocationStatusDeserializer);

	protected static void setupTrainedModelDeploymentAllocationStatusDeserializer(
			ObjectDeserializer<TrainedModelDeploymentAllocationStatus.Builder> op) {

		op.add(Builder::allocationCount, JsonpDeserializer.integerDeserializer(), "allocation_count");
		op.add(Builder::state, DeploymentAllocationState._DESERIALIZER, "state");
		op.add(Builder::targetAllocationCount, JsonpDeserializer.integerDeserializer(), "target_allocation_count");

	}

}
