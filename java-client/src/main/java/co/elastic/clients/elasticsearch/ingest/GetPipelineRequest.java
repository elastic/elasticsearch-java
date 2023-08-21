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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.get_pipeline.Request

/**
 * Returns a pipeline.
 * 
 * @see <a href="../doc-files/api-spec.html#ingest.get_pipeline.Request">API
 *      specification</a>
 */

public class GetPipelineRequest extends RequestBase {
	@Nullable
	private final String id;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Boolean summary;

	// ---------------------------------------------------------------------------------------------

	private GetPipelineRequest(Builder builder) {

		this.id = builder.id;
		this.masterTimeout = builder.masterTimeout;
		this.summary = builder.summary;

	}

	public static GetPipelineRequest of(Function<Builder, ObjectBuilder<GetPipelineRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Comma separated list of pipeline ids. Wildcards supported
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Return pipelines without their definitions (default: false)
	 * <p>
	 * API name: {@code summary}
	 */
	@Nullable
	public final Boolean summary() {
		return this.summary;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPipelineRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetPipelineRequest> {
		@Nullable
		private String id;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Boolean summary;

		/**
		 * Comma separated list of pipeline ids. Wildcards supported
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Return pipelines without their definitions (default: false)
		 * <p>
		 * API name: {@code summary}
		 */
		public final Builder summary(@Nullable Boolean value) {
			this.summary = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetPipelineRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPipelineRequest build() {
			_checkSingleUse();

			return new GetPipelineRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.get_pipeline}".
	 */
	public static final Endpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ingest.get_pipeline",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/pipeline");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/pipeline");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
				}
				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.summary != null) {
					params.put("summary", String.valueOf(request.summary));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetPipelineResponse._DESERIALIZER);
}
