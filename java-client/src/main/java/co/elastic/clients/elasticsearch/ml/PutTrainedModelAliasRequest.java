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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model_alias.Request

public final class PutTrainedModelAliasRequest extends RequestBase {
	private final String modelAlias;

	private final String modelId;

	@Nullable
	private final Boolean reassign;

	// ---------------------------------------------------------------------------------------------

	public PutTrainedModelAliasRequest(Builder builder) {

		this.modelAlias = Objects.requireNonNull(builder.modelAlias, "model_alias");
		this.modelId = Objects.requireNonNull(builder.modelId, "model_id");
		this.reassign = builder.reassign;

	}

	/**
	 * The alias to create or update. This value cannot end in numbers.
	 * <p>
	 * API name: {@code model_alias}
	 */
	public String modelAlias() {
		return this.modelAlias;
	}

	/**
	 * The identifier for the trained model that the alias refers to.
	 * <p>
	 * API name: {@code model_id}
	 */
	public String modelId() {
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
	public Boolean reassign() {
		return this.reassign;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTrainedModelAliasRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutTrainedModelAliasRequest> {
		private String modelAlias;

		private String modelId;

		@Nullable
		private Boolean reassign;

		/**
		 * The alias to create or update. This value cannot end in numbers.
		 * <p>
		 * API name: {@code model_alias}
		 */
		public Builder modelAlias(String value) {
			this.modelAlias = value;
			return this;
		}

		/**
		 * The identifier for the trained model that the alias refers to.
		 * <p>
		 * API name: {@code model_id}
		 */
		public Builder modelId(String value) {
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
		public Builder reassign(@Nullable Boolean value) {
			this.reassign = value;
			return this;
		}

		/**
		 * Builds a {@link PutTrainedModelAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelAliasRequest build() {

			return new PutTrainedModelAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_trained_model_alias}".
	 */
	public static final Endpoint<PutTrainedModelAliasRequest, PutTrainedModelAliasResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append(request.modelId);
					buf.append("/model_aliases");
					buf.append("/");
					buf.append(request.modelAlias);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.reassign != null) {
					params.put("reassign", String.valueOf(request.reassign));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, PutTrainedModelAliasResponse._DESERIALIZER);
}
