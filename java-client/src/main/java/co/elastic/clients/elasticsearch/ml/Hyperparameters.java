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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.Hyperparameters
public final class Hyperparameters implements JsonpSerializable {
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
	private final Number downsampleFactor;

	@Nullable
	private final Number maxAttemptsToAddTree;

	@Nullable
	private final Number maxOptimizationRoundsPerHyperparameter;

	@Nullable
	private final Number maxTrees;

	@Nullable
	private final Number numFolds;

	@Nullable
	private final Number numSplitsPerFeature;

	@Nullable
	private final Number softTreeDepthLimit;

	@Nullable
	private final Number softTreeDepthTolerance;

	// ---------------------------------------------------------------------------------------------

	public Hyperparameters(Builder builder) {

		this.alpha = builder.alpha;
		this.lambda = builder.lambda;
		this.gamma = builder.gamma;
		this.eta = builder.eta;
		this.etaGrowthRatePerTree = builder.etaGrowthRatePerTree;
		this.featureBagFraction = builder.featureBagFraction;
		this.downsampleFactor = builder.downsampleFactor;
		this.maxAttemptsToAddTree = builder.maxAttemptsToAddTree;
		this.maxOptimizationRoundsPerHyperparameter = builder.maxOptimizationRoundsPerHyperparameter;
		this.maxTrees = builder.maxTrees;
		this.numFolds = builder.numFolds;
		this.numSplitsPerFeature = builder.numSplitsPerFeature;
		this.softTreeDepthLimit = builder.softTreeDepthLimit;
		this.softTreeDepthTolerance = builder.softTreeDepthTolerance;

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
	 * API name: {@code downsample_factor}
	 */
	@Nullable
	public Number downsampleFactor() {
		return this.downsampleFactor;
	}

	/**
	 * API name: {@code max_attempts_to_add_tree}
	 */
	@Nullable
	public Number maxAttemptsToAddTree() {
		return this.maxAttemptsToAddTree;
	}

	/**
	 * API name: {@code max_optimization_rounds_per_hyperparameter}
	 */
	@Nullable
	public Number maxOptimizationRoundsPerHyperparameter() {
		return this.maxOptimizationRoundsPerHyperparameter;
	}

	/**
	 * API name: {@code max_trees}
	 */
	@Nullable
	public Number maxTrees() {
		return this.maxTrees;
	}

	/**
	 * API name: {@code num_folds}
	 */
	@Nullable
	public Number numFolds() {
		return this.numFolds;
	}

	/**
	 * API name: {@code num_splits_per_feature}
	 */
	@Nullable
	public Number numSplitsPerFeature() {
		return this.numSplitsPerFeature;
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
		if (this.downsampleFactor != null) {

			generator.writeKey("downsample_factor");
			generator.write(this.downsampleFactor.doubleValue());

		}
		if (this.maxAttemptsToAddTree != null) {

			generator.writeKey("max_attempts_to_add_tree");
			generator.write(this.maxAttemptsToAddTree.doubleValue());

		}
		if (this.maxOptimizationRoundsPerHyperparameter != null) {

			generator.writeKey("max_optimization_rounds_per_hyperparameter");
			generator.write(this.maxOptimizationRoundsPerHyperparameter.doubleValue());

		}
		if (this.maxTrees != null) {

			generator.writeKey("max_trees");
			generator.write(this.maxTrees.doubleValue());

		}
		if (this.numFolds != null) {

			generator.writeKey("num_folds");
			generator.write(this.numFolds.doubleValue());

		}
		if (this.numSplitsPerFeature != null) {

			generator.writeKey("num_splits_per_feature");
			generator.write(this.numSplitsPerFeature.doubleValue());

		}
		if (this.softTreeDepthLimit != null) {

			generator.writeKey("soft_tree_depth_limit");
			generator.write(this.softTreeDepthLimit.doubleValue());

		}
		if (this.softTreeDepthTolerance != null) {

			generator.writeKey("soft_tree_depth_tolerance");
			generator.write(this.softTreeDepthTolerance.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hyperparameters}.
	 */
	public static class Builder implements ObjectBuilder<Hyperparameters> {
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
		private Number downsampleFactor;

		@Nullable
		private Number maxAttemptsToAddTree;

		@Nullable
		private Number maxOptimizationRoundsPerHyperparameter;

		@Nullable
		private Number maxTrees;

		@Nullable
		private Number numFolds;

		@Nullable
		private Number numSplitsPerFeature;

		@Nullable
		private Number softTreeDepthLimit;

		@Nullable
		private Number softTreeDepthTolerance;

		/**
		 * API name: {@code alpha}
		 */
		public Builder alpha(@Nullable Number value) {
			this.alpha = value;
			return this;
		}

		/**
		 * API name: {@code lambda}
		 */
		public Builder lambda(@Nullable Number value) {
			this.lambda = value;
			return this;
		}

		/**
		 * API name: {@code gamma}
		 */
		public Builder gamma(@Nullable Number value) {
			this.gamma = value;
			return this;
		}

		/**
		 * API name: {@code eta}
		 */
		public Builder eta(@Nullable Number value) {
			this.eta = value;
			return this;
		}

		/**
		 * API name: {@code eta_growth_rate_per_tree}
		 */
		public Builder etaGrowthRatePerTree(@Nullable Number value) {
			this.etaGrowthRatePerTree = value;
			return this;
		}

		/**
		 * API name: {@code feature_bag_fraction}
		 */
		public Builder featureBagFraction(@Nullable Number value) {
			this.featureBagFraction = value;
			return this;
		}

		/**
		 * API name: {@code downsample_factor}
		 */
		public Builder downsampleFactor(@Nullable Number value) {
			this.downsampleFactor = value;
			return this;
		}

		/**
		 * API name: {@code max_attempts_to_add_tree}
		 */
		public Builder maxAttemptsToAddTree(@Nullable Number value) {
			this.maxAttemptsToAddTree = value;
			return this;
		}

		/**
		 * API name: {@code max_optimization_rounds_per_hyperparameter}
		 */
		public Builder maxOptimizationRoundsPerHyperparameter(@Nullable Number value) {
			this.maxOptimizationRoundsPerHyperparameter = value;
			return this;
		}

		/**
		 * API name: {@code max_trees}
		 */
		public Builder maxTrees(@Nullable Number value) {
			this.maxTrees = value;
			return this;
		}

		/**
		 * API name: {@code num_folds}
		 */
		public Builder numFolds(@Nullable Number value) {
			this.numFolds = value;
			return this;
		}

		/**
		 * API name: {@code num_splits_per_feature}
		 */
		public Builder numSplitsPerFeature(@Nullable Number value) {
			this.numSplitsPerFeature = value;
			return this;
		}

		/**
		 * API name: {@code soft_tree_depth_limit}
		 */
		public Builder softTreeDepthLimit(@Nullable Number value) {
			this.softTreeDepthLimit = value;
			return this;
		}

		/**
		 * API name: {@code soft_tree_depth_tolerance}
		 */
		public Builder softTreeDepthTolerance(@Nullable Number value) {
			this.softTreeDepthTolerance = value;
			return this;
		}

		/**
		 * Builds a {@link Hyperparameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Hyperparameters build() {

			return new Hyperparameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Hyperparameters}
	 */
	public static final JsonpDeserializer<Hyperparameters> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Hyperparameters::setupHyperparametersDeserializer);

	protected static void setupHyperparametersDeserializer(DelegatingDeserializer<Hyperparameters.Builder> op) {

		op.add(Builder::alpha, JsonpDeserializer.numberDeserializer(), "alpha");
		op.add(Builder::lambda, JsonpDeserializer.numberDeserializer(), "lambda");
		op.add(Builder::gamma, JsonpDeserializer.numberDeserializer(), "gamma");
		op.add(Builder::eta, JsonpDeserializer.numberDeserializer(), "eta");
		op.add(Builder::etaGrowthRatePerTree, JsonpDeserializer.numberDeserializer(), "eta_growth_rate_per_tree");
		op.add(Builder::featureBagFraction, JsonpDeserializer.numberDeserializer(), "feature_bag_fraction");
		op.add(Builder::downsampleFactor, JsonpDeserializer.numberDeserializer(), "downsample_factor");
		op.add(Builder::maxAttemptsToAddTree, JsonpDeserializer.numberDeserializer(), "max_attempts_to_add_tree");
		op.add(Builder::maxOptimizationRoundsPerHyperparameter, JsonpDeserializer.numberDeserializer(),
				"max_optimization_rounds_per_hyperparameter");
		op.add(Builder::maxTrees, JsonpDeserializer.numberDeserializer(), "max_trees");
		op.add(Builder::numFolds, JsonpDeserializer.numberDeserializer(), "num_folds");
		op.add(Builder::numSplitsPerFeature, JsonpDeserializer.numberDeserializer(), "num_splits_per_feature");
		op.add(Builder::softTreeDepthLimit, JsonpDeserializer.numberDeserializer(), "soft_tree_depth_limit");
		op.add(Builder::softTreeDepthTolerance, JsonpDeserializer.numberDeserializer(), "soft_tree_depth_tolerance");

	}

}
