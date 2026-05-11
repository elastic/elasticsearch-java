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
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: inference._types.CohereTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CohereTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class CohereTaskSettings implements JsonpSerializable {
	private final CohereInputType inputType;

	@Nullable
	private final Boolean returnDocuments;

	@Nullable
	private final Integer topN;

	@Nullable
	private final CohereTruncateType truncate;

	// ---------------------------------------------------------------------------------------------

	private CohereTaskSettings(Builder builder) {

		this.inputType = ApiTypeHelper.requireNonNull(builder.inputType, this, "inputType");
		this.returnDocuments = builder.returnDocuments;
		this.topN = builder.topN;
		this.truncate = builder.truncate;

	}

	public static CohereTaskSettings of(Function<Builder, ObjectBuilder<CohereTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - For a <code>text_embedding</code> task, the type of input passed
	 * to the model. Valid values are:
	 * <ul>
	 * <li><code>classification</code>: Use it for embeddings passed through a text
	 * classifier.</li>
	 * <li><code>clustering</code>: Use it for the embeddings run through a
	 * clustering algorithm.</li>
	 * <li><code>ingest</code>: Use it for storing document embeddings in a vector
	 * database.</li>
	 * <li><code>search</code>: Use it for storing embeddings of search queries run
	 * against a vector database to find relevant documents.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: The <code>input_type</code> field is required when using embedding
	 * models <code>v3</code> and higher.
	 * <p>
	 * API name: {@code input_type}
	 */
	public final CohereInputType inputType() {
		return this.inputType;
	}

	/**
	 * For a <code>rerank</code> task, return doc text within the results.
	 * <p>
	 * API name: {@code return_documents}
	 */
	@Nullable
	public final Boolean returnDocuments() {
		return this.returnDocuments;
	}

	/**
	 * For a <code>rerank</code> task, the number of most relevant documents to
	 * return. It defaults to the number of the documents. If this inference
	 * endpoint is used in a <code>text_similarity_reranker</code> retriever query
	 * and <code>top_n</code> is set, it must be greater than or equal to
	 * <code>rank_window_size</code> in the query.
	 * <p>
	 * API name: {@code top_n}
	 */
	@Nullable
	public final Integer topN() {
		return this.topN;
	}

	/**
	 * For a <code>text_embedding</code> task, the method to handle inputs longer
	 * than the maximum token length. Valid values are:
	 * <ul>
	 * <li><code>END</code>: When the input exceeds the maximum input token length,
	 * the end of the input is discarded.</li>
	 * <li><code>NONE</code>: When the input exceeds the maximum input token length,
	 * an error is returned.</li>
	 * <li><code>START</code>: When the input exceeds the maximum input token
	 * length, the start of the input is discarded.</li>
	 * </ul>
	 * <p>
	 * API name: {@code truncate}
	 */
	@Nullable
	public final CohereTruncateType truncate() {
		return this.truncate;
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

		generator.writeKey("input_type");
		this.inputType.serialize(generator, mapper);
		if (this.returnDocuments != null) {
			generator.writeKey("return_documents");
			generator.write(this.returnDocuments);

		}
		if (this.topN != null) {
			generator.writeKey("top_n");
			generator.write(this.topN);

		}
		if (this.truncate != null) {
			generator.writeKey("truncate");
			this.truncate.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CohereTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CohereTaskSettings> {
		private CohereInputType inputType;

		@Nullable
		private Boolean returnDocuments;

		@Nullable
		private Integer topN;

		@Nullable
		private CohereTruncateType truncate;

		public Builder() {
		}
		private Builder(CohereTaskSettings instance) {
			this.inputType = instance.inputType;
			this.returnDocuments = instance.returnDocuments;
			this.topN = instance.topN;
			this.truncate = instance.truncate;

		}
		/**
		 * Required - For a <code>text_embedding</code> task, the type of input passed
		 * to the model. Valid values are:
		 * <ul>
		 * <li><code>classification</code>: Use it for embeddings passed through a text
		 * classifier.</li>
		 * <li><code>clustering</code>: Use it for the embeddings run through a
		 * clustering algorithm.</li>
		 * <li><code>ingest</code>: Use it for storing document embeddings in a vector
		 * database.</li>
		 * <li><code>search</code>: Use it for storing embeddings of search queries run
		 * against a vector database to find relevant documents.</li>
		 * </ul>
		 * <p>
		 * IMPORTANT: The <code>input_type</code> field is required when using embedding
		 * models <code>v3</code> and higher.
		 * <p>
		 * API name: {@code input_type}
		 */
		public final Builder inputType(CohereInputType value) {
			this.inputType = value;
			return this;
		}

		/**
		 * For a <code>rerank</code> task, return doc text within the results.
		 * <p>
		 * API name: {@code return_documents}
		 */
		public final Builder returnDocuments(@Nullable Boolean value) {
			this.returnDocuments = value;
			return this;
		}

		/**
		 * For a <code>rerank</code> task, the number of most relevant documents to
		 * return. It defaults to the number of the documents. If this inference
		 * endpoint is used in a <code>text_similarity_reranker</code> retriever query
		 * and <code>top_n</code> is set, it must be greater than or equal to
		 * <code>rank_window_size</code> in the query.
		 * <p>
		 * API name: {@code top_n}
		 */
		public final Builder topN(@Nullable Integer value) {
			this.topN = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the method to handle inputs longer
		 * than the maximum token length. Valid values are:
		 * <ul>
		 * <li><code>END</code>: When the input exceeds the maximum input token length,
		 * the end of the input is discarded.</li>
		 * <li><code>NONE</code>: When the input exceeds the maximum input token length,
		 * an error is returned.</li>
		 * <li><code>START</code>: When the input exceeds the maximum input token
		 * length, the start of the input is discarded.</li>
		 * </ul>
		 * <p>
		 * API name: {@code truncate}
		 */
		public final Builder truncate(@Nullable CohereTruncateType value) {
			this.truncate = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CohereTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CohereTaskSettings build() {
			_checkSingleUse();

			return new CohereTaskSettings(this);
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
	 * Json deserializer for {@link CohereTaskSettings}
	 */
	public static final JsonpDeserializer<CohereTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CohereTaskSettings::setupCohereTaskSettingsDeserializer);

	protected static void setupCohereTaskSettingsDeserializer(ObjectDeserializer<CohereTaskSettings.Builder> op) {

		op.add(Builder::inputType, CohereInputType._DESERIALIZER, "input_type");
		op.add(Builder::returnDocuments, JsonpDeserializer.booleanDeserializer(), "return_documents");
		op.add(Builder::topN, JsonpDeserializer.integerDeserializer(), "top_n");
		op.add(Builder::truncate, CohereTruncateType._DESERIALIZER, "truncate");

	}

}
