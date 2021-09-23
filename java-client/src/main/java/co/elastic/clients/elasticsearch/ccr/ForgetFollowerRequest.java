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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.forget_follower.Request
public final class ForgetFollowerRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String followerCluster;

	@Nullable
	private final String followerIndex;

	@Nullable
	private final String followerIndexUuid;

	@Nullable
	private final String leaderRemoteCluster;

	// ---------------------------------------------------------------------------------------------

	public ForgetFollowerRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.followerCluster = builder.followerCluster;
		this.followerIndex = builder.followerIndex;
		this.followerIndexUuid = builder.followerIndexUuid;
		this.leaderRemoteCluster = builder.leaderRemoteCluster;

	}

	/**
	 * the name of the leader index for which specified follower retention leases
	 * should be removed
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code follower_cluster}
	 */
	@Nullable
	public String followerCluster() {
		return this.followerCluster;
	}

	/**
	 * API name: {@code follower_index}
	 */
	@Nullable
	public String followerIndex() {
		return this.followerIndex;
	}

	/**
	 * API name: {@code follower_index_uuid}
	 */
	@Nullable
	public String followerIndexUuid() {
		return this.followerIndexUuid;
	}

	/**
	 * API name: {@code leader_remote_cluster}
	 */
	@Nullable
	public String leaderRemoteCluster() {
		return this.leaderRemoteCluster;
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
	public static class Builder implements ObjectBuilder<ForgetFollowerRequest> {
		private String index;

		@Nullable
		private String followerCluster;

		@Nullable
		private String followerIndex;

		@Nullable
		private String followerIndexUuid;

		@Nullable
		private String leaderRemoteCluster;

		/**
		 * the name of the leader index for which specified follower retention leases
		 * should be removed
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code follower_cluster}
		 */
		public Builder followerCluster(@Nullable String value) {
			this.followerCluster = value;
			return this;
		}

		/**
		 * API name: {@code follower_index}
		 */
		public Builder followerIndex(@Nullable String value) {
			this.followerIndex = value;
			return this;
		}

		/**
		 * API name: {@code follower_index_uuid}
		 */
		public Builder followerIndexUuid(@Nullable String value) {
			this.followerIndexUuid = value;
			return this;
		}

		/**
		 * API name: {@code leader_remote_cluster}
		 */
		public Builder leaderRemoteCluster(@Nullable String value) {
			this.leaderRemoteCluster = value;
			return this;
		}

		/**
		 * Builds a {@link ForgetFollowerRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForgetFollowerRequest build() {

			return new ForgetFollowerRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForgetFollowerRequest}
	 */
	public static final JsonpDeserializer<ForgetFollowerRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ForgetFollowerRequest::setupForgetFollowerRequestDeserializer);

	protected static void setupForgetFollowerRequestDeserializer(
			DelegatingDeserializer<ForgetFollowerRequest.Builder> op) {

		op.add(Builder::followerCluster, JsonpDeserializer.stringDeserializer(), "follower_cluster");
		op.add(Builder::followerIndex, JsonpDeserializer.stringDeserializer(), "follower_index");
		op.add(Builder::followerIndexUuid, JsonpDeserializer.stringDeserializer(), "follower_index_uuid");
		op.add(Builder::leaderRemoteCluster, JsonpDeserializer.stringDeserializer(), "leader_remote_cluster");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.forget_follower}".
	 */
	public static final Endpoint<ForgetFollowerRequest, ForgetFollowerResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_ccr");
					buf.append("/forget_follower");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ForgetFollowerResponse.DESERIALIZER);
}
