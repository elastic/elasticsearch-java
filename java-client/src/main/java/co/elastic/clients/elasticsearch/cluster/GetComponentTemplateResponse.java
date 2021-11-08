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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.get_component_template.Response
@JsonpDeserializable
public class GetComponentTemplateResponse implements JsonpSerializable {
	private final List<ComponentTemplate> componentTemplates;

	// ---------------------------------------------------------------------------------------------

	private GetComponentTemplateResponse(Builder builder) {

		this.componentTemplates = ModelTypeHelper.unmodifiableRequired(builder.componentTemplates, this,
				"componentTemplates");

	}

	public static GetComponentTemplateResponse of(Function<Builder, ObjectBuilder<GetComponentTemplateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code component_templates}
	 */
	public final List<ComponentTemplate> componentTemplates() {
		return this.componentTemplates;
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

		if (ModelTypeHelper.isDefined(this.componentTemplates)) {
			generator.writeKey("component_templates");
			generator.writeStartArray();
			for (ComponentTemplate item0 : this.componentTemplates) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetComponentTemplateResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetComponentTemplateResponse> {
		private List<ComponentTemplate> componentTemplates;

		/**
		 * Required - API name: {@code component_templates}
		 */
		public final Builder componentTemplates(List<ComponentTemplate> value) {
			this.componentTemplates = value;
			return this;
		}

		/**
		 * Required - API name: {@code component_templates}
		 */
		public final Builder componentTemplates(ComponentTemplate... value) {
			this.componentTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code component_templates}
		 */
		@SafeVarargs
		public final Builder componentTemplates(
				Function<ComponentTemplate.Builder, ObjectBuilder<ComponentTemplate>>... fns) {
			this.componentTemplates = new ArrayList<>(fns.length);
			for (Function<ComponentTemplate.Builder, ObjectBuilder<ComponentTemplate>> fn : fns) {
				this.componentTemplates.add(fn.apply(new ComponentTemplate.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link GetComponentTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetComponentTemplateResponse build() {
			_checkSingleUse();

			return new GetComponentTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetComponentTemplateResponse}
	 */
	public static final JsonpDeserializer<GetComponentTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, GetComponentTemplateResponse::setupGetComponentTemplateResponseDeserializer, Builder::build);

	protected static void setupGetComponentTemplateResponseDeserializer(
			DelegatingDeserializer<GetComponentTemplateResponse.Builder> op) {

		op.add(Builder::componentTemplates, JsonpDeserializer.arrayDeserializer(ComponentTemplate._DESERIALIZER),
				"component_templates");

	}

}
