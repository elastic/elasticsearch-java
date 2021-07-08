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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysis
public abstract class DataframeAnalysis implements ToJsonp {
	private final String dependentVariable;

	@Nullable
	private final String predictionFieldName;

	@Nullable
	private final Number alpha;

	@Nullable
	private final Number lambda;

	@Nullable
	private final Number gamma;

	@Nullable
	private final Number eta;

	@Nullable
	private final Number etaGrowthRatePerTree;

	@Nullable
	private final Number featureBagFraction;

	@Nullable
	private final Number maxTrees;

	@Nullable
	private final Number softTreeDepthLimit;

	@Nullable
	private final Number softTreeDepthTolerance;

	@Nullable
	private final Number downsampleFactor;

	@Nullable
	private final Number maxOptimizationRoundsPerHyperparameter;

	@Nullable
	private final Boolean earlyStoppingEnabled;

	@Nullable
	private final Number numTopFeatureImportanceValues;

	@Nullable
	private final List<DataframeAnalysisFeatureProcessor> featureProcessors;

	@Nullable
	private final Number randomizeSeed;

	@Nullable
	private final JsonValue trainingPercent;

	// ---------------------------------------------------------------------------------------------

	protected DataframeAnalysis(AbstractBuilder<?> builder) {

		this.dependentVariable = Objects.requireNonNull(builder.dependentVariable, "dependent_variable");
		this.predictionFieldName = builder.predictionFieldName;
		this.alpha = builder.alpha;
		this.lambda = builder.lambda;
		this.gamma = builder.gamma;
		this.eta = builder.eta;
		this.etaGrowthRatePerTree = builder.etaGrowthRatePerTree;
		this.featureBagFraction = builder.featureBagFraction;
		this.maxTrees = builder.maxTrees;
		this.softTreeDepthLimit = builder.softTreeDepthLimit;
		this.softTreeDepthTolerance = builder.softTreeDepthTolerance;
		this.downsampleFactor = builder.downsampleFactor;
		this.maxOptimizationRoundsPerHyperparameter = builder.maxOptimizationRoundsPerHyperparameter;
		this.earlyStoppingEnabled = builder.earlyStoppingEnabled;
		this.numTopFeatureImportanceValues = builder.numTopFeatureImportanceValues;
		this.featureProcessors = builder.featureProcessors;
		this.randomizeSeed = builder.randomizeSeed;
		this.trainingPercent = builder.trainingPercent;

	}

	/**
	 * API name: {@code dependent_variable}
	 */
	public String dependentVariable() {
		return this.dependentVariable;
	}

	/**
	 * API name: {@code prediction_field_name}
	 */
	@Nullable
	public String predictionFieldName() {
		return this.predictionFieldName;
	}

	/**
	 * API name: {@code alpha}
	 */
	@Nullable
	public Number alpha() {
		return this.alpha;
	}

	/**
	 * API name: {@code lambda}
	 */
	@Nullable
	public Number lambda() {
		return this.lambda;
	}

	/**
	 * API name: {@code gamma}
	 */
	@Nullable
	public Number gamma() {
		return this.gamma;
	}

	/**
	 * API name: {@code eta}
	 */
	@Nullable
	public Number eta() {
		return this.eta;
	}

	/**
	 * API name: {@code eta_growth_rate_per_tree}
	 */
	@Nullable
	public Number etaGrowthRatePerTree() {
		return this.etaGrowthRatePerTree;
	}

	/**
	 * API name: {@code feature_bag_fraction}
	 */
	@Nullable
	public Number featureBagFraction() {
		return this.featureBagFraction;
	}

	/**
	 * API name: {@code max_trees}
	 */
	@Nullable
	public Number maxTrees() {
		return this.maxTrees;
	}

	/**
	 * API name: {@code soft_tree_depth_limit}
	 */
	@Nullable
	public Number softTreeDepthLimit() {
		return this.softTreeDepthLimit;
	}

	/**
	 * API name: {@code soft_tree_depth_tolerance}
	 */
	@Nullable
	public Number softTreeDepthTolerance() {
		return this.softTreeDepthTolerance;
	}

	/**
	 * API name: {@code downsample_factor}
	 */
	@Nullable
	public Number downsampleFactor() {
		return this.downsampleFactor;
	}

	/**
	 * API name: {@code max_optimization_rounds_per_hyperparameter}
	 */
	@Nullable
	public Number maxOptimizationRoundsPerHyperparameter() {
		return this.maxOptimizationRoundsPerHyperparameter;
	}

	/**
	 * API name: {@code early_stopping_enabled}
	 */
	@Nullable
	public Boolean earlyStoppingEnabled() {
		return this.earlyStoppingEnabled;
	}

	/**
	 * API name: {@code num_top_feature_importance_values}
	 */
	@Nullable
	public Number numTopFeatureImportanceValues() {
		return this.numTopFeatureImportanceValues;
	}

	/**
	 * API name: {@code feature_processors}
	 */
	@Nullable
	public List<DataframeAnalysisFeatureProcessor> featureProcessors() {
		return this.featureProcessors;
	}

	/**
	 * API name: {@code randomize_seed}
	 */
	@Nullable
	public Number randomizeSeed() {
		return this.randomizeSeed;
	}

	/**
	 * API name: {@code training_percent}
	 */
	@Nullable
	public JsonValue trainingPercent() {
		return this.trainingPercent;
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

		generator.writeKey("dependent_variable");
		generator.write(this.dependentVariable);

		if (this.predictionFieldName != null) {

			generator.writeKey("prediction_field_name");
			generator.write(this.predictionFieldName);

		}
		if (this.alpha != null) {

			generator.writeKey("alpha");
			generator.write(this.alpha.doubleValue());

		}
		if (this.lambda != null) {

			generator.writeKey("lambda");
			generator.write(this.lambda.doubleValue());

		}
		if (this.gamma != null) {

			generator.writeKey("gamma");
			generator.write(this.gamma.doubleValue());

		}
		if (this.eta != null) {

			generator.writeKey("eta");
			generator.write(this.eta.doubleValue());

		}
		if (this.etaGrowthRatePerTree != null) {

			generator.writeKey("eta_growth_rate_per_tree");
			generator.write(this.etaGrowthRatePerTree.doubleValue());

		}
		if (this.featureBagFraction != null) {

			generator.writeKey("feature_bag_fraction");
			generator.write(this.featureBagFraction.doubleValue());

		}
		if (this.maxTrees != null) {

			generator.writeKey("max_trees");
			generator.write(this.maxTrees.doubleValue());

		}
		if (this.softTreeDepthLimit != null) {

			generator.writeKey("soft_tree_depth_limit");
			generator.write(this.softTreeDepthLimit.doubleValue());

		}
		if (this.softTreeDepthTolerance != null) {

			generator.writeKey("soft_tree_depth_tolerance");
			generator.write(this.softTreeDepthTolerance.doubleValue());

		}
		if (this.downsampleFactor != null) {

			generator.writeKey("downsample_factor");
			generator.write(this.downsampleFactor.doubleValue());

		}
		if (this.maxOptimizationRoundsPerHyperparameter != null) {

			generator.writeKey("max_optimization_rounds_per_hyperparameter");
			generator.write(this.maxOptimizationRoundsPerHyperparameter.doubleValue());

		}
		if (this.earlyStoppingEnabled != null) {

			generator.writeKey("early_stopping_enabled");
			generator.write(this.earlyStoppingEnabled);

		}
		if (this.numTopFeatureImportanceValues != null) {

			generator.writeKey("num_top_feature_importance_values");
			generator.write(this.numTopFeatureImportanceValues.doubleValue());

		}
		if (this.featureProcessors != null) {

			generator.writeKey("feature_processors");
			generator.writeStartArray();
			for (DataframeAnalysisFeatureProcessor item0 : this.featureProcessors) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.randomizeSeed != null) {

			generator.writeKey("randomize_seed");
			generator.write(this.randomizeSeed.doubleValue());

		}
		if (this.trainingPercent != null) {

			generator.writeKey("training_percent");
			generator.write(this.trainingPercent);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String dependentVariable;

		@Nullable
		private String predictionFieldName;

		@Nullable
		private Number alpha;

		@Nullable
		private Number lambda;

		@Nullable
		private Number gamma;

		@Nullable
		private Number eta;

		@Nullable
		private Number etaGrowthRatePerTree;

		@Nullable
		private Number featureBagFraction;

		@Nullable
		private Number maxTrees;

		@Nullable
		private Number softTreeDepthLimit;

		@Nullable
		private Number softTreeDepthTolerance;

		@Nullable
		private Number downsampleFactor;

		@Nullable
		private Number maxOptimizationRoundsPerHyperparameter;

		@Nullable
		private Boolean earlyStoppingEnabled;

		@Nullable
		private Number numTopFeatureImportanceValues;

		@Nullable
		private List<DataframeAnalysisFeatureProcessor> featureProcessors;

		@Nullable
		private Number randomizeSeed;

		@Nullable
		private JsonValue trainingPercent;

		/**
		 * API name: {@code dependent_variable}
		 */
		public BuilderT dependentVariable(String value) {
			this.dependentVariable = value;
			return self();
		}

		/**
		 * API name: {@code prediction_field_name}
		 */
		public BuilderT predictionFieldName(@Nullable String value) {
			this.predictionFieldName = value;
			return self();
		}

		/**
		 * API name: {@code alpha}
		 */
		public BuilderT alpha(@Nullable Number value) {
			this.alpha = value;
			return self();
		}

		/**
		 * API name: {@code lambda}
		 */
		public BuilderT lambda(@Nullable Number value) {
			this.lambda = value;
			return self();
		}

		/**
		 * API name: {@code gamma}
		 */
		public BuilderT gamma(@Nullable Number value) {
			this.gamma = value;
			return self();
		}

		/**
		 * API name: {@code eta}
		 */
		public BuilderT eta(@Nullable Number value) {
			this.eta = value;
			return self();
		}

		/**
		 * API name: {@code eta_growth_rate_per_tree}
		 */
		public BuilderT etaGrowthRatePerTree(@Nullable Number value) {
			this.etaGrowthRatePerTree = value;
			return self();
		}

		/**
		 * API name: {@code feature_bag_fraction}
		 */
		public BuilderT featureBagFraction(@Nullable Number value) {
			this.featureBagFraction = value;
			return self();
		}

		/**
		 * API name: {@code max_trees}
		 */
		public BuilderT maxTrees(@Nullable Number value) {
			this.maxTrees = value;
			return self();
		}

		/**
		 * API name: {@code soft_tree_depth_limit}
		 */
		public BuilderT softTreeDepthLimit(@Nullable Number value) {
			this.softTreeDepthLimit = value;
			return self();
		}

		/**
		 * API name: {@code soft_tree_depth_tolerance}
		 */
		public BuilderT softTreeDepthTolerance(@Nullable Number value) {
			this.softTreeDepthTolerance = value;
			return self();
		}

		/**
		 * API name: {@code downsample_factor}
		 */
		public BuilderT downsampleFactor(@Nullable Number value) {
			this.downsampleFactor = value;
			return self();
		}

		/**
		 * API name: {@code max_optimization_rounds_per_hyperparameter}
		 */
		public BuilderT maxOptimizationRoundsPerHyperparameter(@Nullable Number value) {
			this.maxOptimizationRoundsPerHyperparameter = value;
			return self();
		}

		/**
		 * API name: {@code early_stopping_enabled}
		 */
		public BuilderT earlyStoppingEnabled(@Nullable Boolean value) {
			this.earlyStoppingEnabled = value;
			return self();
		}

		/**
		 * API name: {@code num_top_feature_importance_values}
		 */
		public BuilderT numTopFeatureImportanceValues(@Nullable Number value) {
			this.numTopFeatureImportanceValues = value;
			return self();
		}

		/**
		 * API name: {@code feature_processors}
		 */
		public BuilderT featureProcessors(@Nullable List<DataframeAnalysisFeatureProcessor> value) {
			this.featureProcessors = value;
			return self();
		}

		/**
		 * API name: {@code feature_processors}
		 */
		public BuilderT featureProcessors(DataframeAnalysisFeatureProcessor... value) {
			this.featureProcessors = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #featureProcessors(List)}, creating the list if needed.
		 */
		public BuilderT addFeatureProcessors(DataframeAnalysisFeatureProcessor value) {
			if (this.featureProcessors == null) {
				this.featureProcessors = new ArrayList<>();
			}
			this.featureProcessors.add(value);
			return self();
		}

		/**
		 * Set {@link #featureProcessors(List)} to a singleton list.
		 */
		public BuilderT featureProcessors(
				Function<DataframeAnalysisFeatureProcessor.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessor>> fn) {
			return this.featureProcessors(fn.apply(new DataframeAnalysisFeatureProcessor.Builder()).build());
		}

		/**
		 * Add a value to {@link #featureProcessors(List)}, creating the list if needed.
		 */
		public BuilderT addFeatureProcessors(
				Function<DataframeAnalysisFeatureProcessor.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessor>> fn) {
			return this.addFeatureProcessors(fn.apply(new DataframeAnalysisFeatureProcessor.Builder()).build());
		}

		/**
		 * API name: {@code randomize_seed}
		 */
		public BuilderT randomizeSeed(@Nullable Number value) {
			this.randomizeSeed = value;
			return self();
		}

		/**
		 * API name: {@code training_percent}
		 */
		public BuilderT trainingPercent(@Nullable JsonValue value) {
			this.trainingPercent = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDataframeAnalysisDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::dependentVariable, JsonpDeserializer.stringDeserializer(), "dependent_variable");
		op.add(AbstractBuilder::predictionFieldName, JsonpDeserializer.stringDeserializer(), "prediction_field_name");
		op.add(AbstractBuilder::alpha, JsonpDeserializer.numberDeserializer(), "alpha");
		op.add(AbstractBuilder::lambda, JsonpDeserializer.numberDeserializer(), "lambda");
		op.add(AbstractBuilder::gamma, JsonpDeserializer.numberDeserializer(), "gamma");
		op.add(AbstractBuilder::eta, JsonpDeserializer.numberDeserializer(), "eta");
		op.add(AbstractBuilder::etaGrowthRatePerTree, JsonpDeserializer.numberDeserializer(),
				"eta_growth_rate_per_tree");
		op.add(AbstractBuilder::featureBagFraction, JsonpDeserializer.numberDeserializer(), "feature_bag_fraction");
		op.add(AbstractBuilder::maxTrees, JsonpDeserializer.numberDeserializer(), "max_trees", "maximum_number_trees");
		op.add(AbstractBuilder::softTreeDepthLimit, JsonpDeserializer.numberDeserializer(), "soft_tree_depth_limit");
		op.add(AbstractBuilder::softTreeDepthTolerance, JsonpDeserializer.numberDeserializer(),
				"soft_tree_depth_tolerance");
		op.add(AbstractBuilder::downsampleFactor, JsonpDeserializer.numberDeserializer(), "downsample_factor");
		op.add(AbstractBuilder::maxOptimizationRoundsPerHyperparameter, JsonpDeserializer.numberDeserializer(),
				"max_optimization_rounds_per_hyperparameter");
		op.add(AbstractBuilder::earlyStoppingEnabled, JsonpDeserializer.booleanDeserializer(),
				"early_stopping_enabled");
		op.add(AbstractBuilder::numTopFeatureImportanceValues, JsonpDeserializer.numberDeserializer(),
				"num_top_feature_importance_values");
		op.add(AbstractBuilder::featureProcessors,
				JsonpDeserializer.arrayDeserializer(DataframeAnalysisFeatureProcessor.DESERIALIZER),
				"feature_processors");
		op.add(AbstractBuilder::randomizeSeed, JsonpDeserializer.numberDeserializer(), "randomize_seed");
		op.add(AbstractBuilder::trainingPercent, JsonpDeserializer.jsonValueDeserializer(), "training_percent");

	}

}
