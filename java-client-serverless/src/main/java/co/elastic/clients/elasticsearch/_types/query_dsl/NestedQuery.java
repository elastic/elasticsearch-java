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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.NestedQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.NestedQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class NestedQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final InnerHits innerHits;

	private final String path;

	private final Query query;

	@Nullable
	private final ChildScoreMode scoreMode;

	// ---------------------------------------------------------------------------------------------

	private NestedQuery(Builder builder) {
		super(builder);

		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.innerHits = builder.innerHits;
		this.path = ApiTypeHelper.requireNonNull(builder.path, this, "path");
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.scoreMode = builder.scoreMode;

	}

	public static NestedQuery of(Function<Builder, ObjectBuilder<NestedQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Nested;
	}

	/**
	 * Indicates whether to ignore an unmapped path and not return any documents
	 * instead of an error.
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
	 * Required - Path to the nested object you wish to search.
	 * <p>
	 * API name: {@code path}
	 */
	public final String path() {
		return this.path;
	}

	/**
	 * Required - Query you wish to run on nested objects in the path.
	 * <p>
	 * API name: {@code query}
	 */
	public final Query query() {
		return this.query;
	}

	/**
	 * How scores for matching child objects affect the root parent document’s
	 * relevance score.
	 * <p>
	 * API name: {@code score_mode}
	 */
	@Nullable
	public final ChildScoreMode scoreMode() {
		return this.scoreMode;
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
		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.scoreMode != null) {
			generator.writeKey("score_mode");
			this.scoreMode.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<NestedQuery> {
		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private InnerHits innerHits;

		private String path;

		private Query query;

		@Nullable
		private ChildScoreMode scoreMode;

		/**
		 * Indicates whether to ignore an unmapped path and not return any documents
		 * instead of an error.
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
		 * Required - Path to the nested object you wish to search.
		 * <p>
		 * API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - Query you wish to run on nested objects in the path.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - Query you wish to run on nested objects in the path.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * How scores for matching child objects affect the root parent document’s
		 * relevance score.
		 * <p>
		 * API name: {@code score_mode}
		 */
		public final Builder scoreMode(@Nullable ChildScoreMode value) {
			this.scoreMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NestedQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedQuery build() {
			_checkSingleUse();

			return new NestedQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NestedQuery}
	 */
	public static final JsonpDeserializer<NestedQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NestedQuery::setupNestedQueryDeserializer);

	protected static void setupNestedQueryDeserializer(ObjectDeserializer<NestedQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::innerHits, InnerHits._DESERIALIZER, "inner_hits");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::scoreMode, ChildScoreMode._DESERIALIZER, "score_mode");

	}

}
