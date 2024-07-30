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

import co.elastic.clients.elasticsearch._types.FieldValue;
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

// typedef: connector._types.IncludedInValidation

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.IncludedInValidation">API
 *      specification</a>
 */
@JsonpDeserializable
public class IncludedInValidation implements ValidationVariant, JsonpSerializable {
	private final List<FieldValue> constraint;

	// ---------------------------------------------------------------------------------------------

	private IncludedInValidation(Builder builder) {

		this.constraint = ApiTypeHelper.unmodifiableRequired(builder.constraint, this, "constraint");

	}

	public static IncludedInValidation of(Function<Builder, ObjectBuilder<IncludedInValidation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Validation variant kind.
	 */
	@Override
	public Validation.Kind _validationKind() {
		return Validation.Kind.IncludedIn;
	}

	/**
	 * Required - API name: {@code constraint}
	 */
	public final List<FieldValue> constraint() {
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

		generator.write("type", "included_in");

		if (ApiTypeHelper.isDefined(this.constraint)) {
			generator.writeKey("constraint");
			generator.writeStartArray();
			for (FieldValue item0 : this.constraint) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IncludedInValidation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IncludedInValidation> {
		private List<FieldValue> constraint;

		/**
		 * Required - API name: {@code constraint}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>constraint</code>.
		 */
		public final Builder constraint(List<FieldValue> list) {
			this.constraint = _listAddAll(this.constraint, list);
			return this;
		}

		/**
		 * Required - API name: {@code constraint}
		 * <p>
		 * Adds one or more values to <code>constraint</code>.
		 */
		public final Builder constraint(FieldValue value, FieldValue... values) {
			this.constraint = _listAdd(this.constraint, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code constraint}
		 * <p>
		 * Adds a value to <code>constraint</code> using a builder lambda.
		 */
		public final Builder constraint(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return constraint(fn.apply(new FieldValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IncludedInValidation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IncludedInValidation build() {
			_checkSingleUse();

			return new IncludedInValidation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IncludedInValidation}
	 */
	public static final JsonpDeserializer<IncludedInValidation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IncludedInValidation::setupIncludedInValidationDeserializer);

	protected static void setupIncludedInValidationDeserializer(ObjectDeserializer<IncludedInValidation.Builder> op) {

		op.add(Builder::constraint, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "constraint");

		op.ignore("type");
	}

}
