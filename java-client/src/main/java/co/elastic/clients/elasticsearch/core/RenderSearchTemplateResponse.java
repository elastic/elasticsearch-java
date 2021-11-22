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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.render_search_template.Response
@JsonpDeserializable
public class RenderSearchTemplateResponse implements JsonpSerializable {
	private final Map<String, JsonData> templateOutput;

	// ---------------------------------------------------------------------------------------------

	private RenderSearchTemplateResponse(Builder builder) {

		this.templateOutput = ModelTypeHelper.unmodifiableRequired(builder.templateOutput, this, "templateOutput");

	}

	public static RenderSearchTemplateResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code template_output}
	 */
	public final Map<String, JsonData> templateOutput() {
		return this.templateOutput;
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

		if (ModelTypeHelper.isDefined(this.templateOutput)) {
			generator.writeKey("template_output");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.templateOutput.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RenderSearchTemplateResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RenderSearchTemplateResponse> {
		private Map<String, JsonData> templateOutput;

		/**
		 * Required - API name: {@code template_output}
		 */
		public final Builder templateOutput(Map<String, JsonData> value) {
			this.templateOutput = value;
			return this;
		}

		/**
		 * Builds a {@link RenderSearchTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RenderSearchTemplateResponse build() {
			_checkSingleUse();

			return new RenderSearchTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RenderSearchTemplateResponse}
	 */
	public static final JsonpDeserializer<RenderSearchTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RenderSearchTemplateResponse::setupRenderSearchTemplateResponseDeserializer);

	protected static void setupRenderSearchTemplateResponseDeserializer(
			ObjectDeserializer<RenderSearchTemplateResponse.Builder> op) {

		op.add(Builder::templateOutput, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"template_output");

	}

}
