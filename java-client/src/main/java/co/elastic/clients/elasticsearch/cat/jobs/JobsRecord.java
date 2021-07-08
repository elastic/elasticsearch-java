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

package co.elastic.clients.elasticsearch.cat.jobs;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.jobs.JobsRecord
public final class JobsRecord implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final JsonValue state;

	@Nullable
	private final String openedTime;

	@Nullable
	private final String assignmentExplanation;

	@Nullable
	private final String data_processedRecords;

	@Nullable
	private final String data_processedFields;

	@Nullable
	private final JsonValue data_inputBytes;

	@Nullable
	private final String data_inputRecords;

	@Nullable
	private final String data_inputFields;

	@Nullable
	private final String data_invalidDates;

	@Nullable
	private final String data_missingFields;

	@Nullable
	private final String data_outOfOrderTimestamps;

	@Nullable
	private final String data_emptyBuckets;

	@Nullable
	private final String data_sparseBuckets;

	@Nullable
	private final String data_buckets;

	@Nullable
	private final String data_earliestRecord;

	@Nullable
	private final String data_latestRecord;

	@Nullable
	private final String data_last;

	@Nullable
	private final String data_lastEmptyBucket;

	@Nullable
	private final String data_lastSparseBucket;

	@Nullable
	private final JsonValue model_bytes;

	@Nullable
	private final JsonValue model_memoryStatus;

	@Nullable
	private final JsonValue model_bytesExceeded;

	@Nullable
	private final String model_memoryLimit;

	@Nullable
	private final String model_byFields;

	@Nullable
	private final String model_overFields;

	@Nullable
	private final String model_partitionFields;

	@Nullable
	private final String model_bucketAllocationFailures;

	@Nullable
	private final JsonValue model_categorizationStatus;

	@Nullable
	private final String model_categorizedDocCount;

	@Nullable
	private final String model_totalCategoryCount;

	@Nullable
	private final String model_frequentCategoryCount;

	@Nullable
	private final String model_rareCategoryCount;

	@Nullable
	private final String model_deadCategoryCount;

	@Nullable
	private final String model_failedCategoryCount;

	@Nullable
	private final String model_logTime;

	@Nullable
	private final String model_timestamp;

	@Nullable
	private final String forecasts_total;

	@Nullable
	private final String forecasts_memory_min;

	@Nullable
	private final String forecasts_memory_max;

	@Nullable
	private final String forecasts_memory_avg;

	@Nullable
	private final String forecasts_memory_total;

	@Nullable
	private final String forecasts_records_min;

	@Nullable
	private final String forecasts_records_max;

	@Nullable
	private final String forecasts_records_avg;

	@Nullable
	private final String forecasts_records_total;

	@Nullable
	private final String forecasts_time_min;

	@Nullable
	private final String forecasts_time_max;

	@Nullable
	private final String forecasts_time_avg;

	@Nullable
	private final String forecasts_time_total;

	@Nullable
	private final String node_id;

	@Nullable
	private final String node_name;

	@Nullable
	private final String node_ephemeralId;

	@Nullable
	private final String node_address;

	@Nullable
	private final String buckets_count;

	@Nullable
	private final String buckets_time_total;

	@Nullable
	private final String buckets_time_min;

	@Nullable
	private final String buckets_time_max;

	@Nullable
	private final String buckets_time_expAvg;

	@Nullable
	private final String buckets_time_expAvgHour;

	// ---------------------------------------------------------------------------------------------

	protected JobsRecord(Builder builder) {

		this.id = builder.id;
		this.state = builder.state;
		this.openedTime = builder.openedTime;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.data_processedRecords = builder.data_processedRecords;
		this.data_processedFields = builder.data_processedFields;
		this.data_inputBytes = builder.data_inputBytes;
		this.data_inputRecords = builder.data_inputRecords;
		this.data_inputFields = builder.data_inputFields;
		this.data_invalidDates = builder.data_invalidDates;
		this.data_missingFields = builder.data_missingFields;
		this.data_outOfOrderTimestamps = builder.data_outOfOrderTimestamps;
		this.data_emptyBuckets = builder.data_emptyBuckets;
		this.data_sparseBuckets = builder.data_sparseBuckets;
		this.data_buckets = builder.data_buckets;
		this.data_earliestRecord = builder.data_earliestRecord;
		this.data_latestRecord = builder.data_latestRecord;
		this.data_last = builder.data_last;
		this.data_lastEmptyBucket = builder.data_lastEmptyBucket;
		this.data_lastSparseBucket = builder.data_lastSparseBucket;
		this.model_bytes = builder.model_bytes;
		this.model_memoryStatus = builder.model_memoryStatus;
		this.model_bytesExceeded = builder.model_bytesExceeded;
		this.model_memoryLimit = builder.model_memoryLimit;
		this.model_byFields = builder.model_byFields;
		this.model_overFields = builder.model_overFields;
		this.model_partitionFields = builder.model_partitionFields;
		this.model_bucketAllocationFailures = builder.model_bucketAllocationFailures;
		this.model_categorizationStatus = builder.model_categorizationStatus;
		this.model_categorizedDocCount = builder.model_categorizedDocCount;
		this.model_totalCategoryCount = builder.model_totalCategoryCount;
		this.model_frequentCategoryCount = builder.model_frequentCategoryCount;
		this.model_rareCategoryCount = builder.model_rareCategoryCount;
		this.model_deadCategoryCount = builder.model_deadCategoryCount;
		this.model_failedCategoryCount = builder.model_failedCategoryCount;
		this.model_logTime = builder.model_logTime;
		this.model_timestamp = builder.model_timestamp;
		this.forecasts_total = builder.forecasts_total;
		this.forecasts_memory_min = builder.forecasts_memory_min;
		this.forecasts_memory_max = builder.forecasts_memory_max;
		this.forecasts_memory_avg = builder.forecasts_memory_avg;
		this.forecasts_memory_total = builder.forecasts_memory_total;
		this.forecasts_records_min = builder.forecasts_records_min;
		this.forecasts_records_max = builder.forecasts_records_max;
		this.forecasts_records_avg = builder.forecasts_records_avg;
		this.forecasts_records_total = builder.forecasts_records_total;
		this.forecasts_time_min = builder.forecasts_time_min;
		this.forecasts_time_max = builder.forecasts_time_max;
		this.forecasts_time_avg = builder.forecasts_time_avg;
		this.forecasts_time_total = builder.forecasts_time_total;
		this.node_id = builder.node_id;
		this.node_name = builder.node_name;
		this.node_ephemeralId = builder.node_ephemeralId;
		this.node_address = builder.node_address;
		this.buckets_count = builder.buckets_count;
		this.buckets_time_total = builder.buckets_time_total;
		this.buckets_time_min = builder.buckets_time_min;
		this.buckets_time_max = builder.buckets_time_max;
		this.buckets_time_expAvg = builder.buckets_time_expAvg;
		this.buckets_time_expAvgHour = builder.buckets_time_expAvgHour;

	}

	/**
	 * the job_id
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * the job state
	 *
	 * API name: {@code state}
	 */
	@Nullable
	public JsonValue state() {
		return this.state;
	}

	/**
	 * the amount of time the job has been opened
	 *
	 * API name: {@code opened_time}
	 */
	@Nullable
	public String openedTime() {
		return this.openedTime;
	}

	/**
	 * why the job is or is not assigned to a node
	 *
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * number of processed records
	 *
	 * API name: {@code data.processed_records}
	 */
	@Nullable
	public String data_processedRecords() {
		return this.data_processedRecords;
	}

	/**
	 * number of processed fields
	 *
	 * API name: {@code data.processed_fields}
	 */
	@Nullable
	public String data_processedFields() {
		return this.data_processedFields;
	}

	/**
	 * total input bytes
	 *
	 * API name: {@code data.input_bytes}
	 */
	@Nullable
	public JsonValue data_inputBytes() {
		return this.data_inputBytes;
	}

	/**
	 * total record count
	 *
	 * API name: {@code data.input_records}
	 */
	@Nullable
	public String data_inputRecords() {
		return this.data_inputRecords;
	}

	/**
	 * total field count
	 *
	 * API name: {@code data.input_fields}
	 */
	@Nullable
	public String data_inputFields() {
		return this.data_inputFields;
	}

	/**
	 * number of records with invalid dates
	 *
	 * API name: {@code data.invalid_dates}
	 */
	@Nullable
	public String data_invalidDates() {
		return this.data_invalidDates;
	}

	/**
	 * number of records with missing fields
	 *
	 * API name: {@code data.missing_fields}
	 */
	@Nullable
	public String data_missingFields() {
		return this.data_missingFields;
	}

	/**
	 * number of records handled out of order
	 *
	 * API name: {@code data.out_of_order_timestamps}
	 */
	@Nullable
	public String data_outOfOrderTimestamps() {
		return this.data_outOfOrderTimestamps;
	}

	/**
	 * number of empty buckets
	 *
	 * API name: {@code data.empty_buckets}
	 */
	@Nullable
	public String data_emptyBuckets() {
		return this.data_emptyBuckets;
	}

	/**
	 * number of sparse buckets
	 *
	 * API name: {@code data.sparse_buckets}
	 */
	@Nullable
	public String data_sparseBuckets() {
		return this.data_sparseBuckets;
	}

	/**
	 * total bucket count
	 *
	 * API name: {@code data.buckets}
	 */
	@Nullable
	public String data_buckets() {
		return this.data_buckets;
	}

	/**
	 * earliest record time
	 *
	 * API name: {@code data.earliest_record}
	 */
	@Nullable
	public String data_earliestRecord() {
		return this.data_earliestRecord;
	}

	/**
	 * latest record time
	 *
	 * API name: {@code data.latest_record}
	 */
	@Nullable
	public String data_latestRecord() {
		return this.data_latestRecord;
	}

	/**
	 * last time data was seen
	 *
	 * API name: {@code data.last}
	 */
	@Nullable
	public String data_last() {
		return this.data_last;
	}

	/**
	 * last time an empty bucket occurred
	 *
	 * API name: {@code data.last_empty_bucket}
	 */
	@Nullable
	public String data_lastEmptyBucket() {
		return this.data_lastEmptyBucket;
	}

	/**
	 * last time a sparse bucket occurred
	 *
	 * API name: {@code data.last_sparse_bucket}
	 */
	@Nullable
	public String data_lastSparseBucket() {
		return this.data_lastSparseBucket;
	}

	/**
	 * model size
	 *
	 * API name: {@code model.bytes}
	 */
	@Nullable
	public JsonValue model_bytes() {
		return this.model_bytes;
	}

	/**
	 * current memory status
	 *
	 * API name: {@code model.memory_status}
	 */
	@Nullable
	public JsonValue model_memoryStatus() {
		return this.model_memoryStatus;
	}

	/**
	 * how much the model has exceeded the limit
	 *
	 * API name: {@code model.bytes_exceeded}
	 */
	@Nullable
	public JsonValue model_bytesExceeded() {
		return this.model_bytesExceeded;
	}

	/**
	 * model memory limit
	 *
	 * API name: {@code model.memory_limit}
	 */
	@Nullable
	public String model_memoryLimit() {
		return this.model_memoryLimit;
	}

	/**
	 * count of 'by' fields
	 *
	 * API name: {@code model.by_fields}
	 */
	@Nullable
	public String model_byFields() {
		return this.model_byFields;
	}

	/**
	 * count of 'over' fields
	 *
	 * API name: {@code model.over_fields}
	 */
	@Nullable
	public String model_overFields() {
		return this.model_overFields;
	}

	/**
	 * count of 'partition' fields
	 *
	 * API name: {@code model.partition_fields}
	 */
	@Nullable
	public String model_partitionFields() {
		return this.model_partitionFields;
	}

	/**
	 * number of bucket allocation failures
	 *
	 * API name: {@code model.bucket_allocation_failures}
	 */
	@Nullable
	public String model_bucketAllocationFailures() {
		return this.model_bucketAllocationFailures;
	}

	/**
	 * current categorization status
	 *
	 * API name: {@code model.categorization_status}
	 */
	@Nullable
	public JsonValue model_categorizationStatus() {
		return this.model_categorizationStatus;
	}

	/**
	 * count of categorized documents
	 *
	 * API name: {@code model.categorized_doc_count}
	 */
	@Nullable
	public String model_categorizedDocCount() {
		return this.model_categorizedDocCount;
	}

	/**
	 * count of categories
	 *
	 * API name: {@code model.total_category_count}
	 */
	@Nullable
	public String model_totalCategoryCount() {
		return this.model_totalCategoryCount;
	}

	/**
	 * count of frequent categories
	 *
	 * API name: {@code model.frequent_category_count}
	 */
	@Nullable
	public String model_frequentCategoryCount() {
		return this.model_frequentCategoryCount;
	}

	/**
	 * count of rare categories
	 *
	 * API name: {@code model.rare_category_count}
	 */
	@Nullable
	public String model_rareCategoryCount() {
		return this.model_rareCategoryCount;
	}

	/**
	 * count of dead categories
	 *
	 * API name: {@code model.dead_category_count}
	 */
	@Nullable
	public String model_deadCategoryCount() {
		return this.model_deadCategoryCount;
	}

	/**
	 * count of failed categories
	 *
	 * API name: {@code model.failed_category_count}
	 */
	@Nullable
	public String model_failedCategoryCount() {
		return this.model_failedCategoryCount;
	}

	/**
	 * when the model stats were gathered
	 *
	 * API name: {@code model.log_time}
	 */
	@Nullable
	public String model_logTime() {
		return this.model_logTime;
	}

	/**
	 * the time of the last record when the model stats were gathered
	 *
	 * API name: {@code model.timestamp}
	 */
	@Nullable
	public String model_timestamp() {
		return this.model_timestamp;
	}

	/**
	 * total number of forecasts
	 *
	 * API name: {@code forecasts.total}
	 */
	@Nullable
	public String forecasts_total() {
		return this.forecasts_total;
	}

	/**
	 * minimum memory used by forecasts
	 *
	 * API name: {@code forecasts.memory.min}
	 */
	@Nullable
	public String forecasts_memory_min() {
		return this.forecasts_memory_min;
	}

	/**
	 * maximum memory used by forecasts
	 *
	 * API name: {@code forecasts.memory.max}
	 */
	@Nullable
	public String forecasts_memory_max() {
		return this.forecasts_memory_max;
	}

	/**
	 * average memory used by forecasts
	 *
	 * API name: {@code forecasts.memory.avg}
	 */
	@Nullable
	public String forecasts_memory_avg() {
		return this.forecasts_memory_avg;
	}

	/**
	 * total memory used by all forecasts
	 *
	 * API name: {@code forecasts.memory.total}
	 */
	@Nullable
	public String forecasts_memory_total() {
		return this.forecasts_memory_total;
	}

	/**
	 * minimum record count for forecasts
	 *
	 * API name: {@code forecasts.records.min}
	 */
	@Nullable
	public String forecasts_records_min() {
		return this.forecasts_records_min;
	}

	/**
	 * maximum record count for forecasts
	 *
	 * API name: {@code forecasts.records.max}
	 */
	@Nullable
	public String forecasts_records_max() {
		return this.forecasts_records_max;
	}

	/**
	 * average record count for forecasts
	 *
	 * API name: {@code forecasts.records.avg}
	 */
	@Nullable
	public String forecasts_records_avg() {
		return this.forecasts_records_avg;
	}

	/**
	 * total record count for all forecasts
	 *
	 * API name: {@code forecasts.records.total}
	 */
	@Nullable
	public String forecasts_records_total() {
		return this.forecasts_records_total;
	}

	/**
	 * minimum runtime for forecasts
	 *
	 * API name: {@code forecasts.time.min}
	 */
	@Nullable
	public String forecasts_time_min() {
		return this.forecasts_time_min;
	}

	/**
	 * maximum run time for forecasts
	 *
	 * API name: {@code forecasts.time.max}
	 */
	@Nullable
	public String forecasts_time_max() {
		return this.forecasts_time_max;
	}

	/**
	 * average runtime for all forecasts (milliseconds)
	 *
	 * API name: {@code forecasts.time.avg}
	 */
	@Nullable
	public String forecasts_time_avg() {
		return this.forecasts_time_avg;
	}

	/**
	 * total runtime for all forecasts
	 *
	 * API name: {@code forecasts.time.total}
	 */
	@Nullable
	public String forecasts_time_total() {
		return this.forecasts_time_total;
	}

	/**
	 * id of the assigned node
	 *
	 * API name: {@code node.id}
	 */
	@Nullable
	public String node_id() {
		return this.node_id;
	}

	/**
	 * name of the assigned node
	 *
	 * API name: {@code node.name}
	 */
	@Nullable
	public String node_name() {
		return this.node_name;
	}

	/**
	 * ephemeral id of the assigned node
	 *
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public String node_ephemeralId() {
		return this.node_ephemeralId;
	}

	/**
	 * network address of the assigned node
	 *
	 * API name: {@code node.address}
	 */
	@Nullable
	public String node_address() {
		return this.node_address;
	}

	/**
	 * bucket count
	 *
	 * API name: {@code buckets.count}
	 */
	@Nullable
	public String buckets_count() {
		return this.buckets_count;
	}

	/**
	 * total bucket processing time
	 *
	 * API name: {@code buckets.time.total}
	 */
	@Nullable
	public String buckets_time_total() {
		return this.buckets_time_total;
	}

	/**
	 * minimum bucket processing time
	 *
	 * API name: {@code buckets.time.min}
	 */
	@Nullable
	public String buckets_time_min() {
		return this.buckets_time_min;
	}

	/**
	 * maximum bucket processing time
	 *
	 * API name: {@code buckets.time.max}
	 */
	@Nullable
	public String buckets_time_max() {
		return this.buckets_time_max;
	}

	/**
	 * exponential average bucket processing time (milliseconds)
	 *
	 * API name: {@code buckets.time.exp_avg}
	 */
	@Nullable
	public String buckets_time_expAvg() {
		return this.buckets_time_expAvg;
	}

	/**
	 * exponential average bucket processing time by hour (milliseconds)
	 *
	 * API name: {@code buckets.time.exp_avg_hour}
	 */
	@Nullable
	public String buckets_time_expAvgHour() {
		return this.buckets_time_expAvgHour;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.state != null) {

			generator.writeKey("state");
			generator.write(this.state);

		}
		if (this.openedTime != null) {

			generator.writeKey("opened_time");
			generator.write(this.openedTime);

		}
		if (this.assignmentExplanation != null) {

			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}
		if (this.data_processedRecords != null) {

			generator.writeKey("data.processed_records");
			generator.write(this.data_processedRecords);

		}
		if (this.data_processedFields != null) {

			generator.writeKey("data.processed_fields");
			generator.write(this.data_processedFields);

		}
		if (this.data_inputBytes != null) {

			generator.writeKey("data.input_bytes");
			generator.write(this.data_inputBytes);

		}
		if (this.data_inputRecords != null) {

			generator.writeKey("data.input_records");
			generator.write(this.data_inputRecords);

		}
		if (this.data_inputFields != null) {

			generator.writeKey("data.input_fields");
			generator.write(this.data_inputFields);

		}
		if (this.data_invalidDates != null) {

			generator.writeKey("data.invalid_dates");
			generator.write(this.data_invalidDates);

		}
		if (this.data_missingFields != null) {

			generator.writeKey("data.missing_fields");
			generator.write(this.data_missingFields);

		}
		if (this.data_outOfOrderTimestamps != null) {

			generator.writeKey("data.out_of_order_timestamps");
			generator.write(this.data_outOfOrderTimestamps);

		}
		if (this.data_emptyBuckets != null) {

			generator.writeKey("data.empty_buckets");
			generator.write(this.data_emptyBuckets);

		}
		if (this.data_sparseBuckets != null) {

			generator.writeKey("data.sparse_buckets");
			generator.write(this.data_sparseBuckets);

		}
		if (this.data_buckets != null) {

			generator.writeKey("data.buckets");
			generator.write(this.data_buckets);

		}
		if (this.data_earliestRecord != null) {

			generator.writeKey("data.earliest_record");
			generator.write(this.data_earliestRecord);

		}
		if (this.data_latestRecord != null) {

			generator.writeKey("data.latest_record");
			generator.write(this.data_latestRecord);

		}
		if (this.data_last != null) {

			generator.writeKey("data.last");
			generator.write(this.data_last);

		}
		if (this.data_lastEmptyBucket != null) {

			generator.writeKey("data.last_empty_bucket");
			generator.write(this.data_lastEmptyBucket);

		}
		if (this.data_lastSparseBucket != null) {

			generator.writeKey("data.last_sparse_bucket");
			generator.write(this.data_lastSparseBucket);

		}
		if (this.model_bytes != null) {

			generator.writeKey("model.bytes");
			generator.write(this.model_bytes);

		}
		if (this.model_memoryStatus != null) {

			generator.writeKey("model.memory_status");
			generator.write(this.model_memoryStatus);

		}
		if (this.model_bytesExceeded != null) {

			generator.writeKey("model.bytes_exceeded");
			generator.write(this.model_bytesExceeded);

		}
		if (this.model_memoryLimit != null) {

			generator.writeKey("model.memory_limit");
			generator.write(this.model_memoryLimit);

		}
		if (this.model_byFields != null) {

			generator.writeKey("model.by_fields");
			generator.write(this.model_byFields);

		}
		if (this.model_overFields != null) {

			generator.writeKey("model.over_fields");
			generator.write(this.model_overFields);

		}
		if (this.model_partitionFields != null) {

			generator.writeKey("model.partition_fields");
			generator.write(this.model_partitionFields);

		}
		if (this.model_bucketAllocationFailures != null) {

			generator.writeKey("model.bucket_allocation_failures");
			generator.write(this.model_bucketAllocationFailures);

		}
		if (this.model_categorizationStatus != null) {

			generator.writeKey("model.categorization_status");
			generator.write(this.model_categorizationStatus);

		}
		if (this.model_categorizedDocCount != null) {

			generator.writeKey("model.categorized_doc_count");
			generator.write(this.model_categorizedDocCount);

		}
		if (this.model_totalCategoryCount != null) {

			generator.writeKey("model.total_category_count");
			generator.write(this.model_totalCategoryCount);

		}
		if (this.model_frequentCategoryCount != null) {

			generator.writeKey("model.frequent_category_count");
			generator.write(this.model_frequentCategoryCount);

		}
		if (this.model_rareCategoryCount != null) {

			generator.writeKey("model.rare_category_count");
			generator.write(this.model_rareCategoryCount);

		}
		if (this.model_deadCategoryCount != null) {

			generator.writeKey("model.dead_category_count");
			generator.write(this.model_deadCategoryCount);

		}
		if (this.model_failedCategoryCount != null) {

			generator.writeKey("model.failed_category_count");
			generator.write(this.model_failedCategoryCount);

		}
		if (this.model_logTime != null) {

			generator.writeKey("model.log_time");
			generator.write(this.model_logTime);

		}
		if (this.model_timestamp != null) {

			generator.writeKey("model.timestamp");
			generator.write(this.model_timestamp);

		}
		if (this.forecasts_total != null) {

			generator.writeKey("forecasts.total");
			generator.write(this.forecasts_total);

		}
		if (this.forecasts_memory_min != null) {

			generator.writeKey("forecasts.memory.min");
			generator.write(this.forecasts_memory_min);

		}
		if (this.forecasts_memory_max != null) {

			generator.writeKey("forecasts.memory.max");
			generator.write(this.forecasts_memory_max);

		}
		if (this.forecasts_memory_avg != null) {

			generator.writeKey("forecasts.memory.avg");
			generator.write(this.forecasts_memory_avg);

		}
		if (this.forecasts_memory_total != null) {

			generator.writeKey("forecasts.memory.total");
			generator.write(this.forecasts_memory_total);

		}
		if (this.forecasts_records_min != null) {

			generator.writeKey("forecasts.records.min");
			generator.write(this.forecasts_records_min);

		}
		if (this.forecasts_records_max != null) {

			generator.writeKey("forecasts.records.max");
			generator.write(this.forecasts_records_max);

		}
		if (this.forecasts_records_avg != null) {

			generator.writeKey("forecasts.records.avg");
			generator.write(this.forecasts_records_avg);

		}
		if (this.forecasts_records_total != null) {

			generator.writeKey("forecasts.records.total");
			generator.write(this.forecasts_records_total);

		}
		if (this.forecasts_time_min != null) {

			generator.writeKey("forecasts.time.min");
			generator.write(this.forecasts_time_min);

		}
		if (this.forecasts_time_max != null) {

			generator.writeKey("forecasts.time.max");
			generator.write(this.forecasts_time_max);

		}
		if (this.forecasts_time_avg != null) {

			generator.writeKey("forecasts.time.avg");
			generator.write(this.forecasts_time_avg);

		}
		if (this.forecasts_time_total != null) {

			generator.writeKey("forecasts.time.total");
			generator.write(this.forecasts_time_total);

		}
		if (this.node_id != null) {

			generator.writeKey("node.id");
			generator.write(this.node_id);

		}
		if (this.node_name != null) {

			generator.writeKey("node.name");
			generator.write(this.node_name);

		}
		if (this.node_ephemeralId != null) {

			generator.writeKey("node.ephemeral_id");
			generator.write(this.node_ephemeralId);

		}
		if (this.node_address != null) {

			generator.writeKey("node.address");
			generator.write(this.node_address);

		}
		if (this.buckets_count != null) {

			generator.writeKey("buckets.count");
			generator.write(this.buckets_count);

		}
		if (this.buckets_time_total != null) {

			generator.writeKey("buckets.time.total");
			generator.write(this.buckets_time_total);

		}
		if (this.buckets_time_min != null) {

			generator.writeKey("buckets.time.min");
			generator.write(this.buckets_time_min);

		}
		if (this.buckets_time_max != null) {

			generator.writeKey("buckets.time.max");
			generator.write(this.buckets_time_max);

		}
		if (this.buckets_time_expAvg != null) {

			generator.writeKey("buckets.time.exp_avg");
			generator.write(this.buckets_time_expAvg);

		}
		if (this.buckets_time_expAvgHour != null) {

			generator.writeKey("buckets.time.exp_avg_hour");
			generator.write(this.buckets_time_expAvgHour);

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
		private JsonValue state;

		@Nullable
		private String openedTime;

		@Nullable
		private String assignmentExplanation;

		@Nullable
		private String data_processedRecords;

		@Nullable
		private String data_processedFields;

		@Nullable
		private JsonValue data_inputBytes;

		@Nullable
		private String data_inputRecords;

		@Nullable
		private String data_inputFields;

		@Nullable
		private String data_invalidDates;

		@Nullable
		private String data_missingFields;

		@Nullable
		private String data_outOfOrderTimestamps;

		@Nullable
		private String data_emptyBuckets;

		@Nullable
		private String data_sparseBuckets;

		@Nullable
		private String data_buckets;

		@Nullable
		private String data_earliestRecord;

		@Nullable
		private String data_latestRecord;

		@Nullable
		private String data_last;

		@Nullable
		private String data_lastEmptyBucket;

		@Nullable
		private String data_lastSparseBucket;

		@Nullable
		private JsonValue model_bytes;

		@Nullable
		private JsonValue model_memoryStatus;

		@Nullable
		private JsonValue model_bytesExceeded;

		@Nullable
		private String model_memoryLimit;

		@Nullable
		private String model_byFields;

		@Nullable
		private String model_overFields;

		@Nullable
		private String model_partitionFields;

		@Nullable
		private String model_bucketAllocationFailures;

		@Nullable
		private JsonValue model_categorizationStatus;

		@Nullable
		private String model_categorizedDocCount;

		@Nullable
		private String model_totalCategoryCount;

		@Nullable
		private String model_frequentCategoryCount;

		@Nullable
		private String model_rareCategoryCount;

		@Nullable
		private String model_deadCategoryCount;

		@Nullable
		private String model_failedCategoryCount;

		@Nullable
		private String model_logTime;

		@Nullable
		private String model_timestamp;

		@Nullable
		private String forecasts_total;

		@Nullable
		private String forecasts_memory_min;

		@Nullable
		private String forecasts_memory_max;

		@Nullable
		private String forecasts_memory_avg;

		@Nullable
		private String forecasts_memory_total;

		@Nullable
		private String forecasts_records_min;

		@Nullable
		private String forecasts_records_max;

		@Nullable
		private String forecasts_records_avg;

		@Nullable
		private String forecasts_records_total;

		@Nullable
		private String forecasts_time_min;

		@Nullable
		private String forecasts_time_max;

		@Nullable
		private String forecasts_time_avg;

		@Nullable
		private String forecasts_time_total;

		@Nullable
		private String node_id;

		@Nullable
		private String node_name;

		@Nullable
		private String node_ephemeralId;

		@Nullable
		private String node_address;

		@Nullable
		private String buckets_count;

		@Nullable
		private String buckets_time_total;

		@Nullable
		private String buckets_time_min;

		@Nullable
		private String buckets_time_max;

		@Nullable
		private String buckets_time_expAvg;

		@Nullable
		private String buckets_time_expAvgHour;

		/**
		 * the job_id
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * the job state
		 *
		 * API name: {@code state}
		 */
		public Builder state(@Nullable JsonValue value) {
			this.state = value;
			return this;
		}

		/**
		 * the amount of time the job has been opened
		 *
		 * API name: {@code opened_time}
		 */
		public Builder openedTime(@Nullable String value) {
			this.openedTime = value;
			return this;
		}

		/**
		 * why the job is or is not assigned to a node
		 *
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * number of processed records
		 *
		 * API name: {@code data.processed_records}
		 */
		public Builder data_processedRecords(@Nullable String value) {
			this.data_processedRecords = value;
			return this;
		}

		/**
		 * number of processed fields
		 *
		 * API name: {@code data.processed_fields}
		 */
		public Builder data_processedFields(@Nullable String value) {
			this.data_processedFields = value;
			return this;
		}

		/**
		 * total input bytes
		 *
		 * API name: {@code data.input_bytes}
		 */
		public Builder data_inputBytes(@Nullable JsonValue value) {
			this.data_inputBytes = value;
			return this;
		}

		/**
		 * total record count
		 *
		 * API name: {@code data.input_records}
		 */
		public Builder data_inputRecords(@Nullable String value) {
			this.data_inputRecords = value;
			return this;
		}

		/**
		 * total field count
		 *
		 * API name: {@code data.input_fields}
		 */
		public Builder data_inputFields(@Nullable String value) {
			this.data_inputFields = value;
			return this;
		}

		/**
		 * number of records with invalid dates
		 *
		 * API name: {@code data.invalid_dates}
		 */
		public Builder data_invalidDates(@Nullable String value) {
			this.data_invalidDates = value;
			return this;
		}

		/**
		 * number of records with missing fields
		 *
		 * API name: {@code data.missing_fields}
		 */
		public Builder data_missingFields(@Nullable String value) {
			this.data_missingFields = value;
			return this;
		}

		/**
		 * number of records handled out of order
		 *
		 * API name: {@code data.out_of_order_timestamps}
		 */
		public Builder data_outOfOrderTimestamps(@Nullable String value) {
			this.data_outOfOrderTimestamps = value;
			return this;
		}

		/**
		 * number of empty buckets
		 *
		 * API name: {@code data.empty_buckets}
		 */
		public Builder data_emptyBuckets(@Nullable String value) {
			this.data_emptyBuckets = value;
			return this;
		}

		/**
		 * number of sparse buckets
		 *
		 * API name: {@code data.sparse_buckets}
		 */
		public Builder data_sparseBuckets(@Nullable String value) {
			this.data_sparseBuckets = value;
			return this;
		}

		/**
		 * total bucket count
		 *
		 * API name: {@code data.buckets}
		 */
		public Builder data_buckets(@Nullable String value) {
			this.data_buckets = value;
			return this;
		}

		/**
		 * earliest record time
		 *
		 * API name: {@code data.earliest_record}
		 */
		public Builder data_earliestRecord(@Nullable String value) {
			this.data_earliestRecord = value;
			return this;
		}

		/**
		 * latest record time
		 *
		 * API name: {@code data.latest_record}
		 */
		public Builder data_latestRecord(@Nullable String value) {
			this.data_latestRecord = value;
			return this;
		}

		/**
		 * last time data was seen
		 *
		 * API name: {@code data.last}
		 */
		public Builder data_last(@Nullable String value) {
			this.data_last = value;
			return this;
		}

		/**
		 * last time an empty bucket occurred
		 *
		 * API name: {@code data.last_empty_bucket}
		 */
		public Builder data_lastEmptyBucket(@Nullable String value) {
			this.data_lastEmptyBucket = value;
			return this;
		}

		/**
		 * last time a sparse bucket occurred
		 *
		 * API name: {@code data.last_sparse_bucket}
		 */
		public Builder data_lastSparseBucket(@Nullable String value) {
			this.data_lastSparseBucket = value;
			return this;
		}

		/**
		 * model size
		 *
		 * API name: {@code model.bytes}
		 */
		public Builder model_bytes(@Nullable JsonValue value) {
			this.model_bytes = value;
			return this;
		}

		/**
		 * current memory status
		 *
		 * API name: {@code model.memory_status}
		 */
		public Builder model_memoryStatus(@Nullable JsonValue value) {
			this.model_memoryStatus = value;
			return this;
		}

		/**
		 * how much the model has exceeded the limit
		 *
		 * API name: {@code model.bytes_exceeded}
		 */
		public Builder model_bytesExceeded(@Nullable JsonValue value) {
			this.model_bytesExceeded = value;
			return this;
		}

		/**
		 * model memory limit
		 *
		 * API name: {@code model.memory_limit}
		 */
		public Builder model_memoryLimit(@Nullable String value) {
			this.model_memoryLimit = value;
			return this;
		}

		/**
		 * count of 'by' fields
		 *
		 * API name: {@code model.by_fields}
		 */
		public Builder model_byFields(@Nullable String value) {
			this.model_byFields = value;
			return this;
		}

		/**
		 * count of 'over' fields
		 *
		 * API name: {@code model.over_fields}
		 */
		public Builder model_overFields(@Nullable String value) {
			this.model_overFields = value;
			return this;
		}

		/**
		 * count of 'partition' fields
		 *
		 * API name: {@code model.partition_fields}
		 */
		public Builder model_partitionFields(@Nullable String value) {
			this.model_partitionFields = value;
			return this;
		}

		/**
		 * number of bucket allocation failures
		 *
		 * API name: {@code model.bucket_allocation_failures}
		 */
		public Builder model_bucketAllocationFailures(@Nullable String value) {
			this.model_bucketAllocationFailures = value;
			return this;
		}

		/**
		 * current categorization status
		 *
		 * API name: {@code model.categorization_status}
		 */
		public Builder model_categorizationStatus(@Nullable JsonValue value) {
			this.model_categorizationStatus = value;
			return this;
		}

		/**
		 * count of categorized documents
		 *
		 * API name: {@code model.categorized_doc_count}
		 */
		public Builder model_categorizedDocCount(@Nullable String value) {
			this.model_categorizedDocCount = value;
			return this;
		}

		/**
		 * count of categories
		 *
		 * API name: {@code model.total_category_count}
		 */
		public Builder model_totalCategoryCount(@Nullable String value) {
			this.model_totalCategoryCount = value;
			return this;
		}

		/**
		 * count of frequent categories
		 *
		 * API name: {@code model.frequent_category_count}
		 */
		public Builder model_frequentCategoryCount(@Nullable String value) {
			this.model_frequentCategoryCount = value;
			return this;
		}

		/**
		 * count of rare categories
		 *
		 * API name: {@code model.rare_category_count}
		 */
		public Builder model_rareCategoryCount(@Nullable String value) {
			this.model_rareCategoryCount = value;
			return this;
		}

		/**
		 * count of dead categories
		 *
		 * API name: {@code model.dead_category_count}
		 */
		public Builder model_deadCategoryCount(@Nullable String value) {
			this.model_deadCategoryCount = value;
			return this;
		}

		/**
		 * count of failed categories
		 *
		 * API name: {@code model.failed_category_count}
		 */
		public Builder model_failedCategoryCount(@Nullable String value) {
			this.model_failedCategoryCount = value;
			return this;
		}

		/**
		 * when the model stats were gathered
		 *
		 * API name: {@code model.log_time}
		 */
		public Builder model_logTime(@Nullable String value) {
			this.model_logTime = value;
			return this;
		}

		/**
		 * the time of the last record when the model stats were gathered
		 *
		 * API name: {@code model.timestamp}
		 */
		public Builder model_timestamp(@Nullable String value) {
			this.model_timestamp = value;
			return this;
		}

		/**
		 * total number of forecasts
		 *
		 * API name: {@code forecasts.total}
		 */
		public Builder forecasts_total(@Nullable String value) {
			this.forecasts_total = value;
			return this;
		}

		/**
		 * minimum memory used by forecasts
		 *
		 * API name: {@code forecasts.memory.min}
		 */
		public Builder forecasts_memory_min(@Nullable String value) {
			this.forecasts_memory_min = value;
			return this;
		}

		/**
		 * maximum memory used by forecasts
		 *
		 * API name: {@code forecasts.memory.max}
		 */
		public Builder forecasts_memory_max(@Nullable String value) {
			this.forecasts_memory_max = value;
			return this;
		}

		/**
		 * average memory used by forecasts
		 *
		 * API name: {@code forecasts.memory.avg}
		 */
		public Builder forecasts_memory_avg(@Nullable String value) {
			this.forecasts_memory_avg = value;
			return this;
		}

		/**
		 * total memory used by all forecasts
		 *
		 * API name: {@code forecasts.memory.total}
		 */
		public Builder forecasts_memory_total(@Nullable String value) {
			this.forecasts_memory_total = value;
			return this;
		}

		/**
		 * minimum record count for forecasts
		 *
		 * API name: {@code forecasts.records.min}
		 */
		public Builder forecasts_records_min(@Nullable String value) {
			this.forecasts_records_min = value;
			return this;
		}

		/**
		 * maximum record count for forecasts
		 *
		 * API name: {@code forecasts.records.max}
		 */
		public Builder forecasts_records_max(@Nullable String value) {
			this.forecasts_records_max = value;
			return this;
		}

		/**
		 * average record count for forecasts
		 *
		 * API name: {@code forecasts.records.avg}
		 */
		public Builder forecasts_records_avg(@Nullable String value) {
			this.forecasts_records_avg = value;
			return this;
		}

		/**
		 * total record count for all forecasts
		 *
		 * API name: {@code forecasts.records.total}
		 */
		public Builder forecasts_records_total(@Nullable String value) {
			this.forecasts_records_total = value;
			return this;
		}

		/**
		 * minimum runtime for forecasts
		 *
		 * API name: {@code forecasts.time.min}
		 */
		public Builder forecasts_time_min(@Nullable String value) {
			this.forecasts_time_min = value;
			return this;
		}

		/**
		 * maximum run time for forecasts
		 *
		 * API name: {@code forecasts.time.max}
		 */
		public Builder forecasts_time_max(@Nullable String value) {
			this.forecasts_time_max = value;
			return this;
		}

		/**
		 * average runtime for all forecasts (milliseconds)
		 *
		 * API name: {@code forecasts.time.avg}
		 */
		public Builder forecasts_time_avg(@Nullable String value) {
			this.forecasts_time_avg = value;
			return this;
		}

		/**
		 * total runtime for all forecasts
		 *
		 * API name: {@code forecasts.time.total}
		 */
		public Builder forecasts_time_total(@Nullable String value) {
			this.forecasts_time_total = value;
			return this;
		}

		/**
		 * id of the assigned node
		 *
		 * API name: {@code node.id}
		 */
		public Builder node_id(@Nullable String value) {
			this.node_id = value;
			return this;
		}

		/**
		 * name of the assigned node
		 *
		 * API name: {@code node.name}
		 */
		public Builder node_name(@Nullable String value) {
			this.node_name = value;
			return this;
		}

		/**
		 * ephemeral id of the assigned node
		 *
		 * API name: {@code node.ephemeral_id}
		 */
		public Builder node_ephemeralId(@Nullable String value) {
			this.node_ephemeralId = value;
			return this;
		}

		/**
		 * network address of the assigned node
		 *
		 * API name: {@code node.address}
		 */
		public Builder node_address(@Nullable String value) {
			this.node_address = value;
			return this;
		}

		/**
		 * bucket count
		 *
		 * API name: {@code buckets.count}
		 */
		public Builder buckets_count(@Nullable String value) {
			this.buckets_count = value;
			return this;
		}

		/**
		 * total bucket processing time
		 *
		 * API name: {@code buckets.time.total}
		 */
		public Builder buckets_time_total(@Nullable String value) {
			this.buckets_time_total = value;
			return this;
		}

		/**
		 * minimum bucket processing time
		 *
		 * API name: {@code buckets.time.min}
		 */
		public Builder buckets_time_min(@Nullable String value) {
			this.buckets_time_min = value;
			return this;
		}

		/**
		 * maximum bucket processing time
		 *
		 * API name: {@code buckets.time.max}
		 */
		public Builder buckets_time_max(@Nullable String value) {
			this.buckets_time_max = value;
			return this;
		}

		/**
		 * exponential average bucket processing time (milliseconds)
		 *
		 * API name: {@code buckets.time.exp_avg}
		 */
		public Builder buckets_time_expAvg(@Nullable String value) {
			this.buckets_time_expAvg = value;
			return this;
		}

		/**
		 * exponential average bucket processing time by hour (milliseconds)
		 *
		 * API name: {@code buckets.time.exp_avg_hour}
		 */
		public Builder buckets_time_expAvgHour(@Nullable String value) {
			this.buckets_time_expAvgHour = value;
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
	 * Json deserializer for JobsRecord
	 */
	public static final JsonpDeserializer<JobsRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, JobsRecord::setupJobsRecordDeserializer);

	protected static void setupJobsRecordDeserializer(DelegatingDeserializer<JobsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::state, JsonpDeserializer.jsonValueDeserializer(), "state", "s");
		op.add(Builder::openedTime, JsonpDeserializer.stringDeserializer(), "opened_time", "ot");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation", "ae");
		op.add(Builder::data_processedRecords, JsonpDeserializer.stringDeserializer(), "data.processed_records", "dpr",
				"dataProcessedRecords");
		op.add(Builder::data_processedFields, JsonpDeserializer.stringDeserializer(), "data.processed_fields", "dpf",
				"dataProcessedFields");
		op.add(Builder::data_inputBytes, JsonpDeserializer.jsonValueDeserializer(), "data.input_bytes", "dib",
				"dataInputBytes");
		op.add(Builder::data_inputRecords, JsonpDeserializer.stringDeserializer(), "data.input_records", "dir",
				"dataInputRecords");
		op.add(Builder::data_inputFields, JsonpDeserializer.stringDeserializer(), "data.input_fields", "dif",
				"dataInputFields");
		op.add(Builder::data_invalidDates, JsonpDeserializer.stringDeserializer(), "data.invalid_dates", "did",
				"dataInvalidDates");
		op.add(Builder::data_missingFields, JsonpDeserializer.stringDeserializer(), "data.missing_fields", "dmf",
				"dataMissingFields");
		op.add(Builder::data_outOfOrderTimestamps, JsonpDeserializer.stringDeserializer(),
				"data.out_of_order_timestamps", "doot", "dataOutOfOrderTimestamps");
		op.add(Builder::data_emptyBuckets, JsonpDeserializer.stringDeserializer(), "data.empty_buckets", "deb",
				"dataEmptyBuckets");
		op.add(Builder::data_sparseBuckets, JsonpDeserializer.stringDeserializer(), "data.sparse_buckets", "dsb",
				"dataSparseBuckets");
		op.add(Builder::data_buckets, JsonpDeserializer.stringDeserializer(), "data.buckets", "db", "dataBuckets");
		op.add(Builder::data_earliestRecord, JsonpDeserializer.stringDeserializer(), "data.earliest_record", "der",
				"dataEarliestRecord");
		op.add(Builder::data_latestRecord, JsonpDeserializer.stringDeserializer(), "data.latest_record", "dlr",
				"dataLatestRecord");
		op.add(Builder::data_last, JsonpDeserializer.stringDeserializer(), "data.last", "dl", "dataLast");
		op.add(Builder::data_lastEmptyBucket, JsonpDeserializer.stringDeserializer(), "data.last_empty_bucket", "dleb",
				"dataLastEmptyBucket");
		op.add(Builder::data_lastSparseBucket, JsonpDeserializer.stringDeserializer(), "data.last_sparse_bucket",
				"dlsb", "dataLastSparseBucket");
		op.add(Builder::model_bytes, JsonpDeserializer.jsonValueDeserializer(), "model.bytes", "mb", "modelBytes");
		op.add(Builder::model_memoryStatus, JsonpDeserializer.jsonValueDeserializer(), "model.memory_status", "mms",
				"modelMemoryStatus");
		op.add(Builder::model_bytesExceeded, JsonpDeserializer.jsonValueDeserializer(), "model.bytes_exceeded", "mbe",
				"modelBytesExceeded");
		op.add(Builder::model_memoryLimit, JsonpDeserializer.stringDeserializer(), "model.memory_limit", "mml",
				"modelMemoryLimit");
		op.add(Builder::model_byFields, JsonpDeserializer.stringDeserializer(), "model.by_fields", "mbf",
				"modelByFields");
		op.add(Builder::model_overFields, JsonpDeserializer.stringDeserializer(), "model.over_fields", "mof",
				"modelOverFields");
		op.add(Builder::model_partitionFields, JsonpDeserializer.stringDeserializer(), "model.partition_fields", "mpf",
				"modelPartitionFields");
		op.add(Builder::model_bucketAllocationFailures, JsonpDeserializer.stringDeserializer(),
				"model.bucket_allocation_failures", "mbaf", "modelBucketAllocationFailures");
		op.add(Builder::model_categorizationStatus, JsonpDeserializer.jsonValueDeserializer(),
				"model.categorization_status", "mcs", "modelCategorizationStatus");
		op.add(Builder::model_categorizedDocCount, JsonpDeserializer.stringDeserializer(),
				"model.categorized_doc_count", "mcdc", "modelCategorizedDocCount");
		op.add(Builder::model_totalCategoryCount, JsonpDeserializer.stringDeserializer(), "model.total_category_count",
				"mtcc", "modelTotalCategoryCount");
		op.add(Builder::model_frequentCategoryCount, JsonpDeserializer.stringDeserializer(),
				"model.frequent_category_count", "modelFrequentCategoryCount");
		op.add(Builder::model_rareCategoryCount, JsonpDeserializer.stringDeserializer(), "model.rare_category_count",
				"mrcc", "modelRareCategoryCount");
		op.add(Builder::model_deadCategoryCount, JsonpDeserializer.stringDeserializer(), "model.dead_category_count",
				"mdcc", "modelDeadCategoryCount");
		op.add(Builder::model_failedCategoryCount, JsonpDeserializer.stringDeserializer(),
				"model.failed_category_count", "mfcc", "modelFailedCategoryCount");
		op.add(Builder::model_logTime, JsonpDeserializer.stringDeserializer(), "model.log_time", "mlt", "modelLogTime");
		op.add(Builder::model_timestamp, JsonpDeserializer.stringDeserializer(), "model.timestamp", "mt",
				"modelTimestamp");
		op.add(Builder::forecasts_total, JsonpDeserializer.stringDeserializer(), "forecasts.total", "ft",
				"forecastsTotal");
		op.add(Builder::forecasts_memory_min, JsonpDeserializer.stringDeserializer(), "forecasts.memory.min", "fmmin",
				"forecastsMemoryMin");
		op.add(Builder::forecasts_memory_max, JsonpDeserializer.stringDeserializer(), "forecasts.memory.max", "fmmax",
				"forecastsMemoryMax");
		op.add(Builder::forecasts_memory_avg, JsonpDeserializer.stringDeserializer(), "forecasts.memory.avg", "fmavg",
				"forecastsMemoryAvg");
		op.add(Builder::forecasts_memory_total, JsonpDeserializer.stringDeserializer(), "forecasts.memory.total", "fmt",
				"forecastsMemoryTotal");
		op.add(Builder::forecasts_records_min, JsonpDeserializer.stringDeserializer(), "forecasts.records.min", "frmin",
				"forecastsRecordsMin");
		op.add(Builder::forecasts_records_max, JsonpDeserializer.stringDeserializer(), "forecasts.records.max", "frmax",
				"forecastsRecordsMax");
		op.add(Builder::forecasts_records_avg, JsonpDeserializer.stringDeserializer(), "forecasts.records.avg", "fravg",
				"forecastsRecordsAvg");
		op.add(Builder::forecasts_records_total, JsonpDeserializer.stringDeserializer(), "forecasts.records.total",
				"frt", "forecastsRecordsTotal");
		op.add(Builder::forecasts_time_min, JsonpDeserializer.stringDeserializer(), "forecasts.time.min", "ftmin",
				"forecastsTimeMin");
		op.add(Builder::forecasts_time_max, JsonpDeserializer.stringDeserializer(), "forecasts.time.max", "ftmax",
				"forecastsTimeMax");
		op.add(Builder::forecasts_time_avg, JsonpDeserializer.stringDeserializer(), "forecasts.time.avg", "ftavg",
				"forecastsTimeAvg");
		op.add(Builder::forecasts_time_total, JsonpDeserializer.stringDeserializer(), "forecasts.time.total", "ftt",
				"forecastsTimeTotal");
		op.add(Builder::node_id, JsonpDeserializer.stringDeserializer(), "node.id", "ni", "nodeId");
		op.add(Builder::node_name, JsonpDeserializer.stringDeserializer(), "node.name", "nn", "nodeName");
		op.add(Builder::node_ephemeralId, JsonpDeserializer.stringDeserializer(), "node.ephemeral_id", "ne",
				"nodeEphemeralId");
		op.add(Builder::node_address, JsonpDeserializer.stringDeserializer(), "node.address", "na", "nodeAddress");
		op.add(Builder::buckets_count, JsonpDeserializer.stringDeserializer(), "buckets.count", "bc", "bucketsCount");
		op.add(Builder::buckets_time_total, JsonpDeserializer.stringDeserializer(), "buckets.time.total", "btt",
				"bucketsTimeTotal");
		op.add(Builder::buckets_time_min, JsonpDeserializer.stringDeserializer(), "buckets.time.min", "btmin",
				"bucketsTimeMin");
		op.add(Builder::buckets_time_max, JsonpDeserializer.stringDeserializer(), "buckets.time.max", "btmax",
				"bucketsTimeMax");
		op.add(Builder::buckets_time_expAvg, JsonpDeserializer.stringDeserializer(), "buckets.time.exp_avg", "btea",
				"bucketsTimeExpAvg");
		op.add(Builder::buckets_time_expAvgHour, JsonpDeserializer.stringDeserializer(), "buckets.time.exp_avg_hour",
				"bteah", "bucketsTimeExpAvgHour");

	}

}
