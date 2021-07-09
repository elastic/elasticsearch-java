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

package co.elastic.clients.elasticsearch.ingest.simulate_pipeline;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest.simulate_pipeline.Document
public final class Document implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final String index;

	private final JsonValue source;

	// ---------------------------------------------------------------------------------------------

	protected Document(Builder builder) {

		this.id = builder.id;
		this.index = builder.index;
		this.source = Objects.requireNonNull(builder.source, "_source");

	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code _source}
	 */
	public JsonValue source() {
		return this.source;
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

		if (this.id != null) {

			generator.writeKey("_id");
			generator.write(this.id);

		}
		if (this.index != null) {

			generator.writeKey("_index");
			generator.write(this.index);

		}

		generator.writeKey("_source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Document}.
	 */
	public static class Builder implements ObjectBuilder<Document> {
		@Nullable
		private String id;

		@Nullable
		private String index;

		private JsonValue source;

		/**
		 * API name: {@code _id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(JsonValue value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link Document}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Document build() {

			return new Document(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Document
	 */
	public static final JsonpDeserializer<Document> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Document::setupDocumentDeserializer);

	protected static void setupDocumentDeserializer(DelegatingDeserializer<Document.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");

	}

}
