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

// typedef: indices.simulate_index_template.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.simulate_index_template.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateIndexTemplateResponse implements JsonpSerializable {
	private final List<Overlapping> overlapping;

	private final Template template;

	// ---------------------------------------------------------------------------------------------

	private SimulateIndexTemplateResponse(Builder builder) {

		this.overlapping = ApiTypeHelper.unmodifiable(builder.overlapping);
		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");

	}

	public static SimulateIndexTemplateResponse of(Function<Builder, ObjectBuilder<SimulateIndexTemplateResponse>> fn) {
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
	 * Builder for {@link SimulateIndexTemplateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SimulateIndexTemplateResponse> {
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
		 * Builds a {@link SimulateIndexTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateIndexTemplateResponse build() {
			_checkSingleUse();

			return new SimulateIndexTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateIndexTemplateResponse}
	 */
	public static final JsonpDeserializer<SimulateIndexTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimulateIndexTemplateResponse::setupSimulateIndexTemplateResponseDeserializer);

	protected static void setupSimulateIndexTemplateResponseDeserializer(
			ObjectDeserializer<SimulateIndexTemplateResponse.Builder> op) {

		op.add(Builder::overlapping, JsonpDeserializer.arrayDeserializer(Overlapping._DESERIALIZER), "overlapping");
		op.add(Builder::template, Template._DESERIALIZER, "template");

	}

}
