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

package co.elastic.clients.elasticsearch.security;

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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: security._types.RemoteUserIndicesPrivileges

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.RemoteUserIndicesPrivileges">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoteUserIndicesPrivileges implements JsonpSerializable {
	private final List<FieldSecurity> fieldSecurity;

	private final List<String> names;

	private final List<String> privileges;

	private final List<IndicesPrivilegesQuery> query;

	private final boolean allowRestrictedIndices;

	private final List<String> clusters;

	// ---------------------------------------------------------------------------------------------

	private RemoteUserIndicesPrivileges(Builder builder) {

		this.fieldSecurity = ApiTypeHelper.unmodifiable(builder.fieldSecurity);
		this.names = ApiTypeHelper.unmodifiableRequired(builder.names, this, "names");
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");
		this.query = ApiTypeHelper.unmodifiable(builder.query);
		this.allowRestrictedIndices = ApiTypeHelper.requireNonNull(builder.allowRestrictedIndices, this,
				"allowRestrictedIndices", false);
		this.clusters = ApiTypeHelper.unmodifiableRequired(builder.clusters, this, "clusters");

	}

	public static RemoteUserIndicesPrivileges of(Function<Builder, ObjectBuilder<RemoteUserIndicesPrivileges>> fn) {
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
	public final List<String> privileges() {
		return this.privileges;
	}

	/**
	 * Search queries that define the documents the user has access to. A document
	 * within the specified indices must match these queries for it to be accessible
	 * by the owners of the role.
	 * <p>
	 * API name: {@code query}
	 */
	public final List<IndicesPrivilegesQuery> query() {
		return this.query;
	}

	/**
	 * Required - Set to <code>true</code> if using wildcard or regular expressions
	 * for patterns that cover restricted indices. Implicitly, restricted indices
	 * have limited privileges that can cause pattern tests to fail. If restricted
	 * indices are explicitly included in the <code>names</code> list, Elasticsearch
	 * checks privileges against these indices regardless of the value set for
	 * <code>allow_restricted_indices</code>.
	 * <p>
	 * API name: {@code allow_restricted_indices}
	 */
	public final boolean allowRestrictedIndices() {
		return this.allowRestrictedIndices;
	}

	/**
	 * Required - API name: {@code clusters}
	 */
	public final List<String> clusters() {
		return this.clusters;
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
			for (String item0 : this.privileges) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.query)) {
			generator.writeKey("query");
			generator.writeStartArray();
			for (IndicesPrivilegesQuery item0 : this.query) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("allow_restricted_indices");
		generator.write(this.allowRestrictedIndices);

		if (ApiTypeHelper.isDefined(this.clusters)) {
			generator.writeKey("clusters");
			generator.writeStartArray();
			for (String item0 : this.clusters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoteUserIndicesPrivileges}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RemoteUserIndicesPrivileges> {
		@Nullable
		private List<FieldSecurity> fieldSecurity;

		private List<String> names;

		private List<String> privileges;

		@Nullable
		private List<IndicesPrivilegesQuery> query;

		private Boolean allowRestrictedIndices;

		private List<String> clusters;

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
		public final Builder privileges(List<String> list) {
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
		public final Builder privileges(String value, String... values) {
			this.privileges = _listAdd(this.privileges, value, values);
			return this;
		}

		/**
		 * Required - The index level privileges that owners of the role have on the
		 * specified indices.
		 * <p>
		 * API name: {@code privileges}
		 * <p>
		 * Adds one or more enum values to <code>privileges</code>.
		 */
		public final Builder privileges(IndexPrivilege value, IndexPrivilege... values) {
			this.privileges = _listAdd(this.privileges, value.jsonValue(),
					Arrays.stream(values).map(IndexPrivilege::jsonValue).toArray(String[]::new));
			return this;
		}

		/**
		 * Search queries that define the documents the user has access to. A document
		 * within the specified indices must match these queries for it to be accessible
		 * by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>query</code>.
		 */
		public final Builder query(List<IndicesPrivilegesQuery> list) {
			this.query = _listAddAll(this.query, list);
			return this;
		}

		/**
		 * Search queries that define the documents the user has access to. A document
		 * within the specified indices must match these queries for it to be accessible
		 * by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 * <p>
		 * Adds one or more values to <code>query</code>.
		 */
		public final Builder query(IndicesPrivilegesQuery value, IndicesPrivilegesQuery... values) {
			this.query = _listAdd(this.query, value, values);
			return this;
		}

		/**
		 * Search queries that define the documents the user has access to. A document
		 * within the specified indices must match these queries for it to be accessible
		 * by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 * <p>
		 * Adds a value to <code>query</code> using a builder lambda.
		 */
		public final Builder query(Function<IndicesPrivilegesQuery.Builder, ObjectBuilder<IndicesPrivilegesQuery>> fn) {
			return query(fn.apply(new IndicesPrivilegesQuery.Builder()).build());
		}

		/**
		 * Required - Set to <code>true</code> if using wildcard or regular expressions
		 * for patterns that cover restricted indices. Implicitly, restricted indices
		 * have limited privileges that can cause pattern tests to fail. If restricted
		 * indices are explicitly included in the <code>names</code> list, Elasticsearch
		 * checks privileges against these indices regardless of the value set for
		 * <code>allow_restricted_indices</code>.
		 * <p>
		 * API name: {@code allow_restricted_indices}
		 */
		public final Builder allowRestrictedIndices(boolean value) {
			this.allowRestrictedIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code clusters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clusters</code>.
		 */
		public final Builder clusters(List<String> list) {
			this.clusters = _listAddAll(this.clusters, list);
			return this;
		}

		/**
		 * Required - API name: {@code clusters}
		 * <p>
		 * Adds one or more values to <code>clusters</code>.
		 */
		public final Builder clusters(String value, String... values) {
			this.clusters = _listAdd(this.clusters, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoteUserIndicesPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoteUserIndicesPrivileges build() {
			_checkSingleUse();

			return new RemoteUserIndicesPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoteUserIndicesPrivileges}
	 */
	public static final JsonpDeserializer<RemoteUserIndicesPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RemoteUserIndicesPrivileges::setupRemoteUserIndicesPrivilegesDeserializer);

	protected static void setupRemoteUserIndicesPrivilegesDeserializer(
			ObjectDeserializer<RemoteUserIndicesPrivileges.Builder> op) {

		op.add(Builder::fieldSecurity, JsonpDeserializer.arrayDeserializer(FieldSecurity._DESERIALIZER),
				"field_security");
		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"privileges");
		op.add(Builder::query, JsonpDeserializer.arrayDeserializer(IndicesPrivilegesQuery._DESERIALIZER), "query");
		op.add(Builder::allowRestrictedIndices, JsonpDeserializer.booleanDeserializer(), "allow_restricted_indices");
		op.add(Builder::clusters, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"clusters");

	}

}
