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

import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
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

// typedef: inference._types.CompletionToolFunction

/**
 * The completion tool function definition.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CompletionToolFunction">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionToolFunction implements JsonpSerializable {
	@Nullable
	private final String description;

	private final String name;

	@Nullable
	private final JsonData parameters;

	@Nullable
	private final Boolean strict;

	// ---------------------------------------------------------------------------------------------

	private CompletionToolFunction(Builder builder) {

		this.description = builder.description;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.parameters = builder.parameters;
		this.strict = builder.strict;

	}

	public static CompletionToolFunction of(Function<Builder, ObjectBuilder<CompletionToolFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A description of what the function does. This is used by the model to choose
	 * when and how to call the function.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - The name of the function.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * The parameters the functional accepts. This should be formatted as a JSON
	 * object.
	 * <p>
	 * API name: {@code parameters}
	 */
	@Nullable
	public final JsonData parameters() {
		return this.parameters;
	}

	/**
	 * Whether to enable schema adherence when generating the function call.
	 * <p>
	 * API name: {@code strict}
	 */
	@Nullable
	public final Boolean strict() {
		return this.strict;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		generator.writeKey("name");
		generator.write(this.name);

		if (this.parameters != null) {
			generator.writeKey("parameters");
			this.parameters.serialize(generator, mapper);

		}
		if (this.strict != null) {
			generator.writeKey("strict");
			generator.write(this.strict);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionToolFunction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CompletionToolFunction> {
		@Nullable
		private String description;

		private String name;

		@Nullable
		private JsonData parameters;

		@Nullable
		private Boolean strict;

		public Builder() {
		}
		private Builder(CompletionToolFunction instance) {
			this.description = instance.description;
			this.name = instance.name;
			this.parameters = instance.parameters;
			this.strict = instance.strict;

		}
		/**
		 * A description of what the function does. This is used by the model to choose
		 * when and how to call the function.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - The name of the function.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * The parameters the functional accepts. This should be formatted as a JSON
		 * object.
		 * <p>
		 * API name: {@code parameters}
		 */
		public final Builder parameters(@Nullable JsonData value) {
			this.parameters = value;
			return this;
		}

		/**
		 * Whether to enable schema adherence when generating the function call.
		 * <p>
		 * API name: {@code strict}
		 */
		public final Builder strict(@Nullable Boolean value) {
			this.strict = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionToolFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionToolFunction build() {
			_checkSingleUse();

			return new CompletionToolFunction(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionToolFunction}
	 */
	public static final JsonpDeserializer<CompletionToolFunction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompletionToolFunction::setupCompletionToolFunctionDeserializer);

	protected static void setupCompletionToolFunctionDeserializer(
			ObjectDeserializer<CompletionToolFunction.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::parameters, JsonData._DESERIALIZER, "parameters");
		op.add(Builder::strict, JsonpDeserializer.booleanDeserializer(), "strict");

	}

}
