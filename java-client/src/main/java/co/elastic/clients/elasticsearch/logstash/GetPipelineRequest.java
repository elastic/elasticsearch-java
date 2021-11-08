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
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: logstash.get_pipeline.Request

public class GetPipelineRequest extends RequestBase {
	private final List<String> id;

	// ---------------------------------------------------------------------------------------------

	private GetPipelineRequest(Builder builder) {

		this.id = ModelTypeHelper.unmodifiableRequired(builder.id, this, "id");

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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetPipelineRequest> {
		private List<String> id;

		/**
		 * Required - A comma-separated list of Pipeline IDs
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(List<String> value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of Pipeline IDs
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String... value) {
			this.id = Arrays.asList(value);
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
	public static final Endpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetPipelineResponse._DESERIALIZER);
}
