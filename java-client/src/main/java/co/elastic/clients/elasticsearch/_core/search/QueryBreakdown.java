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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.QueryBreakdown
@JsonpDeserializable
public final class QueryBreakdown implements JsonpSerializable {
	private final Long advance;

	private final Long advanceCount;

	private final Long buildScorer;

	private final Long buildScorerCount;

	private final Long createWeight;

	private final Long createWeightCount;

	private final Long match;

	private final Long matchCount;

	private final Long shallowAdvance;

	private final Long shallowAdvanceCount;

	private final Long nextDoc;

	private final Long nextDocCount;

	private final Long score;

	private final Long scoreCount;

	private final Long computeMaxScore;

	private final Long computeMaxScoreCount;

	private final Long setMinCompetitiveScore;

	private final Long setMinCompetitiveScoreCount;

	// ---------------------------------------------------------------------------------------------

	public QueryBreakdown(Builder builder) {

		this.advance = Objects.requireNonNull(builder.advance, "advance");
		this.advanceCount = Objects.requireNonNull(builder.advanceCount, "advance_count");
		this.buildScorer = Objects.requireNonNull(builder.buildScorer, "build_scorer");
		this.buildScorerCount = Objects.requireNonNull(builder.buildScorerCount, "build_scorer_count");
		this.createWeight = Objects.requireNonNull(builder.createWeight, "create_weight");
		this.createWeightCount = Objects.requireNonNull(builder.createWeightCount, "create_weight_count");
		this.match = Objects.requireNonNull(builder.match, "match");
		this.matchCount = Objects.requireNonNull(builder.matchCount, "match_count");
		this.shallowAdvance = Objects.requireNonNull(builder.shallowAdvance, "shallow_advance");
		this.shallowAdvanceCount = Objects.requireNonNull(builder.shallowAdvanceCount, "shallow_advance_count");
		this.nextDoc = Objects.requireNonNull(builder.nextDoc, "next_doc");
		this.nextDocCount = Objects.requireNonNull(builder.nextDocCount, "next_doc_count");
		this.score = Objects.requireNonNull(builder.score, "score");
		this.scoreCount = Objects.requireNonNull(builder.scoreCount, "score_count");
		this.computeMaxScore = Objects.requireNonNull(builder.computeMaxScore, "compute_max_score");
		this.computeMaxScoreCount = Objects.requireNonNull(builder.computeMaxScoreCount, "compute_max_score_count");
		this.setMinCompetitiveScore = Objects.requireNonNull(builder.setMinCompetitiveScore,
				"set_min_competitive_score");
		this.setMinCompetitiveScoreCount = Objects.requireNonNull(builder.setMinCompetitiveScoreCount,
				"set_min_competitive_score_count");

	}

	/**
	 * API name: {@code advance}
	 */
	public Long advance() {
		return this.advance;
	}

	/**
	 * API name: {@code advance_count}
	 */
	public Long advanceCount() {
		return this.advanceCount;
	}

	/**
	 * API name: {@code build_scorer}
	 */
	public Long buildScorer() {
		return this.buildScorer;
	}

	/**
	 * API name: {@code build_scorer_count}
	 */
	public Long buildScorerCount() {
		return this.buildScorerCount;
	}

	/**
	 * API name: {@code create_weight}
	 */
	public Long createWeight() {
		return this.createWeight;
	}

	/**
	 * API name: {@code create_weight_count}
	 */
	public Long createWeightCount() {
		return this.createWeightCount;
	}

	/**
	 * API name: {@code match}
	 */
	public Long match() {
		return this.match;
	}

	/**
	 * API name: {@code match_count}
	 */
	public Long matchCount() {
		return this.matchCount;
	}

	/**
	 * API name: {@code shallow_advance}
	 */
	public Long shallowAdvance() {
		return this.shallowAdvance;
	}

	/**
	 * API name: {@code shallow_advance_count}
	 */
	public Long shallowAdvanceCount() {
		return this.shallowAdvanceCount;
	}

	/**
	 * API name: {@code next_doc}
	 */
	public Long nextDoc() {
		return this.nextDoc;
	}

	/**
	 * API name: {@code next_doc_count}
	 */
	public Long nextDocCount() {
		return this.nextDocCount;
	}

	/**
	 * API name: {@code score}
	 */
	public Long score() {
		return this.score;
	}

	/**
	 * API name: {@code score_count}
	 */
	public Long scoreCount() {
		return this.scoreCount;
	}

	/**
	 * API name: {@code compute_max_score}
	 */
	public Long computeMaxScore() {
		return this.computeMaxScore;
	}

	/**
	 * API name: {@code compute_max_score_count}
	 */
	public Long computeMaxScoreCount() {
		return this.computeMaxScoreCount;
	}

	/**
	 * API name: {@code set_min_competitive_score}
	 */
	public Long setMinCompetitiveScore() {
		return this.setMinCompetitiveScore;
	}

	/**
	 * API name: {@code set_min_competitive_score_count}
	 */
	public Long setMinCompetitiveScoreCount() {
		return this.setMinCompetitiveScoreCount;
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

		generator.writeKey("create_weight");
		generator.write(this.createWeight);

		generator.writeKey("create_weight_count");
		generator.write(this.createWeightCount);

		generator.writeKey("match");
		generator.write(this.match);

		generator.writeKey("match_count");
		generator.write(this.matchCount);

		generator.writeKey("shallow_advance");
		generator.write(this.shallowAdvance);

		generator.writeKey("shallow_advance_count");
		generator.write(this.shallowAdvanceCount);

		generator.writeKey("next_doc");
		generator.write(this.nextDoc);

		generator.writeKey("next_doc_count");
		generator.write(this.nextDocCount);

		generator.writeKey("score");
		generator.write(this.score);

		generator.writeKey("score_count");
		generator.write(this.scoreCount);

		generator.writeKey("compute_max_score");
		generator.write(this.computeMaxScore);

		generator.writeKey("compute_max_score_count");
		generator.write(this.computeMaxScoreCount);

		generator.writeKey("set_min_competitive_score");
		generator.write(this.setMinCompetitiveScore);

		generator.writeKey("set_min_competitive_score_count");
		generator.write(this.setMinCompetitiveScoreCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryBreakdown}.
	 */
	public static class Builder implements ObjectBuilder<QueryBreakdown> {
		private Long advance;

		private Long advanceCount;

		private Long buildScorer;

		private Long buildScorerCount;

		private Long createWeight;

		private Long createWeightCount;

		private Long match;

		private Long matchCount;

		private Long shallowAdvance;

		private Long shallowAdvanceCount;

		private Long nextDoc;

		private Long nextDocCount;

		private Long score;

		private Long scoreCount;

		private Long computeMaxScore;

		private Long computeMaxScoreCount;

		private Long setMinCompetitiveScore;

		private Long setMinCompetitiveScoreCount;

		/**
		 * API name: {@code advance}
		 */
		public Builder advance(Long value) {
			this.advance = value;
			return this;
		}

		/**
		 * API name: {@code advance_count}
		 */
		public Builder advanceCount(Long value) {
			this.advanceCount = value;
			return this;
		}

		/**
		 * API name: {@code build_scorer}
		 */
		public Builder buildScorer(Long value) {
			this.buildScorer = value;
			return this;
		}

		/**
		 * API name: {@code build_scorer_count}
		 */
		public Builder buildScorerCount(Long value) {
			this.buildScorerCount = value;
			return this;
		}

		/**
		 * API name: {@code create_weight}
		 */
		public Builder createWeight(Long value) {
			this.createWeight = value;
			return this;
		}

		/**
		 * API name: {@code create_weight_count}
		 */
		public Builder createWeightCount(Long value) {
			this.createWeightCount = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Long value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match_count}
		 */
		public Builder matchCount(Long value) {
			this.matchCount = value;
			return this;
		}

		/**
		 * API name: {@code shallow_advance}
		 */
		public Builder shallowAdvance(Long value) {
			this.shallowAdvance = value;
			return this;
		}

		/**
		 * API name: {@code shallow_advance_count}
		 */
		public Builder shallowAdvanceCount(Long value) {
			this.shallowAdvanceCount = value;
			return this;
		}

		/**
		 * API name: {@code next_doc}
		 */
		public Builder nextDoc(Long value) {
			this.nextDoc = value;
			return this;
		}

		/**
		 * API name: {@code next_doc_count}
		 */
		public Builder nextDocCount(Long value) {
			this.nextDocCount = value;
			return this;
		}

		/**
		 * API name: {@code score}
		 */
		public Builder score(Long value) {
			this.score = value;
			return this;
		}

		/**
		 * API name: {@code score_count}
		 */
		public Builder scoreCount(Long value) {
			this.scoreCount = value;
			return this;
		}

		/**
		 * API name: {@code compute_max_score}
		 */
		public Builder computeMaxScore(Long value) {
			this.computeMaxScore = value;
			return this;
		}

		/**
		 * API name: {@code compute_max_score_count}
		 */
		public Builder computeMaxScoreCount(Long value) {
			this.computeMaxScoreCount = value;
			return this;
		}

		/**
		 * API name: {@code set_min_competitive_score}
		 */
		public Builder setMinCompetitiveScore(Long value) {
			this.setMinCompetitiveScore = value;
			return this;
		}

		/**
		 * API name: {@code set_min_competitive_score_count}
		 */
		public Builder setMinCompetitiveScoreCount(Long value) {
			this.setMinCompetitiveScoreCount = value;
			return this;
		}

		/**
		 * Builds a {@link QueryBreakdown}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryBreakdown build() {

			return new QueryBreakdown(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryBreakdown}
	 */
	public static final JsonpDeserializer<QueryBreakdown> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryBreakdown::setupQueryBreakdownDeserializer, Builder::build);

	protected static void setupQueryBreakdownDeserializer(DelegatingDeserializer<QueryBreakdown.Builder> op) {

		op.add(Builder::advance, JsonpDeserializer.longDeserializer(), "advance");
		op.add(Builder::advanceCount, JsonpDeserializer.longDeserializer(), "advance_count");
		op.add(Builder::buildScorer, JsonpDeserializer.longDeserializer(), "build_scorer");
		op.add(Builder::buildScorerCount, JsonpDeserializer.longDeserializer(), "build_scorer_count");
		op.add(Builder::createWeight, JsonpDeserializer.longDeserializer(), "create_weight");
		op.add(Builder::createWeightCount, JsonpDeserializer.longDeserializer(), "create_weight_count");
		op.add(Builder::match, JsonpDeserializer.longDeserializer(), "match");
		op.add(Builder::matchCount, JsonpDeserializer.longDeserializer(), "match_count");
		op.add(Builder::shallowAdvance, JsonpDeserializer.longDeserializer(), "shallow_advance");
		op.add(Builder::shallowAdvanceCount, JsonpDeserializer.longDeserializer(), "shallow_advance_count");
		op.add(Builder::nextDoc, JsonpDeserializer.longDeserializer(), "next_doc");
		op.add(Builder::nextDocCount, JsonpDeserializer.longDeserializer(), "next_doc_count");
		op.add(Builder::score, JsonpDeserializer.longDeserializer(), "score");
		op.add(Builder::scoreCount, JsonpDeserializer.longDeserializer(), "score_count");
		op.add(Builder::computeMaxScore, JsonpDeserializer.longDeserializer(), "compute_max_score");
		op.add(Builder::computeMaxScoreCount, JsonpDeserializer.longDeserializer(), "compute_max_score_count");
		op.add(Builder::setMinCompetitiveScore, JsonpDeserializer.longDeserializer(), "set_min_competitive_score");
		op.add(Builder::setMinCompetitiveScoreCount, JsonpDeserializer.longDeserializer(),
				"set_min_competitive_score_count");

	}

}
