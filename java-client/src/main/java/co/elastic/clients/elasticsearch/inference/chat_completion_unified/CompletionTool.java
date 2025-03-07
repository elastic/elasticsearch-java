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

package co.elastic.clients.elasticsearch.inference.chat_completion_unified;

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

// typedef: inference.chat_completion_unified.CompletionTool

/**
 * A list of tools that the model can call.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.chat_completion_unified.CompletionTool">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionTool implements JsonpSerializable {
	private final String type;

	private final CompletionToolFunction function;

	// ---------------------------------------------------------------------------------------------

	private CompletionTool(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.function = ApiTypeHelper.requireNonNull(builder.function, this, "function");

	}

	public static CompletionTool of(Function<Builder, ObjectBuilder<CompletionTool>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of tool.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - The function definition.
	 * <p>
	 * API name: {@code function}
	 */
	public final CompletionToolFunction function() {
		return this.function;
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

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("function");
		this.function.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionTool}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CompletionTool> {
		private String type;

		private CompletionToolFunction function;

		/**
		 * Required - The type of tool.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - The function definition.
		 * <p>
		 * API name: {@code function}
		 */
		public final Builder function(CompletionToolFunction value) {
			this.function = value;
			return this;
		}

		/**
		 * Required - The function definition.
		 * <p>
		 * API name: {@code function}
		 */
		public final Builder function(
				Function<CompletionToolFunction.Builder, ObjectBuilder<CompletionToolFunction>> fn) {
			return this.function(fn.apply(new CompletionToolFunction.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionTool}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionTool build() {
			_checkSingleUse();

			return new CompletionTool(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionTool}
	 */
	public static final JsonpDeserializer<CompletionTool> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CompletionTool::setupCompletionToolDeserializer);

	protected static void setupCompletionToolDeserializer(ObjectDeserializer<CompletionTool.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::function, CompletionToolFunction._DESERIALIZER, "function");

	}

}
