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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.delete_expired_data.Request

/**
 * Deletes expired and unused machine learning data. Deletes all job results,
 * model snapshots and forecast data that have exceeded their retention days
 * period. Machine learning state documents that are not associated with any job
 * are also deleted. You can limit the request to a single or set of anomaly
 * detection jobs by using a job identifier, a group name, a comma-separated
 * list of jobs, or a wildcard expression. You can delete expired data for all
 * anomaly detection jobs by using _all, by specifying * as the &lt;job_id&gt;,
 * or by omitting the &lt;job_id&gt;.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.delete_expired_data.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteExpiredDataRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String jobId;

	@Nullable
	private final Float requestsPerSecond;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private DeleteExpiredDataRequest(Builder builder) {

		this.jobId = builder.jobId;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.timeout = builder.timeout;

	}

	public static DeleteExpiredDataRequest of(Function<Builder, ObjectBuilder<DeleteExpiredDataRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Identifier for an anomaly detection job. It can be a job identifier, a group
	 * name, or a wildcard expression.
	 * <p>
	 * API name: {@code job_id}
	 */
	@Nullable
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * The desired requests per second for the deletion processes. The default
	 * behavior is no throttling.
	 * <p>
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public final Float requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * How long can the underlying delete processes run until they are canceled.
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

		if (this.requestsPerSecond != null) {
			generator.writeKey("requests_per_second");
			generator.write(this.requestsPerSecond);

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteExpiredDataRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteExpiredDataRequest> {
		@Nullable
		private String jobId;

		@Nullable
		private Float requestsPerSecond;

		@Nullable
		private Time timeout;

		/**
		 * Identifier for an anomaly detection job. It can be a job identifier, a group
		 * name, or a wildcard expression.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The desired requests per second for the deletion processes. The default
		 * behavior is no throttling.
		 * <p>
		 * API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(@Nullable Float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * How long can the underlying delete processes run until they are canceled.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * How long can the underlying delete processes run until they are canceled.
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
		 * Builds a {@link DeleteExpiredDataRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteExpiredDataRequest build() {
			_checkSingleUse();

			return new DeleteExpiredDataRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteExpiredDataRequest}
	 */
	public static final JsonpDeserializer<DeleteExpiredDataRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteExpiredDataRequest::setupDeleteExpiredDataRequestDeserializer);

	protected static void setupDeleteExpiredDataRequestDeserializer(
			ObjectDeserializer<DeleteExpiredDataRequest.Builder> op) {

		op.add(Builder::requestsPerSecond, JsonpDeserializer.floatDeserializer(), "requests_per_second");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_expired_data}".
	 */
	public static final Endpoint<DeleteExpiredDataRequest, DeleteExpiredDataResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.delete_expired_data",

			// Request method
			request -> {
				return "DELETE";

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
					buf.append("/_delete_expired_data");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/_delete_expired_data");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					params.put("jobId", request.jobId);
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, DeleteExpiredDataResponse._DESERIALIZER);
}
