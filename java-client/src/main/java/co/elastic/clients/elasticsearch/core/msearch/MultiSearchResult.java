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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch.MultiSearchResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.msearch.MultiSearchResult">API
 *      specification</a>
 */

public abstract class MultiSearchResult<TDocument> implements JsonpSerializable {
	private final long took;

	private final List<MultiSearchResponseItem<TDocument>> responses;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected MultiSearchResult(AbstractBuilder<TDocument, ?> builder) {

		this.took = ApiTypeHelper.requireNonNull(builder.took, this, "took");
		this.responses = ApiTypeHelper.unmodifiableRequired(builder.responses, this, "responses");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code responses}
	 */
	public final List<MultiSearchResponseItem<TDocument>> responses() {
		return this.responses;
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

		generator.writeKey("took");
		generator.write(this.took);

		if (ApiTypeHelper.isDefined(this.responses)) {
			generator.writeKey("responses");
			generator.writeStartArray();
			for (MultiSearchResponseItem<TDocument> item0 : this.responses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private Long took;

		private List<MultiSearchResponseItem<TDocument>> responses;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code took}
		 */
		public final BuilderT took(long value) {
			this.took = value;
			return self();
		}

		/**
		 * Required - API name: {@code responses}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>responses</code>.
		 */
		public final BuilderT responses(List<MultiSearchResponseItem<TDocument>> list) {
			this.responses = _listAddAll(this.responses, list);
			return self();
		}

		/**
		 * Required - API name: {@code responses}
		 * <p>
		 * Adds one or more values to <code>responses</code>.
		 */
		public final BuilderT responses(MultiSearchResponseItem<TDocument> value,
				MultiSearchResponseItem<TDocument>... values) {
			this.responses = _listAdd(this.responses, value, values);
			return self();
		}

		/**
		 * Required - API name: {@code responses}
		 * <p>
		 * Adds a value to <code>responses</code> using a builder lambda.
		 */
		public final BuilderT responses(
				Function<MultiSearchResponseItem.Builder<TDocument>, ObjectBuilder<MultiSearchResponseItem<TDocument>>> fn) {
			return responses(fn.apply(new MultiSearchResponseItem.Builder<TDocument>()).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> void setupMultiSearchResultDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(AbstractBuilder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(AbstractBuilder::responses,
				JsonpDeserializer.arrayDeserializer(
						MultiSearchResponseItem.createMultiSearchResponseItemDeserializer(tDocumentDeserializer)),
				"responses");

	}

}
