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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_model_snapshot_upgrade_stats.Request

/**
 * Retrieves usage information for anomaly detection job model snapshot
 * upgrades.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.get_model_snapshot_upgrade_stats.Request">API
 *      specification</a>
 */

public class GetModelSnapshotUpgradeStatsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoMatch;

	private final String jobId;

	private final String snapshotId;

	// ---------------------------------------------------------------------------------------------

	private GetModelSnapshotUpgradeStatsRequest(Builder builder) {

		this.allowNoMatch = builder.allowNoMatch;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.snapshotId = ApiTypeHelper.requireNonNull(builder.snapshotId, this, "snapshotId");

	}

	public static GetModelSnapshotUpgradeStatsRequest of(
			Function<Builder, ObjectBuilder<GetModelSnapshotUpgradeStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies what to do when the request:
	 * <ul>
	 * <li>Contains wildcard expressions and there are no jobs that match.</li>
	 * <li>Contains the _all string or no identifiers and there are no matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ul>
	 * <p>
	 * The default value is true, which returns an empty jobs array when there are
	 * no matches and the subset of results when there are partial matches. If this
	 * parameter is false, the request returns a 404 status code when there are no
	 * matches or only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
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
	 * Required - A numerical character string that uniquely identifies the model
	 * snapshot. You can get information for multiple snapshots by using a
	 * comma-separated list or a wildcard expression. You can get all snapshots by
	 * using <code>_all</code>, by specifying <code>*</code> as the snapshot ID, or
	 * by omitting the snapshot ID.
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	public final String snapshotId() {
		return this.snapshotId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetModelSnapshotUpgradeStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetModelSnapshotUpgradeStatsRequest> {
		@Nullable
		private Boolean allowNoMatch;

		private String jobId;

		private String snapshotId;

		/**
		 * Specifies what to do when the request:
		 * <ul>
		 * <li>Contains wildcard expressions and there are no jobs that match.</li>
		 * <li>Contains the _all string or no identifiers and there are no matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ul>
		 * <p>
		 * The default value is true, which returns an empty jobs array when there are
		 * no matches and the subset of results when there are partial matches. If this
		 * parameter is false, the request returns a 404 status code when there are no
		 * matches or only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
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
		 * Required - A numerical character string that uniquely identifies the model
		 * snapshot. You can get information for multiple snapshots by using a
		 * comma-separated list or a wildcard expression. You can get all snapshots by
		 * using <code>_all</code>, by specifying <code>*</code> as the snapshot ID, or
		 * by omitting the snapshot ID.
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
		 * Builds a {@link GetModelSnapshotUpgradeStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetModelSnapshotUpgradeStatsRequest build() {
			_checkSingleUse();

			return new GetModelSnapshotUpgradeStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_model_snapshot_upgrade_stats}".
	 */
	public static final Endpoint<GetModelSnapshotUpgradeStatsRequest, GetModelSnapshotUpgradeStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_model_snapshot_upgrade_stats",

			// Request method
			request -> {
				return "GET";

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
					buf.append("/_upgrade");
					buf.append("/_stats");
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
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetModelSnapshotUpgradeStatsResponse._DESERIALIZER);
}
