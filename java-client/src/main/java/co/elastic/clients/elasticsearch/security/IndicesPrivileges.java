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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.IndicesPrivileges
@JsonpDeserializable
public final class IndicesPrivileges implements JsonpSerializable {
	@Nullable
	private final List<FieldSecurity> fieldSecurity;

	private final List<String> names;

	private final List<IndexPrivilege> privileges;

	@Nullable
	private final JsonValue /* Union(Array<internal.string> | _types.query_dsl.QueryContainer) */ query;

	@Nullable
	private final Boolean allowRestrictedIndices;

	// ---------------------------------------------------------------------------------------------

	public IndicesPrivileges(Builder builder) {

		this.fieldSecurity = ModelTypeHelper.unmodifiable(builder.fieldSecurity);
		this.names = ModelTypeHelper.unmodifiableNonNull(builder.names, "names");
		this.privileges = ModelTypeHelper.unmodifiableNonNull(builder.privileges, "privileges");
		this.query = builder.query;
		this.allowRestrictedIndices = builder.allowRestrictedIndices;

	}

	public IndicesPrivileges(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The document fields that the owners of the role have read access to.
	 * <p>
	 * API name: {@code field_security}
	 */
	@Nullable
	public List<FieldSecurity> fieldSecurity() {
		return this.fieldSecurity;
	}

	/**
	 * A list of indices (or index name patterns) to which the permissions in this
	 * entry apply.
	 * <p>
	 * API name: {@code names}
	 */
	public List<String> names() {
		return this.names;
	}

	/**
	 * The index level privileges that owners of the role have on the specified
	 * indices.
	 * <p>
	 * API name: {@code privileges}
	 */
	public List<IndexPrivilege> privileges() {
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
	public JsonValue /* Union(Array<internal.string> | _types.query_dsl.QueryContainer) */ query() {
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
	public Boolean allowRestrictedIndices() {
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

		if (this.fieldSecurity != null) {

			generator.writeKey("field_security");
			generator.writeStartArray();
			for (FieldSecurity item0 : this.fieldSecurity) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("names");
		generator.writeStartArray();
		for (String item0 : this.names) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("privileges");
		generator.writeStartArray();
		for (IndexPrivilege item0 : this.privileges) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

		if (this.query != null) {

			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.allowRestrictedIndices != null) {

			generator.writeKey("allow_restricted_indices");
			generator.write(this.allowRestrictedIndices);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesPrivileges}.
	 */
	public static class Builder implements ObjectBuilder<IndicesPrivileges> {
		@Nullable
		private List<FieldSecurity> fieldSecurity;

		private List<String> names;

		private List<IndexPrivilege> privileges;

		@Nullable
		private JsonValue /* Union(Array<internal.string> | _types.query_dsl.QueryContainer) */ query;

		@Nullable
		private Boolean allowRestrictedIndices;

		/**
		 * The document fields that the owners of the role have read access to.
		 * <p>
		 * API name: {@code field_security}
		 */
		public Builder fieldSecurity(@Nullable List<FieldSecurity> value) {
			this.fieldSecurity = value;
			return this;
		}

		/**
		 * The document fields that the owners of the role have read access to.
		 * <p>
		 * API name: {@code field_security}
		 */
		public Builder fieldSecurity(FieldSecurity... value) {
			this.fieldSecurity = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fieldSecurity(List)}, creating the list if needed. 4
		 */
		public Builder addFieldSecurity(FieldSecurity value) {
			if (this.fieldSecurity == null) {
				this.fieldSecurity = new ArrayList<>();
			}
			this.fieldSecurity.add(value);
			return this;
		}

		/**
		 * Set {@link #fieldSecurity(List)} to a singleton list.
		 */
		public Builder fieldSecurity(Function<FieldSecurity.Builder, ObjectBuilder<FieldSecurity>> fn) {
			return this.fieldSecurity(fn.apply(new FieldSecurity.Builder()).build());
		}

		/**
		 * Add a value to {@link #fieldSecurity(List)}, creating the list if needed. 5
		 */
		public Builder addFieldSecurity(Function<FieldSecurity.Builder, ObjectBuilder<FieldSecurity>> fn) {
			return this.addFieldSecurity(fn.apply(new FieldSecurity.Builder()).build());
		}

		/**
		 * A list of indices (or index name patterns) to which the permissions in this
		 * entry apply.
		 * <p>
		 * API name: {@code names}
		 */
		public Builder names(List<String> value) {
			this.names = value;
			return this;
		}

		/**
		 * A list of indices (or index name patterns) to which the permissions in this
		 * entry apply.
		 * <p>
		 * API name: {@code names}
		 */
		public Builder names(String... value) {
			this.names = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #names(List)}, creating the list if needed. 4
		 */
		public Builder addNames(String value) {
			if (this.names == null) {
				this.names = new ArrayList<>();
			}
			this.names.add(value);
			return this;
		}

		/**
		 * The index level privileges that owners of the role have on the specified
		 * indices.
		 * <p>
		 * API name: {@code privileges}
		 */
		public Builder privileges(List<IndexPrivilege> value) {
			this.privileges = value;
			return this;
		}

		/**
		 * The index level privileges that owners of the role have on the specified
		 * indices.
		 * <p>
		 * API name: {@code privileges}
		 */
		public Builder privileges(IndexPrivilege... value) {
			this.privileges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #privileges(List)}, creating the list if needed. 4
		 */
		public Builder addPrivileges(IndexPrivilege value) {
			if (this.privileges == null) {
				this.privileges = new ArrayList<>();
			}
			this.privileges.add(value);
			return this;
		}

		/**
		 * A search query that defines the documents the owners of the role have read
		 * access to. A document within the specified indices must match this query for
		 * it to be accessible by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(
				@Nullable JsonValue /* Union(Array<internal.string> | _types.query_dsl.QueryContainer) */ value) {
			this.query = value;
			return this;
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
		public Builder allowRestrictedIndices(@Nullable Boolean value) {
			this.allowRestrictedIndices = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesPrivileges build() {

			return new IndicesPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesPrivileges}
	 */
	public static final JsonpDeserializer<IndicesPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesPrivileges::setupIndicesPrivilegesDeserializer, Builder::build);

	protected static void setupIndicesPrivilegesDeserializer(DelegatingDeserializer<IndicesPrivileges.Builder> op) {

		op.add(Builder::fieldSecurity, JsonpDeserializer.arrayDeserializer(FieldSecurity._DESERIALIZER),
				"field_security");
		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(IndexPrivilege._DESERIALIZER), "privileges");
		op.add(Builder::query, JsonpDeserializer.jsonValueDeserializer(), "query");
		op.add(Builder::allowRestrictedIndices, JsonpDeserializer.booleanDeserializer(), "allow_restricted_indices");

	}

}
