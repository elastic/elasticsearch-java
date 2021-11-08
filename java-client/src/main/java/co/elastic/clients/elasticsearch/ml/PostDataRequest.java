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
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.post_data.Request

public class PostDataRequest<TData> extends RequestBase implements JsonpSerializable {
	private final String jobId;

	@Nullable
	private final String resetEnd;

	@Nullable
	private final String resetStart;

	private final List<TData> data;

	@Nullable
	private final JsonpSerializer<TData> tDataSerializer;

	// ---------------------------------------------------------------------------------------------

	private PostDataRequest(Builder<TData> builder) {

		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.resetEnd = builder.resetEnd;
		this.resetStart = builder.resetStart;
		this.data = ModelTypeHelper.unmodifiableRequired(builder.data, this, "data");
		this.tDataSerializer = builder.tDataSerializer;

	}

	public static <TData> PostDataRequest<TData> of(
			Function<Builder<TData>, ObjectBuilder<PostDataRequest<TData>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - Identifier for the anomaly detection job. The job must have a
	 * state of open to receive and process the data.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Specifies the end of the bucket resetting range.
	 * <p>
	 * API name: {@code reset_end}
	 */
	@Nullable
	public final String resetEnd() {
		return this.resetEnd;
	}

	/**
	 * Specifies the start of the bucket resetting range.
	 * <p>
	 * API name: {@code reset_start}
	 */
	@Nullable
	public final String resetStart() {
		return this.resetStart;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<TData> data() {
		return this.data;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (TData item0 : this.data) {
			JsonpUtils.serialize(item0, generator, tDataSerializer, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostDataRequest}.
	 */
	public static class Builder<TData> extends ObjectBuilderBase implements ObjectBuilder<PostDataRequest<TData>> {
		private String jobId;

		@Nullable
		private String resetEnd;

		@Nullable
		private String resetStart;

		private List<TData> data;

		@Nullable
		private JsonpSerializer<TData> tDataSerializer;

		/**
		 * Required - Identifier for the anomaly detection job. The job must have a
		 * state of open to receive and process the data.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder<TData> jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Specifies the end of the bucket resetting range.
		 * <p>
		 * API name: {@code reset_end}
		 */
		public final Builder<TData> resetEnd(@Nullable String value) {
			this.resetEnd = value;
			return this;
		}

		/**
		 * Specifies the start of the bucket resetting range.
		 * <p>
		 * API name: {@code reset_start}
		 */
		public final Builder<TData> resetStart(@Nullable String value) {
			this.resetStart = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder<TData> data(List<TData> value) {
			this.data = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder<TData> data(TData... value) {
			this.data = Arrays.asList(value);
			return this;
		}

		/**
		 * Serializer for TData. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TData> tDataSerializer(@Nullable JsonpSerializer<TData> value) {
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
			_checkSingleUse();

			return new PostDataRequest<TData>(this);
		}
	}

	public static <TData> JsonpDeserializer<PostDataRequest<TData>> createPostDataRequestDeserializer(
			JsonpDeserializer<TData> tDataDeserializer) {

		JsonpDeserializer<List<TData>> valueDeserializer = JsonpDeserializer.arrayDeserializer(tDataDeserializer);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder<TData>()
				.data(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.post_data}".
	 */
	public static final Endpoint<PostDataRequest<?>, PostDataResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_data");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.resetStart != null) {
					params.put("reset_start", request.resetStart);
				}
				if (request.resetEnd != null) {
					params.put("reset_end", request.resetEnd);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PostDataResponse._DESERIALIZER);
}
