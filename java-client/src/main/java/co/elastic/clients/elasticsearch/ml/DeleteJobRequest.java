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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.delete_job.Request

public final class DeleteJobRequest extends RequestBase {
	private final String jobId;

	@Nullable
	private final Boolean force;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	public DeleteJobRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.force = builder.force;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public DeleteJobRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Use to forcefully delete an opened job; this method is quicker than closing
	 * and deleting the job.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public Boolean force() {
		return this.force;
	}

	/**
	 * Specifies whether the request should return immediately or wait until the job
	 * deletion completes.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteJobRequest> {
		private String jobId;

		@Nullable
		private Boolean force;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Use to forcefully delete an opened job; this method is quicker than closing
		 * and deleting the job.
		 * <p>
		 * API name: {@code force}
		 */
		public Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Specifies whether the request should return immediately or wait until the job
		 * deletion completes.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteJobRequest build() {

			return new DeleteJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_job}".
	 */
	public static final Endpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

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
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteJobResponse._DESERIALIZER);
}
