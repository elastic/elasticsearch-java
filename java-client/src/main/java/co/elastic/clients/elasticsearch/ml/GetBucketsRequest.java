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
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_buckets.Request
@JsonpDeserializable
public class GetBucketsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Double anomalyScore;

	@Nullable
	private final Boolean desc;

	@Nullable
	private final String end;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Boolean expand;

	@Nullable
	private final Integer from;

	private final String jobId;

	@Nullable
	private final Integer size;

	@Nullable
	private final String sort;

	@Nullable
	private final String start;

	@Nullable
	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	private GetBucketsRequest(Builder builder) {

		this.anomalyScore = builder.anomalyScore;
		this.desc = builder.desc;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.expand = builder.expand;
		this.from = builder.from;
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;
		this.timestamp = builder.timestamp;

	}

	public static GetBucketsRequest of(Function<Builder, ObjectBuilder<GetBucketsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Returns buckets with anomaly scores greater or equal than this value.
	 * <p>
	 * API name: {@code anomaly_score}
	 */
	@Nullable
	public final Double anomalyScore() {
		return this.anomalyScore;
	}

	/**
	 * If <code>true</code>, the buckets are sorted in descending order.
	 * <p>
	 * API name: {@code desc}
	 */
	@Nullable
	public final Boolean desc() {
		return this.desc;
	}

	/**
	 * Returns buckets with timestamps earlier than this time. <code>-1</code> means
	 * it is unset and results are not limited to specific timestamps.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final String end() {
		return this.end;
	}

	/**
	 * If <code>true</code>, the output excludes interim results.
	 * <p>
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public final Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * If true, the output includes anomaly records.
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
	 * Specifies the maximum number of buckets to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Specifies the sort field for the requested buckets.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final String sort() {
		return this.sort;
	}

	/**
	 * Returns buckets with timestamps after this time. <code>-1</code> means it is
	 * unset and results are not limited to specific timestamps.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final String start() {
		return this.start;
	}

	/**
	 * The timestamp of a single bucket result. If you do not specify this
	 * parameter, the API returns information about all buckets.
	 * <p>
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final String timestamp() {
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
			generator.write(this.end);

		}
		if (this.excludeInterim != null) {
			generator.writeKey("exclude_interim");
			generator.write(this.excludeInterim);

		}
		if (this.expand != null) {
			generator.writeKey("expand");
			generator.write(this.expand);

		}
		if (this.sort != null) {
			generator.writeKey("sort");
			generator.write(this.sort);

		}
		if (this.start != null) {
			generator.writeKey("start");
			generator.write(this.start);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBucketsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetBucketsRequest> {
		@Nullable
		private Double anomalyScore;

		@Nullable
		private Boolean desc;

		@Nullable
		private String end;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Boolean expand;

		@Nullable
		private Integer from;

		private String jobId;

		@Nullable
		private Integer size;

		@Nullable
		private String sort;

		@Nullable
		private String start;

		@Nullable
		private String timestamp;

		/**
		 * Returns buckets with anomaly scores greater or equal than this value.
		 * <p>
		 * API name: {@code anomaly_score}
		 */
		public final Builder anomalyScore(@Nullable Double value) {
			this.anomalyScore = value;
			return this;
		}

		/**
		 * If <code>true</code>, the buckets are sorted in descending order.
		 * <p>
		 * API name: {@code desc}
		 */
		public final Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * Returns buckets with timestamps earlier than this time. <code>-1</code> means
		 * it is unset and results are not limited to specific timestamps.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * If <code>true</code>, the output excludes interim results.
		 * <p>
		 * API name: {@code exclude_interim}
		 */
		public final Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * If true, the output includes anomaly records.
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
		 * Specifies the maximum number of buckets to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Specifies the sort field for the requested buckets.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * Returns buckets with timestamps after this time. <code>-1</code> means it is
		 * unset and results are not limited to specific timestamps.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * The timestamp of a single bucket result. If you do not specify this
		 * parameter, the API returns information about all buckets.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable String value) {
			this.timestamp = value;
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
			.lazy(Builder::new, GetBucketsRequest::setupGetBucketsRequestDeserializer, Builder::build);

	protected static void setupGetBucketsRequestDeserializer(DelegatingDeserializer<GetBucketsRequest.Builder> op) {

		op.add(Builder::anomalyScore, JsonpDeserializer.doubleDeserializer(), "anomaly_score");
		op.add(Builder::desc, JsonpDeserializer.booleanDeserializer(), "desc");
		op.add(Builder::end, JsonpDeserializer.stringDeserializer(), "end");
		op.add(Builder::excludeInterim, JsonpDeserializer.booleanDeserializer(), "exclude_interim");
		op.add(Builder::expand, JsonpDeserializer.booleanDeserializer(), "expand");
		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::start, JsonpDeserializer.stringDeserializer(), "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_buckets}".
	 */
	public static final Endpoint<GetBucketsRequest, GetBucketsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					SimpleEndpoint.pathEncode(request.timestamp, buf);
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
