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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml.get_trained_models.Request

/**
 * Get trained model configuration info.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_trained_models.Request">API
 *      specification</a>
 */

public class GetTrainedModelsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean decompressDefinition;

	@Nullable
	private final Boolean excludeGenerated;

	@Nullable
	private final Integer from;

	@Nullable
	private final Include include;

	@Nullable
	private final Boolean includeModelDefinition;

	private final List<String> modelId;

	@Nullable
	private final Integer size;

	private final List<String> tags;

	// ---------------------------------------------------------------------------------------------

	private GetTrainedModelsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.decompressDefinition = builder.decompressDefinition;
		this.excludeGenerated = builder.excludeGenerated;
		this.from = builder.from;
		this.include = builder.include;
		this.includeModelDefinition = builder.includeModelDefinition;
		this.modelId = ApiTypeHelper.unmodifiable(builder.modelId);
		this.size = builder.size;
		this.tags = ApiTypeHelper.unmodifiable(builder.tags);

	}

	public static GetTrainedModelsRequest of(Function<Builder, ObjectBuilder<GetTrainedModelsRequest>> fn) {
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
	 * Specifies whether the included model definition should be returned as a JSON
	 * map (true) or in a custom compressed format (false).
	 * <p>
	 * API name: {@code decompress_definition}
	 */
	@Nullable
	public final Boolean decompressDefinition() {
		return this.decompressDefinition;
	}

	/**
	 * Indicates if certain fields should be removed from the configuration on
	 * retrieval. This allows the configuration to be in an acceptable format to be
	 * retrieved and then added to another cluster.
	 * <p>
	 * API name: {@code exclude_generated}
	 */
	@Nullable
	public final Boolean excludeGenerated() {
		return this.excludeGenerated;
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
	 * A comma delimited string of optional fields to include in the response body.
	 * <p>
	 * API name: {@code include}
	 */
	@Nullable
	public final Include include() {
		return this.include;
	}

	/**
	 * parameter is deprecated! Use [include=definition] instead
	 * <p>
	 * API name: {@code include_model_definition}
	 * 
	 * @deprecated 7.10.0
	 */
	@Deprecated
	@Nullable
	public final Boolean includeModelDefinition() {
		return this.includeModelDefinition;
	}

	/**
	 * The unique identifier of the trained model or a model alias.
	 * <p>
	 * You can get information for multiple trained models in a single API request
	 * by using a comma-separated list of model IDs or a wildcard expression.
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

	/**
	 * A comma delimited string of tags. A trained model can have many tags, or
	 * none. When supplied, only trained models that contain all the supplied tags
	 * are returned.
	 * <p>
	 * API name: {@code tags}
	 */
	public final List<String> tags() {
		return this.tags;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrainedModelsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetTrainedModelsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean decompressDefinition;

		@Nullable
		private Boolean excludeGenerated;

		@Nullable
		private Integer from;

		@Nullable
		private Include include;

		@Nullable
		private Boolean includeModelDefinition;

		@Nullable
		private List<String> modelId;

		@Nullable
		private Integer size;

		@Nullable
		private List<String> tags;

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
		 * Specifies whether the included model definition should be returned as a JSON
		 * map (true) or in a custom compressed format (false).
		 * <p>
		 * API name: {@code decompress_definition}
		 */
		public final Builder decompressDefinition(@Nullable Boolean value) {
			this.decompressDefinition = value;
			return this;
		}

		/**
		 * Indicates if certain fields should be removed from the configuration on
		 * retrieval. This allows the configuration to be in an acceptable format to be
		 * retrieved and then added to another cluster.
		 * <p>
		 * API name: {@code exclude_generated}
		 */
		public final Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
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
		 * A comma delimited string of optional fields to include in the response body.
		 * <p>
		 * API name: {@code include}
		 */
		public final Builder include(@Nullable Include value) {
			this.include = value;
			return this;
		}

		/**
		 * parameter is deprecated! Use [include=definition] instead
		 * <p>
		 * API name: {@code include_model_definition}
		 * 
		 * @deprecated 7.10.0
		 */
		@Deprecated
		public final Builder includeModelDefinition(@Nullable Boolean value) {
			this.includeModelDefinition = value;
			return this;
		}

		/**
		 * The unique identifier of the trained model or a model alias.
		 * <p>
		 * You can get information for multiple trained models in a single API request
		 * by using a comma-separated list of model IDs or a wildcard expression.
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
		 * The unique identifier of the trained model or a model alias.
		 * <p>
		 * You can get information for multiple trained models in a single API request
		 * by using a comma-separated list of model IDs or a wildcard expression.
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

		/**
		 * A comma delimited string of tags. A trained model can have many tags, or
		 * none. When supplied, only trained models that contain all the supplied tags
		 * are returned.
		 * <p>
		 * API name: {@code tags}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tags</code>.
		 */
		public final Builder tags(List<String> list) {
			this.tags = _listAddAll(this.tags, list);
			return this;
		}

		/**
		 * A comma delimited string of tags. A trained model can have many tags, or
		 * none. When supplied, only trained models that contain all the supplied tags
		 * are returned.
		 * <p>
		 * API name: {@code tags}
		 * <p>
		 * Adds one or more values to <code>tags</code>.
		 */
		public final Builder tags(String value, String... values) {
			this.tags = _listAdd(this.tags, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTrainedModelsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsRequest build() {
			_checkSingleUse();

			return new GetTrainedModelsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_trained_models}".
	 */
	public static final Endpoint<GetTrainedModelsRequest, GetTrainedModelsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_trained_models",

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
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
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
				if (request.include != null) {
					params.put("include", request.include.jsonValue());
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.decompressDefinition != null) {
					params.put("decompress_definition", String.valueOf(request.decompressDefinition));
				}
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.includeModelDefinition != null) {
					params.put("include_model_definition", String.valueOf(request.includeModelDefinition));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (ApiTypeHelper.isDefined(request.tags)) {
					params.put("tags", request.tags.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetTrainedModelsResponse._DESERIALIZER);
}
