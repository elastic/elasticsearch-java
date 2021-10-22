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
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.delete_trained_model_alias.Request

public final class DeleteTrainedModelAliasRequest extends RequestBase {
	private final String modelAlias;

	private final String modelId;

	// ---------------------------------------------------------------------------------------------

	public DeleteTrainedModelAliasRequest(Builder builder) {

		this.modelAlias = Objects.requireNonNull(builder.modelAlias, "model_alias");
		this.modelId = Objects.requireNonNull(builder.modelId, "model_id");

	}

	public DeleteTrainedModelAliasRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The model alias to delete.
	 * <p>
	 * API name: {@code model_alias}
	 */
	public String modelAlias() {
		return this.modelAlias;
	}

	/**
	 * Required - The trained model ID to which the model alias refers.
	 * <p>
	 * API name: {@code model_id}
	 */
	public String modelId() {
		return this.modelId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteTrainedModelAliasRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteTrainedModelAliasRequest> {
		private String modelAlias;

		private String modelId;

		/**
		 * Required - The model alias to delete.
		 * <p>
		 * API name: {@code model_alias}
		 */
		public Builder modelAlias(String value) {
			this.modelAlias = value;
			return this;
		}

		/**
		 * Required - The trained model ID to which the model alias refers.
		 * <p>
		 * API name: {@code model_id}
		 */
		public Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteTrainedModelAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteTrainedModelAliasRequest build() {

			return new DeleteTrainedModelAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_trained_model_alias}".
	 */
	public static final Endpoint<DeleteTrainedModelAliasRequest, DeleteTrainedModelAliasResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteTrainedModelAliasResponse._DESERIALIZER);
}
