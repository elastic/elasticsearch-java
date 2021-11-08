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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_filters.Request

public class GetFiltersRequest extends RequestBase {
	@Nullable
	private final String filterId;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private GetFiltersRequest(Builder builder) {

		this.filterId = builder.filterId;
		this.from = builder.from;
		this.size = builder.size;

	}

	public static GetFiltersRequest of(Function<Builder, ObjectBuilder<GetFiltersRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A string that uniquely identifies a filter.
	 * <p>
	 * API name: {@code filter_id}
	 */
	@Nullable
	public final String filterId() {
		return this.filterId;
	}

	/**
	 * Skips the specified number of filters.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of filters to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFiltersRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetFiltersRequest> {
		@Nullable
		private String filterId;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		/**
		 * A string that uniquely identifies a filter.
		 * <p>
		 * API name: {@code filter_id}
		 */
		public final Builder filterId(@Nullable String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * Skips the specified number of filters.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of filters to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link GetFiltersRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFiltersRequest build() {
			_checkSingleUse();

			return new GetFiltersRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_filters}".
	 */
	public static final Endpoint<GetFiltersRequest, GetFiltersResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _filterId = 1 << 0;

				int propsSet = 0;

				if (request.filterId() != null)
					propsSet |= _filterId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/filters");
					return buf.toString();
				}
				if (propsSet == (_filterId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/filters");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.filterId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetFiltersResponse._DESERIALIZER);
}
