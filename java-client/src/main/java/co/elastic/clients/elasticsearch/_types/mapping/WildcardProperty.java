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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.WildcardProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.WildcardProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class WildcardProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final String nullValue;

	// ---------------------------------------------------------------------------------------------

	private WildcardProperty(Builder builder) {
		super(builder);

		this.nullValue = builder.nullValue;

	}

	public static WildcardProperty of(Function<Builder, ObjectBuilder<WildcardProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Wildcard;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final String nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "wildcard");
		super.serializeInternal(generator, mapper);
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WildcardProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WildcardProperty> {
		@Nullable
		private String nullValue;

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable String value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WildcardProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WildcardProperty build() {
			_checkSingleUse();

			return new WildcardProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WildcardProperty}
	 */
	public static final JsonpDeserializer<WildcardProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WildcardProperty::setupWildcardPropertyDeserializer);

	protected static void setupWildcardPropertyDeserializer(ObjectDeserializer<WildcardProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::nullValue, JsonpDeserializer.stringDeserializer(), "null_value");

		op.ignore("type");
	}

}
