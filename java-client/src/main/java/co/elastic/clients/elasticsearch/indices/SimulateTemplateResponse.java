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

import co.elastic.clients.elasticsearch.indices.simulate_template.Overlapping;
import co.elastic.clients.elasticsearch.indices.simulate_template.Template;
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

// typedef: indices.simulate_template.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.simulate_template.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateTemplateResponse implements JsonpSerializable {
	private final List<Overlapping> overlapping;

	private final Template template;

	// ---------------------------------------------------------------------------------------------

	private SimulateTemplateResponse(Builder builder) {

		this.overlapping = ApiTypeHelper.unmodifiable(builder.overlapping);
		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");

	}

	public static SimulateTemplateResponse of(Function<Builder, ObjectBuilder<SimulateTemplateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code overlapping}
	 */
	public final List<Overlapping> overlapping() {
		return this.overlapping;
	}

	/**
	 * Required - API name: {@code template}
	 */
	public final Template template() {
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

		if (ApiTypeHelper.isDefined(this.overlapping)) {
			generator.writeKey("overlapping");
			generator.writeStartArray();
			for (Overlapping item0 : this.overlapping) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

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
	 * Builder for {@link SimulateTemplateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SimulateTemplateResponse> {
		@Nullable
		private List<Overlapping> overlapping;

		private Template template;

		/**
		 * API name: {@code overlapping}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>overlapping</code>.
		 */
		public final Builder overlapping(List<Overlapping> list) {
			this.overlapping = _listAddAll(this.overlapping, list);
			return this;
		}

		/**
		 * API name: {@code overlapping}
		 * <p>
		 * Adds one or more values to <code>overlapping</code>.
		 */
		public final Builder overlapping(Overlapping value, Overlapping... values) {
			this.overlapping = _listAdd(this.overlapping, value, values);
			return this;
		}

		/**
		 * API name: {@code overlapping}
		 * <p>
		 * Adds a value to <code>overlapping</code> using a builder lambda.
		 */
		public final Builder overlapping(Function<Overlapping.Builder, ObjectBuilder<Overlapping>> fn) {
			return overlapping(fn.apply(new Overlapping.Builder()).build());
		}

		/**
		 * Required - API name: {@code template}
		 */
		public final Builder template(Template value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - API name: {@code template}
		 */
		public final Builder template(Function<Template.Builder, ObjectBuilder<Template>> fn) {
			return this.template(fn.apply(new Template.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimulateTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateTemplateResponse build() {
			_checkSingleUse();

			return new SimulateTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateTemplateResponse}
	 */
	public static final JsonpDeserializer<SimulateTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimulateTemplateResponse::setupSimulateTemplateResponseDeserializer);

	protected static void setupSimulateTemplateResponseDeserializer(
			ObjectDeserializer<SimulateTemplateResponse.Builder> op) {

		op.add(Builder::overlapping, JsonpDeserializer.arrayDeserializer(Overlapping._DESERIALIZER), "overlapping");
		op.add(Builder::template, Template._DESERIALIZER, "template");

	}

}
