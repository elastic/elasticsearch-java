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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.StoreStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.StoreStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class StoreStats implements JsonpSerializable {
	@Nullable
	private final String size;

	private final long sizeInBytes;

	@Nullable
	private final String reserved;

	private final long reservedInBytes;

	@Nullable
	private final String totalDataSetSize;

	@Nullable
	private final Long totalDataSetSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private StoreStats(Builder builder) {

		this.size = builder.size;
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");
		this.reserved = builder.reserved;
		this.reservedInBytes = ApiTypeHelper.requireNonNull(builder.reservedInBytes, this, "reservedInBytes");
		this.totalDataSetSize = builder.totalDataSetSize;
		this.totalDataSetSizeInBytes = builder.totalDataSetSizeInBytes;

	}

	public static StoreStats of(Function<Builder, ObjectBuilder<StoreStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Total size of all shards assigned to selected nodes.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * Required - Total size, in bytes, of all shards assigned to selected nodes.
	 * <p>
	 * API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * A prediction of how much larger the shard stores will eventually grow due to
	 * ongoing peer recoveries, restoring snapshots, and similar activities.
	 * <p>
	 * API name: {@code reserved}
	 */
	@Nullable
	public final String reserved() {
		return this.reserved;
	}

	/**
	 * Required - A prediction, in bytes, of how much larger the shard stores will
	 * eventually grow due to ongoing peer recoveries, restoring snapshots, and
	 * similar activities.
	 * <p>
	 * API name: {@code reserved_in_bytes}
	 */
	public final long reservedInBytes() {
		return this.reservedInBytes;
	}

	/**
	 * Total data set size of all shards assigned to selected nodes. This includes
	 * the size of shards not stored fully on the nodes, such as the cache for
	 * partially mounted indices.
	 * <p>
	 * API name: {@code total_data_set_size}
	 */
	@Nullable
	public final String totalDataSetSize() {
		return this.totalDataSetSize;
	}

	/**
	 * Total data set size, in bytes, of all shards assigned to selected nodes. This
	 * includes the size of shards not stored fully on the nodes, such as the cache
	 * for partially mounted indices.
	 * <p>
	 * API name: {@code total_data_set_size_in_bytes}
	 */
	@Nullable
	public final Long totalDataSetSizeInBytes() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StoreStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<StoreStats> {
		@Nullable
		private String size;

		private Long sizeInBytes;

		@Nullable
		private String reserved;

		private Long reservedInBytes;

		@Nullable
		private String totalDataSetSize;

		@Nullable
		private Long totalDataSetSizeInBytes;

		/**
		 * Total size of all shards assigned to selected nodes.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - Total size, in bytes, of all shards assigned to selected nodes.
		 * <p>
		 * API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * A prediction of how much larger the shard stores will eventually grow due to
		 * ongoing peer recoveries, restoring snapshots, and similar activities.
		 * <p>
		 * API name: {@code reserved}
		 */
		public final Builder reserved(@Nullable String value) {
			this.reserved = value;
			return this;
		}

		/**
		 * Required - A prediction, in bytes, of how much larger the shard stores will
		 * eventually grow due to ongoing peer recoveries, restoring snapshots, and
		 * similar activities.
		 * <p>
		 * API name: {@code reserved_in_bytes}
		 */
		public final Builder reservedInBytes(long value) {
			this.reservedInBytes = value;
			return this;
		}

		/**
		 * Total data set size of all shards assigned to selected nodes. This includes
		 * the size of shards not stored fully on the nodes, such as the cache for
		 * partially mounted indices.
		 * <p>
		 * API name: {@code total_data_set_size}
		 */
		public final Builder totalDataSetSize(@Nullable String value) {
			this.totalDataSetSize = value;
			return this;
		}

		/**
		 * Total data set size, in bytes, of all shards assigned to selected nodes. This
		 * includes the size of shards not stored fully on the nodes, such as the cache
		 * for partially mounted indices.
		 * <p>
		 * API name: {@code total_data_set_size_in_bytes}
		 */
		public final Builder totalDataSetSizeInBytes(@Nullable Long value) {
			this.totalDataSetSizeInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StoreStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StoreStats build() {
			_checkSingleUse();

			return new StoreStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StoreStats}
	 */
	public static final JsonpDeserializer<StoreStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StoreStats::setupStoreStatsDeserializer);

	protected static void setupStoreStatsDeserializer(ObjectDeserializer<StoreStats.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");
		op.add(Builder::reserved, JsonpDeserializer.stringDeserializer(), "reserved");
		op.add(Builder::reservedInBytes, JsonpDeserializer.longDeserializer(), "reserved_in_bytes");
		op.add(Builder::totalDataSetSize, JsonpDeserializer.stringDeserializer(), "total_data_set_size");
		op.add(Builder::totalDataSetSizeInBytes, JsonpDeserializer.longDeserializer(), "total_data_set_size_in_bytes");

	}

}
