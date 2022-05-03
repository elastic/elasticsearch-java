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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.IndicesPrivileges

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.IndicesPrivileges">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesPrivileges implements JsonpSerializable {
	private final List<FieldSecurity> fieldSecurity;

	private final List<String> names;

	private final List<IndexPrivilege> privileges;

	@Nullable
	private final Query query;

	@Nullable
	private final Boolean allowRestrictedIndices;

	// ---------------------------------------------------------------------------------------------

	private IndicesPrivileges(Builder builder) {

		this.fieldSecurity = ApiTypeHelper.unmodifiable(builder.fieldSecurity);
		this.names = ApiTypeHelper.unmodifiableRequired(builder.names, this, "names");
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");
		this.query = builder.query;
		this.allowRestrictedIndices = builder.allowRestrictedIndices;

	}

	public static IndicesPrivileges of(Function<Builder, ObjectBuilder<IndicesPrivileges>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The document fields that the owners of the role have read access to.
	 * <p>
	 * API name: {@code field_security}
	 */
	public final List<FieldSecurity> fieldSecurity() {
		return this.fieldSecurity;
	}

	/**
	 * Required - A list of indices (or index name patterns) to which the
	 * permissions in this entry apply.
	 * <p>
	 * API name: {@code names}
	 */
	public final List<String> names() {
		return this.names;
	}

	/**
	 * Required - The index level privileges that owners of the role have on the
	 * specified indices.
	 * <p>
	 * API name: {@code privileges}
	 */
	public final List<IndexPrivilege> privileges() {
		return this.privileges;
	}

	/**
	 * A search query that defines the documents the owners of the role have read
	 * access to. A document within the specified indices must match this query for
	 * it to be accessible by the owners of the role.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Set to <code>true</code> if using wildcard or regular expressions for
	 * patterns that cover restricted indices. Implicitly, restricted indices have
	 * limited privileges that can cause pattern tests to fail. If restricted
	 * indices are explicitly included in the <code>names</code> list, Elasticsearch
	 * checks privileges against these indices regardless of the value set for
	 * <code>allow_restricted_indices</code>.
	 * <p>
	 * API name: {@code allow_restricted_indices}
	 */
	@Nullable
	public final Boolean allowRestrictedIndices() {
		return this.allowRestrictedIndices;
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

		if (ApiTypeHelper.isDefined(this.fieldSecurity)) {
			generator.writeKey("field_security");
			generator.writeStartArray();
			for (FieldSecurity item0 : this.fieldSecurity) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.names)) {
			generator.writeKey("names");
			generator.writeStartArray();
			for (String item0 : this.names) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.privileges)) {
			generator.writeKey("privileges");
			generator.writeStartArray();
			for (IndexPrivilege item0 : this.privileges) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.allowRestrictedIndices != null) {
			generator.writeKey("allow_restricted_indices");
			generator.write(this.allowRestrictedIndices);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesPrivileges}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndicesPrivileges> {
		@Nullable
		private List<FieldSecurity> fieldSecurity;

		private List<String> names;

		private List<IndexPrivilege> privileges;

		@Nullable
		private Query query;

		@Nullable
		private Boolean allowRestrictedIndices;

		/**
		 * The document fields that the owners of the role have read access to.
		 * <p>
		 * API name: {@code field_security}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fieldSecurity</code>.
		 */
		public final Builder fieldSecurity(List<FieldSecurity> list) {
			this.fieldSecurity = _listAddAll(this.fieldSecurity, list);
			return this;
		}

		/**
		 * The document fields that the owners of the role have read access to.
		 * <p>
		 * API name: {@code field_security}
		 * <p>
		 * Adds one or more values to <code>fieldSecurity</code>.
		 */
		public final Builder fieldSecurity(FieldSecurity value, FieldSecurity... values) {
			this.fieldSecurity = _listAdd(this.fieldSecurity, value, values);
			return this;
		}

		/**
		 * The document fields that the owners of the role have read access to.
		 * <p>
		 * API name: {@code field_security}
		 * <p>
		 * Adds a value to <code>fieldSecurity</code> using a builder lambda.
		 */
		public final Builder fieldSecurity(Function<FieldSecurity.Builder, ObjectBuilder<FieldSecurity>> fn) {
			return fieldSecurity(fn.apply(new FieldSecurity.Builder()).build());
		}

		/**
		 * Required - A list of indices (or index name patterns) to which the
		 * permissions in this entry apply.
		 * <p>
		 * API name: {@code names}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>names</code>.
		 */
		public final Builder names(List<String> list) {
			this.names = _listAddAll(this.names, list);
			return this;
		}

		/**
		 * Required - A list of indices (or index name patterns) to which the
		 * permissions in this entry apply.
		 * <p>
		 * API name: {@code names}
		 * <p>
		 * Adds one or more values to <code>names</code>.
		 */
		public final Builder names(String value, String... values) {
			this.names = _listAdd(this.names, value, values);
			return this;
		}

		/**
		 * Required - The index level privileges that owners of the role have on the
		 * specified indices.
		 * <p>
		 * API name: {@code privileges}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>privileges</code>.
		 */
		public final Builder privileges(List<IndexPrivilege> list) {
			this.privileges = _listAddAll(this.privileges, list);
			return this;
		}

		/**
		 * Required - The index level privileges that owners of the role have on the
		 * specified indices.
		 * <p>
		 * API name: {@code privileges}
		 * <p>
		 * Adds one or more values to <code>privileges</code>.
		 */
		public final Builder privileges(IndexPrivilege value, IndexPrivilege... values) {
			this.privileges = _listAdd(this.privileges, value, values);
			return this;
		}

		/**
		 * A search query that defines the documents the owners of the role have read
		 * access to. A document within the specified indices must match this query for
		 * it to be accessible by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * A search query that defines the documents the owners of the role have read
		 * access to. A document within the specified indices must match this query for
		 * it to be accessible by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Set to <code>true</code> if using wildcard or regular expressions for
		 * patterns that cover restricted indices. Implicitly, restricted indices have
		 * limited privileges that can cause pattern tests to fail. If restricted
		 * indices are explicitly included in the <code>names</code> list, Elasticsearch
		 * checks privileges against these indices regardless of the value set for
		 * <code>allow_restricted_indices</code>.
		 * <p>
		 * API name: {@code allow_restricted_indices}
		 */
		public final Builder allowRestrictedIndices(@Nullable Boolean value) {
			this.allowRestrictedIndices = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesPrivileges build() {
			_checkSingleUse();

			return new IndicesPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesPrivileges}
	 */
	public static final JsonpDeserializer<IndicesPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesPrivileges::setupIndicesPrivilegesDeserializer);

	protected static void setupIndicesPrivilegesDeserializer(ObjectDeserializer<IndicesPrivileges.Builder> op) {

		op.add(Builder::fieldSecurity, JsonpDeserializer.arrayDeserializer(FieldSecurity._DESERIALIZER),
				"field_security");
		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(IndexPrivilege._DESERIALIZER), "privileges");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::allowRestrictedIndices, JsonpDeserializer.booleanDeserializer(), "allow_restricted_indices");

	}

}
