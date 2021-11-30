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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_datafeed.Request

/**
 * Previews a datafeed.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/ml/preview_datafeed/MlPreviewDatafeedRequest.ts#L25-L38">API
 *      specification</a>
 */
@JsonpDeserializable
public class PreviewDatafeedRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final DatafeedConfig datafeedConfig;

	@Nullable
	private final String datafeedId;

	@Nullable
	private final JobConfig jobConfig;

	// ---------------------------------------------------------------------------------------------

	private PreviewDatafeedRequest(Builder builder) {

		this.datafeedConfig = builder.datafeedConfig;
		this.datafeedId = builder.datafeedId;
		this.jobConfig = builder.jobConfig;

	}

	public static PreviewDatafeedRequest of(Function<Builder, ObjectBuilder<PreviewDatafeedRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public final DatafeedConfig datafeedConfig() {
		return this.datafeedConfig;
	}

	/**
	 * The ID of the datafeed to preview
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code job_config}
	 */
	@Nullable
	public final JobConfig jobConfig() {
		return this.jobConfig;
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

		if (this.datafeedConfig != null) {
			generator.writeKey("datafeed_config");
			this.datafeedConfig.serialize(generator, mapper);

		}
		if (this.jobConfig != null) {
			generator.writeKey("job_config");
			this.jobConfig.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewDatafeedRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PreviewDatafeedRequest> {
		@Nullable
		private DatafeedConfig datafeedConfig;

		@Nullable
		private String datafeedId;

		@Nullable
		private JobConfig jobConfig;

		/**
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(@Nullable DatafeedConfig value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(Function<DatafeedConfig.Builder, ObjectBuilder<DatafeedConfig>> fn) {
			return this.datafeedConfig(fn.apply(new DatafeedConfig.Builder()).build());
		}

		/**
		 * The ID of the datafeed to preview
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code job_config}
		 */
		public final Builder jobConfig(@Nullable JobConfig value) {
			this.jobConfig = value;
			return this;
		}

		/**
		 * API name: {@code job_config}
		 */
		public final Builder jobConfig(Function<JobConfig.Builder, ObjectBuilder<JobConfig>> fn) {
			return this.jobConfig(fn.apply(new JobConfig.Builder()).build());
		}

		/**
		 * Builds a {@link PreviewDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewDatafeedRequest build() {
			_checkSingleUse();

			return new PreviewDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PreviewDatafeedRequest}
	 */
	public static final JsonpDeserializer<PreviewDatafeedRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PreviewDatafeedRequest::setupPreviewDatafeedRequestDeserializer);

	protected static void setupPreviewDatafeedRequestDeserializer(
			ObjectDeserializer<PreviewDatafeedRequest.Builder> op) {

		op.add(Builder::datafeedConfig, DatafeedConfig._DESERIALIZER, "datafeed_config");
		op.add(Builder::jobConfig, JobConfig._DESERIALIZER, "job_config");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.preview_datafeed}".
	 */
	public static final SimpleEndpoint<PreviewDatafeedRequest, ?> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.preview_datafeed",

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
					SimpleEndpoint.pathEncode(request.datafeedId, buf);
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
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PreviewDatafeedResponse._DESERIALIZER);

	/**
	 * Create an "{@code ml.preview_datafeed}" endpoint.
	 */
	public static <TDocument> Endpoint<PreviewDatafeedRequest, PreviewDatafeedResponse<TDocument>, ErrorResponse> createPreviewDatafeedEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT.withResponseDeserializer(
				PreviewDatafeedResponse.createPreviewDatafeedResponseDeserializer(tDocumentDeserializer));
	}
}
