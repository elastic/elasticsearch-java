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

import co.elastic.clients.elasticsearch._types.InlineGet;
import co.elastic.clients.elasticsearch._types.WriteResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.update.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.update.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateResponse<TDocument> extends WriteResponseBase {
	@Nullable
	private final InlineGet<TDocument> get;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private UpdateResponse(Builder<TDocument> builder) {
		super(builder);

		this.get = builder.get;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> UpdateResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<UpdateResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * API name: {@code get}
	 */
	@Nullable
	public final InlineGet<TDocument> get() {
		return this.get;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.get != null) {
			generator.writeKey("get");
			this.get.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateResponse}.
	 */

	public static class Builder<TDocument> extends WriteResponseBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<UpdateResponse<TDocument>> {
		@Nullable
		private InlineGet<TDocument> get;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code get}
		 */
		public final Builder<TDocument> get(@Nullable InlineGet<TDocument> value) {
			this.get = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public final Builder<TDocument> get(
				Function<InlineGet.Builder<TDocument>, ObjectBuilder<InlineGet<TDocument>>> fn) {
			return this.get(fn.apply(new InlineGet.Builder<TDocument>()).build());
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
		 * Builds a {@link UpdateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateResponse<TDocument> build() {
			_checkSingleUse();

			return new UpdateResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for UpdateResponse
	 */
	public static <TDocument> JsonpDeserializer<UpdateResponse<TDocument>> createUpdateResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> UpdateResponse.setupUpdateResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link UpdateResponse} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<UpdateResponse<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createUpdateResponseDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.update.TDocument")));

	protected static <TDocument> void setupUpdateResponseDeserializer(
			ObjectDeserializer<UpdateResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		WriteResponseBase.setupWriteResponseBaseDeserializer(op);
		op.add(Builder::get, InlineGet.createInlineGetDeserializer(tDocumentDeserializer), "get");

	}

}
