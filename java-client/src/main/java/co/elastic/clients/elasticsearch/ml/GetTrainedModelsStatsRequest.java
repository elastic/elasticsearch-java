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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_trained_models_stats.Request

public final class GetTrainedModelsStatsRequest extends RequestBase {
	@Nullable
	private final String modelId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	public GetTrainedModelsStatsRequest(Builder builder) {

		this.modelId = builder.modelId;
		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.size = builder.size;

	}

	public GetTrainedModelsStatsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	@Nullable
	public String modelId() {
		return this.modelId;
	}

	/**
	 * Specifies what to do when the request:
	 * <ul>
	 * <li>Contains wildcard expressions and there are no models that match.</li>
	 * <li>Contains the _all string or no identifiers and there are no matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ul>
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Skips the specified number of models.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of models to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrainedModelsStatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetTrainedModelsStatsRequest> {
		@Nullable
		private String modelId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		/**
		 * The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public Builder modelId(@Nullable String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Specifies what to do when the request:
		 * <ul>
		 * <li>Contains wildcard expressions and there are no models that match.</li>
		 * <li>Contains the _all string or no identifiers and there are no matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ul>
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Skips the specified number of models.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of models to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link GetTrainedModelsStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsStatsRequest build() {

			return new GetTrainedModelsStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_trained_models_stats}".
	 */
	public static final Endpoint<GetTrainedModelsStatsRequest, GetTrainedModelsStatsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;

				int propsSet = 0;

				if (request.modelId() != null)
					propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/_stats");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetTrainedModelsStatsResponse._DESERIALIZER);
}
