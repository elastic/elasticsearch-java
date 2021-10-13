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

// typedef: ml._types.DataframeAnalysisContainer
@JsonpDeserializable
public class DataframeAnalysis implements TaggedUnion<Object>, JsonpSerializable {

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

	public DataframeAnalysis(DataframeAnalysisVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends DataframeAnalysisVariant> DataframeAnalysis(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private DataframeAnalysis(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public DataframeAnalysis(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public DataframeAnalysisClassification classification() {
		return TaggedUnionUtils.get(this, CLASSIFICATION);
	}

	/**
	 * Get the {@code outlier_detection} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code outlier_detection}
	 *             kind.
	 */
	public DataframeAnalysisOutlierDetection outlierDetection() {
		return TaggedUnionUtils.get(this, OUTLIER_DETECTION);
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public DataframeAnalysisRegression regression() {
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

	public static class Builder implements ObjectBuilder<DataframeAnalysis> {
		private String _type;
		private Object _value;

		public Builder classification(DataframeAnalysisClassification v) {
			this._type = CLASSIFICATION;
			this._value = v;
			return this;
		}

		public Builder classification(
				Function<DataframeAnalysisClassification.Builder, ObjectBuilder<DataframeAnalysisClassification>> f) {
			return this.classification(f.apply(new DataframeAnalysisClassification.Builder()).build());
		}

		public Builder outlierDetection(DataframeAnalysisOutlierDetection v) {
			this._type = OUTLIER_DETECTION;
			this._value = v;
			return this;
		}

		public Builder outlierDetection(
				Function<DataframeAnalysisOutlierDetection.Builder, ObjectBuilder<DataframeAnalysisOutlierDetection>> f) {
			return this.outlierDetection(f.apply(new DataframeAnalysisOutlierDetection.Builder()).build());
		}

		public Builder regression(DataframeAnalysisRegression v) {
			this._type = REGRESSION;
			this._value = v;
			return this;
		}

		public Builder regression(
				Function<DataframeAnalysisRegression.Builder, ObjectBuilder<DataframeAnalysisRegression>> f) {
			return this.regression(f.apply(new DataframeAnalysisRegression.Builder()).build());
		}

		public DataframeAnalysis build() {
			return new DataframeAnalysis(this);
		}

	}

	protected static void setupDataframeAnalysisDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::classification, DataframeAnalysisClassification._DESERIALIZER, "classification");
		op.add(Builder::outlierDetection, DataframeAnalysisOutlierDetection._DESERIALIZER, "outlier_detection");
		op.add(Builder::regression, DataframeAnalysisRegression._DESERIALIZER, "regression");

	}

	public static final JsonpDeserializer<DataframeAnalysis> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			DataframeAnalysis::setupDataframeAnalysisDeserializer, Builder::build);
}
