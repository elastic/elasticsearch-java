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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.FieldTypes

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cluster.stats.FieldTypes">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldTypes implements JsonpSerializable {
	private final String name;

	private final int count;

	private final int indexCount;

	@Nullable
	private final Long indexedVectorCount;

	@Nullable
	private final Long indexedVectorDimMax;

	@Nullable
	private final Long indexedVectorDimMin;

	@Nullable
	private final Integer scriptCount;

	// ---------------------------------------------------------------------------------------------

	private FieldTypes(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.indexCount = ApiTypeHelper.requireNonNull(builder.indexCount, this, "indexCount");
		this.indexedVectorCount = builder.indexedVectorCount;
		this.indexedVectorDimMax = builder.indexedVectorDimMax;
		this.indexedVectorDimMin = builder.indexedVectorDimMin;
		this.scriptCount = builder.scriptCount;

	}

	public static FieldTypes of(Function<Builder, ObjectBuilder<FieldTypes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name for the field type in selected nodes.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The number of occurrences of the field type in selected nodes.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - The number of indices containing the field type in selected nodes.
	 * <p>
	 * API name: {@code index_count}
	 */
	public final int indexCount() {
		return this.indexCount;
	}

	/**
	 * For dense_vector field types, number of indexed vector types in selected
	 * nodes.
	 * <p>
	 * API name: {@code indexed_vector_count}
	 */
	@Nullable
	public final Long indexedVectorCount() {
		return this.indexedVectorCount;
	}

	/**
	 * For dense_vector field types, the maximum dimension of all indexed vector
	 * types in selected nodes.
	 * <p>
	 * API name: {@code indexed_vector_dim_max}
	 */
	@Nullable
	public final Long indexedVectorDimMax() {
		return this.indexedVectorDimMax;
	}

	/**
	 * For dense_vector field types, the minimum dimension of all indexed vector
	 * types in selected nodes.
	 * <p>
	 * API name: {@code indexed_vector_dim_min}
	 */
	@Nullable
	public final Long indexedVectorDimMin() {
		return this.indexedVectorDimMin;
	}

	/**
	 * The number of fields that declare a script.
	 * <p>
	 * API name: {@code script_count}
	 */
	@Nullable
	public final Integer scriptCount() {
		return this.scriptCount;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("index_count");
		generator.write(this.indexCount);

		if (this.indexedVectorCount != null) {
			generator.writeKey("indexed_vector_count");
			generator.write(this.indexedVectorCount);

		}
		if (this.indexedVectorDimMax != null) {
			generator.writeKey("indexed_vector_dim_max");
			generator.write(this.indexedVectorDimMax);

		}
		if (this.indexedVectorDimMin != null) {
			generator.writeKey("indexed_vector_dim_min");
			generator.write(this.indexedVectorDimMin);

		}
		if (this.scriptCount != null) {
			generator.writeKey("script_count");
			generator.write(this.scriptCount);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldTypes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldTypes> {
		private String name;

		private Integer count;

		private Integer indexCount;

		@Nullable
		private Long indexedVectorCount;

		@Nullable
		private Long indexedVectorDimMax;

		@Nullable
		private Long indexedVectorDimMin;

		@Nullable
		private Integer scriptCount;

		/**
		 * Required - The name for the field type in selected nodes.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The number of occurrences of the field type in selected nodes.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - The number of indices containing the field type in selected nodes.
		 * <p>
		 * API name: {@code index_count}
		 */
		public final Builder indexCount(int value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * For dense_vector field types, number of indexed vector types in selected
		 * nodes.
		 * <p>
		 * API name: {@code indexed_vector_count}
		 */
		public final Builder indexedVectorCount(@Nullable Long value) {
			this.indexedVectorCount = value;
			return this;
		}

		/**
		 * For dense_vector field types, the maximum dimension of all indexed vector
		 * types in selected nodes.
		 * <p>
		 * API name: {@code indexed_vector_dim_max}
		 */
		public final Builder indexedVectorDimMax(@Nullable Long value) {
			this.indexedVectorDimMax = value;
			return this;
		}

		/**
		 * For dense_vector field types, the minimum dimension of all indexed vector
		 * types in selected nodes.
		 * <p>
		 * API name: {@code indexed_vector_dim_min}
		 */
		public final Builder indexedVectorDimMin(@Nullable Long value) {
			this.indexedVectorDimMin = value;
			return this;
		}

		/**
		 * The number of fields that declare a script.
		 * <p>
		 * API name: {@code script_count}
		 */
		public final Builder scriptCount(@Nullable Integer value) {
			this.scriptCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldTypes build() {
			_checkSingleUse();

			return new FieldTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldTypes}
	 */
	public static final JsonpDeserializer<FieldTypes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldTypes::setupFieldTypesDeserializer);

	protected static void setupFieldTypesDeserializer(ObjectDeserializer<FieldTypes.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::indexCount, JsonpDeserializer.integerDeserializer(), "index_count");
		op.add(Builder::indexedVectorCount, JsonpDeserializer.longDeserializer(), "indexed_vector_count");
		op.add(Builder::indexedVectorDimMax, JsonpDeserializer.longDeserializer(), "indexed_vector_dim_max");
		op.add(Builder::indexedVectorDimMin, JsonpDeserializer.longDeserializer(), "indexed_vector_dim_min");
		op.add(Builder::scriptCount, JsonpDeserializer.integerDeserializer(), "script_count");

	}

}
