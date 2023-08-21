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
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.transforms.Request

/**
 * Returns configuration and usage information about transforms.
 * <p>
 * IMPORTANT: cat APIs are only intended for human consumption using the Kibana
 * console or command line. They are not intended for use by applications. For
 * application consumption, use the get transform statistics API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.transforms.Request">API
 *      specification</a>
 */

public class TransformsRequest extends CatRequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Integer from;

	private final List<CatTransformColumn> h;

	private final List<CatTransformColumn> s;

	@Nullable
	private final Integer size;

	@Nullable
	private final TimeUnit time;

	@Nullable
	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	private TransformsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.h = ApiTypeHelper.unmodifiable(builder.h);
		this.s = ApiTypeHelper.unmodifiable(builder.s);
		this.size = builder.size;
		this.time = builder.time;
		this.transformId = builder.transformId;

	}

	public static TransformsRequest of(Function<Builder, ObjectBuilder<TransformsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request: contains wildcard expressions and
	 * there are no transforms that match; contains the <code>_all</code> string or
	 * no identifiers and there are no matches; contains wildcard expressions and
	 * there are only partial matches. If <code>true</code>, it returns an empty
	 * transforms array when there are no matches and the subset of results when
	 * there are partial matches. If <code>false</code>, the request returns a 404
	 * status code when there are no matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Skips the specified number of transforms.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Comma-separated list of column names to display.
	 * <p>
	 * API name: {@code h}
	 */
	public final List<CatTransformColumn> h() {
		return this.h;
	}

	/**
	 * Comma-separated list of column names or column aliases used to sort the
	 * response.
	 * <p>
	 * API name: {@code s}
	 */
	public final List<CatTransformColumn> s() {
		return this.s;
	}

	/**
	 * The maximum number of transforms to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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
	 * A transform identifier or a wildcard expression. If you do not specify one of
	 * these options, the API returns information for all transforms.
	 * <p>
	 * API name: {@code transform_id}
	 */
	@Nullable
	public final String transformId() {
		return this.transformId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformsRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TransformsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Integer from;

		@Nullable
		private List<CatTransformColumn> h;

		@Nullable
		private List<CatTransformColumn> s;

		@Nullable
		private Integer size;

		@Nullable
		private TimeUnit time;

		@Nullable
		private String transformId;

		/**
		 * Specifies what to do when the request: contains wildcard expressions and
		 * there are no transforms that match; contains the <code>_all</code> string or
		 * no identifiers and there are no matches; contains wildcard expressions and
		 * there are only partial matches. If <code>true</code>, it returns an empty
		 * transforms array when there are no matches and the subset of results when
		 * there are partial matches. If <code>false</code>, the request returns a 404
		 * status code when there are no matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Skips the specified number of transforms.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Comma-separated list of column names to display.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>h</code>.
		 */
		public final Builder h(List<CatTransformColumn> list) {
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
		public final Builder h(CatTransformColumn value, CatTransformColumn... values) {
			this.h = _listAdd(this.h, value, values);
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
		public final Builder s(List<CatTransformColumn> list) {
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
		public final Builder s(CatTransformColumn value, CatTransformColumn... values) {
			this.s = _listAdd(this.s, value, values);
			return this;
		}

		/**
		 * The maximum number of transforms to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
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
		 * A transform identifier or a wildcard expression. If you do not specify one of
		 * these options, the API returns information for all transforms.
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(@Nullable String value) {
			this.transformId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformsRequest build() {
			_checkSingleUse();

			return new TransformsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.transforms}".
	 */
	public static final Endpoint<TransformsRequest, TransformsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.transforms",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/transforms");
					return buf.toString();
				}
				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/transforms");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.transformId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == 0) {
				}
				if (propsSet == (_transformId)) {
					params.put("transformId", request.transformId);
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
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (ApiTypeHelper.isDefined(request.h)) {
					params.put("h", request.h.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, TransformsResponse._DESERIALIZER);
}
