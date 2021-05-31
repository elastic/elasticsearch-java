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

package co.elastic.clients.elasticsearch._global.rank_eval;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetricPrecision
public final class RankEvalMetricPrecision extends RankEvalMetricRatingTreshold {
	@Nullable
	private final Boolean ignoreUnlabeled;

	// ---------------------------------------------------------------------------------------------

	protected RankEvalMetricPrecision(Builder builder) {
		super(builder);
		this.ignoreUnlabeled = builder.ignoreUnlabeled;

	}

	/**
	 * Controls how unlabeled documents in the search results are counted. If set to
	 * true, unlabeled documents are ignored and neither count as relevant or
	 * irrelevant. Set to false (the default), they are treated as irrelevant.
	 *
	 * API name: {@code ignore_unlabeled}
	 */
	@Nullable
	public Boolean ignoreUnlabeled() {
		return this.ignoreUnlabeled;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.ignoreUnlabeled != null) {

			generator.writeKey("ignore_unlabeled");
			generator.write(this.ignoreUnlabeled);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetricPrecision}.
	 */
	public static class Builder extends RankEvalMetricRatingTreshold.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankEvalMetricPrecision> {
		@Nullable
		private Boolean ignoreUnlabeled;

		/**
		 * Controls how unlabeled documents in the search results are counted. If set to
		 * true, unlabeled documents are ignored and neither count as relevant or
		 * irrelevant. Set to false (the default), they are treated as irrelevant.
		 *
		 * API name: {@code ignore_unlabeled}
		 */
		public Builder ignoreUnlabeled(@Nullable Boolean value) {
			this.ignoreUnlabeled = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankEvalMetricPrecision}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetricPrecision build() {

			return new RankEvalMetricPrecision(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for RankEvalMetricPrecision
	 */
	public static final JsonpValueParser<RankEvalMetricPrecision> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, RankEvalMetricPrecision::setupRankEvalMetricPrecisionParser);

	protected static void setupRankEvalMetricPrecisionParser(
			DelegatingJsonpValueParser<RankEvalMetricPrecision.Builder> op) {
		RankEvalMetricRatingTreshold.setupRankEvalMetricRatingTresholdParser(op);
		op.add(Builder::ignoreUnlabeled, JsonpValueParser.booleanParser(), "ignore_unlabeled");

	}

}
