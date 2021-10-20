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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.delete_trained_model.Request

public final class DeleteTrainedModelRequest extends RequestBase {
	private final String modelId;

	// ---------------------------------------------------------------------------------------------

	public DeleteTrainedModelRequest(Builder builder) {

		this.modelId = Objects.requireNonNull(builder.modelId, "model_id");

	}

	public DeleteTrainedModelRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public String modelId() {
		return this.modelId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteTrainedModelRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteTrainedModelRequest> {
		private String modelId;

		/**
		 * Required - The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteTrainedModelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteTrainedModelRequest build() {

			return new DeleteTrainedModelRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_trained_model}".
	 */
	public static final Endpoint<DeleteTrainedModelRequest, DeleteTrainedModelResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

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
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteTrainedModelResponse._DESERIALIZER);
}
