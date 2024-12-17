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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: _types.mapping.DenseVectorProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final Integer dims;

	@Nullable
	private final DenseVectorElementType elementType;

	@Nullable
	private final Boolean index;

	@Nullable
	private final DenseVectorIndexOptions indexOptions;

	@Nullable
	private final DenseVectorSimilarity similarity;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorProperty(Builder builder) {
		super(builder);

		this.dims = builder.dims;
		this.elementType = builder.elementType;
		this.index = builder.index;
		this.indexOptions = builder.indexOptions;
		this.similarity = builder.similarity;

	}

	public static DenseVectorProperty of(Function<Builder, ObjectBuilder<DenseVectorProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.DenseVector;
	}

	/**
	 * Number of vector dimensions. Can't exceed <code>4096</code>. If
	 * <code>dims</code> is not specified, it will be set to the length of the first
	 * vector added to the field.
	 * <p>
	 * API name: {@code dims}
	 */
	@Nullable
	public final Integer dims() {
		return this.dims;
	}

	/**
	 * The data type used to encode vectors. The supported data types are
	 * <code>float</code> (default), <code>byte</code>, and <code>bit</code>.
	 * <p>
	 * API name: {@code element_type}
	 */
	@Nullable
	public final DenseVectorElementType elementType() {
		return this.elementType;
	}

	/**
	 * If <code>true</code>, you can search this field using the kNN search API.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * An optional section that configures the kNN indexing algorithm. The HNSW
	 * algorithm has two internal parameters that influence how the data structure
	 * is built. These can be adjusted to improve the accuracy of results, at the
	 * expense of slower indexing speed.
	 * <p>
	 * This parameter can only be specified when <code>index</code> is
	 * <code>true</code>.
	 * <p>
	 * API name: {@code index_options}
	 */
	@Nullable
	public final DenseVectorIndexOptions indexOptions() {
		return this.indexOptions;
	}

	/**
	 * The vector similarity metric to use in kNN search.
	 * <p>
	 * Documents are ranked by their vector field's similarity to the query vector.
	 * The <code>_score</code> of each document will be derived from the similarity,
	 * in a way that ensures scores are positive and that a larger score corresponds
	 * to a higher ranking.
	 * <p>
	 * Defaults to <code>l2_norm</code> when <code>element_type</code> is
	 * <code>bit</code> otherwise defaults to <code>cosine</code>.
	 * <p>
	 * <code>bit</code> vectors only support <code>l2_norm</code> as their
	 * similarity metric.
	 * <p>
	 * This parameter can only be specified when <code>index</code> is
	 * <code>true</code>.
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final DenseVectorSimilarity similarity() {
		return this.similarity;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "dense_vector");
		super.serializeInternal(generator, mapper);
		if (this.dims != null) {
			generator.writeKey("dims");
			generator.write(this.dims);

		}
		if (this.elementType != null) {
			generator.writeKey("element_type");
			this.elementType.serialize(generator, mapper);
		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.indexOptions != null) {
			generator.writeKey("index_options");
			this.indexOptions.serialize(generator, mapper);

		}
		if (this.similarity != null) {
			generator.writeKey("similarity");
			this.similarity.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DenseVectorProperty> {
		@Nullable
		private Integer dims;

		@Nullable
		private DenseVectorElementType elementType;

		@Nullable
		private Boolean index;

		@Nullable
		private DenseVectorIndexOptions indexOptions;

		@Nullable
		private DenseVectorSimilarity similarity;

		/**
		 * Number of vector dimensions. Can't exceed <code>4096</code>. If
		 * <code>dims</code> is not specified, it will be set to the length of the first
		 * vector added to the field.
		 * <p>
		 * API name: {@code dims}
		 */
		public final Builder dims(@Nullable Integer value) {
			this.dims = value;
			return this;
		}

		/**
		 * The data type used to encode vectors. The supported data types are
		 * <code>float</code> (default), <code>byte</code>, and <code>bit</code>.
		 * <p>
		 * API name: {@code element_type}
		 */
		public final Builder elementType(@Nullable DenseVectorElementType value) {
			this.elementType = value;
			return this;
		}

		/**
		 * If <code>true</code>, you can search this field using the kNN search API.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Boolean value) {
			this.index = value;
			return this;
		}

		/**
		 * An optional section that configures the kNN indexing algorithm. The HNSW
		 * algorithm has two internal parameters that influence how the data structure
		 * is built. These can be adjusted to improve the accuracy of results, at the
		 * expense of slower indexing speed.
		 * <p>
		 * This parameter can only be specified when <code>index</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code index_options}
		 */
		public final Builder indexOptions(@Nullable DenseVectorIndexOptions value) {
			this.indexOptions = value;
			return this;
		}

		/**
		 * An optional section that configures the kNN indexing algorithm. The HNSW
		 * algorithm has two internal parameters that influence how the data structure
		 * is built. These can be adjusted to improve the accuracy of results, at the
		 * expense of slower indexing speed.
		 * <p>
		 * This parameter can only be specified when <code>index</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code index_options}
		 */
		public final Builder indexOptions(
				Function<DenseVectorIndexOptions.Builder, ObjectBuilder<DenseVectorIndexOptions>> fn) {
			return this.indexOptions(fn.apply(new DenseVectorIndexOptions.Builder()).build());
		}

		/**
		 * The vector similarity metric to use in kNN search.
		 * <p>
		 * Documents are ranked by their vector field's similarity to the query vector.
		 * The <code>_score</code> of each document will be derived from the similarity,
		 * in a way that ensures scores are positive and that a larger score corresponds
		 * to a higher ranking.
		 * <p>
		 * Defaults to <code>l2_norm</code> when <code>element_type</code> is
		 * <code>bit</code> otherwise defaults to <code>cosine</code>.
		 * <p>
		 * <code>bit</code> vectors only support <code>l2_norm</code> as their
		 * similarity metric.
		 * <p>
		 * This parameter can only be specified when <code>index</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable DenseVectorSimilarity value) {
			this.similarity = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorProperty build() {
			_checkSingleUse();

			return new DenseVectorProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorProperty}
	 */
	public static final JsonpDeserializer<DenseVectorProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DenseVectorProperty::setupDenseVectorPropertyDeserializer);

	protected static void setupDenseVectorPropertyDeserializer(ObjectDeserializer<DenseVectorProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::dims, JsonpDeserializer.integerDeserializer(), "dims");
		op.add(Builder::elementType, DenseVectorElementType._DESERIALIZER, "element_type");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::indexOptions, DenseVectorIndexOptions._DESERIALIZER, "index_options");
		op.add(Builder::similarity, DenseVectorSimilarity._DESERIALIZER, "similarity");

		op.ignore("type");
	}

}
