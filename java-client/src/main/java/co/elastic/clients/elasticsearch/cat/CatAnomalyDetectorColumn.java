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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#cat._types.CatAnomalyDetectorColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatAnomalyDetectorColumn implements JsonEnum {
	/**
	 * For open anomaly detection jobs only, contains messages relating to the
	 * selection of a node to run the job.
	 */
	AssignmentExplanation("assignment_explanation", "ae"),

	/**
	 * The number of bucket results produced by the job.
	 */
	BucketsCount("buckets.count", "bc", "bucketsCount"),

	/**
	 * Exponential moving average of all bucket processing times, in milliseconds.
	 */
	BucketsTimeExpAvg("buckets.time.exp_avg", "btea", "bucketsTimeExpAvg"),

	/**
	 * Exponentially-weighted moving average of bucket processing times calculated
	 * in a 1 hour time window, in milliseconds.
	 */
	BucketsTimeExpAvgHour("buckets.time.exp_avg_hour", "bteah", "bucketsTimeExpAvgHour"),

	/**
	 * Maximum among all bucket processing times, in milliseconds.
	 */
	BucketsTimeMax("buckets.time.max", "btmax", "bucketsTimeMax"),

	/**
	 * Minimum among all bucket processing times, in milliseconds.
	 */
	BucketsTimeMin("buckets.time.min", "btmin", "bucketsTimeMin"),

	/**
	 * Sum of all bucket processing times, in milliseconds.
	 */
	BucketsTimeTotal("buckets.time.total", "btt", "bucketsTimeTotal"),

	/**
	 * The number of buckets processed.
	 */
	DataBuckets("data.buckets", "db", "dataBuckets"),

	/**
	 * The timestamp of the earliest chronologically input document.
	 */
	DataEarliestRecord("data.earliest_record", "der", "dataEarliestRecord"),

	/**
	 * The number of buckets which did not contain any data.
	 */
	DataEmptyBuckets("data.empty_buckets", "deb", "dataEmptyBuckets"),

	/**
	 * The number of bytes of input data posted to the anomaly detection job.
	 */
	DataInputBytes("data.input_bytes", "dib", "dataInputBytes"),

	/**
	 * The total number of fields in input documents posted to the anomaly detection
	 * job. This count includes fields that are not used in the analysis. However,
	 * be aware that if you are using a datafeed, it extracts only the required
	 * fields from the documents it retrieves before posting them to the job.
	 */
	DataInputFields("data.input_fields", "dif", "dataInputFields"),

	/**
	 * The number of input documents posted to the anomaly detection job.
	 */
	DataInputRecords("data.input_records", "dir", "dataInputRecords"),

	/**
	 * The number of input documents with either a missing date field or a date that
	 * could not be parsed.
	 */
	DataInvalidDates("data.invalid_dates", "did", "dataInvalidDates"),

	/**
	 * The timestamp at which data was last analyzed, according to server time.
	 */
	DataLast("data.last", "dl", "dataLast"),

	/**
	 * The timestamp of the last bucket that did not contain any data.
	 */
	DataLastEmptyBucket("data.last_empty_bucket", "dleb", "dataLastEmptyBucket"),

	/**
	 * The timestamp of the last bucket that was considered sparse.
	 */
	DataLastSparseBucket("data.last_sparse_bucket", "dlsb", "dataLastSparseBucket"),

	/**
	 * The timestamp of the latest chronologically input document.
	 */
	DataLatestRecord("data.latest_record", "dlr", "dataLatestRecord"),

	/**
	 * The number of input documents that are missing a field that the anomaly
	 * detection job is configured to analyze. Input documents with missing fields
	 * are still processed because it is possible that not all fields are missing.
	 */
	DataMissingFields("data.missing_fields", "dmf", "dataMissingFields"),

	/**
	 * The number of input documents that have a timestamp chronologically preceding
	 * the start of the current anomaly detection bucket offset by the latency
	 * window. This information is applicable only when you provide data to the
	 * anomaly detection job by using the post data API. These out of order
	 * documents are discarded, since jobs require time series data to be in
	 * ascending chronological order.
	 */
	DataOutOfOrderTimestamps("data.out_of_order_timestamps", "doot", "dataOutOfOrderTimestamps"),

	/**
	 * The total number of fields in all the documents that have been processed by
	 * the anomaly detection job. Only fields that are specified in the detector
	 * configuration object contribute to this count. The timestamp is not included
	 * in this count.
	 */
	DataProcessedFields("data.processed_fields", "dpf", "dataProcessedFields"),

	/**
	 * The number of input documents that have been processed by the anomaly
	 * detection job. This value includes documents with missing fields, since they
	 * are nonetheless analyzed. If you use datafeeds and have aggregations in your
	 * search query, the processed record count is the number of aggregation results
	 * processed, not the number of Elasticsearch documents.
	 */
	DataProcessedRecords("data.processed_records", "dpr", "dataProcessedRecords"),

	/**
	 * The number of buckets that contained few data points compared to the expected
	 * number of data points.
	 */
	DataSparseBuckets("data.sparse_buckets", "dsb", "dataSparseBuckets"),

	/**
	 * The average memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsMemoryAvg("forecasts.memory.avg", "fmavg", "forecastsMemoryAvg"),

	/**
	 * The maximum memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsMemoryMax("forecasts.memory.max", "fmmax", "forecastsMemoryMax"),

	/**
	 * The minimum memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsMemoryMin("forecasts.memory.min", "fmmin", "forecastsMemoryMin"),

	/**
	 * The total memory usage in bytes for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsMemoryTotal("forecasts.memory.total", "fmt", "forecastsMemoryTotal"),

	/**
	 * The average number of <code>m</code>odel_forecast` documents written for
	 * forecasts related to the anomaly detection job.
	 */
	ForecastsRecordsAvg("forecasts.records.avg", "fravg", "forecastsRecordsAvg"),

	/**
	 * The maximum number of <code>model_forecast</code> documents written for
	 * forecasts related to the anomaly detection job.
	 */
	ForecastsRecordsMax("forecasts.records.max", "frmax", "forecastsRecordsMax"),

	/**
	 * The minimum number of <code>model_forecast</code> documents written for
	 * forecasts related to the anomaly detection job.
	 */
	ForecastsRecordsMin("forecasts.records.min", "frmin", "forecastsRecordsMin"),

	/**
	 * The total number of <code>model_forecast</code> documents written for
	 * forecasts related to the anomaly detection job.
	 */
	ForecastsRecordsTotal("forecasts.records.total", "frt", "forecastsRecordsTotal"),

	/**
	 * The average runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsTimeAvg("forecasts.time.avg", "ftavg", "forecastsTimeAvg"),

	/**
	 * The maximum runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsTimeMax("forecasts.time.max", "ftmax", "forecastsTimeMax"),

	/**
	 * The minimum runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsTimeMin("forecasts.time.min", "ftmin", "forecastsTimeMin"),

	/**
	 * The total runtime in milliseconds for forecasts related to the anomaly
	 * detection job.
	 */
	ForecastsTimeTotal("forecasts.time.total", "ftt", "forecastsTimeTotal"),

	/**
	 * The number of individual forecasts currently available for the job.
	 */
	ForecastsTotal("forecasts.total", "ft", "forecastsTotal"),

	/**
	 * Identifier for the anomaly detection job.
	 */
	Id("id"),

	/**
	 * The number of buckets for which new entities in incoming data were not
	 * processed due to insufficient model memory.
	 */
	ModelBucketAllocationFailures("model.bucket_allocation_failures", "mbaf", "modelBucketAllocationFailures"),

	/**
	 * The number of by field values that were analyzed by the models. This value is
	 * cumulative for all detectors in the job.
	 */
	ModelByFields("model.by_fields", "mbf", "modelByFields"),

	/**
	 * The number of bytes of memory used by the models. This is the maximum value
	 * since the last time the model was persisted. If the job is closed, this value
	 * indicates the latest size.
	 */
	ModelBytes("model.bytes", "mb", "modelBytes"),

	/**
	 * The number of bytes over the high limit for memory usage at the last
	 * allocation failure.
	 */
	ModelBytesExceeded("model.bytes_exceeded", "mbe", "modelBytesExceeded"),

	/**
	 * The status of categorization for the job: <code>ok</code> or
	 * <code>warn</code>. If <code>ok</code>, categorization is performing
	 * acceptably well (or not being used at all). If <code>warn</code>,
	 * categorization is detecting a distribution of categories that suggests the
	 * input data is inappropriate for categorization. Problems could be that there
	 * is only one category, more than 90% of categories are rare, the number of
	 * categories is greater than 50% of the number of categorized documents, there
	 * are no frequently matched categories, or more than 50% of categories are
	 * dead.
	 */
	ModelCategorizationStatus("model.categorization_status", "mcs", "modelCategorizationStatus"),

	/**
	 * The number of documents that have had a field categorized.
	 */
	ModelCategorizedDocCount("model.categorized_doc_count", "mcdc", "modelCategorizedDocCount"),

	/**
	 * The number of categories created by categorization that will never be
	 * assigned again because another category’s definition makes it a superset of
	 * the dead category. Dead categories are a side effect of the way
	 * categorization has no prior training.
	 */
	ModelDeadCategoryCount("model.dead_category_count", "mdcc", "modelDeadCategoryCount"),

	/**
	 * The number of times that categorization wanted to create a new category but
	 * couldn’t because the job had hit its model memory limit. This count does not
	 * track which specific categories failed to be created. Therefore, you cannot
	 * use this value to determine the number of unique categories that were missed.
	 */
	ModelFailedCategoryCount("model.failed_category_count", "mdcc", "modelFailedCategoryCount"),

	/**
	 * The number of categories that match more than 1% of categorized documents.
	 */
	ModelFrequentCategoryCount("model.frequent_category_count", "mfcc", "modelFrequentCategoryCount"),

	/**
	 * The timestamp when the model stats were gathered, according to server time.
	 */
	ModelLogTime("model.log_time", "mlt", "modelLogTime"),

	/**
	 * The timestamp when the model stats were gathered, according to server time.
	 */
	ModelMemoryLimit("model.memory_limit", "mml", "modelMemoryLimit"),

	/**
	 * The status of the mathematical models: <code>ok</code>,
	 * <code>soft_limit</code>, or <code>hard_limit</code>. If <code>ok</code>, the
	 * models stayed below the configured value. If <code>soft_limit</code>, the
	 * models used more than 60% of the configured memory limit and older unused
	 * models will be pruned to free up space. Additionally, in categorization jobs
	 * no further category examples will be stored. If <code>hard_limit</code>, the
	 * models used more space than the configured memory limit. As a result, not all
	 * incoming data was processed.
	 */
	ModelMemoryStatus("model.memory_status", "mms", "modelMemoryStatus"),

	/**
	 * The number of over field values that were analyzed by the models. This value
	 * is cumulative for all detectors in the job.
	 */
	ModelOverFields("model.over_fields", "mof", "modelOverFields"),

	/**
	 * The number of partition field values that were analyzed by the models. This
	 * value is cumulative for all detectors in the job.
	 */
	ModelPartitionFields("model.partition_fields", "mpf", "modelPartitionFields"),

	/**
	 * The number of categories that match just one categorized document.
	 */
	ModelRareCategoryCount("model.rare_category_count", "mrcc", "modelRareCategoryCount"),

	/**
	 * The timestamp of the last record when the model stats were gathered.
	 */
	ModelTimestamp("model.timestamp", "mt", "modelTimestamp"),

	/**
	 * The number of categories created by categorization.
	 */
	ModelTotalCategoryCount("model.total_category_count", "mtcc", "modelTotalCategoryCount"),

	/**
	 * The network address of the node that runs the job. This information is
	 * available only for open jobs.
	 */
	NodeAddress("node.address", "na", "nodeAddress"),

	/**
	 * The ephemeral ID of the node that runs the job. This information is available
	 * only for open jobs.
	 */
	NodeEphemeralId("node.ephemeral_id", "ne", "nodeEphemeralId"),

	/**
	 * The unique identifier of the node that runs the job. This information is
	 * available only for open jobs.
	 */
	NodeId("node.id", "ni", "nodeId"),

	/**
	 * The name of the node that runs the job. This information is available only
	 * for open jobs.
	 */
	NodeName("node.name", "nn", "nodeName"),

	/**
	 * For open jobs only, the elapsed time for which the job has been open.
	 */
	OpenedTime("opened_time", "ot"),

	/**
	 * The status of the anomaly detection job: <code>closed</code>,
	 * <code>closing</code>, <code>failed</code>, <code>opened</code>, or
	 * <code>opening</code>. If <code>closed</code>, the job finished successfully
	 * with its model state persisted. The job must be opened before it can accept
	 * further data. If <code>closing</code>, the job close action is in progress
	 * and has not yet completed. A closing job cannot accept further data. If
	 * <code>failed</code>, the job did not finish successfully due to an error.
	 * This situation can occur due to invalid input data, a fatal error occurring
	 * during the analysis, or an external interaction such as the process being
	 * killed by the Linux out of memory (OOM) killer. If the job had irrevocably
	 * failed, it must be force closed and then deleted. If the datafeed can be
	 * corrected, the job can be closed and then re-opened. If <code>opened</code>,
	 * the job is available to receive and process data. If <code>opening</code>,
	 * the job open action is in progress and has not yet completed.
	 */
	State("state", "s"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatAnomalyDetectorColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatAnomalyDetectorColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatAnomalyDetectorColumn.values());
}
