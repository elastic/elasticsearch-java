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

// typedef: nodes._types.DataPathStats
public final class DataPathStats implements ToJsonp {
	private final String available;

	private final Number availableInBytes;

	private final String diskQueue;

	private final Number diskReads;

	private final String diskReadSize;

	private final Number diskReadSizeInBytes;

	private final Number diskWrites;

	private final String diskWriteSize;

	private final Number diskWriteSizeInBytes;

	private final String free;

	private final Number freeInBytes;

	private final String mount;

	private final String path;

	private final String total;

	private final Number totalInBytes;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected DataPathStats(Builder builder) {

		this.available = Objects.requireNonNull(builder.available, "available");
		this.availableInBytes = Objects.requireNonNull(builder.availableInBytes, "available_in_bytes");
		this.diskQueue = Objects.requireNonNull(builder.diskQueue, "disk_queue");
		this.diskReads = Objects.requireNonNull(builder.diskReads, "disk_reads");
		this.diskReadSize = Objects.requireNonNull(builder.diskReadSize, "disk_read_size");
		this.diskReadSizeInBytes = Objects.requireNonNull(builder.diskReadSizeInBytes, "disk_read_size_in_bytes");
		this.diskWrites = Objects.requireNonNull(builder.diskWrites, "disk_writes");
		this.diskWriteSize = Objects.requireNonNull(builder.diskWriteSize, "disk_write_size");
		this.diskWriteSizeInBytes = Objects.requireNonNull(builder.diskWriteSizeInBytes, "disk_write_size_in_bytes");
		this.free = Objects.requireNonNull(builder.free, "free");
		this.freeInBytes = Objects.requireNonNull(builder.freeInBytes, "free_in_bytes");
		this.mount = Objects.requireNonNull(builder.mount, "mount");
		this.path = Objects.requireNonNull(builder.path, "path");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code available}
	 */
	public String available() {
		return this.available;
	}

	/**
	 * API name: {@code available_in_bytes}
	 */
	public Number availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * API name: {@code disk_queue}
	 */
	public String diskQueue() {
		return this.diskQueue;
	}

	/**
	 * API name: {@code disk_reads}
	 */
	public Number diskReads() {
		return this.diskReads;
	}

	/**
	 * API name: {@code disk_read_size}
	 */
	public String diskReadSize() {
		return this.diskReadSize;
	}

	/**
	 * API name: {@code disk_read_size_in_bytes}
	 */
	public Number diskReadSizeInBytes() {
		return this.diskReadSizeInBytes;
	}

	/**
	 * API name: {@code disk_writes}
	 */
	public Number diskWrites() {
		return this.diskWrites;
	}

	/**
	 * API name: {@code disk_write_size}
	 */
	public String diskWriteSize() {
		return this.diskWriteSize;
	}

	/**
	 * API name: {@code disk_write_size_in_bytes}
	 */
	public Number diskWriteSizeInBytes() {
		return this.diskWriteSizeInBytes;
	}

	/**
	 * API name: {@code free}
	 */
	public String free() {
		return this.free;
	}

	/**
	 * API name: {@code free_in_bytes}
	 */
	public Number freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * API name: {@code mount}
	 */
	public String mount() {
		return this.mount;
	}

	/**
	 * API name: {@code path}
	 */
	public String path() {
		return this.path;
	}

	/**
	 * API name: {@code total}
	 */
	public String total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	public Number totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		generator.writeKey("available");
		generator.write(this.available);

		generator.writeKey("available_in_bytes");
		generator.write(this.availableInBytes.doubleValue());

		generator.writeKey("disk_queue");
		generator.write(this.diskQueue);

		generator.writeKey("disk_reads");
		generator.write(this.diskReads.doubleValue());

		generator.writeKey("disk_read_size");
		generator.write(this.diskReadSize);

		generator.writeKey("disk_read_size_in_bytes");
		generator.write(this.diskReadSizeInBytes.doubleValue());

		generator.writeKey("disk_writes");
		generator.write(this.diskWrites.doubleValue());

		generator.writeKey("disk_write_size");
		generator.write(this.diskWriteSize);

		generator.writeKey("disk_write_size_in_bytes");
		generator.write(this.diskWriteSizeInBytes.doubleValue());

		generator.writeKey("free");
		generator.write(this.free);

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes.doubleValue());

		generator.writeKey("mount");
		generator.write(this.mount);

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes.doubleValue());

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataPathStats}.
	 */
	public static class Builder implements ObjectBuilder<DataPathStats> {
		private String available;

		private Number availableInBytes;

		private String diskQueue;

		private Number diskReads;

		private String diskReadSize;

		private Number diskReadSizeInBytes;

		private Number diskWrites;

		private String diskWriteSize;

		private Number diskWriteSizeInBytes;

		private String free;

		private Number freeInBytes;

		private String mount;

		private String path;

		private String total;

		private Number totalInBytes;

		private String type;

		/**
		 * API name: {@code available}
		 */
		public Builder available(String value) {
			this.available = value;
			return this;
		}

		/**
		 * API name: {@code available_in_bytes}
		 */
		public Builder availableInBytes(Number value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * API name: {@code disk_queue}
		 */
		public Builder diskQueue(String value) {
			this.diskQueue = value;
			return this;
		}

		/**
		 * API name: {@code disk_reads}
		 */
		public Builder diskReads(Number value) {
			this.diskReads = value;
			return this;
		}

		/**
		 * API name: {@code disk_read_size}
		 */
		public Builder diskReadSize(String value) {
			this.diskReadSize = value;
			return this;
		}

		/**
		 * API name: {@code disk_read_size_in_bytes}
		 */
		public Builder diskReadSizeInBytes(Number value) {
			this.diskReadSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code disk_writes}
		 */
		public Builder diskWrites(Number value) {
			this.diskWrites = value;
			return this;
		}

		/**
		 * API name: {@code disk_write_size}
		 */
		public Builder diskWriteSize(String value) {
			this.diskWriteSize = value;
			return this;
		}

		/**
		 * API name: {@code disk_write_size_in_bytes}
		 */
		public Builder diskWriteSizeInBytes(Number value) {
			this.diskWriteSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code free}
		 */
		public Builder free(String value) {
			this.free = value;
			return this;
		}

		/**
		 * API name: {@code free_in_bytes}
		 */
		public Builder freeInBytes(Number value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code mount}
		 */
		public Builder mount(String value) {
			this.mount = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(String value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public Builder totalInBytes(Number value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
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

			return new DataPathStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataPathStats
	 */
	public static final JsonpDeserializer<DataPathStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataPathStats::setupDataPathStatsDeserializer);

	protected static void setupDataPathStatsDeserializer(DelegatingDeserializer<DataPathStats.Builder> op) {

		op.add(Builder::available, JsonpDeserializer.stringDeserializer(), "available");
		op.add(Builder::availableInBytes, JsonpDeserializer.numberDeserializer(), "available_in_bytes");
		op.add(Builder::diskQueue, JsonpDeserializer.stringDeserializer(), "disk_queue");
		op.add(Builder::diskReads, JsonpDeserializer.numberDeserializer(), "disk_reads");
		op.add(Builder::diskReadSize, JsonpDeserializer.stringDeserializer(), "disk_read_size");
		op.add(Builder::diskReadSizeInBytes, JsonpDeserializer.numberDeserializer(), "disk_read_size_in_bytes");
		op.add(Builder::diskWrites, JsonpDeserializer.numberDeserializer(), "disk_writes");
		op.add(Builder::diskWriteSize, JsonpDeserializer.stringDeserializer(), "disk_write_size");
		op.add(Builder::diskWriteSizeInBytes, JsonpDeserializer.numberDeserializer(), "disk_write_size_in_bytes");
		op.add(Builder::free, JsonpDeserializer.stringDeserializer(), "free");
		op.add(Builder::freeInBytes, JsonpDeserializer.numberDeserializer(), "free_in_bytes");
		op.add(Builder::mount, JsonpDeserializer.stringDeserializer(), "mount");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.numberDeserializer(), "total_in_bytes");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
