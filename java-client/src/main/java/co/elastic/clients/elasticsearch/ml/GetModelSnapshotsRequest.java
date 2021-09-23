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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.get_model_snapshots.Request
public final class GetModelSnapshotsRequest extends RequestBase implements JsonpSerializable {
	private final String jobId;

	@Nullable
	private final String snapshotId;

	@Nullable
	private final Boolean desc;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	@Nullable
	private final String sort;

	@Nullable
	private final JsonValue start;

	@Nullable
	private final JsonValue end;

	// ---------------------------------------------------------------------------------------------

	public GetModelSnapshotsRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.snapshotId = builder.snapshotId;
		this.desc = builder.desc;
		this.from = builder.from;
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;
		this.end = builder.end;

	}

	/**
	 * Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * A numerical character string that uniquely identifies the model snapshot.
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	@Nullable
	public String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * If true, the results are sorted in descending order.
	 * <p>
	 * API name: {@code desc}
	 */
	@Nullable
	public Boolean desc() {
		return this.desc;
	}

	/**
	 * Skips the specified number of snapshots.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of snapshots to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * Specifies the sort field for the requested snapshots. By default, the
	 * snapshots are sorted by their timestamp.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public String sort() {
		return this.sort;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public JsonValue start() {
		return this.start;
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public JsonValue end() {
		return this.end;
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

		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}
		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetModelSnapshotsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetModelSnapshotsRequest> {
		private String jobId;

		@Nullable
		private String snapshotId;

		@Nullable
		private Boolean desc;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		@Nullable
		private String sort;

		@Nullable
		private JsonValue start;

		@Nullable
		private JsonValue end;

		/**
		 * Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * A numerical character string that uniquely identifies the model snapshot.
		 * <p>
		 * API name: {@code snapshot_id}
		 */
		public Builder snapshotId(@Nullable String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * If true, the results are sorted in descending order.
		 * <p>
		 * API name: {@code desc}
		 */
		public Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * Skips the specified number of snapshots.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of snapshots to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Specifies the sort field for the requested snapshots. By default, the
		 * snapshots are sorted by their timestamp.
		 * <p>
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable JsonValue value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(@Nullable JsonValue value) {
			this.end = value;
			return this;
		}

		/**
		 * Builds a {@link GetModelSnapshotsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetModelSnapshotsRequest build() {

			return new GetModelSnapshotsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetModelSnapshotsRequest}
	 */
	public static final JsonpDeserializer<GetModelSnapshotsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetModelSnapshotsRequest::setupGetModelSnapshotsRequestDeserializer);

	protected static void setupGetModelSnapshotsRequestDeserializer(
			DelegatingDeserializer<GetModelSnapshotsRequest.Builder> op) {

		op.add(Builder::start, JsonpDeserializer.jsonValueDeserializer(), "start");
		op.add(Builder::end, JsonpDeserializer.jsonValueDeserializer(), "end");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_model_snapshots}".
	 */
	public static final Endpoint<GetModelSnapshotsRequest, GetModelSnapshotsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/model_snapshots");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.desc != null) {
					params.put("desc", String.valueOf(request.desc));
				}
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				if (request.sort != null) {
					params.put("sort", request.sort);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetModelSnapshotsResponse.DESERIALIZER);
}
