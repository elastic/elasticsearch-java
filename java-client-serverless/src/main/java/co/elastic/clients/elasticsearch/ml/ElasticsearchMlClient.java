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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Client for the ml namespace.
 */
public class ElasticsearchMlClient extends ApiClient<ElasticsearchTransport, ElasticsearchMlClient> {

	public ElasticsearchMlClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchMlClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchMlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchMlClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ml.close_job

	/**
	 * Close anomaly detection jobs. A job can be opened and closed multiple times
	 * throughout its lifecycle. A closed job cannot receive data or perform
	 * analysis operations, but you can still explore and navigate results. When you
	 * close a job, it runs housekeeping tasks such as pruning the model history,
	 * flushing buffers, calculating final results and persisting the model
	 * snapshots. Depending upon the size of the job, it could take several minutes
	 * to close and the equivalent time to re-open. After it is closed, the job has
	 * a minimal overhead on the cluster except for maintaining its meta data.
	 * Therefore it is a best practice to close jobs that are no longer required to
	 * process data. If you close an anomaly detection job whose datafeed is
	 * running, the request first tries to stop the datafeed. This behavior is
	 * equivalent to calling stop datafeed API with the same timeout and force
	 * parameters as the close job request. When a datafeed that has a specified end
	 * date stops, it automatically closes its associated job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-close-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CloseJobResponse closeJob(CloseJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloseJobRequest, CloseJobResponse, ErrorResponse> endpoint = (JsonEndpoint<CloseJobRequest, CloseJobResponse, ErrorResponse>) CloseJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Close anomaly detection jobs. A job can be opened and closed multiple times
	 * throughout its lifecycle. A closed job cannot receive data or perform
	 * analysis operations, but you can still explore and navigate results. When you
	 * close a job, it runs housekeeping tasks such as pruning the model history,
	 * flushing buffers, calculating final results and persisting the model
	 * snapshots. Depending upon the size of the job, it could take several minutes
	 * to close and the equivalent time to re-open. After it is closed, the job has
	 * a minimal overhead on the cluster except for maintaining its meta data.
	 * Therefore it is a best practice to close jobs that are no longer required to
	 * process data. If you close an anomaly detection job whose datafeed is
	 * running, the request first tries to stop the datafeed. This behavior is
	 * equivalent to calling stop datafeed API with the same timeout and force
	 * parameters as the close job request. When a datafeed that has a specified end
	 * date stops, it automatically closes its associated job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloseJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-close-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CloseJobResponse closeJob(Function<CloseJobRequest.Builder, ObjectBuilder<CloseJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return closeJob(fn.apply(new CloseJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar

	/**
	 * Delete a calendar. Removes all scheduled events from a calendar, then deletes
	 * it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteCalendarResponse deleteCalendar(DeleteCalendarRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteCalendarRequest, DeleteCalendarResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteCalendarRequest, DeleteCalendarResponse, ErrorResponse>) DeleteCalendarRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a calendar. Removes all scheduled events from a calendar, then deletes
	 * it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteCalendarRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteCalendarResponse deleteCalendar(
			Function<DeleteCalendarRequest.Builder, ObjectBuilder<DeleteCalendarRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteCalendar(fn.apply(new DeleteCalendarRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar_event

	/**
	 * Delete events from a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteCalendarEventResponse deleteCalendarEvent(DeleteCalendarEventRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteCalendarEventRequest, DeleteCalendarEventResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteCalendarEventRequest, DeleteCalendarEventResponse, ErrorResponse>) DeleteCalendarEventRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete events from a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteCalendarEventRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteCalendarEventResponse deleteCalendarEvent(
			Function<DeleteCalendarEventRequest.Builder, ObjectBuilder<DeleteCalendarEventRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteCalendarEvent(fn.apply(new DeleteCalendarEventRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_calendar_job

	/**
	 * Delete anomaly jobs from a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteCalendarJobResponse deleteCalendarJob(DeleteCalendarJobRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteCalendarJobRequest, DeleteCalendarJobResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteCalendarJobRequest, DeleteCalendarJobResponse, ErrorResponse>) DeleteCalendarJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete anomaly jobs from a calendar.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteCalendarJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteCalendarJobResponse deleteCalendarJob(
			Function<DeleteCalendarJobRequest.Builder, ObjectBuilder<DeleteCalendarJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteCalendarJob(fn.apply(new DeleteCalendarJobRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_data_frame_analytics

	/**
	 * Delete a data frame analytics job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/delete-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDataFrameAnalyticsResponse deleteDataFrameAnalytics(DeleteDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDataFrameAnalyticsRequest, DeleteDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDataFrameAnalyticsRequest, DeleteDataFrameAnalyticsResponse, ErrorResponse>) DeleteDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a data frame analytics job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/delete-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDataFrameAnalyticsResponse deleteDataFrameAnalytics(
			Function<DeleteDataFrameAnalyticsRequest.Builder, ObjectBuilder<DeleteDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDataFrameAnalytics(fn.apply(new DeleteDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_datafeed

	/**
	 * Delete a datafeed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDatafeedResponse deleteDatafeed(DeleteDatafeedRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDatafeedRequest, DeleteDatafeedResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDatafeedRequest, DeleteDatafeedResponse, ErrorResponse>) DeleteDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a datafeed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/ml-delete-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDatafeedResponse deleteDatafeed(
			Function<DeleteDatafeedRequest.Builder, ObjectBuilder<DeleteDatafeedRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDatafeed(fn.apply(new DeleteDatafeedRequest.Builder()).build());
	}

	// ----- Endpoint: ml.delete_filter

	/**
	 * Delete a filter. If an anomaly detection job references the filter, you
	 * cannot delete the filter. You must update or delete the job before you can
	 * delete the filter.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteFilterResponse deleteFilter(DeleteFilterRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteFilterRequest, DeleteFilterResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteFilterRequest, DeleteFilterResponse, ErrorResponse>) DeleteFilterRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a filter. If an anomaly detection job references the filter, you
	 * cannot delete the filter. You must update or delete the job before you can
	 * delete the filter.
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

	// ----- Endpoint: ml.delete_job

	/**
	 * Delete an anomaly detection job. All job configuration, model state and
	 * results are deleted. It is not currently possible to delete multiple jobs
	 * using wildcards or a comma separated list. If you delete a job that has a
	 * datafeed, the request first tries to delete the datafeed. This behavior is
	 * equivalent to calling the delete datafeed API with the same timeout and force
	 * parameters as the delete job request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-delete-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteJobResponse deleteJob(DeleteJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse>) DeleteJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an anomaly detection job. All job configuration, model state and
	 * results are deleted. It is not currently possible to delete multiple jobs
	 * using wildcards or a comma separated list. If you delete a job that has a
	 * datafeed, the request first tries to delete the datafeed. This behavior is
	 * equivalent to calling the delete datafeed API with the same timeout and force
	 * parameters as the delete job request.
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

	// ----- Endpoint: ml.delete_trained_model

	/**
	 * Delete an unreferenced trained model. The request deletes a trained inference
	 * model that is not referenced by an ingest pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTrainedModelResponse deleteTrainedModel(DeleteTrainedModelRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteTrainedModelRequest, DeleteTrainedModelResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteTrainedModelRequest, DeleteTrainedModelResponse, ErrorResponse>) DeleteTrainedModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an unreferenced trained model. The request deletes a trained inference
	 * model that is not referenced by an ingest pipeline.
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
	 * Delete a trained model alias. This API deletes an existing model alias that
	 * refers to a trained model. If the model alias is missing or refers to a model
	 * other than the one identified by the <code>model_id</code>, this API returns
	 * an error.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTrainedModelAliasResponse deleteTrainedModelAlias(DeleteTrainedModelAliasRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteTrainedModelAliasRequest, DeleteTrainedModelAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteTrainedModelAliasRequest, DeleteTrainedModelAliasResponse, ErrorResponse>) DeleteTrainedModelAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a trained model alias. This API deletes an existing model alias that
	 * refers to a trained model. If the model alias is missing or refers to a model
	 * other than the one identified by the <code>model_id</code>, this API returns
	 * an error.
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
	 * Estimate job model memory usage. Makes an estimation of the memory usage for
	 * an anomaly detection job model. It is based on analysis configuration details
	 * for the job and cardinality estimates for the fields it references.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public EstimateModelMemoryResponse estimateModelMemory(EstimateModelMemoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EstimateModelMemoryRequest, EstimateModelMemoryResponse, ErrorResponse> endpoint = (JsonEndpoint<EstimateModelMemoryRequest, EstimateModelMemoryResponse, ErrorResponse>) EstimateModelMemoryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Estimate job model memory usage. Makes an estimation of the memory usage for
	 * an anomaly detection job model. It is based on analysis configuration details
	 * for the job and cardinality estimates for the fields it references.
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
	 * Estimate job model memory usage. Makes an estimation of the memory usage for
	 * an anomaly detection job model. It is based on analysis configuration details
	 * for the job and cardinality estimates for the fields it references.
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
	 * Evaluate data frame analytics. The API packages together commonly used
	 * evaluation metrics for various types of machine learning features. This has
	 * been designed for use on indexes created by data frame analytics. Evaluation
	 * requires both a ground truth field and an analytics result field to be
	 * present.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/evaluate-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public EvaluateDataFrameResponse evaluateDataFrame(EvaluateDataFrameRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EvaluateDataFrameRequest, EvaluateDataFrameResponse, ErrorResponse> endpoint = (JsonEndpoint<EvaluateDataFrameRequest, EvaluateDataFrameResponse, ErrorResponse>) EvaluateDataFrameRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Evaluate data frame analytics. The API packages together commonly used
	 * evaluation metrics for various types of machine learning features. This has
	 * been designed for use on indexes created by data frame analytics. Evaluation
	 * requires both a ground truth field and an analytics result field to be
	 * present.
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

	// ----- Endpoint: ml.flush_job

	/**
	 * Force buffered data to be processed. The flush jobs API is only applicable
	 * when sending data for analysis using the post data API. Depending on the
	 * content of the buffer, then it might additionally calculate new results. Both
	 * flush and close operations are similar, however the flush is more efficient
	 * if you are expecting to send more data for analysis. When flushing, the job
	 * remains open and is available to continue analyzing data. A close operation
	 * additionally prunes and persists the model state to disk and the job must be
	 * opened again before analyzing further data.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-flush-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushJobResponse flushJob(FlushJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FlushJobRequest, FlushJobResponse, ErrorResponse> endpoint = (JsonEndpoint<FlushJobRequest, FlushJobResponse, ErrorResponse>) FlushJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Force buffered data to be processed. The flush jobs API is only applicable
	 * when sending data for analysis using the post data API. Depending on the
	 * content of the buffer, then it might additionally calculate new results. Both
	 * flush and close operations are similar, however the flush is more efficient
	 * if you are expecting to send more data for analysis. When flushing, the job
	 * remains open and is available to continue analyzing data. A close operation
	 * additionally prunes and persists the model state to disk and the job must be
	 * opened again before analyzing further data.
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

	// ----- Endpoint: ml.get_calendar_events

	/**
	 * Get info about events in calendars.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetCalendarEventsResponse getCalendarEvents(GetCalendarEventsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetCalendarEventsRequest, GetCalendarEventsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetCalendarEventsRequest, GetCalendarEventsResponse, ErrorResponse>) GetCalendarEventsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get info about events in calendars.
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
	 * Get calendar configuration info.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetCalendarsResponse getCalendars(GetCalendarsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetCalendarsRequest, GetCalendarsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetCalendarsRequest, GetCalendarsResponse, ErrorResponse>) GetCalendarsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get calendar configuration info.
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
	 * Get calendar configuration info.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetCalendarsResponse getCalendars() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetCalendarsRequest.Builder().build(), GetCalendarsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_data_frame_analytics

	/**
	 * Get data frame analytics job configuration info. You can get information for
	 * multiple data frame analytics jobs in a single API request by using a
	 * comma-separated list of data frame analytics jobs or a wildcard expression.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataFrameAnalyticsResponse getDataFrameAnalytics(GetDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDataFrameAnalyticsRequest, GetDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDataFrameAnalyticsRequest, GetDataFrameAnalyticsResponse, ErrorResponse>) GetDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data frame analytics job configuration info. You can get information for
	 * multiple data frame analytics jobs in a single API request by using a
	 * comma-separated list of data frame analytics jobs or a wildcard expression.
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
	 * Get data frame analytics job configuration info. You can get information for
	 * multiple data frame analytics jobs in a single API request by using a
	 * comma-separated list of data frame analytics jobs or a wildcard expression.
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
	 * Get data frame analytics jobs usage info.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-dfanalytics-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataFrameAnalyticsStatsResponse getDataFrameAnalyticsStats(GetDataFrameAnalyticsStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDataFrameAnalyticsStatsRequest, GetDataFrameAnalyticsStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDataFrameAnalyticsStatsRequest, GetDataFrameAnalyticsStatsResponse, ErrorResponse>) GetDataFrameAnalyticsStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data frame analytics jobs usage info.
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
	 * Get data frame analytics jobs usage info.
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
	 * Get datafeeds usage info. You can get statistics for multiple datafeeds in a
	 * single API request by using a comma-separated list of datafeeds or a wildcard
	 * expression. You can get statistics for all datafeeds by using
	 * <code>_all</code>, by specifying <code>*</code> as the
	 * <code>&lt;feed_id&gt;</code>, or by omitting the
	 * <code>&lt;feed_id&gt;</code>. If the datafeed is stopped, the only
	 * information you receive is the <code>datafeed_id</code> and the
	 * <code>state</code>. This API returns a maximum of 10,000 datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDatafeedStatsResponse getDatafeedStats(GetDatafeedStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDatafeedStatsRequest, GetDatafeedStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDatafeedStatsRequest, GetDatafeedStatsResponse, ErrorResponse>) GetDatafeedStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get datafeeds usage info. You can get statistics for multiple datafeeds in a
	 * single API request by using a comma-separated list of datafeeds or a wildcard
	 * expression. You can get statistics for all datafeeds by using
	 * <code>_all</code>, by specifying <code>*</code> as the
	 * <code>&lt;feed_id&gt;</code>, or by omitting the
	 * <code>&lt;feed_id&gt;</code>. If the datafeed is stopped, the only
	 * information you receive is the <code>datafeed_id</code> and the
	 * <code>state</code>. This API returns a maximum of 10,000 datafeeds.
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
	 * Get datafeeds usage info. You can get statistics for multiple datafeeds in a
	 * single API request by using a comma-separated list of datafeeds or a wildcard
	 * expression. You can get statistics for all datafeeds by using
	 * <code>_all</code>, by specifying <code>*</code> as the
	 * <code>&lt;feed_id&gt;</code>, or by omitting the
	 * <code>&lt;feed_id&gt;</code>. If the datafeed is stopped, the only
	 * information you receive is the <code>datafeed_id</code> and the
	 * <code>state</code>. This API returns a maximum of 10,000 datafeeds.
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
	 * Get datafeeds configuration info. You can get information for multiple
	 * datafeeds in a single API request by using a comma-separated list of
	 * datafeeds or a wildcard expression. You can get information for all datafeeds
	 * by using <code>_all</code>, by specifying <code>*</code> as the
	 * <code>&lt;feed_id&gt;</code>, or by omitting the
	 * <code>&lt;feed_id&gt;</code>. This API returns a maximum of 10,000 datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDatafeedsResponse getDatafeeds(GetDatafeedsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDatafeedsRequest, GetDatafeedsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDatafeedsRequest, GetDatafeedsResponse, ErrorResponse>) GetDatafeedsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get datafeeds configuration info. You can get information for multiple
	 * datafeeds in a single API request by using a comma-separated list of
	 * datafeeds or a wildcard expression. You can get information for all datafeeds
	 * by using <code>_all</code>, by specifying <code>*</code> as the
	 * <code>&lt;feed_id&gt;</code>, or by omitting the
	 * <code>&lt;feed_id&gt;</code>. This API returns a maximum of 10,000 datafeeds.
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
	 * Get datafeeds configuration info. You can get information for multiple
	 * datafeeds in a single API request by using a comma-separated list of
	 * datafeeds or a wildcard expression. You can get information for all datafeeds
	 * by using <code>_all</code>, by specifying <code>*</code> as the
	 * <code>&lt;feed_id&gt;</code>, or by omitting the
	 * <code>&lt;feed_id&gt;</code>. This API returns a maximum of 10,000 datafeeds.
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
	 * Get filters. You can get a single filter or all filters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetFiltersResponse getFilters(GetFiltersRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetFiltersRequest, GetFiltersResponse, ErrorResponse> endpoint = (JsonEndpoint<GetFiltersRequest, GetFiltersResponse, ErrorResponse>) GetFiltersRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get filters. You can get a single filter or all filters.
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
	 * Get filters. You can get a single filter or all filters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetFiltersResponse getFilters() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetFiltersRequest.Builder().build(), GetFiltersRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_job_stats

	/**
	 * Get anomaly detection jobs usage info.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobStatsResponse getJobStats(GetJobStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetJobStatsRequest, GetJobStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetJobStatsRequest, GetJobStatsResponse, ErrorResponse>) GetJobStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get anomaly detection jobs usage info.
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
	 * Get anomaly detection jobs usage info.
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
	 * Get anomaly detection jobs configuration info. You can get information for
	 * multiple anomaly detection jobs in a single API request by using a group
	 * name, a comma-separated list of jobs, or a wildcard expression. You can get
	 * information for all anomaly detection jobs by using <code>_all</code>, by
	 * specifying <code>*</code> as the <code>&lt;job_id&gt;</code>, or by omitting
	 * the <code>&lt;job_id&gt;</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs(GetJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetJobsRequest, GetJobsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetJobsRequest, GetJobsResponse, ErrorResponse>) GetJobsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get anomaly detection jobs configuration info. You can get information for
	 * multiple anomaly detection jobs in a single API request by using a group
	 * name, a comma-separated list of jobs, or a wildcard expression. You can get
	 * information for all anomaly detection jobs by using <code>_all</code>, by
	 * specifying <code>*</code> as the <code>&lt;job_id&gt;</code>, or by omitting
	 * the <code>&lt;job_id&gt;</code>.
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
	 * Get anomaly detection jobs configuration info. You can get information for
	 * multiple anomaly detection jobs in a single API request by using a group
	 * name, a comma-separated list of jobs, or a wildcard expression. You can get
	 * information for all anomaly detection jobs by using <code>_all</code>, by
	 * specifying <code>*</code> as the <code>&lt;job_id&gt;</code>, or by omitting
	 * the <code>&lt;job_id&gt;</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetJobsRequest.Builder().build(), GetJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ml.get_overall_buckets

	/**
	 * Get overall bucket results.
	 * <p>
	 * Retrievs overall bucket results that summarize the bucket results of multiple
	 * anomaly detection jobs.
	 * <p>
	 * The <code>overall_score</code> is calculated by combining the scores of all
	 * the buckets within the overall bucket span. First, the maximum
	 * <code>anomaly_score</code> per anomaly detection job in the overall bucket is
	 * calculated. Then the <code>top_n</code> of those scores are averaged to
	 * result in the <code>overall_score</code>. This means that you can fine-tune
	 * the <code>overall_score</code> so that it is more or less sensitive to the
	 * number of jobs that detect an anomaly at the same time. For example, if you
	 * set <code>top_n</code> to <code>1</code>, the <code>overall_score</code> is
	 * the maximum bucket score in the overall bucket. Alternatively, if you set
	 * <code>top_n</code> to the number of jobs, the <code>overall_score</code> is
	 * high only when all jobs detect anomalies in that overall bucket. If you set
	 * the <code>bucket_span</code> parameter (to a value greater than its default),
	 * the <code>overall_score</code> is the maximum <code>overall_score</code> of
	 * the overall buckets that have a span equal to the jobs' largest bucket span.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-get-overall-buckets.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetOverallBucketsResponse getOverallBuckets(GetOverallBucketsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetOverallBucketsRequest, GetOverallBucketsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetOverallBucketsRequest, GetOverallBucketsResponse, ErrorResponse>) GetOverallBucketsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get overall bucket results.
	 * <p>
	 * Retrievs overall bucket results that summarize the bucket results of multiple
	 * anomaly detection jobs.
	 * <p>
	 * The <code>overall_score</code> is calculated by combining the scores of all
	 * the buckets within the overall bucket span. First, the maximum
	 * <code>anomaly_score</code> per anomaly detection job in the overall bucket is
	 * calculated. Then the <code>top_n</code> of those scores are averaged to
	 * result in the <code>overall_score</code>. This means that you can fine-tune
	 * the <code>overall_score</code> so that it is more or less sensitive to the
	 * number of jobs that detect an anomaly at the same time. For example, if you
	 * set <code>top_n</code> to <code>1</code>, the <code>overall_score</code> is
	 * the maximum bucket score in the overall bucket. Alternatively, if you set
	 * <code>top_n</code> to the number of jobs, the <code>overall_score</code> is
	 * high only when all jobs detect anomalies in that overall bucket. If you set
	 * the <code>bucket_span</code> parameter (to a value greater than its default),
	 * the <code>overall_score</code> is the maximum <code>overall_score</code> of
	 * the overall buckets that have a span equal to the jobs' largest bucket span.
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

	// ----- Endpoint: ml.get_trained_models

	/**
	 * Get trained model configuration info.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTrainedModelsResponse getTrainedModels(GetTrainedModelsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTrainedModelsRequest, GetTrainedModelsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTrainedModelsRequest, GetTrainedModelsResponse, ErrorResponse>) GetTrainedModelsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get trained model configuration info.
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
	 * Get trained model configuration info.
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
	 * Get trained models usage info. You can get usage information for multiple
	 * trained models in a single API request by using a comma-separated list of
	 * model IDs or a wildcard expression.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTrainedModelsStatsResponse getTrainedModelsStats(GetTrainedModelsStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTrainedModelsStatsRequest, GetTrainedModelsStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTrainedModelsStatsRequest, GetTrainedModelsStatsResponse, ErrorResponse>) GetTrainedModelsStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get trained models usage info. You can get usage information for multiple
	 * trained models in a single API request by using a comma-separated list of
	 * model IDs or a wildcard expression.
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
	 * Get trained models usage info. You can get usage information for multiple
	 * trained models in a single API request by using a comma-separated list of
	 * model IDs or a wildcard expression.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-trained-models-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTrainedModelsStatsResponse getTrainedModelsStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTrainedModelsStatsRequest.Builder().build(),
				GetTrainedModelsStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ml.infer_trained_model

	/**
	 * Evaluate a trained model.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/infer-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public InferTrainedModelResponse inferTrainedModel(InferTrainedModelRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InferTrainedModelRequest, InferTrainedModelResponse, ErrorResponse> endpoint = (JsonEndpoint<InferTrainedModelRequest, InferTrainedModelResponse, ErrorResponse>) InferTrainedModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Evaluate a trained model.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InferTrainedModelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/infer-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final InferTrainedModelResponse inferTrainedModel(
			Function<InferTrainedModelRequest.Builder, ObjectBuilder<InferTrainedModelRequest>> fn)
			throws IOException, ElasticsearchException {
		return inferTrainedModel(fn.apply(new InferTrainedModelRequest.Builder()).build());
	}

	// ----- Endpoint: ml.open_job

	/**
	 * Open anomaly detection jobs. An anomaly detection job must be opened to be
	 * ready to receive and analyze data. It can be opened and closed multiple times
	 * throughout its lifecycle. When you open a new job, it starts with an empty
	 * model. When you open an existing job, the most recent model state is
	 * automatically loaded. The job is ready to resume its analysis from where it
	 * left off, once new data is received.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-open-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public OpenJobResponse openJob(OpenJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OpenJobRequest, OpenJobResponse, ErrorResponse> endpoint = (JsonEndpoint<OpenJobRequest, OpenJobResponse, ErrorResponse>) OpenJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Open anomaly detection jobs. An anomaly detection job must be opened to be
	 * ready to receive and analyze data. It can be opened and closed multiple times
	 * throughout its lifecycle. When you open a new job, it starts with an empty
	 * model. When you open an existing job, the most recent model state is
	 * automatically loaded. The job is ready to resume its analysis from where it
	 * left off, once new data is received.
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
	 * Add scheduled events to the calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-post-calendar-event.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostCalendarEventsResponse postCalendarEvents(PostCalendarEventsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostCalendarEventsRequest, PostCalendarEventsResponse, ErrorResponse> endpoint = (JsonEndpoint<PostCalendarEventsRequest, PostCalendarEventsResponse, ErrorResponse>) PostCalendarEventsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Add scheduled events to the calendar.
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

	// ----- Endpoint: ml.preview_data_frame_analytics

	/**
	 * Preview features used by data frame analytics. Previews the extracted
	 * features used by a data frame analytics config.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/preview-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public PreviewDataFrameAnalyticsResponse previewDataFrameAnalytics(PreviewDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PreviewDataFrameAnalyticsRequest, PreviewDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<PreviewDataFrameAnalyticsRequest, PreviewDataFrameAnalyticsResponse, ErrorResponse>) PreviewDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Preview features used by data frame analytics. Previews the extracted
	 * features used by a data frame analytics config.
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
	 * Preview features used by data frame analytics. Previews the extracted
	 * features used by a data frame analytics config.
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
	 * Preview a datafeed. This API returns the first &quot;page&quot; of search
	 * results from a datafeed. You can preview an existing datafeed or provide
	 * configuration details for a datafeed and anomaly detection job in the API.
	 * The preview shows the structure of the data that will be passed to the
	 * anomaly detection engine. IMPORTANT: When Elasticsearch security features are
	 * enabled, the preview uses the credentials of the user that called the API.
	 * However, when the datafeed starts it uses the roles of the last user that
	 * created or updated the datafeed. To get a preview that accurately reflects
	 * the behavior of the datafeed, use the appropriate credentials. You can also
	 * use secondary authorization headers to supply the credentials.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> PreviewDatafeedResponse<TDocument> previewDatafeed(PreviewDatafeedRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ErrorResponse>) PreviewDatafeedRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:ml.preview_datafeed.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Preview a datafeed. This API returns the first &quot;page&quot; of search
	 * results from a datafeed. You can preview an existing datafeed or provide
	 * configuration details for a datafeed and anomaly detection job in the API.
	 * The preview shows the structure of the data that will be passed to the
	 * anomaly detection engine. IMPORTANT: When Elasticsearch security features are
	 * enabled, the preview uses the credentials of the user that called the API.
	 * However, when the datafeed starts it uses the roles of the last user that
	 * created or updated the datafeed. To get a preview that accurately reflects
	 * the behavior of the datafeed, use the appropriate credentials. You can also
	 * use secondary authorization headers to supply the credentials.
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

	/**
	 * Preview a datafeed. This API returns the first &quot;page&quot; of search
	 * results from a datafeed. You can preview an existing datafeed or provide
	 * configuration details for a datafeed and anomaly detection job in the API.
	 * The preview shows the structure of the data that will be passed to the
	 * anomaly detection engine. IMPORTANT: When Elasticsearch security features are
	 * enabled, the preview uses the credentials of the user that called the API.
	 * However, when the datafeed starts it uses the roles of the last user that
	 * created or updated the datafeed. To get a preview that accurately reflects
	 * the behavior of the datafeed, use the appropriate credentials. You can also
	 * use secondary authorization headers to supply the credentials.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> PreviewDatafeedResponse<TDocument> previewDatafeed(PreviewDatafeedRequest request,
			Type tDocumentType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ErrorResponse>) PreviewDatafeedRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:ml.preview_datafeed.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Preview a datafeed. This API returns the first &quot;page&quot; of search
	 * results from a datafeed. You can preview an existing datafeed or provide
	 * configuration details for a datafeed and anomaly detection job in the API.
	 * The preview shows the structure of the data that will be passed to the
	 * anomaly detection engine. IMPORTANT: When Elasticsearch security features are
	 * enabled, the preview uses the credentials of the user that called the API.
	 * However, when the datafeed starts it uses the roles of the last user that
	 * created or updated the datafeed. To get a preview that accurately reflects
	 * the behavior of the datafeed, use the appropriate credentials. You can also
	 * use secondary authorization headers to supply the credentials.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PreviewDatafeedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-preview-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> PreviewDatafeedResponse<TDocument> previewDatafeed(
			Function<PreviewDatafeedRequest.Builder, ObjectBuilder<PreviewDatafeedRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return previewDatafeed(fn.apply(new PreviewDatafeedRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: ml.put_calendar

	/**
	 * Create a calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutCalendarResponse putCalendar(PutCalendarRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutCalendarRequest, PutCalendarResponse, ErrorResponse> endpoint = (JsonEndpoint<PutCalendarRequest, PutCalendarResponse, ErrorResponse>) PutCalendarRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a calendar.
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
	 * Add anomaly detection job to calendar.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-calendar-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutCalendarJobResponse putCalendarJob(PutCalendarJobRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutCalendarJobRequest, PutCalendarJobResponse, ErrorResponse> endpoint = (JsonEndpoint<PutCalendarJobRequest, PutCalendarJobResponse, ErrorResponse>) PutCalendarJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Add anomaly detection job to calendar.
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
	 * Create a data frame analytics job. This API creates a data frame analytics
	 * job that performs an analysis on the source indices and stores the outcome in
	 * a destination index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/put-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutDataFrameAnalyticsResponse putDataFrameAnalytics(PutDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutDataFrameAnalyticsRequest, PutDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutDataFrameAnalyticsRequest, PutDataFrameAnalyticsResponse, ErrorResponse>) PutDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a data frame analytics job. This API creates a data frame analytics
	 * job that performs an analysis on the source indices and stores the outcome in
	 * a destination index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/put-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutDataFrameAnalyticsResponse putDataFrameAnalytics(
			Function<PutDataFrameAnalyticsRequest.Builder, ObjectBuilder<PutDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return putDataFrameAnalytics(fn.apply(new PutDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_datafeed

	/**
	 * Create a datafeed. Datafeeds retrieve data from Elasticsearch for analysis by
	 * an anomaly detection job. You can associate only one datafeed with each
	 * anomaly detection job. The datafeed contains a query that runs at a defined
	 * interval (<code>frequency</code>). If you are concerned about delayed data,
	 * you can add a delay
	 * (<code>query_delay') at each interval. When Elasticsearch security features are enabled, your datafeed remembers which roles the user who created it had at the time of creation and runs the query using those same roles. If you provide secondary authorization headers, those credentials are used instead. You must use Kibana, this API, or the create anomaly detection jobs API to create a datafeed. Do not add a datafeed directly to the </code>.ml-config<code>index. Do not give users</code>write<code>privileges on the</code>.ml-config`
	 * index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutDatafeedResponse putDatafeed(PutDatafeedRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutDatafeedRequest, PutDatafeedResponse, ErrorResponse> endpoint = (JsonEndpoint<PutDatafeedRequest, PutDatafeedResponse, ErrorResponse>) PutDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a datafeed. Datafeeds retrieve data from Elasticsearch for analysis by
	 * an anomaly detection job. You can associate only one datafeed with each
	 * anomaly detection job. The datafeed contains a query that runs at a defined
	 * interval (<code>frequency</code>). If you are concerned about delayed data,
	 * you can add a delay
	 * (<code>query_delay') at each interval. When Elasticsearch security features are enabled, your datafeed remembers which roles the user who created it had at the time of creation and runs the query using those same roles. If you provide secondary authorization headers, those credentials are used instead. You must use Kibana, this API, or the create anomaly detection jobs API to create a datafeed. Do not add a datafeed directly to the </code>.ml-config<code>index. Do not give users</code>write<code>privileges on the</code>.ml-config`
	 * index.
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
	 * Create a filter. A filter contains a list of strings. It can be used by one
	 * or more anomaly detection jobs. Specifically, filters are referenced in the
	 * <code>custom_rules</code> property of detector configuration objects.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutFilterResponse putFilter(PutFilterRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutFilterRequest, PutFilterResponse, ErrorResponse> endpoint = (JsonEndpoint<PutFilterRequest, PutFilterResponse, ErrorResponse>) PutFilterRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a filter. A filter contains a list of strings. It can be used by one
	 * or more anomaly detection jobs. Specifically, filters are referenced in the
	 * <code>custom_rules</code> property of detector configuration objects.
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
	 * Create an anomaly detection job. If you include a
	 * <code>datafeed_config</code>, you must have read index privileges on the
	 * source index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-put-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutJobResponse putJob(PutJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutJobRequest, PutJobResponse, ErrorResponse> endpoint = (JsonEndpoint<PutJobRequest, PutJobResponse, ErrorResponse>) PutJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an anomaly detection job. If you include a
	 * <code>datafeed_config</code>, you must have read index privileges on the
	 * source index.
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
	 * Create a trained model. Enable you to supply a trained model that is not
	 * created by data frame analytics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTrainedModelResponse putTrainedModel(PutTrainedModelRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutTrainedModelRequest, PutTrainedModelResponse, ErrorResponse> endpoint = (JsonEndpoint<PutTrainedModelRequest, PutTrainedModelResponse, ErrorResponse>) PutTrainedModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a trained model. Enable you to supply a trained model that is not
	 * created by data frame analytics.
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
	 * Create or update a trained model alias. A trained model alias is a logical
	 * name used to reference a single trained model. You can use aliases instead of
	 * trained model identifiers to make it easier to reference your models. For
	 * example, you can use aliases in inference aggregations and processors. An
	 * alias must be unique and refer to only a single trained model. However, you
	 * can have multiple aliases for each trained model. If you use this API to
	 * update an alias such that it references a different trained model ID and the
	 * model uses a different type of data frame analytics, an error occurs. For
	 * example, this situation occurs if you have a trained model for regression
	 * analysis and a trained model for classification analysis; you cannot reassign
	 * an alias from one type of trained model to another. If you use this API to
	 * update an alias and there are very few input fields in common between the old
	 * and new trained models for the model alias, the API returns a warning.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-models-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTrainedModelAliasResponse putTrainedModelAlias(PutTrainedModelAliasRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutTrainedModelAliasRequest, PutTrainedModelAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<PutTrainedModelAliasRequest, PutTrainedModelAliasResponse, ErrorResponse>) PutTrainedModelAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a trained model alias. A trained model alias is a logical
	 * name used to reference a single trained model. You can use aliases instead of
	 * trained model identifiers to make it easier to reference your models. For
	 * example, you can use aliases in inference aggregations and processors. An
	 * alias must be unique and refer to only a single trained model. However, you
	 * can have multiple aliases for each trained model. If you use this API to
	 * update an alias such that it references a different trained model ID and the
	 * model uses a different type of data frame analytics, an error occurs. For
	 * example, this situation occurs if you have a trained model for regression
	 * analysis and a trained model for classification analysis; you cannot reassign
	 * an alias from one type of trained model to another. If you use this API to
	 * update an alias and there are very few input fields in common between the old
	 * and new trained models for the model alias, the API returns a warning.
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

	// ----- Endpoint: ml.put_trained_model_definition_part

	/**
	 * Create part of a trained model definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-model-definition-part.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTrainedModelDefinitionPartResponse putTrainedModelDefinitionPart(
			PutTrainedModelDefinitionPartRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutTrainedModelDefinitionPartRequest, PutTrainedModelDefinitionPartResponse, ErrorResponse> endpoint = (JsonEndpoint<PutTrainedModelDefinitionPartRequest, PutTrainedModelDefinitionPartResponse, ErrorResponse>) PutTrainedModelDefinitionPartRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create part of a trained model definition.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTrainedModelDefinitionPartRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-model-definition-part.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutTrainedModelDefinitionPartResponse putTrainedModelDefinitionPart(
			Function<PutTrainedModelDefinitionPartRequest.Builder, ObjectBuilder<PutTrainedModelDefinitionPartRequest>> fn)
			throws IOException, ElasticsearchException {
		return putTrainedModelDefinitionPart(fn.apply(new PutTrainedModelDefinitionPartRequest.Builder()).build());
	}

	// ----- Endpoint: ml.put_trained_model_vocabulary

	/**
	 * Create a trained model vocabulary. This API is supported only for natural
	 * language processing (NLP) models. The vocabulary is stored in the index as
	 * described in <code>inference_config.*.vocabulary</code> of the trained model
	 * definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-model-vocabulary.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTrainedModelVocabularyResponse putTrainedModelVocabulary(PutTrainedModelVocabularyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutTrainedModelVocabularyRequest, PutTrainedModelVocabularyResponse, ErrorResponse> endpoint = (JsonEndpoint<PutTrainedModelVocabularyRequest, PutTrainedModelVocabularyResponse, ErrorResponse>) PutTrainedModelVocabularyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a trained model vocabulary. This API is supported only for natural
	 * language processing (NLP) models. The vocabulary is stored in the index as
	 * described in <code>inference_config.*.vocabulary</code> of the trained model
	 * definition.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTrainedModelVocabularyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-trained-model-vocabulary.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutTrainedModelVocabularyResponse putTrainedModelVocabulary(
			Function<PutTrainedModelVocabularyRequest.Builder, ObjectBuilder<PutTrainedModelVocabularyRequest>> fn)
			throws IOException, ElasticsearchException {
		return putTrainedModelVocabulary(fn.apply(new PutTrainedModelVocabularyRequest.Builder()).build());
	}

	// ----- Endpoint: ml.reset_job

	/**
	 * Reset an anomaly detection job. All model state and results are deleted. The
	 * job is ready to start over as if it had just been created. It is not
	 * currently possible to reset multiple jobs using wildcards or a comma
	 * separated list.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-reset-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResetJobResponse resetJob(ResetJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResetJobRequest, ResetJobResponse, ErrorResponse> endpoint = (JsonEndpoint<ResetJobRequest, ResetJobResponse, ErrorResponse>) ResetJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Reset an anomaly detection job. All model state and results are deleted. The
	 * job is ready to start over as if it had just been created. It is not
	 * currently possible to reset multiple jobs using wildcards or a comma
	 * separated list.
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

	// ----- Endpoint: ml.start_data_frame_analytics

	/**
	 * Start a data frame analytics job. A data frame analytics job can be started
	 * and stopped multiple times throughout its lifecycle. If the destination index
	 * does not exist, it is created automatically the first time you start the data
	 * frame analytics job. The <code>index.number_of_shards</code> and
	 * <code>index.number_of_replicas</code> settings for the destination index are
	 * copied from the source index. If there are multiple source indices, the
	 * destination index copies the highest setting values. The mappings for the
	 * destination index are also copied from the source indices. If there are any
	 * mapping conflicts, the job fails to start. If the destination index exists,
	 * it is used as is. You can therefore set up the destination index in advance
	 * with custom settings and mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartDataFrameAnalyticsResponse startDataFrameAnalytics(StartDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartDataFrameAnalyticsRequest, StartDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<StartDataFrameAnalyticsRequest, StartDataFrameAnalyticsResponse, ErrorResponse>) StartDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Start a data frame analytics job. A data frame analytics job can be started
	 * and stopped multiple times throughout its lifecycle. If the destination index
	 * does not exist, it is created automatically the first time you start the data
	 * frame analytics job. The <code>index.number_of_shards</code> and
	 * <code>index.number_of_replicas</code> settings for the destination index are
	 * copied from the source index. If there are multiple source indices, the
	 * destination index copies the highest setting values. The mappings for the
	 * destination index are also copied from the source indices. If there are any
	 * mapping conflicts, the job fails to start. If the destination index exists,
	 * it is used as is. You can therefore set up the destination index in advance
	 * with custom settings and mappings.
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
	 * Start datafeeds.
	 * <p>
	 * A datafeed must be started in order to retrieve data from Elasticsearch. A
	 * datafeed can be started and stopped multiple times throughout its lifecycle.
	 * <p>
	 * Before you can start a datafeed, the anomaly detection job must be open.
	 * Otherwise, an error occurs.
	 * <p>
	 * If you restart a stopped datafeed, it continues processing input data from
	 * the next millisecond after it was stopped. If new data was indexed for that
	 * exact millisecond between stopping and starting, it will be ignored.
	 * <p>
	 * When Elasticsearch security features are enabled, your datafeed remembers
	 * which roles the last user to create or update it had at the time of creation
	 * or update and runs the query using those same roles. If you provided
	 * secondary authorization headers when you created or updated the datafeed,
	 * those credentials are used instead.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-start-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartDatafeedResponse startDatafeed(StartDatafeedRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartDatafeedRequest, StartDatafeedResponse, ErrorResponse> endpoint = (JsonEndpoint<StartDatafeedRequest, StartDatafeedResponse, ErrorResponse>) StartDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Start datafeeds.
	 * <p>
	 * A datafeed must be started in order to retrieve data from Elasticsearch. A
	 * datafeed can be started and stopped multiple times throughout its lifecycle.
	 * <p>
	 * Before you can start a datafeed, the anomaly detection job must be open.
	 * Otherwise, an error occurs.
	 * <p>
	 * If you restart a stopped datafeed, it continues processing input data from
	 * the next millisecond after it was stopped. If new data was indexed for that
	 * exact millisecond between stopping and starting, it will be ignored.
	 * <p>
	 * When Elasticsearch security features are enabled, your datafeed remembers
	 * which roles the last user to create or update it had at the time of creation
	 * or update and runs the query using those same roles. If you provided
	 * secondary authorization headers when you created or updated the datafeed,
	 * those credentials are used instead.
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

	// ----- Endpoint: ml.start_trained_model_deployment

	/**
	 * Start a trained model deployment. It allocates the model to every machine
	 * learning node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trained-model-deployment.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartTrainedModelDeploymentResponse startTrainedModelDeployment(StartTrainedModelDeploymentRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartTrainedModelDeploymentRequest, StartTrainedModelDeploymentResponse, ErrorResponse> endpoint = (JsonEndpoint<StartTrainedModelDeploymentRequest, StartTrainedModelDeploymentResponse, ErrorResponse>) StartTrainedModelDeploymentRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Start a trained model deployment. It allocates the model to every machine
	 * learning node.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartTrainedModelDeploymentRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trained-model-deployment.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StartTrainedModelDeploymentResponse startTrainedModelDeployment(
			Function<StartTrainedModelDeploymentRequest.Builder, ObjectBuilder<StartTrainedModelDeploymentRequest>> fn)
			throws IOException, ElasticsearchException {
		return startTrainedModelDeployment(fn.apply(new StartTrainedModelDeploymentRequest.Builder()).build());
	}

	// ----- Endpoint: ml.stop_data_frame_analytics

	/**
	 * Stop data frame analytics jobs. A data frame analytics job can be started and
	 * stopped multiple times throughout its lifecycle.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopDataFrameAnalyticsResponse stopDataFrameAnalytics(StopDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopDataFrameAnalyticsRequest, StopDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<StopDataFrameAnalyticsRequest, StopDataFrameAnalyticsResponse, ErrorResponse>) StopDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop data frame analytics jobs. A data frame analytics job can be started and
	 * stopped multiple times throughout its lifecycle.
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
	 * Stop datafeeds. A datafeed that is stopped ceases to retrieve data from
	 * Elasticsearch. A datafeed can be started and stopped multiple times
	 * throughout its lifecycle.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-stop-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopDatafeedResponse stopDatafeed(StopDatafeedRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopDatafeedRequest, StopDatafeedResponse, ErrorResponse> endpoint = (JsonEndpoint<StopDatafeedRequest, StopDatafeedResponse, ErrorResponse>) StopDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop datafeeds. A datafeed that is stopped ceases to retrieve data from
	 * Elasticsearch. A datafeed can be started and stopped multiple times
	 * throughout its lifecycle.
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

	// ----- Endpoint: ml.stop_trained_model_deployment

	/**
	 * Stop a trained model deployment.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/stop-trained-model-deployment.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopTrainedModelDeploymentResponse stopTrainedModelDeployment(StopTrainedModelDeploymentRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopTrainedModelDeploymentRequest, StopTrainedModelDeploymentResponse, ErrorResponse> endpoint = (JsonEndpoint<StopTrainedModelDeploymentRequest, StopTrainedModelDeploymentResponse, ErrorResponse>) StopTrainedModelDeploymentRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop a trained model deployment.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopTrainedModelDeploymentRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/stop-trained-model-deployment.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StopTrainedModelDeploymentResponse stopTrainedModelDeployment(
			Function<StopTrainedModelDeploymentRequest.Builder, ObjectBuilder<StopTrainedModelDeploymentRequest>> fn)
			throws IOException, ElasticsearchException {
		return stopTrainedModelDeployment(fn.apply(new StopTrainedModelDeploymentRequest.Builder()).build());
	}

	// ----- Endpoint: ml.update_data_frame_analytics

	/**
	 * Update a data frame analytics job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateDataFrameAnalyticsResponse updateDataFrameAnalytics(UpdateDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateDataFrameAnalyticsRequest, UpdateDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateDataFrameAnalyticsRequest, UpdateDataFrameAnalyticsResponse, ErrorResponse>) UpdateDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a data frame analytics job.
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
	 * Update a datafeed. You must stop and start the datafeed for the changes to be
	 * applied. When Elasticsearch security features are enabled, your datafeed
	 * remembers which roles the user who updated it had at the time of the update
	 * and runs the query using those same roles. If you provide secondary
	 * authorization headers, those credentials are used instead.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-datafeed.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateDatafeedResponse updateDatafeed(UpdateDatafeedRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateDatafeedRequest, UpdateDatafeedResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateDatafeedRequest, UpdateDatafeedResponse, ErrorResponse>) UpdateDatafeedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a datafeed. You must stop and start the datafeed for the changes to be
	 * applied. When Elasticsearch security features are enabled, your datafeed
	 * remembers which roles the user who updated it had at the time of the update
	 * and runs the query using those same roles. If you provide secondary
	 * authorization headers, those credentials are used instead.
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
	 * Update a filter. Updates the description of a filter, adds items, or removes
	 * items from the list.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-filter.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateFilterResponse updateFilter(UpdateFilterRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateFilterRequest, UpdateFilterResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateFilterRequest, UpdateFilterResponse, ErrorResponse>) UpdateFilterRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a filter. Updates the description of a filter, adds items, or removes
	 * items from the list.
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
	 * Update an anomaly detection job. Updates certain properties of an anomaly
	 * detection job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ml-update-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateJobResponse updateJob(UpdateJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateJobRequest, UpdateJobResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateJobRequest, UpdateJobResponse, ErrorResponse>) UpdateJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update an anomaly detection job. Updates certain properties of an anomaly
	 * detection job.
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

	// ----- Endpoint: ml.update_trained_model_deployment

	/**
	 * Update a trained model deployment.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-trained-model-deployment.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateTrainedModelDeploymentResponse updateTrainedModelDeployment(
			UpdateTrainedModelDeploymentRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateTrainedModelDeploymentRequest, UpdateTrainedModelDeploymentResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateTrainedModelDeploymentRequest, UpdateTrainedModelDeploymentResponse, ErrorResponse>) UpdateTrainedModelDeploymentRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a trained model deployment.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateTrainedModelDeploymentRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-trained-model-deployment.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateTrainedModelDeploymentResponse updateTrainedModelDeployment(
			Function<UpdateTrainedModelDeploymentRequest.Builder, ObjectBuilder<UpdateTrainedModelDeploymentRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateTrainedModelDeployment(fn.apply(new UpdateTrainedModelDeploymentRequest.Builder()).build());
	}

}
