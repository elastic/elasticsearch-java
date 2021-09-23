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

import co.elastic.clients.elasticsearch.ccr.follow_info.FollowerIndex;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.follow_info.Response
public final class FollowInfoResponse implements JsonpSerializable {
	private final List<FollowerIndex> followerIndices;

	// ---------------------------------------------------------------------------------------------

	public FollowInfoResponse(Builder builder) {

		this.followerIndices = Objects.requireNonNull(builder.followerIndices, "follower_indices");

	}

	/**
	 * API name: {@code follower_indices}
	 */
	public List<FollowerIndex> followerIndices() {
		return this.followerIndices;
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

		generator.writeKey("follower_indices");
		generator.writeStartArray();
		for (FollowerIndex item0 : this.followerIndices) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowInfoResponse}.
	 */
	public static class Builder implements ObjectBuilder<FollowInfoResponse> {
		private List<FollowerIndex> followerIndices;

		/**
		 * API name: {@code follower_indices}
		 */
		public Builder followerIndices(List<FollowerIndex> value) {
			this.followerIndices = value;
			return this;
		}

		/**
		 * API name: {@code follower_indices}
		 */
		public Builder followerIndices(FollowerIndex... value) {
			this.followerIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #followerIndices(List)}, creating the list if needed.
		 */
		public Builder addFollowerIndices(FollowerIndex value) {
			if (this.followerIndices == null) {
				this.followerIndices = new ArrayList<>();
			}
			this.followerIndices.add(value);
			return this;
		}

		/**
		 * Set {@link #followerIndices(List)} to a singleton list.
		 */
		public Builder followerIndices(Function<FollowerIndex.Builder, ObjectBuilder<FollowerIndex>> fn) {
			return this.followerIndices(fn.apply(new FollowerIndex.Builder()).build());
		}

		/**
		 * Add a value to {@link #followerIndices(List)}, creating the list if needed.
		 */
		public Builder addFollowerIndices(Function<FollowerIndex.Builder, ObjectBuilder<FollowerIndex>> fn) {
			return this.addFollowerIndices(fn.apply(new FollowerIndex.Builder()).build());
		}

		/**
		 * Builds a {@link FollowInfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowInfoResponse build() {

			return new FollowInfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowInfoResponse}
	 */
	public static final JsonpDeserializer<FollowInfoResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FollowInfoResponse::setupFollowInfoResponseDeserializer);

	protected static void setupFollowInfoResponseDeserializer(DelegatingDeserializer<FollowInfoResponse.Builder> op) {

		op.add(Builder::followerIndices, JsonpDeserializer.arrayDeserializer(FollowerIndex.DESERIALIZER),
				"follower_indices");

	}

}
