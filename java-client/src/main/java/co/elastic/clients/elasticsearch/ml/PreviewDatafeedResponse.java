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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
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

// typedef: ml.preview_datafeed.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.preview_datafeed.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PreviewDatafeedResponse<TDocument> implements JsonpSerializable {
	private final List<TDocument> documents;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private PreviewDatafeedResponse(Builder<TDocument> builder) {

		this.documents = ApiTypeHelper.unmodifiableRequired(builder.documents, this, "documents");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> PreviewDatafeedResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<PreviewDatafeedResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<TDocument> documents() {
		return this.documents;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (TDocument item0 : this.documents) {
			JsonpUtils.serialize(item0, generator, tDocumentSerializer, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewDatafeedResponse}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<PreviewDatafeedResponse<TDocument>> {
		private List<TDocument> documents;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>documents</code>.
		 */
		public final Builder<TDocument> documents(List<TDocument> list) {
			this.documents = _listAddAll(this.documents, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>documents</code>.
		 */
		public final Builder<TDocument> documents(TDocument value, TDocument... values) {
			this.documents = _listAdd(this.documents, value, values);
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		@Override
		public Builder<TDocument> withJson(JsonParser parser, JsonpMapper mapper) {
			JsonpDeserializer<JsonData> tDocumentDeserializer = JsonData._DESERIALIZER;

			@SuppressWarnings("unchecked")
			List<TDocument> value = (List<TDocument>) JsonpDeserializer.arrayDeserializer(tDocumentDeserializer)
					.deserialize(parser, mapper);
			return this.documents(value);
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link PreviewDatafeedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewDatafeedResponse<TDocument> build() {
			_checkSingleUse();

			return new PreviewDatafeedResponse<TDocument>(this);
		}
	}

	/**
	 * Json deserializer for {@link PreviewDatafeedResponse} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<PreviewDatafeedResponse<Object>> _DESERIALIZER = createPreviewDatafeedResponseDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:ml.preview_datafeed.Response.TDocument"));

	public static <TDocument> JsonpDeserializer<PreviewDatafeedResponse<TDocument>> createPreviewDatafeedResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		JsonpDeserializer<List<TDocument>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(tDocumentDeserializer);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper, event) -> new Builder<TDocument>()
						.documents(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
