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

package co.elastic.clients.elasticsearch.security.has_privileges;

import co.elastic.clients.elasticsearch.security.IndexPrivilege;
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

// typedef: security.has_privileges.IndexPrivilegesCheck

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.has_privileges.IndexPrivilegesCheck">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexPrivilegesCheck implements JsonpSerializable {
	private final List<String> names;

	private final List<String> privileges;

	@Nullable
	private final Boolean allowRestrictedIndices;

	// ---------------------------------------------------------------------------------------------

	private IndexPrivilegesCheck(Builder builder) {

		this.names = ApiTypeHelper.unmodifiableRequired(builder.names, this, "names");
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");
		this.allowRestrictedIndices = builder.allowRestrictedIndices;

	}

	public static IndexPrivilegesCheck of(Function<Builder, ObjectBuilder<IndexPrivilegesCheck>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A list of indices.
	 * <p>
	 * API name: {@code names}
	 */
	public final List<String> names() {
		return this.names;
	}

	/**
	 * Required - A list of the privileges that you want to check for the specified
	 * indices.
	 * <p>
	 * API name: {@code privileges}
	 */
	public final List<String> privileges() {
		return this.privileges;
	}

	/**
	 * This needs to be set to true (default is false) if using wildcards or regexps
	 * for patterns that cover restricted indices. Implicitly, restricted indices do
	 * not match index patterns because restricted indices usually have limited
	 * privileges and including them in pattern tests would render most such tests
	 * false. If restricted indices are explicitly included in the names list,
	 * privileges will be checked against them regardless of the value of
	 * allow_restricted_indices.
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
	 * Builder for {@link IndexPrivilegesCheck}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexPrivilegesCheck> {
		private List<String> names;

		private List<String> privileges;

		@Nullable
		private Boolean allowRestrictedIndices;

		/**
		 * Required - A list of indices.
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
		 * Required - A list of indices.
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
		 * Required - A list of the privileges that you want to check for the specified
		 * indices.
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
		 * Required - A list of the privileges that you want to check for the specified
		 * indices.
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
		 * This needs to be set to true (default is false) if using wildcards or regexps
		 * for patterns that cover restricted indices. Implicitly, restricted indices do
		 * not match index patterns because restricted indices usually have limited
		 * privileges and including them in pattern tests would render most such tests
		 * false. If restricted indices are explicitly included in the names list,
		 * privileges will be checked against them regardless of the value of
		 * allow_restricted_indices.
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
		 * Builds a {@link IndexPrivilegesCheck}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexPrivilegesCheck build() {
			_checkSingleUse();

			return new IndexPrivilegesCheck(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexPrivilegesCheck}
	 */
	public static final JsonpDeserializer<IndexPrivilegesCheck> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexPrivilegesCheck::setupIndexPrivilegesCheckDeserializer);

	protected static void setupIndexPrivilegesCheckDeserializer(ObjectDeserializer<IndexPrivilegesCheck.Builder> op) {

		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "names");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"privileges");
		op.add(Builder::allowRestrictedIndices, JsonpDeserializer.booleanDeserializer(), "allow_restricted_indices");

	}

}
