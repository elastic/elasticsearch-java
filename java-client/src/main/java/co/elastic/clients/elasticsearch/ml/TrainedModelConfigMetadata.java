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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelConfigMetadata
public final class TrainedModelConfigMetadata implements ToJsonp {
	@Nullable
	private final List<String> modelAliases;

	@Nullable
	private final Map<String, String> featureImportanceBaseline;

	@Nullable
	private final List<Hyperparameter> hyperparameters;

	@Nullable
	private final List<TotalFeatureImportance> totalFeatureImportance;

	// ---------------------------------------------------------------------------------------------

	protected TrainedModelConfigMetadata(Builder builder) {

		this.modelAliases = builder.modelAliases;
		this.featureImportanceBaseline = builder.featureImportanceBaseline;
		this.hyperparameters = builder.hyperparameters;
		this.totalFeatureImportance = builder.totalFeatureImportance;

	}

	/**
	 * API name: {@code model_aliases}
	 */
	@Nullable
	public List<String> modelAliases() {
		return this.modelAliases;
	}

	/**
	 * An object that contains the baseline for feature importance values. For
	 * regression analysis, it is a single value. For classification analysis, there
	 * is a value for each class.
	 * <p>
	 * API name: {@code feature_importance_baseline}
	 */
	@Nullable
	public Map<String, String> featureImportanceBaseline() {
		return this.featureImportanceBaseline;
	}

	/**
	 * List of the available hyperparameters optimized during the
	 * fine_parameter_tuning phase as well as specified by the user.
	 * <p>
	 * API name: {@code hyperparameters}
	 */
	@Nullable
	public List<Hyperparameter> hyperparameters() {
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
	@Nullable
	public List<TotalFeatureImportance> totalFeatureImportance() {
		return this.totalFeatureImportance;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.modelAliases != null) {

			generator.writeKey("model_aliases");
			generator.writeStartArray();
			for (String item0 : this.modelAliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.featureImportanceBaseline != null) {

			generator.writeKey("feature_importance_baseline");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.featureImportanceBaseline.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.hyperparameters != null) {

			generator.writeKey("hyperparameters");
			generator.writeStartArray();
			for (Hyperparameter item0 : this.hyperparameters) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.totalFeatureImportance != null) {

			generator.writeKey("total_feature_importance");
			generator.writeStartArray();
			for (TotalFeatureImportance item0 : this.totalFeatureImportance) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelConfigMetadata}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelConfigMetadata> {
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
		public Builder modelAliases(@Nullable List<String> value) {
			this.modelAliases = value;
			return this;
		}

		/**
		 * API name: {@code model_aliases}
		 */
		public Builder modelAliases(String... value) {
			this.modelAliases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #modelAliases(List)}, creating the list if needed.
		 */
		public Builder addModelAliases(String value) {
			if (this.modelAliases == null) {
				this.modelAliases = new ArrayList<>();
			}
			this.modelAliases.add(value);
			return this;
		}

		/**
		 * An object that contains the baseline for feature importance values. For
		 * regression analysis, it is a single value. For classification analysis, there
		 * is a value for each class.
		 * <p>
		 * API name: {@code feature_importance_baseline}
		 */
		public Builder featureImportanceBaseline(@Nullable Map<String, String> value) {
			this.featureImportanceBaseline = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #featureImportanceBaseline(Map)}, creating the map
		 * if needed.
		 */
		public Builder putFeatureImportanceBaseline(String key, String value) {
			if (this.featureImportanceBaseline == null) {
				this.featureImportanceBaseline = new HashMap<>();
			}
			this.featureImportanceBaseline.put(key, value);
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 */
		public Builder hyperparameters(@Nullable List<Hyperparameter> value) {
			this.hyperparameters = value;
			return this;
		}

		/**
		 * List of the available hyperparameters optimized during the
		 * fine_parameter_tuning phase as well as specified by the user.
		 * <p>
		 * API name: {@code hyperparameters}
		 */
		public Builder hyperparameters(Hyperparameter... value) {
			this.hyperparameters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hyperparameters(List)}, creating the list if needed.
		 */
		public Builder addHyperparameters(Hyperparameter value) {
			if (this.hyperparameters == null) {
				this.hyperparameters = new ArrayList<>();
			}
			this.hyperparameters.add(value);
			return this;
		}

		/**
		 * Set {@link #hyperparameters(List)} to a singleton list.
		 */
		public Builder hyperparameters(Function<Hyperparameter.Builder, ObjectBuilder<Hyperparameter>> fn) {
			return this.hyperparameters(fn.apply(new Hyperparameter.Builder()).build());
		}

		/**
		 * Add a value to {@link #hyperparameters(List)}, creating the list if needed.
		 */
		public Builder addHyperparameters(Function<Hyperparameter.Builder, ObjectBuilder<Hyperparameter>> fn) {
			return this.addHyperparameters(fn.apply(new Hyperparameter.Builder()).build());
		}

		/**
		 * An array of the total feature importance for each feature used from the
		 * training data set. This array of objects is returned if data frame analytics
		 * trained the model and the request includes total_feature_importance in the
		 * include request parameter.
		 * <p>
		 * API name: {@code total_feature_importance}
		 */
		public Builder totalFeatureImportance(@Nullable List<TotalFeatureImportance> value) {
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
		public Builder totalFeatureImportance(TotalFeatureImportance... value) {
			this.totalFeatureImportance = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #totalFeatureImportance(List)}, creating the list if
		 * needed.
		 */
		public Builder addTotalFeatureImportance(TotalFeatureImportance value) {
			if (this.totalFeatureImportance == null) {
				this.totalFeatureImportance = new ArrayList<>();
			}
			this.totalFeatureImportance.add(value);
			return this;
		}

		/**
		 * Set {@link #totalFeatureImportance(List)} to a singleton list.
		 */
		public Builder totalFeatureImportance(
				Function<TotalFeatureImportance.Builder, ObjectBuilder<TotalFeatureImportance>> fn) {
			return this.totalFeatureImportance(fn.apply(new TotalFeatureImportance.Builder()).build());
		}

		/**
		 * Add a value to {@link #totalFeatureImportance(List)}, creating the list if
		 * needed.
		 */
		public Builder addTotalFeatureImportance(
				Function<TotalFeatureImportance.Builder, ObjectBuilder<TotalFeatureImportance>> fn) {
			return this.addTotalFeatureImportance(fn.apply(new TotalFeatureImportance.Builder()).build());
		}

		/**
		 * Builds a {@link TrainedModelConfigMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelConfigMetadata build() {

			return new TrainedModelConfigMetadata(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TrainedModelConfigMetadata
	 */
	public static final JsonpDeserializer<TrainedModelConfigMetadata> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TrainedModelConfigMetadata::setupTrainedModelConfigMetadataDeserializer);

	protected static void setupTrainedModelConfigMetadataDeserializer(
			DelegatingDeserializer<TrainedModelConfigMetadata.Builder> op) {

		op.add(Builder::modelAliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"model_aliases");
		op.add(Builder::featureImportanceBaseline,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_importance_baseline");
		op.add(Builder::hyperparameters, JsonpDeserializer.arrayDeserializer(Hyperparameter.DESERIALIZER),
				"hyperparameters");
		op.add(Builder::totalFeatureImportance,
				JsonpDeserializer.arrayDeserializer(TotalFeatureImportance.DESERIALIZER), "total_feature_importance");

	}

}
