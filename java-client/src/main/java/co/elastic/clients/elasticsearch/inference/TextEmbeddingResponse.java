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
import jakarta.json.stream.JsonParser;
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

// typedef: inference.text_embedding.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.text_embedding.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class TextEmbeddingResponse implements JsonpSerializable {
	private final TextEmbeddingInferenceResult valueBody;

	// ---------------------------------------------------------------------------------------------

	private TextEmbeddingResponse(Builder builder) {

		this.valueBody = ApiTypeHelper.requireNonNull(builder.valueBody, this, "valueBody");

	}

	public static TextEmbeddingResponse of(Function<Builder, ObjectBuilder<TextEmbeddingResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final TextEmbeddingInferenceResult valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.valueBody.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TextEmbeddingResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TextEmbeddingResponse> {
		private TextEmbeddingInferenceResult valueBody;

		/**
		 * Required - Response value.
		 */
		public final Builder valueBody(TextEmbeddingInferenceResult value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Required - Response value.
		 */
		public final Builder valueBody(
				Function<TextEmbeddingInferenceResult.Builder, ObjectBuilder<TextEmbeddingInferenceResult>> fn) {
			return this.valueBody(fn.apply(new TextEmbeddingInferenceResult.Builder()).build());
		}

		/**
		 * Required - Response value.
		 */
		public final Builder valueBody(TextEmbeddingInferenceResultVariant value) {
			this.valueBody = value._toTextEmbeddingInferenceResult();
			return this;
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			TextEmbeddingInferenceResult value = (TextEmbeddingInferenceResult) TextEmbeddingInferenceResult._DESERIALIZER
					.deserialize(parser, mapper);
			return this.valueBody(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TextEmbeddingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TextEmbeddingResponse build() {
			_checkSingleUse();

			return new TextEmbeddingResponse(this);
		}
	}

	public static final JsonpDeserializer<TextEmbeddingResponse> _DESERIALIZER = createTextEmbeddingResponseDeserializer();
	protected static JsonpDeserializer<TextEmbeddingResponse> createTextEmbeddingResponseDeserializer() {

		JsonpDeserializer<TextEmbeddingInferenceResult> valueDeserializer = TextEmbeddingInferenceResult._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
