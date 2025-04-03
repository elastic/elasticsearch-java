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

package co.elastic.clients.elasticsearch.core.search;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _global.search._types.KnnQueryProfileBreakdown

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.KnnQueryProfileBreakdown">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnQueryProfileBreakdown implements JsonpSerializable {
	private final long advance;

	private final long advanceCount;

	private final long buildScorer;

	private final long buildScorerCount;

	private final long computeMaxScore;

	private final long computeMaxScoreCount;

	private final long countWeight;

	private final long countWeightCount;

	private final long createWeight;

	private final long createWeightCount;

	private final long match;

	private final long matchCount;

	private final long nextDoc;

	private final long nextDocCount;

	private final long score;

	private final long scoreCount;

	private final long setMinCompetitiveScore;

	private final long setMinCompetitiveScoreCount;

	private final long shallowAdvance;

	private final long shallowAdvanceCount;

	// ---------------------------------------------------------------------------------------------

	private KnnQueryProfileBreakdown(Builder builder) {

		this.advance = ApiTypeHelper.requireNonNull(builder.advance, this, "advance", 0);
		this.advanceCount = ApiTypeHelper.requireNonNull(builder.advanceCount, this, "advanceCount", 0);
		this.buildScorer = ApiTypeHelper.requireNonNull(builder.buildScorer, this, "buildScorer", 0);
		this.buildScorerCount = ApiTypeHelper.requireNonNull(builder.buildScorerCount, this, "buildScorerCount", 0);
		this.computeMaxScore = ApiTypeHelper.requireNonNull(builder.computeMaxScore, this, "computeMaxScore", 0);
		this.computeMaxScoreCount = ApiTypeHelper.requireNonNull(builder.computeMaxScoreCount, this,
				"computeMaxScoreCount", 0);
		this.countWeight = ApiTypeHelper.requireNonNull(builder.countWeight, this, "countWeight", 0);
		this.countWeightCount = ApiTypeHelper.requireNonNull(builder.countWeightCount, this, "countWeightCount", 0);
		this.createWeight = ApiTypeHelper.requireNonNull(builder.createWeight, this, "createWeight", 0);
		this.createWeightCount = ApiTypeHelper.requireNonNull(builder.createWeightCount, this, "createWeightCount", 0);
		this.match = ApiTypeHelper.requireNonNull(builder.match, this, "match", 0);
		this.matchCount = ApiTypeHelper.requireNonNull(builder.matchCount, this, "matchCount", 0);
		this.nextDoc = ApiTypeHelper.requireNonNull(builder.nextDoc, this, "nextDoc", 0);
		this.nextDocCount = ApiTypeHelper.requireNonNull(builder.nextDocCount, this, "nextDocCount", 0);
		this.score = ApiTypeHelper.requireNonNull(builder.score, this, "score", 0);
		this.scoreCount = ApiTypeHelper.requireNonNull(builder.scoreCount, this, "scoreCount", 0);
		this.setMinCompetitiveScore = ApiTypeHelper.requireNonNull(builder.setMinCompetitiveScore, this,
				"setMinCompetitiveScore", 0);
		this.setMinCompetitiveScoreCount = ApiTypeHelper.requireNonNull(builder.setMinCompetitiveScoreCount, this,
				"setMinCompetitiveScoreCount", 0);
		this.shallowAdvance = ApiTypeHelper.requireNonNull(builder.shallowAdvance, this, "shallowAdvance", 0);
		this.shallowAdvanceCount = ApiTypeHelper.requireNonNull(builder.shallowAdvanceCount, this,
				"shallowAdvanceCount", 0);

	}

	public static KnnQueryProfileBreakdown of(Function<Builder, ObjectBuilder<KnnQueryProfileBreakdown>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code advance}
	 */
	public final long advance() {
		return this.advance;
	}

	/**
	 * Required - API name: {@code advance_count}
	 */
	public final long advanceCount() {
		return this.advanceCount;
	}

	/**
	 * Required - API name: {@code build_scorer}
	 */
	public final long buildScorer() {
		return this.buildScorer;
	}

	/**
	 * Required - API name: {@code build_scorer_count}
	 */
	public final long buildScorerCount() {
		return this.buildScorerCount;
	}

	/**
	 * Required - API name: {@code compute_max_score}
	 */
	public final long computeMaxScore() {
		return this.computeMaxScore;
	}

	/**
	 * Required - API name: {@code compute_max_score_count}
	 */
	public final long computeMaxScoreCount() {
		return this.computeMaxScoreCount;
	}

	/**
	 * Required - API name: {@code count_weight}
	 */
	public final long countWeight() {
		return this.countWeight;
	}

	/**
	 * Required - API name: {@code count_weight_count}
	 */
	public final long countWeightCount() {
		return this.countWeightCount;
	}

	/**
	 * Required - API name: {@code create_weight}
	 */
	public final long createWeight() {
		return this.createWeight;
	}

	/**
	 * Required - API name: {@code create_weight_count}
	 */
	public final long createWeightCount() {
		return this.createWeightCount;
	}

	/**
	 * Required - API name: {@code match}
	 */
	public final long match() {
		return this.match;
	}

	/**
	 * Required - API name: {@code match_count}
	 */
	public final long matchCount() {
		return this.matchCount;
	}

	/**
	 * Required - API name: {@code next_doc}
	 */
	public final long nextDoc() {
		return this.nextDoc;
	}

	/**
	 * Required - API name: {@code next_doc_count}
	 */
	public final long nextDocCount() {
		return this.nextDocCount;
	}

	/**
	 * Required - API name: {@code score}
	 */
	public final long score() {
		return this.score;
	}

	/**
	 * Required - API name: {@code score_count}
	 */
	public final long scoreCount() {
		return this.scoreCount;
	}

	/**
	 * Required - API name: {@code set_min_competitive_score}
	 */
	public final long setMinCompetitiveScore() {
		return this.setMinCompetitiveScore;
	}

	/**
	 * Required - API name: {@code set_min_competitive_score_count}
	 */
	public final long setMinCompetitiveScoreCount() {
		return this.setMinCompetitiveScoreCount;
	}

	/**
	 * Required - API name: {@code shallow_advance}
	 */
	public final long shallowAdvance() {
		return this.shallowAdvance;
	}

	/**
	 * Required - API name: {@code shallow_advance_count}
	 */
	public final long shallowAdvanceCount() {
		return this.shallowAdvanceCount;
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

		generator.writeKey("advance");
		generator.write(this.advance);

		generator.writeKey("advance_count");
		generator.write(this.advanceCount);

		generator.writeKey("build_scorer");
		generator.write(this.buildScorer);

		generator.writeKey("build_scorer_count");
		generator.write(this.buildScorerCount);

		generator.writeKey("compute_max_score");
		generator.write(this.computeMaxScore);

		generator.writeKey("compute_max_score_count");
		generator.write(this.computeMaxScoreCount);

		generator.writeKey("count_weight");
		generator.write(this.countWeight);

		generator.writeKey("count_weight_count");
		generator.write(this.countWeightCount);

		generator.writeKey("create_weight");
		generator.write(this.createWeight);

		generator.writeKey("create_weight_count");
		generator.write(this.createWeightCount);

		generator.writeKey("match");
		generator.write(this.match);

		generator.writeKey("match_count");
		generator.write(this.matchCount);

		generator.writeKey("next_doc");
		generator.write(this.nextDoc);

		generator.writeKey("next_doc_count");
		generator.write(this.nextDocCount);

		generator.writeKey("score");
		generator.write(this.score);

		generator.writeKey("score_count");
		generator.write(this.scoreCount);

		generator.writeKey("set_min_competitive_score");
		generator.write(this.setMinCompetitiveScore);

		generator.writeKey("set_min_competitive_score_count");
		generator.write(this.setMinCompetitiveScoreCount);

		generator.writeKey("shallow_advance");
		generator.write(this.shallowAdvance);

		generator.writeKey("shallow_advance_count");
		generator.write(this.shallowAdvanceCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnQueryProfileBreakdown}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<KnnQueryProfileBreakdown> {
		private Long advance;

		private Long advanceCount;

		private Long buildScorer;

		private Long buildScorerCount;

		private Long computeMaxScore;

		private Long computeMaxScoreCount;

		private Long countWeight;

		private Long countWeightCount;

		private Long createWeight;

		private Long createWeightCount;

		private Long match;

		private Long matchCount;

		private Long nextDoc;

		private Long nextDocCount;

		private Long score;

		private Long scoreCount;

		private Long setMinCompetitiveScore;

		private Long setMinCompetitiveScoreCount;

		private Long shallowAdvance;

		private Long shallowAdvanceCount;

		/**
		 * Required - API name: {@code advance}
		 */
		public final Builder advance(long value) {
			this.advance = value;
			return this;
		}

		/**
		 * Required - API name: {@code advance_count}
		 */
		public final Builder advanceCount(long value) {
			this.advanceCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code build_scorer}
		 */
		public final Builder buildScorer(long value) {
			this.buildScorer = value;
			return this;
		}

		/**
		 * Required - API name: {@code build_scorer_count}
		 */
		public final Builder buildScorerCount(long value) {
			this.buildScorerCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code compute_max_score}
		 */
		public final Builder computeMaxScore(long value) {
			this.computeMaxScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code compute_max_score_count}
		 */
		public final Builder computeMaxScoreCount(long value) {
			this.computeMaxScoreCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code count_weight}
		 */
		public final Builder countWeight(long value) {
			this.countWeight = value;
			return this;
		}

		/**
		 * Required - API name: {@code count_weight_count}
		 */
		public final Builder countWeightCount(long value) {
			this.countWeightCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code create_weight}
		 */
		public final Builder createWeight(long value) {
			this.createWeight = value;
			return this;
		}

		/**
		 * Required - API name: {@code create_weight_count}
		 */
		public final Builder createWeightCount(long value) {
			this.createWeightCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code match}
		 */
		public final Builder match(long value) {
			this.match = value;
			return this;
		}

		/**
		 * Required - API name: {@code match_count}
		 */
		public final Builder matchCount(long value) {
			this.matchCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code next_doc}
		 */
		public final Builder nextDoc(long value) {
			this.nextDoc = value;
			return this;
		}

		/**
		 * Required - API name: {@code next_doc_count}
		 */
		public final Builder nextDocCount(long value) {
			this.nextDocCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code score}
		 */
		public final Builder score(long value) {
			this.score = value;
			return this;
		}

		/**
		 * Required - API name: {@code score_count}
		 */
		public final Builder scoreCount(long value) {
			this.scoreCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code set_min_competitive_score}
		 */
		public final Builder setMinCompetitiveScore(long value) {
			this.setMinCompetitiveScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code set_min_competitive_score_count}
		 */
		public final Builder setMinCompetitiveScoreCount(long value) {
			this.setMinCompetitiveScoreCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code shallow_advance}
		 */
		public final Builder shallowAdvance(long value) {
			this.shallowAdvance = value;
			return this;
		}

		/**
		 * Required - API name: {@code shallow_advance_count}
		 */
		public final Builder shallowAdvanceCount(long value) {
			this.shallowAdvanceCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnQueryProfileBreakdown}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnQueryProfileBreakdown build() {
			_checkSingleUse();

			return new KnnQueryProfileBreakdown(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnQueryProfileBreakdown}
	 */
	public static final JsonpDeserializer<KnnQueryProfileBreakdown> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnQueryProfileBreakdown::setupKnnQueryProfileBreakdownDeserializer);

	protected static void setupKnnQueryProfileBreakdownDeserializer(
			ObjectDeserializer<KnnQueryProfileBreakdown.Builder> op) {

		op.add(Builder::advance, JsonpDeserializer.longDeserializer(), "advance");
		op.add(Builder::advanceCount, JsonpDeserializer.longDeserializer(), "advance_count");
		op.add(Builder::buildScorer, JsonpDeserializer.longDeserializer(), "build_scorer");
		op.add(Builder::buildScorerCount, JsonpDeserializer.longDeserializer(), "build_scorer_count");
		op.add(Builder::computeMaxScore, JsonpDeserializer.longDeserializer(), "compute_max_score");
		op.add(Builder::computeMaxScoreCount, JsonpDeserializer.longDeserializer(), "compute_max_score_count");
		op.add(Builder::countWeight, JsonpDeserializer.longDeserializer(), "count_weight");
		op.add(Builder::countWeightCount, JsonpDeserializer.longDeserializer(), "count_weight_count");
		op.add(Builder::createWeight, JsonpDeserializer.longDeserializer(), "create_weight");
		op.add(Builder::createWeightCount, JsonpDeserializer.longDeserializer(), "create_weight_count");
		op.add(Builder::match, JsonpDeserializer.longDeserializer(), "match");
		op.add(Builder::matchCount, JsonpDeserializer.longDeserializer(), "match_count");
		op.add(Builder::nextDoc, JsonpDeserializer.longDeserializer(), "next_doc");
		op.add(Builder::nextDocCount, JsonpDeserializer.longDeserializer(), "next_doc_count");
		op.add(Builder::score, JsonpDeserializer.longDeserializer(), "score");
		op.add(Builder::scoreCount, JsonpDeserializer.longDeserializer(), "score_count");
		op.add(Builder::setMinCompetitiveScore, JsonpDeserializer.longDeserializer(), "set_min_competitive_score");
		op.add(Builder::setMinCompetitiveScoreCount, JsonpDeserializer.longDeserializer(),
				"set_min_competitive_score_count");
		op.add(Builder::shallowAdvance, JsonpDeserializer.longDeserializer(), "shallow_advance");
		op.add(Builder::shallowAdvanceCount, JsonpDeserializer.longDeserializer(), "shallow_advance_count");

	}

}
