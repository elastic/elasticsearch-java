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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_jobs.JobsRecord
@JsonpDeserializable
public final class JobsRecord implements JsonpSerializable {
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

	public JobsRecord(Builder builder) {

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

	public JobsRecord(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * the job_id
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * the job state
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public JobState state() {
		return this.state;
	}

	/**
	 * the amount of time the job has been opened
	 * <p>
	 * API name: {@code opened_time}
	 */
	@Nullable
	public String openedTime() {
		return this.openedTime;
	}

	/**
	 * why the job is or is not assigned to a node
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * number of processed records
	 * <p>
	 * API name: {@code data.processed_records}
	 */
	@Nullable
	public String dataProcessedRecords() {
		return this.dataProcessedRecords;
	}

	/**
	 * number of processed fields
	 * <p>
	 * API name: {@code data.processed_fields}
	 */
	@Nullable
	public String dataProcessedFields() {
		return this.dataProcessedFields;
	}

	/**
	 * total input bytes
	 * <p>
	 * API name: {@code data.input_bytes}
	 */
	@Nullable
	public String dataInputBytes() {
		return this.dataInputBytes;
	}

	/**
	 * total record count
	 * <p>
	 * API name: {@code data.input_records}
	 */
	@Nullable
	public String dataInputRecords() {
		return this.dataInputRecords;
	}

	/**
	 * total field count
	 * <p>
	 * API name: {@code data.input_fields}
	 */
	@Nullable
	public String dataInputFields() {
		return this.dataInputFields;
	}

	/**
	 * number of records with invalid dates
	 * <p>
	 * API name: {@code data.invalid_dates}
	 */
	@Nullable
	public String dataInvalidDates() {
		return this.dataInvalidDates;
	}

	/**
	 * number of records with missing fields
	 * <p>
	 * API name: {@code data.missing_fields}
	 */
	@Nullable
	public String dataMissingFields() {
		return this.dataMissingFields;
	}

	/**
	 * number of records handled out of order
	 * <p>
	 * API name: {@code data.out_of_order_timestamps}
	 */
	@Nullable
	public String dataOutOfOrderTimestamps() {
		return this.dataOutOfOrderTimestamps;
	}

	/**
	 * number of empty buckets
	 * <p>
	 * API name: {@code data.empty_buckets}
	 */
	@Nullable
	public String dataEmptyBuckets() {
		return this.dataEmptyBuckets;
	}

	/**
	 * number of sparse buckets
	 * <p>
	 * API name: {@code data.sparse_buckets}
	 */
	@Nullable
	public String dataSparseBuckets() {
		return this.dataSparseBuckets;
	}

	/**
	 * total bucket count
	 * <p>
	 * API name: {@code data.buckets}
	 */
	@Nullable
	public String dataBuckets() {
		return this.dataBuckets;
	}

	/**
	 * earliest record time
	 * <p>
	 * API name: {@code data.earliest_record}
	 */
	@Nullable
	public String dataEarliestRecord() {
		return this.dataEarliestRecord;
	}

	/**
	 * latest record time
	 * <p>
	 * API name: {@code data.latest_record}
	 */
	@Nullable
	public String dataLatestRecord() {
		return this.dataLatestRecord;
	}

	/**
	 * last time data was seen
	 * <p>
	 * API name: {@code data.last}
	 */
	@Nullable
	public String dataLast() {
		return this.dataLast;
	}

	/**
	 * last time an empty bucket occurred
	 * <p>
	 * API name: {@code data.last_empty_bucket}
	 */
	@Nullable
	public String dataLastEmptyBucket() {
		return this.dataLastEmptyBucket;
	}

	/**
	 * last time a sparse bucket occurred
	 * <p>
	 * API name: {@code data.last_sparse_bucket}
	 */
	@Nullable
	public String dataLastSparseBucket() {
		return this.dataLastSparseBucket;
	}

	/**
	 * model size
	 * <p>
	 * API name: {@code model.bytes}
	 */
	@Nullable
	public String modelBytes() {
		return this.modelBytes;
	}

	/**
	 * current memory status
	 * <p>
	 * API name: {@code model.memory_status}
	 */
	@Nullable
	public MemoryStatus modelMemoryStatus() {
		return this.modelMemoryStatus;
	}

	/**
	 * how much the model has exceeded the limit
	 * <p>
	 * API name: {@code model.bytes_exceeded}
	 */
	@Nullable
	public String modelBytesExceeded() {
		return this.modelBytesExceeded;
	}

	/**
	 * model memory limit
	 * <p>
	 * API name: {@code model.memory_limit}
	 */
	@Nullable
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * count of 'by' fields
	 * <p>
	 * API name: {@code model.by_fields}
	 */
	@Nullable
	public String modelByFields() {
		return this.modelByFields;
	}

	/**
	 * count of 'over' fields
	 * <p>
	 * API name: {@code model.over_fields}
	 */
	@Nullable
	public String modelOverFields() {
		return this.modelOverFields;
	}

	/**
	 * count of 'partition' fields
	 * <p>
	 * API name: {@code model.partition_fields}
	 */
	@Nullable
	public String modelPartitionFields() {
		return this.modelPartitionFields;
	}

	/**
	 * number of bucket allocation failures
	 * <p>
	 * API name: {@code model.bucket_allocation_failures}
	 */
	@Nullable
	public String modelBucketAllocationFailures() {
		return this.modelBucketAllocationFailures;
	}

	/**
	 * current categorization status
	 * <p>
	 * API name: {@code model.categorization_status}
	 */
	@Nullable
	public CategorizationStatus modelCategorizationStatus() {
		return this.modelCategorizationStatus;
	}

	/**
	 * count of categorized documents
	 * <p>
	 * API name: {@code model.categorized_doc_count}
	 */
	@Nullable
	public String modelCategorizedDocCount() {
		return this.modelCategorizedDocCount;
	}

	/**
	 * count of categories
	 * <p>
	 * API name: {@code model.total_category_count}
	 */
	@Nullable
	public String modelTotalCategoryCount() {
		return this.modelTotalCategoryCount;
	}

	/**
	 * count of frequent categories
	 * <p>
	 * API name: {@code model.frequent_category_count}
	 */
	@Nullable
	public String modelFrequentCategoryCount() {
		return this.modelFrequentCategoryCount;
	}

	/**
	 * count of rare categories
	 * <p>
	 * API name: {@code model.rare_category_count}
	 */
	@Nullable
	public String modelRareCategoryCount() {
		return this.modelRareCategoryCount;
	}

	/**
	 * count of dead categories
	 * <p>
	 * API name: {@code model.dead_category_count}
	 */
	@Nullable
	public String modelDeadCategoryCount() {
		return this.modelDeadCategoryCount;
	}

	/**
	 * count of failed categories
	 * <p>
	 * API name: {@code model.failed_category_count}
	 */
	@Nullable
	public String modelFailedCategoryCount() {
		return this.modelFailedCategoryCount;
	}

	/**
	 * when the model stats were gathered
	 * <p>
	 * API name: {@code model.log_time}
	 */
	@Nullable
	public String modelLogTime() {
		return this.modelLogTime;
	}

	/**
	 * the time of the last record when the model stats were gathered
	 * <p>
	 * API name: {@code model.timestamp}
	 */
	@Nullable
	public String modelTimestamp() {
		return this.modelTimestamp;
	}

	/**
	 * total number of forecasts
	 * <p>
	 * API name: {@code forecasts.total}
	 */
	@Nullable
	public String forecastsTotal() {
		return this.forecastsTotal;
	}

	/**
	 * minimum memory used by forecasts
	 * <p>
	 * API name: {@code forecasts.memory.min}
	 */
	@Nullable
	public String forecastsMemoryMin() {
		return this.forecastsMemoryMin;
	}

	/**
	 * maximum memory used by forecasts
	 * <p>
	 * API name: {@code forecasts.memory.max}
	 */
	@Nullable
	public String forecastsMemoryMax() {
		return this.forecastsMemoryMax;
	}

	/**
	 * average memory used by forecasts
	 * <p>
	 * API name: {@code forecasts.memory.avg}
	 */
	@Nullable
	public String forecastsMemoryAvg() {
		return this.forecastsMemoryAvg;
	}

	/**
	 * total memory used by all forecasts
	 * <p>
	 * API name: {@code forecasts.memory.total}
	 */
	@Nullable
	public String forecastsMemoryTotal() {
		return this.forecastsMemoryTotal;
	}

	/**
	 * minimum record count for forecasts
	 * <p>
	 * API name: {@code forecasts.records.min}
	 */
	@Nullable
	public String forecastsRecordsMin() {
		return this.forecastsRecordsMin;
	}

	/**
	 * maximum record count for forecasts
	 * <p>
	 * API name: {@code forecasts.records.max}
	 */
	@Nullable
	public String forecastsRecordsMax() {
		return this.forecastsRecordsMax;
	}

	/**
	 * average record count for forecasts
	 * <p>
	 * API name: {@code forecasts.records.avg}
	 */
	@Nullable
	public String forecastsRecordsAvg() {
		return this.forecastsRecordsAvg;
	}

	/**
	 * total record count for all forecasts
	 * <p>
	 * API name: {@code forecasts.records.total}
	 */
	@Nullable
	public String forecastsRecordsTotal() {
		return this.forecastsRecordsTotal;
	}

	/**
	 * minimum runtime for forecasts
	 * <p>
	 * API name: {@code forecasts.time.min}
	 */
	@Nullable
	public String forecastsTimeMin() {
		return this.forecastsTimeMin;
	}

	/**
	 * maximum run time for forecasts
	 * <p>
	 * API name: {@code forecasts.time.max}
	 */
	@Nullable
	public String forecastsTimeMax() {
		return this.forecastsTimeMax;
	}

	/**
	 * average runtime for all forecasts (milliseconds)
	 * <p>
	 * API name: {@code forecasts.time.avg}
	 */
	@Nullable
	public String forecastsTimeAvg() {
		return this.forecastsTimeAvg;
	}

	/**
	 * total runtime for all forecasts
	 * <p>
	 * API name: {@code forecasts.time.total}
	 */
	@Nullable
	public String forecastsTimeTotal() {
		return this.forecastsTimeTotal;
	}

	/**
	 * id of the assigned node
	 * <p>
	 * API name: {@code node.id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * name of the assigned node
	 * <p>
	 * API name: {@code node.name}
	 */
	@Nullable
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * ephemeral id of the assigned node
	 * <p>
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public String nodeEphemeralId() {
		return this.nodeEphemeralId;
	}

	/**
	 * network address of the assigned node
	 * <p>
	 * API name: {@code node.address}
	 */
	@Nullable
	public String nodeAddress() {
		return this.nodeAddress;
	}

	/**
	 * bucket count
	 * <p>
	 * API name: {@code buckets.count}
	 */
	@Nullable
	public String bucketsCount() {
		return this.bucketsCount;
	}

	/**
	 * total bucket processing time
	 * <p>
	 * API name: {@code buckets.time.total}
	 */
	@Nullable
	public String bucketsTimeTotal() {
		return this.bucketsTimeTotal;
	}

	/**
	 * minimum bucket processing time
	 * <p>
	 * API name: {@code buckets.time.min}
	 */
	@Nullable
	public String bucketsTimeMin() {
		return this.bucketsTimeMin;
	}

	/**
	 * maximum bucket processing time
	 * <p>
	 * API name: {@code buckets.time.max}
	 */
	@Nullable
	public String bucketsTimeMax() {
		return this.bucketsTimeMax;
	}

	/**
	 * exponential average bucket processing time (milliseconds)
	 * <p>
	 * API name: {@code buckets.time.exp_avg}
	 */
	@Nullable
	public String bucketsTimeExpAvg() {
		return this.bucketsTimeExpAvg;
	}

	/**
	 * exponential average bucket processing time by hour (milliseconds)
	 * <p>
	 * API name: {@code buckets.time.exp_avg_hour}
	 */
	@Nullable
	public String bucketsTimeExpAvgHour() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobsRecord}.
	 */
	public static class Builder implements ObjectBuilder<JobsRecord> {
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
		 * the job_id
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * the job state
		 * <p>
		 * API name: {@code state}
		 */
		public Builder state(@Nullable JobState value) {
			this.state = value;
			return this;
		}

		/**
		 * the amount of time the job has been opened
		 * <p>
		 * API name: {@code opened_time}
		 */
		public Builder openedTime(@Nullable String value) {
			this.openedTime = value;
			return this;
		}

		/**
		 * why the job is or is not assigned to a node
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * number of processed records
		 * <p>
		 * API name: {@code data.processed_records}
		 */
		public Builder dataProcessedRecords(@Nullable String value) {
			this.dataProcessedRecords = value;
			return this;
		}

		/**
		 * number of processed fields
		 * <p>
		 * API name: {@code data.processed_fields}
		 */
		public Builder dataProcessedFields(@Nullable String value) {
			this.dataProcessedFields = value;
			return this;
		}

		/**
		 * total input bytes
		 * <p>
		 * API name: {@code data.input_bytes}
		 */
		public Builder dataInputBytes(@Nullable String value) {
			this.dataInputBytes = value;
			return this;
		}

		/**
		 * total record count
		 * <p>
		 * API name: {@code data.input_records}
		 */
		public Builder dataInputRecords(@Nullable String value) {
			this.dataInputRecords = value;
			return this;
		}

		/**
		 * total field count
		 * <p>
		 * API name: {@code data.input_fields}
		 */
		public Builder dataInputFields(@Nullable String value) {
			this.dataInputFields = value;
			return this;
		}

		/**
		 * number of records with invalid dates
		 * <p>
		 * API name: {@code data.invalid_dates}
		 */
		public Builder dataInvalidDates(@Nullable String value) {
			this.dataInvalidDates = value;
			return this;
		}

		/**
		 * number of records with missing fields
		 * <p>
		 * API name: {@code data.missing_fields}
		 */
		public Builder dataMissingFields(@Nullable String value) {
			this.dataMissingFields = value;
			return this;
		}

		/**
		 * number of records handled out of order
		 * <p>
		 * API name: {@code data.out_of_order_timestamps}
		 */
		public Builder dataOutOfOrderTimestamps(@Nullable String value) {
			this.dataOutOfOrderTimestamps = value;
			return this;
		}

		/**
		 * number of empty buckets
		 * <p>
		 * API name: {@code data.empty_buckets}
		 */
		public Builder dataEmptyBuckets(@Nullable String value) {
			this.dataEmptyBuckets = value;
			return this;
		}

		/**
		 * number of sparse buckets
		 * <p>
		 * API name: {@code data.sparse_buckets}
		 */
		public Builder dataSparseBuckets(@Nullable String value) {
			this.dataSparseBuckets = value;
			return this;
		}

		/**
		 * total bucket count
		 * <p>
		 * API name: {@code data.buckets}
		 */
		public Builder dataBuckets(@Nullable String value) {
			this.dataBuckets = value;
			return this;
		}

		/**
		 * earliest record time
		 * <p>
		 * API name: {@code data.earliest_record}
		 */
		public Builder dataEarliestRecord(@Nullable String value) {
			this.dataEarliestRecord = value;
			return this;
		}

		/**
		 * latest record time
		 * <p>
		 * API name: {@code data.latest_record}
		 */
		public Builder dataLatestRecord(@Nullable String value) {
			this.dataLatestRecord = value;
			return this;
		}

		/**
		 * last time data was seen
		 * <p>
		 * API name: {@code data.last}
		 */
		public Builder dataLast(@Nullable String value) {
			this.dataLast = value;
			return this;
		}

		/**
		 * last time an empty bucket occurred
		 * <p>
		 * API name: {@code data.last_empty_bucket}
		 */
		public Builder dataLastEmptyBucket(@Nullable String value) {
			this.dataLastEmptyBucket = value;
			return this;
		}

		/**
		 * last time a sparse bucket occurred
		 * <p>
		 * API name: {@code data.last_sparse_bucket}
		 */
		public Builder dataLastSparseBucket(@Nullable String value) {
			this.dataLastSparseBucket = value;
			return this;
		}

		/**
		 * model size
		 * <p>
		 * API name: {@code model.bytes}
		 */
		public Builder modelBytes(@Nullable String value) {
			this.modelBytes = value;
			return this;
		}

		/**
		 * current memory status
		 * <p>
		 * API name: {@code model.memory_status}
		 */
		public Builder modelMemoryStatus(@Nullable MemoryStatus value) {
			this.modelMemoryStatus = value;
			return this;
		}

		/**
		 * how much the model has exceeded the limit
		 * <p>
		 * API name: {@code model.bytes_exceeded}
		 */
		public Builder modelBytesExceeded(@Nullable String value) {
			this.modelBytesExceeded = value;
			return this;
		}

		/**
		 * model memory limit
		 * <p>
		 * API name: {@code model.memory_limit}
		 */
		public Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * count of 'by' fields
		 * <p>
		 * API name: {@code model.by_fields}
		 */
		public Builder modelByFields(@Nullable String value) {
			this.modelByFields = value;
			return this;
		}

		/**
		 * count of 'over' fields
		 * <p>
		 * API name: {@code model.over_fields}
		 */
		public Builder modelOverFields(@Nullable String value) {
			this.modelOverFields = value;
			return this;
		}

		/**
		 * count of 'partition' fields
		 * <p>
		 * API name: {@code model.partition_fields}
		 */
		public Builder modelPartitionFields(@Nullable String value) {
			this.modelPartitionFields = value;
			return this;
		}

		/**
		 * number of bucket allocation failures
		 * <p>
		 * API name: {@code model.bucket_allocation_failures}
		 */
		public Builder modelBucketAllocationFailures(@Nullable String value) {
			this.modelBucketAllocationFailures = value;
			return this;
		}

		/**
		 * current categorization status
		 * <p>
		 * API name: {@code model.categorization_status}
		 */
		public Builder modelCategorizationStatus(@Nullable CategorizationStatus value) {
			this.modelCategorizationStatus = value;
			return this;
		}

		/**
		 * count of categorized documents
		 * <p>
		 * API name: {@code model.categorized_doc_count}
		 */
		public Builder modelCategorizedDocCount(@Nullable String value) {
			this.modelCategorizedDocCount = value;
			return this;
		}

		/**
		 * count of categories
		 * <p>
		 * API name: {@code model.total_category_count}
		 */
		public Builder modelTotalCategoryCount(@Nullable String value) {
			this.modelTotalCategoryCount = value;
			return this;
		}

		/**
		 * count of frequent categories
		 * <p>
		 * API name: {@code model.frequent_category_count}
		 */
		public Builder modelFrequentCategoryCount(@Nullable String value) {
			this.modelFrequentCategoryCount = value;
			return this;
		}

		/**
		 * count of rare categories
		 * <p>
		 * API name: {@code model.rare_category_count}
		 */
		public Builder modelRareCategoryCount(@Nullable String value) {
			this.modelRareCategoryCount = value;
			return this;
		}

		/**
		 * count of dead categories
		 * <p>
		 * API name: {@code model.dead_category_count}
		 */
		public Builder modelDeadCategoryCount(@Nullable String value) {
			this.modelDeadCategoryCount = value;
			return this;
		}

		/**
		 * count of failed categories
		 * <p>
		 * API name: {@code model.failed_category_count}
		 */
		public Builder modelFailedCategoryCount(@Nullable String value) {
			this.modelFailedCategoryCount = value;
			return this;
		}

		/**
		 * when the model stats were gathered
		 * <p>
		 * API name: {@code model.log_time}
		 */
		public Builder modelLogTime(@Nullable String value) {
			this.modelLogTime = value;
			return this;
		}

		/**
		 * the time of the last record when the model stats were gathered
		 * <p>
		 * API name: {@code model.timestamp}
		 */
		public Builder modelTimestamp(@Nullable String value) {
			this.modelTimestamp = value;
			return this;
		}

		/**
		 * total number of forecasts
		 * <p>
		 * API name: {@code forecasts.total}
		 */
		public Builder forecastsTotal(@Nullable String value) {
			this.forecastsTotal = value;
			return this;
		}

		/**
		 * minimum memory used by forecasts
		 * <p>
		 * API name: {@code forecasts.memory.min}
		 */
		public Builder forecastsMemoryMin(@Nullable String value) {
			this.forecastsMemoryMin = value;
			return this;
		}

		/**
		 * maximum memory used by forecasts
		 * <p>
		 * API name: {@code forecasts.memory.max}
		 */
		public Builder forecastsMemoryMax(@Nullable String value) {
			this.forecastsMemoryMax = value;
			return this;
		}

		/**
		 * average memory used by forecasts
		 * <p>
		 * API name: {@code forecasts.memory.avg}
		 */
		public Builder forecastsMemoryAvg(@Nullable String value) {
			this.forecastsMemoryAvg = value;
			return this;
		}

		/**
		 * total memory used by all forecasts
		 * <p>
		 * API name: {@code forecasts.memory.total}
		 */
		public Builder forecastsMemoryTotal(@Nullable String value) {
			this.forecastsMemoryTotal = value;
			return this;
		}

		/**
		 * minimum record count for forecasts
		 * <p>
		 * API name: {@code forecasts.records.min}
		 */
		public Builder forecastsRecordsMin(@Nullable String value) {
			this.forecastsRecordsMin = value;
			return this;
		}

		/**
		 * maximum record count for forecasts
		 * <p>
		 * API name: {@code forecasts.records.max}
		 */
		public Builder forecastsRecordsMax(@Nullable String value) {
			this.forecastsRecordsMax = value;
			return this;
		}

		/**
		 * average record count for forecasts
		 * <p>
		 * API name: {@code forecasts.records.avg}
		 */
		public Builder forecastsRecordsAvg(@Nullable String value) {
			this.forecastsRecordsAvg = value;
			return this;
		}

		/**
		 * total record count for all forecasts
		 * <p>
		 * API name: {@code forecasts.records.total}
		 */
		public Builder forecastsRecordsTotal(@Nullable String value) {
			this.forecastsRecordsTotal = value;
			return this;
		}

		/**
		 * minimum runtime for forecasts
		 * <p>
		 * API name: {@code forecasts.time.min}
		 */
		public Builder forecastsTimeMin(@Nullable String value) {
			this.forecastsTimeMin = value;
			return this;
		}

		/**
		 * maximum run time for forecasts
		 * <p>
		 * API name: {@code forecasts.time.max}
		 */
		public Builder forecastsTimeMax(@Nullable String value) {
			this.forecastsTimeMax = value;
			return this;
		}

		/**
		 * average runtime for all forecasts (milliseconds)
		 * <p>
		 * API name: {@code forecasts.time.avg}
		 */
		public Builder forecastsTimeAvg(@Nullable String value) {
			this.forecastsTimeAvg = value;
			return this;
		}

		/**
		 * total runtime for all forecasts
		 * <p>
		 * API name: {@code forecasts.time.total}
		 */
		public Builder forecastsTimeTotal(@Nullable String value) {
			this.forecastsTimeTotal = value;
			return this;
		}

		/**
		 * id of the assigned node
		 * <p>
		 * API name: {@code node.id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * name of the assigned node
		 * <p>
		 * API name: {@code node.name}
		 */
		public Builder nodeName(@Nullable String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * ephemeral id of the assigned node
		 * <p>
		 * API name: {@code node.ephemeral_id}
		 */
		public Builder nodeEphemeralId(@Nullable String value) {
			this.nodeEphemeralId = value;
			return this;
		}

		/**
		 * network address of the assigned node
		 * <p>
		 * API name: {@code node.address}
		 */
		public Builder nodeAddress(@Nullable String value) {
			this.nodeAddress = value;
			return this;
		}

		/**
		 * bucket count
		 * <p>
		 * API name: {@code buckets.count}
		 */
		public Builder bucketsCount(@Nullable String value) {
			this.bucketsCount = value;
			return this;
		}

		/**
		 * total bucket processing time
		 * <p>
		 * API name: {@code buckets.time.total}
		 */
		public Builder bucketsTimeTotal(@Nullable String value) {
			this.bucketsTimeTotal = value;
			return this;
		}

		/**
		 * minimum bucket processing time
		 * <p>
		 * API name: {@code buckets.time.min}
		 */
		public Builder bucketsTimeMin(@Nullable String value) {
			this.bucketsTimeMin = value;
			return this;
		}

		/**
		 * maximum bucket processing time
		 * <p>
		 * API name: {@code buckets.time.max}
		 */
		public Builder bucketsTimeMax(@Nullable String value) {
			this.bucketsTimeMax = value;
			return this;
		}

		/**
		 * exponential average bucket processing time (milliseconds)
		 * <p>
		 * API name: {@code buckets.time.exp_avg}
		 */
		public Builder bucketsTimeExpAvg(@Nullable String value) {
			this.bucketsTimeExpAvg = value;
			return this;
		}

		/**
		 * exponential average bucket processing time by hour (milliseconds)
		 * <p>
		 * API name: {@code buckets.time.exp_avg_hour}
		 */
		public Builder bucketsTimeExpAvgHour(@Nullable String value) {
			this.bucketsTimeExpAvgHour = value;
			return this;
		}

		/**
		 * Builds a {@link JobsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobsRecord build() {

			return new JobsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobsRecord}
	 */
	public static final JsonpDeserializer<JobsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobsRecord::setupJobsRecordDeserializer, Builder::build);

	protected static void setupJobsRecordDeserializer(DelegatingDeserializer<JobsRecord.Builder> op) {

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
