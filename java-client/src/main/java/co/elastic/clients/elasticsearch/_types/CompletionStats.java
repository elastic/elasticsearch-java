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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.CompletionStats
@JsonpDeserializable
public class CompletionStats implements JsonpSerializable {
	private final long sizeInBytes;

	@Nullable
	private final String size;

	private final Map<String, FieldSizeUsage> fields;

	// ---------------------------------------------------------------------------------------------

	private CompletionStats(Builder builder) {

		this.sizeInBytes = ModelTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");
		this.size = builder.size;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);

	}

	public static CompletionStats of(Function<Builder, ObjectBuilder<CompletionStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
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
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, FieldSizeUsage> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CompletionStats> {
		private Long sizeInBytes;

		@Nullable
		private String size;

		@Nullable
		private Map<String, FieldSizeUsage> fields;

		/**
		 * Required - API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable Map<String, FieldSizeUsage> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Set {@link #fields(Map)} to a singleton map.
		 */
		public Builder fields(String key, Function<FieldSizeUsage.Builder, ObjectBuilder<FieldSizeUsage>> fn) {
			return this.fields(Collections.singletonMap(key, fn.apply(new FieldSizeUsage.Builder()).build()));
		}

		public final Builder fields(
				Function<MapBuilder<String, FieldSizeUsage, FieldSizeUsage.Builder>, ObjectBuilder<Map<String, FieldSizeUsage>>> fn) {
			return fields(fn.apply(new MapBuilder<>(FieldSizeUsage.Builder::new)).build());
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
			CompletionStats::setupCompletionStatsDeserializer, Builder::build);

	protected static void setupCompletionStatsDeserializer(DelegatingDeserializer<CompletionStats.Builder> op) {

		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(FieldSizeUsage._DESERIALIZER), "fields");

	}

}
