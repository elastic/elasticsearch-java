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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Preprocessor
public interface Preprocessor extends JsonpSerializable {

	String FREQUENCY_ENCODING = "frequency_encoding";
	String ONE_HOT_ENCODING = "one_hot_encoding";
	String TARGET_MEAN_ENCODING = "target_mean_encoding";

	/**
	 * The type of this {@code Preprocessor}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code frequency_encoding}
		 */
		public ObjectBuilder<Preprocessor> frequencyEncoding(FrequencyEncodingPreprocessor value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code frequency_encoding}
		 */
		public ObjectBuilder<Preprocessor> frequencyEncoding(
				Function<FrequencyEncodingPreprocessor.Builder, ObjectBuilder<FrequencyEncodingPreprocessor>> fn) {
			return this.frequencyEncoding(fn.apply(new FrequencyEncodingPreprocessor.Builder()).build());
		}

		/**
		 * API name: {@code one_hot_encoding}
		 */
		public ObjectBuilder<Preprocessor> oneHotEncoding(OneHotEncodingPreprocessor value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code one_hot_encoding}
		 */
		public ObjectBuilder<Preprocessor> oneHotEncoding(
				Function<OneHotEncodingPreprocessor.Builder, ObjectBuilder<OneHotEncodingPreprocessor>> fn) {
			return this.oneHotEncoding(fn.apply(new OneHotEncodingPreprocessor.Builder()).build());
		}

		/**
		 * API name: {@code target_mean_encoding}
		 */
		public ObjectBuilder<Preprocessor> targetMeanEncoding(TargetMeanEncodingPreprocessor value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code target_mean_encoding}
		 */
		public ObjectBuilder<Preprocessor> targetMeanEncoding(
				Function<TargetMeanEncodingPreprocessor.Builder, ObjectBuilder<TargetMeanEncodingPreprocessor>> fn) {
			return this.targetMeanEncoding(fn.apply(new TargetMeanEncodingPreprocessor.Builder()).build());
		}

	}

	class $Helper {
		private static Preprocessor deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends Preprocessor> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case FREQUENCY_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = FrequencyEncodingPreprocessor.$BUILDER_DESERIALIZER.deserialize(
								new FrequencyEncodingPreprocessor.Builder(), parser, mapper, parser.next());
						break;
					}
					case ONE_HOT_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = OneHotEncodingPreprocessor.$BUILDER_DESERIALIZER
								.deserialize(new OneHotEncodingPreprocessor.Builder(), parser, mapper, parser.next());
						break;
					}
					case TARGET_MEAN_ENCODING : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TargetMeanEncodingPreprocessor.$BUILDER_DESERIALIZER.deserialize(
								new TargetMeanEncodingPreprocessor.Builder(), parser, mapper, parser.next());
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

	JsonpDeserializer<Preprocessor> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
