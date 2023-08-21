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

// typedef: security.clear_cached_realms.Request

/**
 * Evicts users from the user cache. Can completely clear the cache or evict
 * specific users.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.clear_cached_realms.Request">API
 *      specification</a>
 */

public class ClearCachedRealmsRequest extends RequestBase {
	private final List<String> realms;

	private final List<String> usernames;

	// ---------------------------------------------------------------------------------------------

	private ClearCachedRealmsRequest(Builder builder) {

		this.realms = ApiTypeHelper.unmodifiableRequired(builder.realms, this, "realms");
		this.usernames = ApiTypeHelper.unmodifiable(builder.usernames);

	}

	public static ClearCachedRealmsRequest of(Function<Builder, ObjectBuilder<ClearCachedRealmsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Comma-separated list of realms to clear
	 * <p>
	 * API name: {@code realms}
	 */
	public final List<String> realms() {
		return this.realms;
	}

	/**
	 * Comma-separated list of usernames to clear from the cache
	 * <p>
	 * API name: {@code usernames}
	 */
	public final List<String> usernames() {
		return this.usernames;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedRealmsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ClearCachedRealmsRequest> {
		private List<String> realms;

		@Nullable
		private List<String> usernames;

		/**
		 * Required - Comma-separated list of realms to clear
		 * <p>
		 * API name: {@code realms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>realms</code>.
		 */
		public final Builder realms(List<String> list) {
			this.realms = _listAddAll(this.realms, list);
			return this;
		}

		/**
		 * Required - Comma-separated list of realms to clear
		 * <p>
		 * API name: {@code realms}
		 * <p>
		 * Adds one or more values to <code>realms</code>.
		 */
		public final Builder realms(String value, String... values) {
			this.realms = _listAdd(this.realms, value, values);
			return this;
		}

		/**
		 * Comma-separated list of usernames to clear from the cache
		 * <p>
		 * API name: {@code usernames}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>usernames</code>.
		 */
		public final Builder usernames(List<String> list) {
			this.usernames = _listAddAll(this.usernames, list);
			return this;
		}

		/**
		 * Comma-separated list of usernames to clear from the cache
		 * <p>
		 * API name: {@code usernames}
		 * <p>
		 * Adds one or more values to <code>usernames</code>.
		 */
		public final Builder usernames(String value, String... values) {
			this.usernames = _listAdd(this.usernames, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClearCachedRealmsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedRealmsRequest build() {
			_checkSingleUse();

			return new ClearCachedRealmsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_cached_realms}".
	 */
	public static final Endpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.clear_cached_realms",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _realms = 1 << 0;

				int propsSet = 0;

				propsSet |= _realms;

				if (propsSet == (_realms)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/realm");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.realms.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/_clear_cache");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _realms = 1 << 0;

				int propsSet = 0;

				propsSet |= _realms;

				if (propsSet == (_realms)) {
					params.put("realms", request.realms.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.usernames)) {
					params.put("usernames", request.usernames.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ClearCachedRealmsResponse._DESERIALIZER);
}
