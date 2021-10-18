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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: ml.get_jobs.Request

public final class GetJobsRequest extends RequestBase {
	@Nullable
	private final List<String> jobId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean allowNoJobs;

	@Nullable
	private final Boolean excludeGenerated;

	// ---------------------------------------------------------------------------------------------

	public GetJobsRequest(Builder builder) {

		this.jobId = ModelTypeHelper.unmodifiable(builder.jobId);
		this.allowNoMatch = builder.allowNoMatch;
		this.allowNoJobs = builder.allowNoJobs;
		this.excludeGenerated = builder.excludeGenerated;

	}

	public GetJobsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The ID of the jobs to fetch
	 * <p>
	 * API name: {@code job_id}
	 */
	@Nullable
	public List<String> jobId() {
		return this.jobId;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no jobs. (This includes
	 * <code>_all</code> string or when no jobs have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no jobs. (This includes
	 * <code>_all</code> string or when no jobs have been specified)
	 * <p>
	 * API name: {@code allow_no_jobs}
	 */
	@Nullable
	public Boolean allowNoJobs() {
		return this.allowNoJobs;
	}

	/**
	 * Omits fields that are illegal to set on job PUT
	 * <p>
	 * API name: {@code exclude_generated}
	 */
	@Nullable
	public Boolean excludeGenerated() {
		return this.excludeGenerated;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetJobsRequest> {
		@Nullable
		private List<String> jobId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean allowNoJobs;

		@Nullable
		private Boolean excludeGenerated;

		/**
		 * The ID of the jobs to fetch
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(@Nullable List<String> value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The ID of the jobs to fetch
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String... value) {
			this.jobId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #jobId(List)}, creating the list if needed.
		 */
		public Builder addJobId(String value) {
			if (this.jobId == null) {
				this.jobId = new ArrayList<>();
			}
			this.jobId.add(value);
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no jobs. (This includes
		 * <code>_all</code> string or when no jobs have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no jobs. (This includes
		 * <code>_all</code> string or when no jobs have been specified)
		 * <p>
		 * API name: {@code allow_no_jobs}
		 */
		public Builder allowNoJobs(@Nullable Boolean value) {
			this.allowNoJobs = value;
			return this;
		}

		/**
		 * Omits fields that are illegal to set on job PUT
		 * <p>
		 * API name: {@code exclude_generated}
		 */
		public Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
			return this;
		}

		/**
		 * Builds a {@link GetJobsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetJobsRequest build() {

			return new GetJobsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_jobs}".
	 */
	public static final Endpoint<GetJobsRequest, GetJobsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.allowNoJobs != null) {
					params.put("allow_no_jobs", String.valueOf(request.allowNoJobs));
				}
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetJobsResponse._DESERIALIZER);
}
