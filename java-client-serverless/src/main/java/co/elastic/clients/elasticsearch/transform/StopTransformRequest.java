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
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.stop_transform.Request

/**
 * Stops one or more transforms.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.stop_transform.Request">API
 *      specification</a>
 */

public class StopTransformRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean force;

	@Nullable
	private final Time timeout;

	private final String transformId;

	@Nullable
	private final Boolean waitForCheckpoint;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private StopTransformRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.force = builder.force;
		this.timeout = builder.timeout;
		this.transformId = ApiTypeHelper.requireNonNull(builder.transformId, this, "transformId");
		this.waitForCheckpoint = builder.waitForCheckpoint;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static StopTransformRequest of(Function<Builder, ObjectBuilder<StopTransformRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request: contains wildcard expressions and
	 * there are no transforms that match; contains the <code>_all</code> string or
	 * no identifiers and there are no matches; contains wildcard expressions and
	 * there are only partial matches.
	 * <p>
	 * If it is true, the API returns a successful acknowledgement message when
	 * there are no matches. When there are only partial matches, the API stops the
	 * appropriate transforms.
	 * <p>
	 * If it is false, the request returns a 404 status code when there are no
	 * matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * If it is true, the API forcefully stops the transforms.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Period to wait for a response when <code>wait_for_completion</code> is
	 * <code>true</code>. If no response is received before the timeout expires, the
	 * request returns a timeout exception. However, the request continues
	 * processing and eventually moves the transform to a STOPPED state.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Required - Identifier for the transform. To stop multiple transforms, use a
	 * comma-separated list or a wildcard expression. To stop all transforms, use
	 * <code>_all</code> or <code>*</code> as the identifier.
	 * <p>
	 * API name: {@code transform_id}
	 */
	public final String transformId() {
		return this.transformId;
	}

	/**
	 * If it is true, the transform does not completely stop until the current
	 * checkpoint is completed. If it is false, the transform stops as soon as
	 * possible.
	 * <p>
	 * API name: {@code wait_for_checkpoint}
	 */
	@Nullable
	public final Boolean waitForCheckpoint() {
		return this.waitForCheckpoint;
	}

	/**
	 * If it is true, the API blocks until the indexer state completely stops. If it
	 * is false, the API returns immediately and the indexer is stopped
	 * asynchronously in the background.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopTransformRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StopTransformRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean force;

		@Nullable
		private Time timeout;

		private String transformId;

		@Nullable
		private Boolean waitForCheckpoint;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Specifies what to do when the request: contains wildcard expressions and
		 * there are no transforms that match; contains the <code>_all</code> string or
		 * no identifiers and there are no matches; contains wildcard expressions and
		 * there are only partial matches.
		 * <p>
		 * If it is true, the API returns a successful acknowledgement message when
		 * there are no matches. When there are only partial matches, the API stops the
		 * appropriate transforms.
		 * <p>
		 * If it is false, the request returns a 404 status code when there are no
		 * matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * If it is true, the API forcefully stops the transforms.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Period to wait for a response when <code>wait_for_completion</code> is
		 * <code>true</code>. If no response is received before the timeout expires, the
		 * request returns a timeout exception. However, the request continues
		 * processing and eventually moves the transform to a STOPPED state.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response when <code>wait_for_completion</code> is
		 * <code>true</code>. If no response is received before the timeout expires, the
		 * request returns a timeout exception. However, the request continues
		 * processing and eventually moves the transform to a STOPPED state.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Identifier for the transform. To stop multiple transforms, use a
		 * comma-separated list or a wildcard expression. To stop all transforms, use
		 * <code>_all</code> or <code>*</code> as the identifier.
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * If it is true, the transform does not completely stop until the current
		 * checkpoint is completed. If it is false, the transform stops as soon as
		 * possible.
		 * <p>
		 * API name: {@code wait_for_checkpoint}
		 */
		public final Builder waitForCheckpoint(@Nullable Boolean value) {
			this.waitForCheckpoint = value;
			return this;
		}

		/**
		 * If it is true, the API blocks until the indexer state completely stops. If it
		 * is false, the API returns immediately and the indexer is stopped
		 * asynchronously in the background.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StopTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopTransformRequest build() {
			_checkSingleUse();

			return new StopTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.stop_transform}".
	 */
	public static final Endpoint<StopTransformRequest, StopTransformResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/transform.stop_transform",

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
					buf.append("/_stop");
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
				if (request.waitForCheckpoint != null) {
					params.put("wait_for_checkpoint", String.valueOf(request.waitForCheckpoint));
				}
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StopTransformResponse._DESERIALIZER);
}
