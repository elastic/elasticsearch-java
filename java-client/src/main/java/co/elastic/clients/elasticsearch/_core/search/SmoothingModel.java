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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SmoothingModelContainer
public interface SmoothingModel extends JsonpSerializable {

	String LAPLACE = "laplace";
	String LINEAR_INTERPOLATION = "linear_interpolation";
	String STUPID_BACKOFF = "stupid_backoff";

	/**
	 * The type of this {@code SmoothingModelContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code laplace}
		 */
		public ObjectBuilder<SmoothingModel> laplace(LaplaceSmoothingModel value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code laplace}
		 */
		public ObjectBuilder<SmoothingModel> laplace(
				Function<LaplaceSmoothingModel.Builder, ObjectBuilder<LaplaceSmoothingModel>> fn) {
			return this.laplace(fn.apply(new LaplaceSmoothingModel.Builder()).build());
		}

		/**
		 * API name: {@code linear_interpolation}
		 */
		public ObjectBuilder<SmoothingModel> linearInterpolation(LinearInterpolationSmoothingModel value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code linear_interpolation}
		 */
		public ObjectBuilder<SmoothingModel> linearInterpolation(
				Function<LinearInterpolationSmoothingModel.Builder, ObjectBuilder<LinearInterpolationSmoothingModel>> fn) {
			return this.linearInterpolation(fn.apply(new LinearInterpolationSmoothingModel.Builder()).build());
		}

		/**
		 * API name: {@code stupid_backoff}
		 */
		public ObjectBuilder<SmoothingModel> stupidBackoff(StupidBackoffSmoothingModel value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code stupid_backoff}
		 */
		public ObjectBuilder<SmoothingModel> stupidBackoff(
				Function<StupidBackoffSmoothingModel.Builder, ObjectBuilder<StupidBackoffSmoothingModel>> fn) {
			return this.stupidBackoff(fn.apply(new StupidBackoffSmoothingModel.Builder()).build());
		}

	}

	class $Helper {
		private static SmoothingModel deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends SmoothingModel> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case LAPLACE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = LaplaceSmoothingModel.$BUILDER_DESERIALIZER
								.deserialize(new LaplaceSmoothingModel.Builder(), parser, mapper, parser.next());
						break;
					}
					case LINEAR_INTERPOLATION : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = LinearInterpolationSmoothingModel.$BUILDER_DESERIALIZER.deserialize(
								new LinearInterpolationSmoothingModel.Builder(), parser, mapper, parser.next());
						break;
					}
					case STUPID_BACKOFF : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = StupidBackoffSmoothingModel.$BUILDER_DESERIALIZER
								.deserialize(new StupidBackoffSmoothingModel.Builder(), parser, mapper, parser.next());
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

	JsonpDeserializer<SmoothingModel> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
