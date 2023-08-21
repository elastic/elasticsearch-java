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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_model_snapshot.Request

/**
 * Updates certain properties of a snapshot.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.update_model_snapshot.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateModelSnapshotRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String description;

	private final String jobId;

	@Nullable
	private final Boolean retain;

	private final String snapshotId;

	// ---------------------------------------------------------------------------------------------

	private UpdateModelSnapshotRequest(Builder builder) {

		this.description = builder.description;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.retain = builder.retain;
		this.snapshotId = ApiTypeHelper.requireNonNull(builder.snapshotId, this, "snapshotId");

	}

	public static UpdateModelSnapshotRequest of(Function<Builder, ObjectBuilder<UpdateModelSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A description of the model snapshot.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * If <code>true</code>, this snapshot will not be deleted during automatic
	 * cleanup of snapshots older than <code>model_snapshot_retention_days</code>.
	 * However, this snapshot will be deleted when the job is deleted.
	 * <p>
	 * API name: {@code retain}
	 */
	@Nullable
	public final Boolean retain() {
		return this.retain;
	}

	/**
	 * Required - Identifier for the model snapshot.
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	public final String snapshotId() {
		return this.snapshotId;
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
		if (this.retain != null) {
			generator.writeKey("retain");
			generator.write(this.retain);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateModelSnapshotRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateModelSnapshotRequest> {
		@Nullable
		private String description;

		private String jobId;

		@Nullable
		private Boolean retain;

		private String snapshotId;

		/**
		 * A description of the model snapshot.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * If <code>true</code>, this snapshot will not be deleted during automatic
		 * cleanup of snapshots older than <code>model_snapshot_retention_days</code>.
		 * However, this snapshot will be deleted when the job is deleted.
		 * <p>
		 * API name: {@code retain}
		 */
		public final Builder retain(@Nullable Boolean value) {
			this.retain = value;
			return this;
		}

		/**
		 * Required - Identifier for the model snapshot.
		 * <p>
		 * API name: {@code snapshot_id}
		 */
		public final Builder snapshotId(String value) {
			this.snapshotId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateModelSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateModelSnapshotRequest build() {
			_checkSingleUse();

			return new UpdateModelSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateModelSnapshotRequest}
	 */
	public static final JsonpDeserializer<UpdateModelSnapshotRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateModelSnapshotRequest::setupUpdateModelSnapshotRequestDeserializer);

	protected static void setupUpdateModelSnapshotRequestDeserializer(
			ObjectDeserializer<UpdateModelSnapshotRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::retain, JsonpDeserializer.booleanDeserializer(), "retain");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_model_snapshot}".
	 */
	public static final Endpoint<UpdateModelSnapshotRequest, UpdateModelSnapshotResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.update_model_snapshot",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _snapshotId = 1 << 0;
				final int _jobId = 1 << 1;

				int propsSet = 0;

				propsSet |= _snapshotId;
				propsSet |= _jobId;

				if (propsSet == (_jobId | _snapshotId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/model_snapshots");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshotId, buf);
					buf.append("/_update");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _snapshotId = 1 << 0;
				final int _jobId = 1 << 1;

				int propsSet = 0;

				propsSet |= _snapshotId;
				propsSet |= _jobId;

				if (propsSet == (_jobId | _snapshotId)) {
					params.put("jobId", request.jobId);
					params.put("snapshotId", request.snapshotId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateModelSnapshotResponse._DESERIALIZER);
}
