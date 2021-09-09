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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: watcher.stats.Request
public final class StatsRequest extends RequestBase {
	@Nullable
	private final List<JsonValue> metric;

	@Nullable
	private final Boolean emitStacktraces;

	// ---------------------------------------------------------------------------------------------

	protected StatsRequest(Builder builder) {

		this.metric = builder.metric;
		this.emitStacktraces = builder.emitStacktraces;

	}

	/**
	 * Defines which additional metrics are included in the response.
	 * <p>
	 * API name: {@code metric}
	 */
	@Nullable
	public List<JsonValue> metric() {
		return this.metric;
	}

	/**
	 * Defines whether stack traces are generated for each watch that is running.
	 * <p>
	 * API name: {@code emit_stacktraces}
	 */
	@Nullable
	public Boolean emitStacktraces() {
		return this.emitStacktraces;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<StatsRequest> {
		@Nullable
		private List<JsonValue> metric;

		@Nullable
		private Boolean emitStacktraces;

		/**
		 * Defines which additional metrics are included in the response.
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(@Nullable List<JsonValue> value) {
			this.metric = value;
			return this;
		}

		/**
		 * Defines which additional metrics are included in the response.
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(JsonValue... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metric(List)}, creating the list if needed.
		 */
		public Builder addMetric(JsonValue value) {
			if (this.metric == null) {
				this.metric = new ArrayList<>();
			}
			this.metric.add(value);
			return this;
		}

		/**
		 * Defines whether stack traces are generated for each watch that is running.
		 * <p>
		 * API name: {@code emit_stacktraces}
		 */
		public Builder emitStacktraces(@Nullable Boolean value) {
			this.emitStacktraces = value;
			return this;
		}

		/**
		 * Builds a {@link StatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsRequest build() {

			return new StatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.stats}".
	 */
	public static final Endpoint<StatsRequest, StatsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _metric = 1 << 0;

				int propsSet = 0;

				if (request.metric() != null)
					propsSet |= _metric;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/stats");
					return buf.toString();
				}
				if (propsSet == (_metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/stats");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.emitStacktraces != null) {
					params.put("emit_stacktraces", String.valueOf(request.emitStacktraces));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, StatsResponse.DESERIALIZER);
}
