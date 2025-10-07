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
import java.lang.String;
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

// typedef: _types.mapping.SemanticTextProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.SemanticTextProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class SemanticTextProperty implements PropertyVariant, JsonpSerializable {
	private final Map<String, String> meta;

	@Nullable
	private final String inferenceId;

	@Nullable
	private final String searchInferenceId;

	@Nullable
	private final SemanticTextIndexOptions indexOptions;

	@Nullable
	private final ChunkingSettings chunkingSettings;

	private final Map<String, Property> fields;

	// ---------------------------------------------------------------------------------------------

	private SemanticTextProperty(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.inferenceId = builder.inferenceId;
		this.searchInferenceId = builder.searchInferenceId;
		this.indexOptions = builder.indexOptions;
		this.chunkingSettings = builder.chunkingSettings;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);

	}

	public static SemanticTextProperty of(Function<Builder, ObjectBuilder<SemanticTextProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.SemanticText;
	}

	/**
	 * API name: {@code meta}
	 */
	public final Map<String, String> meta() {
		return this.meta;
	}

	/**
	 * Inference endpoint that will be used to generate embeddings for the field.
	 * This parameter cannot be updated. Use the Create inference API to create the
	 * endpoint. If <code>search_inference_id</code> is specified, the inference
	 * endpoint will only be used at index time.
	 * <p>
	 * API name: {@code inference_id}
	 */
	@Nullable
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * Inference endpoint that will be used to generate embeddings at query time.
	 * You can update this parameter by using the Update mapping API. Use the Create
	 * inference API to create the endpoint. If not specified, the inference
	 * endpoint defined by inference_id will be used at both index and query time.
	 * <p>
	 * API name: {@code search_inference_id}
	 */
	@Nullable
	public final String searchInferenceId() {
		return this.searchInferenceId;
	}

	/**
	 * Settings for index_options that override any defaults used by semantic_text,
	 * for example specific quantization settings.
	 * <p>
	 * API name: {@code index_options}
	 */
	@Nullable
	public final SemanticTextIndexOptions indexOptions() {
		return this.indexOptions;
	}

	/**
	 * Settings for chunking text into smaller passages. If specified, these will
	 * override the chunking settings sent in the inference endpoint associated with
	 * inference_id. If chunking settings are updated, they will not be applied to
	 * existing documents until they are reindexed.
	 * <p>
	 * API name: {@code chunking_settings}
	 */
	@Nullable
	public final ChunkingSettings chunkingSettings() {
		return this.chunkingSettings;
	}

	/**
	 * Multi-fields allow the same string value to be indexed in multiple ways for
	 * different purposes, such as one field for search and a multi-field for
	 * sorting and aggregations, or the same string value analyzed by different
	 * analyzers.
	 * <p>
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

		generator.write("type", "semantic_text");

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.inferenceId != null) {
			generator.writeKey("inference_id");
			generator.write(this.inferenceId);

		}
		if (this.searchInferenceId != null) {
			generator.writeKey("search_inference_id");
			generator.write(this.searchInferenceId);

		}
		if (this.indexOptions != null) {
			generator.writeKey("index_options");
			this.indexOptions.serialize(generator, mapper);

		}
		if (this.chunkingSettings != null) {
			generator.writeKey("chunking_settings");
			this.chunkingSettings.serialize(generator, mapper);

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SemanticTextProperty}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SemanticTextProperty> {
		@Nullable
		private Map<String, String> meta;

		@Nullable
		private String inferenceId;

		@Nullable
		private String searchInferenceId;

		@Nullable
		private SemanticTextIndexOptions indexOptions;

		@Nullable
		private ChunkingSettings chunkingSettings;

		@Nullable
		private Map<String, Property> fields;

		/**
		 * API name: {@code meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, String> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, String value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * Inference endpoint that will be used to generate embeddings for the field.
		 * This parameter cannot be updated. Use the Create inference API to create the
		 * endpoint. If <code>search_inference_id</code> is specified, the inference
		 * endpoint will only be used at index time.
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(@Nullable String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * Inference endpoint that will be used to generate embeddings at query time.
		 * You can update this parameter by using the Update mapping API. Use the Create
		 * inference API to create the endpoint. If not specified, the inference
		 * endpoint defined by inference_id will be used at both index and query time.
		 * <p>
		 * API name: {@code search_inference_id}
		 */
		public final Builder searchInferenceId(@Nullable String value) {
			this.searchInferenceId = value;
			return this;
		}

		/**
		 * Settings for index_options that override any defaults used by semantic_text,
		 * for example specific quantization settings.
		 * <p>
		 * API name: {@code index_options}
		 */
		public final Builder indexOptions(@Nullable SemanticTextIndexOptions value) {
			this.indexOptions = value;
			return this;
		}

		/**
		 * Settings for index_options that override any defaults used by semantic_text,
		 * for example specific quantization settings.
		 * <p>
		 * API name: {@code index_options}
		 */
		public final Builder indexOptions(
				Function<SemanticTextIndexOptions.Builder, ObjectBuilder<SemanticTextIndexOptions>> fn) {
			return this.indexOptions(fn.apply(new SemanticTextIndexOptions.Builder()).build());
		}

		/**
		 * Settings for chunking text into smaller passages. If specified, these will
		 * override the chunking settings sent in the inference endpoint associated with
		 * inference_id. If chunking settings are updated, they will not be applied to
		 * existing documents until they are reindexed.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(@Nullable ChunkingSettings value) {
			this.chunkingSettings = value;
			return this;
		}

		/**
		 * Settings for chunking text into smaller passages. If specified, these will
		 * override the chunking settings sent in the inference endpoint associated with
		 * inference_id. If chunking settings are updated, they will not be applied to
		 * existing documents until they are reindexed.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(Function<ChunkingSettings.Builder, ObjectBuilder<ChunkingSettings>> fn) {
			return this.chunkingSettings(fn.apply(new ChunkingSettings.Builder()).build());
		}

		/**
		 * Multi-fields allow the same string value to be indexed in multiple ways for
		 * different purposes, such as one field for search and a multi-field for
		 * sorting and aggregations, or the same string value analyzed by different
		 * analyzers.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, Property> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * Multi-fields allow the same string value to be indexed in multiple ways for
		 * different purposes, such as one field for search and a multi-field for
		 * sorting and aggregations, or the same string value analyzed by different
		 * analyzers.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, Property value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * Multi-fields allow the same string value to be indexed in multiple ways for
		 * different purposes, such as one field for search and a multi-field for
		 * sorting and aggregations, or the same string value analyzed by different
		 * analyzers.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return fields(key, fn.apply(new Property.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SemanticTextProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SemanticTextProperty build() {
			_checkSingleUse();

			return new SemanticTextProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SemanticTextProperty}
	 */
	public static final JsonpDeserializer<SemanticTextProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SemanticTextProperty::setupSemanticTextPropertyDeserializer);

	protected static void setupSemanticTextPropertyDeserializer(ObjectDeserializer<SemanticTextProperty.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "meta");
		op.add(Builder::inferenceId, JsonpDeserializer.stringDeserializer(), "inference_id");
		op.add(Builder::searchInferenceId, JsonpDeserializer.stringDeserializer(), "search_inference_id");
		op.add(Builder::indexOptions, SemanticTextIndexOptions._DESERIALIZER, "index_options");
		op.add(Builder::chunkingSettings, ChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "fields");

		op.ignore("type");
	}

}
