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

// typedef: ccr.forget_follower.Request

/**
 * Forget a follower.
 * <p>
 * Remove the cross-cluster replication follower retention leases from the
 * leader.
 * <p>
 * A following index takes out retention leases on its leader index. These
 * leases are used to increase the likelihood that the shards of the leader
 * index retain the history of operations that the shards of the following index
 * need to run replication. When a follower index is converted to a regular
 * index by the unfollow API (either by directly calling the API or by index
 * lifecycle management tasks), these leases are removed. However, removal of
 * the leases can fail, for example when the remote cluster containing the
 * leader index is unavailable. While the leases will eventually expire on their
 * own, their extended existence can cause the leader index to hold more history
 * than necessary and prevent index lifecycle management from performing some
 * operations on the leader index. This API exists to enable manually removing
 * the leases when the unfollow API is unable to do so.
 * <p>
 * NOTE: This API does not stop replication by a following index. If you use
 * this API with a follower index that is still actively following, the
 * following index will add back retention leases on the leader. The only
 * purpose of this API is to handle the case of failure to remove the following
 * retention leases after the unfollow API is invoked.
 * 
 * @see <a href="../doc-files/api-spec.html#ccr.forget_follower.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ForgetFollowerRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String followerCluster;

	@Nullable
	private final String followerIndex;

	@Nullable
	private final String followerIndexUuid;

	private final String index;

	@Nullable
	private final String leaderRemoteCluster;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private ForgetFollowerRequest(Builder builder) {

		this.followerCluster = builder.followerCluster;
		this.followerIndex = builder.followerIndex;
		this.followerIndexUuid = builder.followerIndexUuid;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.leaderRemoteCluster = builder.leaderRemoteCluster;
		this.timeout = builder.timeout;

	}

	public static ForgetFollowerRequest of(Function<Builder, ObjectBuilder<ForgetFollowerRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code follower_cluster}
	 */
	@Nullable
	public final String followerCluster() {
		return this.followerCluster;
	}

	/**
	 * API name: {@code follower_index}
	 */
	@Nullable
	public final String followerIndex() {
		return this.followerIndex;
	}

	/**
	 * API name: {@code follower_index_uuid}
	 */
	@Nullable
	public final String followerIndexUuid() {
		return this.followerIndexUuid;
	}

	/**
	 * Required - Name of the leader index for which specified follower retention
	 * leases should be removed
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code leader_remote_cluster}
	 */
	@Nullable
	public final String leaderRemoteCluster() {
		return this.leaderRemoteCluster;
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

		if (this.followerCluster != null) {
			generator.writeKey("follower_cluster");
			generator.write(this.followerCluster);

		}
		if (this.followerIndex != null) {
			generator.writeKey("follower_index");
			generator.write(this.followerIndex);

		}
		if (this.followerIndexUuid != null) {
			generator.writeKey("follower_index_uuid");
			generator.write(this.followerIndexUuid);

		}
		if (this.leaderRemoteCluster != null) {
			generator.writeKey("leader_remote_cluster");
			generator.write(this.leaderRemoteCluster);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForgetFollowerRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ForgetFollowerRequest> {
		@Nullable
		private String followerCluster;

		@Nullable
		private String followerIndex;

		@Nullable
		private String followerIndexUuid;

		private String index;

		@Nullable
		private String leaderRemoteCluster;

		@Nullable
		private Time timeout;

		/**
		 * API name: {@code follower_cluster}
		 */
		public final Builder followerCluster(@Nullable String value) {
			this.followerCluster = value;
			return this;
		}

		/**
		 * API name: {@code follower_index}
		 */
		public final Builder followerIndex(@Nullable String value) {
			this.followerIndex = value;
			return this;
		}

		/**
		 * API name: {@code follower_index_uuid}
		 */
		public final Builder followerIndexUuid(@Nullable String value) {
			this.followerIndexUuid = value;
			return this;
		}

		/**
		 * Required - Name of the leader index for which specified follower retention
		 * leases should be removed
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code leader_remote_cluster}
		 */
		public final Builder leaderRemoteCluster(@Nullable String value) {
			this.leaderRemoteCluster = value;
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
		 * Builds a {@link ForgetFollowerRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForgetFollowerRequest build() {
			_checkSingleUse();

			return new ForgetFollowerRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForgetFollowerRequest}
	 */
	public static final JsonpDeserializer<ForgetFollowerRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ForgetFollowerRequest::setupForgetFollowerRequestDeserializer);

	protected static void setupForgetFollowerRequestDeserializer(ObjectDeserializer<ForgetFollowerRequest.Builder> op) {

		op.add(Builder::followerCluster, JsonpDeserializer.stringDeserializer(), "follower_cluster");
		op.add(Builder::followerIndex, JsonpDeserializer.stringDeserializer(), "follower_index");
		op.add(Builder::followerIndexUuid, JsonpDeserializer.stringDeserializer(), "follower_index_uuid");
		op.add(Builder::leaderRemoteCluster, JsonpDeserializer.stringDeserializer(), "leader_remote_cluster");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.forget_follower}".
	 */
	public static final Endpoint<ForgetFollowerRequest, ForgetFollowerResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ccr.forget_follower",

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
					buf.append("/forget_follower");
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
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ForgetFollowerResponse._DESERIALIZER);
}
