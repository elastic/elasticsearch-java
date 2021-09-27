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

import co.elastic.clients.elasticsearch._types.aggregations.InferenceConfig;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelConfig
@JsonpDeserializable
public final class TrainedModelConfig implements JsonpSerializable {
	private final String modelId;

	private final List<String> tags;

	@Nullable
	private final String version;

	@Nullable
	private final String compressedDefinition;

	@Nullable
	private final String createdBy;

	@Nullable
	private final String createTime;

	@Nullable
	private final Map<String, String> defaultFieldMap;

	@Nullable
	private final String description;

	@Nullable
	private final Integer estimatedHeapMemoryUsageBytes;

	@Nullable
	private final Integer estimatedOperations;

	private final InferenceConfig inferenceConfig;

	private final TrainedModelConfigInput input;

	@Nullable
	private final String licenseLevel;

	@Nullable
	private final TrainedModelConfigMetadata metadata;

	// ---------------------------------------------------------------------------------------------

	public TrainedModelConfig(Builder builder) {

		this.modelId = Objects.requireNonNull(builder.modelId, "model_id");
		this.tags = Objects.requireNonNull(builder.tags, "tags");
		this.version = builder.version;
		this.compressedDefinition = builder.compressedDefinition;
		this.createdBy = builder.createdBy;
		this.createTime = builder.createTime;
		this.defaultFieldMap = builder.defaultFieldMap;
		this.description = builder.description;
		this.estimatedHeapMemoryUsageBytes = builder.estimatedHeapMemoryUsageBytes;
		this.estimatedOperations = builder.estimatedOperations;
		this.inferenceConfig = Objects.requireNonNull(builder.inferenceConfig, "inference_config");
		this.input = Objects.requireNonNull(builder.input, "input");
		this.licenseLevel = builder.licenseLevel;
		this.metadata = builder.metadata;

	}

	/**
	 * Idetifier for the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public String modelId() {
		return this.modelId;
	}

	/**
	 * A comma delimited string of tags. A trained model can have many tags, or
	 * none.
	 * <p>
	 * API name: {@code tags}
	 */
	public List<String> tags() {
		return this.tags;
	}

	/**
	 * The Elasticsearch version number in which the trained model was created.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code compressed_definition}
	 */
	@Nullable
	public String compressedDefinition() {
		return this.compressedDefinition;
	}

	/**
	 * Information on the creator of the trained model.
	 * <p>
	 * API name: {@code created_by}
	 */
	@Nullable
	public String createdBy() {
		return this.createdBy;
	}

	/**
	 * The time when the trained model was created.
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public String createTime() {
		return this.createTime;
	}

	/**
	 * Any field map described in the inference configuration takes precedence.
	 * <p>
	 * API name: {@code default_field_map}
	 */
	@Nullable
	public Map<String, String> defaultFieldMap() {
		return this.defaultFieldMap;
	}

	/**
	 * The free-text description of the trained model.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * The estimated heap usage in bytes to keep the trained model in memory.
	 * <p>
	 * API name: {@code estimated_heap_memory_usage_bytes}
	 */
	@Nullable
	public Integer estimatedHeapMemoryUsageBytes() {
		return this.estimatedHeapMemoryUsageBytes;
	}

	/**
	 * The estimated number of operations to use the trained model.
	 * <p>
	 * API name: {@code estimated_operations}
	 */
	@Nullable
	public Integer estimatedOperations() {
		return this.estimatedOperations;
	}

	/**
	 * The default configuration for inference. This can be either a regression or
	 * classification configuration. It must match the underlying
	 * definition.trained_model's target_type.
	 * <p>
	 * API name: {@code inference_config}
	 */
	public InferenceConfig inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * The input field names for the model definition.
	 * <p>
	 * API name: {@code input}
	 */
	public TrainedModelConfigInput input() {
		return this.input;
	}

	/**
	 * The license level of the trained model.
	 * <p>
	 * API name: {@code license_level}
	 */
	@Nullable
	public String licenseLevel() {
		return this.licenseLevel;
	}

	/**
	 * An object containing metadata about the trained model. For example, models
	 * created by data frame analytics contain analysis_config and input objects.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public TrainedModelConfigMetadata metadata() {
		return this.metadata;
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

		generator.writeKey("tags");
		generator.writeStartArray();
		for (String item0 : this.tags) {
			generator.write(item0);

		}
		generator.writeEnd();

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
			generator.write(this.createTime);

		}
		if (this.defaultFieldMap != null) {

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

		generator.writeKey("inference_config");
		this.inferenceConfig.serialize(generator, mapper);

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelConfig}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelConfig> {
		private String modelId;

		private List<String> tags;

		@Nullable
		private String version;

		@Nullable
		private String compressedDefinition;

		@Nullable
		private String createdBy;

		@Nullable
		private String createTime;

		@Nullable
		private Map<String, String> defaultFieldMap;

		@Nullable
		private String description;

		@Nullable
		private Integer estimatedHeapMemoryUsageBytes;

		@Nullable
		private Integer estimatedOperations;

		private InferenceConfig inferenceConfig;

		private TrainedModelConfigInput input;

		@Nullable
		private String licenseLevel;

		@Nullable
		private TrainedModelConfigMetadata metadata;

		/**
		 * Idetifier for the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * A comma delimited string of tags. A trained model can have many tags, or
		 * none.
		 * <p>
		 * API name: {@code tags}
		 */
		public Builder tags(List<String> value) {
			this.tags = value;
			return this;
		}

		/**
		 * A comma delimited string of tags. A trained model can have many tags, or
		 * none.
		 * <p>
		 * API name: {@code tags}
		 */
		public Builder tags(String... value) {
			this.tags = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tags(List)}, creating the list if needed.
		 */
		public Builder addTags(String value) {
			if (this.tags == null) {
				this.tags = new ArrayList<>();
			}
			this.tags.add(value);
			return this;
		}

		/**
		 * The Elasticsearch version number in which the trained model was created.
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code compressed_definition}
		 */
		public Builder compressedDefinition(@Nullable String value) {
			this.compressedDefinition = value;
			return this;
		}

		/**
		 * Information on the creator of the trained model.
		 * <p>
		 * API name: {@code created_by}
		 */
		public Builder createdBy(@Nullable String value) {
			this.createdBy = value;
			return this;
		}

		/**
		 * The time when the trained model was created.
		 * <p>
		 * API name: {@code create_time}
		 */
		public Builder createTime(@Nullable String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * Any field map described in the inference configuration takes precedence.
		 * <p>
		 * API name: {@code default_field_map}
		 */
		public Builder defaultFieldMap(@Nullable Map<String, String> value) {
			this.defaultFieldMap = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #defaultFieldMap(Map)}, creating the map if needed.
		 */
		public Builder putDefaultFieldMap(String key, String value) {
			if (this.defaultFieldMap == null) {
				this.defaultFieldMap = new HashMap<>();
			}
			this.defaultFieldMap.put(key, value);
			return this;
		}

		/**
		 * The free-text description of the trained model.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The estimated heap usage in bytes to keep the trained model in memory.
		 * <p>
		 * API name: {@code estimated_heap_memory_usage_bytes}
		 */
		public Builder estimatedHeapMemoryUsageBytes(@Nullable Integer value) {
			this.estimatedHeapMemoryUsageBytes = value;
			return this;
		}

		/**
		 * The estimated number of operations to use the trained model.
		 * <p>
		 * API name: {@code estimated_operations}
		 */
		public Builder estimatedOperations(@Nullable Integer value) {
			this.estimatedOperations = value;
			return this;
		}

		/**
		 * The default configuration for inference. This can be either a regression or
		 * classification configuration. It must match the underlying
		 * definition.trained_model's target_type.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public Builder inferenceConfig(InferenceConfig value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * The default configuration for inference. This can be either a regression or
		 * classification configuration. It must match the underlying
		 * definition.trained_model's target_type.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public Builder inferenceConfig(Function<InferenceConfig.Builder, ObjectBuilder<InferenceConfig>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfig.Builder()).build());
		}

		/**
		 * The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public Builder input(TrainedModelConfigInput value) {
			this.input = value;
			return this;
		}

		/**
		 * The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public Builder input(Function<TrainedModelConfigInput.Builder, ObjectBuilder<TrainedModelConfigInput>> fn) {
			return this.input(fn.apply(new TrainedModelConfigInput.Builder()).build());
		}

		/**
		 * The license level of the trained model.
		 * <p>
		 * API name: {@code license_level}
		 */
		public Builder licenseLevel(@Nullable String value) {
			this.licenseLevel = value;
			return this;
		}

		/**
		 * An object containing metadata about the trained model. For example, models
		 * created by data frame analytics contain analysis_config and input objects.
		 * <p>
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable TrainedModelConfigMetadata value) {
			this.metadata = value;
			return this;
		}

		/**
		 * An object containing metadata about the trained model. For example, models
		 * created by data frame analytics contain analysis_config and input objects.
		 * <p>
		 * API name: {@code metadata}
		 */
		public Builder metadata(
				Function<TrainedModelConfigMetadata.Builder, ObjectBuilder<TrainedModelConfigMetadata>> fn) {
			return this.metadata(fn.apply(new TrainedModelConfigMetadata.Builder()).build());
		}

		/**
		 * Builds a {@link TrainedModelConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelConfig build() {

			return new TrainedModelConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelConfig}
	 */
	public static final JsonpDeserializer<TrainedModelConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelConfig::setupTrainedModelConfigDeserializer, Builder::build);

	protected static void setupTrainedModelConfigDeserializer(DelegatingDeserializer<TrainedModelConfig.Builder> op) {

		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::tags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "tags");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::compressedDefinition, JsonpDeserializer.stringDeserializer(), "compressed_definition");
		op.add(Builder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time");
		op.add(Builder::defaultFieldMap,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "default_field_map");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::estimatedHeapMemoryUsageBytes, JsonpDeserializer.integerDeserializer(),
				"estimated_heap_memory_usage_bytes");
		op.add(Builder::estimatedOperations, JsonpDeserializer.integerDeserializer(), "estimated_operations");
		op.add(Builder::inferenceConfig, InferenceConfig._DESERIALIZER, "inference_config");
		op.add(Builder::input, TrainedModelConfigInput._DESERIALIZER, "input");
		op.add(Builder::licenseLevel, JsonpDeserializer.stringDeserializer(), "license_level");
		op.add(Builder::metadata, TrainedModelConfigMetadata._DESERIALIZER, "metadata");

	}

}
