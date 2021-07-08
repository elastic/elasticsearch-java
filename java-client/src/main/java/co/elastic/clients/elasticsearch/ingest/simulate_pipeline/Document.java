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
	private final String _id;

	@Nullable
	private final String _index;

	private final JsonValue _source;

	// ---------------------------------------------------------------------------------------------

	protected Document(Builder builder) {

		this._id = builder._id;
		this._index = builder._index;
		this._source = Objects.requireNonNull(builder._source, "_source");

	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code _source}
	 */
	public JsonValue _source() {
		return this._source;
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

		if (this._id != null) {

			generator.writeKey("_id");
			generator.write(this._id);

		}
		if (this._index != null) {

			generator.writeKey("_index");
			generator.write(this._index);

		}

		generator.writeKey("_source");
		generator.write(this._source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Document}.
	 */
	public static class Builder implements ObjectBuilder<Document> {
		@Nullable
		private String _id;

		@Nullable
		private String _index;

		private JsonValue _source;

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(@Nullable String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder _index(@Nullable String value) {
			this._index = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder _source(JsonValue value) {
			this._source = value;
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

		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::_source, JsonpDeserializer.jsonValueDeserializer(), "_source");

	}

}
