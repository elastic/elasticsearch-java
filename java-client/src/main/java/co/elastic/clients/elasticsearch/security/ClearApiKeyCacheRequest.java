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
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.clear_api_key_cache.Request
public final class ClearApiKeyCacheRequest extends RequestBase {
	private final List<String> ids;

	// ---------------------------------------------------------------------------------------------

	public ClearApiKeyCacheRequest(Builder builder) {

		this.ids = Objects.requireNonNull(builder.ids, "ids");

	}

	/**
	 * A comma-separated list of IDs of API keys to clear from the cache
	 * <p>
	 * API name: {@code ids}
	 */
	public List<String> ids() {
		return this.ids;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearApiKeyCacheRequest}.
	 */
	public static class Builder implements ObjectBuilder<ClearApiKeyCacheRequest> {
		private List<String> ids;

		/**
		 * A comma-separated list of IDs of API keys to clear from the cache
		 * <p>
		 * API name: {@code ids}
		 */
		public Builder ids(List<String> value) {
			this.ids = value;
			return this;
		}

		/**
		 * A comma-separated list of IDs of API keys to clear from the cache
		 * <p>
		 * API name: {@code ids}
		 */
		public Builder ids(String... value) {
			this.ids = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ids(List)}, creating the list if needed.
		 */
		public Builder addIds(String value) {
			if (this.ids == null) {
				this.ids = new ArrayList<>();
			}
			this.ids.add(value);
			return this;
		}

		/**
		 * Builds a {@link ClearApiKeyCacheRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearApiKeyCacheRequest build() {

			return new ClearApiKeyCacheRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_api_key_cache}".
	 */
	public static final Endpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _ids = 1 << 0;

				int propsSet = 0;

				if (request.ids() != null)
					propsSet |= _ids;

				if (propsSet == (_ids)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/api_key");
					buf.append("/");
					buf.append(request.ids.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_clear_cache");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, ClearApiKeyCacheResponse.DESERIALIZER);
}
