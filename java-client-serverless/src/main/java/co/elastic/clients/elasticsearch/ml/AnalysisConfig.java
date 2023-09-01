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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.AnalysisConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.AnalysisConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnalysisConfig implements JsonpSerializable {
	@Nullable
	private final Time bucketSpan;

	@Nullable
	private final CategorizationAnalyzer categorizationAnalyzer;

	@Nullable
	private final String categorizationFieldName;

	private final List<String> categorizationFilters;

	private final List<Detector> detectors;

	private final List<String> influencers;

	@Nullable
	private final Time latency;

	@Nullable
	private final Time modelPruneWindow;

	@Nullable
	private final Boolean multivariateByFields;

	@Nullable
	private final PerPartitionCategorization perPartitionCategorization;

	@Nullable
	private final String summaryCountFieldName;

	// ---------------------------------------------------------------------------------------------

	private AnalysisConfig(Builder builder) {

		this.bucketSpan = builder.bucketSpan;
		this.categorizationAnalyzer = builder.categorizationAnalyzer;
		this.categorizationFieldName = builder.categorizationFieldName;
		this.categorizationFilters = ApiTypeHelper.unmodifiable(builder.categorizationFilters);
		this.detectors = ApiTypeHelper.unmodifiableRequired(builder.detectors, this, "detectors");
		this.influencers = ApiTypeHelper.unmodifiable(builder.influencers);
		this.latency = builder.latency;
		this.modelPruneWindow = builder.modelPruneWindow;
		this.multivariateByFields = builder.multivariateByFields;
		this.perPartitionCategorization = builder.perPartitionCategorization;
		this.summaryCountFieldName = builder.summaryCountFieldName;

	}

	public static AnalysisConfig of(Function<Builder, ObjectBuilder<AnalysisConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The size of the interval that the analysis is aggregated into, typically
	 * between <code>5m</code> and <code>1h</code>. This value should be either a
	 * whole number of days or equate to a whole number of buckets in one day. If
	 * the anomaly detection job uses a datafeed with aggregations, this value must
	 * also be divisible by the interval of the date histogram aggregation.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	@Nullable
	public final Time bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * If <code>categorization_field_name</code> is specified, you can also define
	 * the analyzer that is used to interpret the categorization field. This
	 * property cannot be used at the same time as
	 * <code>categorization_filters</code>. The categorization analyzer specifies
	 * how the <code>categorization_field</code> is interpreted by the
	 * categorization process. The <code>categorization_analyzer</code> field can be
	 * specified either as a string or as an object. If it is a string, it must
	 * refer to a built-in analyzer or one added by another plugin.
	 * <p>
	 * API name: {@code categorization_analyzer}
	 */
	@Nullable
	public final CategorizationAnalyzer categorizationAnalyzer() {
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
	public final String categorizationFieldName() {
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
	public final List<String> categorizationFilters() {
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
	public final List<Detector> detectors() {
		return this.detectors;
	}

	/**
	 * A comma separated list of influencer field names. Typically these can be the
	 * by, over, or partition fields that are used in the detector configuration.
	 * You might also want to use a field name that is not specifically named in a
	 * detector, but is available as part of the input data. When you use multiple
	 * detectors, the use of influencers is recommended as it aggregates results for
	 * each influencer entity.
	 * <p>
	 * API name: {@code influencers}
	 */
	public final List<String> influencers() {
		return this.influencers;
	}

	/**
	 * The size of the window in which to expect data that is out of time order. If
	 * you specify a non-zero value, it must be greater than or equal to one second.
	 * NOTE: Latency is applicable only when you send data by using the post data
	 * API.
	 * <p>
	 * API name: {@code latency}
	 */
	@Nullable
	public final Time latency() {
		return this.latency;
	}

	/**
	 * Advanced configuration option. Affects the pruning of models that have not
	 * been updated for the given time duration. The value must be set to a multiple
	 * of the <code>bucket_span</code>. If set too low, important information may be
	 * removed from the model. For jobs created in 8.1 and later, the default value
	 * is the greater of <code>30d</code> or 20 times <code>bucket_span</code>.
	 * <p>
	 * API name: {@code model_prune_window}
	 */
	@Nullable
	public final Time modelPruneWindow() {
		return this.modelPruneWindow;
	}

	/**
	 * This functionality is reserved for internal use. It is not supported for use
	 * in customer environments and is not subject to the support SLA of official GA
	 * features. If set to <code>true</code>, the analysis will automatically find
	 * correlations between metrics for a given by field value and report anomalies
	 * when those correlations cease to hold. For example, suppose CPU and memory
	 * usage on host A is usually highly correlated with the same metrics on host B.
	 * Perhaps this correlation occurs because they are running a load-balanced
	 * application. If you enable this property, anomalies will be reported when,
	 * for example, CPU usage on host A is high and the value of CPU usage on host B
	 * is low. That is to say, you’ll see an anomaly when the CPU of host A is
	 * unusual given the CPU of host B. To use the
	 * <code>multivariate_by_fields</code> property, you must also specify
	 * <code>by_field_name</code> in your detector.
	 * <p>
	 * API name: {@code multivariate_by_fields}
	 */
	@Nullable
	public final Boolean multivariateByFields() {
		return this.multivariateByFields;
	}

	/**
	 * Settings related to how categorization interacts with partition fields.
	 * <p>
	 * API name: {@code per_partition_categorization}
	 */
	@Nullable
	public final PerPartitionCategorization perPartitionCategorization() {
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
	public final String summaryCountFieldName() {
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

		if (this.bucketSpan != null) {
			generator.writeKey("bucket_span");
			this.bucketSpan.serialize(generator, mapper);

		}
		if (this.categorizationAnalyzer != null) {
			generator.writeKey("categorization_analyzer");
			this.categorizationAnalyzer.serialize(generator, mapper);

		}
		if (this.categorizationFieldName != null) {
			generator.writeKey("categorization_field_name");
			generator.write(this.categorizationFieldName);

		}
		if (ApiTypeHelper.isDefined(this.categorizationFilters)) {
			generator.writeKey("categorization_filters");
			generator.writeStartArray();
			for (String item0 : this.categorizationFilters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.detectors)) {
			generator.writeKey("detectors");
			generator.writeStartArray();
			for (Detector item0 : this.detectors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.influencers)) {
			generator.writeKey("influencers");
			generator.writeStartArray();
			for (String item0 : this.influencers) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.latency != null) {
			generator.writeKey("latency");
			this.latency.serialize(generator, mapper);

		}
		if (this.modelPruneWindow != null) {
			generator.writeKey("model_prune_window");
			this.modelPruneWindow.serialize(generator, mapper);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalysisConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AnalysisConfig> {
		@Nullable
		private Time bucketSpan;

		@Nullable
		private CategorizationAnalyzer categorizationAnalyzer;

		@Nullable
		private String categorizationFieldName;

		@Nullable
		private List<String> categorizationFilters;

		private List<Detector> detectors;

		@Nullable
		private List<String> influencers;

		@Nullable
		private Time latency;

		@Nullable
		private Time modelPruneWindow;

		@Nullable
		private Boolean multivariateByFields;

		@Nullable
		private PerPartitionCategorization perPartitionCategorization;

		@Nullable
		private String summaryCountFieldName;

		/**
		 * The size of the interval that the analysis is aggregated into, typically
		 * between <code>5m</code> and <code>1h</code>. This value should be either a
		 * whole number of days or equate to a whole number of buckets in one day. If
		 * the anomaly detection job uses a datafeed with aggregations, this value must
		 * also be divisible by the interval of the date histogram aggregation.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(@Nullable Time value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * The size of the interval that the analysis is aggregated into, typically
		 * between <code>5m</code> and <code>1h</code>. This value should be either a
		 * whole number of days or equate to a whole number of buckets in one day. If
		 * the anomaly detection job uses a datafeed with aggregations, this value must
		 * also be divisible by the interval of the date histogram aggregation.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.bucketSpan(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>categorization_field_name</code> is specified, you can also define
		 * the analyzer that is used to interpret the categorization field. This
		 * property cannot be used at the same time as
		 * <code>categorization_filters</code>. The categorization analyzer specifies
		 * how the <code>categorization_field</code> is interpreted by the
		 * categorization process. The <code>categorization_analyzer</code> field can be
		 * specified either as a string or as an object. If it is a string, it must
		 * refer to a built-in analyzer or one added by another plugin.
		 * <p>
		 * API name: {@code categorization_analyzer}
		 */
		public final Builder categorizationAnalyzer(@Nullable CategorizationAnalyzer value) {
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
		 * specified either as a string or as an object. If it is a string, it must
		 * refer to a built-in analyzer or one added by another plugin.
		 * <p>
		 * API name: {@code categorization_analyzer}
		 */
		public final Builder categorizationAnalyzer(
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
		public final Builder categorizationFieldName(@Nullable String value) {
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>categorizationFilters</code>.
		 */
		public final Builder categorizationFilters(List<String> list) {
			this.categorizationFilters = _listAddAll(this.categorizationFilters, list);
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
		 * <p>
		 * Adds one or more values to <code>categorizationFilters</code>.
		 */
		public final Builder categorizationFilters(String value, String... values) {
			this.categorizationFilters = _listAdd(this.categorizationFilters, value, values);
			return this;
		}

		/**
		 * Required - Detector configuration objects specify which data fields a job
		 * analyzes. They also specify which analytical functions are used. You can
		 * specify multiple detectors for a job. If the detectors array does not contain
		 * at least one detector, no analysis can occur and an error is returned.
		 * <p>
		 * API name: {@code detectors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>detectors</code>.
		 */
		public final Builder detectors(List<Detector> list) {
			this.detectors = _listAddAll(this.detectors, list);
			return this;
		}

		/**
		 * Required - Detector configuration objects specify which data fields a job
		 * analyzes. They also specify which analytical functions are used. You can
		 * specify multiple detectors for a job. If the detectors array does not contain
		 * at least one detector, no analysis can occur and an error is returned.
		 * <p>
		 * API name: {@code detectors}
		 * <p>
		 * Adds one or more values to <code>detectors</code>.
		 */
		public final Builder detectors(Detector value, Detector... values) {
			this.detectors = _listAdd(this.detectors, value, values);
			return this;
		}

		/**
		 * Required - Detector configuration objects specify which data fields a job
		 * analyzes. They also specify which analytical functions are used. You can
		 * specify multiple detectors for a job. If the detectors array does not contain
		 * at least one detector, no analysis can occur and an error is returned.
		 * <p>
		 * API name: {@code detectors}
		 * <p>
		 * Adds a value to <code>detectors</code> using a builder lambda.
		 */
		public final Builder detectors(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return detectors(fn.apply(new Detector.Builder()).build());
		}

		/**
		 * A comma separated list of influencer field names. Typically these can be the
		 * by, over, or partition fields that are used in the detector configuration.
		 * You might also want to use a field name that is not specifically named in a
		 * detector, but is available as part of the input data. When you use multiple
		 * detectors, the use of influencers is recommended as it aggregates results for
		 * each influencer entity.
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>influencers</code>.
		 */
		public final Builder influencers(List<String> list) {
			this.influencers = _listAddAll(this.influencers, list);
			return this;
		}

		/**
		 * A comma separated list of influencer field names. Typically these can be the
		 * by, over, or partition fields that are used in the detector configuration.
		 * You might also want to use a field name that is not specifically named in a
		 * detector, but is available as part of the input data. When you use multiple
		 * detectors, the use of influencers is recommended as it aggregates results for
		 * each influencer entity.
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds one or more values to <code>influencers</code>.
		 */
		public final Builder influencers(String value, String... values) {
			this.influencers = _listAdd(this.influencers, value, values);
			return this;
		}

		/**
		 * The size of the window in which to expect data that is out of time order. If
		 * you specify a non-zero value, it must be greater than or equal to one second.
		 * NOTE: Latency is applicable only when you send data by using the post data
		 * API.
		 * <p>
		 * API name: {@code latency}
		 */
		public final Builder latency(@Nullable Time value) {
			this.latency = value;
			return this;
		}

		/**
		 * The size of the window in which to expect data that is out of time order. If
		 * you specify a non-zero value, it must be greater than or equal to one second.
		 * NOTE: Latency is applicable only when you send data by using the post data
		 * API.
		 * <p>
		 * API name: {@code latency}
		 */
		public final Builder latency(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.latency(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Advanced configuration option. Affects the pruning of models that have not
		 * been updated for the given time duration. The value must be set to a multiple
		 * of the <code>bucket_span</code>. If set too low, important information may be
		 * removed from the model. For jobs created in 8.1 and later, the default value
		 * is the greater of <code>30d</code> or 20 times <code>bucket_span</code>.
		 * <p>
		 * API name: {@code model_prune_window}
		 */
		public final Builder modelPruneWindow(@Nullable Time value) {
			this.modelPruneWindow = value;
			return this;
		}

		/**
		 * Advanced configuration option. Affects the pruning of models that have not
		 * been updated for the given time duration. The value must be set to a multiple
		 * of the <code>bucket_span</code>. If set too low, important information may be
		 * removed from the model. For jobs created in 8.1 and later, the default value
		 * is the greater of <code>30d</code> or 20 times <code>bucket_span</code>.
		 * <p>
		 * API name: {@code model_prune_window}
		 */
		public final Builder modelPruneWindow(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.modelPruneWindow(fn.apply(new Time.Builder()).build());
		}

		/**
		 * This functionality is reserved for internal use. It is not supported for use
		 * in customer environments and is not subject to the support SLA of official GA
		 * features. If set to <code>true</code>, the analysis will automatically find
		 * correlations between metrics for a given by field value and report anomalies
		 * when those correlations cease to hold. For example, suppose CPU and memory
		 * usage on host A is usually highly correlated with the same metrics on host B.
		 * Perhaps this correlation occurs because they are running a load-balanced
		 * application. If you enable this property, anomalies will be reported when,
		 * for example, CPU usage on host A is high and the value of CPU usage on host B
		 * is low. That is to say, you’ll see an anomaly when the CPU of host A is
		 * unusual given the CPU of host B. To use the
		 * <code>multivariate_by_fields</code> property, you must also specify
		 * <code>by_field_name</code> in your detector.
		 * <p>
		 * API name: {@code multivariate_by_fields}
		 */
		public final Builder multivariateByFields(@Nullable Boolean value) {
			this.multivariateByFields = value;
			return this;
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 * <p>
		 * API name: {@code per_partition_categorization}
		 */
		public final Builder perPartitionCategorization(@Nullable PerPartitionCategorization value) {
			this.perPartitionCategorization = value;
			return this;
		}

		/**
		 * Settings related to how categorization interacts with partition fields.
		 * <p>
		 * API name: {@code per_partition_categorization}
		 */
		public final Builder perPartitionCategorization(
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
		public final Builder summaryCountFieldName(@Nullable String value) {
			this.summaryCountFieldName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnalysisConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalysisConfig build() {
			_checkSingleUse();

			return new AnalysisConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalysisConfig}
	 */
	public static final JsonpDeserializer<AnalysisConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnalysisConfig::setupAnalysisConfigDeserializer);

	protected static void setupAnalysisConfigDeserializer(ObjectDeserializer<AnalysisConfig.Builder> op) {

		op.add(Builder::bucketSpan, Time._DESERIALIZER, "bucket_span");
		op.add(Builder::categorizationAnalyzer, CategorizationAnalyzer._DESERIALIZER, "categorization_analyzer");
		op.add(Builder::categorizationFieldName, JsonpDeserializer.stringDeserializer(), "categorization_field_name");
		op.add(Builder::categorizationFilters,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "categorization_filters");
		op.add(Builder::detectors, JsonpDeserializer.arrayDeserializer(Detector._DESERIALIZER), "detectors");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"influencers");
		op.add(Builder::latency, Time._DESERIALIZER, "latency");
		op.add(Builder::modelPruneWindow, Time._DESERIALIZER, "model_prune_window");
		op.add(Builder::multivariateByFields, JsonpDeserializer.booleanDeserializer(), "multivariate_by_fields");
		op.add(Builder::perPartitionCategorization, PerPartitionCategorization._DESERIALIZER,
				"per_partition_categorization");
		op.add(Builder::summaryCountFieldName, JsonpDeserializer.stringDeserializer(), "summary_count_field_name");

	}

}
