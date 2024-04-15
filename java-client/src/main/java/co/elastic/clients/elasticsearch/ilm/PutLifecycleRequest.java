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

package co.elastic.clients.elasticsearch.ilm;

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

// typedef: ilm.put_lifecycle.Request

/**
 * Creates a lifecycle policy. If the specified policy exists, the policy is
 * replaced and the policy version is incremented.
 * 
 * @see <a href="../doc-files/api-spec.html#ilm.put_lifecycle.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutLifecycleRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time masterTimeout;

	private final String name;

	@Nullable
	private final IlmPolicy policy;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutLifecycleRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.policy = builder.policy;
		this.timeout = builder.timeout;

	}

	public static PutLifecycleRequest of(Function<Builder, ObjectBuilder<PutLifecycleRequest>> fn) {
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
	 * Required - Identifier for the policy.
	 * <p>
	 * API name: {@code policy}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code policy}
	 */
	@Nullable
	public final IlmPolicy policy() {
		return this.policy;
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

		if (this.policy != null) {
			generator.writeKey("policy");
			this.policy.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutLifecycleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutLifecycleRequest> {
		@Nullable
		private Time masterTimeout;

		private String name;

		@Nullable
		private IlmPolicy policy;

		@Nullable
		private Time timeout;

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
		 * Required - Identifier for the policy.
		 * <p>
		 * API name: {@code policy}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public final Builder policy(@Nullable IlmPolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public final Builder policy(Function<IlmPolicy.Builder, ObjectBuilder<IlmPolicy>> fn) {
			return this.policy(fn.apply(new IlmPolicy.Builder()).build());
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
		 * Builds a {@link PutLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutLifecycleRequest build() {
			_checkSingleUse();

			return new PutLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutLifecycleRequest}
	 */
	public static final JsonpDeserializer<PutLifecycleRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutLifecycleRequest::setupPutLifecycleRequestDeserializer);

	protected static void setupPutLifecycleRequestDeserializer(ObjectDeserializer<PutLifecycleRequest.Builder> op) {

		op.add(Builder::policy, IlmPolicy._DESERIALIZER, "policy");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.put_lifecycle}".
	 */
	public static final Endpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ilm.put_lifecycle",

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
					buf.append("/_ilm");
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

			}, SimpleEndpoint.emptyMap(), true, PutLifecycleResponse._DESERIALIZER);
}
