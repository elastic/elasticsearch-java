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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.set_upgrade_mode.Request

public final class SetUpgradeModeRequest extends RequestBase {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public SetUpgradeModeRequest(Builder builder) {

		this.enabled = builder.enabled;
		this.timeout = builder.timeout;

	}

	/**
	 * Whether to enable upgrade_mode ML setting or not. Defaults to false.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * Controls the time to wait before action times out. Defaults to 30 seconds
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SetUpgradeModeRequest}.
	 */
	public static class Builder implements ObjectBuilder<SetUpgradeModeRequest> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private String timeout;

		/**
		 * Whether to enable upgrade_mode ML setting or not. Defaults to false.
		 * <p>
		 * API name: {@code enabled}
		 */
		public Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Controls the time to wait before action times out. Defaults to 30 seconds
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link SetUpgradeModeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SetUpgradeModeRequest build() {

			return new SetUpgradeModeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.set_upgrade_mode}".
	 */
	public static final Endpoint<SetUpgradeModeRequest, SetUpgradeModeResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/set_upgrade_mode";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.enabled != null) {
					params.put("enabled", String.valueOf(request.enabled));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, SetUpgradeModeResponse._DESERIALIZER);
}
