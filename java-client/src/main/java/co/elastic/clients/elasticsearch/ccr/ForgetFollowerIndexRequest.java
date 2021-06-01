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
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.forget_follower_index.Request
public final class ForgetFollowerIndexRequest extends RequestBase implements ToJsonp {
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

	protected ForgetFollowerIndexRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.followerCluster = builder.followerCluster;
		this.followerIndex = builder.followerIndex;
		this.followerIndexUuid = builder.followerIndexUuid;
		this.leaderRemoteCluster = builder.leaderRemoteCluster;

	}

	/**
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

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
	 * Builder for {@link ForgetFollowerIndexRequest}.
	 */
	public static class Builder implements ObjectBuilder<ForgetFollowerIndexRequest> {
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
		 * Builds a {@link ForgetFollowerIndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForgetFollowerIndexRequest build() {

			return new ForgetFollowerIndexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ForgetFollowerIndexRequest
	 */
	public static final JsonpValueParser<ForgetFollowerIndexRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ForgetFollowerIndexRequest::setupForgetFollowerIndexRequestParser);

	protected static void setupForgetFollowerIndexRequestParser(
			DelegatingJsonpValueParser<ForgetFollowerIndexRequest.Builder> op) {

		op.add(Builder::followerCluster, JsonpValueParser.stringParser(), "follower_cluster");
		op.add(Builder::followerIndex, JsonpValueParser.stringParser(), "follower_index");
		op.add(Builder::followerIndexUuid, JsonpValueParser.stringParser(), "follower_index_uuid");
		op.add(Builder::leaderRemoteCluster, JsonpValueParser.stringParser(), "leader_remote_cluster");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.forget_follower}".
	 */
	public static final Endpoint<ForgetFollowerIndexRequest, ForgetFollowerIndexResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= index;

				if (propsSet == (index | 0 | 0))
					return "POST";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= index;

				if (propsSet == (index | 0 | 0)) {
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

			}, Endpoint.Simple.emptyMap(), true, ForgetFollowerIndexResponse.JSONP_PARSER);
}
