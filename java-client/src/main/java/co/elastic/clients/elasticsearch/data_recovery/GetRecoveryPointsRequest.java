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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: data_recovery.get_recovery_points.Request

/**
 * Get recovery points.
 * <p>
 * Get recovery points from the platform-managed data recovery repository. This
 * API is intended for internal operator use. Recovery points are returned in
 * descending order by end time. Repository, snapshot, and policy identifiers
 * are not exposed.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.get_recovery_points.Request">API
 *      specification</a>
 */

public class GetRecoveryPointsRequest extends RequestBase {
	@Nullable
	private final DateTime endTimeBefore;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private GetRecoveryPointsRequest(Builder builder) {

		this.endTimeBefore = builder.endTimeBefore;
		this.masterTimeout = builder.masterTimeout;
		this.size = builder.size;

	}

	public static GetRecoveryPointsRequest of(Function<Builder, ObjectBuilder<GetRecoveryPointsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Return only recovery points whose end time is earlier than this value. The
	 * boundary is exclusive and can be set to the last recovery point's end time to
	 * retrieve the next page.
	 * <p>
	 * API name: {@code end_time_before}
	 */
	@Nullable
	public final DateTime endTimeBefore() {
		return this.endTimeBefore;
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
	 * The maximum number of recovery points to return. The value must be between 1
	 * and 1000.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRecoveryPointsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetRecoveryPointsRequest> {
		@Nullable
		private DateTime endTimeBefore;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Integer size;

		public Builder() {
		}
		private Builder(GetRecoveryPointsRequest instance) {
			this.endTimeBefore = instance.endTimeBefore;
			this.masterTimeout = instance.masterTimeout;
			this.size = instance.size;

		}
		/**
		 * Return only recovery points whose end time is earlier than this value. The
		 * boundary is exclusive and can be set to the last recovery point's end time to
		 * retrieve the next page.
		 * <p>
		 * API name: {@code end_time_before}
		 */
		public final Builder endTimeBefore(@Nullable DateTime value) {
			this.endTimeBefore = value;
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
		 * The maximum number of recovery points to return. The value must be between 1
		 * and 1000.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRecoveryPointsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecoveryPointsRequest build() {
			_checkSingleUse();

			return new GetRecoveryPointsRequest(this);
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
	 * Endpoint "{@code data_recovery.get_recovery_points}".
	 */
	public static final Endpoint<GetRecoveryPointsRequest, GetRecoveryPointsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/data_recovery.get_recovery_points",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_data_recovery/points";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.endTimeBefore != null) {
					params.put("end_time_before", request.endTimeBefore.toString());
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetRecoveryPointsResponse._DESERIALIZER);
}
