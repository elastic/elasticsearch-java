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
import co.elastic.clients.elasticsearch._types.mapping.AllField;
import co.elastic.clients.elasticsearch._types.mapping.DynamicTemplate;
import co.elastic.clients.elasticsearch._types.mapping.FieldNamesField;
import co.elastic.clients.elasticsearch._types.mapping.IndexField;
import co.elastic.clients.elasticsearch._types.mapping.RoutingField;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.mapping.SizeField;
import co.elastic.clients.elasticsearch._types.mapping.SourceField;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
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
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.put_mapping.Request
public final class PutMappingRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final List<String> index;

	@Nullable
	private final String type;

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
	private final AllField allField;

	@Nullable
	private final Boolean dateDetection;

	@Nullable
	private final JsonValue dynamic;

	@Nullable
	private final List<String> dynamicDateFormats;

	@Nullable
	private final List<Map<String, DynamicTemplate>> dynamicTemplates;

	@Nullable
	private final FieldNamesField fieldNamesField;

	@Nullable
	private final IndexField indexField;

	@Nullable
	private final Map<String, JsonValue> meta;

	@Nullable
	private final Boolean numericDetection;

	@Nullable
	private final Map<String, JsonValue> properties;

	@Nullable
	private final RoutingField routingField;

	@Nullable
	private final SizeField sizeField;

	@Nullable
	private final SourceField sourceField;

	@Nullable
	private final Map<String, RuntimeField> runtime;

	// ---------------------------------------------------------------------------------------------

	protected PutMappingRequest(Builder builder) {

		this.index = builder.index;
		this.type = builder.type;
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = builder.expandWildcards;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeTypeName = builder.includeTypeName;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.writeIndexOnly = builder.writeIndexOnly;
		this.allField = builder.allField;
		this.dateDetection = builder.dateDetection;
		this.dynamic = builder.dynamic;
		this.dynamicDateFormats = builder.dynamicDateFormats;
		this.dynamicTemplates = builder.dynamicTemplates;
		this.fieldNamesField = builder.fieldNamesField;
		this.indexField = builder.indexField;
		this.meta = builder.meta;
		this.numericDetection = builder.numericDetection;
		this.properties = builder.properties;
		this.routingField = builder.routingField;
		this.sizeField = builder.sizeField;
		this.sourceField = builder.sourceField;
		this.runtime = builder.runtime;

	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
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
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code write_index_only}
	 */
	@Nullable
	public Boolean writeIndexOnly() {
		return this.writeIndexOnly;
	}

	/**
	 * API name: {@code all_field}
	 */
	@Nullable
	public AllField allField() {
		return this.allField;
	}

	/**
	 * API name: {@code date_detection}
	 */
	@Nullable
	public Boolean dateDetection() {
		return this.dateDetection;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public JsonValue dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code dynamic_date_formats}
	 */
	@Nullable
	public List<String> dynamicDateFormats() {
		return this.dynamicDateFormats;
	}

	/**
	 * API name: {@code dynamic_templates}
	 */
	@Nullable
	public List<Map<String, DynamicTemplate>> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * API name: {@code field_names_field}
	 */
	@Nullable
	public FieldNamesField fieldNamesField() {
		return this.fieldNamesField;
	}

	/**
	 * API name: {@code index_field}
	 */
	@Nullable
	public IndexField indexField() {
		return this.indexField;
	}

	/**
	 * API name: {@code meta}
	 */
	@Nullable
	public Map<String, JsonValue> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code numeric_detection}
	 */
	@Nullable
	public Boolean numericDetection() {
		return this.numericDetection;
	}

	/**
	 * API name: {@code properties}
	 */
	@Nullable
	public Map<String, JsonValue> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code routing_field}
	 */
	@Nullable
	public RoutingField routingField() {
		return this.routingField;
	}

	/**
	 * API name: {@code size_field}
	 */
	@Nullable
	public SizeField sizeField() {
		return this.sizeField;
	}

	/**
	 * API name: {@code source_field}
	 */
	@Nullable
	public SourceField sourceField() {
		return this.sourceField;
	}

	/**
	 * API name: {@code runtime}
	 */
	@Nullable
	public Map<String, RuntimeField> runtime() {
		return this.runtime;
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

		if (this.allField != null) {

			generator.writeKey("all_field");
			this.allField.toJsonp(generator, mapper);

		}
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
					item1.getValue().toJsonp(generator, mapper);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.fieldNamesField != null) {

			generator.writeKey("field_names_field");
			this.fieldNamesField.toJsonp(generator, mapper);

		}
		if (this.indexField != null) {

			generator.writeKey("index_field");
			this.indexField.toJsonp(generator, mapper);

		}
		if (this.meta != null) {

			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
		if (this.routingField != null) {

			generator.writeKey("routing_field");
			this.routingField.toJsonp(generator, mapper);

		}
		if (this.sizeField != null) {

			generator.writeKey("size_field");
			this.sizeField.toJsonp(generator, mapper);

		}
		if (this.sourceField != null) {

			generator.writeKey("source_field");
			this.sourceField.toJsonp(generator, mapper);

		}
		if (this.runtime != null) {

			generator.writeKey("runtime");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtime.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutMappingRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutMappingRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private String type;

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
		private AllField allField;

		@Nullable
		private Boolean dateDetection;

		@Nullable
		private JsonValue dynamic;

		@Nullable
		private List<String> dynamicDateFormats;

		@Nullable
		private List<Map<String, DynamicTemplate>> dynamicTemplates;

		@Nullable
		private FieldNamesField fieldNamesField;

		@Nullable
		private IndexField indexField;

		@Nullable
		private Map<String, JsonValue> meta;

		@Nullable
		private Boolean numericDetection;

		@Nullable
		private Map<String, JsonValue> properties;

		@Nullable
		private RoutingField routingField;

		@Nullable
		private SizeField sizeField;

		@Nullable
		private SourceField sourceField;

		@Nullable
		private Map<String, RuntimeField> runtime;

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
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
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
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
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code write_index_only}
		 */
		public Builder writeIndexOnly(@Nullable Boolean value) {
			this.writeIndexOnly = value;
			return this;
		}

		/**
		 * API name: {@code all_field}
		 */
		public Builder allField(@Nullable AllField value) {
			this.allField = value;
			return this;
		}

		/**
		 * API name: {@code all_field}
		 */
		public Builder allField(Function<AllField.Builder, ObjectBuilder<AllField>> fn) {
			return this.allField(fn.apply(new AllField.Builder()).build());
		}

		/**
		 * API name: {@code date_detection}
		 */
		public Builder dateDetection(@Nullable Boolean value) {
			this.dateDetection = value;
			return this;
		}

		/**
		 * API name: {@code dynamic}
		 */
		public Builder dynamic(@Nullable JsonValue value) {
			this.dynamic = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_date_formats}
		 */
		public Builder dynamicDateFormats(@Nullable List<String> value) {
			this.dynamicDateFormats = value;
			return this;
		}

		/**
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
		 * API name: {@code dynamic_templates}
		 */
		public Builder dynamicTemplates(@Nullable List<Map<String, DynamicTemplate>> value) {
			this.dynamicTemplates = value;
			return this;
		}

		/**
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
		 * API name: {@code field_names_field}
		 */
		public Builder fieldNamesField(@Nullable FieldNamesField value) {
			this.fieldNamesField = value;
			return this;
		}

		/**
		 * API name: {@code field_names_field}
		 */
		public Builder fieldNamesField(Function<FieldNamesField.Builder, ObjectBuilder<FieldNamesField>> fn) {
			return this.fieldNamesField(fn.apply(new FieldNamesField.Builder()).build());
		}

		/**
		 * API name: {@code index_field}
		 */
		public Builder indexField(@Nullable IndexField value) {
			this.indexField = value;
			return this;
		}

		/**
		 * API name: {@code index_field}
		 */
		public Builder indexField(Function<IndexField.Builder, ObjectBuilder<IndexField>> fn) {
			return this.indexField(fn.apply(new IndexField.Builder()).build());
		}

		/**
		 * API name: {@code meta}
		 */
		public Builder meta(@Nullable Map<String, JsonValue> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonValue value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * API name: {@code numeric_detection}
		 */
		public Builder numericDetection(@Nullable Boolean value) {
			this.numericDetection = value;
			return this;
		}

		/**
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
		 * API name: {@code routing_field}
		 */
		public Builder routingField(@Nullable RoutingField value) {
			this.routingField = value;
			return this;
		}

		/**
		 * API name: {@code routing_field}
		 */
		public Builder routingField(Function<RoutingField.Builder, ObjectBuilder<RoutingField>> fn) {
			return this.routingField(fn.apply(new RoutingField.Builder()).build());
		}

		/**
		 * API name: {@code size_field}
		 */
		public Builder sizeField(@Nullable SizeField value) {
			this.sizeField = value;
			return this;
		}

		/**
		 * API name: {@code size_field}
		 */
		public Builder sizeField(Function<SizeField.Builder, ObjectBuilder<SizeField>> fn) {
			return this.sizeField(fn.apply(new SizeField.Builder()).build());
		}

		/**
		 * API name: {@code source_field}
		 */
		public Builder sourceField(@Nullable SourceField value) {
			this.sourceField = value;
			return this;
		}

		/**
		 * API name: {@code source_field}
		 */
		public Builder sourceField(Function<SourceField.Builder, ObjectBuilder<SourceField>> fn) {
			return this.sourceField(fn.apply(new SourceField.Builder()).build());
		}

		/**
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
	 * Json deserializer for PutMappingRequest
	 */
	public static final JsonpDeserializer<PutMappingRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutMappingRequest::setupPutMappingRequestDeserializer);

	protected static void setupPutMappingRequestDeserializer(DelegatingDeserializer<PutMappingRequest.Builder> op) {

		op.add(Builder::allField, AllField.DESERIALIZER, "all_field");
		op.add(Builder::dateDetection, JsonpDeserializer.booleanDeserializer(), "date_detection");
		op.add(Builder::dynamic, JsonpDeserializer.jsonValueDeserializer(), "dynamic");
		op.add(Builder::dynamicDateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"dynamic_date_formats");
		op.add(Builder::dynamicTemplates, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(DynamicTemplate.DESERIALIZER)), "dynamic_templates");
		op.add(Builder::fieldNamesField, FieldNamesField.DESERIALIZER, "field_names_field");
		op.add(Builder::indexField, IndexField.DESERIALIZER, "index_field");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"meta");
		op.add(Builder::numericDetection, JsonpDeserializer.booleanDeserializer(), "numeric_detection");
		op.add(Builder::properties, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"properties");
		op.add(Builder::routingField, RoutingField.DESERIALIZER, "routing_field");
		op.add(Builder::sizeField, SizeField.DESERIALIZER, "size_field");
		op.add(Builder::sourceField, SourceField.DESERIALIZER, "source_field");
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
				final int _type = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_mapping");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.type);
					buf.append("/_mapping");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_mapping");
					buf.append("/");
					buf.append(request.type);
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.type);
					buf.append("/_mappings");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_mappings");
					buf.append("/");
					buf.append(request.type);
					return buf.toString();
				}
				if (propsSet == (_type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_mappings");
					buf.append("/");
					buf.append(request.type);
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_mappings");
					return buf.toString();
				}
				if (propsSet == (_type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_mapping");
					buf.append("/");
					buf.append(request.type);
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
