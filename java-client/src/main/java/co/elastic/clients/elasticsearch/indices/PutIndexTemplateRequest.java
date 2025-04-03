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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.indices.put_index_template.IndexTemplateMapping;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: indices.put_index_template.Request

/**
 * Create or update an index template. Index templates define settings,
 * mappings, and aliases that can be applied automatically to new indices.
 * <p>
 * Elasticsearch applies templates to new indices based on an wildcard pattern
 * that matches the index name. Index templates are applied during data stream
 * or index creation. For data streams, these settings and mappings are applied
 * when the stream's backing indices are created. Settings and mappings
 * specified in a create index API request override any settings or mappings
 * specified in an index template. Changes to index templates do not affect
 * existing indices, including the existing backing indices of a data stream.
 * <p>
 * You can use C-style <code>/* *\/</code> block comments in index templates.
 * You can include comments anywhere in the request body, except before the
 * opening curly bracket.
 * <p>
 * <strong>Multiple matching templates</strong>
 * <p>
 * If multiple index templates match the name of a new index or data stream, the
 * template with the highest priority is used.
 * <p>
 * Multiple templates with overlapping index patterns at the same priority are
 * not allowed and an error will be thrown when attempting to create a template
 * matching an existing index template at identical priorities.
 * <p>
 * <strong>Composing aliases, mappings, and settings</strong>
 * <p>
 * When multiple component templates are specified in the
 * <code>composed_of</code> field for an index template, they are merged in the
 * order specified, meaning that later component templates override earlier
 * component templates. Any mappings, settings, or aliases from the parent index
 * template are merged in next. Finally, any configuration on the index request
 * itself is merged. Mapping definitions are merged recursively, which means
 * that later mapping components can introduce new field mappings and update the
 * mapping configuration. If a field mapping is already contained in an earlier
 * component, its definition will be completely overwritten by the later one.
 * This recursive merging strategy applies not only to field mappings, but also
 * root options like <code>dynamic_templates</code> and <code>meta</code>. If an
 * earlier component contains a <code>dynamic_templates</code> block, then by
 * default new <code>dynamic_templates</code> entries are appended onto the end.
 * If an entry already exists with the same key, then it is overwritten by the
 * new definition.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.put_index_template.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutIndexTemplateRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean allowAutoCreate;

	@Nullable
	private final String cause;

	private final List<String> composedOf;

	@Nullable
	private final Boolean create;

	@Nullable
	private final DataStreamVisibility dataStream;

	@Nullable
	private final Boolean deprecated;

	private final List<String> ignoreMissingComponentTemplates;

	private final List<String> indexPatterns;

	@Nullable
	private final Time masterTimeout;

	private final String name;

	@Nullable
	private final Long priority;

	@Nullable
	private final IndexTemplateMapping template;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private PutIndexTemplateRequest(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.allowAutoCreate = builder.allowAutoCreate;
		this.cause = builder.cause;
		this.composedOf = ApiTypeHelper.unmodifiable(builder.composedOf);
		this.create = builder.create;
		this.dataStream = builder.dataStream;
		this.deprecated = builder.deprecated;
		this.ignoreMissingComponentTemplates = ApiTypeHelper.unmodifiable(builder.ignoreMissingComponentTemplates);
		this.indexPatterns = ApiTypeHelper.unmodifiable(builder.indexPatterns);
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.priority = builder.priority;
		this.template = builder.template;
		this.version = builder.version;

	}

	public static PutIndexTemplateRequest of(Function<Builder, ObjectBuilder<PutIndexTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Optional user metadata about the index template. It may have any contents. It
	 * is not automatically generated or used by Elasticsearch. This user-defined
	 * object is stored in the cluster state, so keeping it short is preferable To
	 * unset the metadata, replace the template without specifying it.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * This setting overrides the value of the <code>action.auto_create_index</code>
	 * cluster setting. If set to <code>true</code> in a template, then indices can
	 * be automatically created using that template even if auto-creation of indices
	 * is disabled via <code>actions.auto_create_index</code>. If set to
	 * <code>false</code>, then indices or data streams matching the template must
	 * always be explicitly created, and may never be automatically created.
	 * <p>
	 * API name: {@code allow_auto_create}
	 */
	@Nullable
	public final Boolean allowAutoCreate() {
		return this.allowAutoCreate;
	}

	/**
	 * User defined reason for creating/updating the index template
	 * <p>
	 * API name: {@code cause}
	 */
	@Nullable
	public final String cause() {
		return this.cause;
	}

	/**
	 * An ordered list of component template names. Component templates are merged
	 * in the order specified, meaning that the last component template specified
	 * has the highest precedence.
	 * <p>
	 * API name: {@code composed_of}
	 */
	public final List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * If <code>true</code>, this request cannot replace or update existing index
	 * templates.
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * If this object is included, the template is used to create data streams and
	 * their backing indices. Supports an empty object. Data streams require a
	 * matching index template with a <code>data_stream</code> object.
	 * <p>
	 * API name: {@code data_stream}
	 */
	@Nullable
	public final DataStreamVisibility dataStream() {
		return this.dataStream;
	}

	/**
	 * Marks this index template as deprecated. When creating or updating a
	 * non-deprecated index template that uses deprecated components, Elasticsearch
	 * will emit a deprecation warning.
	 * <p>
	 * API name: {@code deprecated}
	 */
	@Nullable
	public final Boolean deprecated() {
		return this.deprecated;
	}

	/**
	 * The configuration option ignore_missing_component_templates can be used when
	 * an index template references a component template that might not exist
	 * <p>
	 * API name: {@code ignore_missing_component_templates}
	 */
	public final List<String> ignoreMissingComponentTemplates() {
		return this.ignoreMissingComponentTemplates;
	}

	/**
	 * Name of the index template to create.
	 * <p>
	 * API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - Index or template name
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Priority to determine index template precedence when a new data stream or
	 * index is created. The index template with the highest priority is chosen. If
	 * no priority is specified the template is treated as though it is of priority
	 * 0 (lowest priority). This number is not automatically generated by
	 * Elasticsearch.
	 * <p>
	 * API name: {@code priority}
	 */
	@Nullable
	public final Long priority() {
		return this.priority;
	}

	/**
	 * Template to be applied. It may optionally include an <code>aliases</code>,
	 * <code>mappings</code>, or <code>settings</code> configuration.
	 * <p>
	 * API name: {@code template}
	 */
	@Nullable
	public final IndexTemplateMapping template() {
		return this.template;
	}

	/**
	 * Version number used to manage index templates externally. This number is not
	 * automatically generated by Elasticsearch. External systems can use these
	 * version numbers to simplify template management. To unset a version, replace
	 * the template without specifying one.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowAutoCreate != null) {
			generator.writeKey("allow_auto_create");
			generator.write(this.allowAutoCreate);

		}
		if (ApiTypeHelper.isDefined(this.composedOf)) {
			generator.writeKey("composed_of");
			generator.writeStartArray();
			for (String item0 : this.composedOf) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.dataStream != null) {
			generator.writeKey("data_stream");
			this.dataStream.serialize(generator, mapper);

		}
		if (this.deprecated != null) {
			generator.writeKey("deprecated");
			generator.write(this.deprecated);

		}
		if (ApiTypeHelper.isDefined(this.ignoreMissingComponentTemplates)) {
			generator.writeKey("ignore_missing_component_templates");
			generator.writeStartArray();
			for (String item0 : this.ignoreMissingComponentTemplates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.priority != null) {
			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutIndexTemplateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutIndexTemplateRequest> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean allowAutoCreate;

		@Nullable
		private String cause;

		@Nullable
		private List<String> composedOf;

		@Nullable
		private Boolean create;

		@Nullable
		private DataStreamVisibility dataStream;

		@Nullable
		private Boolean deprecated;

		@Nullable
		private List<String> ignoreMissingComponentTemplates;

		@Nullable
		private List<String> indexPatterns;

		@Nullable
		private Time masterTimeout;

		private String name;

		@Nullable
		private Long priority;

		@Nullable
		private IndexTemplateMapping template;

		@Nullable
		private Long version;

		/**
		 * Optional user metadata about the index template. It may have any contents. It
		 * is not automatically generated or used by Elasticsearch. This user-defined
		 * object is stored in the cluster state, so keeping it short is preferable To
		 * unset the metadata, replace the template without specifying it.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * Optional user metadata about the index template. It may have any contents. It
		 * is not automatically generated or used by Elasticsearch. This user-defined
		 * object is stored in the cluster state, so keeping it short is preferable To
		 * unset the metadata, replace the template without specifying it.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * This setting overrides the value of the <code>action.auto_create_index</code>
		 * cluster setting. If set to <code>true</code> in a template, then indices can
		 * be automatically created using that template even if auto-creation of indices
		 * is disabled via <code>actions.auto_create_index</code>. If set to
		 * <code>false</code>, then indices or data streams matching the template must
		 * always be explicitly created, and may never be automatically created.
		 * <p>
		 * API name: {@code allow_auto_create}
		 */
		public final Builder allowAutoCreate(@Nullable Boolean value) {
			this.allowAutoCreate = value;
			return this;
		}

		/**
		 * User defined reason for creating/updating the index template
		 * <p>
		 * API name: {@code cause}
		 */
		public final Builder cause(@Nullable String value) {
			this.cause = value;
			return this;
		}

		/**
		 * An ordered list of component template names. Component templates are merged
		 * in the order specified, meaning that the last component template specified
		 * has the highest precedence.
		 * <p>
		 * API name: {@code composed_of}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>composedOf</code>.
		 */
		public final Builder composedOf(List<String> list) {
			this.composedOf = _listAddAll(this.composedOf, list);
			return this;
		}

		/**
		 * An ordered list of component template names. Component templates are merged
		 * in the order specified, meaning that the last component template specified
		 * has the highest precedence.
		 * <p>
		 * API name: {@code composed_of}
		 * <p>
		 * Adds one or more values to <code>composedOf</code>.
		 */
		public final Builder composedOf(String value, String... values) {
			this.composedOf = _listAdd(this.composedOf, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, this request cannot replace or update existing index
		 * templates.
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * If this object is included, the template is used to create data streams and
		 * their backing indices. Supports an empty object. Data streams require a
		 * matching index template with a <code>data_stream</code> object.
		 * <p>
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable DataStreamVisibility value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * If this object is included, the template is used to create data streams and
		 * their backing indices. Supports an empty object. Data streams require a
		 * matching index template with a <code>data_stream</code> object.
		 * <p>
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(
				Function<DataStreamVisibility.Builder, ObjectBuilder<DataStreamVisibility>> fn) {
			return this.dataStream(fn.apply(new DataStreamVisibility.Builder()).build());
		}

		/**
		 * Marks this index template as deprecated. When creating or updating a
		 * non-deprecated index template that uses deprecated components, Elasticsearch
		 * will emit a deprecation warning.
		 * <p>
		 * API name: {@code deprecated}
		 */
		public final Builder deprecated(@Nullable Boolean value) {
			this.deprecated = value;
			return this;
		}

		/**
		 * The configuration option ignore_missing_component_templates can be used when
		 * an index template references a component template that might not exist
		 * <p>
		 * API name: {@code ignore_missing_component_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>ignoreMissingComponentTemplates</code>.
		 */
		public final Builder ignoreMissingComponentTemplates(List<String> list) {
			this.ignoreMissingComponentTemplates = _listAddAll(this.ignoreMissingComponentTemplates, list);
			return this;
		}

		/**
		 * The configuration option ignore_missing_component_templates can be used when
		 * an index template references a component template that might not exist
		 * <p>
		 * API name: {@code ignore_missing_component_templates}
		 * <p>
		 * Adds one or more values to <code>ignoreMissingComponentTemplates</code>.
		 */
		public final Builder ignoreMissingComponentTemplates(String value, String... values) {
			this.ignoreMissingComponentTemplates = _listAdd(this.ignoreMissingComponentTemplates, value, values);
			return this;
		}

		/**
		 * Name of the index template to create.
		 * <p>
		 * API name: {@code index_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(List<String> list) {
			this.indexPatterns = _listAddAll(this.indexPatterns, list);
			return this;
		}

		/**
		 * Name of the index template to create.
		 * <p>
		 * API name: {@code index_patterns}
		 * <p>
		 * Adds one or more values to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(String value, String... values) {
			this.indexPatterns = _listAdd(this.indexPatterns, value, values);
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Index or template name
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Priority to determine index template precedence when a new data stream or
		 * index is created. The index template with the highest priority is chosen. If
		 * no priority is specified the template is treated as though it is of priority
		 * 0 (lowest priority). This number is not automatically generated by
		 * Elasticsearch.
		 * <p>
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable Long value) {
			this.priority = value;
			return this;
		}

		/**
		 * Template to be applied. It may optionally include an <code>aliases</code>,
		 * <code>mappings</code>, or <code>settings</code> configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable IndexTemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * Template to be applied. It may optionally include an <code>aliases</code>,
		 * <code>mappings</code>, or <code>settings</code> configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Function<IndexTemplateMapping.Builder, ObjectBuilder<IndexTemplateMapping>> fn) {
			return this.template(fn.apply(new IndexTemplateMapping.Builder()).build());
		}

		/**
		 * Version number used to manage index templates externally. This number is not
		 * automatically generated by Elasticsearch. External systems can use these
		 * version numbers to simplify template management. To unset a version, replace
		 * the template without specifying one.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutIndexTemplateRequest build() {
			_checkSingleUse();

			return new PutIndexTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutIndexTemplateRequest}
	 */
	public static final JsonpDeserializer<PutIndexTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutIndexTemplateRequest::setupPutIndexTemplateRequestDeserializer);

	protected static void setupPutIndexTemplateRequestDeserializer(
			ObjectDeserializer<PutIndexTemplateRequest.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::allowAutoCreate, JsonpDeserializer.booleanDeserializer(), "allow_auto_create");
		op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"composed_of");
		op.add(Builder::dataStream, DataStreamVisibility._DESERIALIZER, "data_stream");
		op.add(Builder::deprecated, JsonpDeserializer.booleanDeserializer(), "deprecated");
		op.add(Builder::ignoreMissingComponentTemplates,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"ignore_missing_component_templates");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::priority, JsonpDeserializer.longDeserializer(), "priority");
		op.add(Builder::template, IndexTemplateMapping._DESERIALIZER, "template");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_index_template}".
	 */
	public static final Endpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_index_template",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				if (request.cause != null) {
					params.put("cause", request.cause);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutIndexTemplateResponse._DESERIALIZER);
}
