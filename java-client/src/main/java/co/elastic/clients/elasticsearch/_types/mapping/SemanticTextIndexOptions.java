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

package co.elastic.clients.elasticsearch._types.mapping;

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

// typedef: _types.mapping.SemanticTextIndexOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.SemanticTextIndexOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class SemanticTextIndexOptions implements TaggedUnion<SemanticTextIndexOptions.Kind, Object>, JsonpSerializable {

	/**
	 * {@link SemanticTextIndexOptions} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.mapping.SemanticTextIndexOptions">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		DenseVector("dense_vector"),

		SparseVector("sparse_vector"),

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

	public SemanticTextIndexOptions(SemanticTextIndexOptionsVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._semanticTextIndexOptionsKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private SemanticTextIndexOptions(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SemanticTextIndexOptions of(Function<Builder, ObjectBuilder<SemanticTextIndexOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code dense_vector}?
	 */
	public boolean isDenseVector() {
		return _kind == Kind.DenseVector;
	}

	/**
	 * Get the {@code dense_vector} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dense_vector} kind.
	 */
	public DenseVectorIndexOptions denseVector() {
		return TaggedUnionUtils.get(this, Kind.DenseVector);
	}

	/**
	 * Is this variant instance of kind {@code sparse_vector}?
	 */
	public boolean isSparseVector() {
		return _kind == Kind.SparseVector;
	}

	/**
	 * Get the {@code sparse_vector} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sparse_vector} kind.
	 */
	public SparseVectorIndexOptions sparseVector() {
		return TaggedUnionUtils.get(this, Kind.SparseVector);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SemanticTextIndexOptions> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<SemanticTextIndexOptions> denseVector(DenseVectorIndexOptions v) {
			this._kind = Kind.DenseVector;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SemanticTextIndexOptions> denseVector(
				Function<DenseVectorIndexOptions.Builder, ObjectBuilder<DenseVectorIndexOptions>> fn) {
			return this.denseVector(fn.apply(new DenseVectorIndexOptions.Builder()).build());
		}

		public ObjectBuilder<SemanticTextIndexOptions> sparseVector(SparseVectorIndexOptions v) {
			this._kind = Kind.SparseVector;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SemanticTextIndexOptions> sparseVector(
				Function<SparseVectorIndexOptions.Builder, ObjectBuilder<SparseVectorIndexOptions>> fn) {
			return this.sparseVector(fn.apply(new SparseVectorIndexOptions.Builder()).build());
		}

		public SemanticTextIndexOptions build() {
			_checkSingleUse();
			return new SemanticTextIndexOptions(this);
		}

	}

	protected static void setupSemanticTextIndexOptionsDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::denseVector, DenseVectorIndexOptions._DESERIALIZER, "dense_vector");
		op.add(Builder::sparseVector, SparseVectorIndexOptions._DESERIALIZER, "sparse_vector");

	}

	public static final JsonpDeserializer<SemanticTextIndexOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SemanticTextIndexOptions::setupSemanticTextIndexOptionsDeserializer, Builder::build);
}
