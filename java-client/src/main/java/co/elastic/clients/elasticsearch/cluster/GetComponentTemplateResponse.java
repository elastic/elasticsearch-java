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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.get_component_template.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#cluster.get_component_template.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetComponentTemplateResponse implements JsonpSerializable {
	private final List<ComponentTemplate> componentTemplates;

	// ---------------------------------------------------------------------------------------------

	private GetComponentTemplateResponse(Builder builder) {

		this.componentTemplates = ApiTypeHelper.unmodifiableRequired(builder.componentTemplates, this,
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

		if (ApiTypeHelper.isDefined(this.componentTemplates)) {
			generator.writeKey("component_templates");
			generator.writeStartArray();
			for (ComponentTemplate item0 : this.componentTemplates) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link GetComponentTemplateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetComponentTemplateResponse> {
		private List<ComponentTemplate> componentTemplates;

		/**
		 * Required - API name: {@code component_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>componentTemplates</code>.
		 */
		public final Builder componentTemplates(List<ComponentTemplate> list) {
			this.componentTemplates = _listAddAll(this.componentTemplates, list);
			return this;
		}

		/**
		 * Required - API name: {@code component_templates}
		 * <p>
		 * Adds one or more values to <code>componentTemplates</code>.
		 */
		public final Builder componentTemplates(ComponentTemplate value, ComponentTemplate... values) {
			this.componentTemplates = _listAdd(this.componentTemplates, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code component_templates}
		 * <p>
		 * Adds a value to <code>componentTemplates</code> using a builder lambda.
		 */
		public final Builder componentTemplates(
				Function<ComponentTemplate.Builder, ObjectBuilder<ComponentTemplate>> fn) {
			return componentTemplates(fn.apply(new ComponentTemplate.Builder()).build());
		}

		@Override
		protected Builder self() {
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
	public static final JsonpDeserializer<GetComponentTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetComponentTemplateResponse::setupGetComponentTemplateResponseDeserializer);

	protected static void setupGetComponentTemplateResponseDeserializer(
			ObjectDeserializer<GetComponentTemplateResponse.Builder> op) {

		op.add(Builder::componentTemplates, JsonpDeserializer.arrayDeserializer(ComponentTemplate._DESERIALIZER),
				"component_templates");

	}

}
