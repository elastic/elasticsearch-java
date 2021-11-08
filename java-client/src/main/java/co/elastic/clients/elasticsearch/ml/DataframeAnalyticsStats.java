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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsContainer
@JsonpDeserializable
public class DataframeAnalyticsStats implements TaggedUnion<Object>, JsonpSerializable {

	public static final String CLASSIFICATION_STATS = "classification_stats";
	public static final String OUTLIER_DETECTION_STATS = "outlier_detection_stats";
	public static final String REGRESSION_STATS = "regression_stats";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public DataframeAnalyticsStats(DataframeAnalyticsStatsVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DataframeAnalyticsStats(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DataframeAnalyticsStats of(Function<Builder, ObjectBuilder<DataframeAnalyticsStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code classification_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters classificationStats() {
		return TaggedUnionUtils.get(this, CLASSIFICATION_STATS);
	}

	/**
	 * Get the {@code outlier_detection_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code outlier_detection_stats} kind.
	 */
	public DataframeAnalyticsStatsOutlierDetection outlierDetectionStats() {
		return TaggedUnionUtils.get(this, OUTLIER_DETECTION_STATS);
	}

	/**
	 * Get the {@code regression_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters regressionStats() {
		return TaggedUnionUtils.get(this, REGRESSION_STATS);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataframeAnalyticsStats> {
		private String _type;
		private Object _value;

		public Builder classificationStats(DataframeAnalyticsStatsHyperparameters v) {
			this._type = CLASSIFICATION_STATS;
			this._value = v;
			return this;
		}

		public Builder classificationStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> f) {
			return this.classificationStats(f.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		public Builder outlierDetectionStats(DataframeAnalyticsStatsOutlierDetection v) {
			this._type = OUTLIER_DETECTION_STATS;
			this._value = v;
			return this;
		}

		public Builder outlierDetectionStats(
				Function<DataframeAnalyticsStatsOutlierDetection.Builder, ObjectBuilder<DataframeAnalyticsStatsOutlierDetection>> f) {
			return this.outlierDetectionStats(f.apply(new DataframeAnalyticsStatsOutlierDetection.Builder()).build());
		}

		public Builder regressionStats(DataframeAnalyticsStatsHyperparameters v) {
			this._type = REGRESSION_STATS;
			this._value = v;
			return this;
		}

		public Builder regressionStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> f) {
			return this.regressionStats(f.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		public DataframeAnalyticsStats build() {
			_checkSingleUse();
			return new DataframeAnalyticsStats(this);
		}

	}

	protected static void setupDataframeAnalyticsStatsDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::classificationStats, DataframeAnalyticsStatsHyperparameters._DESERIALIZER,
				"classification_stats");
		op.add(Builder::outlierDetectionStats, DataframeAnalyticsStatsOutlierDetection._DESERIALIZER,
				"outlier_detection_stats");
		op.add(Builder::regressionStats, DataframeAnalyticsStatsHyperparameters._DESERIALIZER, "regression_stats");

	}

	public static final JsonpDeserializer<DataframeAnalyticsStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsStats::setupDataframeAnalyticsStatsDeserializer, Builder::build);
}
