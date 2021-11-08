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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.start_transform.Request

public class StartTransformRequest extends RequestBase {
	@Nullable
	private final String timeout;

	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	private StartTransformRequest(Builder builder) {

		this.timeout = builder.timeout;
		this.transformId = ModelTypeHelper.requireNonNull(builder.transformId, this, "transformId");

	}

	public static StartTransformRequest of(Function<Builder, ObjectBuilder<StartTransformRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Controls the time to wait for the transform to start
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Required - The id of the transform to start
	 * <p>
	 * API name: {@code transform_id}
	 */
	public final String transformId() {
		return this.transformId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartTransformRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StartTransformRequest> {
		@Nullable
		private String timeout;

		private String transformId;

		/**
		 * Controls the time to wait for the transform to start
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Required - The id of the transform to start
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * Builds a {@link StartTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartTransformRequest build() {
			_checkSingleUse();

			return new StartTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.start_transform}".
	 */
	public static final Endpoint<StartTransformRequest, StartTransformResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_start");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StartTransformResponse._DESERIALIZER);
}
