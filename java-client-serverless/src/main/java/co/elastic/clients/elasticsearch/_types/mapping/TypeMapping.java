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

import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.TypeMapping

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.TypeMapping">API
 *      specification</a>
 */
@JsonpDeserializable
public class TypeMapping implements JsonpSerializable {
	@Nullable
	private final AllField allField;

	@Nullable
	private final Boolean dateDetection;

	@Nullable
	private final DynamicMapping dynamic;

	private final List<String> dynamicDateFormats;

	private final List<Map<String, DynamicTemplate>> dynamicTemplates;

	@Nullable
	private final FieldNamesField fieldNames;

	@Nullable
	private final IndexField indexField;

	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean numericDetection;

	private final Map<String, Property> properties;

	@Nullable
	private final RoutingField routing;

	@Nullable
	private final SizeField size;

	@Nullable
	private final SourceField source;

	private final Map<String, RuntimeField> runtime;

	@Nullable
	private final Boolean enabled;

	@Nullable
	private final DataStreamTimestamp dataStreamTimestamp;

	// ---------------------------------------------------------------------------------------------

	private TypeMapping(Builder builder) {

		this.allField = builder.allField;
		this.dateDetection = builder.dateDetection;
		this.dynamic = builder.dynamic;
		this.dynamicDateFormats = ApiTypeHelper.unmodifiable(builder.dynamicDateFormats);
		this.dynamicTemplates = ApiTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.fieldNames = builder.fieldNames;
		this.indexField = builder.indexField;
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.numericDetection = builder.numericDetection;
		this.properties = ApiTypeHelper.unmodifiable(builder.properties);
		this.routing = builder.routing;
		this.size = builder.size;
		this.source = builder.source;
		this.runtime = ApiTypeHelper.unmodifiable(builder.runtime);
		this.enabled = builder.enabled;
		this.dataStreamTimestamp = builder.dataStreamTimestamp;

	}

	public static TypeMapping of(Function<Builder, ObjectBuilder<TypeMapping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code all_field}
	 */
	@Nullable
	public final AllField allField() {
		return this.allField;
	}

	/**
	 * API name: {@code date_detection}
	 */
	@Nullable
	public final Boolean dateDetection() {
		return this.dateDetection;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public final DynamicMapping dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code dynamic_date_formats}
	 */
	public final List<String> dynamicDateFormats() {
		return this.dynamicDateFormats;
	}

	/**
	 * API name: {@code dynamic_templates}
	 */
	public final List<Map<String, DynamicTemplate>> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * API name: {@code _field_names}
	 */
	@Nullable
	public final FieldNamesField fieldNames() {
		return this.fieldNames;
	}

	/**
	 * API name: {@code index_field}
	 */
	@Nullable
	public final IndexField indexField() {
		return this.indexField;
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code numeric_detection}
	 */
	@Nullable
	public final Boolean numericDetection() {
		return this.numericDetection;
	}

	/**
	 * API name: {@code properties}
	 */
	public final Map<String, Property> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public final RoutingField routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _size}
	 */
	@Nullable
	public final SizeField size() {
		return this.size;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceField source() {
		return this.source;
	}

	/**
	 * API name: {@code runtime}
	 */
	public final Map<String, RuntimeField> runtime() {
		return this.runtime;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code _data_stream_timestamp}
	 */
	@Nullable
	public final DataStreamTimestamp dataStreamTimestamp() {
		return this.dataStreamTimestamp;
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

		if (this.allField != null) {
			generator.writeKey("all_field");
			this.allField.serialize(generator, mapper);

		}
		if (this.dateDetection != null) {
			generator.writeKey("date_detection");
			generator.write(this.dateDetection);

		}
		if (this.dynamic != null) {
			generator.writeKey("dynamic");
			this.dynamic.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.dynamicDateFormats)) {
			generator.writeKey("dynamic_date_formats");
			generator.writeStartArray();
			for (String item0 : this.dynamicDateFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.dynamicTemplates)) {
			generator.writeKey("dynamic_templates");
			generator.writeStartArray();
			for (Map<String, DynamicTemplate> item0 : this.dynamicTemplates) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, DynamicTemplate> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.fieldNames != null) {
			generator.writeKey("_field_names");
			this.fieldNames.serialize(generator, mapper);

		}
		if (this.indexField != null) {
			generator.writeKey("index_field");
			this.indexField.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.numericDetection != null) {
			generator.writeKey("numeric_detection");
			generator.write(this.numericDetection);

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
		if (this.routing != null) {
			generator.writeKey("_routing");
			this.routing.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("_size");
			this.size.serialize(generator, mapper);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.runtime)) {
			generator.writeKey("runtime");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtime.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.dataStreamTimestamp != null) {
			generator.writeKey("_data_stream_timestamp");
			this.dataStreamTimestamp.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeMapping}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TypeMapping> {
		@Nullable
		private AllField allField;

		@Nullable
		private Boolean dateDetection;

		@Nullable
		private DynamicMapping dynamic;

		@Nullable
		private List<String> dynamicDateFormats;

		@Nullable
		private List<Map<String, DynamicTemplate>> dynamicTemplates;

		@Nullable
		private FieldNamesField fieldNames;

		@Nullable
		private IndexField indexField;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean numericDetection;

		@Nullable
		private Map<String, Property> properties;

		@Nullable
		private RoutingField routing;

		@Nullable
		private SizeField size;

		@Nullable
		private SourceField source;

		@Nullable
		private Map<String, RuntimeField> runtime;

		@Nullable
		private Boolean enabled;

		@Nullable
		private DataStreamTimestamp dataStreamTimestamp;

		/**
		 * API name: {@code all_field}
		 */
		public final Builder allField(@Nullable AllField value) {
			this.allField = value;
			return this;
		}

		/**
		 * API name: {@code all_field}
		 */
		public final Builder allField(Function<AllField.Builder, ObjectBuilder<AllField>> fn) {
			return this.allField(fn.apply(new AllField.Builder()).build());
		}

		/**
		 * API name: {@code date_detection}
		 */
		public final Builder dateDetection(@Nullable Boolean value) {
			this.dateDetection = value;
			return this;
		}

		/**
		 * API name: {@code dynamic}
		 */
		public final Builder dynamic(@Nullable DynamicMapping value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_date_formats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dynamicDateFormats</code>.
		 */
		public final Builder dynamicDateFormats(List<String> list) {
			this.dynamicDateFormats = _listAddAll(this.dynamicDateFormats, list);
			return this;
		}

		/**
		 * API name: {@code dynamic_date_formats}
		 * <p>
		 * Adds one or more values to <code>dynamicDateFormats</code>.
		 */
		public final Builder dynamicDateFormats(String value, String... values) {
			this.dynamicDateFormats = _listAdd(this.dynamicDateFormats, value, values);
			return this;
		}

		/**
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dynamicTemplates</code>.
		 */
		public final Builder dynamicTemplates(List<Map<String, DynamicTemplate>> list) {
			this.dynamicTemplates = _listAddAll(this.dynamicTemplates, list);
			return this;
		}

		/**
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds one or more values to <code>dynamicTemplates</code>.
		 */
		public final Builder dynamicTemplates(Map<String, DynamicTemplate> value,
				Map<String, DynamicTemplate>... values) {
			this.dynamicTemplates = _listAdd(this.dynamicTemplates, value, values);
			return this;
		}

		/**
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(@Nullable FieldNamesField value) {
			this.fieldNames = value;
			return this;
		}

		/**
		 * API name: {@code _field_names}
		 */
		public final Builder fieldNames(Function<FieldNamesField.Builder, ObjectBuilder<FieldNamesField>> fn) {
			return this.fieldNames(fn.apply(new FieldNamesField.Builder()).build());
		}

		/**
		 * API name: {@code index_field}
		 */
		public final Builder indexField(@Nullable IndexField value) {
			this.indexField = value;
			return this;
		}

		/**
		 * API name: {@code index_field}
		 */
		public final Builder indexField(Function<IndexField.Builder, ObjectBuilder<IndexField>> fn) {
			return this.indexField(fn.apply(new IndexField.Builder()).build());
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * API name: {@code numeric_detection}
		 */
		public final Builder numericDetection(@Nullable Boolean value) {
			this.numericDetection = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>properties</code>.
		 */
		public final Builder properties(Map<String, Property> map) {
			this.properties = _mapPutAll(this.properties, map);
			return this;
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code>.
		 */
		public final Builder properties(String key, Property value) {
			this.properties = _mapPut(this.properties, key, value);
			return this;
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds an entry to <code>properties</code> using a builder lambda.
		 */
		public final Builder properties(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return properties(key, fn.apply(new Property.Builder()).build());
		}

		/**
		 * API name: {@code _routing}
		 */
		public final Builder routing(@Nullable RoutingField value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public final Builder routing(Function<RoutingField.Builder, ObjectBuilder<RoutingField>> fn) {
			return this.routing(fn.apply(new RoutingField.Builder()).build());
		}

		/**
		 * API name: {@code _size}
		 */
		public final Builder size(@Nullable SizeField value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code _size}
		 */
		public final Builder size(Function<SizeField.Builder, ObjectBuilder<SizeField>> fn) {
			return this.size(fn.apply(new SizeField.Builder()).build());
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceField value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(Function<SourceField.Builder, ObjectBuilder<SourceField>> fn) {
			return this.source(fn.apply(new SourceField.Builder()).build());
		}

		/**
		 * API name: {@code runtime}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtime</code>.
		 */
		public final Builder runtime(Map<String, RuntimeField> map) {
			this.runtime = _mapPutAll(this.runtime, map);
			return this;
		}

		/**
		 * API name: {@code runtime}
		 * <p>
		 * Adds an entry to <code>runtime</code>.
		 */
		public final Builder runtime(String key, RuntimeField value) {
			this.runtime = _mapPut(this.runtime, key, value);
			return this;
		}

		/**
		 * API name: {@code runtime}
		 * <p>
		 * Adds an entry to <code>runtime</code> using a builder lambda.
		 */
		public final Builder runtime(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtime(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code _data_stream_timestamp}
		 */
		public final Builder dataStreamTimestamp(@Nullable DataStreamTimestamp value) {
			this.dataStreamTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code _data_stream_timestamp}
		 */
		public final Builder dataStreamTimestamp(
				Function<DataStreamTimestamp.Builder, ObjectBuilder<DataStreamTimestamp>> fn) {
			return this.dataStreamTimestamp(fn.apply(new DataStreamTimestamp.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TypeMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TypeMapping build() {
			_checkSingleUse();

			return new TypeMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TypeMapping}
	 */
	public static final JsonpDeserializer<TypeMapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TypeMapping::setupTypeMappingDeserializer);

	protected static void setupTypeMappingDeserializer(ObjectDeserializer<TypeMapping.Builder> op) {

		op.add(Builder::allField, AllField._DESERIALIZER, "all_field");
		op.add(Builder::dateDetection, JsonpDeserializer.booleanDeserializer(), "date_detection");
		op.add(Builder::dynamic, DynamicMapping._DESERIALIZER, "dynamic");
		op.add(Builder::dynamicDateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"dynamic_date_formats");
		op.add(Builder::dynamicTemplates, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(DynamicTemplate._DESERIALIZER)), "dynamic_templates");
		op.add(Builder::fieldNames, FieldNamesField._DESERIALIZER, "_field_names");
		op.add(Builder::indexField, IndexField._DESERIALIZER, "index_field");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::numericDetection, JsonpDeserializer.booleanDeserializer(), "numeric_detection");
		op.add(Builder::properties, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "properties");
		op.add(Builder::routing, RoutingField._DESERIALIZER, "_routing");
		op.add(Builder::size, SizeField._DESERIALIZER, "_size");
		op.add(Builder::source, SourceField._DESERIALIZER, "_source");
		op.add(Builder::runtime, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER), "runtime");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::dataStreamTimestamp, DataStreamTimestamp._DESERIALIZER, "_data_stream_timestamp");

	}

}
