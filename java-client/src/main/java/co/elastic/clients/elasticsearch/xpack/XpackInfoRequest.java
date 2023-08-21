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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: xpack.info.Request

/**
 * Provides general information about the installed X-Pack features.
 * 
 * @see <a href="../doc-files/api-spec.html#xpack.info.Request">API
 *      specification</a>
 */

public class XpackInfoRequest extends RequestBase {
	@Nullable
	private final Boolean acceptEnterprise;

	private final List<String> categories;

	@Nullable
	private final Boolean human;

	// ---------------------------------------------------------------------------------------------

	private XpackInfoRequest(Builder builder) {

		this.acceptEnterprise = builder.acceptEnterprise;
		this.categories = ApiTypeHelper.unmodifiable(builder.categories);
		this.human = builder.human;

	}

	public static XpackInfoRequest of(Function<Builder, ObjectBuilder<XpackInfoRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If this param is used it must be set to true
	 * <p>
	 * API name: {@code accept_enterprise}
	 */
	@Nullable
	public final Boolean acceptEnterprise() {
		return this.acceptEnterprise;
	}

	/**
	 * A comma-separated list of the information categories to include in the
	 * response. For example, <code>build,license,features</code>.
	 * <p>
	 * API name: {@code categories}
	 */
	public final List<String> categories() {
		return this.categories;
	}

	/**
	 * Defines whether additional human-readable information is included in the
	 * response. In particular, it adds descriptions and a tag line.
	 * <p>
	 * API name: {@code human}
	 */
	@Nullable
	public final Boolean human() {
		return this.human;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackInfoRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<XpackInfoRequest> {
		@Nullable
		private Boolean acceptEnterprise;

		@Nullable
		private List<String> categories;

		@Nullable
		private Boolean human;

		/**
		 * If this param is used it must be set to true
		 * <p>
		 * API name: {@code accept_enterprise}
		 */
		public final Builder acceptEnterprise(@Nullable Boolean value) {
			this.acceptEnterprise = value;
			return this;
		}

		/**
		 * A comma-separated list of the information categories to include in the
		 * response. For example, <code>build,license,features</code>.
		 * <p>
		 * API name: {@code categories}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>categories</code>.
		 */
		public final Builder categories(List<String> list) {
			this.categories = _listAddAll(this.categories, list);
			return this;
		}

		/**
		 * A comma-separated list of the information categories to include in the
		 * response. For example, <code>build,license,features</code>.
		 * <p>
		 * API name: {@code categories}
		 * <p>
		 * Adds one or more values to <code>categories</code>.
		 */
		public final Builder categories(String value, String... values) {
			this.categories = _listAdd(this.categories, value, values);
			return this;
		}

		/**
		 * Defines whether additional human-readable information is included in the
		 * response. In particular, it adds descriptions and a tag line.
		 * <p>
		 * API name: {@code human}
		 */
		public final Builder human(@Nullable Boolean value) {
			this.human = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link XpackInfoRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public XpackInfoRequest build() {
			_checkSingleUse();

			return new XpackInfoRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code xpack.info}".
	 */
	public static final Endpoint<XpackInfoRequest, XpackInfoResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/xpack.info",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_xpack";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.categories)) {
					params.put("categories", request.categories.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.human != null) {
					params.put("human", String.valueOf(request.human));
				}
				if (request.acceptEnterprise != null) {
					params.put("accept_enterprise", String.valueOf(request.acceptEnterprise));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, XpackInfoResponse._DESERIALIZER);
}
