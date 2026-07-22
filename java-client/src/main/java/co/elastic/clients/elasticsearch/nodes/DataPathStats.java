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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: nodes._types.DataPathStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.DataPathStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataPathStats implements JsonpSerializable {
	@Nullable
	private final String available;

	@Nullable
	private final Long availableInBytes;

	@Nullable
	private final String diskQueue;

	@Nullable
	private final Long diskReads;

	@Nullable
	private final String diskReadSize;

	@Nullable
	private final Long diskReadSizeInBytes;

	@Nullable
	private final Long diskWrites;

	@Nullable
	private final String diskWriteSize;

	@Nullable
	private final Long diskWriteSizeInBytes;

	@Nullable
	private final String free;

	@Nullable
	private final Long freeInBytes;

	@Nullable
	private final String lowWatermarkFreeSpace;

	@Nullable
	private final Long lowWatermarkFreeSpaceInBytes;

	@Nullable
	private final String highWatermarkFreeSpace;

	@Nullable
	private final Long highWatermarkFreeSpaceInBytes;

	@Nullable
	private final String floodStageFreeSpace;

	@Nullable
	private final Long floodStageFreeSpaceInBytes;

	@Nullable
	private final String frozenFloodStageFreeSpace;

	@Nullable
	private final Long frozenFloodStageFreeSpaceInBytes;

	@Nullable
	private final String mount;

	@Nullable
	private final String path;

	@Nullable
	private final String total;

	@Nullable
	private final Long totalInBytes;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	private DataPathStats(Builder builder) {

		this.available = builder.available;
		this.availableInBytes = builder.availableInBytes;
		this.diskQueue = builder.diskQueue;
		this.diskReads = builder.diskReads;
		this.diskReadSize = builder.diskReadSize;
		this.diskReadSizeInBytes = builder.diskReadSizeInBytes;
		this.diskWrites = builder.diskWrites;
		this.diskWriteSize = builder.diskWriteSize;
		this.diskWriteSizeInBytes = builder.diskWriteSizeInBytes;
		this.free = builder.free;
		this.freeInBytes = builder.freeInBytes;
		this.lowWatermarkFreeSpace = builder.lowWatermarkFreeSpace;
		this.lowWatermarkFreeSpaceInBytes = builder.lowWatermarkFreeSpaceInBytes;
		this.highWatermarkFreeSpace = builder.highWatermarkFreeSpace;
		this.highWatermarkFreeSpaceInBytes = builder.highWatermarkFreeSpaceInBytes;
		this.floodStageFreeSpace = builder.floodStageFreeSpace;
		this.floodStageFreeSpaceInBytes = builder.floodStageFreeSpaceInBytes;
		this.frozenFloodStageFreeSpace = builder.frozenFloodStageFreeSpace;
		this.frozenFloodStageFreeSpaceInBytes = builder.frozenFloodStageFreeSpaceInBytes;
		this.mount = builder.mount;
		this.path = builder.path;
		this.total = builder.total;
		this.totalInBytes = builder.totalInBytes;
		this.type = builder.type;

	}

	public static DataPathStats of(Function<Builder, ObjectBuilder<DataPathStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Total amount of disk space available to this Java virtual machine on this
	 * file store.
	 * <p>
	 * API name: {@code available}
	 */
	@Nullable
	public final String available() {
		return this.available;
	}

	/**
	 * Total number of bytes available to this Java virtual machine on this file
	 * store.
	 * <p>
	 * API name: {@code available_in_bytes}
	 */
	@Nullable
	public final Long availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * API name: {@code disk_queue}
	 */
	@Nullable
	public final String diskQueue() {
		return this.diskQueue;
	}

	/**
	 * API name: {@code disk_reads}
	 */
	@Nullable
	public final Long diskReads() {
		return this.diskReads;
	}

	/**
	 * API name: {@code disk_read_size}
	 */
	@Nullable
	public final String diskReadSize() {
		return this.diskReadSize;
	}

	/**
	 * API name: {@code disk_read_size_in_bytes}
	 */
	@Nullable
	public final Long diskReadSizeInBytes() {
		return this.diskReadSizeInBytes;
	}

	/**
	 * API name: {@code disk_writes}
	 */
	@Nullable
	public final Long diskWrites() {
		return this.diskWrites;
	}

	/**
	 * API name: {@code disk_write_size}
	 */
	@Nullable
	public final String diskWriteSize() {
		return this.diskWriteSize;
	}

	/**
	 * API name: {@code disk_write_size_in_bytes}
	 */
	@Nullable
	public final Long diskWriteSizeInBytes() {
		return this.diskWriteSizeInBytes;
	}

	/**
	 * Total amount of unallocated disk space in the file store.
	 * <p>
	 * API name: {@code free}
	 */
	@Nullable
	public final String free() {
		return this.free;
	}

	/**
	 * Total number of unallocated bytes in the file store.
	 * <p>
	 * API name: {@code free_in_bytes}
	 */
	@Nullable
	public final Long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * The amount of free disk space that, once reached, triggers the low disk
	 * watermark.
	 * <p>
	 * API name: {@code low_watermark_free_space}
	 */
	@Nullable
	public final String lowWatermarkFreeSpace() {
		return this.lowWatermarkFreeSpace;
	}

	/**
	 * The amount of free disk space, in bytes, that, once reached, triggers the low
	 * disk watermark.
	 * <p>
	 * API name: {@code low_watermark_free_space_in_bytes}
	 */
	@Nullable
	public final Long lowWatermarkFreeSpaceInBytes() {
		return this.lowWatermarkFreeSpaceInBytes;
	}

	/**
	 * The amount of free disk space that, once reached, triggers the high disk
	 * watermark.
	 * <p>
	 * API name: {@code high_watermark_free_space}
	 */
	@Nullable
	public final String highWatermarkFreeSpace() {
		return this.highWatermarkFreeSpace;
	}

	/**
	 * The amount of free disk space, in bytes, that, once reached, triggers the
	 * high disk watermark.
	 * <p>
	 * API name: {@code high_watermark_free_space_in_bytes}
	 */
	@Nullable
	public final Long highWatermarkFreeSpaceInBytes() {
		return this.highWatermarkFreeSpaceInBytes;
	}

	/**
	 * The amount of free disk space that, once reached, triggers the flood stage
	 * disk watermark.
	 * <p>
	 * API name: {@code flood_stage_free_space}
	 */
	@Nullable
	public final String floodStageFreeSpace() {
		return this.floodStageFreeSpace;
	}

	/**
	 * The amount of free disk space, in bytes, that, once reached, triggers the
	 * flood stage disk watermark.
	 * <p>
	 * API name: {@code flood_stage_free_space_in_bytes}
	 */
	@Nullable
	public final Long floodStageFreeSpaceInBytes() {
		return this.floodStageFreeSpaceInBytes;
	}

	/**
	 * The amount of free disk space that, once reached, triggers the frozen flood
	 * stage disk watermark.
	 * <p>
	 * API name: {@code frozen_flood_stage_free_space}
	 */
	@Nullable
	public final String frozenFloodStageFreeSpace() {
		return this.frozenFloodStageFreeSpace;
	}

	/**
	 * The amount of free disk space, in bytes, that, once reached, triggers the
	 * frozen flood stage disk watermark.
	 * <p>
	 * API name: {@code frozen_flood_stage_free_space_in_bytes}
	 */
	@Nullable
	public final Long frozenFloodStageFreeSpaceInBytes() {
		return this.frozenFloodStageFreeSpaceInBytes;
	}

	/**
	 * Mount point of the file store (for example: <code>/dev/sda2</code>).
	 * <p>
	 * API name: {@code mount}
	 */
	@Nullable
	public final String mount() {
		return this.mount;
	}

	/**
	 * Path to the file store.
	 * <p>
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * Total size of the file store.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final String total() {
		return this.total;
	}

	/**
	 * Total size of the file store in bytes.
	 * <p>
	 * API name: {@code total_in_bytes}
	 */
	@Nullable
	public final Long totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * Type of the file store (ex: ext4).
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
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

		if (this.available != null) {
			generator.writeKey("available");
			generator.write(this.available);

		}
		if (this.availableInBytes != null) {
			generator.writeKey("available_in_bytes");
			generator.write(this.availableInBytes);

		}
		if (this.diskQueue != null) {
			generator.writeKey("disk_queue");
			generator.write(this.diskQueue);

		}
		if (this.diskReads != null) {
			generator.writeKey("disk_reads");
			generator.write(this.diskReads);

		}
		if (this.diskReadSize != null) {
			generator.writeKey("disk_read_size");
			generator.write(this.diskReadSize);

		}
		if (this.diskReadSizeInBytes != null) {
			generator.writeKey("disk_read_size_in_bytes");
			generator.write(this.diskReadSizeInBytes);

		}
		if (this.diskWrites != null) {
			generator.writeKey("disk_writes");
			generator.write(this.diskWrites);

		}
		if (this.diskWriteSize != null) {
			generator.writeKey("disk_write_size");
			generator.write(this.diskWriteSize);

		}
		if (this.diskWriteSizeInBytes != null) {
			generator.writeKey("disk_write_size_in_bytes");
			generator.write(this.diskWriteSizeInBytes);

		}
		if (this.free != null) {
			generator.writeKey("free");
			generator.write(this.free);

		}
		if (this.freeInBytes != null) {
			generator.writeKey("free_in_bytes");
			generator.write(this.freeInBytes);

		}
		if (this.lowWatermarkFreeSpace != null) {
			generator.writeKey("low_watermark_free_space");
			generator.write(this.lowWatermarkFreeSpace);

		}
		if (this.lowWatermarkFreeSpaceInBytes != null) {
			generator.writeKey("low_watermark_free_space_in_bytes");
			generator.write(this.lowWatermarkFreeSpaceInBytes);

		}
		if (this.highWatermarkFreeSpace != null) {
			generator.writeKey("high_watermark_free_space");
			generator.write(this.highWatermarkFreeSpace);

		}
		if (this.highWatermarkFreeSpaceInBytes != null) {
			generator.writeKey("high_watermark_free_space_in_bytes");
			generator.write(this.highWatermarkFreeSpaceInBytes);

		}
		if (this.floodStageFreeSpace != null) {
			generator.writeKey("flood_stage_free_space");
			generator.write(this.floodStageFreeSpace);

		}
		if (this.floodStageFreeSpaceInBytes != null) {
			generator.writeKey("flood_stage_free_space_in_bytes");
			generator.write(this.floodStageFreeSpaceInBytes);

		}
		if (this.frozenFloodStageFreeSpace != null) {
			generator.writeKey("frozen_flood_stage_free_space");
			generator.write(this.frozenFloodStageFreeSpace);

		}
		if (this.frozenFloodStageFreeSpaceInBytes != null) {
			generator.writeKey("frozen_flood_stage_free_space_in_bytes");
			generator.write(this.frozenFloodStageFreeSpaceInBytes);

		}
		if (this.mount != null) {
			generator.writeKey("mount");
			generator.write(this.mount);

		}
		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}
		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}
		if (this.totalInBytes != null) {
			generator.writeKey("total_in_bytes");
			generator.write(this.totalInBytes);

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataPathStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DataPathStats> {
		@Nullable
		private String available;

		@Nullable
		private Long availableInBytes;

		@Nullable
		private String diskQueue;

		@Nullable
		private Long diskReads;

		@Nullable
		private String diskReadSize;

		@Nullable
		private Long diskReadSizeInBytes;

		@Nullable
		private Long diskWrites;

		@Nullable
		private String diskWriteSize;

		@Nullable
		private Long diskWriteSizeInBytes;

		@Nullable
		private String free;

		@Nullable
		private Long freeInBytes;

		@Nullable
		private String lowWatermarkFreeSpace;

		@Nullable
		private Long lowWatermarkFreeSpaceInBytes;

		@Nullable
		private String highWatermarkFreeSpace;

		@Nullable
		private Long highWatermarkFreeSpaceInBytes;

		@Nullable
		private String floodStageFreeSpace;

		@Nullable
		private Long floodStageFreeSpaceInBytes;

		@Nullable
		private String frozenFloodStageFreeSpace;

		@Nullable
		private Long frozenFloodStageFreeSpaceInBytes;

		@Nullable
		private String mount;

		@Nullable
		private String path;

		@Nullable
		private String total;

		@Nullable
		private Long totalInBytes;

		@Nullable
		private String type;

		public Builder() {
		}
		private Builder(DataPathStats instance) {
			this.available = instance.available;
			this.availableInBytes = instance.availableInBytes;
			this.diskQueue = instance.diskQueue;
			this.diskReads = instance.diskReads;
			this.diskReadSize = instance.diskReadSize;
			this.diskReadSizeInBytes = instance.diskReadSizeInBytes;
			this.diskWrites = instance.diskWrites;
			this.diskWriteSize = instance.diskWriteSize;
			this.diskWriteSizeInBytes = instance.diskWriteSizeInBytes;
			this.free = instance.free;
			this.freeInBytes = instance.freeInBytes;
			this.lowWatermarkFreeSpace = instance.lowWatermarkFreeSpace;
			this.lowWatermarkFreeSpaceInBytes = instance.lowWatermarkFreeSpaceInBytes;
			this.highWatermarkFreeSpace = instance.highWatermarkFreeSpace;
			this.highWatermarkFreeSpaceInBytes = instance.highWatermarkFreeSpaceInBytes;
			this.floodStageFreeSpace = instance.floodStageFreeSpace;
			this.floodStageFreeSpaceInBytes = instance.floodStageFreeSpaceInBytes;
			this.frozenFloodStageFreeSpace = instance.frozenFloodStageFreeSpace;
			this.frozenFloodStageFreeSpaceInBytes = instance.frozenFloodStageFreeSpaceInBytes;
			this.mount = instance.mount;
			this.path = instance.path;
			this.total = instance.total;
			this.totalInBytes = instance.totalInBytes;
			this.type = instance.type;

		}
		/**
		 * Total amount of disk space available to this Java virtual machine on this
		 * file store.
		 * <p>
		 * API name: {@code available}
		 */
		public final Builder available(@Nullable String value) {
			this.available = value;
			return this;
		}

		/**
		 * Total number of bytes available to this Java virtual machine on this file
		 * store.
		 * <p>
		 * API name: {@code available_in_bytes}
		 */
		public final Builder availableInBytes(@Nullable Long value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * API name: {@code disk_queue}
		 */
		public final Builder diskQueue(@Nullable String value) {
			this.diskQueue = value;
			return this;
		}

		/**
		 * API name: {@code disk_reads}
		 */
		public final Builder diskReads(@Nullable Long value) {
			this.diskReads = value;
			return this;
		}

		/**
		 * API name: {@code disk_read_size}
		 */
		public final Builder diskReadSize(@Nullable String value) {
			this.diskReadSize = value;
			return this;
		}

		/**
		 * API name: {@code disk_read_size_in_bytes}
		 */
		public final Builder diskReadSizeInBytes(@Nullable Long value) {
			this.diskReadSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code disk_writes}
		 */
		public final Builder diskWrites(@Nullable Long value) {
			this.diskWrites = value;
			return this;
		}

		/**
		 * API name: {@code disk_write_size}
		 */
		public final Builder diskWriteSize(@Nullable String value) {
			this.diskWriteSize = value;
			return this;
		}

		/**
		 * API name: {@code disk_write_size_in_bytes}
		 */
		public final Builder diskWriteSizeInBytes(@Nullable Long value) {
			this.diskWriteSizeInBytes = value;
			return this;
		}

		/**
		 * Total amount of unallocated disk space in the file store.
		 * <p>
		 * API name: {@code free}
		 */
		public final Builder free(@Nullable String value) {
			this.free = value;
			return this;
		}

		/**
		 * Total number of unallocated bytes in the file store.
		 * <p>
		 * API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(@Nullable Long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * The amount of free disk space that, once reached, triggers the low disk
		 * watermark.
		 * <p>
		 * API name: {@code low_watermark_free_space}
		 */
		public final Builder lowWatermarkFreeSpace(@Nullable String value) {
			this.lowWatermarkFreeSpace = value;
			return this;
		}

		/**
		 * The amount of free disk space, in bytes, that, once reached, triggers the low
		 * disk watermark.
		 * <p>
		 * API name: {@code low_watermark_free_space_in_bytes}
		 */
		public final Builder lowWatermarkFreeSpaceInBytes(@Nullable Long value) {
			this.lowWatermarkFreeSpaceInBytes = value;
			return this;
		}

		/**
		 * The amount of free disk space that, once reached, triggers the high disk
		 * watermark.
		 * <p>
		 * API name: {@code high_watermark_free_space}
		 */
		public final Builder highWatermarkFreeSpace(@Nullable String value) {
			this.highWatermarkFreeSpace = value;
			return this;
		}

		/**
		 * The amount of free disk space, in bytes, that, once reached, triggers the
		 * high disk watermark.
		 * <p>
		 * API name: {@code high_watermark_free_space_in_bytes}
		 */
		public final Builder highWatermarkFreeSpaceInBytes(@Nullable Long value) {
			this.highWatermarkFreeSpaceInBytes = value;
			return this;
		}

		/**
		 * The amount of free disk space that, once reached, triggers the flood stage
		 * disk watermark.
		 * <p>
		 * API name: {@code flood_stage_free_space}
		 */
		public final Builder floodStageFreeSpace(@Nullable String value) {
			this.floodStageFreeSpace = value;
			return this;
		}

		/**
		 * The amount of free disk space, in bytes, that, once reached, triggers the
		 * flood stage disk watermark.
		 * <p>
		 * API name: {@code flood_stage_free_space_in_bytes}
		 */
		public final Builder floodStageFreeSpaceInBytes(@Nullable Long value) {
			this.floodStageFreeSpaceInBytes = value;
			return this;
		}

		/**
		 * The amount of free disk space that, once reached, triggers the frozen flood
		 * stage disk watermark.
		 * <p>
		 * API name: {@code frozen_flood_stage_free_space}
		 */
		public final Builder frozenFloodStageFreeSpace(@Nullable String value) {
			this.frozenFloodStageFreeSpace = value;
			return this;
		}

		/**
		 * The amount of free disk space, in bytes, that, once reached, triggers the
		 * frozen flood stage disk watermark.
		 * <p>
		 * API name: {@code frozen_flood_stage_free_space_in_bytes}
		 */
		public final Builder frozenFloodStageFreeSpaceInBytes(@Nullable Long value) {
			this.frozenFloodStageFreeSpaceInBytes = value;
			return this;
		}

		/**
		 * Mount point of the file store (for example: <code>/dev/sda2</code>).
		 * <p>
		 * API name: {@code mount}
		 */
		public final Builder mount(@Nullable String value) {
			this.mount = value;
			return this;
		}

		/**
		 * Path to the file store.
		 * <p>
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * Total size of the file store.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * Total size of the file store in bytes.
		 * <p>
		 * API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(@Nullable Long value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Type of the file store (ex: ext4).
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataPathStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataPathStats build() {
			_checkSingleUse();

			return new DataPathStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataPathStats}
	 */
	public static final JsonpDeserializer<DataPathStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataPathStats::setupDataPathStatsDeserializer);

	protected static void setupDataPathStatsDeserializer(ObjectDeserializer<DataPathStats.Builder> op) {

		op.add(Builder::available, JsonpDeserializer.stringDeserializer(), "available");
		op.add(Builder::availableInBytes, JsonpDeserializer.longDeserializer(), "available_in_bytes");
		op.add(Builder::diskQueue, JsonpDeserializer.stringDeserializer(), "disk_queue");
		op.add(Builder::diskReads, JsonpDeserializer.longDeserializer(), "disk_reads");
		op.add(Builder::diskReadSize, JsonpDeserializer.stringDeserializer(), "disk_read_size");
		op.add(Builder::diskReadSizeInBytes, JsonpDeserializer.longDeserializer(), "disk_read_size_in_bytes");
		op.add(Builder::diskWrites, JsonpDeserializer.longDeserializer(), "disk_writes");
		op.add(Builder::diskWriteSize, JsonpDeserializer.stringDeserializer(), "disk_write_size");
		op.add(Builder::diskWriteSizeInBytes, JsonpDeserializer.longDeserializer(), "disk_write_size_in_bytes");
		op.add(Builder::free, JsonpDeserializer.stringDeserializer(), "free");
		op.add(Builder::freeInBytes, JsonpDeserializer.longDeserializer(), "free_in_bytes");
		op.add(Builder::lowWatermarkFreeSpace, JsonpDeserializer.stringDeserializer(), "low_watermark_free_space");
		op.add(Builder::lowWatermarkFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"low_watermark_free_space_in_bytes");
		op.add(Builder::highWatermarkFreeSpace, JsonpDeserializer.stringDeserializer(), "high_watermark_free_space");
		op.add(Builder::highWatermarkFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"high_watermark_free_space_in_bytes");
		op.add(Builder::floodStageFreeSpace, JsonpDeserializer.stringDeserializer(), "flood_stage_free_space");
		op.add(Builder::floodStageFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"flood_stage_free_space_in_bytes");
		op.add(Builder::frozenFloodStageFreeSpace, JsonpDeserializer.stringDeserializer(),
				"frozen_flood_stage_free_space");
		op.add(Builder::frozenFloodStageFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"frozen_flood_stage_free_space_in_bytes");
		op.add(Builder::mount, JsonpDeserializer.stringDeserializer(), "mount");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
