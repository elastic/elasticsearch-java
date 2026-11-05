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

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
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

// typedef: data_recovery.get_rpo_series.Request

/**
 * Get the recovery point objective series.
 * <p>
 * Get, for each bucket in the half-open range <code>[start, end)</code>, the
 * maximum age that the newest recoverable state reached during that bucket.
 * This API is intended for internal operator use. The range is divided into at
 * most 1,000 buckets. A bucket has no value if no retained recovery point
 * covers its start.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.get_rpo_series.Request">API
 *      specification</a>
 */

public class GetRpoSeriesRequest extends RequestBase {
	@Nullable
	private final Time bucketDuration;

	@Nullable
	private final DateTime end;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final DateTime start;

	// ---------------------------------------------------------------------------------------------

	private GetRpoSeriesRequest(Builder builder) {

		this.bucketDuration = builder.bucketDuration;
		this.end = builder.end;
		this.masterTimeout = builder.masterTimeout;
		this.start = builder.start;

	}

	public static GetRpoSeriesRequest of(Function<Builder, ObjectBuilder<GetRpoSeriesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The duration of each bucket. It must be greater than zero, and the range must
	 * divide into at most 1,000 buckets.
	 * <p>
	 * API name: {@code bucket_duration}
	 */
	@Nullable
	public final Time bucketDuration() {
		return this.bucketDuration;
	}

	/**
	 * The exclusive end of the range, as a date or epoch milliseconds.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final DateTime end() {
		return this.end;
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. To
	 * indicate that the request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The inclusive start of the range, as a date or epoch milliseconds. When
	 * omitted, it is seven days before <code>end</code>, rounded down to a whole
	 * multiple of <code>bucket_duration</code>, so that repeated requests with
	 * default parameters return the same bucket boundaries.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final DateTime start() {
		return this.start;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRpoSeriesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetRpoSeriesRequest> {
		@Nullable
		private Time bucketDuration;

		@Nullable
		private DateTime end;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private DateTime start;

		public Builder() {
		}
		private Builder(GetRpoSeriesRequest instance) {
			this.bucketDuration = instance.bucketDuration;
			this.end = instance.end;
			this.masterTimeout = instance.masterTimeout;
			this.start = instance.start;

		}
		/**
		 * The duration of each bucket. It must be greater than zero, and the range must
		 * divide into at most 1,000 buckets.
		 * <p>
		 * API name: {@code bucket_duration}
		 */
		public final Builder bucketDuration(@Nullable Time value) {
			this.bucketDuration = value;
			return this;
		}

		/**
		 * The duration of each bucket. It must be greater than zero, and the range must
		 * divide into at most 1,000 buckets.
		 * <p>
		 * API name: {@code bucket_duration}
		 */
		public final Builder bucketDuration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.bucketDuration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The exclusive end of the range, as a date or epoch milliseconds.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable DateTime value) {
			this.end = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The inclusive start of the range, as a date or epoch milliseconds. When
		 * omitted, it is seven days before <code>end</code>, rounded down to a whole
		 * multiple of <code>bucket_duration</code>, so that repeated requests with
		 * default parameters return the same bucket boundaries.
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
		 * Builds a {@link GetRpoSeriesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRpoSeriesRequest build() {
			_checkSingleUse();

			return new GetRpoSeriesRequest(this);
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
	 * Endpoint "{@code data_recovery.get_rpo_series}".
	 */
	public static final Endpoint<GetRpoSeriesRequest, GetRpoSeriesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/data_recovery.get_rpo_series",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_data_recovery/rpo";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.start != null) {
					params.put("start", request.start.toString());
				}
				if (request.end != null) {
					params.put("end", request.end.toString());
				}
				if (request.bucketDuration != null) {
					params.put("bucket_duration", request.bucketDuration._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetRpoSeriesResponse._DESERIALIZER);
}
