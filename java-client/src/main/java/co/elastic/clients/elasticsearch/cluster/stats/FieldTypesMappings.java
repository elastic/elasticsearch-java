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

package co.elastic.clients.elasticsearch.cluster.stats;

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

// typedef: cluster.stats.FieldTypesMappings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.FieldTypesMappings">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldTypesMappings implements JsonpSerializable {
	private final List<FieldTypes> fieldTypes;

	private final List<RuntimeFieldTypes> runtimeFieldTypes;

	// ---------------------------------------------------------------------------------------------

	private FieldTypesMappings(Builder builder) {

		this.fieldTypes = ApiTypeHelper.unmodifiableRequired(builder.fieldTypes, this, "fieldTypes");
		this.runtimeFieldTypes = ApiTypeHelper.unmodifiable(builder.runtimeFieldTypes);

	}

	public static FieldTypesMappings of(Function<Builder, ObjectBuilder<FieldTypesMappings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field_types}
	 */
	public final List<FieldTypes> fieldTypes() {
		return this.fieldTypes;
	}

	/**
	 * API name: {@code runtime_field_types}
	 */
	public final List<RuntimeFieldTypes> runtimeFieldTypes() {
		return this.runtimeFieldTypes;
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

		if (ApiTypeHelper.isDefined(this.fieldTypes)) {
			generator.writeKey("field_types");
			generator.writeStartArray();
			for (FieldTypes item0 : this.fieldTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.runtimeFieldTypes)) {
			generator.writeKey("runtime_field_types");
			generator.writeStartArray();
			for (RuntimeFieldTypes item0 : this.runtimeFieldTypes) {
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
	 * Builder for {@link FieldTypesMappings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FieldTypesMappings> {
		private List<FieldTypes> fieldTypes;

		@Nullable
		private List<RuntimeFieldTypes> runtimeFieldTypes;

		/**
		 * Required - API name: {@code field_types}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fieldTypes</code>.
		 */
		public final Builder fieldTypes(List<FieldTypes> list) {
			this.fieldTypes = _listAddAll(this.fieldTypes, list);
			return this;
		}

		/**
		 * Required - API name: {@code field_types}
		 * <p>
		 * Adds one or more values to <code>fieldTypes</code>.
		 */
		public final Builder fieldTypes(FieldTypes value, FieldTypes... values) {
			this.fieldTypes = _listAdd(this.fieldTypes, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code field_types}
		 * <p>
		 * Adds a value to <code>fieldTypes</code> using a builder lambda.
		 */
		public final Builder fieldTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return fieldTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * API name: {@code runtime_field_types}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runtimeFieldTypes</code>.
		 */
		public final Builder runtimeFieldTypes(List<RuntimeFieldTypes> list) {
			this.runtimeFieldTypes = _listAddAll(this.runtimeFieldTypes, list);
			return this;
		}

		/**
		 * API name: {@code runtime_field_types}
		 * <p>
		 * Adds one or more values to <code>runtimeFieldTypes</code>.
		 */
		public final Builder runtimeFieldTypes(RuntimeFieldTypes value, RuntimeFieldTypes... values) {
			this.runtimeFieldTypes = _listAdd(this.runtimeFieldTypes, value, values);
			return this;
		}

		/**
		 * API name: {@code runtime_field_types}
		 * <p>
		 * Adds a value to <code>runtimeFieldTypes</code> using a builder lambda.
		 */
		public final Builder runtimeFieldTypes(
				Function<RuntimeFieldTypes.Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
			return runtimeFieldTypes(fn.apply(new RuntimeFieldTypes.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldTypesMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldTypesMappings build() {
			_checkSingleUse();

			return new FieldTypesMappings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldTypesMappings}
	 */
	public static final JsonpDeserializer<FieldTypesMappings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FieldTypesMappings::setupFieldTypesMappingsDeserializer);

	protected static void setupFieldTypesMappingsDeserializer(ObjectDeserializer<FieldTypesMappings.Builder> op) {

		op.add(Builder::fieldTypes, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER), "field_types");
		op.add(Builder::runtimeFieldTypes, JsonpDeserializer.arrayDeserializer(RuntimeFieldTypes._DESERIALIZER),
				"runtime_field_types");

	}

}
