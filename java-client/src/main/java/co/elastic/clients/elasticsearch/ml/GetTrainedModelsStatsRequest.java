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
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: ml.get_trained_models_stats.Request

/**
 * Retrieves usage information for trained models. You can get usage information
 * for multiple trained models in a single API request by using a
 * comma-separated list of model IDs or a wildcard expression.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.get_trained_models_stats.Request">API
 *      specification</a>
 */

public class GetTrainedModelsStatsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Integer from;

	private final List<String> modelId;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private GetTrainedModelsStatsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.modelId = ApiTypeHelper.unmodifiable(builder.modelId);
		this.size = builder.size;

	}

	public static GetTrainedModelsStatsRequest of(Function<Builder, ObjectBuilder<GetTrainedModelsStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request:
	 * <ul>
	 * <li>Contains wildcard expressions and there are no models that match.</li>
	 * <li>Contains the _all string or no identifiers and there are no matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ul>
	 * <p>
	 * If true, it returns an empty array when there are no matches and the subset
	 * of results when there are partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Skips the specified number of models.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * The unique identifier of the trained model or a model alias. It can be a
	 * comma-separated list or a wildcard expression.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final List<String> modelId() {
		return this.modelId;
	}

	/**
	 * Specifies the maximum number of models to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrainedModelsStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetTrainedModelsStatsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Integer from;

		@Nullable
		private List<String> modelId;

		@Nullable
		private Integer size;

		/**
		 * Specifies what to do when the request:
		 * <ul>
		 * <li>Contains wildcard expressions and there are no models that match.</li>
		 * <li>Contains the _all string or no identifiers and there are no matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ul>
		 * <p>
		 * If true, it returns an empty array when there are no matches and the subset
		 * of results when there are partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Skips the specified number of models.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * The unique identifier of the trained model or a model alias. It can be a
		 * comma-separated list or a wildcard expression.
		 * <p>
		 * API name: {@code model_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>modelId</code>.
		 */
		public final Builder modelId(List<String> list) {
			this.modelId = _listAddAll(this.modelId, list);
			return this;
		}

		/**
		 * The unique identifier of the trained model or a model alias. It can be a
		 * comma-separated list or a wildcard expression.
		 * <p>
		 * API name: {@code model_id}
		 * <p>
		 * Adds one or more values to <code>modelId</code>.
		 */
		public final Builder modelId(String value, String... values) {
			this.modelId = _listAdd(this.modelId, value, values);
			return this;
		}

		/**
		 * Specifies the maximum number of models to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTrainedModelsStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsStatsRequest build() {
			_checkSingleUse();

			return new GetTrainedModelsStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_trained_models_stats}".
	 */
	public static final Endpoint<GetTrainedModelsStatsRequest, GetTrainedModelsStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_trained_models_stats",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.modelId()))
					propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _modelId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.modelId()))
					propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					params.put("modelId", request.modelId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetTrainedModelsStatsResponse._DESERIALIZER);
}
