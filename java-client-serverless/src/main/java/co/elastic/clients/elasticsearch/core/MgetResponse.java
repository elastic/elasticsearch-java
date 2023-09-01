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

import co.elastic.clients.elasticsearch.core.mget.MultiGetResponseItem;
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

// typedef: _global.mget.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.mget.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class MgetResponse<TDocument> implements JsonpSerializable {
	private final List<MultiGetResponseItem<TDocument>> docs;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private MgetResponse(Builder<TDocument> builder) {

		this.docs = ApiTypeHelper.unmodifiableRequired(builder.docs, this, "docs");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> MgetResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<MgetResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code docs}
	 */
	public final List<MultiGetResponseItem<TDocument>> docs() {
		return this.docs;
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

		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (MultiGetResponseItem<TDocument> item0 : this.docs) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link MgetResponse}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<MgetResponse<TDocument>> {
		private List<MultiGetResponseItem<TDocument>> docs;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder<TDocument> docs(List<MultiGetResponseItem<TDocument>> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder<TDocument> docs(MultiGetResponseItem<TDocument> value,
				MultiGetResponseItem<TDocument>... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder<TDocument> docs(
				Function<MultiGetResponseItem.Builder<TDocument>, ObjectBuilder<MultiGetResponseItem<TDocument>>> fn) {
			return docs(fn.apply(new MultiGetResponseItem.Builder<TDocument>()).build());
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
		 * Builds a {@link MgetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MgetResponse<TDocument> build() {
			_checkSingleUse();

			return new MgetResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for MgetResponse
	 */
	public static <TDocument> JsonpDeserializer<MgetResponse<TDocument>> createMgetResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MgetResponse.setupMgetResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link MgetResponse} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<MgetResponse<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createMgetResponseDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.mget.TDocument")));

	protected static <TDocument> void setupMgetResponseDeserializer(
			ObjectDeserializer<MgetResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(
				MultiGetResponseItem.createMultiGetResponseItemDeserializer(tDocumentDeserializer)), "docs");

	}

}
