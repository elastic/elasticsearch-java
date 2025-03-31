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

// typedef: inference._types.JinaAITaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.JinaAITaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class JinaAITaskSettings implements JsonpSerializable {
	@Nullable
	private final Boolean returnDocuments;

	@Nullable
	private final JinaAITextEmbeddingTask task;

	@Nullable
	private final Integer topN;

	// ---------------------------------------------------------------------------------------------

	private JinaAITaskSettings(Builder builder) {

		this.returnDocuments = builder.returnDocuments;
		this.task = builder.task;
		this.topN = builder.topN;

	}

	public static JinaAITaskSettings of(Function<Builder, ObjectBuilder<JinaAITaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>rerank</code> task, return the doc text within the results.
	 * <p>
	 * API name: {@code return_documents}
	 */
	@Nullable
	public final Boolean returnDocuments() {
		return this.returnDocuments;
	}

	/**
	 * For a <code>text_embedding</code> task, the task passed to the model. Valid
	 * values are:
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
	 * API name: {@code task}
	 */
	@Nullable
	public final JinaAITextEmbeddingTask task() {
		return this.task;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.returnDocuments != null) {
			generator.writeKey("return_documents");
			generator.write(this.returnDocuments);

		}
		if (this.task != null) {
			generator.writeKey("task");
			this.task.serialize(generator, mapper);
		}
		if (this.topN != null) {
			generator.writeKey("top_n");
			generator.write(this.topN);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JinaAITaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<JinaAITaskSettings> {
		@Nullable
		private Boolean returnDocuments;

		@Nullable
		private JinaAITextEmbeddingTask task;

		@Nullable
		private Integer topN;

		/**
		 * For a <code>rerank</code> task, return the doc text within the results.
		 * <p>
		 * API name: {@code return_documents}
		 */
		public final Builder returnDocuments(@Nullable Boolean value) {
			this.returnDocuments = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the task passed to the model. Valid
		 * values are:
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
		 * API name: {@code task}
		 */
		public final Builder task(@Nullable JinaAITextEmbeddingTask value) {
			this.task = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JinaAITaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JinaAITaskSettings build() {
			_checkSingleUse();

			return new JinaAITaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JinaAITaskSettings}
	 */
	public static final JsonpDeserializer<JinaAITaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, JinaAITaskSettings::setupJinaAITaskSettingsDeserializer);

	protected static void setupJinaAITaskSettingsDeserializer(ObjectDeserializer<JinaAITaskSettings.Builder> op) {

		op.add(Builder::returnDocuments, JsonpDeserializer.booleanDeserializer(), "return_documents");
		op.add(Builder::task, JinaAITextEmbeddingTask._DESERIALIZER, "task");
		op.add(Builder::topN, JsonpDeserializer.integerDeserializer(), "top_n");

	}

}
