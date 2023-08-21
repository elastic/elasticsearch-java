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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.start_transform.Request

/**
 * Starts a transform.
 * <p>
 * When you start a transform, it creates the destination index if it does not
 * already exist. The <code>number_of_shards</code> is set to <code>1</code> and
 * the <code>auto_expand_replicas</code> is set to <code>0-1</code>. If it is a
 * pivot transform, it deduces the mapping definitions for the destination index
 * from the source indices and the transform aggregations. If fields in the
 * destination index are derived from scripts (as in the case of
 * <code>scripted_metric</code> or <code>bucket_script</code> aggregations), the
 * transform uses dynamic mappings unless an index template exists. If it is a
 * latest transform, it does not deduce mapping definitions; it uses dynamic
 * mappings. To use explicit mappings, create the destination index before you
 * start the transform. Alternatively, you can create an index template, though
 * it does not affect the deduced mappings in a pivot transform.
 * <p>
 * When the transform starts, a series of validations occur to ensure its
 * success. If you deferred validation when you created the transform, they
 * occur when you start the transform—​with the exception of privilege checks.
 * When Elasticsearch security features are enabled, the transform remembers
 * which roles the user that created it had at the time of creation and uses
 * those same roles. If those roles do not have the required privileges on the
 * source and destination indices, the transform fails when it attempts
 * unauthorized operations.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.start_transform.Request">API
 *      specification</a>
 */

public class StartTransformRequest extends RequestBase {
	@Nullable
	private final String from;

	@Nullable
	private final Time timeout;

	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	private StartTransformRequest(Builder builder) {

		this.from = builder.from;
		this.timeout = builder.timeout;
		this.transformId = ApiTypeHelper.requireNonNull(builder.transformId, this, "transformId");

	}

	public static StartTransformRequest of(Function<Builder, ObjectBuilder<StartTransformRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Restricts the set of transformed entities to those changed after this time.
	 * Relative times like now-30d are supported. Only applicable for continuous
	 * transforms.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final String from() {
		return this.from;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Required - Identifier for the transform.
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

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StartTransformRequest> {
		@Nullable
		private String from;

		@Nullable
		private Time timeout;

		private String transformId;

		/**
		 * Restricts the set of transformed entities to those changed after this time.
		 * Relative times like now-30d are supported. Only applicable for continuous
		 * transforms.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable String value) {
			this.from = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Identifier for the transform.
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
	public static final Endpoint<StartTransformRequest, StartTransformResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/transform.start_transform",

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
				if (request.from != null) {
					params.put("from", request.from);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StartTransformResponse._DESERIALIZER);
}
