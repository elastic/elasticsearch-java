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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.start_trained_model_deployment.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.start_trained_model_deployment.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class StartTrainedModelDeploymentResponse implements JsonpSerializable {
	private final TrainedModelAllocation allocation;

	// ---------------------------------------------------------------------------------------------

	private StartTrainedModelDeploymentResponse(Builder builder) {

		this.allocation = ApiTypeHelper.requireNonNull(builder.allocation, this, "allocation");

	}

	public static StartTrainedModelDeploymentResponse of(
			Function<Builder, ObjectBuilder<StartTrainedModelDeploymentResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code allocation}
	 */
	public final TrainedModelAllocation allocation() {
		return this.allocation;
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

		generator.writeKey("allocation");
		this.allocation.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartTrainedModelDeploymentResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StartTrainedModelDeploymentResponse> {
		private TrainedModelAllocation allocation;

		/**
		 * Required - API name: {@code allocation}
		 */
		public final Builder allocation(TrainedModelAllocation value) {
			this.allocation = value;
			return this;
		}

		/**
		 * Required - API name: {@code allocation}
		 */
		public final Builder allocation(
				Function<TrainedModelAllocation.Builder, ObjectBuilder<TrainedModelAllocation>> fn) {
			return this.allocation(fn.apply(new TrainedModelAllocation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StartTrainedModelDeploymentResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartTrainedModelDeploymentResponse build() {
			_checkSingleUse();

			return new StartTrainedModelDeploymentResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartTrainedModelDeploymentResponse}
	 */
	public static final JsonpDeserializer<StartTrainedModelDeploymentResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					StartTrainedModelDeploymentResponse::setupStartTrainedModelDeploymentResponseDeserializer);

	protected static void setupStartTrainedModelDeploymentResponseDeserializer(
			ObjectDeserializer<StartTrainedModelDeploymentResponse.Builder> op) {

		op.add(Builder::allocation, TrainedModelAllocation._DESERIALIZER, "allocation");

	}

}
