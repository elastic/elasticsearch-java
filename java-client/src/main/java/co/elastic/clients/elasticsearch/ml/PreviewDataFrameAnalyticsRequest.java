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
import co.elastic.clients.elasticsearch.ml.preview_data_frame_analytics.DataframePreviewConfig;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_data_frame_analytics.Request
public final class PreviewDataFrameAnalyticsRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final DataframePreviewConfig config;

	// ---------------------------------------------------------------------------------------------

	protected PreviewDataFrameAnalyticsRequest(Builder builder) {

		this.id = builder.id;
		this.config = builder.config;

	}

	/**
	 * Identifier for the data frame analytics job.
	 *
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
	 *
	 * API name: {@code config}
	 */
	@Nullable
	public DataframePreviewConfig config() {
		return this.config;
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

		if (this.config != null) {

			generator.writeKey("config");
			this.config.toJsonp(generator, mapper);

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
		 *
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
		 *
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
		 *
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
	 * Json parser for PreviewDataFrameAnalyticsRequest
	 */
	public static final JsonpValueParser<PreviewDataFrameAnalyticsRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new,
					PreviewDataFrameAnalyticsRequest::setupPreviewDataFrameAnalyticsRequestParser);

	protected static void setupPreviewDataFrameAnalyticsRequestParser(
			DelegatingJsonpValueParser<PreviewDataFrameAnalyticsRequest.Builder> op) {

		op.add(Builder::config, DataframePreviewConfig.JSONP_PARSER, "config");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.preview_data_frame_analytics}".
	 */
	public static final Endpoint<PreviewDataFrameAnalyticsRequest, PreviewDataFrameAnalyticsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_ml");
				buf.append("/data_frame");
				buf.append("/analytics");
				if (request.id != null) {
					buf.append("/");
					buf.append(request.id);
				}
				buf.append("/_preview");
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PreviewDataFrameAnalyticsResponse.JSONP_PARSER);
}
