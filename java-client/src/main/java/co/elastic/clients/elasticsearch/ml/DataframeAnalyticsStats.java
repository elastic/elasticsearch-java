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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsContainer
public class DataframeAnalyticsStats extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String CLASSIFICATION_STATS = "classification_stats";
	public static final String OUTLIER_DETECTION_STATS = "outlier_detection_stats";
	public static final String REGRESSION_STATS = "regression_stats";

	private DataframeAnalyticsStats(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code classification_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters classificationStats() {
		return _get(CLASSIFICATION_STATS);
	}

	/**
	 * Get the {@code outlier_detection_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code outlier_detection_stats} kind.
	 */
	public DataframeAnalyticsStatsOutlierDetection outlierDetectionStats() {
		return _get(OUTLIER_DETECTION_STATS);
	}

	/**
	 * Get the {@code regression_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters regressionStats() {
		return _get(REGRESSION_STATS);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<DataframeAnalyticsStats> classificationStats(DataframeAnalyticsStatsHyperparameters v) {
			this.$variant = v;
			this.$tag = CLASSIFICATION_STATS;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalyticsStats> classificationStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> f) {
			return this.classificationStats(f.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalyticsStats> outlierDetectionStats(DataframeAnalyticsStatsOutlierDetection v) {
			this.$variant = v;
			this.$tag = OUTLIER_DETECTION_STATS;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalyticsStats> outlierDetectionStats(
				Function<DataframeAnalyticsStatsOutlierDetection.Builder, ObjectBuilder<DataframeAnalyticsStatsOutlierDetection>> f) {
			return this.outlierDetectionStats(f.apply(new DataframeAnalyticsStatsOutlierDetection.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalyticsStats> regressionStats(DataframeAnalyticsStatsHyperparameters v) {
			this.$variant = v;
			this.$tag = REGRESSION_STATS;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalyticsStats> regressionStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> f) {
			return this.regressionStats(f.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		protected DataframeAnalyticsStats build() {
			return new DataframeAnalyticsStats(this);
		}

	}

	protected static void setupDataframeAnalyticsStatsDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::classificationStats, DataframeAnalyticsStatsHyperparameters.DESERIALIZER,
				"classification_stats");
		op.add(Builder::outlierDetectionStats, DataframeAnalyticsStatsOutlierDetection.DESERIALIZER,
				"outlier_detection_stats");
		op.add(Builder::regressionStats, DataframeAnalyticsStatsHyperparameters.DESERIALIZER, "regression_stats");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<DataframeAnalyticsStats> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			DataframeAnalyticsStats::setupDataframeAnalyticsStatsDeserializer, Builder::build);
}
