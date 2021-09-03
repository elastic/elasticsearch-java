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
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_categories.Request
public final class GetCategoriesRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final String categoryId;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	@Nullable
	private final String partitionFieldValue;

	@Nullable
	private final Page page;

	// ---------------------------------------------------------------------------------------------

	protected GetCategoriesRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.categoryId = builder.categoryId;
		this.from = builder.from;
		this.size = builder.size;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.page = builder.page;

	}

	/**
	 * Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
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
	public String categoryId() {
		return this.categoryId;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * Only return categories for the specified partition.
	 * <p>
	 * API name: {@code partition_field_value}
	 */
	@Nullable
	public String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * API name: {@code page}
	 */
	@Nullable
	public Page page() {
		return this.page;
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

		if (this.page != null) {

			generator.writeKey("page");
			this.page.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCategoriesRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetCategoriesRequest> {
		private String jobId;

		@Nullable
		private String categoryId;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		@Nullable
		private String partitionFieldValue;

		@Nullable
		private Page page;

		/**
		 * Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
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
		public Builder categoryId(@Nullable String value) {
			this.categoryId = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Only return categories for the specified partition.
		 * <p>
		 * API name: {@code partition_field_value}
		 */
		public Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * Builds a {@link GetCategoriesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCategoriesRequest build() {

			return new GetCategoriesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetCategoriesRequest
	 */
	public static final JsonpDeserializer<GetCategoriesRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetCategoriesRequest::setupGetCategoriesRequestDeserializer);

	protected static void setupGetCategoriesRequestDeserializer(
			DelegatingDeserializer<GetCategoriesRequest.Builder> op) {

		op.add(Builder::page, Page.DESERIALIZER, "page");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_categories}".
	 */
	public static final Endpoint<GetCategoriesRequest, GetCategoriesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;
				final int _categoryId = 1 << 1;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;
				if (request.categoryId() != null)
					propsSet |= _categoryId;

				if (propsSet == (_jobId | _categoryId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/results");
					buf.append("/categories");
					buf.append("/");
					buf.append(request.categoryId);
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/results");
					buf.append("/categories");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				if (request.partitionFieldValue != null) {
					params.put("partition_field_value", request.partitionFieldValue);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetCategoriesResponse.DESERIALIZER);
}
