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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.FielddataStats
@JsonpDeserializable
public final class FielddataStats implements JsonpSerializable {
	@Nullable
	private final Long evictions;

	@Nullable
	private final String memorySize;

	private final long memorySizeInBytes;

	@Nullable
	private final Map<String, FieldMemoryUsage> fields;

	// ---------------------------------------------------------------------------------------------

	public FielddataStats(Builder builder) {

		this.evictions = builder.evictions;
		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = Objects.requireNonNull(builder.memorySizeInBytes, "memory_size_in_bytes");
		this.fields = builder.fields;

	}

	/**
	 * API name: {@code evictions}
	 */
	@Nullable
	public Long evictions() {
		return this.evictions;
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
	public long memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, FieldMemoryUsage> fields() {
		return this.fields;
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

		if (this.evictions != null) {

			generator.writeKey("evictions");
			generator.write(this.evictions);

		}
		if (this.memorySize != null) {

			generator.writeKey("memory_size");
			generator.write(this.memorySize);

		}

		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes);

		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, FieldMemoryUsage> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FielddataStats}.
	 */
	public static class Builder implements ObjectBuilder<FielddataStats> {
		@Nullable
		private Long evictions;

		@Nullable
		private String memorySize;

		private Long memorySizeInBytes;

		@Nullable
		private Map<String, FieldMemoryUsage> fields;

		/**
		 * API name: {@code evictions}
		 */
		public Builder evictions(@Nullable Long value) {
			this.evictions = value;
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
		public Builder memorySizeInBytes(long value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable Map<String, FieldMemoryUsage> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, FieldMemoryUsage value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #fields(Map)} to a singleton map.
		 */
		public Builder fields(String key, Function<FieldMemoryUsage.Builder, ObjectBuilder<FieldMemoryUsage>> fn) {
			return this.fields(Collections.singletonMap(key, fn.apply(new FieldMemoryUsage.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, Function<FieldMemoryUsage.Builder, ObjectBuilder<FieldMemoryUsage>> fn) {
			return this.putFields(key, fn.apply(new FieldMemoryUsage.Builder()).build());
		}

		/**
		 * Builds a {@link FielddataStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FielddataStats build() {

			return new FielddataStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FielddataStats}
	 */
	public static final JsonpDeserializer<FielddataStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FielddataStats::setupFielddataStatsDeserializer, Builder::build);

	protected static void setupFielddataStatsDeserializer(DelegatingDeserializer<FielddataStats.Builder> op) {

		op.add(Builder::evictions, JsonpDeserializer.longDeserializer(), "evictions");
		op.add(Builder::memorySize, JsonpDeserializer.stringDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.longDeserializer(), "memory_size_in_bytes");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(FieldMemoryUsage._DESERIALIZER), "fields");

	}

}
