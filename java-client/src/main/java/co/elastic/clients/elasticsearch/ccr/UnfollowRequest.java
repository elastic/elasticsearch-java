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

package co.elastic.clients.elasticsearch.ccr;

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

// typedef: ccr.unfollow.Request

/**
 * Unfollow an index.
 * <p>
 * Convert a cross-cluster replication follower index to a regular index. The
 * API stops the following task associated with a follower index and removes
 * index metadata and settings associated with cross-cluster replication. The
 * follower index must be paused and closed before you call the unfollow API.
 * <blockquote>
 * <p>
 * info Currently cross-cluster replication does not support converting an
 * existing regular index to a follower index. Converting a follower index to a
 * regular index is an irreversible operation.
 * </p>
 * </blockquote>
 *
 * @see <a href="../doc-files/api-spec.html#ccr.unfollow.Request">API
 *      specification</a>
 */

public class UnfollowRequest extends RequestBase {
	private final String index;

	@Nullable
	private final Time masterTimeout;

	// ---------------------------------------------------------------------------------------------

	private UnfollowRequest(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.masterTimeout = builder.masterTimeout;

	}

	public static UnfollowRequest of(Function<Builder, ObjectBuilder<UnfollowRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the follower index.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * The period to wait for a connection to the master node. If the master node is
	 * not available before the timeout expires, the request fails and returns an
	 * error. It can also be set to <code>-1</code> to indicate that the request
	 * should never timeout.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnfollowRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<UnfollowRequest> {
		private String index;

		@Nullable
		private Time masterTimeout;

		public Builder() {
		}
		private Builder(UnfollowRequest instance) {
			this.index = instance.index;
			this.masterTimeout = instance.masterTimeout;

		}
		/**
		 * Required - The name of the follower index.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If the master node is
		 * not available before the timeout expires, the request fails and returns an
		 * error. It can also be set to <code>-1</code> to indicate that the request
		 * should never timeout.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If the master node is
		 * not available before the timeout expires, the request fails and returns an
		 * error. It can also be set to <code>-1</code> to indicate that the request
		 * should never timeout.
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
		 * Builds a {@link UnfollowRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnfollowRequest build() {
			_checkSingleUse();

			return new UnfollowRequest(this);
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
	 * Endpoint "{@code ccr.unfollow}".
	 */
	public static final Endpoint<UnfollowRequest, UnfollowResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ccr.unfollow",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_ccr");
					buf.append("/unfollow");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, UnfollowResponse._DESERIALIZER);
}
