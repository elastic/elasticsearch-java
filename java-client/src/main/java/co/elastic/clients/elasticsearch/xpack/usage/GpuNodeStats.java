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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Boolean;
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

// typedef: xpack.usage.GpuNodeStats

/**
 * Per-node GPU statistics for vector indexing.
 * 
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.GpuNodeStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class GpuNodeStats implements JsonpSerializable {
	private final String type;

	private final long memoryInBytes;

	private final boolean enabled;

	private final long indexBuildCount;

	// ---------------------------------------------------------------------------------------------

	private GpuNodeStats(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.memoryInBytes = ApiTypeHelper.requireNonNull(builder.memoryInBytes, this, "memoryInBytes", 0);
		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled", false);
		this.indexBuildCount = ApiTypeHelper.requireNonNull(builder.indexBuildCount, this, "indexBuildCount", 0);

	}

	public static GpuNodeStats of(Function<Builder, ObjectBuilder<GpuNodeStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - GPU device type (e.g., &quot;NVIDIA L4&quot;, &quot;NVIDIA
	 * A100&quot;).
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - GPU memory in bytes.
	 * <p>
	 * API name: {@code memory_in_bytes}
	 */
	public final long memoryInBytes() {
		return this.memoryInBytes;
	}

	/**
	 * Required - Whether GPU vector indexing is enabled on this node.
	 * <p>
	 * API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - Number of GPU index builds performed on this node.
	 * <p>
	 * API name: {@code index_build_count}
	 */
	public final long indexBuildCount() {
		return this.indexBuildCount;
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

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("memory_in_bytes");
		generator.write(this.memoryInBytes);

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("index_build_count");
		generator.write(this.indexBuildCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GpuNodeStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GpuNodeStats> {
		private String type;

		private Long memoryInBytes;

		private Boolean enabled;

		private Long indexBuildCount;

		public Builder() {
		}
		private Builder(GpuNodeStats instance) {
			this.type = instance.type;
			this.memoryInBytes = instance.memoryInBytes;
			this.enabled = instance.enabled;
			this.indexBuildCount = instance.indexBuildCount;

		}
		/**
		 * Required - GPU device type (e.g., &quot;NVIDIA L4&quot;, &quot;NVIDIA
		 * A100&quot;).
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - GPU memory in bytes.
		 * <p>
		 * API name: {@code memory_in_bytes}
		 */
		public final Builder memoryInBytes(long value) {
			this.memoryInBytes = value;
			return this;
		}

		/**
		 * Required - Whether GPU vector indexing is enabled on this node.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - Number of GPU index builds performed on this node.
		 * <p>
		 * API name: {@code index_build_count}
		 */
		public final Builder indexBuildCount(long value) {
			this.indexBuildCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GpuNodeStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GpuNodeStats build() {
			_checkSingleUse();

			return new GpuNodeStats(this);
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
	 * Json deserializer for {@link GpuNodeStats}
	 */
	public static final JsonpDeserializer<GpuNodeStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GpuNodeStats::setupGpuNodeStatsDeserializer);

	protected static void setupGpuNodeStatsDeserializer(ObjectDeserializer<GpuNodeStats.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::memoryInBytes, JsonpDeserializer.longDeserializer(), "memory_in_bytes");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::indexBuildCount, JsonpDeserializer.longDeserializer(), "index_build_count");

	}

}
