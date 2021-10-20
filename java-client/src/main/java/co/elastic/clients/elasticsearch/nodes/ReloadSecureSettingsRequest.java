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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: nodes.reload_secure_settings.Request
@JsonpDeserializable
public final class ReloadSecureSettingsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> nodeId;

	@Nullable
	private final String timeout;

	@Nullable
	private final String secureSettingsPassword;

	// ---------------------------------------------------------------------------------------------

	public ReloadSecureSettingsRequest(Builder builder) {

		this.nodeId = ModelTypeHelper.unmodifiable(builder.nodeId);
		this.timeout = builder.timeout;
		this.secureSettingsPassword = builder.secureSettingsPassword;

	}

	public ReloadSecureSettingsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of node IDs to span the reload/reinit call. Should
	 * stay empty because reloading usually involves all cluster nodes.
	 * <p>
	 * API name: {@code node_id}
	 */
	@Nullable
	public List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
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
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

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
		private List<String> nodeId;

		@Nullable
		private String timeout;

		@Nullable
		private String secureSettingsPassword;

		/**
		 * A comma-separated list of node IDs to span the reload/reinit call. Should
		 * stay empty because reloading usually involves all cluster nodes.
		 * <p>
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable List<String> value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs to span the reload/reinit call. Should
		 * stay empty because reloading usually involves all cluster nodes.
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
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
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
	 * Json deserializer for {@link ReloadSecureSettingsRequest}
	 */
	public static final JsonpDeserializer<ReloadSecureSettingsRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, ReloadSecureSettingsRequest::setupReloadSecureSettingsRequestDeserializer, Builder::build);

	protected static void setupReloadSecureSettingsRequestDeserializer(
			DelegatingDeserializer<ReloadSecureSettingsRequest.Builder> op) {

		op.add(Builder::secureSettingsPassword, JsonpDeserializer.stringDeserializer(), "secure_settings_password");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.reload_secure_settings}".
	 */
	public static final Endpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/reload_secure_settings");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ReloadSecureSettingsResponse._DESERIALIZER);
}
