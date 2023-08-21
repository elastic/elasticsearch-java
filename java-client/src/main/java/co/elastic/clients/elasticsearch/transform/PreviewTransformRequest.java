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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.preview_transform.Request

/**
 * Previews a transform.
 * <p>
 * It returns a maximum of 100 results. The calculations are based on all the
 * current data in the source index. It also generates a list of mappings and
 * settings for the destination index. These values are determined based on the
 * field types of the source index and the transform aggregations.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.preview_transform.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PreviewTransformRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String description;

	@Nullable
	private final Destination dest;

	@Nullable
	private final Time frequency;

	@Nullable
	private final Latest latest;

	@Nullable
	private final Pivot pivot;

	@Nullable
	private final RetentionPolicy retentionPolicy;

	@Nullable
	private final Settings settings;

	@Nullable
	private final Source source;

	@Nullable
	private final Sync sync;

	@Nullable
	private final Time timeout;

	@Nullable
	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	private PreviewTransformRequest(Builder builder) {

		this.description = builder.description;
		this.dest = builder.dest;
		this.frequency = builder.frequency;
		this.latest = builder.latest;
		this.pivot = builder.pivot;
		this.retentionPolicy = builder.retentionPolicy;
		this.settings = builder.settings;
		this.source = builder.source;
		this.sync = builder.sync;
		this.timeout = builder.timeout;
		this.transformId = builder.transformId;

	}

	public static PreviewTransformRequest of(Function<Builder, ObjectBuilder<PreviewTransformRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Free text description of the transform.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The destination for the transform.
	 * <p>
	 * API name: {@code dest}
	 */
	@Nullable
	public final Destination dest() {
		return this.dest;
	}

	/**
	 * The interval between checks for changes in the source indices when the
	 * transform is running continuously. Also determines the retry interval in the
	 * event of transient failures while the transform is searching or indexing. The
	 * minimum value is 1s and the maximum is 1h.
	 * <p>
	 * API name: {@code frequency}
	 */
	@Nullable
	public final Time frequency() {
		return this.frequency;
	}

	/**
	 * The latest method transforms the data by finding the latest document for each
	 * unique key.
	 * <p>
	 * API name: {@code latest}
	 */
	@Nullable
	public final Latest latest() {
		return this.latest;
	}

	/**
	 * The pivot method transforms the data by aggregating and grouping it. These
	 * objects define the group by fields and the aggregation to reduce the data.
	 * <p>
	 * API name: {@code pivot}
	 */
	@Nullable
	public final Pivot pivot() {
		return this.pivot;
	}

	/**
	 * Defines a retention policy for the transform. Data that meets the defined
	 * criteria is deleted from the destination index.
	 * <p>
	 * API name: {@code retention_policy}
	 */
	@Nullable
	public final RetentionPolicy retentionPolicy() {
		return this.retentionPolicy;
	}

	/**
	 * Defines optional transform settings.
	 * <p>
	 * API name: {@code settings}
	 */
	@Nullable
	public final Settings settings() {
		return this.settings;
	}

	/**
	 * The source of the data for the transform.
	 * <p>
	 * API name: {@code source}
	 */
	@Nullable
	public final Source source() {
		return this.source;
	}

	/**
	 * Defines the properties transforms require to run continuously.
	 * <p>
	 * API name: {@code sync}
	 */
	@Nullable
	public final Sync sync() {
		return this.sync;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Identifier for the transform to preview. If you specify this path parameter,
	 * you cannot provide transform configuration details in the request body.
	 * <p>
	 * API name: {@code transform_id}
	 */
	@Nullable
	public final String transformId() {
		return this.transformId;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.dest != null) {
			generator.writeKey("dest");
			this.dest.serialize(generator, mapper);

		}
		if (this.frequency != null) {
			generator.writeKey("frequency");
			this.frequency.serialize(generator, mapper);

		}
		if (this.latest != null) {
			generator.writeKey("latest");
			this.latest.serialize(generator, mapper);

		}
		if (this.pivot != null) {
			generator.writeKey("pivot");
			this.pivot.serialize(generator, mapper);

		}
		if (this.retentionPolicy != null) {
			generator.writeKey("retention_policy");
			this.retentionPolicy.serialize(generator, mapper);

		}
		if (this.settings != null) {
			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}
		if (this.source != null) {
			generator.writeKey("source");
			this.source.serialize(generator, mapper);

		}
		if (this.sync != null) {
			generator.writeKey("sync");
			this.sync.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewTransformRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PreviewTransformRequest> {
		@Nullable
		private String description;

		@Nullable
		private Destination dest;

		@Nullable
		private Time frequency;

		@Nullable
		private Latest latest;

		@Nullable
		private Pivot pivot;

		@Nullable
		private RetentionPolicy retentionPolicy;

		@Nullable
		private Settings settings;

		@Nullable
		private Source source;

		@Nullable
		private Sync sync;

		@Nullable
		private Time timeout;

		@Nullable
		private String transformId;

		/**
		 * Free text description of the transform.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The destination for the transform.
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(@Nullable Destination value) {
			this.dest = value;
			return this;
		}

		/**
		 * The destination for the transform.
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(Function<Destination.Builder, ObjectBuilder<Destination>> fn) {
			return this.dest(fn.apply(new Destination.Builder()).build());
		}

		/**
		 * The interval between checks for changes in the source indices when the
		 * transform is running continuously. Also determines the retry interval in the
		 * event of transient failures while the transform is searching or indexing. The
		 * minimum value is 1s and the maximum is 1h.
		 * <p>
		 * API name: {@code frequency}
		 */
		public final Builder frequency(@Nullable Time value) {
			this.frequency = value;
			return this;
		}

		/**
		 * The interval between checks for changes in the source indices when the
		 * transform is running continuously. Also determines the retry interval in the
		 * event of transient failures while the transform is searching or indexing. The
		 * minimum value is 1s and the maximum is 1h.
		 * <p>
		 * API name: {@code frequency}
		 */
		public final Builder frequency(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.frequency(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The latest method transforms the data by finding the latest document for each
		 * unique key.
		 * <p>
		 * API name: {@code latest}
		 */
		public final Builder latest(@Nullable Latest value) {
			this.latest = value;
			return this;
		}

		/**
		 * The latest method transforms the data by finding the latest document for each
		 * unique key.
		 * <p>
		 * API name: {@code latest}
		 */
		public final Builder latest(Function<Latest.Builder, ObjectBuilder<Latest>> fn) {
			return this.latest(fn.apply(new Latest.Builder()).build());
		}

		/**
		 * The pivot method transforms the data by aggregating and grouping it. These
		 * objects define the group by fields and the aggregation to reduce the data.
		 * <p>
		 * API name: {@code pivot}
		 */
		public final Builder pivot(@Nullable Pivot value) {
			this.pivot = value;
			return this;
		}

		/**
		 * The pivot method transforms the data by aggregating and grouping it. These
		 * objects define the group by fields and the aggregation to reduce the data.
		 * <p>
		 * API name: {@code pivot}
		 */
		public final Builder pivot(Function<Pivot.Builder, ObjectBuilder<Pivot>> fn) {
			return this.pivot(fn.apply(new Pivot.Builder()).build());
		}

		/**
		 * Defines a retention policy for the transform. Data that meets the defined
		 * criteria is deleted from the destination index.
		 * <p>
		 * API name: {@code retention_policy}
		 */
		public final Builder retentionPolicy(@Nullable RetentionPolicy value) {
			this.retentionPolicy = value;
			return this;
		}

		/**
		 * Defines a retention policy for the transform. Data that meets the defined
		 * criteria is deleted from the destination index.
		 * <p>
		 * API name: {@code retention_policy}
		 */
		public final Builder retentionPolicy(Function<RetentionPolicy.Builder, ObjectBuilder<RetentionPolicy>> fn) {
			return this.retentionPolicy(fn.apply(new RetentionPolicy.Builder()).build());
		}

		/**
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable Settings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<Settings.Builder, ObjectBuilder<Settings>> fn) {
			return this.settings(fn.apply(new Settings.Builder()).build());
		}

		/**
		 * The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable Source value) {
			this.source = value;
			return this;
		}

		/**
		 * The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public final Builder sync(@Nullable Sync value) {
			this.sync = value;
			return this;
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public final Builder sync(Function<Sync.Builder, ObjectBuilder<Sync>> fn) {
			return this.sync(fn.apply(new Sync.Builder()).build());
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Identifier for the transform to preview. If you specify this path parameter,
		 * you cannot provide transform configuration details in the request body.
		 * <p>
		 * API name: {@code transform_id}
		 */
		public final Builder transformId(@Nullable String value) {
			this.transformId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PreviewTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewTransformRequest build() {
			_checkSingleUse();

			return new PreviewTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PreviewTransformRequest}
	 */
	public static final JsonpDeserializer<PreviewTransformRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PreviewTransformRequest::setupPreviewTransformRequestDeserializer);

	protected static void setupPreviewTransformRequestDeserializer(
			ObjectDeserializer<PreviewTransformRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, Destination._DESERIALIZER, "dest");
		op.add(Builder::frequency, Time._DESERIALIZER, "frequency");
		op.add(Builder::latest, Latest._DESERIALIZER, "latest");
		op.add(Builder::pivot, Pivot._DESERIALIZER, "pivot");
		op.add(Builder::retentionPolicy, RetentionPolicy._DESERIALIZER, "retention_policy");
		op.add(Builder::settings, Settings._DESERIALIZER, "settings");
		op.add(Builder::source, Source._DESERIALIZER, "source");
		op.add(Builder::sync, Sync._DESERIALIZER, "sync");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.preview_transform}".
	 */
	public static final SimpleEndpoint<PreviewTransformRequest, ?> _ENDPOINT = new SimpleEndpoint<>(
			"es/transform.preview_transform",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.transformId, buf);
					buf.append("/_preview");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/_preview");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					params.put("transformId", request.transformId);
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PreviewTransformResponse._DESERIALIZER);

	/**
	 * Create an "{@code transform.preview_transform}" endpoint.
	 */
	public static <TTransform> Endpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ErrorResponse> createPreviewTransformEndpoint(
			JsonpDeserializer<TTransform> tTransformDeserializer) {
		return _ENDPOINT.withResponseDeserializer(
				PreviewTransformResponse.createPreviewTransformResponseDeserializer(tTransformDeserializer));
	}
}
