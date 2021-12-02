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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.open_point_in_time.Request

/**
 * Open a point in time that can be used in subsequent searches
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_global/open_point_in_time/OpenPointInTimeRequest.ts#L24-L36">API
 *      specification</a>
 */

public class OpenPointInTimeRequest extends RequestBase {
	private final List<String> index;

	private final Time keepAlive;

	// ---------------------------------------------------------------------------------------------

	private OpenPointInTimeRequest(Builder builder) {

		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.keepAlive = ApiTypeHelper.requireNonNull(builder.keepAlive, this, "keepAlive");

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
	 * Required - Specific the time to live for the point in time
	 * <p>
	 * API name: {@code keep_alive}
	 */
	public final Time keepAlive() {
		return this.keepAlive;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenPointInTimeRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<OpenPointInTimeRequest> {
		private List<String> index;

		private Time keepAlive;

		/**
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Required - Specific the time to live for the point in time
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Required - Specific the time to live for the point in time
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
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
	public static final Endpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/open_point_in_time",

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
				params.put("keep_alive", request.keepAlive._toJsonString());
				return params;

			}, SimpleEndpoint.emptyMap(), false, OpenPointInTimeResponse._DESERIALIZER);
}
