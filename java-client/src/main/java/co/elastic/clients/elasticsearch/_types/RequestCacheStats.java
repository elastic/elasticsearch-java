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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.RequestCacheStats
public final class RequestCacheStats implements ToJsonp {
	private final Number evictions;

	private final Number hitCount;

	@Nullable
	private final String memorySize;

	private final Number memorySizeInBytes;

	private final Number missCount;

	// ---------------------------------------------------------------------------------------------

	protected RequestCacheStats(Builder builder) {

		this.evictions = Objects.requireNonNull(builder.evictions, "evictions");
		this.hitCount = Objects.requireNonNull(builder.hitCount, "hit_count");
		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = Objects.requireNonNull(builder.memorySizeInBytes, "memory_size_in_bytes");
		this.missCount = Objects.requireNonNull(builder.missCount, "miss_count");

	}

	/**
	 * API name: {@code evictions}
	 */
	public Number evictions() {
		return this.evictions;
	}

	/**
	 * API name: {@code hit_count}
	 */
	public Number hitCount() {
		return this.hitCount;
	}

	/**
	 * API name: {@code memory_size}
	 */
	@Nullable
	public String memorySize() {
		return this.memorySize;
	}

	/**
	 * API name: {@code memory_size_in_bytes}
	 */
	public Number memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * API name: {@code miss_count}
	 */
	public Number missCount() {
		return this.missCount;
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

		generator.writeKey("evictions");
		generator.write(this.evictions.doubleValue());

		generator.writeKey("hit_count");
		generator.write(this.hitCount.doubleValue());

		if (this.memorySize != null) {

			generator.writeKey("memory_size");
			generator.write(this.memorySize);

		}

		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes.doubleValue());

		generator.writeKey("miss_count");
		generator.write(this.missCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RequestCacheStats}.
	 */
	public static class Builder implements ObjectBuilder<RequestCacheStats> {
		private Number evictions;

		private Number hitCount;

		@Nullable
		private String memorySize;

		private Number memorySizeInBytes;

		private Number missCount;

		/**
		 * API name: {@code evictions}
		 */
		public Builder evictions(Number value) {
			this.evictions = value;
			return this;
		}

		/**
		 * API name: {@code hit_count}
		 */
		public Builder hitCount(Number value) {
			this.hitCount = value;
			return this;
		}

		/**
		 * API name: {@code memory_size}
		 */
		public Builder memorySize(@Nullable String value) {
			this.memorySize = value;
			return this;
		}

		/**
		 * API name: {@code memory_size_in_bytes}
		 */
		public Builder memorySizeInBytes(Number value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code miss_count}
		 */
		public Builder missCount(Number value) {
			this.missCount = value;
			return this;
		}

		/**
		 * Builds a {@link RequestCacheStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RequestCacheStats build() {

			return new RequestCacheStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RequestCacheStats
	 */
	public static final JsonpDeserializer<RequestCacheStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RequestCacheStats::setupRequestCacheStatsDeserializer);

	protected static void setupRequestCacheStatsDeserializer(DelegatingDeserializer<RequestCacheStats.Builder> op) {

		op.add(Builder::evictions, JsonpDeserializer.numberDeserializer(), "evictions");
		op.add(Builder::hitCount, JsonpDeserializer.numberDeserializer(), "hit_count");
		op.add(Builder::memorySize, JsonpDeserializer.stringDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.numberDeserializer(), "memory_size_in_bytes");
		op.add(Builder::missCount, JsonpDeserializer.numberDeserializer(), "miss_count");

	}

}
