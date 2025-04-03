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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml.post_data.Request

/**
 * Send data to an anomaly detection job for analysis.
 * <p>
 * IMPORTANT: For each job, data can be accepted from only a single connection
 * at a time. It is not currently possible to post data to multiple jobs using
 * wildcards or a comma-separated list.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.post_data.Request">API
 *      specification</a>
 * @deprecated 7.11.0 Posting data directly to anomaly detection jobs is
 *             deprecated, in a future major version a datafeed will be
 *             required.
 */
@Deprecated
@JsonpDeserializable
public class PostDataRequest<TData> extends RequestBase implements JsonpSerializable {
	private final String jobId;

	@Nullable
	private final DateTime resetEnd;

	@Nullable
	private final DateTime resetStart;

	private final List<TData> data;

	@Nullable
	private final JsonpSerializer<TData> tDataSerializer;

	// ---------------------------------------------------------------------------------------------

	private PostDataRequest(Builder<TData> builder) {

		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.resetEnd = builder.resetEnd;
		this.resetStart = builder.resetStart;
		this.data = ApiTypeHelper.unmodifiableRequired(builder.data, this, "data");
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
	public final DateTime resetEnd() {
		return this.resetEnd;
	}

	/**
	 * Specifies the start of the bucket resetting range.
	 * <p>
	 * API name: {@code reset_start}
	 */
	@Nullable
	public final DateTime resetStart() {
		return this.resetStart;
	}

	/**
	 * Required - Request body.
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
	@Deprecated
	public static class Builder<TData> extends RequestBase.AbstractBuilder<Builder<TData>>
			implements
				ObjectBuilder<PostDataRequest<TData>> {
		private String jobId;

		@Nullable
		private DateTime resetEnd;

		@Nullable
		private DateTime resetStart;

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
		public final Builder<TData> resetEnd(@Nullable DateTime value) {
			this.resetEnd = value;
			return this;
		}

		/**
		 * Specifies the start of the bucket resetting range.
		 * <p>
		 * API name: {@code reset_start}
		 */
		public final Builder<TData> resetStart(@Nullable DateTime value) {
			this.resetStart = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>data</code>.
		 */
		public final Builder<TData> data(List<TData> list) {
			this.data = _listAddAll(this.data, list);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds one or more values to <code>data</code>.
		 */
		public final Builder<TData> data(TData value, TData... values) {
			this.data = _listAdd(this.data, value, values);
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

		@Override
		public Builder<TData> withJson(JsonParser parser, JsonpMapper mapper) {
			JsonpDeserializer<JsonData> tDataDeserializer = JsonData._DESERIALIZER;

			@SuppressWarnings("unchecked")
			List<TData> value = (List<TData>) JsonpDeserializer.arrayDeserializer(tDataDeserializer).deserialize(parser,
					mapper);
			return this.data(value);
		}

		@Override
		protected Builder<TData> self() {
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

	/**
	 * Json deserializer for {@link PostDataRequest} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<PostDataRequest<Object>> _DESERIALIZER = createPostDataRequestDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:ml.post_data.Request.TData"));

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
	public static final Endpoint<PostDataRequest<?>, PostDataResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.post_data",

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
				if (request.resetStart != null) {
					params.put("reset_start", request.resetStart.toString());
				}
				if (request.resetEnd != null) {
					params.put("reset_end", request.resetEnd.toString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PostDataResponse._DESERIALIZER);
}
