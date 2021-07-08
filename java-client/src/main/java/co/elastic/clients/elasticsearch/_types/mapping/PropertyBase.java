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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: _types.mapping.PropertyBase
public class PropertyBase implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> localMetadata;

	@Nullable
	private final Map<String, String> meta;

	@Nullable
	private final String name;

	@Nullable
	private final Map<String, JsonValue> properties;

	@Nullable
	private final Number ignoreAbove;

	@Nullable
	private final JsonValue dynamic;

	@Nullable
	private final Map<String, JsonValue> fields;

	// ---------------------------------------------------------------------------------------------

	protected PropertyBase(AbstractBuilder<?> builder) {

		this.localMetadata = builder.localMetadata;
		this.meta = builder.meta;
		this.name = builder.name;
		this.properties = builder.properties;
		this.ignoreAbove = builder.ignoreAbove;
		this.dynamic = builder.dynamic;
		this.fields = builder.fields;

	}

	/**
	 * API name: {@code local_metadata}
	 */
	@Nullable
	public Map<String, JsonValue> localMetadata() {
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
	public Map<String, JsonValue> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code ignore_above}
	 */
	@Nullable
	public Number ignoreAbove() {
		return this.ignoreAbove;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public JsonValue dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonValue> fields() {
		return this.fields;
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

		if (this.localMetadata != null) {

			generator.writeKey("local_metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.localMetadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
			for (Map.Entry<String, JsonValue> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.ignoreAbove != null) {

			generator.writeKey("ignore_above");
			generator.write(this.ignoreAbove.doubleValue());

		}
		if (this.dynamic != null) {

			generator.writeKey("dynamic");
			generator.write(this.dynamic);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PropertyBase}.
	 */
	public static class Builder extends PropertyBase.AbstractBuilder<Builder> implements ObjectBuilder<PropertyBase> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PropertyBase}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PropertyBase build() {

			return new PropertyBase(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private Map<String, JsonValue> localMetadata;

		@Nullable
		private Map<String, String> meta;

		@Nullable
		private String name;

		@Nullable
		private Map<String, JsonValue> properties;

		@Nullable
		private Number ignoreAbove;

		@Nullable
		private JsonValue dynamic;

		@Nullable
		private Map<String, JsonValue> fields;

		/**
		 * API name: {@code local_metadata}
		 */
		public BuilderT localMetadata(@Nullable Map<String, JsonValue> value) {
			this.localMetadata = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #localMetadata(Map)}, creating the map if needed.
		 */
		public BuilderT putLocalMetadata(String key, JsonValue value) {
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
		public BuilderT properties(@Nullable Map<String, JsonValue> value) {
			this.properties = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #properties(Map)}, creating the map if needed.
		 */
		public BuilderT putProperties(String key, JsonValue value) {
			if (this.properties == null) {
				this.properties = new HashMap<>();
			}
			this.properties.put(key, value);
			return self();
		}

		/**
		 * API name: {@code ignore_above}
		 */
		public BuilderT ignoreAbove(@Nullable Number value) {
			this.ignoreAbove = value;
			return self();
		}

		/**
		 * API name: {@code dynamic}
		 */
		public BuilderT dynamic(@Nullable JsonValue value) {
			this.dynamic = value;
			return self();
		}

		/**
		 * API name: {@code fields}
		 */
		public BuilderT fields(@Nullable Map<String, JsonValue> value) {
			this.fields = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public BuilderT putFields(String key, JsonValue value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PropertyBase
	 */
	public static final JsonpDeserializer<PropertyBase> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PropertyBase::setupPropertyBaseDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPropertyBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::localMetadata,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "local_metadata");
		op.add(AbstractBuilder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"meta");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(AbstractBuilder::properties,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "properties");
		op.add(AbstractBuilder::ignoreAbove, JsonpDeserializer.numberDeserializer(), "ignore_above");
		op.add(AbstractBuilder::dynamic, JsonpDeserializer.jsonValueDeserializer(), "dynamic");
		op.add(AbstractBuilder::fields,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "fields");

	}

}
