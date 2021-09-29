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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._core.explain.ExplanationDetail;
import co.elastic.clients.elasticsearch._types.InlineGet;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.explain.Response

public final class ExplainResponse<TDocument> implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String type;

	private final String id;

	private final boolean matched;

	@Nullable
	private final ExplanationDetail explanation;

	@Nullable
	private final InlineGet<TDocument> get;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public ExplainResponse(Builder<TDocument> builder) {

		this.index = Objects.requireNonNull(builder.index, "_index");
		this.type = builder.type;
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.matched = Objects.requireNonNull(builder.matched, "matched");
		this.explanation = builder.explanation;
		this.get = builder.get;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public ExplainResponse(Function<Builder<TDocument>, Builder<TDocument>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code matched}
	 */
	public boolean matched() {
		return this.matched;
	}

	/**
	 * API name: {@code explanation}
	 */
	@Nullable
	public ExplanationDetail explanation() {
		return this.explanation;
	}

	/**
	 * API name: {@code get}
	 */
	@Nullable
	public InlineGet<TDocument> get() {
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

		if (this.type != null) {

			generator.writeKey("_type");
			generator.write(this.type);

		}

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<ExplainResponse<TDocument>> {
		private String index;

		@Nullable
		private String type;

		private String id;

		private Boolean matched;

		@Nullable
		private ExplanationDetail explanation;

		@Nullable
		private InlineGet<TDocument> get;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code _index}
		 */
		public Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder<TDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code matched}
		 */
		public Builder<TDocument> matched(boolean value) {
			this.matched = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public Builder<TDocument> explanation(@Nullable ExplanationDetail value) {
			this.explanation = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public Builder<TDocument> explanation(
				Function<ExplanationDetail.Builder, ObjectBuilder<ExplanationDetail>> fn) {
			return this.explanation(fn.apply(new ExplanationDetail.Builder()).build());
		}

		/**
		 * API name: {@code get}
		 */
		public Builder<TDocument> get(@Nullable InlineGet<TDocument> value) {
			this.get = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public Builder<TDocument> get(Function<InlineGet.Builder<TDocument>, ObjectBuilder<InlineGet<TDocument>>> fn) {
			return this.get(fn.apply(new InlineGet.Builder<TDocument>()).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link ExplainResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainResponse<TDocument> build() {

			return new ExplainResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for ExplainResponse
	 */
	public static <TDocument> JsonpDeserializer<ExplainResponse<TDocument>> createExplainResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> ExplainResponse.setupExplainResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupExplainResponseDeserializer(
			DelegatingDeserializer<ExplainResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::matched, JsonpDeserializer.booleanDeserializer(), "matched");
		op.add(Builder::explanation, ExplanationDetail._DESERIALIZER, "explanation");
		op.add(Builder::get, InlineGet.createInlineGetDeserializer(tDocumentDeserializer), "get");

	}

}
