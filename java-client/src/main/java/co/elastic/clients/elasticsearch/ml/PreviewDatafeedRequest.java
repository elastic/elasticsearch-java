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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_datafeed.Request
public final class PreviewDatafeedRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String datafeedId;

	@Nullable
	private final JobConfig jobConfig;

	@Nullable
	private final DatafeedConfig datafeedConfig;

	// ---------------------------------------------------------------------------------------------

	public PreviewDatafeedRequest(Builder builder) {

		this.datafeedId = builder.datafeedId;
		this.jobConfig = builder.jobConfig;
		this.datafeedConfig = builder.datafeedConfig;

	}

	/**
	 * The ID of the datafeed to preview
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code job_config}
	 */
	@Nullable
	public JobConfig jobConfig() {
		return this.jobConfig;
	}

	/**
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public DatafeedConfig datafeedConfig() {
		return this.datafeedConfig;
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

		if (this.jobConfig != null) {

			generator.writeKey("job_config");
			this.jobConfig.serialize(generator, mapper);

		}
		if (this.datafeedConfig != null) {

			generator.writeKey("datafeed_config");
			this.datafeedConfig.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewDatafeedRequest}.
	 */
	public static class Builder implements ObjectBuilder<PreviewDatafeedRequest> {
		@Nullable
		private String datafeedId;

		@Nullable
		private JobConfig jobConfig;

		@Nullable
		private DatafeedConfig datafeedConfig;

		/**
		 * The ID of the datafeed to preview
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code job_config}
		 */
		public Builder jobConfig(@Nullable JobConfig value) {
			this.jobConfig = value;
			return this;
		}

		/**
		 * API name: {@code job_config}
		 */
		public Builder jobConfig(Function<JobConfig.Builder, ObjectBuilder<JobConfig>> fn) {
			return this.jobConfig(fn.apply(new JobConfig.Builder()).build());
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public Builder datafeedConfig(@Nullable DatafeedConfig value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public Builder datafeedConfig(Function<DatafeedConfig.Builder, ObjectBuilder<DatafeedConfig>> fn) {
			return this.datafeedConfig(fn.apply(new DatafeedConfig.Builder()).build());
		}

		/**
		 * Builds a {@link PreviewDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewDatafeedRequest build() {

			return new PreviewDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PreviewDatafeedRequest}
	 */
	public static final JsonpDeserializer<PreviewDatafeedRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PreviewDatafeedRequest::setupPreviewDatafeedRequestDeserializer);

	protected static void setupPreviewDatafeedRequestDeserializer(
			DelegatingDeserializer<PreviewDatafeedRequest.Builder> op) {

		op.add(Builder::jobConfig, JobConfig.DESERIALIZER, "job_config");
		op.add(Builder::datafeedConfig, DatafeedConfig.DESERIALIZER, "datafeed_config");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.preview_datafeed}".
	 */
	private static final Endpoint.Simple<PreviewDatafeedRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				if (request.datafeedId() != null)
					propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					buf.append(request.datafeedId);
					buf.append("/_preview");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/_preview");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code ml.preview_datafeed}" endpoint.
	 */
	public static <TDocument> Endpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ElasticsearchError> createPreviewDatafeedEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				PreviewDatafeedResponse.createPreviewDatafeedResponseDeserializer(tDocumentDeserializer));
	}
}
