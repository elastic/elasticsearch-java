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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_overall_buckets.Request
@JsonpDeserializable
public final class GetOverallBucketsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoJobs;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final String bucketSpan;

	@Nullable
	private final String end;

	@Nullable
	private final Boolean excludeInterim;

	private final String jobId;

	@Nullable
	private final String overallScore;

	@Nullable
	private final String start;

	@Nullable
	private final Integer topN;

	// ---------------------------------------------------------------------------------------------

	public GetOverallBucketsRequest(Builder builder) {

		this.allowNoJobs = builder.allowNoJobs;
		this.allowNoMatch = builder.allowNoMatch;
		this.bucketSpan = builder.bucketSpan;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.overallScore = builder.overallScore;
		this.start = builder.start;
		this.topN = builder.topN;

	}

	public GetOverallBucketsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code allow_no_jobs}
	 */
	@Nullable
	public Boolean allowNoJobs() {
		return this.allowNoJobs;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no jobs. (This includes
	 * <code>_all</code> string or when no jobs have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * The span of the overall buckets. Must be greater or equal to the largest
	 * bucket span of the specified anomaly detection jobs, which is the default
	 * value.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	@Nullable
	public String bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * Returns overall buckets with timestamps earlier than this time.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
	}

	/**
	 * If true, the output excludes interim results. By default, interim results are
	 * included.
	 * <p>
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * Required - Identifier for the anomaly detection job. It can be a job
	 * identifier, a group name, a comma-separated list of jobs or groups, or a
	 * wildcard expression.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Returns overall buckets with overall scores greater than or equal to this
	 * value.
	 * <p>
	 * API name: {@code overall_score}
	 */
	@Nullable
	public String overallScore() {
		return this.overallScore;
	}

	/**
	 * Returns overall buckets with timestamps after this time.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * The number of top anomaly detection job bucket scores to be used in the
	 * overall_score calculation.
	 * <p>
	 * API name: {@code top_n}
	 */
	@Nullable
	public Integer topN() {
		return this.topN;
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

		if (this.allowNoJobs != null) {

			generator.writeKey("allow_no_jobs");
			generator.write(this.allowNoJobs);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetOverallBucketsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetOverallBucketsRequest> {
		@Nullable
		private Boolean allowNoJobs;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private String bucketSpan;

		@Nullable
		private String end;

		@Nullable
		private Boolean excludeInterim;

		private String jobId;

		@Nullable
		private String overallScore;

		@Nullable
		private String start;

		@Nullable
		private Integer topN;

		/**
		 * API name: {@code allow_no_jobs}
		 */
		public Builder allowNoJobs(@Nullable Boolean value) {
			this.allowNoJobs = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no jobs. (This includes
		 * <code>_all</code> string or when no jobs have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * The span of the overall buckets. Must be greater or equal to the largest
		 * bucket span of the specified anomaly detection jobs, which is the default
		 * value.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(@Nullable String value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * Returns overall buckets with timestamps earlier than this time.
		 * <p>
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * If true, the output excludes interim results. By default, interim results are
		 * included.
		 * <p>
		 * API name: {@code exclude_interim}
		 */
		public Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job. It can be a job
		 * identifier, a group name, a comma-separated list of jobs or groups, or a
		 * wildcard expression.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Returns overall buckets with overall scores greater than or equal to this
		 * value.
		 * <p>
		 * API name: {@code overall_score}
		 */
		public Builder overallScore(@Nullable String value) {
			this.overallScore = value;
			return this;
		}

		/**
		 * Returns overall buckets with timestamps after this time.
		 * <p>
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * The number of top anomaly detection job bucket scores to be used in the
		 * overall_score calculation.
		 * <p>
		 * API name: {@code top_n}
		 */
		public Builder topN(@Nullable Integer value) {
			this.topN = value;
			return this;
		}

		/**
		 * Builds a {@link GetOverallBucketsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetOverallBucketsRequest build() {

			return new GetOverallBucketsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetOverallBucketsRequest}
	 */
	public static final JsonpDeserializer<GetOverallBucketsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetOverallBucketsRequest::setupGetOverallBucketsRequestDeserializer, Builder::build);

	protected static void setupGetOverallBucketsRequestDeserializer(
			DelegatingDeserializer<GetOverallBucketsRequest.Builder> op) {

		op.add(Builder::allowNoJobs, JsonpDeserializer.booleanDeserializer(), "allow_no_jobs");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_overall_buckets}".
	 */
	public static final Endpoint<GetOverallBucketsRequest, GetOverallBucketsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/results");
					buf.append("/overall_buckets");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.topN != null) {
					params.put("top_n", String.valueOf(request.topN));
				}
				if (request.excludeInterim != null) {
					params.put("exclude_interim", String.valueOf(request.excludeInterim));
				}
				if (request.bucketSpan != null) {
					params.put("bucket_span", request.bucketSpan);
				}
				if (request.start != null) {
					params.put("start", request.start);
				}
				if (request.end != null) {
					params.put("end", request.end);
				}
				if (request.overallScore != null) {
					params.put("overall_score", request.overallScore);
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetOverallBucketsResponse._DESERIALIZER);
}
