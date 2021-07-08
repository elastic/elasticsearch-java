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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.StoreStats
public final class StoreStats implements ToJsonp {
	@Nullable
	private final JsonValue size;

	private final Number sizeInBytes;

	@Nullable
	private final JsonValue reserved;

	private final Number reservedInBytes;

	@Nullable
	private final JsonValue totalDataSetSize;

	@Nullable
	private final Number totalDataSetSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	protected StoreStats(Builder builder) {

		this.size = builder.size;
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.reserved = builder.reserved;
		this.reservedInBytes = Objects.requireNonNull(builder.reservedInBytes, "reserved_in_bytes");
		this.totalDataSetSize = builder.totalDataSetSize;
		this.totalDataSetSizeInBytes = builder.totalDataSetSizeInBytes;

	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public JsonValue size() {
		return this.size;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public Number sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code reserved}
	 */
	@Nullable
	public JsonValue reserved() {
		return this.reserved;
	}

	/**
	 * API name: {@code reserved_in_bytes}
	 */
	public Number reservedInBytes() {
		return this.reservedInBytes;
	}

	/**
	 * API name: {@code total_data_set_size}
	 */
	@Nullable
	public JsonValue totalDataSetSize() {
		return this.totalDataSetSize;
	}

	/**
	 * API name: {@code total_data_set_size_in_bytes}
	 */
	@Nullable
	public Number totalDataSetSizeInBytes() {
		return this.totalDataSetSizeInBytes;
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

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes.doubleValue());

		if (this.reserved != null) {

			generator.writeKey("reserved");
			generator.write(this.reserved);

		}

		generator.writeKey("reserved_in_bytes");
		generator.write(this.reservedInBytes.doubleValue());

		if (this.totalDataSetSize != null) {

			generator.writeKey("total_data_set_size");
			generator.write(this.totalDataSetSize);

		}
		if (this.totalDataSetSizeInBytes != null) {

			generator.writeKey("total_data_set_size_in_bytes");
			generator.write(this.totalDataSetSizeInBytes.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StoreStats}.
	 */
	public static class Builder implements ObjectBuilder<StoreStats> {
		@Nullable
		private JsonValue size;

		private Number sizeInBytes;

		@Nullable
		private JsonValue reserved;

		private Number reservedInBytes;

		@Nullable
		private JsonValue totalDataSetSize;

		@Nullable
		private Number totalDataSetSizeInBytes;

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable JsonValue value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(Number value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code reserved}
		 */
		public Builder reserved(@Nullable JsonValue value) {
			this.reserved = value;
			return this;
		}

		/**
		 * API name: {@code reserved_in_bytes}
		 */
		public Builder reservedInBytes(Number value) {
			this.reservedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_data_set_size}
		 */
		public Builder totalDataSetSize(@Nullable JsonValue value) {
			this.totalDataSetSize = value;
			return this;
		}

		/**
		 * API name: {@code total_data_set_size_in_bytes}
		 */
		public Builder totalDataSetSizeInBytes(@Nullable Number value) {
			this.totalDataSetSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link StoreStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StoreStats build() {

			return new StoreStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StoreStats
	 */
	public static final JsonpDeserializer<StoreStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StoreStats::setupStoreStatsDeserializer);

	protected static void setupStoreStatsDeserializer(DelegatingDeserializer<StoreStats.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.jsonValueDeserializer(), "size");
		op.add(Builder::sizeInBytes, JsonpDeserializer.numberDeserializer(), "size_in_bytes");
		op.add(Builder::reserved, JsonpDeserializer.jsonValueDeserializer(), "reserved");
		op.add(Builder::reservedInBytes, JsonpDeserializer.numberDeserializer(), "reserved_in_bytes");
		op.add(Builder::totalDataSetSize, JsonpDeserializer.jsonValueDeserializer(), "total_data_set_size");
		op.add(Builder::totalDataSetSizeInBytes, JsonpDeserializer.numberDeserializer(),
				"total_data_set_size_in_bytes");

	}

}
