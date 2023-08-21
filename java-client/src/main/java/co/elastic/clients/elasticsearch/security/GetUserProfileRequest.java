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

package co.elastic.clients.elasticsearch.security;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.get_user_profile.Request

/**
 * Retrieves a user's profile using the unique profile ID.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_user_profile.Request">API
 *      specification</a>
 */

public class GetUserProfileRequest extends RequestBase {
	private final List<String> data;

	private final List<String> uid;

	// ---------------------------------------------------------------------------------------------

	private GetUserProfileRequest(Builder builder) {

		this.data = ApiTypeHelper.unmodifiable(builder.data);
		this.uid = ApiTypeHelper.unmodifiableRequired(builder.uid, this, "uid");

	}

	public static GetUserProfileRequest of(Function<Builder, ObjectBuilder<GetUserProfileRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * List of filters for the <code>data</code> field of the profile document. To
	 * return all content use <code>data=*</code>. To return a subset of content use
	 * <code>data=&lt;key&gt;</code> to retrieve content nested under the specified
	 * <code>&lt;key&gt;</code>. By default returns no <code>data</code> content.
	 * <p>
	 * API name: {@code data}
	 */
	public final List<String> data() {
		return this.data;
	}

	/**
	 * Required - A unique identifier for the user profile.
	 * <p>
	 * API name: {@code uid}
	 */
	public final List<String> uid() {
		return this.uid;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUserProfileRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetUserProfileRequest> {
		@Nullable
		private List<String> data;

		private List<String> uid;

		/**
		 * List of filters for the <code>data</code> field of the profile document. To
		 * return all content use <code>data=*</code>. To return a subset of content use
		 * <code>data=&lt;key&gt;</code> to retrieve content nested under the specified
		 * <code>&lt;key&gt;</code>. By default returns no <code>data</code> content.
		 * <p>
		 * API name: {@code data}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>data</code>.
		 */
		public final Builder data(List<String> list) {
			this.data = _listAddAll(this.data, list);
			return this;
		}

		/**
		 * List of filters for the <code>data</code> field of the profile document. To
		 * return all content use <code>data=*</code>. To return a subset of content use
		 * <code>data=&lt;key&gt;</code> to retrieve content nested under the specified
		 * <code>&lt;key&gt;</code>. By default returns no <code>data</code> content.
		 * <p>
		 * API name: {@code data}
		 * <p>
		 * Adds one or more values to <code>data</code>.
		 */
		public final Builder data(String value, String... values) {
			this.data = _listAdd(this.data, value, values);
			return this;
		}

		/**
		 * Required - A unique identifier for the user profile.
		 * <p>
		 * API name: {@code uid}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>uid</code>.
		 */
		public final Builder uid(List<String> list) {
			this.uid = _listAddAll(this.uid, list);
			return this;
		}

		/**
		 * Required - A unique identifier for the user profile.
		 * <p>
		 * API name: {@code uid}
		 * <p>
		 * Adds one or more values to <code>uid</code>.
		 */
		public final Builder uid(String value, String... values) {
			this.uid = _listAdd(this.uid, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetUserProfileRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserProfileRequest build() {
			_checkSingleUse();

			return new GetUserProfileRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_user_profile}".
	 */
	public static final Endpoint<GetUserProfileRequest, GetUserProfileResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_user_profile",

			// Request method
			request -> {
				return "GET";

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
					SimpleEndpoint.pathEncode(request.uid.stream().map(v -> v).collect(Collectors.joining(",")), buf);
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
					params.put("uid", request.uid.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.data)) {
					params.put("data", request.data.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetUserProfileResponse._DESERIALIZER);
}
