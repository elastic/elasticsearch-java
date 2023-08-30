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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch.core.search.InnerHits;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.HasChildQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.HasChildQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class HasChildQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final InnerHits innerHits;

	@Nullable
	private final Integer maxChildren;

	@Nullable
	private final Integer minChildren;

	private final Query query;

	@Nullable
	private final ChildScoreMode scoreMode;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private HasChildQuery(Builder builder) {
		super(builder);

		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.innerHits = builder.innerHits;
		this.maxChildren = builder.maxChildren;
		this.minChildren = builder.minChildren;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.scoreMode = builder.scoreMode;
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static HasChildQuery of(Function<Builder, ObjectBuilder<HasChildQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.HasChild;
	}

	/**
	 * Indicates whether to ignore an unmapped <code>type</code> and not return any
	 * documents instead of an error.
	 * <p>
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * If defined, each search hit will contain inner hits.
	 * <p>
	 * API name: {@code inner_hits}
	 */
	@Nullable
	public final InnerHits innerHits() {
		return this.innerHits;
	}

	/**
	 * Maximum number of child documents that match the query allowed for a returned
	 * parent document. If the parent document exceeds this limit, it is excluded
	 * from the search results.
	 * <p>
	 * API name: {@code max_children}
	 */
	@Nullable
	public final Integer maxChildren() {
		return this.maxChildren;
	}

	/**
	 * Minimum number of child documents that match the query required to match the
	 * query for a returned parent document. If the parent document does not meet
	 * this limit, it is excluded from the search results.
	 * <p>
	 * API name: {@code min_children}
	 */
	@Nullable
	public final Integer minChildren() {
		return this.minChildren;
	}

	/**
	 * Required - Query you wish to run on child documents of the <code>type</code>
	 * field. If a child document matches the search, the query returns the parent
	 * document.
	 * <p>
	 * API name: {@code query}
	 */
	public final Query query() {
		return this.query;
	}

	/**
	 * Indicates how scores for matching child documents affect the root parent
	 * document’s relevance score.
	 * <p>
	 * API name: {@code score_mode}
	 */
	@Nullable
	public final ChildScoreMode scoreMode() {
		return this.scoreMode;
	}

	/**
	 * Required - Name of the child relationship mapped for the <code>join</code>
	 * field.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.innerHits != null) {
			generator.writeKey("inner_hits");
			this.innerHits.serialize(generator, mapper);

		}
		if (this.maxChildren != null) {
			generator.writeKey("max_children");
			generator.write(this.maxChildren);

		}
		if (this.minChildren != null) {
			generator.writeKey("min_children");
			generator.write(this.minChildren);

		}
		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.scoreMode != null) {
			generator.writeKey("score_mode");
			this.scoreMode.serialize(generator, mapper);
		}
		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasChildQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<HasChildQuery> {
		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private InnerHits innerHits;

		@Nullable
		private Integer maxChildren;

		@Nullable
		private Integer minChildren;

		private Query query;

		@Nullable
		private ChildScoreMode scoreMode;

		private String type;

		/**
		 * Indicates whether to ignore an unmapped <code>type</code> and not return any
		 * documents instead of an error.
		 * <p>
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * If defined, each search hit will contain inner hits.
		 * <p>
		 * API name: {@code inner_hits}
		 */
		public final Builder innerHits(@Nullable InnerHits value) {
			this.innerHits = value;
			return this;
		}

		/**
		 * If defined, each search hit will contain inner hits.
		 * <p>
		 * API name: {@code inner_hits}
		 */
		public final Builder innerHits(Function<InnerHits.Builder, ObjectBuilder<InnerHits>> fn) {
			return this.innerHits(fn.apply(new InnerHits.Builder()).build());
		}

		/**
		 * Maximum number of child documents that match the query allowed for a returned
		 * parent document. If the parent document exceeds this limit, it is excluded
		 * from the search results.
		 * <p>
		 * API name: {@code max_children}
		 */
		public final Builder maxChildren(@Nullable Integer value) {
			this.maxChildren = value;
			return this;
		}

		/**
		 * Minimum number of child documents that match the query required to match the
		 * query for a returned parent document. If the parent document does not meet
		 * this limit, it is excluded from the search results.
		 * <p>
		 * API name: {@code min_children}
		 */
		public final Builder minChildren(@Nullable Integer value) {
			this.minChildren = value;
			return this;
		}

		/**
		 * Required - Query you wish to run on child documents of the <code>type</code>
		 * field. If a child document matches the search, the query returns the parent
		 * document.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - Query you wish to run on child documents of the <code>type</code>
		 * field. If a child document matches the search, the query returns the parent
		 * document.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Indicates how scores for matching child documents affect the root parent
		 * document’s relevance score.
		 * <p>
		 * API name: {@code score_mode}
		 */
		public final Builder scoreMode(@Nullable ChildScoreMode value) {
			this.scoreMode = value;
			return this;
		}

		/**
		 * Required - Name of the child relationship mapped for the <code>join</code>
		 * field.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HasChildQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasChildQuery build() {
			_checkSingleUse();

			return new HasChildQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HasChildQuery}
	 */
	public static final JsonpDeserializer<HasChildQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HasChildQuery::setupHasChildQueryDeserializer);

	protected static void setupHasChildQueryDeserializer(ObjectDeserializer<HasChildQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::innerHits, InnerHits._DESERIALIZER, "inner_hits");
		op.add(Builder::maxChildren, JsonpDeserializer.integerDeserializer(), "max_children");
		op.add(Builder::minChildren, JsonpDeserializer.integerDeserializer(), "min_children");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::scoreMode, ChildScoreMode._DESERIALIZER, "score_mode");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
