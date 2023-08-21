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

// typedef: ml.get_records.Request

/**
 * Retrieves anomaly records for an anomaly detection job. Records contain the
 * detailed analytical results. They describe the anomalous activity that has
 * been identified in the input data based on the detector configuration. There
 * can be many anomaly records depending on the characteristics and size of the
 * input data. In practice, there are often too many to be able to manually
 * process them. The machine learning features therefore perform a sophisticated
 * aggregation of the anomaly records into buckets. The number of record results
 * depends on the number of anomalies found in each bucket, which relates to the
 * number of time series being modeled and the number of detectors.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_records.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRecordsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean desc;

	@Nullable
	private final DateTime end;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Integer from;

	private final String jobId;

	@Nullable
	private final Page page;

	@Nullable
	private final Double recordScore;

	@Nullable
	private final Integer size;

	@Nullable
	private final String sort;

	@Nullable
	private final DateTime start;

	// ---------------------------------------------------------------------------------------------

	private GetRecordsRequest(Builder builder) {

		this.desc = builder.desc;
		this.end = builder.end;
		this.excludeInterim = builder.excludeInterim;
		this.from = builder.from;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.page = builder.page;
		this.recordScore = builder.recordScore;
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;

	}

	public static GetRecordsRequest of(Function<Builder, ObjectBuilder<GetRecordsRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Skips the specified number of records.
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
	 * Refer to the description for the <code>record_score</code> query parameter.
	 * <p>
	 * API name: {@code record_score}
	 */
	@Nullable
	public final Double recordScore() {
		return this.recordScore;
	}

	/**
	 * Specifies the maximum number of records to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Refer to the description for the <code>sort</code> query parameter.
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

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
		if (this.page != null) {
			generator.writeKey("page");
			this.page.serialize(generator, mapper);

		}
		if (this.recordScore != null) {
			generator.writeKey("record_score");
			generator.write(this.recordScore);

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
	 * Builder for {@link GetRecordsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetRecordsRequest> {
		@Nullable
		private Boolean desc;

		@Nullable
		private DateTime end;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Integer from;

		private String jobId;

		@Nullable
		private Page page;

		@Nullable
		private Double recordScore;

		@Nullable
		private Integer size;

		@Nullable
		private String sort;

		@Nullable
		private DateTime start;

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
		 * Skips the specified number of records.
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
		 * Refer to the description for the <code>record_score</code> query parameter.
		 * <p>
		 * API name: {@code record_score}
		 */
		public final Builder recordScore(@Nullable Double value) {
			this.recordScore = value;
			return this;
		}

		/**
		 * Specifies the maximum number of records to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>sort</code> query parameter.
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRecordsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecordsRequest build() {
			_checkSingleUse();

			return new GetRecordsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRecordsRequest}
	 */
	public static final JsonpDeserializer<GetRecordsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRecordsRequest::setupGetRecordsRequestDeserializer);

	protected static void setupGetRecordsRequestDeserializer(ObjectDeserializer<GetRecordsRequest.Builder> op) {

		op.add(Builder::desc, JsonpDeserializer.booleanDeserializer(), "desc");
		op.add(Builder::end, DateTime._DESERIALIZER, "end");
		op.add(Builder::excludeInterim, JsonpDeserializer.booleanDeserializer(), "exclude_interim");
		op.add(Builder::page, Page._DESERIALIZER, "page");
		op.add(Builder::recordScore, JsonpDeserializer.doubleDeserializer(), "record_score");
		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::start, DateTime._DESERIALIZER, "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_records}".
	 */
	public static final Endpoint<GetRecordsRequest, GetRecordsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_records",

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
					buf.append("/records");
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
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetRecordsResponse._DESERIALIZER);
}
