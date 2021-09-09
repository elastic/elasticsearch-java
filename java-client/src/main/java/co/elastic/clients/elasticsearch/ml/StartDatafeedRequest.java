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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.start_datafeed.Request
public final class StartDatafeedRequest extends RequestBase implements ToJsonp {
	private final String datafeedId;

	@Nullable
	private final JsonValue end;

	@Nullable
	private final JsonValue start;

	@Nullable
	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected StartDatafeedRequest(Builder builder) {

		this.datafeedId = Objects.requireNonNull(builder.datafeedId, "datafeed_id");
		this.end = builder.end;
		this.start = builder.start;
		this.timeout = builder.timeout;

	}

	/**
	 * The ID of the datafeed to start
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public JsonValue end() {
		return this.end;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public JsonValue start() {
		return this.start;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end);

		}
		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}
		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartDatafeedRequest}.
	 */
	public static class Builder implements ObjectBuilder<StartDatafeedRequest> {
		private String datafeedId;

		@Nullable
		private JsonValue end;

		@Nullable
		private JsonValue start;

		@Nullable
		private JsonValue timeout;

		/**
		 * The ID of the datafeed to start
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(@Nullable JsonValue value) {
			this.end = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable JsonValue value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link StartDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartDatafeedRequest build() {

			return new StartDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StartDatafeedRequest
	 */
	public static final JsonpDeserializer<StartDatafeedRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StartDatafeedRequest::setupStartDatafeedRequestDeserializer);

	protected static void setupStartDatafeedRequestDeserializer(
			DelegatingDeserializer<StartDatafeedRequest.Builder> op) {

		op.add(Builder::end, JsonpDeserializer.jsonValueDeserializer(), "end");
		op.add(Builder::start, JsonpDeserializer.jsonValueDeserializer(), "start");
		op.add(Builder::timeout, JsonpDeserializer.jsonValueDeserializer(), "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.start_datafeed}".
	 */
	public static final Endpoint<StartDatafeedRequest, StartDatafeedResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

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
					buf.append(request.datafeedId);
					buf.append("/_start");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				return params;

			}, Endpoint.Simple.emptyMap(), true, StartDatafeedResponse.DESERIALIZER);
}
