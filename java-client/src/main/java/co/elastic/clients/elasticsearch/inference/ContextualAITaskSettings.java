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

// typedef: inference._types.ContextualAITaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ContextualAITaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class ContextualAITaskSettings implements JsonpSerializable {
	@Nullable
	private final String instruction;

	@Nullable
	private final Boolean returnDocuments;

	@Nullable
	private final Integer topK;

	// ---------------------------------------------------------------------------------------------

	private ContextualAITaskSettings(Builder builder) {

		this.instruction = builder.instruction;
		this.returnDocuments = builder.returnDocuments;
		this.topK = builder.topK;

	}

	public static ContextualAITaskSettings of(Function<Builder, ObjectBuilder<ContextualAITaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Instructions for the reranking model. Refer to <a href=
	 * "https://docs.contextual.ai/api-reference/rerank/rerank#body-instruction">https://docs.contextual.ai/api-reference/rerank/rerank#body-instruction</a>
	 * Only for the <code>rerank</code> task type.
	 * <p>
	 * API name: {@code instruction}
	 */
	@Nullable
	public final String instruction() {
		return this.instruction;
	}

	/**
	 * Whether to return the source documents in the response. Only for the
	 * <code>rerank</code> task type.
	 * <p>
	 * API name: {@code return_documents}
	 */
	@Nullable
	public final Boolean returnDocuments() {
		return this.returnDocuments;
	}

	/**
	 * The number of most relevant documents to return. If not specified, the
	 * reranking results of all documents will be returned. Only for the
	 * <code>rerank</code> task type.
	 * <p>
	 * API name: {@code top_k}
	 */
	@Nullable
	public final Integer topK() {
		return this.topK;
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

		if (this.instruction != null) {
			generator.writeKey("instruction");
			generator.write(this.instruction);

		}
		if (this.returnDocuments != null) {
			generator.writeKey("return_documents");
			generator.write(this.returnDocuments);

		}
		if (this.topK != null) {
			generator.writeKey("top_k");
			generator.write(this.topK);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ContextualAITaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ContextualAITaskSettings> {
		@Nullable
		private String instruction;

		@Nullable
		private Boolean returnDocuments;

		@Nullable
		private Integer topK;

		public Builder() {
		}
		private Builder(ContextualAITaskSettings instance) {
			this.instruction = instance.instruction;
			this.returnDocuments = instance.returnDocuments;
			this.topK = instance.topK;

		}
		/**
		 * Instructions for the reranking model. Refer to <a href=
		 * "https://docs.contextual.ai/api-reference/rerank/rerank#body-instruction">https://docs.contextual.ai/api-reference/rerank/rerank#body-instruction</a>
		 * Only for the <code>rerank</code> task type.
		 * <p>
		 * API name: {@code instruction}
		 */
		public final Builder instruction(@Nullable String value) {
			this.instruction = value;
			return this;
		}

		/**
		 * Whether to return the source documents in the response. Only for the
		 * <code>rerank</code> task type.
		 * <p>
		 * API name: {@code return_documents}
		 */
		public final Builder returnDocuments(@Nullable Boolean value) {
			this.returnDocuments = value;
			return this;
		}

		/**
		 * The number of most relevant documents to return. If not specified, the
		 * reranking results of all documents will be returned. Only for the
		 * <code>rerank</code> task type.
		 * <p>
		 * API name: {@code top_k}
		 */
		public final Builder topK(@Nullable Integer value) {
			this.topK = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ContextualAITaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ContextualAITaskSettings build() {
			_checkSingleUse();

			return new ContextualAITaskSettings(this);
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
	 * Json deserializer for {@link ContextualAITaskSettings}
	 */
	public static final JsonpDeserializer<ContextualAITaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ContextualAITaskSettings::setupContextualAITaskSettingsDeserializer);

	protected static void setupContextualAITaskSettingsDeserializer(
			ObjectDeserializer<ContextualAITaskSettings.Builder> op) {

		op.add(Builder::instruction, JsonpDeserializer.stringDeserializer(), "instruction");
		op.add(Builder::returnDocuments, JsonpDeserializer.booleanDeserializer(), "return_documents");
		op.add(Builder::topK, JsonpDeserializer.integerDeserializer(), "top_k");

	}

}
