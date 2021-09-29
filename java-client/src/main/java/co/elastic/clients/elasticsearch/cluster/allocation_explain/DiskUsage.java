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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.DiskUsage
@JsonpDeserializable
public final class DiskUsage implements JsonpSerializable {
	private final String path;

	private final long totalBytes;

	private final long usedBytes;

	private final long freeBytes;

	private final double freeDiskPercent;

	private final double usedDiskPercent;

	// ---------------------------------------------------------------------------------------------

	public DiskUsage(Builder builder) {

		this.path = Objects.requireNonNull(builder.path, "path");
		this.totalBytes = Objects.requireNonNull(builder.totalBytes, "total_bytes");
		this.usedBytes = Objects.requireNonNull(builder.usedBytes, "used_bytes");
		this.freeBytes = Objects.requireNonNull(builder.freeBytes, "free_bytes");
		this.freeDiskPercent = Objects.requireNonNull(builder.freeDiskPercent, "free_disk_percent");
		this.usedDiskPercent = Objects.requireNonNull(builder.usedDiskPercent, "used_disk_percent");

	}

	public DiskUsage(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code path}
	 */
	public String path() {
		return this.path;
	}

	/**
	 * API name: {@code total_bytes}
	 */
	public long totalBytes() {
		return this.totalBytes;
	}

	/**
	 * API name: {@code used_bytes}
	 */
	public long usedBytes() {
		return this.usedBytes;
	}

	/**
	 * API name: {@code free_bytes}
	 */
	public long freeBytes() {
		return this.freeBytes;
	}

	/**
	 * API name: {@code free_disk_percent}
	 */
	public double freeDiskPercent() {
		return this.freeDiskPercent;
	}

	/**
	 * API name: {@code used_disk_percent}
	 */
	public double usedDiskPercent() {
		return this.usedDiskPercent;
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

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("total_bytes");
		generator.write(this.totalBytes);

		generator.writeKey("used_bytes");
		generator.write(this.usedBytes);

		generator.writeKey("free_bytes");
		generator.write(this.freeBytes);

		generator.writeKey("free_disk_percent");
		generator.write(this.freeDiskPercent);

		generator.writeKey("used_disk_percent");
		generator.write(this.usedDiskPercent);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DiskUsage}.
	 */
	public static class Builder implements ObjectBuilder<DiskUsage> {
		private String path;

		private Long totalBytes;

		private Long usedBytes;

		private Long freeBytes;

		private Double freeDiskPercent;

		private Double usedDiskPercent;

		/**
		 * API name: {@code path}
		 */
		public Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code total_bytes}
		 */
		public Builder totalBytes(long value) {
			this.totalBytes = value;
			return this;
		}

		/**
		 * API name: {@code used_bytes}
		 */
		public Builder usedBytes(long value) {
			this.usedBytes = value;
			return this;
		}

		/**
		 * API name: {@code free_bytes}
		 */
		public Builder freeBytes(long value) {
			this.freeBytes = value;
			return this;
		}

		/**
		 * API name: {@code free_disk_percent}
		 */
		public Builder freeDiskPercent(double value) {
			this.freeDiskPercent = value;
			return this;
		}

		/**
		 * API name: {@code used_disk_percent}
		 */
		public Builder usedDiskPercent(double value) {
			this.usedDiskPercent = value;
			return this;
		}

		/**
		 * Builds a {@link DiskUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DiskUsage build() {

			return new DiskUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DiskUsage}
	 */
	public static final JsonpDeserializer<DiskUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DiskUsage::setupDiskUsageDeserializer, Builder::build);

	protected static void setupDiskUsageDeserializer(DelegatingDeserializer<DiskUsage.Builder> op) {

		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::totalBytes, JsonpDeserializer.longDeserializer(), "total_bytes");
		op.add(Builder::usedBytes, JsonpDeserializer.longDeserializer(), "used_bytes");
		op.add(Builder::freeBytes, JsonpDeserializer.longDeserializer(), "free_bytes");
		op.add(Builder::freeDiskPercent, JsonpDeserializer.doubleDeserializer(), "free_disk_percent");
		op.add(Builder::usedDiskPercent, JsonpDeserializer.doubleDeserializer(), "used_disk_percent");

	}

}
