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

// typedef: _types.mapping.CountedKeywordProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.CountedKeywordProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class CountedKeywordProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean index;

	// ---------------------------------------------------------------------------------------------

	private CountedKeywordProperty(Builder builder) {
		super(builder);

		this.index = builder.index;

	}

	public static CountedKeywordProperty of(Function<Builder, ObjectBuilder<CountedKeywordProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.CountedKeyword;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "counted_keyword");
		super.serializeInternal(generator, mapper);
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CountedKeywordProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CountedKeywordProperty> {
		@Nullable
		private Boolean index;

		public Builder() {
		}
		private Builder(CountedKeywordProperty instance) {
			this.index = instance.index;

		}
		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Boolean value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CountedKeywordProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CountedKeywordProperty build() {
			_checkSingleUse();

			return new CountedKeywordProperty(this);
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
	 * Json deserializer for {@link CountedKeywordProperty}
	 */
	public static final JsonpDeserializer<CountedKeywordProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CountedKeywordProperty::setupCountedKeywordPropertyDeserializer);

	protected static void setupCountedKeywordPropertyDeserializer(
			ObjectDeserializer<CountedKeywordProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");

		op.ignore("type");
	}

}
