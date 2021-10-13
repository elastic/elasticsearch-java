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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.reindex.Destination;
import co.elastic.clients.elasticsearch.core.reindex.Source;
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

// typedef: transform.preview_transform.Request
@JsonpDeserializable
public class PreviewTransformRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String transformId;

	@Nullable
	private final Destination dest;

	@Nullable
	private final String description;

	@Nullable
	private final String frequency;

	@Nullable
	private final Pivot pivot;

	@Nullable
	private final Source source;

	@Nullable
	private final Settings settings;

	@Nullable
	private final Sync sync;

	@Nullable
	private final RetentionPolicy retentionPolicy;

	@Nullable
	private final Latest latest;

	// ---------------------------------------------------------------------------------------------

	public PreviewTransformRequest(AbstractBuilder<?> builder) {

		this.transformId = builder.transformId;
		this.dest = builder.dest;
		this.description = builder.description;
		this.frequency = builder.frequency;
		this.pivot = builder.pivot;
		this.source = builder.source;
		this.settings = builder.settings;
		this.sync = builder.sync;
		this.retentionPolicy = builder.retentionPolicy;
		this.latest = builder.latest;

	}

	/**
	 * The id of the transform to preview.
	 * <p>
	 * API name: {@code transform_id}
	 */
	@Nullable
	public String transformId() {
		return this.transformId;
	}

	/**
	 * The destination for the transform.
	 * <p>
	 * API name: {@code dest}
	 */
	@Nullable
	public Destination dest() {
		return this.dest;
	}

	/**
	 * Free text description of the transform.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
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
	public String frequency() {
		return this.frequency;
	}

	/**
	 * The pivot method transforms the data by aggregating and grouping it. These
	 * objects define the group by fields and the aggregation to reduce the data.
	 * <p>
	 * API name: {@code pivot}
	 */
	@Nullable
	public Pivot pivot() {
		return this.pivot;
	}

	/**
	 * The source of the data for the transform.
	 * <p>
	 * API name: {@code source}
	 */
	@Nullable
	public Source source() {
		return this.source;
	}

	/**
	 * Defines optional transform settings.
	 * <p>
	 * API name: {@code settings}
	 */
	@Nullable
	public Settings settings() {
		return this.settings;
	}

	/**
	 * Defines the properties transforms require to run continuously.
	 * <p>
	 * API name: {@code sync}
	 */
	@Nullable
	public Sync sync() {
		return this.sync;
	}

	/**
	 * Defines a retention policy for the transform. Data that meets the defined
	 * criteria is deleted from the destination index.
	 * <p>
	 * API name: {@code retention_policy}
	 */
	@Nullable
	public RetentionPolicy retentionPolicy() {
		return this.retentionPolicy;
	}

	/**
	 * The latest method transforms the data by finding the latest document for each
	 * unique key.
	 * <p>
	 * API name: {@code latest}
	 */
	@Nullable
	public Latest latest() {
		return this.latest;
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

		if (this.dest != null) {

			generator.writeKey("dest");
			this.dest.serialize(generator, mapper);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.frequency != null) {

			generator.writeKey("frequency");
			generator.write(this.frequency);

		}
		if (this.pivot != null) {

			generator.writeKey("pivot");
			this.pivot.serialize(generator, mapper);

		}
		if (this.source != null) {

			generator.writeKey("source");
			this.source.serialize(generator, mapper);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}
		if (this.sync != null) {

			generator.writeKey("sync");
			this.sync.serialize(generator, mapper);

		}
		if (this.retentionPolicy != null) {

			generator.writeKey("retention_policy");
			this.retentionPolicy.serialize(generator, mapper);

		}
		if (this.latest != null) {

			generator.writeKey("latest");
			this.latest.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewTransformRequest}.
	 */
	public static class Builder extends PreviewTransformRequest.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PreviewTransformRequest> {
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

			return new PreviewTransformRequest(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private String transformId;

		@Nullable
		private Destination dest;

		@Nullable
		private String description;

		@Nullable
		private String frequency;

		@Nullable
		private Pivot pivot;

		@Nullable
		private Source source;

		@Nullable
		private Settings settings;

		@Nullable
		private Sync sync;

		@Nullable
		private RetentionPolicy retentionPolicy;

		@Nullable
		private Latest latest;

		/**
		 * The id of the transform to preview.
		 * <p>
		 * API name: {@code transform_id}
		 */
		public BuilderT transformId(@Nullable String value) {
			this.transformId = value;
			return self();
		}

		/**
		 * The destination for the transform.
		 * <p>
		 * API name: {@code dest}
		 */
		public BuilderT dest(@Nullable Destination value) {
			this.dest = value;
			return self();
		}

		/**
		 * The destination for the transform.
		 * <p>
		 * API name: {@code dest}
		 */
		public BuilderT dest(Function<Destination.Builder, ObjectBuilder<Destination>> fn) {
			return this.dest(fn.apply(new Destination.Builder()).build());
		}

		/**
		 * Free text description of the transform.
		 * <p>
		 * API name: {@code description}
		 */
		public BuilderT description(@Nullable String value) {
			this.description = value;
			return self();
		}

		/**
		 * The interval between checks for changes in the source indices when the
		 * transform is running continuously. Also determines the retry interval in the
		 * event of transient failures while the transform is searching or indexing. The
		 * minimum value is 1s and the maximum is 1h.
		 * <p>
		 * API name: {@code frequency}
		 */
		public BuilderT frequency(@Nullable String value) {
			this.frequency = value;
			return self();
		}

		/**
		 * The pivot method transforms the data by aggregating and grouping it. These
		 * objects define the group by fields and the aggregation to reduce the data.
		 * <p>
		 * API name: {@code pivot}
		 */
		public BuilderT pivot(@Nullable Pivot value) {
			this.pivot = value;
			return self();
		}

		/**
		 * The pivot method transforms the data by aggregating and grouping it. These
		 * objects define the group by fields and the aggregation to reduce the data.
		 * <p>
		 * API name: {@code pivot}
		 */
		public BuilderT pivot(Function<Pivot.Builder, ObjectBuilder<Pivot>> fn) {
			return this.pivot(fn.apply(new Pivot.Builder()).build());
		}

		/**
		 * The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public BuilderT source(@Nullable Source value) {
			this.source = value;
			return self();
		}

		/**
		 * The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public BuilderT source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public BuilderT settings(@Nullable Settings value) {
			this.settings = value;
			return self();
		}

		/**
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public BuilderT settings(Function<Settings.Builder, ObjectBuilder<Settings>> fn) {
			return this.settings(fn.apply(new Settings.Builder()).build());
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public BuilderT sync(@Nullable Sync value) {
			this.sync = value;
			return self();
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public BuilderT sync(Function<Sync.Builder, ObjectBuilder<Sync>> fn) {
			return this.sync(fn.apply(new Sync.Builder()).build());
		}

		/**
		 * Defines a retention policy for the transform. Data that meets the defined
		 * criteria is deleted from the destination index.
		 * <p>
		 * API name: {@code retention_policy}
		 */
		public BuilderT retentionPolicy(@Nullable RetentionPolicy value) {
			this.retentionPolicy = value;
			return self();
		}

		/**
		 * Defines a retention policy for the transform. Data that meets the defined
		 * criteria is deleted from the destination index.
		 * <p>
		 * API name: {@code retention_policy}
		 */
		public BuilderT retentionPolicy(Function<RetentionPolicy.Builder, ObjectBuilder<RetentionPolicy>> fn) {
			return this.retentionPolicy(fn.apply(new RetentionPolicy.Builder()).build());
		}

		/**
		 * The latest method transforms the data by finding the latest document for each
		 * unique key.
		 * <p>
		 * API name: {@code latest}
		 */
		public BuilderT latest(@Nullable Latest value) {
			this.latest = value;
			return self();
		}

		/**
		 * The latest method transforms the data by finding the latest document for each
		 * unique key.
		 * <p>
		 * API name: {@code latest}
		 */
		public BuilderT latest(Function<Latest.Builder, ObjectBuilder<Latest>> fn) {
			return this.latest(fn.apply(new Latest.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PreviewTransformRequest}
	 */
	public static final JsonpDeserializer<PreviewTransformRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PreviewTransformRequest::setupPreviewTransformRequestDeserializer, Builder::build);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPreviewTransformRequestDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::dest, Destination._DESERIALIZER, "dest");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::frequency, JsonpDeserializer.stringDeserializer(), "frequency");
		op.add(AbstractBuilder::pivot, Pivot._DESERIALIZER, "pivot");
		op.add(AbstractBuilder::source, Source._DESERIALIZER, "source");
		op.add(AbstractBuilder::settings, Settings._DESERIALIZER, "settings");
		op.add(AbstractBuilder::sync, Sync._DESERIALIZER, "sync");
		op.add(AbstractBuilder::retentionPolicy, RetentionPolicy._DESERIALIZER, "retention_policy");
		op.add(AbstractBuilder::latest, Latest._DESERIALIZER, "latest");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.preview_transform}".
	 */
	private static final SimpleEndpoint<PreviewTransformRequest, Void> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code transform.preview_transform}" endpoint.
	 */
	public static <TTransform> Endpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ElasticsearchError> createPreviewTransformEndpoint(
			JsonpDeserializer<TTransform> tTransformDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				PreviewTransformResponse.createPreviewTransformResponseDeserializer(tTransformDeserializer));
	}
}
