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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.PercolateQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.PercolateQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class PercolateQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final JsonData document;

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

	private PercolateQuery(Builder builder) {
		super(builder);

		this.document = builder.document;
		this.documents = ApiTypeHelper.unmodifiable(builder.documents);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.id = builder.id;
		this.index = builder.index;
		this.name = builder.name;
		this.preference = builder.preference;
		this.routing = builder.routing;
		this.version = builder.version;

	}

	public static PercolateQuery of(Function<Builder, ObjectBuilder<PercolateQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Percolate;
	}

	/**
	 * The source of the document being percolated.
	 * <p>
	 * API name: {@code document}
	 */
	@Nullable
	public final JsonData document() {
		return this.document;
	}

	/**
	 * An array of sources of the documents being percolated.
	 * <p>
	 * API name: {@code documents}
	 */
	public final List<JsonData> documents() {
		return this.documents;
	}

	/**
	 * Required - Field that holds the indexed queries. The field must use the
	 * <code>percolator</code> mapping type.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The ID of a stored document to percolate.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The index of a stored document to percolate.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * The suffix used for the <code>_percolator_document_slot</code> field when
	 * multiple <code>percolate</code> queries are specified.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * Preference used to fetch document to percolate.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * Routing used to fetch document to percolate.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * The expected version of a stored document to percolate.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.document != null) {
			generator.writeKey("document");
			this.document.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.documents)) {
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
		 * The source of the document being percolated.
		 * <p>
		 * API name: {@code document}
		 */
		public final Builder document(@Nullable JsonData value) {
			this.document = value;
			return this;
		}

		/**
		 * An array of sources of the documents being percolated.
		 * <p>
		 * API name: {@code documents}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>documents</code>.
		 */
		public final Builder documents(List<JsonData> list) {
			this.documents = _listAddAll(this.documents, list);
			return this;
		}

		/**
		 * An array of sources of the documents being percolated.
		 * <p>
		 * API name: {@code documents}
		 * <p>
		 * Adds one or more values to <code>documents</code>.
		 */
		public final Builder documents(JsonData value, JsonData... values) {
			this.documents = _listAdd(this.documents, value, values);
			return this;
		}

		/**
		 * Required - Field that holds the indexed queries. The field must use the
		 * <code>percolator</code> mapping type.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The ID of a stored document to percolate.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The index of a stored document to percolate.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * The suffix used for the <code>_percolator_document_slot</code> field when
		 * multiple <code>percolate</code> queries are specified.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Preference used to fetch document to percolate.
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Routing used to fetch document to percolate.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * The expected version of a stored document to percolate.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
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
			_checkSingleUse();

			return new PercolateQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PercolateQuery}
	 */
	public static final JsonpDeserializer<PercolateQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PercolateQuery::setupPercolateQueryDeserializer);

	protected static void setupPercolateQueryDeserializer(ObjectDeserializer<PercolateQuery.Builder> op) {
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
