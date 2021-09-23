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

// typedef: ml._types.DataframeAnalysisContainer
public interface DataframeAnalysis extends JsonpSerializable {

	String CLASSIFICATION = "classification";
	String OUTLIER_DETECTION = "outlier_detection";
	String REGRESSION = "regression";

	/**
	 * The type of this {@code DataframeAnalysisContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * The configuration information necessary to perform classification.
		 * <p>
		 * API name: {@code classification}
		 */
		public ObjectBuilder<DataframeAnalysis> classification(DataframeAnalysisClassification value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform classification.
		 * <p>
		 * API name: {@code classification}
		 */
		public ObjectBuilder<DataframeAnalysis> classification(
				Function<DataframeAnalysisClassification.Builder, ObjectBuilder<DataframeAnalysisClassification>> fn) {
			return this.classification(fn.apply(new DataframeAnalysisClassification.Builder()).build());
		}

		/**
		 * The configuration information necessary to perform outlier detection. NOTE:
		 * Advanced parameters are for fine-tuning classification analysis. They are set
		 * automatically by hyperparameter optimization to give the minimum validation
		 * error. It is highly recommended to use the default values unless you fully
		 * understand the function of these parameters.
		 * <p>
		 * API name: {@code outlier_detection}
		 */
		public ObjectBuilder<DataframeAnalysis> outlierDetection(DataframeAnalysisOutlierDetection value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform outlier detection. NOTE:
		 * Advanced parameters are for fine-tuning classification analysis. They are set
		 * automatically by hyperparameter optimization to give the minimum validation
		 * error. It is highly recommended to use the default values unless you fully
		 * understand the function of these parameters.
		 * <p>
		 * API name: {@code outlier_detection}
		 */
		public ObjectBuilder<DataframeAnalysis> outlierDetection(
				Function<DataframeAnalysisOutlierDetection.Builder, ObjectBuilder<DataframeAnalysisOutlierDetection>> fn) {
			return this.outlierDetection(fn.apply(new DataframeAnalysisOutlierDetection.Builder()).build());
		}

		/**
		 * The configuration information necessary to perform regression. NOTE: Advanced
		 * parameters are for fine-tuning regression analysis. They are set
		 * automatically by hyperparameter optimization to give the minimum validation
		 * error. It is highly recommended to use the default values unless you fully
		 * understand the function of these parameters.
		 * <p>
		 * API name: {@code regression}
		 */
		public ObjectBuilder<DataframeAnalysis> regression(DataframeAnalysisRegression value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform regression. NOTE: Advanced
		 * parameters are for fine-tuning regression analysis. They are set
		 * automatically by hyperparameter optimization to give the minimum validation
		 * error. It is highly recommended to use the default values unless you fully
		 * understand the function of these parameters.
		 * <p>
		 * API name: {@code regression}
		 */
		public ObjectBuilder<DataframeAnalysis> regression(
				Function<DataframeAnalysisRegression.Builder, ObjectBuilder<DataframeAnalysisRegression>> fn) {
			return this.regression(fn.apply(new DataframeAnalysisRegression.Builder()).build());
		}

	}

	class $Helper {
		private static DataframeAnalysis deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends DataframeAnalysis> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case CLASSIFICATION : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisClassification.$BUILDER_DESERIALIZER.deserialize(
								new DataframeAnalysisClassification.Builder(), parser, mapper, parser.next());
						break;
					}
					case OUTLIER_DETECTION : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisOutlierDetection.$BUILDER_DESERIALIZER.deserialize(
								new DataframeAnalysisOutlierDetection.Builder(), parser, mapper, parser.next());
						break;
					}
					case REGRESSION : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisRegression.$BUILDER_DESERIALIZER
								.deserialize(new DataframeAnalysisRegression.Builder(), parser, mapper, parser.next());
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

	JsonpDeserializer<DataframeAnalysis> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
