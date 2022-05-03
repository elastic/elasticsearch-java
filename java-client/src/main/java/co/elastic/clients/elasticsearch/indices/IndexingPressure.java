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

package co.elastic.clients.elasticsearch.indices;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexingPressure

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.IndexingPressure">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexingPressure implements JsonpSerializable {
	private final IndexingPressureMemory memory;

	// ---------------------------------------------------------------------------------------------

	private IndexingPressure(Builder builder) {

		this.memory = ApiTypeHelper.requireNonNull(builder.memory, this, "memory");

	}

	public static IndexingPressure of(Function<Builder, ObjectBuilder<IndexingPressure>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code memory}
	 */
	public final IndexingPressureMemory memory() {
		return this.memory;
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

		generator.writeKey("memory");
		this.memory.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexingPressure}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexingPressure> {
		private IndexingPressureMemory memory;

		/**
		 * Required - API name: {@code memory}
		 */
		public final Builder memory(IndexingPressureMemory value) {
			this.memory = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory}
		 */
		public final Builder memory(
				Function<IndexingPressureMemory.Builder, ObjectBuilder<IndexingPressureMemory>> fn) {
			return this.memory(fn.apply(new IndexingPressureMemory.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexingPressure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexingPressure build() {
			_checkSingleUse();

			return new IndexingPressure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexingPressure}
	 */
	public static final JsonpDeserializer<IndexingPressure> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexingPressure::setupIndexingPressureDeserializer);

	protected static void setupIndexingPressureDeserializer(ObjectDeserializer<IndexingPressure.Builder> op) {

		op.add(Builder::memory, IndexingPressureMemory._DESERIALIZER, "memory");

	}

}
