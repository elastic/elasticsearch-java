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

package co.elastic.clients.elasticsearch.inference;

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
import java.lang.Integer;
import java.lang.String;
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

// typedef: inference._types.ElasticsearchServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ElasticsearchServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class ElasticsearchServiceSettings implements JsonpSerializable {
	@Nullable
	private final AdaptiveAllocations adaptiveAllocations;

	@Nullable
	private final String deploymentId;

	private final String modelId;

	@Nullable
	private final Integer numAllocations;

	private final int numThreads;

	@Nullable
	private final String longDocumentStrategy;

	@Nullable
	private final Integer maxChunksPerDoc;

	// ---------------------------------------------------------------------------------------------

	private ElasticsearchServiceSettings(Builder builder) {

		this.adaptiveAllocations = builder.adaptiveAllocations;
		this.deploymentId = builder.deploymentId;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.numAllocations = builder.numAllocations;
		this.numThreads = ApiTypeHelper.requireNonNull(builder.numThreads, this, "numThreads", 0);
		this.longDocumentStrategy = builder.longDocumentStrategy;
		this.maxChunksPerDoc = builder.maxChunksPerDoc;

	}

	public static ElasticsearchServiceSettings of(Function<Builder, ObjectBuilder<ElasticsearchServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Adaptive allocations configuration details. If <code>enabled</code> is true,
	 * the number of allocations of the model is set based on the current load the
	 * process gets. When the load is high, a new model allocation is automatically
	 * created, respecting the value of <code>max_number_of_allocations</code> if
	 * it's set. When the load is low, a model allocation is automatically removed,
	 * respecting the value of <code>min_number_of_allocations</code> if it's set.
	 * If <code>enabled</code> is true, do not set the number of allocations
	 * manually.
	 * <p>
	 * API name: {@code adaptive_allocations}
	 */
	@Nullable
	public final AdaptiveAllocations adaptiveAllocations() {
		return this.adaptiveAllocations;
	}

	/**
	 * The deployment identifier for a trained model deployment. When
	 * <code>deployment_id</code> is used the <code>model_id</code> is optional.
	 * <p>
	 * API name: {@code deployment_id}
	 */
	@Nullable
	public final String deploymentId() {
		return this.deploymentId;
	}

	/**
	 * Required - The name of the model to use for the inference task. It can be the
	 * ID of a built-in model (for example, <code>.multilingual-e5-small</code> for
	 * E5) or a text embedding model that was uploaded by using the Eland client.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The total number of allocations that are assigned to the model across machine
	 * learning nodes. Increasing this value generally increases the throughput. If
	 * adaptive allocations are enabled, do not set this value because it's
	 * automatically set.
	 * <p>
	 * API name: {@code num_allocations}
	 */
	@Nullable
	public final Integer numAllocations() {
		return this.numAllocations;
	}

	/**
	 * Required - The number of threads used by each model allocation during
	 * inference. This setting generally increases the speed per inference request.
	 * The inference process is a compute-bound process;
	 * <code>threads_per_allocations</code> must not exceed the number of available
	 * allocated processors per node. The value must be a power of 2. The maximum
	 * value is 32.
	 * <p>
	 * API name: {@code num_threads}
	 */
	public final int numThreads() {
		return this.numThreads;
	}

	/**
	 * Available only for the <code>rerank</code> task type using the Elastic
	 * reranker model. Controls the strategy used for processing long documents
	 * during inference.
	 * <p>
	 * Possible values:
	 * <ul>
	 * <li><code>truncate</code> (default): Processes only the beginning of each
	 * document.</li>
	 * <li><code>chunk</code>: Splits long documents into smaller parts (chunks)
	 * before inference.</li>
	 * </ul>
	 * <p>
	 * When <code>long_document_strategy</code> is set to <code>chunk</code>,
	 * Elasticsearch splits each document into smaller parts but still returns a
	 * single score per document. That score reflects the highest relevance score
	 * among all chunks.
	 * <p>
	 * API name: {@code long_document_strategy}
	 */
	@Nullable
	public final String longDocumentStrategy() {
		return this.longDocumentStrategy;
	}

	/**
	 * Only for the <code>rerank</code> task type. Limits the number of chunks per
	 * document that are sent for inference when chunking is enabled. If not set,
	 * all chunks generated for the document are processed.
	 * <p>
	 * API name: {@code max_chunks_per_doc}
	 */
	@Nullable
	public final Integer maxChunksPerDoc() {
		return this.maxChunksPerDoc;
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

		if (this.adaptiveAllocations != null) {
			generator.writeKey("adaptive_allocations");
			this.adaptiveAllocations.serialize(generator, mapper);

		}
		if (this.deploymentId != null) {
			generator.writeKey("deployment_id");
			generator.write(this.deploymentId);

		}
		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.numAllocations != null) {
			generator.writeKey("num_allocations");
			generator.write(this.numAllocations);

		}
		generator.writeKey("num_threads");
		generator.write(this.numThreads);

		if (this.longDocumentStrategy != null) {
			generator.writeKey("long_document_strategy");
			generator.write(this.longDocumentStrategy);

		}
		if (this.maxChunksPerDoc != null) {
			generator.writeKey("max_chunks_per_doc");
			generator.write(this.maxChunksPerDoc);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ElasticsearchServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ElasticsearchServiceSettings> {
		@Nullable
		private AdaptiveAllocations adaptiveAllocations;

		@Nullable
		private String deploymentId;

		private String modelId;

		@Nullable
		private Integer numAllocations;

		private Integer numThreads;

		@Nullable
		private String longDocumentStrategy;

		@Nullable
		private Integer maxChunksPerDoc;

		public Builder() {
		}
		private Builder(ElasticsearchServiceSettings instance) {
			this.adaptiveAllocations = instance.adaptiveAllocations;
			this.deploymentId = instance.deploymentId;
			this.modelId = instance.modelId;
			this.numAllocations = instance.numAllocations;
			this.numThreads = instance.numThreads;
			this.longDocumentStrategy = instance.longDocumentStrategy;
			this.maxChunksPerDoc = instance.maxChunksPerDoc;

		}
		/**
		 * Adaptive allocations configuration details. If <code>enabled</code> is true,
		 * the number of allocations of the model is set based on the current load the
		 * process gets. When the load is high, a new model allocation is automatically
		 * created, respecting the value of <code>max_number_of_allocations</code> if
		 * it's set. When the load is low, a model allocation is automatically removed,
		 * respecting the value of <code>min_number_of_allocations</code> if it's set.
		 * If <code>enabled</code> is true, do not set the number of allocations
		 * manually.
		 * <p>
		 * API name: {@code adaptive_allocations}
		 */
		public final Builder adaptiveAllocations(@Nullable AdaptiveAllocations value) {
			this.adaptiveAllocations = value;
			return this;
		}

		/**
		 * Adaptive allocations configuration details. If <code>enabled</code> is true,
		 * the number of allocations of the model is set based on the current load the
		 * process gets. When the load is high, a new model allocation is automatically
		 * created, respecting the value of <code>max_number_of_allocations</code> if
		 * it's set. When the load is low, a model allocation is automatically removed,
		 * respecting the value of <code>min_number_of_allocations</code> if it's set.
		 * If <code>enabled</code> is true, do not set the number of allocations
		 * manually.
		 * <p>
		 * API name: {@code adaptive_allocations}
		 */
		public final Builder adaptiveAllocations(
				Function<AdaptiveAllocations.Builder, ObjectBuilder<AdaptiveAllocations>> fn) {
			return this.adaptiveAllocations(fn.apply(new AdaptiveAllocations.Builder()).build());
		}

		/**
		 * The deployment identifier for a trained model deployment. When
		 * <code>deployment_id</code> is used the <code>model_id</code> is optional.
		 * <p>
		 * API name: {@code deployment_id}
		 */
		public final Builder deploymentId(@Nullable String value) {
			this.deploymentId = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. It can be the
		 * ID of a built-in model (for example, <code>.multilingual-e5-small</code> for
		 * E5) or a text embedding model that was uploaded by using the Eland client.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The total number of allocations that are assigned to the model across machine
		 * learning nodes. Increasing this value generally increases the throughput. If
		 * adaptive allocations are enabled, do not set this value because it's
		 * automatically set.
		 * <p>
		 * API name: {@code num_allocations}
		 */
		public final Builder numAllocations(@Nullable Integer value) {
			this.numAllocations = value;
			return this;
		}

		/**
		 * Required - The number of threads used by each model allocation during
		 * inference. This setting generally increases the speed per inference request.
		 * The inference process is a compute-bound process;
		 * <code>threads_per_allocations</code> must not exceed the number of available
		 * allocated processors per node. The value must be a power of 2. The maximum
		 * value is 32.
		 * <p>
		 * API name: {@code num_threads}
		 */
		public final Builder numThreads(int value) {
			this.numThreads = value;
			return this;
		}

		/**
		 * Available only for the <code>rerank</code> task type using the Elastic
		 * reranker model. Controls the strategy used for processing long documents
		 * during inference.
		 * <p>
		 * Possible values:
		 * <ul>
		 * <li><code>truncate</code> (default): Processes only the beginning of each
		 * document.</li>
		 * <li><code>chunk</code>: Splits long documents into smaller parts (chunks)
		 * before inference.</li>
		 * </ul>
		 * <p>
		 * When <code>long_document_strategy</code> is set to <code>chunk</code>,
		 * Elasticsearch splits each document into smaller parts but still returns a
		 * single score per document. That score reflects the highest relevance score
		 * among all chunks.
		 * <p>
		 * API name: {@code long_document_strategy}
		 */
		public final Builder longDocumentStrategy(@Nullable String value) {
			this.longDocumentStrategy = value;
			return this;
		}

		/**
		 * Only for the <code>rerank</code> task type. Limits the number of chunks per
		 * document that are sent for inference when chunking is enabled. If not set,
		 * all chunks generated for the document are processed.
		 * <p>
		 * API name: {@code max_chunks_per_doc}
		 */
		public final Builder maxChunksPerDoc(@Nullable Integer value) {
			this.maxChunksPerDoc = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ElasticsearchServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ElasticsearchServiceSettings build() {
			_checkSingleUse();

			return new ElasticsearchServiceSettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ElasticsearchServiceSettings}
	 */
	public static final JsonpDeserializer<ElasticsearchServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ElasticsearchServiceSettings::setupElasticsearchServiceSettingsDeserializer);

	protected static void setupElasticsearchServiceSettingsDeserializer(
			ObjectDeserializer<ElasticsearchServiceSettings.Builder> op) {

		op.add(Builder::adaptiveAllocations, AdaptiveAllocations._DESERIALIZER, "adaptive_allocations");
		op.add(Builder::deploymentId, JsonpDeserializer.stringDeserializer(), "deployment_id");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::numAllocations, JsonpDeserializer.integerDeserializer(), "num_allocations");
		op.add(Builder::numThreads, JsonpDeserializer.integerDeserializer(), "num_threads");
		op.add(Builder::longDocumentStrategy, JsonpDeserializer.stringDeserializer(), "long_document_strategy");
		op.add(Builder::maxChunksPerDoc, JsonpDeserializer.integerDeserializer(), "max_chunks_per_doc");

	}

}
