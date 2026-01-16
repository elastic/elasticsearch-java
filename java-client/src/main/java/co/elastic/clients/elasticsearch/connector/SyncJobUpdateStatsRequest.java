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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: connector.sync_job_update_stats.Request

/**
 * Set the connector sync job stats.
 * <p>
 * Stats include: <code>deleted_document_count</code>,
 * <code>indexed_document_count</code>, <code>indexed_document_volume</code>,
 * and <code>total_document_count</code>. You can also update
 * <code>last_seen</code>. This API is mainly used by the connector service for
 * updating sync job information.
 * <p>
 * To sync data using self-managed connectors, you need to deploy the Elastic
 * connector service on your own infrastructure. This service runs automatically
 * on Elastic Cloud for Elastic managed connectors.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#connector.sync_job_update_stats.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SyncJobUpdateStatsRequest extends RequestBase implements JsonpSerializable {
	private final String connectorSyncJobId;

	private final long deletedDocumentCount;

	private final long indexedDocumentCount;

	private final long indexedDocumentVolume;

	@Nullable
	private final Time lastSeen;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final Integer totalDocumentCount;

	// ---------------------------------------------------------------------------------------------

	private SyncJobUpdateStatsRequest(Builder builder) {

		this.connectorSyncJobId = ApiTypeHelper.requireNonNull(builder.connectorSyncJobId, this, "connectorSyncJobId");
		this.deletedDocumentCount = ApiTypeHelper.requireNonNull(builder.deletedDocumentCount, this,
				"deletedDocumentCount", 0);
		this.indexedDocumentCount = ApiTypeHelper.requireNonNull(builder.indexedDocumentCount, this,
				"indexedDocumentCount", 0);
		this.indexedDocumentVolume = ApiTypeHelper.requireNonNull(builder.indexedDocumentVolume, this,
				"indexedDocumentVolume", 0);
		this.lastSeen = builder.lastSeen;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.totalDocumentCount = builder.totalDocumentCount;

	}

	public static SyncJobUpdateStatsRequest of(Function<Builder, ObjectBuilder<SyncJobUpdateStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the connector sync job.
	 * <p>
	 * API name: {@code connector_sync_job_id}
	 */
	public final String connectorSyncJobId() {
		return this.connectorSyncJobId;
	}

	/**
	 * Required - The number of documents the sync job deleted.
	 * <p>
	 * API name: {@code deleted_document_count}
	 */
	public final long deletedDocumentCount() {
		return this.deletedDocumentCount;
	}

	/**
	 * Required - The number of documents the sync job indexed.
	 * <p>
	 * API name: {@code indexed_document_count}
	 */
	public final long indexedDocumentCount() {
		return this.indexedDocumentCount;
	}

	/**
	 * Required - The total size of the data (in MiB) the sync job indexed.
	 * <p>
	 * API name: {@code indexed_document_volume}
	 */
	public final long indexedDocumentVolume() {
		return this.indexedDocumentVolume;
	}

	/**
	 * The timestamp to use in the <code>last_seen</code> property for the connector
	 * sync job.
	 * <p>
	 * API name: {@code last_seen}
	 */
	@Nullable
	public final Time lastSeen() {
		return this.lastSeen;
	}

	/**
	 * The connector-specific metadata.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * The total number of documents in the target index after the sync job
	 * finished.
	 * <p>
	 * API name: {@code total_document_count}
	 */
	@Nullable
	public final Integer totalDocumentCount() {
		return this.totalDocumentCount;
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

		generator.writeKey("deleted_document_count");
		generator.write(this.deletedDocumentCount);

		generator.writeKey("indexed_document_count");
		generator.write(this.indexedDocumentCount);

		generator.writeKey("indexed_document_volume");
		generator.write(this.indexedDocumentVolume);

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
		if (this.totalDocumentCount != null) {
			generator.writeKey("total_document_count");
			generator.write(this.totalDocumentCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SyncJobUpdateStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SyncJobUpdateStatsRequest> {
		private String connectorSyncJobId;

		private Long deletedDocumentCount;

		private Long indexedDocumentCount;

		private Long indexedDocumentVolume;

		@Nullable
		private Time lastSeen;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private Integer totalDocumentCount;

		public Builder() {
		}
		private Builder(SyncJobUpdateStatsRequest instance) {
			this.connectorSyncJobId = instance.connectorSyncJobId;
			this.deletedDocumentCount = instance.deletedDocumentCount;
			this.indexedDocumentCount = instance.indexedDocumentCount;
			this.indexedDocumentVolume = instance.indexedDocumentVolume;
			this.lastSeen = instance.lastSeen;
			this.metadata = instance.metadata;
			this.totalDocumentCount = instance.totalDocumentCount;

		}
		/**
		 * Required - The unique identifier of the connector sync job.
		 * <p>
		 * API name: {@code connector_sync_job_id}
		 */
		public final Builder connectorSyncJobId(String value) {
			this.connectorSyncJobId = value;
			return this;
		}

		/**
		 * Required - The number of documents the sync job deleted.
		 * <p>
		 * API name: {@code deleted_document_count}
		 */
		public final Builder deletedDocumentCount(long value) {
			this.deletedDocumentCount = value;
			return this;
		}

		/**
		 * Required - The number of documents the sync job indexed.
		 * <p>
		 * API name: {@code indexed_document_count}
		 */
		public final Builder indexedDocumentCount(long value) {
			this.indexedDocumentCount = value;
			return this;
		}

		/**
		 * Required - The total size of the data (in MiB) the sync job indexed.
		 * <p>
		 * API name: {@code indexed_document_volume}
		 */
		public final Builder indexedDocumentVolume(long value) {
			this.indexedDocumentVolume = value;
			return this;
		}

		/**
		 * The timestamp to use in the <code>last_seen</code> property for the connector
		 * sync job.
		 * <p>
		 * API name: {@code last_seen}
		 */
		public final Builder lastSeen(@Nullable Time value) {
			this.lastSeen = value;
			return this;
		}

		/**
		 * The timestamp to use in the <code>last_seen</code> property for the connector
		 * sync job.
		 * <p>
		 * API name: {@code last_seen}
		 */
		public final Builder lastSeen(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.lastSeen(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The connector-specific metadata.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * The connector-specific metadata.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * The total number of documents in the target index after the sync job
		 * finished.
		 * <p>
		 * API name: {@code total_document_count}
		 */
		public final Builder totalDocumentCount(@Nullable Integer value) {
			this.totalDocumentCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SyncJobUpdateStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SyncJobUpdateStatsRequest build() {
			_checkSingleUse();

			return new SyncJobUpdateStatsRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SyncJobUpdateStatsRequest}
	 */
	public static final JsonpDeserializer<SyncJobUpdateStatsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SyncJobUpdateStatsRequest::setupSyncJobUpdateStatsRequestDeserializer);

	protected static void setupSyncJobUpdateStatsRequestDeserializer(
			ObjectDeserializer<SyncJobUpdateStatsRequest.Builder> op) {

		op.add(Builder::deletedDocumentCount, JsonpDeserializer.longDeserializer(), "deleted_document_count");
		op.add(Builder::indexedDocumentCount, JsonpDeserializer.longDeserializer(), "indexed_document_count");
		op.add(Builder::indexedDocumentVolume, JsonpDeserializer.longDeserializer(), "indexed_document_volume");
		op.add(Builder::lastSeen, Time._DESERIALIZER, "last_seen");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::totalDocumentCount, JsonpDeserializer.integerDeserializer(), "total_document_count");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.sync_job_update_stats}".
	 */
	public static final Endpoint<SyncJobUpdateStatsRequest, SyncJobUpdateStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.sync_job_update_stats",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _connectorSyncJobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorSyncJobId;

				if (propsSet == (_connectorSyncJobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_connector");
					buf.append("/_sync_job");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.connectorSyncJobId, buf);
					buf.append("/_stats");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _connectorSyncJobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorSyncJobId;

				if (propsSet == (_connectorSyncJobId)) {
					params.put("connectorSyncJobId", request.connectorSyncJobId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SyncJobUpdateStatsResponse._DESERIALIZER);
}
