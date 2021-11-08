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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_trained_models.Request

public class MlTrainedModelsRequest extends CatRequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Bytes bytes;

	@Nullable
	private final Integer from;

	@Nullable
	private final String modelId;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private MlTrainedModelsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.bytes = builder.bytes;
		this.from = builder.from;
		this.modelId = builder.modelId;
		this.size = builder.size;

	}

	public static MlTrainedModelsRequest of(Function<Builder, ObjectBuilder<MlTrainedModelsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard expression matches no trained models. (This
	 * includes <code>_all</code> string or when no trained models have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * The unit in which to display byte values
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
	}

	/**
	 * skips a number of trained models
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * The ID of the trained models stats to fetch
	 * <p>
	 * API name: {@code model_id}
	 */
	@Nullable
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * specifies a max number of trained models to get
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlTrainedModelsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlTrainedModelsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Bytes bytes;

		@Nullable
		private Integer from;

		@Nullable
		private String modelId;

		@Nullable
		private Integer size;

		/**
		 * Whether to ignore if a wildcard expression matches no trained models. (This
		 * includes <code>_all</code> string or when no trained models have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * The unit in which to display byte values
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * skips a number of trained models
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * The ID of the trained models stats to fetch
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(@Nullable String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * specifies a max number of trained models to get
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link MlTrainedModelsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlTrainedModelsRequest build() {
			_checkSingleUse();

			return new MlTrainedModelsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.ml_trained_models}".
	 */
	public static final Endpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/trained_models");
					return buf.toString();
				}
				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, MlTrainedModelsResponse._DESERIALIZER);
}
