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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.search.ResponseBody;
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

// typedef: _global.scroll.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.scroll.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScrollResponse<TDocument> extends ResponseBody<TDocument> {
	// ---------------------------------------------------------------------------------------------

	private ScrollResponse(Builder<TDocument> builder) {
		super(builder);

	}

	public static <TDocument> ScrollResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<ScrollResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScrollResponse}.
	 */

	public static class Builder<TDocument> extends ResponseBody.AbstractBuilder<TDocument, Builder<TDocument>>
			implements
				ObjectBuilder<ScrollResponse<TDocument>> {
		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link ScrollResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScrollResponse<TDocument> build() {
			_checkSingleUse();

			return new ScrollResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for ScrollResponse
	 */
	public static <TDocument> JsonpDeserializer<ScrollResponse<TDocument>> createScrollResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> ScrollResponse.setupScrollResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link ScrollResponse} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<ScrollResponse<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createScrollResponseDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.scroll.TDocument")));

	protected static <TDocument> void setupScrollResponseDeserializer(
			ObjectDeserializer<ScrollResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		ResponseBody.setupResponseBodyDeserializer(op, tDocumentDeserializer);

	}

}
