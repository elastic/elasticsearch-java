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

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationContainer
public interface DataframeEvaluation extends JsonpSerializable {

	String CLASSIFICATION = "classification";
	String OUTLIER_DETECTION = "outlier_detection";
	String REGRESSION = "regression";

	/**
	 * The type of this {@code DataframeEvaluationContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * Classification evaluation evaluates the results of a classification analysis
		 * which outputs a prediction that identifies to which of the classes each
		 * document belongs.
		 * <p>
		 * API name: {@code classification}
		 */
		public ObjectBuilder<DataframeEvaluation> classification(DataframeEvaluationClassification value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * Classification evaluation evaluates the results of a classification analysis
		 * which outputs a prediction that identifies to which of the classes each
		 * document belongs.
		 * <p>
		 * API name: {@code classification}
		 */
		public ObjectBuilder<DataframeEvaluation> classification(
				Function<DataframeEvaluationClassification.Builder, ObjectBuilder<DataframeEvaluationClassification>> fn) {
			return this.classification(fn.apply(new DataframeEvaluationClassification.Builder()).build());
		}

		/**
		 * Outlier detection evaluates the results of an outlier detection analysis
		 * which outputs the probability that each document is an outlier.
		 * <p>
		 * API name: {@code outlier_detection}
		 */
		public ObjectBuilder<DataframeEvaluation> outlierDetection(DataframeEvaluationOutlierDetection value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * Outlier detection evaluates the results of an outlier detection analysis
		 * which outputs the probability that each document is an outlier.
		 * <p>
		 * API name: {@code outlier_detection}
		 */
		public ObjectBuilder<DataframeEvaluation> outlierDetection(
				Function<DataframeEvaluationOutlierDetection.Builder, ObjectBuilder<DataframeEvaluationOutlierDetection>> fn) {
			return this.outlierDetection(fn.apply(new DataframeEvaluationOutlierDetection.Builder()).build());
		}

		/**
		 * Regression evaluation evaluates the results of a regression analysis which
		 * outputs a prediction of values.
		 * <p>
		 * API name: {@code regression}
		 */
		public ObjectBuilder<DataframeEvaluation> regression(DataframeEvaluationRegression value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * Regression evaluation evaluates the results of a regression analysis which
		 * outputs a prediction of values.
		 * <p>
		 * API name: {@code regression}
		 */
		public ObjectBuilder<DataframeEvaluation> regression(
				Function<DataframeEvaluationRegression.Builder, ObjectBuilder<DataframeEvaluationRegression>> fn) {
			return this.regression(fn.apply(new DataframeEvaluationRegression.Builder()).build());
		}

	}

	class $Helper {
		private static DataframeEvaluation deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends DataframeEvaluation> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case CLASSIFICATION : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeEvaluationClassification.$BUILDER_DESERIALIZER.deserialize(
								new DataframeEvaluationClassification.Builder(), parser, mapper, parser.next());
						break;
					}
					case OUTLIER_DETECTION : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeEvaluationOutlierDetection.$BUILDER_DESERIALIZER.deserialize(
								new DataframeEvaluationOutlierDetection.Builder(), parser, mapper, parser.next());
						break;
					}
					case REGRESSION : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeEvaluationRegression.$BUILDER_DESERIALIZER.deserialize(
								new DataframeEvaluationRegression.Builder(), parser, mapper, parser.next());
						break;
					}
					default : {
						JsonpUtils.unknownKey(parser, fieldName);
					}
				}
			}

			return JsonpUtils.buildVariant(parser, builder);
		}
	}

	JsonpDeserializer<DataframeEvaluation> DESERIALIZER = JsonpDeserializer
			.of(EnumSet.of(JsonParser.Event.START_OBJECT), $Helper::deserialize);
}
