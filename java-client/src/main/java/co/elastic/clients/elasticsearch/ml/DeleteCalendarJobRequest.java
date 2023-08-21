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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: ml.delete_calendar_job.Request

/**
 * Deletes anomaly detection jobs from a calendar.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.delete_calendar_job.Request">API
 *      specification</a>
 */

public class DeleteCalendarJobRequest extends RequestBase {
	private final String calendarId;

	private final List<String> jobId;

	// ---------------------------------------------------------------------------------------------

	private DeleteCalendarJobRequest(Builder builder) {

		this.calendarId = ApiTypeHelper.requireNonNull(builder.calendarId, this, "calendarId");
		this.jobId = ApiTypeHelper.unmodifiableRequired(builder.jobId, this, "jobId");

	}

	public static DeleteCalendarJobRequest of(Function<Builder, ObjectBuilder<DeleteCalendarJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A string that uniquely identifies a calendar.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public final String calendarId() {
		return this.calendarId;
	}

	/**
	 * Required - An identifier for the anomaly detection jobs. It can be a job
	 * identifier, a group name, or a comma-separated list of jobs or groups.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final List<String> jobId() {
		return this.jobId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteCalendarJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteCalendarJobRequest> {
		private String calendarId;

		private List<String> jobId;

		/**
		 * Required - A string that uniquely identifies a calendar.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public final Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * Required - An identifier for the anomaly detection jobs. It can be a job
		 * identifier, a group name, or a comma-separated list of jobs or groups.
		 * <p>
		 * API name: {@code job_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>jobId</code>.
		 */
		public final Builder jobId(List<String> list) {
			this.jobId = _listAddAll(this.jobId, list);
			return this;
		}

		/**
		 * Required - An identifier for the anomaly detection jobs. It can be a job
		 * identifier, a group name, or a comma-separated list of jobs or groups.
		 * <p>
		 * API name: {@code job_id}
		 * <p>
		 * Adds one or more values to <code>jobId</code>.
		 */
		public final Builder jobId(String value, String... values) {
			this.jobId = _listAdd(this.jobId, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteCalendarJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteCalendarJobRequest build() {
			_checkSingleUse();

			return new DeleteCalendarJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_calendar_job}".
	 */
	public static final Endpoint<DeleteCalendarJobRequest, DeleteCalendarJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.delete_calendar_job",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _calendarId = 1 << 0;
				final int _jobId = 1 << 1;

				int propsSet = 0;

				propsSet |= _calendarId;
				propsSet |= _jobId;

				if (propsSet == (_calendarId | _jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.calendarId, buf);
					buf.append("/jobs");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _calendarId = 1 << 0;
				final int _jobId = 1 << 1;

				int propsSet = 0;

				propsSet |= _calendarId;
				propsSet |= _jobId;

				if (propsSet == (_calendarId | _jobId)) {
					params.put("calendarId", request.calendarId);
					params.put("jobId", request.jobId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteCalendarJobResponse._DESERIALIZER);
}
