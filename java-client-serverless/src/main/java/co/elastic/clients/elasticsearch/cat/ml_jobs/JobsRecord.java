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

package co.elastic.clients.elasticsearch.cat.ml_jobs;

import co.elastic.clients.elasticsearch.ml.CategorizationStatus;
import co.elastic.clients.elasticsearch.ml.JobState;
import co.elastic.clients.elasticsearch.ml.MemoryStatus;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_jobs.JobsRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.ml_jobs.JobsRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class JobsRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final JobState state;

	@Nullable
	private final String openedTime;

	@Nullable
	private final String assignmentExplanation;

	@Nullable
	private final String dataProcessedRecords;

	@Nullable
	private final String dataProcessedFields;

	@Nullable
	private final String dataInputBytes;

	@Nullable
	private final String dataInputRecords;

	@Nullable
	private final String dataInputFields;

	@Nullable
	private final String dataInvalidDates;

	@Nullable
	private final String dataMissingFields;

	@Nullable
	private final String dataOutOfOrderTimestamps;

	@Nullable
	private final String dataEmptyBuckets;

	@Nullable
	private final String dataSparseBuckets;

	@Nullable
	private final String dataBuckets;

	@Nullable
	private final String dataEarliestRecord;

	@Nullable
	private final String dataLatestRecord;

	@Nullable
	private final String dataLast;

	@Nullable
	private final String dataLastEmptyBucket;

	@Nullable
	private final String dataLastSparseBucket;

	@Nullable
	private final String modelBytes;

	@Nullable
	private final MemoryStatus modelMemoryStatus;

	@Nullable
	private final String modelBytesExceeded;

	@Nullable
	private final String modelMemoryLimit;

	@Nullable
	private final String modelByFields;

	@Nullable
	private final String modelOverFields;

	@Nullable
	private final String modelPartitionFields;

	@Nullable
	private final String modelBucketAllocationFailures;

	@Nullable
	private final CategorizationStatus modelCategorizationStatus;

	@Nullable
	private final String modelCategorizedDocCount;

	@Nullable
	private final String modelTotalCategoryCount;

	@Nullable
	private final String modelFrequentCategoryCount;

	@Nullable
	private final String modelRareCategoryCount;

	@Nullable
	private final String modelDeadCategoryCount;

	@Nullable
	private final String modelFailedCategoryCount;

	@Nullable
	private final String modelLogTime;

	@Nullable
	private final String modelTimestamp;

	@Nullable
	private final String forecastsTotal;

	@Nullable
	private final String forecastsMemoryMin;

	@Nullable
	private final String forecastsMemoryMax;

	@Nullable
	private final String forecastsMemoryAvg;

	@Nullable
	private final String forecastsMemoryTotal;

	@Nullable
	private final String forecastsRecordsMin;

	@Nullable
	private final String forecastsRecordsMax;

	@Nullable
	private final String forecastsRecordsAvg;

	@Nullable
	private final String forecastsRecordsTotal;

	@Nullable
	private final String forecastsTimeMin;

	@Nullable
	private final String forecastsTimeMax;

	@Nullable
	private final String forecastsTimeAvg;

	@Nullable
	private final String forecastsTimeTotal;

	@Nullable
	private final String nodeId;

	@Nullable
	private final String nodeName;

	@Nullable
	private final String nodeEphemeralId;

	@Nullable
	private final String nodeAddress;

	@Nullable
	private final String bucketsCount;

	@Nullable
	private final String bucketsTimeTotal;

	@Nullable
	private final String bucketsTimeMin;

	@Nullable
	private final String bucketsTimeMax;

	@Nullable
	private final String bucketsTimeExpAvg;

	@Nullable
	private final String bucketsTimeExpAvgHour;

	// ---------------------------------------------------------------------------------------------

	private JobsRecord(Builder builder) {

		this.id = builder.id;
		this.state = builder.state;
		this.openedTime = builder.openedTime;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.dataProcessedRecords = builder.dataProcessedRecords;
		this.dataProcessedFields = builder.dataProcessedFields;
		this.dataInputBytes = builder.dataInputBytes;
		this.dataInputRecords = builder.dataInputRecords;
		this.dataInputFields = builder.dataInputFields;
		this.dataInvalidDates = builder.dataInvalidDates;
		this.dataMissingFields = builder.dataMissingFields;
		this.dataOutOfOrderTimestamps = builder.dataOutOfOrderTimestamps;
		this.dataEmptyBuckets = builder.dataEmptyBuckets;
		this.dataSparseBuckets = builder.dataSparseBuckets;
		this.dataBuckets = builder.dataBuckets;
		this.dataEarliestRecord = builder.dataEarliestRecord;
		this.dataLatestRecord = builder.dataLatestRecord;
		this.dataLast = builder.dataLast;
		this.dataLastEmptyBucket = builder.dataLastEmptyBucket;
		this.dataLastSparseBucket = builder.dataLastSparseBucket;
		this.modelBytes = builder.modelBytes;
		this.modelMemoryStatus = builder.modelMemoryStatus;
		this.modelBytesExceeded = builder.modelBytesExceeded;
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.modelByFields = builder.modelByFields;
		this.modelOverFields = builder.modelOverFields;
		this.modelPartitionFields = builder.modelPartitionFields;
		this.modelBucketAllocationFailures = builder.modelBucketAllocationFailures;
		this.modelCategorizationStatus = builder.modelCategorizationStatus;
		this.modelCategorizedDocCount = builder.modelCategorizedDocCount;
		this.modelTotalCategoryCount = builder.modelTotalCategoryCount;
		this.modelFrequentCategoryCount = builder.modelFrequentCategoryCount;
		this.modelRareCategoryCount = builder.modelRareCategoryCount;
		this.modelDeadCategoryCount = builder.modelDeadCategoryCount;
		this.modelFailedCategoryCount = builder.modelFailedCategoryCount;
		this.modelLogTime = builder.modelLogTime;
		this.modelTimestamp = builder.modelTimestamp;
		this.forecastsTotal = builder.forecastsTotal;
		this.forecastsMemoryMin = builder.forecastsMemoryMin;
		this.forecastsMemoryMax = builder.forecastsMemoryMax;
		this.forecastsMemoryAvg = builder.forecastsMemoryAvg;
		this.forecastsMemoryTotal = builder.forecastsMemoryTotal;
		this.forecastsRecordsMin = builder.forecastsRecordsMin;
		this.forecastsRecordsMax = builder.forecastsRecordsMax;
		this.forecastsRecordsAvg = builder.forecastsRecordsAvg;
		this.forecastsRecordsTotal = builder.forecastsRecordsTotal;
		this.forecastsTimeMin = builder.forecastsTimeMin;
		this.forecastsTimeMax = builder.forecastsTimeMax;
		this.forecastsTimeAvg = builder.forecastsTimeAvg;
		this.forecastsTimeTotal = builder.forecastsTimeTotal;
		this.nodeId = builder.nodeId;
		this.nodeName = builder.nodeName;
		this.nodeEphemeralId = builder.nodeEphemeralId;
		this.nodeAddress = builder.nodeAddress;
		this.bucketsCount = builder.bucketsCount;
		this.bucketsTimeTotal = builder.bucketsTimeTotal;
		this.bucketsTimeMin = builder.bucketsTimeMin;
		this.bucketsTimeMax = builder.bucketsTimeMax;
		this.bucketsTimeExpAvg = builder.bucketsTimeExpAvg;
		this.bucketsTimeExpAvgHour = builder.bucketsTimeExpAvgHour;

	}

	public static JobsRecord of(Function<Builder, ObjectBuilder<JobsRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The anomaly detection job identifier.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The status of the anomaly detection job.
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public final JobState state() {
		return this.state;
	}

	/**
	 * For open jobs only, the amount of time the job has been opened.
	 * <p>
	 * API name: {@code opened_time}
	 */
	@Nullable
	public final String openedTime() {
		return this.openedTime;
	}

	/**
	 * For open anomaly detection jobs only, contains messages relating to the
	 * selection of a node to run the job.
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * The number of input documents that have been processed by the anomaly
	 * detection job. This value includes documents with missing fields, since they
	 * are nonetheless analyzed. If you use datafeeds and have aggregations in your
	 * search query, the <code>processed_record_count</code> is the number of
	 * aggregation results processed, not the number of Elasticsearch documents.
	 * <p>
	 * API name: {@code data.processed_records}
	 */
	@Nullable
	public final String dataProcessedRecords() {
		return this.dataProcessedRecords;
	}

	/**
	 * The total number of fields in all the documents that have been processed by
	 * the anomaly detection job. Only fields that are specified in the detector
	 * configuration object contribute to this count. The timestamp is not included
	 * in this count.
	 * <p>
	 * API name: {@code data.processed_fields}
	 */
	@Nullable
	public final String dataProcessedFields() {
		return this.dataProcessedFields;
	}

	/**
	 * The number of bytes of input data posted to the anomaly detection job.
	 * <p>
	 * API name: {@code data.input_bytes}
	 */
	@Nullable
	public final String dataInputBytes() {
		return this.dataInputBytes;
	}

	/**
	 * The number of input documents posted to the anomaly detection job.
	 * <p>
	 * API name: {@code data.input_records}
	 */
	@Nullable
	public final String dataInputRecords() {
		return this.dataInputRecords;
	}

	/**
	 * The total number of fields in input documents posted to the anomaly detection
	 * job. This count includes fields that are not used in the analysis. However,
	 * be aware that if you are using a datafeed, it extracts only the required
	 * fields from the documents it retrieves before posting them to the job.
	 * <p>
	 * API name: {@code data.input_fields}
	 */
	@Nullable
	public final String dataInputFields() {
		return this.dataInputFields;
	}

	/**
	 * The number of input documents with either a missing date field or a date that
	 * could not be parsed.
	 * <p>
	 * API name: {@code data.invalid_dates}
	 */
	@Nullable
	public final String dataInvalidDates() {
		return this.dataInvalidDates;
	}

	/**
	 * The number of input documents that are missing a field that the anomaly
	 * detection job is configured to analyze. Input documents with missing fields
	 * are still processed because it is possible that not all fields are missing.
	 * If you are using datafeeds or posting data to the job in JSON format, a high
	 * <code>missing_field_count</code> is often not an indication of data issues.
	 * It is not necessarily a cause for concern.
	 * <p>
	 * API name: {@code data.missing_fields}
	 */
	@Nullable
	public final String dataMissingFields() {
		return this.dataMissingFields;
	}

	/**
	 * The number of input documents that have a timestamp chronologically preceding
	 * the start of the current anomaly detection bucket offset by the latency
	 * window. This information is applicable only when you provide data to the
	 * anomaly detection job by using the post data API. These out of order
	 * documents are discarded, since jobs require time series data to be in
	 * ascending chronological order.
	 * <p>
	 * API name: {@code data.out_of_order_timestamps}
	 */
	@Nullable
	public final String dataOutOfOrderTimestamps() {
		return this.dataOutOfOrderTimestamps;
	}

	/**
	 * The number of buckets which did not contain any data. If your data contains
	 * many empty buckets, consider increasing your <code>bucket_span</code> or
	 * using functions that are tolerant to gaps in data such as mean,
	 * <code>non_null_sum</code> or <code>non_zero_count</code>.
	 * <p>
	 * API name: {@code data.empty_buckets}
	 */
	@Nullable
	public final String dataEmptyBuckets() {
		return this.dataEmptyBuckets;
	}

	/**
	 * The number of buckets that contained few data points compared to the expected
	 * number of data points. If your data contains many sparse buckets, consider
	 * using a longer <code>bucket_span</code>.
	 * <p>
	 * API name: {@code data.sparse_buckets}
	 */
	@Nullable
	public final String dataSparseBuckets() {
		return this.dataSparseBuckets;
	}

	/**
	 * The total number of buckets processed.
	 * <p>
	 * API name: {@code data.buckets}
	 */
	@Nullable
	public final String dataBuckets() {
		return this.dataBuckets;
	}

	/**
	 * The timestamp of the earliest chronologically input document.
	 * <p>
	 * API name: {@code data.earliest_record}
	 */
	@Nullable
	public final String dataEarliestRecord() {
		return this.dataEarliestRecord;
	}

	/**
	 * The timestamp of the latest chronologically input document.
	 * <p>
	 * API name: {@code data.latest_record}
	 */
	@Nullable
	public final String dataLatestRecord() {
		return this.dataLatestRecord;
	}

	/**
	 * The timestamp at which data was last analyzed, according to server time.
	 * <p>
	 * API name: {@code data.last}
	 */
	@Nullable
	public final String dataLast() {
		return this.dataLast;
	}

	/**
	 * The timestamp of the last bucket that did not contain any data.
	 * <p>
	 * API name: {@code data.last_empty_bucket}
	 */
	@Nullable
	public final String dataLastEmptyBucket() {
		return this.dataLastEmptyBucket;
	}

	/**
	 * The timestamp of the last bucket that was considered sparse.
	 * <p>
	 * API name: {@code data.last_sparse_bucket}
	 */
	@Nullable
	public final String dataLastSparseBucket() {
		return this.dataLastSparseBucket;
	}

	/**
	 * The number of bytes of memory used by the models. This is the maximum value
	 * since the last time the model was persisted. If the job is closed, this value
	 * indicates the latest size.
	 * <p>
	 * API name: {@code model.bytes}
	 */
	@Nullable
	public final String modelBytes() {
		return this.modelBytes;
	}

	/**
	 * The status of the mathematical models.
	 * <p>
	 * API name: {@code model.memory_status}
	 */
	@Nullable
	public final MemoryStatus modelMemoryStatus() {
		return this.modelMemoryStatus;
	}

	/**
	 * The number of bytes over the high limit for memory usage at the last
	 * allocation failure.
	 * <p>
	 * API name: {@code model.bytes_exceeded}
	 */
	@Nullable
	public final String modelBytesExceeded() {
		return this.modelBytesExceeded;
	}

	/**
	 * The upper limit for model memory usage, checked on increasing values.
	 * <p>
	 * API name: {@code model.memory_limit}
	 */
	@Nullable
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * The number of <code>by</code> field values that were analyzed by the models.
	 * This value is cumulative for all detectors in the job.
	 * <p>
	 * API name: {@code model.by_fields}
	 */
	@Nullable
	public final String modelByFields() {
		return this.modelByFields;
	}

	/**
	 * The number of <code>over</code> field values that were analyzed by the
	 * models. This value is cumulative for all detectors in the job.
	 * <p>
	 * API name: {@code model.over_fields}
	 */
	@Nullable
	public final String modelOverFields() {
		return this.modelOverFields;
	}

	/**
	 * The number of <code>partition</code> field values that were analyzed by the
	 * models. This value is cumulative for all detectors in the job.
	 * <p>
	 * API name: {@code model.partition_fields}
	 */
	@Nullable
	public final String modelPartitionFields() {
		return this.modelPartitionFields;
	}

	/**
	 * The number of buckets for which new entities in incoming data were not
	 * processed due to insufficient model memory. This situation is also signified
	 * by a <code>hard_limit: memory_status</code> property value.
	 * <p>
	 * API name: {@code model.bucket_allocation_failures}
	 */
	@Nullable
	public final String modelBucketAllocationFailures() {
		return this.modelBucketAllocationFailures;
	}

	/**
	 * The status of categorization for the job.
	 * <p>
	 * API name: {@code model.categorization_status}
	 */
	@Nullable
	public final CategorizationStatus modelCategorizationStatus() {
		return this.modelCategorizationStatus;
	}

	/**
	 * The number of documents that have had a field categorized.
	 * <p>
	 * API name: {@code model.categorized_doc_count}
	 */
	@Nullable
	public final String modelCategorizedDocCount() {
		return this.modelCategorizedDocCount;
	}

	/**
	 * The number of categories created by categorization.
	 * <p>
	 * API name: {@code model.total_category_count}
	 */
	@Nullable
	public final String modelTotalCategoryCount() {
		return this.modelTotalCategoryCount;
	}

	/**
	 * The number of categories that match more than 1% of categorized documents.
	 * <p>
	 * API name: {@code model.frequent_category_count}
	 */
	@Nullable
	public final String modelFrequentCategoryCount() {
		return this.modelFrequentCategoryCount;
	}

	/**
	 * The number of categories that match just one categorized document.
	 * <p>
	 * API name: {@code model.rare_category_count}
	 */
	@Nullable
	public final String modelRareCategoryCount() {
		return this.modelRareCategoryCount;
	}

	/**
	 * The number of categories created by categorization that will never be
	 * assigned again because another category’s definition makes it a superset of
	 * the dead category. Dead categories are a side effect of the way
	 * categorization has no prior training.
	 * <p>
	 * API name: {@code model.dead_category_count}
	 */
	@Nullable
	public final String modelDeadCategoryCount() {
		return this.modelDeadCategoryCount;
	}

	/**
	 * The number of times that categorization wanted to create a new category but
	 * couldn’t because the job had hit its <code>model_memory_limit</code>. This
	 * count does not track which specific categories failed to be created.
	 * Therefore you cannot use this value to determine the number of unique
	 * categories that were missed.
	 * <p>
	 * API name: {@code model.failed_category_count}
	 */
	@Nullable
	public final String modelFailedCategoryCount() {
		return this.modelFailedCategoryCount;
	}

	/**
	 * The timestamp when the model stats were gathered, according to server time.
	 * <p>
	 * API name: {@code model.log_time}
	 */
	@Nullable
	public final String modelLogTime() {
		return this.modelLogTime;
	}

	/**
	 * The timestamp of the last record when the model stats were gathered.
	 * <p>
	 * API name: {@code model.timestamp}
	 */
	@Nullable
	public final String modelTimestamp() {
		return this.modelTimestamp;
	}

	/**
	 * The number of individual forecasts currently available for the job. A value
	 * of one or more indicates that forecasts exist.
	 * <p>
	 * API name: {@code forecasts.total}
	 */
	@Nullable
	public final String forecastsTotal() {
		return this.forecastsTotal;
	}

	/**
	 * The minimum memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.memory.min}
	 */
	@Nullable
	public final String forecastsMemoryMin() {
		return this.forecastsMemoryMin;
	}

	/**
	 * The maximum memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.memory.max}
	 */
	@Nullable
	public final String forecastsMemoryMax() {
		return this.forecastsMemoryMax;
	}

	/**
	 * The average memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.memory.avg}
	 */
	@Nullable
	public final String forecastsMemoryAvg() {
		return this.forecastsMemoryAvg;
	}

	/**
	 * The total memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.memory.total}
	 */
	@Nullable
	public final String forecastsMemoryTotal() {
		return this.forecastsMemoryTotal;
	}

	/**
	 * The minimum number of <code>model_forecast</code> documents written for
	 * forecasts related to the anomaly detection job.
	 * <p>
	 * API name: {@code forecasts.records.min}
	 */
	@Nullable
	public final String forecastsRecordsMin() {
		return this.forecastsRecordsMin;
	}

	/**
	 * The maximum number of <code>model_forecast</code> documents written for
	 * forecasts related to the anomaly detection job.
	 * <p>
	 * API name: {@code forecasts.records.max}
	 */
	@Nullable
	public final String forecastsRecordsMax() {
		return this.forecastsRecordsMax;
	}

	/**
	 * The average number of <code>model_forecast</code> documents written for
	 * forecasts related to the anomaly detection job.
	 * <p>
	 * API name: {@code forecasts.records.avg}
	 */
	@Nullable
	public final String forecastsRecordsAvg() {
		return this.forecastsRecordsAvg;
	}

	/**
	 * The total number of <code>model_forecast</code> documents written for
	 * forecasts related to the anomaly detection job.
	 * <p>
	 * API name: {@code forecasts.records.total}
	 */
	@Nullable
	public final String forecastsRecordsTotal() {
		return this.forecastsRecordsTotal;
	}

	/**
	 * The minimum runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.time.min}
	 */
	@Nullable
	public final String forecastsTimeMin() {
		return this.forecastsTimeMin;
	}

	/**
	 * The maximum runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.time.max}
	 */
	@Nullable
	public final String forecastsTimeMax() {
		return this.forecastsTimeMax;
	}

	/**
	 * The average runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.time.avg}
	 */
	@Nullable
	public final String forecastsTimeAvg() {
		return this.forecastsTimeAvg;
	}

	/**
	 * The total runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 * <p>
	 * API name: {@code forecasts.time.total}
	 */
	@Nullable
	public final String forecastsTimeTotal() {
		return this.forecastsTimeTotal;
	}

	/**
	 * The uniqe identifier of the assigned node.
	 * <p>
	 * API name: {@code node.id}
	 */
	@Nullable
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * The name of the assigned node.
	 * <p>
	 * API name: {@code node.name}
	 */
	@Nullable
	public final String nodeName() {
		return this.nodeName;
	}

	/**
	 * The ephemeral identifier of the assigned node.
	 * <p>
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public final String nodeEphemeralId() {
		return this.nodeEphemeralId;
	}

	/**
	 * The network address of the assigned node.
	 * <p>
	 * API name: {@code node.address}
	 */
	@Nullable
	public final String nodeAddress() {
		return this.nodeAddress;
	}

	/**
	 * The number of bucket results produced by the job.
	 * <p>
	 * API name: {@code buckets.count}
	 */
	@Nullable
	public final String bucketsCount() {
		return this.bucketsCount;
	}

	/**
	 * The sum of all bucket processing times, in milliseconds.
	 * <p>
	 * API name: {@code buckets.time.total}
	 */
	@Nullable
	public final String bucketsTimeTotal() {
		return this.bucketsTimeTotal;
	}

	/**
	 * The minimum of all bucket processing times, in milliseconds.
	 * <p>
	 * API name: {@code buckets.time.min}
	 */
	@Nullable
	public final String bucketsTimeMin() {
		return this.bucketsTimeMin;
	}

	/**
	 * The maximum of all bucket processing times, in milliseconds.
	 * <p>
	 * API name: {@code buckets.time.max}
	 */
	@Nullable
	public final String bucketsTimeMax() {
		return this.bucketsTimeMax;
	}

	/**
	 * The exponential moving average of all bucket processing times, in
	 * milliseconds.
	 * <p>
	 * API name: {@code buckets.time.exp_avg}
	 */
	@Nullable
	public final String bucketsTimeExpAvg() {
		return this.bucketsTimeExpAvg;
	}

	/**
	 * The exponential moving average of bucket processing times calculated in a one
	 * hour time window, in milliseconds.
	 * <p>
	 * API name: {@code buckets.time.exp_avg_hour}
	 */
	@Nullable
	public final String bucketsTimeExpAvgHour() {
		return this.bucketsTimeExpAvgHour;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.state != null) {
			generator.writeKey("state");
			this.state.serialize(generator, mapper);
		}
		if (this.openedTime != null) {
			generator.writeKey("opened_time");
			generator.write(this.openedTime);

		}
		if (this.assignmentExplanation != null) {
			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}
		if (this.dataProcessedRecords != null) {
			generator.writeKey("data.processed_records");
			generator.write(this.dataProcessedRecords);

		}
		if (this.dataProcessedFields != null) {
			generator.writeKey("data.processed_fields");
			generator.write(this.dataProcessedFields);

		}
		if (this.dataInputBytes != null) {
			generator.writeKey("data.input_bytes");
			generator.write(this.dataInputBytes);

		}
		if (this.dataInputRecords != null) {
			generator.writeKey("data.input_records");
			generator.write(this.dataInputRecords);

		}
		if (this.dataInputFields != null) {
			generator.writeKey("data.input_fields");
			generator.write(this.dataInputFields);

		}
		if (this.dataInvalidDates != null) {
			generator.writeKey("data.invalid_dates");
			generator.write(this.dataInvalidDates);

		}
		if (this.dataMissingFields != null) {
			generator.writeKey("data.missing_fields");
			generator.write(this.dataMissingFields);

		}
		if (this.dataOutOfOrderTimestamps != null) {
			generator.writeKey("data.out_of_order_timestamps");
			generator.write(this.dataOutOfOrderTimestamps);

		}
		if (this.dataEmptyBuckets != null) {
			generator.writeKey("data.empty_buckets");
			generator.write(this.dataEmptyBuckets);

		}
		if (this.dataSparseBuckets != null) {
			generator.writeKey("data.sparse_buckets");
			generator.write(this.dataSparseBuckets);

		}
		if (this.dataBuckets != null) {
			generator.writeKey("data.buckets");
			generator.write(this.dataBuckets);

		}
		if (this.dataEarliestRecord != null) {
			generator.writeKey("data.earliest_record");
			generator.write(this.dataEarliestRecord);

		}
		if (this.dataLatestRecord != null) {
			generator.writeKey("data.latest_record");
			generator.write(this.dataLatestRecord);

		}
		if (this.dataLast != null) {
			generator.writeKey("data.last");
			generator.write(this.dataLast);

		}
		if (this.dataLastEmptyBucket != null) {
			generator.writeKey("data.last_empty_bucket");
			generator.write(this.dataLastEmptyBucket);

		}
		if (this.dataLastSparseBucket != null) {
			generator.writeKey("data.last_sparse_bucket");
			generator.write(this.dataLastSparseBucket);

		}
		if (this.modelBytes != null) {
			generator.writeKey("model.bytes");
			generator.write(this.modelBytes);

		}
		if (this.modelMemoryStatus != null) {
			generator.writeKey("model.memory_status");
			this.modelMemoryStatus.serialize(generator, mapper);
		}
		if (this.modelBytesExceeded != null) {
			generator.writeKey("model.bytes_exceeded");
			generator.write(this.modelBytesExceeded);

		}
		if (this.modelMemoryLimit != null) {
			generator.writeKey("model.memory_limit");
			generator.write(this.modelMemoryLimit);

		}
		if (this.modelByFields != null) {
			generator.writeKey("model.by_fields");
			generator.write(this.modelByFields);

		}
		if (this.modelOverFields != null) {
			generator.writeKey("model.over_fields");
			generator.write(this.modelOverFields);

		}
		if (this.modelPartitionFields != null) {
			generator.writeKey("model.partition_fields");
			generator.write(this.modelPartitionFields);

		}
		if (this.modelBucketAllocationFailures != null) {
			generator.writeKey("model.bucket_allocation_failures");
			generator.write(this.modelBucketAllocationFailures);

		}
		if (this.modelCategorizationStatus != null) {
			generator.writeKey("model.categorization_status");
			this.modelCategorizationStatus.serialize(generator, mapper);
		}
		if (this.modelCategorizedDocCount != null) {
			generator.writeKey("model.categorized_doc_count");
			generator.write(this.modelCategorizedDocCount);

		}
		if (this.modelTotalCategoryCount != null) {
			generator.writeKey("model.total_category_count");
			generator.write(this.modelTotalCategoryCount);

		}
		if (this.modelFrequentCategoryCount != null) {
			generator.writeKey("model.frequent_category_count");
			generator.write(this.modelFrequentCategoryCount);

		}
		if (this.modelRareCategoryCount != null) {
			generator.writeKey("model.rare_category_count");
			generator.write(this.modelRareCategoryCount);

		}
		if (this.modelDeadCategoryCount != null) {
			generator.writeKey("model.dead_category_count");
			generator.write(this.modelDeadCategoryCount);

		}
		if (this.modelFailedCategoryCount != null) {
			generator.writeKey("model.failed_category_count");
			generator.write(this.modelFailedCategoryCount);

		}
		if (this.modelLogTime != null) {
			generator.writeKey("model.log_time");
			generator.write(this.modelLogTime);

		}
		if (this.modelTimestamp != null) {
			generator.writeKey("model.timestamp");
			generator.write(this.modelTimestamp);

		}
		if (this.forecastsTotal != null) {
			generator.writeKey("forecasts.total");
			generator.write(this.forecastsTotal);

		}
		if (this.forecastsMemoryMin != null) {
			generator.writeKey("forecasts.memory.min");
			generator.write(this.forecastsMemoryMin);

		}
		if (this.forecastsMemoryMax != null) {
			generator.writeKey("forecasts.memory.max");
			generator.write(this.forecastsMemoryMax);

		}
		if (this.forecastsMemoryAvg != null) {
			generator.writeKey("forecasts.memory.avg");
			generator.write(this.forecastsMemoryAvg);

		}
		if (this.forecastsMemoryTotal != null) {
			generator.writeKey("forecasts.memory.total");
			generator.write(this.forecastsMemoryTotal);

		}
		if (this.forecastsRecordsMin != null) {
			generator.writeKey("forecasts.records.min");
			generator.write(this.forecastsRecordsMin);

		}
		if (this.forecastsRecordsMax != null) {
			generator.writeKey("forecasts.records.max");
			generator.write(this.forecastsRecordsMax);

		}
		if (this.forecastsRecordsAvg != null) {
			generator.writeKey("forecasts.records.avg");
			generator.write(this.forecastsRecordsAvg);

		}
		if (this.forecastsRecordsTotal != null) {
			generator.writeKey("forecasts.records.total");
			generator.write(this.forecastsRecordsTotal);

		}
		if (this.forecastsTimeMin != null) {
			generator.writeKey("forecasts.time.min");
			generator.write(this.forecastsTimeMin);

		}
		if (this.forecastsTimeMax != null) {
			generator.writeKey("forecasts.time.max");
			generator.write(this.forecastsTimeMax);

		}
		if (this.forecastsTimeAvg != null) {
			generator.writeKey("forecasts.time.avg");
			generator.write(this.forecastsTimeAvg);

		}
		if (this.forecastsTimeTotal != null) {
			generator.writeKey("forecasts.time.total");
			generator.write(this.forecastsTimeTotal);

		}
		if (this.nodeId != null) {
			generator.writeKey("node.id");
			generator.write(this.nodeId);

		}
		if (this.nodeName != null) {
			generator.writeKey("node.name");
			generator.write(this.nodeName);

		}
		if (this.nodeEphemeralId != null) {
			generator.writeKey("node.ephemeral_id");
			generator.write(this.nodeEphemeralId);

		}
		if (this.nodeAddress != null) {
			generator.writeKey("node.address");
			generator.write(this.nodeAddress);

		}
		if (this.bucketsCount != null) {
			generator.writeKey("buckets.count");
			generator.write(this.bucketsCount);

		}
		if (this.bucketsTimeTotal != null) {
			generator.writeKey("buckets.time.total");
			generator.write(this.bucketsTimeTotal);

		}
		if (this.bucketsTimeMin != null) {
			generator.writeKey("buckets.time.min");
			generator.write(this.bucketsTimeMin);

		}
		if (this.bucketsTimeMax != null) {
			generator.writeKey("buckets.time.max");
			generator.write(this.bucketsTimeMax);

		}
		if (this.bucketsTimeExpAvg != null) {
			generator.writeKey("buckets.time.exp_avg");
			generator.write(this.bucketsTimeExpAvg);

		}
		if (this.bucketsTimeExpAvgHour != null) {
			generator.writeKey("buckets.time.exp_avg_hour");
			generator.write(this.bucketsTimeExpAvgHour);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobsRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<JobsRecord> {
		@Nullable
		private String id;

		@Nullable
		private JobState state;

		@Nullable
		private String openedTime;

		@Nullable
		private String assignmentExplanation;

		@Nullable
		private String dataProcessedRecords;

		@Nullable
		private String dataProcessedFields;

		@Nullable
		private String dataInputBytes;

		@Nullable
		private String dataInputRecords;

		@Nullable
		private String dataInputFields;

		@Nullable
		private String dataInvalidDates;

		@Nullable
		private String dataMissingFields;

		@Nullable
		private String dataOutOfOrderTimestamps;

		@Nullable
		private String dataEmptyBuckets;

		@Nullable
		private String dataSparseBuckets;

		@Nullable
		private String dataBuckets;

		@Nullable
		private String dataEarliestRecord;

		@Nullable
		private String dataLatestRecord;

		@Nullable
		private String dataLast;

		@Nullable
		private String dataLastEmptyBucket;

		@Nullable
		private String dataLastSparseBucket;

		@Nullable
		private String modelBytes;

		@Nullable
		private MemoryStatus modelMemoryStatus;

		@Nullable
		private String modelBytesExceeded;

		@Nullable
		private String modelMemoryLimit;

		@Nullable
		private String modelByFields;

		@Nullable
		private String modelOverFields;

		@Nullable
		private String modelPartitionFields;

		@Nullable
		private String modelBucketAllocationFailures;

		@Nullable
		private CategorizationStatus modelCategorizationStatus;

		@Nullable
		private String modelCategorizedDocCount;

		@Nullable
		private String modelTotalCategoryCount;

		@Nullable
		private String modelFrequentCategoryCount;

		@Nullable
		private String modelRareCategoryCount;

		@Nullable
		private String modelDeadCategoryCount;

		@Nullable
		private String modelFailedCategoryCount;

		@Nullable
		private String modelLogTime;

		@Nullable
		private String modelTimestamp;

		@Nullable
		private String forecastsTotal;

		@Nullable
		private String forecastsMemoryMin;

		@Nullable
		private String forecastsMemoryMax;

		@Nullable
		private String forecastsMemoryAvg;

		@Nullable
		private String forecastsMemoryTotal;

		@Nullable
		private String forecastsRecordsMin;

		@Nullable
		private String forecastsRecordsMax;

		@Nullable
		private String forecastsRecordsAvg;

		@Nullable
		private String forecastsRecordsTotal;

		@Nullable
		private String forecastsTimeMin;

		@Nullable
		private String forecastsTimeMax;

		@Nullable
		private String forecastsTimeAvg;

		@Nullable
		private String forecastsTimeTotal;

		@Nullable
		private String nodeId;

		@Nullable
		private String nodeName;

		@Nullable
		private String nodeEphemeralId;

		@Nullable
		private String nodeAddress;

		@Nullable
		private String bucketsCount;

		@Nullable
		private String bucketsTimeTotal;

		@Nullable
		private String bucketsTimeMin;

		@Nullable
		private String bucketsTimeMax;

		@Nullable
		private String bucketsTimeExpAvg;

		@Nullable
		private String bucketsTimeExpAvgHour;

		/**
		 * The anomaly detection job identifier.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The status of the anomaly detection job.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable JobState value) {
			this.state = value;
			return this;
		}

		/**
		 * For open jobs only, the amount of time the job has been opened.
		 * <p>
		 * API name: {@code opened_time}
		 */
		public final Builder openedTime(@Nullable String value) {
			this.openedTime = value;
			return this;
		}

		/**
		 * For open anomaly detection jobs only, contains messages relating to the
		 * selection of a node to run the job.
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * The number of input documents that have been processed by the anomaly
		 * detection job. This value includes documents with missing fields, since they
		 * are nonetheless analyzed. If you use datafeeds and have aggregations in your
		 * search query, the <code>processed_record_count</code> is the number of
		 * aggregation results processed, not the number of Elasticsearch documents.
		 * <p>
		 * API name: {@code data.processed_records}
		 */
		public final Builder dataProcessedRecords(@Nullable String value) {
			this.dataProcessedRecords = value;
			return this;
		}

		/**
		 * The total number of fields in all the documents that have been processed by
		 * the anomaly detection job. Only fields that are specified in the detector
		 * configuration object contribute to this count. The timestamp is not included
		 * in this count.
		 * <p>
		 * API name: {@code data.processed_fields}
		 */
		public final Builder dataProcessedFields(@Nullable String value) {
			this.dataProcessedFields = value;
			return this;
		}

		/**
		 * The number of bytes of input data posted to the anomaly detection job.
		 * <p>
		 * API name: {@code data.input_bytes}
		 */
		public final Builder dataInputBytes(@Nullable String value) {
			this.dataInputBytes = value;
			return this;
		}

		/**
		 * The number of input documents posted to the anomaly detection job.
		 * <p>
		 * API name: {@code data.input_records}
		 */
		public final Builder dataInputRecords(@Nullable String value) {
			this.dataInputRecords = value;
			return this;
		}

		/**
		 * The total number of fields in input documents posted to the anomaly detection
		 * job. This count includes fields that are not used in the analysis. However,
		 * be aware that if you are using a datafeed, it extracts only the required
		 * fields from the documents it retrieves before posting them to the job.
		 * <p>
		 * API name: {@code data.input_fields}
		 */
		public final Builder dataInputFields(@Nullable String value) {
			this.dataInputFields = value;
			return this;
		}

		/**
		 * The number of input documents with either a missing date field or a date that
		 * could not be parsed.
		 * <p>
		 * API name: {@code data.invalid_dates}
		 */
		public final Builder dataInvalidDates(@Nullable String value) {
			this.dataInvalidDates = value;
			return this;
		}

		/**
		 * The number of input documents that are missing a field that the anomaly
		 * detection job is configured to analyze. Input documents with missing fields
		 * are still processed because it is possible that not all fields are missing.
		 * If you are using datafeeds or posting data to the job in JSON format, a high
		 * <code>missing_field_count</code> is often not an indication of data issues.
		 * It is not necessarily a cause for concern.
		 * <p>
		 * API name: {@code data.missing_fields}
		 */
		public final Builder dataMissingFields(@Nullable String value) {
			this.dataMissingFields = value;
			return this;
		}

		/**
		 * The number of input documents that have a timestamp chronologically preceding
		 * the start of the current anomaly detection bucket offset by the latency
		 * window. This information is applicable only when you provide data to the
		 * anomaly detection job by using the post data API. These out of order
		 * documents are discarded, since jobs require time series data to be in
		 * ascending chronological order.
		 * <p>
		 * API name: {@code data.out_of_order_timestamps}
		 */
		public final Builder dataOutOfOrderTimestamps(@Nullable String value) {
			this.dataOutOfOrderTimestamps = value;
			return this;
		}

		/**
		 * The number of buckets which did not contain any data. If your data contains
		 * many empty buckets, consider increasing your <code>bucket_span</code> or
		 * using functions that are tolerant to gaps in data such as mean,
		 * <code>non_null_sum</code> or <code>non_zero_count</code>.
		 * <p>
		 * API name: {@code data.empty_buckets}
		 */
		public final Builder dataEmptyBuckets(@Nullable String value) {
			this.dataEmptyBuckets = value;
			return this;
		}

		/**
		 * The number of buckets that contained few data points compared to the expected
		 * number of data points. If your data contains many sparse buckets, consider
		 * using a longer <code>bucket_span</code>.
		 * <p>
		 * API name: {@code data.sparse_buckets}
		 */
		public final Builder dataSparseBuckets(@Nullable String value) {
			this.dataSparseBuckets = value;
			return this;
		}

		/**
		 * The total number of buckets processed.
		 * <p>
		 * API name: {@code data.buckets}
		 */
		public final Builder dataBuckets(@Nullable String value) {
			this.dataBuckets = value;
			return this;
		}

		/**
		 * The timestamp of the earliest chronologically input document.
		 * <p>
		 * API name: {@code data.earliest_record}
		 */
		public final Builder dataEarliestRecord(@Nullable String value) {
			this.dataEarliestRecord = value;
			return this;
		}

		/**
		 * The timestamp of the latest chronologically input document.
		 * <p>
		 * API name: {@code data.latest_record}
		 */
		public final Builder dataLatestRecord(@Nullable String value) {
			this.dataLatestRecord = value;
			return this;
		}

		/**
		 * The timestamp at which data was last analyzed, according to server time.
		 * <p>
		 * API name: {@code data.last}
		 */
		public final Builder dataLast(@Nullable String value) {
			this.dataLast = value;
			return this;
		}

		/**
		 * The timestamp of the last bucket that did not contain any data.
		 * <p>
		 * API name: {@code data.last_empty_bucket}
		 */
		public final Builder dataLastEmptyBucket(@Nullable String value) {
			this.dataLastEmptyBucket = value;
			return this;
		}

		/**
		 * The timestamp of the last bucket that was considered sparse.
		 * <p>
		 * API name: {@code data.last_sparse_bucket}
		 */
		public final Builder dataLastSparseBucket(@Nullable String value) {
			this.dataLastSparseBucket = value;
			return this;
		}

		/**
		 * The number of bytes of memory used by the models. This is the maximum value
		 * since the last time the model was persisted. If the job is closed, this value
		 * indicates the latest size.
		 * <p>
		 * API name: {@code model.bytes}
		 */
		public final Builder modelBytes(@Nullable String value) {
			this.modelBytes = value;
			return this;
		}

		/**
		 * The status of the mathematical models.
		 * <p>
		 * API name: {@code model.memory_status}
		 */
		public final Builder modelMemoryStatus(@Nullable MemoryStatus value) {
			this.modelMemoryStatus = value;
			return this;
		}

		/**
		 * The number of bytes over the high limit for memory usage at the last
		 * allocation failure.
		 * <p>
		 * API name: {@code model.bytes_exceeded}
		 */
		public final Builder modelBytesExceeded(@Nullable String value) {
			this.modelBytesExceeded = value;
			return this;
		}

		/**
		 * The upper limit for model memory usage, checked on increasing values.
		 * <p>
		 * API name: {@code model.memory_limit}
		 */
		public final Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * The number of <code>by</code> field values that were analyzed by the models.
		 * This value is cumulative for all detectors in the job.
		 * <p>
		 * API name: {@code model.by_fields}
		 */
		public final Builder modelByFields(@Nullable String value) {
			this.modelByFields = value;
			return this;
		}

		/**
		 * The number of <code>over</code> field values that were analyzed by the
		 * models. This value is cumulative for all detectors in the job.
		 * <p>
		 * API name: {@code model.over_fields}
		 */
		public final Builder modelOverFields(@Nullable String value) {
			this.modelOverFields = value;
			return this;
		}

		/**
		 * The number of <code>partition</code> field values that were analyzed by the
		 * models. This value is cumulative for all detectors in the job.
		 * <p>
		 * API name: {@code model.partition_fields}
		 */
		public final Builder modelPartitionFields(@Nullable String value) {
			this.modelPartitionFields = value;
			return this;
		}

		/**
		 * The number of buckets for which new entities in incoming data were not
		 * processed due to insufficient model memory. This situation is also signified
		 * by a <code>hard_limit: memory_status</code> property value.
		 * <p>
		 * API name: {@code model.bucket_allocation_failures}
		 */
		public final Builder modelBucketAllocationFailures(@Nullable String value) {
			this.modelBucketAllocationFailures = value;
			return this;
		}

		/**
		 * The status of categorization for the job.
		 * <p>
		 * API name: {@code model.categorization_status}
		 */
		public final Builder modelCategorizationStatus(@Nullable CategorizationStatus value) {
			this.modelCategorizationStatus = value;
			return this;
		}

		/**
		 * The number of documents that have had a field categorized.
		 * <p>
		 * API name: {@code model.categorized_doc_count}
		 */
		public final Builder modelCategorizedDocCount(@Nullable String value) {
			this.modelCategorizedDocCount = value;
			return this;
		}

		/**
		 * The number of categories created by categorization.
		 * <p>
		 * API name: {@code model.total_category_count}
		 */
		public final Builder modelTotalCategoryCount(@Nullable String value) {
			this.modelTotalCategoryCount = value;
			return this;
		}

		/**
		 * The number of categories that match more than 1% of categorized documents.
		 * <p>
		 * API name: {@code model.frequent_category_count}
		 */
		public final Builder modelFrequentCategoryCount(@Nullable String value) {
			this.modelFrequentCategoryCount = value;
			return this;
		}

		/**
		 * The number of categories that match just one categorized document.
		 * <p>
		 * API name: {@code model.rare_category_count}
		 */
		public final Builder modelRareCategoryCount(@Nullable String value) {
			this.modelRareCategoryCount = value;
			return this;
		}

		/**
		 * The number of categories created by categorization that will never be
		 * assigned again because another category’s definition makes it a superset of
		 * the dead category. Dead categories are a side effect of the way
		 * categorization has no prior training.
		 * <p>
		 * API name: {@code model.dead_category_count}
		 */
		public final Builder modelDeadCategoryCount(@Nullable String value) {
			this.modelDeadCategoryCount = value;
			return this;
		}

		/**
		 * The number of times that categorization wanted to create a new category but
		 * couldn’t because the job had hit its <code>model_memory_limit</code>. This
		 * count does not track which specific categories failed to be created.
		 * Therefore you cannot use this value to determine the number of unique
		 * categories that were missed.
		 * <p>
		 * API name: {@code model.failed_category_count}
		 */
		public final Builder modelFailedCategoryCount(@Nullable String value) {
			this.modelFailedCategoryCount = value;
			return this;
		}

		/**
		 * The timestamp when the model stats were gathered, according to server time.
		 * <p>
		 * API name: {@code model.log_time}
		 */
		public final Builder modelLogTime(@Nullable String value) {
			this.modelLogTime = value;
			return this;
		}

		/**
		 * The timestamp of the last record when the model stats were gathered.
		 * <p>
		 * API name: {@code model.timestamp}
		 */
		public final Builder modelTimestamp(@Nullable String value) {
			this.modelTimestamp = value;
			return this;
		}

		/**
		 * The number of individual forecasts currently available for the job. A value
		 * of one or more indicates that forecasts exist.
		 * <p>
		 * API name: {@code forecasts.total}
		 */
		public final Builder forecastsTotal(@Nullable String value) {
			this.forecastsTotal = value;
			return this;
		}

		/**
		 * The minimum memory usage in bytes for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.memory.min}
		 */
		public final Builder forecastsMemoryMin(@Nullable String value) {
			this.forecastsMemoryMin = value;
			return this;
		}

		/**
		 * The maximum memory usage in bytes for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.memory.max}
		 */
		public final Builder forecastsMemoryMax(@Nullable String value) {
			this.forecastsMemoryMax = value;
			return this;
		}

		/**
		 * The average memory usage in bytes for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.memory.avg}
		 */
		public final Builder forecastsMemoryAvg(@Nullable String value) {
			this.forecastsMemoryAvg = value;
			return this;
		}

		/**
		 * The total memory usage in bytes for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.memory.total}
		 */
		public final Builder forecastsMemoryTotal(@Nullable String value) {
			this.forecastsMemoryTotal = value;
			return this;
		}

		/**
		 * The minimum number of <code>model_forecast</code> documents written for
		 * forecasts related to the anomaly detection job.
		 * <p>
		 * API name: {@code forecasts.records.min}
		 */
		public final Builder forecastsRecordsMin(@Nullable String value) {
			this.forecastsRecordsMin = value;
			return this;
		}

		/**
		 * The maximum number of <code>model_forecast</code> documents written for
		 * forecasts related to the anomaly detection job.
		 * <p>
		 * API name: {@code forecasts.records.max}
		 */
		public final Builder forecastsRecordsMax(@Nullable String value) {
			this.forecastsRecordsMax = value;
			return this;
		}

		/**
		 * The average number of <code>model_forecast</code> documents written for
		 * forecasts related to the anomaly detection job.
		 * <p>
		 * API name: {@code forecasts.records.avg}
		 */
		public final Builder forecastsRecordsAvg(@Nullable String value) {
			this.forecastsRecordsAvg = value;
			return this;
		}

		/**
		 * The total number of <code>model_forecast</code> documents written for
		 * forecasts related to the anomaly detection job.
		 * <p>
		 * API name: {@code forecasts.records.total}
		 */
		public final Builder forecastsRecordsTotal(@Nullable String value) {
			this.forecastsRecordsTotal = value;
			return this;
		}

		/**
		 * The minimum runtime in milliseconds for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.time.min}
		 */
		public final Builder forecastsTimeMin(@Nullable String value) {
			this.forecastsTimeMin = value;
			return this;
		}

		/**
		 * The maximum runtime in milliseconds for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.time.max}
		 */
		public final Builder forecastsTimeMax(@Nullable String value) {
			this.forecastsTimeMax = value;
			return this;
		}

		/**
		 * The average runtime in milliseconds for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.time.avg}
		 */
		public final Builder forecastsTimeAvg(@Nullable String value) {
			this.forecastsTimeAvg = value;
			return this;
		}

		/**
		 * The total runtime in milliseconds for forecasts related to the anomaly
		 * detection job.
		 * <p>
		 * API name: {@code forecasts.time.total}
		 */
		public final Builder forecastsTimeTotal(@Nullable String value) {
			this.forecastsTimeTotal = value;
			return this;
		}

		/**
		 * The uniqe identifier of the assigned node.
		 * <p>
		 * API name: {@code node.id}
		 */
		public final Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * The name of the assigned node.
		 * <p>
		 * API name: {@code node.name}
		 */
		public final Builder nodeName(@Nullable String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * The ephemeral identifier of the assigned node.
		 * <p>
		 * API name: {@code node.ephemeral_id}
		 */
		public final Builder nodeEphemeralId(@Nullable String value) {
			this.nodeEphemeralId = value;
			return this;
		}

		/**
		 * The network address of the assigned node.
		 * <p>
		 * API name: {@code node.address}
		 */
		public final Builder nodeAddress(@Nullable String value) {
			this.nodeAddress = value;
			return this;
		}

		/**
		 * The number of bucket results produced by the job.
		 * <p>
		 * API name: {@code buckets.count}
		 */
		public final Builder bucketsCount(@Nullable String value) {
			this.bucketsCount = value;
			return this;
		}

		/**
		 * The sum of all bucket processing times, in milliseconds.
		 * <p>
		 * API name: {@code buckets.time.total}
		 */
		public final Builder bucketsTimeTotal(@Nullable String value) {
			this.bucketsTimeTotal = value;
			return this;
		}

		/**
		 * The minimum of all bucket processing times, in milliseconds.
		 * <p>
		 * API name: {@code buckets.time.min}
		 */
		public final Builder bucketsTimeMin(@Nullable String value) {
			this.bucketsTimeMin = value;
			return this;
		}

		/**
		 * The maximum of all bucket processing times, in milliseconds.
		 * <p>
		 * API name: {@code buckets.time.max}
		 */
		public final Builder bucketsTimeMax(@Nullable String value) {
			this.bucketsTimeMax = value;
			return this;
		}

		/**
		 * The exponential moving average of all bucket processing times, in
		 * milliseconds.
		 * <p>
		 * API name: {@code buckets.time.exp_avg}
		 */
		public final Builder bucketsTimeExpAvg(@Nullable String value) {
			this.bucketsTimeExpAvg = value;
			return this;
		}

		/**
		 * The exponential moving average of bucket processing times calculated in a one
		 * hour time window, in milliseconds.
		 * <p>
		 * API name: {@code buckets.time.exp_avg_hour}
		 */
		public final Builder bucketsTimeExpAvgHour(@Nullable String value) {
			this.bucketsTimeExpAvgHour = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JobsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobsRecord build() {
			_checkSingleUse();

			return new JobsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobsRecord}
	 */
	public static final JsonpDeserializer<JobsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobsRecord::setupJobsRecordDeserializer);

	protected static void setupJobsRecordDeserializer(ObjectDeserializer<JobsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::state, JobState._DESERIALIZER, "state", "s");
		op.add(Builder::openedTime, JsonpDeserializer.stringDeserializer(), "opened_time", "ot");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation", "ae");
		op.add(Builder::dataProcessedRecords, JsonpDeserializer.stringDeserializer(), "data.processed_records", "dpr",
				"dataProcessedRecords");
		op.add(Builder::dataProcessedFields, JsonpDeserializer.stringDeserializer(), "data.processed_fields", "dpf",
				"dataProcessedFields");
		op.add(Builder::dataInputBytes, JsonpDeserializer.stringDeserializer(), "data.input_bytes", "dib",
				"dataInputBytes");
		op.add(Builder::dataInputRecords, JsonpDeserializer.stringDeserializer(), "data.input_records", "dir",
				"dataInputRecords");
		op.add(Builder::dataInputFields, JsonpDeserializer.stringDeserializer(), "data.input_fields", "dif",
				"dataInputFields");
		op.add(Builder::dataInvalidDates, JsonpDeserializer.stringDeserializer(), "data.invalid_dates", "did",
				"dataInvalidDates");
		op.add(Builder::dataMissingFields, JsonpDeserializer.stringDeserializer(), "data.missing_fields", "dmf",
				"dataMissingFields");
		op.add(Builder::dataOutOfOrderTimestamps, JsonpDeserializer.stringDeserializer(),
				"data.out_of_order_timestamps", "doot", "dataOutOfOrderTimestamps");
		op.add(Builder::dataEmptyBuckets, JsonpDeserializer.stringDeserializer(), "data.empty_buckets", "deb",
				"dataEmptyBuckets");
		op.add(Builder::dataSparseBuckets, JsonpDeserializer.stringDeserializer(), "data.sparse_buckets", "dsb",
				"dataSparseBuckets");
		op.add(Builder::dataBuckets, JsonpDeserializer.stringDeserializer(), "data.buckets", "db", "dataBuckets");
		op.add(Builder::dataEarliestRecord, JsonpDeserializer.stringDeserializer(), "data.earliest_record", "der",
				"dataEarliestRecord");
		op.add(Builder::dataLatestRecord, JsonpDeserializer.stringDeserializer(), "data.latest_record", "dlr",
				"dataLatestRecord");
		op.add(Builder::dataLast, JsonpDeserializer.stringDeserializer(), "data.last", "dl", "dataLast");
		op.add(Builder::dataLastEmptyBucket, JsonpDeserializer.stringDeserializer(), "data.last_empty_bucket", "dleb",
				"dataLastEmptyBucket");
		op.add(Builder::dataLastSparseBucket, JsonpDeserializer.stringDeserializer(), "data.last_sparse_bucket", "dlsb",
				"dataLastSparseBucket");
		op.add(Builder::modelBytes, JsonpDeserializer.stringDeserializer(), "model.bytes", "mb", "modelBytes");
		op.add(Builder::modelMemoryStatus, MemoryStatus._DESERIALIZER, "model.memory_status", "mms",
				"modelMemoryStatus");
		op.add(Builder::modelBytesExceeded, JsonpDeserializer.stringDeserializer(), "model.bytes_exceeded", "mbe",
				"modelBytesExceeded");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model.memory_limit", "mml",
				"modelMemoryLimit");
		op.add(Builder::modelByFields, JsonpDeserializer.stringDeserializer(), "model.by_fields", "mbf",
				"modelByFields");
		op.add(Builder::modelOverFields, JsonpDeserializer.stringDeserializer(), "model.over_fields", "mof",
				"modelOverFields");
		op.add(Builder::modelPartitionFields, JsonpDeserializer.stringDeserializer(), "model.partition_fields", "mpf",
				"modelPartitionFields");
		op.add(Builder::modelBucketAllocationFailures, JsonpDeserializer.stringDeserializer(),
				"model.bucket_allocation_failures", "mbaf", "modelBucketAllocationFailures");
		op.add(Builder::modelCategorizationStatus, CategorizationStatus._DESERIALIZER, "model.categorization_status",
				"mcs", "modelCategorizationStatus");
		op.add(Builder::modelCategorizedDocCount, JsonpDeserializer.stringDeserializer(), "model.categorized_doc_count",
				"mcdc", "modelCategorizedDocCount");
		op.add(Builder::modelTotalCategoryCount, JsonpDeserializer.stringDeserializer(), "model.total_category_count",
				"mtcc", "modelTotalCategoryCount");
		op.add(Builder::modelFrequentCategoryCount, JsonpDeserializer.stringDeserializer(),
				"model.frequent_category_count", "modelFrequentCategoryCount");
		op.add(Builder::modelRareCategoryCount, JsonpDeserializer.stringDeserializer(), "model.rare_category_count",
				"mrcc", "modelRareCategoryCount");
		op.add(Builder::modelDeadCategoryCount, JsonpDeserializer.stringDeserializer(), "model.dead_category_count",
				"mdcc", "modelDeadCategoryCount");
		op.add(Builder::modelFailedCategoryCount, JsonpDeserializer.stringDeserializer(), "model.failed_category_count",
				"mfcc", "modelFailedCategoryCount");
		op.add(Builder::modelLogTime, JsonpDeserializer.stringDeserializer(), "model.log_time", "mlt", "modelLogTime");
		op.add(Builder::modelTimestamp, JsonpDeserializer.stringDeserializer(), "model.timestamp", "mt",
				"modelTimestamp");
		op.add(Builder::forecastsTotal, JsonpDeserializer.stringDeserializer(), "forecasts.total", "ft",
				"forecastsTotal");
		op.add(Builder::forecastsMemoryMin, JsonpDeserializer.stringDeserializer(), "forecasts.memory.min", "fmmin",
				"forecastsMemoryMin");
		op.add(Builder::forecastsMemoryMax, JsonpDeserializer.stringDeserializer(), "forecasts.memory.max", "fmmax",
				"forecastsMemoryMax");
		op.add(Builder::forecastsMemoryAvg, JsonpDeserializer.stringDeserializer(), "forecasts.memory.avg", "fmavg",
				"forecastsMemoryAvg");
		op.add(Builder::forecastsMemoryTotal, JsonpDeserializer.stringDeserializer(), "forecasts.memory.total", "fmt",
				"forecastsMemoryTotal");
		op.add(Builder::forecastsRecordsMin, JsonpDeserializer.stringDeserializer(), "forecasts.records.min", "frmin",
				"forecastsRecordsMin");
		op.add(Builder::forecastsRecordsMax, JsonpDeserializer.stringDeserializer(), "forecasts.records.max", "frmax",
				"forecastsRecordsMax");
		op.add(Builder::forecastsRecordsAvg, JsonpDeserializer.stringDeserializer(), "forecasts.records.avg", "fravg",
				"forecastsRecordsAvg");
		op.add(Builder::forecastsRecordsTotal, JsonpDeserializer.stringDeserializer(), "forecasts.records.total", "frt",
				"forecastsRecordsTotal");
		op.add(Builder::forecastsTimeMin, JsonpDeserializer.stringDeserializer(), "forecasts.time.min", "ftmin",
				"forecastsTimeMin");
		op.add(Builder::forecastsTimeMax, JsonpDeserializer.stringDeserializer(), "forecasts.time.max", "ftmax",
				"forecastsTimeMax");
		op.add(Builder::forecastsTimeAvg, JsonpDeserializer.stringDeserializer(), "forecasts.time.avg", "ftavg",
				"forecastsTimeAvg");
		op.add(Builder::forecastsTimeTotal, JsonpDeserializer.stringDeserializer(), "forecasts.time.total", "ftt",
				"forecastsTimeTotal");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node.id", "ni", "nodeId");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node.name", "nn", "nodeName");
		op.add(Builder::nodeEphemeralId, JsonpDeserializer.stringDeserializer(), "node.ephemeral_id", "ne",
				"nodeEphemeralId");
		op.add(Builder::nodeAddress, JsonpDeserializer.stringDeserializer(), "node.address", "na", "nodeAddress");
		op.add(Builder::bucketsCount, JsonpDeserializer.stringDeserializer(), "buckets.count", "bc", "bucketsCount");
		op.add(Builder::bucketsTimeTotal, JsonpDeserializer.stringDeserializer(), "buckets.time.total", "btt",
				"bucketsTimeTotal");
		op.add(Builder::bucketsTimeMin, JsonpDeserializer.stringDeserializer(), "buckets.time.min", "btmin",
				"bucketsTimeMin");
		op.add(Builder::bucketsTimeMax, JsonpDeserializer.stringDeserializer(), "buckets.time.max", "btmax",
				"bucketsTimeMax");
		op.add(Builder::bucketsTimeExpAvg, JsonpDeserializer.stringDeserializer(), "buckets.time.exp_avg", "btea",
				"bucketsTimeExpAvg");
		op.add(Builder::bucketsTimeExpAvgHour, JsonpDeserializer.stringDeserializer(), "buckets.time.exp_avg_hour",
				"bteah", "bucketsTimeExpAvgHour");

	}

}
