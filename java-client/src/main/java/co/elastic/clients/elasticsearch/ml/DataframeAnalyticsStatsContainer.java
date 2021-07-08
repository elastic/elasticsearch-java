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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class DataframeAnalyticsStatsContainer extends TaggedUnion<DataframeAnalyticsStatsContainer.Tag, Object>
		implements
			ToJsonp {

	public enum Tag implements StringEnum {

		classificationStats("classification_stats"),

		outlierDetectionStats("outlier_detection_stats"),

		regressionStats("regression_stats"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private DataframeAnalyticsStatsContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link DataframeAnalyticsStatsContainer} of a
	 * {@code classification_stats} kind?
	 */
	public boolean isClassificationStats() {
		return is(Tag.classificationStats);
	}

	/**
	 * Get the {@code classification_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters classificationStats() {
		return get(Tag.classificationStats);
	}

	/**
	 * Is this {@link DataframeAnalyticsStatsContainer} of a
	 * {@code outlier_detection_stats} kind?
	 */
	public boolean isOutlierDetectionStats() {
		return is(Tag.outlierDetectionStats);
	}

	/**
	 * Get the {@code outlier_detection_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code outlier_detection_stats} kind.
	 */
	public DataframeAnalyticsStatsOutlierDetection outlierDetectionStats() {
		return get(Tag.outlierDetectionStats);
	}

	/**
	 * Is this {@link DataframeAnalyticsStatsContainer} of a
	 * {@code regression_stats} kind?
	 */
	public boolean isRegressionStats() {
		return is(Tag.regressionStats);
	}

	/**
	 * Get the {@code regression_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters regressionStats() {
		return get(Tag.regressionStats);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<DataframeAnalyticsStatsContainer> classificationStats(
				DataframeAnalyticsStatsHyperparameters v) {
			this.$variant = v;
			this.$tag = Tag.classificationStats;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalyticsStatsContainer> classificationStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> f) {
			return this.classificationStats(f.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalyticsStatsContainer> outlierDetectionStats(
				DataframeAnalyticsStatsOutlierDetection v) {
			this.$variant = v;
			this.$tag = Tag.outlierDetectionStats;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalyticsStatsContainer> outlierDetectionStats(
				Function<DataframeAnalyticsStatsOutlierDetection.Builder, ObjectBuilder<DataframeAnalyticsStatsOutlierDetection>> f) {
			return this.outlierDetectionStats(f.apply(new DataframeAnalyticsStatsOutlierDetection.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalyticsStatsContainer> regressionStats(
				DataframeAnalyticsStatsHyperparameters v) {
			this.$variant = v;
			this.$tag = Tag.regressionStats;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalyticsStatsContainer> regressionStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> f) {
			return this.regressionStats(f.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		protected DataframeAnalyticsStatsContainer build() {
			return new DataframeAnalyticsStatsContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<DataframeAnalyticsStatsContainer> DESERIALIZER = JsonpDeserializer
			.lazy(DataframeAnalyticsStatsContainer::buildDeserializer);

	private static JsonpDeserializer<DataframeAnalyticsStatsContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::classificationStats, DataframeAnalyticsStatsHyperparameters.DESERIALIZER,
				"classification_stats");
		op.add(Builder::outlierDetectionStats, DataframeAnalyticsStatsOutlierDetection.DESERIALIZER,
				"outlier_detection_stats");
		op.add(Builder::regressionStats, DataframeAnalyticsStatsHyperparameters.DESERIALIZER, "regression_stats");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
