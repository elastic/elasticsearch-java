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

package co.elastic.clients.elasticsearch.indices.data_streams_stats;

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
import javax.annotation.Nullable;

// typedef: indices.data_streams_stats.DataStreamsStatsItem
@JsonpDeserializable
public final class DataStreamsStatsItem implements JsonpSerializable {
	private final Integer backingIndices;

	private final String dataStream;

	@Nullable
	private final String storeSize;

	private final Integer storeSizeBytes;

	private final Integer maximumTimestamp;

	// ---------------------------------------------------------------------------------------------

	public DataStreamsStatsItem(Builder builder) {

		this.backingIndices = Objects.requireNonNull(builder.backingIndices, "backing_indices");
		this.dataStream = Objects.requireNonNull(builder.dataStream, "data_stream");
		this.storeSize = builder.storeSize;
		this.storeSizeBytes = Objects.requireNonNull(builder.storeSizeBytes, "store_size_bytes");
		this.maximumTimestamp = Objects.requireNonNull(builder.maximumTimestamp, "maximum_timestamp");

	}

	/**
	 * API name: {@code backing_indices}
	 */
	public Integer backingIndices() {
		return this.backingIndices;
	}

	/**
	 * API name: {@code data_stream}
	 */
	public String dataStream() {
		return this.dataStream;
	}

	/**
	 * API name: {@code store_size}
	 */
	@Nullable
	public String storeSize() {
		return this.storeSize;
	}

	/**
	 * API name: {@code store_size_bytes}
	 */
	public Integer storeSizeBytes() {
		return this.storeSizeBytes;
	}

	/**
	 * API name: {@code maximum_timestamp}
	 */
	public Integer maximumTimestamp() {
		return this.maximumTimestamp;
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

		generator.writeKey("backing_indices");
		generator.write(this.backingIndices);

		generator.writeKey("data_stream");
		generator.write(this.dataStream);

		if (this.storeSize != null) {

			generator.writeKey("store_size");
			generator.write(this.storeSize);

		}

		generator.writeKey("store_size_bytes");
		generator.write(this.storeSizeBytes);

		generator.writeKey("maximum_timestamp");
		generator.write(this.maximumTimestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamsStatsItem}.
	 */
	public static class Builder implements ObjectBuilder<DataStreamsStatsItem> {
		private Integer backingIndices;

		private String dataStream;

		@Nullable
		private String storeSize;

		private Integer storeSizeBytes;

		private Integer maximumTimestamp;

		/**
		 * API name: {@code backing_indices}
		 */
		public Builder backingIndices(Integer value) {
			this.backingIndices = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public Builder dataStream(String value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * API name: {@code store_size}
		 */
		public Builder storeSize(@Nullable String value) {
			this.storeSize = value;
			return this;
		}

		/**
		 * API name: {@code store_size_bytes}
		 */
		public Builder storeSizeBytes(Integer value) {
			this.storeSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code maximum_timestamp}
		 */
		public Builder maximumTimestamp(Integer value) {
			this.maximumTimestamp = value;
			return this;
		}

		/**
		 * Builds a {@link DataStreamsStatsItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamsStatsItem build() {

			return new DataStreamsStatsItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamsStatsItem}
	 */
	public static final JsonpDeserializer<DataStreamsStatsItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamsStatsItem::setupDataStreamsStatsItemDeserializer, Builder::build);

	protected static void setupDataStreamsStatsItemDeserializer(
			DelegatingDeserializer<DataStreamsStatsItem.Builder> op) {

		op.add(Builder::backingIndices, JsonpDeserializer.integerDeserializer(), "backing_indices");
		op.add(Builder::dataStream, JsonpDeserializer.stringDeserializer(), "data_stream");
		op.add(Builder::storeSize, JsonpDeserializer.stringDeserializer(), "store_size");
		op.add(Builder::storeSizeBytes, JsonpDeserializer.integerDeserializer(), "store_size_bytes");
		op.add(Builder::maximumTimestamp, JsonpDeserializer.integerDeserializer(), "maximum_timestamp");

	}

}
