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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.clear_trained_model_deployment_cache.Request

/**
 * Clears a trained model deployment cache on all nodes where the trained model
 * is assigned. A trained model deployment may have an inference cache enabled.
 * As requests are handled by each allocated node, their responses may be cached
 * on that individual node. Calling this API clears the caches without
 * restarting the deployment.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.clear_trained_model_deployment_cache.Request">API
 *      specification</a>
 */

public class ClearTrainedModelDeploymentCacheRequest extends RequestBase {
	private final String modelId;

	// ---------------------------------------------------------------------------------------------

	private ClearTrainedModelDeploymentCacheRequest(Builder builder) {

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");

	}

	public static ClearTrainedModelDeploymentCacheRequest of(
			Function<Builder, ObjectBuilder<ClearTrainedModelDeploymentCacheRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Builder for {@link ClearTrainedModelDeploymentCacheRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ClearTrainedModelDeploymentCacheRequest> {
		private String modelId;

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
		 * Builds a {@link ClearTrainedModelDeploymentCacheRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearTrainedModelDeploymentCacheRequest build() {
			_checkSingleUse();

			return new ClearTrainedModelDeploymentCacheRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.clear_trained_model_deployment_cache}".
	 */
	public static final Endpoint<ClearTrainedModelDeploymentCacheRequest, ClearTrainedModelDeploymentCacheResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.clear_trained_model_deployment_cache",

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
					buf.append("/cache");
					buf.append("/_clear");
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

			}, SimpleEndpoint.emptyMap(), false, ClearTrainedModelDeploymentCacheResponse._DESERIALIZER);
}
