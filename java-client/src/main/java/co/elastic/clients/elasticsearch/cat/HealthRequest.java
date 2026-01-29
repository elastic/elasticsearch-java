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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.TimeUnit;
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

// typedef: cat.health.Request

/**
 * Get the cluster health status.
 * <p>
 * IMPORTANT: CAT APIs are only intended for human consumption using the command
 * line or Kibana console. They are not intended for use by applications. For
 * application consumption, use the cluster health API. This API is often used
 * to check malfunctioning clusters. To help you track cluster health alongside
 * log files and alerting systems, the API returns timestamps in two formats:
 * <code>HH:MM:SS</code>, which is human-readable but includes no date
 * information; <code>Unix epoch time</code>, which is machine-sortable and
 * includes date information. The latter format is useful for cluster recoveries
 * that take multiple days. You can use the cat health API to verify cluster
 * health across multiple nodes. You also can use the API to track the recovery
 * of a large cluster over a longer period of time.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.health.Request">API
 *      specification</a>
 */

public class HealthRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	private final List<String> h;

	private final List<String> s;

	@Nullable
	private final TimeUnit time;

	@Nullable
	private final Boolean ts;

	// ---------------------------------------------------------------------------------------------

	private HealthRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.h = ApiTypeHelper.unmodifiable(builder.h);
		this.s = ApiTypeHelper.unmodifiable(builder.s);
		this.time = builder.time;
		this.ts = builder.ts;

	}

	public static HealthRequest of(Function<Builder, ObjectBuilder<HealthRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Sets the units for columns that contain a byte-size value. Note that
	 * byte-size value units work in terms of powers of 1024. For instance
	 * <code>1kb</code> means 1024 bytes, not 1000 bytes. If omitted, byte-size
	 * values are rendered with a suffix such as <code>kb</code>, <code>mb</code>,
	 * or <code>gb</code>, chosen such that the numeric value of the column is as
	 * small as possible whilst still being at least <code>1.0</code>. If given,
	 * byte-size values are rendered as an integer with no suffix, representing the
	 * value of the column in the chosen unit. Values that are not an exact multiple
	 * of the chosen unit are rounded down.
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
	}

	/**
	 * List of columns to appear in the response. Supports simple wildcards.
	 * <p>
	 * API name: {@code h}
	 */
	public final List<String> h() {
		return this.h;
	}

	/**
	 * List of columns that determine how the table should be sorted. Sorting
	 * defaults to ascending and can be changed by setting <code>:asc</code> or
	 * <code>:desc</code> as a suffix to the column name.
	 * <p>
	 * API name: {@code s}
	 */
	public final List<String> s() {
		return this.s;
	}

	/**
	 * Sets the units for columns that contain a time duration. If omitted, time
	 * duration values are rendered with a suffix such as <code>ms</code>,
	 * <code>s</code>, <code>m</code> or <code>h</code>, chosen such that the
	 * numeric value of the column is as small as possible whilst still being at
	 * least <code>1.0</code>. If given, time duration values are rendered as an
	 * integer with no suffix. Values that are not an exact multiple of the chosen
	 * unit are rounded down.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final TimeUnit time() {
		return this.time;
	}

	/**
	 * If true, returns <code>HH:MM:SS</code> and Unix epoch timestamps.
	 * <p>
	 * API name: {@code ts}
	 */
	@Nullable
	public final Boolean ts() {
		return this.ts;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HealthRequest> {
		@Nullable
		private Bytes bytes;

		@Nullable
		private List<String> h;

		@Nullable
		private List<String> s;

		@Nullable
		private TimeUnit time;

		@Nullable
		private Boolean ts;

		public Builder() {
		}
		private Builder(HealthRequest instance) {
			this.bytes = instance.bytes;
			this.h = instance.h;
			this.s = instance.s;
			this.time = instance.time;
			this.ts = instance.ts;

		}
		/**
		 * Sets the units for columns that contain a byte-size value. Note that
		 * byte-size value units work in terms of powers of 1024. For instance
		 * <code>1kb</code> means 1024 bytes, not 1000 bytes. If omitted, byte-size
		 * values are rendered with a suffix such as <code>kb</code>, <code>mb</code>,
		 * or <code>gb</code>, chosen such that the numeric value of the column is as
		 * small as possible whilst still being at least <code>1.0</code>. If given,
		 * byte-size values are rendered as an integer with no suffix, representing the
		 * value of the column in the chosen unit. Values that are not an exact multiple
		 * of the chosen unit are rounded down.
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * List of columns to appear in the response. Supports simple wildcards.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>h</code>.
		 */
		public final Builder h(List<String> list) {
			this.h = _listAddAll(this.h, list);
			return this;
		}

		/**
		 * List of columns to appear in the response. Supports simple wildcards.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds one or more values to <code>h</code>.
		 */
		public final Builder h(String value, String... values) {
			this.h = _listAdd(this.h, value, values);
			return this;
		}

		/**
		 * List of columns that determine how the table should be sorted. Sorting
		 * defaults to ascending and can be changed by setting <code>:asc</code> or
		 * <code>:desc</code> as a suffix to the column name.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>s</code>.
		 */
		public final Builder s(List<String> list) {
			this.s = _listAddAll(this.s, list);
			return this;
		}

		/**
		 * List of columns that determine how the table should be sorted. Sorting
		 * defaults to ascending and can be changed by setting <code>:asc</code> or
		 * <code>:desc</code> as a suffix to the column name.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds one or more values to <code>s</code>.
		 */
		public final Builder s(String value, String... values) {
			this.s = _listAdd(this.s, value, values);
			return this;
		}

		/**
		 * Sets the units for columns that contain a time duration. If omitted, time
		 * duration values are rendered with a suffix such as <code>ms</code>,
		 * <code>s</code>, <code>m</code> or <code>h</code>, chosen such that the
		 * numeric value of the column is as small as possible whilst still being at
		 * least <code>1.0</code>. If given, time duration values are rendered as an
		 * integer with no suffix. Values that are not an exact multiple of the chosen
		 * unit are rounded down.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable TimeUnit value) {
			this.time = value;
			return this;
		}

		/**
		 * If true, returns <code>HH:MM:SS</code> and Unix epoch timestamps.
		 * <p>
		 * API name: {@code ts}
		 */
		public final Builder ts(@Nullable Boolean value) {
			this.ts = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HealthRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthRequest build() {
			_checkSingleUse();

			return new HealthRequest(this);
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
	 * Endpoint "{@code cat.health}".
	 */
	public static final Endpoint<HealthRequest, HealthResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.health",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/health";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (ApiTypeHelper.isDefined(request.s)) {
					params.put("s", request.s.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				if (ApiTypeHelper.isDefined(request.h)) {
					params.put("h", request.h.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				if (request.ts != null) {
					params.put("ts", String.valueOf(request.ts));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, HealthResponse._DESERIALIZER);
}
