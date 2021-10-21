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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_data_frame_analytics.Request
@JsonpDeserializable
public final class UpdateDataFrameAnalyticsRequest extends RequestBase implements JsonpSerializable {
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

	public UpdateDataFrameAnalyticsRequest(Builder builder) {

		this.allowLazyStart = builder.allowLazyStart;
		this.description = builder.description;
		this.id = Objects.requireNonNull(builder.id, "id");
		this.maxNumThreads = builder.maxNumThreads;
		this.modelMemoryLimit = builder.modelMemoryLimit;

	}

	public UpdateDataFrameAnalyticsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Specifies whether this job can start when there is insufficient machine
	 * learning node capacity for it to be immediately assigned to a node.
	 * <p>
	 * API name: {@code allow_lazy_start}
	 */
	@Nullable
	public Boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * A description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Required - Identifier for the data frame analytics job. This identifier can
	 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
	 * underscores. It must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * The maximum number of threads to be used by the analysis. The default value
	 * is 1. Using more threads may decrease the time necessary to complete the
	 * analysis at the cost of using more CPU. Note that the process may use
	 * additional threads for operational functionality other than the analysis
	 * itself.
	 * <p>
	 * API name: {@code max_num_threads}
	 */
	@Nullable
	public Integer maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * The approximate maximum amount of memory resources that are permitted for
	 * analytical processing. The default value for data frame analytics jobs is
	 * 1gb. If your elasticsearch.yml file contains an
	 * xpack.ml.max_model_memory_limit setting, an error occurs when you try to
	 * create data frame analytics jobs that have model_memory_limit values greater
	 * than that setting.
	 * <p>
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public String modelMemoryLimit() {
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
	public static class Builder implements ObjectBuilder<UpdateDataFrameAnalyticsRequest> {
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
		public Builder allowLazyStart(@Nullable Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * A description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
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
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The maximum number of threads to be used by the analysis. The default value
		 * is 1. Using more threads may decrease the time necessary to complete the
		 * analysis at the cost of using more CPU. Note that the process may use
		 * additional threads for operational functionality other than the analysis
		 * itself.
		 * <p>
		 * API name: {@code max_num_threads}
		 */
		public Builder maxNumThreads(@Nullable Integer value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * The approximate maximum amount of memory resources that are permitted for
		 * analytical processing. The default value for data frame analytics jobs is
		 * 1gb. If your elasticsearch.yml file contains an
		 * xpack.ml.max_model_memory_limit setting, an error occurs when you try to
		 * create data frame analytics jobs that have model_memory_limit values greater
		 * than that setting.
		 * <p>
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateDataFrameAnalyticsRequest build() {

			return new UpdateDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateDataFrameAnalyticsRequest}
	 */
	public static final JsonpDeserializer<UpdateDataFrameAnalyticsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateDataFrameAnalyticsRequest::setupUpdateDataFrameAnalyticsRequestDeserializer,
					Builder::build);

	protected static void setupUpdateDataFrameAnalyticsRequestDeserializer(
			DelegatingDeserializer<UpdateDataFrameAnalyticsRequest.Builder> op) {

		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_data_frame_analytics}".
	 */
	public static final Endpoint<UpdateDataFrameAnalyticsRequest, UpdateDataFrameAnalyticsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateDataFrameAnalyticsResponse._DESERIALIZER);
}
