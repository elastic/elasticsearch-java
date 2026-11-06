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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: inference.document_extraction.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.document_extraction.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocumentExtractionResponse extends DocumentExtractionInferenceResult {
	// ---------------------------------------------------------------------------------------------

	private DocumentExtractionResponse(Builder builder) {
		super(builder);

	}

	public static DocumentExtractionResponse of(Function<Builder, ObjectBuilder<DocumentExtractionResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocumentExtractionResponse}.
	 */

	public static class Builder extends DocumentExtractionInferenceResult.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DocumentExtractionResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DocumentExtractionResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocumentExtractionResponse build() {
			_checkSingleUse();

			return new DocumentExtractionResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DocumentExtractionResponse}
	 */
	public static final JsonpDeserializer<DocumentExtractionResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DocumentExtractionResponse::setupDocumentExtractionResponseDeserializer);

	protected static void setupDocumentExtractionResponseDeserializer(
			ObjectDeserializer<DocumentExtractionResponse.Builder> op) {
		DocumentExtractionInferenceResult.setupDocumentExtractionInferenceResultDeserializer(op);

	}

}
