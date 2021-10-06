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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.AnalysisConfigRead
@JsonpDeserializable
public final class AnalysisConfigRead implements JsonpSerializable {
	private final String bucketSpan;

	@Nullable
	private final CategorizationAnalyzer categorizationAnalyzer;

	@Nullable
	private final String categorizationFieldName;

	@Nullable
	private final List<String> categorizationFilters;

	private final List<Detector> detectors;

	private final List<String> influencers;

	@Nullable
	private final String modelPruneWindow;

	@Nullable
	private final String latency;

	@Nullable
	private final Boolean multivariateByFields;

	@Nullable
	private final PerPartitionCategorization perPartitionCategorization;

	@Nullable
	private final String summaryCountFieldName;

	// ---------------------------------------------------------------------------------------------

	public AnalysisConfigRead(Builder builder) {

		this.bucketSpan = Objects.requireNonNull(builder.bucketSpan, "bucket_span");
		this.categorizationAnalyzer = builder.categorizationAnalyzer;
		this.categorizationFieldName = builder.categorizationFieldName;
		this.categorizationFilters = ModelTypeHelper.unmodifiable(builder.categorizationFilters);
		this.detectors = ModelTypeHelper.unmodifiableNonNull(builder.detectors, "detectors");
		this.influencers = ModelTypeHelper.unmodifiableNonNull(builder.influencers, "influencers");
		this.modelPruneWindow = builder.modelPruneWindow;
		this.latency = builder.latency;
		this.multivariateByFields = builder.multivariateByFields;
		this.perPartitionCategorization = builder.perPartitionCategorization;
		this.summaryCountFieldName = builder.summaryCountFieldName;

	}

	public AnalysisConfigRead(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The size of the interval that the analysis is aggregated into,
	 * typically between 5m and 1h. If the anomaly detection job uses a datafeed
	 * with aggregations, this value must be divisible by the interval of the date
	 * histogram aggregation.
	 * <ul>
	 * <li>@server_default 5m</li>
	 * </ul>
	 * <p>
	 * API name: {@code bucket_span}
	 */
	public String bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * If <code>categorization_field_name</code> is specified, you can also define
	 * the analyzer that is used to interpret the categorization field. This
	 * property cannot be used at the same time as
	 * <code>categorization_filters</code>. The categorization analyzer specifies
	 * how the <code>categorization_field</code> is interpreted by the
	 * categorization process. The <code>categorization_analyzer</code> field can be
	 * specified either as a string or as an object. If it is a string it must refer
	 * to a built-in analyzer or one added by another plugin.
	 * <p>
	 * API name: {@code categorization_analyzer}
	 */
	@Nullable
	public CategorizationAnalyzer categorizationAnalyzer() {
		return this.categorizationAnalyzer;
	}

	/**
	 * If this property is specified, the values of the specified field will be
	 * categorized. The resulting categories must be used in a detector by setting
	 * <code>by_field_name</code>, <code>over_field_name</code>, or
	 * <code>partition_field_name</code> to the keyword <code>mlcategory</code>.
	 * <p>
	 * API name: {@code categorization_field_name}
	 */
	@Nullable
	public String categorizationFieldName() {
		return this.categorizationFieldName;
	}

	/**
	 * If <code>categorization_field_name</code> is specified, you can also define
	 * optional filters. This property expects an array of regular expressions. The
	 * expressions are used to filter out matching sequences from the categorization
	 * field values. You can use this functionality to fine tune the categorization
	 * by excluding sequences from consideration when categories are defined. For
	 * example, you can exclude SQL statements that appear in your log files. This
	 * property cannot be used at the same time as
	 * <code>categorization_analyzer</code>. If you only want to define simple
	 * regular expression filters that are applied prior to tokenization, setting
	 * this property is the easiest method. If you also want to customize the
	 * tokenizer or post-tokenization filtering, use the
	 * <code>categorization_analyzer</code> property instead and include the filters
	 * as pattern_replace character filters. The effect is exactly the same.
	 * <p>
	 * API name: {@code categorization_filters}
	 */
	@Nullable
	public List<String> categorizationFilters() {
		return this.categorizationFilters;
	}

	/**
	 * Required - Detector configuration objects specify which data fields a job
	 * analyzes. They also specify which analytical functions are used. You can
	 * specify multiple detectors for a job. If the detectors array does not contain
	 * at least one detector, no analysis can occur and an error is returned.
	 * <p>
	 * API name: {@code detectors}
	 */
	public List<Detector> detectors() {
		return this.detectors;
	}

	/**
	 * Required - A comma separated list of influencer field names. Typically these
	 * can be the by, over, or partition fields that are used in the detector
	 * configuration. You might also want to use a field name that is not
	 * specifically named in a detector, but is available as part of the input data.
	 * When you use multiple detectors, the use of influencers is recommended as it
	 * aggregates results for each influencer entity.
	 * <p>
	 * API name: {@code influencers}
	 */
	public List<String> influencers() {
		return this.influencers;
	}

	/**
	 * Advanced configuration option. Affects the pruning of models that have not
	 * been updated for the given time duration. The value must be set to a multiple
	 * of the <code>bucket_span</code>. If set too low, important information may be
	 * removed from the model. Typically, set to <code>30d</code> or longer. If not
	 * set, model pruning only occurs if the model memory status reaches the soft
	 * limit or the hard limit.
	 * <p>
	 * API name: {@code model_prune_window}
	 */
	@Nullable
	public String modelPruneWindow() {
		return this.modelPruneWindow;
	}

	/**
	 * The size of the window in which to expect data that is out of time order. If
	 * you specify a non-zero value, it must be greater than or equal to one second.
	 * NOTE: Latency is only applicable when you send data by using the post data
	 * API.
	 * <p>
	 * API name: {@code latency}
	 */
	@Nullable
	public String latency() {
		return this.latency;
	}

	/**
	 * This functionality is reserved for internal use. It is not supported for use
	 * in customer environments and is not subject to the support SLA of official GA
	 * features. If set to true, the analysis will automatically find correlations
	 * between metrics for a given by field value and report anomalies when those
	 * correlations cease to hold. For example, suppose CPU and memory usage on host
	 * A is usually highly correlated with the same metrics on host B. Perhaps this
	 * correlation occurs because they are running a load-balanced application. If
	 * you enable this property, anomalies will be reported when, for example, CPU
	 * usage on host A is high and the value of CPU usage on host B is low. That is
	 * to say, you’ll see an anomaly when the CPU of host A is unusual given the CPU
	 * of host B. To use the <code>multivariate_by_fields</code> property, you must
	 * also specify <code>by_field_name</code> in your detector.
	 * <p>
	 * API name: {@code multivariate_by_fields}
	 */
	@Nullable
	public Boolean multivariateByFields() {
		return this.multivariateByFields;
	}

	/**
	 * Settings related to how categorization interacts with partition fields.
	 * <p>
	 * API name: {@code per_partition_categorization}
	 */
	@Nullable
	public PerPartitionCategorization perPartitionCategorization() {
		return this.perPartitionCategorization;
	}

	/**
	 * If this property is specified, the data that is fed to the job is expected to
	 * be pre-summarized. This property value is the name of the field that contains
	 * the count of raw data points that have been summarized. The same
	 * <code>summary_count_field_name</code> applies to all detectors in the job.
	 * NOTE: The <code>summary_count_field_name</code> property cannot be used with
	 * the <code>metric</code> function.
	 * <p>
	 * API name: {@code summary_count_field_name}
	 */
	@Nullable
	public String summaryCountFieldName() {
		return this.summaryCountFieldName;
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

		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		if (this.categorizationAnalyzer != null) {

			generator.writeKey("categorization_analyzer");
			this.categorizationAnalyzer.serialize(generator, mapper);

		}
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
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("influencers");
		generator.writeStartArray();
		for (String item0 : this.influencers) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.modelPruneWindow != null) {

			generator.writeKey("model_prune_window");
			generator.write(this.modelPruneWindow);

		}
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
			this.perPartitionCategorization.serialize(generator, mapper);

		}
		if (this.summaryCountFieldName != null) {

			generator.writeKey("summary_count_field_name");
			generator.write(this.summaryCountFieldName);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalysisConfigRead}.
	 */
	public static class Builder implements ObjectBuilder<AnalysisConfigRead> {
		private String bucketSpan;

		@Nullable
		private CategorizationAnalyzer categorizationAnalyzer;

		@Nullable
		private String categorizationFieldName;

		@Nullable
		private List<String> categorizationFilters;

		private List<Detector> detectors;

		private List<String> influencers;

		@Nullable
		private String modelPruneWindow;

		@Nullable
		private String latency;

		@Nullable
		private Boolean multivariateByFields;

		@Nullable
		private PerPartitionCategorization perPartitionCategorization;

		@Nullable
		private String summaryCountFieldName;

		/**
		 * Required - The size of the interval that the analysis is aggregated into,
		 * typically between 5m and 1h. If the anomaly detection job uses a datafeed
		 * with aggregations, this value must be divisible by the interval of the date
		 * histogram aggregation.
		 * <ul>
		 * <li>@server_default 5m</li>
		 * </ul>
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(String value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * If <code>categorization_field_name</code> is specified, you can also define
		 * the analyzer that is used to interpret the categorization field. This
		 * property cannot be used at the same time as
		 * <code>categorization_filters</code>. The categorization analyzer specifies
		 * how the <code>categorization_field</code> is interpreted by the
		 * categorization process. The <code>categorization_analyzer</code> field can be
		 * specified either as a string or as an object. If it is a string it must refer
		 * to a built-in analyzer or one added by another plugin.
		 * <p>
		 * API name: {@code categorization_analyzer}
		 */
		public Builder categorizationAnalyzer(@Nullable CategorizationAnalyzer value) {
			this.categorizationAnalyzer = value;
			return this;
		}

		/**
		 * If <code>categorization_field_name</code> is specified, you can also define
		 * the analyzer that is used to interpret the categorization field. This
		 * property cannot be used at the same time as
		 * <code>categorization_filters</code>. The categorization analyzer specifies
		 * how the <code>categorization_field</code> is interpreted by the
		 * categorization process. The <code>categorization_analyzer</code> field can be
		 * specified either as a string or as an object. If it is a string it must refer
		 * to a built-in analyzer or one added by another plugin.
		 * <p>
		 * API name: {@code categorization_analyzer}
		 */
		public Builder categorizationAnalyzer(
				Function<CategorizationAnalyzer.Builder, ObjectBuilder<CategorizationAnalyzer>> fn) {
			return this.categorizationAnalyzer(fn.apply(new CategorizationAnalyzer.Builder()).build());
		}

		/**
		 * If this property is specified, the values of the specified field will be
		 * categorized. The resulting categories must be used in a detector by setting
		 * <code>by_field_name</code>, <code>over_field_name</code>, or
		 * <code>partition_field_name</code> to the keyword <code>mlcategory</code>.
		 * <p>
		 * API name: {@code categorization_field_name}
		 */
		public Builder categorizationFieldName(@Nullable String value) {
			this.categorizationFieldName = value;
			return this;
		}

		/**
		 * If <code>categorization_field_name</code> is specified, you can also define
		 * optional filters. This property expects an array of regular expressions. The
		 * expressions are used to filter out matching sequences from the categorization
		 * field values. You can use this functionality to fine tune the categorization
		 * by excluding sequences from consideration when categories are defined. For
		 * example, you can exclude SQL statements that appear in your log files. This
		 * property cannot be used at the same time as
		 * <code>categorization_analyzer</code>. If you only want to define simple
		 * regular expression filters that are applied prior to tokenization, setting
		 * this property is the easiest method. If you also want to customize the
		 * tokenizer or post-tokenization filtering, use the
		 * <code>categorization_analyzer</code> property instead and include the filters
		 * as pattern_replace character filters. The effect is exactly the same.
		 * <p>
		 * API name: {@code categorization_filters}
		 */
		public Builder categorizationFilters(@Nullable List<String> value) {
			this.categorizationFilters = value;
			return this;
		}

		/**
		 * If <code>categorization_field_name</code> is specified, you can also define
		 * optional filters. This property expects an array of regular expressions. The
		 * expressions are used to filter out matching sequences from the categorization
		 * field values. You can use this functionality to fine tune the categorization
		 * by excluding sequences from consideration when categories are defined. For
		 * example, you can exclude SQL statements that appear in your log files. This
		 * property cannot be used at the same time as
		 * <code>categorization_analyzer</code>. If you only want to define simple
		 * regular expression filters that are applied prior to tokenization, setting
		 * this property is the easiest method. If you also want to customize the
		 * tokenizer or post-tokenization filtering, use the
		 * <code>categorization_analyzer</code> property instead and include the filters
		 * as pattern_replace character filters. The effect is exactly the same.
		 * <p>
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
		 * Required - Detector configuration objects specify which data fields a job
		 * analyzes. They also specify which analytical functions are used. You can
		 * specify multiple detectors for a job. If the detectors array does not contain
		 * at least one detector, no analysis can occur and an error is returned.
		 * <p>
		 * API name: {@code detectors}
		 */
		public Builder detectors(List<Detector> value) {
			this.detectors = value;
			return this;
		}

		/**
		 * Required - Detector configuration objects specify which data fields a job
		 * analyzes. They also specify which analytical functions are used. You can
		 * specify multiple detectors for a job. If the detectors array does not contain
		 * at least one detector, no analysis can occur and an error is returned.
		 * <p>
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
		 * Required - A comma separated list of influencer field names. Typically these
		 * can be the by, over, or partition fields that are used in the detector
		 * configuration. You might also want to use a field name that is not
		 * specifically named in a detector, but is available as part of the input data.
		 * When you use multiple detectors, the use of influencers is recommended as it
		 * aggregates results for each influencer entity.
		 * <p>
		 * API name: {@code influencers}
		 */
		public Builder influencers(List<String> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * Required - A comma separated list of influencer field names. Typically these
		 * can be the by, over, or partition fields that are used in the detector
		 * configuration. You might also want to use a field name that is not
		 * specifically named in a detector, but is available as part of the input data.
		 * When you use multiple detectors, the use of influencers is recommended as it
		 * aggregates results for each influencer entity.
		 * <p>
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
		 * Advanced configuration option. Affects the pruning of models that have not
		 * been updated for the given time duration. The value must be set to a multiple
		 * of the <code>bucket_span</code>. If set too low, important information may be
		 * removed from the model. Typically, set to <code>30d</code> or longer. If not
		 * set, model pruning only occurs if the model memory status reaches the soft
		 * limit or the hard limit.
		 * <p>
		 * API name: {@code model_prune_window}
		 */
		public Builder modelPruneWindow(@Nullable String value) {
			this.modelPruneWindow = value;
			return this;
		}

		/**
		 * The size of the window in which to expect data that is out of time order. If
		 * you specify a non-zero value, it must be greater than or equal to one second.
		 * NOTE: Latency is only applicable when you send data by using the post data
		 * API.
		 * <p>
		 * API name: {@code latency}
		 */
		public Builder latency(@Nullable String value) {
			this.latency = value;
			return this;
		}

		/**
		 * This functionality is reserved for internal use. It is not supported for use
		 * in customer environments and is not subject to the support SLA of official GA
		 * features. If set to true, the analysis will automatically find correlations
		 * between metrics for a given by field value and report anomalies when those
		 * correlations cease to hold. For example, suppose CPU and memory usage on host
		 * A is usually highly correlated with the same metrics on host B. Perhaps this
		 * correlation occurs because they are running a load-balanced application. If
		 * you enable this property, anomalies will be reported when, for example, CPU
		 * usage on host A is high and the value of CPU usage on host B is low. That is
		 * to say, you’ll see an anomaly when the CPU of host A is unusual given the CPU
		 * of host B. To use the <code>multivariate_by_fields</code> property, you must
		 * also specify <code>by_field_name</code> in your detector.
		 * <p>
		 * API name: {@code multivariate_by_fields}
		 */
		public Builder multivariateByFields(@Nullable Boolean value) {
			this.multivariateByFields = value;
			return this;
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 * <p>
		 * API name: {@code per_partition_categorization}
		 */
		public Builder perPartitionCategorization(@Nullable PerPartitionCategorization value) {
			this.perPartitionCategorization = value;
			return this;
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 * <p>
		 * API name: {@code per_partition_categorization}
		 */
		public Builder perPartitionCategorization(
				Function<PerPartitionCategorization.Builder, ObjectBuilder<PerPartitionCategorization>> fn) {
			return this.perPartitionCategorization(fn.apply(new PerPartitionCategorization.Builder()).build());
		}

		/**
		 * If this property is specified, the data that is fed to the job is expected to
		 * be pre-summarized. This property value is the name of the field that contains
		 * the count of raw data points that have been summarized. The same
		 * <code>summary_count_field_name</code> applies to all detectors in the job.
		 * NOTE: The <code>summary_count_field_name</code> property cannot be used with
		 * the <code>metric</code> function.
		 * <p>
		 * API name: {@code summary_count_field_name}
		 */
		public Builder summaryCountFieldName(@Nullable String value) {
			this.summaryCountFieldName = value;
			return this;
		}

		/**
		 * Builds a {@link AnalysisConfigRead}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalysisConfigRead build() {

			return new AnalysisConfigRead(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalysisConfigRead}
	 */
	public static final JsonpDeserializer<AnalysisConfigRead> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AnalysisConfigRead::setupAnalysisConfigReadDeserializer, Builder::build);

	protected static void setupAnalysisConfigReadDeserializer(DelegatingDeserializer<AnalysisConfigRead.Builder> op) {

		op.add(Builder::bucketSpan, JsonpDeserializer.stringDeserializer(), "bucket_span");
		op.add(Builder::categorizationAnalyzer, CategorizationAnalyzer._DESERIALIZER, "categorization_analyzer");
		op.add(Builder::categorizationFieldName, JsonpDeserializer.stringDeserializer(), "categorization_field_name");
		op.add(Builder::categorizationFilters,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "categorization_filters");
		op.add(Builder::detectors, JsonpDeserializer.arrayDeserializer(Detector._DESERIALIZER), "detectors");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"influencers");
		op.add(Builder::modelPruneWindow, JsonpDeserializer.stringDeserializer(), "model_prune_window");
		op.add(Builder::latency, JsonpDeserializer.stringDeserializer(), "latency");
		op.add(Builder::multivariateByFields, JsonpDeserializer.booleanDeserializer(), "multivariate_by_fields");
		op.add(Builder::perPartitionCategorization, PerPartitionCategorization._DESERIALIZER,
				"per_partition_categorization");
		op.add(Builder::summaryCountFieldName, JsonpDeserializer.stringDeserializer(), "summary_count_field_name");

	}

}
