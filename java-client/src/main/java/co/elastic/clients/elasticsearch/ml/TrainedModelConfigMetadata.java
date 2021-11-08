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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelConfigMetadata
@JsonpDeserializable
public class TrainedModelConfigMetadata implements JsonpSerializable {
	private final List<String> modelAliases;

	private final Map<String, String> featureImportanceBaseline;

	private final List<Hyperparameter> hyperparameters;

	private final List<TotalFeatureImportance> totalFeatureImportance;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelConfigMetadata(Builder builder) {

		this.modelAliases = ModelTypeHelper.unmodifiable(builder.modelAliases);
		this.featureImportanceBaseline = ModelTypeHelper.unmodifiable(builder.featureImportanceBaseline);
		this.hyperparameters = ModelTypeHelper.unmodifiable(builder.hyperparameters);
		this.totalFeatureImportance = ModelTypeHelper.unmodifiable(builder.totalFeatureImportance);

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

		if (ModelTypeHelper.isDefined(this.modelAliases)) {
			generator.writeKey("model_aliases");
			generator.writeStartArray();
			for (String item0 : this.modelAliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.featureImportanceBaseline)) {
			generator.writeKey("feature_importance_baseline");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.featureImportanceBaseline.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.hyperparameters)) {
			generator.writeKey("hyperparameters");
			generator.writeStartArray();
			for (Hyperparameter item0 : this.hyperparameters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.totalFeatureImportance)) {
			generator.writeKey("total_feature_importance");
			generator.writeStartArray();
			for (TotalFeatureImportance item0 : this.totalFeatureImportance) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelConfigMetadata}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TrainedModelConfigMetadata> {
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
		 */
		public final Builder modelAliases(@Nullable List<String> value) {
			this.modelAliases = value;
			return this;
		}

		/**
		 * API name: {@code model_aliases}
		 */
		public final Builder modelAliases(String... value) {
			this.modelAliases = Arrays.asList(value);
			return this;
		}

		/**
		 * An object that contains the baseline for feature importance values. For
		 * regression analysis, it is a single value. For classification analysis, there
		 * is a value for each class.
		 * <p>
		 * API name: {@code feature_importance_baseline}
		 */
		public final Builder featureImportanceBaseline(@Nullable Map<String, String> value) {
			this.featureImportanceBaseline = value;
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 */
		public final Builder hyperparameters(@Nullable List<Hyperparameter> value) {
			this.hyperparameters = value;
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 */
		public final Builder hyperparameters(Hyperparameter... value) {
			this.hyperparameters = Arrays.asList(value);
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 */
		@SafeVarargs
		public final Builder hyperparameters(Function<Hyperparameter.Builder, ObjectBuilder<Hyperparameter>>... fns) {
			this.hyperparameters = new ArrayList<>(fns.length);
			for (Function<Hyperparameter.Builder, ObjectBuilder<Hyperparameter>> fn : fns) {
				this.hyperparameters.add(fn.apply(new Hyperparameter.Builder()).build());
			}
			return this;
		}

		/**
		 * An array of the total feature importance for each feature used from the
		 * training data set. This array of objects is returned if data frame analytics
		 * trained the model and the request includes total_feature_importance in the
		 * include request parameter.
		 * <p>
		 * API name: {@code total_feature_importance}
		 */
		public final Builder totalFeatureImportance(@Nullable List<TotalFeatureImportance> value) {
			this.totalFeatureImportance = value;
			return this;
		}

		/**
		 * An array of the total feature importance for each feature used from the
		 * training data set. This array of objects is returned if data frame analytics
		 * trained the model and the request includes total_feature_importance in the
		 * include request parameter.
		 * <p>
		 * API name: {@code total_feature_importance}
		 */
		public final Builder totalFeatureImportance(TotalFeatureImportance... value) {
			this.totalFeatureImportance = Arrays.asList(value);
			return this;
		}

		/**
		 * An array of the total feature importance for each feature used from the
		 * training data set. This array of objects is returned if data frame analytics
		 * trained the model and the request includes total_feature_importance in the
		 * include request parameter.
		 * <p>
		 * API name: {@code total_feature_importance}
		 */
		@SafeVarargs
		public final Builder totalFeatureImportance(
				Function<TotalFeatureImportance.Builder, ObjectBuilder<TotalFeatureImportance>>... fns) {
			this.totalFeatureImportance = new ArrayList<>(fns.length);
			for (Function<TotalFeatureImportance.Builder, ObjectBuilder<TotalFeatureImportance>> fn : fns) {
				this.totalFeatureImportance.add(fn.apply(new TotalFeatureImportance.Builder()).build());
			}
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
	public static final JsonpDeserializer<TrainedModelConfigMetadata> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, TrainedModelConfigMetadata::setupTrainedModelConfigMetadataDeserializer, Builder::build);

	protected static void setupTrainedModelConfigMetadataDeserializer(
			DelegatingDeserializer<TrainedModelConfigMetadata.Builder> op) {

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
