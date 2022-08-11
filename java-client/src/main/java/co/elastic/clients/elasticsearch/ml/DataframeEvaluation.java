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

// typedef: ml._types.DataframeEvaluationContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluation implements TaggedUnion<DataframeEvaluation.Kind, Object>, JsonpSerializable {

	/**
	 * {@link DataframeEvaluation} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Classification("classification"),

		OutlierDetection("outlier_detection"),

		Regression("regression"),

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

	public DataframeEvaluation(DataframeEvaluationVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._dataframeEvaluationKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DataframeEvaluation(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DataframeEvaluation of(Function<Builder, ObjectBuilder<DataframeEvaluation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code classification}?
	 */
	public boolean isClassification() {
		return _kind == Kind.Classification;
	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public DataframeEvaluationClassification classification() {
		return TaggedUnionUtils.get(this, Kind.Classification);
	}

	/**
	 * Is this variant instance of kind {@code outlier_detection}?
	 */
	public boolean isOutlierDetection() {
		return _kind == Kind.OutlierDetection;
	}

	/**
	 * Get the {@code outlier_detection} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code outlier_detection}
	 *             kind.
	 */
	public DataframeEvaluationOutlierDetection outlierDetection() {
		return TaggedUnionUtils.get(this, Kind.OutlierDetection);
	}

	/**
	 * Is this variant instance of kind {@code regression}?
	 */
	public boolean isRegression() {
		return _kind == Kind.Regression;
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public DataframeEvaluationRegression regression() {
		return TaggedUnionUtils.get(this, Kind.Regression);
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
				ObjectBuilder<DataframeEvaluation> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<DataframeEvaluation> classification(DataframeEvaluationClassification v) {
			this._kind = Kind.Classification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeEvaluation> classification(
				Function<DataframeEvaluationClassification.Builder, ObjectBuilder<DataframeEvaluationClassification>> fn) {
			return this.classification(fn.apply(new DataframeEvaluationClassification.Builder()).build());
		}

		public ObjectBuilder<DataframeEvaluation> outlierDetection(DataframeEvaluationOutlierDetection v) {
			this._kind = Kind.OutlierDetection;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeEvaluation> outlierDetection(
				Function<DataframeEvaluationOutlierDetection.Builder, ObjectBuilder<DataframeEvaluationOutlierDetection>> fn) {
			return this.outlierDetection(fn.apply(new DataframeEvaluationOutlierDetection.Builder()).build());
		}

		public ObjectBuilder<DataframeEvaluation> regression(DataframeEvaluationRegression v) {
			this._kind = Kind.Regression;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeEvaluation> regression(
				Function<DataframeEvaluationRegression.Builder, ObjectBuilder<DataframeEvaluationRegression>> fn) {
			return this.regression(fn.apply(new DataframeEvaluationRegression.Builder()).build());
		}

		public DataframeEvaluation build() {
			_checkSingleUse();
			return new DataframeEvaluation(this);
		}

	}

	protected static void setupDataframeEvaluationDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::classification, DataframeEvaluationClassification._DESERIALIZER, "classification");
		op.add(Builder::outlierDetection, DataframeEvaluationOutlierDetection._DESERIALIZER, "outlier_detection");
		op.add(Builder::regression, DataframeEvaluationRegression._DESERIALIZER, "regression");

	}

	public static final JsonpDeserializer<DataframeEvaluation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeEvaluation::setupDataframeEvaluationDeserializer, Builder::build);
}
