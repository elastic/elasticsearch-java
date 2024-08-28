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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: connector._types.Connector

/**
 *
 * @see <a href="../doc-files/api-spec.html#connector._types.Connector">API
 *      specification</a>
 */
@JsonpDeserializable
public class Connector implements JsonpSerializable {
	@Nullable
	private final String apiKeyId;

	@Nullable
	private final String apiKeySecretId;

	private final Map<String, ConnectorConfigProperties> configuration;

	private final Map<String, CustomScheduling> customScheduling;

	@Nullable
	private final String description;

	@Nullable
	private final String error;

	@Nullable
	private final ConnectorFeatures features;

	private final List<FilteringConfig> filtering;

	@Nullable
	private final String id;

	@Nullable
	private final String indexName;

	private final boolean isNative;

	@Nullable
	private final String language;

	@Nullable
	private final String lastAccessControlSyncError;

	@Nullable
	private final DateTime lastAccessControlSyncScheduledAt;

	@Nullable
	private final SyncStatus lastAccessControlSyncStatus;

	@Nullable
	private final Long lastDeletedDocumentCount;

	@Nullable
	private final DateTime lastIncrementalSyncScheduledAt;

	@Nullable
	private final Long lastIndexedDocumentCount;

	@Nullable
	private final DateTime lastSeen;

	@Nullable
	private final String lastSyncError;

	@Nullable
	private final DateTime lastSyncScheduledAt;

	@Nullable
	private final SyncStatus lastSyncStatus;

	@Nullable
	private final DateTime lastSynced;

	@Nullable
	private final String name;

	@Nullable
	private final IngestPipelineParams pipeline;

	private final SchedulingConfiguration scheduling;

	@Nullable
	private final String serviceType;

	private final ConnectorStatus status;

	@Nullable
	private final JsonData syncCursor;

	private final boolean syncNow;

	// ---------------------------------------------------------------------------------------------

	protected Connector(AbstractBuilder<?> builder) {

		this.apiKeyId = builder.apiKeyId;
		this.apiKeySecretId = builder.apiKeySecretId;
		this.configuration = ApiTypeHelper.unmodifiableRequired(builder.configuration, this, "configuration");
		this.customScheduling = ApiTypeHelper.unmodifiableRequired(builder.customScheduling, this, "customScheduling");
		this.description = builder.description;
		this.error = builder.error;
		this.features = builder.features;
		this.filtering = ApiTypeHelper.unmodifiableRequired(builder.filtering, this, "filtering");
		this.id = builder.id;
		this.indexName = builder.indexName;
		this.isNative = ApiTypeHelper.requireNonNull(builder.isNative, this, "isNative");
		this.language = builder.language;
		this.lastAccessControlSyncError = builder.lastAccessControlSyncError;
		this.lastAccessControlSyncScheduledAt = builder.lastAccessControlSyncScheduledAt;
		this.lastAccessControlSyncStatus = builder.lastAccessControlSyncStatus;
		this.lastDeletedDocumentCount = builder.lastDeletedDocumentCount;
		this.lastIncrementalSyncScheduledAt = builder.lastIncrementalSyncScheduledAt;
		this.lastIndexedDocumentCount = builder.lastIndexedDocumentCount;
		this.lastSeen = builder.lastSeen;
		this.lastSyncError = builder.lastSyncError;
		this.lastSyncScheduledAt = builder.lastSyncScheduledAt;
		this.lastSyncStatus = builder.lastSyncStatus;
		this.lastSynced = builder.lastSynced;
		this.name = builder.name;
		this.pipeline = builder.pipeline;
		this.scheduling = ApiTypeHelper.requireNonNull(builder.scheduling, this, "scheduling");
		this.serviceType = builder.serviceType;
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.syncCursor = builder.syncCursor;
		this.syncNow = ApiTypeHelper.requireNonNull(builder.syncNow, this, "syncNow");

	}

	public static Connector connectorOf(Function<Builder, ObjectBuilder<Connector>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code api_key_id}
	 */
	@Nullable
	public final String apiKeyId() {
		return this.apiKeyId;
	}

	/**
	 * API name: {@code api_key_secret_id}
	 */
	@Nullable
	public final String apiKeySecretId() {
		return this.apiKeySecretId;
	}

	/**
	 * Required - API name: {@code configuration}
	 */
	public final Map<String, ConnectorConfigProperties> configuration() {
		return this.configuration;
	}

	/**
	 * Required - API name: {@code custom_scheduling}
	 */
	public final Map<String, CustomScheduling> customScheduling() {
		return this.customScheduling;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
	}

	/**
	 * API name: {@code features}
	 */
	@Nullable
	public final ConnectorFeatures features() {
		return this.features;
	}

	/**
	 * Required - API name: {@code filtering}
	 */
	public final List<FilteringConfig> filtering() {
		return this.filtering;
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code index_name}
	 */
	@Nullable
	public final String indexName() {
		return this.indexName;
	}

	/**
	 * Required - API name: {@code is_native}
	 */
	public final boolean isNative() {
		return this.isNative;
	}

	/**
	 * API name: {@code language}
	 */
	@Nullable
	public final String language() {
		return this.language;
	}

	/**
	 * API name: {@code last_access_control_sync_error}
	 */
	@Nullable
	public final String lastAccessControlSyncError() {
		return this.lastAccessControlSyncError;
	}

	/**
	 * API name: {@code last_access_control_sync_scheduled_at}
	 */
	@Nullable
	public final DateTime lastAccessControlSyncScheduledAt() {
		return this.lastAccessControlSyncScheduledAt;
	}

	/**
	 * API name: {@code last_access_control_sync_status}
	 */
	@Nullable
	public final SyncStatus lastAccessControlSyncStatus() {
		return this.lastAccessControlSyncStatus;
	}

	/**
	 * API name: {@code last_deleted_document_count}
	 */
	@Nullable
	public final Long lastDeletedDocumentCount() {
		return this.lastDeletedDocumentCount;
	}

	/**
	 * API name: {@code last_incremental_sync_scheduled_at}
	 */
	@Nullable
	public final DateTime lastIncrementalSyncScheduledAt() {
		return this.lastIncrementalSyncScheduledAt;
	}

	/**
	 * API name: {@code last_indexed_document_count}
	 */
	@Nullable
	public final Long lastIndexedDocumentCount() {
		return this.lastIndexedDocumentCount;
	}

	/**
	 * API name: {@code last_seen}
	 */
	@Nullable
	public final DateTime lastSeen() {
		return this.lastSeen;
	}

	/**
	 * API name: {@code last_sync_error}
	 */
	@Nullable
	public final String lastSyncError() {
		return this.lastSyncError;
	}

	/**
	 * API name: {@code last_sync_scheduled_at}
	 */
	@Nullable
	public final DateTime lastSyncScheduledAt() {
		return this.lastSyncScheduledAt;
	}

	/**
	 * API name: {@code last_sync_status}
	 */
	@Nullable
	public final SyncStatus lastSyncStatus() {
		return this.lastSyncStatus;
	}

	/**
	 * API name: {@code last_synced}
	 */
	@Nullable
	public final DateTime lastSynced() {
		return this.lastSynced;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final IngestPipelineParams pipeline() {
		return this.pipeline;
	}

	/**
	 * Required - API name: {@code scheduling}
	 */
	public final SchedulingConfiguration scheduling() {
		return this.scheduling;
	}

	/**
	 * API name: {@code service_type}
	 */
	@Nullable
	public final String serviceType() {
		return this.serviceType;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ConnectorStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code sync_cursor}
	 */
	@Nullable
	public final JsonData syncCursor() {
		return this.syncCursor;
	}

	/**
	 * Required - API name: {@code sync_now}
	 */
	public final boolean syncNow() {
		return this.syncNow;
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

		if (this.apiKeyId != null) {
			generator.writeKey("api_key_id");
			generator.write(this.apiKeyId);

		}
		if (this.apiKeySecretId != null) {
			generator.writeKey("api_key_secret_id");
			generator.write(this.apiKeySecretId);

		}
		if (ApiTypeHelper.isDefined(this.configuration)) {
			generator.writeKey("configuration");
			generator.writeStartObject();
			for (Map.Entry<String, ConnectorConfigProperties> item0 : this.configuration.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.customScheduling)) {
			generator.writeKey("custom_scheduling");
			generator.writeStartObject();
			for (Map.Entry<String, CustomScheduling> item0 : this.customScheduling.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}
		if (this.features != null) {
			generator.writeKey("features");
			this.features.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.filtering)) {
			generator.writeKey("filtering");
			generator.writeStartArray();
			for (FilteringConfig item0 : this.filtering) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.indexName != null) {
			generator.writeKey("index_name");
			generator.write(this.indexName);

		}
		generator.writeKey("is_native");
		generator.write(this.isNative);

		if (this.language != null) {
			generator.writeKey("language");
			generator.write(this.language);

		}
		if (this.lastAccessControlSyncError != null) {
			generator.writeKey("last_access_control_sync_error");
			generator.write(this.lastAccessControlSyncError);

		}
		if (this.lastAccessControlSyncScheduledAt != null) {
			generator.writeKey("last_access_control_sync_scheduled_at");
			this.lastAccessControlSyncScheduledAt.serialize(generator, mapper);
		}
		if (this.lastAccessControlSyncStatus != null) {
			generator.writeKey("last_access_control_sync_status");
			this.lastAccessControlSyncStatus.serialize(generator, mapper);
		}
		if (this.lastDeletedDocumentCount != null) {
			generator.writeKey("last_deleted_document_count");
			generator.write(this.lastDeletedDocumentCount);

		}
		if (this.lastIncrementalSyncScheduledAt != null) {
			generator.writeKey("last_incremental_sync_scheduled_at");
			this.lastIncrementalSyncScheduledAt.serialize(generator, mapper);
		}
		if (this.lastIndexedDocumentCount != null) {
			generator.writeKey("last_indexed_document_count");
			generator.write(this.lastIndexedDocumentCount);

		}
		if (this.lastSeen != null) {
			generator.writeKey("last_seen");
			this.lastSeen.serialize(generator, mapper);
		}
		if (this.lastSyncError != null) {
			generator.writeKey("last_sync_error");
			generator.write(this.lastSyncError);

		}
		if (this.lastSyncScheduledAt != null) {
			generator.writeKey("last_sync_scheduled_at");
			this.lastSyncScheduledAt.serialize(generator, mapper);
		}
		if (this.lastSyncStatus != null) {
			generator.writeKey("last_sync_status");
			this.lastSyncStatus.serialize(generator, mapper);
		}
		if (this.lastSynced != null) {
			generator.writeKey("last_synced");
			this.lastSynced.serialize(generator, mapper);
		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			this.pipeline.serialize(generator, mapper);

		}
		generator.writeKey("scheduling");
		this.scheduling.serialize(generator, mapper);

		if (this.serviceType != null) {
			generator.writeKey("service_type");
			generator.write(this.serviceType);

		}
		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		if (this.syncCursor != null) {
			generator.writeKey("sync_cursor");
			this.syncCursor.serialize(generator, mapper);

		}
		generator.writeKey("sync_now");
		generator.write(this.syncNow);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Connector}.
	 */

	public static class Builder extends Connector.AbstractBuilder<Builder> implements ObjectBuilder<Connector> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Connector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Connector build() {
			_checkSingleUse();

			return new Connector(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String apiKeyId;

		@Nullable
		private String apiKeySecretId;

		private Map<String, ConnectorConfigProperties> configuration;

		private Map<String, CustomScheduling> customScheduling;

		@Nullable
		private String description;

		@Nullable
		private String error;

		@Nullable
		private ConnectorFeatures features;

		private List<FilteringConfig> filtering;

		@Nullable
		private String id;

		@Nullable
		private String indexName;

		private Boolean isNative;

		@Nullable
		private String language;

		@Nullable
		private String lastAccessControlSyncError;

		@Nullable
		private DateTime lastAccessControlSyncScheduledAt;

		@Nullable
		private SyncStatus lastAccessControlSyncStatus;

		@Nullable
		private Long lastDeletedDocumentCount;

		@Nullable
		private DateTime lastIncrementalSyncScheduledAt;

		@Nullable
		private Long lastIndexedDocumentCount;

		@Nullable
		private DateTime lastSeen;

		@Nullable
		private String lastSyncError;

		@Nullable
		private DateTime lastSyncScheduledAt;

		@Nullable
		private SyncStatus lastSyncStatus;

		@Nullable
		private DateTime lastSynced;

		@Nullable
		private String name;

		@Nullable
		private IngestPipelineParams pipeline;

		private SchedulingConfiguration scheduling;

		@Nullable
		private String serviceType;

		private ConnectorStatus status;

		@Nullable
		private JsonData syncCursor;

		private Boolean syncNow;

		/**
		 * API name: {@code api_key_id}
		 */
		public final BuilderT apiKeyId(@Nullable String value) {
			this.apiKeyId = value;
			return self();
		}

		/**
		 * API name: {@code api_key_secret_id}
		 */
		public final BuilderT apiKeySecretId(@Nullable String value) {
			this.apiKeySecretId = value;
			return self();
		}

		/**
		 * Required - API name: {@code configuration}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>configuration</code>.
		 */
		public final BuilderT configuration(Map<String, ConnectorConfigProperties> map) {
			this.configuration = _mapPutAll(this.configuration, map);
			return self();
		}

		/**
		 * Required - API name: {@code configuration}
		 * <p>
		 * Adds an entry to <code>configuration</code>.
		 */
		public final BuilderT configuration(String key, ConnectorConfigProperties value) {
			this.configuration = _mapPut(this.configuration, key, value);
			return self();
		}

		/**
		 * Required - API name: {@code configuration}
		 * <p>
		 * Adds an entry to <code>configuration</code> using a builder lambda.
		 */
		public final BuilderT configuration(String key,
				Function<ConnectorConfigProperties.Builder, ObjectBuilder<ConnectorConfigProperties>> fn) {
			return configuration(key, fn.apply(new ConnectorConfigProperties.Builder()).build());
		}

		/**
		 * Required - API name: {@code custom_scheduling}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>customScheduling</code>.
		 */
		public final BuilderT customScheduling(Map<String, CustomScheduling> map) {
			this.customScheduling = _mapPutAll(this.customScheduling, map);
			return self();
		}

		/**
		 * Required - API name: {@code custom_scheduling}
		 * <p>
		 * Adds an entry to <code>customScheduling</code>.
		 */
		public final BuilderT customScheduling(String key, CustomScheduling value) {
			this.customScheduling = _mapPut(this.customScheduling, key, value);
			return self();
		}

		/**
		 * Required - API name: {@code custom_scheduling}
		 * <p>
		 * Adds an entry to <code>customScheduling</code> using a builder lambda.
		 */
		public final BuilderT customScheduling(String key,
				Function<CustomScheduling.Builder, ObjectBuilder<CustomScheduling>> fn) {
			return customScheduling(key, fn.apply(new CustomScheduling.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public final BuilderT description(@Nullable String value) {
			this.description = value;
			return self();
		}

		/**
		 * API name: {@code error}
		 */
		public final BuilderT error(@Nullable String value) {
			this.error = value;
			return self();
		}

		/**
		 * API name: {@code features}
		 */
		public final BuilderT features(@Nullable ConnectorFeatures value) {
			this.features = value;
			return self();
		}

		/**
		 * API name: {@code features}
		 */
		public final BuilderT features(Function<ConnectorFeatures.Builder, ObjectBuilder<ConnectorFeatures>> fn) {
			return this.features(fn.apply(new ConnectorFeatures.Builder()).build());
		}

		/**
		 * Required - API name: {@code filtering}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filtering</code>.
		 */
		public final BuilderT filtering(List<FilteringConfig> list) {
			this.filtering = _listAddAll(this.filtering, list);
			return self();
		}

		/**
		 * Required - API name: {@code filtering}
		 * <p>
		 * Adds one or more values to <code>filtering</code>.
		 */
		public final BuilderT filtering(FilteringConfig value, FilteringConfig... values) {
			this.filtering = _listAdd(this.filtering, value, values);
			return self();
		}

		/**
		 * Required - API name: {@code filtering}
		 * <p>
		 * Adds a value to <code>filtering</code> using a builder lambda.
		 */
		public final BuilderT filtering(Function<FilteringConfig.Builder, ObjectBuilder<FilteringConfig>> fn) {
			return filtering(fn.apply(new FilteringConfig.Builder()).build());
		}

		/**
		 * API name: {@code id}
		 */
		public final BuilderT id(@Nullable String value) {
			this.id = value;
			return self();
		}

		/**
		 * API name: {@code index_name}
		 */
		public final BuilderT indexName(@Nullable String value) {
			this.indexName = value;
			return self();
		}

		/**
		 * Required - API name: {@code is_native}
		 */
		public final BuilderT isNative(boolean value) {
			this.isNative = value;
			return self();
		}

		/**
		 * API name: {@code language}
		 */
		public final BuilderT language(@Nullable String value) {
			this.language = value;
			return self();
		}

		/**
		 * API name: {@code last_access_control_sync_error}
		 */
		public final BuilderT lastAccessControlSyncError(@Nullable String value) {
			this.lastAccessControlSyncError = value;
			return self();
		}

		/**
		 * API name: {@code last_access_control_sync_scheduled_at}
		 */
		public final BuilderT lastAccessControlSyncScheduledAt(@Nullable DateTime value) {
			this.lastAccessControlSyncScheduledAt = value;
			return self();
		}

		/**
		 * API name: {@code last_access_control_sync_status}
		 */
		public final BuilderT lastAccessControlSyncStatus(@Nullable SyncStatus value) {
			this.lastAccessControlSyncStatus = value;
			return self();
		}

		/**
		 * API name: {@code last_deleted_document_count}
		 */
		public final BuilderT lastDeletedDocumentCount(@Nullable Long value) {
			this.lastDeletedDocumentCount = value;
			return self();
		}

		/**
		 * API name: {@code last_incremental_sync_scheduled_at}
		 */
		public final BuilderT lastIncrementalSyncScheduledAt(@Nullable DateTime value) {
			this.lastIncrementalSyncScheduledAt = value;
			return self();
		}

		/**
		 * API name: {@code last_indexed_document_count}
		 */
		public final BuilderT lastIndexedDocumentCount(@Nullable Long value) {
			this.lastIndexedDocumentCount = value;
			return self();
		}

		/**
		 * API name: {@code last_seen}
		 */
		public final BuilderT lastSeen(@Nullable DateTime value) {
			this.lastSeen = value;
			return self();
		}

		/**
		 * API name: {@code last_sync_error}
		 */
		public final BuilderT lastSyncError(@Nullable String value) {
			this.lastSyncError = value;
			return self();
		}

		/**
		 * API name: {@code last_sync_scheduled_at}
		 */
		public final BuilderT lastSyncScheduledAt(@Nullable DateTime value) {
			this.lastSyncScheduledAt = value;
			return self();
		}

		/**
		 * API name: {@code last_sync_status}
		 */
		public final BuilderT lastSyncStatus(@Nullable SyncStatus value) {
			this.lastSyncStatus = value;
			return self();
		}

		/**
		 * API name: {@code last_synced}
		 */
		public final BuilderT lastSynced(@Nullable DateTime value) {
			this.lastSynced = value;
			return self();
		}

		/**
		 * API name: {@code name}
		 */
		public final BuilderT name(@Nullable String value) {
			this.name = value;
			return self();
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final BuilderT pipeline(@Nullable IngestPipelineParams value) {
			this.pipeline = value;
			return self();
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final BuilderT pipeline(Function<IngestPipelineParams.Builder, ObjectBuilder<IngestPipelineParams>> fn) {
			return this.pipeline(fn.apply(new IngestPipelineParams.Builder()).build());
		}

		/**
		 * Required - API name: {@code scheduling}
		 */
		public final BuilderT scheduling(SchedulingConfiguration value) {
			this.scheduling = value;
			return self();
		}

		/**
		 * Required - API name: {@code scheduling}
		 */
		public final BuilderT scheduling(
				Function<SchedulingConfiguration.Builder, ObjectBuilder<SchedulingConfiguration>> fn) {
			return this.scheduling(fn.apply(new SchedulingConfiguration.Builder()).build());
		}

		/**
		 * API name: {@code service_type}
		 */
		public final BuilderT serviceType(@Nullable String value) {
			this.serviceType = value;
			return self();
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final BuilderT status(ConnectorStatus value) {
			this.status = value;
			return self();
		}

		/**
		 * API name: {@code sync_cursor}
		 */
		public final BuilderT syncCursor(@Nullable JsonData value) {
			this.syncCursor = value;
			return self();
		}

		/**
		 * Required - API name: {@code sync_now}
		 */
		public final BuilderT syncNow(boolean value) {
			this.syncNow = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Connector}
	 */
	public static final JsonpDeserializer<Connector> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Connector::setupConnectorDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupConnectorDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::apiKeyId, JsonpDeserializer.stringDeserializer(), "api_key_id");
		op.add(AbstractBuilder::apiKeySecretId, JsonpDeserializer.stringDeserializer(), "api_key_secret_id");
		op.add(AbstractBuilder::configuration,
				JsonpDeserializer.stringMapDeserializer(ConnectorConfigProperties._DESERIALIZER), "configuration");
		op.add(AbstractBuilder::customScheduling,
				JsonpDeserializer.stringMapDeserializer(CustomScheduling._DESERIALIZER), "custom_scheduling");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(AbstractBuilder::features, ConnectorFeatures._DESERIALIZER, "features");
		op.add(AbstractBuilder::filtering, JsonpDeserializer.arrayDeserializer(FilteringConfig._DESERIALIZER),
				"filtering");
		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(AbstractBuilder::isNative, JsonpDeserializer.booleanDeserializer(), "is_native");
		op.add(AbstractBuilder::language, JsonpDeserializer.stringDeserializer(), "language");
		op.add(AbstractBuilder::lastAccessControlSyncError, JsonpDeserializer.stringDeserializer(),
				"last_access_control_sync_error");
		op.add(AbstractBuilder::lastAccessControlSyncScheduledAt, DateTime._DESERIALIZER,
				"last_access_control_sync_scheduled_at");
		op.add(AbstractBuilder::lastAccessControlSyncStatus, SyncStatus._DESERIALIZER,
				"last_access_control_sync_status");
		op.add(AbstractBuilder::lastDeletedDocumentCount, JsonpDeserializer.longDeserializer(),
				"last_deleted_document_count");
		op.add(AbstractBuilder::lastIncrementalSyncScheduledAt, DateTime._DESERIALIZER,
				"last_incremental_sync_scheduled_at");
		op.add(AbstractBuilder::lastIndexedDocumentCount, JsonpDeserializer.longDeserializer(),
				"last_indexed_document_count");
		op.add(AbstractBuilder::lastSeen, DateTime._DESERIALIZER, "last_seen");
		op.add(AbstractBuilder::lastSyncError, JsonpDeserializer.stringDeserializer(), "last_sync_error");
		op.add(AbstractBuilder::lastSyncScheduledAt, DateTime._DESERIALIZER, "last_sync_scheduled_at");
		op.add(AbstractBuilder::lastSyncStatus, SyncStatus._DESERIALIZER, "last_sync_status");
		op.add(AbstractBuilder::lastSynced, DateTime._DESERIALIZER, "last_synced");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(AbstractBuilder::pipeline, IngestPipelineParams._DESERIALIZER, "pipeline");
		op.add(AbstractBuilder::scheduling, SchedulingConfiguration._DESERIALIZER, "scheduling");
		op.add(AbstractBuilder::serviceType, JsonpDeserializer.stringDeserializer(), "service_type");
		op.add(AbstractBuilder::status, ConnectorStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::syncCursor, JsonData._DESERIALIZER, "sync_cursor");
		op.add(AbstractBuilder::syncNow, JsonpDeserializer.booleanDeserializer(), "sync_now");

	}

}
