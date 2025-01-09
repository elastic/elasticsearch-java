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

// typedef: connector.sync_job_claim.Request

/**
 * Claim a connector sync job. This action updates the job status to
 * <code>in_progress</code> and sets the <code>last_seen</code> and
 * <code>started_at</code> timestamps to the current time. Additionally, it can
 * set the <code>sync_cursor</code> property for the sync job.
 * <p>
 * This API is not intended for direct connector management by users. It
 * supports the implementation of services that utilize the connector protocol
 * to communicate with Elasticsearch.
 * <p>
 * To sync data using self-managed connectors, you need to deploy the Elastic
 * connector service on your own infrastructure. This service runs automatically
 * on Elastic Cloud for Elastic managed connectors.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#connector.sync_job_claim.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SyncJobClaimRequest extends RequestBase implements JsonpSerializable {
	private final String connectorSyncJobId;

	@Nullable
	private final JsonData syncCursor;

	private final String workerHostname;

	// ---------------------------------------------------------------------------------------------

	private SyncJobClaimRequest(Builder builder) {

		this.connectorSyncJobId = ApiTypeHelper.requireNonNull(builder.connectorSyncJobId, this, "connectorSyncJobId");
		this.syncCursor = builder.syncCursor;
		this.workerHostname = ApiTypeHelper.requireNonNull(builder.workerHostname, this, "workerHostname");

	}

	public static SyncJobClaimRequest of(Function<Builder, ObjectBuilder<SyncJobClaimRequest>> fn) {
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
	 * The cursor object from the last incremental sync job. This should reference
	 * the <code>sync_cursor</code> field in the connector state for which the job
	 * runs.
	 * <p>
	 * API name: {@code sync_cursor}
	 */
	@Nullable
	public final JsonData syncCursor() {
		return this.syncCursor;
	}

	/**
	 * Required - The host name of the current system that will run the job.
	 * <p>
	 * API name: {@code worker_hostname}
	 */
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

		if (this.syncCursor != null) {
			generator.writeKey("sync_cursor");
			this.syncCursor.serialize(generator, mapper);

		}
		generator.writeKey("worker_hostname");
		generator.write(this.workerHostname);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SyncJobClaimRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SyncJobClaimRequest> {
		private String connectorSyncJobId;

		@Nullable
		private JsonData syncCursor;

		private String workerHostname;

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
		 * The cursor object from the last incremental sync job. This should reference
		 * the <code>sync_cursor</code> field in the connector state for which the job
		 * runs.
		 * <p>
		 * API name: {@code sync_cursor}
		 */
		public final Builder syncCursor(@Nullable JsonData value) {
			this.syncCursor = value;
			return this;
		}

		/**
		 * Required - The host name of the current system that will run the job.
		 * <p>
		 * API name: {@code worker_hostname}
		 */
		public final Builder workerHostname(String value) {
			this.workerHostname = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SyncJobClaimRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SyncJobClaimRequest build() {
			_checkSingleUse();

			return new SyncJobClaimRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SyncJobClaimRequest}
	 */
	public static final JsonpDeserializer<SyncJobClaimRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SyncJobClaimRequest::setupSyncJobClaimRequestDeserializer);

	protected static void setupSyncJobClaimRequestDeserializer(ObjectDeserializer<SyncJobClaimRequest.Builder> op) {

		op.add(Builder::syncCursor, JsonData._DESERIALIZER, "sync_cursor");
		op.add(Builder::workerHostname, JsonpDeserializer.stringDeserializer(), "worker_hostname");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.sync_job_claim}".
	 */
	public static final Endpoint<SyncJobClaimRequest, SyncJobClaimResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.sync_job_claim",

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
					buf.append("/_claim");
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

			}, SimpleEndpoint.emptyMap(), true, SyncJobClaimResponse._DESERIALIZER);
}
