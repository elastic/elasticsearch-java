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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: ml.preview_datafeed.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.preview_datafeed.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PreviewDatafeedResponse<TDocument> implements JsonpSerializable {
	private final List<TDocument> data;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private PreviewDatafeedResponse(Builder<TDocument> builder) {

		this.data = ApiTypeHelper.unmodifiableRequired(builder.data, this, "data");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> PreviewDatafeedResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<PreviewDatafeedResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code data}
	 */
	public final List<TDocument> data() {
		return this.data;
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

		if (ApiTypeHelper.isDefined(this.data)) {
			generator.writeKey("data");
			generator.writeStartArray();
			for (TDocument item0 : this.data) {
				JsonpUtils.serialize(item0, generator, tDocumentSerializer, mapper);

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
	 * Builder for {@link PreviewDatafeedResponse}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<PreviewDatafeedResponse<TDocument>> {
		private List<TDocument> data;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code data}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>data</code>.
		 */
		public final Builder<TDocument> data(List<TDocument> list) {
			this.data = _listAddAll(this.data, list);
			return this;
		}

		/**
		 * Required - API name: {@code data}
		 * <p>
		 * Adds one or more values to <code>data</code>.
		 */
		public final Builder<TDocument> data(TDocument value, TDocument... values) {
			this.data = _listAdd(this.data, value, values);
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for PreviewDatafeedResponse
	 */
	public static <TDocument> JsonpDeserializer<PreviewDatafeedResponse<TDocument>> createPreviewDatafeedResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> PreviewDatafeedResponse.setupPreviewDatafeedResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link PreviewDatafeedResponse} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<PreviewDatafeedResponse<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createPreviewDatafeedResponseDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:ml.preview_datafeed.TDocument")));

	protected static <TDocument> void setupPreviewDatafeedResponseDeserializer(
			ObjectDeserializer<PreviewDatafeedResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(tDocumentDeserializer), "data");

	}

}
