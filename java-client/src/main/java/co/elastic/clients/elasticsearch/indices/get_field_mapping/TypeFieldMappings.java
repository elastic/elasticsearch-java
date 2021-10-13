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
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_field_mapping.TypeFieldMappings
@JsonpDeserializable
public final class TypeFieldMappings implements JsonpSerializable {
	private final Map<String, FieldMapping> mappings;

	// ---------------------------------------------------------------------------------------------

	public TypeFieldMappings(Builder builder) {

		this.mappings = ModelTypeHelper.unmodifiableNonNull(builder.mappings, "mappings");

	}

	public TypeFieldMappings(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public Map<String, FieldMapping> mappings() {
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
		generator.writeStartObject();
		for (Map.Entry<String, FieldMapping> item0 : this.mappings.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeFieldMappings}.
	 */
	public static class Builder implements ObjectBuilder<TypeFieldMappings> {
		private Map<String, FieldMapping> mappings;

		/**
		 * Required - API name: {@code mappings}
		 */
		public Builder mappings(Map<String, FieldMapping> value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #mappings(Map)}, creating the map if needed.
		 */
		public Builder putMappings(String key, FieldMapping value) {
			if (this.mappings == null) {
				this.mappings = new HashMap<>();
			}
			this.mappings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #mappings(Map)} to a singleton map.
		 */
		public Builder mappings(String key, Function<FieldMapping.Builder, ObjectBuilder<FieldMapping>> fn) {
			return this.mappings(Collections.singletonMap(key, fn.apply(new FieldMapping.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #mappings(Map)}, creating the map if needed.
		 */
		public Builder putMappings(String key, Function<FieldMapping.Builder, ObjectBuilder<FieldMapping>> fn) {
			return this.putMappings(key, fn.apply(new FieldMapping.Builder()).build());
		}

		/**
		 * Builds a {@link TypeFieldMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TypeFieldMappings build() {

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

		op.add(Builder::mappings, JsonpDeserializer.stringMapDeserializer(FieldMapping._DESERIALIZER), "mappings");

	}

}
