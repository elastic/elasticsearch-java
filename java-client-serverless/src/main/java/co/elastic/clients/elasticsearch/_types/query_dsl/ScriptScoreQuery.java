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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.ScriptScoreQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.ScriptScoreQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptScoreQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Float minScore;

	private final Query query;

	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private ScriptScoreQuery(Builder builder) {
		super(builder);

		this.minScore = builder.minScore;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static ScriptScoreQuery of(Function<Builder, ObjectBuilder<ScriptScoreQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.ScriptScore;
	}

	/**
	 * Documents with a score lower than this floating point number are excluded
	 * from the search results.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public final Float minScore() {
		return this.minScore;
	}

	/**
	 * Required - Query used to return documents.
	 * <p>
	 * API name: {@code query}
	 */
	public final Query query() {
		return this.query;
	}

	/**
	 * Required - Script used to compute the score of documents returned by the
	 * query. Important: final relevance scores from the <code>script_score</code>
	 * query cannot be negative.
	 * <p>
	 * API name: {@code script}
	 */
	public final Script script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.minScore != null) {
			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		generator.writeKey("script");
		this.script.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptScoreQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ScriptScoreQuery> {
		@Nullable
		private Float minScore;

		private Query query;

		private Script script;

		/**
		 * Documents with a score lower than this floating point number are excluded
		 * from the search results.
		 * <p>
		 * API name: {@code min_score}
		 */
		public final Builder minScore(@Nullable Float value) {
			this.minScore = value;
			return this;
		}

		/**
		 * Required - Query used to return documents.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - Query used to return documents.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Required - Script used to compute the score of documents returned by the
		 * query. Important: final relevance scores from the <code>script_score</code>
		 * query cannot be negative.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - Script used to compute the score of documents returned by the
		 * query. Important: final relevance scores from the <code>script_score</code>
		 * query cannot be negative.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptScoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptScoreQuery build() {
			_checkSingleUse();

			return new ScriptScoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptScoreQuery}
	 */
	public static final JsonpDeserializer<ScriptScoreQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ScriptScoreQuery::setupScriptScoreQueryDeserializer);

	protected static void setupScriptScoreQueryDeserializer(ObjectDeserializer<ScriptScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::minScore, JsonpDeserializer.floatDeserializer(), "min_score");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

}
