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

package co.elastic.clients.elasticsearch.connector;

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

// typedef: connector._types.ListTypeValidation

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.ListTypeValidation">API
 *      specification</a>
 */
@JsonpDeserializable
public class ListTypeValidation implements ValidationVariant, JsonpSerializable {
	private final String constraint;

	// ---------------------------------------------------------------------------------------------

	private ListTypeValidation(Builder builder) {

		this.constraint = ApiTypeHelper.requireNonNull(builder.constraint, this, "constraint");

	}

	public static ListTypeValidation of(Function<Builder, ObjectBuilder<ListTypeValidation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Validation variant kind.
	 */
	@Override
	public Validation.Kind _validationKind() {
		return Validation.Kind.ListType;
	}

	/**
	 * Required - API name: {@code constraint}
	 */
	public final String constraint() {
		return this.constraint;
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

		generator.write("type", "list_type");

		generator.writeKey("constraint");
		generator.write(this.constraint);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListTypeValidation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ListTypeValidation> {
		private String constraint;

		/**
		 * Required - API name: {@code constraint}
		 */
		public final Builder constraint(String value) {
			this.constraint = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListTypeValidation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListTypeValidation build() {
			_checkSingleUse();

			return new ListTypeValidation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ListTypeValidation}
	 */
	public static final JsonpDeserializer<ListTypeValidation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ListTypeValidation::setupListTypeValidationDeserializer);

	protected static void setupListTypeValidationDeserializer(ObjectDeserializer<ListTypeValidation.Builder> op) {

		op.add(Builder::constraint, JsonpDeserializer.stringDeserializer(), "constraint");

		op.ignore("type");
	}

}
