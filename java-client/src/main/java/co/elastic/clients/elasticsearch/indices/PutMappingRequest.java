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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.mapping.DynamicTemplate;
import co.elastic.clients.elasticsearch._types.mapping.FieldNamesField;
import co.elastic.clients.elasticsearch._types.mapping.RoutingField;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.mapping.SourceField;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.put_mapping.Request
public final class PutMappingRequest extends RequestBase implements JsonpSerializable {
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeTypeName;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final Boolean writeIndexOnly;

	@Nullable
	private final Boolean dateDetection;

	@Nullable
	private final JsonValue dynamic;

	@Nullable
	private final List<String> dynamicDateFormats;

	@Nullable
	private final List<Map<String, DynamicTemplate>> dynamicTemplates;

	@Nullable
	private final FieldNamesField fieldNames;

	@Nullable
	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean numericDetection;

	@Nullable
	private final Map<String, JsonValue> properties;

	@Nullable
	private final RoutingField routing;

	@Nullable
	private final SourceField source;

	@Nullable
	private final Map<String, RuntimeField> runtime;

	// ---------------------------------------------------------------------------------------------

	public PutMappingRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = builder.expandWildcards;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeTypeName = builder.includeTypeName;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.writeIndexOnly = builder.writeIndexOnly;
		this.dateDetection = builder.dateDetection;
		this.dynamic = builder.dynamic;
		this.dynamicDateFormats = builder.dynamicDateFormats;
		this.dynamicTemplates = builder.dynamicTemplates;
		this.fieldNames = builder.fieldNames;
		this.meta = builder.meta;
		this.numericDetection = builder.numericDetection;
		this.properties = builder.properties;
		this.routing = builder.routing;
		this.source = builder.source;
		this.runtime = builder.runtime;

	}

	/**
	 * A comma-separated list of index names the mapping should be added to
	 * (supports wildcards); use <code>_all</code> or omit to add the mapping on all
	 * indices.
	 * <p>
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * When true, applies mappings only to the write index of an alias or data
	 * stream
	 * <p>
	 * API name: {@code write_index_only}
	 */
	@Nullable
	public Boolean writeIndexOnly() {
		return this.writeIndexOnly;
	}

	/**
	 * Controls whether dynamic date detection is enabled.
	 * <p>
	 * API name: {@code date_detection}
	 */
	@Nullable
	public Boolean dateDetection() {
		return this.dateDetection;
	}

	/**
	 * Controls whether new fields are added dynamically.
	 * <p>
	 * API name: {@code dynamic}
	 */
	@Nullable
	public JsonValue dynamic() {
		return this.dynamic;
	}

	/**
	 * If date detection is enabled then new string fields are checked against
	 * 'dynamic_date_formats' and if the value matches then a new date field is
	 * added instead of string.
	 * <p>
	 * API name: {@code dynamic_date_formats}
	 */
	@Nullable
	public List<String> dynamicDateFormats() {
		return this.dynamicDateFormats;
	}

	/**
	 * Specify dynamic templates for the mapping.
	 * <p>
	 * API name: {@code dynamic_templates}
	 */
	@Nullable
	public List<Map<String, DynamicTemplate>> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * Control whether field names are enabled for the index.
	 * <p>
	 * API name: {@code _field_names}
	 */
	@Nullable
	public FieldNamesField fieldNames() {
		return this.fieldNames;
	}

	/**
	 * A mapping type can have custom meta data associated with it. These are not
	 * used at all by Elasticsearch, but can be used to store application-specific
	 * metadata.
	 * <p>
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Automatically map strings into numeric data types for all fields.
	 * <p>
	 * API name: {@code numeric_detection}
	 */
	@Nullable
	public Boolean numericDetection() {
		return this.numericDetection;
	}

	/**
	 * Mapping for a field. For new fields, this mapping can include:
	 * <ul>
	 * <li>Field name</li>
	 * <li>Field data type</li>
	 * <li>Mapping parameters</li>
	 * </ul>
	 * <p>
	 * API name: {@code properties}
	 */
	@Nullable
	public Map<String, JsonValue> properties() {
		return this.properties;
	}

	/**
	 * Enable making a routing value required on indexed documents.
	 * <p>
	 * API name: {@code _routing}
	 */
	@Nullable
	public RoutingField routing() {
		return this.routing;
	}

	/**
	 * Control whether the _source field is enabled on the index.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public SourceField source() {
		return this.source;
	}

	/**
	 * Mapping of runtime fields for the index.
	 * <p>
	 * API name: {@code runtime}
	 */
	@Nullable
	public Map<String, RuntimeField> runtime() {
		return this.runtime;
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

		if (this.dateDetection != null) {

			generator.writeKey("date_detection");
			generator.write(this.dateDetection);

		}
		if (this.dynamic != null) {

			generator.writeKey("dynamic");
			generator.write(this.dynamic);

		}
		if (this.dynamicDateFormats != null) {

			generator.writeKey("dynamic_date_formats");
			generator.writeStartArray();
			for (String item0 : this.dynamicDateFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.dynamicTemplates != null) {

			generator.writeKey("dynamic_templates");
			generator.writeStartArray();
			for (Map<String, DynamicTemplate> item0 : this.dynamicTemplates) {
				generator.writeStartObject();
				for (Map.Entry<String, DynamicTemplate> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					item1.getValue().serialize(generator, mapper);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.fieldNames != null) {

			generator.writeKey("_field_names");
			this.fieldNames.serialize(generator, mapper);

		}
		if (this.meta != null) {

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
		if (this.properties != null) {

			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.routing != null) {

			generator.writeKey("_routing");
			this.routing.serialize(generator, mapper);

		}
		if (this.source != null) {

			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (this.runtime != null) {

			generator.writeKey("runtime");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtime.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutMappingRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutMappingRequest> {
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeTypeName;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private Boolean writeIndexOnly;

		@Nullable
		private Boolean dateDetection;

		@Nullable
		private JsonValue dynamic;

		@Nullable
		private List<String> dynamicDateFormats;

		@Nullable
		private List<Map<String, DynamicTemplate>> dynamicTemplates;

		@Nullable
		private FieldNamesField fieldNames;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean numericDetection;

		@Nullable
		private Map<String, JsonValue> properties;

		@Nullable
		private RoutingField routing;

		@Nullable
		private SourceField source;

		@Nullable
		private Map<String, RuntimeField> runtime;

		/**
		 * A comma-separated list of index names the mapping should be added to
		 * (supports wildcards); use <code>_all</code> or omit to add the mapping on all
		 * indices.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names the mapping should be added to
		 * (supports wildcards); use <code>_all</code> or omit to add the mapping on all
		 * indices.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code include_type_name}
		 */
		public Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * When true, applies mappings only to the write index of an alias or data
		 * stream
		 * <p>
		 * API name: {@code write_index_only}
		 */
		public Builder writeIndexOnly(@Nullable Boolean value) {
			this.writeIndexOnly = value;
			return this;
		}

		/**
		 * Controls whether dynamic date detection is enabled.
		 * <p>
		 * API name: {@code date_detection}
		 */
		public Builder dateDetection(@Nullable Boolean value) {
			this.dateDetection = value;
			return this;
		}

		/**
		 * Controls whether new fields are added dynamically.
		 * <p>
		 * API name: {@code dynamic}
		 */
		public Builder dynamic(@Nullable JsonValue value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * If date detection is enabled then new string fields are checked against
		 * 'dynamic_date_formats' and if the value matches then a new date field is
		 * added instead of string.
		 * <p>
		 * API name: {@code dynamic_date_formats}
		 */
		public Builder dynamicDateFormats(@Nullable List<String> value) {
			this.dynamicDateFormats = value;
			return this;
		}

		/**
		 * If date detection is enabled then new string fields are checked against
		 * 'dynamic_date_formats' and if the value matches then a new date field is
		 * added instead of string.
		 * <p>
		 * API name: {@code dynamic_date_formats}
		 */
		public Builder dynamicDateFormats(String... value) {
			this.dynamicDateFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dynamicDateFormats(List)}, creating the list if
		 * needed.
		 */
		public Builder addDynamicDateFormats(String value) {
			if (this.dynamicDateFormats == null) {
				this.dynamicDateFormats = new ArrayList<>();
			}
			this.dynamicDateFormats.add(value);
			return this;
		}

		/**
		 * Specify dynamic templates for the mapping.
		 * <p>
		 * API name: {@code dynamic_templates}
		 */
		public Builder dynamicTemplates(@Nullable List<Map<String, DynamicTemplate>> value) {
			this.dynamicTemplates = value;
			return this;
		}

		/**
		 * Specify dynamic templates for the mapping.
		 * <p>
		 * API name: {@code dynamic_templates}
		 */
		public Builder dynamicTemplates(Map<String, DynamicTemplate>... value) {
			this.dynamicTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dynamicTemplates(List)}, creating the list if needed.
		 */
		public Builder addDynamicTemplates(Map<String, DynamicTemplate> value) {
			if (this.dynamicTemplates == null) {
				this.dynamicTemplates = new ArrayList<>();
			}
			this.dynamicTemplates.add(value);
			return this;
		}

		/**
		 * Control whether field names are enabled for the index.
		 * <p>
		 * API name: {@code _field_names}
		 */
		public Builder fieldNames(@Nullable FieldNamesField value) {
			this.fieldNames = value;
			return this;
		}

		/**
		 * Control whether field names are enabled for the index.
		 * <p>
		 * API name: {@code _field_names}
		 */
		public Builder fieldNames(Function<FieldNamesField.Builder, ObjectBuilder<FieldNamesField>> fn) {
			return this.fieldNames(fn.apply(new FieldNamesField.Builder()).build());
		}

		/**
		 * A mapping type can have custom meta data associated with it. These are not
		 * used at all by Elasticsearch, but can be used to store application-specific
		 * metadata.
		 * <p>
		 * API name: {@code _meta}
		 */
		public Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder put_meta(String key, JsonData value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * Automatically map strings into numeric data types for all fields.
		 * <p>
		 * API name: {@code numeric_detection}
		 */
		public Builder numericDetection(@Nullable Boolean value) {
			this.numericDetection = value;
			return this;
		}

		/**
		 * Mapping for a field. For new fields, this mapping can include:
		 * <ul>
		 * <li>Field name</li>
		 * <li>Field data type</li>
		 * <li>Mapping parameters</li>
		 * </ul>
		 * <p>
		 * API name: {@code properties}
		 */
		public Builder properties(@Nullable Map<String, JsonValue> value) {
			this.properties = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #properties(Map)}, creating the map if needed.
		 */
		public Builder putProperties(String key, JsonValue value) {
			if (this.properties == null) {
				this.properties = new HashMap<>();
			}
			this.properties.put(key, value);
			return this;
		}

		/**
		 * Enable making a routing value required on indexed documents.
		 * <p>
		 * API name: {@code _routing}
		 */
		public Builder routing(@Nullable RoutingField value) {
			this.routing = value;
			return this;
		}

		/**
		 * Enable making a routing value required on indexed documents.
		 * <p>
		 * API name: {@code _routing}
		 */
		public Builder routing(Function<RoutingField.Builder, ObjectBuilder<RoutingField>> fn) {
			return this.routing(fn.apply(new RoutingField.Builder()).build());
		}

		/**
		 * Control whether the _source field is enabled on the index.
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable SourceField value) {
			this.source = value;
			return this;
		}

		/**
		 * Control whether the _source field is enabled on the index.
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder source(Function<SourceField.Builder, ObjectBuilder<SourceField>> fn) {
			return this.source(fn.apply(new SourceField.Builder()).build());
		}

		/**
		 * Mapping of runtime fields for the index.
		 * <p>
		 * API name: {@code runtime}
		 */
		public Builder runtime(@Nullable Map<String, RuntimeField> value) {
			this.runtime = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #runtime(Map)}, creating the map if needed.
		 */
		public Builder putRuntime(String key, RuntimeField value) {
			if (this.runtime == null) {
				this.runtime = new HashMap<>();
			}
			this.runtime.put(key, value);
			return this;
		}

		/**
		 * Set {@link #runtime(Map)} to a singleton map.
		 */
		public Builder runtime(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtime(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #runtime(Map)}, creating the map if needed.
		 */
		public Builder putRuntime(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.putRuntime(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Builds a {@link PutMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutMappingRequest build() {

			return new PutMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutMappingRequest}
	 */
	public static final JsonpDeserializer<PutMappingRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutMappingRequest::setupPutMappingRequestDeserializer);

	protected static void setupPutMappingRequestDeserializer(DelegatingDeserializer<PutMappingRequest.Builder> op) {

		op.add(Builder::dateDetection, JsonpDeserializer.booleanDeserializer(), "date_detection");
		op.add(Builder::dynamic, JsonpDeserializer.jsonValueDeserializer(), "dynamic");
		op.add(Builder::dynamicDateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"dynamic_date_formats");
		op.add(Builder::dynamicTemplates, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(DynamicTemplate.DESERIALIZER)), "dynamic_templates");
		op.add(Builder::fieldNames, FieldNamesField.DESERIALIZER, "_field_names");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "_meta");
		op.add(Builder::numericDetection, JsonpDeserializer.booleanDeserializer(), "numeric_detection");
		op.add(Builder::properties, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"properties");
		op.add(Builder::routing, RoutingField.DESERIALIZER, "_routing");
		op.add(Builder::source, SourceField.DESERIALIZER, "_source");
		op.add(Builder::runtime, JsonpDeserializer.stringMapDeserializer(RuntimeField.DESERIALIZER), "runtime");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_mapping}".
	 */
	public static final Endpoint<PutMappingRequest, PutMappingResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_mapping");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.includeTypeName != null) {
					params.put("include_type_name", String.valueOf(request.includeTypeName));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.writeIndexOnly != null) {
					params.put("write_index_only", String.valueOf(request.writeIndexOnly));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutMappingResponse.DESERIALIZER);
}
