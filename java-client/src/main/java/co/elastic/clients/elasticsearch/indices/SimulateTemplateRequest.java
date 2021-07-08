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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.get_index_template.IndexTemplate;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_template.Request
public final class SimulateTemplateRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String name;

	@Nullable
	private final Boolean create;

	@Nullable
	private final JsonValue masterTimeout;

	private final IndexTemplate value;

	// ---------------------------------------------------------------------------------------------

	protected SimulateTemplateRequest(Builder builder) {

		this.name = builder.name;
		this.create = builder.create;
		this.masterTimeout = builder.masterTimeout;
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Name of the index template to simulate. To test a template configuration
	 * before you add it to the cluster, omit this parameter and specify the
	 * template configuration in the request body.
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * If true, the template passed in the body is only used if no existing
	 * templates match the same index patterns. If false, the simulation uses the
	 * template with the highest priority. Note that the template is not permanently
	 * added or updated in either case; it is only used for the simulation.
	 *
	 * API name: {@code create}
	 */
	@Nullable
	public Boolean create() {
		return this.create;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 *
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Request body.
	 *
	 * API name: {@code value}
	 */
	public IndexTemplate value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		this.value.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<SimulateTemplateRequest> {
		@Nullable
		private String name;

		@Nullable
		private Boolean create;

		@Nullable
		private JsonValue masterTimeout;

		private IndexTemplate value;

		/**
		 * Name of the index template to simulate. To test a template configuration
		 * before you add it to the cluster, omit this parameter and specify the
		 * template configuration in the request body.
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * If true, the template passed in the body is only used if no existing
		 * templates match the same index patterns. If false, the simulation uses the
		 * template with the highest priority. Note that the template is not permanently
		 * added or updated in either case; it is only used for the simulation.
		 *
		 * API name: {@code create}
		 */
		public Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 *
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Request body.
		 *
		 * API name: {@code value}
		 */
		public Builder value(IndexTemplate value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 *
		 * API name: {@code value}
		 */
		public Builder value(Function<IndexTemplate.Builder, ObjectBuilder<IndexTemplate>> fn) {
			return this.value(fn.apply(new IndexTemplate.Builder()).build());
		}

		/**
		 * Builds a {@link SimulateTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateTemplateRequest build() {

			return new SimulateTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SimulateTemplateRequest
	 */
	public static final JsonpDeserializer<SimulateTemplateRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SimulateTemplateRequest::setupSimulateTemplateRequestDeserializer);

	protected static void setupSimulateTemplateRequestDeserializer(
			DelegatingDeserializer<SimulateTemplateRequest.Builder> op) {

		op.add(Builder::value, IndexTemplate.DESERIALIZER, "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.simulate_template}".
	 */
	public static final Endpoint<SimulateTemplateRequest, SimulateTemplateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/_simulate");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/_simulate");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, SimulateTemplateResponse.DESERIALIZER);
}
