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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _global.search._types.LearningToRankRescoreProfileBreakdown

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.LearningToRankRescoreProfileBreakdown">API
 *      specification</a>
 */
@JsonpDeserializable
public class LearningToRankRescoreProfileBreakdown implements JsonpSerializable {
	private final long buildFeatureExtractors;

	private final long buildFeatureExtractorsCount;

	private final long featureExtraction;

	private final long featureExtractionCount;

	private final long inference;

	private final long inferenceCount;

	// ---------------------------------------------------------------------------------------------

	private LearningToRankRescoreProfileBreakdown(Builder builder) {

		this.buildFeatureExtractors = ApiTypeHelper.requireNonNull(builder.buildFeatureExtractors, this,
				"buildFeatureExtractors", 0);
		this.buildFeatureExtractorsCount = ApiTypeHelper.requireNonNull(builder.buildFeatureExtractorsCount, this,
				"buildFeatureExtractorsCount", 0);
		this.featureExtraction = ApiTypeHelper.requireNonNull(builder.featureExtraction, this, "featureExtraction", 0);
		this.featureExtractionCount = ApiTypeHelper.requireNonNull(builder.featureExtractionCount, this,
				"featureExtractionCount", 0);
		this.inference = ApiTypeHelper.requireNonNull(builder.inference, this, "inference", 0);
		this.inferenceCount = ApiTypeHelper.requireNonNull(builder.inferenceCount, this, "inferenceCount", 0);

	}

	public static LearningToRankRescoreProfileBreakdown of(
			Function<Builder, ObjectBuilder<LearningToRankRescoreProfileBreakdown>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The time spent turning the feature queries of the model into
	 * queries that can score documents.
	 * <p>
	 * API name: {@code build_feature_extractors}
	 */
	public final long buildFeatureExtractors() {
		return this.buildFeatureExtractors;
	}

	/**
	 * Required - API name: {@code build_feature_extractors_count}
	 */
	public final long buildFeatureExtractorsCount() {
		return this.buildFeatureExtractorsCount;
	}

	/**
	 * Required - The time spent extracting the features of the top documents.
	 * <p>
	 * API name: {@code feature_extraction}
	 */
	public final long featureExtraction() {
		return this.featureExtraction;
	}

	/**
	 * Required - API name: {@code feature_extraction_count}
	 */
	public final long featureExtractionCount() {
		return this.featureExtractionCount;
	}

	/**
	 * Required - The time spent running the model on the extracted features.
	 * <p>
	 * API name: {@code inference}
	 */
	public final long inference() {
		return this.inference;
	}

	/**
	 * Required - API name: {@code inference_count}
	 */
	public final long inferenceCount() {
		return this.inferenceCount;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("build_feature_extractors");
		generator.write(this.buildFeatureExtractors);

		generator.writeKey("build_feature_extractors_count");
		generator.write(this.buildFeatureExtractorsCount);

		generator.writeKey("feature_extraction");
		generator.write(this.featureExtraction);

		generator.writeKey("feature_extraction_count");
		generator.write(this.featureExtractionCount);

		generator.writeKey("inference");
		generator.write(this.inference);

		generator.writeKey("inference_count");
		generator.write(this.inferenceCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LearningToRankRescoreProfileBreakdown}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LearningToRankRescoreProfileBreakdown> {
		private Long buildFeatureExtractors;

		private Long buildFeatureExtractorsCount;

		private Long featureExtraction;

		private Long featureExtractionCount;

		private Long inference;

		private Long inferenceCount;

		public Builder() {
		}
		private Builder(LearningToRankRescoreProfileBreakdown instance) {
			this.buildFeatureExtractors = instance.buildFeatureExtractors;
			this.buildFeatureExtractorsCount = instance.buildFeatureExtractorsCount;
			this.featureExtraction = instance.featureExtraction;
			this.featureExtractionCount = instance.featureExtractionCount;
			this.inference = instance.inference;
			this.inferenceCount = instance.inferenceCount;

		}
		/**
		 * Required - The time spent turning the feature queries of the model into
		 * queries that can score documents.
		 * <p>
		 * API name: {@code build_feature_extractors}
		 */
		public final Builder buildFeatureExtractors(long value) {
			this.buildFeatureExtractors = value;
			return this;
		}

		/**
		 * Required - API name: {@code build_feature_extractors_count}
		 */
		public final Builder buildFeatureExtractorsCount(long value) {
			this.buildFeatureExtractorsCount = value;
			return this;
		}

		/**
		 * Required - The time spent extracting the features of the top documents.
		 * <p>
		 * API name: {@code feature_extraction}
		 */
		public final Builder featureExtraction(long value) {
			this.featureExtraction = value;
			return this;
		}

		/**
		 * Required - API name: {@code feature_extraction_count}
		 */
		public final Builder featureExtractionCount(long value) {
			this.featureExtractionCount = value;
			return this;
		}

		/**
		 * Required - The time spent running the model on the extracted features.
		 * <p>
		 * API name: {@code inference}
		 */
		public final Builder inference(long value) {
			this.inference = value;
			return this;
		}

		/**
		 * Required - API name: {@code inference_count}
		 */
		public final Builder inferenceCount(long value) {
			this.inferenceCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LearningToRankRescoreProfileBreakdown}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LearningToRankRescoreProfileBreakdown build() {
			_checkSingleUse();

			return new LearningToRankRescoreProfileBreakdown(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LearningToRankRescoreProfileBreakdown}
	 */
	public static final JsonpDeserializer<LearningToRankRescoreProfileBreakdown> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					LearningToRankRescoreProfileBreakdown::setupLearningToRankRescoreProfileBreakdownDeserializer);

	protected static void setupLearningToRankRescoreProfileBreakdownDeserializer(
			ObjectDeserializer<LearningToRankRescoreProfileBreakdown.Builder> op) {

		op.add(Builder::buildFeatureExtractors, JsonpDeserializer.longDeserializer(), "build_feature_extractors");
		op.add(Builder::buildFeatureExtractorsCount, JsonpDeserializer.longDeserializer(),
				"build_feature_extractors_count");
		op.add(Builder::featureExtraction, JsonpDeserializer.longDeserializer(), "feature_extraction");
		op.add(Builder::featureExtractionCount, JsonpDeserializer.longDeserializer(), "feature_extraction_count");
		op.add(Builder::inference, JsonpDeserializer.longDeserializer(), "inference");
		op.add(Builder::inferenceCount, JsonpDeserializer.longDeserializer(), "inference_count");

	}

}
