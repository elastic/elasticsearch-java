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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.FieldMapping
@JsonpDeserializable
public final class FieldMapping implements JsonpSerializable {
	// Single key dictionary
	private final String field;

	private final String fullName;

	private final Map<String, Property> mapping;

	// ---------------------------------------------------------------------------------------------

	public FieldMapping(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");

		this.fullName = Objects.requireNonNull(builder.fullName, "full_name");
		this.mapping = ModelTypeHelper.unmodifiableNonNull(builder.mapping, "mapping");

	}

	public FieldMapping(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The target field
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code full_name}
	 */
	public String fullName() {
		return this.fullName;
	}

	/**
	 * Required - API name: {@code mapping}
	 */
	public Map<String, Property> mapping() {
		return this.mapping;
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
		generator.writeStartObject(this.field);

		generator.writeKey("full_name");
		generator.write(this.fullName);

		generator.writeKey("mapping");
		generator.writeStartObject();
		for (Map.Entry<String, Property> item0 : this.mapping.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldMapping}.
	 */
	public static class Builder implements ObjectBuilder<FieldMapping> {
		private String field;

		/**
		 * Required - The target field
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		private String fullName;

		private Map<String, Property> mapping;

		/**
		 * Required - API name: {@code full_name}
		 */
		public Builder fullName(String value) {
			this.fullName = value;
			return this;
		}

		/**
		 * Required - API name: {@code mapping}
		 */
		public Builder mapping(Map<String, Property> value) {
			this.mapping = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #mapping(Map)}, creating the map if needed.
		 */
		public Builder putMapping(String key, Property value) {
			if (this.mapping == null) {
				this.mapping = new HashMap<>();
			}
			this.mapping.put(key, value);
			return this;
		}

		/**
		 * Set {@link #mapping(Map)} to a singleton map.
		 */
		public Builder mapping(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.mapping(Collections.singletonMap(key, fn.apply(new Property.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #mapping(Map)}, creating the map if needed.
		 */
		public Builder putMapping(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.putMapping(key, fn.apply(new Property.Builder()).build());
		}

		/**
		 * Builds a {@link FieldMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldMapping build() {

			return new FieldMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldMapping}
	 */
	public static final JsonpDeserializer<FieldMapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldMapping::setupFieldMappingDeserializer, Builder::build);

	protected static void setupFieldMappingDeserializer(DelegatingDeserializer<FieldMapping.Builder> op) {

		op.add(Builder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(Builder::mapping, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "mapping");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

}
