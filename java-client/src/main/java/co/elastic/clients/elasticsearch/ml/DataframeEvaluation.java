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
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationContainer
@JsonpDeserializable
public class DataframeEvaluation implements TaggedUnion<Object>, JsonpSerializable {

	public static final String CLASSIFICATION = "classification";
	public static final String OUTLIER_DETECTION = "outlier_detection";
	public static final String REGRESSION = "regression";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public DataframeEvaluation(DataframeEvaluationVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private DataframeEvaluation(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public DataframeEvaluationClassification classification() {
		return TaggedUnionUtils.get(this, CLASSIFICATION);
	}

	/**
	 * Get the {@code outlier_detection} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code outlier_detection}
	 *             kind.
	 */
	public DataframeEvaluationOutlierDetection outlierDetection() {
		return TaggedUnionUtils.get(this, OUTLIER_DETECTION);
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public DataframeEvaluationRegression regression() {
		return TaggedUnionUtils.get(this, REGRESSION);
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

	public static class Builder {
		private String _type;
		private Object _value;

		public ObjectBuilder<DataframeEvaluation> classification(DataframeEvaluationClassification v) {
			this._type = CLASSIFICATION;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeEvaluation> classification(
				Function<DataframeEvaluationClassification.Builder, ObjectBuilder<DataframeEvaluationClassification>> f) {
			return this.classification(f.apply(new DataframeEvaluationClassification.Builder()).build());
		}

		public ObjectBuilder<DataframeEvaluation> outlierDetection(DataframeEvaluationOutlierDetection v) {
			this._type = OUTLIER_DETECTION;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeEvaluation> outlierDetection(
				Function<DataframeEvaluationOutlierDetection.Builder, ObjectBuilder<DataframeEvaluationOutlierDetection>> f) {
			return this.outlierDetection(f.apply(new DataframeEvaluationOutlierDetection.Builder()).build());
		}

		public ObjectBuilder<DataframeEvaluation> regression(DataframeEvaluationRegression v) {
			this._type = REGRESSION;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeEvaluation> regression(
				Function<DataframeEvaluationRegression.Builder, ObjectBuilder<DataframeEvaluationRegression>> f) {
			return this.regression(f.apply(new DataframeEvaluationRegression.Builder()).build());
		}

		protected DataframeEvaluation build() {
			return new DataframeEvaluation(this);
		}

	}

	protected static void setupDataframeEvaluationDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::classification, DataframeEvaluationClassification._DESERIALIZER, "classification");
		op.add(Builder::outlierDetection, DataframeEvaluationOutlierDetection._DESERIALIZER, "outlier_detection");
		op.add(Builder::regression, DataframeEvaluationRegression._DESERIALIZER, "regression");

	}

	public static final JsonpDeserializer<DataframeEvaluation> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			DataframeEvaluation::setupDataframeEvaluationDeserializer, Builder::build);
}
