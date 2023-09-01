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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_overall_buckets.Request

/**
 * Retrieves overall bucket results that summarize the bucket results of
 * multiple anomaly detection jobs.
 * <p>
 * The <code>overall_score</code> is calculated by combining the scores of all
 * the buckets within the overall bucket span. First, the maximum
 * <code>anomaly_score</code> per anomaly detection job in the overall bucket is
 * calculated. Then the <code>top_n</code> of those scores are averaged to
 * result in the <code>overall_score</code>. This means that you can fine-tune
 * the <code>overall_score</code> so that it is more or less sensitive to the
 * number of jobs that detect an anomaly at the same time. For example, if you
 * set <code>top_n</code> to <code>1</code>, the <code>overall_score</code> is
 * the maximum bucket score in the overall bucket. Alternatively, if you set
 * <code>top_n</code> to the number of jobs, the <code>overall_score</code> is
 * high only when all jobs detect anomalies in that overall bucket. If you set
 * the <code>bucket_span</code> parameter (to a value greater than its default),
 * the <code>overall_score</code> is the maximum <code>overall_score</code> of
 * the overall buckets that have a span equal to the jobs' largest bucket span.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_overall_buckets.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetOverallBucketsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Time bucketSpan;

	@Nullable
	private final DateTime end;

	@Nullable
	private final Boolean excludeInterim;

	private final String jobId;

	@Nullable
	private final String overallScore;

	@Nullable
	private final DateTime start;

	@Nullable
	private final Integer topN;

	// ---------------------------------------------------------------------------------------------

	private GetOverallBucketsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.bucketSpan = builder.bucketSpan;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.overallScore = builder.overallScore;
		this.start = builder.start;
		this.topN = builder.topN;

	}

	public static GetOverallBucketsRequest of(Function<Builder, ObjectBuilder<GetOverallBucketsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Refer to the description for the <code>allow_no_match</code> query parameter.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Refer to the description for the <code>bucket_span</code> query parameter.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	@Nullable
	public final Time bucketSpan() {
		return this.bucketSpan;
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
	 * Refer to the description for the <code>overall_score</code> query parameter.
	 * <p>
	 * API name: {@code overall_score}
	 */
	@Nullable
	public final String overallScore() {
		return this.overallScore;
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
	 * Refer to the description for the <code>top_n</code> query parameter.
	 * <p>
	 * API name: {@code top_n}
	 */
	@Nullable
	public final Integer topN() {
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

		if (this.allowNoMatch != null) {
			generator.writeKey("allow_no_match");
			generator.write(this.allowNoMatch);

		}
		if (this.bucketSpan != null) {
			generator.writeKey("bucket_span");
			this.bucketSpan.serialize(generator, mapper);

		}
		if (this.end != null) {
			generator.writeKey("end");
			this.end.serialize(generator, mapper);
		}
		if (this.excludeInterim != null) {
			generator.writeKey("exclude_interim");
			generator.write(this.excludeInterim);

		}
		if (this.overallScore != null) {
			generator.writeKey("overall_score");
			generator.write(this.overallScore);

		}
		if (this.start != null) {
			generator.writeKey("start");
			this.start.serialize(generator, mapper);
		}
		if (this.topN != null) {
			generator.writeKey("top_n");
			generator.write(this.topN);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetOverallBucketsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetOverallBucketsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Time bucketSpan;

		@Nullable
		private DateTime end;

		@Nullable
		private Boolean excludeInterim;

		private String jobId;

		@Nullable
		private String overallScore;

		@Nullable
		private DateTime start;

		@Nullable
		private Integer topN;

		/**
		 * Refer to the description for the <code>allow_no_match</code> query parameter.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>bucket_span</code> query parameter.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(@Nullable Time value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>bucket_span</code> query parameter.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.bucketSpan(fn.apply(new Time.Builder()).build());
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
		 * Refer to the description for the <code>overall_score</code> query parameter.
		 * <p>
		 * API name: {@code overall_score}
		 */
		public final Builder overallScore(@Nullable String value) {
			this.overallScore = value;
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
		 * Refer to the description for the <code>top_n</code> query parameter.
		 * <p>
		 * API name: {@code top_n}
		 */
		public final Builder topN(@Nullable Integer value) {
			this.topN = value;
			return this;
		}

		@Override
		protected Builder self() {
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
	 * Json deserializer for {@link GetOverallBucketsRequest}
	 */
	public static final JsonpDeserializer<GetOverallBucketsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetOverallBucketsRequest::setupGetOverallBucketsRequestDeserializer);

	protected static void setupGetOverallBucketsRequestDeserializer(
			ObjectDeserializer<GetOverallBucketsRequest.Builder> op) {

		op.add(Builder::allowNoMatch, JsonpDeserializer.booleanDeserializer(), "allow_no_match");
		op.add(Builder::bucketSpan, Time._DESERIALIZER, "bucket_span");
		op.add(Builder::end, DateTime._DESERIALIZER, "end");
		op.add(Builder::excludeInterim, JsonpDeserializer.booleanDeserializer(), "exclude_interim");
		op.add(Builder::overallScore, JsonpDeserializer.stringDeserializer(), "overall_score");
		op.add(Builder::start, DateTime._DESERIALIZER, "start");
		op.add(Builder::topN, JsonpDeserializer.integerDeserializer(), "top_n");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_overall_buckets}".
	 */
	public static final Endpoint<GetOverallBucketsRequest, GetOverallBucketsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_overall_buckets",

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

			}, SimpleEndpoint.emptyMap(), true, GetOverallBucketsResponse._DESERIALIZER);
}
