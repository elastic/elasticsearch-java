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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.flush_job.Request
@JsonpDeserializable
public class FlushJobRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String advanceTime;

	@Nullable
	private final Boolean calcInterim;

	@Nullable
	private final String end;

	private final String jobId;

	@Nullable
	private final String skipTime;

	@Nullable
	private final String start;

	// ---------------------------------------------------------------------------------------------

	private FlushJobRequest(Builder builder) {

		this.advanceTime = builder.advanceTime;
		this.calcInterim = builder.calcInterim;
		this.end = builder.end;
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.skipTime = builder.skipTime;
		this.start = builder.start;

	}

	public static FlushJobRequest of(Function<Builder, ObjectBuilder<FlushJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies to advance to a particular time value. Results are generated and
	 * the model is updated for data from the specified time interval.
	 * <p>
	 * API name: {@code advance_time}
	 */
	@Nullable
	public final String advanceTime() {
		return this.advanceTime;
	}

	/**
	 * If true, calculates the interim results for the most recent bucket or all
	 * buckets within the latency period.
	 * <p>
	 * API name: {@code calc_interim}
	 */
	@Nullable
	public final Boolean calcInterim() {
		return this.calcInterim;
	}

	/**
	 * When used in conjunction with <code>calc_interim</code>, specifies the range
	 * of buckets on which to calculate interim results.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final String end() {
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
	 * Specifies to skip to a particular time value. Results are not generated and
	 * the model is not updated for data from the specified time interval.
	 * <p>
	 * API name: {@code skip_time}
	 */
	@Nullable
	public final String skipTime() {
		return this.skipTime;
	}

	/**
	 * When used in conjunction with calc_interim, specifies the range of buckets on
	 * which to calculate interim results.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final String start() {
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
			generator.write(this.advanceTime);

		}
		if (this.calcInterim != null) {
			generator.writeKey("calc_interim");
			generator.write(this.calcInterim);

		}
		if (this.end != null) {
			generator.writeKey("end");
			generator.write(this.end);

		}
		if (this.start != null) {
			generator.writeKey("start");
			generator.write(this.start);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushJobRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FlushJobRequest> {
		@Nullable
		private String advanceTime;

		@Nullable
		private Boolean calcInterim;

		@Nullable
		private String end;

		private String jobId;

		@Nullable
		private String skipTime;

		@Nullable
		private String start;

		/**
		 * Specifies to advance to a particular time value. Results are generated and
		 * the model is updated for data from the specified time interval.
		 * <p>
		 * API name: {@code advance_time}
		 */
		public final Builder advanceTime(@Nullable String value) {
			this.advanceTime = value;
			return this;
		}

		/**
		 * If true, calculates the interim results for the most recent bucket or all
		 * buckets within the latency period.
		 * <p>
		 * API name: {@code calc_interim}
		 */
		public final Builder calcInterim(@Nullable Boolean value) {
			this.calcInterim = value;
			return this;
		}

		/**
		 * When used in conjunction with <code>calc_interim</code>, specifies the range
		 * of buckets on which to calculate interim results.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable String value) {
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
		 * Specifies to skip to a particular time value. Results are not generated and
		 * the model is not updated for data from the specified time interval.
		 * <p>
		 * API name: {@code skip_time}
		 */
		public final Builder skipTime(@Nullable String value) {
			this.skipTime = value;
			return this;
		}

		/**
		 * When used in conjunction with calc_interim, specifies the range of buckets on
		 * which to calculate interim results.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable String value) {
			this.start = value;
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
			FlushJobRequest::setupFlushJobRequestDeserializer, Builder::build);

	protected static void setupFlushJobRequestDeserializer(DelegatingDeserializer<FlushJobRequest.Builder> op) {

		op.add(Builder::advanceTime, JsonpDeserializer.stringDeserializer(), "advance_time");
		op.add(Builder::calcInterim, JsonpDeserializer.booleanDeserializer(), "calc_interim");
		op.add(Builder::end, JsonpDeserializer.stringDeserializer(), "end");
		op.add(Builder::start, JsonpDeserializer.stringDeserializer(), "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.flush_job}".
	 */
	public static final Endpoint<FlushJobRequest, FlushJobResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.skipTime != null) {
					params.put("skip_time", request.skipTime);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, FlushJobResponse._DESERIALIZER);
}
