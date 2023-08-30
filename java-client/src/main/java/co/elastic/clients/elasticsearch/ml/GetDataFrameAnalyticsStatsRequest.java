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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_data_frame_analytics_stats.Request

/**
 * Retrieves usage information for data frame analytics jobs.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.get_data_frame_analytics_stats.Request">API
 *      specification</a>
 */

public class GetDataFrameAnalyticsStatsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Integer from;

	@Nullable
	private final String id;

	@Nullable
	private final Integer size;

	@Nullable
	private final Boolean verbose;

	// ---------------------------------------------------------------------------------------------

	private GetDataFrameAnalyticsStatsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.id = builder.id;
		this.size = builder.size;
		this.verbose = builder.verbose;

	}

	public static GetDataFrameAnalyticsStatsRequest of(
			Function<Builder, ObjectBuilder<GetDataFrameAnalyticsStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request:
	 * <ol>
	 * <li>Contains wildcard expressions and there are no data frame analytics jobs
	 * that match.</li>
	 * <li>Contains the <code>_all</code> string or no identifiers and there are no
	 * matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ol>
	 * <p>
	 * The default value returns an empty data_frame_analytics array when there are
	 * no matches and the subset of results when there are partial matches. If this
	 * parameter is <code>false</code>, the request returns a 404 status code when
	 * there are no matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Skips the specified number of data frame analytics jobs.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Identifier for the data frame analytics job. If you do not specify this
	 * option, the API returns information for the first hundred data frame
	 * analytics jobs.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Specifies the maximum number of data frame analytics jobs to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Defines whether the stats response should be verbose.
	 * <p>
	 * API name: {@code verbose}
	 */
	@Nullable
	public final Boolean verbose() {
		return this.verbose;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataFrameAnalyticsStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetDataFrameAnalyticsStatsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Integer from;

		@Nullable
		private String id;

		@Nullable
		private Integer size;

		@Nullable
		private Boolean verbose;

		/**
		 * Specifies what to do when the request:
		 * <ol>
		 * <li>Contains wildcard expressions and there are no data frame analytics jobs
		 * that match.</li>
		 * <li>Contains the <code>_all</code> string or no identifiers and there are no
		 * matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ol>
		 * <p>
		 * The default value returns an empty data_frame_analytics array when there are
		 * no matches and the subset of results when there are partial matches. If this
		 * parameter is <code>false</code>, the request returns a 404 status code when
		 * there are no matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Skips the specified number of data frame analytics jobs.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Identifier for the data frame analytics job. If you do not specify this
		 * option, the API returns information for the first hundred data frame
		 * analytics jobs.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specifies the maximum number of data frame analytics jobs to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Defines whether the stats response should be verbose.
		 * <p>
		 * API name: {@code verbose}
		 */
		public final Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDataFrameAnalyticsStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataFrameAnalyticsStatsRequest build() {
			_checkSingleUse();

			return new GetDataFrameAnalyticsStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_data_frame_analytics_stats}".
	 */
	public static final Endpoint<GetDataFrameAnalyticsStatsRequest, GetDataFrameAnalyticsStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_data_frame_analytics_stats",

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
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_stats");
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
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetDataFrameAnalyticsStatsResponse._DESERIALIZER);
}
