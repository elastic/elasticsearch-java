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

// typedef: cat.ml_datafeeds.Request

/**
 * Returns configuration and usage information about datafeeds. This API returns
 * a maximum of 10,000 datafeeds. If the Elasticsearch security features are
 * enabled, you must have <code>monitor_ml</code>, <code>monitor</code>,
 * <code>manage_ml</code>, or <code>manage</code> cluster privileges to use this
 * API.
 * <p>
 * IMPORTANT: cat APIs are only intended for human consumption using the Kibana
 * console or command line. They are not intended for use by applications. For
 * application consumption, use the get datafeed statistics API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.ml_datafeeds.Request">API
 *      specification</a>
 */

public class MlDatafeedsRequest extends CatRequestBase {
	@Nullable
	private final Boolean allowNoDatafeeds;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final String datafeedId;

	@Nullable
	private final String format;

	private final List<CatDatafeedColumn> h;

	@Nullable
	private final Boolean help;

	private final List<CatDatafeedColumn> s;

	@Nullable
	private final TimeUnit time;

	@Nullable
	private final Boolean v;

	// ---------------------------------------------------------------------------------------------

	private MlDatafeedsRequest(Builder builder) {

		this.allowNoDatafeeds = builder.allowNoDatafeeds;
		this.allowNoMatch = builder.allowNoMatch;
		this.datafeedId = builder.datafeedId;
		this.format = builder.format;
		this.h = ApiTypeHelper.unmodifiable(builder.h);
		this.help = builder.help;
		this.s = ApiTypeHelper.unmodifiable(builder.s);
		this.time = builder.time;
		this.v = builder.v;

	}

	public static MlDatafeedsRequest of(Function<Builder, ObjectBuilder<MlDatafeedsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard expression matches no datafeeds. (This
	 * includes <code>_all</code> string or when no datafeeds have been specified)
	 * <p>
	 * API name: {@code allow_no_datafeeds}
	 * 
	 * @deprecated 7.10.0 Use <code>allow_no_match</code> instead.
	 */
	@Deprecated
	@Nullable
	public final Boolean allowNoDatafeeds() {
		return this.allowNoDatafeeds;
	}

	/**
	 * Specifies what to do when the request:
	 * <ul>
	 * <li>Contains wildcard expressions and there are no datafeeds that match.</li>
	 * <li>Contains the <code>_all</code> string or no identifiers and there are no
	 * matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ul>
	 * <p>
	 * If <code>true</code>, the API returns an empty datafeeds array when there are
	 * no matches and the subset of results when there are partial matches. If
	 * <code>false</code>, the API returns a 404 status code when there are no
	 * matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * A numerical character string that uniquely identifies the datafeed.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Short version of the HTTP accept header. Valid values include JSON, YAML, for
	 * example.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * Comma-separated list of column names to display.
	 * <p>
	 * API name: {@code h}
	 */
	public final List<CatDatafeedColumn> h() {
		return this.h;
	}

	/**
	 * If <code>true</code>, the response includes help information.
	 * <p>
	 * API name: {@code help}
	 */
	@Nullable
	public final Boolean help() {
		return this.help;
	}

	/**
	 * Comma-separated list of column names or column aliases used to sort the
	 * response.
	 * <p>
	 * API name: {@code s}
	 */
	public final List<CatDatafeedColumn> s() {
		return this.s;
	}

	/**
	 * The unit used to display time values.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final TimeUnit time() {
		return this.time;
	}

	/**
	 * If <code>true</code>, the response includes column headings.
	 * <p>
	 * API name: {@code v}
	 */
	@Nullable
	public final Boolean v() {
		return this.v;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDatafeedsRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MlDatafeedsRequest> {
		@Nullable
		private Boolean allowNoDatafeeds;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private String datafeedId;

		@Nullable
		private String format;

		@Nullable
		private List<CatDatafeedColumn> h;

		@Nullable
		private Boolean help;

		@Nullable
		private List<CatDatafeedColumn> s;

		@Nullable
		private TimeUnit time;

		@Nullable
		private Boolean v;

		/**
		 * Whether to ignore if a wildcard expression matches no datafeeds. (This
		 * includes <code>_all</code> string or when no datafeeds have been specified)
		 * <p>
		 * API name: {@code allow_no_datafeeds}
		 * 
		 * @deprecated 7.10.0 Use <code>allow_no_match</code> instead.
		 */
		@Deprecated
		public final Builder allowNoDatafeeds(@Nullable Boolean value) {
			this.allowNoDatafeeds = value;
			return this;
		}

		/**
		 * Specifies what to do when the request:
		 * <ul>
		 * <li>Contains wildcard expressions and there are no datafeeds that match.</li>
		 * <li>Contains the <code>_all</code> string or no identifiers and there are no
		 * matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ul>
		 * <p>
		 * If <code>true</code>, the API returns an empty datafeeds array when there are
		 * no matches and the subset of results when there are partial matches. If
		 * <code>false</code>, the API returns a 404 status code when there are no
		 * matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * A numerical character string that uniquely identifies the datafeed.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Short version of the HTTP accept header. Valid values include JSON, YAML, for
		 * example.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * Comma-separated list of column names to display.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>h</code>.
		 */
		public final Builder h(List<CatDatafeedColumn> list) {
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
		public final Builder h(CatDatafeedColumn value, CatDatafeedColumn... values) {
			this.h = _listAdd(this.h, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the response includes help information.
		 * <p>
		 * API name: {@code help}
		 */
		public final Builder help(@Nullable Boolean value) {
			this.help = value;
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
		public final Builder s(List<CatDatafeedColumn> list) {
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
		public final Builder s(CatDatafeedColumn value, CatDatafeedColumn... values) {
			this.s = _listAdd(this.s, value, values);
			return this;
		}

		/**
		 * The unit used to display time values.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable TimeUnit value) {
			this.time = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes column headings.
		 * <p>
		 * API name: {@code v}
		 */
		public final Builder v(@Nullable Boolean value) {
			this.v = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlDatafeedsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDatafeedsRequest build() {
			_checkSingleUse();

			return new MlDatafeedsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.ml_datafeeds}".
	 */
	public static final Endpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.ml_datafeeds",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				if (request.datafeedId() != null)
					propsSet |= _datafeedId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/datafeeds");
					return buf.toString();
				}
				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/datafeeds");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.datafeedId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.help != null) {
					params.put("help", String.valueOf(request.help));
				}
				if (ApiTypeHelper.isDefined(request.s)) {
					params.put("s", request.s.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.allowNoDatafeeds != null) {
					params.put("allow_no_datafeeds", String.valueOf(request.allowNoDatafeeds));
				}
				if (request.v != null) {
					params.put("v", String.valueOf(request.v));
				}
				if (request.format != null) {
					params.put("format", request.format);
				}
				if (ApiTypeHelper.isDefined(request.h)) {
					params.put("h", request.h.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, MlDatafeedsResponse._DESERIALIZER);
}
