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

// typedef: cluster.allocation_explain.DiskUsage
public final class DiskUsage implements ToJsonp {
	private final String path;

	private final Number totalBytes;

	private final Number usedBytes;

	private final Number freeBytes;

	private final Number freeDiskPercent;

	private final Number usedDiskPercent;

	// ---------------------------------------------------------------------------------------------

	protected DiskUsage(Builder builder) {

		this.path = Objects.requireNonNull(builder.path, "path");
		this.totalBytes = Objects.requireNonNull(builder.totalBytes, "total_bytes");
		this.usedBytes = Objects.requireNonNull(builder.usedBytes, "used_bytes");
		this.freeBytes = Objects.requireNonNull(builder.freeBytes, "free_bytes");
		this.freeDiskPercent = Objects.requireNonNull(builder.freeDiskPercent, "free_disk_percent");
		this.usedDiskPercent = Objects.requireNonNull(builder.usedDiskPercent, "used_disk_percent");

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
	public Number totalBytes() {
		return this.totalBytes;
	}

	/**
	 * API name: {@code used_bytes}
	 */
	public Number usedBytes() {
		return this.usedBytes;
	}

	/**
	 * API name: {@code free_bytes}
	 */
	public Number freeBytes() {
		return this.freeBytes;
	}

	/**
	 * API name: {@code free_disk_percent}
	 */
	public Number freeDiskPercent() {
		return this.freeDiskPercent;
	}

	/**
	 * API name: {@code used_disk_percent}
	 */
	public Number usedDiskPercent() {
		return this.usedDiskPercent;
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

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("total_bytes");
		generator.write(this.totalBytes.doubleValue());

		generator.writeKey("used_bytes");
		generator.write(this.usedBytes.doubleValue());

		generator.writeKey("free_bytes");
		generator.write(this.freeBytes.doubleValue());

		generator.writeKey("free_disk_percent");
		generator.write(this.freeDiskPercent.doubleValue());

		generator.writeKey("used_disk_percent");
		generator.write(this.usedDiskPercent.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DiskUsage}.
	 */
	public static class Builder implements ObjectBuilder<DiskUsage> {
		private String path;

		private Number totalBytes;

		private Number usedBytes;

		private Number freeBytes;

		private Number freeDiskPercent;

		private Number usedDiskPercent;

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
		public Builder totalBytes(Number value) {
			this.totalBytes = value;
			return this;
		}

		/**
		 * API name: {@code used_bytes}
		 */
		public Builder usedBytes(Number value) {
			this.usedBytes = value;
			return this;
		}

		/**
		 * API name: {@code free_bytes}
		 */
		public Builder freeBytes(Number value) {
			this.freeBytes = value;
			return this;
		}

		/**
		 * API name: {@code free_disk_percent}
		 */
		public Builder freeDiskPercent(Number value) {
			this.freeDiskPercent = value;
			return this;
		}

		/**
		 * API name: {@code used_disk_percent}
		 */
		public Builder usedDiskPercent(Number value) {
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
	 * Json deserializer for DiskUsage
	 */
	public static final JsonpDeserializer<DiskUsage> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DiskUsage::setupDiskUsageDeserializer);

	protected static void setupDiskUsageDeserializer(DelegatingDeserializer<DiskUsage.Builder> op) {

		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::totalBytes, JsonpDeserializer.numberDeserializer(), "total_bytes");
		op.add(Builder::usedBytes, JsonpDeserializer.numberDeserializer(), "used_bytes");
		op.add(Builder::freeBytes, JsonpDeserializer.numberDeserializer(), "free_bytes");
		op.add(Builder::freeDiskPercent, JsonpDeserializer.numberDeserializer(), "free_disk_percent");
		op.add(Builder::usedDiskPercent, JsonpDeserializer.numberDeserializer(), "used_disk_percent");

	}

}
