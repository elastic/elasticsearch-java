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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.EndpointWithResponseMapperAttr;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the ml namespace.
 */
public class ElasticsearchMlClient extends ApiClient<ElasticsearchMlClient> {

	public ElasticsearchMlClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchMlClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchMlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchMlClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ml.close_job

	/**
	 * Closes one or more anomaly detection jobs. A job can be opened and closed
	 * multiple times throughout its lifecycle.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-close-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CloseJobResponse closeJob(CloseJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CloseJobRequest, CloseJobResponse, ErrorResponse> endpoint = (Endpoint<CloseJobRequest, CloseJobResponse, ErrorResponse>) CloseJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Closes one or more anomaly detection jobs. A job can be opened and closed
	 * multiple times throughout its lifecycle.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloseJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-close-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CloseJobResponse closeJob(Function<CloseJobRequest.Builder, ObjectBuilder<CloseJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return closeJob(fn.apply(new CloseJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar

	/**
	 * Deletes a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteCalendarResponse deleteCalendar(DeleteCalendarRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteCalendarRequest, DeleteCalendarResponse, ErrorResponse> endpoint = (Endpoint<DeleteCalendarRequest, DeleteCalendarResponse, ErrorResponse>) DeleteCalendarRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteCalendarRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteCalendarResponse deleteCalendar(
			Function<DeleteCalendarRequest.Builder, ObjectBuilder<DeleteCalendarRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteCalendar(fn.apply(new DeleteCalendarRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar_event

	/**
	 * Deletes scheduled events from a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteCalendarEventResponse deleteCalendarEvent(DeleteCalendarEventRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteCalendarEventRequest, DeleteCalendarEventResponse, ErrorResponse> endpoint = (Endpoint<DeleteCalendarEventRequest, DeleteCalendarEventResponse, ErrorResponse>) DeleteCalendarEventRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes scheduled events from a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteCalendarEventRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteCalendarEventResponse deleteCalendarEvent(
			Function<DeleteCalendarEventRequest.Builder, ObjectBuilder<DeleteCalendarEventRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteCalendarEvent(fn.apply(new DeleteCalendarEventRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar_job

	/**
	 * Deletes anomaly detection jobs from a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteCalendarJobResponse deleteCalendarJob(DeleteCalendarJobRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteCalendarJobRequest, DeleteCalendarJobResponse, ErrorResponse> endpoint = (Endpoint<DeleteCalendarJobRequest, DeleteCalendarJobResponse, ErrorResponse>) DeleteCalendarJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes anomaly detection jobs from a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteCalendarJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteCalendarJobResponse deleteCalendarJob(
			Function<DeleteCalendarJobRequest.Builder, ObjectBuilder<DeleteCalendarJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteCalendarJob(fn.apply(new DeleteCalendarJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_data_frame_analytics

	/**
	 * Deletes an existing data frame analytics job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDataFrameAnalyticsResponse deleteDataFrameAnalytics(DeleteDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteDataFrameAnalyticsRequest, DeleteDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<DeleteDataFrameAnalyticsRequest, DeleteDataFrameAnalyticsResponse, ErrorResponse>) DeleteDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDataFrameAnalyticsResponse deleteDataFrameAnalytics(
			Function<DeleteDataFrameAnalyticsRequest.Builder, ObjectBuilder<DeleteDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDataFrameAnalytics(fn.apply(new DeleteDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_datafeed

	/**
	 * Deletes an existing datafeed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDatafeedResponse deleteDatafeed(DeleteDatafeedRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteDatafeedRequest, DeleteDatafeedResponse, ErrorResponse> endpoint = (Endpoint<DeleteDatafeedRequest, DeleteDatafeedResponse, ErrorResponse>) DeleteDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDatafeedResponse deleteDatafeed(
			Function<DeleteDatafeedRequest.Builder, ObjectBuilder<DeleteDatafeedRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDatafeed(fn.apply(new DeleteDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_filter

	/**
	 * Deletes a filter.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteFilterResponse deleteFilter(DeleteFilterRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteFilterRequest, DeleteFilterResponse, ErrorResponse> endpoint = (Endpoint<DeleteFilterRequest, DeleteFilterResponse, ErrorResponse>) DeleteFilterRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a filter.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteFilterRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteFilterResponse deleteFilter(
			Function<DeleteFilterRequest.Builder, ObjectBuilder<DeleteFilterRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteFilter(fn.apply(new DeleteFilterRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_forecast

	/**
	 * Deletes forecasts from a machine learning job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-forecast.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteForecastResponse deleteForecast(DeleteForecastRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteForecastRequest, DeleteForecastResponse, ErrorResponse> endpoint = (Endpoint<DeleteForecastRequest, DeleteForecastResponse, ErrorResponse>) DeleteForecastRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes forecasts from a machine learning job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteForecastRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-forecast.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteForecastResponse deleteForecast(
			Function<DeleteForecastRequest.Builder, ObjectBuilder<DeleteForecastRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteForecast(fn.apply(new DeleteForecastRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_job

	/**
	 * Deletes an existing anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteJobResponse deleteJob(DeleteJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> endpoint = (Endpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse>) DeleteJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteJobResponse deleteJob(Function<DeleteJobRequest.Builder, ObjectBuilder<DeleteJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteJob(fn.apply(new DeleteJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_model_snapshot

	/**
	 * Deletes an existing model snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteModelSnapshotResponse deleteModelSnapshot(DeleteModelSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteModelSnapshotRequest, DeleteModelSnapshotResponse, ErrorResponse> endpoint = (Endpoint<DeleteModelSnapshotRequest, DeleteModelSnapshotResponse, ErrorResponse>) DeleteModelSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing model snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteModelSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteModelSnapshotResponse deleteModelSnapshot(
			Function<DeleteModelSnapshotRequest.Builder, ObjectBuilder<DeleteModelSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteModelSnapshot(fn.apply(new DeleteModelSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_trained_model

	/**
	 * Deletes an existing trained inference model that is currently not referenced
	 * by an ingest pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTrainedModelResponse deleteTrainedModel(DeleteTrainedModelRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteTrainedModelRequest, DeleteTrainedModelResponse, ErrorResponse> endpoint = (Endpoint<DeleteTrainedModelRequest, DeleteTrainedModelResponse, ErrorResponse>) DeleteTrainedModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing trained inference model that is currently not referenced
	 * by an ingest pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTrainedModelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteTrainedModelResponse deleteTrainedModel(
			Function<DeleteTrainedModelRequest.Builder, ObjectBuilder<DeleteTrainedModelRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteTrainedModel(fn.apply(new DeleteTrainedModelRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_trained_model_alias

	/**
	 * Deletes a model alias that refers to the trained model
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTrainedModelAliasResponse deleteTrainedModelAlias(DeleteTrainedModelAliasRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteTrainedModelAliasRequest, DeleteTrainedModelAliasResponse, ErrorResponse> endpoint = (Endpoint<DeleteTrainedModelAliasRequest, DeleteTrainedModelAliasResponse, ErrorResponse>) DeleteTrainedModelAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a model alias that refers to the trained model
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTrainedModelAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteTrainedModelAliasResponse deleteTrainedModelAlias(
			Function<DeleteTrainedModelAliasRequest.Builder, ObjectBuilder<DeleteTrainedModelAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteTrainedModelAlias(fn.apply(new DeleteTrainedModelAliasRequest.Builder()).build());
	}

	// ----- Endpoint: ml.estimate_model_memory

	/**
	 * Estimates the model memory
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public EstimateModelMemoryResponse estimateModelMemory(EstimateModelMemoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<EstimateModelMemoryRequest, EstimateModelMemoryResponse, ErrorResponse> endpoint = (Endpoint<EstimateModelMemoryRequest, EstimateModelMemoryResponse, ErrorResponse>) EstimateModelMemoryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Estimates the model memory
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EstimateModelMemoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final EstimateModelMemoryResponse estimateModelMemory(
			Function<EstimateModelMemoryRequest.Builder, ObjectBuilder<EstimateModelMemoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return estimateModelMemory(fn.apply(new EstimateModelMemoryRequest.Builder()).build());
	}

	/**
	 * Estimates the model memory
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public EstimateModelMemoryResponse estimateModelMemory() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new EstimateModelMemoryRequest.Builder().build(),
				EstimateModelMemoryRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.evaluate_data_frame

	/**
	 * Evaluates the data frame analytics for an annotated index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/evaluate-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public EvaluateDataFrameResponse evaluateDataFrame(EvaluateDataFrameRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<EvaluateDataFrameRequest, EvaluateDataFrameResponse, ErrorResponse> endpoint = (Endpoint<EvaluateDataFrameRequest, EvaluateDataFrameResponse, ErrorResponse>) EvaluateDataFrameRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Evaluates the data frame analytics for an annotated index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EvaluateDataFrameRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/evaluate-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final EvaluateDataFrameResponse evaluateDataFrame(
			Function<EvaluateDataFrameRequest.Builder, ObjectBuilder<EvaluateDataFrameRequest>> fn)
			throws IOException, ElasticsearchException {
		return evaluateDataFrame(fn.apply(new EvaluateDataFrameRequest.Builder()).build());
	}

	// ----- Endpoint: ml.explain_data_frame_analytics

	/**
	 * Explains a data frame analytics config.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/explain-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExplainDataFrameAnalyticsResponse explainDataFrameAnalytics(ExplainDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExplainDataFrameAnalyticsRequest, ExplainDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<ExplainDataFrameAnalyticsRequest, ExplainDataFrameAnalyticsResponse, ErrorResponse>) ExplainDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Explains a data frame analytics config.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/explain-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ExplainDataFrameAnalyticsResponse explainDataFrameAnalytics(
			Function<ExplainDataFrameAnalyticsRequest.Builder, ObjectBuilder<ExplainDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return explainDataFrameAnalytics(fn.apply(new ExplainDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.flush_job

	/**
	 * Forces any buffered data to be processed by the job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-flush-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushJobResponse flushJob(FlushJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<FlushJobRequest, FlushJobResponse, ErrorResponse> endpoint = (Endpoint<FlushJobRequest, FlushJobResponse, ErrorResponse>) FlushJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Forces any buffered data to be processed by the job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FlushJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-flush-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FlushJobResponse flushJob(Function<FlushJobRequest.Builder, ObjectBuilder<FlushJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return flushJob(fn.apply(new FlushJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.forecast

	/**
	 * Predicts the future behavior of a time series by using its historical
	 * behavior.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-forecast.html">Documentation
	 *      on elastic.co</a>
	 */

	public ForecastResponse forecast(ForecastRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ForecastRequest, ForecastResponse, ErrorResponse> endpoint = (Endpoint<ForecastRequest, ForecastResponse, ErrorResponse>) ForecastRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Predicts the future behavior of a time series by using its historical
	 * behavior.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForecastRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-forecast.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ForecastResponse forecast(Function<ForecastRequest.Builder, ObjectBuilder<ForecastRequest>> fn)
			throws IOException, ElasticsearchException {
		return forecast(fn.apply(new ForecastRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_buckets

	/**
	 * Retrieves anomaly detection job results for one or more buckets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-bucket.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetBucketsResponse getBuckets(GetBucketsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetBucketsRequest, GetBucketsResponse, ErrorResponse> endpoint = (Endpoint<GetBucketsRequest, GetBucketsResponse, ErrorResponse>) GetBucketsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves anomaly detection job results for one or more buckets.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetBucketsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-bucket.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetBucketsResponse getBuckets(Function<GetBucketsRequest.Builder, ObjectBuilder<GetBucketsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getBuckets(fn.apply(new GetBucketsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_calendar_events

	/**
	 * Retrieves information about the scheduled events in calendars.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetCalendarEventsResponse getCalendarEvents(GetCalendarEventsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetCalendarEventsRequest, GetCalendarEventsResponse, ErrorResponse> endpoint = (Endpoint<GetCalendarEventsRequest, GetCalendarEventsResponse, ErrorResponse>) GetCalendarEventsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves information about the scheduled events in calendars.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetCalendarEventsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetCalendarEventsResponse getCalendarEvents(
			Function<GetCalendarEventsRequest.Builder, ObjectBuilder<GetCalendarEventsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getCalendarEvents(fn.apply(new GetCalendarEventsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_calendars

	/**
	 * Retrieves configuration information for calendars.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetCalendarsResponse getCalendars(GetCalendarsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetCalendarsRequest, GetCalendarsResponse, ErrorResponse> endpoint = (Endpoint<GetCalendarsRequest, GetCalendarsResponse, ErrorResponse>) GetCalendarsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves configuration information for calendars.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetCalendarsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetCalendarsResponse getCalendars(
			Function<GetCalendarsRequest.Builder, ObjectBuilder<GetCalendarsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getCalendars(fn.apply(new GetCalendarsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for calendars.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetCalendarsResponse getCalendars() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetCalendarsRequest.Builder().build(), GetCalendarsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_categories

	/**
	 * Retrieves anomaly detection job results for one or more categories.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-category.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetCategoriesResponse getCategories(GetCategoriesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetCategoriesRequest, GetCategoriesResponse, ErrorResponse> endpoint = (Endpoint<GetCategoriesRequest, GetCategoriesResponse, ErrorResponse>) GetCategoriesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves anomaly detection job results for one or more categories.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetCategoriesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-category.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetCategoriesResponse getCategories(
			Function<GetCategoriesRequest.Builder, ObjectBuilder<GetCategoriesRequest>> fn)
			throws IOException, ElasticsearchException {
		return getCategories(fn.apply(new GetCategoriesRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_data_frame_analytics

	/**
	 * Retrieves configuration information for data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataFrameAnalyticsResponse getDataFrameAnalytics(GetDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetDataFrameAnalyticsRequest, GetDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<GetDataFrameAnalyticsRequest, GetDataFrameAnalyticsResponse, ErrorResponse>) GetDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves configuration information for data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetDataFrameAnalyticsResponse getDataFrameAnalytics(
			Function<GetDataFrameAnalyticsRequest.Builder, ObjectBuilder<GetDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getDataFrameAnalytics(fn.apply(new GetDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataFrameAnalyticsResponse getDataFrameAnalytics() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetDataFrameAnalyticsRequest.Builder().build(),
				GetDataFrameAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.get_data_frame_analytics_stats

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataFrameAnalyticsStatsResponse getDataFrameAnalyticsStats(GetDataFrameAnalyticsStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetDataFrameAnalyticsStatsRequest, GetDataFrameAnalyticsStatsResponse, ErrorResponse> endpoint = (Endpoint<GetDataFrameAnalyticsStatsRequest, GetDataFrameAnalyticsStatsResponse, ErrorResponse>) GetDataFrameAnalyticsStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataFrameAnalyticsStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetDataFrameAnalyticsStatsResponse getDataFrameAnalyticsStats(
			Function<GetDataFrameAnalyticsStatsRequest.Builder, ObjectBuilder<GetDataFrameAnalyticsStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getDataFrameAnalyticsStats(fn.apply(new GetDataFrameAnalyticsStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataFrameAnalyticsStatsResponse getDataFrameAnalyticsStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetDataFrameAnalyticsStatsRequest.Builder().build(),
				GetDataFrameAnalyticsStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.get_datafeed_stats

	/**
	 * Retrieves usage information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDatafeedStatsResponse getDatafeedStats(GetDatafeedStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetDatafeedStatsRequest, GetDatafeedStatsResponse, ErrorResponse> endpoint = (Endpoint<GetDatafeedStatsRequest, GetDatafeedStatsResponse, ErrorResponse>) GetDatafeedStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves usage information for datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDatafeedStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetDatafeedStatsResponse getDatafeedStats(
			Function<GetDatafeedStatsRequest.Builder, ObjectBuilder<GetDatafeedStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getDatafeedStats(fn.apply(new GetDatafeedStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDatafeedStatsResponse getDatafeedStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetDatafeedStatsRequest.Builder().build(),
				GetDatafeedStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.get_datafeeds

	/**
	 * Retrieves configuration information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDatafeedsResponse getDatafeeds(GetDatafeedsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetDatafeedsRequest, GetDatafeedsResponse, ErrorResponse> endpoint = (Endpoint<GetDatafeedsRequest, GetDatafeedsResponse, ErrorResponse>) GetDatafeedsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves configuration information for datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDatafeedsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetDatafeedsResponse getDatafeeds(
			Function<GetDatafeedsRequest.Builder, ObjectBuilder<GetDatafeedsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getDatafeeds(fn.apply(new GetDatafeedsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDatafeedsResponse getDatafeeds() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetDatafeedsRequest.Builder().build(), GetDatafeedsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_filters

	/**
	 * Retrieves filters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetFiltersResponse getFilters(GetFiltersRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetFiltersRequest, GetFiltersResponse, ErrorResponse> endpoint = (Endpoint<GetFiltersRequest, GetFiltersResponse, ErrorResponse>) GetFiltersRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves filters.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetFiltersRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetFiltersResponse getFilters(Function<GetFiltersRequest.Builder, ObjectBuilder<GetFiltersRequest>> fn)
			throws IOException, ElasticsearchException {
		return getFilters(fn.apply(new GetFiltersRequest.Builder()).build());
	}

	/**
	 * Retrieves filters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetFiltersResponse getFilters() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetFiltersRequest.Builder().build(), GetFiltersRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_influencers

	/**
	 * Retrieves anomaly detection job results for one or more influencers.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-influencer.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetInfluencersResponse getInfluencers(GetInfluencersRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetInfluencersRequest, GetInfluencersResponse, ErrorResponse> endpoint = (Endpoint<GetInfluencersRequest, GetInfluencersResponse, ErrorResponse>) GetInfluencersRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves anomaly detection job results for one or more influencers.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetInfluencersRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-influencer.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetInfluencersResponse getInfluencers(
			Function<GetInfluencersRequest.Builder, ObjectBuilder<GetInfluencersRequest>> fn)
			throws IOException, ElasticsearchException {
		return getInfluencers(fn.apply(new GetInfluencersRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_job_stats

	/**
	 * Retrieves usage information for anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobStatsResponse getJobStats(GetJobStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetJobStatsRequest, GetJobStatsResponse, ErrorResponse> endpoint = (Endpoint<GetJobStatsRequest, GetJobStatsResponse, ErrorResponse>) GetJobStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves usage information for anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetJobStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetJobStatsResponse getJobStats(
			Function<GetJobStatsRequest.Builder, ObjectBuilder<GetJobStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getJobStats(fn.apply(new GetJobStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobStatsResponse getJobStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetJobStatsRequest.Builder().build(), GetJobStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_jobs

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs(GetJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetJobsRequest, GetJobsResponse, ErrorResponse> endpoint = (Endpoint<GetJobsRequest, GetJobsResponse, ErrorResponse>) GetJobsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetJobsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetJobsResponse getJobs(Function<GetJobsRequest.Builder, ObjectBuilder<GetJobsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getJobs(fn.apply(new GetJobsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetJobsRequest.Builder().build(), GetJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_model_snapshots

	/**
	 * Retrieves information about model snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetModelSnapshotsResponse getModelSnapshots(GetModelSnapshotsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetModelSnapshotsRequest, GetModelSnapshotsResponse, ErrorResponse> endpoint = (Endpoint<GetModelSnapshotsRequest, GetModelSnapshotsResponse, ErrorResponse>) GetModelSnapshotsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves information about model snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetModelSnapshotsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetModelSnapshotsResponse getModelSnapshots(
			Function<GetModelSnapshotsRequest.Builder, ObjectBuilder<GetModelSnapshotsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getModelSnapshots(fn.apply(new GetModelSnapshotsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_overall_buckets

	/**
	 * Retrieves overall bucket results that summarize the bucket results of
	 * multiple anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-overall-buckets.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetOverallBucketsResponse getOverallBuckets(GetOverallBucketsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetOverallBucketsRequest, GetOverallBucketsResponse, ErrorResponse> endpoint = (Endpoint<GetOverallBucketsRequest, GetOverallBucketsResponse, ErrorResponse>) GetOverallBucketsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves overall bucket results that summarize the bucket results of
	 * multiple anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetOverallBucketsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-overall-buckets.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetOverallBucketsResponse getOverallBuckets(
			Function<GetOverallBucketsRequest.Builder, ObjectBuilder<GetOverallBucketsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getOverallBuckets(fn.apply(new GetOverallBucketsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_records

	/**
	 * Retrieves anomaly records for an anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-record.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRecordsResponse getRecords(GetRecordsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetRecordsRequest, GetRecordsResponse, ErrorResponse> endpoint = (Endpoint<GetRecordsRequest, GetRecordsResponse, ErrorResponse>) GetRecordsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves anomaly records for an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRecordsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-record.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRecordsResponse getRecords(Function<GetRecordsRequest.Builder, ObjectBuilder<GetRecordsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRecords(fn.apply(new GetRecordsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.get_trained_models

	/**
	 * Retrieves configuration information for a trained inference model.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTrainedModelsResponse getTrainedModels(GetTrainedModelsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetTrainedModelsRequest, GetTrainedModelsResponse, ErrorResponse> endpoint = (Endpoint<GetTrainedModelsRequest, GetTrainedModelsResponse, ErrorResponse>) GetTrainedModelsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves configuration information for a trained inference model.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTrainedModelsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTrainedModelsResponse getTrainedModels(
			Function<GetTrainedModelsRequest.Builder, ObjectBuilder<GetTrainedModelsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getTrainedModels(fn.apply(new GetTrainedModelsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for a trained inference model.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTrainedModelsResponse getTrainedModels() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTrainedModelsRequest.Builder().build(),
				GetTrainedModelsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.get_trained_models_stats

	/**
	 * Retrieves usage information for trained inference models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTrainedModelsStatsResponse getTrainedModelsStats(GetTrainedModelsStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetTrainedModelsStatsRequest, GetTrainedModelsStatsResponse, ErrorResponse> endpoint = (Endpoint<GetTrainedModelsStatsRequest, GetTrainedModelsStatsResponse, ErrorResponse>) GetTrainedModelsStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves usage information for trained inference models.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTrainedModelsStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTrainedModelsStatsResponse getTrainedModelsStats(
			Function<GetTrainedModelsStatsRequest.Builder, ObjectBuilder<GetTrainedModelsStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getTrainedModelsStats(fn.apply(new GetTrainedModelsStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for trained inference models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTrainedModelsStatsResponse getTrainedModelsStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTrainedModelsStatsRequest.Builder().build(),
				GetTrainedModelsStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.info

	/**
	 * Returns defaults and limits used by machine learning.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-ml-info.html">Documentation
	 *      on elastic.co</a>
	 */
	public MlInfoResponse info() throws IOException, ElasticsearchException {
		return this.transport.performRequest(MlInfoRequest._INSTANCE, MlInfoRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.open_job

	/**
	 * Opens one or more anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-open-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public OpenJobResponse openJob(OpenJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<OpenJobRequest, OpenJobResponse, ErrorResponse> endpoint = (Endpoint<OpenJobRequest, OpenJobResponse, ErrorResponse>) OpenJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Opens one or more anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-open-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final OpenJobResponse openJob(Function<OpenJobRequest.Builder, ObjectBuilder<OpenJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return openJob(fn.apply(new OpenJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.post_calendar_events

	/**
	 * Posts scheduled events in a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostCalendarEventsResponse postCalendarEvents(PostCalendarEventsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PostCalendarEventsRequest, PostCalendarEventsResponse, ErrorResponse> endpoint = (Endpoint<PostCalendarEventsRequest, PostCalendarEventsResponse, ErrorResponse>) PostCalendarEventsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Posts scheduled events in a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostCalendarEventsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PostCalendarEventsResponse postCalendarEvents(
			Function<PostCalendarEventsRequest.Builder, ObjectBuilder<PostCalendarEventsRequest>> fn)
			throws IOException, ElasticsearchException {
		return postCalendarEvents(fn.apply(new PostCalendarEventsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.post_data

	/**
	 * Sends data to an anomaly detection job for analysis.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-data.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TData> PostDataResponse postData(PostDataRequest<TData> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PostDataRequest<?>, PostDataResponse, ErrorResponse> endpoint = (Endpoint<PostDataRequest<?>, PostDataResponse, ErrorResponse>) PostDataRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Sends data to an anomaly detection job for analysis.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostDataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-data.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TData> PostDataResponse postData(
			Function<PostDataRequest.Builder<TData>, ObjectBuilder<PostDataRequest<TData>>> fn)
			throws IOException, ElasticsearchException {
		return postData(fn.apply(new PostDataRequest.Builder<TData>()).build());
	}

	// ----- Endpoint: ml.preview_data_frame_analytics

	/**
	 * Previews that will be analyzed given a data frame analytics config.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public PreviewDataFrameAnalyticsResponse previewDataFrameAnalytics(PreviewDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PreviewDataFrameAnalyticsRequest, PreviewDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<PreviewDataFrameAnalyticsRequest, PreviewDataFrameAnalyticsResponse, ErrorResponse>) PreviewDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Previews that will be analyzed given a data frame analytics config.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PreviewDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PreviewDataFrameAnalyticsResponse previewDataFrameAnalytics(
			Function<PreviewDataFrameAnalyticsRequest.Builder, ObjectBuilder<PreviewDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return previewDataFrameAnalytics(fn.apply(new PreviewDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Previews that will be analyzed given a data frame analytics config.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public PreviewDataFrameAnalyticsResponse previewDataFrameAnalytics() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PreviewDataFrameAnalyticsRequest.Builder().build(),
				PreviewDataFrameAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.preview_datafeed

	/**
	 * Previews a datafeed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> PreviewDatafeedResponse<TDocument> previewDatafeed(PreviewDatafeedRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ErrorResponse>) PreviewDatafeedRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:ml.preview_datafeed.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Previews a datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PreviewDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> PreviewDatafeedResponse<TDocument> previewDatafeed(
			Function<PreviewDatafeedRequest.Builder, ObjectBuilder<PreviewDatafeedRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return previewDatafeed(fn.apply(new PreviewDatafeedRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: ml.put_calendar

	/**
	 * Instantiates a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutCalendarResponse putCalendar(PutCalendarRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutCalendarRequest, PutCalendarResponse, ErrorResponse> endpoint = (Endpoint<PutCalendarRequest, PutCalendarResponse, ErrorResponse>) PutCalendarRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Instantiates a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutCalendarRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutCalendarResponse putCalendar(
			Function<PutCalendarRequest.Builder, ObjectBuilder<PutCalendarRequest>> fn)
			throws IOException, ElasticsearchException {
		return putCalendar(fn.apply(new PutCalendarRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_calendar_job

	/**
	 * Adds an anomaly detection job to a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutCalendarJobResponse putCalendarJob(PutCalendarJobRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutCalendarJobRequest, PutCalendarJobResponse, ErrorResponse> endpoint = (Endpoint<PutCalendarJobRequest, PutCalendarJobResponse, ErrorResponse>) PutCalendarJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Adds an anomaly detection job to a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutCalendarJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutCalendarJobResponse putCalendarJob(
			Function<PutCalendarJobRequest.Builder, ObjectBuilder<PutCalendarJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return putCalendarJob(fn.apply(new PutCalendarJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_data_frame_analytics

	/**
	 * Instantiates a data frame analytics job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutDataFrameAnalyticsResponse putDataFrameAnalytics(PutDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutDataFrameAnalyticsRequest, PutDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<PutDataFrameAnalyticsRequest, PutDataFrameAnalyticsResponse, ErrorResponse>) PutDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Instantiates a data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutDataFrameAnalyticsResponse putDataFrameAnalytics(
			Function<PutDataFrameAnalyticsRequest.Builder, ObjectBuilder<PutDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return putDataFrameAnalytics(fn.apply(new PutDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_datafeed

	/**
	 * Instantiates a datafeed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutDatafeedResponse putDatafeed(PutDatafeedRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutDatafeedRequest, PutDatafeedResponse, ErrorResponse> endpoint = (Endpoint<PutDatafeedRequest, PutDatafeedResponse, ErrorResponse>) PutDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Instantiates a datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutDatafeedResponse putDatafeed(
			Function<PutDatafeedRequest.Builder, ObjectBuilder<PutDatafeedRequest>> fn)
			throws IOException, ElasticsearchException {
		return putDatafeed(fn.apply(new PutDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_filter

	/**
	 * Instantiates a filter.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutFilterResponse putFilter(PutFilterRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutFilterRequest, PutFilterResponse, ErrorResponse> endpoint = (Endpoint<PutFilterRequest, PutFilterResponse, ErrorResponse>) PutFilterRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Instantiates a filter.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutFilterRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutFilterResponse putFilter(Function<PutFilterRequest.Builder, ObjectBuilder<PutFilterRequest>> fn)
			throws IOException, ElasticsearchException {
		return putFilter(fn.apply(new PutFilterRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_job

	/**
	 * Instantiates an anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutJobResponse putJob(PutJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutJobRequest, PutJobResponse, ErrorResponse> endpoint = (Endpoint<PutJobRequest, PutJobResponse, ErrorResponse>) PutJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Instantiates an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutJobResponse putJob(Function<PutJobRequest.Builder, ObjectBuilder<PutJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return putJob(fn.apply(new PutJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_trained_model

	/**
	 * Creates an inference trained model.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTrainedModelResponse putTrainedModel(PutTrainedModelRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutTrainedModelRequest, PutTrainedModelResponse, ErrorResponse> endpoint = (Endpoint<PutTrainedModelRequest, PutTrainedModelResponse, ErrorResponse>) PutTrainedModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates an inference trained model.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTrainedModelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutTrainedModelResponse putTrainedModel(
			Function<PutTrainedModelRequest.Builder, ObjectBuilder<PutTrainedModelRequest>> fn)
			throws IOException, ElasticsearchException {
		return putTrainedModel(fn.apply(new PutTrainedModelRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_trained_model_alias

	/**
	 * Creates a new model alias (or reassigns an existing one) to refer to the
	 * trained model
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTrainedModelAliasResponse putTrainedModelAlias(PutTrainedModelAliasRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutTrainedModelAliasRequest, PutTrainedModelAliasResponse, ErrorResponse> endpoint = (Endpoint<PutTrainedModelAliasRequest, PutTrainedModelAliasResponse, ErrorResponse>) PutTrainedModelAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new model alias (or reassigns an existing one) to refer to the
	 * trained model
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTrainedModelAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutTrainedModelAliasResponse putTrainedModelAlias(
			Function<PutTrainedModelAliasRequest.Builder, ObjectBuilder<PutTrainedModelAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return putTrainedModelAlias(fn.apply(new PutTrainedModelAliasRequest.Builder()).build());
	}

	// ----- Endpoint: ml.reset_job

	/**
	 * Resets an existing anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-reset-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResetJobResponse resetJob(ResetJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ResetJobRequest, ResetJobResponse, ErrorResponse> endpoint = (Endpoint<ResetJobRequest, ResetJobResponse, ErrorResponse>) ResetJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Resets an existing anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResetJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-reset-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ResetJobResponse resetJob(Function<ResetJobRequest.Builder, ObjectBuilder<ResetJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return resetJob(fn.apply(new ResetJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.revert_model_snapshot

	/**
	 * Reverts to a specific snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-revert-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public RevertModelSnapshotResponse revertModelSnapshot(RevertModelSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RevertModelSnapshotRequest, RevertModelSnapshotResponse, ErrorResponse> endpoint = (Endpoint<RevertModelSnapshotRequest, RevertModelSnapshotResponse, ErrorResponse>) RevertModelSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Reverts to a specific snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RevertModelSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-revert-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RevertModelSnapshotResponse revertModelSnapshot(
			Function<RevertModelSnapshotRequest.Builder, ObjectBuilder<RevertModelSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return revertModelSnapshot(fn.apply(new RevertModelSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.set_upgrade_mode

	/**
	 * Sets a cluster wide upgrade_mode setting that prepares machine learning
	 * indices for an upgrade.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-set-upgrade-mode.html">Documentation
	 *      on elastic.co</a>
	 */

	public SetUpgradeModeResponse setUpgradeMode(SetUpgradeModeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SetUpgradeModeRequest, SetUpgradeModeResponse, ErrorResponse> endpoint = (Endpoint<SetUpgradeModeRequest, SetUpgradeModeResponse, ErrorResponse>) SetUpgradeModeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Sets a cluster wide upgrade_mode setting that prepares machine learning
	 * indices for an upgrade.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SetUpgradeModeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-set-upgrade-mode.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SetUpgradeModeResponse setUpgradeMode(
			Function<SetUpgradeModeRequest.Builder, ObjectBuilder<SetUpgradeModeRequest>> fn)
			throws IOException, ElasticsearchException {
		return setUpgradeMode(fn.apply(new SetUpgradeModeRequest.Builder()).build());
	}

	/**
	 * Sets a cluster wide upgrade_mode setting that prepares machine learning
	 * indices for an upgrade.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-set-upgrade-mode.html">Documentation
	 *      on elastic.co</a>
	 */

	public SetUpgradeModeResponse setUpgradeMode() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SetUpgradeModeRequest.Builder().build(),
				SetUpgradeModeRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.start_data_frame_analytics

	/**
	 * Starts a data frame analytics job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartDataFrameAnalyticsResponse startDataFrameAnalytics(StartDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StartDataFrameAnalyticsRequest, StartDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<StartDataFrameAnalyticsRequest, StartDataFrameAnalyticsResponse, ErrorResponse>) StartDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Starts a data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StartDataFrameAnalyticsResponse startDataFrameAnalytics(
			Function<StartDataFrameAnalyticsRequest.Builder, ObjectBuilder<StartDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return startDataFrameAnalytics(fn.apply(new StartDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.start_datafeed

	/**
	 * Starts one or more datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-start-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartDatafeedResponse startDatafeed(StartDatafeedRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StartDatafeedRequest, StartDatafeedResponse, ErrorResponse> endpoint = (Endpoint<StartDatafeedRequest, StartDatafeedResponse, ErrorResponse>) StartDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Starts one or more datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-start-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StartDatafeedResponse startDatafeed(
			Function<StartDatafeedRequest.Builder, ObjectBuilder<StartDatafeedRequest>> fn)
			throws IOException, ElasticsearchException {
		return startDatafeed(fn.apply(new StartDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.stop_data_frame_analytics

	/**
	 * Stops one or more data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopDataFrameAnalyticsResponse stopDataFrameAnalytics(StopDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StopDataFrameAnalyticsRequest, StopDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<StopDataFrameAnalyticsRequest, StopDataFrameAnalyticsResponse, ErrorResponse>) StopDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Stops one or more data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StopDataFrameAnalyticsResponse stopDataFrameAnalytics(
			Function<StopDataFrameAnalyticsRequest.Builder, ObjectBuilder<StopDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return stopDataFrameAnalytics(fn.apply(new StopDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.stop_datafeed

	/**
	 * Stops one or more datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-stop-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopDatafeedResponse stopDatafeed(StopDatafeedRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StopDatafeedRequest, StopDatafeedResponse, ErrorResponse> endpoint = (Endpoint<StopDatafeedRequest, StopDatafeedResponse, ErrorResponse>) StopDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Stops one or more datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-stop-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StopDatafeedResponse stopDatafeed(
			Function<StopDatafeedRequest.Builder, ObjectBuilder<StopDatafeedRequest>> fn)
			throws IOException, ElasticsearchException {
		return stopDatafeed(fn.apply(new StopDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_data_frame_analytics

	/**
	 * Updates certain properties of a data frame analytics job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateDataFrameAnalyticsResponse updateDataFrameAnalytics(UpdateDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateDataFrameAnalyticsRequest, UpdateDataFrameAnalyticsResponse, ErrorResponse> endpoint = (Endpoint<UpdateDataFrameAnalyticsRequest, UpdateDataFrameAnalyticsResponse, ErrorResponse>) UpdateDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates certain properties of a data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateDataFrameAnalyticsResponse updateDataFrameAnalytics(
			Function<UpdateDataFrameAnalyticsRequest.Builder, ObjectBuilder<UpdateDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateDataFrameAnalytics(fn.apply(new UpdateDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_datafeed

	/**
	 * Updates certain properties of a datafeed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateDatafeedResponse updateDatafeed(UpdateDatafeedRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateDatafeedRequest, UpdateDatafeedResponse, ErrorResponse> endpoint = (Endpoint<UpdateDatafeedRequest, UpdateDatafeedResponse, ErrorResponse>) UpdateDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates certain properties of a datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateDatafeedResponse updateDatafeed(
			Function<UpdateDatafeedRequest.Builder, ObjectBuilder<UpdateDatafeedRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateDatafeed(fn.apply(new UpdateDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_filter

	/**
	 * Updates the description of a filter, adds items, or removes items.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateFilterResponse updateFilter(UpdateFilterRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateFilterRequest, UpdateFilterResponse, ErrorResponse> endpoint = (Endpoint<UpdateFilterRequest, UpdateFilterResponse, ErrorResponse>) UpdateFilterRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the description of a filter, adds items, or removes items.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateFilterRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateFilterResponse updateFilter(
			Function<UpdateFilterRequest.Builder, ObjectBuilder<UpdateFilterRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateFilter(fn.apply(new UpdateFilterRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_job

	/**
	 * Updates certain properties of an anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateJobResponse updateJob(UpdateJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateJobRequest, UpdateJobResponse, ErrorResponse> endpoint = (Endpoint<UpdateJobRequest, UpdateJobResponse, ErrorResponse>) UpdateJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates certain properties of an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateJobResponse updateJob(Function<UpdateJobRequest.Builder, ObjectBuilder<UpdateJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateJob(fn.apply(new UpdateJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_model_snapshot

	/**
	 * Updates certain properties of a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateModelSnapshotResponse updateModelSnapshot(UpdateModelSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateModelSnapshotRequest, UpdateModelSnapshotResponse, ErrorResponse> endpoint = (Endpoint<UpdateModelSnapshotRequest, UpdateModelSnapshotResponse, ErrorResponse>) UpdateModelSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates certain properties of a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateModelSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateModelSnapshotResponse updateModelSnapshot(
			Function<UpdateModelSnapshotRequest.Builder, ObjectBuilder<UpdateModelSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateModelSnapshot(fn.apply(new UpdateModelSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.upgrade_job_snapshot

	/**
	 * Upgrades a given job snapshot to the current major version.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-upgrade-job-model-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpgradeJobSnapshotResponse upgradeJobSnapshot(UpgradeJobSnapshotRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpgradeJobSnapshotRequest, UpgradeJobSnapshotResponse, ErrorResponse> endpoint = (Endpoint<UpgradeJobSnapshotRequest, UpgradeJobSnapshotResponse, ErrorResponse>) UpgradeJobSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Upgrades a given job snapshot to the current major version.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpgradeJobSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-upgrade-job-model-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpgradeJobSnapshotResponse upgradeJobSnapshot(
			Function<UpgradeJobSnapshotRequest.Builder, ObjectBuilder<UpgradeJobSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return upgradeJobSnapshot(fn.apply(new UpgradeJobSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: ml.validate

	/**
	 * Validates an anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateResponse validate(ValidateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ValidateRequest, ValidateResponse, ErrorResponse> endpoint = (Endpoint<ValidateRequest, ValidateResponse, ErrorResponse>) ValidateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Validates an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ValidateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ValidateResponse validate(Function<ValidateRequest.Builder, ObjectBuilder<ValidateRequest>> fn)
			throws IOException, ElasticsearchException {
		return validate(fn.apply(new ValidateRequest.Builder()).build());
	}

	/**
	 * Validates an anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateResponse validate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ValidateRequest.Builder().build(), ValidateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.validate_detector

	/**
	 * Validates an anomaly detection detector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateDetectorResponse validateDetector(ValidateDetectorRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ValidateDetectorRequest, ValidateDetectorResponse, ErrorResponse> endpoint = (Endpoint<ValidateDetectorRequest, ValidateDetectorResponse, ErrorResponse>) ValidateDetectorRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Validates an anomaly detection detector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ValidateDetectorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ValidateDetectorResponse validateDetector(
			Function<ValidateDetectorRequest.Builder, ObjectBuilder<ValidateDetectorRequest>> fn)
			throws IOException, ElasticsearchException {
		return validateDetector(fn.apply(new ValidateDetectorRequest.Builder()).build());
	}

	/**
	 * Validates an anomaly detection detector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateDetectorResponse validateDetector() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ValidateDetectorRequest.Builder().build(),
				ValidateDetectorRequest._ENDPOINT, this.transportOptions);
	}

}
