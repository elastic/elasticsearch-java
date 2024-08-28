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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
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

// typedef: ml.update_trained_model_deployment.Request

/**
 * Update a trained model deployment.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.update_trained_model_deployment.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateTrainedModelDeploymentRequest extends RequestBase implements JsonpSerializable {
	private final String modelId;

	@Nullable
	private final Integer numberOfAllocations;

	// ---------------------------------------------------------------------------------------------

	private UpdateTrainedModelDeploymentRequest(Builder builder) {

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.numberOfAllocations = builder.numberOfAllocations;

	}

	public static UpdateTrainedModelDeploymentRequest of(
			Function<Builder, ObjectBuilder<UpdateTrainedModelDeploymentRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the trained model. Currently, only
	 * PyTorch models are supported.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The number of model allocations on each node where the model is deployed. All
	 * allocations on a node share the same copy of the model in memory but use a
	 * separate set of threads to evaluate the model. Increasing this value
	 * generally increases the throughput. If this setting is greater than the
	 * number of hardware threads it will automatically be changed to a value less
	 * than the number of hardware threads.
	 * <p>
	 * API name: {@code number_of_allocations}
	 */
	@Nullable
	public final Integer numberOfAllocations() {
		return this.numberOfAllocations;
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

		if (this.numberOfAllocations != null) {
			generator.writeKey("number_of_allocations");
			generator.write(this.numberOfAllocations);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateTrainedModelDeploymentRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateTrainedModelDeploymentRequest> {
		private String modelId;

		@Nullable
		private Integer numberOfAllocations;

		/**
		 * Required - The unique identifier of the trained model. Currently, only
		 * PyTorch models are supported.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The number of model allocations on each node where the model is deployed. All
		 * allocations on a node share the same copy of the model in memory but use a
		 * separate set of threads to evaluate the model. Increasing this value
		 * generally increases the throughput. If this setting is greater than the
		 * number of hardware threads it will automatically be changed to a value less
		 * than the number of hardware threads.
		 * <p>
		 * API name: {@code number_of_allocations}
		 */
		public final Builder numberOfAllocations(@Nullable Integer value) {
			this.numberOfAllocations = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateTrainedModelDeploymentRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateTrainedModelDeploymentRequest build() {
			_checkSingleUse();

			return new UpdateTrainedModelDeploymentRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateTrainedModelDeploymentRequest}
	 */
	public static final JsonpDeserializer<UpdateTrainedModelDeploymentRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					UpdateTrainedModelDeploymentRequest::setupUpdateTrainedModelDeploymentRequestDeserializer);

	protected static void setupUpdateTrainedModelDeploymentRequestDeserializer(
			ObjectDeserializer<UpdateTrainedModelDeploymentRequest.Builder> op) {

		op.add(Builder::numberOfAllocations, JsonpDeserializer.integerDeserializer(), "number_of_allocations");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_trained_model_deployment}".
	 */
	public static final Endpoint<UpdateTrainedModelDeploymentRequest, UpdateTrainedModelDeploymentResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.update_trained_model_deployment",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					buf.append("/deployment");
					buf.append("/_update");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					params.put("modelId", request.modelId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateTrainedModelDeploymentResponse._DESERIALIZER);
}
