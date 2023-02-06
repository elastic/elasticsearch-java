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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.IndexingPressureMemory

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.IndexingPressureMemory">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexingPressureMemory implements JsonpSerializable {
	@Nullable
	private final String limit;

	@Nullable
	private final Long limitInBytes;

	@Nullable
	private final PressureMemory current;

	@Nullable
	private final PressureMemory total;

	// ---------------------------------------------------------------------------------------------

	private IndexingPressureMemory(Builder builder) {

		this.limit = builder.limit;
		this.limitInBytes = builder.limitInBytes;
		this.current = builder.current;
		this.total = builder.total;

	}

	public static IndexingPressureMemory of(Function<Builder, ObjectBuilder<IndexingPressureMemory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code limit}
	 */
	@Nullable
	public final String limit() {
		return this.limit;
	}

	/**
	 * API name: {@code limit_in_bytes}
	 */
	@Nullable
	public final Long limitInBytes() {
		return this.limitInBytes;
	}

	/**
	 * API name: {@code current}
	 */
	@Nullable
	public final PressureMemory current() {
		return this.current;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final PressureMemory total() {
		return this.total;
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

		if (this.limit != null) {
			generator.writeKey("limit");
			generator.write(this.limit);

		}
		if (this.limitInBytes != null) {
			generator.writeKey("limit_in_bytes");
			generator.write(this.limitInBytes);

		}
		if (this.current != null) {
			generator.writeKey("current");
			this.current.serialize(generator, mapper);

		}
		if (this.total != null) {
			generator.writeKey("total");
			this.total.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexingPressureMemory}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexingPressureMemory> {
		@Nullable
		private String limit;

		@Nullable
		private Long limitInBytes;

		@Nullable
		private PressureMemory current;

		@Nullable
		private PressureMemory total;

		/**
		 * API name: {@code limit}
		 */
		public final Builder limit(@Nullable String value) {
			this.limit = value;
			return this;
		}

		/**
		 * API name: {@code limit_in_bytes}
		 */
		public final Builder limitInBytes(@Nullable Long value) {
			this.limitInBytes = value;
			return this;
		}

		/**
		 * API name: {@code current}
		 */
		public final Builder current(@Nullable PressureMemory value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code current}
		 */
		public final Builder current(Function<PressureMemory.Builder, ObjectBuilder<PressureMemory>> fn) {
			return this.current(fn.apply(new PressureMemory.Builder()).build());
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable PressureMemory value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(Function<PressureMemory.Builder, ObjectBuilder<PressureMemory>> fn) {
			return this.total(fn.apply(new PressureMemory.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexingPressureMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexingPressureMemory build() {
			_checkSingleUse();

			return new IndexingPressureMemory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexingPressureMemory}
	 */
	public static final JsonpDeserializer<IndexingPressureMemory> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexingPressureMemory::setupIndexingPressureMemoryDeserializer);

	protected static void setupIndexingPressureMemoryDeserializer(
			ObjectDeserializer<IndexingPressureMemory.Builder> op) {

		op.add(Builder::limit, JsonpDeserializer.stringDeserializer(), "limit");
		op.add(Builder::limitInBytes, JsonpDeserializer.longDeserializer(), "limit_in_bytes");
		op.add(Builder::current, PressureMemory._DESERIALIZER, "current");
		op.add(Builder::total, PressureMemory._DESERIALIZER, "total");

	}

}
