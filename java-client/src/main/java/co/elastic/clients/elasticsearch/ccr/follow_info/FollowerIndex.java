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

package co.elastic.clients.elasticsearch.ccr.follow_info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.follow_info.FollowerIndex
@JsonpDeserializable
public final class FollowerIndex implements JsonpSerializable {
	private final String followerIndex;

	private final String leaderIndex;

	@Nullable
	private final FollowerIndexParameters parameters;

	private final String remoteCluster;

	private final FollowerIndexStatus status;

	// ---------------------------------------------------------------------------------------------

	public FollowerIndex(Builder builder) {

		this.followerIndex = Objects.requireNonNull(builder.followerIndex, "follower_index");
		this.leaderIndex = Objects.requireNonNull(builder.leaderIndex, "leader_index");
		this.parameters = builder.parameters;
		this.remoteCluster = Objects.requireNonNull(builder.remoteCluster, "remote_cluster");
		this.status = Objects.requireNonNull(builder.status, "status");

	}

	/**
	 * API name: {@code follower_index}
	 */
	public String followerIndex() {
		return this.followerIndex;
	}

	/**
	 * API name: {@code leader_index}
	 */
	public String leaderIndex() {
		return this.leaderIndex;
	}

	/**
	 * API name: {@code parameters}
	 */
	@Nullable
	public FollowerIndexParameters parameters() {
		return this.parameters;
	}

	/**
	 * API name: {@code remote_cluster}
	 */
	public String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * API name: {@code status}
	 */
	public FollowerIndexStatus status() {
		return this.status;
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

		generator.writeKey("follower_index");
		generator.write(this.followerIndex);

		generator.writeKey("leader_index");
		generator.write(this.leaderIndex);

		if (this.parameters != null) {

			generator.writeKey("parameters");
			this.parameters.serialize(generator, mapper);

		}

		generator.writeKey("remote_cluster");
		generator.write(this.remoteCluster);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowerIndex}.
	 */
	public static class Builder implements ObjectBuilder<FollowerIndex> {
		private String followerIndex;

		private String leaderIndex;

		@Nullable
		private FollowerIndexParameters parameters;

		private String remoteCluster;

		private FollowerIndexStatus status;

		/**
		 * API name: {@code follower_index}
		 */
		public Builder followerIndex(String value) {
			this.followerIndex = value;
			return this;
		}

		/**
		 * API name: {@code leader_index}
		 */
		public Builder leaderIndex(String value) {
			this.leaderIndex = value;
			return this;
		}

		/**
		 * API name: {@code parameters}
		 */
		public Builder parameters(@Nullable FollowerIndexParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * API name: {@code parameters}
		 */
		public Builder parameters(
				Function<FollowerIndexParameters.Builder, ObjectBuilder<FollowerIndexParameters>> fn) {
			return this.parameters(fn.apply(new FollowerIndexParameters.Builder()).build());
		}

		/**
		 * API name: {@code remote_cluster}
		 */
		public Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(FollowerIndexStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link FollowerIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowerIndex build() {

			return new FollowerIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowerIndex}
	 */
	public static final JsonpDeserializer<FollowerIndex> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FollowerIndex::setupFollowerIndexDeserializer, Builder::build);

	protected static void setupFollowerIndexDeserializer(DelegatingDeserializer<FollowerIndex.Builder> op) {

		op.add(Builder::followerIndex, JsonpDeserializer.stringDeserializer(), "follower_index");
		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::parameters, FollowerIndexParameters._DESERIALIZER, "parameters");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");
		op.add(Builder::status, FollowerIndexStatus._DESERIALIZER, "status");

	}

}
