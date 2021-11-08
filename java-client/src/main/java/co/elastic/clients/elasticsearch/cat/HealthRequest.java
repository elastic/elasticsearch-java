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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.health.Request

public class HealthRequest extends CatRequestBase {
	@Nullable
	private final Boolean includeTimestamp;

	@Nullable
	private final Boolean ts;

	// ---------------------------------------------------------------------------------------------

	private HealthRequest(Builder builder) {

		this.includeTimestamp = builder.includeTimestamp;
		this.ts = builder.ts;

	}

	public static HealthRequest of(Function<Builder, ObjectBuilder<HealthRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code include_timestamp}
	 */
	@Nullable
	public final Boolean includeTimestamp() {
		return this.includeTimestamp;
	}

	/**
	 * Set to false to disable timestamping
	 * <p>
	 * API name: {@code ts}
	 */
	@Nullable
	public final Boolean ts() {
		return this.ts;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HealthRequest> {
		@Nullable
		private Boolean includeTimestamp;

		@Nullable
		private Boolean ts;

		/**
		 * API name: {@code include_timestamp}
		 */
		public final Builder includeTimestamp(@Nullable Boolean value) {
			this.includeTimestamp = value;
			return this;
		}

		/**
		 * Set to false to disable timestamping
		 * <p>
		 * API name: {@code ts}
		 */
		public final Builder ts(@Nullable Boolean value) {
			this.ts = value;
			return this;
		}

		/**
		 * Builds a {@link HealthRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthRequest build() {
			_checkSingleUse();

			return new HealthRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.health}".
	 */
	public static final Endpoint<HealthRequest, HealthResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/health";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.includeTimestamp != null) {
					params.put("include_timestamp", String.valueOf(request.includeTimestamp));
				}
				if (request.ts != null) {
					params.put("ts", String.valueOf(request.ts));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, HealthResponse._DESERIALIZER);
}
