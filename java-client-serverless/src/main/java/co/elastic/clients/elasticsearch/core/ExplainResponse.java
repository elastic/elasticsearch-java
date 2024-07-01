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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.InlineGet;
import co.elastic.clients.elasticsearch.core.explain.ExplanationDetail;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
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

// typedef: _global.explain.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.explain.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExplainResponse<TDocument> implements JsonpSerializable {
	private final String index;

	private final String id;

	private final boolean matched;

	@Nullable
	private final ExplanationDetail explanation;

	@Nullable
	private final InlineGet<TDocument> get;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private ExplainResponse(Builder<TDocument> builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.matched = ApiTypeHelper.requireNonNull(builder.matched, this, "matched");
		this.explanation = builder.explanation;
		this.get = builder.get;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> ExplainResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<ExplainResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code matched}
	 */
	public final boolean matched() {
		return this.matched;
	}

	/**
	 * API name: {@code explanation}
	 */
	@Nullable
	public final ExplanationDetail explanation() {
		return this.explanation;
	}

	/**
	 * API name: {@code get}
	 */
	@Nullable
	public final InlineGet<TDocument> get() {
		return this.get;
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

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("matched");
		generator.write(this.matched);

		if (this.explanation != null) {
			generator.writeKey("explanation");
			this.explanation.serialize(generator, mapper);

		}
		if (this.get != null) {
			generator.writeKey("get");
			this.get.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainResponse}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<ExplainResponse<TDocument>> {
		private String index;

		private String id;

		private Boolean matched;

		@Nullable
		private ExplanationDetail explanation;

		@Nullable
		private InlineGet<TDocument> get;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code matched}
		 */
		public final Builder<TDocument> matched(boolean value) {
			this.matched = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public final Builder<TDocument> explanation(@Nullable ExplanationDetail value) {
			this.explanation = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public final Builder<TDocument> explanation(
				Function<ExplanationDetail.Builder, ObjectBuilder<ExplanationDetail>> fn) {
			return this.explanation(fn.apply(new ExplanationDetail.Builder()).build());
		}

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
		 * Builds a {@link ExplainResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainResponse<TDocument> build() {
			_checkSingleUse();

			return new ExplainResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for ExplainResponse
	 */
	public static <TDocument> JsonpDeserializer<ExplainResponse<TDocument>> createExplainResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> ExplainResponse.setupExplainResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link ExplainResponse} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<ExplainResponse<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createExplainResponseDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.explain.Response.TDocument")));

	protected static <TDocument> void setupExplainResponseDeserializer(
			ObjectDeserializer<ExplainResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::matched, JsonpDeserializer.booleanDeserializer(), "matched");
		op.add(Builder::explanation, ExplanationDetail._DESERIALIZER, "explanation");
		op.add(Builder::get, InlineGet.createInlineGetDeserializer(tDocumentDeserializer), "get");

	}

}
