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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.stop_trained_model_deployment.Request

/**
 * Stops a trained model deployment.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.stop_trained_model_deployment.Request">API
 *      specification</a>
 */

public class StopTrainedModelDeploymentRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean force;

	private final String modelId;

	// ---------------------------------------------------------------------------------------------

	private StopTrainedModelDeploymentRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.force = builder.force;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");

	}

	public static StopTrainedModelDeploymentRequest of(
			Function<Builder, ObjectBuilder<StopTrainedModelDeploymentRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request: contains wildcard expressions and
	 * there are no deployments that match; contains the <code>_all</code> string or
	 * no identifiers and there are no matches; or contains wildcard expressions and
	 * there are only partial matches. By default, it returns an empty array when
	 * there are no matches and the subset of results when there are partial
	 * matches. If <code>false</code>, the request returns a 404 status code when
	 * there are no matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Forcefully stops the deployment, even if it is used by ingest pipelines. You
	 * can't use these pipelines until you restart the model deployment.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopTrainedModelDeploymentRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StopTrainedModelDeploymentRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean force;

		private String modelId;

		/**
		 * Specifies what to do when the request: contains wildcard expressions and
		 * there are no deployments that match; contains the <code>_all</code> string or
		 * no identifiers and there are no matches; or contains wildcard expressions and
		 * there are only partial matches. By default, it returns an empty array when
		 * there are no matches and the subset of results when there are partial
		 * matches. If <code>false</code>, the request returns a 404 status code when
		 * there are no matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Forcefully stops the deployment, even if it is used by ingest pipelines. You
		 * can't use these pipelines until you restart the model deployment.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StopTrainedModelDeploymentRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopTrainedModelDeploymentRequest build() {
			_checkSingleUse();

			return new StopTrainedModelDeploymentRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.stop_trained_model_deployment}".
	 */
	public static final Endpoint<StopTrainedModelDeploymentRequest, StopTrainedModelDeploymentResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.stop_trained_model_deployment",

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
					buf.append("/_stop");
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
				Map<String, String> params = new HashMap<>();
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StopTrainedModelDeploymentResponse._DESERIALIZER);
}
