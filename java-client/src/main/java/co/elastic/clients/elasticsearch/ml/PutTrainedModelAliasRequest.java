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

// typedef: ml.put_trained_model_alias.Request

/**
 * Creates or updates a trained model alias. A trained model alias is a logical
 * name used to reference a single trained model. You can use aliases instead of
 * trained model identifiers to make it easier to reference your models. For
 * example, you can use aliases in inference aggregations and processors. An
 * alias must be unique and refer to only a single trained model. However, you
 * can have multiple aliases for each trained model. If you use this API to
 * update an alias such that it references a different trained model ID and the
 * model uses a different type of data frame analytics, an error occurs. For
 * example, this situation occurs if you have a trained model for regression
 * analysis and a trained model for classification analysis; you cannot reassign
 * an alias from one type of trained model to another. If you use this API to
 * update an alias and there are very few input fields in common between the old
 * and new trained models for the model alias, the API returns a warning.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.put_trained_model_alias.Request">API
 *      specification</a>
 */

public class PutTrainedModelAliasRequest extends RequestBase {
	private final String modelAlias;

	private final String modelId;

	@Nullable
	private final Boolean reassign;

	// ---------------------------------------------------------------------------------------------

	private PutTrainedModelAliasRequest(Builder builder) {

		this.modelAlias = ApiTypeHelper.requireNonNull(builder.modelAlias, this, "modelAlias");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.reassign = builder.reassign;

	}

	public static PutTrainedModelAliasRequest of(Function<Builder, ObjectBuilder<PutTrainedModelAliasRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The alias to create or update. This value cannot end in numbers.
	 * <p>
	 * API name: {@code model_alias}
	 */
	public final String modelAlias() {
		return this.modelAlias;
	}

	/**
	 * Required - The identifier for the trained model that the alias refers to.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Specifies whether the alias gets reassigned to the specified trained model if
	 * it is already assigned to a different model. If the alias is already assigned
	 * and this parameter is false, the API returns an error.
	 * <p>
	 * API name: {@code reassign}
	 */
	@Nullable
	public final Boolean reassign() {
		return this.reassign;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTrainedModelAliasRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutTrainedModelAliasRequest> {
		private String modelAlias;

		private String modelId;

		@Nullable
		private Boolean reassign;

		/**
		 * Required - The alias to create or update. This value cannot end in numbers.
		 * <p>
		 * API name: {@code model_alias}
		 */
		public final Builder modelAlias(String value) {
			this.modelAlias = value;
			return this;
		}

		/**
		 * Required - The identifier for the trained model that the alias refers to.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Specifies whether the alias gets reassigned to the specified trained model if
		 * it is already assigned to a different model. If the alias is already assigned
		 * and this parameter is false, the API returns an error.
		 * <p>
		 * API name: {@code reassign}
		 */
		public final Builder reassign(@Nullable Boolean value) {
			this.reassign = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutTrainedModelAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelAliasRequest build() {
			_checkSingleUse();

			return new PutTrainedModelAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_trained_model_alias}".
	 */
	public static final Endpoint<PutTrainedModelAliasRequest, PutTrainedModelAliasResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_trained_model_alias",

			// Request method
			request -> {
				return "PUT";

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
				Map<String, String> params = new HashMap<>();
				if (request.reassign != null) {
					params.put("reassign", String.valueOf(request.reassign));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, PutTrainedModelAliasResponse._DESERIALIZER);
}
