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

package co.elastic.clients.elasticsearch.indices.get_mapping;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_mapping.IndexMappingRecord

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/indices/get_mapping/IndicesGetMappingResponse.ts#L29-L32">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexMappingRecord implements JsonpSerializable {
	@Nullable
	private final TypeMapping item;

	private final TypeMapping mappings;

	// ---------------------------------------------------------------------------------------------

	private IndexMappingRecord(Builder builder) {

		this.item = builder.item;
		this.mappings = ApiTypeHelper.requireNonNull(builder.mappings, this, "mappings");

	}

	public static IndexMappingRecord of(Function<Builder, ObjectBuilder<IndexMappingRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code item}
	 */
	@Nullable
	public final TypeMapping item() {
		return this.item;
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public final TypeMapping mappings() {
		return this.mappings;
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

		if (this.item != null) {
			generator.writeKey("item");
			this.item.serialize(generator, mapper);

		}
		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexMappingRecord}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexMappingRecord> {
		@Nullable
		private TypeMapping item;

		private TypeMapping mappings;

		/**
		 * API name: {@code item}
		 */
		public final Builder item(@Nullable TypeMapping value) {
			this.item = value;
			return this;
		}

		/**
		 * API name: {@code item}
		 */
		public final Builder item(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.item(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Builds a {@link IndexMappingRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexMappingRecord build() {
			_checkSingleUse();

			return new IndexMappingRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexMappingRecord}
	 */
	public static final JsonpDeserializer<IndexMappingRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexMappingRecord::setupIndexMappingRecordDeserializer);

	protected static void setupIndexMappingRecordDeserializer(ObjectDeserializer<IndexMappingRecord.Builder> op) {

		op.add(Builder::item, TypeMapping._DESERIALIZER, "item");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");

	}

}
