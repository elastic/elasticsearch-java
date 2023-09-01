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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelConfigMetadata

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelConfigMetadata">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelConfigMetadata implements JsonpSerializable {
	private final List<String> modelAliases;

	private final Map<String, String> featureImportanceBaseline;

	private final List<Hyperparameter> hyperparameters;

	private final List<TotalFeatureImportance> totalFeatureImportance;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelConfigMetadata(Builder builder) {

		this.modelAliases = ApiTypeHelper.unmodifiable(builder.modelAliases);
		this.featureImportanceBaseline = ApiTypeHelper.unmodifiable(builder.featureImportanceBaseline);
		this.hyperparameters = ApiTypeHelper.unmodifiable(builder.hyperparameters);
		this.totalFeatureImportance = ApiTypeHelper.unmodifiable(builder.totalFeatureImportance);

	}

	public static TrainedModelConfigMetadata of(Function<Builder, ObjectBuilder<TrainedModelConfigMetadata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code model_aliases}
	 */
	public final List<String> modelAliases() {
		return this.modelAliases;
	}

	/**
	 * An object that contains the baseline for feature importance values. For
	 * regression analysis, it is a single value. For classification analysis, there
	 * is a value for each class.
	 * <p>
	 * API name: {@code feature_importance_baseline}
	 */
	public final Map<String, String> featureImportanceBaseline() {
		return this.featureImportanceBaseline;
	}

	/**
	 * List of the available hyperparameters optimized during the
	 * fine_parameter_tuning phase as well as specified by the user.
	 * <p>
	 * API name: {@code hyperparameters}
	 */
	public final List<Hyperparameter> hyperparameters() {
		return this.hyperparameters;
	}

	/**
	 * An array of the total feature importance for each feature used from the
	 * training data set. This array of objects is returned if data frame analytics
	 * trained the model and the request includes total_feature_importance in the
	 * include request parameter.
	 * <p>
	 * API name: {@code total_feature_importance}
	 */
	public final List<TotalFeatureImportance> totalFeatureImportance() {
		return this.totalFeatureImportance;
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

		if (ApiTypeHelper.isDefined(this.modelAliases)) {
			generator.writeKey("model_aliases");
			generator.writeStartArray();
			for (String item0 : this.modelAliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.featureImportanceBaseline)) {
			generator.writeKey("feature_importance_baseline");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.featureImportanceBaseline.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.hyperparameters)) {
			generator.writeKey("hyperparameters");
			generator.writeStartArray();
			for (Hyperparameter item0 : this.hyperparameters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.totalFeatureImportance)) {
			generator.writeKey("total_feature_importance");
			generator.writeStartArray();
			for (TotalFeatureImportance item0 : this.totalFeatureImportance) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelConfigMetadata}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelConfigMetadata> {
		@Nullable
		private List<String> modelAliases;

		@Nullable
		private Map<String, String> featureImportanceBaseline;

		@Nullable
		private List<Hyperparameter> hyperparameters;

		@Nullable
		private List<TotalFeatureImportance> totalFeatureImportance;

		/**
		 * API name: {@code model_aliases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>modelAliases</code>.
		 */
		public final Builder modelAliases(List<String> list) {
			this.modelAliases = _listAddAll(this.modelAliases, list);
			return this;
		}

		/**
		 * API name: {@code model_aliases}
		 * <p>
		 * Adds one or more values to <code>modelAliases</code>.
		 */
		public final Builder modelAliases(String value, String... values) {
			this.modelAliases = _listAdd(this.modelAliases, value, values);
			return this;
		}

		/**
		 * An object that contains the baseline for feature importance values. For
		 * regression analysis, it is a single value. For classification analysis, there
		 * is a value for each class.
		 * <p>
		 * API name: {@code feature_importance_baseline}
		 * <p>
		 * Adds all entries of <code>map</code> to
		 * <code>featureImportanceBaseline</code>.
		 */
		public final Builder featureImportanceBaseline(Map<String, String> map) {
			this.featureImportanceBaseline = _mapPutAll(this.featureImportanceBaseline, map);
			return this;
		}

		/**
		 * An object that contains the baseline for feature importance values. For
		 * regression analysis, it is a single value. For classification analysis, there
		 * is a value for each class.
		 * <p>
		 * API name: {@code feature_importance_baseline}
		 * <p>
		 * Adds an entry to <code>featureImportanceBaseline</code>.
		 */
		public final Builder featureImportanceBaseline(String key, String value) {
			this.featureImportanceBaseline = _mapPut(this.featureImportanceBaseline, key, value);
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>hyperparameters</code>.
		 */
		public final Builder hyperparameters(List<Hyperparameter> list) {
			this.hyperparameters = _listAddAll(this.hyperparameters, list);
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 * <p>
		 * Adds one or more values to <code>hyperparameters</code>.
		 */
		public final Builder hyperparameters(Hyperparameter value, Hyperparameter... values) {
			this.hyperparameters = _listAdd(this.hyperparameters, value, values);
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 * <p>
		 * Adds a value to <code>hyperparameters</code> using a builder lambda.
		 */
		public final Builder hyperparameters(Function<Hyperparameter.Builder, ObjectBuilder<Hyperparameter>> fn) {
			return hyperparameters(fn.apply(new Hyperparameter.Builder()).build());
		}

		/**
		 * An array of the total feature importance for each feature used from the
		 * training data set. This array of objects is returned if data frame analytics
		 * trained the model and the request includes total_feature_importance in the
		 * include request parameter.
		 * <p>
		 * API name: {@code total_feature_importance}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>totalFeatureImportance</code>.
		 */
		public final Builder totalFeatureImportance(List<TotalFeatureImportance> list) {
			this.totalFeatureImportance = _listAddAll(this.totalFeatureImportance, list);
			return this;
		}

		/**
		 * An array of the total feature importance for each feature used from the
		 * training data set. This array of objects is returned if data frame analytics
		 * trained the model and the request includes total_feature_importance in the
		 * include request parameter.
		 * <p>
		 * API name: {@code total_feature_importance}
		 * <p>
		 * Adds one or more values to <code>totalFeatureImportance</code>.
		 */
		public final Builder totalFeatureImportance(TotalFeatureImportance value, TotalFeatureImportance... values) {
			this.totalFeatureImportance = _listAdd(this.totalFeatureImportance, value, values);
			return this;
		}

		/**
		 * An array of the total feature importance for each feature used from the
		 * training data set. This array of objects is returned if data frame analytics
		 * trained the model and the request includes total_feature_importance in the
		 * include request parameter.
		 * <p>
		 * API name: {@code total_feature_importance}
		 * <p>
		 * Adds a value to <code>totalFeatureImportance</code> using a builder lambda.
		 */
		public final Builder totalFeatureImportance(
				Function<TotalFeatureImportance.Builder, ObjectBuilder<TotalFeatureImportance>> fn) {
			return totalFeatureImportance(fn.apply(new TotalFeatureImportance.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelConfigMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelConfigMetadata build() {
			_checkSingleUse();

			return new TrainedModelConfigMetadata(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelConfigMetadata}
	 */
	public static final JsonpDeserializer<TrainedModelConfigMetadata> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelConfigMetadata::setupTrainedModelConfigMetadataDeserializer);

	protected static void setupTrainedModelConfigMetadataDeserializer(
			ObjectDeserializer<TrainedModelConfigMetadata.Builder> op) {

		op.add(Builder::modelAliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"model_aliases");
		op.add(Builder::featureImportanceBaseline,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_importance_baseline");
		op.add(Builder::hyperparameters, JsonpDeserializer.arrayDeserializer(Hyperparameter._DESERIALIZER),
				"hyperparameters");
		op.add(Builder::totalFeatureImportance,
				JsonpDeserializer.arrayDeserializer(TotalFeatureImportance._DESERIALIZER), "total_feature_importance");

	}

}
