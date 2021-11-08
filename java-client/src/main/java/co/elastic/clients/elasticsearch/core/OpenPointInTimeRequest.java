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

package co.elastic.clients.elasticsearch.core;

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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.open_point_in_time.Request

public class OpenPointInTimeRequest extends RequestBase {
	private final List<String> index;

	@Nullable
	private final String keepAlive;

	// ---------------------------------------------------------------------------------------------

	private OpenPointInTimeRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.keepAlive = builder.keepAlive;

	}

	public static OpenPointInTimeRequest of(Function<Builder, ObjectBuilder<OpenPointInTimeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A comma-separated list of index names to open point in time; use
	 * <code>_all</code> or empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Specific the time to live for the point in time
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final String keepAlive() {
		return this.keepAlive;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenPointInTimeRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<OpenPointInTimeRequest> {
		private List<String> index;

		@Nullable
		private String keepAlive;

		/**
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Specific the time to live for the point in time
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Builds a {@link OpenPointInTimeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenPointInTimeRequest build() {
			_checkSingleUse();

			return new OpenPointInTimeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code open_point_in_time}".
	 */
	public static final Endpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_pit");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.keepAlive != null) {
					params.put("keep_alive", request.keepAlive);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, OpenPointInTimeResponse._DESERIALIZER);
}
