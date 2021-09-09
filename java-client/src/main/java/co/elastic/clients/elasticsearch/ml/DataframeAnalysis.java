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
	@Nullable
	private final Number alpha;

	private final String dependentVariable;

	@Nullable
	private final Number downsampleFactor;

	@Nullable
	private final Boolean earlyStoppingEnabled;

	@Nullable
	private final Number eta;

	@Nullable
	private final Number etaGrowthRatePerTree;

	@Nullable
	private final Number featureBagFraction;

	@Nullable
	private final List<DataframeAnalysisFeatureProcessor> featureProcessors;

	@Nullable
	private final Number gamma;

	@Nullable
	private final Number lambda;

	@Nullable
	private final Number maxOptimizationRoundsPerHyperparameter;

	@Nullable
	private final Number maxTrees;

	@Nullable
	private final Number numTopFeatureImportanceValues;

	@Nullable
	private final String predictionFieldName;

	@Nullable
	private final Number randomizeSeed;

	@Nullable
	private final Number softTreeDepthLimit;

	@Nullable
	private final Number softTreeDepthTolerance;

	@Nullable
	private final JsonValue trainingPercent;

	// ---------------------------------------------------------------------------------------------

	protected DataframeAnalysis(AbstractBuilder<?> builder) {

		this.alpha = builder.alpha;
		this.dependentVariable = Objects.requireNonNull(builder.dependentVariable, "dependent_variable");
		this.downsampleFactor = builder.downsampleFactor;
		this.earlyStoppingEnabled = builder.earlyStoppingEnabled;
		this.eta = builder.eta;
		this.etaGrowthRatePerTree = builder.etaGrowthRatePerTree;
		this.featureBagFraction = builder.featureBagFraction;
		this.featureProcessors = builder.featureProcessors;
		this.gamma = builder.gamma;
		this.lambda = builder.lambda;
		this.maxOptimizationRoundsPerHyperparameter = builder.maxOptimizationRoundsPerHyperparameter;
		this.maxTrees = builder.maxTrees;
		this.numTopFeatureImportanceValues = builder.numTopFeatureImportanceValues;
		this.predictionFieldName = builder.predictionFieldName;
		this.randomizeSeed = builder.randomizeSeed;
		this.softTreeDepthLimit = builder.softTreeDepthLimit;
		this.softTreeDepthTolerance = builder.softTreeDepthTolerance;
		this.trainingPercent = builder.trainingPercent;

	}

	/**
	 * Advanced configuration option. Machine learning uses loss guided tree
	 * growing, which means that the decision trees grow where the regularized loss
	 * decreases most quickly. This parameter affects loss calculations by acting as
	 * a multiplier of the tree depth. Higher alpha values result in shallower trees
	 * and faster training times. By default, this value is calculated during
	 * hyperparameter optimization. It must be greater than or equal to zero.
	 * <p>
	 * API name: {@code alpha}
	 */
	@Nullable
	public Number alpha() {
		return this.alpha;
	}

	/**
	 * Defines which field of the document is to be predicted. It must match one of
	 * the fields in the index being used to train. If this field is missing from a
	 * document, then that document will not be used for training, but a prediction
	 * with the trained model will be generated for it. It is also known as
	 * continuous target variable. For classification analysis, the data type of the
	 * field must be numeric (<code>integer</code>, <code>short</code>,
	 * <code>long</code>, <code>byte</code>), categorical (<code>ip</code> or
	 * <code>keyword</code>), or <code>boolean</code>. There must be no more than 30
	 * different values in this field. For regression analysis, the data type of the
	 * field must be numeric.
	 * <p>
	 * API name: {@code dependent_variable}
	 */
	public String dependentVariable() {
		return this.dependentVariable;
	}

	/**
	 * Advanced configuration option. Controls the fraction of data that is used to
	 * compute the derivatives of the loss function for tree training. A small value
	 * results in the use of a small fraction of the data. If this value is set to
	 * be less than 1, accuracy typically improves. However, too small a value may
	 * result in poor convergence for the ensemble and so require more trees. By
	 * default, this value is calculated during hyperparameter optimization. It must
	 * be greater than zero and less than or equal to 1.
	 * <p>
	 * API name: {@code downsample_factor}
	 */
	@Nullable
	public Number downsampleFactor() {
		return this.downsampleFactor;
	}

	/**
	 * Advanced configuration option. Specifies whether the training process should
	 * finish if it is not finding any better performing models. If disabled, the
	 * training process can take significantly longer and the chance of finding a
	 * better performing model is unremarkable.
	 * <p>
	 * API name: {@code early_stopping_enabled}
	 */
	@Nullable
	public Boolean earlyStoppingEnabled() {
		return this.earlyStoppingEnabled;
	}

	/**
	 * Advanced configuration option. The shrinkage applied to the weights. Smaller
	 * values result in larger forests which have a better generalization error.
	 * However, larger forests cause slower training. By default, this value is
	 * calculated during hyperparameter optimization. It must be a value between
	 * 0.001 and 1.
	 * <p>
	 * API name: {@code eta}
	 */
	@Nullable
	public Number eta() {
		return this.eta;
	}

	/**
	 * Advanced configuration option. Specifies the rate at which <code>eta</code>
	 * increases for each new tree that is added to the forest. For example, a rate
	 * of 1.05 increases <code>eta</code> by 5% for each extra tree. By default,
	 * this value is calculated during hyperparameter optimization. It must be
	 * between 0.5 and 2.
	 * <p>
	 * API name: {@code eta_growth_rate_per_tree}
	 */
	@Nullable
	public Number etaGrowthRatePerTree() {
		return this.etaGrowthRatePerTree;
	}

	/**
	 * Advanced configuration option. Defines the fraction of features that will be
	 * used when selecting a random bag for each candidate split. By default, this
	 * value is calculated during hyperparameter optimization.
	 * <p>
	 * API name: {@code feature_bag_fraction}
	 */
	@Nullable
	public Number featureBagFraction() {
		return this.featureBagFraction;
	}

	/**
	 * Advanced configuration option. A collection of feature preprocessors that
	 * modify one or more included fields. The analysis uses the resulting one or
	 * more features instead of the original document field. However, these features
	 * are ephemeral; they are not stored in the destination index. Multiple
	 * <code>feature_processors</code> entries can refer to the same document
	 * fields. Automatic categorical feature encoding still occurs for the fields
	 * that are unprocessed by a custom processor or that have categorical values.
	 * Use this property only if you want to override the automatic feature encoding
	 * of the specified fields.
	 * <p>
	 * API name: {@code feature_processors}
	 */
	@Nullable
	public List<DataframeAnalysisFeatureProcessor> featureProcessors() {
		return this.featureProcessors;
	}

	/**
	 * Advanced configuration option. Regularization parameter to prevent
	 * overfitting on the training data set. Multiplies a linear penalty associated
	 * with the size of individual trees in the forest. A high gamma value causes
	 * training to prefer small trees. A small gamma value results in larger
	 * individual trees and slower training. By default, this value is calculated
	 * during hyperparameter optimization. It must be a nonnegative value.
	 * <p>
	 * API name: {@code gamma}
	 */
	@Nullable
	public Number gamma() {
		return this.gamma;
	}

	/**
	 * Advanced configuration option. Regularization parameter to prevent
	 * overfitting on the training data set. Multiplies an L2 regularization term
	 * which applies to leaf weights of the individual trees in the forest. A high
	 * lambda value causes training to favor small leaf weights. This behavior makes
	 * the prediction function smoother at the expense of potentially not being able
	 * to capture relevant relationships between the features and the dependent
	 * variable. A small lambda value results in large individual trees and slower
	 * training. By default, this value is calculated during hyperparameter
	 * optimization. It must be a nonnegative value.
	 * <p>
	 * API name: {@code lambda}
	 */
	@Nullable
	public Number lambda() {
		return this.lambda;
	}

	/**
	 * Advanced configuration option. A multiplier responsible for determining the
	 * maximum number of hyperparameter optimization steps in the Bayesian
	 * optimization procedure. The maximum number of steps is determined based on
	 * the number of undefined hyperparameters times the maximum optimization rounds
	 * per hyperparameter. By default, this value is calculated during
	 * hyperparameter optimization.
	 * <p>
	 * API name: {@code max_optimization_rounds_per_hyperparameter}
	 */
	@Nullable
	public Number maxOptimizationRoundsPerHyperparameter() {
		return this.maxOptimizationRoundsPerHyperparameter;
	}

	/**
	 * Advanced configuration option. Defines the maximum number of decision trees
	 * in the forest. The maximum value is 2000. By default, this value is
	 * calculated during hyperparameter optimization.
	 * <p>
	 * API name: {@code max_trees}
	 */
	@Nullable
	public Number maxTrees() {
		return this.maxTrees;
	}

	/**
	 * Advanced configuration option. Specifies the maximum number of feature
	 * importance values per document to return. By default, no feature importance
	 * calculation occurs.
	 * <p>
	 * API name: {@code num_top_feature_importance_values}
	 */
	@Nullable
	public Number numTopFeatureImportanceValues() {
		return this.numTopFeatureImportanceValues;
	}

	/**
	 * Defines the name of the prediction field in the results. Defaults to
	 * <code>&lt;dependent_variable&gt;_prediction</code>.
	 * <p>
	 * API name: {@code prediction_field_name}
	 */
	@Nullable
	public String predictionFieldName() {
		return this.predictionFieldName;
	}

	/**
	 * Defines the seed for the random generator that is used to pick training data.
	 * By default, it is randomly generated. Set it to a specific value to use the
	 * same training data each time you start a job (assuming other related
	 * parameters such as <code>source</code> and <code>analyzed_fields</code> are
	 * the same).
	 * <p>
	 * API name: {@code randomize_seed}
	 */
	@Nullable
	public Number randomizeSeed() {
		return this.randomizeSeed;
	}

	/**
	 * Advanced configuration option. Machine learning uses loss guided tree
	 * growing, which means that the decision trees grow where the regularized loss
	 * decreases most quickly. This soft limit combines with the
	 * <code>soft_tree_depth_tolerance</code> to penalize trees that exceed the
	 * specified depth; the regularized loss increases quickly beyond this depth. By
	 * default, this value is calculated during hyperparameter optimization. It must
	 * be greater than or equal to 0.
	 * <p>
	 * API name: {@code soft_tree_depth_limit}
	 */
	@Nullable
	public Number softTreeDepthLimit() {
		return this.softTreeDepthLimit;
	}

	/**
	 * Advanced configuration option. This option controls how quickly the
	 * regularized loss increases when the tree depth exceeds
	 * <code>soft_tree_depth_limit</code>. By default, this value is calculated
	 * during hyperparameter optimization. It must be greater than or equal to 0.01.
	 * <p>
	 * API name: {@code soft_tree_depth_tolerance}
	 */
	@Nullable
	public Number softTreeDepthTolerance() {
		return this.softTreeDepthTolerance;
	}

	/**
	 * Defines what percentage of the eligible documents that will be used for
	 * training. Documents that are ignored by the analysis (for example those that
	 * contain arrays with more than one value) won’t be included in the calculation
	 * for used percentage.
	 * <p>
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

		if (this.alpha != null) {

			generator.writeKey("alpha");
			generator.write(this.alpha.doubleValue());

		}

		generator.writeKey("dependent_variable");
		generator.write(this.dependentVariable);

		if (this.downsampleFactor != null) {

			generator.writeKey("downsample_factor");
			generator.write(this.downsampleFactor.doubleValue());

		}
		if (this.earlyStoppingEnabled != null) {

			generator.writeKey("early_stopping_enabled");
			generator.write(this.earlyStoppingEnabled);

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
		if (this.featureProcessors != null) {

			generator.writeKey("feature_processors");
			generator.writeStartArray();
			for (DataframeAnalysisFeatureProcessor item0 : this.featureProcessors) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.gamma != null) {

			generator.writeKey("gamma");
			generator.write(this.gamma.doubleValue());

		}
		if (this.lambda != null) {

			generator.writeKey("lambda");
			generator.write(this.lambda.doubleValue());

		}
		if (this.maxOptimizationRoundsPerHyperparameter != null) {

			generator.writeKey("max_optimization_rounds_per_hyperparameter");
			generator.write(this.maxOptimizationRoundsPerHyperparameter.doubleValue());

		}
		if (this.maxTrees != null) {

			generator.writeKey("max_trees");
			generator.write(this.maxTrees.doubleValue());

		}
		if (this.numTopFeatureImportanceValues != null) {

			generator.writeKey("num_top_feature_importance_values");
			generator.write(this.numTopFeatureImportanceValues.doubleValue());

		}
		if (this.predictionFieldName != null) {

			generator.writeKey("prediction_field_name");
			generator.write(this.predictionFieldName);

		}
		if (this.randomizeSeed != null) {

			generator.writeKey("randomize_seed");
			generator.write(this.randomizeSeed.doubleValue());

		}
		if (this.softTreeDepthLimit != null) {

			generator.writeKey("soft_tree_depth_limit");
			generator.write(this.softTreeDepthLimit.doubleValue());

		}
		if (this.softTreeDepthTolerance != null) {

			generator.writeKey("soft_tree_depth_tolerance");
			generator.write(this.softTreeDepthTolerance.doubleValue());

		}
		if (this.trainingPercent != null) {

			generator.writeKey("training_percent");
			generator.write(this.trainingPercent);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private Number alpha;

		private String dependentVariable;

		@Nullable
		private Number downsampleFactor;

		@Nullable
		private Boolean earlyStoppingEnabled;

		@Nullable
		private Number eta;

		@Nullable
		private Number etaGrowthRatePerTree;

		@Nullable
		private Number featureBagFraction;

		@Nullable
		private List<DataframeAnalysisFeatureProcessor> featureProcessors;

		@Nullable
		private Number gamma;

		@Nullable
		private Number lambda;

		@Nullable
		private Number maxOptimizationRoundsPerHyperparameter;

		@Nullable
		private Number maxTrees;

		@Nullable
		private Number numTopFeatureImportanceValues;

		@Nullable
		private String predictionFieldName;

		@Nullable
		private Number randomizeSeed;

		@Nullable
		private Number softTreeDepthLimit;

		@Nullable
		private Number softTreeDepthTolerance;

		@Nullable
		private JsonValue trainingPercent;

		/**
		 * Advanced configuration option. Machine learning uses loss guided tree
		 * growing, which means that the decision trees grow where the regularized loss
		 * decreases most quickly. This parameter affects loss calculations by acting as
		 * a multiplier of the tree depth. Higher alpha values result in shallower trees
		 * and faster training times. By default, this value is calculated during
		 * hyperparameter optimization. It must be greater than or equal to zero.
		 * <p>
		 * API name: {@code alpha}
		 */
		public BuilderT alpha(@Nullable Number value) {
			this.alpha = value;
			return self();
		}

		/**
		 * Defines which field of the document is to be predicted. It must match one of
		 * the fields in the index being used to train. If this field is missing from a
		 * document, then that document will not be used for training, but a prediction
		 * with the trained model will be generated for it. It is also known as
		 * continuous target variable. For classification analysis, the data type of the
		 * field must be numeric (<code>integer</code>, <code>short</code>,
		 * <code>long</code>, <code>byte</code>), categorical (<code>ip</code> or
		 * <code>keyword</code>), or <code>boolean</code>. There must be no more than 30
		 * different values in this field. For regression analysis, the data type of the
		 * field must be numeric.
		 * <p>
		 * API name: {@code dependent_variable}
		 */
		public BuilderT dependentVariable(String value) {
			this.dependentVariable = value;
			return self();
		}

		/**
		 * Advanced configuration option. Controls the fraction of data that is used to
		 * compute the derivatives of the loss function for tree training. A small value
		 * results in the use of a small fraction of the data. If this value is set to
		 * be less than 1, accuracy typically improves. However, too small a value may
		 * result in poor convergence for the ensemble and so require more trees. By
		 * default, this value is calculated during hyperparameter optimization. It must
		 * be greater than zero and less than or equal to 1.
		 * <p>
		 * API name: {@code downsample_factor}
		 */
		public BuilderT downsampleFactor(@Nullable Number value) {
			this.downsampleFactor = value;
			return self();
		}

		/**
		 * Advanced configuration option. Specifies whether the training process should
		 * finish if it is not finding any better performing models. If disabled, the
		 * training process can take significantly longer and the chance of finding a
		 * better performing model is unremarkable.
		 * <p>
		 * API name: {@code early_stopping_enabled}
		 */
		public BuilderT earlyStoppingEnabled(@Nullable Boolean value) {
			this.earlyStoppingEnabled = value;
			return self();
		}

		/**
		 * Advanced configuration option. The shrinkage applied to the weights. Smaller
		 * values result in larger forests which have a better generalization error.
		 * However, larger forests cause slower training. By default, this value is
		 * calculated during hyperparameter optimization. It must be a value between
		 * 0.001 and 1.
		 * <p>
		 * API name: {@code eta}
		 */
		public BuilderT eta(@Nullable Number value) {
			this.eta = value;
			return self();
		}

		/**
		 * Advanced configuration option. Specifies the rate at which <code>eta</code>
		 * increases for each new tree that is added to the forest. For example, a rate
		 * of 1.05 increases <code>eta</code> by 5% for each extra tree. By default,
		 * this value is calculated during hyperparameter optimization. It must be
		 * between 0.5 and 2.
		 * <p>
		 * API name: {@code eta_growth_rate_per_tree}
		 */
		public BuilderT etaGrowthRatePerTree(@Nullable Number value) {
			this.etaGrowthRatePerTree = value;
			return self();
		}

		/**
		 * Advanced configuration option. Defines the fraction of features that will be
		 * used when selecting a random bag for each candidate split. By default, this
		 * value is calculated during hyperparameter optimization.
		 * <p>
		 * API name: {@code feature_bag_fraction}
		 */
		public BuilderT featureBagFraction(@Nullable Number value) {
			this.featureBagFraction = value;
			return self();
		}

		/**
		 * Advanced configuration option. A collection of feature preprocessors that
		 * modify one or more included fields. The analysis uses the resulting one or
		 * more features instead of the original document field. However, these features
		 * are ephemeral; they are not stored in the destination index. Multiple
		 * <code>feature_processors</code> entries can refer to the same document
		 * fields. Automatic categorical feature encoding still occurs for the fields
		 * that are unprocessed by a custom processor or that have categorical values.
		 * Use this property only if you want to override the automatic feature encoding
		 * of the specified fields.
		 * <p>
		 * API name: {@code feature_processors}
		 */
		public BuilderT featureProcessors(@Nullable List<DataframeAnalysisFeatureProcessor> value) {
			this.featureProcessors = value;
			return self();
		}

		/**
		 * Advanced configuration option. A collection of feature preprocessors that
		 * modify one or more included fields. The analysis uses the resulting one or
		 * more features instead of the original document field. However, these features
		 * are ephemeral; they are not stored in the destination index. Multiple
		 * <code>feature_processors</code> entries can refer to the same document
		 * fields. Automatic categorical feature encoding still occurs for the fields
		 * that are unprocessed by a custom processor or that have categorical values.
		 * Use this property only if you want to override the automatic feature encoding
		 * of the specified fields.
		 * <p>
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
		 * Advanced configuration option. Regularization parameter to prevent
		 * overfitting on the training data set. Multiplies a linear penalty associated
		 * with the size of individual trees in the forest. A high gamma value causes
		 * training to prefer small trees. A small gamma value results in larger
		 * individual trees and slower training. By default, this value is calculated
		 * during hyperparameter optimization. It must be a nonnegative value.
		 * <p>
		 * API name: {@code gamma}
		 */
		public BuilderT gamma(@Nullable Number value) {
			this.gamma = value;
			return self();
		}

		/**
		 * Advanced configuration option. Regularization parameter to prevent
		 * overfitting on the training data set. Multiplies an L2 regularization term
		 * which applies to leaf weights of the individual trees in the forest. A high
		 * lambda value causes training to favor small leaf weights. This behavior makes
		 * the prediction function smoother at the expense of potentially not being able
		 * to capture relevant relationships between the features and the dependent
		 * variable. A small lambda value results in large individual trees and slower
		 * training. By default, this value is calculated during hyperparameter
		 * optimization. It must be a nonnegative value.
		 * <p>
		 * API name: {@code lambda}
		 */
		public BuilderT lambda(@Nullable Number value) {
			this.lambda = value;
			return self();
		}

		/**
		 * Advanced configuration option. A multiplier responsible for determining the
		 * maximum number of hyperparameter optimization steps in the Bayesian
		 * optimization procedure. The maximum number of steps is determined based on
		 * the number of undefined hyperparameters times the maximum optimization rounds
		 * per hyperparameter. By default, this value is calculated during
		 * hyperparameter optimization.
		 * <p>
		 * API name: {@code max_optimization_rounds_per_hyperparameter}
		 */
		public BuilderT maxOptimizationRoundsPerHyperparameter(@Nullable Number value) {
			this.maxOptimizationRoundsPerHyperparameter = value;
			return self();
		}

		/**
		 * Advanced configuration option. Defines the maximum number of decision trees
		 * in the forest. The maximum value is 2000. By default, this value is
		 * calculated during hyperparameter optimization.
		 * <p>
		 * API name: {@code max_trees}
		 */
		public BuilderT maxTrees(@Nullable Number value) {
			this.maxTrees = value;
			return self();
		}

		/**
		 * Advanced configuration option. Specifies the maximum number of feature
		 * importance values per document to return. By default, no feature importance
		 * calculation occurs.
		 * <p>
		 * API name: {@code num_top_feature_importance_values}
		 */
		public BuilderT numTopFeatureImportanceValues(@Nullable Number value) {
			this.numTopFeatureImportanceValues = value;
			return self();
		}

		/**
		 * Defines the name of the prediction field in the results. Defaults to
		 * <code>&lt;dependent_variable&gt;_prediction</code>.
		 * <p>
		 * API name: {@code prediction_field_name}
		 */
		public BuilderT predictionFieldName(@Nullable String value) {
			this.predictionFieldName = value;
			return self();
		}

		/**
		 * Defines the seed for the random generator that is used to pick training data.
		 * By default, it is randomly generated. Set it to a specific value to use the
		 * same training data each time you start a job (assuming other related
		 * parameters such as <code>source</code> and <code>analyzed_fields</code> are
		 * the same).
		 * <p>
		 * API name: {@code randomize_seed}
		 */
		public BuilderT randomizeSeed(@Nullable Number value) {
			this.randomizeSeed = value;
			return self();
		}

		/**
		 * Advanced configuration option. Machine learning uses loss guided tree
		 * growing, which means that the decision trees grow where the regularized loss
		 * decreases most quickly. This soft limit combines with the
		 * <code>soft_tree_depth_tolerance</code> to penalize trees that exceed the
		 * specified depth; the regularized loss increases quickly beyond this depth. By
		 * default, this value is calculated during hyperparameter optimization. It must
		 * be greater than or equal to 0.
		 * <p>
		 * API name: {@code soft_tree_depth_limit}
		 */
		public BuilderT softTreeDepthLimit(@Nullable Number value) {
			this.softTreeDepthLimit = value;
			return self();
		}

		/**
		 * Advanced configuration option. This option controls how quickly the
		 * regularized loss increases when the tree depth exceeds
		 * <code>soft_tree_depth_limit</code>. By default, this value is calculated
		 * during hyperparameter optimization. It must be greater than or equal to 0.01.
		 * <p>
		 * API name: {@code soft_tree_depth_tolerance}
		 */
		public BuilderT softTreeDepthTolerance(@Nullable Number value) {
			this.softTreeDepthTolerance = value;
			return self();
		}

		/**
		 * Defines what percentage of the eligible documents that will be used for
		 * training. Documents that are ignored by the analysis (for example those that
		 * contain arrays with more than one value) won’t be included in the calculation
		 * for used percentage.
		 * <p>
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

		op.add(AbstractBuilder::alpha, JsonpDeserializer.numberDeserializer(), "alpha");
		op.add(AbstractBuilder::dependentVariable, JsonpDeserializer.stringDeserializer(), "dependent_variable");
		op.add(AbstractBuilder::downsampleFactor, JsonpDeserializer.numberDeserializer(), "downsample_factor");
		op.add(AbstractBuilder::earlyStoppingEnabled, JsonpDeserializer.booleanDeserializer(),
				"early_stopping_enabled");
		op.add(AbstractBuilder::eta, JsonpDeserializer.numberDeserializer(), "eta");
		op.add(AbstractBuilder::etaGrowthRatePerTree, JsonpDeserializer.numberDeserializer(),
				"eta_growth_rate_per_tree");
		op.add(AbstractBuilder::featureBagFraction, JsonpDeserializer.numberDeserializer(), "feature_bag_fraction");
		op.add(AbstractBuilder::featureProcessors,
				JsonpDeserializer.arrayDeserializer(DataframeAnalysisFeatureProcessor.DESERIALIZER),
				"feature_processors");
		op.add(AbstractBuilder::gamma, JsonpDeserializer.numberDeserializer(), "gamma");
		op.add(AbstractBuilder::lambda, JsonpDeserializer.numberDeserializer(), "lambda");
		op.add(AbstractBuilder::maxOptimizationRoundsPerHyperparameter, JsonpDeserializer.numberDeserializer(),
				"max_optimization_rounds_per_hyperparameter");
		op.add(AbstractBuilder::maxTrees, JsonpDeserializer.numberDeserializer(), "max_trees", "maximum_number_trees");
		op.add(AbstractBuilder::numTopFeatureImportanceValues, JsonpDeserializer.numberDeserializer(),
				"num_top_feature_importance_values");
		op.add(AbstractBuilder::predictionFieldName, JsonpDeserializer.stringDeserializer(), "prediction_field_name");
		op.add(AbstractBuilder::randomizeSeed, JsonpDeserializer.numberDeserializer(), "randomize_seed");
		op.add(AbstractBuilder::softTreeDepthLimit, JsonpDeserializer.numberDeserializer(), "soft_tree_depth_limit");
		op.add(AbstractBuilder::softTreeDepthTolerance, JsonpDeserializer.numberDeserializer(),
				"soft_tree_depth_tolerance");
		op.add(AbstractBuilder::trainingPercent, JsonpDeserializer.jsonValueDeserializer(), "training_percent");

	}

}
