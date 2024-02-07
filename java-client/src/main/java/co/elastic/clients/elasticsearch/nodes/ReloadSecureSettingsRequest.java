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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: nodes.reload_secure_settings.Request

/**
 * Reloads the keystore on nodes in the cluster.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes.reload_secure_settings.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReloadSecureSettingsRequest extends RequestBase implements JsonpSerializable {
	private final List<String> nodeId;

	@Nullable
	private final String secureSettingsPassword;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private ReloadSecureSettingsRequest(Builder builder) {

		this.nodeId = ApiTypeHelper.unmodifiable(builder.nodeId);
		this.secureSettingsPassword = builder.secureSettingsPassword;
		this.timeout = builder.timeout;

	}

	public static ReloadSecureSettingsRequest of(Function<Builder, ObjectBuilder<ReloadSecureSettingsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The names of particular nodes in the cluster to target.
	 * <p>
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * The password for the Elasticsearch keystore.
	 * <p>
	 * API name: {@code secure_settings_password}
	 */
	@Nullable
	public final String secureSettingsPassword() {
		return this.secureSettingsPassword;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ReloadSecureSettingsRequest> {
		@Nullable
		private List<String> nodeId;

		@Nullable
		private String secureSettingsPassword;

		@Nullable
		private Time timeout;

		/**
		 * The names of particular nodes in the cluster to target.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeId</code>.
		 */
		public final Builder nodeId(List<String> list) {
			this.nodeId = _listAddAll(this.nodeId, list);
			return this;
		}

		/**
		 * The names of particular nodes in the cluster to target.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds one or more values to <code>nodeId</code>.
		 */
		public final Builder nodeId(String value, String... values) {
			this.nodeId = _listAdd(this.nodeId, value, values);
			return this;
		}

		/**
		 * The password for the Elasticsearch keystore.
		 * <p>
		 * API name: {@code secure_settings_password}
		 */
		public final Builder secureSettingsPassword(@Nullable String value) {
			this.secureSettingsPassword = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReloadSecureSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadSecureSettingsRequest build() {
			_checkSingleUse();

			return new ReloadSecureSettingsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReloadSecureSettingsRequest}
	 */
	public static final JsonpDeserializer<ReloadSecureSettingsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ReloadSecureSettingsRequest::setupReloadSecureSettingsRequestDeserializer);

	protected static void setupReloadSecureSettingsRequestDeserializer(
			ObjectDeserializer<ReloadSecureSettingsRequest.Builder> op) {

		op.add(Builder::secureSettingsPassword, JsonpDeserializer.stringDeserializer(), "secure_settings_password");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.reload_secure_settings}".
	 */
	public static final Endpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/nodes.reload_secure_settings",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.nodeId()))
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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.nodeId()))
					propsSet |= _nodeId;

				if (propsSet == 0) {
				}
				if (propsSet == (_nodeId)) {
					params.put("nodeId", request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ReloadSecureSettingsResponse._DESERIALIZER);
}
