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
import java.lang.Float;
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

// typedef: _types.mapping.FloatNumberProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.FloatNumberProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class FloatNumberProperty extends StandardNumberProperty implements PropertyVariant {
	@Nullable
	private final Float nullValue;

	// ---------------------------------------------------------------------------------------------

	private FloatNumberProperty(Builder builder) {
		super(builder);

		this.nullValue = builder.nullValue;

	}

	public static FloatNumberProperty of(Function<Builder, ObjectBuilder<FloatNumberProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Float;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final Float nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "float");
		super.serializeInternal(generator, mapper);
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FloatNumberProperty}.
	 */

	public static class Builder extends StandardNumberProperty.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FloatNumberProperty> {
		@Nullable
		private Float nullValue;

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable Float value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FloatNumberProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FloatNumberProperty build() {
			_checkSingleUse();

			return new FloatNumberProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FloatNumberProperty}
	 */
	public static final JsonpDeserializer<FloatNumberProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FloatNumberProperty::setupFloatNumberPropertyDeserializer);

	protected static void setupFloatNumberPropertyDeserializer(ObjectDeserializer<FloatNumberProperty.Builder> op) {
		StandardNumberProperty.setupStandardNumberPropertyDeserializer(op);
		op.add(Builder::nullValue, JsonpDeserializer.floatDeserializer(), "null_value");

		op.ignore("type");
	}

}
