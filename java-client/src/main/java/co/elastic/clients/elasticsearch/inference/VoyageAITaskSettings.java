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

// typedef: inference._types.VoyageAITaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.VoyageAITaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class VoyageAITaskSettings implements JsonpSerializable {
	@Nullable
	private final String inputType;

	@Nullable
	private final Boolean returnDocuments;

	@Nullable
	private final Integer topK;

	@Nullable
	private final Boolean truncation;

	// ---------------------------------------------------------------------------------------------

	private VoyageAITaskSettings(Builder builder) {

		this.inputType = builder.inputType;
		this.returnDocuments = builder.returnDocuments;
		this.topK = builder.topK;
		this.truncation = builder.truncation;

	}

	public static VoyageAITaskSettings of(Function<Builder, ObjectBuilder<VoyageAITaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Type of the input text. Permitted values: <code>ingest</code> (maps to
	 * <code>document</code> in the VoyageAI documentation), <code>search</code>
	 * (maps to <code>query</code> in the VoyageAI documentation). Only for the
	 * <code>text_embedding</code> task type.
	 * <p>
	 * API name: {@code input_type}
	 */
	@Nullable
	public final String inputType() {
		return this.inputType;
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
	 * Whether to truncate the input texts to fit within the context length.
	 * <p>
	 * API name: {@code truncation}
	 */
	@Nullable
	public final Boolean truncation() {
		return this.truncation;
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

		if (this.inputType != null) {
			generator.writeKey("input_type");
			generator.write(this.inputType);

		}
		if (this.returnDocuments != null) {
			generator.writeKey("return_documents");
			generator.write(this.returnDocuments);

		}
		if (this.topK != null) {
			generator.writeKey("top_k");
			generator.write(this.topK);

		}
		if (this.truncation != null) {
			generator.writeKey("truncation");
			generator.write(this.truncation);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VoyageAITaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<VoyageAITaskSettings> {
		@Nullable
		private String inputType;

		@Nullable
		private Boolean returnDocuments;

		@Nullable
		private Integer topK;

		@Nullable
		private Boolean truncation;

		/**
		 * Type of the input text. Permitted values: <code>ingest</code> (maps to
		 * <code>document</code> in the VoyageAI documentation), <code>search</code>
		 * (maps to <code>query</code> in the VoyageAI documentation). Only for the
		 * <code>text_embedding</code> task type.
		 * <p>
		 * API name: {@code input_type}
		 */
		public final Builder inputType(@Nullable String value) {
			this.inputType = value;
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

		/**
		 * Whether to truncate the input texts to fit within the context length.
		 * <p>
		 * API name: {@code truncation}
		 */
		public final Builder truncation(@Nullable Boolean value) {
			this.truncation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VoyageAITaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VoyageAITaskSettings build() {
			_checkSingleUse();

			return new VoyageAITaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VoyageAITaskSettings}
	 */
	public static final JsonpDeserializer<VoyageAITaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, VoyageAITaskSettings::setupVoyageAITaskSettingsDeserializer);

	protected static void setupVoyageAITaskSettingsDeserializer(ObjectDeserializer<VoyageAITaskSettings.Builder> op) {

		op.add(Builder::inputType, JsonpDeserializer.stringDeserializer(), "input_type");
		op.add(Builder::returnDocuments, JsonpDeserializer.booleanDeserializer(), "return_documents");
		op.add(Builder::topK, JsonpDeserializer.integerDeserializer(), "top_k");
		op.add(Builder::truncation, JsonpDeserializer.booleanDeserializer(), "truncation");

	}

}
