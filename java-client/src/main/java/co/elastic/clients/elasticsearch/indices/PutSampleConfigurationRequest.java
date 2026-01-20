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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: indices.put_sample_configuration.Request

/**
 * Create or update sampling configuration.
 * <p>
 * Create or update the sampling configuration for the specified index.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.put_sample_configuration.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutSampleConfigurationRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String if_;

	private final String index;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Integer maxSamples;

	@Nullable
	private final String maxSize;

	private final double rate;

	@Nullable
	private final Time timeToLive;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutSampleConfigurationRequest(Builder builder) {

		this.if_ = builder.if_;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.masterTimeout = builder.masterTimeout;
		this.maxSamples = builder.maxSamples;
		this.maxSize = builder.maxSize;
		this.rate = ApiTypeHelper.requireNonNull(builder.rate, this, "rate", 0);
		this.timeToLive = builder.timeToLive;
		this.timeout = builder.timeout;

	}

	public static PutSampleConfigurationRequest of(Function<Builder, ObjectBuilder<PutSampleConfigurationRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * An optional condition script that sampled documents must satisfy.
	 * <p>
	 * API name: {@code if}
	 */
	@Nullable
	public final String if_() {
		return this.if_;
	}

	/**
	 * Required - The name of the index or data stream.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The maximum number of documents to sample. Must be greater than 0 and less
	 * than or equal to 10,000.
	 * <p>
	 * API name: {@code max_samples}
	 */
	@Nullable
	public final Integer maxSamples() {
		return this.maxSamples;
	}

	/**
	 * The maximum total size of sampled documents. Must be greater than 0 and less
	 * than or equal to 5GB.
	 * <p>
	 * API name: {@code max_size}
	 */
	@Nullable
	public final String maxSize() {
		return this.maxSize;
	}

	/**
	 * Required - The fraction of documents to sample. Must be greater than 0 and
	 * less than or equal to 1. Can be specified as a number or a string.
	 * <p>
	 * API name: {@code rate}
	 */
	public final double rate() {
		return this.rate;
	}

	/**
	 * The duration for which the sampled documents should be retained. Must be
	 * greater than 0 and less than or equal to 30 days.
	 * <p>
	 * API name: {@code time_to_live}
	 */
	@Nullable
	public final Time timeToLive() {
		return this.timeToLive;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
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

		if (this.if_ != null) {
			generator.writeKey("if");
			generator.write(this.if_);

		}
		if (this.maxSamples != null) {
			generator.writeKey("max_samples");
			generator.write(this.maxSamples);

		}
		if (this.maxSize != null) {
			generator.writeKey("max_size");
			generator.write(this.maxSize);

		}
		generator.writeKey("rate");
		generator.write(this.rate);

		if (this.timeToLive != null) {
			generator.writeKey("time_to_live");
			this.timeToLive.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSampleConfigurationRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutSampleConfigurationRequest> {
		@Nullable
		private String if_;

		private String index;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Integer maxSamples;

		@Nullable
		private String maxSize;

		private Double rate;

		@Nullable
		private Time timeToLive;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutSampleConfigurationRequest instance) {
			this.if_ = instance.if_;
			this.index = instance.index;
			this.masterTimeout = instance.masterTimeout;
			this.maxSamples = instance.maxSamples;
			this.maxSize = instance.maxSize;
			this.rate = instance.rate;
			this.timeToLive = instance.timeToLive;
			this.timeout = instance.timeout;

		}
		/**
		 * An optional condition script that sampled documents must satisfy.
		 * <p>
		 * API name: {@code if}
		 */
		public final Builder if_(@Nullable String value) {
			this.if_ = value;
			return this;
		}

		/**
		 * Required - The name of the index or data stream.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The maximum number of documents to sample. Must be greater than 0 and less
		 * than or equal to 10,000.
		 * <p>
		 * API name: {@code max_samples}
		 */
		public final Builder maxSamples(@Nullable Integer value) {
			this.maxSamples = value;
			return this;
		}

		/**
		 * The maximum total size of sampled documents. Must be greater than 0 and less
		 * than or equal to 5GB.
		 * <p>
		 * API name: {@code max_size}
		 */
		public final Builder maxSize(@Nullable String value) {
			this.maxSize = value;
			return this;
		}

		/**
		 * Required - The fraction of documents to sample. Must be greater than 0 and
		 * less than or equal to 1. Can be specified as a number or a string.
		 * <p>
		 * API name: {@code rate}
		 */
		public final Builder rate(double value) {
			this.rate = value;
			return this;
		}

		/**
		 * The duration for which the sampled documents should be retained. Must be
		 * greater than 0 and less than or equal to 30 days.
		 * <p>
		 * API name: {@code time_to_live}
		 */
		public final Builder timeToLive(@Nullable Time value) {
			this.timeToLive = value;
			return this;
		}

		/**
		 * The duration for which the sampled documents should be retained. Must be
		 * greater than 0 and less than or equal to 30 days.
		 * <p>
		 * API name: {@code time_to_live}
		 */
		public final Builder timeToLive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeToLive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
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
		 * Builds a {@link PutSampleConfigurationRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSampleConfigurationRequest build() {
			_checkSingleUse();

			return new PutSampleConfigurationRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutSampleConfigurationRequest}
	 */
	public static final JsonpDeserializer<PutSampleConfigurationRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutSampleConfigurationRequest::setupPutSampleConfigurationRequestDeserializer);

	protected static void setupPutSampleConfigurationRequestDeserializer(
			ObjectDeserializer<PutSampleConfigurationRequest.Builder> op) {

		op.add(Builder::if_, JsonpDeserializer.stringDeserializer(), "if");
		op.add(Builder::maxSamples, JsonpDeserializer.integerDeserializer(), "max_samples");
		op.add(Builder::maxSize, JsonpDeserializer.stringDeserializer(), "max_size");
		op.add(Builder::rate, JsonpDeserializer.doubleDeserializer(), "rate");
		op.add(Builder::timeToLive, Time._DESERIALIZER, "time_to_live");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_sample_configuration}".
	 */
	public static final Endpoint<PutSampleConfigurationRequest, PutSampleConfigurationResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_sample_configuration",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_sample");
					buf.append("/config");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutSampleConfigurationResponse._DESERIALIZER);
}
