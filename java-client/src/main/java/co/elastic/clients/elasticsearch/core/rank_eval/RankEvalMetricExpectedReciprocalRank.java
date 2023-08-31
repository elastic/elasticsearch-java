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

package co.elastic.clients.elasticsearch.core.rank_eval;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _global.rank_eval.RankEvalMetricExpectedReciprocalRank

/**
 * Expected Reciprocal Rank (ERR)
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/search-rank-eval.html#_expected_reciprocal_rank_err">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.rank_eval.RankEvalMetricExpectedReciprocalRank">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankEvalMetricExpectedReciprocalRank extends RankEvalMetricBase {
	private final int maximumRelevance;

	// ---------------------------------------------------------------------------------------------

	private RankEvalMetricExpectedReciprocalRank(Builder builder) {
		super(builder);

		this.maximumRelevance = ApiTypeHelper.requireNonNull(builder.maximumRelevance, this, "maximumRelevance");

	}

	public static RankEvalMetricExpectedReciprocalRank of(
			Function<Builder, ObjectBuilder<RankEvalMetricExpectedReciprocalRank>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The highest relevance grade used in the user-supplied relevance
	 * judgments.
	 * <p>
	 * API name: {@code maximum_relevance}
	 */
	public final int maximumRelevance() {
		return this.maximumRelevance;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("maximum_relevance");
		generator.write(this.maximumRelevance);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetricExpectedReciprocalRank}.
	 */

	public static class Builder extends RankEvalMetricBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankEvalMetricExpectedReciprocalRank> {
		private Integer maximumRelevance;

		/**
		 * Required - The highest relevance grade used in the user-supplied relevance
		 * judgments.
		 * <p>
		 * API name: {@code maximum_relevance}
		 */
		public final Builder maximumRelevance(int value) {
			this.maximumRelevance = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankEvalMetricExpectedReciprocalRank}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetricExpectedReciprocalRank build() {
			_checkSingleUse();

			return new RankEvalMetricExpectedReciprocalRank(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetricExpectedReciprocalRank}
	 */
	public static final JsonpDeserializer<RankEvalMetricExpectedReciprocalRank> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					RankEvalMetricExpectedReciprocalRank::setupRankEvalMetricExpectedReciprocalRankDeserializer);

	protected static void setupRankEvalMetricExpectedReciprocalRankDeserializer(
			ObjectDeserializer<RankEvalMetricExpectedReciprocalRank.Builder> op) {
		RankEvalMetricBase.setupRankEvalMetricBaseDeserializer(op);
		op.add(Builder::maximumRelevance, JsonpDeserializer.integerDeserializer(), "maximum_relevance");

	}

}
