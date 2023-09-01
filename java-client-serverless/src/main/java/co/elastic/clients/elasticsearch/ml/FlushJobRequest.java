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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
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

// typedef: ml.flush_job.Request

/**
 * Forces any buffered data to be processed by the job. The flush jobs API is
 * only applicable when sending data for analysis using the post data API.
 * Depending on the content of the buffer, then it might additionally calculate
 * new results. Both flush and close operations are similar, however the flush
 * is more efficient if you are expecting to send more data for analysis. When
 * flushing, the job remains open and is available to continue analyzing data. A
 * close operation additionally prunes and persists the model state to disk and
 * the job must be opened again before analyzing further data.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.flush_job.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class FlushJobRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final DateTime advanceTime;

	@Nullable
	private final Boolean calcInterim;

	@Nullable
	private final DateTime end;

	private final String jobId;

	@Nullable
	private final DateTime skipTime;

	@Nullable
	private final DateTime start;

	// ---------------------------------------------------------------------------------------------

	private FlushJobRequest(Builder builder) {

		this.advanceTime = builder.advanceTime;
		this.calcInterim = builder.calcInterim;
		this.end = builder.end;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.skipTime = builder.skipTime;
		this.start = builder.start;

	}

	public static FlushJobRequest of(Function<Builder, ObjectBuilder<FlushJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Refer to the description for the <code>advance_time</code> query parameter.
	 * <p>
	 * API name: {@code advance_time}
	 */
	@Nullable
	public final DateTime advanceTime() {
		return this.advanceTime;
	}

	/**
	 * Refer to the description for the <code>calc_interim</code> query parameter.
	 * <p>
	 * API name: {@code calc_interim}
	 */
	@Nullable
	public final Boolean calcInterim() {
		return this.calcInterim;
	}

	/**
	 * Refer to the description for the <code>end</code> query parameter.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final DateTime end() {
		return this.end;
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
	 * Refer to the description for the <code>skip_time</code> query parameter.
	 * <p>
	 * API name: {@code skip_time}
	 */
	@Nullable
	public final DateTime skipTime() {
		return this.skipTime;
	}

	/**
	 * Refer to the description for the <code>start</code> query parameter.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final DateTime start() {
		return this.start;
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

		if (this.advanceTime != null) {
			generator.writeKey("advance_time");
			this.advanceTime.serialize(generator, mapper);
		}
		if (this.calcInterim != null) {
			generator.writeKey("calc_interim");
			generator.write(this.calcInterim);

		}
		if (this.end != null) {
			generator.writeKey("end");
			this.end.serialize(generator, mapper);
		}
		if (this.skipTime != null) {
			generator.writeKey("skip_time");
			this.skipTime.serialize(generator, mapper);
		}
		if (this.start != null) {
			generator.writeKey("start");
			this.start.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<FlushJobRequest> {
		@Nullable
		private DateTime advanceTime;

		@Nullable
		private Boolean calcInterim;

		@Nullable
		private DateTime end;

		private String jobId;

		@Nullable
		private DateTime skipTime;

		@Nullable
		private DateTime start;

		/**
		 * Refer to the description for the <code>advance_time</code> query parameter.
		 * <p>
		 * API name: {@code advance_time}
		 */
		public final Builder advanceTime(@Nullable DateTime value) {
			this.advanceTime = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>calc_interim</code> query parameter.
		 * <p>
		 * API name: {@code calc_interim}
		 */
		public final Builder calcInterim(@Nullable Boolean value) {
			this.calcInterim = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>end</code> query parameter.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable DateTime value) {
			this.end = value;
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
		 * Refer to the description for the <code>skip_time</code> query parameter.
		 * <p>
		 * API name: {@code skip_time}
		 */
		public final Builder skipTime(@Nullable DateTime value) {
			this.skipTime = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>start</code> query parameter.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable DateTime value) {
			this.start = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FlushJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushJobRequest build() {
			_checkSingleUse();

			return new FlushJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FlushJobRequest}
	 */
	public static final JsonpDeserializer<FlushJobRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FlushJobRequest::setupFlushJobRequestDeserializer);

	protected static void setupFlushJobRequestDeserializer(ObjectDeserializer<FlushJobRequest.Builder> op) {

		op.add(Builder::advanceTime, DateTime._DESERIALIZER, "advance_time");
		op.add(Builder::calcInterim, JsonpDeserializer.booleanDeserializer(), "calc_interim");
		op.add(Builder::end, DateTime._DESERIALIZER, "end");
		op.add(Builder::skipTime, DateTime._DESERIALIZER, "skip_time");
		op.add(Builder::start, DateTime._DESERIALIZER, "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.flush_job}".
	 */
	public static final Endpoint<FlushJobRequest, FlushJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.flush_job",

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
					buf.append("/_flush");
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

			}, SimpleEndpoint.emptyMap(), true, FlushJobResponse._DESERIALIZER);
}
