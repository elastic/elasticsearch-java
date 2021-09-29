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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.simulate_template.Template;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_template.Response
@JsonpDeserializable
public final class SimulateTemplateResponse implements JsonpSerializable {
	private final Template template;

	// ---------------------------------------------------------------------------------------------

	public SimulateTemplateResponse(Builder builder) {

		this.template = Objects.requireNonNull(builder.template, "template");

	}

	public SimulateTemplateResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code template}
	 */
	public Template template() {
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

		generator.writeKey("template");
		this.template.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateTemplateResponse}.
	 */
	public static class Builder implements ObjectBuilder<SimulateTemplateResponse> {
		private Template template;

		/**
		 * API name: {@code template}
		 */
		public Builder template(Template value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(Function<Template.Builder, ObjectBuilder<Template>> fn) {
			return this.template(fn.apply(new Template.Builder()).build());
		}

		/**
		 * Builds a {@link SimulateTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateTemplateResponse build() {

			return new SimulateTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateTemplateResponse}
	 */
	public static final JsonpDeserializer<SimulateTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimulateTemplateResponse::setupSimulateTemplateResponseDeserializer, Builder::build);

	protected static void setupSimulateTemplateResponseDeserializer(
			DelegatingDeserializer<SimulateTemplateResponse.Builder> op) {

		op.add(Builder::template, Template._DESERIALIZER, "template");

	}

}
