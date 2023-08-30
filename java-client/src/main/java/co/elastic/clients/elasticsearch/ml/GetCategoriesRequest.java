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
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_categories.Request

/**
 * Retrieves anomaly detection job results for one or more categories.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_categories.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetCategoriesRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String categoryId;

	@Nullable
	private final Integer from;

	private final String jobId;

	@Nullable
	private final Page page;

	@Nullable
	private final String partitionFieldValue;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private GetCategoriesRequest(Builder builder) {

		this.categoryId = builder.categoryId;
		this.from = builder.from;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.page = builder.page;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.size = builder.size;

	}

	public static GetCategoriesRequest of(Function<Builder, ObjectBuilder<GetCategoriesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Identifier for the category, which is unique in the job. If you specify
	 * neither the category ID nor the partition_field_value, the API returns
	 * information about all categories. If you specify only the
	 * partition_field_value, it returns information about all categories for the
	 * specified partition.
	 * <p>
	 * API name: {@code category_id}
	 */
	@Nullable
	public final String categoryId() {
		return this.categoryId;
	}

	/**
	 * Skips the specified number of categories.
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
	 * Only return categories for the specified partition.
	 * <p>
	 * API name: {@code partition_field_value}
	 */
	@Nullable
	public final String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * Specifies the maximum number of categories to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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
	 * Builder for {@link GetCategoriesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetCategoriesRequest> {
		@Nullable
		private String categoryId;

		@Nullable
		private Integer from;

		private String jobId;

		@Nullable
		private Page page;

		@Nullable
		private String partitionFieldValue;

		@Nullable
		private Integer size;

		/**
		 * Identifier for the category, which is unique in the job. If you specify
		 * neither the category ID nor the partition_field_value, the API returns
		 * information about all categories. If you specify only the
		 * partition_field_value, it returns information about all categories for the
		 * specified partition.
		 * <p>
		 * API name: {@code category_id}
		 */
		public final Builder categoryId(@Nullable String value) {
			this.categoryId = value;
			return this;
		}

		/**
		 * Skips the specified number of categories.
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
		 * Only return categories for the specified partition.
		 * <p>
		 * API name: {@code partition_field_value}
		 */
		public final Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * Specifies the maximum number of categories to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetCategoriesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCategoriesRequest build() {
			_checkSingleUse();

			return new GetCategoriesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCategoriesRequest}
	 */
	public static final JsonpDeserializer<GetCategoriesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetCategoriesRequest::setupGetCategoriesRequestDeserializer);

	protected static void setupGetCategoriesRequestDeserializer(ObjectDeserializer<GetCategoriesRequest.Builder> op) {

		op.add(Builder::page, Page._DESERIALIZER, "page");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_categories}".
	 */
	public static final Endpoint<GetCategoriesRequest, GetCategoriesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_categories",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _categoryId = 1 << 0;
				final int _jobId = 1 << 1;

				int propsSet = 0;

				if (request.categoryId() != null)
					propsSet |= _categoryId;
				propsSet |= _jobId;

				if (propsSet == (_jobId | _categoryId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/results");
					buf.append("/categories");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.categoryId, buf);
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/results");
					buf.append("/categories");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _categoryId = 1 << 0;
				final int _jobId = 1 << 1;

				int propsSet = 0;

				if (request.categoryId() != null)
					propsSet |= _categoryId;
				propsSet |= _jobId;

				if (propsSet == (_jobId | _categoryId)) {
					params.put("jobId", request.jobId);
					params.put("categoryId", request.categoryId);
				}
				if (propsSet == (_jobId)) {
					params.put("jobId", request.jobId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.partitionFieldValue != null) {
					params.put("partition_field_value", request.partitionFieldValue);
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetCategoriesResponse._DESERIALIZER);
}
