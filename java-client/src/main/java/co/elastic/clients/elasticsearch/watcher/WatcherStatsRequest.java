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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.watcher.stats.WatcherMetric;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: watcher.stats.Request

public class WatcherStatsRequest extends RequestBase {
	@Nullable
	private final Boolean emitStacktraces;

	private final List<WatcherMetric> metric;

	// ---------------------------------------------------------------------------------------------

	private WatcherStatsRequest(Builder builder) {

		this.emitStacktraces = builder.emitStacktraces;
		this.metric = ModelTypeHelper.unmodifiable(builder.metric);

	}

	public static WatcherStatsRequest of(Function<Builder, ObjectBuilder<WatcherStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Defines whether stack traces are generated for each watch that is running.
	 * <p>
	 * API name: {@code emit_stacktraces}
	 */
	@Nullable
	public final Boolean emitStacktraces() {
		return this.emitStacktraces;
	}

	/**
	 * Defines which additional metrics are included in the response.
	 * <p>
	 * API name: {@code metric}
	 */
	public final List<WatcherMetric> metric() {
		return this.metric;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherStatsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WatcherStatsRequest> {
		@Nullable
		private Boolean emitStacktraces;

		@Nullable
		private List<WatcherMetric> metric;

		/**
		 * Defines whether stack traces are generated for each watch that is running.
		 * <p>
		 * API name: {@code emit_stacktraces}
		 */
		public final Builder emitStacktraces(@Nullable Boolean value) {
			this.emitStacktraces = value;
			return this;
		}

		/**
		 * Defines which additional metrics are included in the response.
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(@Nullable List<WatcherMetric> value) {
			this.metric = value;
			return this;
		}

		/**
		 * Defines which additional metrics are included in the response.
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(WatcherMetric... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link WatcherStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherStatsRequest build() {
			_checkSingleUse();

			return new WatcherStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.stats}".
	 */
	public static final Endpoint<WatcherStatsRequest, WatcherStatsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _metric = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.metric()))
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
					SimpleEndpoint.pathEncode(
							request.metric.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.emitStacktraces != null) {
					params.put("emit_stacktraces", String.valueOf(request.emitStacktraces));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, WatcherStatsResponse._DESERIALIZER);
}
