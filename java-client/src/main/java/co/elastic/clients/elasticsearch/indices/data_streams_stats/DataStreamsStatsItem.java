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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.data_streams_stats.DataStreamsStatsItem
@JsonpDeserializable
public class DataStreamsStatsItem implements JsonpSerializable {
	private final int backingIndices;

	private final String dataStream;

	@Nullable
	private final String storeSize;

	private final int storeSizeBytes;

	private final int maximumTimestamp;

	// ---------------------------------------------------------------------------------------------

	private DataStreamsStatsItem(Builder builder) {

		this.backingIndices = ModelTypeHelper.requireNonNull(builder.backingIndices, this, "backingIndices");
		this.dataStream = ModelTypeHelper.requireNonNull(builder.dataStream, this, "dataStream");
		this.storeSize = builder.storeSize;
		this.storeSizeBytes = ModelTypeHelper.requireNonNull(builder.storeSizeBytes, this, "storeSizeBytes");
		this.maximumTimestamp = ModelTypeHelper.requireNonNull(builder.maximumTimestamp, this, "maximumTimestamp");

	}

	public static DataStreamsStatsItem of(Function<Builder, ObjectBuilder<DataStreamsStatsItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code backing_indices}
	 */
	public final int backingIndices() {
		return this.backingIndices;
	}

	/**
	 * Required - API name: {@code data_stream}
	 */
	public final String dataStream() {
		return this.dataStream;
	}

	/**
	 * API name: {@code store_size}
	 */
	@Nullable
	public final String storeSize() {
		return this.storeSize;
	}

	/**
	 * Required - API name: {@code store_size_bytes}
	 */
	public final int storeSizeBytes() {
		return this.storeSizeBytes;
	}

	/**
	 * Required - API name: {@code maximum_timestamp}
	 */
	public final int maximumTimestamp() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataStreamsStatsItem> {
		private Integer backingIndices;

		private String dataStream;

		@Nullable
		private String storeSize;

		private Integer storeSizeBytes;

		private Integer maximumTimestamp;

		/**
		 * Required - API name: {@code backing_indices}
		 */
		public final Builder backingIndices(int value) {
			this.backingIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_stream}
		 */
		public final Builder dataStream(String value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * API name: {@code store_size}
		 */
		public final Builder storeSize(@Nullable String value) {
			this.storeSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code store_size_bytes}
		 */
		public final Builder storeSizeBytes(int value) {
			this.storeSizeBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code maximum_timestamp}
		 */
		public final Builder maximumTimestamp(int value) {
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
			_checkSingleUse();

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
