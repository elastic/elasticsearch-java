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
import javax.annotation.Nullable;

// typedef: nodes.reload_secure_settings.Request
public final class ReloadSecureSettingsRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String nodeId;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final String secureSettingsPassword;

	// ---------------------------------------------------------------------------------------------

	protected ReloadSecureSettingsRequest(Builder builder) {

		this.nodeId = builder.nodeId;
		this.timeout = builder.timeout;
		this.secureSettingsPassword = builder.secureSettingsPassword;

	}

	/**
	 * API name: {@code node_id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code secure_settings_password}
	 */
	@Nullable
	public String secureSettingsPassword() {
		return this.secureSettingsPassword;
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

		if (this.secureSettingsPassword != null) {

			generator.writeKey("secure_settings_password");
			generator.write(this.secureSettingsPassword);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReloadSecureSettingsRequest}.
	 */
	public static class Builder implements ObjectBuilder<ReloadSecureSettingsRequest> {
		@Nullable
		private String nodeId;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private String secureSettingsPassword;

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
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
		 * API name: {@code secure_settings_password}
		 */
		public Builder secureSettingsPassword(@Nullable String value) {
			this.secureSettingsPassword = value;
			return this;
		}

		/**
		 * Builds a {@link ReloadSecureSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadSecureSettingsRequest build() {

			return new ReloadSecureSettingsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ReloadSecureSettingsRequest
	 */
	public static final JsonpDeserializer<ReloadSecureSettingsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ReloadSecureSettingsRequest::setupReloadSecureSettingsRequestDeserializer);

	protected static void setupReloadSecureSettingsRequestDeserializer(
			DelegatingDeserializer<ReloadSecureSettingsRequest.Builder> op) {

		op.add(Builder::secureSettingsPassword, JsonpDeserializer.stringDeserializer(), "secure_settings_password");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.reload_secure_settings}".
	 */
	public static final Endpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/reload_secure_settings");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId);
					buf.append("/reload_secure_settings");
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

			}, Endpoint.Simple.emptyMap(), true, ReloadSecureSettingsResponse.DESERIALIZER);
}
