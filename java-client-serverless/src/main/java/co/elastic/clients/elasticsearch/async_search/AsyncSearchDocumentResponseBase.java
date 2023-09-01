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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: async_search._types.AsyncSearchDocumentResponseBase

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#async_search._types.AsyncSearchDocumentResponseBase">API
 *      specification</a>
 */

public abstract class AsyncSearchDocumentResponseBase<TDocument> extends AsyncSearchResponseBase {
	private final AsyncSearch<TDocument> response;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected AsyncSearchDocumentResponseBase(AbstractBuilder<TDocument, ?> builder) {
		super(builder);

		this.response = ApiTypeHelper.requireNonNull(builder.response, this, "response");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * Required - API name: {@code response}
	 */
	public final AsyncSearch<TDocument> response() {
		return this.response;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("response");
		this.response.serialize(generator, mapper);

	}

	public abstract static class AbstractBuilder<TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>>
			extends
				AsyncSearchResponseBase.AbstractBuilder<BuilderT> {
		private AsyncSearch<TDocument> response;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code response}
		 */
		public final BuilderT response(AsyncSearch<TDocument> value) {
			this.response = value;
			return self();
		}

		/**
		 * Required - API name: {@code response}
		 */
		public final BuilderT response(
				Function<AsyncSearch.Builder<TDocument>, ObjectBuilder<AsyncSearch<TDocument>>> fn) {
			return this.response(fn.apply(new AsyncSearch.Builder<TDocument>()).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> void setupAsyncSearchDocumentResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TDocument> tDocumentDeserializer) {
		AsyncSearchResponseBase.setupAsyncSearchResponseBaseDeserializer(op);
		op.add(AbstractBuilder::response, AsyncSearch.createAsyncSearchDeserializer(tDocumentDeserializer), "response");

	}

}
