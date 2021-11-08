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
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.Request

public class GetTransformStatsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Long from;

	@Nullable
	private final Long size;

	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	private GetTransformStatsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.size = builder.size;
		this.transformId = ModelTypeHelper.requireNonNull(builder.transformId, this, "transformId");

	}

	public static GetTransformStatsRequest of(Function<Builder, ObjectBuilder<GetTransformStatsRequest>> fn) {
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
	 * skips a number of transform stats, defaults to 0
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Long from() {
		return this.from;
	}

	/**
	 * specifies a max number of transform stats to get, defaults to 100
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Long size() {
		return this.size;
	}

	/**
	 * Required - The id of the transform for which to get stats. '_all' or '*'
	 * implies all transforms
	 * <p>
	 * API name: {@code transform_id}
	 */
	public final String transformId() {
		return this.transformId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformStatsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetTransformStatsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Long from;

		@Nullable
		private Long size;

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
		 * skips a number of transform stats, defaults to 0
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Long value) {
			this.from = value;
			return this;
		}

		/**
		 * specifies a max number of transform stats to get, defaults to 100
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Long value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - The id of the transform for which to get stats. '_all' or '*'
		 * implies all transforms
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * Builds a {@link GetTransformStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformStatsRequest build() {
			_checkSingleUse();

			return new GetTransformStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.get_transform_stats}".
	 */
	public static final Endpoint<GetTransformStatsRequest, GetTransformStatsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.transformId, buf);
					buf.append("/_stats");
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
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetTransformStatsResponse._DESERIALIZER);
}
