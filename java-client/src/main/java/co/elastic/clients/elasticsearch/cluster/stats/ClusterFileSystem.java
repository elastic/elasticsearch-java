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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: cluster.stats.ClusterFileSystem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterFileSystem">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterFileSystem implements JsonpSerializable {
	@Nullable
	private final String path;

	@Nullable
	private final String mount;

	@Nullable
	private final String type;

	@Nullable
	private final Long availableInBytes;

	@Nullable
	private final String available;

	@Nullable
	private final Long freeInBytes;

	@Nullable
	private final String free;

	@Nullable
	private final Long totalInBytes;

	@Nullable
	private final String total;

	@Nullable
	private final String lowWatermarkFreeSpace;

	@Nullable
	private final Long lowWatermarkFreeSpaceInBytes;

	@Nullable
	private final String highWatermarkFreeSpace;

	@Nullable
	private final Long highWatermarkFreeSpaceInBytes;

	@Nullable
	private final String floodStageFreeSpace;

	@Nullable
	private final Long floodStageFreeSpaceInBytes;

	@Nullable
	private final String frozenFloodStageFreeSpace;

	@Nullable
	private final Long frozenFloodStageFreeSpaceInBytes;

	// ---------------------------------------------------------------------------------------------

	private ClusterFileSystem(Builder builder) {

		this.path = builder.path;
		this.mount = builder.mount;
		this.type = builder.type;
		this.availableInBytes = builder.availableInBytes;
		this.available = builder.available;
		this.freeInBytes = builder.freeInBytes;
		this.free = builder.free;
		this.totalInBytes = builder.totalInBytes;
		this.total = builder.total;
		this.lowWatermarkFreeSpace = builder.lowWatermarkFreeSpace;
		this.lowWatermarkFreeSpaceInBytes = builder.lowWatermarkFreeSpaceInBytes;
		this.highWatermarkFreeSpace = builder.highWatermarkFreeSpace;
		this.highWatermarkFreeSpaceInBytes = builder.highWatermarkFreeSpaceInBytes;
		this.floodStageFreeSpace = builder.floodStageFreeSpace;
		this.floodStageFreeSpaceInBytes = builder.floodStageFreeSpaceInBytes;
		this.frozenFloodStageFreeSpace = builder.frozenFloodStageFreeSpace;
		this.frozenFloodStageFreeSpaceInBytes = builder.frozenFloodStageFreeSpaceInBytes;

	}

	public static ClusterFileSystem of(Function<Builder, ObjectBuilder<ClusterFileSystem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * API name: {@code mount}
	 */
	@Nullable
	public final String mount() {
		return this.mount;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * Total number of bytes available to JVM in file stores across all selected
	 * nodes. Depending on operating system or process-level restrictions, this
	 * number may be less than <code>nodes.fs.free_in_byes</code>. This is the
	 * actual amount of free disk space the selected Elasticsearch nodes can use.
	 * <p>
	 * API name: {@code available_in_bytes}
	 */
	@Nullable
	public final Long availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * Total number of bytes available to JVM in file stores across all selected
	 * nodes. Depending on operating system or process-level restrictions, this
	 * number may be less than <code>nodes.fs.free_in_byes</code>. This is the
	 * actual amount of free disk space the selected Elasticsearch nodes can use.
	 * <p>
	 * API name: {@code available}
	 */
	@Nullable
	public final String available() {
		return this.available;
	}

	/**
	 * Total number, in bytes, of unallocated bytes in file stores across all
	 * selected nodes.
	 * <p>
	 * API name: {@code free_in_bytes}
	 */
	@Nullable
	public final Long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * Total number of unallocated bytes in file stores across all selected nodes.
	 * <p>
	 * API name: {@code free}
	 */
	@Nullable
	public final String free() {
		return this.free;
	}

	/**
	 * Total size, in bytes, of all file stores across all selected nodes.
	 * <p>
	 * API name: {@code total_in_bytes}
	 */
	@Nullable
	public final Long totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * Total size of all file stores across all selected nodes.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final String total() {
		return this.total;
	}

	/**
	 * API name: {@code low_watermark_free_space}
	 */
	@Nullable
	public final String lowWatermarkFreeSpace() {
		return this.lowWatermarkFreeSpace;
	}

	/**
	 * API name: {@code low_watermark_free_space_in_bytes}
	 */
	@Nullable
	public final Long lowWatermarkFreeSpaceInBytes() {
		return this.lowWatermarkFreeSpaceInBytes;
	}

	/**
	 * API name: {@code high_watermark_free_space}
	 */
	@Nullable
	public final String highWatermarkFreeSpace() {
		return this.highWatermarkFreeSpace;
	}

	/**
	 * API name: {@code high_watermark_free_space_in_bytes}
	 */
	@Nullable
	public final Long highWatermarkFreeSpaceInBytes() {
		return this.highWatermarkFreeSpaceInBytes;
	}

	/**
	 * API name: {@code flood_stage_free_space}
	 */
	@Nullable
	public final String floodStageFreeSpace() {
		return this.floodStageFreeSpace;
	}

	/**
	 * API name: {@code flood_stage_free_space_in_bytes}
	 */
	@Nullable
	public final Long floodStageFreeSpaceInBytes() {
		return this.floodStageFreeSpaceInBytes;
	}

	/**
	 * API name: {@code frozen_flood_stage_free_space}
	 */
	@Nullable
	public final String frozenFloodStageFreeSpace() {
		return this.frozenFloodStageFreeSpace;
	}

	/**
	 * API name: {@code frozen_flood_stage_free_space_in_bytes}
	 */
	@Nullable
	public final Long frozenFloodStageFreeSpaceInBytes() {
		return this.frozenFloodStageFreeSpaceInBytes;
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

		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}
		if (this.mount != null) {
			generator.writeKey("mount");
			generator.write(this.mount);

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.availableInBytes != null) {
			generator.writeKey("available_in_bytes");
			generator.write(this.availableInBytes);

		}
		if (this.available != null) {
			generator.writeKey("available");
			generator.write(this.available);

		}
		if (this.freeInBytes != null) {
			generator.writeKey("free_in_bytes");
			generator.write(this.freeInBytes);

		}
		if (this.free != null) {
			generator.writeKey("free");
			generator.write(this.free);

		}
		if (this.totalInBytes != null) {
			generator.writeKey("total_in_bytes");
			generator.write(this.totalInBytes);

		}
		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}
		if (this.lowWatermarkFreeSpace != null) {
			generator.writeKey("low_watermark_free_space");
			generator.write(this.lowWatermarkFreeSpace);

		}
		if (this.lowWatermarkFreeSpaceInBytes != null) {
			generator.writeKey("low_watermark_free_space_in_bytes");
			generator.write(this.lowWatermarkFreeSpaceInBytes);

		}
		if (this.highWatermarkFreeSpace != null) {
			generator.writeKey("high_watermark_free_space");
			generator.write(this.highWatermarkFreeSpace);

		}
		if (this.highWatermarkFreeSpaceInBytes != null) {
			generator.writeKey("high_watermark_free_space_in_bytes");
			generator.write(this.highWatermarkFreeSpaceInBytes);

		}
		if (this.floodStageFreeSpace != null) {
			generator.writeKey("flood_stage_free_space");
			generator.write(this.floodStageFreeSpace);

		}
		if (this.floodStageFreeSpaceInBytes != null) {
			generator.writeKey("flood_stage_free_space_in_bytes");
			generator.write(this.floodStageFreeSpaceInBytes);

		}
		if (this.frozenFloodStageFreeSpace != null) {
			generator.writeKey("frozen_flood_stage_free_space");
			generator.write(this.frozenFloodStageFreeSpace);

		}
		if (this.frozenFloodStageFreeSpaceInBytes != null) {
			generator.writeKey("frozen_flood_stage_free_space_in_bytes");
			generator.write(this.frozenFloodStageFreeSpaceInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterFileSystem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterFileSystem> {
		@Nullable
		private String path;

		@Nullable
		private String mount;

		@Nullable
		private String type;

		@Nullable
		private Long availableInBytes;

		@Nullable
		private String available;

		@Nullable
		private Long freeInBytes;

		@Nullable
		private String free;

		@Nullable
		private Long totalInBytes;

		@Nullable
		private String total;

		@Nullable
		private String lowWatermarkFreeSpace;

		@Nullable
		private Long lowWatermarkFreeSpaceInBytes;

		@Nullable
		private String highWatermarkFreeSpace;

		@Nullable
		private Long highWatermarkFreeSpaceInBytes;

		@Nullable
		private String floodStageFreeSpace;

		@Nullable
		private Long floodStageFreeSpaceInBytes;

		@Nullable
		private String frozenFloodStageFreeSpace;

		@Nullable
		private Long frozenFloodStageFreeSpaceInBytes;

		/**
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code mount}
		 */
		public final Builder mount(@Nullable String value) {
			this.mount = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Total number of bytes available to JVM in file stores across all selected
		 * nodes. Depending on operating system or process-level restrictions, this
		 * number may be less than <code>nodes.fs.free_in_byes</code>. This is the
		 * actual amount of free disk space the selected Elasticsearch nodes can use.
		 * <p>
		 * API name: {@code available_in_bytes}
		 */
		public final Builder availableInBytes(@Nullable Long value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * Total number of bytes available to JVM in file stores across all selected
		 * nodes. Depending on operating system or process-level restrictions, this
		 * number may be less than <code>nodes.fs.free_in_byes</code>. This is the
		 * actual amount of free disk space the selected Elasticsearch nodes can use.
		 * <p>
		 * API name: {@code available}
		 */
		public final Builder available(@Nullable String value) {
			this.available = value;
			return this;
		}

		/**
		 * Total number, in bytes, of unallocated bytes in file stores across all
		 * selected nodes.
		 * <p>
		 * API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(@Nullable Long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * Total number of unallocated bytes in file stores across all selected nodes.
		 * <p>
		 * API name: {@code free}
		 */
		public final Builder free(@Nullable String value) {
			this.free = value;
			return this;
		}

		/**
		 * Total size, in bytes, of all file stores across all selected nodes.
		 * <p>
		 * API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(@Nullable Long value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Total size of all file stores across all selected nodes.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code low_watermark_free_space}
		 */
		public final Builder lowWatermarkFreeSpace(@Nullable String value) {
			this.lowWatermarkFreeSpace = value;
			return this;
		}

		/**
		 * API name: {@code low_watermark_free_space_in_bytes}
		 */
		public final Builder lowWatermarkFreeSpaceInBytes(@Nullable Long value) {
			this.lowWatermarkFreeSpaceInBytes = value;
			return this;
		}

		/**
		 * API name: {@code high_watermark_free_space}
		 */
		public final Builder highWatermarkFreeSpace(@Nullable String value) {
			this.highWatermarkFreeSpace = value;
			return this;
		}

		/**
		 * API name: {@code high_watermark_free_space_in_bytes}
		 */
		public final Builder highWatermarkFreeSpaceInBytes(@Nullable Long value) {
			this.highWatermarkFreeSpaceInBytes = value;
			return this;
		}

		/**
		 * API name: {@code flood_stage_free_space}
		 */
		public final Builder floodStageFreeSpace(@Nullable String value) {
			this.floodStageFreeSpace = value;
			return this;
		}

		/**
		 * API name: {@code flood_stage_free_space_in_bytes}
		 */
		public final Builder floodStageFreeSpaceInBytes(@Nullable Long value) {
			this.floodStageFreeSpaceInBytes = value;
			return this;
		}

		/**
		 * API name: {@code frozen_flood_stage_free_space}
		 */
		public final Builder frozenFloodStageFreeSpace(@Nullable String value) {
			this.frozenFloodStageFreeSpace = value;
			return this;
		}

		/**
		 * API name: {@code frozen_flood_stage_free_space_in_bytes}
		 */
		public final Builder frozenFloodStageFreeSpaceInBytes(@Nullable Long value) {
			this.frozenFloodStageFreeSpaceInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterFileSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterFileSystem build() {
			_checkSingleUse();

			return new ClusterFileSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterFileSystem}
	 */
	public static final JsonpDeserializer<ClusterFileSystem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterFileSystem::setupClusterFileSystemDeserializer);

	protected static void setupClusterFileSystemDeserializer(ObjectDeserializer<ClusterFileSystem.Builder> op) {

		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::mount, JsonpDeserializer.stringDeserializer(), "mount");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::availableInBytes, JsonpDeserializer.longDeserializer(), "available_in_bytes");
		op.add(Builder::available, JsonpDeserializer.stringDeserializer(), "available");
		op.add(Builder::freeInBytes, JsonpDeserializer.longDeserializer(), "free_in_bytes");
		op.add(Builder::free, JsonpDeserializer.stringDeserializer(), "free");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::lowWatermarkFreeSpace, JsonpDeserializer.stringDeserializer(), "low_watermark_free_space");
		op.add(Builder::lowWatermarkFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"low_watermark_free_space_in_bytes");
		op.add(Builder::highWatermarkFreeSpace, JsonpDeserializer.stringDeserializer(), "high_watermark_free_space");
		op.add(Builder::highWatermarkFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"high_watermark_free_space_in_bytes");
		op.add(Builder::floodStageFreeSpace, JsonpDeserializer.stringDeserializer(), "flood_stage_free_space");
		op.add(Builder::floodStageFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"flood_stage_free_space_in_bytes");
		op.add(Builder::frozenFloodStageFreeSpace, JsonpDeserializer.stringDeserializer(),
				"frozen_flood_stage_free_space");
		op.add(Builder::frozenFloodStageFreeSpaceInBytes, JsonpDeserializer.longDeserializer(),
				"frozen_flood_stage_free_space_in_bytes");

	}

}
