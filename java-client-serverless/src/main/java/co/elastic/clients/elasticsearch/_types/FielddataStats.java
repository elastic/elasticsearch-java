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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.FielddataStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.FielddataStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class FielddataStats implements JsonpSerializable {
	@Nullable
	private final Long evictions;

	@Nullable
	private final String memorySize;

	private final long memorySizeInBytes;

	private final Map<String, FieldMemoryUsage> fields;

	// ---------------------------------------------------------------------------------------------

	private FielddataStats(Builder builder) {

		this.evictions = builder.evictions;
		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = ApiTypeHelper.requireNonNull(builder.memorySizeInBytes, this, "memorySizeInBytes");
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);

	}

	public static FielddataStats of(Function<Builder, ObjectBuilder<FielddataStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code evictions}
	 */
	@Nullable
	public final Long evictions() {
		return this.evictions;
	}

	/**
	 * API name: {@code memory_size}
	 */
	@Nullable
	public final String memorySize() {
		return this.memorySize;
	}

	/**
	 * Required - API name: {@code memory_size_in_bytes}
	 */
	public final long memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, FieldMemoryUsage> fields() {
		return this.fields;
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

		if (this.evictions != null) {
			generator.writeKey("evictions");
			generator.write(this.evictions);

		}
		if (this.memorySize != null) {
			generator.writeKey("memory_size");
			generator.write(this.memorySize);

		}
		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes);

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, FieldMemoryUsage> item0 : this.fields.entrySet()) {
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
	 * Builder for {@link FielddataStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FielddataStats> {
		@Nullable
		private Long evictions;

		@Nullable
		private String memorySize;

		private Long memorySizeInBytes;

		@Nullable
		private Map<String, FieldMemoryUsage> fields;

		/**
		 * API name: {@code evictions}
		 */
		public final Builder evictions(@Nullable Long value) {
			this.evictions = value;
			return this;
		}

		/**
		 * API name: {@code memory_size}
		 */
		public final Builder memorySize(@Nullable String value) {
			this.memorySize = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory_size_in_bytes}
		 */
		public final Builder memorySizeInBytes(long value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, FieldMemoryUsage> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, FieldMemoryUsage value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(String key,
				Function<FieldMemoryUsage.Builder, ObjectBuilder<FieldMemoryUsage>> fn) {
			return fields(key, fn.apply(new FieldMemoryUsage.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FielddataStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FielddataStats build() {
			_checkSingleUse();

			return new FielddataStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FielddataStats}
	 */
	public static final JsonpDeserializer<FielddataStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FielddataStats::setupFielddataStatsDeserializer);

	protected static void setupFielddataStatsDeserializer(ObjectDeserializer<FielddataStats.Builder> op) {

		op.add(Builder::evictions, JsonpDeserializer.longDeserializer(), "evictions");
		op.add(Builder::memorySize, JsonpDeserializer.stringDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.longDeserializer(), "memory_size_in_bytes");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(FieldMemoryUsage._DESERIALIZER), "fields");

	}

}
