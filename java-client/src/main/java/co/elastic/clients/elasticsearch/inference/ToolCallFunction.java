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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.ToolCallFunction

/**
 * The function that the model called.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ToolCallFunction">API
 *      specification</a>
 */
@JsonpDeserializable
public class ToolCallFunction implements JsonpSerializable {
	private final String arguments;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private ToolCallFunction(Builder builder) {

		this.arguments = ApiTypeHelper.requireNonNullWithDefault(builder.arguments, this, "arguments",
				this.arguments());
		this.name = ApiTypeHelper.requireNonNullWithDefault(builder.name, this, "name", this.name());

	}

	public static ToolCallFunction of(Function<Builder, ObjectBuilder<ToolCallFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The arguments to call the function with in JSON format.
	 * <p>
	 * API name: {@code arguments}
	 */
	public final String arguments() {
		return this.arguments;
	}

	/**
	 * Required - The name of the function to call.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

		generator.writeKey("arguments");
		generator.write(this.arguments);

		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ToolCallFunction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ToolCallFunction> {
		private String arguments;

		private String name;

		/**
		 * Required - The arguments to call the function with in JSON format.
		 * <p>
		 * API name: {@code arguments}
		 */
		public final Builder arguments(String value) {
			this.arguments = value;
			return this;
		}

		/**
		 * Required - The name of the function to call.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ToolCallFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ToolCallFunction build() {
			_checkSingleUse();

			return new ToolCallFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ToolCallFunction}
	 */
	public static final JsonpDeserializer<ToolCallFunction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ToolCallFunction::setupToolCallFunctionDeserializer);

	protected static void setupToolCallFunctionDeserializer(ObjectDeserializer<ToolCallFunction.Builder> op) {

		op.add(Builder::arguments, JsonpDeserializer.stringDeserializer(), "arguments");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
