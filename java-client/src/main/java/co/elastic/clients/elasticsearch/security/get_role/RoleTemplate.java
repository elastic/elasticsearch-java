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

package co.elastic.clients.elasticsearch.security.get_role;

import co.elastic.clients.elasticsearch._types.Script;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_role.RoleTemplate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_role.RoleTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleTemplate implements JsonpSerializable {
	@Nullable
	private final TemplateFormat format;

	private final Script template;

	// ---------------------------------------------------------------------------------------------

	private RoleTemplate(Builder builder) {

		this.format = builder.format;
		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");

	}

	public static RoleTemplate of(Function<Builder, ObjectBuilder<RoleTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final TemplateFormat format() {
		return this.format;
	}

	/**
	 * Required - API name: {@code template}
	 */
	public final Script template() {
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

		if (this.format != null) {
			generator.writeKey("format");
			this.format.serialize(generator, mapper);
		}
		generator.writeKey("template");
		this.template.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RoleTemplate> {
		@Nullable
		private TemplateFormat format;

		private Script template;

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable TemplateFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * Required - API name: {@code template}
		 */
		public final Builder template(Script value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - API name: {@code template}
		 */
		public final Builder template(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.template(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoleTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleTemplate build() {
			_checkSingleUse();

			return new RoleTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleTemplate}
	 */
	public static final JsonpDeserializer<RoleTemplate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoleTemplate::setupRoleTemplateDeserializer);

	protected static void setupRoleTemplateDeserializer(ObjectDeserializer<RoleTemplate.Builder> op) {

		op.add(Builder::format, TemplateFormat._DESERIALIZER, "format");
		op.add(Builder::template, Script._DESERIALIZER, "template");

	}

}
