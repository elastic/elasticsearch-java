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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.forecast.Request

/**
 * Predicts the future behavior of a time series by using its historical
 * behavior.
 * <p>
 * Forecasts are not supported for jobs that perform population analysis; an
 * error occurs if you try to create a forecast for a job that has an
 * <code>over_field_name</code> in its configuration.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.forecast.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ForecastRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time duration;

	@Nullable
	private final Time expiresIn;

	private final String jobId;

	@Nullable
	private final String maxModelMemory;

	// ---------------------------------------------------------------------------------------------

	private ForecastRequest(Builder builder) {

		this.duration = builder.duration;
		this.expiresIn = builder.expiresIn;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.maxModelMemory = builder.maxModelMemory;

	}

	public static ForecastRequest of(Function<Builder, ObjectBuilder<ForecastRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Refer to the description for the <code>duration</code> query parameter.
	 * <p>
	 * API name: {@code duration}
	 */
	@Nullable
	public final Time duration() {
		return this.duration;
	}

	/**
	 * Refer to the description for the <code>expires_in</code> query parameter.
	 * <p>
	 * API name: {@code expires_in}
	 */
	@Nullable
	public final Time expiresIn() {
		return this.expiresIn;
	}

	/**
	 * Required - Identifier for the anomaly detection job. The job must be open
	 * when you create a forecast; otherwise, an error occurs.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Refer to the description for the <code>max_model_memory</code> query
	 * parameter.
	 * <p>
	 * API name: {@code max_model_memory}
	 */
	@Nullable
	public final String maxModelMemory() {
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
			this.duration.serialize(generator, mapper);

		}
		if (this.expiresIn != null) {
			generator.writeKey("expires_in");
			this.expiresIn.serialize(generator, mapper);

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

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ForecastRequest> {
		@Nullable
		private Time duration;

		@Nullable
		private Time expiresIn;

		private String jobId;

		@Nullable
		private String maxModelMemory;

		/**
		 * Refer to the description for the <code>duration</code> query parameter.
		 * <p>
		 * API name: {@code duration}
		 */
		public final Builder duration(@Nullable Time value) {
			this.duration = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>duration</code> query parameter.
		 * <p>
		 * API name: {@code duration}
		 */
		public final Builder duration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.duration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Refer to the description for the <code>expires_in</code> query parameter.
		 * <p>
		 * API name: {@code expires_in}
		 */
		public final Builder expiresIn(@Nullable Time value) {
			this.expiresIn = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>expires_in</code> query parameter.
		 * <p>
		 * API name: {@code expires_in}
		 */
		public final Builder expiresIn(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiresIn(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Identifier for the anomaly detection job. The job must be open
		 * when you create a forecast; otherwise, an error occurs.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>max_model_memory</code> query
		 * parameter.
		 * <p>
		 * API name: {@code max_model_memory}
		 */
		public final Builder maxModelMemory(@Nullable String value) {
			this.maxModelMemory = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ForecastRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForecastRequest build() {
			_checkSingleUse();

			return new ForecastRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForecastRequest}
	 */
	public static final JsonpDeserializer<ForecastRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ForecastRequest::setupForecastRequestDeserializer);

	protected static void setupForecastRequestDeserializer(ObjectDeserializer<ForecastRequest.Builder> op) {

		op.add(Builder::duration, Time._DESERIALIZER, "duration");
		op.add(Builder::expiresIn, Time._DESERIALIZER, "expires_in");
		op.add(Builder::maxModelMemory, JsonpDeserializer.stringDeserializer(), "max_model_memory");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.forecast}".
	 */
	public static final Endpoint<ForecastRequest, ForecastResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.forecast",

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

			}, SimpleEndpoint.emptyMap(), true, ForecastResponse._DESERIALIZER);
}
