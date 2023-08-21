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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_model_snapshots.Request

/**
 * Retrieves information about model snapshots.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_model_snapshots.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetModelSnapshotsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean desc;

	@Nullable
	private final DateTime end;

	@Nullable
	private final Integer from;

	private final String jobId;

	@Nullable
	private final Page page;

	@Nullable
	private final Integer size;

	@Nullable
	private final String snapshotId;

	@Nullable
	private final String sort;

	@Nullable
	private final DateTime start;

	// ---------------------------------------------------------------------------------------------

	private GetModelSnapshotsRequest(Builder builder) {

		this.desc = builder.desc;
		this.end = builder.end;
		this.from = builder.from;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.page = builder.page;
		this.size = builder.size;
		this.snapshotId = builder.snapshotId;
		this.sort = builder.sort;
		this.start = builder.start;

	}

	public static GetModelSnapshotsRequest of(Function<Builder, ObjectBuilder<GetModelSnapshotsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Refer to the description for the <code>desc</code> query parameter.
	 * <p>
	 * API name: {@code desc}
	 */
	@Nullable
	public final Boolean desc() {
		return this.desc;
	}

	/**
	 * Refer to the description for the <code>end</code> query parameter.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final DateTime end() {
		return this.end;
	}

	/**
	 * Skips the specified number of snapshots.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
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
	 * API name: {@code page}
	 */
	@Nullable
	public final Page page() {
		return this.page;
	}

	/**
	 * Specifies the maximum number of snapshots to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * A numerical character string that uniquely identifies the model snapshot. You
	 * can get information for multiple snapshots by using a comma-separated list or
	 * a wildcard expression. You can get all snapshots by using <code>_all</code>,
	 * by specifying <code>*</code> as the snapshot ID, or by omitting the snapshot
	 * ID.
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	@Nullable
	public final String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * Refer to the description for the <code>sort</code> query parameter.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final String sort() {
		return this.sort;
	}

	/**
	 * Refer to the description for the <code>start</code> query parameter.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final DateTime start() {
		return this.start;
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

		if (this.desc != null) {
			generator.writeKey("desc");
			generator.write(this.desc);

		}
		if (this.end != null) {
			generator.writeKey("end");
			this.end.serialize(generator, mapper);
		}
		if (this.page != null) {
			generator.writeKey("page");
			this.page.serialize(generator, mapper);

		}
		if (this.sort != null) {
			generator.writeKey("sort");
			generator.write(this.sort);

		}
		if (this.start != null) {
			generator.writeKey("start");
			this.start.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetModelSnapshotsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetModelSnapshotsRequest> {
		@Nullable
		private Boolean desc;

		@Nullable
		private DateTime end;

		@Nullable
		private Integer from;

		private String jobId;

		@Nullable
		private Page page;

		@Nullable
		private Integer size;

		@Nullable
		private String snapshotId;

		@Nullable
		private String sort;

		@Nullable
		private DateTime start;

		/**
		 * Refer to the description for the <code>desc</code> query parameter.
		 * <p>
		 * API name: {@code desc}
		 */
		public final Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>end</code> query parameter.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable DateTime value) {
			this.end = value;
			return this;
		}

		/**
		 * Skips the specified number of snapshots.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
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
		 * API name: {@code page}
		 */
		public final Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public final Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * Specifies the maximum number of snapshots to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * A numerical character string that uniquely identifies the model snapshot. You
		 * can get information for multiple snapshots by using a comma-separated list or
		 * a wildcard expression. You can get all snapshots by using <code>_all</code>,
		 * by specifying <code>*</code> as the snapshot ID, or by omitting the snapshot
		 * ID.
		 * <p>
		 * API name: {@code snapshot_id}
		 */
		public final Builder snapshotId(@Nullable String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>sort</code> query parameter.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * Refer to the description for the <code>start</code> query parameter.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable DateTime value) {
			this.start = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetModelSnapshotsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetModelSnapshotsRequest build() {
			_checkSingleUse();

			return new GetModelSnapshotsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetModelSnapshotsRequest}
	 */
	public static final JsonpDeserializer<GetModelSnapshotsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetModelSnapshotsRequest::setupGetModelSnapshotsRequestDeserializer);

	protected static void setupGetModelSnapshotsRequestDeserializer(
			ObjectDeserializer<GetModelSnapshotsRequest.Builder> op) {

		op.add(Builder::desc, JsonpDeserializer.booleanDeserializer(), "desc");
		op.add(Builder::end, DateTime._DESERIALIZER, "end");
		op.add(Builder::page, Page._DESERIALIZER, "page");
		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::start, DateTime._DESERIALIZER, "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_model_snapshots}".
	 */
	public static final Endpoint<GetModelSnapshotsRequest, GetModelSnapshotsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_model_snapshots",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _snapshotId = 1 << 0;
				final int _jobId = 1 << 1;

				int propsSet = 0;

				if (request.snapshotId() != null)
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
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/model_snapshots");
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

				if (request.snapshotId() != null)
					propsSet |= _snapshotId;
				propsSet |= _jobId;

				if (propsSet == (_jobId | _snapshotId)) {
					params.put("jobId", request.jobId);
					params.put("snapshotId", request.snapshotId);
				}
				if (propsSet == (_jobId)) {
					params.put("jobId", request.jobId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetModelSnapshotsResponse._DESERIALIZER);
}
