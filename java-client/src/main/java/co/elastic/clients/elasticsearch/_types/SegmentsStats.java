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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SegmentsStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.SegmentsStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class SegmentsStats implements JsonpSerializable {
	private final int count;

	@Nullable
	private final String docValuesMemory;

	private final long docValuesMemoryInBytes;

	private final Map<String, ShardFileSizeInfo> fileSizes;

	@Nullable
	private final String fixedBitSet;

	private final long fixedBitSetMemoryInBytes;

	@Nullable
	private final String indexWriterMemory;

	@Nullable
	private final Long indexWriterMaxMemoryInBytes;

	private final long indexWriterMemoryInBytes;

	private final long maxUnsafeAutoIdTimestamp;

	@Nullable
	private final String memory;

	private final long memoryInBytes;

	@Nullable
	private final String normsMemory;

	private final long normsMemoryInBytes;

	@Nullable
	private final String pointsMemory;

	private final long pointsMemoryInBytes;

	@Nullable
	private final String storedMemory;

	private final long storedFieldsMemoryInBytes;

	private final long termsMemoryInBytes;

	@Nullable
	private final String termsMemory;

	@Nullable
	private final String termVectoryMemory;

	private final long termVectorsMemoryInBytes;

	@Nullable
	private final String versionMapMemory;

	private final long versionMapMemoryInBytes;

	// ---------------------------------------------------------------------------------------------

	private SegmentsStats(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.docValuesMemory = builder.docValuesMemory;
		this.docValuesMemoryInBytes = ApiTypeHelper.requireNonNull(builder.docValuesMemoryInBytes, this,
				"docValuesMemoryInBytes");
		this.fileSizes = ApiTypeHelper.unmodifiableRequired(builder.fileSizes, this, "fileSizes");
		this.fixedBitSet = builder.fixedBitSet;
		this.fixedBitSetMemoryInBytes = ApiTypeHelper.requireNonNull(builder.fixedBitSetMemoryInBytes, this,
				"fixedBitSetMemoryInBytes");
		this.indexWriterMemory = builder.indexWriterMemory;
		this.indexWriterMaxMemoryInBytes = builder.indexWriterMaxMemoryInBytes;
		this.indexWriterMemoryInBytes = ApiTypeHelper.requireNonNull(builder.indexWriterMemoryInBytes, this,
				"indexWriterMemoryInBytes");
		this.maxUnsafeAutoIdTimestamp = ApiTypeHelper.requireNonNull(builder.maxUnsafeAutoIdTimestamp, this,
				"maxUnsafeAutoIdTimestamp");
		this.memory = builder.memory;
		this.memoryInBytes = ApiTypeHelper.requireNonNull(builder.memoryInBytes, this, "memoryInBytes");
		this.normsMemory = builder.normsMemory;
		this.normsMemoryInBytes = ApiTypeHelper.requireNonNull(builder.normsMemoryInBytes, this, "normsMemoryInBytes");
		this.pointsMemory = builder.pointsMemory;
		this.pointsMemoryInBytes = ApiTypeHelper.requireNonNull(builder.pointsMemoryInBytes, this,
				"pointsMemoryInBytes");
		this.storedMemory = builder.storedMemory;
		this.storedFieldsMemoryInBytes = ApiTypeHelper.requireNonNull(builder.storedFieldsMemoryInBytes, this,
				"storedFieldsMemoryInBytes");
		this.termsMemoryInBytes = ApiTypeHelper.requireNonNull(builder.termsMemoryInBytes, this, "termsMemoryInBytes");
		this.termsMemory = builder.termsMemory;
		this.termVectoryMemory = builder.termVectoryMemory;
		this.termVectorsMemoryInBytes = ApiTypeHelper.requireNonNull(builder.termVectorsMemoryInBytes, this,
				"termVectorsMemoryInBytes");
		this.versionMapMemory = builder.versionMapMemory;
		this.versionMapMemoryInBytes = ApiTypeHelper.requireNonNull(builder.versionMapMemoryInBytes, this,
				"versionMapMemoryInBytes");

	}

	public static SegmentsStats of(Function<Builder, ObjectBuilder<SegmentsStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Total number of segments across all shards assigned to selected
	 * nodes.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Total amount of memory used for doc values across all shards assigned to
	 * selected nodes.
	 * <p>
	 * API name: {@code doc_values_memory}
	 */
	@Nullable
	public final String docValuesMemory() {
		return this.docValuesMemory;
	}

	/**
	 * Required - Total amount, in bytes, of memory used for doc values across all
	 * shards assigned to selected nodes.
	 * <p>
	 * API name: {@code doc_values_memory_in_bytes}
	 */
	public final long docValuesMemoryInBytes() {
		return this.docValuesMemoryInBytes;
	}

	/**
	 * Required - This object is not populated by the cluster stats API. To get
	 * information on segment files, use the node stats API.
	 * <p>
	 * API name: {@code file_sizes}
	 */
	public final Map<String, ShardFileSizeInfo> fileSizes() {
		return this.fileSizes;
	}

	/**
	 * Total amount of memory used by fixed bit sets across all shards assigned to
	 * selected nodes. Fixed bit sets are used for nested object field types and
	 * type filters for join fields.
	 * <p>
	 * API name: {@code fixed_bit_set}
	 */
	@Nullable
	public final String fixedBitSet() {
		return this.fixedBitSet;
	}

	/**
	 * Required - Total amount of memory, in bytes, used by fixed bit sets across
	 * all shards assigned to selected nodes.
	 * <p>
	 * API name: {@code fixed_bit_set_memory_in_bytes}
	 */
	public final long fixedBitSetMemoryInBytes() {
		return this.fixedBitSetMemoryInBytes;
	}

	/**
	 * Total amount of memory used by all index writers across all shards assigned
	 * to selected nodes.
	 * <p>
	 * API name: {@code index_writer_memory}
	 */
	@Nullable
	public final String indexWriterMemory() {
		return this.indexWriterMemory;
	}

	/**
	 * API name: {@code index_writer_max_memory_in_bytes}
	 */
	@Nullable
	public final Long indexWriterMaxMemoryInBytes() {
		return this.indexWriterMaxMemoryInBytes;
	}

	/**
	 * Required - Total amount, in bytes, of memory used by all index writers across
	 * all shards assigned to selected nodes.
	 * <p>
	 * API name: {@code index_writer_memory_in_bytes}
	 */
	public final long indexWriterMemoryInBytes() {
		return this.indexWriterMemoryInBytes;
	}

	/**
	 * Required - Unix timestamp, in milliseconds, of the most recently retried
	 * indexing request.
	 * <p>
	 * API name: {@code max_unsafe_auto_id_timestamp}
	 */
	public final long maxUnsafeAutoIdTimestamp() {
		return this.maxUnsafeAutoIdTimestamp;
	}

	/**
	 * Total amount of memory used for segments across all shards assigned to
	 * selected nodes.
	 * <p>
	 * API name: {@code memory}
	 */
	@Nullable
	public final String memory() {
		return this.memory;
	}

	/**
	 * Required - Total amount, in bytes, of memory used for segments across all
	 * shards assigned to selected nodes.
	 * <p>
	 * API name: {@code memory_in_bytes}
	 */
	public final long memoryInBytes() {
		return this.memoryInBytes;
	}

	/**
	 * Total amount of memory used for normalization factors across all shards
	 * assigned to selected nodes.
	 * <p>
	 * API name: {@code norms_memory}
	 */
	@Nullable
	public final String normsMemory() {
		return this.normsMemory;
	}

	/**
	 * Required - Total amount, in bytes, of memory used for normalization factors
	 * across all shards assigned to selected nodes.
	 * <p>
	 * API name: {@code norms_memory_in_bytes}
	 */
	public final long normsMemoryInBytes() {
		return this.normsMemoryInBytes;
	}

	/**
	 * Total amount of memory used for points across all shards assigned to selected
	 * nodes.
	 * <p>
	 * API name: {@code points_memory}
	 */
	@Nullable
	public final String pointsMemory() {
		return this.pointsMemory;
	}

	/**
	 * Required - Total amount, in bytes, of memory used for points across all
	 * shards assigned to selected nodes.
	 * <p>
	 * API name: {@code points_memory_in_bytes}
	 */
	public final long pointsMemoryInBytes() {
		return this.pointsMemoryInBytes;
	}

	/**
	 * API name: {@code stored_memory}
	 */
	@Nullable
	public final String storedMemory() {
		return this.storedMemory;
	}

	/**
	 * Required - Total amount, in bytes, of memory used for stored fields across
	 * all shards assigned to selected nodes.
	 * <p>
	 * API name: {@code stored_fields_memory_in_bytes}
	 */
	public final long storedFieldsMemoryInBytes() {
		return this.storedFieldsMemoryInBytes;
	}

	/**
	 * Required - Total amount, in bytes, of memory used for terms across all shards
	 * assigned to selected nodes.
	 * <p>
	 * API name: {@code terms_memory_in_bytes}
	 */
	public final long termsMemoryInBytes() {
		return this.termsMemoryInBytes;
	}

	/**
	 * Total amount of memory used for terms across all shards assigned to selected
	 * nodes.
	 * <p>
	 * API name: {@code terms_memory}
	 */
	@Nullable
	public final String termsMemory() {
		return this.termsMemory;
	}

	/**
	 * Total amount of memory used for term vectors across all shards assigned to
	 * selected nodes.
	 * <p>
	 * API name: {@code term_vectory_memory}
	 */
	@Nullable
	public final String termVectoryMemory() {
		return this.termVectoryMemory;
	}

	/**
	 * Required - Total amount, in bytes, of memory used for term vectors across all
	 * shards assigned to selected nodes.
	 * <p>
	 * API name: {@code term_vectors_memory_in_bytes}
	 */
	public final long termVectorsMemoryInBytes() {
		return this.termVectorsMemoryInBytes;
	}

	/**
	 * Total amount of memory used by all version maps across all shards assigned to
	 * selected nodes.
	 * <p>
	 * API name: {@code version_map_memory}
	 */
	@Nullable
	public final String versionMapMemory() {
		return this.versionMapMemory;
	}

	/**
	 * Required - Total amount, in bytes, of memory used by all version maps across
	 * all shards assigned to selected nodes.
	 * <p>
	 * API name: {@code version_map_memory_in_bytes}
	 */
	public final long versionMapMemoryInBytes() {
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
		generator.write(this.count);

		if (this.docValuesMemory != null) {
			generator.writeKey("doc_values_memory");
			generator.write(this.docValuesMemory);

		}
		generator.writeKey("doc_values_memory_in_bytes");
		generator.write(this.docValuesMemoryInBytes);

		if (ApiTypeHelper.isDefined(this.fileSizes)) {
			generator.writeKey("file_sizes");
			generator.writeStartObject();
			for (Map.Entry<String, ShardFileSizeInfo> item0 : this.fileSizes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.fixedBitSet != null) {
			generator.writeKey("fixed_bit_set");
			generator.write(this.fixedBitSet);

		}
		generator.writeKey("fixed_bit_set_memory_in_bytes");
		generator.write(this.fixedBitSetMemoryInBytes);

		if (this.indexWriterMemory != null) {
			generator.writeKey("index_writer_memory");
			generator.write(this.indexWriterMemory);

		}
		if (this.indexWriterMaxMemoryInBytes != null) {
			generator.writeKey("index_writer_max_memory_in_bytes");
			generator.write(this.indexWriterMaxMemoryInBytes);

		}
		generator.writeKey("index_writer_memory_in_bytes");
		generator.write(this.indexWriterMemoryInBytes);

		generator.writeKey("max_unsafe_auto_id_timestamp");
		generator.write(this.maxUnsafeAutoIdTimestamp);

		if (this.memory != null) {
			generator.writeKey("memory");
			generator.write(this.memory);

		}
		generator.writeKey("memory_in_bytes");
		generator.write(this.memoryInBytes);

		if (this.normsMemory != null) {
			generator.writeKey("norms_memory");
			generator.write(this.normsMemory);

		}
		generator.writeKey("norms_memory_in_bytes");
		generator.write(this.normsMemoryInBytes);

		if (this.pointsMemory != null) {
			generator.writeKey("points_memory");
			generator.write(this.pointsMemory);

		}
		generator.writeKey("points_memory_in_bytes");
		generator.write(this.pointsMemoryInBytes);

		if (this.storedMemory != null) {
			generator.writeKey("stored_memory");
			generator.write(this.storedMemory);

		}
		generator.writeKey("stored_fields_memory_in_bytes");
		generator.write(this.storedFieldsMemoryInBytes);

		generator.writeKey("terms_memory_in_bytes");
		generator.write(this.termsMemoryInBytes);

		if (this.termsMemory != null) {
			generator.writeKey("terms_memory");
			generator.write(this.termsMemory);

		}
		if (this.termVectoryMemory != null) {
			generator.writeKey("term_vectory_memory");
			generator.write(this.termVectoryMemory);

		}
		generator.writeKey("term_vectors_memory_in_bytes");
		generator.write(this.termVectorsMemoryInBytes);

		if (this.versionMapMemory != null) {
			generator.writeKey("version_map_memory");
			generator.write(this.versionMapMemory);

		}
		generator.writeKey("version_map_memory_in_bytes");
		generator.write(this.versionMapMemoryInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentsStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SegmentsStats> {
		private Integer count;

		@Nullable
		private String docValuesMemory;

		private Long docValuesMemoryInBytes;

		private Map<String, ShardFileSizeInfo> fileSizes;

		@Nullable
		private String fixedBitSet;

		private Long fixedBitSetMemoryInBytes;

		@Nullable
		private String indexWriterMemory;

		@Nullable
		private Long indexWriterMaxMemoryInBytes;

		private Long indexWriterMemoryInBytes;

		private Long maxUnsafeAutoIdTimestamp;

		@Nullable
		private String memory;

		private Long memoryInBytes;

		@Nullable
		private String normsMemory;

		private Long normsMemoryInBytes;

		@Nullable
		private String pointsMemory;

		private Long pointsMemoryInBytes;

		@Nullable
		private String storedMemory;

		private Long storedFieldsMemoryInBytes;

		private Long termsMemoryInBytes;

		@Nullable
		private String termsMemory;

		@Nullable
		private String termVectoryMemory;

		private Long termVectorsMemoryInBytes;

		@Nullable
		private String versionMapMemory;

		private Long versionMapMemoryInBytes;

		/**
		 * Required - Total number of segments across all shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Total amount of memory used for doc values across all shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code doc_values_memory}
		 */
		public final Builder docValuesMemory(@Nullable String value) {
			this.docValuesMemory = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used for doc values across all
		 * shards assigned to selected nodes.
		 * <p>
		 * API name: {@code doc_values_memory_in_bytes}
		 */
		public final Builder docValuesMemoryInBytes(long value) {
			this.docValuesMemoryInBytes = value;
			return this;
		}

		/**
		 * Required - This object is not populated by the cluster stats API. To get
		 * information on segment files, use the node stats API.
		 * <p>
		 * API name: {@code file_sizes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fileSizes</code>.
		 */
		public final Builder fileSizes(Map<String, ShardFileSizeInfo> map) {
			this.fileSizes = _mapPutAll(this.fileSizes, map);
			return this;
		}

		/**
		 * Required - This object is not populated by the cluster stats API. To get
		 * information on segment files, use the node stats API.
		 * <p>
		 * API name: {@code file_sizes}
		 * <p>
		 * Adds an entry to <code>fileSizes</code>.
		 */
		public final Builder fileSizes(String key, ShardFileSizeInfo value) {
			this.fileSizes = _mapPut(this.fileSizes, key, value);
			return this;
		}

		/**
		 * Required - This object is not populated by the cluster stats API. To get
		 * information on segment files, use the node stats API.
		 * <p>
		 * API name: {@code file_sizes}
		 * <p>
		 * Adds an entry to <code>fileSizes</code> using a builder lambda.
		 */
		public final Builder fileSizes(String key,
				Function<ShardFileSizeInfo.Builder, ObjectBuilder<ShardFileSizeInfo>> fn) {
			return fileSizes(key, fn.apply(new ShardFileSizeInfo.Builder()).build());
		}

		/**
		 * Total amount of memory used by fixed bit sets across all shards assigned to
		 * selected nodes. Fixed bit sets are used for nested object field types and
		 * type filters for join fields.
		 * <p>
		 * API name: {@code fixed_bit_set}
		 */
		public final Builder fixedBitSet(@Nullable String value) {
			this.fixedBitSet = value;
			return this;
		}

		/**
		 * Required - Total amount of memory, in bytes, used by fixed bit sets across
		 * all shards assigned to selected nodes.
		 * <p>
		 * API name: {@code fixed_bit_set_memory_in_bytes}
		 */
		public final Builder fixedBitSetMemoryInBytes(long value) {
			this.fixedBitSetMemoryInBytes = value;
			return this;
		}

		/**
		 * Total amount of memory used by all index writers across all shards assigned
		 * to selected nodes.
		 * <p>
		 * API name: {@code index_writer_memory}
		 */
		public final Builder indexWriterMemory(@Nullable String value) {
			this.indexWriterMemory = value;
			return this;
		}

		/**
		 * API name: {@code index_writer_max_memory_in_bytes}
		 */
		public final Builder indexWriterMaxMemoryInBytes(@Nullable Long value) {
			this.indexWriterMaxMemoryInBytes = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used by all index writers across
		 * all shards assigned to selected nodes.
		 * <p>
		 * API name: {@code index_writer_memory_in_bytes}
		 */
		public final Builder indexWriterMemoryInBytes(long value) {
			this.indexWriterMemoryInBytes = value;
			return this;
		}

		/**
		 * Required - Unix timestamp, in milliseconds, of the most recently retried
		 * indexing request.
		 * <p>
		 * API name: {@code max_unsafe_auto_id_timestamp}
		 */
		public final Builder maxUnsafeAutoIdTimestamp(long value) {
			this.maxUnsafeAutoIdTimestamp = value;
			return this;
		}

		/**
		 * Total amount of memory used for segments across all shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code memory}
		 */
		public final Builder memory(@Nullable String value) {
			this.memory = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used for segments across all
		 * shards assigned to selected nodes.
		 * <p>
		 * API name: {@code memory_in_bytes}
		 */
		public final Builder memoryInBytes(long value) {
			this.memoryInBytes = value;
			return this;
		}

		/**
		 * Total amount of memory used for normalization factors across all shards
		 * assigned to selected nodes.
		 * <p>
		 * API name: {@code norms_memory}
		 */
		public final Builder normsMemory(@Nullable String value) {
			this.normsMemory = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used for normalization factors
		 * across all shards assigned to selected nodes.
		 * <p>
		 * API name: {@code norms_memory_in_bytes}
		 */
		public final Builder normsMemoryInBytes(long value) {
			this.normsMemoryInBytes = value;
			return this;
		}

		/**
		 * Total amount of memory used for points across all shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code points_memory}
		 */
		public final Builder pointsMemory(@Nullable String value) {
			this.pointsMemory = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used for points across all
		 * shards assigned to selected nodes.
		 * <p>
		 * API name: {@code points_memory_in_bytes}
		 */
		public final Builder pointsMemoryInBytes(long value) {
			this.pointsMemoryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code stored_memory}
		 */
		public final Builder storedMemory(@Nullable String value) {
			this.storedMemory = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used for stored fields across
		 * all shards assigned to selected nodes.
		 * <p>
		 * API name: {@code stored_fields_memory_in_bytes}
		 */
		public final Builder storedFieldsMemoryInBytes(long value) {
			this.storedFieldsMemoryInBytes = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used for terms across all shards
		 * assigned to selected nodes.
		 * <p>
		 * API name: {@code terms_memory_in_bytes}
		 */
		public final Builder termsMemoryInBytes(long value) {
			this.termsMemoryInBytes = value;
			return this;
		}

		/**
		 * Total amount of memory used for terms across all shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code terms_memory}
		 */
		public final Builder termsMemory(@Nullable String value) {
			this.termsMemory = value;
			return this;
		}

		/**
		 * Total amount of memory used for term vectors across all shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code term_vectory_memory}
		 */
		public final Builder termVectoryMemory(@Nullable String value) {
			this.termVectoryMemory = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used for term vectors across all
		 * shards assigned to selected nodes.
		 * <p>
		 * API name: {@code term_vectors_memory_in_bytes}
		 */
		public final Builder termVectorsMemoryInBytes(long value) {
			this.termVectorsMemoryInBytes = value;
			return this;
		}

		/**
		 * Total amount of memory used by all version maps across all shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code version_map_memory}
		 */
		public final Builder versionMapMemory(@Nullable String value) {
			this.versionMapMemory = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of memory used by all version maps across
		 * all shards assigned to selected nodes.
		 * <p>
		 * API name: {@code version_map_memory_in_bytes}
		 */
		public final Builder versionMapMemoryInBytes(long value) {
			this.versionMapMemoryInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SegmentsStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentsStats build() {
			_checkSingleUse();

			return new SegmentsStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SegmentsStats}
	 */
	public static final JsonpDeserializer<SegmentsStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SegmentsStats::setupSegmentsStatsDeserializer);

	protected static void setupSegmentsStatsDeserializer(ObjectDeserializer<SegmentsStats.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::docValuesMemory, JsonpDeserializer.stringDeserializer(), "doc_values_memory");
		op.add(Builder::docValuesMemoryInBytes, JsonpDeserializer.longDeserializer(), "doc_values_memory_in_bytes");
		op.add(Builder::fileSizes, JsonpDeserializer.stringMapDeserializer(ShardFileSizeInfo._DESERIALIZER),
				"file_sizes");
		op.add(Builder::fixedBitSet, JsonpDeserializer.stringDeserializer(), "fixed_bit_set");
		op.add(Builder::fixedBitSetMemoryInBytes, JsonpDeserializer.longDeserializer(),
				"fixed_bit_set_memory_in_bytes");
		op.add(Builder::indexWriterMemory, JsonpDeserializer.stringDeserializer(), "index_writer_memory");
		op.add(Builder::indexWriterMaxMemoryInBytes, JsonpDeserializer.longDeserializer(),
				"index_writer_max_memory_in_bytes");
		op.add(Builder::indexWriterMemoryInBytes, JsonpDeserializer.longDeserializer(), "index_writer_memory_in_bytes");
		op.add(Builder::maxUnsafeAutoIdTimestamp, JsonpDeserializer.longDeserializer(), "max_unsafe_auto_id_timestamp");
		op.add(Builder::memory, JsonpDeserializer.stringDeserializer(), "memory");
		op.add(Builder::memoryInBytes, JsonpDeserializer.longDeserializer(), "memory_in_bytes");
		op.add(Builder::normsMemory, JsonpDeserializer.stringDeserializer(), "norms_memory");
		op.add(Builder::normsMemoryInBytes, JsonpDeserializer.longDeserializer(), "norms_memory_in_bytes");
		op.add(Builder::pointsMemory, JsonpDeserializer.stringDeserializer(), "points_memory");
		op.add(Builder::pointsMemoryInBytes, JsonpDeserializer.longDeserializer(), "points_memory_in_bytes");
		op.add(Builder::storedMemory, JsonpDeserializer.stringDeserializer(), "stored_memory");
		op.add(Builder::storedFieldsMemoryInBytes, JsonpDeserializer.longDeserializer(),
				"stored_fields_memory_in_bytes");
		op.add(Builder::termsMemoryInBytes, JsonpDeserializer.longDeserializer(), "terms_memory_in_bytes");
		op.add(Builder::termsMemory, JsonpDeserializer.stringDeserializer(), "terms_memory");
		op.add(Builder::termVectoryMemory, JsonpDeserializer.stringDeserializer(), "term_vectory_memory");
		op.add(Builder::termVectorsMemoryInBytes, JsonpDeserializer.longDeserializer(), "term_vectors_memory_in_bytes");
		op.add(Builder::versionMapMemory, JsonpDeserializer.stringDeserializer(), "version_map_memory");
		op.add(Builder::versionMapMemoryInBytes, JsonpDeserializer.longDeserializer(), "version_map_memory_in_bytes");

	}

}
