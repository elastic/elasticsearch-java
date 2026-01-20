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

	private final String inferenceText;

	private final String field;

	@Nullable
	private final ChunkRescorer chunkRescorer;

	// ---------------------------------------------------------------------------------------------

	private TextSimilarityReranker(Builder builder) {
		super(builder);

		this.retriever = ApiTypeHelper.requireNonNull(builder.retriever, this, "retriever");
		this.rankWindowSize = builder.rankWindowSize;
		this.inferenceId = builder.inferenceId;
		this.inferenceText = ApiTypeHelper.requireNonNull(builder.inferenceText, this, "inferenceText");
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.chunkRescorer = builder.chunkRescorer;

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
	 * Required - The text snippet used as the basis for similarity comparison.
	 * <p>
	 * API name: {@code inference_text}
	 */
	public final String inferenceText() {
		return this.inferenceText;
	}

	/**
	 * Required - The document field to be used for text similarity comparisons.
	 * This field should contain the text that will be evaluated against the
	 * inference_text.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Whether to rescore on only the best matching chunks.
	 * <p>
	 * API name: {@code chunk_rescorer}
	 */
	@Nullable
	public final ChunkRescorer chunkRescorer() {
		return this.chunkRescorer;
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
		generator.writeKey("inference_text");
		generator.write(this.inferenceText);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.chunkRescorer != null) {
			generator.writeKey("chunk_rescorer");
			this.chunkRescorer.serialize(generator, mapper);

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

		private String inferenceText;

		private String field;

		@Nullable
		private ChunkRescorer chunkRescorer;

		public Builder() {
		}
		private Builder(TextSimilarityReranker instance) {
			this.retriever = instance.retriever;
			this.rankWindowSize = instance.rankWindowSize;
			this.inferenceId = instance.inferenceId;
			this.inferenceText = instance.inferenceText;
			this.field = instance.field;
			this.chunkRescorer = instance.chunkRescorer;

		}
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
		 * Required - The text snippet used as the basis for similarity comparison.
		 * <p>
		 * API name: {@code inference_text}
		 */
		public final Builder inferenceText(String value) {
			this.inferenceText = value;
			return this;
		}

		/**
		 * Required - The document field to be used for text similarity comparisons.
		 * This field should contain the text that will be evaluated against the
		 * inference_text.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Whether to rescore on only the best matching chunks.
		 * <p>
		 * API name: {@code chunk_rescorer}
		 */
		public final Builder chunkRescorer(@Nullable ChunkRescorer value) {
			this.chunkRescorer = value;
			return this;
		}

		/**
		 * Whether to rescore on only the best matching chunks.
		 * <p>
		 * API name: {@code chunk_rescorer}
		 */
		public final Builder chunkRescorer(Function<ChunkRescorer.Builder, ObjectBuilder<ChunkRescorer>> fn) {
			return this.chunkRescorer(fn.apply(new ChunkRescorer.Builder()).build());
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
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
		op.add(Builder::chunkRescorer, ChunkRescorer._DESERIALIZER, "chunk_rescorer");

	}

}
