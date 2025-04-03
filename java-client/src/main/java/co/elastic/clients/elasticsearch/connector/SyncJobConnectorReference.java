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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: connector._types.SyncJobConnectorReference

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.SyncJobConnectorReference">API
 *      specification</a>
 */
@JsonpDeserializable
public class SyncJobConnectorReference implements JsonpSerializable {
	private final Map<String, ConnectorConfigProperties> configuration;

	private final FilteringRules filtering;

	private final String id;

	private final String indexName;

	@Nullable
	private final String language;

	@Nullable
	private final IngestPipelineParams pipeline;

	private final String serviceType;

	@Nullable
	private final JsonData syncCursor;

	// ---------------------------------------------------------------------------------------------

	private SyncJobConnectorReference(Builder builder) {

		this.configuration = ApiTypeHelper.unmodifiableRequired(builder.configuration, this, "configuration");
		this.filtering = ApiTypeHelper.requireNonNull(builder.filtering, this, "filtering");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.indexName = ApiTypeHelper.requireNonNull(builder.indexName, this, "indexName");
		this.language = builder.language;
		this.pipeline = builder.pipeline;
		this.serviceType = ApiTypeHelper.requireNonNull(builder.serviceType, this, "serviceType");
		this.syncCursor = builder.syncCursor;

	}

	public static SyncJobConnectorReference of(Function<Builder, ObjectBuilder<SyncJobConnectorReference>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code configuration}
	 */
	public final Map<String, ConnectorConfigProperties> configuration() {
		return this.configuration;
	}

	/**
	 * Required - API name: {@code filtering}
	 */
	public final FilteringRules filtering() {
		return this.filtering;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index_name}
	 */
	public final String indexName() {
		return this.indexName;
	}

	/**
	 * API name: {@code language}
	 */
	@Nullable
	public final String language() {
		return this.language;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final IngestPipelineParams pipeline() {
		return this.pipeline;
	}

	/**
	 * Required - API name: {@code service_type}
	 */
	public final String serviceType() {
		return this.serviceType;
	}

	/**
	 * API name: {@code sync_cursor}
	 */
	@Nullable
	public final JsonData syncCursor() {
		return this.syncCursor;
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

		if (ApiTypeHelper.isDefined(this.configuration)) {
			generator.writeKey("configuration");
			generator.writeStartObject();
			for (Map.Entry<String, ConnectorConfigProperties> item0 : this.configuration.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("filtering");
		this.filtering.serialize(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index_name");
		generator.write(this.indexName);

		if (this.language != null) {
			generator.writeKey("language");
			generator.write(this.language);

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			this.pipeline.serialize(generator, mapper);

		}
		generator.writeKey("service_type");
		generator.write(this.serviceType);

		if (this.syncCursor != null) {
			generator.writeKey("sync_cursor");
			this.syncCursor.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SyncJobConnectorReference}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SyncJobConnectorReference> {
		private Map<String, ConnectorConfigProperties> configuration;

		private FilteringRules filtering;

		private String id;

		private String indexName;

		@Nullable
		private String language;

		@Nullable
		private IngestPipelineParams pipeline;

		private String serviceType;

		@Nullable
		private JsonData syncCursor;

		/**
		 * Required - API name: {@code configuration}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>configuration</code>.
		 */
		public final Builder configuration(Map<String, ConnectorConfigProperties> map) {
			this.configuration = _mapPutAll(this.configuration, map);
			return this;
		}

		/**
		 * Required - API name: {@code configuration}
		 * <p>
		 * Adds an entry to <code>configuration</code>.
		 */
		public final Builder configuration(String key, ConnectorConfigProperties value) {
			this.configuration = _mapPut(this.configuration, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code configuration}
		 * <p>
		 * Adds an entry to <code>configuration</code> using a builder lambda.
		 */
		public final Builder configuration(String key,
				Function<ConnectorConfigProperties.Builder, ObjectBuilder<ConnectorConfigProperties>> fn) {
			return configuration(key, fn.apply(new ConnectorConfigProperties.Builder()).build());
		}

		/**
		 * Required - API name: {@code filtering}
		 */
		public final Builder filtering(FilteringRules value) {
			this.filtering = value;
			return this;
		}

		/**
		 * Required - API name: {@code filtering}
		 */
		public final Builder filtering(Function<FilteringRules.Builder, ObjectBuilder<FilteringRules>> fn) {
			return this.filtering(fn.apply(new FilteringRules.Builder()).build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_name}
		 */
		public final Builder indexName(String value) {
			this.indexName = value;
			return this;
		}

		/**
		 * API name: {@code language}
		 */
		public final Builder language(@Nullable String value) {
			this.language = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable IngestPipelineParams value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(Function<IngestPipelineParams.Builder, ObjectBuilder<IngestPipelineParams>> fn) {
			return this.pipeline(fn.apply(new IngestPipelineParams.Builder()).build());
		}

		/**
		 * Required - API name: {@code service_type}
		 */
		public final Builder serviceType(String value) {
			this.serviceType = value;
			return this;
		}

		/**
		 * API name: {@code sync_cursor}
		 */
		public final Builder syncCursor(@Nullable JsonData value) {
			this.syncCursor = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SyncJobConnectorReference}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SyncJobConnectorReference build() {
			_checkSingleUse();

			return new SyncJobConnectorReference(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SyncJobConnectorReference}
	 */
	public static final JsonpDeserializer<SyncJobConnectorReference> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SyncJobConnectorReference::setupSyncJobConnectorReferenceDeserializer);

	protected static void setupSyncJobConnectorReferenceDeserializer(
			ObjectDeserializer<SyncJobConnectorReference.Builder> op) {

		op.add(Builder::configuration, JsonpDeserializer.stringMapDeserializer(ConnectorConfigProperties._DESERIALIZER),
				"configuration");
		op.add(Builder::filtering, FilteringRules._DESERIALIZER, "filtering");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(Builder::language, JsonpDeserializer.stringDeserializer(), "language");
		op.add(Builder::pipeline, IngestPipelineParams._DESERIALIZER, "pipeline");
		op.add(Builder::serviceType, JsonpDeserializer.stringDeserializer(), "service_type");
		op.add(Builder::syncCursor, JsonData._DESERIALIZER, "sync_cursor");

	}

}
