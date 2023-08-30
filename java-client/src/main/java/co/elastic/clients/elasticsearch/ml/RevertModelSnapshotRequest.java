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

// typedef: ml.revert_model_snapshot.Request

/**
 * Reverts to a specific snapshot. The machine learning features react quickly
 * to anomalous input, learning new behaviors in data. Highly anomalous input
 * increases the variance in the models whilst the system learns whether this is
 * a new step-change in behavior or a one-off event. In the case where this
 * anomalous input is known to be a one-off, then it might be appropriate to
 * reset the model state to a time before this event. For example, you might
 * consider reverting to a saved snapshot after Black Friday or a critical
 * system failure.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.revert_model_snapshot.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class RevertModelSnapshotRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean deleteInterveningResults;

	private final String jobId;

	private final String snapshotId;

	// ---------------------------------------------------------------------------------------------

	private RevertModelSnapshotRequest(Builder builder) {

		this.deleteInterveningResults = builder.deleteInterveningResults;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.snapshotId = ApiTypeHelper.requireNonNull(builder.snapshotId, this, "snapshotId");

	}

	public static RevertModelSnapshotRequest of(Function<Builder, ObjectBuilder<RevertModelSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Refer to the description for the <code>delete_intervening_results</code>
	 * query parameter.
	 * <p>
	 * API name: {@code delete_intervening_results}
	 */
	@Nullable
	public final Boolean deleteInterveningResults() {
		return this.deleteInterveningResults;
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
	 * Required - You can specify <code>empty</code> as the &lt;snapshot_id&gt;.
	 * Reverting to the empty snapshot means the anomaly detection job starts
	 * learning a new model from scratch when it is started.
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

		if (this.deleteInterveningResults != null) {
			generator.writeKey("delete_intervening_results");
			generator.write(this.deleteInterveningResults);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RevertModelSnapshotRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RevertModelSnapshotRequest> {
		@Nullable
		private Boolean deleteInterveningResults;

		private String jobId;

		private String snapshotId;

		/**
		 * Refer to the description for the <code>delete_intervening_results</code>
		 * query parameter.
		 * <p>
		 * API name: {@code delete_intervening_results}
		 */
		public final Builder deleteInterveningResults(@Nullable Boolean value) {
			this.deleteInterveningResults = value;
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
		 * Required - You can specify <code>empty</code> as the &lt;snapshot_id&gt;.
		 * Reverting to the empty snapshot means the anomaly detection job starts
		 * learning a new model from scratch when it is started.
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
		 * Builds a {@link RevertModelSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RevertModelSnapshotRequest build() {
			_checkSingleUse();

			return new RevertModelSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RevertModelSnapshotRequest}
	 */
	public static final JsonpDeserializer<RevertModelSnapshotRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RevertModelSnapshotRequest::setupRevertModelSnapshotRequestDeserializer);

	protected static void setupRevertModelSnapshotRequestDeserializer(
			ObjectDeserializer<RevertModelSnapshotRequest.Builder> op) {

		op.add(Builder::deleteInterveningResults, JsonpDeserializer.booleanDeserializer(),
				"delete_intervening_results");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.revert_model_snapshot}".
	 */
	public static final Endpoint<RevertModelSnapshotRequest, RevertModelSnapshotResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.revert_model_snapshot",

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
					buf.append("/_revert");
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

			}, SimpleEndpoint.emptyMap(), true, RevertModelSnapshotResponse._DESERIALIZER);
}
