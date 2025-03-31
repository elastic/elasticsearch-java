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

// typedef: inference._types.TextEmbeddingResult

/**
 * The text embedding result object
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.TextEmbeddingResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class TextEmbeddingResult implements JsonpSerializable {
	private final List<Float> embedding;

	// ---------------------------------------------------------------------------------------------

	private TextEmbeddingResult(Builder builder) {

		this.embedding = ApiTypeHelper.unmodifiableRequired(builder.embedding, this, "embedding");

	}

	public static TextEmbeddingResult of(Function<Builder, ObjectBuilder<TextEmbeddingResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code embedding}
	 */
	public final List<Float> embedding() {
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
			generator.writeStartArray();
			for (Float item0 : this.embedding) {
				generator.write(item0);

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
	 * Builder for {@link TextEmbeddingResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TextEmbeddingResult> {
		private List<Float> embedding;

		/**
		 * Required - API name: {@code embedding}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>embedding</code>.
		 */
		public final Builder embedding(List<Float> list) {
			this.embedding = _listAddAll(this.embedding, list);
			return this;
		}

		/**
		 * Required - API name: {@code embedding}
		 * <p>
		 * Adds one or more values to <code>embedding</code>.
		 */
		public final Builder embedding(Float value, Float... values) {
			this.embedding = _listAdd(this.embedding, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TextEmbeddingResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TextEmbeddingResult build() {
			_checkSingleUse();

			return new TextEmbeddingResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TextEmbeddingResult}
	 */
	public static final JsonpDeserializer<TextEmbeddingResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TextEmbeddingResult::setupTextEmbeddingResultDeserializer);

	protected static void setupTextEmbeddingResultDeserializer(ObjectDeserializer<TextEmbeddingResult.Builder> op) {

		op.add(Builder::embedding, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.floatDeserializer()),
				"embedding");

	}

}
