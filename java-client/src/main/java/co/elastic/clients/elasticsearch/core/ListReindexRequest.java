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

package co.elastic.clients.elasticsearch.core;

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

// typedef: _global.list_reindex.Request

/**
 * List active reindex tasks.
 * <p>
 * Get information about all currently running reindex tasks.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.list_reindex.Request">API
 *      specification</a>
 */

public class ListReindexRequest extends RequestBase {
	@Nullable
	private final Boolean detailed;

	// ---------------------------------------------------------------------------------------------

	private ListReindexRequest(Builder builder) {

		this.detailed = builder.detailed;

	}

	public static ListReindexRequest of(Function<Builder, ObjectBuilder<ListReindexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, include detailed task status information in the
	 * response.
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public final Boolean detailed() {
		return this.detailed;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListReindexRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ListReindexRequest> {
		@Nullable
		private Boolean detailed;

		public Builder() {
		}
		private Builder(ListReindexRequest instance) {
			this.detailed = instance.detailed;

		}
		/**
		 * If <code>true</code>, include detailed task status information in the
		 * response.
		 * <p>
		 * API name: {@code detailed}
		 */
		public final Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListReindexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListReindexRequest build() {
			_checkSingleUse();

			return new ListReindexRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code list_reindex}".
	 */
	public static final Endpoint<ListReindexRequest, ListReindexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/list_reindex",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_reindex";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ListReindexResponse._DESERIALIZER);
}
