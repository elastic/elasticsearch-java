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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

// typedef: async_search.submit.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#async_search.submit.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SubmitResponse<TDocument> extends AsyncSearchDocumentResponseBase<TDocument> {
	// ---------------------------------------------------------------------------------------------

	private SubmitResponse(Builder<TDocument> builder) {
		super(builder);

	}

	public static <TDocument> SubmitResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<SubmitResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SubmitResponse}.
	 */

	public static class Builder<TDocument>
			extends
				AsyncSearchDocumentResponseBase.AbstractBuilder<TDocument, Builder<TDocument>>
			implements
				ObjectBuilder<SubmitResponse<TDocument>> {
		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link SubmitResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SubmitResponse<TDocument> build() {
			_checkSingleUse();

			return new SubmitResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for SubmitResponse
	 */
	public static <TDocument> JsonpDeserializer<SubmitResponse<TDocument>> createSubmitResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> SubmitResponse.setupSubmitResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link SubmitResponse} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<SubmitResponse<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createSubmitResponseDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:async_search.submit.TDocument")));

	protected static <TDocument> void setupSubmitResponseDeserializer(
			ObjectDeserializer<SubmitResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		AsyncSearchDocumentResponseBase.setupAsyncSearchDocumentResponseBaseDeserializer(op, tDocumentDeserializer);

	}

}
