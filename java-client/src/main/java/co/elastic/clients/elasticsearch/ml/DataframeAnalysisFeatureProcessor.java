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

// typedef: ml._types.DataframeAnalysisFeatureProcessor
public interface DataframeAnalysisFeatureProcessor extends JsonpSerializable {

	String FREQUENCY_ENCODING = "frequency_encoding";
	String MULTI_ENCODING = "multi_encoding";
	String N_GRAM_ENCODING = "n_gram_encoding";
	String ONE_HOT_ENCODING = "one_hot_encoding";
	String TARGET_MEAN_ENCODING = "target_mean_encoding";

	/**
	 * The type of this {@code DataframeAnalysisFeatureProcessor}.
	 */
	String _type();

	class Builder {
		/**
		 * The configuration information necessary to perform frequency encoding.
		 * <p>
		 * API name: {@code frequency_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				DataframeAnalysisFeatureProcessorFrequencyEncoding value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform frequency encoding.
		 * <p>
		 * API name: {@code frequency_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				Function<DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorFrequencyEncoding>> fn) {
			return this.frequencyEncoding(
					fn.apply(new DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder()).build());
		}

		/**
		 * The configuration information necessary to perform multi encoding. It allows
		 * multiple processors to be changed together. This way the output of a
		 * processor can then be passed to another as an input.
		 * <p>
		 * API name: {@code multi_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				DataframeAnalysisFeatureProcessorMultiEncoding value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform multi encoding. It allows
		 * multiple processors to be changed together. This way the output of a
		 * processor can then be passed to another as an input.
		 * <p>
		 * API name: {@code multi_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				Function<DataframeAnalysisFeatureProcessorMultiEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding>> fn) {
			return this.multiEncoding(fn.apply(new DataframeAnalysisFeatureProcessorMultiEncoding.Builder()).build());
		}

		/**
		 * The configuration information necessary to perform n-gram encoding. Features
		 * created by this encoder have the following name format:
		 * &lt;feature_prefix&gt;.<ngram><string position>. For example, if the
		 * feature_prefix is f, the feature name for the second unigram in a string is
		 * f.11.
		 * <p>
		 * API name: {@code n_gram_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				DataframeAnalysisFeatureProcessorNGramEncoding value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform n-gram encoding. Features
		 * created by this encoder have the following name format:
		 * &lt;feature_prefix&gt;.<ngram><string position>. For example, if the
		 * feature_prefix is f, the feature name for the second unigram in a string is
		 * f.11.
		 * <p>
		 * API name: {@code n_gram_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				Function<DataframeAnalysisFeatureProcessorNGramEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorNGramEncoding>> fn) {
			return this.nGramEncoding(fn.apply(new DataframeAnalysisFeatureProcessorNGramEncoding.Builder()).build());
		}

		/**
		 * The configuration information necessary to perform one hot encoding.
		 * <p>
		 * API name: {@code one_hot_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				DataframeAnalysisFeatureProcessorOneHotEncoding value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform one hot encoding.
		 * <p>
		 * API name: {@code one_hot_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				Function<DataframeAnalysisFeatureProcessorOneHotEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorOneHotEncoding>> fn) {
			return this.oneHotEncoding(fn.apply(new DataframeAnalysisFeatureProcessorOneHotEncoding.Builder()).build());
		}

		/**
		 * The configuration information necessary to perform target mean encoding.
		 * <p>
		 * API name: {@code target_mean_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				DataframeAnalysisFeatureProcessorTargetMeanEncoding value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * The configuration information necessary to perform target mean encoding.
		 * <p>
		 * API name: {@code target_mean_encoding}
		 */
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				Function<DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorTargetMeanEncoding>> fn) {
			return this.targetMeanEncoding(
					fn.apply(new DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder()).build());
		}

	}

	class $Helper {
		private static DataframeAnalysisFeatureProcessor deserialize(JsonParser parser, JsonpMapper mapper,
				JsonParser.Event event) {

			ObjectBuilder<? extends DataframeAnalysisFeatureProcessor> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case FREQUENCY_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisFeatureProcessorFrequencyEncoding.$BUILDER_DESERIALIZER.deserialize(
								new DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case MULTI_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisFeatureProcessorMultiEncoding.$BUILDER_DESERIALIZER.deserialize(
								new DataframeAnalysisFeatureProcessorMultiEncoding.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case N_GRAM_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisFeatureProcessorNGramEncoding.$BUILDER_DESERIALIZER.deserialize(
								new DataframeAnalysisFeatureProcessorNGramEncoding.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case ONE_HOT_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisFeatureProcessorOneHotEncoding.$BUILDER_DESERIALIZER.deserialize(
								new DataframeAnalysisFeatureProcessorOneHotEncoding.Builder(), parser, mapper,
								parser.next());
						break;
					}
					case TARGET_MEAN_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DataframeAnalysisFeatureProcessorTargetMeanEncoding.$BUILDER_DESERIALIZER.deserialize(
								new DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder(), parser, mapper,
								parser.next());
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

	JsonpDeserializer<DataframeAnalysisFeatureProcessor> DESERIALIZER = JsonpDeserializer
			.of(EnumSet.of(JsonParser.Event.START_OBJECT), $Helper::deserialize);
}
