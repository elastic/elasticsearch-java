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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.get_field_mapping.TypeFieldMappings
public final class TypeFieldMappings implements ToJsonp {
	private final Map<String, JsonValue> mappings;

	// ---------------------------------------------------------------------------------------------

	protected TypeFieldMappings(Builder builder) {

		this.mappings = Objects.requireNonNull(builder.mappings, "mappings");

	}

	/**
	 * API name: {@code mappings}
	 */
	public Map<String, JsonValue> mappings() {
		return this.mappings;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("mappings");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.mappings.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeFieldMappings}.
	 */
	public static class Builder implements ObjectBuilder<TypeFieldMappings> {
		private Map<String, JsonValue> mappings;

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(Map<String, JsonValue> value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #mappings(Map)}, creating the map if needed.
		 */
		public Builder putMappings(String key, JsonValue value) {
			if (this.mappings == null) {
				this.mappings = new HashMap<>();
			}
			this.mappings.put(key, value);
			return this;
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
	 * Json deserializer for TypeFieldMappings
	 */
	public static final JsonpDeserializer<TypeFieldMappings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TypeFieldMappings::setupTypeFieldMappingsDeserializer);

	protected static void setupTypeFieldMappingsDeserializer(DelegatingDeserializer<TypeFieldMappings.Builder> op) {

		op.add(Builder::mappings, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"mappings");

	}

}
