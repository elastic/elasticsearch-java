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

package co.elastic.clients.elasticsearch.autoscaling;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: autoscaling.get_autoscaling_capacity.Request

/**
 * Get the autoscaling capacity.
 * <p>
 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
 * supported.
 * <p>
 * This API gets the current autoscaling capacity based on the configured
 * autoscaling policy. It will return information to size the cluster
 * appropriately to the current workload.
 * <p>
 * The <code>required_capacity</code> is calculated as the maximum of the
 * <code>required_capacity</code> result of all individual deciders that are
 * enabled for the policy.
 * <p>
 * The operator should verify that the <code>current_nodes</code> match the
 * operator’s knowledge of the cluster to avoid making autoscaling decisions
 * based on stale or incomplete information.
 * <p>
 * The response contains decider-specific information you can use to diagnose
 * how and why autoscaling determined a certain capacity was required. This
 * information is provided for diagnosis only. Do not use this information to
 * make autoscaling decisions.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#autoscaling.get_autoscaling_capacity.Request">API
 *      specification</a>
 */

public class GetAutoscalingCapacityRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	// ---------------------------------------------------------------------------------------------

	private GetAutoscalingCapacityRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;

	}

	public static GetAutoscalingCapacityRequest of(Function<Builder, ObjectBuilder<GetAutoscalingCapacityRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAutoscalingCapacityRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetAutoscalingCapacityRequest> {
		@Nullable
		private Time masterTimeout;

		public Builder() {
		}
		private Builder(GetAutoscalingCapacityRequest instance) {
			this.masterTimeout = instance.masterTimeout;

		}
		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetAutoscalingCapacityRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAutoscalingCapacityRequest build() {
			_checkSingleUse();

			return new GetAutoscalingCapacityRequest(this);
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
	 * Endpoint "{@code autoscaling.get_autoscaling_capacity}".
	 */
	public static final Endpoint<GetAutoscalingCapacityRequest, GetAutoscalingCapacityResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/autoscaling.get_autoscaling_capacity",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_autoscaling/capacity";

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
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetAutoscalingCapacityResponse._DESERIALIZER);
}
