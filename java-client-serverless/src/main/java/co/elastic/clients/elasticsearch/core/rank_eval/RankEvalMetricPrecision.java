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

// typedef: _global.rank_eval.RankEvalMetricPrecision

/**
 * Precision at K (P@k)
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/search-rank-eval.html#k-precision">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.rank_eval.RankEvalMetricPrecision">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankEvalMetricPrecision extends RankEvalMetricRatingTreshold {
	@Nullable
	private final Boolean ignoreUnlabeled;

	// ---------------------------------------------------------------------------------------------

	private RankEvalMetricPrecision(Builder builder) {
		super(builder);

		this.ignoreUnlabeled = builder.ignoreUnlabeled;

	}

	public static RankEvalMetricPrecision of(Function<Builder, ObjectBuilder<RankEvalMetricPrecision>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Controls how unlabeled documents in the search results are counted. If set to
	 * true, unlabeled documents are ignored and neither count as relevant or
	 * irrelevant. Set to false (the default), they are treated as irrelevant.
	 * <p>
	 * API name: {@code ignore_unlabeled}
	 */
	@Nullable
	public final Boolean ignoreUnlabeled() {
		return this.ignoreUnlabeled;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
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
		 * <p>
		 * API name: {@code ignore_unlabeled}
		 */
		public final Builder ignoreUnlabeled(@Nullable Boolean value) {
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
			_checkSingleUse();

			return new RankEvalMetricPrecision(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetricPrecision}
	 */
	public static final JsonpDeserializer<RankEvalMetricPrecision> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankEvalMetricPrecision::setupRankEvalMetricPrecisionDeserializer);

	protected static void setupRankEvalMetricPrecisionDeserializer(
			ObjectDeserializer<RankEvalMetricPrecision.Builder> op) {
		RankEvalMetricRatingTreshold.setupRankEvalMetricRatingTresholdDeserializer(op);
		op.add(Builder::ignoreUnlabeled, JsonpDeserializer.booleanDeserializer(), "ignore_unlabeled");

	}

}
