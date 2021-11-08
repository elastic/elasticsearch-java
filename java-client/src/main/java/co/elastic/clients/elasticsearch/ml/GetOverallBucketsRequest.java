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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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

public class GetOverallBucketsRequest extends RequestBase {
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

	private GetOverallBucketsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.bucketSpan = builder.bucketSpan;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.overallScore = builder.overallScore;
		this.start = builder.start;
		this.topN = builder.topN;

	}

	public static GetOverallBucketsRequest of(Function<Builder, ObjectBuilder<GetOverallBucketsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request:
	 * <ol>
	 * <li>Contains wildcard expressions and there are no jobs that match.</li>
	 * <li>Contains the <code>_all</code> string or no identifiers and there are no
	 * matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ol>
	 * <p>
	 * If <code>true</code>, the request returns an empty <code>jobs</code> array
	 * when there are no matches and the subset of results when there are partial
	 * matches. If this parameter is <code>false</code>, the request returns a
	 * <code>404</code> status code when there are no matches or only partial
	 * matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * The span of the overall buckets. Must be greater or equal to the largest
	 * bucket span of the specified anomaly detection jobs, which is the default
	 * value.
	 * <p>
	 * By default, an overall bucket has a span equal to the largest bucket span of
	 * the specified anomaly detection jobs. To override that behavior, use the
	 * optional <code>bucket_span</code> parameter.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	@Nullable
	public final String bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * Returns overall buckets with timestamps earlier than this time.
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
	 * Required - Identifier for the anomaly detection job. It can be a job
	 * identifier, a group name, a comma-separated list of jobs or groups, or a
	 * wildcard expression.
	 * <p>
	 * You can summarize the bucket results for all anomaly detection jobs by using
	 * <code>_all</code> or by specifying <code>*</code> as the
	 * <code>&lt;job_id&gt;</code>.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Returns overall buckets with overall scores greater than or equal to this
	 * value.
	 * <p>
	 * API name: {@code overall_score}
	 */
	@Nullable
	public final String overallScore() {
		return this.overallScore;
	}

	/**
	 * Returns overall buckets with timestamps after this time.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final String start() {
		return this.start;
	}

	/**
	 * The number of top anomaly detection job bucket scores to be used in the
	 * <code>overall_score</code> calculation.
	 * <p>
	 * API name: {@code top_n}
	 */
	@Nullable
	public final Integer topN() {
		return this.topN;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetOverallBucketsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetOverallBucketsRequest> {
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
		 * Specifies what to do when the request:
		 * <ol>
		 * <li>Contains wildcard expressions and there are no jobs that match.</li>
		 * <li>Contains the <code>_all</code> string or no identifiers and there are no
		 * matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ol>
		 * <p>
		 * If <code>true</code>, the request returns an empty <code>jobs</code> array
		 * when there are no matches and the subset of results when there are partial
		 * matches. If this parameter is <code>false</code>, the request returns a
		 * <code>404</code> status code when there are no matches or only partial
		 * matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * The span of the overall buckets. Must be greater or equal to the largest
		 * bucket span of the specified anomaly detection jobs, which is the default
		 * value.
		 * <p>
		 * By default, an overall bucket has a span equal to the largest bucket span of
		 * the specified anomaly detection jobs. To override that behavior, use the
		 * optional <code>bucket_span</code> parameter.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(@Nullable String value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * Returns overall buckets with timestamps earlier than this time.
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
		 * Required - Identifier for the anomaly detection job. It can be a job
		 * identifier, a group name, a comma-separated list of jobs or groups, or a
		 * wildcard expression.
		 * <p>
		 * You can summarize the bucket results for all anomaly detection jobs by using
		 * <code>_all</code> or by specifying <code>*</code> as the
		 * <code>&lt;job_id&gt;</code>.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Returns overall buckets with overall scores greater than or equal to this
		 * value.
		 * <p>
		 * API name: {@code overall_score}
		 */
		public final Builder overallScore(@Nullable String value) {
			this.overallScore = value;
			return this;
		}

		/**
		 * Returns overall buckets with timestamps after this time.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * The number of top anomaly detection job bucket scores to be used in the
		 * <code>overall_score</code> calculation.
		 * <p>
		 * API name: {@code top_n}
		 */
		public final Builder topN(@Nullable Integer value) {
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
			_checkSingleUse();

			return new GetOverallBucketsRequest(this);
		}
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
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.overallScore != null) {
					params.put("overall_score", request.overallScore);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetOverallBucketsResponse._DESERIALIZER);
}
