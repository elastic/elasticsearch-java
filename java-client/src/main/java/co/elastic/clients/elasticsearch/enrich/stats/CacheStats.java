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

package co.elastic.clients.elasticsearch.enrich.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.stats.CacheStats
@JsonpDeserializable
public final class CacheStats implements JsonpSerializable {
	private final String nodeId;

	private final int count;

	private final int hits;

	private final int misses;

	private final int evictions;

	// ---------------------------------------------------------------------------------------------

	public CacheStats(Builder builder) {

		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.misses = Objects.requireNonNull(builder.misses, "misses");
		this.evictions = Objects.requireNonNull(builder.evictions, "evictions");

	}

	public CacheStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public int hits() {
		return this.hits;
	}

	/**
	 * Required - API name: {@code misses}
	 */
	public int misses() {
		return this.misses;
	}

	/**
	 * Required - API name: {@code evictions}
	 */
	public int evictions() {
		return this.evictions;
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

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("hits");
		generator.write(this.hits);

		generator.writeKey("misses");
		generator.write(this.misses);

		generator.writeKey("evictions");
		generator.write(this.evictions);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CacheStats}.
	 */
	public static class Builder implements ObjectBuilder<CacheStats> {
		private String nodeId;

		private Integer count;

		private Integer hits;

		private Integer misses;

		private Integer evictions;

		/**
		 * Required - API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public Builder hits(int value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - API name: {@code misses}
		 */
		public Builder misses(int value) {
			this.misses = value;
			return this;
		}

		/**
		 * Required - API name: {@code evictions}
		 */
		public Builder evictions(int value) {
			this.evictions = value;
			return this;
		}

		/**
		 * Builds a {@link CacheStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CacheStats build() {

			return new CacheStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CacheStats}
	 */
	public static final JsonpDeserializer<CacheStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CacheStats::setupCacheStatsDeserializer, Builder::build);

	protected static void setupCacheStatsDeserializer(DelegatingDeserializer<CacheStats.Builder> op) {

		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::hits, JsonpDeserializer.integerDeserializer(), "hits");
		op.add(Builder::misses, JsonpDeserializer.integerDeserializer(), "misses");
		op.add(Builder::evictions, JsonpDeserializer.integerDeserializer(), "evictions");

	}

}
