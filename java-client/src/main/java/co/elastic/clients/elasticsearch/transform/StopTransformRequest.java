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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.stop_transform.Request

public class StopTransformRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean force;

	@Nullable
	private final String timeout;

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
		this.transformId = ModelTypeHelper.requireNonNull(builder.transformId, this, "transformId");
		this.waitForCheckpoint = builder.waitForCheckpoint;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static StopTransformRequest of(Function<Builder, ObjectBuilder<StopTransformRequest>> fn) {
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
	 * Whether to force stop a failed transform or not. Default to false
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Controls the time to wait until the transform has stopped. Default to 30
	 * seconds
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Required - The id of the transform to stop
	 * <p>
	 * API name: {@code transform_id}
	 */
	public final String transformId() {
		return this.transformId;
	}

	/**
	 * Whether to wait for the transform to reach a checkpoint before stopping.
	 * Default to false
	 * <p>
	 * API name: {@code wait_for_checkpoint}
	 */
	@Nullable
	public final Boolean waitForCheckpoint() {
		return this.waitForCheckpoint;
	}

	/**
	 * Whether to wait for the transform to fully stop before returning or not.
	 * Default to false
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StopTransformRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean force;

		@Nullable
		private String timeout;

		private String transformId;

		@Nullable
		private Boolean waitForCheckpoint;

		@Nullable
		private Boolean waitForCompletion;

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
		 * Whether to force stop a failed transform or not. Default to false
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Controls the time to wait until the transform has stopped. Default to 30
		 * seconds
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Required - The id of the transform to stop
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * Whether to wait for the transform to reach a checkpoint before stopping.
		 * Default to false
		 * <p>
		 * API name: {@code wait_for_checkpoint}
		 */
		public final Builder waitForCheckpoint(@Nullable Boolean value) {
			this.waitForCheckpoint = value;
			return this;
		}

		/**
		 * Whether to wait for the transform to fully stop before returning or not.
		 * Default to false
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
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
	public static final Endpoint<StopTransformRequest, StopTransformResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StopTransformResponse._DESERIALIZER);
}
