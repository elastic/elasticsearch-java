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

package co.elastic.clients.elasticsearch.core.msearch;

import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

// typedef: _global.msearch.MultiSearchItem

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/msearch/types.ts#L71-L73">API
 *      specification</a>
 */

public class MultiSearchItem<TDocument> extends SearchResponse<TDocument> {
	private final int status;

	// ---------------------------------------------------------------------------------------------

	private MultiSearchItem(Builder<TDocument> builder) {
		super(builder);

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static <TDocument> MultiSearchItem<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<MultiSearchItem<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final int status() {
		return this.status;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("status");
		generator.write(this.status);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiSearchItem}.
	 */

	public static class Builder<TDocument> extends SearchResponse.AbstractBuilder<TDocument, Builder<TDocument>>
			implements
				ObjectBuilder<MultiSearchItem<TDocument>> {
		private Integer status;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder<TDocument> status(int value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link MultiSearchItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiSearchItem<TDocument> build() {
			_checkSingleUse();

			return new MultiSearchItem<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for MultiSearchItem
	 */
	public static <TDocument> JsonpDeserializer<MultiSearchItem<TDocument>> createMultiSearchItemDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MultiSearchItem.setupMultiSearchItemDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupMultiSearchItemDeserializer(
			ObjectDeserializer<MultiSearchItem.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		SearchResponse.setupSearchResponseDeserializer(op, tDocumentDeserializer);
		op.add(Builder::status, JsonpDeserializer.integerDeserializer(), "status");

	}

}
