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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: connector._types.GreaterThanValidation

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.GreaterThanValidation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GreaterThanValidation implements ValidationVariant, JsonpSerializable {
	private final double constraint;

	// ---------------------------------------------------------------------------------------------

	private GreaterThanValidation(Builder builder) {

		this.constraint = ApiTypeHelper.requireNonNull(builder.constraint, this, "constraint");

	}

	public static GreaterThanValidation of(Function<Builder, ObjectBuilder<GreaterThanValidation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Validation variant kind.
	 */
	@Override
	public Validation.Kind _validationKind() {
		return Validation.Kind.GreaterThan;
	}

	/**
	 * Required - API name: {@code constraint}
	 */
	public final double constraint() {
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

		generator.write("type", "greater_than");

		generator.writeKey("constraint");
		generator.write(this.constraint);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GreaterThanValidation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GreaterThanValidation> {
		private Double constraint;

		/**
		 * Required - API name: {@code constraint}
		 */
		public final Builder constraint(double value) {
			this.constraint = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GreaterThanValidation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GreaterThanValidation build() {
			_checkSingleUse();

			return new GreaterThanValidation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GreaterThanValidation}
	 */
	public static final JsonpDeserializer<GreaterThanValidation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GreaterThanValidation::setupGreaterThanValidationDeserializer);

	protected static void setupGreaterThanValidationDeserializer(ObjectDeserializer<GreaterThanValidation.Builder> op) {

		op.add(Builder::constraint, JsonpDeserializer.doubleDeserializer(), "constraint");

		op.ignore("type");
	}

}
