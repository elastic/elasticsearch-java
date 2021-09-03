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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.msearch.Response
public final class MsearchResponse<TDocument> implements ToJsonp {
	private final Number took;

	private final List<JsonValue> responses;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected MsearchResponse(Builder<TDocument> builder) {

		this.took = Objects.requireNonNull(builder.took, "took");
		this.responses = Objects.requireNonNull(builder.responses, "responses");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code took}
	 */
	public Number took() {
		return this.took;
	}

	/**
	 * API name: {@code responses}
	 */
	public List<JsonValue> responses() {
		return this.responses;
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

		generator.writeKey("took");
		generator.write(this.took.doubleValue());

		generator.writeKey("responses");
		generator.writeStartArray();
		for (JsonValue item0 : this.responses) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<MsearchResponse<TDocument>> {
		private Number took;

		private List<JsonValue> responses;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code took}
		 */
		public Builder<TDocument> took(Number value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code responses}
		 */
		public Builder<TDocument> responses(List<JsonValue> value) {
			this.responses = value;
			return this;
		}

		/**
		 * API name: {@code responses}
		 */
		public Builder<TDocument> responses(JsonValue... value) {
			this.responses = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #responses(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addResponses(JsonValue value) {
			if (this.responses == null) {
				this.responses = new ArrayList<>();
			}
			this.responses.add(value);
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
		 * Builds a {@link MsearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchResponse<TDocument> build() {

			return new MsearchResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for MsearchResponse
	 */
	public static <TDocument> JsonpDeserializer<MsearchResponse<TDocument>> createMsearchResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MsearchResponse.setupMsearchResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupMsearchResponseDeserializer(
			DelegatingDeserializer<MsearchResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::took, JsonpDeserializer.numberDeserializer(), "took");
		op.add(Builder::responses, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"responses");

	}

}
