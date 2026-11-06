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

package co.elastic.clients.elasticsearch.core.knn_eval;

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

// typedef: _global.knn_eval.KnnEvalQuerySource

/**
 * The source of the query vectors of a kNN evaluation.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalQuerySource">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalQuerySource
		implements
			TaggedUnion<KnnEvalQuerySource.Kind, KnnEvalQuerySourceVariant>,
			JsonpSerializable {

	/**
	 * {@link KnnEvalQuerySource} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalQuerySource">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Docs("docs"),

		Vectors("vectors"),

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
	private final KnnEvalQuerySourceVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final KnnEvalQuerySourceVariant _get() {
		return _value;
	}

	public KnnEvalQuerySource(KnnEvalQuerySourceVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._knnEvalQuerySourceKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private KnnEvalQuerySource(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static KnnEvalQuerySource of(Function<Builder, ObjectBuilder<KnnEvalQuerySource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code docs}?
	 */
	public boolean isDocs() {
		return _kind == Kind.Docs;
	}

	/**
	 * Get the {@code docs} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code docs} kind.
	 */
	public KnnEvalDocsQuerySource docs() {
		return TaggedUnionUtils.get(this, Kind.Docs);
	}

	/**
	 * Is this variant instance of kind {@code vectors}?
	 */
	public boolean isVectors() {
		return _kind == Kind.Vectors;
	}

	/**
	 * Get the {@code vectors} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code vectors} kind.
	 */
	public KnnEvalVectorsQuerySource vectors() {
		return TaggedUnionUtils.get(this, Kind.Vectors);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<KnnEvalQuerySource> {
		private Kind _kind;
		private KnnEvalQuerySourceVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<KnnEvalQuerySource> docs(KnnEvalDocsQuerySource v) {
			this._kind = Kind.Docs;
			this._value = v;
			return this;
		}

		public ObjectBuilder<KnnEvalQuerySource> docs(
				Function<KnnEvalDocsQuerySource.Builder, ObjectBuilder<KnnEvalDocsQuerySource>> fn) {
			return this.docs(fn.apply(new KnnEvalDocsQuerySource.Builder()).build());
		}

		public ObjectBuilder<KnnEvalQuerySource> vectors(KnnEvalVectorsQuerySource v) {
			this._kind = Kind.Vectors;
			this._value = v;
			return this;
		}

		public ObjectBuilder<KnnEvalQuerySource> vectors(
				Function<KnnEvalVectorsQuerySource.Builder, ObjectBuilder<KnnEvalVectorsQuerySource>> fn) {
			return this.vectors(fn.apply(new KnnEvalVectorsQuerySource.Builder()).build());
		}

		public KnnEvalQuerySource build() {
			_checkSingleUse();
			return new KnnEvalQuerySource(this);
		}

	}

	protected static void setupKnnEvalQuerySourceDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::docs, KnnEvalDocsQuerySource._DESERIALIZER, "docs");
		op.add(Builder::vectors, KnnEvalVectorsQuerySource._DESERIALIZER, "vectors");

		op.setTypeProperty("from", null);

	}

	public static final JsonpDeserializer<KnnEvalQuerySource> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnEvalQuerySource::setupKnnEvalQuerySourceDeserializer, Builder::build);
}
