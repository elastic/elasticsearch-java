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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher._types.Index
public final class Index implements ToJsonp {
	private final String index;

	@Nullable
	private final String docId;

	@Nullable
	private final JsonValue refresh;

	// ---------------------------------------------------------------------------------------------

	protected Index(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.docId = builder.docId;
		this.refresh = builder.refresh;

	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code doc_id}
	 */
	@Nullable
	public String docId() {
		return this.docId;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
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

		generator.writeKey("index");
		generator.write(this.index);

		if (this.docId != null) {

			generator.writeKey("doc_id");
			generator.write(this.docId);

		}
		if (this.refresh != null) {

			generator.writeKey("refresh");
			generator.write(this.refresh);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Index}.
	 */
	public static class Builder implements ObjectBuilder<Index> {
		private String index;

		@Nullable
		private String docId;

		@Nullable
		private JsonValue refresh;

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code doc_id}
		 */
		public Builder docId(@Nullable String value) {
			this.docId = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Builds a {@link Index}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Index build() {

			return new Index(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Index
	 */
	public static final JsonpDeserializer<Index> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Index::setupIndexDeserializer);

	protected static void setupIndexDeserializer(DelegatingDeserializer<Index.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::docId, JsonpDeserializer.stringDeserializer(), "doc_id");
		op.add(Builder::refresh, JsonpDeserializer.jsonValueDeserializer(), "refresh");

	}

}
