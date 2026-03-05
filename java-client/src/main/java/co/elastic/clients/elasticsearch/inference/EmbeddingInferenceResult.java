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

// typedef: inference._types.EmbeddingInferenceResult

/**
 * EmbeddingInferenceResult is an aggregation of mutually exclusive embeddings
 * variants
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EmbeddingInferenceResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class EmbeddingInferenceResult implements TaggedUnion<EmbeddingInferenceResult.Kind, Object>, JsonpSerializable {

	/**
	 * {@link EmbeddingInferenceResult} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#inference._types.EmbeddingInferenceResult">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		EmbeddingsBytes("embeddings_bytes"),

		EmbeddingsBits("embeddings_bits"),

		Embeddings("embeddings"),

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

	public EmbeddingInferenceResult(EmbeddingInferenceResultVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._embeddingInferenceResultKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private EmbeddingInferenceResult(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static EmbeddingInferenceResult of(Function<Builder, ObjectBuilder<EmbeddingInferenceResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code embeddings_bytes}?
	 */
	public boolean isEmbeddingsBytes() {
		return _kind == Kind.EmbeddingsBytes;
	}

	/**
	 * Get the {@code embeddings_bytes} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code embeddings_bytes}
	 *             kind.
	 */
	public List<DenseEmbeddingByteResult> embeddingsBytes() {
		return TaggedUnionUtils.get(this, Kind.EmbeddingsBytes);
	}

	/**
	 * Is this variant instance of kind {@code embeddings_bits}?
	 */
	public boolean isEmbeddingsBits() {
		return _kind == Kind.EmbeddingsBits;
	}

	/**
	 * Get the {@code embeddings_bits} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code embeddings_bits}
	 *             kind.
	 */
	public List<DenseEmbeddingByteResult> embeddingsBits() {
		return TaggedUnionUtils.get(this, Kind.EmbeddingsBits);
	}

	/**
	 * Is this variant instance of kind {@code embeddings}?
	 */
	public boolean isEmbeddings() {
		return _kind == Kind.Embeddings;
	}

	/**
	 * Get the {@code embeddings} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code embeddings} kind.
	 */
	public List<DenseEmbeddingResult> embeddings() {
		return TaggedUnionUtils.get(this, Kind.Embeddings);
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
				case EmbeddingsBytes :
					generator.writeStartArray();
					for (DenseEmbeddingByteResult item0 : ((List<DenseEmbeddingByteResult>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case EmbeddingsBits :
					generator.writeStartArray();
					for (DenseEmbeddingByteResult item0 : ((List<DenseEmbeddingByteResult>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case Embeddings :
					generator.writeStartArray();
					for (DenseEmbeddingResult item0 : ((List<DenseEmbeddingResult>) this._value)) {
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
				ObjectBuilder<EmbeddingInferenceResult> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<EmbeddingInferenceResult> embeddingsBytes(List<DenseEmbeddingByteResult> v) {
			this._kind = Kind.EmbeddingsBytes;
			this._value = v;
			return this;
		}

		public ObjectBuilder<EmbeddingInferenceResult> embeddingsBits(List<DenseEmbeddingByteResult> v) {
			this._kind = Kind.EmbeddingsBits;
			this._value = v;
			return this;
		}

		public ObjectBuilder<EmbeddingInferenceResult> embeddings(List<DenseEmbeddingResult> v) {
			this._kind = Kind.Embeddings;
			this._value = v;
			return this;
		}

		public EmbeddingInferenceResult build() {
			_checkSingleUse();
			return new EmbeddingInferenceResult(this);
		}

	}

	protected static void setupEmbeddingInferenceResultDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::embeddingsBytes, JsonpDeserializer.arrayDeserializer(DenseEmbeddingByteResult._DESERIALIZER),
				"embeddings_bytes");
		op.add(Builder::embeddingsBits, JsonpDeserializer.arrayDeserializer(DenseEmbeddingByteResult._DESERIALIZER),
				"embeddings_bits");
		op.add(Builder::embeddings, JsonpDeserializer.arrayDeserializer(DenseEmbeddingResult._DESERIALIZER),
				"embeddings");

	}

	public static final JsonpDeserializer<EmbeddingInferenceResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EmbeddingInferenceResult::setupEmbeddingInferenceResultDeserializer, Builder::build);
}
