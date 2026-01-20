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

		TextSimilarityReranker("text_similarity_reranker"),

		Rule("rule"),

		Rescorer("rescorer"),

		Linear("linear"),

		Pinned("pinned"),

		Diversify("diversify"),

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

	/**
	 * Is this variant instance of kind {@code text_similarity_reranker}?
	 */
	public boolean isTextSimilarityReranker() {
		return _kind == Kind.TextSimilarityReranker;
	}

	/**
	 * Get the {@code text_similarity_reranker} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code text_similarity_reranker} kind.
	 */
	public TextSimilarityReranker textSimilarityReranker() {
		return TaggedUnionUtils.get(this, Kind.TextSimilarityReranker);
	}

	/**
	 * Is this variant instance of kind {@code rule}?
	 */
	public boolean isRule() {
		return _kind == Kind.Rule;
	}

	/**
	 * Get the {@code rule} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rule} kind.
	 */
	public RuleRetriever rule() {
		return TaggedUnionUtils.get(this, Kind.Rule);
	}

	/**
	 * Is this variant instance of kind {@code rescorer}?
	 */
	public boolean isRescorer() {
		return _kind == Kind.Rescorer;
	}

	/**
	 * Get the {@code rescorer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rescorer} kind.
	 */
	public RescorerRetriever rescorer() {
		return TaggedUnionUtils.get(this, Kind.Rescorer);
	}

	/**
	 * Is this variant instance of kind {@code linear}?
	 */
	public boolean isLinear() {
		return _kind == Kind.Linear;
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public LinearRetriever linear() {
		return TaggedUnionUtils.get(this, Kind.Linear);
	}

	/**
	 * Is this variant instance of kind {@code pinned}?
	 */
	public boolean isPinned() {
		return _kind == Kind.Pinned;
	}

	/**
	 * Get the {@code pinned} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pinned} kind.
	 */
	public PinnedRetriever pinned() {
		return TaggedUnionUtils.get(this, Kind.Pinned);
	}

	/**
	 * Is this variant instance of kind {@code diversify}?
	 */
	public boolean isDiversify() {
		return _kind == Kind.Diversify;
	}

	/**
	 * Get the {@code diversify} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code diversify} kind.
	 */
	public DiversifyRetriever diversify() {
		return TaggedUnionUtils.get(this, Kind.Diversify);
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

		public ObjectBuilder<Retriever> textSimilarityReranker(TextSimilarityReranker v) {
			this._kind = Kind.TextSimilarityReranker;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> textSimilarityReranker(
				Function<TextSimilarityReranker.Builder, ObjectBuilder<TextSimilarityReranker>> fn) {
			return this.textSimilarityReranker(fn.apply(new TextSimilarityReranker.Builder()).build());
		}

		public ObjectBuilder<Retriever> rule(RuleRetriever v) {
			this._kind = Kind.Rule;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> rule(Function<RuleRetriever.Builder, ObjectBuilder<RuleRetriever>> fn) {
			return this.rule(fn.apply(new RuleRetriever.Builder()).build());
		}

		public ObjectBuilder<Retriever> rescorer(RescorerRetriever v) {
			this._kind = Kind.Rescorer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> rescorer(
				Function<RescorerRetriever.Builder, ObjectBuilder<RescorerRetriever>> fn) {
			return this.rescorer(fn.apply(new RescorerRetriever.Builder()).build());
		}

		public ObjectBuilder<Retriever> linear(LinearRetriever v) {
			this._kind = Kind.Linear;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> linear(Function<LinearRetriever.Builder, ObjectBuilder<LinearRetriever>> fn) {
			return this.linear(fn.apply(new LinearRetriever.Builder()).build());
		}

		public ObjectBuilder<Retriever> pinned(PinnedRetriever v) {
			this._kind = Kind.Pinned;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> pinned(Function<PinnedRetriever.Builder, ObjectBuilder<PinnedRetriever>> fn) {
			return this.pinned(fn.apply(new PinnedRetriever.Builder()).build());
		}

		public ObjectBuilder<Retriever> diversify(DiversifyRetriever v) {
			this._kind = Kind.Diversify;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Retriever> diversify(
				Function<DiversifyRetriever.Builder, ObjectBuilder<DiversifyRetriever>> fn) {
			return this.diversify(fn.apply(new DiversifyRetriever.Builder()).build());
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
		op.add(Builder::textSimilarityReranker, TextSimilarityReranker._DESERIALIZER, "text_similarity_reranker");
		op.add(Builder::rule, RuleRetriever._DESERIALIZER, "rule");
		op.add(Builder::rescorer, RescorerRetriever._DESERIALIZER, "rescorer");
		op.add(Builder::linear, LinearRetriever._DESERIALIZER, "linear");
		op.add(Builder::pinned, PinnedRetriever._DESERIALIZER, "pinned");
		op.add(Builder::diversify, DiversifyRetriever._DESERIALIZER, "diversify");

	}

	public static final JsonpDeserializer<Retriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Retriever::setupRetrieverDeserializer, Builder::build);
}
