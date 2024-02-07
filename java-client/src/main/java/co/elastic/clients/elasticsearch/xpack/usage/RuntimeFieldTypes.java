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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: xpack.usage.RuntimeFieldTypes

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.RuntimeFieldTypes">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuntimeFieldTypes extends Base {
	private final List<RuntimeFieldsType> fieldTypes;

	// ---------------------------------------------------------------------------------------------

	private RuntimeFieldTypes(Builder builder) {
		super(builder);

		this.fieldTypes = ApiTypeHelper.unmodifiableRequired(builder.fieldTypes, this, "fieldTypes");

	}

	public static RuntimeFieldTypes of(Function<Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field_types}
	 */
	public final List<RuntimeFieldsType> fieldTypes() {
		return this.fieldTypes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.fieldTypes)) {
			generator.writeKey("field_types");
			generator.writeStartArray();
			for (RuntimeFieldsType item0 : this.fieldTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeFieldTypes}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<RuntimeFieldTypes> {
		private List<RuntimeFieldsType> fieldTypes;

		/**
		 * Required - API name: {@code field_types}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fieldTypes</code>.
		 */
		public final Builder fieldTypes(List<RuntimeFieldsType> list) {
			this.fieldTypes = _listAddAll(this.fieldTypes, list);
			return this;
		}

		/**
		 * Required - API name: {@code field_types}
		 * <p>
		 * Adds one or more values to <code>fieldTypes</code>.
		 */
		public final Builder fieldTypes(RuntimeFieldsType value, RuntimeFieldsType... values) {
			this.fieldTypes = _listAdd(this.fieldTypes, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code field_types}
		 * <p>
		 * Adds a value to <code>fieldTypes</code> using a builder lambda.
		 */
		public final Builder fieldTypes(Function<RuntimeFieldsType.Builder, ObjectBuilder<RuntimeFieldsType>> fn) {
			return fieldTypes(fn.apply(new RuntimeFieldsType.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RuntimeFieldTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuntimeFieldTypes build() {
			_checkSingleUse();

			return new RuntimeFieldTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuntimeFieldTypes}
	 */
	public static final JsonpDeserializer<RuntimeFieldTypes> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RuntimeFieldTypes::setupRuntimeFieldTypesDeserializer);

	protected static void setupRuntimeFieldTypesDeserializer(ObjectDeserializer<RuntimeFieldTypes.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::fieldTypes, JsonpDeserializer.arrayDeserializer(RuntimeFieldsType._DESERIALIZER),
				"field_types");

	}

}
