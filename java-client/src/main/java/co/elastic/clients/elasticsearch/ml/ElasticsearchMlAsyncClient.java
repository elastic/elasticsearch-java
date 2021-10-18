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

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the ml namespace.
 */
public class ElasticsearchMlAsyncClient extends ApiClient {

	public ElasticsearchMlAsyncClient(Transport transport) {
		super(transport);
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

	public CompletableFuture<CloseJobResponse> closeJob(CloseJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CloseJobRequest.ENDPOINT);
	}

	/**
	 * Closes one or more anomaly detection jobs. A job can be opened and closed
	 * multiple times throughout its lifecycle.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-close-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloseJobResponse> closeJob(
			Function<CloseJobRequest.Builder, ObjectBuilder<CloseJobRequest>> fn) throws IOException {
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

	public CompletableFuture<DeleteCalendarResponse> deleteCalendar(DeleteCalendarRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteCalendarRequest.ENDPOINT);
	}

	/**
	 * Deletes a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteCalendarResponse> deleteCalendar(
			Function<DeleteCalendarRequest.Builder, ObjectBuilder<DeleteCalendarRequest>> fn) throws IOException {
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

	public CompletableFuture<DeleteCalendarEventResponse> deleteCalendarEvent(DeleteCalendarEventRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteCalendarEventRequest.ENDPOINT);
	}

	/**
	 * Deletes scheduled events from a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteCalendarEventResponse> deleteCalendarEvent(
			Function<DeleteCalendarEventRequest.Builder, ObjectBuilder<DeleteCalendarEventRequest>> fn)
			throws IOException {
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

	public CompletableFuture<DeleteCalendarJobResponse> deleteCalendarJob(DeleteCalendarJobRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteCalendarJobRequest.ENDPOINT);
	}

	/**
	 * Deletes anomaly detection jobs from a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteCalendarJobResponse> deleteCalendarJob(
			Function<DeleteCalendarJobRequest.Builder, ObjectBuilder<DeleteCalendarJobRequest>> fn) throws IOException {
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

	public CompletableFuture<DeleteDataFrameAnalyticsResponse> deleteDataFrameAnalytics(
			DeleteDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Deletes an existing data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDataFrameAnalyticsResponse> deleteDataFrameAnalytics(
			Function<DeleteDataFrameAnalyticsRequest.Builder, ObjectBuilder<DeleteDataFrameAnalyticsRequest>> fn)
			throws IOException {
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

	public CompletableFuture<DeleteDatafeedResponse> deleteDatafeed(DeleteDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteDatafeedRequest.ENDPOINT);
	}

	/**
	 * Deletes an existing datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDatafeedResponse> deleteDatafeed(
			Function<DeleteDatafeedRequest.Builder, ObjectBuilder<DeleteDatafeedRequest>> fn) throws IOException {
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

	public CompletableFuture<DeleteFilterResponse> deleteFilter(DeleteFilterRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteFilterRequest.ENDPOINT);
	}

	/**
	 * Deletes a filter.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteFilterResponse> deleteFilter(
			Function<DeleteFilterRequest.Builder, ObjectBuilder<DeleteFilterRequest>> fn) throws IOException {
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

	public CompletableFuture<DeleteForecastResponse> deleteForecast(DeleteForecastRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteForecastRequest.ENDPOINT);
	}

	/**
	 * Deletes forecasts from a machine learning job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-forecast.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteForecastResponse> deleteForecast(
			Function<DeleteForecastRequest.Builder, ObjectBuilder<DeleteForecastRequest>> fn) throws IOException {
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

	public CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteJobRequest.ENDPOINT);
	}

	/**
	 * Deletes an existing anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteJobResponse> deleteJob(
			Function<DeleteJobRequest.Builder, ObjectBuilder<DeleteJobRequest>> fn) throws IOException {
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

	public CompletableFuture<DeleteModelSnapshotResponse> deleteModelSnapshot(DeleteModelSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteModelSnapshotRequest.ENDPOINT);
	}

	/**
	 * Deletes an existing model snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteModelSnapshotResponse> deleteModelSnapshot(
			Function<DeleteModelSnapshotRequest.Builder, ObjectBuilder<DeleteModelSnapshotRequest>> fn)
			throws IOException {
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

	public CompletableFuture<DeleteTrainedModelResponse> deleteTrainedModel(DeleteTrainedModelRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteTrainedModelRequest.ENDPOINT);
	}

	/**
	 * Deletes an existing trained inference model that is currently not referenced
	 * by an ingest pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteTrainedModelResponse> deleteTrainedModel(
			Function<DeleteTrainedModelRequest.Builder, ObjectBuilder<DeleteTrainedModelRequest>> fn)
			throws IOException {
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

	public CompletableFuture<DeleteTrainedModelAliasResponse> deleteTrainedModelAlias(
			DeleteTrainedModelAliasRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteTrainedModelAliasRequest.ENDPOINT);
	}

	/**
	 * Deletes a model alias that refers to the trained model
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteTrainedModelAliasResponse> deleteTrainedModelAlias(
			Function<DeleteTrainedModelAliasRequest.Builder, ObjectBuilder<DeleteTrainedModelAliasRequest>> fn)
			throws IOException {
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

	public CompletableFuture<EstimateModelMemoryResponse> estimateModelMemory(EstimateModelMemoryRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, EstimateModelMemoryRequest.ENDPOINT);
	}

	/**
	 * Estimates the model memory
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<EstimateModelMemoryResponse> estimateModelMemory(
			Function<EstimateModelMemoryRequest.Builder, ObjectBuilder<EstimateModelMemoryRequest>> fn)
			throws IOException {
		return estimateModelMemory(fn.apply(new EstimateModelMemoryRequest.Builder()).build());
	}

	/**
	 * Estimates the model memory
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EstimateModelMemoryResponse> estimateModelMemory() throws IOException {
		return this.transport.performRequestAsync(new EstimateModelMemoryRequest.Builder().build(),
				EstimateModelMemoryRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.evaluate_data_frame

	/**
	 * Evaluates the data frame analytics for an annotated index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/evaluate-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EvaluateDataFrameResponse> evaluateDataFrame(EvaluateDataFrameRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, EvaluateDataFrameRequest.ENDPOINT);
	}

	/**
	 * Evaluates the data frame analytics for an annotated index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/evaluate-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<EvaluateDataFrameResponse> evaluateDataFrame(
			Function<EvaluateDataFrameRequest.Builder, ObjectBuilder<EvaluateDataFrameRequest>> fn) throws IOException {
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

	public CompletableFuture<ExplainDataFrameAnalyticsResponse> explainDataFrameAnalytics(
			ExplainDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExplainDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Explains a data frame analytics config.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/explain-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExplainDataFrameAnalyticsResponse> explainDataFrameAnalytics(
			Function<ExplainDataFrameAnalyticsRequest.Builder, ObjectBuilder<ExplainDataFrameAnalyticsRequest>> fn)
			throws IOException {
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

	public CompletableFuture<FlushJobResponse> flushJob(FlushJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FlushJobRequest.ENDPOINT);
	}

	/**
	 * Forces any buffered data to be processed by the job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-flush-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FlushJobResponse> flushJob(
			Function<FlushJobRequest.Builder, ObjectBuilder<FlushJobRequest>> fn) throws IOException {
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

	public CompletableFuture<ForecastResponse> forecast(ForecastRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ForecastRequest.ENDPOINT);
	}

	/**
	 * Predicts the future behavior of a time series by using its historical
	 * behavior.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-forecast.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ForecastResponse> forecast(
			Function<ForecastRequest.Builder, ObjectBuilder<ForecastRequest>> fn) throws IOException {
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

	public CompletableFuture<GetBucketsResponse> getBuckets(GetBucketsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetBucketsRequest.ENDPOINT);
	}

	/**
	 * Retrieves anomaly detection job results for one or more buckets.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-bucket.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetBucketsResponse> getBuckets(
			Function<GetBucketsRequest.Builder, ObjectBuilder<GetBucketsRequest>> fn) throws IOException {
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

	public CompletableFuture<GetCalendarEventsResponse> getCalendarEvents(GetCalendarEventsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetCalendarEventsRequest.ENDPOINT);
	}

	/**
	 * Retrieves information about the scheduled events in calendars.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetCalendarEventsResponse> getCalendarEvents(
			Function<GetCalendarEventsRequest.Builder, ObjectBuilder<GetCalendarEventsRequest>> fn) throws IOException {
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

	public CompletableFuture<GetCalendarsResponse> getCalendars(GetCalendarsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetCalendarsRequest.ENDPOINT);
	}

	/**
	 * Retrieves configuration information for calendars.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetCalendarsResponse> getCalendars(
			Function<GetCalendarsRequest.Builder, ObjectBuilder<GetCalendarsRequest>> fn) throws IOException {
		return getCalendars(fn.apply(new GetCalendarsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for calendars.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetCalendarsResponse> getCalendars() throws IOException {
		return this.transport.performRequestAsync(new GetCalendarsRequest.Builder().build(),
				GetCalendarsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_categories

	/**
	 * Retrieves anomaly detection job results for one or more categories.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-category.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetCategoriesRequest.ENDPOINT);
	}

	/**
	 * Retrieves anomaly detection job results for one or more categories.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-category.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetCategoriesResponse> getCategories(
			Function<GetCategoriesRequest.Builder, ObjectBuilder<GetCategoriesRequest>> fn) throws IOException {
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

	public CompletableFuture<GetDataFrameAnalyticsResponse> getDataFrameAnalytics(GetDataFrameAnalyticsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Retrieves configuration information for data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDataFrameAnalyticsResponse> getDataFrameAnalytics(
			Function<GetDataFrameAnalyticsRequest.Builder, ObjectBuilder<GetDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return getDataFrameAnalytics(fn.apply(new GetDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataFrameAnalyticsResponse> getDataFrameAnalytics() throws IOException {
		return this.transport.performRequestAsync(new GetDataFrameAnalyticsRequest.Builder().build(),
				GetDataFrameAnalyticsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_data_frame_analytics_stats

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataFrameAnalyticsStatsResponse> getDataFrameAnalyticsStats(
			GetDataFrameAnalyticsStatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetDataFrameAnalyticsStatsRequest.ENDPOINT);
	}

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDataFrameAnalyticsStatsResponse> getDataFrameAnalyticsStats(
			Function<GetDataFrameAnalyticsStatsRequest.Builder, ObjectBuilder<GetDataFrameAnalyticsStatsRequest>> fn)
			throws IOException {
		return getDataFrameAnalyticsStats(fn.apply(new GetDataFrameAnalyticsStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataFrameAnalyticsStatsResponse> getDataFrameAnalyticsStats() throws IOException {
		return this.transport.performRequestAsync(new GetDataFrameAnalyticsStatsRequest.Builder().build(),
				GetDataFrameAnalyticsStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_datafeed_stats

	/**
	 * Retrieves usage information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDatafeedStatsResponse> getDatafeedStats(GetDatafeedStatsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetDatafeedStatsRequest.ENDPOINT);
	}

	/**
	 * Retrieves usage information for datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDatafeedStatsResponse> getDatafeedStats(
			Function<GetDatafeedStatsRequest.Builder, ObjectBuilder<GetDatafeedStatsRequest>> fn) throws IOException {
		return getDatafeedStats(fn.apply(new GetDatafeedStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDatafeedStatsResponse> getDatafeedStats() throws IOException {
		return this.transport.performRequestAsync(new GetDatafeedStatsRequest.Builder().build(),
				GetDatafeedStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_datafeeds

	/**
	 * Retrieves configuration information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDatafeedsResponse> getDatafeeds(GetDatafeedsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetDatafeedsRequest.ENDPOINT);
	}

	/**
	 * Retrieves configuration information for datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDatafeedsResponse> getDatafeeds(
			Function<GetDatafeedsRequest.Builder, ObjectBuilder<GetDatafeedsRequest>> fn) throws IOException {
		return getDatafeeds(fn.apply(new GetDatafeedsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDatafeedsResponse> getDatafeeds() throws IOException {
		return this.transport.performRequestAsync(new GetDatafeedsRequest.Builder().build(),
				GetDatafeedsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_filters

	/**
	 * Retrieves filters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetFiltersResponse> getFilters(GetFiltersRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetFiltersRequest.ENDPOINT);
	}

	/**
	 * Retrieves filters.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetFiltersResponse> getFilters(
			Function<GetFiltersRequest.Builder, ObjectBuilder<GetFiltersRequest>> fn) throws IOException {
		return getFilters(fn.apply(new GetFiltersRequest.Builder()).build());
	}

	/**
	 * Retrieves filters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetFiltersResponse> getFilters() throws IOException {
		return this.transport.performRequestAsync(new GetFiltersRequest.Builder().build(), GetFiltersRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_influencers

	/**
	 * Retrieves anomaly detection job results for one or more influencers.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-influencer.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetInfluencersResponse> getInfluencers(GetInfluencersRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetInfluencersRequest.ENDPOINT);
	}

	/**
	 * Retrieves anomaly detection job results for one or more influencers.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-influencer.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetInfluencersResponse> getInfluencers(
			Function<GetInfluencersRequest.Builder, ObjectBuilder<GetInfluencersRequest>> fn) throws IOException {
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

	public CompletableFuture<GetJobStatsResponse> getJobStats(GetJobStatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetJobStatsRequest.ENDPOINT);
	}

	/**
	 * Retrieves usage information for anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetJobStatsResponse> getJobStats(
			Function<GetJobStatsRequest.Builder, ObjectBuilder<GetJobStatsRequest>> fn) throws IOException {
		return getJobStats(fn.apply(new GetJobStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetJobStatsResponse> getJobStats() throws IOException {
		return this.transport.performRequestAsync(new GetJobStatsRequest.Builder().build(),
				GetJobStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_jobs

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetJobsResponse> getJobs(GetJobsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetJobsRequest.ENDPOINT);
	}

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetJobsResponse> getJobs(
			Function<GetJobsRequest.Builder, ObjectBuilder<GetJobsRequest>> fn) throws IOException {
		return getJobs(fn.apply(new GetJobsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetJobsResponse> getJobs() throws IOException {
		return this.transport.performRequestAsync(new GetJobsRequest.Builder().build(), GetJobsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_model_snapshots

	/**
	 * Retrieves information about model snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetModelSnapshotsResponse> getModelSnapshots(GetModelSnapshotsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetModelSnapshotsRequest.ENDPOINT);
	}

	/**
	 * Retrieves information about model snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetModelSnapshotsResponse> getModelSnapshots(
			Function<GetModelSnapshotsRequest.Builder, ObjectBuilder<GetModelSnapshotsRequest>> fn) throws IOException {
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

	public CompletableFuture<GetOverallBucketsResponse> getOverallBuckets(GetOverallBucketsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetOverallBucketsRequest.ENDPOINT);
	}

	/**
	 * Retrieves overall bucket results that summarize the bucket results of
	 * multiple anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-overall-buckets.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetOverallBucketsResponse> getOverallBuckets(
			Function<GetOverallBucketsRequest.Builder, ObjectBuilder<GetOverallBucketsRequest>> fn) throws IOException {
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

	public CompletableFuture<GetRecordsResponse> getRecords(GetRecordsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetRecordsRequest.ENDPOINT);
	}

	/**
	 * Retrieves anomaly records for an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-record.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRecordsResponse> getRecords(
			Function<GetRecordsRequest.Builder, ObjectBuilder<GetRecordsRequest>> fn) throws IOException {
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

	public CompletableFuture<GetTrainedModelsResponse> getTrainedModels(GetTrainedModelsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetTrainedModelsRequest.ENDPOINT);
	}

	/**
	 * Retrieves configuration information for a trained inference model.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTrainedModelsResponse> getTrainedModels(
			Function<GetTrainedModelsRequest.Builder, ObjectBuilder<GetTrainedModelsRequest>> fn) throws IOException {
		return getTrainedModels(fn.apply(new GetTrainedModelsRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for a trained inference model.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTrainedModelsResponse> getTrainedModels() throws IOException {
		return this.transport.performRequestAsync(new GetTrainedModelsRequest.Builder().build(),
				GetTrainedModelsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.get_trained_models_stats

	/**
	 * Retrieves usage information for trained inference models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTrainedModelsStatsResponse> getTrainedModelsStats(GetTrainedModelsStatsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetTrainedModelsStatsRequest.ENDPOINT);
	}

	/**
	 * Retrieves usage information for trained inference models.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTrainedModelsStatsResponse> getTrainedModelsStats(
			Function<GetTrainedModelsStatsRequest.Builder, ObjectBuilder<GetTrainedModelsStatsRequest>> fn)
			throws IOException {
		return getTrainedModelsStats(fn.apply(new GetTrainedModelsStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves usage information for trained inference models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTrainedModelsStatsResponse> getTrainedModelsStats() throws IOException {
		return this.transport.performRequestAsync(new GetTrainedModelsStatsRequest.Builder().build(),
				GetTrainedModelsStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.info

	/**
	 * Returns defaults and limits used by machine learning.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-ml-info.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<MlInfoResponse> info() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(MlInfoRequest._INSTANCE, MlInfoRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.open_job

	/**
	 * Opens one or more anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-open-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<OpenJobResponse> openJob(OpenJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, OpenJobRequest.ENDPOINT);
	}

	/**
	 * Opens one or more anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-open-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<OpenJobResponse> openJob(
			Function<OpenJobRequest.Builder, ObjectBuilder<OpenJobRequest>> fn) throws IOException {
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

	public CompletableFuture<PostCalendarEventsResponse> postCalendarEvents(PostCalendarEventsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PostCalendarEventsRequest.ENDPOINT);
	}

	/**
	 * Posts scheduled events in a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostCalendarEventsResponse> postCalendarEvents(
			Function<PostCalendarEventsRequest.Builder, ObjectBuilder<PostCalendarEventsRequest>> fn)
			throws IOException {
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

	public <TData> CompletableFuture<PostDataResponse> postData(PostDataRequest<TData> request) throws IOException {
		return this.transport.performRequestAsync(request, PostDataRequest.ENDPOINT);
	}

	/**
	 * Sends data to an anomaly detection job for analysis.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-data.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TData> CompletableFuture<PostDataResponse> postData(
			Function<PostDataRequest.Builder<TData>, ObjectBuilder<PostDataRequest<TData>>> fn) throws IOException {
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

	public CompletableFuture<PreviewDataFrameAnalyticsResponse> previewDataFrameAnalytics(
			PreviewDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PreviewDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Previews that will be analyzed given a data frame analytics config.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PreviewDataFrameAnalyticsResponse> previewDataFrameAnalytics(
			Function<PreviewDataFrameAnalyticsRequest.Builder, ObjectBuilder<PreviewDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return previewDataFrameAnalytics(fn.apply(new PreviewDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Previews that will be analyzed given a data frame analytics config.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PreviewDataFrameAnalyticsResponse> previewDataFrameAnalytics() throws IOException {
		return this.transport.performRequestAsync(new PreviewDataFrameAnalyticsRequest.Builder().build(),
				PreviewDataFrameAnalyticsRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.preview_datafeed

	/**
	 * Previews a datafeed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<PreviewDatafeedResponse<TDocument>> previewDatafeed(
			PreviewDatafeedRequest request, Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				PreviewDatafeedRequest.createPreviewDatafeedEndpoint(getDeserializer(tDocumentClass)));
	}

	/**
	 * Previews a datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<PreviewDatafeedResponse<TDocument>> previewDatafeed(
			Function<PreviewDatafeedRequest.Builder, ObjectBuilder<PreviewDatafeedRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException {
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

	public CompletableFuture<PutCalendarResponse> putCalendar(PutCalendarRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutCalendarRequest.ENDPOINT);
	}

	/**
	 * Instantiates a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutCalendarResponse> putCalendar(
			Function<PutCalendarRequest.Builder, ObjectBuilder<PutCalendarRequest>> fn) throws IOException {
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

	public CompletableFuture<PutCalendarJobResponse> putCalendarJob(PutCalendarJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutCalendarJobRequest.ENDPOINT);
	}

	/**
	 * Adds an anomaly detection job to a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutCalendarJobResponse> putCalendarJob(
			Function<PutCalendarJobRequest.Builder, ObjectBuilder<PutCalendarJobRequest>> fn) throws IOException {
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

	public CompletableFuture<PutDataFrameAnalyticsResponse> putDataFrameAnalytics(PutDataFrameAnalyticsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Instantiates a data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutDataFrameAnalyticsResponse> putDataFrameAnalytics(
			Function<PutDataFrameAnalyticsRequest.Builder, ObjectBuilder<PutDataFrameAnalyticsRequest>> fn)
			throws IOException {
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

	public CompletableFuture<PutDatafeedResponse> putDatafeed(PutDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutDatafeedRequest.ENDPOINT);
	}

	/**
	 * Instantiates a datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutDatafeedResponse> putDatafeed(
			Function<PutDatafeedRequest.Builder, ObjectBuilder<PutDatafeedRequest>> fn) throws IOException {
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

	public CompletableFuture<PutFilterResponse> putFilter(PutFilterRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutFilterRequest.ENDPOINT);
	}

	/**
	 * Instantiates a filter.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutFilterResponse> putFilter(
			Function<PutFilterRequest.Builder, ObjectBuilder<PutFilterRequest>> fn) throws IOException {
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

	public CompletableFuture<PutJobResponse> putJob(PutJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutJobRequest.ENDPOINT);
	}

	/**
	 * Instantiates an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutJobResponse> putJob(
			Function<PutJobRequest.Builder, ObjectBuilder<PutJobRequest>> fn) throws IOException {
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

	public CompletableFuture<PutTrainedModelResponse> putTrainedModel(PutTrainedModelRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutTrainedModelRequest.ENDPOINT);
	}

	/**
	 * Creates an inference trained model.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutTrainedModelResponse> putTrainedModel(
			Function<PutTrainedModelRequest.Builder, ObjectBuilder<PutTrainedModelRequest>> fn) throws IOException {
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

	public CompletableFuture<PutTrainedModelAliasResponse> putTrainedModelAlias(PutTrainedModelAliasRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutTrainedModelAliasRequest.ENDPOINT);
	}

	/**
	 * Creates a new model alias (or reassigns an existing one) to refer to the
	 * trained model
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutTrainedModelAliasResponse> putTrainedModelAlias(
			Function<PutTrainedModelAliasRequest.Builder, ObjectBuilder<PutTrainedModelAliasRequest>> fn)
			throws IOException {
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

	public CompletableFuture<ResetJobResponse> resetJob(ResetJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ResetJobRequest.ENDPOINT);
	}

	/**
	 * Resets an existing anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-reset-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResetJobResponse> resetJob(
			Function<ResetJobRequest.Builder, ObjectBuilder<ResetJobRequest>> fn) throws IOException {
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

	public CompletableFuture<RevertModelSnapshotResponse> revertModelSnapshot(RevertModelSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, RevertModelSnapshotRequest.ENDPOINT);
	}

	/**
	 * Reverts to a specific snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-revert-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RevertModelSnapshotResponse> revertModelSnapshot(
			Function<RevertModelSnapshotRequest.Builder, ObjectBuilder<RevertModelSnapshotRequest>> fn)
			throws IOException {
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

	public CompletableFuture<SetUpgradeModeResponse> setUpgradeMode(SetUpgradeModeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SetUpgradeModeRequest.ENDPOINT);
	}

	/**
	 * Sets a cluster wide upgrade_mode setting that prepares machine learning
	 * indices for an upgrade.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-set-upgrade-mode.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SetUpgradeModeResponse> setUpgradeMode(
			Function<SetUpgradeModeRequest.Builder, ObjectBuilder<SetUpgradeModeRequest>> fn) throws IOException {
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

	public CompletableFuture<SetUpgradeModeResponse> setUpgradeMode() throws IOException {
		return this.transport.performRequestAsync(new SetUpgradeModeRequest.Builder().build(),
				SetUpgradeModeRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.start_data_frame_analytics

	/**
	 * Starts a data frame analytics job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartDataFrameAnalyticsResponse> startDataFrameAnalytics(
			StartDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StartDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Starts a data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartDataFrameAnalyticsResponse> startDataFrameAnalytics(
			Function<StartDataFrameAnalyticsRequest.Builder, ObjectBuilder<StartDataFrameAnalyticsRequest>> fn)
			throws IOException {
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

	public CompletableFuture<StartDatafeedResponse> startDatafeed(StartDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StartDatafeedRequest.ENDPOINT);
	}

	/**
	 * Starts one or more datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-start-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartDatafeedResponse> startDatafeed(
			Function<StartDatafeedRequest.Builder, ObjectBuilder<StartDatafeedRequest>> fn) throws IOException {
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

	public CompletableFuture<StopDataFrameAnalyticsResponse> stopDataFrameAnalytics(
			StopDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StopDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Stops one or more data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopDataFrameAnalyticsResponse> stopDataFrameAnalytics(
			Function<StopDataFrameAnalyticsRequest.Builder, ObjectBuilder<StopDataFrameAnalyticsRequest>> fn)
			throws IOException {
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

	public CompletableFuture<StopDatafeedResponse> stopDatafeed(StopDatafeedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StopDatafeedRequest.ENDPOINT);
	}

	/**
	 * Stops one or more datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-stop-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopDatafeedResponse> stopDatafeed(
			Function<StopDatafeedRequest.Builder, ObjectBuilder<StopDatafeedRequest>> fn) throws IOException {
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

	public CompletableFuture<UpdateDataFrameAnalyticsResponse> updateDataFrameAnalytics(
			UpdateDataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateDataFrameAnalyticsRequest.ENDPOINT);
	}

	/**
	 * Updates certain properties of a data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateDataFrameAnalyticsResponse> updateDataFrameAnalytics(
			Function<UpdateDataFrameAnalyticsRequest.Builder, ObjectBuilder<UpdateDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return updateDataFrameAnalytics(fn.apply(new UpdateDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_filter

	/**
	 * Updates the description of a filter, adds items, or removes items.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateFilterResponse> updateFilter(UpdateFilterRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateFilterRequest.ENDPOINT);
	}

	/**
	 * Updates the description of a filter, adds items, or removes items.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateFilterResponse> updateFilter(
			Function<UpdateFilterRequest.Builder, ObjectBuilder<UpdateFilterRequest>> fn) throws IOException {
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

	public CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateJobRequest.ENDPOINT);
	}

	/**
	 * Updates certain properties of an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateJobResponse> updateJob(
			Function<UpdateJobRequest.Builder, ObjectBuilder<UpdateJobRequest>> fn) throws IOException {
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

	public CompletableFuture<UpdateModelSnapshotResponse> updateModelSnapshot(UpdateModelSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, UpdateModelSnapshotRequest.ENDPOINT);
	}

	/**
	 * Updates certain properties of a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateModelSnapshotResponse> updateModelSnapshot(
			Function<UpdateModelSnapshotRequest.Builder, ObjectBuilder<UpdateModelSnapshotRequest>> fn)
			throws IOException {
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

	public CompletableFuture<UpgradeJobSnapshotResponse> upgradeJobSnapshot(UpgradeJobSnapshotRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, UpgradeJobSnapshotRequest.ENDPOINT);
	}

	/**
	 * Upgrades a given job snapshot to the current major version.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-upgrade-job-model-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpgradeJobSnapshotResponse> upgradeJobSnapshot(
			Function<UpgradeJobSnapshotRequest.Builder, ObjectBuilder<UpgradeJobSnapshotRequest>> fn)
			throws IOException {
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

	public CompletableFuture<ValidateResponse> validate(ValidateRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ValidateRequest.ENDPOINT);
	}

	/**
	 * Validates an anomaly detection job.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ValidateResponse> validate(
			Function<ValidateRequest.Builder, ObjectBuilder<ValidateRequest>> fn) throws IOException {
		return validate(fn.apply(new ValidateRequest.Builder()).build());
	}

	/**
	 * Validates an anomaly detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ValidateResponse> validate() throws IOException {
		return this.transport.performRequestAsync(new ValidateRequest.Builder().build(), ValidateRequest.ENDPOINT);
	}

	// ----- Endpoint: ml.validate_detector

	/**
	 * Validates an anomaly detection detector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ValidateDetectorResponse> validateDetector(ValidateDetectorRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ValidateDetectorRequest.ENDPOINT);
	}

	/**
	 * Validates an anomaly detection detector.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ValidateDetectorResponse> validateDetector(
			Function<ValidateDetectorRequest.Builder, ObjectBuilder<ValidateDetectorRequest>> fn) throws IOException {
		return validateDetector(fn.apply(new ValidateDetectorRequest.Builder()).build());
	}

	/**
	 * Validates an anomaly detection detector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/machine-learning/current/ml-jobs.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ValidateDetectorResponse> validateDetector() throws IOException {
		return this.transport.performRequestAsync(new ValidateDetectorRequest.Builder().build(),
				ValidateDetectorRequest.ENDPOINT);
	}

}
