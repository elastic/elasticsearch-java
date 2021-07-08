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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Profile
public final class Profile implements ToJsonp {
	private final List<ShardProfile> shards;

	// ---------------------------------------------------------------------------------------------

	protected Profile(Builder builder) {

		this.shards = Objects.requireNonNull(builder.shards, "shards");

	}

	/**
	 * API name: {@code shards}
	 */
	public List<ShardProfile> shards() {
		return this.shards;
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

		generator.writeKey("shards");
		generator.writeStartArray();
		for (ShardProfile item0 : this.shards) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Profile}.
	 */
	public static class Builder implements ObjectBuilder<Profile> {
		private List<ShardProfile> shards;

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(List<ShardProfile> value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(ShardProfile... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #shards(List)}, creating the list if needed.
		 */
		public Builder addShards(ShardProfile value) {
			if (this.shards == null) {
				this.shards = new ArrayList<>();
			}
			this.shards.add(value);
			return this;
		}

		/**
		 * Set {@link #shards(List)} to a singleton list.
		 */
		public Builder shards(Function<ShardProfile.Builder, ObjectBuilder<ShardProfile>> fn) {
			return this.shards(fn.apply(new ShardProfile.Builder()).build());
		}

		/**
		 * Add a value to {@link #shards(List)}, creating the list if needed.
		 */
		public Builder addShards(Function<ShardProfile.Builder, ObjectBuilder<ShardProfile>> fn) {
			return this.addShards(fn.apply(new ShardProfile.Builder()).build());
		}

		/**
		 * Builds a {@link Profile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Profile build() {

			return new Profile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Profile
	 */
	public static final JsonpDeserializer<Profile> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Profile::setupProfileDeserializer);

	protected static void setupProfileDeserializer(DelegatingDeserializer<Profile.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.arrayDeserializer(ShardProfile.DESERIALIZER), "shards");

	}

}
