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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.String;
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

// typedef: autoscaling.put_autoscaling_policy.Request

/**
 * Create or update an autoscaling policy.
 * <p>
 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
 * supported.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#autoscaling.put_autoscaling_policy.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAutoscalingPolicyRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time masterTimeout;

	private final String name;

	@Nullable
	private final Time timeout;

	private final AutoscalingPolicy policy;

	// ---------------------------------------------------------------------------------------------

	private PutAutoscalingPolicyRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.timeout = builder.timeout;
		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");

	}

	public static PutAutoscalingPolicyRequest of(Function<Builder, ObjectBuilder<PutAutoscalingPolicyRequest>> fn) {
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

	/**
	 * Required - Name of the autoscaling policy
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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
	 * Required - Request body.
	 */
	public final AutoscalingPolicy policy() {
		return this.policy;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.policy.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAutoscalingPolicyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAutoscalingPolicyRequest> {
		@Nullable
		private Time masterTimeout;

		private String name;

		@Nullable
		private Time timeout;

		private AutoscalingPolicy policy;

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

		/**
		 * Required - Name of the autoscaling policy
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
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

		/**
		 * Required - Request body.
		 */
		public final Builder policy(AutoscalingPolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder policy(Function<AutoscalingPolicy.Builder, ObjectBuilder<AutoscalingPolicy>> fn) {
			return this.policy(fn.apply(new AutoscalingPolicy.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			AutoscalingPolicy value = (AutoscalingPolicy) AutoscalingPolicy._DESERIALIZER.deserialize(parser, mapper);
			return this.policy(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAutoscalingPolicyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAutoscalingPolicyRequest build() {
			_checkSingleUse();

			return new PutAutoscalingPolicyRequest(this);
		}
	}

	public static final JsonpDeserializer<PutAutoscalingPolicyRequest> _DESERIALIZER = createPutAutoscalingPolicyRequestDeserializer();
	protected static JsonpDeserializer<PutAutoscalingPolicyRequest> createPutAutoscalingPolicyRequestDeserializer() {

		JsonpDeserializer<AutoscalingPolicy> valueDeserializer = AutoscalingPolicy._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.policy(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code autoscaling.put_autoscaling_policy}".
	 */
	public static final Endpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/autoscaling.put_autoscaling_policy",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_autoscaling");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutAutoscalingPolicyResponse._DESERIALIZER);
}
