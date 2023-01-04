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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.PropertyBase

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.PropertyBase">API
 *      specification</a>
 */

public abstract class PropertyBase implements JsonpSerializable {
	private final Map<String, String> meta;

	private final Map<String, Property> properties;

	@Nullable
	private final Integer ignoreAbove;

	@Nullable
	private final DynamicMapping dynamic;

	private final Map<String, Property> fields;

	// ---------------------------------------------------------------------------------------------

	protected PropertyBase(AbstractBuilder<?> builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.properties = ApiTypeHelper.unmodifiable(builder.properties);
		this.ignoreAbove = builder.ignoreAbove;
		this.dynamic = builder.dynamic;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);

	}

	/**
	 * Metadata about the field.
	 * <p>
	 * API name: {@code meta}
	 */
	public final Map<String, String> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code properties}
	 */
	public final Map<String, Property> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code ignore_above}
	 */
	@Nullable
	public final Integer ignoreAbove() {
		return this.ignoreAbove;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public final DynamicMapping dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, Property> fields() {
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

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.properties)) {
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
			this.dynamic.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.fields.entrySet()) {
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private Map<String, String> meta;

		@Nullable
		private Map<String, Property> properties;

		@Nullable
		private Integer ignoreAbove;

		@Nullable
		private DynamicMapping dynamic;

		@Nullable
		private Map<String, Property> fields;

		/**
		 * Metadata about the field.
		 * <p>
		 * API name: {@code meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final BuilderT meta(Map<String, String> map) {
			this.meta = _mapPutAll(this.meta, map);
			return self();
		}

		/**
		 * Metadata about the field.
		 * <p>
		 * API name: {@code meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final BuilderT meta(String key, String value) {
			this.meta = _mapPut(this.meta, key, value);
			return self();
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>properties</code>.
		 */
		public final BuilderT properties(Map<String, Property> map) {
			this.properties = _mapPutAll(this.properties, map);
			return self();
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code>.
		 */
		public final BuilderT properties(String key, Property value) {
			this.properties = _mapPut(this.properties, key, value);
			return self();
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code> using a builder lambda.
		 */
		public final BuilderT properties(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return properties(key, fn.apply(new Property.Builder()).build());
		}

		/**
		 * API name: {@code ignore_above}
		 */
		public final BuilderT ignoreAbove(@Nullable Integer value) {
			this.ignoreAbove = value;
			return self();
		}

		/**
		 * API name: {@code dynamic}
		 */
		public final BuilderT dynamic(@Nullable DynamicMapping value) {
			this.dynamic = value;
			return self();
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final BuilderT fields(Map<String, Property> map) {
			this.fields = _mapPutAll(this.fields, map);
			return self();
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final BuilderT fields(String key, Property value) {
			this.fields = _mapPut(this.fields, key, value);
			return self();
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final BuilderT fields(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return fields(key, fn.apply(new Property.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPropertyBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"meta");
		op.add(AbstractBuilder::properties, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER),
				"properties");
		op.add(AbstractBuilder::ignoreAbove, JsonpDeserializer.integerDeserializer(), "ignore_above");
		op.add(AbstractBuilder::dynamic, DynamicMapping._DESERIALIZER, "dynamic");
		op.add(AbstractBuilder::fields, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "fields");

	}

}
