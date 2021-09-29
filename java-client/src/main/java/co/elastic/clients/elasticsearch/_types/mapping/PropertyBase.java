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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.PropertyBase

public abstract class PropertyBase implements JsonpSerializable {
	@Nullable
	private final Map<String, JsonData> localMetadata;

	@Nullable
	private final Map<String, String> meta;

	@Nullable
	private final String name;

	@Nullable
	private final Map<String, Property> properties;

	@Nullable
	private final Integer ignoreAbove;

	@Nullable
	private final JsonValue /* Union(internal.boolean | _types.mapping.DynamicMapping) */ dynamic;

	@Nullable
	private final Map<String, Property> fields;

	// ---------------------------------------------------------------------------------------------

	public PropertyBase(AbstractBuilder<?> builder) {

		this.localMetadata = ModelTypeHelper.unmodifiable(builder.localMetadata);
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.name = builder.name;
		this.properties = ModelTypeHelper.unmodifiable(builder.properties);
		this.ignoreAbove = builder.ignoreAbove;
		this.dynamic = builder.dynamic;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);

	}

	/**
	 * API name: {@code local_metadata}
	 */
	@Nullable
	public Map<String, JsonData> localMetadata() {
		return this.localMetadata;
	}

	/**
	 * API name: {@code meta}
	 */
	@Nullable
	public Map<String, String> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code properties}
	 */
	@Nullable
	public Map<String, Property> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code ignore_above}
	 */
	@Nullable
	public Integer ignoreAbove() {
		return this.ignoreAbove;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public JsonValue /* Union(internal.boolean | _types.mapping.DynamicMapping) */ dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, Property> fields() {
		return this.fields;
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

		if (this.localMetadata != null) {

			generator.writeKey("local_metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.localMetadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.meta != null) {

			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.properties != null) {

			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.ignoreAbove != null) {

			generator.writeKey("ignore_above");
			generator.write(this.ignoreAbove);

		}
		if (this.dynamic != null) {

			generator.writeKey("dynamic");
			generator.write(this.dynamic);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private Map<String, JsonData> localMetadata;

		@Nullable
		private Map<String, String> meta;

		@Nullable
		private String name;

		@Nullable
		private Map<String, Property> properties;

		@Nullable
		private Integer ignoreAbove;

		@Nullable
		private JsonValue /* Union(internal.boolean | _types.mapping.DynamicMapping) */ dynamic;

		@Nullable
		private Map<String, Property> fields;

		/**
		 * API name: {@code local_metadata}
		 */
		public BuilderT localMetadata(@Nullable Map<String, JsonData> value) {
			this.localMetadata = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #localMetadata(Map)}, creating the map if needed.
		 */
		public BuilderT putLocalMetadata(String key, JsonData value) {
			if (this.localMetadata == null) {
				this.localMetadata = new HashMap<>();
			}
			this.localMetadata.put(key, value);
			return self();
		}

		/**
		 * API name: {@code meta}
		 */
		public BuilderT meta(@Nullable Map<String, String> value) {
			this.meta = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public BuilderT putMeta(String key, String value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return self();
		}

		/**
		 * API name: {@code name}
		 */
		public BuilderT name(@Nullable String value) {
			this.name = value;
			return self();
		}

		/**
		 * API name: {@code properties}
		 */
		public BuilderT properties(@Nullable Map<String, Property> value) {
			this.properties = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #properties(Map)}, creating the map if needed.
		 */
		public BuilderT putProperties(String key, Property value) {
			if (this.properties == null) {
				this.properties = new HashMap<>();
			}
			this.properties.put(key, value);
			return self();
		}

		/**
		 * Set {@link #properties(Map)} to a singleton map.
		 */
		public BuilderT properties(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.properties(Collections.singletonMap(key, fn.apply(new Property.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #properties(Map)}, creating the map if needed.
		 */
		public BuilderT putProperties(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.putProperties(key, fn.apply(new Property.Builder()).build());
		}

		/**
		 * API name: {@code ignore_above}
		 */
		public BuilderT ignoreAbove(@Nullable Integer value) {
			this.ignoreAbove = value;
			return self();
		}

		/**
		 * API name: {@code dynamic}
		 */
		public BuilderT dynamic(
				@Nullable JsonValue /* Union(internal.boolean | _types.mapping.DynamicMapping) */ value) {
			this.dynamic = value;
			return self();
		}

		/**
		 * API name: {@code fields}
		 */
		public BuilderT fields(@Nullable Map<String, Property> value) {
			this.fields = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public BuilderT putFields(String key, Property value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return self();
		}

		/**
		 * Set {@link #fields(Map)} to a singleton map.
		 */
		public BuilderT fields(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.fields(Collections.singletonMap(key, fn.apply(new Property.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public BuilderT putFields(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.putFields(key, fn.apply(new Property.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPropertyBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::localMetadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"local_metadata");
		op.add(AbstractBuilder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"meta");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(AbstractBuilder::properties, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER),
				"properties");
		op.add(AbstractBuilder::ignoreAbove, JsonpDeserializer.integerDeserializer(), "ignore_above");
		op.add(AbstractBuilder::dynamic, JsonpDeserializer.jsonValueDeserializer(), "dynamic");
		op.add(AbstractBuilder::fields, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "fields");

	}

}
