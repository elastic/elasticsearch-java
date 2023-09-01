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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.IndexingPressureMemory

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.IndexingPressureMemory">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexingPressureMemory implements JsonpSerializable {
	private final IndexingPressureMemorySummary current;

	private final long limitInBytes;

	private final IndexingPressureMemorySummary total;

	// ---------------------------------------------------------------------------------------------

	private IndexingPressureMemory(Builder builder) {

		this.current = ApiTypeHelper.requireNonNull(builder.current, this, "current");
		this.limitInBytes = ApiTypeHelper.requireNonNull(builder.limitInBytes, this, "limitInBytes");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static IndexingPressureMemory of(Function<Builder, ObjectBuilder<IndexingPressureMemory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code current}
	 */
	public final IndexingPressureMemorySummary current() {
		return this.current;
	}

	/**
	 * Required - API name: {@code limit_in_bytes}
	 */
	public final long limitInBytes() {
		return this.limitInBytes;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final IndexingPressureMemorySummary total() {
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

		generator.writeKey("current");
		this.current.serialize(generator, mapper);

		generator.writeKey("limit_in_bytes");
		generator.write(this.limitInBytes);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

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
		private IndexingPressureMemorySummary current;

		private Long limitInBytes;

		private IndexingPressureMemorySummary total;

		/**
		 * Required - API name: {@code current}
		 */
		public final Builder current(IndexingPressureMemorySummary value) {
			this.current = value;
			return this;
		}

		/**
		 * Required - API name: {@code current}
		 */
		public final Builder current(
				Function<IndexingPressureMemorySummary.Builder, ObjectBuilder<IndexingPressureMemorySummary>> fn) {
			return this.current(fn.apply(new IndexingPressureMemorySummary.Builder()).build());
		}

		/**
		 * Required - API name: {@code limit_in_bytes}
		 */
		public final Builder limitInBytes(long value) {
			this.limitInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(IndexingPressureMemorySummary value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(
				Function<IndexingPressureMemorySummary.Builder, ObjectBuilder<IndexingPressureMemorySummary>> fn) {
			return this.total(fn.apply(new IndexingPressureMemorySummary.Builder()).build());
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

		op.add(Builder::current, IndexingPressureMemorySummary._DESERIALIZER, "current");
		op.add(Builder::limitInBytes, JsonpDeserializer.longDeserializer(), "limit_in_bytes");
		op.add(Builder::total, IndexingPressureMemorySummary._DESERIALIZER, "total");

	}

}
