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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Anomaly

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Anomaly">API
 *      specification</a>
 */
@JsonpDeserializable
public class Anomaly implements JsonpSerializable {
	private final List<Double> actual;

	@Nullable
	private final AnomalyExplanation anomalyScoreExplanation;

	private final long bucketSpan;

	@Nullable
	private final String byFieldName;

	@Nullable
	private final String byFieldValue;

	private final List<AnomalyCause> causes;

	private final int detectorIndex;

	@Nullable
	private final String fieldName;

	@Nullable
	private final String function;

	@Nullable
	private final String functionDescription;

	@Nullable
	private final GeoResults geoResults;

	private final List<Influence> influencers;

	private final double initialRecordScore;

	private final boolean isInterim;

	private final String jobId;

	@Nullable
	private final String overFieldName;

	@Nullable
	private final String overFieldValue;

	@Nullable
	private final String partitionFieldName;

	@Nullable
	private final String partitionFieldValue;

	private final double probability;

	private final double recordScore;

	private final String resultType;

	private final long timestamp;

	private final List<Double> typical;

	// ---------------------------------------------------------------------------------------------

	private Anomaly(Builder builder) {

		this.actual = ApiTypeHelper.unmodifiable(builder.actual);
		this.anomalyScoreExplanation = builder.anomalyScoreExplanation;
		this.bucketSpan = ApiTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.byFieldName = builder.byFieldName;
		this.byFieldValue = builder.byFieldValue;
		this.causes = ApiTypeHelper.unmodifiable(builder.causes);
		this.detectorIndex = ApiTypeHelper.requireNonNull(builder.detectorIndex, this, "detectorIndex");
		this.fieldName = builder.fieldName;
		this.function = builder.function;
		this.functionDescription = builder.functionDescription;
		this.geoResults = builder.geoResults;
		this.influencers = ApiTypeHelper.unmodifiable(builder.influencers);
		this.initialRecordScore = ApiTypeHelper.requireNonNull(builder.initialRecordScore, this, "initialRecordScore");
		this.isInterim = ApiTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.overFieldName = builder.overFieldName;
		this.overFieldValue = builder.overFieldValue;
		this.partitionFieldName = builder.partitionFieldName;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability");
		this.recordScore = ApiTypeHelper.requireNonNull(builder.recordScore, this, "recordScore");
		this.resultType = ApiTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.typical = ApiTypeHelper.unmodifiable(builder.typical);

	}

	public static Anomaly of(Function<Builder, ObjectBuilder<Anomaly>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The actual value for the bucket.
	 * <p>
	 * API name: {@code actual}
	 */
	public final List<Double> actual() {
		return this.actual;
	}

	/**
	 * Information about the factors impacting the initial anomaly score.
	 * <p>
	 * API name: {@code anomaly_score_explanation}
	 */
	@Nullable
	public final AnomalyExplanation anomalyScoreExplanation() {
		return this.anomalyScoreExplanation;
	}

	/**
	 * Required - The length of the bucket in seconds. This value matches the
	 * <code>bucket_span</code> that is specified in the job.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	public final long bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * The field used to split the data. In particular, this property is used for
	 * analyzing the splits with respect to their own history. It is used for
	 * finding unusual values in the context of the split.
	 * <p>
	 * API name: {@code by_field_name}
	 */
	@Nullable
	public final String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * The value of <code>by_field_name</code>.
	 * <p>
	 * API name: {@code by_field_value}
	 */
	@Nullable
	public final String byFieldValue() {
		return this.byFieldValue;
	}

	/**
	 * For population analysis, an over field must be specified in the detector.
	 * This property contains an array of anomaly records that are the causes for
	 * the anomaly that has been identified for the over field. This sub-resource
	 * contains the most anomalous records for the <code>over_field_name</code>. For
	 * scalability reasons, a maximum of the 10 most significant causes of the
	 * anomaly are returned. As part of the core analytical modeling, these
	 * low-level anomaly records are aggregated for their parent over field record.
	 * The <code>causes</code> resource contains similar elements to the record
	 * resource, namely <code>actual</code>, <code>typical</code>,
	 * <code>geo_results.actual_point</code>,
	 * <code>geo_results.typical_point</code>, <code>*_field_name</code> and
	 * <code>*_field_value</code>. Probability and scores are not applicable to
	 * causes.
	 * <p>
	 * API name: {@code causes}
	 */
	public final List<AnomalyCause> causes() {
		return this.causes;
	}

	/**
	 * Required - A unique identifier for the detector.
	 * <p>
	 * API name: {@code detector_index}
	 */
	public final int detectorIndex() {
		return this.detectorIndex;
	}

	/**
	 * Certain functions require a field to operate on, for example,
	 * <code>sum()</code>. For those functions, this value is the name of the field
	 * to be analyzed.
	 * <p>
	 * API name: {@code field_name}
	 */
	@Nullable
	public final String fieldName() {
		return this.fieldName;
	}

	/**
	 * The function in which the anomaly occurs, as specified in the detector
	 * configuration. For example, <code>max</code>.
	 * <p>
	 * API name: {@code function}
	 */
	@Nullable
	public final String function() {
		return this.function;
	}

	/**
	 * The description of the function in which the anomaly occurs, as specified in
	 * the detector configuration.
	 * <p>
	 * API name: {@code function_description}
	 */
	@Nullable
	public final String functionDescription() {
		return this.functionDescription;
	}

	/**
	 * If the detector function is <code>lat_long</code>, this object contains comma
	 * delimited strings for the latitude and longitude of the actual and typical
	 * values.
	 * <p>
	 * API name: {@code geo_results}
	 */
	@Nullable
	public final GeoResults geoResults() {
		return this.geoResults;
	}

	/**
	 * If influencers were specified in the detector configuration, this array
	 * contains influencers that contributed to or were to blame for an anomaly.
	 * <p>
	 * API name: {@code influencers}
	 */
	public final List<Influence> influencers() {
		return this.influencers;
	}

	/**
	 * Required - A normalized score between 0-100, which is based on the
	 * probability of the anomalousness of this record. This is the initial value
	 * that was calculated at the time the bucket was processed.
	 * <p>
	 * API name: {@code initial_record_score}
	 */
	public final double initialRecordScore() {
		return this.initialRecordScore;
	}

	/**
	 * Required - If true, this is an interim result. In other words, the results
	 * are calculated based on partial input data.
	 * <p>
	 * API name: {@code is_interim}
	 */
	public final boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * The field used to split the data. In particular, this property is used for
	 * analyzing the splits with respect to the history of all splits. It is used
	 * for finding unusual values in the population of all splits.
	 * <p>
	 * API name: {@code over_field_name}
	 */
	@Nullable
	public final String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * The value of <code>over_field_name</code>.
	 * <p>
	 * API name: {@code over_field_value}
	 */
	@Nullable
	public final String overFieldValue() {
		return this.overFieldValue;
	}

	/**
	 * The field used to segment the analysis. When you use this property, you have
	 * completely independent baselines for each value of this field.
	 * <p>
	 * API name: {@code partition_field_name}
	 */
	@Nullable
	public final String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * The value of <code>partition_field_name</code>.
	 * <p>
	 * API name: {@code partition_field_value}
	 */
	@Nullable
	public final String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * Required - The probability of the individual anomaly occurring, in the range
	 * 0 to 1. For example, <code>0.0000772031</code>. This value can be held to a
	 * high precision of over 300 decimal places, so the <code>record_score</code>
	 * is provided as a human-readable and friendly interpretation of this.
	 * <p>
	 * API name: {@code probability}
	 */
	public final double probability() {
		return this.probability;
	}

	/**
	 * Required - A normalized score between 0-100, which is based on the
	 * probability of the anomalousness of this record. Unlike
	 * <code>initial_record_score</code>, this value will be updated by a
	 * re-normalization process as new data is analyzed.
	 * <p>
	 * API name: {@code record_score}
	 */
	public final double recordScore() {
		return this.recordScore;
	}

	/**
	 * Required - Internal. This is always set to <code>record</code>.
	 * <p>
	 * API name: {@code result_type}
	 */
	public final String resultType() {
		return this.resultType;
	}

	/**
	 * Required - The start time of the bucket for which these results were
	 * calculated.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * The typical value for the bucket, according to analytical modeling.
	 * <p>
	 * API name: {@code typical}
	 */
	public final List<Double> typical() {
		return this.typical;
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

		if (ApiTypeHelper.isDefined(this.actual)) {
			generator.writeKey("actual");
			generator.writeStartArray();
			for (Double item0 : this.actual) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.anomalyScoreExplanation != null) {
			generator.writeKey("anomaly_score_explanation");
			this.anomalyScoreExplanation.serialize(generator, mapper);

		}
		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		if (this.byFieldName != null) {
			generator.writeKey("by_field_name");
			generator.write(this.byFieldName);

		}
		if (this.byFieldValue != null) {
			generator.writeKey("by_field_value");
			generator.write(this.byFieldValue);

		}
		if (ApiTypeHelper.isDefined(this.causes)) {
			generator.writeKey("causes");
			generator.writeStartArray();
			for (AnomalyCause item0 : this.causes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("detector_index");
		generator.write(this.detectorIndex);

		if (this.fieldName != null) {
			generator.writeKey("field_name");
			generator.write(this.fieldName);

		}
		if (this.function != null) {
			generator.writeKey("function");
			generator.write(this.function);

		}
		if (this.functionDescription != null) {
			generator.writeKey("function_description");
			generator.write(this.functionDescription);

		}
		if (this.geoResults != null) {
			generator.writeKey("geo_results");
			this.geoResults.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.influencers)) {
			generator.writeKey("influencers");
			generator.writeStartArray();
			for (Influence item0 : this.influencers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("initial_record_score");
		generator.write(this.initialRecordScore);

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		if (this.overFieldName != null) {
			generator.writeKey("over_field_name");
			generator.write(this.overFieldName);

		}
		if (this.overFieldValue != null) {
			generator.writeKey("over_field_value");
			generator.write(this.overFieldValue);

		}
		if (this.partitionFieldName != null) {
			generator.writeKey("partition_field_name");
			generator.write(this.partitionFieldName);

		}
		if (this.partitionFieldValue != null) {
			generator.writeKey("partition_field_value");
			generator.write(this.partitionFieldValue);

		}
		generator.writeKey("probability");
		generator.write(this.probability);

		generator.writeKey("record_score");
		generator.write(this.recordScore);

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (ApiTypeHelper.isDefined(this.typical)) {
			generator.writeKey("typical");
			generator.writeStartArray();
			for (Double item0 : this.typical) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Anomaly}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Anomaly> {
		@Nullable
		private List<Double> actual;

		@Nullable
		private AnomalyExplanation anomalyScoreExplanation;

		private Long bucketSpan;

		@Nullable
		private String byFieldName;

		@Nullable
		private String byFieldValue;

		@Nullable
		private List<AnomalyCause> causes;

		private Integer detectorIndex;

		@Nullable
		private String fieldName;

		@Nullable
		private String function;

		@Nullable
		private String functionDescription;

		@Nullable
		private GeoResults geoResults;

		@Nullable
		private List<Influence> influencers;

		private Double initialRecordScore;

		private Boolean isInterim;

		private String jobId;

		@Nullable
		private String overFieldName;

		@Nullable
		private String overFieldValue;

		@Nullable
		private String partitionFieldName;

		@Nullable
		private String partitionFieldValue;

		private Double probability;

		private Double recordScore;

		private String resultType;

		private Long timestamp;

		@Nullable
		private List<Double> typical;

		/**
		 * The actual value for the bucket.
		 * <p>
		 * API name: {@code actual}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actual</code>.
		 */
		public final Builder actual(List<Double> list) {
			this.actual = _listAddAll(this.actual, list);
			return this;
		}

		/**
		 * The actual value for the bucket.
		 * <p>
		 * API name: {@code actual}
		 * <p>
		 * Adds one or more values to <code>actual</code>.
		 */
		public final Builder actual(Double value, Double... values) {
			this.actual = _listAdd(this.actual, value, values);
			return this;
		}

		/**
		 * Information about the factors impacting the initial anomaly score.
		 * <p>
		 * API name: {@code anomaly_score_explanation}
		 */
		public final Builder anomalyScoreExplanation(@Nullable AnomalyExplanation value) {
			this.anomalyScoreExplanation = value;
			return this;
		}

		/**
		 * Information about the factors impacting the initial anomaly score.
		 * <p>
		 * API name: {@code anomaly_score_explanation}
		 */
		public final Builder anomalyScoreExplanation(
				Function<AnomalyExplanation.Builder, ObjectBuilder<AnomalyExplanation>> fn) {
			return this.anomalyScoreExplanation(fn.apply(new AnomalyExplanation.Builder()).build());
		}

		/**
		 * Required - The length of the bucket in seconds. This value matches the
		 * <code>bucket_span</code> that is specified in the job.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(long value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * The field used to split the data. In particular, this property is used for
		 * analyzing the splits with respect to their own history. It is used for
		 * finding unusual values in the context of the split.
		 * <p>
		 * API name: {@code by_field_name}
		 */
		public final Builder byFieldName(@Nullable String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * The value of <code>by_field_name</code>.
		 * <p>
		 * API name: {@code by_field_value}
		 */
		public final Builder byFieldValue(@Nullable String value) {
			this.byFieldValue = value;
			return this;
		}

		/**
		 * For population analysis, an over field must be specified in the detector.
		 * This property contains an array of anomaly records that are the causes for
		 * the anomaly that has been identified for the over field. This sub-resource
		 * contains the most anomalous records for the <code>over_field_name</code>. For
		 * scalability reasons, a maximum of the 10 most significant causes of the
		 * anomaly are returned. As part of the core analytical modeling, these
		 * low-level anomaly records are aggregated for their parent over field record.
		 * The <code>causes</code> resource contains similar elements to the record
		 * resource, namely <code>actual</code>, <code>typical</code>,
		 * <code>geo_results.actual_point</code>,
		 * <code>geo_results.typical_point</code>, <code>*_field_name</code> and
		 * <code>*_field_value</code>. Probability and scores are not applicable to
		 * causes.
		 * <p>
		 * API name: {@code causes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>causes</code>.
		 */
		public final Builder causes(List<AnomalyCause> list) {
			this.causes = _listAddAll(this.causes, list);
			return this;
		}

		/**
		 * For population analysis, an over field must be specified in the detector.
		 * This property contains an array of anomaly records that are the causes for
		 * the anomaly that has been identified for the over field. This sub-resource
		 * contains the most anomalous records for the <code>over_field_name</code>. For
		 * scalability reasons, a maximum of the 10 most significant causes of the
		 * anomaly are returned. As part of the core analytical modeling, these
		 * low-level anomaly records are aggregated for their parent over field record.
		 * The <code>causes</code> resource contains similar elements to the record
		 * resource, namely <code>actual</code>, <code>typical</code>,
		 * <code>geo_results.actual_point</code>,
		 * <code>geo_results.typical_point</code>, <code>*_field_name</code> and
		 * <code>*_field_value</code>. Probability and scores are not applicable to
		 * causes.
		 * <p>
		 * API name: {@code causes}
		 * <p>
		 * Adds one or more values to <code>causes</code>.
		 */
		public final Builder causes(AnomalyCause value, AnomalyCause... values) {
			this.causes = _listAdd(this.causes, value, values);
			return this;
		}

		/**
		 * For population analysis, an over field must be specified in the detector.
		 * This property contains an array of anomaly records that are the causes for
		 * the anomaly that has been identified for the over field. This sub-resource
		 * contains the most anomalous records for the <code>over_field_name</code>. For
		 * scalability reasons, a maximum of the 10 most significant causes of the
		 * anomaly are returned. As part of the core analytical modeling, these
		 * low-level anomaly records are aggregated for their parent over field record.
		 * The <code>causes</code> resource contains similar elements to the record
		 * resource, namely <code>actual</code>, <code>typical</code>,
		 * <code>geo_results.actual_point</code>,
		 * <code>geo_results.typical_point</code>, <code>*_field_name</code> and
		 * <code>*_field_value</code>. Probability and scores are not applicable to
		 * causes.
		 * <p>
		 * API name: {@code causes}
		 * <p>
		 * Adds a value to <code>causes</code> using a builder lambda.
		 */
		public final Builder causes(Function<AnomalyCause.Builder, ObjectBuilder<AnomalyCause>> fn) {
			return causes(fn.apply(new AnomalyCause.Builder()).build());
		}

		/**
		 * Required - A unique identifier for the detector.
		 * <p>
		 * API name: {@code detector_index}
		 */
		public final Builder detectorIndex(int value) {
			this.detectorIndex = value;
			return this;
		}

		/**
		 * Certain functions require a field to operate on, for example,
		 * <code>sum()</code>. For those functions, this value is the name of the field
		 * to be analyzed.
		 * <p>
		 * API name: {@code field_name}
		 */
		public final Builder fieldName(@Nullable String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * The function in which the anomaly occurs, as specified in the detector
		 * configuration. For example, <code>max</code>.
		 * <p>
		 * API name: {@code function}
		 */
		public final Builder function(@Nullable String value) {
			this.function = value;
			return this;
		}

		/**
		 * The description of the function in which the anomaly occurs, as specified in
		 * the detector configuration.
		 * <p>
		 * API name: {@code function_description}
		 */
		public final Builder functionDescription(@Nullable String value) {
			this.functionDescription = value;
			return this;
		}

		/**
		 * If the detector function is <code>lat_long</code>, this object contains comma
		 * delimited strings for the latitude and longitude of the actual and typical
		 * values.
		 * <p>
		 * API name: {@code geo_results}
		 */
		public final Builder geoResults(@Nullable GeoResults value) {
			this.geoResults = value;
			return this;
		}

		/**
		 * If the detector function is <code>lat_long</code>, this object contains comma
		 * delimited strings for the latitude and longitude of the actual and typical
		 * values.
		 * <p>
		 * API name: {@code geo_results}
		 */
		public final Builder geoResults(Function<GeoResults.Builder, ObjectBuilder<GeoResults>> fn) {
			return this.geoResults(fn.apply(new GeoResults.Builder()).build());
		}

		/**
		 * If influencers were specified in the detector configuration, this array
		 * contains influencers that contributed to or were to blame for an anomaly.
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>influencers</code>.
		 */
		public final Builder influencers(List<Influence> list) {
			this.influencers = _listAddAll(this.influencers, list);
			return this;
		}

		/**
		 * If influencers were specified in the detector configuration, this array
		 * contains influencers that contributed to or were to blame for an anomaly.
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds one or more values to <code>influencers</code>.
		 */
		public final Builder influencers(Influence value, Influence... values) {
			this.influencers = _listAdd(this.influencers, value, values);
			return this;
		}

		/**
		 * If influencers were specified in the detector configuration, this array
		 * contains influencers that contributed to or were to blame for an anomaly.
		 * <p>
		 * API name: {@code influencers}
		 * <p>
		 * Adds a value to <code>influencers</code> using a builder lambda.
		 */
		public final Builder influencers(Function<Influence.Builder, ObjectBuilder<Influence>> fn) {
			return influencers(fn.apply(new Influence.Builder()).build());
		}

		/**
		 * Required - A normalized score between 0-100, which is based on the
		 * probability of the anomalousness of this record. This is the initial value
		 * that was calculated at the time the bucket was processed.
		 * <p>
		 * API name: {@code initial_record_score}
		 */
		public final Builder initialRecordScore(double value) {
			this.initialRecordScore = value;
			return this;
		}

		/**
		 * Required - If true, this is an interim result. In other words, the results
		 * are calculated based on partial input data.
		 * <p>
		 * API name: {@code is_interim}
		 */
		public final Builder isInterim(boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The field used to split the data. In particular, this property is used for
		 * analyzing the splits with respect to the history of all splits. It is used
		 * for finding unusual values in the population of all splits.
		 * <p>
		 * API name: {@code over_field_name}
		 */
		public final Builder overFieldName(@Nullable String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * The value of <code>over_field_name</code>.
		 * <p>
		 * API name: {@code over_field_value}
		 */
		public final Builder overFieldValue(@Nullable String value) {
			this.overFieldValue = value;
			return this;
		}

		/**
		 * The field used to segment the analysis. When you use this property, you have
		 * completely independent baselines for each value of this field.
		 * <p>
		 * API name: {@code partition_field_name}
		 */
		public final Builder partitionFieldName(@Nullable String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * The value of <code>partition_field_name</code>.
		 * <p>
		 * API name: {@code partition_field_value}
		 */
		public final Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * Required - The probability of the individual anomaly occurring, in the range
		 * 0 to 1. For example, <code>0.0000772031</code>. This value can be held to a
		 * high precision of over 300 decimal places, so the <code>record_score</code>
		 * is provided as a human-readable and friendly interpretation of this.
		 * <p>
		 * API name: {@code probability}
		 */
		public final Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * Required - A normalized score between 0-100, which is based on the
		 * probability of the anomalousness of this record. Unlike
		 * <code>initial_record_score</code>, this value will be updated by a
		 * re-normalization process as new data is analyzed.
		 * <p>
		 * API name: {@code record_score}
		 */
		public final Builder recordScore(double value) {
			this.recordScore = value;
			return this;
		}

		/**
		 * Required - Internal. This is always set to <code>record</code>.
		 * <p>
		 * API name: {@code result_type}
		 */
		public final Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - The start time of the bucket for which these results were
		 * calculated.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * The typical value for the bucket, according to analytical modeling.
		 * <p>
		 * API name: {@code typical}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>typical</code>.
		 */
		public final Builder typical(List<Double> list) {
			this.typical = _listAddAll(this.typical, list);
			return this;
		}

		/**
		 * The typical value for the bucket, according to analytical modeling.
		 * <p>
		 * API name: {@code typical}
		 * <p>
		 * Adds one or more values to <code>typical</code>.
		 */
		public final Builder typical(Double value, Double... values) {
			this.typical = _listAdd(this.typical, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Anomaly}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Anomaly build() {
			_checkSingleUse();

			return new Anomaly(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Anomaly}
	 */
	public static final JsonpDeserializer<Anomaly> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Anomaly::setupAnomalyDeserializer);

	protected static void setupAnomalyDeserializer(ObjectDeserializer<Anomaly.Builder> op) {

		op.add(Builder::actual, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()), "actual");
		op.add(Builder::anomalyScoreExplanation, AnomalyExplanation._DESERIALIZER, "anomaly_score_explanation");
		op.add(Builder::bucketSpan, JsonpDeserializer.longDeserializer(), "bucket_span");
		op.add(Builder::byFieldName, JsonpDeserializer.stringDeserializer(), "by_field_name");
		op.add(Builder::byFieldValue, JsonpDeserializer.stringDeserializer(), "by_field_value");
		op.add(Builder::causes, JsonpDeserializer.arrayDeserializer(AnomalyCause._DESERIALIZER), "causes");
		op.add(Builder::detectorIndex, JsonpDeserializer.integerDeserializer(), "detector_index");
		op.add(Builder::fieldName, JsonpDeserializer.stringDeserializer(), "field_name");
		op.add(Builder::function, JsonpDeserializer.stringDeserializer(), "function");
		op.add(Builder::functionDescription, JsonpDeserializer.stringDeserializer(), "function_description");
		op.add(Builder::geoResults, GeoResults._DESERIALIZER, "geo_results");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(Influence._DESERIALIZER), "influencers");
		op.add(Builder::initialRecordScore, JsonpDeserializer.doubleDeserializer(), "initial_record_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::overFieldName, JsonpDeserializer.stringDeserializer(), "over_field_name");
		op.add(Builder::overFieldValue, JsonpDeserializer.stringDeserializer(), "over_field_value");
		op.add(Builder::partitionFieldName, JsonpDeserializer.stringDeserializer(), "partition_field_name");
		op.add(Builder::partitionFieldValue, JsonpDeserializer.stringDeserializer(), "partition_field_value");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");
		op.add(Builder::recordScore, JsonpDeserializer.doubleDeserializer(), "record_score");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::typical, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"typical");

	}

}
