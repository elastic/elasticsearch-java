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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Hyperparameters

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Hyperparameters">API
 *      specification</a>
 */
@JsonpDeserializable
public class Hyperparameters implements JsonpSerializable {
	@Nullable
	private final Double alpha;

	@Nullable
	private final Double lambda;

	@Nullable
	private final Double gamma;

	@Nullable
	private final Double eta;

	@Nullable
	private final Double etaGrowthRatePerTree;

	@Nullable
	private final Double featureBagFraction;

	@Nullable
	private final Double downsampleFactor;

	@Nullable
	private final Integer maxAttemptsToAddTree;

	@Nullable
	private final Integer maxOptimizationRoundsPerHyperparameter;

	@Nullable
	private final Integer maxTrees;

	@Nullable
	private final Integer numFolds;

	@Nullable
	private final Integer numSplitsPerFeature;

	@Nullable
	private final Integer softTreeDepthLimit;

	@Nullable
	private final Double softTreeDepthTolerance;

	// ---------------------------------------------------------------------------------------------

	private Hyperparameters(Builder builder) {

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

	public static Hyperparameters of(Function<Builder, ObjectBuilder<Hyperparameters>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code alpha}
	 */
	@Nullable
	public final Double alpha() {
		return this.alpha;
	}

	/**
	 * API name: {@code lambda}
	 */
	@Nullable
	public final Double lambda() {
		return this.lambda;
	}

	/**
	 * API name: {@code gamma}
	 */
	@Nullable
	public final Double gamma() {
		return this.gamma;
	}

	/**
	 * API name: {@code eta}
	 */
	@Nullable
	public final Double eta() {
		return this.eta;
	}

	/**
	 * API name: {@code eta_growth_rate_per_tree}
	 */
	@Nullable
	public final Double etaGrowthRatePerTree() {
		return this.etaGrowthRatePerTree;
	}

	/**
	 * API name: {@code feature_bag_fraction}
	 */
	@Nullable
	public final Double featureBagFraction() {
		return this.featureBagFraction;
	}

	/**
	 * API name: {@code downsample_factor}
	 */
	@Nullable
	public final Double downsampleFactor() {
		return this.downsampleFactor;
	}

	/**
	 * API name: {@code max_attempts_to_add_tree}
	 */
	@Nullable
	public final Integer maxAttemptsToAddTree() {
		return this.maxAttemptsToAddTree;
	}

	/**
	 * API name: {@code max_optimization_rounds_per_hyperparameter}
	 */
	@Nullable
	public final Integer maxOptimizationRoundsPerHyperparameter() {
		return this.maxOptimizationRoundsPerHyperparameter;
	}

	/**
	 * API name: {@code max_trees}
	 */
	@Nullable
	public final Integer maxTrees() {
		return this.maxTrees;
	}

	/**
	 * API name: {@code num_folds}
	 */
	@Nullable
	public final Integer numFolds() {
		return this.numFolds;
	}

	/**
	 * API name: {@code num_splits_per_feature}
	 */
	@Nullable
	public final Integer numSplitsPerFeature() {
		return this.numSplitsPerFeature;
	}

	/**
	 * API name: {@code soft_tree_depth_limit}
	 */
	@Nullable
	public final Integer softTreeDepthLimit() {
		return this.softTreeDepthLimit;
	}

	/**
	 * API name: {@code soft_tree_depth_tolerance}
	 */
	@Nullable
	public final Double softTreeDepthTolerance() {
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
			generator.write(this.alpha);

		}
		if (this.lambda != null) {
			generator.writeKey("lambda");
			generator.write(this.lambda);

		}
		if (this.gamma != null) {
			generator.writeKey("gamma");
			generator.write(this.gamma);

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
		if (this.downsampleFactor != null) {
			generator.writeKey("downsample_factor");
			generator.write(this.downsampleFactor);

		}
		if (this.maxAttemptsToAddTree != null) {
			generator.writeKey("max_attempts_to_add_tree");
			generator.write(this.maxAttemptsToAddTree);

		}
		if (this.maxOptimizationRoundsPerHyperparameter != null) {
			generator.writeKey("max_optimization_rounds_per_hyperparameter");
			generator.write(this.maxOptimizationRoundsPerHyperparameter);

		}
		if (this.maxTrees != null) {
			generator.writeKey("max_trees");
			generator.write(this.maxTrees);

		}
		if (this.numFolds != null) {
			generator.writeKey("num_folds");
			generator.write(this.numFolds);

		}
		if (this.numSplitsPerFeature != null) {
			generator.writeKey("num_splits_per_feature");
			generator.write(this.numSplitsPerFeature);

		}
		if (this.softTreeDepthLimit != null) {
			generator.writeKey("soft_tree_depth_limit");
			generator.write(this.softTreeDepthLimit);

		}
		if (this.softTreeDepthTolerance != null) {
			generator.writeKey("soft_tree_depth_tolerance");
			generator.write(this.softTreeDepthTolerance);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hyperparameters}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Hyperparameters> {
		@Nullable
		private Double alpha;

		@Nullable
		private Double lambda;

		@Nullable
		private Double gamma;

		@Nullable
		private Double eta;

		@Nullable
		private Double etaGrowthRatePerTree;

		@Nullable
		private Double featureBagFraction;

		@Nullable
		private Double downsampleFactor;

		@Nullable
		private Integer maxAttemptsToAddTree;

		@Nullable
		private Integer maxOptimizationRoundsPerHyperparameter;

		@Nullable
		private Integer maxTrees;

		@Nullable
		private Integer numFolds;

		@Nullable
		private Integer numSplitsPerFeature;

		@Nullable
		private Integer softTreeDepthLimit;

		@Nullable
		private Double softTreeDepthTolerance;

		/**
		 * API name: {@code alpha}
		 */
		public final Builder alpha(@Nullable Double value) {
			this.alpha = value;
			return this;
		}

		/**
		 * API name: {@code lambda}
		 */
		public final Builder lambda(@Nullable Double value) {
			this.lambda = value;
			return this;
		}

		/**
		 * API name: {@code gamma}
		 */
		public final Builder gamma(@Nullable Double value) {
			this.gamma = value;
			return this;
		}

		/**
		 * API name: {@code eta}
		 */
		public final Builder eta(@Nullable Double value) {
			this.eta = value;
			return this;
		}

		/**
		 * API name: {@code eta_growth_rate_per_tree}
		 */
		public final Builder etaGrowthRatePerTree(@Nullable Double value) {
			this.etaGrowthRatePerTree = value;
			return this;
		}

		/**
		 * API name: {@code feature_bag_fraction}
		 */
		public final Builder featureBagFraction(@Nullable Double value) {
			this.featureBagFraction = value;
			return this;
		}

		/**
		 * API name: {@code downsample_factor}
		 */
		public final Builder downsampleFactor(@Nullable Double value) {
			this.downsampleFactor = value;
			return this;
		}

		/**
		 * API name: {@code max_attempts_to_add_tree}
		 */
		public final Builder maxAttemptsToAddTree(@Nullable Integer value) {
			this.maxAttemptsToAddTree = value;
			return this;
		}

		/**
		 * API name: {@code max_optimization_rounds_per_hyperparameter}
		 */
		public final Builder maxOptimizationRoundsPerHyperparameter(@Nullable Integer value) {
			this.maxOptimizationRoundsPerHyperparameter = value;
			return this;
		}

		/**
		 * API name: {@code max_trees}
		 */
		public final Builder maxTrees(@Nullable Integer value) {
			this.maxTrees = value;
			return this;
		}

		/**
		 * API name: {@code num_folds}
		 */
		public final Builder numFolds(@Nullable Integer value) {
			this.numFolds = value;
			return this;
		}

		/**
		 * API name: {@code num_splits_per_feature}
		 */
		public final Builder numSplitsPerFeature(@Nullable Integer value) {
			this.numSplitsPerFeature = value;
			return this;
		}

		/**
		 * API name: {@code soft_tree_depth_limit}
		 */
		public final Builder softTreeDepthLimit(@Nullable Integer value) {
			this.softTreeDepthLimit = value;
			return this;
		}

		/**
		 * API name: {@code soft_tree_depth_tolerance}
		 */
		public final Builder softTreeDepthTolerance(@Nullable Double value) {
			this.softTreeDepthTolerance = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Hyperparameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Hyperparameters build() {
			_checkSingleUse();

			return new Hyperparameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Hyperparameters}
	 */
	public static final JsonpDeserializer<Hyperparameters> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Hyperparameters::setupHyperparametersDeserializer);

	protected static void setupHyperparametersDeserializer(ObjectDeserializer<Hyperparameters.Builder> op) {

		op.add(Builder::alpha, JsonpDeserializer.doubleDeserializer(), "alpha");
		op.add(Builder::lambda, JsonpDeserializer.doubleDeserializer(), "lambda");
		op.add(Builder::gamma, JsonpDeserializer.doubleDeserializer(), "gamma");
		op.add(Builder::eta, JsonpDeserializer.doubleDeserializer(), "eta");
		op.add(Builder::etaGrowthRatePerTree, JsonpDeserializer.doubleDeserializer(), "eta_growth_rate_per_tree");
		op.add(Builder::featureBagFraction, JsonpDeserializer.doubleDeserializer(), "feature_bag_fraction");
		op.add(Builder::downsampleFactor, JsonpDeserializer.doubleDeserializer(), "downsample_factor");
		op.add(Builder::maxAttemptsToAddTree, JsonpDeserializer.integerDeserializer(), "max_attempts_to_add_tree");
		op.add(Builder::maxOptimizationRoundsPerHyperparameter, JsonpDeserializer.integerDeserializer(),
				"max_optimization_rounds_per_hyperparameter");
		op.add(Builder::maxTrees, JsonpDeserializer.integerDeserializer(), "max_trees");
		op.add(Builder::numFolds, JsonpDeserializer.integerDeserializer(), "num_folds");
		op.add(Builder::numSplitsPerFeature, JsonpDeserializer.integerDeserializer(), "num_splits_per_feature");
		op.add(Builder::softTreeDepthLimit, JsonpDeserializer.integerDeserializer(), "soft_tree_depth_limit");
		op.add(Builder::softTreeDepthTolerance, JsonpDeserializer.doubleDeserializer(), "soft_tree_depth_tolerance");

	}

}
