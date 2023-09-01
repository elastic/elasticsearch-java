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

// typedef: ml.delete_trained_model_alias.Request

/**
 * Deletes a trained model alias. This API deletes an existing model alias that
 * refers to a trained model. If the model alias is missing or refers to a model
 * other than the one identified by the <code>model_id</code>, this API returns
 * an error.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.delete_trained_model_alias.Request">API
 *      specification</a>
 */

public class DeleteTrainedModelAliasRequest extends RequestBase {
	private final String modelAlias;

	private final String modelId;

	// ---------------------------------------------------------------------------------------------

	private DeleteTrainedModelAliasRequest(Builder builder) {

		this.modelAlias = ApiTypeHelper.requireNonNull(builder.modelAlias, this, "modelAlias");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");

	}

	public static DeleteTrainedModelAliasRequest of(
			Function<Builder, ObjectBuilder<DeleteTrainedModelAliasRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The model alias to delete.
	 * <p>
	 * API name: {@code model_alias}
	 */
	public final String modelAlias() {
		return this.modelAlias;
	}

	/**
	 * Required - The trained model ID to which the model alias refers.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteTrainedModelAliasRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteTrainedModelAliasRequest> {
		private String modelAlias;

		private String modelId;

		/**
		 * Required - The model alias to delete.
		 * <p>
		 * API name: {@code model_alias}
		 */
		public final Builder modelAlias(String value) {
			this.modelAlias = value;
			return this;
		}

		/**
		 * Required - The trained model ID to which the model alias refers.
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
		 * Builds a {@link DeleteTrainedModelAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteTrainedModelAliasRequest build() {
			_checkSingleUse();

			return new DeleteTrainedModelAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_trained_model_alias}".
	 */
	public static final Endpoint<DeleteTrainedModelAliasRequest, DeleteTrainedModelAliasResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.delete_trained_model_alias",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _modelAlias = 1 << 0;
				final int _modelId = 1 << 1;

				int propsSet = 0;

				propsSet |= _modelAlias;
				propsSet |= _modelId;

				if (propsSet == (_modelId | _modelAlias)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					buf.append("/model_aliases");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelAlias, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _modelAlias = 1 << 0;
				final int _modelId = 1 << 1;

				int propsSet = 0;

				propsSet |= _modelAlias;
				propsSet |= _modelId;

				if (propsSet == (_modelId | _modelAlias)) {
					params.put("modelId", request.modelId);
					params.put("modelAlias", request.modelAlias);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteTrainedModelAliasResponse._DESERIALIZER);
}
