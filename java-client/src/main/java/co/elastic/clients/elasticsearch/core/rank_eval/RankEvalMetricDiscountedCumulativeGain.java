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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetricDiscountedCumulativeGain

/**
 * Discounted cumulative gain (DCG)
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/search-rank-eval.html#_discounted_cumulative_gain_dcg">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.rank_eval.RankEvalMetricDiscountedCumulativeGain">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankEvalMetricDiscountedCumulativeGain extends RankEvalMetricBase {
	@Nullable
	private final Boolean normalize;

	// ---------------------------------------------------------------------------------------------

	private RankEvalMetricDiscountedCumulativeGain(Builder builder) {
		super(builder);

		this.normalize = builder.normalize;

	}

	public static RankEvalMetricDiscountedCumulativeGain of(
			Function<Builder, ObjectBuilder<RankEvalMetricDiscountedCumulativeGain>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If set to true, this metric will calculate the Normalized DCG.
	 * <p>
	 * API name: {@code normalize}
	 */
	@Nullable
	public final Boolean normalize() {
		return this.normalize;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.normalize != null) {
			generator.writeKey("normalize");
			generator.write(this.normalize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetricDiscountedCumulativeGain}.
	 */

	public static class Builder extends RankEvalMetricBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankEvalMetricDiscountedCumulativeGain> {
		@Nullable
		private Boolean normalize;

		/**
		 * If set to true, this metric will calculate the Normalized DCG.
		 * <p>
		 * API name: {@code normalize}
		 */
		public final Builder normalize(@Nullable Boolean value) {
			this.normalize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankEvalMetricDiscountedCumulativeGain}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetricDiscountedCumulativeGain build() {
			_checkSingleUse();

			return new RankEvalMetricDiscountedCumulativeGain(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetricDiscountedCumulativeGain}
	 */
	public static final JsonpDeserializer<RankEvalMetricDiscountedCumulativeGain> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					RankEvalMetricDiscountedCumulativeGain::setupRankEvalMetricDiscountedCumulativeGainDeserializer);

	protected static void setupRankEvalMetricDiscountedCumulativeGainDeserializer(
			ObjectDeserializer<RankEvalMetricDiscountedCumulativeGain.Builder> op) {
		RankEvalMetricBase.setupRankEvalMetricBaseDeserializer(op);
		op.add(Builder::normalize, JsonpDeserializer.booleanDeserializer(), "normalize");

	}

}
