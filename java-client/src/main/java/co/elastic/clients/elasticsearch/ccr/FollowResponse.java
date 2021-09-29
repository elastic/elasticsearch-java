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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: ccr.follow.Response
@JsonpDeserializable
public final class FollowResponse implements JsonpSerializable {
	private final boolean followIndexCreated;

	private final boolean followIndexShardsAcked;

	private final boolean indexFollowingStarted;

	// ---------------------------------------------------------------------------------------------

	public FollowResponse(Builder builder) {

		this.followIndexCreated = Objects.requireNonNull(builder.followIndexCreated, "follow_index_created");
		this.followIndexShardsAcked = Objects.requireNonNull(builder.followIndexShardsAcked,
				"follow_index_shards_acked");
		this.indexFollowingStarted = Objects.requireNonNull(builder.indexFollowingStarted, "index_following_started");

	}

	public FollowResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code follow_index_created}
	 */
	public boolean followIndexCreated() {
		return this.followIndexCreated;
	}

	/**
	 * API name: {@code follow_index_shards_acked}
	 */
	public boolean followIndexShardsAcked() {
		return this.followIndexShardsAcked;
	}

	/**
	 * API name: {@code index_following_started}
	 */
	public boolean indexFollowingStarted() {
		return this.indexFollowingStarted;
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

		generator.writeKey("follow_index_created");
		generator.write(this.followIndexCreated);

		generator.writeKey("follow_index_shards_acked");
		generator.write(this.followIndexShardsAcked);

		generator.writeKey("index_following_started");
		generator.write(this.indexFollowingStarted);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowResponse}.
	 */
	public static class Builder implements ObjectBuilder<FollowResponse> {
		private Boolean followIndexCreated;

		private Boolean followIndexShardsAcked;

		private Boolean indexFollowingStarted;

		/**
		 * API name: {@code follow_index_created}
		 */
		public Builder followIndexCreated(boolean value) {
			this.followIndexCreated = value;
			return this;
		}

		/**
		 * API name: {@code follow_index_shards_acked}
		 */
		public Builder followIndexShardsAcked(boolean value) {
			this.followIndexShardsAcked = value;
			return this;
		}

		/**
		 * API name: {@code index_following_started}
		 */
		public Builder indexFollowingStarted(boolean value) {
			this.indexFollowingStarted = value;
			return this;
		}

		/**
		 * Builds a {@link FollowResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowResponse build() {

			return new FollowResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowResponse}
	 */
	public static final JsonpDeserializer<FollowResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FollowResponse::setupFollowResponseDeserializer, Builder::build);

	protected static void setupFollowResponseDeserializer(DelegatingDeserializer<FollowResponse.Builder> op) {

		op.add(Builder::followIndexCreated, JsonpDeserializer.booleanDeserializer(), "follow_index_created");
		op.add(Builder::followIndexShardsAcked, JsonpDeserializer.booleanDeserializer(), "follow_index_shards_acked");
		op.add(Builder::indexFollowingStarted, JsonpDeserializer.booleanDeserializer(), "index_following_started");

	}

}
