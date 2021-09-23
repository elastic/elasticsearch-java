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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr._types.FollowIndexStats
public final class FollowIndexStats implements JsonpSerializable {
	private final String index;

	private final List<ShardStats> shards;

	// ---------------------------------------------------------------------------------------------

	public FollowIndexStats(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.shards = Objects.requireNonNull(builder.shards, "shards");

	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code shards}
	 */
	public List<ShardStats> shards() {
		return this.shards;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("shards");
		generator.writeStartArray();
		for (ShardStats item0 : this.shards) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowIndexStats}.
	 */
	public static class Builder implements ObjectBuilder<FollowIndexStats> {
		private String index;

		private List<ShardStats> shards;

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(List<ShardStats> value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(ShardStats... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #shards(List)}, creating the list if needed.
		 */
		public Builder addShards(ShardStats value) {
			if (this.shards == null) {
				this.shards = new ArrayList<>();
			}
			this.shards.add(value);
			return this;
		}

		/**
		 * Set {@link #shards(List)} to a singleton list.
		 */
		public Builder shards(Function<ShardStats.Builder, ObjectBuilder<ShardStats>> fn) {
			return this.shards(fn.apply(new ShardStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #shards(List)}, creating the list if needed.
		 */
		public Builder addShards(Function<ShardStats.Builder, ObjectBuilder<ShardStats>> fn) {
			return this.addShards(fn.apply(new ShardStats.Builder()).build());
		}

		/**
		 * Builds a {@link FollowIndexStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowIndexStats build() {

			return new FollowIndexStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowIndexStats}
	 */
	public static final JsonpDeserializer<FollowIndexStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FollowIndexStats::setupFollowIndexStatsDeserializer);

	protected static void setupFollowIndexStatsDeserializer(DelegatingDeserializer<FollowIndexStats.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::shards, JsonpDeserializer.arrayDeserializer(ShardStats.DESERIALIZER), "shards");

	}

}
