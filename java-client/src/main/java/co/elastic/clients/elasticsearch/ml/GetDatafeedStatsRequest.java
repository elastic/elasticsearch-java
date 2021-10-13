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
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: ml.get_datafeed_stats.Request

public final class GetDatafeedStatsRequest extends RequestBase {
	@Nullable
	private final List<String> datafeedId;

	@Nullable
	private final Boolean allowNoDatafeeds;

	// ---------------------------------------------------------------------------------------------

	public GetDatafeedStatsRequest(Builder builder) {

		this.datafeedId = ModelTypeHelper.unmodifiable(builder.datafeedId);
		this.allowNoDatafeeds = builder.allowNoDatafeeds;

	}

	public GetDatafeedStatsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The ID of the datafeeds stats to fetch
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public List<String> datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no datafeeds. (This
	 * includes <code>_all</code> string or when no datafeeds have been specified)
	 * <p>
	 * API name: {@code allow_no_datafeeds}
	 */
	@Nullable
	public Boolean allowNoDatafeeds() {
		return this.allowNoDatafeeds;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDatafeedStatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetDatafeedStatsRequest> {
		@Nullable
		private List<String> datafeedId;

		@Nullable
		private Boolean allowNoDatafeeds;

		/**
		 * The ID of the datafeeds stats to fetch
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(@Nullable List<String> value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * The ID of the datafeeds stats to fetch
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(String... value) {
			this.datafeedId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #datafeedId(List)}, creating the list if needed.
		 */
		public Builder addDatafeedId(String value) {
			if (this.datafeedId == null) {
				this.datafeedId = new ArrayList<>();
			}
			this.datafeedId.add(value);
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no datafeeds. (This
		 * includes <code>_all</code> string or when no datafeeds have been specified)
		 * <p>
		 * API name: {@code allow_no_datafeeds}
		 */
		public Builder allowNoDatafeeds(@Nullable Boolean value) {
			this.allowNoDatafeeds = value;
			return this;
		}

		/**
		 * Builds a {@link GetDatafeedStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatafeedStatsRequest build() {

			return new GetDatafeedStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_datafeed_stats}".
	 */
	public static final Endpoint<GetDatafeedStatsRequest, GetDatafeedStatsResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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
				if (request.allowNoDatafeeds != null) {
					params.put("allow_no_datafeeds", String.valueOf(request.allowNoDatafeeds));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetDatafeedStatsResponse._DESERIALIZER);
}
