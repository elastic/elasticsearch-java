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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
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

// typedef: transform.get_transform.Request

/**
 * Retrieves configuration information for transforms.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/transform/get_transform/GetTransformRequest.ts#L24-L39">API
 *      specification</a>
 */

public class GetTransformRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean excludeGenerated;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	@Nullable
	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	private GetTransformRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.excludeGenerated = builder.excludeGenerated;
		this.from = builder.from;
		this.size = builder.size;
		this.transformId = builder.transformId;

	}

	public static GetTransformRequest of(Function<Builder, ObjectBuilder<GetTransformRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard expression matches no transforms. (This
	 * includes <code>_all</code> string or when no transforms have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Omits fields that are illegal to set on transform PUT
	 * <p>
	 * API name: {@code exclude_generated}
	 */
	@Nullable
	public final Boolean excludeGenerated() {
		return this.excludeGenerated;
	}

	/**
	 * skips a number of transform configs, defaults to 0
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * specifies a max number of transforms to get, defaults to 100
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * The id or comma delimited list of id expressions of the transforms to get,
	 * '_all' or '*' implies get all transforms
	 * <p>
	 * API name: {@code transform_id}
	 */
	@Nullable
	public final String transformId() {
		return this.transformId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetTransformRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean excludeGenerated;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		@Nullable
		private String transformId;

		/**
		 * Whether to ignore if a wildcard expression matches no transforms. (This
		 * includes <code>_all</code> string or when no transforms have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Omits fields that are illegal to set on transform PUT
		 * <p>
		 * API name: {@code exclude_generated}
		 */
		public final Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
			return this;
		}

		/**
		 * skips a number of transform configs, defaults to 0
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * specifies a max number of transforms to get, defaults to 100
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * The id or comma delimited list of id expressions of the transforms to get,
		 * '_all' or '*' implies get all transforms
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(@Nullable String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * Builds a {@link GetTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformRequest build() {
			_checkSingleUse();

			return new GetTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.get_transform}".
	 */
	public static final Endpoint<GetTransformRequest, GetTransformResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/transform.get_transform",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.transformId, buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetTransformResponse._DESERIALIZER);
}
