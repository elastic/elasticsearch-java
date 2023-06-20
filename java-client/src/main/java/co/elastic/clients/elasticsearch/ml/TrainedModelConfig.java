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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.TrainedModelConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelConfig implements JsonpSerializable {
	private final String modelId;

	@Nullable
	private final TrainedModelType modelType;

	private final List<String> tags;

	@Nullable
	private final String version;

	@Nullable
	private final String compressedDefinition;

	@Nullable
	private final String createdBy;

	@Nullable
	private final DateTime createTime;

	private final Map<String, String> defaultFieldMap;

	@Nullable
	private final String description;

	@Nullable
	private final Integer estimatedHeapMemoryUsageBytes;

	@Nullable
	private final Integer estimatedOperations;

	@Nullable
	private final Boolean fullyDefined;

	@Nullable
	private final InferenceConfigCreate inferenceConfig;

	private final TrainedModelConfigInput input;

	@Nullable
	private final String licenseLevel;

	@Nullable
	private final TrainedModelConfigMetadata metadata;

	@Nullable
	private final String modelSizeBytes;

	@Nullable
	private final TrainedModelLocation location;

	// ---------------------------------------------------------------------------------------------

	protected TrainedModelConfig(AbstractBuilder<?> builder) {

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.modelType = builder.modelType;
		this.tags = ApiTypeHelper.unmodifiableRequired(builder.tags, this, "tags");
		this.version = builder.version;
		this.compressedDefinition = builder.compressedDefinition;
		this.createdBy = builder.createdBy;
		this.createTime = builder.createTime;
		this.defaultFieldMap = ApiTypeHelper.unmodifiable(builder.defaultFieldMap);
		this.description = builder.description;
		this.estimatedHeapMemoryUsageBytes = builder.estimatedHeapMemoryUsageBytes;
		this.estimatedOperations = builder.estimatedOperations;
		this.fullyDefined = builder.fullyDefined;
		this.inferenceConfig = builder.inferenceConfig;
		this.input = ApiTypeHelper.requireNonNull(builder.input, this, "input");
		this.licenseLevel = builder.licenseLevel;
		this.metadata = builder.metadata;
		this.modelSizeBytes = builder.modelSizeBytes;
		this.location = builder.location;

	}

	public static TrainedModelConfig trainedModelConfigOf(Function<Builder, ObjectBuilder<TrainedModelConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Identifier for the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The model type
	 * <p>
	 * API name: {@code model_type}
	 */
	@Nullable
	public final TrainedModelType modelType() {
		return this.modelType;
	}

	/**
	 * Required - A comma delimited string of tags. A trained model can have many
	 * tags, or none.
	 * <p>
	 * API name: {@code tags}
	 */
	public final List<String> tags() {
		return this.tags;
	}

	/**
	 * The Elasticsearch version number in which the trained model was created.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code compressed_definition}
	 */
	@Nullable
	public final String compressedDefinition() {
		return this.compressedDefinition;
	}

	/**
	 * Information on the creator of the trained model.
	 * <p>
	 * API name: {@code created_by}
	 */
	@Nullable
	public final String createdBy() {
		return this.createdBy;
	}

	/**
	 * The time when the trained model was created.
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public final DateTime createTime() {
		return this.createTime;
	}

	/**
	 * Any field map described in the inference configuration takes precedence.
	 * <p>
	 * API name: {@code default_field_map}
	 */
	public final Map<String, String> defaultFieldMap() {
		return this.defaultFieldMap;
	}

	/**
	 * The free-text description of the trained model.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The estimated heap usage in bytes to keep the trained model in memory.
	 * <p>
	 * API name: {@code estimated_heap_memory_usage_bytes}
	 */
	@Nullable
	public final Integer estimatedHeapMemoryUsageBytes() {
		return this.estimatedHeapMemoryUsageBytes;
	}

	/**
	 * The estimated number of operations to use the trained model.
	 * <p>
	 * API name: {@code estimated_operations}
	 */
	@Nullable
	public final Integer estimatedOperations() {
		return this.estimatedOperations;
	}

	/**
	 * True if the full model definition is present.
	 * <p>
	 * API name: {@code fully_defined}
	 */
	@Nullable
	public final Boolean fullyDefined() {
		return this.fullyDefined;
	}

	/**
	 * The default configuration for inference. This can be either a regression,
	 * classification, or one of the many NLP focused configurations. It must match
	 * the underlying definition.trained_model's target_type. For pre-packaged
	 * models such as ELSER the config is not required.
	 * <p>
	 * API name: {@code inference_config}
	 */
	@Nullable
	public final InferenceConfigCreate inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * Required - The input field names for the model definition.
	 * <p>
	 * API name: {@code input}
	 */
	public final TrainedModelConfigInput input() {
		return this.input;
	}

	/**
	 * The license level of the trained model.
	 * <p>
	 * API name: {@code license_level}
	 */
	@Nullable
	public final String licenseLevel() {
		return this.licenseLevel;
	}

	/**
	 * An object containing metadata about the trained model. For example, models
	 * created by data frame analytics contain analysis_config and input objects.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public final TrainedModelConfigMetadata metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code model_size_bytes}
	 */
	@Nullable
	public final String modelSizeBytes() {
		return this.modelSizeBytes;
	}

	/**
	 * API name: {@code location}
	 */
	@Nullable
	public final TrainedModelLocation location() {
		return this.location;
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

		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.modelType != null) {
			generator.writeKey("model_type");
			this.modelType.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.tags)) {
			generator.writeKey("tags");
			generator.writeStartArray();
			for (String item0 : this.tags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.compressedDefinition != null) {
			generator.writeKey("compressed_definition");
			generator.write(this.compressedDefinition);

		}
		if (this.createdBy != null) {
			generator.writeKey("created_by");
			generator.write(this.createdBy);

		}
		if (this.createTime != null) {
			generator.writeKey("create_time");
			this.createTime.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.defaultFieldMap)) {
			generator.writeKey("default_field_map");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.defaultFieldMap.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.estimatedHeapMemoryUsageBytes != null) {
			generator.writeKey("estimated_heap_memory_usage_bytes");
			generator.write(this.estimatedHeapMemoryUsageBytes);

		}
		if (this.estimatedOperations != null) {
			generator.writeKey("estimated_operations");
			generator.write(this.estimatedOperations);

		}
		if (this.fullyDefined != null) {
			generator.writeKey("fully_defined");
			generator.write(this.fullyDefined);

		}
		if (this.inferenceConfig != null) {
			generator.writeKey("inference_config");
			this.inferenceConfig.serialize(generator, mapper);

		}
		generator.writeKey("input");
		this.input.serialize(generator, mapper);

		if (this.licenseLevel != null) {
			generator.writeKey("license_level");
			generator.write(this.licenseLevel);

		}
		if (this.metadata != null) {
			generator.writeKey("metadata");
			this.metadata.serialize(generator, mapper);

		}
		if (this.modelSizeBytes != null) {
			generator.writeKey("model_size_bytes");
			generator.write(this.modelSizeBytes);

		}
		if (this.location != null) {
			generator.writeKey("location");
			this.location.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelConfig}.
	 */

	public static class Builder extends TrainedModelConfig.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TrainedModelConfig> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelConfig build() {
			_checkSingleUse();

			return new TrainedModelConfig(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String modelId;

		@Nullable
		private TrainedModelType modelType;

		private List<String> tags;

		@Nullable
		private String version;

		@Nullable
		private String compressedDefinition;

		@Nullable
		private String createdBy;

		@Nullable
		private DateTime createTime;

		@Nullable
		private Map<String, String> defaultFieldMap;

		@Nullable
		private String description;

		@Nullable
		private Integer estimatedHeapMemoryUsageBytes;

		@Nullable
		private Integer estimatedOperations;

		@Nullable
		private Boolean fullyDefined;

		@Nullable
		private InferenceConfigCreate inferenceConfig;

		private TrainedModelConfigInput input;

		@Nullable
		private String licenseLevel;

		@Nullable
		private TrainedModelConfigMetadata metadata;

		@Nullable
		private String modelSizeBytes;

		@Nullable
		private TrainedModelLocation location;

		/**
		 * Required - Identifier for the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final BuilderT modelId(String value) {
			this.modelId = value;
			return self();
		}

		/**
		 * The model type
		 * <p>
		 * API name: {@code model_type}
		 */
		public final BuilderT modelType(@Nullable TrainedModelType value) {
			this.modelType = value;
			return self();
		}

		/**
		 * Required - A comma delimited string of tags. A trained model can have many
		 * tags, or none.
		 * <p>
		 * API name: {@code tags}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tags</code>.
		 */
		public final BuilderT tags(List<String> list) {
			this.tags = _listAddAll(this.tags, list);
			return self();
		}

		/**
		 * Required - A comma delimited string of tags. A trained model can have many
		 * tags, or none.
		 * <p>
		 * API name: {@code tags}
		 * <p>
		 * Adds one or more values to <code>tags</code>.
		 */
		public final BuilderT tags(String value, String... values) {
			this.tags = _listAdd(this.tags, value, values);
			return self();
		}

		/**
		 * The Elasticsearch version number in which the trained model was created.
		 * <p>
		 * API name: {@code version}
		 */
		public final BuilderT version(@Nullable String value) {
			this.version = value;
			return self();
		}

		/**
		 * API name: {@code compressed_definition}
		 */
		public final BuilderT compressedDefinition(@Nullable String value) {
			this.compressedDefinition = value;
			return self();
		}

		/**
		 * Information on the creator of the trained model.
		 * <p>
		 * API name: {@code created_by}
		 */
		public final BuilderT createdBy(@Nullable String value) {
			this.createdBy = value;
			return self();
		}

		/**
		 * The time when the trained model was created.
		 * <p>
		 * API name: {@code create_time}
		 */
		public final BuilderT createTime(@Nullable DateTime value) {
			this.createTime = value;
			return self();
		}

		/**
		 * Any field map described in the inference configuration takes precedence.
		 * <p>
		 * API name: {@code default_field_map}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>defaultFieldMap</code>.
		 */
		public final BuilderT defaultFieldMap(Map<String, String> map) {
			this.defaultFieldMap = _mapPutAll(this.defaultFieldMap, map);
			return self();
		}

		/**
		 * Any field map described in the inference configuration takes precedence.
		 * <p>
		 * API name: {@code default_field_map}
		 * <p>
		 * Adds an entry to <code>defaultFieldMap</code>.
		 */
		public final BuilderT defaultFieldMap(String key, String value) {
			this.defaultFieldMap = _mapPut(this.defaultFieldMap, key, value);
			return self();
		}

		/**
		 * The free-text description of the trained model.
		 * <p>
		 * API name: {@code description}
		 */
		public final BuilderT description(@Nullable String value) {
			this.description = value;
			return self();
		}

		/**
		 * The estimated heap usage in bytes to keep the trained model in memory.
		 * <p>
		 * API name: {@code estimated_heap_memory_usage_bytes}
		 */
		public final BuilderT estimatedHeapMemoryUsageBytes(@Nullable Integer value) {
			this.estimatedHeapMemoryUsageBytes = value;
			return self();
		}

		/**
		 * The estimated number of operations to use the trained model.
		 * <p>
		 * API name: {@code estimated_operations}
		 */
		public final BuilderT estimatedOperations(@Nullable Integer value) {
			this.estimatedOperations = value;
			return self();
		}

		/**
		 * True if the full model definition is present.
		 * <p>
		 * API name: {@code fully_defined}
		 */
		public final BuilderT fullyDefined(@Nullable Boolean value) {
			this.fullyDefined = value;
			return self();
		}

		/**
		 * The default configuration for inference. This can be either a regression,
		 * classification, or one of the many NLP focused configurations. It must match
		 * the underlying definition.trained_model's target_type. For pre-packaged
		 * models such as ELSER the config is not required.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final BuilderT inferenceConfig(@Nullable InferenceConfigCreate value) {
			this.inferenceConfig = value;
			return self();
		}

		/**
		 * The default configuration for inference. This can be either a regression,
		 * classification, or one of the many NLP focused configurations. It must match
		 * the underlying definition.trained_model's target_type. For pre-packaged
		 * models such as ELSER the config is not required.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final BuilderT inferenceConfig(
				Function<InferenceConfigCreate.Builder, ObjectBuilder<InferenceConfigCreate>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfigCreate.Builder()).build());
		}

		/**
		 * Required - The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public final BuilderT input(TrainedModelConfigInput value) {
			this.input = value;
			return self();
		}

		/**
		 * Required - The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public final BuilderT input(
				Function<TrainedModelConfigInput.Builder, ObjectBuilder<TrainedModelConfigInput>> fn) {
			return this.input(fn.apply(new TrainedModelConfigInput.Builder()).build());
		}

		/**
		 * The license level of the trained model.
		 * <p>
		 * API name: {@code license_level}
		 */
		public final BuilderT licenseLevel(@Nullable String value) {
			this.licenseLevel = value;
			return self();
		}

		/**
		 * An object containing metadata about the trained model. For example, models
		 * created by data frame analytics contain analysis_config and input objects.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final BuilderT metadata(@Nullable TrainedModelConfigMetadata value) {
			this.metadata = value;
			return self();
		}

		/**
		 * An object containing metadata about the trained model. For example, models
		 * created by data frame analytics contain analysis_config and input objects.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final BuilderT metadata(
				Function<TrainedModelConfigMetadata.Builder, ObjectBuilder<TrainedModelConfigMetadata>> fn) {
			return this.metadata(fn.apply(new TrainedModelConfigMetadata.Builder()).build());
		}

		/**
		 * API name: {@code model_size_bytes}
		 */
		public final BuilderT modelSizeBytes(@Nullable String value) {
			this.modelSizeBytes = value;
			return self();
		}

		/**
		 * API name: {@code location}
		 */
		public final BuilderT location(@Nullable TrainedModelLocation value) {
			this.location = value;
			return self();
		}

		/**
		 * API name: {@code location}
		 */
		public final BuilderT location(Function<TrainedModelLocation.Builder, ObjectBuilder<TrainedModelLocation>> fn) {
			return this.location(fn.apply(new TrainedModelLocation.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelConfig}
	 */
	public static final JsonpDeserializer<TrainedModelConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelConfig::setupTrainedModelConfigDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupTrainedModelConfigDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(AbstractBuilder::modelType, TrainedModelType._DESERIALIZER, "model_type");
		op.add(AbstractBuilder::tags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"tags");
		op.add(AbstractBuilder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(AbstractBuilder::compressedDefinition, JsonpDeserializer.stringDeserializer(), "compressed_definition");
		op.add(AbstractBuilder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by");
		op.add(AbstractBuilder::createTime, DateTime._DESERIALIZER, "create_time");
		op.add(AbstractBuilder::defaultFieldMap,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "default_field_map");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::estimatedHeapMemoryUsageBytes, JsonpDeserializer.integerDeserializer(),
				"estimated_heap_memory_usage_bytes");
		op.add(AbstractBuilder::estimatedOperations, JsonpDeserializer.integerDeserializer(), "estimated_operations");
		op.add(AbstractBuilder::fullyDefined, JsonpDeserializer.booleanDeserializer(), "fully_defined");
		op.add(AbstractBuilder::inferenceConfig, InferenceConfigCreate._DESERIALIZER, "inference_config");
		op.add(AbstractBuilder::input, TrainedModelConfigInput._DESERIALIZER, "input");
		op.add(AbstractBuilder::licenseLevel, JsonpDeserializer.stringDeserializer(), "license_level");
		op.add(AbstractBuilder::metadata, TrainedModelConfigMetadata._DESERIALIZER, "metadata");
		op.add(AbstractBuilder::modelSizeBytes, JsonpDeserializer.stringDeserializer(), "model_size_bytes");
		op.add(AbstractBuilder::location, TrainedModelLocation._DESERIALIZER, "location");

	}

}
