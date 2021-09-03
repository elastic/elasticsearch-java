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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: ml.get_trained_models.Request
public final class GetTrainedModelsRequest extends RequestBase {
	@Nullable
	private final String modelId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean decompressDefinition;

	@Nullable
	private final Boolean excludeGenerated;

	@Nullable
	private final Number from;

	@Nullable
	private final String include;

	@Nullable
	private final Number size;

	@Nullable
	private final String tags;

	// ---------------------------------------------------------------------------------------------

	protected GetTrainedModelsRequest(Builder builder) {

		this.modelId = builder.modelId;
		this.allowNoMatch = builder.allowNoMatch;
		this.decompressDefinition = builder.decompressDefinition;
		this.excludeGenerated = builder.excludeGenerated;
		this.from = builder.from;
		this.include = builder.include;
		this.size = builder.size;
		this.tags = builder.tags;

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
	 * Specifies whether the included model definition should be returned as a JSON
	 * map (true) or in a custom compressed format (false).
	 * <p>
	 * API name: {@code decompress_definition}
	 */
	@Nullable
	public Boolean decompressDefinition() {
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
	public Boolean excludeGenerated() {
		return this.excludeGenerated;
	}

	/**
	 * Skips the specified number of models.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * A comma delimited string of optional fields to include in the response body.
	 * <p>
	 * API name: {@code include}
	 */
	@Nullable
	public String include() {
		return this.include;
	}

	/**
	 * Specifies the maximum number of models to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * A comma delimited string of tags. A trained model can have many tags, or
	 * none. When supplied, only trained models that contain all the supplied tags
	 * are returned.
	 * <p>
	 * API name: {@code tags}
	 */
	@Nullable
	public String tags() {
		return this.tags;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrainedModelsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetTrainedModelsRequest> {
		@Nullable
		private String modelId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean decompressDefinition;

		@Nullable
		private Boolean excludeGenerated;

		@Nullable
		private Number from;

		@Nullable
		private String include;

		@Nullable
		private Number size;

		@Nullable
		private String tags;

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
		 * Specifies whether the included model definition should be returned as a JSON
		 * map (true) or in a custom compressed format (false).
		 * <p>
		 * API name: {@code decompress_definition}
		 */
		public Builder decompressDefinition(@Nullable Boolean value) {
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
		public Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
			return this;
		}

		/**
		 * Skips the specified number of models.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * A comma delimited string of optional fields to include in the response body.
		 * <p>
		 * API name: {@code include}
		 */
		public Builder include(@Nullable String value) {
			this.include = value;
			return this;
		}

		/**
		 * Specifies the maximum number of models to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * A comma delimited string of tags. A trained model can have many tags, or
		 * none. When supplied, only trained models that contain all the supplied tags
		 * are returned.
		 * <p>
		 * API name: {@code tags}
		 */
		public Builder tags(@Nullable String value) {
			this.tags = value;
			return this;
		}

		/**
		 * Builds a {@link GetTrainedModelsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsRequest build() {

			return new GetTrainedModelsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_trained_models}".
	 */
	public static final Endpoint<GetTrainedModelsRequest, GetTrainedModelsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append(request.modelId);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.decompressDefinition != null) {
					params.put("decompress_definition", String.valueOf(request.decompressDefinition));
				}
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.include != null) {
					params.put("include", request.include);
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				if (request.tags != null) {
					params.put("tags", request.tags);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetTrainedModelsResponse.DESERIALIZER);
}
