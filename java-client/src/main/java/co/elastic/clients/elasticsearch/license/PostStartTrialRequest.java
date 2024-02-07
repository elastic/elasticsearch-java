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
import java.lang.String;
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

// typedef: license.post_start_trial.Request

/**
 * The start trial API enables you to start a 30-day trial, which gives access
 * to all subscription features.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#license.post_start_trial.Request">API
 *      specification</a>
 */

public class PostStartTrialRequest extends RequestBase {
	@Nullable
	private final Boolean acknowledge;

	@Nullable
	private final String typeQueryString;

	// ---------------------------------------------------------------------------------------------

	private PostStartTrialRequest(Builder builder) {

		this.acknowledge = builder.acknowledge;
		this.typeQueryString = builder.typeQueryString;

	}

	public static PostStartTrialRequest of(Function<Builder, ObjectBuilder<PostStartTrialRequest>> fn) {
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

	/**
	 * API name: {@code type_query_string}
	 */
	@Nullable
	public final String typeQueryString() {
		return this.typeQueryString;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartTrialRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PostStartTrialRequest> {
		@Nullable
		private Boolean acknowledge;

		@Nullable
		private String typeQueryString;

		/**
		 * whether the user has acknowledged acknowledge messages (default: false)
		 * <p>
		 * API name: {@code acknowledge}
		 */
		public final Builder acknowledge(@Nullable Boolean value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * API name: {@code type_query_string}
		 */
		public final Builder typeQueryString(@Nullable String value) {
			this.typeQueryString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostStartTrialRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartTrialRequest build() {
			_checkSingleUse();

			return new PostStartTrialRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post_start_trial}".
	 */
	public static final Endpoint<PostStartTrialRequest, PostStartTrialResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/license.post_start_trial",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_license/start_trial";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.typeQueryString != null) {
					params.put("type_query_string", request.typeQueryString);
				}
				if (request.acknowledge != null) {
					params.put("acknowledge", String.valueOf(request.acknowledge));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, PostStartTrialResponse._DESERIALIZER);
}
