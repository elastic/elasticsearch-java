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

import co.elastic.clients.elasticsearch.indices.stats.ShardFileSizeInfo;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SegmentsStats
public final class SegmentsStats implements JsonpSerializable {
	private final Number count;

	@Nullable
	private final JsonValue docValuesMemory;

	private final Number docValuesMemoryInBytes;

	private final Map<String, ShardFileSizeInfo> fileSizes;

	@Nullable
	private final JsonValue fixedBitSet;

	private final Number fixedBitSetMemoryInBytes;

	@Nullable
	private final JsonValue indexWriterMemory;

	@Nullable
	private final Number indexWriterMaxMemoryInBytes;

	private final Number indexWriterMemoryInBytes;

	private final Number maxUnsafeAutoIdTimestamp;

	@Nullable
	private final JsonValue memory;

	private final Number memoryInBytes;

	@Nullable
	private final JsonValue normsMemory;

	private final Number normsMemoryInBytes;

	@Nullable
	private final JsonValue pointsMemory;

	private final Number pointsMemoryInBytes;

	@Nullable
	private final JsonValue storedMemory;

	private final Number storedFieldsMemoryInBytes;

	private final Number termsMemoryInBytes;

	@Nullable
	private final JsonValue termsMemory;

	@Nullable
	private final JsonValue termVectoryMemory;

	private final Number termVectorsMemoryInBytes;

	@Nullable
	private final JsonValue versionMapMemory;

	private final Number versionMapMemoryInBytes;

	// ---------------------------------------------------------------------------------------------

	public SegmentsStats(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.docValuesMemory = builder.docValuesMemory;
		this.docValuesMemoryInBytes = Objects.requireNonNull(builder.docValuesMemoryInBytes,
				"doc_values_memory_in_bytes");
		this.fileSizes = Objects.requireNonNull(builder.fileSizes, "file_sizes");
		this.fixedBitSet = builder.fixedBitSet;
		this.fixedBitSetMemoryInBytes = Objects.requireNonNull(builder.fixedBitSetMemoryInBytes,
				"fixed_bit_set_memory_in_bytes");
		this.indexWriterMemory = builder.indexWriterMemory;
		this.indexWriterMaxMemoryInBytes = builder.indexWriterMaxMemoryInBytes;
		this.indexWriterMemoryInBytes = Objects.requireNonNull(builder.indexWriterMemoryInBytes,
				"index_writer_memory_in_bytes");
		this.maxUnsafeAutoIdTimestamp = Objects.requireNonNull(builder.maxUnsafeAutoIdTimestamp,
				"max_unsafe_auto_id_timestamp");
		this.memory = builder.memory;
		this.memoryInBytes = Objects.requireNonNull(builder.memoryInBytes, "memory_in_bytes");
		this.normsMemory = builder.normsMemory;
		this.normsMemoryInBytes = Objects.requireNonNull(builder.normsMemoryInBytes, "norms_memory_in_bytes");
		this.pointsMemory = builder.pointsMemory;
		this.pointsMemoryInBytes = Objects.requireNonNull(builder.pointsMemoryInBytes, "points_memory_in_bytes");
		this.storedMemory = builder.storedMemory;
		this.storedFieldsMemoryInBytes = Objects.requireNonNull(builder.storedFieldsMemoryInBytes,
				"stored_fields_memory_in_bytes");
		this.termsMemoryInBytes = Objects.requireNonNull(builder.termsMemoryInBytes, "terms_memory_in_bytes");
		this.termsMemory = builder.termsMemory;
		this.termVectoryMemory = builder.termVectoryMemory;
		this.termVectorsMemoryInBytes = Objects.requireNonNull(builder.termVectorsMemoryInBytes,
				"term_vectors_memory_in_bytes");
		this.versionMapMemory = builder.versionMapMemory;
		this.versionMapMemoryInBytes = Objects.requireNonNull(builder.versionMapMemoryInBytes,
				"version_map_memory_in_bytes");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code doc_values_memory}
	 */
	@Nullable
	public JsonValue docValuesMemory() {
		return this.docValuesMemory;
	}

	/**
	 * API name: {@code doc_values_memory_in_bytes}
	 */
	public Number docValuesMemoryInBytes() {
		return this.docValuesMemoryInBytes;
	}

	/**
	 * API name: {@code file_sizes}
	 */
	public Map<String, ShardFileSizeInfo> fileSizes() {
		return this.fileSizes;
	}

	/**
	 * API name: {@code fixed_bit_set}
	 */
	@Nullable
	public JsonValue fixedBitSet() {
		return this.fixedBitSet;
	}

	/**
	 * API name: {@code fixed_bit_set_memory_in_bytes}
	 */
	public Number fixedBitSetMemoryInBytes() {
		return this.fixedBitSetMemoryInBytes;
	}

	/**
	 * API name: {@code index_writer_memory}
	 */
	@Nullable
	public JsonValue indexWriterMemory() {
		return this.indexWriterMemory;
	}

	/**
	 * API name: {@code index_writer_max_memory_in_bytes}
	 */
	@Nullable
	public Number indexWriterMaxMemoryInBytes() {
		return this.indexWriterMaxMemoryInBytes;
	}

	/**
	 * API name: {@code index_writer_memory_in_bytes}
	 */
	public Number indexWriterMemoryInBytes() {
		return this.indexWriterMemoryInBytes;
	}

	/**
	 * API name: {@code max_unsafe_auto_id_timestamp}
	 */
	public Number maxUnsafeAutoIdTimestamp() {
		return this.maxUnsafeAutoIdTimestamp;
	}

	/**
	 * API name: {@code memory}
	 */
	@Nullable
	public JsonValue memory() {
		return this.memory;
	}

	/**
	 * API name: {@code memory_in_bytes}
	 */
	public Number memoryInBytes() {
		return this.memoryInBytes;
	}

	/**
	 * API name: {@code norms_memory}
	 */
	@Nullable
	public JsonValue normsMemory() {
		return this.normsMemory;
	}

	/**
	 * API name: {@code norms_memory_in_bytes}
	 */
	public Number normsMemoryInBytes() {
		return this.normsMemoryInBytes;
	}

	/**
	 * API name: {@code points_memory}
	 */
	@Nullable
	public JsonValue pointsMemory() {
		return this.pointsMemory;
	}

	/**
	 * API name: {@code points_memory_in_bytes}
	 */
	public Number pointsMemoryInBytes() {
		return this.pointsMemoryInBytes;
	}

	/**
	 * API name: {@code stored_memory}
	 */
	@Nullable
	public JsonValue storedMemory() {
		return this.storedMemory;
	}

	/**
	 * API name: {@code stored_fields_memory_in_bytes}
	 */
	public Number storedFieldsMemoryInBytes() {
		return this.storedFieldsMemoryInBytes;
	}

	/**
	 * API name: {@code terms_memory_in_bytes}
	 */
	public Number termsMemoryInBytes() {
		return this.termsMemoryInBytes;
	}

	/**
	 * API name: {@code terms_memory}
	 */
	@Nullable
	public JsonValue termsMemory() {
		return this.termsMemory;
	}

	/**
	 * API name: {@code term_vectory_memory}
	 */
	@Nullable
	public JsonValue termVectoryMemory() {
		return this.termVectoryMemory;
	}

	/**
	 * API name: {@code term_vectors_memory_in_bytes}
	 */
	public Number termVectorsMemoryInBytes() {
		return this.termVectorsMemoryInBytes;
	}

	/**
	 * API name: {@code version_map_memory}
	 */
	@Nullable
	public JsonValue versionMapMemory() {
		return this.versionMapMemory;
	}

	/**
	 * API name: {@code version_map_memory_in_bytes}
	 */
	public Number versionMapMemoryInBytes() {
		return this.versionMapMemoryInBytes;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		if (this.docValuesMemory != null) {

			generator.writeKey("doc_values_memory");
			generator.write(this.docValuesMemory);

		}

		generator.writeKey("doc_values_memory_in_bytes");
		generator.write(this.docValuesMemoryInBytes.doubleValue());

		generator.writeKey("file_sizes");
		generator.writeStartObject();
		for (Map.Entry<String, ShardFileSizeInfo> item0 : this.fileSizes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.fixedBitSet != null) {

			generator.writeKey("fixed_bit_set");
			generator.write(this.fixedBitSet);

		}

		generator.writeKey("fixed_bit_set_memory_in_bytes");
		generator.write(this.fixedBitSetMemoryInBytes.doubleValue());

		if (this.indexWriterMemory != null) {

			generator.writeKey("index_writer_memory");
			generator.write(this.indexWriterMemory);

		}
		if (this.indexWriterMaxMemoryInBytes != null) {

			generator.writeKey("index_writer_max_memory_in_bytes");
			generator.write(this.indexWriterMaxMemoryInBytes.doubleValue());

		}

		generator.writeKey("index_writer_memory_in_bytes");
		generator.write(this.indexWriterMemoryInBytes.doubleValue());

		generator.writeKey("max_unsafe_auto_id_timestamp");
		generator.write(this.maxUnsafeAutoIdTimestamp.doubleValue());

		if (this.memory != null) {

			generator.writeKey("memory");
			generator.write(this.memory);

		}

		generator.writeKey("memory_in_bytes");
		generator.write(this.memoryInBytes.doubleValue());

		if (this.normsMemory != null) {

			generator.writeKey("norms_memory");
			generator.write(this.normsMemory);

		}

		generator.writeKey("norms_memory_in_bytes");
		generator.write(this.normsMemoryInBytes.doubleValue());

		if (this.pointsMemory != null) {

			generator.writeKey("points_memory");
			generator.write(this.pointsMemory);

		}

		generator.writeKey("points_memory_in_bytes");
		generator.write(this.pointsMemoryInBytes.doubleValue());

		if (this.storedMemory != null) {

			generator.writeKey("stored_memory");
			generator.write(this.storedMemory);

		}

		generator.writeKey("stored_fields_memory_in_bytes");
		generator.write(this.storedFieldsMemoryInBytes.doubleValue());

		generator.writeKey("terms_memory_in_bytes");
		generator.write(this.termsMemoryInBytes.doubleValue());

		if (this.termsMemory != null) {

			generator.writeKey("terms_memory");
			generator.write(this.termsMemory);

		}
		if (this.termVectoryMemory != null) {

			generator.writeKey("term_vectory_memory");
			generator.write(this.termVectoryMemory);

		}

		generator.writeKey("term_vectors_memory_in_bytes");
		generator.write(this.termVectorsMemoryInBytes.doubleValue());

		if (this.versionMapMemory != null) {

			generator.writeKey("version_map_memory");
			generator.write(this.versionMapMemory);

		}

		generator.writeKey("version_map_memory_in_bytes");
		generator.write(this.versionMapMemoryInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentsStats}.
	 */
	public static class Builder implements ObjectBuilder<SegmentsStats> {
		private Number count;

		@Nullable
		private JsonValue docValuesMemory;

		private Number docValuesMemoryInBytes;

		private Map<String, ShardFileSizeInfo> fileSizes;

		@Nullable
		private JsonValue fixedBitSet;

		private Number fixedBitSetMemoryInBytes;

		@Nullable
		private JsonValue indexWriterMemory;

		@Nullable
		private Number indexWriterMaxMemoryInBytes;

		private Number indexWriterMemoryInBytes;

		private Number maxUnsafeAutoIdTimestamp;

		@Nullable
		private JsonValue memory;

		private Number memoryInBytes;

		@Nullable
		private JsonValue normsMemory;

		private Number normsMemoryInBytes;

		@Nullable
		private JsonValue pointsMemory;

		private Number pointsMemoryInBytes;

		@Nullable
		private JsonValue storedMemory;

		private Number storedFieldsMemoryInBytes;

		private Number termsMemoryInBytes;

		@Nullable
		private JsonValue termsMemory;

		@Nullable
		private JsonValue termVectoryMemory;

		private Number termVectorsMemoryInBytes;

		@Nullable
		private JsonValue versionMapMemory;

		private Number versionMapMemoryInBytes;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code doc_values_memory}
		 */
		public Builder docValuesMemory(@Nullable JsonValue value) {
			this.docValuesMemory = value;
			return this;
		}

		/**
		 * API name: {@code doc_values_memory_in_bytes}
		 */
		public Builder docValuesMemoryInBytes(Number value) {
			this.docValuesMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code file_sizes}
		 */
		public Builder fileSizes(Map<String, ShardFileSizeInfo> value) {
			this.fileSizes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fileSizes(Map)}, creating the map if needed.
		 */
		public Builder putFileSizes(String key, ShardFileSizeInfo value) {
			if (this.fileSizes == null) {
				this.fileSizes = new HashMap<>();
			}
			this.fileSizes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #fileSizes(Map)} to a singleton map.
		 */
		public Builder fileSizes(String key, Function<ShardFileSizeInfo.Builder, ObjectBuilder<ShardFileSizeInfo>> fn) {
			return this.fileSizes(Collections.singletonMap(key, fn.apply(new ShardFileSizeInfo.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #fileSizes(Map)}, creating the map if needed.
		 */
		public Builder putFileSizes(String key,
				Function<ShardFileSizeInfo.Builder, ObjectBuilder<ShardFileSizeInfo>> fn) {
			return this.putFileSizes(key, fn.apply(new ShardFileSizeInfo.Builder()).build());
		}

		/**
		 * API name: {@code fixed_bit_set}
		 */
		public Builder fixedBitSet(@Nullable JsonValue value) {
			this.fixedBitSet = value;
			return this;
		}

		/**
		 * API name: {@code fixed_bit_set_memory_in_bytes}
		 */
		public Builder fixedBitSetMemoryInBytes(Number value) {
			this.fixedBitSetMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code index_writer_memory}
		 */
		public Builder indexWriterMemory(@Nullable JsonValue value) {
			this.indexWriterMemory = value;
			return this;
		}

		/**
		 * API name: {@code index_writer_max_memory_in_bytes}
		 */
		public Builder indexWriterMaxMemoryInBytes(@Nullable Number value) {
			this.indexWriterMaxMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code index_writer_memory_in_bytes}
		 */
		public Builder indexWriterMemoryInBytes(Number value) {
			this.indexWriterMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code max_unsafe_auto_id_timestamp}
		 */
		public Builder maxUnsafeAutoIdTimestamp(Number value) {
			this.maxUnsafeAutoIdTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code memory}
		 */
		public Builder memory(@Nullable JsonValue value) {
			this.memory = value;
			return this;
		}

		/**
		 * API name: {@code memory_in_bytes}
		 */
		public Builder memoryInBytes(Number value) {
			this.memoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code norms_memory}
		 */
		public Builder normsMemory(@Nullable JsonValue value) {
			this.normsMemory = value;
			return this;
		}

		/**
		 * API name: {@code norms_memory_in_bytes}
		 */
		public Builder normsMemoryInBytes(Number value) {
			this.normsMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code points_memory}
		 */
		public Builder pointsMemory(@Nullable JsonValue value) {
			this.pointsMemory = value;
			return this;
		}

		/**
		 * API name: {@code points_memory_in_bytes}
		 */
		public Builder pointsMemoryInBytes(Number value) {
			this.pointsMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code stored_memory}
		 */
		public Builder storedMemory(@Nullable JsonValue value) {
			this.storedMemory = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields_memory_in_bytes}
		 */
		public Builder storedFieldsMemoryInBytes(Number value) {
			this.storedFieldsMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code terms_memory_in_bytes}
		 */
		public Builder termsMemoryInBytes(Number value) {
			this.termsMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code terms_memory}
		 */
		public Builder termsMemory(@Nullable JsonValue value) {
			this.termsMemory = value;
			return this;
		}

		/**
		 * API name: {@code term_vectory_memory}
		 */
		public Builder termVectoryMemory(@Nullable JsonValue value) {
			this.termVectoryMemory = value;
			return this;
		}

		/**
		 * API name: {@code term_vectors_memory_in_bytes}
		 */
		public Builder termVectorsMemoryInBytes(Number value) {
			this.termVectorsMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code version_map_memory}
		 */
		public Builder versionMapMemory(@Nullable JsonValue value) {
			this.versionMapMemory = value;
			return this;
		}

		/**
		 * API name: {@code version_map_memory_in_bytes}
		 */
		public Builder versionMapMemoryInBytes(Number value) {
			this.versionMapMemoryInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link SegmentsStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentsStats build() {

			return new SegmentsStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SegmentsStats}
	 */
	public static final JsonpDeserializer<SegmentsStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SegmentsStats::setupSegmentsStatsDeserializer);

	protected static void setupSegmentsStatsDeserializer(DelegatingDeserializer<SegmentsStats.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::docValuesMemory, JsonpDeserializer.jsonValueDeserializer(), "doc_values_memory");
		op.add(Builder::docValuesMemoryInBytes, JsonpDeserializer.numberDeserializer(), "doc_values_memory_in_bytes");
		op.add(Builder::fileSizes, JsonpDeserializer.stringMapDeserializer(ShardFileSizeInfo.DESERIALIZER),
				"file_sizes");
		op.add(Builder::fixedBitSet, JsonpDeserializer.jsonValueDeserializer(), "fixed_bit_set");
		op.add(Builder::fixedBitSetMemoryInBytes, JsonpDeserializer.numberDeserializer(),
				"fixed_bit_set_memory_in_bytes");
		op.add(Builder::indexWriterMemory, JsonpDeserializer.jsonValueDeserializer(), "index_writer_memory");
		op.add(Builder::indexWriterMaxMemoryInBytes, JsonpDeserializer.numberDeserializer(),
				"index_writer_max_memory_in_bytes");
		op.add(Builder::indexWriterMemoryInBytes, JsonpDeserializer.numberDeserializer(),
				"index_writer_memory_in_bytes");
		op.add(Builder::maxUnsafeAutoIdTimestamp, JsonpDeserializer.numberDeserializer(),
				"max_unsafe_auto_id_timestamp");
		op.add(Builder::memory, JsonpDeserializer.jsonValueDeserializer(), "memory");
		op.add(Builder::memoryInBytes, JsonpDeserializer.numberDeserializer(), "memory_in_bytes");
		op.add(Builder::normsMemory, JsonpDeserializer.jsonValueDeserializer(), "norms_memory");
		op.add(Builder::normsMemoryInBytes, JsonpDeserializer.numberDeserializer(), "norms_memory_in_bytes");
		op.add(Builder::pointsMemory, JsonpDeserializer.jsonValueDeserializer(), "points_memory");
		op.add(Builder::pointsMemoryInBytes, JsonpDeserializer.numberDeserializer(), "points_memory_in_bytes");
		op.add(Builder::storedMemory, JsonpDeserializer.jsonValueDeserializer(), "stored_memory");
		op.add(Builder::storedFieldsMemoryInBytes, JsonpDeserializer.numberDeserializer(),
				"stored_fields_memory_in_bytes");
		op.add(Builder::termsMemoryInBytes, JsonpDeserializer.numberDeserializer(), "terms_memory_in_bytes");
		op.add(Builder::termsMemory, JsonpDeserializer.jsonValueDeserializer(), "terms_memory");
		op.add(Builder::termVectoryMemory, JsonpDeserializer.jsonValueDeserializer(), "term_vectory_memory");
		op.add(Builder::termVectorsMemoryInBytes, JsonpDeserializer.numberDeserializer(),
				"term_vectors_memory_in_bytes");
		op.add(Builder::versionMapMemory, JsonpDeserializer.jsonValueDeserializer(), "version_map_memory");
		op.add(Builder::versionMapMemoryInBytes, JsonpDeserializer.numberDeserializer(), "version_map_memory_in_bytes");

	}

}
