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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: nodes.usage.Request
public final class UsageRequest extends RequestBase {
	@Nullable
	private final List<String> nodeId;

	@Nullable
	private final List<String> metric;

	@Nullable
	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected UsageRequest(Builder builder) {

		this.nodeId = builder.nodeId;
		this.metric = builder.metric;
		this.timeout = builder.timeout;

	}

	/**
	 * A comma-separated list of node IDs or names to limit the returned
	 * information; use <code>_local</code> to return information from the node
	 * you're connecting to, leave empty to get information from all nodes
	 * <p>
	 * API name: {@code node_id}
	 */
	@Nullable
	public List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * Limit the information returned to the specified metrics
	 * <p>
	 * API name: {@code metric}
	 */
	@Nullable
	public List<String> metric() {
		return this.metric;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UsageRequest}.
	 */
	public static class Builder implements ObjectBuilder<UsageRequest> {
		@Nullable
		private List<String> nodeId;

		@Nullable
		private List<String> metric;

		@Nullable
		private JsonValue timeout;

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable List<String> value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String... value) {
			this.nodeId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeId(List)}, creating the list if needed.
		 */
		public Builder addNodeId(String value) {
			if (this.nodeId == null) {
				this.nodeId = new ArrayList<>();
			}
			this.nodeId.add(value);
			return this;
		}

		/**
		 * Limit the information returned to the specified metrics
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(@Nullable List<String> value) {
			this.metric = value;
			return this;
		}

		/**
		 * Limit the information returned to the specified metrics
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(String... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metric(List)}, creating the list if needed.
		 */
		public Builder addMetric(String value) {
			if (this.metric == null) {
				this.metric = new ArrayList<>();
			}
			this.metric.add(value);
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link UsageRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UsageRequest build() {

			return new UsageRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.usage}".
	 */
	public static final Endpoint<UsageRequest, UsageResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;
				final int _metric = 1 << 1;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;
				if (request.metric() != null)
					propsSet |= _metric;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/usage");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/usage");
					return buf.toString();
				}
				if (propsSet == (_metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/usage");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				if (propsSet == (_nodeId | _metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/usage");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, UsageResponse.DESERIALIZER);
}
