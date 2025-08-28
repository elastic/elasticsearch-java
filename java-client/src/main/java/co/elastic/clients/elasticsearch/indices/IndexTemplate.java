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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
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

// typedef: indices._types.IndexTemplate

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.IndexTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexTemplate implements JsonpSerializable {
	private final List<String> indexPatterns;

	private final List<String> composedOf;

	@Nullable
	private final IndexTemplateSummary template;

	@Nullable
	private final Long version;

	@Nullable
	private final Long priority;

	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean allowAutoCreate;

	@Nullable
	private final IndexTemplateDataStreamConfiguration dataStream;

	@Nullable
	private final Boolean deprecated;

	private final List<String> ignoreMissingComponentTemplates;

	@Nullable
	private final DateTime createdDate;

	@Nullable
	private final Long createdDateMillis;

	@Nullable
	private final DateTime modifiedDate;

	@Nullable
	private final Long modifiedDateMillis;

	// ---------------------------------------------------------------------------------------------

	private IndexTemplate(Builder builder) {

		this.indexPatterns = ApiTypeHelper.unmodifiableRequired(builder.indexPatterns, this, "indexPatterns");
		this.composedOf = ApiTypeHelper.unmodifiableRequired(builder.composedOf, this, "composedOf");
		this.template = builder.template;
		this.version = builder.version;
		this.priority = builder.priority;
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.allowAutoCreate = builder.allowAutoCreate;
		this.dataStream = builder.dataStream;
		this.deprecated = builder.deprecated;
		this.ignoreMissingComponentTemplates = ApiTypeHelper.unmodifiable(builder.ignoreMissingComponentTemplates);
		this.createdDate = builder.createdDate;
		this.createdDateMillis = builder.createdDateMillis;
		this.modifiedDate = builder.modifiedDate;
		this.modifiedDateMillis = builder.modifiedDateMillis;

	}

	public static IndexTemplate of(Function<Builder, ObjectBuilder<IndexTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of the index template.
	 * <p>
	 * API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Required - An ordered list of component template names. Component templates
	 * are merged in the order specified, meaning that the last component template
	 * specified has the highest precedence.
	 * <p>
	 * API name: {@code composed_of}
	 */
	public final List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * Template to be applied. It may optionally include an <code>aliases</code>,
	 * <code>mappings</code>, or <code>settings</code> configuration.
	 * <p>
	 * API name: {@code template}
	 */
	@Nullable
	public final IndexTemplateSummary template() {
		return this.template;
	}

	/**
	 * Version number used to manage index templates externally. This number is not
	 * automatically generated by Elasticsearch.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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
	 * Optional user metadata about the index template. May have any contents. This
	 * map is not automatically generated by Elasticsearch.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code allow_auto_create}
	 */
	@Nullable
	public final Boolean allowAutoCreate() {
		return this.allowAutoCreate;
	}

	/**
	 * If this object is included, the template is used to create data streams and
	 * their backing indices. Supports an empty object. Data streams require a
	 * matching index template with a <code>data_stream</code> object.
	 * <p>
	 * API name: {@code data_stream}
	 */
	@Nullable
	public final IndexTemplateDataStreamConfiguration dataStream() {
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
	 * A list of component template names that are allowed to be absent.
	 * <p>
	 * API name: {@code ignore_missing_component_templates}
	 */
	public final List<String> ignoreMissingComponentTemplates() {
		return this.ignoreMissingComponentTemplates;
	}

	/**
	 * Date and time when the index template was created. Only returned if the
	 * <code>human</code> query parameter is <code>true</code>.
	 * <p>
	 * API name: {@code created_date}
	 */
	@Nullable
	public final DateTime createdDate() {
		return this.createdDate;
	}

	/**
	 * Date and time when the index template was created, in milliseconds since the
	 * epoch.
	 * <p>
	 * API name: {@code created_date_millis}
	 */
	@Nullable
	public final Long createdDateMillis() {
		return this.createdDateMillis;
	}

	/**
	 * Date and time when the index template was last modified. Only returned if the
	 * <code>human</code> query parameter is <code>true</code>.
	 * <p>
	 * API name: {@code modified_date}
	 */
	@Nullable
	public final DateTime modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * Date and time when the index template was last modified, in milliseconds
	 * since the epoch.
	 * <p>
	 * API name: {@code modified_date_millis}
	 */
	@Nullable
	public final Long modifiedDateMillis() {
		return this.modifiedDateMillis;
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

		if (ApiTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.composedOf)) {
			generator.writeKey("composed_of");
			generator.writeStartArray();
			for (String item0 : this.composedOf) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.priority != null) {
			generator.writeKey("priority");
			generator.write(this.priority);

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
		if (this.allowAutoCreate != null) {
			generator.writeKey("allow_auto_create");
			generator.write(this.allowAutoCreate);

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
		if (this.createdDate != null) {
			generator.writeKey("created_date");
			this.createdDate.serialize(generator, mapper);
		}
		if (this.createdDateMillis != null) {
			generator.writeKey("created_date_millis");
			generator.write(this.createdDateMillis);

		}
		if (this.modifiedDate != null) {
			generator.writeKey("modified_date");
			this.modifiedDate.serialize(generator, mapper);
		}
		if (this.modifiedDateMillis != null) {
			generator.writeKey("modified_date_millis");
			generator.write(this.modifiedDateMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexTemplate> {
		private List<String> indexPatterns;

		private List<String> composedOf;

		@Nullable
		private IndexTemplateSummary template;

		@Nullable
		private Long version;

		@Nullable
		private Long priority;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean allowAutoCreate;

		@Nullable
		private IndexTemplateDataStreamConfiguration dataStream;

		@Nullable
		private Boolean deprecated;

		@Nullable
		private List<String> ignoreMissingComponentTemplates;

		@Nullable
		private DateTime createdDate;

		@Nullable
		private Long createdDateMillis;

		@Nullable
		private DateTime modifiedDate;

		@Nullable
		private Long modifiedDateMillis;

		/**
		 * Required - Name of the index template.
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
		 * Required - Name of the index template.
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
		 * Required - An ordered list of component template names. Component templates
		 * are merged in the order specified, meaning that the last component template
		 * specified has the highest precedence.
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
		 * Required - An ordered list of component template names. Component templates
		 * are merged in the order specified, meaning that the last component template
		 * specified has the highest precedence.
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
		 * Template to be applied. It may optionally include an <code>aliases</code>,
		 * <code>mappings</code>, or <code>settings</code> configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable IndexTemplateSummary value) {
			this.template = value;
			return this;
		}

		/**
		 * Template to be applied. It may optionally include an <code>aliases</code>,
		 * <code>mappings</code>, or <code>settings</code> configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Function<IndexTemplateSummary.Builder, ObjectBuilder<IndexTemplateSummary>> fn) {
			return this.template(fn.apply(new IndexTemplateSummary.Builder()).build());
		}

		/**
		 * Version number used to manage index templates externally. This number is not
		 * automatically generated by Elasticsearch.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
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
		 * Optional user metadata about the index template. May have any contents. This
		 * map is not automatically generated by Elasticsearch.
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
		 * Optional user metadata about the index template. May have any contents. This
		 * map is not automatically generated by Elasticsearch.
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
		 * API name: {@code allow_auto_create}
		 */
		public final Builder allowAutoCreate(@Nullable Boolean value) {
			this.allowAutoCreate = value;
			return this;
		}

		/**
		 * If this object is included, the template is used to create data streams and
		 * their backing indices. Supports an empty object. Data streams require a
		 * matching index template with a <code>data_stream</code> object.
		 * <p>
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable IndexTemplateDataStreamConfiguration value) {
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
				Function<IndexTemplateDataStreamConfiguration.Builder, ObjectBuilder<IndexTemplateDataStreamConfiguration>> fn) {
			return this.dataStream(fn.apply(new IndexTemplateDataStreamConfiguration.Builder()).build());
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
		 * A list of component template names that are allowed to be absent.
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
		 * A list of component template names that are allowed to be absent.
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
		 * Date and time when the index template was created. Only returned if the
		 * <code>human</code> query parameter is <code>true</code>.
		 * <p>
		 * API name: {@code created_date}
		 */
		public final Builder createdDate(@Nullable DateTime value) {
			this.createdDate = value;
			return this;
		}

		/**
		 * Date and time when the index template was created, in milliseconds since the
		 * epoch.
		 * <p>
		 * API name: {@code created_date_millis}
		 */
		public final Builder createdDateMillis(@Nullable Long value) {
			this.createdDateMillis = value;
			return this;
		}

		/**
		 * Date and time when the index template was last modified. Only returned if the
		 * <code>human</code> query parameter is <code>true</code>.
		 * <p>
		 * API name: {@code modified_date}
		 */
		public final Builder modifiedDate(@Nullable DateTime value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * Date and time when the index template was last modified, in milliseconds
		 * since the epoch.
		 * <p>
		 * API name: {@code modified_date_millis}
		 */
		public final Builder modifiedDateMillis(@Nullable Long value) {
			this.modifiedDateMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexTemplate build() {
			_checkSingleUse();

			return new IndexTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexTemplate}
	 */
	public static final JsonpDeserializer<IndexTemplate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexTemplate::setupIndexTemplateDeserializer);

	protected static void setupIndexTemplateDeserializer(ObjectDeserializer<IndexTemplate.Builder> op) {

		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"composed_of");
		op.add(Builder::template, IndexTemplateSummary._DESERIALIZER, "template");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::priority, JsonpDeserializer.longDeserializer(), "priority");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::allowAutoCreate, JsonpDeserializer.booleanDeserializer(), "allow_auto_create");
		op.add(Builder::dataStream, IndexTemplateDataStreamConfiguration._DESERIALIZER, "data_stream");
		op.add(Builder::deprecated, JsonpDeserializer.booleanDeserializer(), "deprecated");
		op.add(Builder::ignoreMissingComponentTemplates,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"ignore_missing_component_templates");
		op.add(Builder::createdDate, DateTime._DESERIALIZER, "created_date");
		op.add(Builder::createdDateMillis, JsonpDeserializer.longDeserializer(), "created_date_millis");
		op.add(Builder::modifiedDate, DateTime._DESERIALIZER, "modified_date");
		op.add(Builder::modifiedDateMillis, JsonpDeserializer.longDeserializer(), "modified_date_millis");

	}

}
