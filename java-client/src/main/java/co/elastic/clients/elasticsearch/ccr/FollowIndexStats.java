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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr._types.FollowIndexStats
@JsonpDeserializable
public class FollowIndexStats implements JsonpSerializable {
	private final String index;

	private final List<ShardStats> shards;

	// ---------------------------------------------------------------------------------------------

	private FollowIndexStats(Builder builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.shards = ModelTypeHelper.unmodifiableRequired(builder.shards, this, "shards");

	}

	public static FollowIndexStats of(Function<Builder, ObjectBuilder<FollowIndexStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final List<ShardStats> shards() {
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

		if (ModelTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartArray();
			for (ShardStats item0 : this.shards) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowIndexStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FollowIndexStats> {
		private String index;

		private List<ShardStats> shards;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(List<ShardStats> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(ShardStats... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		@SafeVarargs
		public final Builder shards(Function<ShardStats.Builder, ObjectBuilder<ShardStats>>... fns) {
			this.shards = new ArrayList<>(fns.length);
			for (Function<ShardStats.Builder, ObjectBuilder<ShardStats>> fn : fns) {
				this.shards.add(fn.apply(new ShardStats.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link FollowIndexStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowIndexStats build() {
			_checkSingleUse();

			return new FollowIndexStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FollowIndexStats}
	 */
	public static final JsonpDeserializer<FollowIndexStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FollowIndexStats::setupFollowIndexStatsDeserializer, Builder::build);

	protected static void setupFollowIndexStatsDeserializer(DelegatingDeserializer<FollowIndexStats.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::shards, JsonpDeserializer.arrayDeserializer(ShardStats._DESERIALIZER), "shards");

	}

}
