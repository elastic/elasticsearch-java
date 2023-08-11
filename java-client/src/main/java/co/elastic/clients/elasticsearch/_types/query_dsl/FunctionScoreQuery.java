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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FunctionScoreQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.FunctionScoreQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class FunctionScoreQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final FunctionBoostMode boostMode;

	private final List<FunctionScore> functions;

	@Nullable
	private final Double maxBoost;

	@Nullable
	private final Double minScore;

	@Nullable
	private final Query query;

	@Nullable
	private final FunctionScoreMode scoreMode;

	// ---------------------------------------------------------------------------------------------

	private FunctionScoreQuery(Builder builder) {
		super(builder);

		this.boostMode = builder.boostMode;
		this.functions = ApiTypeHelper.unmodifiable(builder.functions);
		this.maxBoost = builder.maxBoost;
		this.minScore = builder.minScore;
		this.query = builder.query;
		this.scoreMode = builder.scoreMode;

	}

	public static FunctionScoreQuery of(Function<Builder, ObjectBuilder<FunctionScoreQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.FunctionScore;
	}

	/**
	 * Defines how he newly computed score is combined with the score of the query
	 * <p>
	 * API name: {@code boost_mode}
	 */
	@Nullable
	public final FunctionBoostMode boostMode() {
		return this.boostMode;
	}

	/**
	 * One or more functions that compute a new score for each document returned by
	 * the query.
	 * <p>
	 * API name: {@code functions}
	 */
	public final List<FunctionScore> functions() {
		return this.functions;
	}

	/**
	 * Restricts the new score to not exceed the provided limit.
	 * <p>
	 * API name: {@code max_boost}
	 */
	@Nullable
	public final Double maxBoost() {
		return this.maxBoost;
	}

	/**
	 * Excludes documents that do not meet the provided score threshold.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public final Double minScore() {
		return this.minScore;
	}

	/**
	 * A query that determines the documents for which a new score is computed.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Specifies how the computed scores are combined
	 * <p>
	 * API name: {@code score_mode}
	 */
	@Nullable
	public final FunctionScoreMode scoreMode() {
		return this.scoreMode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.boostMode != null) {
			generator.writeKey("boost_mode");
			this.boostMode.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.functions)) {
			generator.writeKey("functions");
			generator.writeStartArray();
			for (FunctionScore item0 : this.functions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxBoost != null) {
			generator.writeKey("max_boost");
			generator.write(this.maxBoost);

		}
		if (this.minScore != null) {
			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.scoreMode != null) {
			generator.writeKey("score_mode");
			this.scoreMode.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FunctionScoreQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FunctionScoreQuery> {
		@Nullable
		private FunctionBoostMode boostMode;

		@Nullable
		private List<FunctionScore> functions;

		@Nullable
		private Double maxBoost;

		@Nullable
		private Double minScore;

		@Nullable
		private Query query;

		@Nullable
		private FunctionScoreMode scoreMode;

		/**
		 * Defines how he newly computed score is combined with the score of the query
		 * <p>
		 * API name: {@code boost_mode}
		 */
		public final Builder boostMode(@Nullable FunctionBoostMode value) {
			this.boostMode = value;
			return this;
		}

		/**
		 * One or more functions that compute a new score for each document returned by
		 * the query.
		 * <p>
		 * API name: {@code functions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>functions</code>.
		 */
		public final Builder functions(List<FunctionScore> list) {
			this.functions = _listAddAll(this.functions, list);
			return this;
		}

		/**
		 * One or more functions that compute a new score for each document returned by
		 * the query.
		 * <p>
		 * API name: {@code functions}
		 * <p>
		 * Adds one or more values to <code>functions</code>.
		 */
		public final Builder functions(FunctionScore value, FunctionScore... values) {
			this.functions = _listAdd(this.functions, value, values);
			return this;
		}

		/**
		 * One or more functions that compute a new score for each document returned by
		 * the query.
		 * <p>
		 * API name: {@code functions}
		 * <p>
		 * Adds a value to <code>functions</code> using a builder lambda.
		 */
		public final Builder functions(Function<FunctionScore.Builder, ObjectBuilder<FunctionScore>> fn) {
			return functions(fn.apply(new FunctionScore.Builder()).build());
		}

		/**
		 * Restricts the new score to not exceed the provided limit.
		 * <p>
		 * API name: {@code max_boost}
		 */
		public final Builder maxBoost(@Nullable Double value) {
			this.maxBoost = value;
			return this;
		}

		/**
		 * Excludes documents that do not meet the provided score threshold.
		 * <p>
		 * API name: {@code min_score}
		 */
		public final Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * A query that determines the documents for which a new score is computed.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * A query that determines the documents for which a new score is computed.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Specifies how the computed scores are combined
		 * <p>
		 * API name: {@code score_mode}
		 */
		public final Builder scoreMode(@Nullable FunctionScoreMode value) {
			this.scoreMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FunctionScoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FunctionScoreQuery build() {
			_checkSingleUse();

			return new FunctionScoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FunctionScoreQuery}
	 */
	public static final JsonpDeserializer<FunctionScoreQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FunctionScoreQuery::setupFunctionScoreQueryDeserializer);

	protected static void setupFunctionScoreQueryDeserializer(ObjectDeserializer<FunctionScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::boostMode, FunctionBoostMode._DESERIALIZER, "boost_mode");
		op.add(Builder::functions, JsonpDeserializer.arrayDeserializer(FunctionScore._DESERIALIZER), "functions");
		op.add(Builder::maxBoost, JsonpDeserializer.doubleDeserializer(), "max_boost");
		op.add(Builder::minScore, JsonpDeserializer.doubleDeserializer(), "min_score");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::scoreMode, FunctionScoreMode._DESERIALIZER, "score_mode");

	}

}
