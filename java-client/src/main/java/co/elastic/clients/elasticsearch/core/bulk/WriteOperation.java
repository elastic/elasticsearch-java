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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
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

// typedef: _global.bulk.WriteOperation

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.bulk.WriteOperation">API
 *      specification</a>
 */

public abstract class WriteOperation extends BulkOperationBase {
	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	private final Map<String, String> dynamicTemplates;

	private final Map<String, Map<String, String>> dynamicTemplateParams;

	@Nullable
	private final String pipeline;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Boolean requireDataStream;

	@Nullable
	private final Boolean listExecutedPipelines;

	// ---------------------------------------------------------------------------------------------

	protected WriteOperation(AbstractBuilder<?> builder) {
		super(builder);

		this.version = builder.version;
		this.versionType = builder.versionType;
		this.dynamicTemplates = ApiTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.dynamicTemplateParams = ApiTypeHelper.unmodifiable(builder.dynamicTemplateParams);
		this.pipeline = builder.pipeline;
		this.requireAlias = builder.requireAlias;
		this.requireDataStream = builder.requireDataStream;
		this.listExecutedPipelines = builder.listExecutedPipelines;

	}

	/**
	 * The explicit version number for concurrency control. It must be a
	 * non-negative long number. This parameter is not supported for
	 * <code>update</code> actions.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * The version type. This parameter is not supported for <code>update</code>
	 * actions.
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
	}

	/**
	 * A map from the full name of fields to the name of dynamic templates. It
	 * defaults to an empty map. If a name matches a dynamic template, that template
	 * will be applied regardless of other match predicates defined in the template.
	 * If a field is already defined in the mapping, then this parameter won't be
	 * used.
	 * <p>
	 * API name: {@code dynamic_templates}
	 */
	public final Map<String, String> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * A map from the full name of fields to the parameters to pass to the dynamic
	 * template selected for that field in <code>dynamic_templates</code>. Each
	 * value is a map from parameter names to parameter values. The dynamic template
	 * can reference a parameter with a placeholder such as <code>{unit:}</code>,
	 * where the text after the colon is the default value.
	 * <p>
	 * API name: {@code dynamic_template_params}
	 */
	public final Map<String, Map<String, String>> dynamicTemplateParams() {
		return this.dynamicTemplateParams;
	}

	/**
	 * The ID of the pipeline to use to preprocess incoming documents. If the index
	 * has a default ingest pipeline specified, setting the value to
	 * <code>_none</code> turns off the default ingest pipeline for this request. If
	 * a final pipeline is configured, it will always run regardless of the value of
	 * this parameter.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code>, the request's actions must target an index alias.
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * If <code>true</code>, the action must target a data stream (existing or to be
	 * created).
	 * <p>
	 * API name: {@code require_data_stream}
	 */
	@Nullable
	public final Boolean requireDataStream() {
		return this.requireDataStream;
	}

	/**
	 * If <code>true</code>, the response includes the ingest pipelines that were
	 * run for this action.
	 * <p>
	 * API name: {@code list_executed_pipelines}
	 */
	@Nullable
	public final Boolean listExecutedPipelines() {
		return this.listExecutedPipelines;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionType != null) {
			generator.writeKey("version_type");
			this.versionType.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.dynamicTemplates)) {
			generator.writeKey("dynamic_templates");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.dynamicTemplates.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.dynamicTemplateParams)) {
			generator.writeKey("dynamic_template_params");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, String>> item0 : this.dynamicTemplateParams.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, String> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}
		if (this.requireAlias != null) {
			generator.writeKey("require_alias");
			generator.write(this.requireAlias);

		}
		if (this.requireDataStream != null) {
			generator.writeKey("require_data_stream");
			generator.write(this.requireDataStream);

		}
		if (this.listExecutedPipelines != null) {
			generator.writeKey("list_executed_pipelines");
			generator.write(this.listExecutedPipelines);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				BulkOperationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		@Nullable
		private Map<String, String> dynamicTemplates;

		@Nullable
		private Map<String, Map<String, String>> dynamicTemplateParams;

		@Nullable
		private String pipeline;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Boolean requireDataStream;

		@Nullable
		private Boolean listExecutedPipelines;

		/**
		 * The explicit version number for concurrency control. It must be a
		 * non-negative long number. This parameter is not supported for
		 * <code>update</code> actions.
		 * <p>
		 * API name: {@code version}
		 */
		public final BuilderT version(@Nullable Long value) {
			this.version = value;
			return self();
		}

		/**
		 * The version type. This parameter is not supported for <code>update</code>
		 * actions.
		 * <p>
		 * API name: {@code version_type}
		 */
		public final BuilderT versionType(@Nullable VersionType value) {
			this.versionType = value;
			return self();
		}

		/**
		 * A map from the full name of fields to the name of dynamic templates. It
		 * defaults to an empty map. If a name matches a dynamic template, that template
		 * will be applied regardless of other match predicates defined in the template.
		 * If a field is already defined in the mapping, then this parameter won't be
		 * used.
		 * <p>
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>dynamicTemplates</code>.
		 */
		public final BuilderT dynamicTemplates(Map<String, String> map) {
			this.dynamicTemplates = _mapPutAll(this.dynamicTemplates, map);
			return self();
		}

		/**
		 * A map from the full name of fields to the name of dynamic templates. It
		 * defaults to an empty map. If a name matches a dynamic template, that template
		 * will be applied regardless of other match predicates defined in the template.
		 * If a field is already defined in the mapping, then this parameter won't be
		 * used.
		 * <p>
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds an entry to <code>dynamicTemplates</code>.
		 */
		public final BuilderT dynamicTemplates(String key, String value) {
			this.dynamicTemplates = _mapPut(this.dynamicTemplates, key, value);
			return self();
		}

		/**
		 * A map from the full name of fields to the parameters to pass to the dynamic
		 * template selected for that field in <code>dynamic_templates</code>. Each
		 * value is a map from parameter names to parameter values. The dynamic template
		 * can reference a parameter with a placeholder such as <code>{unit:}</code>,
		 * where the text after the colon is the default value.
		 * <p>
		 * API name: {@code dynamic_template_params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>dynamicTemplateParams</code>.
		 */
		public final BuilderT dynamicTemplateParams(Map<String, Map<String, String>> map) {
			this.dynamicTemplateParams = _mapPutAll(this.dynamicTemplateParams, map);
			return self();
		}

		/**
		 * A map from the full name of fields to the parameters to pass to the dynamic
		 * template selected for that field in <code>dynamic_templates</code>. Each
		 * value is a map from parameter names to parameter values. The dynamic template
		 * can reference a parameter with a placeholder such as <code>{unit:}</code>,
		 * where the text after the colon is the default value.
		 * <p>
		 * API name: {@code dynamic_template_params}
		 * <p>
		 * Adds an entry to <code>dynamicTemplateParams</code>.
		 */
		public final BuilderT dynamicTemplateParams(String key, Map<String, String> value) {
			this.dynamicTemplateParams = _mapPut(this.dynamicTemplateParams, key, value);
			return self();
		}

		/**
		 * The ID of the pipeline to use to preprocess incoming documents. If the index
		 * has a default ingest pipeline specified, setting the value to
		 * <code>_none</code> turns off the default ingest pipeline for this request. If
		 * a final pipeline is configured, it will always run regardless of the value of
		 * this parameter.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final BuilderT pipeline(@Nullable String value) {
			this.pipeline = value;
			return self();
		}

		/**
		 * If <code>true</code>, the request's actions must target an index alias.
		 * <p>
		 * API name: {@code require_alias}
		 */
		public final BuilderT requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return self();
		}

		/**
		 * If <code>true</code>, the action must target a data stream (existing or to be
		 * created).
		 * <p>
		 * API name: {@code require_data_stream}
		 */
		public final BuilderT requireDataStream(@Nullable Boolean value) {
			this.requireDataStream = value;
			return self();
		}

		/**
		 * If <code>true</code>, the response includes the ingest pipelines that were
		 * run for this action.
		 * <p>
		 * API name: {@code list_executed_pipelines}
		 */
		public final BuilderT listExecutedPipelines(@Nullable Boolean value) {
			this.listExecutedPipelines = value;
			return self();
		}

		protected AbstractBuilder() {
		}

		protected AbstractBuilder(WriteOperation instance) {
			super(instance);
			this.version = instance.version;
			this.versionType = instance.versionType;
			this.dynamicTemplates = instance.dynamicTemplates;
			this.dynamicTemplateParams = instance.dynamicTemplateParams;
			this.pipeline = instance.pipeline;
			this.requireAlias = instance.requireAlias;
			this.requireDataStream = instance.requireDataStream;
			this.listExecutedPipelines = instance.listExecutedPipelines;

		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteOperationDeserializer(
			ObjectDeserializer<BuilderT> op) {
		BulkOperationBase.setupBulkOperationBaseDeserializer(op);
		op.add(AbstractBuilder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(AbstractBuilder::versionType, VersionType._DESERIALIZER, "version_type");
		op.add(AbstractBuilder::dynamicTemplates,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "dynamic_templates");
		op.add(AbstractBuilder::dynamicTemplateParams,
				JsonpDeserializer.stringMapDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())),
				"dynamic_template_params");
		op.add(AbstractBuilder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");
		op.add(AbstractBuilder::requireAlias, JsonpDeserializer.booleanDeserializer(), "require_alias");
		op.add(AbstractBuilder::requireDataStream, JsonpDeserializer.booleanDeserializer(), "require_data_stream");
		op.add(AbstractBuilder::listExecutedPipelines, JsonpDeserializer.booleanDeserializer(),
				"list_executed_pipelines");

	}

}
