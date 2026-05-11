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

package co.elastic.clients.elasticsearch.inference;

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
import java.util.List;
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

// typedef: inference._types.SparseEmbeddingInferenceResult

/**
 * The response format for the sparse embedding request.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.SparseEmbeddingInferenceResult">API
 *      specification</a>
 */

public abstract class SparseEmbeddingInferenceResult implements JsonpSerializable {
	private final List<SparseEmbeddingResult> sparseEmbedding;

	// ---------------------------------------------------------------------------------------------

	protected SparseEmbeddingInferenceResult(AbstractBuilder<?> builder) {

		this.sparseEmbedding = ApiTypeHelper.unmodifiableRequired(builder.sparseEmbedding, this, "sparseEmbedding");

	}

	/**
	 * Required - API name: {@code sparse_embedding}
	 */
	public final List<SparseEmbeddingResult> sparseEmbedding() {
		return this.sparseEmbedding;
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

		if (ApiTypeHelper.isDefined(this.sparseEmbedding)) {
			generator.writeKey("sparse_embedding");
			generator.writeStartArray();
			for (SparseEmbeddingResult item0 : this.sparseEmbedding) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private List<SparseEmbeddingResult> sparseEmbedding;

		/**
		 * Required - API name: {@code sparse_embedding}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sparseEmbedding</code>.
		 */
		public final BuilderT sparseEmbedding(List<SparseEmbeddingResult> list) {
			this.sparseEmbedding = _listAddAll(this.sparseEmbedding, list);
			return self();
		}

		/**
		 * Required - API name: {@code sparse_embedding}
		 * <p>
		 * Adds one or more values to <code>sparseEmbedding</code>.
		 */
		public final BuilderT sparseEmbedding(SparseEmbeddingResult value, SparseEmbeddingResult... values) {
			this.sparseEmbedding = _listAdd(this.sparseEmbedding, value, values);
			return self();
		}

		/**
		 * Required - API name: {@code sparse_embedding}
		 * <p>
		 * Adds a value to <code>sparseEmbedding</code> using a builder lambda.
		 */
		public final BuilderT sparseEmbedding(
				Function<SparseEmbeddingResult.Builder, ObjectBuilder<SparseEmbeddingResult>> fn) {
			return sparseEmbedding(fn.apply(new SparseEmbeddingResult.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSparseEmbeddingInferenceResultDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::sparseEmbedding,
				JsonpDeserializer.arrayDeserializer(SparseEmbeddingResult._DESERIALIZER), "sparse_embedding");

	}

}
