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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
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

// typedef: security.enable_user_profile.Request

/**
 * Enable a user profile.
 * <p>
 * Enable user profiles to make them visible in user profile searches.
 * <p>
 * NOTE: The user profile feature is designed only for use by Kibana and
 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
 * Individual users and external applications should not call this API directly.
 * Elastic reserves the right to change or remove this feature in future
 * releases without prior notice.
 * <p>
 * When you activate a user profile, it's automatically enabled and visible in
 * user profile searches. If you later disable the user profile, you can use the
 * enable user profile API to make the profile visible in these searches again.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.enable_user_profile.Request">API
 *      specification</a>
 */

public class EnableUserProfileRequest extends RequestBase {
	@Nullable
	private final Refresh refresh;

	private final String uid;

	// ---------------------------------------------------------------------------------------------

	private EnableUserProfileRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.uid = ApiTypeHelper.requireNonNull(builder.uid, this, "uid");

	}

	public static EnableUserProfileRequest of(Function<Builder, ObjectBuilder<EnableUserProfileRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If 'true', Elasticsearch refreshes the affected shards to make this operation
	 * visible to search. If 'wait_for', it waits for a refresh to make this
	 * operation visible to search. If 'false', nothing is done with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * Required - A unique identifier for the user profile.
	 * <p>
	 * API name: {@code uid}
	 */
	public final String uid() {
		return this.uid;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnableUserProfileRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<EnableUserProfileRequest> {
		@Nullable
		private Refresh refresh;

		private String uid;

		/**
		 * If 'true', Elasticsearch refreshes the affected shards to make this operation
		 * visible to search. If 'wait_for', it waits for a refresh to make this
		 * operation visible to search. If 'false', nothing is done with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - A unique identifier for the user profile.
		 * <p>
		 * API name: {@code uid}
		 */
		public final Builder uid(String value) {
			this.uid = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnableUserProfileRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnableUserProfileRequest build() {
			_checkSingleUse();

			return new EnableUserProfileRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.enable_user_profile}".
	 */
	public static final Endpoint<EnableUserProfileRequest, EnableUserProfileResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.enable_user_profile",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _uid = 1 << 0;

				int propsSet = 0;

				propsSet |= _uid;

				if (propsSet == (_uid)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/profile");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.uid, buf);
					buf.append("/_enable");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _uid = 1 << 0;

				int propsSet = 0;

				propsSet |= _uid;

				if (propsSet == (_uid)) {
					params.put("uid", request.uid);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, EnableUserProfileResponse._DESERIALIZER);
}
