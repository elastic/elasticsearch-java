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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: ml.get_datafeed_stats.Request

public class GetDatafeedStatsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	private final List<String> datafeedId;

	// ---------------------------------------------------------------------------------------------

	private GetDatafeedStatsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.datafeedId = ModelTypeHelper.unmodifiable(builder.datafeedId);

	}

	public static GetDatafeedStatsRequest of(Function<Builder, ObjectBuilder<GetDatafeedStatsRequest>> fn) {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDatafeedStatsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetDatafeedStatsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private List<String> datafeedId;

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
		 */
		public final Builder datafeedId(@Nullable List<String> value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Identifier for the datafeed. It can be a datafeed identifier or a wildcard
		 * expression. If you do not specify one of these options, the API returns
		 * information about all datafeeds.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String... value) {
			this.datafeedId = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link GetDatafeedStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatafeedStatsRequest build() {
			_checkSingleUse();

			return new GetDatafeedStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_datafeed_stats}".
	 */
	public static final Endpoint<GetDatafeedStatsRequest, GetDatafeedStatsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.datafeedId()))
					propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.datafeedId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/_stats");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetDatafeedStatsResponse._DESERIALIZER);
}
