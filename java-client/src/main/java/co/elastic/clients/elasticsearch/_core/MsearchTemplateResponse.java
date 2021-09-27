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
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.msearch_template.Response

public final class MsearchTemplateResponse<TDocument> implements JsonpSerializable {
	private final List<SearchResponse<TDocument>> responses;

	private final long took;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public MsearchTemplateResponse(Builder<TDocument> builder) {

		this.responses = Objects.requireNonNull(builder.responses, "responses");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code responses}
	 */
	public List<SearchResponse<TDocument>> responses() {
		return this.responses;
	}

	/**
	 * API name: {@code took}
	 */
	public long took() {
		return this.took;
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

		generator.writeKey("responses");
		generator.writeStartArray();
		for (SearchResponse<TDocument> item0 : this.responses) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("took");
		generator.write(this.took);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchTemplateResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<MsearchTemplateResponse<TDocument>> {
		private List<SearchResponse<TDocument>> responses;

		private Long took;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code responses}
		 */
		public Builder<TDocument> responses(List<SearchResponse<TDocument>> value) {
			this.responses = value;
			return this;
		}

		/**
		 * API name: {@code responses}
		 */
		public Builder<TDocument> responses(SearchResponse<TDocument>... value) {
			this.responses = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #responses(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addResponses(SearchResponse<TDocument> value) {
			if (this.responses == null) {
				this.responses = new ArrayList<>();
			}
			this.responses.add(value);
			return this;
		}

		/**
		 * Set {@link #responses(List)} to a singleton list.
		 */
		public Builder<TDocument> responses(
				Function<SearchResponse.Builder<TDocument>, ObjectBuilder<SearchResponse<TDocument>>> fn) {
			return this.responses(fn.apply(new SearchResponse.Builder<TDocument>()).build());
		}

		/**
		 * Add a value to {@link #responses(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addResponses(
				Function<SearchResponse.Builder<TDocument>, ObjectBuilder<SearchResponse<TDocument>>> fn) {
			return this.addResponses(fn.apply(new SearchResponse.Builder<TDocument>()).build());
		}

		/**
		 * API name: {@code took}
		 */
		public Builder<TDocument> took(long value) {
			this.took = value;
			return this;
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
		 * Builds a {@link MsearchTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchTemplateResponse<TDocument> build() {

			return new MsearchTemplateResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for MsearchTemplateResponse
	 */
	public static <TDocument> JsonpDeserializer<MsearchTemplateResponse<TDocument>> createMsearchTemplateResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MsearchTemplateResponse.setupMsearchTemplateResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupMsearchTemplateResponseDeserializer(
			DelegatingDeserializer<MsearchTemplateResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::responses, JsonpDeserializer.arrayDeserializer(
				SearchResponse.createSearchResponseDeserializer(tDocumentDeserializer)), "responses");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");

	}

}
