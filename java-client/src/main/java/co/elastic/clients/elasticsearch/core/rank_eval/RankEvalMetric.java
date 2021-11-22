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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetric
@JsonpDeserializable
public class RankEvalMetric implements JsonpSerializable {
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

	private RankEvalMetric(Builder builder) {

		this.precision = builder.precision;
		this.recall = builder.recall;
		this.meanReciprocalRank = builder.meanReciprocalRank;
		this.dcg = builder.dcg;
		this.expectedReciprocalRank = builder.expectedReciprocalRank;

	}

	public static RankEvalMetric of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public final RankEvalMetricPrecision precision() {
		return this.precision;
	}

	/**
	 * API name: {@code recall}
	 */
	@Nullable
	public final RankEvalMetricRecall recall() {
		return this.recall;
	}

	/**
	 * API name: {@code mean_reciprocal_rank}
	 */
	@Nullable
	public final RankEvalMetricMeanReciprocalRank meanReciprocalRank() {
		return this.meanReciprocalRank;
	}

	/**
	 * API name: {@code dcg}
	 */
	@Nullable
	public final RankEvalMetricDiscountedCumulativeGain dcg() {
		return this.dcg;
	}

	/**
	 * API name: {@code expected_reciprocal_rank}
	 */
	@Nullable
	public final RankEvalMetricExpectedReciprocalRank expectedReciprocalRank() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RankEvalMetric> {
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
		public final Builder precision(@Nullable RankEvalMetricPrecision value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(Consumer<RankEvalMetricPrecision.Builder> fn) {
			RankEvalMetricPrecision.Builder builder = new RankEvalMetricPrecision.Builder();
			fn.accept(builder);
			return this.precision(builder.build());
		}

		/**
		 * API name: {@code recall}
		 */
		public final Builder recall(@Nullable RankEvalMetricRecall value) {
			this.recall = value;
			return this;
		}

		/**
		 * API name: {@code recall}
		 */
		public final Builder recall(Consumer<RankEvalMetricRecall.Builder> fn) {
			RankEvalMetricRecall.Builder builder = new RankEvalMetricRecall.Builder();
			fn.accept(builder);
			return this.recall(builder.build());
		}

		/**
		 * API name: {@code mean_reciprocal_rank}
		 */
		public final Builder meanReciprocalRank(@Nullable RankEvalMetricMeanReciprocalRank value) {
			this.meanReciprocalRank = value;
			return this;
		}

		/**
		 * API name: {@code mean_reciprocal_rank}
		 */
		public final Builder meanReciprocalRank(Consumer<RankEvalMetricMeanReciprocalRank.Builder> fn) {
			RankEvalMetricMeanReciprocalRank.Builder builder = new RankEvalMetricMeanReciprocalRank.Builder();
			fn.accept(builder);
			return this.meanReciprocalRank(builder.build());
		}

		/**
		 * API name: {@code dcg}
		 */
		public final Builder dcg(@Nullable RankEvalMetricDiscountedCumulativeGain value) {
			this.dcg = value;
			return this;
		}

		/**
		 * API name: {@code dcg}
		 */
		public final Builder dcg(Consumer<RankEvalMetricDiscountedCumulativeGain.Builder> fn) {
			RankEvalMetricDiscountedCumulativeGain.Builder builder = new RankEvalMetricDiscountedCumulativeGain.Builder();
			fn.accept(builder);
			return this.dcg(builder.build());
		}

		/**
		 * API name: {@code expected_reciprocal_rank}
		 */
		public final Builder expectedReciprocalRank(@Nullable RankEvalMetricExpectedReciprocalRank value) {
			this.expectedReciprocalRank = value;
			return this;
		}

		/**
		 * API name: {@code expected_reciprocal_rank}
		 */
		public final Builder expectedReciprocalRank(Consumer<RankEvalMetricExpectedReciprocalRank.Builder> fn) {
			RankEvalMetricExpectedReciprocalRank.Builder builder = new RankEvalMetricExpectedReciprocalRank.Builder();
			fn.accept(builder);
			return this.expectedReciprocalRank(builder.build());
		}

		/**
		 * Builds a {@link RankEvalMetric}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetric build() {
			_checkSingleUse();

			return new RankEvalMetric(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetric}
	 */
	public static final JsonpDeserializer<RankEvalMetric> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RankEvalMetric::setupRankEvalMetricDeserializer);

	protected static void setupRankEvalMetricDeserializer(ObjectDeserializer<RankEvalMetric.Builder> op) {

		op.add(Builder::precision, RankEvalMetricPrecision._DESERIALIZER, "precision");
		op.add(Builder::recall, RankEvalMetricRecall._DESERIALIZER, "recall");
		op.add(Builder::meanReciprocalRank, RankEvalMetricMeanReciprocalRank._DESERIALIZER, "mean_reciprocal_rank");
		op.add(Builder::dcg, RankEvalMetricDiscountedCumulativeGain._DESERIALIZER, "dcg");
		op.add(Builder::expectedReciprocalRank, RankEvalMetricExpectedReciprocalRank._DESERIALIZER,
				"expected_reciprocal_rank");

	}

}
