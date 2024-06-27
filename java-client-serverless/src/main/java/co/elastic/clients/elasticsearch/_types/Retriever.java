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

// typedef: _types.RetrieverContainer

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RetrieverContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Retriever implements TaggedUnion<Retriever.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Retriever} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#_types.RetrieverContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Standard("standard"),

		Knn("knn"),

		Rrf("rrf"),

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

	public Retriever(RetrieverVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._retrieverKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Retriever(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Retriever of(Function<Builder, ObjectBuilder<Retriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code standard}?
	 */
	public boolean isStandard() {
		return _kind == Kind.Standard;
	}

	/**
	 * Get the {@code standard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code standard} kind.
	 */
	public StandardRetriever standard() {
		return TaggedUnionUtils.get(this, Kind.Standard);
	}

	/**
	 * Is this variant instance of kind {@code knn}?
	 */
	public boolean isKnn() {
		return _kind == Kind.Knn;
	}

	/**
	 * Get the {@code knn} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code knn} kind.
	 */
	public KnnRetriever knn() {
		return TaggedUnionUtils.get(this, Kind.Knn);
	}

	/**
	 * Is this variant instance of kind {@code rrf}?
	 */
	public boolean isRrf() {
		return _kind == Kind.Rrf;
	}

	/**
	 * Get the {@code rrf} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rrf} kind.
	 */
	public RRFRetriever rrf() {
		return TaggedUnionUtils.get(this, Kind.Rrf);
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Retriever> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Retriever> standard(StandardRetriever v) {
			this._kind = Kind.Standard;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> standard(
				Function<StandardRetriever.Builder, ObjectBuilder<StandardRetriever>> fn) {
			return this.standard(fn.apply(new StandardRetriever.Builder()).build());
		}

		public ObjectBuilder<Retriever> knn(KnnRetriever v) {
			this._kind = Kind.Knn;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> knn(Function<KnnRetriever.Builder, ObjectBuilder<KnnRetriever>> fn) {
			return this.knn(fn.apply(new KnnRetriever.Builder()).build());
		}

		public ObjectBuilder<Retriever> rrf(RRFRetriever v) {
			this._kind = Kind.Rrf;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> rrf(Function<RRFRetriever.Builder, ObjectBuilder<RRFRetriever>> fn) {
			return this.rrf(fn.apply(new RRFRetriever.Builder()).build());
		}

		public Retriever build() {
			_checkSingleUse();
			return new Retriever(this);
		}

	}

	protected static void setupRetrieverDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::standard, StandardRetriever._DESERIALIZER, "standard");
		op.add(Builder::knn, KnnRetriever._DESERIALIZER, "knn");
		op.add(Builder::rrf, RRFRetriever._DESERIALIZER, "rrf");

	}

	public static final JsonpDeserializer<Retriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Retriever::setupRetrieverDeserializer, Builder::build);
}
