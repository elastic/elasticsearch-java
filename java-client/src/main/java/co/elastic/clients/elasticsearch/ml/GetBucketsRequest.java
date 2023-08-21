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
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_buckets.Request

/**
 * Retrieves anomaly detection job results for one or more buckets. The API
 * presents a chronological view of the records, grouped by bucket.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_buckets.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetBucketsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Double anomalyScore;

	@Nullable
	private final Boolean desc;

	@Nullable
	private final DateTime end;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Boolean expand;

	@Nullable
	private final Integer from;

	private final String jobId;

	@Nullable
	private final Page page;

	@Nullable
	private final Integer size;

	@Nullable
	private final String sort;

	@Nullable
	private final DateTime start;

	@Nullable
	private final DateTime timestamp;

	// ---------------------------------------------------------------------------------------------

	private GetBucketsRequest(Builder builder) {

		this.anomalyScore = builder.anomalyScore;
		this.desc = builder.desc;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.expand = builder.expand;
		this.from = builder.from;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.page = builder.page;
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;
		this.timestamp = builder.timestamp;

	}

	public static GetBucketsRequest of(Function<Builder, ObjectBuilder<GetBucketsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Refer to the description for the <code>anomaly_score</code> query parameter.
	 * <p>
	 * API name: {@code anomaly_score}
	 */
	@Nullable
	public final Double anomalyScore() {
		return this.anomalyScore;
	}

	/**
	 * Refer to the description for the <code>desc</code> query parameter.
	 * <p>
	 * API name: {@code desc}
	 */
	@Nullable
	public final Boolean desc() {
		return this.desc;
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
	 * Refer to the description for the <code>exclude_interim</code> query
	 * parameter.
	 * <p>
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public final Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * Refer to the description for the <code>expand</code> query parameter.
	 * <p>
	 * API name: {@code expand}
	 */
	@Nullable
	public final Boolean expand() {
		return this.expand;
	}

	/**
	 * Skips the specified number of buckets.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
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
	 * API name: {@code page}
	 */
	@Nullable
	public final Page page() {
		return this.page;
	}

	/**
	 * Specifies the maximum number of buckets to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Refer to the desription for the <code>sort</code> query parameter.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final String sort() {
		return this.sort;
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
	 * The timestamp of a single bucket result. If you do not specify this
	 * parameter, the API returns information about all buckets.
	 * <p>
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final DateTime timestamp() {
		return this.timestamp;
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

		if (this.anomalyScore != null) {
			generator.writeKey("anomaly_score");
			generator.write(this.anomalyScore);

		}
		if (this.desc != null) {
			generator.writeKey("desc");
			generator.write(this.desc);

		}
		if (this.end != null) {
			generator.writeKey("end");
			this.end.serialize(generator, mapper);
		}
		if (this.excludeInterim != null) {
			generator.writeKey("exclude_interim");
			generator.write(this.excludeInterim);

		}
		if (this.expand != null) {
			generator.writeKey("expand");
			generator.write(this.expand);

		}
		if (this.page != null) {
			generator.writeKey("page");
			this.page.serialize(generator, mapper);

		}
		if (this.sort != null) {
			generator.writeKey("sort");
			generator.write(this.sort);

		}
		if (this.start != null) {
			generator.writeKey("start");
			this.start.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBucketsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetBucketsRequest> {
		@Nullable
		private Double anomalyScore;

		@Nullable
		private Boolean desc;

		@Nullable
		private DateTime end;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Boolean expand;

		@Nullable
		private Integer from;

		private String jobId;

		@Nullable
		private Page page;

		@Nullable
		private Integer size;

		@Nullable
		private String sort;

		@Nullable
		private DateTime start;

		@Nullable
		private DateTime timestamp;

		/**
		 * Refer to the description for the <code>anomaly_score</code> query parameter.
		 * <p>
		 * API name: {@code anomaly_score}
		 */
		public final Builder anomalyScore(@Nullable Double value) {
			this.anomalyScore = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>desc</code> query parameter.
		 * <p>
		 * API name: {@code desc}
		 */
		public final Builder desc(@Nullable Boolean value) {
			this.desc = value;
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
		 * Refer to the description for the <code>exclude_interim</code> query
		 * parameter.
		 * <p>
		 * API name: {@code exclude_interim}
		 */
		public final Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>expand</code> query parameter.
		 * <p>
		 * API name: {@code expand}
		 */
		public final Builder expand(@Nullable Boolean value) {
			this.expand = value;
			return this;
		}

		/**
		 * Skips the specified number of buckets.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
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
		 * API name: {@code page}
		 */
		public final Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public final Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * Specifies the maximum number of buckets to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Refer to the desription for the <code>sort</code> query parameter.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable String value) {
			this.sort = value;
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

		/**
		 * The timestamp of a single bucket result. If you do not specify this
		 * parameter, the API returns information about all buckets.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable DateTime value) {
			this.timestamp = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetBucketsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBucketsRequest build() {
			_checkSingleUse();

			return new GetBucketsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetBucketsRequest}
	 */
	public static final JsonpDeserializer<GetBucketsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetBucketsRequest::setupGetBucketsRequestDeserializer);

	protected static void setupGetBucketsRequestDeserializer(ObjectDeserializer<GetBucketsRequest.Builder> op) {

		op.add(Builder::anomalyScore, JsonpDeserializer.doubleDeserializer(), "anomaly_score");
		op.add(Builder::desc, JsonpDeserializer.booleanDeserializer(), "desc");
		op.add(Builder::end, DateTime._DESERIALIZER, "end");
		op.add(Builder::excludeInterim, JsonpDeserializer.booleanDeserializer(), "exclude_interim");
		op.add(Builder::expand, JsonpDeserializer.booleanDeserializer(), "expand");
		op.add(Builder::page, Page._DESERIALIZER, "page");
		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::start, DateTime._DESERIALIZER, "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_buckets}".
	 */
	public static final Endpoint<GetBucketsRequest, GetBucketsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_buckets",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;
				final int _timestamp = 1 << 1;

				int propsSet = 0;

				propsSet |= _jobId;
				if (request.timestamp() != null)
					propsSet |= _timestamp;

				if (propsSet == (_jobId | _timestamp)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/results");
					buf.append("/buckets");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.timestamp.toString(), buf);
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/results");
					buf.append("/buckets");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _jobId = 1 << 0;
				final int _timestamp = 1 << 1;

				int propsSet = 0;

				propsSet |= _jobId;
				if (request.timestamp() != null)
					propsSet |= _timestamp;

				if (propsSet == (_jobId | _timestamp)) {
					params.put("jobId", request.jobId);
					params.put("timestamp", request.timestamp.toString());
				}
				if (propsSet == (_jobId)) {
					params.put("jobId", request.jobId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetBucketsResponse._DESERIALIZER);
}
