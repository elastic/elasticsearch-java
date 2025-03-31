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
import java.lang.Float;
import java.lang.String;
import java.util.Map;
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

// typedef: inference._types.SparseEmbeddingResult

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.SparseEmbeddingResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class SparseEmbeddingResult implements JsonpSerializable {
	private final Map<String, Float> embedding;

	// ---------------------------------------------------------------------------------------------

	private SparseEmbeddingResult(Builder builder) {

		this.embedding = ApiTypeHelper.unmodifiableRequired(builder.embedding, this, "embedding");

	}

	public static SparseEmbeddingResult of(Function<Builder, ObjectBuilder<SparseEmbeddingResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code embedding}
	 */
	public final Map<String, Float> embedding() {
		return this.embedding;
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

		if (ApiTypeHelper.isDefined(this.embedding)) {
			generator.writeKey("embedding");
			generator.writeStartObject();
			for (Map.Entry<String, Float> item0 : this.embedding.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link SparseEmbeddingResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SparseEmbeddingResult> {
		private Map<String, Float> embedding;

		/**
		 * Required - API name: {@code embedding}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>embedding</code>.
		 */
		public final Builder embedding(Map<String, Float> map) {
			this.embedding = _mapPutAll(this.embedding, map);
			return this;
		}

		/**
		 * Required - API name: {@code embedding}
		 * <p>
		 * Adds an entry to <code>embedding</code>.
		 */
		public final Builder embedding(String key, Float value) {
			this.embedding = _mapPut(this.embedding, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SparseEmbeddingResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SparseEmbeddingResult build() {
			_checkSingleUse();

			return new SparseEmbeddingResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SparseEmbeddingResult}
	 */
	public static final JsonpDeserializer<SparseEmbeddingResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SparseEmbeddingResult::setupSparseEmbeddingResultDeserializer);

	protected static void setupSparseEmbeddingResultDeserializer(ObjectDeserializer<SparseEmbeddingResult.Builder> op) {

		op.add(Builder::embedding, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.floatDeserializer()),
				"embedding");

	}

}
