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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.reset_transform.Request

/**
 * Resets a transform. Before you can reset it, you must stop it; alternatively,
 * use the <code>force</code> query parameter. If the destination index was
 * created by the transform, it is deleted.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.reset_transform.Request">API
 *      specification</a>
 */

public class ResetTransformRequest extends RequestBase {
	@Nullable
	private final Boolean force;

	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	private ResetTransformRequest(Builder builder) {

		this.force = builder.force;
		this.transformId = ApiTypeHelper.requireNonNull(builder.transformId, this, "transformId");

	}

	public static ResetTransformRequest of(Function<Builder, ObjectBuilder<ResetTransformRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If this value is <code>true</code>, the transform is reset regardless of its
	 * current state. If it's <code>false</code>, the transform must be stopped
	 * before it can be reset.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Required - Identifier for the transform. This identifier can contain
	 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
	 * has a 64 character limit and must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code transform_id}
	 */
	public final String transformId() {
		return this.transformId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResetTransformRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ResetTransformRequest> {
		@Nullable
		private Boolean force;

		private String transformId;

		/**
		 * If this value is <code>true</code>, the transform is reset regardless of its
		 * current state. If it's <code>false</code>, the transform must be stopped
		 * before it can be reset.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Required - Identifier for the transform. This identifier can contain
		 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
		 * has a 64 character limit and must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(String value) {
			this.transformId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ResetTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResetTransformRequest build() {
			_checkSingleUse();

			return new ResetTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.reset_transform}".
	 */
	public static final Endpoint<ResetTransformRequest, ResetTransformResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/transform.reset_transform",

			// Request method
			request -> {
				return "POST";

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
					buf.append("/_reset");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _transformId = 1 << 0;

				int propsSet = 0;

				propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					params.put("transformId", request.transformId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ResetTransformResponse._DESERIALIZER);
}
