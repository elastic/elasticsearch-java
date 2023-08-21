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

// typedef: ml.get_influencers.Request

/**
 * Retrieves anomaly detection job results for one or more influencers.
 * Influencers are the entities that have contributed to, or are to blame for,
 * the anomalies. Influencer results are available only if an
 * <code>influencer_field_name</code> is specified in the job configuration.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_influencers.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetInfluencersRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean desc;

	@Nullable
	private final DateTime end;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Integer from;

	@Nullable
	private final Double influencerScore;

	private final String jobId;

	@Nullable
	private final Page page;

	@Nullable
	private final Integer size;

	@Nullable
	private final String sort;

	@Nullable
	private final DateTime start;

	// ---------------------------------------------------------------------------------------------

	private GetInfluencersRequest(Builder builder) {

		this.desc = builder.desc;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.from = builder.from;
		this.influencerScore = builder.influencerScore;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.page = builder.page;
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;

	}

	public static GetInfluencersRequest of(Function<Builder, ObjectBuilder<GetInfluencersRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, the results are sorted in descending order.
	 * <p>
	 * API name: {@code desc}
	 */
	@Nullable
	public final Boolean desc() {
		return this.desc;
	}

	/**
	 * Returns influencers with timestamps earlier than this time. The default value
	 * means it is unset and results are not limited to specific timestamps.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final DateTime end() {
		return this.end;
	}

	/**
	 * If true, the output excludes interim results. By default, interim results are
	 * included.
	 * <p>
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public final Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * Skips the specified number of influencers.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Returns influencers with anomaly scores greater than or equal to this value.
	 * <p>
	 * API name: {@code influencer_score}
	 */
	@Nullable
	public final Double influencerScore() {
		return this.influencerScore;
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
	 * Specifies the maximum number of influencers to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Specifies the sort field for the requested influencers. By default, the
	 * influencers are sorted by the <code>influencer_score</code> value.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final String sort() {
		return this.sort;
	}

	/**
	 * Returns influencers with timestamps after this time. The default value means
	 * it is unset and results are not limited to specific timestamps.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final DateTime start() {
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

		if (this.page != null) {
			generator.writeKey("page");
			this.page.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetInfluencersRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetInfluencersRequest> {
		@Nullable
		private Boolean desc;

		@Nullable
		private DateTime end;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Integer from;

		@Nullable
		private Double influencerScore;

		private String jobId;

		@Nullable
		private Page page;

		@Nullable
		private Integer size;

		@Nullable
		private String sort;

		@Nullable
		private DateTime start;

		/**
		 * If true, the results are sorted in descending order.
		 * <p>
		 * API name: {@code desc}
		 */
		public final Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * Returns influencers with timestamps earlier than this time. The default value
		 * means it is unset and results are not limited to specific timestamps.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable DateTime value) {
			this.end = value;
			return this;
		}

		/**
		 * If true, the output excludes interim results. By default, interim results are
		 * included.
		 * <p>
		 * API name: {@code exclude_interim}
		 */
		public final Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * Skips the specified number of influencers.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Returns influencers with anomaly scores greater than or equal to this value.
		 * <p>
		 * API name: {@code influencer_score}
		 */
		public final Builder influencerScore(@Nullable Double value) {
			this.influencerScore = value;
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
		 * Specifies the maximum number of influencers to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Specifies the sort field for the requested influencers. By default, the
		 * influencers are sorted by the <code>influencer_score</code> value.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * Returns influencers with timestamps after this time. The default value means
		 * it is unset and results are not limited to specific timestamps.
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
		 * Builds a {@link GetInfluencersRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInfluencersRequest build() {
			_checkSingleUse();

			return new GetInfluencersRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetInfluencersRequest}
	 */
	public static final JsonpDeserializer<GetInfluencersRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetInfluencersRequest::setupGetInfluencersRequestDeserializer);

	protected static void setupGetInfluencersRequestDeserializer(ObjectDeserializer<GetInfluencersRequest.Builder> op) {

		op.add(Builder::page, Page._DESERIALIZER, "page");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_influencers}".
	 */
	public static final Endpoint<GetInfluencersRequest, GetInfluencersResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_influencers",

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
					buf.append("/influencers");
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
				Map<String, String> params = new HashMap<>();
				if (request.excludeInterim != null) {
					params.put("exclude_interim", String.valueOf(request.excludeInterim));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.start != null) {
					params.put("start", request.start.toString());
				}
				if (request.end != null) {
					params.put("end", request.end.toString());
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.sort != null) {
					params.put("sort", request.sort);
				}
				if (request.influencerScore != null) {
					params.put("influencer_score", String.valueOf(request.influencerScore));
				}
				if (request.desc != null) {
					params.put("desc", String.valueOf(request.desc));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetInfluencersResponse._DESERIALIZER);
}
