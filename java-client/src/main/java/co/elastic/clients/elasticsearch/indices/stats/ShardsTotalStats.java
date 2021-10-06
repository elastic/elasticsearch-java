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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.stats.ShardsTotalStats
@JsonpDeserializable
public final class ShardsTotalStats implements JsonpSerializable {
	private final long totalCount;

	// ---------------------------------------------------------------------------------------------

	public ShardsTotalStats(Builder builder) {

		this.totalCount = Objects.requireNonNull(builder.totalCount, "total_count");

	}

	public ShardsTotalStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code total_count}
	 */
	public long totalCount() {
		return this.totalCount;
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

		generator.writeKey("total_count");
		generator.write(this.totalCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsTotalStats}.
	 */
	public static class Builder implements ObjectBuilder<ShardsTotalStats> {
		private Long totalCount;

		/**
		 * Required - API name: {@code total_count}
		 */
		public Builder totalCount(long value) {
			this.totalCount = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsTotalStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsTotalStats build() {

			return new ShardsTotalStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsTotalStats}
	 */
	public static final JsonpDeserializer<ShardsTotalStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardsTotalStats::setupShardsTotalStatsDeserializer, Builder::build);

	protected static void setupShardsTotalStatsDeserializer(DelegatingDeserializer<ShardsTotalStats.Builder> op) {

		op.add(Builder::totalCount, JsonpDeserializer.longDeserializer(), "total_count");

	}

}
