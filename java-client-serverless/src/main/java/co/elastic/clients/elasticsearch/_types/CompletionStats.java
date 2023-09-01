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

// typedef: _types.CompletionStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.CompletionStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionStats implements JsonpSerializable {
	private final long sizeInBytes;

	@Nullable
	private final String size;

	private final Map<String, FieldSizeUsage> fields;

	// ---------------------------------------------------------------------------------------------

	private CompletionStats(Builder builder) {

		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");
		this.size = builder.size;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);

	}

	public static CompletionStats of(Function<Builder, ObjectBuilder<CompletionStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Total amount, in bytes, of memory used for completion across all
	 * shards assigned to selected nodes.
	 * <p>
	 * API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * Total amount of memory used for completion across all shards assigned to
	 * selected nodes.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, FieldSizeUsage> fields() {
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

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, FieldSizeUsage> item0 : this.fields.entrySet()) {
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
	 * Builder for {@link CompletionStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CompletionStats> {
		private Long sizeInBytes;

		@Nullable
		private String size;

		@Nullable
		private Map<String, FieldSizeUsage> fields;

		/**
		 * Required - Total amount, in bytes, of memory used for completion across all
		 * shards assigned to selected nodes.
		 * <p>
		 * API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Total amount of memory used for completion across all shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, FieldSizeUsage> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, FieldSizeUsage value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(String key, Function<FieldSizeUsage.Builder, ObjectBuilder<FieldSizeUsage>> fn) {
			return fields(key, fn.apply(new FieldSizeUsage.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionStats build() {
			_checkSingleUse();

			return new CompletionStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionStats}
	 */
	public static final JsonpDeserializer<CompletionStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CompletionStats::setupCompletionStatsDeserializer);

	protected static void setupCompletionStatsDeserializer(ObjectDeserializer<CompletionStats.Builder> op) {

		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(FieldSizeUsage._DESERIALIZER), "fields");

	}

}
