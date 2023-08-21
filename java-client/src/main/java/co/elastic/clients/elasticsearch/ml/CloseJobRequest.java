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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.close_job.Request

/**
 * Closes one or more anomaly detection jobs. A job can be opened and closed
 * multiple times throughout its lifecycle. A closed job cannot receive data or
 * perform analysis operations, but you can still explore and navigate results.
 * When you close a job, it runs housekeeping tasks such as pruning the model
 * history, flushing buffers, calculating final results and persisting the model
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
 * @see <a href="../doc-files/api-spec.html#ml.close_job.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CloseJobRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean force;

	private final String jobId;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private CloseJobRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.force = builder.force;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.timeout = builder.timeout;

	}

	public static CloseJobRequest of(Function<Builder, ObjectBuilder<CloseJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Refer to the description for the <code>allow_no_match</code> query parameter.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Refer to the descriptiion for the <code>force</code> query parameter.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
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
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Refer to the description for the <code>timeout</code> query parameter.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.allowNoMatch != null) {
			generator.writeKey("allow_no_match");
			generator.write(this.allowNoMatch);

		}
		if (this.force != null) {
			generator.writeKey("force");
			generator.write(this.force);

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<CloseJobRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean force;

		private String jobId;

		@Nullable
		private Time timeout;

		/**
		 * Refer to the description for the <code>allow_no_match</code> query parameter.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Refer to the descriptiion for the <code>force</code> query parameter.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
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
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>timeout</code> query parameter.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>timeout</code> query parameter.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CloseJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseJobRequest build() {
			_checkSingleUse();

			return new CloseJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseJobRequest}
	 */
	public static final JsonpDeserializer<CloseJobRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CloseJobRequest::setupCloseJobRequestDeserializer);

	protected static void setupCloseJobRequestDeserializer(ObjectDeserializer<CloseJobRequest.Builder> op) {

		op.add(Builder::allowNoMatch, JsonpDeserializer.booleanDeserializer(), "allow_no_match");
		op.add(Builder::force, JsonpDeserializer.booleanDeserializer(), "force");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.close_job}".
	 */
	public static final Endpoint<CloseJobRequest, CloseJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.close_job",

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
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, CloseJobResponse._DESERIALIZER);
}
