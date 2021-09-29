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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.StoreStats
@JsonpDeserializable
public final class StoreStats implements JsonpSerializable {
	@Nullable
	private final String size;

	private final int sizeInBytes;

	@Nullable
	private final String reserved;

	private final int reservedInBytes;

	@Nullable
	private final String totalDataSetSize;

	@Nullable
	private final Integer totalDataSetSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public StoreStats(Builder builder) {

		this.size = builder.size;
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.reserved = builder.reserved;
		this.reservedInBytes = Objects.requireNonNull(builder.reservedInBytes, "reserved_in_bytes");
		this.totalDataSetSize = builder.totalDataSetSize;
		this.totalDataSetSizeInBytes = builder.totalDataSetSizeInBytes;

	}

	public StoreStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public String size() {
		return this.size;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public int sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code reserved}
	 */
	@Nullable
	public String reserved() {
		return this.reserved;
	}

	/**
	 * API name: {@code reserved_in_bytes}
	 */
	public int reservedInBytes() {
		return this.reservedInBytes;
	}

	/**
	 * API name: {@code total_data_set_size}
	 */
	@Nullable
	public String totalDataSetSize() {
		return this.totalDataSetSize;
	}

	/**
	 * API name: {@code total_data_set_size_in_bytes}
	 */
	@Nullable
	public Integer totalDataSetSizeInBytes() {
		return this.totalDataSetSizeInBytes;
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

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		if (this.reserved != null) {

			generator.writeKey("reserved");
			generator.write(this.reserved);

		}

		generator.writeKey("reserved_in_bytes");
		generator.write(this.reservedInBytes);

		if (this.totalDataSetSize != null) {

			generator.writeKey("total_data_set_size");
			generator.write(this.totalDataSetSize);

		}
		if (this.totalDataSetSizeInBytes != null) {

			generator.writeKey("total_data_set_size_in_bytes");
			generator.write(this.totalDataSetSizeInBytes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StoreStats}.
	 */
	public static class Builder implements ObjectBuilder<StoreStats> {
		@Nullable
		private String size;

		private Integer sizeInBytes;

		@Nullable
		private String reserved;

		private Integer reservedInBytes;

		@Nullable
		private String totalDataSetSize;

		@Nullable
		private Integer totalDataSetSizeInBytes;

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(int value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code reserved}
		 */
		public Builder reserved(@Nullable String value) {
			this.reserved = value;
			return this;
		}

		/**
		 * API name: {@code reserved_in_bytes}
		 */
		public Builder reservedInBytes(int value) {
			this.reservedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_data_set_size}
		 */
		public Builder totalDataSetSize(@Nullable String value) {
			this.totalDataSetSize = value;
			return this;
		}

		/**
		 * API name: {@code total_data_set_size_in_bytes}
		 */
		public Builder totalDataSetSizeInBytes(@Nullable Integer value) {
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
	 * Json deserializer for {@link StoreStats}
	 */
	public static final JsonpDeserializer<StoreStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StoreStats::setupStoreStatsDeserializer, Builder::build);

	protected static void setupStoreStatsDeserializer(DelegatingDeserializer<StoreStats.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::sizeInBytes, JsonpDeserializer.integerDeserializer(), "size_in_bytes");
		op.add(Builder::reserved, JsonpDeserializer.stringDeserializer(), "reserved");
		op.add(Builder::reservedInBytes, JsonpDeserializer.integerDeserializer(), "reserved_in_bytes");
		op.add(Builder::totalDataSetSize, JsonpDeserializer.stringDeserializer(), "total_data_set_size");
		op.add(Builder::totalDataSetSizeInBytes, JsonpDeserializer.integerDeserializer(),
				"total_data_set_size_in_bytes");

	}

}
