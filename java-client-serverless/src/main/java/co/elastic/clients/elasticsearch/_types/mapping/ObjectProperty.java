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
import java.lang.Boolean;
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

// typedef: _types.mapping.ObjectProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.ObjectProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class ObjectProperty extends CorePropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Boolean subobjects;

	// ---------------------------------------------------------------------------------------------

	private ObjectProperty(Builder builder) {
		super(builder);

		this.enabled = builder.enabled;
		this.subobjects = builder.subobjects;

	}

	public static ObjectProperty of(Function<Builder, ObjectBuilder<ObjectProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Object;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code subobjects}
	 */
	@Nullable
	public final Boolean subobjects() {
		return this.subobjects;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "object");
		super.serializeInternal(generator, mapper);
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.subobjects != null) {
			generator.writeKey("subobjects");
			generator.write(this.subobjects);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ObjectProperty}.
	 */

	public static class Builder extends CorePropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ObjectProperty> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Boolean subobjects;

		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code subobjects}
		 */
		public final Builder subobjects(@Nullable Boolean value) {
			this.subobjects = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ObjectProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ObjectProperty build() {
			_checkSingleUse();

			return new ObjectProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ObjectProperty}
	 */
	public static final JsonpDeserializer<ObjectProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ObjectProperty::setupObjectPropertyDeserializer);

	protected static void setupObjectPropertyDeserializer(ObjectDeserializer<ObjectProperty.Builder> op) {
		CorePropertyBase.setupCorePropertyBaseDeserializer(op);
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::subobjects, JsonpDeserializer.booleanDeserializer(), "subobjects");

		op.ignore("type");
	}

}
