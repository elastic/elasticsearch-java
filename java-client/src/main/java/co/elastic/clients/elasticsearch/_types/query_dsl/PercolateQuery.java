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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.PercolateQuery
@JsonpDeserializable
public final class PercolateQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final JsonData document;

	@Nullable
	private final List<JsonData> documents;

	private final String field;

	@Nullable
	private final String id;

	@Nullable
	private final String index;

	@Nullable
	private final String name;

	@Nullable
	private final String preference;

	@Nullable
	private final String routing;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	public PercolateQuery(Builder builder) {
		super(builder);

		this.document = builder.document;
		this.documents = ModelTypeHelper.unmodifiable(builder.documents);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.id = builder.id;
		this.index = builder.index;
		this.name = builder.name;
		this.preference = builder.preference;
		this.routing = builder.routing;
		this.version = builder.version;

	}

	public PercolateQuery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "percolate";
	}

	/**
	 * API name: {@code document}
	 */
	@Nullable
	public JsonData document() {
		return this.document;
	}

	/**
	 * API name: {@code documents}
	 */
	@Nullable
	public List<JsonData> documents() {
		return this.documents;
	}

	/**
	 * Required - API name: {@code field}
	 */
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
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
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
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.document != null) {

			generator.writeKey("document");
			this.document.serialize(generator, mapper);

		}
		if (this.documents != null) {

			generator.writeKey("documents");
			generator.writeStartArray();
			for (JsonData item0 : this.documents) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("field");
		generator.write(this.field);

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

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
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercolateQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<PercolateQuery> {
		@Nullable
		private JsonData document;

		@Nullable
		private List<JsonData> documents;

		private String field;

		@Nullable
		private String id;

		@Nullable
		private String index;

		@Nullable
		private String name;

		@Nullable
		private String preference;

		@Nullable
		private String routing;

		@Nullable
		private Long version;

		/**
		 * API name: {@code document}
		 */
		public Builder document(@Nullable JsonData value) {
			this.document = value;
			return this;
		}

		/**
		 * API name: {@code documents}
		 */
		public Builder documents(@Nullable List<JsonData> value) {
			this.documents = value;
			return this;
		}

		/**
		 * API name: {@code documents}
		 */
		public Builder documents(JsonData... value) {
			this.documents = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #documents(List)}, creating the list if needed.
		 */
		public Builder addDocuments(JsonData value) {
			if (this.documents == null) {
				this.documents = new ArrayList<>();
			}
			this.documents.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public Builder field(String value) {
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
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
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
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
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
	 * Json deserializer for {@link PercolateQuery}
	 */
	public static final JsonpDeserializer<PercolateQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PercolateQuery::setupPercolateQueryDeserializer, Builder::build);

	protected static void setupPercolateQueryDeserializer(DelegatingDeserializer<PercolateQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::document, JsonData._DESERIALIZER, "document");
		op.add(Builder::documents, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "documents");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::preference, JsonpDeserializer.stringDeserializer(), "preference");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
