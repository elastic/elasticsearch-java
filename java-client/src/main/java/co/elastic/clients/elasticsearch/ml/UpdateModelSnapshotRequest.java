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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.update_model_snapshot.Request
public final class UpdateModelSnapshotRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	private final String snapshotId;

	@Nullable
	private final String description;

	@Nullable
	private final Boolean retain;

	// ---------------------------------------------------------------------------------------------

	protected UpdateModelSnapshotRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.snapshotId = Objects.requireNonNull(builder.snapshotId, "snapshot_id");
		this.description = builder.description;
		this.retain = builder.retain;

	}

	/**
	 * The ID of the job to fetch
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * The ID of the snapshot to update
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	public String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code retain}
	 */
	@Nullable
	public Boolean retain() {
		return this.retain;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.retain != null) {

			generator.writeKey("retain");
			generator.write(this.retain);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateModelSnapshotRequest}.
	 */
	public static class Builder implements ObjectBuilder<UpdateModelSnapshotRequest> {
		private String jobId;

		private String snapshotId;

		@Nullable
		private String description;

		@Nullable
		private Boolean retain;

		/**
		 * The ID of the job to fetch
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The ID of the snapshot to update
		 * <p>
		 * API name: {@code snapshot_id}
		 */
		public Builder snapshotId(String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code retain}
		 */
		public Builder retain(@Nullable Boolean value) {
			this.retain = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateModelSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateModelSnapshotRequest build() {

			return new UpdateModelSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UpdateModelSnapshotRequest
	 */
	public static final JsonpDeserializer<UpdateModelSnapshotRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UpdateModelSnapshotRequest::setupUpdateModelSnapshotRequestDeserializer);

	protected static void setupUpdateModelSnapshotRequestDeserializer(
			DelegatingDeserializer<UpdateModelSnapshotRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::retain, JsonpDeserializer.booleanDeserializer(), "retain");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_model_snapshot}".
	 */
	public static final Endpoint<UpdateModelSnapshotRequest, UpdateModelSnapshotResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;
				final int _snapshotId = 1 << 1;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;
				if (request.snapshotId() != null)
					propsSet |= _snapshotId;

				if (propsSet == (_jobId | _snapshotId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/model_snapshots");
					buf.append("/");
					buf.append(request.snapshotId);
					buf.append("/_update");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, UpdateModelSnapshotResponse.DESERIALIZER);
}
