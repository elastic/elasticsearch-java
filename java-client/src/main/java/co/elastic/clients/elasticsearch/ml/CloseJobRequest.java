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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.close_job.Request

public final class CloseJobRequest extends RequestBase {
	private final String jobId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean allowNoJobs;

	@Nullable
	private final Boolean force;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public CloseJobRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.allowNoMatch = builder.allowNoMatch;
		this.allowNoJobs = builder.allowNoJobs;
		this.force = builder.force;
		this.timeout = builder.timeout;

	}

	public CloseJobRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Identifier for the anomaly detection job. It can be a job
	 * identifier, a group name, or a wildcard expression. You can close multiple
	 * anomaly detection jobs in a single API request by using a group name, a
	 * comma-separated list of jobs, or a wildcard expression. You can close all
	 * jobs by using <code>_all</code> or by specifying <code>*</code> as the job
	 * identifier.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Specifies what to do when the request: contains wildcard expressions and
	 * there are no jobs that match; contains the <code>_all</code> string or no
	 * identifiers and there are no matches; or contains wildcard expressions and
	 * there are only partial matches. By default, it returns an empty jobs array
	 * when there are no matches and the subset of results when there are partial
	 * matches. If <code>false</code>, the request returns a 404 status code when
	 * there are no matches or only partial matches.
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
	 * Use to close a failed job, or to forcefully close a job which has not
	 * responded to its initial close request; the request returns without
	 * performing the associated actions such as flushing buffers and persisting the
	 * model snapshots. If you want the job to be in a consistent state after the
	 * close job API returns, do not set to <code>true</code>. This parameter should
	 * be used only in situations where the job has already failed or where you are
	 * not interested in results the job might have recently produced or might
	 * produce in the future.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public Boolean force() {
		return this.force;
	}

	/**
	 * Controls the time to wait until a job has closed.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<CloseJobRequest> {
		private String jobId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean allowNoJobs;

		@Nullable
		private Boolean force;

		@Nullable
		private String timeout;

		/**
		 * Required - Identifier for the anomaly detection job. It can be a job
		 * identifier, a group name, or a wildcard expression. You can close multiple
		 * anomaly detection jobs in a single API request by using a group name, a
		 * comma-separated list of jobs, or a wildcard expression. You can close all
		 * jobs by using <code>_all</code> or by specifying <code>*</code> as the job
		 * identifier.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Specifies what to do when the request: contains wildcard expressions and
		 * there are no jobs that match; contains the <code>_all</code> string or no
		 * identifiers and there are no matches; or contains wildcard expressions and
		 * there are only partial matches. By default, it returns an empty jobs array
		 * when there are no matches and the subset of results when there are partial
		 * matches. If <code>false</code>, the request returns a 404 status code when
		 * there are no matches or only partial matches.
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
		 * Use to close a failed job, or to forcefully close a job which has not
		 * responded to its initial close request; the request returns without
		 * performing the associated actions such as flushing buffers and persisting the
		 * model snapshots. If you want the job to be in a consistent state after the
		 * close job API returns, do not set to <code>true</code>. This parameter should
		 * be used only in situations where the job has already failed or where you are
		 * not interested in results the job might have recently produced or might
		 * produce in the future.
		 * <p>
		 * API name: {@code force}
		 */
		public Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Controls the time to wait until a job has closed.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link CloseJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseJobRequest build() {

			return new CloseJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.close_job}".
	 */
	public static final Endpoint<CloseJobRequest, CloseJobResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/_close");
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
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, CloseJobResponse._DESERIALIZER);
}
