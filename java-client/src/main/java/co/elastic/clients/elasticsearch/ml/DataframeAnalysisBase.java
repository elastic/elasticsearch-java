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
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysis

public abstract class DataframeAnalysisBase implements JsonpSerializable {
	@Nullable
	private final Double alpha;

	private final String dependentVariable;

	@Nullable
	private final Double downsampleFactor;

	@Nullable
	private final Boolean earlyStoppingEnabled;

	@Nullable
	private final Double eta;

	@Nullable
	private final Double etaGrowthRatePerTree;

	@Nullable
	private final Double featureBagFraction;

	@Nullable
	private final List<DataframeAnalysisFeatureProcessor> featureProcessors;

	@Nullable
	private final Double gamma;

	@Nullable
	private final Double lambda;

	@Nullable
	private final Integer maxOptimizationRoundsPerHyperparameter;

	@Nullable
	private final Integer maxTrees;

	@Nullable
	private final Integer numTopFeatureImportanceValues;

	@Nullable
	private final String predictionFieldName;

	@Nullable
	private final Double randomizeSeed;

	@Nullable
	private final Integer softTreeDepthLimit;

	@Nullable
	private final Double softTreeDepthTolerance;

	@Nullable
	private final String trainingPercent;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalysisBase(AbstractBuilder<?> builder) {

		this.alpha = builder.alpha;
		this.dependentVariable = Objects.requireNonNull(builder.dependentVariable, "dependent_variable");
		this.downsampleFactor = builder.downsampleFactor;
		this.earlyStoppingEnabled = builder.earlyStoppingEnabled;
		this.eta = builder.eta;
		this.etaGrowthRatePerTree = builder.etaGrowthRatePerTree;
		this.featureBagFraction = builder.featureBagFraction;
		this.featureProcessors = ModelTypeHelper.unmodifiable(builder.featureProcessors);
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
	public Double alpha() {
		return this.alpha;
	}

	/**
	 * Required - Defines which field of the document is to be predicted. It must
	 * match one of the fields in the index being used to train. If this field is
	 * missing from a document, then that document will not be used for training,
	 * but a prediction with the trained model will be generated for it. It is also
	 * known as continuous target variable. For classification analysis, the data
	 * type of the field must be numeric (<code>integer</code>, <code>short</code>,
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
	public Double downsampleFactor() {
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
	public Double eta() {
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
	public Double etaGrowthRatePerTree() {
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
	public Double featureBagFraction() {
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
	public Double gamma() {
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
	public Double lambda() {
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
	public Integer maxOptimizationRoundsPerHyperparameter() {
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
	public Integer maxTrees() {
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
	public Integer numTopFeatureImportanceValues() {
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
	public Double randomizeSeed() {
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
	public Integer softTreeDepthLimit() {
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
	public Double softTreeDepthTolerance() {
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
	public String trainingPercent() {
		return this.trainingPercent;
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

		if (this.alpha != null) {

			generator.writeKey("alpha");
			generator.write(this.alpha);

		}

		generator.writeKey("dependent_variable");
		generator.write(this.dependentVariable);

		if (this.downsampleFactor != null) {

			generator.writeKey("downsample_factor");
			generator.write(this.downsampleFactor);

		}
		if (this.earlyStoppingEnabled != null) {

			generator.writeKey("early_stopping_enabled");
			generator.write(this.earlyStoppingEnabled);

		}
		if (this.eta != null) {

			generator.writeKey("eta");
			generator.write(this.eta);

		}
		if (this.etaGrowthRatePerTree != null) {

			generator.writeKey("eta_growth_rate_per_tree");
			generator.write(this.etaGrowthRatePerTree);

		}
		if (this.featureBagFraction != null) {

			generator.writeKey("feature_bag_fraction");
			generator.write(this.featureBagFraction);

		}
		if (this.featureProcessors != null) {

			generator.writeKey("feature_processors");
			generator.writeStartArray();
			for (DataframeAnalysisFeatureProcessor item0 : this.featureProcessors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.gamma != null) {

			generator.writeKey("gamma");
			generator.write(this.gamma);

		}
		if (this.lambda != null) {

			generator.writeKey("lambda");
			generator.write(this.lambda);

		}
		if (this.maxOptimizationRoundsPerHyperparameter != null) {

			generator.writeKey("max_optimization_rounds_per_hyperparameter");
			generator.write(this.maxOptimizationRoundsPerHyperparameter);

		}
		if (this.maxTrees != null) {

			generator.writeKey("max_trees");
			generator.write(this.maxTrees);

		}
		if (this.numTopFeatureImportanceValues != null) {

			generator.writeKey("num_top_feature_importance_values");
			generator.write(this.numTopFeatureImportanceValues);

		}
		if (this.predictionFieldName != null) {

			generator.writeKey("prediction_field_name");
			generator.write(this.predictionFieldName);

		}
		if (this.randomizeSeed != null) {

			generator.writeKey("randomize_seed");
			generator.write(this.randomizeSeed);

		}
		if (this.softTreeDepthLimit != null) {

			generator.writeKey("soft_tree_depth_limit");
			generator.write(this.softTreeDepthLimit);

		}
		if (this.softTreeDepthTolerance != null) {

			generator.writeKey("soft_tree_depth_tolerance");
			generator.write(this.softTreeDepthTolerance);

		}
		if (this.trainingPercent != null) {

			generator.writeKey("training_percent");
			generator.write(this.trainingPercent);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private Double alpha;

		private String dependentVariable;

		@Nullable
		private Double downsampleFactor;

		@Nullable
		private Boolean earlyStoppingEnabled;

		@Nullable
		private Double eta;

		@Nullable
		private Double etaGrowthRatePerTree;

		@Nullable
		private Double featureBagFraction;

		@Nullable
		private List<DataframeAnalysisFeatureProcessor> featureProcessors;

		@Nullable
		private Double gamma;

		@Nullable
		private Double lambda;

		@Nullable
		private Integer maxOptimizationRoundsPerHyperparameter;

		@Nullable
		private Integer maxTrees;

		@Nullable
		private Integer numTopFeatureImportanceValues;

		@Nullable
		private String predictionFieldName;

		@Nullable
		private Double randomizeSeed;

		@Nullable
		private Integer softTreeDepthLimit;

		@Nullable
		private Double softTreeDepthTolerance;

		@Nullable
		private String trainingPercent;

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
		public BuilderT alpha(@Nullable Double value) {
			this.alpha = value;
			return self();
		}

		/**
		 * Required - Defines which field of the document is to be predicted. It must
		 * match one of the fields in the index being used to train. If this field is
		 * missing from a document, then that document will not be used for training,
		 * but a prediction with the trained model will be generated for it. It is also
		 * known as continuous target variable. For classification analysis, the data
		 * type of the field must be numeric (<code>integer</code>, <code>short</code>,
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
		public BuilderT downsampleFactor(@Nullable Double value) {
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
		public BuilderT eta(@Nullable Double value) {
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
		public BuilderT etaGrowthRatePerTree(@Nullable Double value) {
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
		public BuilderT featureBagFraction(@Nullable Double value) {
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
		public BuilderT gamma(@Nullable Double value) {
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
		public BuilderT lambda(@Nullable Double value) {
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
		public BuilderT maxOptimizationRoundsPerHyperparameter(@Nullable Integer value) {
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
		public BuilderT maxTrees(@Nullable Integer value) {
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
		public BuilderT numTopFeatureImportanceValues(@Nullable Integer value) {
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
		public BuilderT randomizeSeed(@Nullable Double value) {
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
		public BuilderT softTreeDepthLimit(@Nullable Integer value) {
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
		public BuilderT softTreeDepthTolerance(@Nullable Double value) {
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
		public BuilderT trainingPercent(@Nullable String value) {
			this.trainingPercent = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDataframeAnalysisBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::alpha, JsonpDeserializer.doubleDeserializer(), "alpha");
		op.add(AbstractBuilder::dependentVariable, JsonpDeserializer.stringDeserializer(), "dependent_variable");
		op.add(AbstractBuilder::downsampleFactor, JsonpDeserializer.doubleDeserializer(), "downsample_factor");
		op.add(AbstractBuilder::earlyStoppingEnabled, JsonpDeserializer.booleanDeserializer(),
				"early_stopping_enabled");
		op.add(AbstractBuilder::eta, JsonpDeserializer.doubleDeserializer(), "eta");
		op.add(AbstractBuilder::etaGrowthRatePerTree, JsonpDeserializer.doubleDeserializer(),
				"eta_growth_rate_per_tree");
		op.add(AbstractBuilder::featureBagFraction, JsonpDeserializer.doubleDeserializer(), "feature_bag_fraction");
		op.add(AbstractBuilder::featureProcessors,
				JsonpDeserializer.arrayDeserializer(DataframeAnalysisFeatureProcessor._DESERIALIZER),
				"feature_processors");
		op.add(AbstractBuilder::gamma, JsonpDeserializer.doubleDeserializer(), "gamma");
		op.add(AbstractBuilder::lambda, JsonpDeserializer.doubleDeserializer(), "lambda");
		op.add(AbstractBuilder::maxOptimizationRoundsPerHyperparameter, JsonpDeserializer.integerDeserializer(),
				"max_optimization_rounds_per_hyperparameter");
		op.add(AbstractBuilder::maxTrees, JsonpDeserializer.integerDeserializer(), "max_trees", "maximum_number_trees");
		op.add(AbstractBuilder::numTopFeatureImportanceValues, JsonpDeserializer.integerDeserializer(),
				"num_top_feature_importance_values");
		op.add(AbstractBuilder::predictionFieldName, JsonpDeserializer.stringDeserializer(), "prediction_field_name");
		op.add(AbstractBuilder::randomizeSeed, JsonpDeserializer.doubleDeserializer(), "randomize_seed");
		op.add(AbstractBuilder::softTreeDepthLimit, JsonpDeserializer.integerDeserializer(), "soft_tree_depth_limit");
		op.add(AbstractBuilder::softTreeDepthTolerance, JsonpDeserializer.doubleDeserializer(),
				"soft_tree_depth_tolerance");
		op.add(AbstractBuilder::trainingPercent, JsonpDeserializer.stringDeserializer(), "training_percent");

	}

}
