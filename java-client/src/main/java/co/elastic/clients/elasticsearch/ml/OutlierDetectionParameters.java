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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.OutlierDetectionParameters
@JsonpDeserializable
public final class OutlierDetectionParameters implements JsonpSerializable {
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

	public OutlierDetectionParameters(Builder builder) {

		this.computeFeatureInfluence = builder.computeFeatureInfluence;
		this.featureInfluenceThreshold = builder.featureInfluenceThreshold;
		this.method = builder.method;
		this.nNeighbors = builder.nNeighbors;
		this.outlierFraction = builder.outlierFraction;
		this.standardizationEnabled = builder.standardizationEnabled;

	}

	public OutlierDetectionParameters(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code compute_feature_influence}
	 */
	@Nullable
	public Boolean computeFeatureInfluence() {
		return this.computeFeatureInfluence;
	}

	/**
	 * API name: {@code feature_influence_threshold}
	 */
	@Nullable
	public Double featureInfluenceThreshold() {
		return this.featureInfluenceThreshold;
	}

	/**
	 * API name: {@code method}
	 */
	@Nullable
	public String method() {
		return this.method;
	}

	/**
	 * API name: {@code n_neighbors}
	 */
	@Nullable
	public Integer nNeighbors() {
		return this.nNeighbors;
	}

	/**
	 * API name: {@code outlier_fraction}
	 */
	@Nullable
	public Double outlierFraction() {
		return this.outlierFraction;
	}

	/**
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
	 * Builder for {@link OutlierDetectionParameters}.
	 */
	public static class Builder implements ObjectBuilder<OutlierDetectionParameters> {
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
		 * API name: {@code compute_feature_influence}
		 */
		public Builder computeFeatureInfluence(@Nullable Boolean value) {
			this.computeFeatureInfluence = value;
			return this;
		}

		/**
		 * API name: {@code feature_influence_threshold}
		 */
		public Builder featureInfluenceThreshold(@Nullable Double value) {
			this.featureInfluenceThreshold = value;
			return this;
		}

		/**
		 * API name: {@code method}
		 */
		public Builder method(@Nullable String value) {
			this.method = value;
			return this;
		}

		/**
		 * API name: {@code n_neighbors}
		 */
		public Builder nNeighbors(@Nullable Integer value) {
			this.nNeighbors = value;
			return this;
		}

		/**
		 * API name: {@code outlier_fraction}
		 */
		public Builder outlierFraction(@Nullable Double value) {
			this.outlierFraction = value;
			return this;
		}

		/**
		 * API name: {@code standardization_enabled}
		 */
		public Builder standardizationEnabled(@Nullable Boolean value) {
			this.standardizationEnabled = value;
			return this;
		}

		/**
		 * Builds a {@link OutlierDetectionParameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OutlierDetectionParameters build() {

			return new OutlierDetectionParameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OutlierDetectionParameters}
	 */
	public static final JsonpDeserializer<OutlierDetectionParameters> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, OutlierDetectionParameters::setupOutlierDetectionParametersDeserializer, Builder::build);

	protected static void setupOutlierDetectionParametersDeserializer(
			DelegatingDeserializer<OutlierDetectionParameters.Builder> op) {

		op.add(Builder::computeFeatureInfluence, JsonpDeserializer.booleanDeserializer(), "compute_feature_influence");
		op.add(Builder::featureInfluenceThreshold, JsonpDeserializer.doubleDeserializer(),
				"feature_influence_threshold");
		op.add(Builder::method, JsonpDeserializer.stringDeserializer(), "method");
		op.add(Builder::nNeighbors, JsonpDeserializer.integerDeserializer(), "n_neighbors");
		op.add(Builder::outlierFraction, JsonpDeserializer.doubleDeserializer(), "outlier_fraction");
		op.add(Builder::standardizationEnabled, JsonpDeserializer.booleanDeserializer(), "standardization_enabled");

	}

}
