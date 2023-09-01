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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_datafeed.Request

/**
 * Previews a datafeed. This API returns the first &quot;page&quot; of search
 * results from a datafeed. You can preview an existing datafeed or provide
 * configuration details for a datafeed and anomaly detection job in the API.
 * The preview shows the structure of the data that will be passed to the
 * anomaly detection engine. IMPORTANT: When Elasticsearch security features are
 * enabled, the preview uses the credentials of the user that called the API.
 * However, when the datafeed starts it uses the roles of the last user that
 * created or updated the datafeed. To get a preview that accurately reflects
 * the behavior of the datafeed, use the appropriate credentials. You can also
 * use secondary authorization headers to supply the credentials.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.preview_datafeed.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PreviewDatafeedRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final DatafeedConfig datafeedConfig;

	@Nullable
	private final String datafeedId;

	@Nullable
	private final DateTime end;

	@Nullable
	private final JobConfig jobConfig;

	@Nullable
	private final DateTime start;

	// ---------------------------------------------------------------------------------------------

	private PreviewDatafeedRequest(Builder builder) {

		this.datafeedConfig = builder.datafeedConfig;
		this.datafeedId = builder.datafeedId;
		this.end = builder.end;
		this.jobConfig = builder.jobConfig;
		this.start = builder.start;

	}

	public static PreviewDatafeedRequest of(Function<Builder, ObjectBuilder<PreviewDatafeedRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The datafeed definition to preview.
	 * <p>
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public final DatafeedConfig datafeedConfig() {
		return this.datafeedConfig;
	}

	/**
	 * A numerical character string that uniquely identifies the datafeed. This
	 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
	 * hyphens, and underscores. It must start and end with alphanumeric characters.
	 * NOTE: If you use this path parameter, you cannot provide datafeed or anomaly
	 * detection job configuration details in the request body.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * The end time when the datafeed preview should stop
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final DateTime end() {
		return this.end;
	}

	/**
	 * The configuration details for the anomaly detection job that is associated
	 * with the datafeed. If the <code>datafeed_config</code> object does not
	 * include a <code>job_id</code> that references an existing anomaly detection
	 * job, you must supply this <code>job_config</code> object. If you include both
	 * a <code>job_id</code> and a <code>job_config</code>, the latter information
	 * is used. You cannot specify a <code>job_config</code> object unless you also
	 * supply a <code>datafeed_config</code> object.
	 * <p>
	 * API name: {@code job_config}
	 */
	@Nullable
	public final JobConfig jobConfig() {
		return this.jobConfig;
	}

	/**
	 * The start time from where the datafeed preview should begin
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final DateTime start() {
		return this.start;
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

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PreviewDatafeedRequest> {
		@Nullable
		private DatafeedConfig datafeedConfig;

		@Nullable
		private String datafeedId;

		@Nullable
		private DateTime end;

		@Nullable
		private JobConfig jobConfig;

		@Nullable
		private DateTime start;

		/**
		 * The datafeed definition to preview.
		 * <p>
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(@Nullable DatafeedConfig value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * The datafeed definition to preview.
		 * <p>
		 * API name: {@code datafeed_config}
		 */
		public final Builder datafeedConfig(Function<DatafeedConfig.Builder, ObjectBuilder<DatafeedConfig>> fn) {
			return this.datafeedConfig(fn.apply(new DatafeedConfig.Builder()).build());
		}

		/**
		 * A numerical character string that uniquely identifies the datafeed. This
		 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
		 * hyphens, and underscores. It must start and end with alphanumeric characters.
		 * NOTE: If you use this path parameter, you cannot provide datafeed or anomaly
		 * detection job configuration details in the request body.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * The end time when the datafeed preview should stop
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable DateTime value) {
			this.end = value;
			return this;
		}

		/**
		 * The configuration details for the anomaly detection job that is associated
		 * with the datafeed. If the <code>datafeed_config</code> object does not
		 * include a <code>job_id</code> that references an existing anomaly detection
		 * job, you must supply this <code>job_config</code> object. If you include both
		 * a <code>job_id</code> and a <code>job_config</code>, the latter information
		 * is used. You cannot specify a <code>job_config</code> object unless you also
		 * supply a <code>datafeed_config</code> object.
		 * <p>
		 * API name: {@code job_config}
		 */
		public final Builder jobConfig(@Nullable JobConfig value) {
			this.jobConfig = value;
			return this;
		}

		/**
		 * The configuration details for the anomaly detection job that is associated
		 * with the datafeed. If the <code>datafeed_config</code> object does not
		 * include a <code>job_id</code> that references an existing anomaly detection
		 * job, you must supply this <code>job_config</code> object. If you include both
		 * a <code>job_id</code> and a <code>job_config</code>, the latter information
		 * is used. You cannot specify a <code>job_config</code> object unless you also
		 * supply a <code>datafeed_config</code> object.
		 * <p>
		 * API name: {@code job_config}
		 */
		public final Builder jobConfig(Function<JobConfig.Builder, ObjectBuilder<JobConfig>> fn) {
			return this.jobConfig(fn.apply(new JobConfig.Builder()).build());
		}

		/**
		 * The start time from where the datafeed preview should begin
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable DateTime value) {
			this.start = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				if (request.datafeedId() != null)
					propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					params.put("datafeedId", request.datafeedId);
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.start != null) {
					params.put("start", request.start.toString());
				}
				if (request.end != null) {
					params.put("end", request.end.toString());
				}
				return params;

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
