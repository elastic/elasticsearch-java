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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: cluster.stats.OperatingSystemMemoryInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.OperatingSystemMemoryInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class OperatingSystemMemoryInfo implements JsonpSerializable {
	@Nullable
	private final Long adjustedTotalInBytes;

	@Nullable
	private final String adjustedTotal;

	private final long freeInBytes;

	@Nullable
	private final String free;

	private final int freePercent;

	private final long totalInBytes;

	@Nullable
	private final String total;

	private final long usedInBytes;

	@Nullable
	private final String used;

	private final int usedPercent;

	// ---------------------------------------------------------------------------------------------

	private OperatingSystemMemoryInfo(Builder builder) {

		this.adjustedTotalInBytes = builder.adjustedTotalInBytes;
		this.adjustedTotal = builder.adjustedTotal;
		this.freeInBytes = ApiTypeHelper.requireNonNull(builder.freeInBytes, this, "freeInBytes", 0);
		this.free = builder.free;
		this.freePercent = ApiTypeHelper.requireNonNull(builder.freePercent, this, "freePercent", 0);
		this.totalInBytes = ApiTypeHelper.requireNonNull(builder.totalInBytes, this, "totalInBytes", 0);
		this.total = builder.total;
		this.usedInBytes = ApiTypeHelper.requireNonNull(builder.usedInBytes, this, "usedInBytes", 0);
		this.used = builder.used;
		this.usedPercent = ApiTypeHelper.requireNonNull(builder.usedPercent, this, "usedPercent", 0);

	}

	public static OperatingSystemMemoryInfo of(Function<Builder, ObjectBuilder<OperatingSystemMemoryInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Total amount, in bytes, of memory across all selected nodes, but using the
	 * value specified using the <code>es.total_memory_bytes</code> system property
	 * instead of measured total memory for those nodes where that system property
	 * was set.
	 * <p>
	 * API name: {@code adjusted_total_in_bytes}
	 */
	@Nullable
	public final Long adjustedTotalInBytes() {
		return this.adjustedTotalInBytes;
	}

	/**
	 * Total amount of memory across all selected nodes, but using the value
	 * specified using the <code>es.total_memory_bytes</code> system property
	 * instead of measured total memory for those nodes where that system property
	 * was set.
	 * <p>
	 * API name: {@code adjusted_total}
	 */
	@Nullable
	public final String adjustedTotal() {
		return this.adjustedTotal;
	}

	/**
	 * Required - Amount, in bytes, of free physical memory across all selected
	 * nodes.
	 * <p>
	 * API name: {@code free_in_bytes}
	 */
	public final long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * Amount of free physical memory across all selected nodes.
	 * <p>
	 * API name: {@code free}
	 */
	@Nullable
	public final String free() {
		return this.free;
	}

	/**
	 * Required - Percentage of free physical memory across all selected nodes.
	 * <p>
	 * API name: {@code free_percent}
	 */
	public final int freePercent() {
		return this.freePercent;
	}

	/**
	 * Required - Total amount, in bytes, of physical memory across all selected
	 * nodes.
	 * <p>
	 * API name: {@code total_in_bytes}
	 */
	public final long totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * Total amount of physical memory across all selected nodes.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final String total() {
		return this.total;
	}

	/**
	 * Required - Amount, in bytes, of physical memory in use across all selected
	 * nodes.
	 * <p>
	 * API name: {@code used_in_bytes}
	 */
	public final long usedInBytes() {
		return this.usedInBytes;
	}

	/**
	 * Amount of physical memory in use across all selected nodes.
	 * <p>
	 * API name: {@code used}
	 */
	@Nullable
	public final String used() {
		return this.used;
	}

	/**
	 * Required - Percentage of physical memory in use across all selected nodes.
	 * <p>
	 * API name: {@code used_percent}
	 */
	public final int usedPercent() {
		return this.usedPercent;
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

		if (this.adjustedTotalInBytes != null) {
			generator.writeKey("adjusted_total_in_bytes");
			generator.write(this.adjustedTotalInBytes);

		}
		if (this.adjustedTotal != null) {
			generator.writeKey("adjusted_total");
			generator.write(this.adjustedTotal);

		}
		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes);

		if (this.free != null) {
			generator.writeKey("free");
			generator.write(this.free);

		}
		generator.writeKey("free_percent");
		generator.write(this.freePercent);

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}
		generator.writeKey("used_in_bytes");
		generator.write(this.usedInBytes);

		if (this.used != null) {
			generator.writeKey("used");
			generator.write(this.used);

		}
		generator.writeKey("used_percent");
		generator.write(this.usedPercent);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OperatingSystemMemoryInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OperatingSystemMemoryInfo> {
		@Nullable
		private Long adjustedTotalInBytes;

		@Nullable
		private String adjustedTotal;

		private Long freeInBytes;

		@Nullable
		private String free;

		private Integer freePercent;

		private Long totalInBytes;

		@Nullable
		private String total;

		private Long usedInBytes;

		@Nullable
		private String used;

		private Integer usedPercent;

		public Builder() {
		}
		private Builder(OperatingSystemMemoryInfo instance) {
			this.adjustedTotalInBytes = instance.adjustedTotalInBytes;
			this.adjustedTotal = instance.adjustedTotal;
			this.freeInBytes = instance.freeInBytes;
			this.free = instance.free;
			this.freePercent = instance.freePercent;
			this.totalInBytes = instance.totalInBytes;
			this.total = instance.total;
			this.usedInBytes = instance.usedInBytes;
			this.used = instance.used;
			this.usedPercent = instance.usedPercent;

		}
		/**
		 * Total amount, in bytes, of memory across all selected nodes, but using the
		 * value specified using the <code>es.total_memory_bytes</code> system property
		 * instead of measured total memory for those nodes where that system property
		 * was set.
		 * <p>
		 * API name: {@code adjusted_total_in_bytes}
		 */
		public final Builder adjustedTotalInBytes(@Nullable Long value) {
			this.adjustedTotalInBytes = value;
			return this;
		}

		/**
		 * Total amount of memory across all selected nodes, but using the value
		 * specified using the <code>es.total_memory_bytes</code> system property
		 * instead of measured total memory for those nodes where that system property
		 * was set.
		 * <p>
		 * API name: {@code adjusted_total}
		 */
		public final Builder adjustedTotal(@Nullable String value) {
			this.adjustedTotal = value;
			return this;
		}

		/**
		 * Required - Amount, in bytes, of free physical memory across all selected
		 * nodes.
		 * <p>
		 * API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * Amount of free physical memory across all selected nodes.
		 * <p>
		 * API name: {@code free}
		 */
		public final Builder free(@Nullable String value) {
			this.free = value;
			return this;
		}

		/**
		 * Required - Percentage of free physical memory across all selected nodes.
		 * <p>
		 * API name: {@code free_percent}
		 */
		public final Builder freePercent(int value) {
			this.freePercent = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of physical memory across all selected
		 * nodes.
		 * <p>
		 * API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(long value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Total amount of physical memory across all selected nodes.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - Amount, in bytes, of physical memory in use across all selected
		 * nodes.
		 * <p>
		 * API name: {@code used_in_bytes}
		 */
		public final Builder usedInBytes(long value) {
			this.usedInBytes = value;
			return this;
		}

		/**
		 * Amount of physical memory in use across all selected nodes.
		 * <p>
		 * API name: {@code used}
		 */
		public final Builder used(@Nullable String value) {
			this.used = value;
			return this;
		}

		/**
		 * Required - Percentage of physical memory in use across all selected nodes.
		 * <p>
		 * API name: {@code used_percent}
		 */
		public final Builder usedPercent(int value) {
			this.usedPercent = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OperatingSystemMemoryInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OperatingSystemMemoryInfo build() {
			_checkSingleUse();

			return new OperatingSystemMemoryInfo(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OperatingSystemMemoryInfo}
	 */
	public static final JsonpDeserializer<OperatingSystemMemoryInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OperatingSystemMemoryInfo::setupOperatingSystemMemoryInfoDeserializer);

	protected static void setupOperatingSystemMemoryInfoDeserializer(
			ObjectDeserializer<OperatingSystemMemoryInfo.Builder> op) {

		op.add(Builder::adjustedTotalInBytes, JsonpDeserializer.longDeserializer(), "adjusted_total_in_bytes");
		op.add(Builder::adjustedTotal, JsonpDeserializer.stringDeserializer(), "adjusted_total");
		op.add(Builder::freeInBytes, JsonpDeserializer.longDeserializer(), "free_in_bytes");
		op.add(Builder::free, JsonpDeserializer.stringDeserializer(), "free");
		op.add(Builder::freePercent, JsonpDeserializer.integerDeserializer(), "free_percent");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::usedInBytes, JsonpDeserializer.longDeserializer(), "used_in_bytes");
		op.add(Builder::used, JsonpDeserializer.stringDeserializer(), "used");
		op.add(Builder::usedPercent, JsonpDeserializer.integerDeserializer(), "used_percent");

	}

}
