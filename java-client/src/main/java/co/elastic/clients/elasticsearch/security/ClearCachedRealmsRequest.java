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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.clear_cached_realms.Request

public final class ClearCachedRealmsRequest extends RequestBase {
	private final List<String> realms;

	@Nullable
	private final List<String> usernames;

	// ---------------------------------------------------------------------------------------------

	public ClearCachedRealmsRequest(Builder builder) {

		this.realms = ModelTypeHelper.unmodifiableNonNull(builder.realms, "realms");
		this.usernames = ModelTypeHelper.unmodifiable(builder.usernames);

	}

	public ClearCachedRealmsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Comma-separated list of realms to clear
	 * <p>
	 * API name: {@code realms}
	 */
	public List<String> realms() {
		return this.realms;
	}

	/**
	 * Comma-separated list of usernames to clear from the cache
	 * <p>
	 * API name: {@code usernames}
	 */
	@Nullable
	public List<String> usernames() {
		return this.usernames;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedRealmsRequest}.
	 */
	public static class Builder implements ObjectBuilder<ClearCachedRealmsRequest> {
		private List<String> realms;

		@Nullable
		private List<String> usernames;

		/**
		 * Comma-separated list of realms to clear
		 * <p>
		 * API name: {@code realms}
		 */
		public Builder realms(List<String> value) {
			this.realms = value;
			return this;
		}

		/**
		 * Comma-separated list of realms to clear
		 * <p>
		 * API name: {@code realms}
		 */
		public Builder realms(String... value) {
			this.realms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #realms(List)}, creating the list if needed. 4
		 */
		public Builder addRealms(String value) {
			if (this.realms == null) {
				this.realms = new ArrayList<>();
			}
			this.realms.add(value);
			return this;
		}

		/**
		 * Comma-separated list of usernames to clear from the cache
		 * <p>
		 * API name: {@code usernames}
		 */
		public Builder usernames(@Nullable List<String> value) {
			this.usernames = value;
			return this;
		}

		/**
		 * Comma-separated list of usernames to clear from the cache
		 * <p>
		 * API name: {@code usernames}
		 */
		public Builder usernames(String... value) {
			this.usernames = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #usernames(List)}, creating the list if needed. 4
		 */
		public Builder addUsernames(String value) {
			if (this.usernames == null) {
				this.usernames = new ArrayList<>();
			}
			this.usernames.add(value);
			return this;
		}

		/**
		 * Builds a {@link ClearCachedRealmsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedRealmsRequest build() {

			return new ClearCachedRealmsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_cached_realms}".
	 */
	public static final Endpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.usernames != null) {
					params.put("usernames", request.usernames.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ClearCachedRealmsResponse._DESERIALIZER);
}
