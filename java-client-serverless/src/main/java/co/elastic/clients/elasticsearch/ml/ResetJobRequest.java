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

// typedef: ml.reset_job.Request

/**
 * Resets an anomaly detection job. All model state and results are deleted. The
 * job is ready to start over as if it had just been created. It is not
 * currently possible to reset multiple jobs using wildcards or a comma
 * separated list.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.reset_job.Request">API
 *      specification</a>
 */

public class ResetJobRequest extends RequestBase {
	@Nullable
	private final Boolean deleteUserAnnotations;

	private final String jobId;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private ResetJobRequest(Builder builder) {

		this.deleteUserAnnotations = builder.deleteUserAnnotations;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static ResetJobRequest of(Function<Builder, ObjectBuilder<ResetJobRequest>> fn) {
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
	 * Required - The ID of the job to reset.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Should this request wait until the operation has completed before returning.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResetJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ResetJobRequest> {
		@Nullable
		private Boolean deleteUserAnnotations;

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
		 * Required - The ID of the job to reset.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Should this request wait until the operation has completed before returning.
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
		 * Builds a {@link ResetJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResetJobRequest build() {
			_checkSingleUse();

			return new ResetJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.reset_job}".
	 */
	public static final Endpoint<ResetJobRequest, ResetJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.reset_job",

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
					buf.append("/_reset");
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
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ResetJobResponse._DESERIALIZER);
}
