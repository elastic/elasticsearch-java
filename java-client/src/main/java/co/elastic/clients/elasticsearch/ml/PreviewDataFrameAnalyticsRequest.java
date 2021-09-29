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
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.ml.preview_data_frame_analytics.DataframePreviewConfig;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
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

// typedef: ml.preview_data_frame_analytics.Request
@JsonpDeserializable
public final class PreviewDataFrameAnalyticsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final DataframePreviewConfig config;

	// ---------------------------------------------------------------------------------------------

	public PreviewDataFrameAnalyticsRequest(Builder builder) {

		this.id = builder.id;
		this.config = builder.config;

	}

	public PreviewDataFrameAnalyticsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Identifier for the data frame analytics job.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * A data frame analytics config as described in Create data frame analytics
	 * jobs. Note that id and dest don’t need to be provided in the context of this
	 * API.
	 * <p>
	 * API name: {@code config}
	 */
	@Nullable
	public DataframePreviewConfig config() {
		return this.config;
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

		if (this.config != null) {

			generator.writeKey("config");
			this.config.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewDataFrameAnalyticsRequest}.
	 */
	public static class Builder implements ObjectBuilder<PreviewDataFrameAnalyticsRequest> {
		@Nullable
		private String id;

		@Nullable
		private DataframePreviewConfig config;

		/**
		 * Identifier for the data frame analytics job.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * A data frame analytics config as described in Create data frame analytics
		 * jobs. Note that id and dest don’t need to be provided in the context of this
		 * API.
		 * <p>
		 * API name: {@code config}
		 */
		public Builder config(@Nullable DataframePreviewConfig value) {
			this.config = value;
			return this;
		}

		/**
		 * A data frame analytics config as described in Create data frame analytics
		 * jobs. Note that id and dest don’t need to be provided in the context of this
		 * API.
		 * <p>
		 * API name: {@code config}
		 */
		public Builder config(Function<DataframePreviewConfig.Builder, ObjectBuilder<DataframePreviewConfig>> fn) {
			return this.config(fn.apply(new DataframePreviewConfig.Builder()).build());
		}

		/**
		 * Builds a {@link PreviewDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewDataFrameAnalyticsRequest build() {

			return new PreviewDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PreviewDataFrameAnalyticsRequest}
	 */
	public static final JsonpDeserializer<PreviewDataFrameAnalyticsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PreviewDataFrameAnalyticsRequest::setupPreviewDataFrameAnalyticsRequestDeserializer,
					Builder::build);

	protected static void setupPreviewDataFrameAnalyticsRequestDeserializer(
			DelegatingDeserializer<PreviewDataFrameAnalyticsRequest.Builder> op) {

		op.add(Builder::config, DataframePreviewConfig._DESERIALIZER, "config");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.preview_data_frame_analytics}".
	 */
	public static final Endpoint<PreviewDataFrameAnalyticsRequest, PreviewDataFrameAnalyticsResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/_preview");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_preview");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PreviewDataFrameAnalyticsResponse._DESERIALIZER);
}
