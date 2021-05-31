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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.get_component_template.Response
public final class GetComponentTemplateResponse implements ToJsonp {
	private final List<ComponentTemplate> componentTemplates;

	// ---------------------------------------------------------------------------------------------

	protected GetComponentTemplateResponse(Builder builder) {

		this.componentTemplates = Objects.requireNonNull(builder.componentTemplates, "component_templates");

	}

	/**
	 * API name: {@code component_templates}
	 */
	public List<ComponentTemplate> componentTemplates() {
		return this.componentTemplates;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("component_templates");
		generator.writeStartArray();
		for (ComponentTemplate item0 : this.componentTemplates) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetComponentTemplateResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetComponentTemplateResponse> {
		private List<ComponentTemplate> componentTemplates;

		/**
		 * API name: {@code component_templates}
		 */
		public Builder componentTemplates(List<ComponentTemplate> value) {
			this.componentTemplates = value;
			return this;
		}

		/**
		 * API name: {@code component_templates}
		 */
		public Builder componentTemplates(ComponentTemplate... value) {
			this.componentTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #componentTemplates(List)}, creating the list if
		 * needed.
		 */
		public Builder addComponentTemplates(ComponentTemplate value) {
			if (this.componentTemplates == null) {
				this.componentTemplates = new ArrayList<>();
			}
			this.componentTemplates.add(value);
			return this;
		}

		/**
		 * Set {@link #componentTemplates(List)} to a singleton list.
		 */
		public Builder componentTemplates(Function<ComponentTemplate.Builder, ObjectBuilder<ComponentTemplate>> fn) {
			return this.componentTemplates(fn.apply(new ComponentTemplate.Builder()).build());
		}

		/**
		 * Add a value to {@link #componentTemplates(List)}, creating the list if
		 * needed.
		 */
		public Builder addComponentTemplates(Function<ComponentTemplate.Builder, ObjectBuilder<ComponentTemplate>> fn) {
			return this.addComponentTemplates(fn.apply(new ComponentTemplate.Builder()).build());
		}

		/**
		 * Builds a {@link GetComponentTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetComponentTemplateResponse build() {

			return new GetComponentTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetComponentTemplateResponse
	 */
	public static final JsonpValueParser<GetComponentTemplateResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetComponentTemplateResponse::setupGetComponentTemplateResponseParser);

	protected static void setupGetComponentTemplateResponseParser(
			DelegatingJsonpValueParser<GetComponentTemplateResponse.Builder> op) {

		op.add(Builder::componentTemplates, JsonpValueParser.arrayParser(ComponentTemplate.JSONP_PARSER),
				"component_templates");

	}

}
