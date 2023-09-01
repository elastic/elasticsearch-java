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

package co.elastic.clients.elasticsearch.cluster;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ComponentTemplate

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#cluster._types.ComponentTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class ComponentTemplate implements JsonpSerializable {
	private final String name;

	private final ComponentTemplateNode componentTemplate;

	// ---------------------------------------------------------------------------------------------

	private ComponentTemplate(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.componentTemplate = ApiTypeHelper.requireNonNull(builder.componentTemplate, this, "componentTemplate");

	}

	public static ComponentTemplate of(Function<Builder, ObjectBuilder<ComponentTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code component_template}
	 */
	public final ComponentTemplateNode componentTemplate() {
		return this.componentTemplate;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("component_template");
		this.componentTemplate.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ComponentTemplate> {
		private String name;

		private ComponentTemplateNode componentTemplate;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code component_template}
		 */
		public final Builder componentTemplate(ComponentTemplateNode value) {
			this.componentTemplate = value;
			return this;
		}

		/**
		 * Required - API name: {@code component_template}
		 */
		public final Builder componentTemplate(
				Function<ComponentTemplateNode.Builder, ObjectBuilder<ComponentTemplateNode>> fn) {
			return this.componentTemplate(fn.apply(new ComponentTemplateNode.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ComponentTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplate build() {
			_checkSingleUse();

			return new ComponentTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ComponentTemplate}
	 */
	public static final JsonpDeserializer<ComponentTemplate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ComponentTemplate::setupComponentTemplateDeserializer);

	protected static void setupComponentTemplateDeserializer(ObjectDeserializer<ComponentTemplate.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::componentTemplate, ComponentTemplateNode._DESERIALIZER, "component_template");

	}

}
