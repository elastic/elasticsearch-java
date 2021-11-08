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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.DataPathStats
@JsonpDeserializable
public class DataPathStats implements JsonpSerializable {
	private final String available;

	private final long availableInBytes;

	private final String diskQueue;

	private final long diskReads;

	private final String diskReadSize;

	private final long diskReadSizeInBytes;

	private final long diskWrites;

	private final String diskWriteSize;

	private final long diskWriteSizeInBytes;

	private final String free;

	private final long freeInBytes;

	private final String mount;

	private final String path;

	private final String total;

	private final long totalInBytes;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private DataPathStats(Builder builder) {

		this.available = ModelTypeHelper.requireNonNull(builder.available, this, "available");
		this.availableInBytes = ModelTypeHelper.requireNonNull(builder.availableInBytes, this, "availableInBytes");
		this.diskQueue = ModelTypeHelper.requireNonNull(builder.diskQueue, this, "diskQueue");
		this.diskReads = ModelTypeHelper.requireNonNull(builder.diskReads, this, "diskReads");
		this.diskReadSize = ModelTypeHelper.requireNonNull(builder.diskReadSize, this, "diskReadSize");
		this.diskReadSizeInBytes = ModelTypeHelper.requireNonNull(builder.diskReadSizeInBytes, this,
				"diskReadSizeInBytes");
		this.diskWrites = ModelTypeHelper.requireNonNull(builder.diskWrites, this, "diskWrites");
		this.diskWriteSize = ModelTypeHelper.requireNonNull(builder.diskWriteSize, this, "diskWriteSize");
		this.diskWriteSizeInBytes = ModelTypeHelper.requireNonNull(builder.diskWriteSizeInBytes, this,
				"diskWriteSizeInBytes");
		this.free = ModelTypeHelper.requireNonNull(builder.free, this, "free");
		this.freeInBytes = ModelTypeHelper.requireNonNull(builder.freeInBytes, this, "freeInBytes");
		this.mount = ModelTypeHelper.requireNonNull(builder.mount, this, "mount");
		this.path = ModelTypeHelper.requireNonNull(builder.path, this, "path");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.totalInBytes = ModelTypeHelper.requireNonNull(builder.totalInBytes, this, "totalInBytes");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static DataPathStats of(Function<Builder, ObjectBuilder<DataPathStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code available}
	 */
	public final String available() {
		return this.available;
	}

	/**
	 * Required - API name: {@code available_in_bytes}
	 */
	public final long availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * Required - API name: {@code disk_queue}
	 */
	public final String diskQueue() {
		return this.diskQueue;
	}

	/**
	 * Required - API name: {@code disk_reads}
	 */
	public final long diskReads() {
		return this.diskReads;
	}

	/**
	 * Required - API name: {@code disk_read_size}
	 */
	public final String diskReadSize() {
		return this.diskReadSize;
	}

	/**
	 * Required - API name: {@code disk_read_size_in_bytes}
	 */
	public final long diskReadSizeInBytes() {
		return this.diskReadSizeInBytes;
	}

	/**
	 * Required - API name: {@code disk_writes}
	 */
	public final long diskWrites() {
		return this.diskWrites;
	}

	/**
	 * Required - API name: {@code disk_write_size}
	 */
	public final String diskWriteSize() {
		return this.diskWriteSize;
	}

	/**
	 * Required - API name: {@code disk_write_size_in_bytes}
	 */
	public final long diskWriteSizeInBytes() {
		return this.diskWriteSizeInBytes;
	}

	/**
	 * Required - API name: {@code free}
	 */
	public final String free() {
		return this.free;
	}

	/**
	 * Required - API name: {@code free_in_bytes}
	 */
	public final long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * Required - API name: {@code mount}
	 */
	public final String mount() {
		return this.mount;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public final String path() {
		return this.path;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final String total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code total_in_bytes}
	 */
	public final long totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * Required - API name: {@code type}
	 */
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

		generator.writeKey("available");
		generator.write(this.available);

		generator.writeKey("available_in_bytes");
		generator.write(this.availableInBytes);

		generator.writeKey("disk_queue");
		generator.write(this.diskQueue);

		generator.writeKey("disk_reads");
		generator.write(this.diskReads);

		generator.writeKey("disk_read_size");
		generator.write(this.diskReadSize);

		generator.writeKey("disk_read_size_in_bytes");
		generator.write(this.diskReadSizeInBytes);

		generator.writeKey("disk_writes");
		generator.write(this.diskWrites);

		generator.writeKey("disk_write_size");
		generator.write(this.diskWriteSize);

		generator.writeKey("disk_write_size_in_bytes");
		generator.write(this.diskWriteSizeInBytes);

		generator.writeKey("free");
		generator.write(this.free);

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes);

		generator.writeKey("mount");
		generator.write(this.mount);

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataPathStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataPathStats> {
		private String available;

		private Long availableInBytes;

		private String diskQueue;

		private Long diskReads;

		private String diskReadSize;

		private Long diskReadSizeInBytes;

		private Long diskWrites;

		private String diskWriteSize;

		private Long diskWriteSizeInBytes;

		private String free;

		private Long freeInBytes;

		private String mount;

		private String path;

		private String total;

		private Long totalInBytes;

		private String type;

		/**
		 * Required - API name: {@code available}
		 */
		public final Builder available(String value) {
			this.available = value;
			return this;
		}

		/**
		 * Required - API name: {@code available_in_bytes}
		 */
		public final Builder availableInBytes(long value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code disk_queue}
		 */
		public final Builder diskQueue(String value) {
			this.diskQueue = value;
			return this;
		}

		/**
		 * Required - API name: {@code disk_reads}
		 */
		public final Builder diskReads(long value) {
			this.diskReads = value;
			return this;
		}

		/**
		 * Required - API name: {@code disk_read_size}
		 */
		public final Builder diskReadSize(String value) {
			this.diskReadSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code disk_read_size_in_bytes}
		 */
		public final Builder diskReadSizeInBytes(long value) {
			this.diskReadSizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code disk_writes}
		 */
		public final Builder diskWrites(long value) {
			this.diskWrites = value;
			return this;
		}

		/**
		 * Required - API name: {@code disk_write_size}
		 */
		public final Builder diskWriteSize(String value) {
			this.diskWriteSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code disk_write_size_in_bytes}
		 */
		public final Builder diskWriteSizeInBytes(long value) {
			this.diskWriteSizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code free}
		 */
		public final Builder free(String value) {
			this.free = value;
			return this;
		}

		/**
		 * Required - API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code mount}
		 */
		public final Builder mount(String value) {
			this.mount = value;
			return this;
		}

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(String value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(long value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataPathStats}
	 */
	public static final JsonpDeserializer<DataPathStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataPathStats::setupDataPathStatsDeserializer, Builder::build);

	protected static void setupDataPathStatsDeserializer(DelegatingDeserializer<DataPathStats.Builder> op) {

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
		op.add(Builder::mount, JsonpDeserializer.stringDeserializer(), "mount");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
