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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalyticsStatsContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalyticsStats implements TaggedUnion<DataframeAnalyticsStats.Kind, Object>, JsonpSerializable {

	/**
	 * {@link DataframeAnalyticsStats} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#ml._types.DataframeAnalyticsStatsContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		ClassificationStats("classification_stats"),

		OutlierDetectionStats("outlier_detection_stats"),

		RegressionStats("regression_stats"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public DataframeAnalyticsStats(DataframeAnalyticsStatsVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._dataframeAnalyticsStatsKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DataframeAnalyticsStats(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DataframeAnalyticsStats of(Function<Builder, ObjectBuilder<DataframeAnalyticsStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code classification_stats}?
	 */
	public boolean isClassificationStats() {
		return _kind == Kind.ClassificationStats;
	}

	/**
	 * Get the {@code classification_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters classificationStats() {
		return TaggedUnionUtils.get(this, Kind.ClassificationStats);
	}

	/**
	 * Is this variant instance of kind {@code outlier_detection_stats}?
	 */
	public boolean isOutlierDetectionStats() {
		return _kind == Kind.OutlierDetectionStats;
	}

	/**
	 * Get the {@code outlier_detection_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code outlier_detection_stats} kind.
	 */
	public DataframeAnalyticsStatsOutlierDetection outlierDetectionStats() {
		return TaggedUnionUtils.get(this, Kind.OutlierDetectionStats);
	}

	/**
	 * Is this variant instance of kind {@code regression_stats}?
	 */
	public boolean isRegressionStats() {
		return _kind == Kind.RegressionStats;
	}

	/**
	 * Get the {@code regression_stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression_stats}
	 *             kind.
	 */
	public DataframeAnalyticsStatsHyperparameters regressionStats() {
		return TaggedUnionUtils.get(this, Kind.RegressionStats);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalyticsStats> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<DataframeAnalyticsStats> classificationStats(DataframeAnalyticsStatsHyperparameters v) {
			this._kind = Kind.ClassificationStats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalyticsStats> classificationStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> fn) {
			return this.classificationStats(fn.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalyticsStats> outlierDetectionStats(DataframeAnalyticsStatsOutlierDetection v) {
			this._kind = Kind.OutlierDetectionStats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalyticsStats> outlierDetectionStats(
				Function<DataframeAnalyticsStatsOutlierDetection.Builder, ObjectBuilder<DataframeAnalyticsStatsOutlierDetection>> fn) {
			return this.outlierDetectionStats(fn.apply(new DataframeAnalyticsStatsOutlierDetection.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalyticsStats> regressionStats(DataframeAnalyticsStatsHyperparameters v) {
			this._kind = Kind.RegressionStats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalyticsStats> regressionStats(
				Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> fn) {
			return this.regressionStats(fn.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		}

		public DataframeAnalyticsStats build() {
			_checkSingleUse();
			return new DataframeAnalyticsStats(this);
		}

	}

	protected static void setupDataframeAnalyticsStatsDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::classificationStats, DataframeAnalyticsStatsHyperparameters._DESERIALIZER,
				"classification_stats");
		op.add(Builder::outlierDetectionStats, DataframeAnalyticsStatsOutlierDetection._DESERIALIZER,
				"outlier_detection_stats");
		op.add(Builder::regressionStats, DataframeAnalyticsStatsHyperparameters._DESERIALIZER, "regression_stats");

	}

	public static final JsonpDeserializer<DataframeAnalyticsStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsStats::setupDataframeAnalyticsStatsDeserializer, Builder::build);
}
