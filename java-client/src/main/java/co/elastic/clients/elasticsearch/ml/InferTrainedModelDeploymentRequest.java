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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.infer_trained_model_deployment.Request

/**
 * Evaluates a trained model.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.infer_trained_model_deployment.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferTrainedModelDeploymentRequest extends RequestBase implements JsonpSerializable {
	private final List<Map<String, String>> docs;

	private final String modelId;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private InferTrainedModelDeploymentRequest(Builder builder) {

		this.docs = ApiTypeHelper.unmodifiableRequired(builder.docs, this, "docs");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.timeout = builder.timeout;

	}

	public static InferTrainedModelDeploymentRequest of(
			Function<Builder, ObjectBuilder<InferTrainedModelDeploymentRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An array of objects to pass to the model for inference. The
	 * objects should contain a field matching your configured trained model input.
	 * Typically, the field name is <code>text_field</code>. Currently, only a
	 * single value is allowed.
	 * <p>
	 * API name: {@code docs}
	 */
	public final List<Map<String, String>> docs() {
		return this.docs;
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Controls the amount of time to wait for inference results.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (Map<String, String> item0 : this.docs) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, String> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferTrainedModelDeploymentRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InferTrainedModelDeploymentRequest> {
		private List<Map<String, String>> docs;

		private String modelId;

		@Nullable
		private Time timeout;

		/**
		 * Required - An array of objects to pass to the model for inference. The
		 * objects should contain a field matching your configured trained model input.
		 * Typically, the field name is <code>text_field</code>. Currently, only a
		 * single value is allowed.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<Map<String, String>> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * Required - An array of objects to pass to the model for inference. The
		 * objects should contain a field matching your configured trained model input.
		 * Typically, the field name is <code>text_field</code>. Currently, only a
		 * single value is allowed.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(Map<String, String> value, Map<String, String>... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * Required - The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Controls the amount of time to wait for inference results.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Controls the amount of time to wait for inference results.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Builds a {@link InferTrainedModelDeploymentRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferTrainedModelDeploymentRequest build() {
			_checkSingleUse();

			return new InferTrainedModelDeploymentRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferTrainedModelDeploymentRequest}
	 */
	public static final JsonpDeserializer<InferTrainedModelDeploymentRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					InferTrainedModelDeploymentRequest::setupInferTrainedModelDeploymentRequestDeserializer);

	protected static void setupInferTrainedModelDeploymentRequestDeserializer(
			ObjectDeserializer<InferTrainedModelDeploymentRequest.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())), "docs");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.infer_trained_model_deployment}".
	 */
	public static final Endpoint<InferTrainedModelDeploymentRequest, InferTrainedModelDeploymentResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.infer_trained_model_deployment",

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
					buf.append("/_infer");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, InferTrainedModelDeploymentResponse._DESERIALIZER);
}
