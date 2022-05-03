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

package co.elastic.clients.elasticsearch.nodes;

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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.JvmMemoryStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.JvmMemoryStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class JvmMemoryStats implements JsonpSerializable {
	@Nullable
	private final Long heapUsedInBytes;

	@Nullable
	private final Long heapUsedPercent;

	@Nullable
	private final Long heapCommittedInBytes;

	@Nullable
	private final Long heapMaxInBytes;

	@Nullable
	private final Long nonHeapUsedInBytes;

	@Nullable
	private final Long nonHeapCommittedInBytes;

	private final Map<String, Pool> pools;

	// ---------------------------------------------------------------------------------------------

	private JvmMemoryStats(Builder builder) {

		this.heapUsedInBytes = builder.heapUsedInBytes;
		this.heapUsedPercent = builder.heapUsedPercent;
		this.heapCommittedInBytes = builder.heapCommittedInBytes;
		this.heapMaxInBytes = builder.heapMaxInBytes;
		this.nonHeapUsedInBytes = builder.nonHeapUsedInBytes;
		this.nonHeapCommittedInBytes = builder.nonHeapCommittedInBytes;
		this.pools = ApiTypeHelper.unmodifiable(builder.pools);

	}

	public static JvmMemoryStats of(Function<Builder, ObjectBuilder<JvmMemoryStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code heap_used_in_bytes}
	 */
	@Nullable
	public final Long heapUsedInBytes() {
		return this.heapUsedInBytes;
	}

	/**
	 * API name: {@code heap_used_percent}
	 */
	@Nullable
	public final Long heapUsedPercent() {
		return this.heapUsedPercent;
	}

	/**
	 * API name: {@code heap_committed_in_bytes}
	 */
	@Nullable
	public final Long heapCommittedInBytes() {
		return this.heapCommittedInBytes;
	}

	/**
	 * API name: {@code heap_max_in_bytes}
	 */
	@Nullable
	public final Long heapMaxInBytes() {
		return this.heapMaxInBytes;
	}

	/**
	 * API name: {@code non_heap_used_in_bytes}
	 */
	@Nullable
	public final Long nonHeapUsedInBytes() {
		return this.nonHeapUsedInBytes;
	}

	/**
	 * API name: {@code non_heap_committed_in_bytes}
	 */
	@Nullable
	public final Long nonHeapCommittedInBytes() {
		return this.nonHeapCommittedInBytes;
	}

	/**
	 * API name: {@code pools}
	 */
	public final Map<String, Pool> pools() {
		return this.pools;
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

		if (this.heapUsedInBytes != null) {
			generator.writeKey("heap_used_in_bytes");
			generator.write(this.heapUsedInBytes);

		}
		if (this.heapUsedPercent != null) {
			generator.writeKey("heap_used_percent");
			generator.write(this.heapUsedPercent);

		}
		if (this.heapCommittedInBytes != null) {
			generator.writeKey("heap_committed_in_bytes");
			generator.write(this.heapCommittedInBytes);

		}
		if (this.heapMaxInBytes != null) {
			generator.writeKey("heap_max_in_bytes");
			generator.write(this.heapMaxInBytes);

		}
		if (this.nonHeapUsedInBytes != null) {
			generator.writeKey("non_heap_used_in_bytes");
			generator.write(this.nonHeapUsedInBytes);

		}
		if (this.nonHeapCommittedInBytes != null) {
			generator.writeKey("non_heap_committed_in_bytes");
			generator.write(this.nonHeapCommittedInBytes);

		}
		if (ApiTypeHelper.isDefined(this.pools)) {
			generator.writeKey("pools");
			generator.writeStartObject();
			for (Map.Entry<String, Pool> item0 : this.pools.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JvmMemoryStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<JvmMemoryStats> {
		@Nullable
		private Long heapUsedInBytes;

		@Nullable
		private Long heapUsedPercent;

		@Nullable
		private Long heapCommittedInBytes;

		@Nullable
		private Long heapMaxInBytes;

		@Nullable
		private Long nonHeapUsedInBytes;

		@Nullable
		private Long nonHeapCommittedInBytes;

		@Nullable
		private Map<String, Pool> pools;

		/**
		 * API name: {@code heap_used_in_bytes}
		 */
		public final Builder heapUsedInBytes(@Nullable Long value) {
			this.heapUsedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code heap_used_percent}
		 */
		public final Builder heapUsedPercent(@Nullable Long value) {
			this.heapUsedPercent = value;
			return this;
		}

		/**
		 * API name: {@code heap_committed_in_bytes}
		 */
		public final Builder heapCommittedInBytes(@Nullable Long value) {
			this.heapCommittedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code heap_max_in_bytes}
		 */
		public final Builder heapMaxInBytes(@Nullable Long value) {
			this.heapMaxInBytes = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_used_in_bytes}
		 */
		public final Builder nonHeapUsedInBytes(@Nullable Long value) {
			this.nonHeapUsedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_committed_in_bytes}
		 */
		public final Builder nonHeapCommittedInBytes(@Nullable Long value) {
			this.nonHeapCommittedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code pools}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>pools</code>.
		 */
		public final Builder pools(Map<String, Pool> map) {
			this.pools = _mapPutAll(this.pools, map);
			return this;
		}

		/**
		 * API name: {@code pools}
		 * <p>
		 * Adds an entry to <code>pools</code>.
		 */
		public final Builder pools(String key, Pool value) {
			this.pools = _mapPut(this.pools, key, value);
			return this;
		}

		/**
		 * API name: {@code pools}
		 * <p>
		 * Adds an entry to <code>pools</code> using a builder lambda.
		 */
		public final Builder pools(String key, Function<Pool.Builder, ObjectBuilder<Pool>> fn) {
			return pools(key, fn.apply(new Pool.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JvmMemoryStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JvmMemoryStats build() {
			_checkSingleUse();

			return new JvmMemoryStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JvmMemoryStats}
	 */
	public static final JsonpDeserializer<JvmMemoryStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JvmMemoryStats::setupJvmMemoryStatsDeserializer);

	protected static void setupJvmMemoryStatsDeserializer(ObjectDeserializer<JvmMemoryStats.Builder> op) {

		op.add(Builder::heapUsedInBytes, JsonpDeserializer.longDeserializer(), "heap_used_in_bytes");
		op.add(Builder::heapUsedPercent, JsonpDeserializer.longDeserializer(), "heap_used_percent");
		op.add(Builder::heapCommittedInBytes, JsonpDeserializer.longDeserializer(), "heap_committed_in_bytes");
		op.add(Builder::heapMaxInBytes, JsonpDeserializer.longDeserializer(), "heap_max_in_bytes");
		op.add(Builder::nonHeapUsedInBytes, JsonpDeserializer.longDeserializer(), "non_heap_used_in_bytes");
		op.add(Builder::nonHeapCommittedInBytes, JsonpDeserializer.longDeserializer(), "non_heap_committed_in_bytes");
		op.add(Builder::pools, JsonpDeserializer.stringMapDeserializer(Pool._DESERIALIZER), "pools");

	}

}
