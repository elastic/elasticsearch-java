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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.ml_data_frame_analytics.Request

/**
 * Returns configuration and usage information about data frame analytics jobs.
 * <p>
 * IMPORTANT: cat APIs are only intended for human consumption using the Kibana
 * console or command line. They are not intended for use by applications. For
 * application consumption, use the get data frame analytics jobs statistics
 * API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#cat.ml_data_frame_analytics.Request">API
 *      specification</a>
 */

public class MlDataFrameAnalyticsRequest extends CatRequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Bytes bytes;

	private final List<CatDfaColumn> h;

	@Nullable
	private final String id;

	private final List<CatDfaColumn> s;

	@Nullable
	private final Time time;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.bytes = builder.bytes;
		this.h = ApiTypeHelper.unmodifiable(builder.h);
		this.id = builder.id;
		this.s = ApiTypeHelper.unmodifiable(builder.s);
		this.time = builder.time;

	}

	public static MlDataFrameAnalyticsRequest of(Function<Builder, ObjectBuilder<MlDataFrameAnalyticsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard expression matches no configs. (This includes
	 * <code>_all</code> string or when no configs have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * The unit in which to display byte values
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
	}

	/**
	 * Comma-separated list of column names to display.
	 * <p>
	 * API name: {@code h}
	 */
	public final List<CatDfaColumn> h() {
		return this.h;
	}

	/**
	 * The ID of the data frame analytics to fetch
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Comma-separated list of column names or column aliases used to sort the
	 * response.
	 * <p>
	 * API name: {@code s}
	 */
	public final List<CatDfaColumn> s() {
		return this.s;
	}

	/**
	 * Unit used to display time values.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final Time time() {
		return this.time;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MlDataFrameAnalyticsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Bytes bytes;

		@Nullable
		private List<CatDfaColumn> h;

		@Nullable
		private String id;

		@Nullable
		private List<CatDfaColumn> s;

		@Nullable
		private Time time;

		/**
		 * Whether to ignore if a wildcard expression matches no configs. (This includes
		 * <code>_all</code> string or when no configs have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * The unit in which to display byte values
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Comma-separated list of column names to display.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>h</code>.
		 */
		public final Builder h(List<CatDfaColumn> list) {
			this.h = _listAddAll(this.h, list);
			return this;
		}

		/**
		 * Comma-separated list of column names to display.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds one or more values to <code>h</code>.
		 */
		public final Builder h(CatDfaColumn value, CatDfaColumn... values) {
			this.h = _listAdd(this.h, value, values);
			return this;
		}

		/**
		 * The ID of the data frame analytics to fetch
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Comma-separated list of column names or column aliases used to sort the
		 * response.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>s</code>.
		 */
		public final Builder s(List<CatDfaColumn> list) {
			this.s = _listAddAll(this.s, list);
			return this;
		}

		/**
		 * Comma-separated list of column names or column aliases used to sort the
		 * response.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds one or more values to <code>s</code>.
		 */
		public final Builder s(CatDfaColumn value, CatDfaColumn... values) {
			this.s = _listAdd(this.s, value, values);
			return this;
		}

		/**
		 * Unit used to display time values.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable Time value) {
			this.time = value;
			return this;
		}

		/**
		 * Unit used to display time values.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.time(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsRequest build() {
			_checkSingleUse();

			return new MlDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.ml_data_frame_analytics}".
	 */
	public static final Endpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.ml_data_frame_analytics",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
				}
				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (ApiTypeHelper.isDefined(request.s)) {
					params.put("s", request.s.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				if (ApiTypeHelper.isDefined(request.h)) {
					params.put("h", request.h.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.time != null) {
					params.put("time", request.time._toJsonString());
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, MlDataFrameAnalyticsResponse._DESERIALIZER);
}
