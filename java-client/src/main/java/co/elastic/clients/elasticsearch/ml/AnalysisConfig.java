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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.AnalysisConfig
public final class AnalysisConfig implements ToJsonp {
	private final String bucketSpan;

	@Nullable
	private final String categorizationFieldName;

	@Nullable
	private final List<String> categorizationFilters;

	private final List<Detector> detectors;

	private final List<String> influencers;

	@Nullable
	private final JsonValue latency;

	@Nullable
	private final Boolean multivariateByFields;

	@Nullable
	private final PerPartitionCategorization perPartitionCategorization;

	@Nullable
	private final String summaryCountFieldName;

	@Nullable
	private final JsonValue categorizationAnalyzer;

	// ---------------------------------------------------------------------------------------------

	protected AnalysisConfig(Builder builder) {

		this.bucketSpan = Objects.requireNonNull(builder.bucketSpan, "bucket_span");
		this.categorizationFieldName = builder.categorizationFieldName;
		this.categorizationFilters = builder.categorizationFilters;
		this.detectors = Objects.requireNonNull(builder.detectors, "detectors");
		this.influencers = Objects.requireNonNull(builder.influencers, "influencers");
		this.latency = builder.latency;
		this.multivariateByFields = builder.multivariateByFields;
		this.perPartitionCategorization = builder.perPartitionCategorization;
		this.summaryCountFieldName = builder.summaryCountFieldName;
		this.categorizationAnalyzer = builder.categorizationAnalyzer;

	}

	/**
	 * API name: {@code bucket_span}
	 */
	public String bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * API name: {@code categorization_field_name}
	 */
	@Nullable
	public String categorizationFieldName() {
		return this.categorizationFieldName;
	}

	/**
	 * API name: {@code categorization_filters}
	 */
	@Nullable
	public List<String> categorizationFilters() {
		return this.categorizationFilters;
	}

	/**
	 * API name: {@code detectors}
	 */
	public List<Detector> detectors() {
		return this.detectors;
	}

	/**
	 * API name: {@code influencers}
	 */
	public List<String> influencers() {
		return this.influencers;
	}

	/**
	 * API name: {@code latency}
	 */
	@Nullable
	public JsonValue latency() {
		return this.latency;
	}

	/**
	 * API name: {@code multivariate_by_fields}
	 */
	@Nullable
	public Boolean multivariateByFields() {
		return this.multivariateByFields;
	}

	/**
	 * API name: {@code per_partition_categorization}
	 */
	@Nullable
	public PerPartitionCategorization perPartitionCategorization() {
		return this.perPartitionCategorization;
	}

	/**
	 * API name: {@code summary_count_field_name}
	 */
	@Nullable
	public String summaryCountFieldName() {
		return this.summaryCountFieldName;
	}

	/**
	 * API name: {@code categorization_analyzer}
	 */
	@Nullable
	public JsonValue categorizationAnalyzer() {
		return this.categorizationAnalyzer;
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

		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		if (this.categorizationFieldName != null) {

			generator.writeKey("categorization_field_name");
			generator.write(this.categorizationFieldName);

		}
		if (this.categorizationFilters != null) {

			generator.writeKey("categorization_filters");
			generator.writeStartArray();
			for (String item0 : this.categorizationFilters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("detectors");
		generator.writeStartArray();
		for (Detector item0 : this.detectors) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("influencers");
		generator.writeStartArray();
		for (String item0 : this.influencers) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.latency != null) {

			generator.writeKey("latency");
			generator.write(this.latency);

		}
		if (this.multivariateByFields != null) {

			generator.writeKey("multivariate_by_fields");
			generator.write(this.multivariateByFields);

		}
		if (this.perPartitionCategorization != null) {

			generator.writeKey("per_partition_categorization");
			this.perPartitionCategorization.toJsonp(generator, mapper);

		}
		if (this.summaryCountFieldName != null) {

			generator.writeKey("summary_count_field_name");
			generator.write(this.summaryCountFieldName);

		}
		if (this.categorizationAnalyzer != null) {

			generator.writeKey("categorization_analyzer");
			generator.write(this.categorizationAnalyzer);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalysisConfig}.
	 */
	public static class Builder implements ObjectBuilder<AnalysisConfig> {
		private String bucketSpan;

		@Nullable
		private String categorizationFieldName;

		@Nullable
		private List<String> categorizationFilters;

		private List<Detector> detectors;

		private List<String> influencers;

		@Nullable
		private JsonValue latency;

		@Nullable
		private Boolean multivariateByFields;

		@Nullable
		private PerPartitionCategorization perPartitionCategorization;

		@Nullable
		private String summaryCountFieldName;

		@Nullable
		private JsonValue categorizationAnalyzer;

		/**
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(String value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * API name: {@code categorization_field_name}
		 */
		public Builder categorizationFieldName(@Nullable String value) {
			this.categorizationFieldName = value;
			return this;
		}

		/**
		 * API name: {@code categorization_filters}
		 */
		public Builder categorizationFilters(@Nullable List<String> value) {
			this.categorizationFilters = value;
			return this;
		}

		/**
		 * API name: {@code categorization_filters}
		 */
		public Builder categorizationFilters(String... value) {
			this.categorizationFilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #categorizationFilters(List)}, creating the list if
		 * needed.
		 */
		public Builder addCategorizationFilters(String value) {
			if (this.categorizationFilters == null) {
				this.categorizationFilters = new ArrayList<>();
			}
			this.categorizationFilters.add(value);
			return this;
		}

		/**
		 * API name: {@code detectors}
		 */
		public Builder detectors(List<Detector> value) {
			this.detectors = value;
			return this;
		}

		/**
		 * API name: {@code detectors}
		 */
		public Builder detectors(Detector... value) {
			this.detectors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #detectors(List)}, creating the list if needed.
		 */
		public Builder addDetectors(Detector value) {
			if (this.detectors == null) {
				this.detectors = new ArrayList<>();
			}
			this.detectors.add(value);
			return this;
		}

		/**
		 * Set {@link #detectors(List)} to a singleton list.
		 */
		public Builder detectors(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return this.detectors(fn.apply(new Detector.Builder()).build());
		}

		/**
		 * Add a value to {@link #detectors(List)}, creating the list if needed.
		 */
		public Builder addDetectors(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return this.addDetectors(fn.apply(new Detector.Builder()).build());
		}

		/**
		 * API name: {@code influencers}
		 */
		public Builder influencers(List<String> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * API name: {@code influencers}
		 */
		public Builder influencers(String... value) {
			this.influencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed.
		 */
		public Builder addInfluencers(String value) {
			if (this.influencers == null) {
				this.influencers = new ArrayList<>();
			}
			this.influencers.add(value);
			return this;
		}

		/**
		 * API name: {@code latency}
		 */
		public Builder latency(@Nullable JsonValue value) {
			this.latency = value;
			return this;
		}

		/**
		 * API name: {@code multivariate_by_fields}
		 */
		public Builder multivariateByFields(@Nullable Boolean value) {
			this.multivariateByFields = value;
			return this;
		}

		/**
		 * API name: {@code per_partition_categorization}
		 */
		public Builder perPartitionCategorization(@Nullable PerPartitionCategorization value) {
			this.perPartitionCategorization = value;
			return this;
		}

		/**
		 * API name: {@code per_partition_categorization}
		 */
		public Builder perPartitionCategorization(
				Function<PerPartitionCategorization.Builder, ObjectBuilder<PerPartitionCategorization>> fn) {
			return this.perPartitionCategorization(fn.apply(new PerPartitionCategorization.Builder()).build());
		}

		/**
		 * API name: {@code summary_count_field_name}
		 */
		public Builder summaryCountFieldName(@Nullable String value) {
			this.summaryCountFieldName = value;
			return this;
		}

		/**
		 * API name: {@code categorization_analyzer}
		 */
		public Builder categorizationAnalyzer(@Nullable JsonValue value) {
			this.categorizationAnalyzer = value;
			return this;
		}

		/**
		 * Builds a {@link AnalysisConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalysisConfig build() {

			return new AnalysisConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AnalysisConfig
	 */
	public static final JsonpDeserializer<AnalysisConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnalysisConfig::setupAnalysisConfigDeserializer);

	protected static void setupAnalysisConfigDeserializer(DelegatingDeserializer<AnalysisConfig.Builder> op) {

		op.add(Builder::bucketSpan, JsonpDeserializer.stringDeserializer(), "bucket_span");
		op.add(Builder::categorizationFieldName, JsonpDeserializer.stringDeserializer(), "categorization_field_name");
		op.add(Builder::categorizationFilters,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "categorization_filters");
		op.add(Builder::detectors, JsonpDeserializer.arrayDeserializer(Detector.DESERIALIZER), "detectors");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"influencers");
		op.add(Builder::latency, JsonpDeserializer.jsonValueDeserializer(), "latency");
		op.add(Builder::multivariateByFields, JsonpDeserializer.booleanDeserializer(), "multivariate_by_fields");
		op.add(Builder::perPartitionCategorization, PerPartitionCategorization.DESERIALIZER,
				"per_partition_categorization");
		op.add(Builder::summaryCountFieldName, JsonpDeserializer.stringDeserializer(), "summary_count_field_name");
		op.add(Builder::categorizationAnalyzer, JsonpDeserializer.jsonValueDeserializer(), "categorization_analyzer");

	}

}
