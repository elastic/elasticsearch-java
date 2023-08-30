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

package co.elastic.clients.elasticsearch.logstash;

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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: logstash.get_pipeline.Request

/**
 * Retrieves Logstash Pipelines used by Central Management
 * 
 * @see <a href="../doc-files/api-spec.html#logstash.get_pipeline.Request">API
 *      specification</a>
 */

public class GetPipelineRequest extends RequestBase {
	private final List<String> id;

	// ---------------------------------------------------------------------------------------------

	private GetPipelineRequest(Builder builder) {

		this.id = ApiTypeHelper.unmodifiableRequired(builder.id, this, "id");

	}

	public static GetPipelineRequest of(Function<Builder, ObjectBuilder<GetPipelineRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A comma-separated list of Pipeline IDs
	 * <p>
	 * API name: {@code id}
	 */
	public final List<String> id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPipelineRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetPipelineRequest> {
		private List<String> id;

		/**
		 * Required - A comma-separated list of Pipeline IDs
		 * <p>
		 * API name: {@code id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>id</code>.
		 */
		public final Builder id(List<String> list) {
			this.id = _listAddAll(this.id, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of Pipeline IDs
		 * <p>
		 * API name: {@code id}
		 * <p>
		 * Adds one or more values to <code>id</code>.
		 */
		public final Builder id(String value, String... values) {
			this.id = _listAdd(this.id, value, values);
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
	 * Endpoint "{@code logstash.get_pipeline}".
	 */
	public static final Endpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/logstash.get_pipeline",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_logstash");
					buf.append("/pipeline");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_logstash");
					buf.append("/pipeline");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == 0) {
				}
				if (propsSet == (_id)) {
					params.put("id", request.id.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetPipelineResponse._DESERIALIZER);
}
