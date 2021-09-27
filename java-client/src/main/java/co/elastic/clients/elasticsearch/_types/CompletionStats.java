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

// typedef: _types.CompletionStats
@JsonpDeserializable
public final class CompletionStats implements JsonpSerializable {
	private final long sizeInBytes;

	@Nullable
	private final String size;

	@Nullable
	private final Map<String, FieldSizeUsage> fields;

	// ---------------------------------------------------------------------------------------------

	public CompletionStats(Builder builder) {

		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.size = builder.size;
		this.fields = builder.fields;

	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public long sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public String size() {
		return this.size;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, FieldSizeUsage> fields() {
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

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, FieldSizeUsage> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionStats}.
	 */
	public static class Builder implements ObjectBuilder<CompletionStats> {
		private Long sizeInBytes;

		@Nullable
		private String size;

		@Nullable
		private Map<String, FieldSizeUsage> fields;

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable Map<String, FieldSizeUsage> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, FieldSizeUsage value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #fields(Map)} to a singleton map.
		 */
		public Builder fields(String key, Function<FieldSizeUsage.Builder, ObjectBuilder<FieldSizeUsage>> fn) {
			return this.fields(Collections.singletonMap(key, fn.apply(new FieldSizeUsage.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, Function<FieldSizeUsage.Builder, ObjectBuilder<FieldSizeUsage>> fn) {
			return this.putFields(key, fn.apply(new FieldSizeUsage.Builder()).build());
		}

		/**
		 * Builds a {@link CompletionStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionStats build() {

			return new CompletionStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionStats}
	 */
	public static final JsonpDeserializer<CompletionStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CompletionStats::setupCompletionStatsDeserializer, Builder::build);

	protected static void setupCompletionStatsDeserializer(DelegatingDeserializer<CompletionStats.Builder> op) {

		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(FieldSizeUsage._DESERIALIZER), "fields");

	}

}
