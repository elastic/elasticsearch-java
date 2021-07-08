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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.OperatingSystemMemoryInfo
public final class OperatingSystemMemoryInfo implements ToJsonp {
	private final Number freeInBytes;

	private final Number freePercent;

	private final Number totalInBytes;

	private final Number usedInBytes;

	private final Number usedPercent;

	// ---------------------------------------------------------------------------------------------

	protected OperatingSystemMemoryInfo(Builder builder) {

		this.freeInBytes = Objects.requireNonNull(builder.freeInBytes, "free_in_bytes");
		this.freePercent = Objects.requireNonNull(builder.freePercent, "free_percent");
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");
		this.usedInBytes = Objects.requireNonNull(builder.usedInBytes, "used_in_bytes");
		this.usedPercent = Objects.requireNonNull(builder.usedPercent, "used_percent");

	}

	/**
	 * API name: {@code free_in_bytes}
	 */
	public Number freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * API name: {@code free_percent}
	 */
	public Number freePercent() {
		return this.freePercent;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	public Number totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * API name: {@code used_in_bytes}
	 */
	public Number usedInBytes() {
		return this.usedInBytes;
	}

	/**
	 * API name: {@code used_percent}
	 */
	public Number usedPercent() {
		return this.usedPercent;
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

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes.doubleValue());

		generator.writeKey("free_percent");
		generator.write(this.freePercent.doubleValue());

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes.doubleValue());

		generator.writeKey("used_in_bytes");
		generator.write(this.usedInBytes.doubleValue());

		generator.writeKey("used_percent");
		generator.write(this.usedPercent.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OperatingSystemMemoryInfo}.
	 */
	public static class Builder implements ObjectBuilder<OperatingSystemMemoryInfo> {
		private Number freeInBytes;

		private Number freePercent;

		private Number totalInBytes;

		private Number usedInBytes;

		private Number usedPercent;

		/**
		 * API name: {@code free_in_bytes}
		 */
		public Builder freeInBytes(Number value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code free_percent}
		 */
		public Builder freePercent(Number value) {
			this.freePercent = value;
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
		 * API name: {@code used_in_bytes}
		 */
		public Builder usedInBytes(Number value) {
			this.usedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code used_percent}
		 */
		public Builder usedPercent(Number value) {
			this.usedPercent = value;
			return this;
		}

		/**
		 * Builds a {@link OperatingSystemMemoryInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OperatingSystemMemoryInfo build() {

			return new OperatingSystemMemoryInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for OperatingSystemMemoryInfo
	 */
	public static final JsonpDeserializer<OperatingSystemMemoryInfo> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, OperatingSystemMemoryInfo::setupOperatingSystemMemoryInfoDeserializer);

	protected static void setupOperatingSystemMemoryInfoDeserializer(
			DelegatingDeserializer<OperatingSystemMemoryInfo.Builder> op) {

		op.add(Builder::freeInBytes, JsonpDeserializer.numberDeserializer(), "free_in_bytes");
		op.add(Builder::freePercent, JsonpDeserializer.numberDeserializer(), "free_percent");
		op.add(Builder::totalInBytes, JsonpDeserializer.numberDeserializer(), "total_in_bytes");
		op.add(Builder::usedInBytes, JsonpDeserializer.numberDeserializer(), "used_in_bytes");
		op.add(Builder::usedPercent, JsonpDeserializer.numberDeserializer(), "used_percent");

	}

}
