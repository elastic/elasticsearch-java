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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.RuntimeFieldTypes
@JsonpDeserializable
public final class RuntimeFieldTypes extends Base {
	private final List<RuntimeFieldsType> fieldTypes;

	// ---------------------------------------------------------------------------------------------

	public RuntimeFieldTypes(Builder builder) {
		super(builder);

		this.fieldTypes = ModelTypeHelper.unmodifiableNonNull(builder.fieldTypes, "field_types");

	}

	public RuntimeFieldTypes(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code field_types}
	 */
	public List<RuntimeFieldsType> fieldTypes() {
		return this.fieldTypes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("field_types");
		generator.writeStartArray();
		for (RuntimeFieldsType item0 : this.fieldTypes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeFieldTypes}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<RuntimeFieldTypes> {
		private List<RuntimeFieldsType> fieldTypes;

		/**
		 * Required - API name: {@code field_types}
		 */
		public Builder fieldTypes(List<RuntimeFieldsType> value) {
			this.fieldTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code field_types}
		 */
		public Builder fieldTypes(RuntimeFieldsType... value) {
			this.fieldTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fieldTypes(List)}, creating the list if needed.
		 */
		public Builder addFieldTypes(RuntimeFieldsType value) {
			if (this.fieldTypes == null) {
				this.fieldTypes = new ArrayList<>();
			}
			this.fieldTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #fieldTypes(List)} to a singleton list.
		 */
		public Builder fieldTypes(Function<RuntimeFieldsType.Builder, ObjectBuilder<RuntimeFieldsType>> fn) {
			return this.fieldTypes(fn.apply(new RuntimeFieldsType.Builder()).build());
		}

		/**
		 * Add a value to {@link #fieldTypes(List)}, creating the list if needed.
		 */
		public Builder addFieldTypes(Function<RuntimeFieldsType.Builder, ObjectBuilder<RuntimeFieldsType>> fn) {
			return this.addFieldTypes(fn.apply(new RuntimeFieldsType.Builder()).build());
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

			return new RuntimeFieldTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuntimeFieldTypes}
	 */
	public static final JsonpDeserializer<RuntimeFieldTypes> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RuntimeFieldTypes::setupRuntimeFieldTypesDeserializer, Builder::build);

	protected static void setupRuntimeFieldTypesDeserializer(DelegatingDeserializer<RuntimeFieldTypes.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::fieldTypes, JsonpDeserializer.arrayDeserializer(RuntimeFieldsType._DESERIALIZER),
				"field_types");

	}

}
