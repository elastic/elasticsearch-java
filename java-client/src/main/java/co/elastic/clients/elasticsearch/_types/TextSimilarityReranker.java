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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _types.TextSimilarityReranker

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.TextSimilarityReranker">API
 *      specification</a>
 */
@JsonpDeserializable
public class TextSimilarityReranker extends RetrieverBase implements RetrieverVariant {
	private final Retriever retriever;

	@Nullable
	private final Integer rankWindowSize;

	@Nullable
	private final String inferenceId;

	@Nullable
	private final String inferenceText;

	@Nullable
	private final String field;

	// ---------------------------------------------------------------------------------------------

	private TextSimilarityReranker(Builder builder) {
		super(builder);

		this.retriever = ApiTypeHelper.requireNonNullWithDefault(builder.retriever, this, "retriever",
				this.retriever());
		this.rankWindowSize = builder.rankWindowSize;
		this.inferenceId = builder.inferenceId;
		this.inferenceText = builder.inferenceText;
		this.field = builder.field;

	}

	public static TextSimilarityReranker of(Function<Builder, ObjectBuilder<TextSimilarityReranker>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.TextSimilarityReranker;
	}

	/**
	 * Required - The nested retriever which will produce the first-level results,
	 * that will later be used for reranking.
	 * <p>
	 * API name: {@code retriever}
	 */
	public final Retriever retriever() {
		return this.retriever;
	}

	/**
	 * This value determines how many documents we will consider from the nested
	 * retriever.
	 * <p>
	 * API name: {@code rank_window_size}
	 */
	@Nullable
	public final Integer rankWindowSize() {
		return this.rankWindowSize;
	}

	/**
	 * Unique identifier of the inference endpoint created using the inference API.
	 * <p>
	 * API name: {@code inference_id}
	 */
	@Nullable
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * The text snippet used as the basis for similarity comparison
	 * <p>
	 * API name: {@code inference_text}
	 */
	@Nullable
	public final String inferenceText() {
		return this.inferenceText;
	}

	/**
	 * The document field to be used for text similarity comparisons. This field
	 * should contain the text that will be evaluated against the inference_text
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("retriever");
		this.retriever.serialize(generator, mapper);

		if (this.rankWindowSize != null) {
			generator.writeKey("rank_window_size");
			generator.write(this.rankWindowSize);

		}
		if (this.inferenceId != null) {
			generator.writeKey("inference_id");
			generator.write(this.inferenceId);

		}
		if (this.inferenceText != null) {
			generator.writeKey("inference_text");
			generator.write(this.inferenceText);

		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TextSimilarityReranker}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TextSimilarityReranker> {
		private Retriever retriever;

		@Nullable
		private Integer rankWindowSize;

		@Nullable
		private String inferenceId;

		@Nullable
		private String inferenceText;

		@Nullable
		private String field;

		/**
		 * Required - The nested retriever which will produce the first-level results,
		 * that will later be used for reranking.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Retriever value) {
			this.retriever = value;
			return this;
		}

		/**
		 * Required - The nested retriever which will produce the first-level results,
		 * that will later be used for reranking.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * Required - The nested retriever which will produce the first-level results,
		 * that will later be used for reranking.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(RetrieverVariant value) {
			this.retriever = value._toRetriever();
			return this;
		}

		/**
		 * This value determines how many documents we will consider from the nested
		 * retriever.
		 * <p>
		 * API name: {@code rank_window_size}
		 */
		public final Builder rankWindowSize(@Nullable Integer value) {
			this.rankWindowSize = value;
			return this;
		}

		/**
		 * Unique identifier of the inference endpoint created using the inference API.
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(@Nullable String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * The text snippet used as the basis for similarity comparison
		 * <p>
		 * API name: {@code inference_text}
		 */
		public final Builder inferenceText(@Nullable String value) {
			this.inferenceText = value;
			return this;
		}

		/**
		 * The document field to be used for text similarity comparisons. This field
		 * should contain the text that will be evaluated against the inference_text
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TextSimilarityReranker}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TextSimilarityReranker build() {
			_checkSingleUse();

			return new TextSimilarityReranker(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TextSimilarityReranker}
	 */
	public static final JsonpDeserializer<TextSimilarityReranker> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TextSimilarityReranker::setupTextSimilarityRerankerDeserializer);

	protected static void setupTextSimilarityRerankerDeserializer(
			ObjectDeserializer<TextSimilarityReranker.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::rankWindowSize, JsonpDeserializer.integerDeserializer(), "rank_window_size");
		op.add(Builder::inferenceId, JsonpDeserializer.stringDeserializer(), "inference_id");
		op.add(Builder::inferenceText, JsonpDeserializer.stringDeserializer(), "inference_text");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
