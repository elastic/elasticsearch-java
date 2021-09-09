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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.post_data.Request
public final class PostDataRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final String resetEnd;

	@Nullable
	private final String resetStart;

	@Nullable
	private final List<JsonValue> data;

	// ---------------------------------------------------------------------------------------------

	protected PostDataRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.resetEnd = builder.resetEnd;
		this.resetStart = builder.resetStart;
		this.data = builder.data;

	}

	/**
	 * The name of the job receiving the data
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Optional parameter to specify the end of the bucket resetting range
	 * <p>
	 * API name: {@code reset_end}
	 */
	@Nullable
	public String resetEnd() {
		return this.resetEnd;
	}

	/**
	 * Optional parameter to specify the start of the bucket resetting range
	 * <p>
	 * API name: {@code reset_start}
	 */
	@Nullable
	public String resetStart() {
		return this.resetStart;
	}

	/**
	 * API name: {@code data}
	 */
	@Nullable
	public List<JsonValue> data() {
		return this.data;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.data != null) {

			generator.writeKey("data");
			generator.writeStartArray();
			for (JsonValue item0 : this.data) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostDataRequest}.
	 */
	public static class Builder implements ObjectBuilder<PostDataRequest> {
		private String jobId;

		@Nullable
		private String resetEnd;

		@Nullable
		private String resetStart;

		@Nullable
		private List<JsonValue> data;

		/**
		 * The name of the job receiving the data
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Optional parameter to specify the end of the bucket resetting range
		 * <p>
		 * API name: {@code reset_end}
		 */
		public Builder resetEnd(@Nullable String value) {
			this.resetEnd = value;
			return this;
		}

		/**
		 * Optional parameter to specify the start of the bucket resetting range
		 * <p>
		 * API name: {@code reset_start}
		 */
		public Builder resetStart(@Nullable String value) {
			this.resetStart = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder data(@Nullable List<JsonValue> value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder data(JsonValue... value) {
			this.data = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #data(List)}, creating the list if needed.
		 */
		public Builder addData(JsonValue value) {
			if (this.data == null) {
				this.data = new ArrayList<>();
			}
			this.data.add(value);
			return this;
		}

		/**
		 * Builds a {@link PostDataRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostDataRequest build() {

			return new PostDataRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PostDataRequest
	 */
	public static final JsonpDeserializer<PostDataRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PostDataRequest::setupPostDataRequestDeserializer);

	protected static void setupPostDataRequestDeserializer(DelegatingDeserializer<PostDataRequest.Builder> op) {

		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "data");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.post_data}".
	 */
	public static final Endpoint<PostDataRequest, PostDataResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/_data");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.resetEnd != null) {
					params.put("reset_end", request.resetEnd);
				}
				if (request.resetStart != null) {
					params.put("reset_start", request.resetStart);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PostDataResponse.DESERIALIZER);
}
