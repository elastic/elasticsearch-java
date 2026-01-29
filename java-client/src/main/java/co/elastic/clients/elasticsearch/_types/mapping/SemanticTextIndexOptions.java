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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _types.mapping.SemanticTextIndexOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.SemanticTextIndexOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class SemanticTextIndexOptions implements JsonpSerializable {
	@Nullable
	private final DenseVectorIndexOptions denseVector;

	@Nullable
	private final SparseVectorIndexOptions sparseVector;

	// ---------------------------------------------------------------------------------------------

	private SemanticTextIndexOptions(Builder builder) {

		this.denseVector = builder.denseVector;
		this.sparseVector = builder.sparseVector;

	}

	public static SemanticTextIndexOptions of(Function<Builder, ObjectBuilder<SemanticTextIndexOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code dense_vector}
	 */
	@Nullable
	public final DenseVectorIndexOptions denseVector() {
		return this.denseVector;
	}

	/**
	 * API name: {@code sparse_vector}
	 */
	@Nullable
	public final SparseVectorIndexOptions sparseVector() {
		return this.sparseVector;
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

		if (this.denseVector != null) {
			generator.writeKey("dense_vector");
			this.denseVector.serialize(generator, mapper);

		}
		if (this.sparseVector != null) {
			generator.writeKey("sparse_vector");
			this.sparseVector.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SemanticTextIndexOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SemanticTextIndexOptions> {
		@Nullable
		private DenseVectorIndexOptions denseVector;

		@Nullable
		private SparseVectorIndexOptions sparseVector;

		public Builder() {
		}
		private Builder(SemanticTextIndexOptions instance) {
			this.denseVector = instance.denseVector;
			this.sparseVector = instance.sparseVector;

		}
		/**
		 * API name: {@code dense_vector}
		 */
		public final Builder denseVector(@Nullable DenseVectorIndexOptions value) {
			this.denseVector = value;
			return this;
		}

		/**
		 * API name: {@code dense_vector}
		 */
		public final Builder denseVector(
				Function<DenseVectorIndexOptions.Builder, ObjectBuilder<DenseVectorIndexOptions>> fn) {
			return this.denseVector(fn.apply(new DenseVectorIndexOptions.Builder()).build());
		}

		/**
		 * API name: {@code sparse_vector}
		 */
		public final Builder sparseVector(@Nullable SparseVectorIndexOptions value) {
			this.sparseVector = value;
			return this;
		}

		/**
		 * API name: {@code sparse_vector}
		 */
		public final Builder sparseVector(
				Function<SparseVectorIndexOptions.Builder, ObjectBuilder<SparseVectorIndexOptions>> fn) {
			return this.sparseVector(fn.apply(new SparseVectorIndexOptions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SemanticTextIndexOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SemanticTextIndexOptions build() {
			_checkSingleUse();

			return new SemanticTextIndexOptions(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SemanticTextIndexOptions}
	 */
	public static final JsonpDeserializer<SemanticTextIndexOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SemanticTextIndexOptions::setupSemanticTextIndexOptionsDeserializer);

	protected static void setupSemanticTextIndexOptionsDeserializer(
			ObjectDeserializer<SemanticTextIndexOptions.Builder> op) {

		op.add(Builder::denseVector, DenseVectorIndexOptions._DESERIALIZER, "dense_vector");
		op.add(Builder::sparseVector, SparseVectorIndexOptions._DESERIALIZER, "sparse_vector");

	}

}
