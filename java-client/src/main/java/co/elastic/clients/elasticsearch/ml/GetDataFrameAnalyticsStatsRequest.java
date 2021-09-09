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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: ml.get_data_frame_analytics_stats.Request
public final class GetDataFrameAnalyticsStatsRequest extends RequestBase {
	@Nullable
	private final String id;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	@Nullable
	private final Boolean verbose;

	// ---------------------------------------------------------------------------------------------

	protected GetDataFrameAnalyticsStatsRequest(Builder builder) {

		this.id = builder.id;
		this.allowNoMatch = builder.allowNoMatch;
		this.from = builder.from;
		this.size = builder.size;
		this.verbose = builder.verbose;

	}

	/**
	 * Identifier for the data frame analytics job. If you do not specify this
	 * option, the API returns information for the first hundred data frame
	 * analytics jobs.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no data frame analytics.
	 * (This includes <code>_all</code> string or when no data frame analytics have
	 * been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Skips the specified number of data frame analytics jobs.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of data frame analytics jobs to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * Defines whether the stats response should be verbose.
	 * <p>
	 * API name: {@code verbose}
	 */
	@Nullable
	public Boolean verbose() {
		return this.verbose;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataFrameAnalyticsStatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetDataFrameAnalyticsStatsRequest> {
		@Nullable
		private String id;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		@Nullable
		private Boolean verbose;

		/**
		 * Identifier for the data frame analytics job. If you do not specify this
		 * option, the API returns information for the first hundred data frame
		 * analytics jobs.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no data frame analytics.
		 * (This includes <code>_all</code> string or when no data frame analytics have
		 * been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Skips the specified number of data frame analytics jobs.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of data frame analytics jobs to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Defines whether the stats response should be verbose.
		 * <p>
		 * API name: {@code verbose}
		 */
		public Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		/**
		 * Builds a {@link GetDataFrameAnalyticsStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataFrameAnalyticsStatsRequest build() {

			return new GetDataFrameAnalyticsStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_data_frame_analytics_stats}".
	 */
	public static final Endpoint<GetDataFrameAnalyticsStatsRequest, GetDataFrameAnalyticsStatsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append(request.id);
					buf.append("/_stats");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetDataFrameAnalyticsStatsResponse.DESERIALIZER);
}
