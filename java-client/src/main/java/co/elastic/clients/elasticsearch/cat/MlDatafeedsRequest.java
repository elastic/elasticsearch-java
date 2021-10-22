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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_datafeeds.Request

public final class MlDatafeedsRequest extends CatRequestBase {
	@Nullable
	private final Boolean allowNoDatafeeds;

	@Nullable
	private final String datafeedId;

	// ---------------------------------------------------------------------------------------------

	public MlDatafeedsRequest(Builder builder) {

		this.allowNoDatafeeds = builder.allowNoDatafeeds;
		this.datafeedId = builder.datafeedId;

	}

	public MlDatafeedsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
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

	/**
	 * The ID of the datafeeds stats to fetch
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public String datafeedId() {
		return this.datafeedId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDatafeedsRequest}.
	 */
	public static class Builder implements ObjectBuilder<MlDatafeedsRequest> {
		@Nullable
		private Boolean allowNoDatafeeds;

		@Nullable
		private String datafeedId;

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
		 * The ID of the datafeeds stats to fetch
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Builds a {@link MlDatafeedsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDatafeedsRequest build() {

			return new MlDatafeedsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.ml_datafeeds}".
	 */
	public static final Endpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
				if (request.allowNoDatafeeds != null) {
					params.put("allow_no_datafeeds", String.valueOf(request.allowNoDatafeeds));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, MlDatafeedsResponse._DESERIALIZER);
}
