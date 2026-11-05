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

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: data_recovery.get_recovery.Request

/**
 * Get a recovery.
 * <p>
 * Get the status and details of a recovery that was started with the start
 * recovery API. This API is intended for internal operator use. The progress of
 * a running recovery is reported as a percentage, and the repository and audit
 * details of the recovery are not exposed.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.get_recovery.Request">API
 *      specification</a>
 */

public class GetRecoveryRequest extends RequestBase {
	private final String recoveryId;

	// ---------------------------------------------------------------------------------------------

	private GetRecoveryRequest(Builder builder) {

		this.recoveryId = ApiTypeHelper.requireNonNull(builder.recoveryId, this, "recoveryId");

	}

	public static GetRecoveryRequest of(Function<Builder, ObjectBuilder<GetRecoveryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The identifier of the recovery, as returned when the recovery was
	 * started.
	 * <p>
	 * API name: {@code recovery_id}
	 */
	public final String recoveryId() {
		return this.recoveryId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRecoveryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetRecoveryRequest> {
		private String recoveryId;

		public Builder() {
		}
		private Builder(GetRecoveryRequest instance) {
			this.recoveryId = instance.recoveryId;

		}
		/**
		 * Required - The identifier of the recovery, as returned when the recovery was
		 * started.
		 * <p>
		 * API name: {@code recovery_id}
		 */
		public final Builder recoveryId(String value) {
			this.recoveryId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRecoveryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecoveryRequest build() {
			_checkSingleUse();

			return new GetRecoveryRequest(this);
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
	 * Endpoint "{@code data_recovery.get_recovery}".
	 */
	public static final Endpoint<GetRecoveryRequest, GetRecoveryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/data_recovery.get_recovery",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _recoveryId = 1 << 0;

				int propsSet = 0;

				propsSet |= _recoveryId;

				if (propsSet == (_recoveryId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_recovery");
					buf.append("/recoveries");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.recoveryId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _recoveryId = 1 << 0;

				int propsSet = 0;

				propsSet |= _recoveryId;

				if (propsSet == (_recoveryId)) {
					params.put("recoveryId", request.recoveryId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetRecoveryResponse._DESERIALIZER);
}
