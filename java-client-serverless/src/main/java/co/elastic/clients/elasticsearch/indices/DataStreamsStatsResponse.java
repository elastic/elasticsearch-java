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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.data_streams_stats.DataStreamsStatsItem;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.data_streams_stats.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.data_streams_stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamsStatsResponse implements JsonpSerializable {
	private final ShardStatistics shards;

	private final int backingIndices;

	private final int dataStreamCount;

	private final List<DataStreamsStatsItem> dataStreams;

	@Nullable
	private final String totalStoreSizes;

	private final int totalStoreSizeBytes;

	// ---------------------------------------------------------------------------------------------

	private DataStreamsStatsResponse(Builder builder) {

		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.backingIndices = ApiTypeHelper.requireNonNull(builder.backingIndices, this, "backingIndices");
		this.dataStreamCount = ApiTypeHelper.requireNonNull(builder.dataStreamCount, this, "dataStreamCount");
		this.dataStreams = ApiTypeHelper.unmodifiableRequired(builder.dataStreams, this, "dataStreams");
		this.totalStoreSizes = builder.totalStoreSizes;
		this.totalStoreSizeBytes = ApiTypeHelper.requireNonNull(builder.totalStoreSizeBytes, this,
				"totalStoreSizeBytes");

	}

	public static DataStreamsStatsResponse of(Function<Builder, ObjectBuilder<DataStreamsStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Contains information about shards that attempted to execute the
	 * request.
	 * <p>
	 * API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - Total number of backing indices for the selected data streams.
	 * <p>
	 * API name: {@code backing_indices}
	 */
	public final int backingIndices() {
		return this.backingIndices;
	}

	/**
	 * Required - Total number of selected data streams.
	 * <p>
	 * API name: {@code data_stream_count}
	 */
	public final int dataStreamCount() {
		return this.dataStreamCount;
	}

	/**
	 * Required - Contains statistics for the selected data streams.
	 * <p>
	 * API name: {@code data_streams}
	 */
	public final List<DataStreamsStatsItem> dataStreams() {
		return this.dataStreams;
	}

	/**
	 * Total size of all shards for the selected data streams. This property is
	 * included only if the <code>human</code> query parameter is <code>true</code>
	 * <p>
	 * API name: {@code total_store_sizes}
	 */
	@Nullable
	public final String totalStoreSizes() {
		return this.totalStoreSizes;
	}

	/**
	 * Required - Total size, in bytes, of all shards for the selected data streams.
	 * <p>
	 * API name: {@code total_store_size_bytes}
	 */
	public final int totalStoreSizeBytes() {
		return this.totalStoreSizeBytes;
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

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("backing_indices");
		generator.write(this.backingIndices);

		generator.writeKey("data_stream_count");
		generator.write(this.dataStreamCount);

		if (ApiTypeHelper.isDefined(this.dataStreams)) {
			generator.writeKey("data_streams");
			generator.writeStartArray();
			for (DataStreamsStatsItem item0 : this.dataStreams) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.totalStoreSizes != null) {
			generator.writeKey("total_store_sizes");
			generator.write(this.totalStoreSizes);

		}
		generator.writeKey("total_store_size_bytes");
		generator.write(this.totalStoreSizeBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamsStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamsStatsResponse> {
		private ShardStatistics shards;

		private Integer backingIndices;

		private Integer dataStreamCount;

		private List<DataStreamsStatsItem> dataStreams;

		@Nullable
		private String totalStoreSizes;

		private Integer totalStoreSizeBytes;

		/**
		 * Required - Contains information about shards that attempted to execute the
		 * request.
		 * <p>
		 * API name: {@code _shards}
		 */
		public final Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - Contains information about shards that attempted to execute the
		 * request.
		 * <p>
		 * API name: {@code _shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - Total number of backing indices for the selected data streams.
		 * <p>
		 * API name: {@code backing_indices}
		 */
		public final Builder backingIndices(int value) {
			this.backingIndices = value;
			return this;
		}

		/**
		 * Required - Total number of selected data streams.
		 * <p>
		 * API name: {@code data_stream_count}
		 */
		public final Builder dataStreamCount(int value) {
			this.dataStreamCount = value;
			return this;
		}

		/**
		 * Required - Contains statistics for the selected data streams.
		 * <p>
		 * API name: {@code data_streams}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(List<DataStreamsStatsItem> list) {
			this.dataStreams = _listAddAll(this.dataStreams, list);
			return this;
		}

		/**
		 * Required - Contains statistics for the selected data streams.
		 * <p>
		 * API name: {@code data_streams}
		 * <p>
		 * Adds one or more values to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(DataStreamsStatsItem value, DataStreamsStatsItem... values) {
			this.dataStreams = _listAdd(this.dataStreams, value, values);
			return this;
		}

		/**
		 * Required - Contains statistics for the selected data streams.
		 * <p>
		 * API name: {@code data_streams}
		 * <p>
		 * Adds a value to <code>dataStreams</code> using a builder lambda.
		 */
		public final Builder dataStreams(
				Function<DataStreamsStatsItem.Builder, ObjectBuilder<DataStreamsStatsItem>> fn) {
			return dataStreams(fn.apply(new DataStreamsStatsItem.Builder()).build());
		}

		/**
		 * Total size of all shards for the selected data streams. This property is
		 * included only if the <code>human</code> query parameter is <code>true</code>
		 * <p>
		 * API name: {@code total_store_sizes}
		 */
		public final Builder totalStoreSizes(@Nullable String value) {
			this.totalStoreSizes = value;
			return this;
		}

		/**
		 * Required - Total size, in bytes, of all shards for the selected data streams.
		 * <p>
		 * API name: {@code total_store_size_bytes}
		 */
		public final Builder totalStoreSizeBytes(int value) {
			this.totalStoreSizeBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamsStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamsStatsResponse build() {
			_checkSingleUse();

			return new DataStreamsStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamsStatsResponse}
	 */
	public static final JsonpDeserializer<DataStreamsStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamsStatsResponse::setupDataStreamsStatsResponseDeserializer);

	protected static void setupDataStreamsStatsResponseDeserializer(
			ObjectDeserializer<DataStreamsStatsResponse.Builder> op) {

		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::backingIndices, JsonpDeserializer.integerDeserializer(), "backing_indices");
		op.add(Builder::dataStreamCount, JsonpDeserializer.integerDeserializer(), "data_stream_count");
		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(DataStreamsStatsItem._DESERIALIZER),
				"data_streams");
		op.add(Builder::totalStoreSizes, JsonpDeserializer.stringDeserializer(), "total_store_sizes");
		op.add(Builder::totalStoreSizeBytes, JsonpDeserializer.integerDeserializer(), "total_store_size_bytes");

	}

}
