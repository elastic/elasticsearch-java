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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonData;
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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: ml._types.LearningToRankConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.LearningToRankConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class LearningToRankConfig implements InferenceConfigCreateVariant, JsonpSerializable {
	private final Map<String, JsonData> defaultParams;

	private final List<Map<String, QueryFeatureExtractor>> featureExtractors;

	private final int numTopFeatureImportanceValues;

	// ---------------------------------------------------------------------------------------------

	private LearningToRankConfig(Builder builder) {

		this.defaultParams = ApiTypeHelper.unmodifiable(builder.defaultParams);
		this.featureExtractors = ApiTypeHelper.unmodifiable(builder.featureExtractors);
		this.numTopFeatureImportanceValues = ApiTypeHelper.requireNonNull(builder.numTopFeatureImportanceValues, this,
				"numTopFeatureImportanceValues", 0);

	}

	public static LearningToRankConfig of(Function<Builder, ObjectBuilder<LearningToRankConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.LearningToRank;
	}

	/**
	 * API name: {@code default_params}
	 */
	public final Map<String, JsonData> defaultParams() {
		return this.defaultParams;
	}

	/**
	 * API name: {@code feature_extractors}
	 */
	public final List<Map<String, QueryFeatureExtractor>> featureExtractors() {
		return this.featureExtractors;
	}

	/**
	 * Required - API name: {@code num_top_feature_importance_values}
	 */
	public final int numTopFeatureImportanceValues() {
		return this.numTopFeatureImportanceValues;
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

		if (ApiTypeHelper.isDefined(this.defaultParams)) {
			generator.writeKey("default_params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.defaultParams.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.featureExtractors)) {
			generator.writeKey("feature_extractors");
			generator.writeStartArray();
			for (Map<String, QueryFeatureExtractor> item0 : this.featureExtractors) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, QueryFeatureExtractor> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("num_top_feature_importance_values");
		generator.write(this.numTopFeatureImportanceValues);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LearningToRankConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LearningToRankConfig> {
		@Nullable
		private Map<String, JsonData> defaultParams;

		@Nullable
		private List<Map<String, QueryFeatureExtractor>> featureExtractors;

		private Integer numTopFeatureImportanceValues;

		/**
		 * API name: {@code default_params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>defaultParams</code>.
		 */
		public final Builder defaultParams(Map<String, JsonData> map) {
			this.defaultParams = _mapPutAll(this.defaultParams, map);
			return this;
		}

		/**
		 * API name: {@code default_params}
		 * <p>
		 * Adds an entry to <code>defaultParams</code>.
		 */
		public final Builder defaultParams(String key, JsonData value) {
			this.defaultParams = _mapPut(this.defaultParams, key, value);
			return this;
		}

		/**
		 * API name: {@code feature_extractors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureExtractors</code>.
		 */
		public final Builder featureExtractors(List<Map<String, QueryFeatureExtractor>> list) {
			this.featureExtractors = _listAddAll(this.featureExtractors, list);
			return this;
		}

		/**
		 * API name: {@code feature_extractors}
		 * <p>
		 * Adds one or more values to <code>featureExtractors</code>.
		 */
		public final Builder featureExtractors(Map<String, QueryFeatureExtractor> value,
				Map<String, QueryFeatureExtractor>... values) {
			this.featureExtractors = _listAdd(this.featureExtractors, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code num_top_feature_importance_values}
		 */
		public final Builder numTopFeatureImportanceValues(int value) {
			this.numTopFeatureImportanceValues = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LearningToRankConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LearningToRankConfig build() {
			_checkSingleUse();

			return new LearningToRankConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LearningToRankConfig}
	 */
	public static final JsonpDeserializer<LearningToRankConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LearningToRankConfig::setupLearningToRankConfigDeserializer);

	protected static void setupLearningToRankConfigDeserializer(ObjectDeserializer<LearningToRankConfig.Builder> op) {

		op.add(Builder::defaultParams, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"default_params");
		op.add(Builder::featureExtractors,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(QueryFeatureExtractor._DESERIALIZER)),
				"feature_extractors");
		op.add(Builder::numTopFeatureImportanceValues, JsonpDeserializer.integerDeserializer(),
				"num_top_feature_importance_values");

	}

}
