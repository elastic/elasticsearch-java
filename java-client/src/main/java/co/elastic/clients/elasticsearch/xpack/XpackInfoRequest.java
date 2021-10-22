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
import co.elastic.clients.transport.SimpleEndpoint;
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

// typedef: xpack.info.Request

public final class XpackInfoRequest extends RequestBase {
	@Nullable
	private final List<String> categories;

	// ---------------------------------------------------------------------------------------------

	public XpackInfoRequest(Builder builder) {

		this.categories = ModelTypeHelper.unmodifiable(builder.categories);

	}

	public XpackInfoRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Comma-separated list of info categories. Can be any of: build, license,
	 * features
	 * <p>
	 * API name: {@code categories}
	 */
	@Nullable
	public List<String> categories() {
		return this.categories;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackInfoRequest}.
	 */
	public static class Builder implements ObjectBuilder<XpackInfoRequest> {
		@Nullable
		private List<String> categories;

		/**
		 * Comma-separated list of info categories. Can be any of: build, license,
		 * features
		 * <p>
		 * API name: {@code categories}
		 */
		public Builder categories(@Nullable List<String> value) {
			this.categories = value;
			return this;
		}

		/**
		 * Comma-separated list of info categories. Can be any of: build, license,
		 * features
		 * <p>
		 * API name: {@code categories}
		 */
		public Builder categories(String... value) {
			this.categories = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #categories(List)}, creating the list if needed.
		 */
		public Builder addCategories(String value) {
			if (this.categories == null) {
				this.categories = new ArrayList<>();
			}
			this.categories.add(value);
			return this;
		}

		/**
		 * Builds a {@link XpackInfoRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public XpackInfoRequest build() {

			return new XpackInfoRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code xpack.info}".
	 */
	public static final Endpoint<XpackInfoRequest, XpackInfoResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
				if (request.categories != null) {
					params.put("categories", request.categories.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, XpackInfoResponse._DESERIALIZER);
}
