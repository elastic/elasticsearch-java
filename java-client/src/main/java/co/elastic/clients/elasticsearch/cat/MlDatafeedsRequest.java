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
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_datafeeds.Request

public class MlDatafeedsRequest extends CatRequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final String datafeedId;

	@Nullable
	private final TimeUnit time;

	// ---------------------------------------------------------------------------------------------

	private MlDatafeedsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.datafeedId = builder.datafeedId;
		this.time = builder.time;

	}

	public static MlDatafeedsRequest of(Function<Builder, ObjectBuilder<MlDatafeedsRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	 * A numerical character string that uniquely identifies the datafeed. This
	 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
	 * hyphens, and underscores. It must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public final String datafeedId() {
		return this.datafeedId;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDatafeedsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlDatafeedsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private String datafeedId;

		@Nullable
		private TimeUnit time;

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
		 * A numerical character string that uniquely identifies the datafeed. This
		 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
		 * hyphens, and underscores. It must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
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
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, MlDatafeedsResponse._DESERIALIZER);
}
