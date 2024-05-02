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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
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

// typedef: connector.last_sync.Request

/**
 * Updates last sync stats in the connector document
 * 
 * @see <a href="../doc-files/api-spec.html#connector.last_sync.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class LastSyncRequest extends RequestBase implements JsonpSerializable {
	private final String connectorId;

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

	// ---------------------------------------------------------------------------------------------

	private LastSyncRequest(Builder builder) {

		this.connectorId = ApiTypeHelper.requireNonNull(builder.connectorId, this, "connectorId");
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

	}

	public static LastSyncRequest of(Function<Builder, ObjectBuilder<LastSyncRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the connector to be updated
	 * <p>
	 * API name: {@code connector_id}
	 */
	public final String connectorId() {
		return this.connectorId;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LastSyncRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<LastSyncRequest> {
		private String connectorId;

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

		/**
		 * Required - The unique identifier of the connector to be updated
		 * <p>
		 * API name: {@code connector_id}
		 */
		public final Builder connectorId(String value) {
			this.connectorId = value;
			return this;
		}

		/**
		 * API name: {@code last_access_control_sync_error}
		 */
		public final Builder lastAccessControlSyncError(@Nullable String value) {
			this.lastAccessControlSyncError = value;
			return this;
		}

		/**
		 * API name: {@code last_access_control_sync_scheduled_at}
		 */
		public final Builder lastAccessControlSyncScheduledAt(@Nullable DateTime value) {
			this.lastAccessControlSyncScheduledAt = value;
			return this;
		}

		/**
		 * API name: {@code last_access_control_sync_status}
		 */
		public final Builder lastAccessControlSyncStatus(@Nullable SyncStatus value) {
			this.lastAccessControlSyncStatus = value;
			return this;
		}

		/**
		 * API name: {@code last_deleted_document_count}
		 */
		public final Builder lastDeletedDocumentCount(@Nullable Long value) {
			this.lastDeletedDocumentCount = value;
			return this;
		}

		/**
		 * API name: {@code last_incremental_sync_scheduled_at}
		 */
		public final Builder lastIncrementalSyncScheduledAt(@Nullable DateTime value) {
			this.lastIncrementalSyncScheduledAt = value;
			return this;
		}

		/**
		 * API name: {@code last_indexed_document_count}
		 */
		public final Builder lastIndexedDocumentCount(@Nullable Long value) {
			this.lastIndexedDocumentCount = value;
			return this;
		}

		/**
		 * API name: {@code last_seen}
		 */
		public final Builder lastSeen(@Nullable DateTime value) {
			this.lastSeen = value;
			return this;
		}

		/**
		 * API name: {@code last_sync_error}
		 */
		public final Builder lastSyncError(@Nullable String value) {
			this.lastSyncError = value;
			return this;
		}

		/**
		 * API name: {@code last_sync_scheduled_at}
		 */
		public final Builder lastSyncScheduledAt(@Nullable DateTime value) {
			this.lastSyncScheduledAt = value;
			return this;
		}

		/**
		 * API name: {@code last_sync_status}
		 */
		public final Builder lastSyncStatus(@Nullable SyncStatus value) {
			this.lastSyncStatus = value;
			return this;
		}

		/**
		 * API name: {@code last_synced}
		 */
		public final Builder lastSynced(@Nullable DateTime value) {
			this.lastSynced = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LastSyncRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LastSyncRequest build() {
			_checkSingleUse();

			return new LastSyncRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LastSyncRequest}
	 */
	public static final JsonpDeserializer<LastSyncRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LastSyncRequest::setupLastSyncRequestDeserializer);

	protected static void setupLastSyncRequestDeserializer(ObjectDeserializer<LastSyncRequest.Builder> op) {

		op.add(Builder::lastAccessControlSyncError, JsonpDeserializer.stringDeserializer(),
				"last_access_control_sync_error");
		op.add(Builder::lastAccessControlSyncScheduledAt, DateTime._DESERIALIZER,
				"last_access_control_sync_scheduled_at");
		op.add(Builder::lastAccessControlSyncStatus, SyncStatus._DESERIALIZER, "last_access_control_sync_status");
		op.add(Builder::lastDeletedDocumentCount, JsonpDeserializer.longDeserializer(), "last_deleted_document_count");
		op.add(Builder::lastIncrementalSyncScheduledAt, DateTime._DESERIALIZER, "last_incremental_sync_scheduled_at");
		op.add(Builder::lastIndexedDocumentCount, JsonpDeserializer.longDeserializer(), "last_indexed_document_count");
		op.add(Builder::lastSeen, DateTime._DESERIALIZER, "last_seen");
		op.add(Builder::lastSyncError, JsonpDeserializer.stringDeserializer(), "last_sync_error");
		op.add(Builder::lastSyncScheduledAt, DateTime._DESERIALIZER, "last_sync_scheduled_at");
		op.add(Builder::lastSyncStatus, SyncStatus._DESERIALIZER, "last_sync_status");
		op.add(Builder::lastSynced, DateTime._DESERIALIZER, "last_synced");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.last_sync}".
	 */
	public static final Endpoint<LastSyncRequest, LastSyncResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.last_sync",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _connectorId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorId;

				if (propsSet == (_connectorId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_connector");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.connectorId, buf);
					buf.append("/_last_sync");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _connectorId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorId;

				if (propsSet == (_connectorId)) {
					params.put("connectorId", request.connectorId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, LastSyncResponse._DESERIALIZER);
}
