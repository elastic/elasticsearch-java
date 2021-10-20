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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
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

// typedef: cat.transforms.Request

public final class TransformsRequest extends CatRequestBase {
	@Nullable
	private final String transformId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	public TransformsRequest(Builder builder) {

		this.transformId = builder.transformId;
		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.size = builder.size;

	}

	public TransformsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The id of the transform for which to get stats. '_all' or '*' implies all
	 * transforms
	 * <p>
	 * API name: {@code transform_id}
	 */
	@Nullable
	public String transformId() {
		return this.transformId;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no transforms. (This
	 * includes <code>_all</code> string or when no transforms have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * skips a number of transform configs, defaults to 0
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * specifies a max number of transforms to get, defaults to 100
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformsRequest}.
	 */
	public static class Builder implements ObjectBuilder<TransformsRequest> {
		@Nullable
		private String transformId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		/**
		 * The id of the transform for which to get stats. '_all' or '*' implies all
		 * transforms
		 * <p>
		 * API name: {@code transform_id}
		 */
		public Builder transformId(@Nullable String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no transforms. (This
		 * includes <code>_all</code> string or when no transforms have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * skips a number of transform configs, defaults to 0
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * specifies a max number of transforms to get, defaults to 100
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link TransformsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformsRequest build() {

			return new TransformsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.transforms}".
	 */
	public static final Endpoint<TransformsRequest, TransformsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/transforms");
					return buf.toString();
				}
				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/transforms");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.transformId, buf);
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

			}, SimpleEndpoint.emptyMap(), false, TransformsResponse._DESERIALIZER);
}
