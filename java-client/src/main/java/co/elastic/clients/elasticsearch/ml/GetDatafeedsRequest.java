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

// typedef: ml.get_datafeeds.Request

/**
 * Retrieves configuration information for datafeeds. You can get information
 * for multiple datafeeds in a single API request by using a comma-separated
 * list of datafeeds or a wildcard expression. You can get information for all
 * datafeeds by using <code>_all</code>, by specifying <code>*</code> as the
 * <code>&lt;feed_id&gt;</code>, or by omitting the
 * <code>&lt;feed_id&gt;</code>. This API returns a maximum of 10,000 datafeeds.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_datafeeds.Request">API
 *      specification</a>
 */

public class GetDatafeedsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	private final List<String> datafeedId;

	@Nullable
	private final Boolean excludeGenerated;

	// ---------------------------------------------------------------------------------------------

	private GetDatafeedsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.datafeedId = ApiTypeHelper.unmodifiable(builder.datafeedId);
		this.excludeGenerated = builder.excludeGenerated;

	}

	public static GetDatafeedsRequest of(Function<Builder, ObjectBuilder<GetDatafeedsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request:
	 * <ol>
	 * <li>Contains wildcard expressions and there are no datafeeds that match.</li>
	 * <li>Contains the <code>_all</code> string or no identifiers and there are no
	 * matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ol>
	 * <p>
	 * The default value is <code>true</code>, which returns an empty
	 * <code>datafeeds</code> array when there are no matches and the subset of
	 * results when there are partial matches. If this parameter is
	 * <code>false</code>, the request returns a <code>404</code> status code when
	 * there are no matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Identifier for the datafeed. It can be a datafeed identifier or a wildcard
	 * expression. If you do not specify one of these options, the API returns
	 * information about all datafeeds.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public final List<String> datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Indicates if certain fields should be removed from the configuration on
	 * retrieval. This allows the configuration to be in an acceptable format to be
	 * retrieved and then added to another cluster.
	 * <p>
	 * API name: {@code exclude_generated}
	 */
	@Nullable
	public final Boolean excludeGenerated() {
		return this.excludeGenerated;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDatafeedsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetDatafeedsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private List<String> datafeedId;

		@Nullable
		private Boolean excludeGenerated;

		/**
		 * Specifies what to do when the request:
		 * <ol>
		 * <li>Contains wildcard expressions and there are no datafeeds that match.</li>
		 * <li>Contains the <code>_all</code> string or no identifiers and there are no
		 * matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ol>
		 * <p>
		 * The default value is <code>true</code>, which returns an empty
		 * <code>datafeeds</code> array when there are no matches and the subset of
		 * results when there are partial matches. If this parameter is
		 * <code>false</code>, the request returns a <code>404</code> status code when
		 * there are no matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Identifier for the datafeed. It can be a datafeed identifier or a wildcard
		 * expression. If you do not specify one of these options, the API returns
		 * information about all datafeeds.
		 * <p>
		 * API name: {@code datafeed_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>datafeedId</code>.
		 */
		public final Builder datafeedId(List<String> list) {
			this.datafeedId = _listAddAll(this.datafeedId, list);
			return this;
		}

		/**
		 * Identifier for the datafeed. It can be a datafeed identifier or a wildcard
		 * expression. If you do not specify one of these options, the API returns
		 * information about all datafeeds.
		 * <p>
		 * API name: {@code datafeed_id}
		 * <p>
		 * Adds one or more values to <code>datafeedId</code>.
		 */
		public final Builder datafeedId(String value, String... values) {
			this.datafeedId = _listAdd(this.datafeedId, value, values);
			return this;
		}

		/**
		 * Indicates if certain fields should be removed from the configuration on
		 * retrieval. This allows the configuration to be in an acceptable format to be
		 * retrieved and then added to another cluster.
		 * <p>
		 * API name: {@code exclude_generated}
		 */
		public final Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDatafeedsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatafeedsRequest build() {
			_checkSingleUse();

			return new GetDatafeedsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_datafeeds}".
	 */
	public static final Endpoint<GetDatafeedsRequest, GetDatafeedsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_datafeeds",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.datafeedId()))
					propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.datafeedId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.datafeedId()))
					propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					params.put("datafeedId", request.datafeedId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetDatafeedsResponse._DESERIALIZER);
}
