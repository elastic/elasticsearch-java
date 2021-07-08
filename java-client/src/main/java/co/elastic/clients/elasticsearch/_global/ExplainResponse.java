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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.elasticsearch._global.explain.ExplanationDetail;
import co.elastic.clients.elasticsearch._types.InlineGet;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.explain.Response
public final class ExplainResponse<TDocument> implements ToJsonp {
	private final String _index;

	@Nullable
	private final String _type;

	private final String _id;

	private final Boolean matched;

	@Nullable
	private final ExplanationDetail explanation;

	@Nullable
	private final InlineGet<TDocument> get;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected ExplainResponse(Builder<TDocument> builder) {

		this._index = Objects.requireNonNull(builder._index, "_index");
		this._type = builder._type;
		this._id = Objects.requireNonNull(builder._id, "_id");
		this.matched = Objects.requireNonNull(builder.matched, "matched");
		this.explanation = builder.explanation;
		this.get = builder.get;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code matched}
	 */
	public Boolean matched() {
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("_index");
		generator.write(this._index);

		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("matched");
		generator.write(this.matched);

		if (this.explanation != null) {

			generator.writeKey("explanation");
			this.explanation.toJsonp(generator, mapper);

		}
		if (this.get != null) {

			generator.writeKey("get");
			this.get.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<ExplainResponse<TDocument>> {
		private String _index;

		@Nullable
		private String _type;

		private String _id;

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
		public Builder<TDocument> _index(String value) {
			this._index = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder<TDocument> _type(@Nullable String value) {
			this._type = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder<TDocument> _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code matched}
		 */
		public Builder<TDocument> matched(Boolean value) {
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
		 *
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

		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::_type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::matched, JsonpDeserializer.booleanDeserializer(), "matched");
		op.add(Builder::explanation, ExplanationDetail.DESERIALIZER, "explanation");
		op.add(Builder::get, InlineGet.createInlineGetDeserializer(tDocumentDeserializer), "get");

	}

}
