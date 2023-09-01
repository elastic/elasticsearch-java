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

// typedef: ml.update_data_frame_analytics.Request

/**
 * Updates an existing data frame analytics job.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.update_data_frame_analytics.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateDataFrameAnalyticsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowLazyStart;

	@Nullable
	private final String description;

	private final String id;

	@Nullable
	private final Integer maxNumThreads;

	@Nullable
	private final String modelMemoryLimit;

	// ---------------------------------------------------------------------------------------------

	private UpdateDataFrameAnalyticsRequest(Builder builder) {

		this.allowLazyStart = builder.allowLazyStart;
		this.description = builder.description;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.maxNumThreads = builder.maxNumThreads;
		this.modelMemoryLimit = builder.modelMemoryLimit;

	}

	public static UpdateDataFrameAnalyticsRequest of(
			Function<Builder, ObjectBuilder<UpdateDataFrameAnalyticsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies whether this job can start when there is insufficient machine
	 * learning node capacity for it to be immediately assigned to a node.
	 * <p>
	 * API name: {@code allow_lazy_start}
	 */
	@Nullable
	public final Boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * A description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - Identifier for the data frame analytics job. This identifier can
	 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
	 * underscores. It must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * The maximum number of threads to be used by the analysis. Using more threads
	 * may decrease the time necessary to complete the analysis at the cost of using
	 * more CPU. Note that the process may use additional threads for operational
	 * functionality other than the analysis itself.
	 * <p>
	 * API name: {@code max_num_threads}
	 */
	@Nullable
	public final Integer maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * The approximate maximum amount of memory resources that are permitted for
	 * analytical processing. If your <code>elasticsearch.yml</code> file contains
	 * an <code>xpack.ml.max_model_memory_limit</code> setting, an error occurs when
	 * you try to create data frame analytics jobs that have
	 * <code>model_memory_limit</code> values greater than that setting.
	 * <p>
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
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

		if (this.allowLazyStart != null) {
			generator.writeKey("allow_lazy_start");
			generator.write(this.allowLazyStart);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.maxNumThreads != null) {
			generator.writeKey("max_num_threads");
			generator.write(this.maxNumThreads);

		}
		if (this.modelMemoryLimit != null) {
			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateDataFrameAnalyticsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateDataFrameAnalyticsRequest> {
		@Nullable
		private Boolean allowLazyStart;

		@Nullable
		private String description;

		private String id;

		@Nullable
		private Integer maxNumThreads;

		@Nullable
		private String modelMemoryLimit;

		/**
		 * Specifies whether this job can start when there is insufficient machine
		 * learning node capacity for it to be immediately assigned to a node.
		 * <p>
		 * API name: {@code allow_lazy_start}
		 */
		public final Builder allowLazyStart(@Nullable Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * A description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - Identifier for the data frame analytics job. This identifier can
		 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
		 * underscores. It must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The maximum number of threads to be used by the analysis. Using more threads
		 * may decrease the time necessary to complete the analysis at the cost of using
		 * more CPU. Note that the process may use additional threads for operational
		 * functionality other than the analysis itself.
		 * <p>
		 * API name: {@code max_num_threads}
		 */
		public final Builder maxNumThreads(@Nullable Integer value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * The approximate maximum amount of memory resources that are permitted for
		 * analytical processing. If your <code>elasticsearch.yml</code> file contains
		 * an <code>xpack.ml.max_model_memory_limit</code> setting, an error occurs when
		 * you try to create data frame analytics jobs that have
		 * <code>model_memory_limit</code> values greater than that setting.
		 * <p>
		 * API name: {@code model_memory_limit}
		 */
		public final Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateDataFrameAnalyticsRequest build() {
			_checkSingleUse();

			return new UpdateDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateDataFrameAnalyticsRequest}
	 */
	public static final JsonpDeserializer<UpdateDataFrameAnalyticsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateDataFrameAnalyticsRequest::setupUpdateDataFrameAnalyticsRequestDeserializer);

	protected static void setupUpdateDataFrameAnalyticsRequestDeserializer(
			ObjectDeserializer<UpdateDataFrameAnalyticsRequest.Builder> op) {

		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_data_frame_analytics}".
	 */
	public static final Endpoint<UpdateDataFrameAnalyticsRequest, UpdateDataFrameAnalyticsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.update_data_frame_analytics",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_update");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateDataFrameAnalyticsResponse._DESERIALIZER);
}
