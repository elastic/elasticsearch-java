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

package co.elastic.clients.elasticsearch.indices.get_field_mapping;

import co.elastic.clients.elasticsearch._types.mapping.FieldMapping;
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
import java.lang.String;
import java.util.Map;
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

// typedef: indices.get_field_mapping.TypeFieldMappings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_field_mapping.TypeFieldMappings">API
 *      specification</a>
 */
@JsonpDeserializable
public class TypeFieldMappings implements JsonpSerializable {
	private final Map<String, FieldMapping> mappings;

	// ---------------------------------------------------------------------------------------------

	private TypeFieldMappings(Builder builder) {

		this.mappings = ApiTypeHelper.unmodifiableRequired(builder.mappings, this, "mappings");

	}

	public static TypeFieldMappings of(Function<Builder, ObjectBuilder<TypeFieldMappings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public final Map<String, FieldMapping> mappings() {
		return this.mappings;
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

		if (ApiTypeHelper.isDefined(this.mappings)) {
			generator.writeKey("mappings");
			generator.writeStartObject();
			for (Map.Entry<String, FieldMapping> item0 : this.mappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link TypeFieldMappings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TypeFieldMappings> {
		private Map<String, FieldMapping> mappings;

		/**
		 * Required - API name: {@code mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>mappings</code>.
		 */
		public final Builder mappings(Map<String, FieldMapping> map) {
			this.mappings = _mapPutAll(this.mappings, map);
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 * <p>
		 * Adds an entry to <code>mappings</code>.
		 */
		public final Builder mappings(String key, FieldMapping value) {
			this.mappings = _mapPut(this.mappings, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 * <p>
		 * Adds an entry to <code>mappings</code> using a builder lambda.
		 */
		public final Builder mappings(String key, Function<FieldMapping.Builder, ObjectBuilder<FieldMapping>> fn) {
			return mappings(key, fn.apply(new FieldMapping.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TypeFieldMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TypeFieldMappings build() {
			_checkSingleUse();

			return new TypeFieldMappings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TypeFieldMappings}
	 */
	public static final JsonpDeserializer<TypeFieldMappings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TypeFieldMappings::setupTypeFieldMappingsDeserializer);

	protected static void setupTypeFieldMappingsDeserializer(ObjectDeserializer<TypeFieldMappings.Builder> op) {

		op.add(Builder::mappings, JsonpDeserializer.stringMapDeserializer(FieldMapping._DESERIALIZER), "mappings");

	}

}
