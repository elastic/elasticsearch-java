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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.ModelPackageConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.ModelPackageConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class ModelPackageConfig implements JsonpSerializable {
	@Nullable
	private final Long createTime;

	@Nullable
	private final String description;

	private final Map<String, JsonData> inferenceConfig;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final String minimumVersion;

	@Nullable
	private final String modelRepository;

	@Nullable
	private final String modelType;

	private final String packagedModelId;

	@Nullable
	private final String platformArchitecture;

	@Nullable
	private final TrainedModelPrefixStrings prefixStrings;

	@Nullable
	private final String size;

	@Nullable
	private final String sha256;

	private final List<String> tags;

	@Nullable
	private final String vocabularyFile;

	// ---------------------------------------------------------------------------------------------

	private ModelPackageConfig(Builder builder) {

		this.createTime = builder.createTime;
		this.description = builder.description;
		this.inferenceConfig = ApiTypeHelper.unmodifiable(builder.inferenceConfig);
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.minimumVersion = builder.minimumVersion;
		this.modelRepository = builder.modelRepository;
		this.modelType = builder.modelType;
		this.packagedModelId = ApiTypeHelper.requireNonNullWithDefault(builder.packagedModelId, this, "packagedModelId",
				this.packagedModelId());
		this.platformArchitecture = builder.platformArchitecture;
		this.prefixStrings = builder.prefixStrings;
		this.size = builder.size;
		this.sha256 = builder.sha256;
		this.tags = ApiTypeHelper.unmodifiable(builder.tags);
		this.vocabularyFile = builder.vocabularyFile;

	}

	public static ModelPackageConfig of(Function<Builder, ObjectBuilder<ModelPackageConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code create_time}
	 */
	@Nullable
	public final Long createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code inference_config}
	 */
	public final Map<String, JsonData> inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code minimum_version}
	 */
	@Nullable
	public final String minimumVersion() {
		return this.minimumVersion;
	}

	/**
	 * API name: {@code model_repository}
	 */
	@Nullable
	public final String modelRepository() {
		return this.modelRepository;
	}

	/**
	 * API name: {@code model_type}
	 */
	@Nullable
	public final String modelType() {
		return this.modelType;
	}

	/**
	 * Required - API name: {@code packaged_model_id}
	 */
	public final String packagedModelId() {
		return this.packagedModelId;
	}

	/**
	 * API name: {@code platform_architecture}
	 */
	@Nullable
	public final String platformArchitecture() {
		return this.platformArchitecture;
	}

	/**
	 * API name: {@code prefix_strings}
	 */
	@Nullable
	public final TrainedModelPrefixStrings prefixStrings() {
		return this.prefixStrings;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * API name: {@code sha256}
	 */
	@Nullable
	public final String sha256() {
		return this.sha256;
	}

	/**
	 * API name: {@code tags}
	 */
	public final List<String> tags() {
		return this.tags;
	}

	/**
	 * API name: {@code vocabulary_file}
	 */
	@Nullable
	public final String vocabularyFile() {
		return this.vocabularyFile;
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

		if (this.createTime != null) {
			generator.writeKey("create_time");
			generator.write(this.createTime);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ApiTypeHelper.isDefined(this.inferenceConfig)) {
			generator.writeKey("inference_config");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.inferenceConfig.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.minimumVersion != null) {
			generator.writeKey("minimum_version");
			generator.write(this.minimumVersion);

		}
		if (this.modelRepository != null) {
			generator.writeKey("model_repository");
			generator.write(this.modelRepository);

		}
		if (this.modelType != null) {
			generator.writeKey("model_type");
			generator.write(this.modelType);

		}
		generator.writeKey("packaged_model_id");
		generator.write(this.packagedModelId);

		if (this.platformArchitecture != null) {
			generator.writeKey("platform_architecture");
			generator.write(this.platformArchitecture);

		}
		if (this.prefixStrings != null) {
			generator.writeKey("prefix_strings");
			this.prefixStrings.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.sha256 != null) {
			generator.writeKey("sha256");
			generator.write(this.sha256);

		}
		if (ApiTypeHelper.isDefined(this.tags)) {
			generator.writeKey("tags");
			generator.writeStartArray();
			for (String item0 : this.tags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.vocabularyFile != null) {
			generator.writeKey("vocabulary_file");
			generator.write(this.vocabularyFile);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelPackageConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ModelPackageConfig> {
		@Nullable
		private Long createTime;

		@Nullable
		private String description;

		@Nullable
		private Map<String, JsonData> inferenceConfig;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String minimumVersion;

		@Nullable
		private String modelRepository;

		@Nullable
		private String modelType;

		private String packagedModelId;

		@Nullable
		private String platformArchitecture;

		@Nullable
		private TrainedModelPrefixStrings prefixStrings;

		@Nullable
		private String size;

		@Nullable
		private String sha256;

		@Nullable
		private List<String> tags;

		@Nullable
		private String vocabularyFile;

		/**
		 * API name: {@code create_time}
		 */
		public final Builder createTime(@Nullable Long value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>inferenceConfig</code>.
		 */
		public final Builder inferenceConfig(Map<String, JsonData> map) {
			this.inferenceConfig = _mapPutAll(this.inferenceConfig, map);
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 * <p>
		 * Adds an entry to <code>inferenceConfig</code>.
		 */
		public final Builder inferenceConfig(String key, JsonData value) {
			this.inferenceConfig = _mapPut(this.inferenceConfig, key, value);
			return this;
		}

		/**
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * API name: {@code minimum_version}
		 */
		public final Builder minimumVersion(@Nullable String value) {
			this.minimumVersion = value;
			return this;
		}

		/**
		 * API name: {@code model_repository}
		 */
		public final Builder modelRepository(@Nullable String value) {
			this.modelRepository = value;
			return this;
		}

		/**
		 * API name: {@code model_type}
		 */
		public final Builder modelType(@Nullable String value) {
			this.modelType = value;
			return this;
		}

		/**
		 * Required - API name: {@code packaged_model_id}
		 */
		public final Builder packagedModelId(String value) {
			this.packagedModelId = value;
			return this;
		}

		/**
		 * API name: {@code platform_architecture}
		 */
		public final Builder platformArchitecture(@Nullable String value) {
			this.platformArchitecture = value;
			return this;
		}

		/**
		 * API name: {@code prefix_strings}
		 */
		public final Builder prefixStrings(@Nullable TrainedModelPrefixStrings value) {
			this.prefixStrings = value;
			return this;
		}

		/**
		 * API name: {@code prefix_strings}
		 */
		public final Builder prefixStrings(
				Function<TrainedModelPrefixStrings.Builder, ObjectBuilder<TrainedModelPrefixStrings>> fn) {
			return this.prefixStrings(fn.apply(new TrainedModelPrefixStrings.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sha256}
		 */
		public final Builder sha256(@Nullable String value) {
			this.sha256 = value;
			return this;
		}

		/**
		 * API name: {@code tags}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tags</code>.
		 */
		public final Builder tags(List<String> list) {
			this.tags = _listAddAll(this.tags, list);
			return this;
		}

		/**
		 * API name: {@code tags}
		 * <p>
		 * Adds one or more values to <code>tags</code>.
		 */
		public final Builder tags(String value, String... values) {
			this.tags = _listAdd(this.tags, value, values);
			return this;
		}

		/**
		 * API name: {@code vocabulary_file}
		 */
		public final Builder vocabularyFile(@Nullable String value) {
			this.vocabularyFile = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ModelPackageConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelPackageConfig build() {
			_checkSingleUse();

			return new ModelPackageConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelPackageConfig}
	 */
	public static final JsonpDeserializer<ModelPackageConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ModelPackageConfig::setupModelPackageConfigDeserializer);

	protected static void setupModelPackageConfigDeserializer(ObjectDeserializer<ModelPackageConfig.Builder> op) {

		op.add(Builder::createTime, JsonpDeserializer.longDeserializer(), "create_time");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::inferenceConfig, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"inference_config");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::minimumVersion, JsonpDeserializer.stringDeserializer(), "minimum_version");
		op.add(Builder::modelRepository, JsonpDeserializer.stringDeserializer(), "model_repository");
		op.add(Builder::modelType, JsonpDeserializer.stringDeserializer(), "model_type");
		op.add(Builder::packagedModelId, JsonpDeserializer.stringDeserializer(), "packaged_model_id");
		op.add(Builder::platformArchitecture, JsonpDeserializer.stringDeserializer(), "platform_architecture");
		op.add(Builder::prefixStrings, TrainedModelPrefixStrings._DESERIALIZER, "prefix_strings");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::sha256, JsonpDeserializer.stringDeserializer(), "sha256");
		op.add(Builder::tags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "tags");
		op.add(Builder::vocabularyFile, JsonpDeserializer.stringDeserializer(), "vocabulary_file");

	}

}
