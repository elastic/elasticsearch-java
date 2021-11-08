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

package co.elastic.clients.elasticsearch.indices.get_field_mapping;

import co.elastic.clients.elasticsearch._types.mapping.FieldMapping;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_field_mapping.TypeFieldMappings
@JsonpDeserializable
public class TypeFieldMappings implements JsonpSerializable {
	private final FieldMapping mappings;

	// ---------------------------------------------------------------------------------------------

	private TypeFieldMappings(Builder builder) {

		this.mappings = ModelTypeHelper.requireNonNull(builder.mappings, this, "mappings");

	}

	public static TypeFieldMappings of(Function<Builder, ObjectBuilder<TypeFieldMappings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public final FieldMapping mappings() {
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

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeFieldMappings}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TypeFieldMappings> {
		private FieldMapping mappings;

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(FieldMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(Function<FieldMapping.Builder, ObjectBuilder<FieldMapping>> fn) {
			return this.mappings(fn.apply(new FieldMapping.Builder()).build());
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
			.lazy(Builder::new, TypeFieldMappings::setupTypeFieldMappingsDeserializer, Builder::build);

	protected static void setupTypeFieldMappingsDeserializer(DelegatingDeserializer<TypeFieldMappings.Builder> op) {

		op.add(Builder::mappings, FieldMapping._DESERIALIZER, "mappings");

	}

}
