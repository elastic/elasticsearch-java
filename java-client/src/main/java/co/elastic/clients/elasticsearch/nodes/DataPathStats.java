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
	 * API name: {@code available}
	 */
	@Nullable
	public final String available() {
		return this.available;
	}

	/**
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
	 * API name: {@code free}
	 */
	@Nullable
	public final String free() {
		return this.free;
	}

	/**
	 * API name: {@code free_in_bytes}
	 */
	@Nullable
	public final Long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * API name: {@code mount}
	 */
	@Nullable
	public final String mount() {
		return this.mount;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final String total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	@Nullable
	public final Long totalInBytes() {
		return this.totalInBytes;
	}

	/**
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
		private String mount;

		@Nullable
		private String path;

		@Nullable
		private String total;

		@Nullable
		private Long totalInBytes;

		@Nullable
		private String type;

		/**
		 * API name: {@code available}
		 */
		public final Builder available(@Nullable String value) {
			this.available = value;
			return this;
		}

		/**
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
		 * API name: {@code free}
		 */
		public final Builder free(@Nullable String value) {
			this.free = value;
			return this;
		}

		/**
		 * API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(@Nullable Long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code mount}
		 */
		public final Builder mount(@Nullable String value) {
			this.mount = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(@Nullable Long value) {
			this.totalInBytes = value;
			return this;
		}

		/**
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
		op.add(Builder::mount, JsonpDeserializer.stringDeserializer(), "mount");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
