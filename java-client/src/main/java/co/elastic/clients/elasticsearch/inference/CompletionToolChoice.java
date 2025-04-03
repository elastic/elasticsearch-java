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

// typedef: inference._types.CompletionToolChoice

/**
 * Controls which tool is called by the model.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CompletionToolChoice">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionToolChoice implements JsonpSerializable {
	private final String type;

	private final CompletionToolChoiceFunction function;

	// ---------------------------------------------------------------------------------------------

	private CompletionToolChoice(Builder builder) {

		this.type = ApiTypeHelper.requireNonNullWithDefault(builder.type, this, "type", this.type());
		this.function = ApiTypeHelper.requireNonNullWithDefault(builder.function, this, "function", this.function());

	}

	public static CompletionToolChoice of(Function<Builder, ObjectBuilder<CompletionToolChoice>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of the tool.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - The tool choice function.
	 * <p>
	 * API name: {@code function}
	 */
	public final CompletionToolChoiceFunction function() {
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
	 * Builder for {@link CompletionToolChoice}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CompletionToolChoice> {
		private String type;

		private CompletionToolChoiceFunction function;

		/**
		 * Required - The type of the tool.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - The tool choice function.
		 * <p>
		 * API name: {@code function}
		 */
		public final Builder function(CompletionToolChoiceFunction value) {
			this.function = value;
			return this;
		}

		/**
		 * Required - The tool choice function.
		 * <p>
		 * API name: {@code function}
		 */
		public final Builder function(
				Function<CompletionToolChoiceFunction.Builder, ObjectBuilder<CompletionToolChoiceFunction>> fn) {
			return this.function(fn.apply(new CompletionToolChoiceFunction.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionToolChoice}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionToolChoice build() {
			_checkSingleUse();

			return new CompletionToolChoice(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionToolChoice}
	 */
	public static final JsonpDeserializer<CompletionToolChoice> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompletionToolChoice::setupCompletionToolChoiceDeserializer);

	protected static void setupCompletionToolChoiceDeserializer(ObjectDeserializer<CompletionToolChoice.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::function, CompletionToolChoiceFunction._DESERIALIZER, "function");

	}

}
