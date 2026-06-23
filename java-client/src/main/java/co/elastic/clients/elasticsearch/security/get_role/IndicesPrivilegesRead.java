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

package co.elastic.clients.elasticsearch.security.get_role;

import co.elastic.clients.elasticsearch.security.FieldSecurity;
import co.elastic.clients.elasticsearch.security.IndexPrivilege;
import co.elastic.clients.elasticsearch.security.IndicesPrivilegesQuery;
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

// typedef: security.get_role.IndicesPrivilegesRead

/**
 * Read-side variant of <code>IndicesPrivileges</code> returned by the get role
 * API. Carries the <code>implicitly_granted</code> marker that is set on
 * entries contributed by a registered <code>ImplicitPrivilegesProvider</code>
 * when <code>include_implicit</code> is <code>true</code>.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_role.IndicesPrivilegesRead">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesPrivilegesRead implements JsonpSerializable {
	@Nullable
	private final Boolean implicitlyGranted;

	@Nullable
	private final FieldSecurity fieldSecurity;

	private final List<String> names;

	private final List<String> privileges;

	@Nullable
	private final IndicesPrivilegesQuery query;

	@Nullable
	private final Boolean allowRestrictedIndices;

	// ---------------------------------------------------------------------------------------------

	private IndicesPrivilegesRead(Builder builder) {

		this.implicitlyGranted = builder.implicitlyGranted;
		this.fieldSecurity = builder.fieldSecurity;
		this.names = ApiTypeHelper.unmodifiableRequired(builder.names, this, "names");
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");
		this.query = builder.query;
		this.allowRestrictedIndices = builder.allowRestrictedIndices;

	}

	public static IndicesPrivilegesRead of(Function<Builder, ObjectBuilder<IndicesPrivilegesRead>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Set to <code>true</code> on entries that were contributed by a registered
	 * <code>ImplicitPrivilegesProvider</code> rather than explicitly stored on the
	 * role. Only present when the get role API is called with
	 * <code>include_implicit=true</code>. The put role API rejects this field, so
	 * clients must not echo it back on a GET-then-PUT round-trip.
	 * <p>
	 * API name: {@code implicitly_granted}
	 */
	@Nullable
	public final Boolean implicitlyGranted() {
		return this.implicitlyGranted;
	}

	/**
	 * The document fields that the owners of the role have read access to.
	 * <p>
	 * API name: {@code field_security}
	 */
	@Nullable
	public final FieldSecurity fieldSecurity() {
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
	 * A search query that defines the documents the owners of the role have access
	 * to. A document within the specified indices must match this query for it to
	 * be accessible by the owners of the role.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final IndicesPrivilegesQuery query() {
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

		if (this.implicitlyGranted != null) {
			generator.writeKey("implicitly_granted");
			generator.write(this.implicitlyGranted);

		}
		if (this.fieldSecurity != null) {
			generator.writeKey("field_security");
			this.fieldSecurity.serialize(generator, mapper);

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
	 * Builder for {@link IndicesPrivilegesRead}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndicesPrivilegesRead> {
		@Nullable
		private Boolean implicitlyGranted;

		@Nullable
		private FieldSecurity fieldSecurity;

		private List<String> names;

		private List<String> privileges;

		@Nullable
		private IndicesPrivilegesQuery query;

		@Nullable
		private Boolean allowRestrictedIndices;

		public Builder() {
		}
		private Builder(IndicesPrivilegesRead instance) {
			this.implicitlyGranted = instance.implicitlyGranted;
			this.fieldSecurity = instance.fieldSecurity;
			this.names = instance.names;
			this.privileges = instance.privileges;
			this.query = instance.query;
			this.allowRestrictedIndices = instance.allowRestrictedIndices;

		}
		/**
		 * Set to <code>true</code> on entries that were contributed by a registered
		 * <code>ImplicitPrivilegesProvider</code> rather than explicitly stored on the
		 * role. Only present when the get role API is called with
		 * <code>include_implicit=true</code>. The put role API rejects this field, so
		 * clients must not echo it back on a GET-then-PUT round-trip.
		 * <p>
		 * API name: {@code implicitly_granted}
		 */
		public final Builder implicitlyGranted(@Nullable Boolean value) {
			this.implicitlyGranted = value;
			return this;
		}

		/**
		 * The document fields that the owners of the role have read access to.
		 * <p>
		 * API name: {@code field_security}
		 */
		public final Builder fieldSecurity(@Nullable FieldSecurity value) {
			this.fieldSecurity = value;
			return this;
		}

		/**
		 * The document fields that the owners of the role have read access to.
		 * <p>
		 * API name: {@code field_security}
		 */
		public final Builder fieldSecurity(Function<FieldSecurity.Builder, ObjectBuilder<FieldSecurity>> fn) {
			return this.fieldSecurity(fn.apply(new FieldSecurity.Builder()).build());
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
		 * A search query that defines the documents the owners of the role have access
		 * to. A document within the specified indices must match this query for it to
		 * be accessible by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable IndicesPrivilegesQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * A search query that defines the documents the owners of the role have access
		 * to. A document within the specified indices must match this query for it to
		 * be accessible by the owners of the role.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<IndicesPrivilegesQuery.Builder, ObjectBuilder<IndicesPrivilegesQuery>> fn) {
			return this.query(fn.apply(new IndicesPrivilegesQuery.Builder()).build());
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
		 * Builds a {@link IndicesPrivilegesRead}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesPrivilegesRead build() {
			_checkSingleUse();

			return new IndicesPrivilegesRead(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesPrivilegesRead}
	 */
	public static final JsonpDeserializer<IndicesPrivilegesRead> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesPrivilegesRead::setupIndicesPrivilegesReadDeserializer);

	protected static void setupIndicesPrivilegesReadDeserializer(ObjectDeserializer<IndicesPrivilegesRead.Builder> op) {

		op.add(Builder::implicitlyGranted, JsonpDeserializer.booleanDeserializer(), "implicitly_granted");
		op.add(Builder::fieldSecurity, FieldSecurity._DESERIALIZER, "field_security");
		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"privileges");
		op.add(Builder::query, IndicesPrivilegesQuery._DESERIALIZER, "query");
		op.add(Builder::allowRestrictedIndices, JsonpDeserializer.booleanDeserializer(), "allow_restricted_indices");

	}

}
