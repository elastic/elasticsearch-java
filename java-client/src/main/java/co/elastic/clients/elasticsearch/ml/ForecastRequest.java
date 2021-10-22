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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.forecast.Request
@JsonpDeserializable
public final class ForecastRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String duration;

	@Nullable
	private final String expiresIn;

	private final String jobId;

	@Nullable
	private final String maxModelMemory;

	// ---------------------------------------------------------------------------------------------

	public ForecastRequest(Builder builder) {

		this.duration = builder.duration;
		this.expiresIn = builder.expiresIn;
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.maxModelMemory = builder.maxModelMemory;

	}

	public ForecastRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A period of time that indicates how far into the future to forecast. For
	 * example, <code>30d</code> corresponds to 30 days. The forecast starts at the
	 * last record that was processed.
	 * <p>
	 * API name: {@code duration}
	 */
	@Nullable
	public String duration() {
		return this.duration;
	}

	/**
	 * The period of time that forecast results are retained. After a forecast
	 * expires, the results are deleted. If set to a value of 0, the forecast is
	 * never automatically deleted.
	 * <p>
	 * API name: {@code expires_in}
	 */
	@Nullable
	public String expiresIn() {
		return this.expiresIn;
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
	 * The maximum memory the forecast can use. If the forecast needs to use more
	 * than the provided amount, it will spool to disk. Default is 20mb, maximum is
	 * 500mb and minimum is 1mb. If set to 40% or more of the job’s configured
	 * memory limit, it is automatically reduced to below that amount.
	 * <p>
	 * API name: {@code max_model_memory}
	 */
	@Nullable
	public String maxModelMemory() {
		return this.maxModelMemory;
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

		if (this.duration != null) {

			generator.writeKey("duration");
			generator.write(this.duration);

		}
		if (this.expiresIn != null) {

			generator.writeKey("expires_in");
			generator.write(this.expiresIn);

		}
		if (this.maxModelMemory != null) {

			generator.writeKey("max_model_memory");
			generator.write(this.maxModelMemory);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForecastRequest}.
	 */
	public static class Builder implements ObjectBuilder<ForecastRequest> {
		@Nullable
		private String duration;

		@Nullable
		private String expiresIn;

		private String jobId;

		@Nullable
		private String maxModelMemory;

		/**
		 * A period of time that indicates how far into the future to forecast. For
		 * example, <code>30d</code> corresponds to 30 days. The forecast starts at the
		 * last record that was processed.
		 * <p>
		 * API name: {@code duration}
		 */
		public Builder duration(@Nullable String value) {
			this.duration = value;
			return this;
		}

		/**
		 * The period of time that forecast results are retained. After a forecast
		 * expires, the results are deleted. If set to a value of 0, the forecast is
		 * never automatically deleted.
		 * <p>
		 * API name: {@code expires_in}
		 */
		public Builder expiresIn(@Nullable String value) {
			this.expiresIn = value;
			return this;
		}

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
		 * The maximum memory the forecast can use. If the forecast needs to use more
		 * than the provided amount, it will spool to disk. Default is 20mb, maximum is
		 * 500mb and minimum is 1mb. If set to 40% or more of the job’s configured
		 * memory limit, it is automatically reduced to below that amount.
		 * <p>
		 * API name: {@code max_model_memory}
		 */
		public Builder maxModelMemory(@Nullable String value) {
			this.maxModelMemory = value;
			return this;
		}

		/**
		 * Builds a {@link ForecastRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForecastRequest build() {

			return new ForecastRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForecastRequest}
	 */
	public static final JsonpDeserializer<ForecastRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ForecastRequest::setupForecastRequestDeserializer, Builder::build);

	protected static void setupForecastRequestDeserializer(DelegatingDeserializer<ForecastRequest.Builder> op) {

		op.add(Builder::duration, JsonpDeserializer.stringDeserializer(), "duration");
		op.add(Builder::expiresIn, JsonpDeserializer.stringDeserializer(), "expires_in");
		op.add(Builder::maxModelMemory, JsonpDeserializer.stringDeserializer(), "max_model_memory");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.forecast}".
	 */
	public static final Endpoint<ForecastRequest, ForecastResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_forecast");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ForecastResponse._DESERIALIZER);
}
