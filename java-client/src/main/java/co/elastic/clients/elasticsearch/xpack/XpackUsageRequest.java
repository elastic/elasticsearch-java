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

package co.elastic.clients.elasticsearch.xpack;

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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Request

/**
 * Retrieves usage information about the installed X-Pack features.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/xpack/usage/XPackUsageRequest.ts#L23-L32">API
 *      specification</a>
 */

public class XpackUsageRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	// ---------------------------------------------------------------------------------------------

	private XpackUsageRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;

	}

	public static XpackUsageRequest of(Function<Builder, ObjectBuilder<XpackUsageRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specify timeout for watch write operation
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackUsageRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<XpackUsageRequest> {
		@Nullable
		private Time masterTimeout;

		/**
		 * Specify timeout for watch write operation
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Specify timeout for watch write operation
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Builds a {@link XpackUsageRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public XpackUsageRequest build() {
			_checkSingleUse();

			return new XpackUsageRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code xpack.usage}".
	 */
	public static final Endpoint<XpackUsageRequest, XpackUsageResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/xpack.usage",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_xpack/usage";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, XpackUsageResponse._DESERIALIZER);
}
