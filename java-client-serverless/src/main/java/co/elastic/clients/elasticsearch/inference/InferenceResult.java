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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.List;
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

// typedef: inference._types.InferenceResult

/**
 * InferenceResult is an aggregation of mutually exclusive variants
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.InferenceResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceResult implements TaggedUnion<InferenceResult.Kind, Object>, JsonpSerializable {

	/**
	 * {@link InferenceResult} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#inference._types.InferenceResult">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		TextEmbeddingBytes("text_embedding_bytes"),

		TextEmbedding("text_embedding"),

		SparseEmbedding("sparse_embedding"),

		Completion("completion"),

		Rerank("rerank"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public InferenceResult(InferenceResultVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._inferenceResultKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private InferenceResult(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static InferenceResult of(Function<Builder, ObjectBuilder<InferenceResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code text_embedding_bytes}?
	 */
	public boolean isTextEmbeddingBytes() {
		return _kind == Kind.TextEmbeddingBytes;
	}

	/**
	 * Get the {@code text_embedding_bytes} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text_embedding_bytes}
	 *             kind.
	 */
	public List<TextEmbeddingByteResult> textEmbeddingBytes() {
		return TaggedUnionUtils.get(this, Kind.TextEmbeddingBytes);
	}

	/**
	 * Is this variant instance of kind {@code text_embedding}?
	 */
	public boolean isTextEmbedding() {
		return _kind == Kind.TextEmbedding;
	}

	/**
	 * Get the {@code text_embedding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text_embedding} kind.
	 */
	public List<TextEmbeddingResult> textEmbedding() {
		return TaggedUnionUtils.get(this, Kind.TextEmbedding);
	}

	/**
	 * Is this variant instance of kind {@code sparse_embedding}?
	 */
	public boolean isSparseEmbedding() {
		return _kind == Kind.SparseEmbedding;
	}

	/**
	 * Get the {@code sparse_embedding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sparse_embedding}
	 *             kind.
	 */
	public List<SparseEmbeddingResult> sparseEmbedding() {
		return TaggedUnionUtils.get(this, Kind.SparseEmbedding);
	}

	/**
	 * Is this variant instance of kind {@code completion}?
	 */
	public boolean isCompletion() {
		return _kind == Kind.Completion;
	}

	/**
	 * Get the {@code completion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code completion} kind.
	 */
	public List<CompletionResult> completion() {
		return TaggedUnionUtils.get(this, Kind.Completion);
	}

	/**
	 * Is this variant instance of kind {@code rerank}?
	 */
	public boolean isRerank() {
		return _kind == Kind.Rerank;
	}

	/**
	 * Get the {@code rerank} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rerank} kind.
	 */
	public List<RankedDocument> rerank() {
		return TaggedUnionUtils.get(this, Kind.Rerank);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case TextEmbeddingBytes :
					generator.writeStartArray();
					for (TextEmbeddingByteResult item0 : ((List<TextEmbeddingByteResult>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case TextEmbedding :
					generator.writeStartArray();
					for (TextEmbeddingResult item0 : ((List<TextEmbeddingResult>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case SparseEmbedding :
					generator.writeStartArray();
					for (SparseEmbeddingResult item0 : ((List<SparseEmbeddingResult>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case Completion :
					generator.writeStartArray();
					for (CompletionResult item0 : ((List<CompletionResult>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case Rerank :
					generator.writeStartArray();
					for (RankedDocument item0 : ((List<RankedDocument>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<InferenceResult> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<InferenceResult> textEmbeddingBytes(List<TextEmbeddingByteResult> v) {
			this._kind = Kind.TextEmbeddingBytes;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceResult> textEmbedding(List<TextEmbeddingResult> v) {
			this._kind = Kind.TextEmbedding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceResult> sparseEmbedding(List<SparseEmbeddingResult> v) {
			this._kind = Kind.SparseEmbedding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceResult> completion(List<CompletionResult> v) {
			this._kind = Kind.Completion;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceResult> rerank(List<RankedDocument> v) {
			this._kind = Kind.Rerank;
			this._value = v;
			return this;
		}

		public InferenceResult build() {
			_checkSingleUse();
			return new InferenceResult(this);
		}

	}

	protected static void setupInferenceResultDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::textEmbeddingBytes, JsonpDeserializer.arrayDeserializer(TextEmbeddingByteResult._DESERIALIZER),
				"text_embedding_bytes");
		op.add(Builder::textEmbedding, JsonpDeserializer.arrayDeserializer(TextEmbeddingResult._DESERIALIZER),
				"text_embedding");
		op.add(Builder::sparseEmbedding, JsonpDeserializer.arrayDeserializer(SparseEmbeddingResult._DESERIALIZER),
				"sparse_embedding");
		op.add(Builder::completion, JsonpDeserializer.arrayDeserializer(CompletionResult._DESERIALIZER), "completion");
		op.add(Builder::rerank, JsonpDeserializer.arrayDeserializer(RankedDocument._DESERIALIZER), "rerank");

	}

	public static final JsonpDeserializer<InferenceResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InferenceResult::setupInferenceResultDeserializer, Builder::build);
}
