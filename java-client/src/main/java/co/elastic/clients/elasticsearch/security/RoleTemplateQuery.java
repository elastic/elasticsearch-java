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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: security._types.RoleTemplateQuery

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.RoleTemplateQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleTemplateQuery implements JsonpSerializable {
	@Nullable
	private final RoleTemplateScript template;

	// ---------------------------------------------------------------------------------------------

	private RoleTemplateQuery(Builder builder) {

		this.template = builder.template;

	}

	public static RoleTemplateQuery of(Function<Builder, ObjectBuilder<RoleTemplateQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * When you create a role, you can specify a query that defines the document
	 * level security permissions. You can optionally use Mustache templates in the
	 * role query to insert the username of the current authenticated user into the
	 * role. Like other places in Elasticsearch that support templating or
	 * scripting, you can specify inline, stored, or file-based templates and define
	 * custom parameters. You access the details for the current authenticated user
	 * through the _user parameter.
	 * <p>
	 * API name: {@code template}
	 */
	@Nullable
	public final RoleTemplateScript template() {
		return this.template;
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

		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleTemplateQuery}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RoleTemplateQuery> {
		@Nullable
		private RoleTemplateScript template;

		/**
		 * When you create a role, you can specify a query that defines the document
		 * level security permissions. You can optionally use Mustache templates in the
		 * role query to insert the username of the current authenticated user into the
		 * role. Like other places in Elasticsearch that support templating or
		 * scripting, you can specify inline, stored, or file-based templates and define
		 * custom parameters. You access the details for the current authenticated user
		 * through the _user parameter.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable RoleTemplateScript value) {
			this.template = value;
			return this;
		}

		/**
		 * When you create a role, you can specify a query that defines the document
		 * level security permissions. You can optionally use Mustache templates in the
		 * role query to insert the username of the current authenticated user into the
		 * role. Like other places in Elasticsearch that support templating or
		 * scripting, you can specify inline, stored, or file-based templates and define
		 * custom parameters. You access the details for the current authenticated user
		 * through the _user parameter.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Function<RoleTemplateScript.Builder, ObjectBuilder<RoleTemplateScript>> fn) {
			return this.template(fn.apply(new RoleTemplateScript.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoleTemplateQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleTemplateQuery build() {
			_checkSingleUse();

			return new RoleTemplateQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleTemplateQuery}
	 */
	public static final JsonpDeserializer<RoleTemplateQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RoleTemplateQuery::setupRoleTemplateQueryDeserializer);

	protected static void setupRoleTemplateQueryDeserializer(ObjectDeserializer<RoleTemplateQuery.Builder> op) {

		op.add(Builder::template, RoleTemplateScript._DESERIALIZER, "template");

	}

}
