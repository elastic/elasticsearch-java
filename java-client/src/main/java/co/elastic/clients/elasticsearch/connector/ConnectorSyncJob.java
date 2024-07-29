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
import java.lang.Long;
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

// typedef: connector._types.ConnectorSyncJob

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.ConnectorSyncJob">API
 *      specification</a>
 */
@JsonpDeserializable
public class ConnectorSyncJob implements JsonpSerializable {
	@Nullable
	private final DateTime cancelationRequestedAt;

	@Nullable
	private final DateTime canceledAt;

	@Nullable
	private final DateTime completedAt;

	private final SyncJobConnectorReference connector;

	private final DateTime createdAt;

	private final long deletedDocumentCount;

	@Nullable
	private final String error;

	private final String id;

	private final long indexedDocumentCount;

	private final long indexedDocumentVolume;

	private final SyncJobType jobType;

	@Nullable
	private final DateTime lastSeen;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final DateTime startedAt;

	private final SyncStatus status;

	private final long totalDocumentCount;

	private final SyncJobTriggerMethod triggerMethod;

	@Nullable
	private final String workerHostname;

	// ---------------------------------------------------------------------------------------------

	protected ConnectorSyncJob(AbstractBuilder<?> builder) {

		this.cancelationRequestedAt = builder.cancelationRequestedAt;
		this.canceledAt = builder.canceledAt;
		this.completedAt = builder.completedAt;
		this.connector = ApiTypeHelper.requireNonNull(builder.connector, this, "connector");
		this.createdAt = ApiTypeHelper.requireNonNull(builder.createdAt, this, "createdAt");
		this.deletedDocumentCount = ApiTypeHelper.requireNonNull(builder.deletedDocumentCount, this,
				"deletedDocumentCount");
		this.error = builder.error;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.indexedDocumentCount = ApiTypeHelper.requireNonNull(builder.indexedDocumentCount, this,
				"indexedDocumentCount");
		this.indexedDocumentVolume = ApiTypeHelper.requireNonNull(builder.indexedDocumentVolume, this,
				"indexedDocumentVolume");
		this.jobType = ApiTypeHelper.requireNonNull(builder.jobType, this, "jobType");
		this.lastSeen = builder.lastSeen;
		this.metadata = ApiTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.startedAt = builder.startedAt;
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.totalDocumentCount = ApiTypeHelper.requireNonNull(builder.totalDocumentCount, this, "totalDocumentCount");
		this.triggerMethod = ApiTypeHelper.requireNonNull(builder.triggerMethod, this, "triggerMethod");
		this.workerHostname = builder.workerHostname;

	}

	public static ConnectorSyncJob connectorSyncJobOf(Function<Builder, ObjectBuilder<ConnectorSyncJob>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code cancelation_requested_at}
	 */
	@Nullable
	public final DateTime cancelationRequestedAt() {
		return this.cancelationRequestedAt;
	}

	/**
	 * API name: {@code canceled_at}
	 */
	@Nullable
	public final DateTime canceledAt() {
		return this.canceledAt;
	}

	/**
	 * API name: {@code completed_at}
	 */
	@Nullable
	public final DateTime completedAt() {
		return this.completedAt;
	}

	/**
	 * Required - API name: {@code connector}
	 */
	public final SyncJobConnectorReference connector() {
		return this.connector;
	}

	/**
	 * Required - API name: {@code created_at}
	 */
	public final DateTime createdAt() {
		return this.createdAt;
	}

	/**
	 * Required - API name: {@code deleted_document_count}
	 */
	public final long deletedDocumentCount() {
		return this.deletedDocumentCount;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code indexed_document_count}
	 */
	public final long indexedDocumentCount() {
		return this.indexedDocumentCount;
	}

	/**
	 * Required - API name: {@code indexed_document_volume}
	 */
	public final long indexedDocumentVolume() {
		return this.indexedDocumentVolume;
	}

	/**
	 * Required - API name: {@code job_type}
	 */
	public final SyncJobType jobType() {
		return this.jobType;
	}

	/**
	 * API name: {@code last_seen}
	 */
	@Nullable
	public final DateTime lastSeen() {
		return this.lastSeen;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code started_at}
	 */
	@Nullable
	public final DateTime startedAt() {
		return this.startedAt;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final SyncStatus status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code total_document_count}
	 */
	public final long totalDocumentCount() {
		return this.totalDocumentCount;
	}

	/**
	 * Required - API name: {@code trigger_method}
	 */
	public final SyncJobTriggerMethod triggerMethod() {
		return this.triggerMethod;
	}

	/**
	 * API name: {@code worker_hostname}
	 */
	@Nullable
	public final String workerHostname() {
		return this.workerHostname;
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

		if (this.cancelationRequestedAt != null) {
			generator.writeKey("cancelation_requested_at");
			this.cancelationRequestedAt.serialize(generator, mapper);
		}
		if (this.canceledAt != null) {
			generator.writeKey("canceled_at");
			this.canceledAt.serialize(generator, mapper);
		}
		if (this.completedAt != null) {
			generator.writeKey("completed_at");
			this.completedAt.serialize(generator, mapper);
		}
		generator.writeKey("connector");
		this.connector.serialize(generator, mapper);

		generator.writeKey("created_at");
		this.createdAt.serialize(generator, mapper);
		generator.writeKey("deleted_document_count");
		generator.write(this.deletedDocumentCount);

		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("indexed_document_count");
		generator.write(this.indexedDocumentCount);

		generator.writeKey("indexed_document_volume");
		generator.write(this.indexedDocumentVolume);

		generator.writeKey("job_type");
		this.jobType.serialize(generator, mapper);
		if (this.lastSeen != null) {
			generator.writeKey("last_seen");
			this.lastSeen.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.startedAt != null) {
			generator.writeKey("started_at");
			this.startedAt.serialize(generator, mapper);
		}
		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		generator.writeKey("total_document_count");
		generator.write(this.totalDocumentCount);

		generator.writeKey("trigger_method");
		this.triggerMethod.serialize(generator, mapper);
		if (this.workerHostname != null) {
			generator.writeKey("worker_hostname");
			generator.write(this.workerHostname);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConnectorSyncJob}.
	 */

	public static class Builder extends ConnectorSyncJob.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ConnectorSyncJob> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConnectorSyncJob}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConnectorSyncJob build() {
			_checkSingleUse();

			return new ConnectorSyncJob(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private DateTime cancelationRequestedAt;

		@Nullable
		private DateTime canceledAt;

		@Nullable
		private DateTime completedAt;

		private SyncJobConnectorReference connector;

		private DateTime createdAt;

		private Long deletedDocumentCount;

		@Nullable
		private String error;

		private String id;

		private Long indexedDocumentCount;

		private Long indexedDocumentVolume;

		private SyncJobType jobType;

		@Nullable
		private DateTime lastSeen;

		private Map<String, JsonData> metadata;

		@Nullable
		private DateTime startedAt;

		private SyncStatus status;

		private Long totalDocumentCount;

		private SyncJobTriggerMethod triggerMethod;

		@Nullable
		private String workerHostname;

		/**
		 * API name: {@code cancelation_requested_at}
		 */
		public final BuilderT cancelationRequestedAt(@Nullable DateTime value) {
			this.cancelationRequestedAt = value;
			return self();
		}

		/**
		 * API name: {@code canceled_at}
		 */
		public final BuilderT canceledAt(@Nullable DateTime value) {
			this.canceledAt = value;
			return self();
		}

		/**
		 * API name: {@code completed_at}
		 */
		public final BuilderT completedAt(@Nullable DateTime value) {
			this.completedAt = value;
			return self();
		}

		/**
		 * Required - API name: {@code connector}
		 */
		public final BuilderT connector(SyncJobConnectorReference value) {
			this.connector = value;
			return self();
		}

		/**
		 * Required - API name: {@code connector}
		 */
		public final BuilderT connector(
				Function<SyncJobConnectorReference.Builder, ObjectBuilder<SyncJobConnectorReference>> fn) {
			return this.connector(fn.apply(new SyncJobConnectorReference.Builder()).build());
		}

		/**
		 * Required - API name: {@code created_at}
		 */
		public final BuilderT createdAt(DateTime value) {
			this.createdAt = value;
			return self();
		}

		/**
		 * Required - API name: {@code deleted_document_count}
		 */
		public final BuilderT deletedDocumentCount(long value) {
			this.deletedDocumentCount = value;
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
		 * Required - API name: {@code id}
		 */
		public final BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - API name: {@code indexed_document_count}
		 */
		public final BuilderT indexedDocumentCount(long value) {
			this.indexedDocumentCount = value;
			return self();
		}

		/**
		 * Required - API name: {@code indexed_document_volume}
		 */
		public final BuilderT indexedDocumentVolume(long value) {
			this.indexedDocumentVolume = value;
			return self();
		}

		/**
		 * Required - API name: {@code job_type}
		 */
		public final BuilderT jobType(SyncJobType value) {
			this.jobType = value;
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
		 * Required - API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final BuilderT metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return self();
		}

		/**
		 * Required - API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final BuilderT metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return self();
		}

		/**
		 * API name: {@code started_at}
		 */
		public final BuilderT startedAt(@Nullable DateTime value) {
			this.startedAt = value;
			return self();
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final BuilderT status(SyncStatus value) {
			this.status = value;
			return self();
		}

		/**
		 * Required - API name: {@code total_document_count}
		 */
		public final BuilderT totalDocumentCount(long value) {
			this.totalDocumentCount = value;
			return self();
		}

		/**
		 * Required - API name: {@code trigger_method}
		 */
		public final BuilderT triggerMethod(SyncJobTriggerMethod value) {
			this.triggerMethod = value;
			return self();
		}

		/**
		 * API name: {@code worker_hostname}
		 */
		public final BuilderT workerHostname(@Nullable String value) {
			this.workerHostname = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConnectorSyncJob}
	 */
	public static final JsonpDeserializer<ConnectorSyncJob> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ConnectorSyncJob::setupConnectorSyncJobDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupConnectorSyncJobDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::cancelationRequestedAt, DateTime._DESERIALIZER, "cancelation_requested_at");
		op.add(AbstractBuilder::canceledAt, DateTime._DESERIALIZER, "canceled_at");
		op.add(AbstractBuilder::completedAt, DateTime._DESERIALIZER, "completed_at");
		op.add(AbstractBuilder::connector, SyncJobConnectorReference._DESERIALIZER, "connector");
		op.add(AbstractBuilder::createdAt, DateTime._DESERIALIZER, "created_at");
		op.add(AbstractBuilder::deletedDocumentCount, JsonpDeserializer.longDeserializer(), "deleted_document_count");
		op.add(AbstractBuilder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::indexedDocumentCount, JsonpDeserializer.longDeserializer(), "indexed_document_count");
		op.add(AbstractBuilder::indexedDocumentVolume, JsonpDeserializer.longDeserializer(), "indexed_document_volume");
		op.add(AbstractBuilder::jobType, SyncJobType._DESERIALIZER, "job_type");
		op.add(AbstractBuilder::lastSeen, DateTime._DESERIALIZER, "last_seen");
		op.add(AbstractBuilder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(AbstractBuilder::startedAt, DateTime._DESERIALIZER, "started_at");
		op.add(AbstractBuilder::status, SyncStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::totalDocumentCount, JsonpDeserializer.longDeserializer(), "total_document_count");
		op.add(AbstractBuilder::triggerMethod, SyncJobTriggerMethod._DESERIALIZER, "trigger_method");
		op.add(AbstractBuilder::workerHostname, JsonpDeserializer.stringDeserializer(), "worker_hostname");

	}

}
