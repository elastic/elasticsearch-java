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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetric
@JsonpDeserializable
public final class RankEvalMetric implements JsonpSerializable {
	@Nullable
	private final RankEvalMetricPrecision precision;

	@Nullable
	private final RankEvalMetricRecall recall;

	@Nullable
	private final RankEvalMetricMeanReciprocalRank meanReciprocalRank;

	@Nullable
	private final RankEvalMetricDiscountedCumulativeGain dcg;

	@Nullable
	private final RankEvalMetricExpectedReciprocalRank expectedReciprocalRank;

	// ---------------------------------------------------------------------------------------------

	public RankEvalMetric(Builder builder) {

		this.precision = builder.precision;
		this.recall = builder.recall;
		this.meanReciprocalRank = builder.meanReciprocalRank;
		this.dcg = builder.dcg;
		this.expectedReciprocalRank = builder.expectedReciprocalRank;

	}

	public RankEvalMetric(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public RankEvalMetricPrecision precision() {
		return this.precision;
	}

	/**
	 * API name: {@code recall}
	 */
	@Nullable
	public RankEvalMetricRecall recall() {
		return this.recall;
	}

	/**
	 * API name: {@code mean_reciprocal_rank}
	 */
	@Nullable
	public RankEvalMetricMeanReciprocalRank meanReciprocalRank() {
		return this.meanReciprocalRank;
	}

	/**
	 * API name: {@code dcg}
	 */
	@Nullable
	public RankEvalMetricDiscountedCumulativeGain dcg() {
		return this.dcg;
	}

	/**
	 * API name: {@code expected_reciprocal_rank}
	 */
	@Nullable
	public RankEvalMetricExpectedReciprocalRank expectedReciprocalRank() {
		return this.expectedReciprocalRank;
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

		if (this.precision != null) {

			generator.writeKey("precision");
			this.precision.serialize(generator, mapper);

		}
		if (this.recall != null) {

			generator.writeKey("recall");
			this.recall.serialize(generator, mapper);

		}
		if (this.meanReciprocalRank != null) {

			generator.writeKey("mean_reciprocal_rank");
			this.meanReciprocalRank.serialize(generator, mapper);

		}
		if (this.dcg != null) {

			generator.writeKey("dcg");
			this.dcg.serialize(generator, mapper);

		}
		if (this.expectedReciprocalRank != null) {

			generator.writeKey("expected_reciprocal_rank");
			this.expectedReciprocalRank.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetric}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalMetric> {
		@Nullable
		private RankEvalMetricPrecision precision;

		@Nullable
		private RankEvalMetricRecall recall;

		@Nullable
		private RankEvalMetricMeanReciprocalRank meanReciprocalRank;

		@Nullable
		private RankEvalMetricDiscountedCumulativeGain dcg;

		@Nullable
		private RankEvalMetricExpectedReciprocalRank expectedReciprocalRank;

		/**
		 * API name: {@code precision}
		 */
		public Builder precision(@Nullable RankEvalMetricPrecision value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public Builder precision(Function<RankEvalMetricPrecision.Builder, ObjectBuilder<RankEvalMetricPrecision>> fn) {
			return this.precision(fn.apply(new RankEvalMetricPrecision.Builder()).build());
		}

		/**
		 * API name: {@code recall}
		 */
		public Builder recall(@Nullable RankEvalMetricRecall value) {
			this.recall = value;
			return this;
		}

		/**
		 * API name: {@code recall}
		 */
		public Builder recall(Function<RankEvalMetricRecall.Builder, ObjectBuilder<RankEvalMetricRecall>> fn) {
			return this.recall(fn.apply(new RankEvalMetricRecall.Builder()).build());
		}

		/**
		 * API name: {@code mean_reciprocal_rank}
		 */
		public Builder meanReciprocalRank(@Nullable RankEvalMetricMeanReciprocalRank value) {
			this.meanReciprocalRank = value;
			return this;
		}

		/**
		 * API name: {@code mean_reciprocal_rank}
		 */
		public Builder meanReciprocalRank(
				Function<RankEvalMetricMeanReciprocalRank.Builder, ObjectBuilder<RankEvalMetricMeanReciprocalRank>> fn) {
			return this.meanReciprocalRank(fn.apply(new RankEvalMetricMeanReciprocalRank.Builder()).build());
		}

		/**
		 * API name: {@code dcg}
		 */
		public Builder dcg(@Nullable RankEvalMetricDiscountedCumulativeGain value) {
			this.dcg = value;
			return this;
		}

		/**
		 * API name: {@code dcg}
		 */
		public Builder dcg(
				Function<RankEvalMetricDiscountedCumulativeGain.Builder, ObjectBuilder<RankEvalMetricDiscountedCumulativeGain>> fn) {
			return this.dcg(fn.apply(new RankEvalMetricDiscountedCumulativeGain.Builder()).build());
		}

		/**
		 * API name: {@code expected_reciprocal_rank}
		 */
		public Builder expectedReciprocalRank(@Nullable RankEvalMetricExpectedReciprocalRank value) {
			this.expectedReciprocalRank = value;
			return this;
		}

		/**
		 * API name: {@code expected_reciprocal_rank}
		 */
		public Builder expectedReciprocalRank(
				Function<RankEvalMetricExpectedReciprocalRank.Builder, ObjectBuilder<RankEvalMetricExpectedReciprocalRank>> fn) {
			return this.expectedReciprocalRank(fn.apply(new RankEvalMetricExpectedReciprocalRank.Builder()).build());
		}

		/**
		 * Builds a {@link RankEvalMetric}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetric build() {

			return new RankEvalMetric(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetric}
	 */
	public static final JsonpDeserializer<RankEvalMetric> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RankEvalMetric::setupRankEvalMetricDeserializer, Builder::build);

	protected static void setupRankEvalMetricDeserializer(DelegatingDeserializer<RankEvalMetric.Builder> op) {

		op.add(Builder::precision, RankEvalMetricPrecision._DESERIALIZER, "precision");
		op.add(Builder::recall, RankEvalMetricRecall._DESERIALIZER, "recall");
		op.add(Builder::meanReciprocalRank, RankEvalMetricMeanReciprocalRank._DESERIALIZER, "mean_reciprocal_rank");
		op.add(Builder::dcg, RankEvalMetricDiscountedCumulativeGain._DESERIALIZER, "dcg");
		op.add(Builder::expectedReciprocalRank, RankEvalMetricExpectedReciprocalRank._DESERIALIZER,
				"expected_reciprocal_rank");

	}

}
