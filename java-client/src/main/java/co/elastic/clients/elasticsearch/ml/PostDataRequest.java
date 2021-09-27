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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: ml.post_data.Request

public final class PostDataRequest<TData> extends RequestBase implements JsonpSerializable {
	private final String jobId;

	@Nullable
	private final String resetEnd;

	@Nullable
	private final String resetStart;

	private final List<TData> value;

	@Nullable
	private final JsonpSerializer<TData> tDataSerializer;

	// ---------------------------------------------------------------------------------------------

	public PostDataRequest(Builder<TData> builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.resetEnd = builder.resetEnd;
		this.resetStart = builder.resetStart;
		this.value = Objects.requireNonNull(builder.value, "value");
		this.tDataSerializer = builder.tDataSerializer;

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
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public List<TData> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (TData item0 : this.value) {
			JsonpUtils.serialize(item0, generator, tDataSerializer, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostDataRequest}.
	 */
	public static class Builder<TData> implements ObjectBuilder<PostDataRequest<TData>> {
		private String jobId;

		@Nullable
		private String resetEnd;

		@Nullable
		private String resetStart;

		private List<TData> value;

		@Nullable
		private JsonpSerializer<TData> tDataSerializer;

		/**
		 * The name of the job receiving the data
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder<TData> jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Optional parameter to specify the end of the bucket resetting range
		 * <p>
		 * API name: {@code reset_end}
		 */
		public Builder<TData> resetEnd(@Nullable String value) {
			this.resetEnd = value;
			return this;
		}

		/**
		 * Optional parameter to specify the start of the bucket resetting range
		 * <p>
		 * API name: {@code reset_start}
		 */
		public Builder<TData> resetStart(@Nullable String value) {
			this.resetStart = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder<TData> value(List<TData> value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder<TData> value(TData... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder<TData> addValue(TData value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Serializer for TData. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TData> tDataSerializer(@Nullable JsonpSerializer<TData> value) {
			this.tDataSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link PostDataRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostDataRequest<TData> build() {

			return new PostDataRequest<TData>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for PostDataRequest
	 */
	public static <TData> JsonpDeserializer<PostDataRequest<TData>> createPostDataRequestDeserializer(
			JsonpDeserializer<TData> tDataDeserializer) {
		return ObjectBuilderDeserializer.createForValue((Supplier<Builder<TData>>) Builder::new,
				op -> PostDataRequest.setupPostDataRequestDeserializer(op, tDataDeserializer));
	};

	protected static <TData> void setupPostDataRequestDeserializer(
			DelegatingDeserializer<PostDataRequest.Builder<TData>> op, JsonpDeserializer<TData> tDataDeserializer) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(tDataDeserializer), "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.post_data}".
	 */
	public static final Endpoint<PostDataRequest<?>, PostDataResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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

			}, Endpoint.Simple.emptyMap(), true, PostDataResponse._DESERIALIZER);
}
