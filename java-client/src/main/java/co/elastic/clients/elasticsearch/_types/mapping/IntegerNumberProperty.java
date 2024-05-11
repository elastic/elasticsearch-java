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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: _types.mapping.IntegerNumberProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.IntegerNumberProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntegerNumberProperty extends StandardNumberProperty implements PropertyVariant {
	@Nullable
	private final Integer nullValue;

	// ---------------------------------------------------------------------------------------------

	private IntegerNumberProperty(Builder builder) {
		super(builder);

		this.nullValue = builder.nullValue;

	}

	public static IntegerNumberProperty of(Function<Builder, ObjectBuilder<IntegerNumberProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Integer;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final Integer nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "integer");
		super.serializeInternal(generator, mapper);
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntegerNumberProperty}.
	 */

	public static class Builder extends StandardNumberProperty.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IntegerNumberProperty> {
		@Nullable
		private Integer nullValue;

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable Integer value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IntegerNumberProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntegerNumberProperty build() {
			_checkSingleUse();

			return new IntegerNumberProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntegerNumberProperty}
	 */
	public static final JsonpDeserializer<IntegerNumberProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IntegerNumberProperty::setupIntegerNumberPropertyDeserializer);

	protected static void setupIntegerNumberPropertyDeserializer(ObjectDeserializer<IntegerNumberProperty.Builder> op) {
		StandardNumberProperty.setupStandardNumberPropertyDeserializer(op);
		op.add(Builder::nullValue, JsonpDeserializer.integerDeserializer(), "null_value");

		op.ignore("type");
	}

}
