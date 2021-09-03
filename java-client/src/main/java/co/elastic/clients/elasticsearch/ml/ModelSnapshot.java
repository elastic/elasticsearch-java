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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ModelSnapshot
public final class ModelSnapshot implements ToJsonp {
	@Nullable
	private final String description;

	private final String jobId;

	private final Number latestRecordTimeStamp;

	private final Number latestResultTimeStamp;

	private final String minVersion;

	private final ModelSizeStats modelSizeStats;

	private final Boolean retain;

	private final Number snapshotDocCount;

	private final String snapshotId;

	private final Number timestamp;

	// ---------------------------------------------------------------------------------------------

	protected ModelSnapshot(Builder builder) {

		this.description = builder.description;
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.latestRecordTimeStamp = Objects.requireNonNull(builder.latestRecordTimeStamp, "latest_record_time_stamp");
		this.latestResultTimeStamp = Objects.requireNonNull(builder.latestResultTimeStamp, "latest_result_time_stamp");
		this.minVersion = Objects.requireNonNull(builder.minVersion, "min_version");
		this.modelSizeStats = Objects.requireNonNull(builder.modelSizeStats, "model_size_stats");
		this.retain = Objects.requireNonNull(builder.retain, "retain");
		this.snapshotDocCount = Objects.requireNonNull(builder.snapshotDocCount, "snapshot_doc_count");
		this.snapshotId = Objects.requireNonNull(builder.snapshotId, "snapshot_id");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * An optional description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * A numerical character string that uniquely identifies the job that the
	 * snapshot was created for.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * The timestamp of the latest processed record.
	 * <p>
	 * API name: {@code latest_record_time_stamp}
	 */
	public Number latestRecordTimeStamp() {
		return this.latestRecordTimeStamp;
	}

	/**
	 * The timestamp of the latest bucket result.
	 * <p>
	 * API name: {@code latest_result_time_stamp}
	 */
	public Number latestResultTimeStamp() {
		return this.latestResultTimeStamp;
	}

	/**
	 * The minimum version required to be able to restore the model snapshot.
	 * <p>
	 * API name: {@code min_version}
	 */
	public String minVersion() {
		return this.minVersion;
	}

	/**
	 * Summary information describing the model.
	 * <p>
	 * API name: {@code model_size_stats}
	 */
	public ModelSizeStats modelSizeStats() {
		return this.modelSizeStats;
	}

	/**
	 * If true, this snapshot will not be deleted during automatic cleanup of
	 * snapshots older than model_snapshot_retention_days. However, this snapshot
	 * will be deleted when the job is deleted. The default value is false.
	 * <p>
	 * API name: {@code retain}
	 */
	public Boolean retain() {
		return this.retain;
	}

	/**
	 * For internal use only.
	 * <p>
	 * API name: {@code snapshot_doc_count}
	 */
	public Number snapshotDocCount() {
		return this.snapshotDocCount;
	}

	/**
	 * A numerical character string that uniquely identifies the model snapshot.
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	public String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * The creation timestamp for the snapshot.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public Number timestamp() {
		return this.timestamp;
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

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("latest_record_time_stamp");
		generator.write(this.latestRecordTimeStamp.doubleValue());

		generator.writeKey("latest_result_time_stamp");
		generator.write(this.latestResultTimeStamp.doubleValue());

		generator.writeKey("min_version");
		generator.write(this.minVersion);

		generator.writeKey("model_size_stats");
		this.modelSizeStats.toJsonp(generator, mapper);

		generator.writeKey("retain");
		generator.write(this.retain);

		generator.writeKey("snapshot_doc_count");
		generator.write(this.snapshotDocCount.doubleValue());

		generator.writeKey("snapshot_id");
		generator.write(this.snapshotId);

		generator.writeKey("timestamp");
		generator.write(this.timestamp.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelSnapshot}.
	 */
	public static class Builder implements ObjectBuilder<ModelSnapshot> {
		@Nullable
		private String description;

		private String jobId;

		private Number latestRecordTimeStamp;

		private Number latestResultTimeStamp;

		private String minVersion;

		private ModelSizeStats modelSizeStats;

		private Boolean retain;

		private Number snapshotDocCount;

		private String snapshotId;

		private Number timestamp;

		/**
		 * An optional description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * A numerical character string that uniquely identifies the job that the
		 * snapshot was created for.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The timestamp of the latest processed record.
		 * <p>
		 * API name: {@code latest_record_time_stamp}
		 */
		public Builder latestRecordTimeStamp(Number value) {
			this.latestRecordTimeStamp = value;
			return this;
		}

		/**
		 * The timestamp of the latest bucket result.
		 * <p>
		 * API name: {@code latest_result_time_stamp}
		 */
		public Builder latestResultTimeStamp(Number value) {
			this.latestResultTimeStamp = value;
			return this;
		}

		/**
		 * The minimum version required to be able to restore the model snapshot.
		 * <p>
		 * API name: {@code min_version}
		 */
		public Builder minVersion(String value) {
			this.minVersion = value;
			return this;
		}

		/**
		 * Summary information describing the model.
		 * <p>
		 * API name: {@code model_size_stats}
		 */
		public Builder modelSizeStats(ModelSizeStats value) {
			this.modelSizeStats = value;
			return this;
		}

		/**
		 * Summary information describing the model.
		 * <p>
		 * API name: {@code model_size_stats}
		 */
		public Builder modelSizeStats(Function<ModelSizeStats.Builder, ObjectBuilder<ModelSizeStats>> fn) {
			return this.modelSizeStats(fn.apply(new ModelSizeStats.Builder()).build());
		}

		/**
		 * If true, this snapshot will not be deleted during automatic cleanup of
		 * snapshots older than model_snapshot_retention_days. However, this snapshot
		 * will be deleted when the job is deleted. The default value is false.
		 * <p>
		 * API name: {@code retain}
		 */
		public Builder retain(Boolean value) {
			this.retain = value;
			return this;
		}

		/**
		 * For internal use only.
		 * <p>
		 * API name: {@code snapshot_doc_count}
		 */
		public Builder snapshotDocCount(Number value) {
			this.snapshotDocCount = value;
			return this;
		}

		/**
		 * A numerical character string that uniquely identifies the model snapshot.
		 * <p>
		 * API name: {@code snapshot_id}
		 */
		public Builder snapshotId(String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * The creation timestamp for the snapshot.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(Number value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ModelSnapshot}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelSnapshot build() {

			return new ModelSnapshot(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ModelSnapshot
	 */
	public static final JsonpDeserializer<ModelSnapshot> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ModelSnapshot::setupModelSnapshotDeserializer);

	protected static void setupModelSnapshotDeserializer(DelegatingDeserializer<ModelSnapshot.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::latestRecordTimeStamp, JsonpDeserializer.numberDeserializer(), "latest_record_time_stamp");
		op.add(Builder::latestResultTimeStamp, JsonpDeserializer.numberDeserializer(), "latest_result_time_stamp");
		op.add(Builder::minVersion, JsonpDeserializer.stringDeserializer(), "min_version");
		op.add(Builder::modelSizeStats, ModelSizeStats.DESERIALIZER, "model_size_stats");
		op.add(Builder::retain, JsonpDeserializer.booleanDeserializer(), "retain");
		op.add(Builder::snapshotDocCount, JsonpDeserializer.numberDeserializer(), "snapshot_doc_count");
		op.add(Builder::snapshotId, JsonpDeserializer.stringDeserializer(), "snapshot_id");
		op.add(Builder::timestamp, JsonpDeserializer.numberDeserializer(), "timestamp");

	}

}
