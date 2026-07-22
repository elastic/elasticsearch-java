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

package co.elastic.clients.elasticsearch.encryption;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: encryption.reset.Request

/**
 * Reset the project encryption key.
 * <p>
 * Destroy the current project encryption key (PEK) and generate a new one. This
 * is the recovery path for when the on-disk encrypted PEK becomes permanently
 * inaccessible, for example because the key encryption material protecting it
 * was lost.
 * <p>
 * All data that was encrypted under the destroyed key becomes permanently
 * unrecoverable. Each feature that stores encrypted data decides how to handle
 * its own data during the reset: some features drop the encrypted values
 * entirely, while others preserve the rest of the affected data and only clear
 * the values that can no longer be decrypted.
 * <p>
 * Because this operation causes permanent data loss, it requires the
 * <code>accept_data_loss</code> query parameter to be set to <code>true</code>.
 * 
 * @see <a href="../doc-files/api-spec.html#encryption.reset.Request">API
 *      specification</a>
 */

public class ResetRequest extends RequestBase {
	private final boolean acceptDataLoss;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private ResetRequest(Builder builder) {

		this.acceptDataLoss = ApiTypeHelper.requireNonNull(builder.acceptDataLoss, this, "acceptDataLoss", false);
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public static ResetRequest of(Function<Builder, ObjectBuilder<ResetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Acknowledge that resetting the project encryption key permanently
	 * destroys all data that was encrypted under the current key. The request fails
	 * if this is not set to <code>true</code>.
	 * <p>
	 * API name: {@code accept_data_loss}
	 */
	public final boolean acceptDataLoss() {
		return this.acceptDataLoss;
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The period to wait for a response. If no response is received before the
	 * timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResetRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ResetRequest> {
		private Boolean acceptDataLoss;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(ResetRequest instance) {
			this.acceptDataLoss = instance.acceptDataLoss;
			this.masterTimeout = instance.masterTimeout;
			this.timeout = instance.timeout;

		}
		/**
		 * Required - Acknowledge that resetting the project encryption key permanently
		 * destroys all data that was encrypted under the current key. The request fails
		 * if this is not set to <code>true</code>.
		 * <p>
		 * API name: {@code accept_data_loss}
		 */
		public final Builder acceptDataLoss(boolean value) {
			this.acceptDataLoss = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
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
		 * Builds a {@link ResetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResetRequest build() {
			_checkSingleUse();

			return new ResetRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code encryption.reset}".
	 */
	public static final Endpoint<ResetRequest, ResetResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/encryption.reset",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_encryption/_reset";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				params.put("accept_data_loss", String.valueOf(request.acceptDataLoss));
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ResetResponse._DESERIALIZER);
}
