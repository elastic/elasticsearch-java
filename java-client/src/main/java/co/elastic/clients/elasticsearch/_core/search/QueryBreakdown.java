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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.QueryBreakdown
public final class QueryBreakdown implements JsonpSerializable {
	private final Number advance;

	private final Number advanceCount;

	private final Number buildScorer;

	private final Number buildScorerCount;

	private final Number createWeight;

	private final Number createWeightCount;

	private final Number match;

	private final Number matchCount;

	private final Number shallowAdvance;

	private final Number shallowAdvanceCount;

	private final Number nextDoc;

	private final Number nextDocCount;

	private final Number score;

	private final Number scoreCount;

	private final Number computeMaxScore;

	private final Number computeMaxScoreCount;

	private final Number setMinCompetitiveScore;

	private final Number setMinCompetitiveScoreCount;

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
	public Number advance() {
		return this.advance;
	}

	/**
	 * API name: {@code advance_count}
	 */
	public Number advanceCount() {
		return this.advanceCount;
	}

	/**
	 * API name: {@code build_scorer}
	 */
	public Number buildScorer() {
		return this.buildScorer;
	}

	/**
	 * API name: {@code build_scorer_count}
	 */
	public Number buildScorerCount() {
		return this.buildScorerCount;
	}

	/**
	 * API name: {@code create_weight}
	 */
	public Number createWeight() {
		return this.createWeight;
	}

	/**
	 * API name: {@code create_weight_count}
	 */
	public Number createWeightCount() {
		return this.createWeightCount;
	}

	/**
	 * API name: {@code match}
	 */
	public Number match() {
		return this.match;
	}

	/**
	 * API name: {@code match_count}
	 */
	public Number matchCount() {
		return this.matchCount;
	}

	/**
	 * API name: {@code shallow_advance}
	 */
	public Number shallowAdvance() {
		return this.shallowAdvance;
	}

	/**
	 * API name: {@code shallow_advance_count}
	 */
	public Number shallowAdvanceCount() {
		return this.shallowAdvanceCount;
	}

	/**
	 * API name: {@code next_doc}
	 */
	public Number nextDoc() {
		return this.nextDoc;
	}

	/**
	 * API name: {@code next_doc_count}
	 */
	public Number nextDocCount() {
		return this.nextDocCount;
	}

	/**
	 * API name: {@code score}
	 */
	public Number score() {
		return this.score;
	}

	/**
	 * API name: {@code score_count}
	 */
	public Number scoreCount() {
		return this.scoreCount;
	}

	/**
	 * API name: {@code compute_max_score}
	 */
	public Number computeMaxScore() {
		return this.computeMaxScore;
	}

	/**
	 * API name: {@code compute_max_score_count}
	 */
	public Number computeMaxScoreCount() {
		return this.computeMaxScoreCount;
	}

	/**
	 * API name: {@code set_min_competitive_score}
	 */
	public Number setMinCompetitiveScore() {
		return this.setMinCompetitiveScore;
	}

	/**
	 * API name: {@code set_min_competitive_score_count}
	 */
	public Number setMinCompetitiveScoreCount() {
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
		generator.write(this.advance.doubleValue());

		generator.writeKey("advance_count");
		generator.write(this.advanceCount.doubleValue());

		generator.writeKey("build_scorer");
		generator.write(this.buildScorer.doubleValue());

		generator.writeKey("build_scorer_count");
		generator.write(this.buildScorerCount.doubleValue());

		generator.writeKey("create_weight");
		generator.write(this.createWeight.doubleValue());

		generator.writeKey("create_weight_count");
		generator.write(this.createWeightCount.doubleValue());

		generator.writeKey("match");
		generator.write(this.match.doubleValue());

		generator.writeKey("match_count");
		generator.write(this.matchCount.doubleValue());

		generator.writeKey("shallow_advance");
		generator.write(this.shallowAdvance.doubleValue());

		generator.writeKey("shallow_advance_count");
		generator.write(this.shallowAdvanceCount.doubleValue());

		generator.writeKey("next_doc");
		generator.write(this.nextDoc.doubleValue());

		generator.writeKey("next_doc_count");
		generator.write(this.nextDocCount.doubleValue());

		generator.writeKey("score");
		generator.write(this.score.doubleValue());

		generator.writeKey("score_count");
		generator.write(this.scoreCount.doubleValue());

		generator.writeKey("compute_max_score");
		generator.write(this.computeMaxScore.doubleValue());

		generator.writeKey("compute_max_score_count");
		generator.write(this.computeMaxScoreCount.doubleValue());

		generator.writeKey("set_min_competitive_score");
		generator.write(this.setMinCompetitiveScore.doubleValue());

		generator.writeKey("set_min_competitive_score_count");
		generator.write(this.setMinCompetitiveScoreCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryBreakdown}.
	 */
	public static class Builder implements ObjectBuilder<QueryBreakdown> {
		private Number advance;

		private Number advanceCount;

		private Number buildScorer;

		private Number buildScorerCount;

		private Number createWeight;

		private Number createWeightCount;

		private Number match;

		private Number matchCount;

		private Number shallowAdvance;

		private Number shallowAdvanceCount;

		private Number nextDoc;

		private Number nextDocCount;

		private Number score;

		private Number scoreCount;

		private Number computeMaxScore;

		private Number computeMaxScoreCount;

		private Number setMinCompetitiveScore;

		private Number setMinCompetitiveScoreCount;

		/**
		 * API name: {@code advance}
		 */
		public Builder advance(Number value) {
			this.advance = value;
			return this;
		}

		/**
		 * API name: {@code advance_count}
		 */
		public Builder advanceCount(Number value) {
			this.advanceCount = value;
			return this;
		}

		/**
		 * API name: {@code build_scorer}
		 */
		public Builder buildScorer(Number value) {
			this.buildScorer = value;
			return this;
		}

		/**
		 * API name: {@code build_scorer_count}
		 */
		public Builder buildScorerCount(Number value) {
			this.buildScorerCount = value;
			return this;
		}

		/**
		 * API name: {@code create_weight}
		 */
		public Builder createWeight(Number value) {
			this.createWeight = value;
			return this;
		}

		/**
		 * API name: {@code create_weight_count}
		 */
		public Builder createWeightCount(Number value) {
			this.createWeightCount = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Number value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match_count}
		 */
		public Builder matchCount(Number value) {
			this.matchCount = value;
			return this;
		}

		/**
		 * API name: {@code shallow_advance}
		 */
		public Builder shallowAdvance(Number value) {
			this.shallowAdvance = value;
			return this;
		}

		/**
		 * API name: {@code shallow_advance_count}
		 */
		public Builder shallowAdvanceCount(Number value) {
			this.shallowAdvanceCount = value;
			return this;
		}

		/**
		 * API name: {@code next_doc}
		 */
		public Builder nextDoc(Number value) {
			this.nextDoc = value;
			return this;
		}

		/**
		 * API name: {@code next_doc_count}
		 */
		public Builder nextDocCount(Number value) {
			this.nextDocCount = value;
			return this;
		}

		/**
		 * API name: {@code score}
		 */
		public Builder score(Number value) {
			this.score = value;
			return this;
		}

		/**
		 * API name: {@code score_count}
		 */
		public Builder scoreCount(Number value) {
			this.scoreCount = value;
			return this;
		}

		/**
		 * API name: {@code compute_max_score}
		 */
		public Builder computeMaxScore(Number value) {
			this.computeMaxScore = value;
			return this;
		}

		/**
		 * API name: {@code compute_max_score_count}
		 */
		public Builder computeMaxScoreCount(Number value) {
			this.computeMaxScoreCount = value;
			return this;
		}

		/**
		 * API name: {@code set_min_competitive_score}
		 */
		public Builder setMinCompetitiveScore(Number value) {
			this.setMinCompetitiveScore = value;
			return this;
		}

		/**
		 * API name: {@code set_min_competitive_score_count}
		 */
		public Builder setMinCompetitiveScoreCount(Number value) {
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
	public static final JsonpDeserializer<QueryBreakdown> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, QueryBreakdown::setupQueryBreakdownDeserializer);

	protected static void setupQueryBreakdownDeserializer(DelegatingDeserializer<QueryBreakdown.Builder> op) {

		op.add(Builder::advance, JsonpDeserializer.numberDeserializer(), "advance");
		op.add(Builder::advanceCount, JsonpDeserializer.numberDeserializer(), "advance_count");
		op.add(Builder::buildScorer, JsonpDeserializer.numberDeserializer(), "build_scorer");
		op.add(Builder::buildScorerCount, JsonpDeserializer.numberDeserializer(), "build_scorer_count");
		op.add(Builder::createWeight, JsonpDeserializer.numberDeserializer(), "create_weight");
		op.add(Builder::createWeightCount, JsonpDeserializer.numberDeserializer(), "create_weight_count");
		op.add(Builder::match, JsonpDeserializer.numberDeserializer(), "match");
		op.add(Builder::matchCount, JsonpDeserializer.numberDeserializer(), "match_count");
		op.add(Builder::shallowAdvance, JsonpDeserializer.numberDeserializer(), "shallow_advance");
		op.add(Builder::shallowAdvanceCount, JsonpDeserializer.numberDeserializer(), "shallow_advance_count");
		op.add(Builder::nextDoc, JsonpDeserializer.numberDeserializer(), "next_doc");
		op.add(Builder::nextDocCount, JsonpDeserializer.numberDeserializer(), "next_doc_count");
		op.add(Builder::score, JsonpDeserializer.numberDeserializer(), "score");
		op.add(Builder::scoreCount, JsonpDeserializer.numberDeserializer(), "score_count");
		op.add(Builder::computeMaxScore, JsonpDeserializer.numberDeserializer(), "compute_max_score");
		op.add(Builder::computeMaxScoreCount, JsonpDeserializer.numberDeserializer(), "compute_max_score_count");
		op.add(Builder::setMinCompetitiveScore, JsonpDeserializer.numberDeserializer(), "set_min_competitive_score");
		op.add(Builder::setMinCompetitiveScoreCount, JsonpDeserializer.numberDeserializer(),
				"set_min_competitive_score_count");

	}

}
