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

package co.elastic.clients.elasticsearch.rollup;

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

// typedef: rollup.stop_job.Request

/**
 * Stops an existing, started rollup job.
 * 
 * @see <a href="../doc-files/api-spec.html#rollup.stop_job.Request">API
 *      specification</a>
 */

public class StopJobRequest extends RequestBase {
	private final String id;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private StopJobRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.timeout = builder.timeout;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static StopJobRequest of(Function<Builder, ObjectBuilder<StopJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the job to stop
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Block for (at maximum) the specified duration while waiting for the job to
	 * stop. Defaults to 30s.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * True if the API should block until the job has fully stopped, false if should
	 * be executed async. Defaults to false.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<StopJobRequest> {
		private String id;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Required - The ID of the job to stop
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Block for (at maximum) the specified duration while waiting for the job to
		 * stop. Defaults to 30s.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Block for (at maximum) the specified duration while waiting for the job to
		 * stop. Defaults to 30s.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * True if the API should block until the job has fully stopped, false if should
		 * be executed async. Defaults to false.
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
		 * Builds a {@link StopJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopJobRequest build() {
			_checkSingleUse();

			return new StopJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.stop_job}".
	 */
	public static final Endpoint<StopJobRequest, StopJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/rollup.stop_job",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_rollup");
					buf.append("/job");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_stop");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StopJobResponse._DESERIALIZER);
}
