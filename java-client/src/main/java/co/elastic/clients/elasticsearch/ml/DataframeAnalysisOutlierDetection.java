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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisOutlierDetection
@JsonpDeserializable
public final class DataframeAnalysisOutlierDetection implements DataframeAnalysisVariant, JsonpSerializable {
	@Nullable
	private final Boolean computeFeatureInfluence;

	@Nullable
	private final Double featureInfluenceThreshold;

	@Nullable
	private final String method;

	@Nullable
	private final Integer nNeighbors;

	@Nullable
	private final Double outlierFraction;

	@Nullable
	private final Boolean standardizationEnabled;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalysisOutlierDetection(Builder builder) {

		this.computeFeatureInfluence = builder.computeFeatureInfluence;
		this.featureInfluenceThreshold = builder.featureInfluenceThreshold;
		this.method = builder.method;
		this.nNeighbors = builder.nNeighbors;
		this.outlierFraction = builder.outlierFraction;
		this.standardizationEnabled = builder.standardizationEnabled;

	}

	/**
	 * {@link DataframeAnalysis} variant type
	 */
	@Override
	public String _variantType() {
		return "outlier_detection";
	}

	/**
	 * Specifies whether the feature influence calculation is enabled.
	 * <p>
	 * API name: {@code compute_feature_influence}
	 */
	@Nullable
	public Boolean computeFeatureInfluence() {
		return this.computeFeatureInfluence;
	}

	/**
	 * The minimum outlier score that a document needs to have in order to calculate
	 * its feature influence score. Value range: 0-1.
	 * <p>
	 * API name: {@code feature_influence_threshold}
	 */
	@Nullable
	public Double featureInfluenceThreshold() {
		return this.featureInfluenceThreshold;
	}

	/**
	 * The method that outlier detection uses. Available methods are
	 * <code>lof</code>, <code>ldof</code>, <code>distance_kth_nn</code>,
	 * <code>distance_knn</code>, and <code>ensemble</code>. The default value is
	 * ensemble, which means that outlier detection uses an ensemble of different
	 * methods and normalises and combines their individual outlier scores to obtain
	 * the overall outlier score.
	 * <p>
	 * API name: {@code method}
	 */
	@Nullable
	public String method() {
		return this.method;
	}

	/**
	 * Defines the value for how many nearest neighbors each method of outlier
	 * detection uses to calculate its outlier score. When the value is not set,
	 * different values are used for different ensemble members. This default
	 * behavior helps improve the diversity in the ensemble; only override it if you
	 * are confident that the value you choose is appropriate for the data set.
	 * <p>
	 * API name: {@code n_neighbors}
	 */
	@Nullable
	public Integer nNeighbors() {
		return this.nNeighbors;
	}

	/**
	 * The proportion of the data set that is assumed to be outlying prior to
	 * outlier detection. For example, 0.05 means it is assumed that 5% of values
	 * are real outliers and 95% are inliers.
	 * <p>
	 * API name: {@code outlier_fraction}
	 */
	@Nullable
	public Double outlierFraction() {
		return this.outlierFraction;
	}

	/**
	 * If true, the following operation is performed on the columns before computing
	 * outlier scores: <code>(x_i - mean(x_i)) / sd(x_i)</code>.
	 * <p>
	 * API name: {@code standardization_enabled}
	 */
	@Nullable
	public Boolean standardizationEnabled() {
		return this.standardizationEnabled;
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

		if (this.computeFeatureInfluence != null) {

			generator.writeKey("compute_feature_influence");
			generator.write(this.computeFeatureInfluence);

		}
		if (this.featureInfluenceThreshold != null) {

			generator.writeKey("feature_influence_threshold");
			generator.write(this.featureInfluenceThreshold);

		}
		if (this.method != null) {

			generator.writeKey("method");
			generator.write(this.method);

		}
		if (this.nNeighbors != null) {

			generator.writeKey("n_neighbors");
			generator.write(this.nNeighbors);

		}
		if (this.outlierFraction != null) {

			generator.writeKey("outlier_fraction");
			generator.write(this.outlierFraction);

		}
		if (this.standardizationEnabled != null) {

			generator.writeKey("standardization_enabled");
			generator.write(this.standardizationEnabled);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisOutlierDetection}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalysisOutlierDetection> {
		@Nullable
		private Boolean computeFeatureInfluence;

		@Nullable
		private Double featureInfluenceThreshold;

		@Nullable
		private String method;

		@Nullable
		private Integer nNeighbors;

		@Nullable
		private Double outlierFraction;

		@Nullable
		private Boolean standardizationEnabled;

		/**
		 * Specifies whether the feature influence calculation is enabled.
		 * <p>
		 * API name: {@code compute_feature_influence}
		 */
		public Builder computeFeatureInfluence(@Nullable Boolean value) {
			this.computeFeatureInfluence = value;
			return this;
		}

		/**
		 * The minimum outlier score that a document needs to have in order to calculate
		 * its feature influence score. Value range: 0-1.
		 * <p>
		 * API name: {@code feature_influence_threshold}
		 */
		public Builder featureInfluenceThreshold(@Nullable Double value) {
			this.featureInfluenceThreshold = value;
			return this;
		}

		/**
		 * The method that outlier detection uses. Available methods are
		 * <code>lof</code>, <code>ldof</code>, <code>distance_kth_nn</code>,
		 * <code>distance_knn</code>, and <code>ensemble</code>. The default value is
		 * ensemble, which means that outlier detection uses an ensemble of different
		 * methods and normalises and combines their individual outlier scores to obtain
		 * the overall outlier score.
		 * <p>
		 * API name: {@code method}
		 */
		public Builder method(@Nullable String value) {
			this.method = value;
			return this;
		}

		/**
		 * Defines the value for how many nearest neighbors each method of outlier
		 * detection uses to calculate its outlier score. When the value is not set,
		 * different values are used for different ensemble members. This default
		 * behavior helps improve the diversity in the ensemble; only override it if you
		 * are confident that the value you choose is appropriate for the data set.
		 * <p>
		 * API name: {@code n_neighbors}
		 */
		public Builder nNeighbors(@Nullable Integer value) {
			this.nNeighbors = value;
			return this;
		}

		/**
		 * The proportion of the data set that is assumed to be outlying prior to
		 * outlier detection. For example, 0.05 means it is assumed that 5% of values
		 * are real outliers and 95% are inliers.
		 * <p>
		 * API name: {@code outlier_fraction}
		 */
		public Builder outlierFraction(@Nullable Double value) {
			this.outlierFraction = value;
			return this;
		}

		/**
		 * If true, the following operation is performed on the columns before computing
		 * outlier scores: <code>(x_i - mean(x_i)) / sd(x_i)</code>.
		 * <p>
		 * API name: {@code standardization_enabled}
		 */
		public Builder standardizationEnabled(@Nullable Boolean value) {
			this.standardizationEnabled = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisOutlierDetection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisOutlierDetection build() {

			return new DataframeAnalysisOutlierDetection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalysisOutlierDetection}
	 */
	public static final JsonpDeserializer<DataframeAnalysisOutlierDetection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalysisOutlierDetection::setupDataframeAnalysisOutlierDetectionDeserializer,
					Builder::build);

	protected static void setupDataframeAnalysisOutlierDetectionDeserializer(
			DelegatingDeserializer<DataframeAnalysisOutlierDetection.Builder> op) {

		op.add(Builder::computeFeatureInfluence, JsonpDeserializer.booleanDeserializer(), "compute_feature_influence");
		op.add(Builder::featureInfluenceThreshold, JsonpDeserializer.doubleDeserializer(),
				"feature_influence_threshold");
		op.add(Builder::method, JsonpDeserializer.stringDeserializer(), "method");
		op.add(Builder::nNeighbors, JsonpDeserializer.integerDeserializer(), "n_neighbors");
		op.add(Builder::outlierFraction, JsonpDeserializer.doubleDeserializer(), "outlier_fraction");
		op.add(Builder::standardizationEnabled, JsonpDeserializer.booleanDeserializer(), "standardization_enabled");

	}

}
