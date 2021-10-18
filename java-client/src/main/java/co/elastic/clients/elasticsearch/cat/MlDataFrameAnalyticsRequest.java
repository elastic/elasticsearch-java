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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_data_frame_analytics.Request

public final class MlDataFrameAnalyticsRequest extends CatRequestBase {
	@Nullable
	private final String id;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Bytes bytes;

	// ---------------------------------------------------------------------------------------------

	public MlDataFrameAnalyticsRequest(Builder builder) {

		this.id = builder.id;
		this.allowNoMatch = builder.allowNoMatch;
		this.bytes = builder.bytes;

	}

	public MlDataFrameAnalyticsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The ID of the data frame analytics to fetch
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no configs. (This includes
	 * <code>_all</code> string or when no configs have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * The unit in which to display byte values
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public Bytes bytes() {
		return this.bytes;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsRequest}.
	 */
	public static class Builder implements ObjectBuilder<MlDataFrameAnalyticsRequest> {
		@Nullable
		private String id;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Bytes bytes;

		/**
		 * The ID of the data frame analytics to fetch
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no configs. (This includes
		 * <code>_all</code> string or when no configs have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * The unit in which to display byte values
		 * <p>
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsRequest build() {

			return new MlDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.ml_data_frame_analytics}".
	 */
	public static final Endpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, MlDataFrameAnalyticsResponse._DESERIALIZER);
}
