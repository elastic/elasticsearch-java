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

// typedef: inference._types.TextEmbeddingInferenceResult

/**
 * TextEmbeddingInferenceResult is an aggregation of mutually exclusive
 * text_embedding variants
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.TextEmbeddingInferenceResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class TextEmbeddingInferenceResult
		implements
			TaggedUnion<TextEmbeddingInferenceResult.Kind, Object>,
			JsonpSerializable {

	/**
	 * {@link TextEmbeddingInferenceResult} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#inference._types.TextEmbeddingInferenceResult">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		TextEmbeddingBytes("text_embedding_bytes"),

		TextEmbeddingBits("text_embedding_bits"),

		TextEmbedding("text_embedding"),

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

	public TextEmbeddingInferenceResult(TextEmbeddingInferenceResultVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._textEmbeddingInferenceResultKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TextEmbeddingInferenceResult(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TextEmbeddingInferenceResult of(Function<Builder, ObjectBuilder<TextEmbeddingInferenceResult>> fn) {
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
	 * Is this variant instance of kind {@code text_embedding_bits}?
	 */
	public boolean isTextEmbeddingBits() {
		return _kind == Kind.TextEmbeddingBits;
	}

	/**
	 * Get the {@code text_embedding_bits} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text_embedding_bits}
	 *             kind.
	 */
	public List<TextEmbeddingByteResult> textEmbeddingBits() {
		return TaggedUnionUtils.get(this, Kind.TextEmbeddingBits);
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
				case TextEmbeddingBits :
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
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TextEmbeddingInferenceResult> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<TextEmbeddingInferenceResult> textEmbeddingBytes(List<TextEmbeddingByteResult> v) {
			this._kind = Kind.TextEmbeddingBytes;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TextEmbeddingInferenceResult> textEmbeddingBits(List<TextEmbeddingByteResult> v) {
			this._kind = Kind.TextEmbeddingBits;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TextEmbeddingInferenceResult> textEmbedding(List<TextEmbeddingResult> v) {
			this._kind = Kind.TextEmbedding;
			this._value = v;
			return this;
		}

		public TextEmbeddingInferenceResult build() {
			_checkSingleUse();
			return new TextEmbeddingInferenceResult(this);
		}

	}

	protected static void setupTextEmbeddingInferenceResultDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::textEmbeddingBytes, JsonpDeserializer.arrayDeserializer(TextEmbeddingByteResult._DESERIALIZER),
				"text_embedding_bytes");
		op.add(Builder::textEmbeddingBits, JsonpDeserializer.arrayDeserializer(TextEmbeddingByteResult._DESERIALIZER),
				"text_embedding_bits");
		op.add(Builder::textEmbedding, JsonpDeserializer.arrayDeserializer(TextEmbeddingResult._DESERIALIZER),
				"text_embedding");

	}

	public static final JsonpDeserializer<TextEmbeddingInferenceResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, TextEmbeddingInferenceResult::setupTextEmbeddingInferenceResultDeserializer, Builder::build);
}
