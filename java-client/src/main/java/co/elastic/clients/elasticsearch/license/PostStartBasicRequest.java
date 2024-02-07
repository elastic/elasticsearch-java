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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: license.post_start_basic.Request

/**
 * The start basic API enables you to initiate an indefinite basic license,
 * which gives access to all the basic features. If the basic license does not
 * support all of the features that are available with your current license,
 * however, you are notified in the response. You must then re-submit the API
 * request with the acknowledge parameter set to true. To check the status of
 * your basic license, use the following API: <a href=
 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-basic-status.html">Get
 * basic status</a>.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#license.post_start_basic.Request">API
 *      specification</a>
 */

public class PostStartBasicRequest extends RequestBase {
	@Nullable
	private final Boolean acknowledge;

	// ---------------------------------------------------------------------------------------------

	private PostStartBasicRequest(Builder builder) {

		this.acknowledge = builder.acknowledge;

	}

	public static PostStartBasicRequest of(Function<Builder, ObjectBuilder<PostStartBasicRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * whether the user has acknowledged acknowledge messages (default: false)
	 * <p>
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public final Boolean acknowledge() {
		return this.acknowledge;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartBasicRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PostStartBasicRequest> {
		@Nullable
		private Boolean acknowledge;

		/**
		 * whether the user has acknowledged acknowledge messages (default: false)
		 * <p>
		 * API name: {@code acknowledge}
		 */
		public final Builder acknowledge(@Nullable Boolean value) {
			this.acknowledge = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostStartBasicRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartBasicRequest build() {
			_checkSingleUse();

			return new PostStartBasicRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post_start_basic}".
	 */
	public static final Endpoint<PostStartBasicRequest, PostStartBasicResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/license.post_start_basic",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_license/start_basic";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.acknowledge != null) {
					params.put("acknowledge", String.valueOf(request.acknowledge));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, PostStartBasicResponse._DESERIALIZER);
}
