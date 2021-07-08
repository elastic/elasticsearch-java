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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.PercolateQuery
public final class PercolateQuery extends QueryBase {
	@Nullable
	private final JsonValue document;

	@Nullable
	private final List<JsonValue> documents;

	@Nullable
	private final String field;

	@Nullable
	private final String id;

	@Nullable
	private final String index;

	@Nullable
	private final String preference;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final Number version;

	// ---------------------------------------------------------------------------------------------

	protected PercolateQuery(Builder builder) {
		super(builder);
		this.document = builder.document;
		this.documents = builder.documents;
		this.field = builder.field;
		this.id = builder.id;
		this.index = builder.index;
		this.preference = builder.preference;
		this.routing = builder.routing;
		this.version = builder.version;

	}

	/**
	 * API name: {@code document}
	 */
	@Nullable
	public JsonValue document() {
		return this.document;
	}

	/**
	 * API name: {@code documents}
	 */
	@Nullable
	public List<JsonValue> documents() {
		return this.documents;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.document != null) {

			generator.writeKey("document");
			generator.write(this.document);

		}
		if (this.documents != null) {

			generator.writeKey("documents");
			generator.writeStartArray();
			for (JsonValue item0 : this.documents) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.preference != null) {

			generator.writeKey("preference");
			generator.write(this.preference);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercolateQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<PercolateQuery> {
		@Nullable
		private JsonValue document;

		@Nullable
		private List<JsonValue> documents;

		@Nullable
		private String field;

		@Nullable
		private String id;

		@Nullable
		private String index;

		@Nullable
		private String preference;

		@Nullable
		private JsonValue routing;

		@Nullable
		private Number version;

		/**
		 * API name: {@code document}
		 */
		public Builder document(@Nullable JsonValue value) {
			this.document = value;
			return this;
		}

		/**
		 * API name: {@code documents}
		 */
		public Builder documents(@Nullable List<JsonValue> value) {
			this.documents = value;
			return this;
		}

		/**
		 * API name: {@code documents}
		 */
		public Builder documents(JsonValue... value) {
			this.documents = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #documents(List)}, creating the list if needed.
		 */
		public Builder addDocuments(JsonValue value) {
			if (this.documents == null) {
				this.documents = new ArrayList<>();
			}
			this.documents.add(value);
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PercolateQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PercolateQuery build() {

			return new PercolateQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PercolateQuery
	 */
	public static final JsonpDeserializer<PercolateQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PercolateQuery::setupPercolateQueryDeserializer);

	protected static void setupPercolateQueryDeserializer(DelegatingDeserializer<PercolateQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::document, JsonpDeserializer.jsonValueDeserializer(), "document");
		op.add(Builder::documents, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"documents");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::preference, JsonpDeserializer.stringDeserializer(), "preference");
		op.add(Builder::routing, JsonpDeserializer.jsonValueDeserializer(), "routing");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");

	}

}
