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
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: xpack.info.Request

/**
 * Retrieves information about the installed X-Pack features.
 * 
 * @see <a href="../doc-files/api-spec.html#xpack.info.Request">API
 *      specification</a>
 */

public class XpackInfoRequest extends RequestBase {
	private final List<String> categories;

	// ---------------------------------------------------------------------------------------------

	private XpackInfoRequest(Builder builder) {

		this.categories = ApiTypeHelper.unmodifiable(builder.categories);

	}

	public static XpackInfoRequest of(Function<Builder, ObjectBuilder<XpackInfoRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Comma-separated list of info categories. Can be any of: build, license,
	 * features
	 * <p>
	 * API name: {@code categories}
	 */
	public final List<String> categories() {
		return this.categories;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackInfoRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<XpackInfoRequest> {
		@Nullable
		private List<String> categories;

		/**
		 * Comma-separated list of info categories. Can be any of: build, license,
		 * features
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
		 * Comma-separated list of info categories. Can be any of: build, license,
		 * features
		 * <p>
		 * API name: {@code categories}
		 * <p>
		 * Adds one or more values to <code>categories</code>.
		 */
		public final Builder categories(String value, String... values) {
			this.categories = _listAdd(this.categories, value, values);
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.categories)) {
					params.put("categories", request.categories.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, XpackInfoResponse._DESERIALIZER);
}
