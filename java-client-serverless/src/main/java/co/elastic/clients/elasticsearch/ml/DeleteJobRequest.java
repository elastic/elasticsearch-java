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
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.delete_job.Request

/**
 * Deletes an anomaly detection job.
 * <p>
 * All job configuration, model state and results are deleted. It is not
 * currently possible to delete multiple jobs using wildcards or a comma
 * separated list. If you delete a job that has a datafeed, the request first
 * tries to delete the datafeed. This behavior is equivalent to calling the
 * delete datafeed API with the same timeout and force parameters as the delete
 * job request.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.delete_job.Request">API
 *      specification</a>
 */

public class DeleteJobRequest extends RequestBase {
	@Nullable
	private final Boolean deleteUserAnnotations;

	@Nullable
	private final Boolean force;

	private final String jobId;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private DeleteJobRequest(Builder builder) {

		this.deleteUserAnnotations = builder.deleteUserAnnotations;
		this.force = builder.force;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static DeleteJobRequest of(Function<Builder, ObjectBuilder<DeleteJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies whether annotations that have been added by the user should be
	 * deleted along with any auto-generated annotations when the job is reset.
	 * <p>
	 * API name: {@code delete_user_annotations}
	 */
	@Nullable
	public final Boolean deleteUserAnnotations() {
		return this.deleteUserAnnotations;
	}

	/**
	 * Use to forcefully delete an opened job; this method is quicker than closing
	 * and deleting the job.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Specifies whether the request should return immediately or wait until the job
	 * deletion completes.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteJobRequest> {
		@Nullable
		private Boolean deleteUserAnnotations;

		@Nullable
		private Boolean force;

		private String jobId;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Specifies whether annotations that have been added by the user should be
		 * deleted along with any auto-generated annotations when the job is reset.
		 * <p>
		 * API name: {@code delete_user_annotations}
		 */
		public final Builder deleteUserAnnotations(@Nullable Boolean value) {
			this.deleteUserAnnotations = value;
			return this;
		}

		/**
		 * Use to forcefully delete an opened job; this method is quicker than closing
		 * and deleting the job.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Specifies whether the request should return immediately or wait until the job
		 * deletion completes.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteJobRequest build() {
			_checkSingleUse();

			return new DeleteJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_job}".
	 */
	public static final Endpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.delete_job",

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _jobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					params.put("jobId", request.jobId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.deleteUserAnnotations != null) {
					params.put("delete_user_annotations", String.valueOf(request.deleteUserAnnotations));
				}
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteJobResponse._DESERIALIZER);
}
