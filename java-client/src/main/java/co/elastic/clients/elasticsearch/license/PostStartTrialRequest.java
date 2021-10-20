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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post_start_trial.Request

public final class PostStartTrialRequest extends RequestBase {
	@Nullable
	private final Boolean acknowledge;

	@Nullable
	private final String typeQueryString;

	// ---------------------------------------------------------------------------------------------

	public PostStartTrialRequest(Builder builder) {

		this.acknowledge = builder.acknowledge;
		this.typeQueryString = builder.typeQueryString;

	}

	public PostStartTrialRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * whether the user has acknowledged acknowledge messages (default: false)
	 * <p>
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public Boolean acknowledge() {
		return this.acknowledge;
	}

	/**
	 * API name: {@code type_query_string}
	 */
	@Nullable
	public String typeQueryString() {
		return this.typeQueryString;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartTrialRequest}.
	 */
	public static class Builder implements ObjectBuilder<PostStartTrialRequest> {
		@Nullable
		private Boolean acknowledge;

		@Nullable
		private String typeQueryString;

		/**
		 * whether the user has acknowledged acknowledge messages (default: false)
		 * <p>
		 * API name: {@code acknowledge}
		 */
		public Builder acknowledge(@Nullable Boolean value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * API name: {@code type_query_string}
		 */
		public Builder typeQueryString(@Nullable String value) {
			this.typeQueryString = value;
			return this;
		}

		/**
		 * Builds a {@link PostStartTrialRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartTrialRequest build() {

			return new PostStartTrialRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post_start_trial}".
	 */
	public static final Endpoint<PostStartTrialRequest, PostStartTrialResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_license/start_trial";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.acknowledge != null) {
					params.put("acknowledge", String.valueOf(request.acknowledge));
				}
				if (request.typeQueryString != null) {
					params.put("type_query_string", request.typeQueryString);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, PostStartTrialResponse._DESERIALIZER);
}
