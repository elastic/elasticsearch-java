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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.RescoreQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.RescoreQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RescoreQuery implements JsonpSerializable {
	private final Query query;

	@Nullable
	private final Double queryWeight;

	@Nullable
	private final Double rescoreQueryWeight;

	@Nullable
	private final ScoreMode scoreMode;

	// ---------------------------------------------------------------------------------------------

	private RescoreQuery(Builder builder) {

		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.queryWeight = builder.queryWeight;
		this.rescoreQueryWeight = builder.rescoreQueryWeight;
		this.scoreMode = builder.scoreMode;

	}

	public static RescoreQuery of(Function<Builder, ObjectBuilder<RescoreQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The query to use for rescoring. This query is only run on the
	 * Top-K results returned by the <code>query</code> and <code>post_filter</code>
	 * phases.
	 * <p>
	 * API name: {@code rescore_query}
	 */
	public final Query query() {
		return this.query;
	}

	/**
	 * Relative importance of the original query versus the rescore query.
	 * <p>
	 * API name: {@code query_weight}
	 */
	@Nullable
	public final Double queryWeight() {
		return this.queryWeight;
	}

	/**
	 * Relative importance of the rescore query versus the original query.
	 * <p>
	 * API name: {@code rescore_query_weight}
	 */
	@Nullable
	public final Double rescoreQueryWeight() {
		return this.rescoreQueryWeight;
	}

	/**
	 * Determines how scores are combined.
	 * <p>
	 * API name: {@code score_mode}
	 */
	@Nullable
	public final ScoreMode scoreMode() {
		return this.scoreMode;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("rescore_query");
		this.query.serialize(generator, mapper);

		if (this.queryWeight != null) {
			generator.writeKey("query_weight");
			generator.write(this.queryWeight);

		}
		if (this.rescoreQueryWeight != null) {
			generator.writeKey("rescore_query_weight");
			generator.write(this.rescoreQueryWeight);

		}
		if (this.scoreMode != null) {
			generator.writeKey("score_mode");
			this.scoreMode.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RescoreQuery}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RescoreQuery> {
		private Query query;

		@Nullable
		private Double queryWeight;

		@Nullable
		private Double rescoreQueryWeight;

		@Nullable
		private ScoreMode scoreMode;

		/**
		 * Required - The query to use for rescoring. This query is only run on the
		 * Top-K results returned by the <code>query</code> and <code>post_filter</code>
		 * phases.
		 * <p>
		 * API name: {@code rescore_query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - The query to use for rescoring. This query is only run on the
		 * Top-K results returned by the <code>query</code> and <code>post_filter</code>
		 * phases.
		 * <p>
		 * API name: {@code rescore_query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Relative importance of the original query versus the rescore query.
		 * <p>
		 * API name: {@code query_weight}
		 */
		public final Builder queryWeight(@Nullable Double value) {
			this.queryWeight = value;
			return this;
		}

		/**
		 * Relative importance of the rescore query versus the original query.
		 * <p>
		 * API name: {@code rescore_query_weight}
		 */
		public final Builder rescoreQueryWeight(@Nullable Double value) {
			this.rescoreQueryWeight = value;
			return this;
		}

		/**
		 * Determines how scores are combined.
		 * <p>
		 * API name: {@code score_mode}
		 */
		public final Builder scoreMode(@Nullable ScoreMode value) {
			this.scoreMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RescoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RescoreQuery build() {
			_checkSingleUse();

			return new RescoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RescoreQuery}
	 */
	public static final JsonpDeserializer<RescoreQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RescoreQuery::setupRescoreQueryDeserializer);

	protected static void setupRescoreQueryDeserializer(ObjectDeserializer<RescoreQuery.Builder> op) {

		op.add(Builder::query, Query._DESERIALIZER, "rescore_query");
		op.add(Builder::queryWeight, JsonpDeserializer.doubleDeserializer(), "query_weight");
		op.add(Builder::rescoreQueryWeight, JsonpDeserializer.doubleDeserializer(), "rescore_query_weight");
		op.add(Builder::scoreMode, ScoreMode._DESERIALIZER, "score_mode");

	}

}
